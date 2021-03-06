/*
* generated by Xtext
*/

package de.bomzhi.petrinet.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PetrinetDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PetriNetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PetriNet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cResourcesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cResourcesResourceParserRuleCall_0_0 = (RuleCall)cResourcesAssignment_0.eContents().get(0);
		private final Assignment cPlacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPlacesPlaceParserRuleCall_1_0 = (RuleCall)cPlacesAssignment_1.eContents().get(0);
		private final Assignment cTransactionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransactionsTransactionParserRuleCall_2_0 = (RuleCall)cTransactionsAssignment_2.eContents().get(0);
		
		//PetriNet:
		//	resources+=Resource+ places+=Place+ transactions+=Transaction+;
		public ParserRule getRule() { return rule; }

		//resources+=Resource+ places+=Place+ transactions+=Transaction+
		public Group getGroup() { return cGroup; }

		//resources+=Resource+
		public Assignment getResourcesAssignment_0() { return cResourcesAssignment_0; }

		//Resource
		public RuleCall getResourcesResourceParserRuleCall_0_0() { return cResourcesResourceParserRuleCall_0_0; }

		//places+=Place+
		public Assignment getPlacesAssignment_1() { return cPlacesAssignment_1; }

		//Place
		public RuleCall getPlacesPlaceParserRuleCall_1_0() { return cPlacesPlaceParserRuleCall_1_0; }

		//transactions+=Transaction+
		public Assignment getTransactionsAssignment_2() { return cTransactionsAssignment_2; }

		//Transaction
		public RuleCall getTransactionsTransactionParserRuleCall_2_0() { return cTransactionsTransactionParserRuleCall_2_0; }
	}

	public class ResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Resource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Resource:
		//	"resource" name=ID;
		public ParserRule getRule() { return rule; }

		//"resource" name=ID
		public Group getGroup() { return cGroup; }

		//"resource"
		public Keyword getResourceKeyword_0() { return cResourceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class PlaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Place");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStoragesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStoragesStorageParserRuleCall_3_0 = (RuleCall)cStoragesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Place:
		//	"place" name=ID "{" storages+=Storage* "}";
		public ParserRule getRule() { return rule; }

		//"place" name=ID "{" storages+=Storage* "}"
		public Group getGroup() { return cGroup; }

		//"place"
		public Keyword getPlaceKeyword_0() { return cPlaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//storages+=Storage*
		public Assignment getStoragesAssignment_3() { return cStoragesAssignment_3; }

		//Storage
		public RuleCall getStoragesStorageParserRuleCall_3_0() { return cStoragesStorageParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class StorageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Storage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cResourceRefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cResourceRefResourceCrossReference_0_0 = (CrossReference)cResourceRefAssignment_0.eContents().get(0);
		private final RuleCall cResourceRefResourceIDTerminalRuleCall_0_0_1 = (RuleCall)cResourceRefResourceCrossReference_0_0.eContents().get(1);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCountAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCountINTTerminalRuleCall_2_0 = (RuleCall)cCountAssignment_2.eContents().get(0);
		private final Keyword cSolidusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cCapacityAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cCapacityINTTerminalRuleCall_4_0_0 = (RuleCall)cCapacityAssignment_4_0.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_4_1 = (Keyword)cAlternatives_4.eContents().get(1);
		
		//Storage:
		//	resourceRef=[Resource] ":" count=INT "/" (capacity=INT | "..");
		public ParserRule getRule() { return rule; }

		//resourceRef=[Resource] ":" count=INT "/" (capacity=INT | "..")
		public Group getGroup() { return cGroup; }

		//resourceRef=[Resource]
		public Assignment getResourceRefAssignment_0() { return cResourceRefAssignment_0; }

		//[Resource]
		public CrossReference getResourceRefResourceCrossReference_0_0() { return cResourceRefResourceCrossReference_0_0; }

		//ID
		public RuleCall getResourceRefResourceIDTerminalRuleCall_0_0_1() { return cResourceRefResourceIDTerminalRuleCall_0_0_1; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//count=INT
		public Assignment getCountAssignment_2() { return cCountAssignment_2; }

		//INT
		public RuleCall getCountINTTerminalRuleCall_2_0() { return cCountINTTerminalRuleCall_2_0; }

		//"/"
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }

		//capacity=INT | ".."
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//capacity=INT
		public Assignment getCapacityAssignment_4_0() { return cCapacityAssignment_4_0; }

		//INT
		public RuleCall getCapacityINTTerminalRuleCall_4_0_0() { return cCapacityINTTerminalRuleCall_4_0_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_4_1() { return cFullStopFullStopKeyword_4_1; }
	}

	public class TransactionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransactionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAssureStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssureStatementsAssureStatementParserRuleCall_3_0 = (RuleCall)cAssureStatementsAssignment_3.eContents().get(0);
		private final Assignment cTakeStatementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTakeStatementsTakeStatementParserRuleCall_4_0 = (RuleCall)cTakeStatementsAssignment_4.eContents().get(0);
		private final Assignment cPutStatementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPutStatementsPutStatementParserRuleCall_5_0 = (RuleCall)cPutStatementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Transaction:
		//	"transaction" name=ID "{" assureStatements+=AssureStatement* takeStatements+=TakeStatement*
		//	putStatements+=PutStatement* "}";
		public ParserRule getRule() { return rule; }

		//"transaction" name=ID "{" assureStatements+=AssureStatement* takeStatements+=TakeStatement* putStatements+=PutStatement*
		//"}"
		public Group getGroup() { return cGroup; }

		//"transaction"
		public Keyword getTransactionKeyword_0() { return cTransactionKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//assureStatements+=AssureStatement*
		public Assignment getAssureStatementsAssignment_3() { return cAssureStatementsAssignment_3; }

		//AssureStatement
		public RuleCall getAssureStatementsAssureStatementParserRuleCall_3_0() { return cAssureStatementsAssureStatementParserRuleCall_3_0; }

		//takeStatements+=TakeStatement*
		public Assignment getTakeStatementsAssignment_4() { return cTakeStatementsAssignment_4; }

		//TakeStatement
		public RuleCall getTakeStatementsTakeStatementParserRuleCall_4_0() { return cTakeStatementsTakeStatementParserRuleCall_4_0; }

		//putStatements+=PutStatement*
		public Assignment getPutStatementsAssignment_5() { return cPutStatementsAssignment_5; }

		//PutStatement
		public RuleCall getPutStatementsPutStatementParserRuleCall_5_0() { return cPutStatementsPutStatementParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AssureStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssureStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCountINTTerminalRuleCall_1_0 = (RuleCall)cCountAssignment_1.eContents().get(0);
		private final Assignment cResourceRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cResourceRefResourceCrossReference_2_0 = (CrossReference)cResourceRefAssignment_2.eContents().get(0);
		private final RuleCall cResourceRefResourceIDTerminalRuleCall_2_0_1 = (RuleCall)cResourceRefResourceCrossReference_2_0.eContents().get(1);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPlaceRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPlaceRefPlaceCrossReference_4_0 = (CrossReference)cPlaceRefAssignment_4.eContents().get(0);
		private final RuleCall cPlaceRefPlaceIDTerminalRuleCall_4_0_1 = (RuleCall)cPlaceRefPlaceCrossReference_4_0.eContents().get(1);
		
		//AssureStatement:
		//	"assure" count=INT resourceRef=[Resource] "in" placeRef=[Place];
		public ParserRule getRule() { return rule; }

		//"assure" count=INT resourceRef=[Resource] "in" placeRef=[Place]
		public Group getGroup() { return cGroup; }

		//"assure"
		public Keyword getAssureKeyword_0() { return cAssureKeyword_0; }

		//count=INT
		public Assignment getCountAssignment_1() { return cCountAssignment_1; }

		//INT
		public RuleCall getCountINTTerminalRuleCall_1_0() { return cCountINTTerminalRuleCall_1_0; }

		//resourceRef=[Resource]
		public Assignment getResourceRefAssignment_2() { return cResourceRefAssignment_2; }

		//[Resource]
		public CrossReference getResourceRefResourceCrossReference_2_0() { return cResourceRefResourceCrossReference_2_0; }

		//ID
		public RuleCall getResourceRefResourceIDTerminalRuleCall_2_0_1() { return cResourceRefResourceIDTerminalRuleCall_2_0_1; }

		//"in"
		public Keyword getInKeyword_3() { return cInKeyword_3; }

		//placeRef=[Place]
		public Assignment getPlaceRefAssignment_4() { return cPlaceRefAssignment_4; }

		//[Place]
		public CrossReference getPlaceRefPlaceCrossReference_4_0() { return cPlaceRefPlaceCrossReference_4_0; }

		//ID
		public RuleCall getPlaceRefPlaceIDTerminalRuleCall_4_0_1() { return cPlaceRefPlaceIDTerminalRuleCall_4_0_1; }
	}

	public class TakeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TakeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTakeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCountINTTerminalRuleCall_1_0 = (RuleCall)cCountAssignment_1.eContents().get(0);
		private final Assignment cResourceRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cResourceRefResourceCrossReference_2_0 = (CrossReference)cResourceRefAssignment_2.eContents().get(0);
		private final RuleCall cResourceRefResourceIDTerminalRuleCall_2_0_1 = (RuleCall)cResourceRefResourceCrossReference_2_0.eContents().get(1);
		private final Keyword cFromKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPlaceRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPlaceRefPlaceCrossReference_4_0 = (CrossReference)cPlaceRefAssignment_4.eContents().get(0);
		private final RuleCall cPlaceRefPlaceIDTerminalRuleCall_4_0_1 = (RuleCall)cPlaceRefPlaceCrossReference_4_0.eContents().get(1);
		
		//TakeStatement:
		//	"take" count=INT resourceRef=[Resource] "from" placeRef=[Place];
		public ParserRule getRule() { return rule; }

		//"take" count=INT resourceRef=[Resource] "from" placeRef=[Place]
		public Group getGroup() { return cGroup; }

		//"take"
		public Keyword getTakeKeyword_0() { return cTakeKeyword_0; }

		//count=INT
		public Assignment getCountAssignment_1() { return cCountAssignment_1; }

		//INT
		public RuleCall getCountINTTerminalRuleCall_1_0() { return cCountINTTerminalRuleCall_1_0; }

		//resourceRef=[Resource]
		public Assignment getResourceRefAssignment_2() { return cResourceRefAssignment_2; }

		//[Resource]
		public CrossReference getResourceRefResourceCrossReference_2_0() { return cResourceRefResourceCrossReference_2_0; }

		//ID
		public RuleCall getResourceRefResourceIDTerminalRuleCall_2_0_1() { return cResourceRefResourceIDTerminalRuleCall_2_0_1; }

		//"from"
		public Keyword getFromKeyword_3() { return cFromKeyword_3; }

		//placeRef=[Place]
		public Assignment getPlaceRefAssignment_4() { return cPlaceRefAssignment_4; }

		//[Place]
		public CrossReference getPlaceRefPlaceCrossReference_4_0() { return cPlaceRefPlaceCrossReference_4_0; }

		//ID
		public RuleCall getPlaceRefPlaceIDTerminalRuleCall_4_0_1() { return cPlaceRefPlaceIDTerminalRuleCall_4_0_1; }
	}

	public class PutStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PutStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCountINTTerminalRuleCall_1_0 = (RuleCall)cCountAssignment_1.eContents().get(0);
		private final Assignment cResourceRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cResourceRefResourceCrossReference_2_0 = (CrossReference)cResourceRefAssignment_2.eContents().get(0);
		private final RuleCall cResourceRefResourceIDTerminalRuleCall_2_0_1 = (RuleCall)cResourceRefResourceCrossReference_2_0.eContents().get(1);
		private final Keyword cIntoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPlaceRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPlaceRefPlaceCrossReference_4_0 = (CrossReference)cPlaceRefAssignment_4.eContents().get(0);
		private final RuleCall cPlaceRefPlaceIDTerminalRuleCall_4_0_1 = (RuleCall)cPlaceRefPlaceCrossReference_4_0.eContents().get(1);
		
		//PutStatement:
		//	"put" count=INT resourceRef=[Resource] "into" placeRef=[Place];
		public ParserRule getRule() { return rule; }

		//"put" count=INT resourceRef=[Resource] "into" placeRef=[Place]
		public Group getGroup() { return cGroup; }

		//"put"
		public Keyword getPutKeyword_0() { return cPutKeyword_0; }

		//count=INT
		public Assignment getCountAssignment_1() { return cCountAssignment_1; }

		//INT
		public RuleCall getCountINTTerminalRuleCall_1_0() { return cCountINTTerminalRuleCall_1_0; }

		//resourceRef=[Resource]
		public Assignment getResourceRefAssignment_2() { return cResourceRefAssignment_2; }

		//[Resource]
		public CrossReference getResourceRefResourceCrossReference_2_0() { return cResourceRefResourceCrossReference_2_0; }

		//ID
		public RuleCall getResourceRefResourceIDTerminalRuleCall_2_0_1() { return cResourceRefResourceIDTerminalRuleCall_2_0_1; }

		//"into"
		public Keyword getIntoKeyword_3() { return cIntoKeyword_3; }

		//placeRef=[Place]
		public Assignment getPlaceRefAssignment_4() { return cPlaceRefAssignment_4; }

		//[Place]
		public CrossReference getPlaceRefPlaceCrossReference_4_0() { return cPlaceRefPlaceCrossReference_4_0; }

		//ID
		public RuleCall getPlaceRefPlaceIDTerminalRuleCall_4_0_1() { return cPlaceRefPlaceIDTerminalRuleCall_4_0_1; }
	}
	
	
	private PetriNetElements pPetriNet;
	private ResourceElements pResource;
	private PlaceElements pPlace;
	private StorageElements pStorage;
	private TransactionElements pTransaction;
	private AssureStatementElements pAssureStatement;
	private TakeStatementElements pTakeStatement;
	private PutStatementElements pPutStatement;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PetrinetDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PetriNet:
	//	resources+=Resource+ places+=Place+ transactions+=Transaction+;
	public PetriNetElements getPetriNetAccess() {
		return (pPetriNet != null) ? pPetriNet : (pPetriNet = new PetriNetElements());
	}
	
	public ParserRule getPetriNetRule() {
		return getPetriNetAccess().getRule();
	}

	//Resource:
	//	"resource" name=ID;
	public ResourceElements getResourceAccess() {
		return (pResource != null) ? pResource : (pResource = new ResourceElements());
	}
	
	public ParserRule getResourceRule() {
		return getResourceAccess().getRule();
	}

	//Place:
	//	"place" name=ID "{" storages+=Storage* "}";
	public PlaceElements getPlaceAccess() {
		return (pPlace != null) ? pPlace : (pPlace = new PlaceElements());
	}
	
	public ParserRule getPlaceRule() {
		return getPlaceAccess().getRule();
	}

	//Storage:
	//	resourceRef=[Resource] ":" count=INT "/" (capacity=INT | "..");
	public StorageElements getStorageAccess() {
		return (pStorage != null) ? pStorage : (pStorage = new StorageElements());
	}
	
	public ParserRule getStorageRule() {
		return getStorageAccess().getRule();
	}

	//Transaction:
	//	"transaction" name=ID "{" assureStatements+=AssureStatement* takeStatements+=TakeStatement*
	//	putStatements+=PutStatement* "}";
	public TransactionElements getTransactionAccess() {
		return (pTransaction != null) ? pTransaction : (pTransaction = new TransactionElements());
	}
	
	public ParserRule getTransactionRule() {
		return getTransactionAccess().getRule();
	}

	//AssureStatement:
	//	"assure" count=INT resourceRef=[Resource] "in" placeRef=[Place];
	public AssureStatementElements getAssureStatementAccess() {
		return (pAssureStatement != null) ? pAssureStatement : (pAssureStatement = new AssureStatementElements());
	}
	
	public ParserRule getAssureStatementRule() {
		return getAssureStatementAccess().getRule();
	}

	//TakeStatement:
	//	"take" count=INT resourceRef=[Resource] "from" placeRef=[Place];
	public TakeStatementElements getTakeStatementAccess() {
		return (pTakeStatement != null) ? pTakeStatement : (pTakeStatement = new TakeStatementElements());
	}
	
	public ParserRule getTakeStatementRule() {
		return getTakeStatementAccess().getRule();
	}

	//PutStatement:
	//	"put" count=INT resourceRef=[Resource] "into" placeRef=[Place];
	public PutStatementElements getPutStatementAccess() {
		return (pPutStatement != null) ? pPutStatement : (pPutStatement = new PutStatementElements());
	}
	
	public ParserRule getPutStatementRule() {
		return getPutStatementAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
