package de.bomzhi.petrinet.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.bomzhi.petrinet.petrinetDsl.AssureStatement;
import de.bomzhi.petrinet.petrinetDsl.PetriNet;
import de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage;
import de.bomzhi.petrinet.petrinetDsl.Place;
import de.bomzhi.petrinet.petrinetDsl.PutStatement;
import de.bomzhi.petrinet.petrinetDsl.Resource;
import de.bomzhi.petrinet.petrinetDsl.Storage;
import de.bomzhi.petrinet.petrinetDsl.TakeStatement;
import de.bomzhi.petrinet.petrinetDsl.Transaction;
import de.bomzhi.petrinet.services.PetrinetDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPetrinetDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PetrinetDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PetrinetDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PetrinetDslPackage.ASSURE_STATEMENT:
				if(context == grammarAccess.getAssureStatementRule()) {
					sequence_AssureStatement_AssureStatement(context, (AssureStatement) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.PETRI_NET:
				if(context == grammarAccess.getPetriNetRule()) {
					sequence_PetriNet_PetriNet(context, (PetriNet) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.PLACE:
				if(context == grammarAccess.getPlaceRule()) {
					sequence_Place_Place(context, (Place) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.PUT_STATEMENT:
				if(context == grammarAccess.getPutStatementRule()) {
					sequence_PutStatement_PutStatement(context, (PutStatement) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.RESOURCE:
				if(context == grammarAccess.getResourceRule()) {
					sequence_Resource_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.STORAGE:
				if(context == grammarAccess.getStorageRule()) {
					sequence_Storage_Storage(context, (Storage) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.TAKE_STATEMENT:
				if(context == grammarAccess.getTakeStatementRule()) {
					sequence_TakeStatement_TakeStatement(context, (TakeStatement) semanticObject); 
					return; 
				}
				else break;
			case PetrinetDslPackage.TRANSACTION:
				if(context == grammarAccess.getTransactionRule()) {
					sequence_Transaction_Transaction(context, (Transaction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (count=INT resourceRef=[Resource|ID] placeRef=[Place|ID])
	 *
	 * Features:
	 *    count[1, 1]
	 *    resourceRef[1, 1]
	 *    placeRef[1, 1]
	 */
	protected void sequence_AssureStatement_AssureStatement(EObject context, AssureStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__COUNT));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__RESOURCE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__RESOURCE_REF));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__PLACE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.ASSURE_STATEMENT__PLACE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssureStatementAccess().getCountINTTerminalRuleCall_1_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getAssureStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1(), semanticObject.getResourceRef());
		feeder.accept(grammarAccess.getAssureStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1(), semanticObject.getPlaceRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=Resource+ places+=Place+ transactions+=Transaction+)
	 *
	 * Features:
	 *    resources[1, *]
	 *    places[1, *]
	 *    transactions[1, *]
	 */
	protected void sequence_PetriNet_PetriNet(EObject context, PetriNet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID storages+=Storage*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    storages[0, *]
	 */
	protected void sequence_Place_Place(EObject context, Place semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INT resourceRef=[Resource|ID] placeRef=[Place|ID])
	 *
	 * Features:
	 *    count[1, 1]
	 *    resourceRef[1, 1]
	 *    placeRef[1, 1]
	 */
	protected void sequence_PutStatement_PutStatement(EObject context, PutStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__COUNT));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__RESOURCE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__RESOURCE_REF));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__PLACE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.PUT_STATEMENT__PLACE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPutStatementAccess().getCountINTTerminalRuleCall_1_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getPutStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1(), semanticObject.getResourceRef());
		feeder.accept(grammarAccess.getPutStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1(), semanticObject.getPlaceRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Resource_Resource(EObject context, Resource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.RESOURCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resourceRef=[Resource|ID] count=INT capacity=INT?)
	 *
	 * Features:
	 *    resourceRef[1, 1]
	 *    count[1, 1]
	 *    capacity[0, 1]
	 */
	protected void sequence_Storage_Storage(EObject context, Storage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INT resourceRef=[Resource|ID] placeRef=[Place|ID])
	 *
	 * Features:
	 *    count[1, 1]
	 *    resourceRef[1, 1]
	 *    placeRef[1, 1]
	 */
	protected void sequence_TakeStatement_TakeStatement(EObject context, TakeStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__COUNT));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__RESOURCE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__RESOURCE_REF));
			if(transientValues.isValueTransient(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__PLACE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetDslPackage.Literals.TAKE_STATEMENT__PLACE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTakeStatementAccess().getCountINTTerminalRuleCall_1_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getTakeStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1(), semanticObject.getResourceRef());
		feeder.accept(grammarAccess.getTakeStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1(), semanticObject.getPlaceRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID assureStatements+=AssureStatement* takeStatements+=TakeStatement* putStatements+=PutStatement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    assureStatements[0, *]
	 *    takeStatements[0, *]
	 *    putStatements[0, *]
	 */
	protected void sequence_Transaction_Transaction(EObject context, Transaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
