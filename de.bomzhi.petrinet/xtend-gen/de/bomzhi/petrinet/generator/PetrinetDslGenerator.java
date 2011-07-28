package de.bomzhi.petrinet.generator;

import de.bomzhi.petrinet.petrinetDsl.AssureStatement;
import de.bomzhi.petrinet.petrinetDsl.PetriNet;
import de.bomzhi.petrinet.petrinetDsl.Place;
import de.bomzhi.petrinet.petrinetDsl.PutStatement;
import de.bomzhi.petrinet.petrinetDsl.Storage;
import de.bomzhi.petrinet.petrinetDsl.TakeStatement;
import de.bomzhi.petrinet.petrinetDsl.Transaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PetrinetDslGenerator implements IGenerator {
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _operator_plus = StringExtensions.operator_plus(_className, ".scala");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    StringConcatenation _javaCode = this.toJavaCode(((PetriNet) _head));
    fsa.generateFile(_operator_plus, _javaCode);
  }
  
  public String className(final Resource res) {
    {
      URI _uRI = res.getURI();
      String _lastSegment = _uRI.lastSegment();
      String name = _lastSegment;
      int _indexOf = name.indexOf(".");
      String _substring = name.substring(0, _indexOf);
      return _substring;
    }
  }
  
  public StringConcatenation toJavaCode(final PetriNet pn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.bomzhi.petrinetdsl");
    _builder.newLine();
    _builder.newLine();
    _builder.append("object PetriNet extends App {");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _defineAbstractClasses = this.defineAbstractClasses();
    _builder.append(_defineAbstractClasses, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _defineResourcesAndPlaces = this.defineResourcesAndPlaces(pn);
    _builder.append(_defineResourcesAndPlaces, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _defineMainLoop = this.defineMainLoop();
    _builder.append(_defineMainLoop, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation defineAbstractClasses() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("abstract class Resource(val label:String)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("case class Storage(val resource : Resource, ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("var count : Int, val capacity : Int)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("abstract class Place {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("val storages : List[Storage]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def toString = {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("def capacity(st:Storage)={");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(st.capacity == 0) \"..\" else st.capacity");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("storages.foldLeft(\"\")((text, st) => text+\"[\'\" + st.resource.label + \"\' \" + st.count + \"/\" + capacity(st) + \"]\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("abstract class Statement(val count : Int, val resource : Resource, val place : Place)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("case class Assure(override val count : Int, override val resource : Resource, override val place : Place) extends Statement(count, resource, place)");
    _builder.newLine();
    _builder.append("case class Take(override val count : Int, override val resource : Resource, override val place : Place) extends Statement(count, resource, place)");
    _builder.newLine();
    _builder.append("case class Put(override val count : Int, override val resource : Resource, override val place : Place) extends Statement(count, resource, place)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class Transaction(name : String, statements: List[Statement]){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def isAlive : Boolean = {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("statements.forall((statement) => {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val actStorage = statement.place.storages.find(_.resource == statement.resource).getOrElse(return false)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("statement match {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case assure : Assure => if(assure.count == 0 ) actStorage.count == 0 else actStorage.count >= assure.count");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case take : Take => actStorage.count >= take.count");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case put : Put => actStorage.capacity == 0 || actStorage.capacity >= actStorage.count + put.count");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def execute() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\"Executing transaction \" + name)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("statements.foreach((statement) => {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val actStorage = statement.place.storages.find(_.resource == statement.resource).get");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("statement match {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case take : Take => actStorage.count -= take.count");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case put : Put => actStorage.count += put.count");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case _ =>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def toString = name");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation defineResourcesAndPlaces(final PetriNet pn) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<de.bomzhi.petrinet.petrinetDsl.Resource> _resources = pn.getResources();
      for(de.bomzhi.petrinet.petrinetDsl.Resource resource : _resources) {
        _builder.append("object ");
        String _name = resource.getName();
        _builder.append(_name, "");
        _builder.append(" extends Resource(\"");
        String _name_1 = resource.getName();
        _builder.append(_name_1, "");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Place> _places = pn.getPlaces();
      for(Place place : _places) {
        _builder.append("object ");
        String _name_2 = place.getName();
        _builder.append(_name_2, "");
        _builder.append(" extends Place {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("val storages = ");
        _builder.newLine();
        _builder.append("\t\t");
        {
          EList<Storage> _storages = place.getStorages();
          for(Storage storage : _storages) {
            _builder.append("Storage(");
            de.bomzhi.petrinet.petrinetDsl.Resource _resourceRef = storage.getResourceRef();
            String _name_3 = _resourceRef.getName();
            _builder.append(_name_3, "		");
            _builder.append(", ");
            int _count = storage.getCount();
            _builder.append(_count, "		");
            _builder.append(", ");
            int _capacity = storage.getCapacity();
            _builder.append(_capacity, "		");
            _builder.append(")::");
          }
        }
        _builder.append("Nil");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("val transactions = ");
    _builder.newLine();
    {
      EList<Transaction> _transactions = pn.getTransactions();
      for(Transaction transaction : _transactions) {
        _builder.append("new Transaction( \"");
        String _name_4 = transaction.getName();
        _builder.append(_name_4, "");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<AssureStatement> _assureStatements = transaction.getAssureStatements();
          for(AssureStatement statement : _assureStatements) {
            _builder.append("Assure(");
            int _count_1 = statement.getCount();
            _builder.append(_count_1, "	");
            _builder.append(", ");
            de.bomzhi.petrinet.petrinetDsl.Resource _resourceRef_1 = statement.getResourceRef();
            String _name_5 = _resourceRef_1.getName();
            _builder.append(_name_5, "	");
            _builder.append(", ");
            Place _placeRef = statement.getPlaceRef();
            String _name_6 = _placeRef.getName();
            _builder.append(_name_6, "	");
            _builder.append(") :: ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<TakeStatement> _takeStatements = transaction.getTakeStatements();
          for(TakeStatement statement_1 : _takeStatements) {
            _builder.append("Take(");
            int _count_2 = statement_1.getCount();
            _builder.append(_count_2, "	");
            _builder.append(", ");
            de.bomzhi.petrinet.petrinetDsl.Resource _resourceRef_2 = statement_1.getResourceRef();
            String _name_7 = _resourceRef_2.getName();
            _builder.append(_name_7, "	");
            _builder.append(", ");
            Place _placeRef_1 = statement_1.getPlaceRef();
            String _name_8 = _placeRef_1.getName();
            _builder.append(_name_8, "	");
            _builder.append(") :: ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<PutStatement> _putStatements = transaction.getPutStatements();
          for(PutStatement statement_2 : _putStatements) {
            _builder.append("Put(");
            int _count_3 = statement_2.getCount();
            _builder.append(_count_3, "	");
            _builder.append(", ");
            de.bomzhi.petrinet.petrinetDsl.Resource _resourceRef_3 = statement_2.getResourceRef();
            String _name_9 = _resourceRef_3.getName();
            _builder.append(_name_9, "	");
            _builder.append(", ");
            Place _placeRef_2 = statement_2.getPlaceRef();
            String _name_10 = _placeRef_2.getName();
            _builder.append(_name_10, "	");
            _builder.append(") :: ");
          }
        }
        _builder.append("Nil");
        _builder.newLineIfNotEmpty();
        _builder.append(") ::");
        _builder.newLine();
      }
    }
    _builder.append("Nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def printState() {");
    _builder.newLine();
    {
      EList<Place> _places_1 = pn.getPlaces();
      for(Place place_1 : _places_1) {
        _builder.append("\t");
        _builder.append("println(\"");
        String _name_11 = place_1.getName();
        _builder.append(_name_11, "	");
        _builder.append(": \" + ");
        String _name_12 = place_1.getName();
        _builder.append(_name_12, "	");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation defineMainLoop() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("var lifeTr = transactions.filter(_.isAlive)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("while(!lifeTr.isEmpty){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("printState()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(\"Choose transaction:\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lifeTr.foreach((tr) => println(\"\" + (lifeTr.indexOf(tr)+1) + \". Transaction: \" + tr))");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("val input = readLine()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val trIndex = input.toInt;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lifeTr(trIndex-1).execute()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("case _ => println(\"Please enter correct transaction index!\\n\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lifeTr = transactions.filter(_.isAlive)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}