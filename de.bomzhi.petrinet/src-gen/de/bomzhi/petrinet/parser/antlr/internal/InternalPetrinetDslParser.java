package de.bomzhi.petrinet.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.bomzhi.petrinet.services.PetrinetDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'resource'", "'place'", "'{'", "'}'", "':'", "'/'", "'..'", "'transaction'", "'assure'", "'in'", "'take'", "'from'", "'put'", "'into'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPetrinetDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetrinetDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetrinetDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g"; }



     	private PetrinetDslGrammarAccess grammarAccess;
     	
        public InternalPetrinetDslParser(TokenStream input, PetrinetDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PetriNet";	
       	}
       	
       	@Override
       	protected PetrinetDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePetriNet"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:67:1: entryRulePetriNet returns [EObject current=null] : iv_rulePetriNet= rulePetriNet EOF ;
    public final EObject entryRulePetriNet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetriNet = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:68:2: (iv_rulePetriNet= rulePetriNet EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:69:2: iv_rulePetriNet= rulePetriNet EOF
            {
             newCompositeNode(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet75);
            iv_rulePetriNet=rulePetriNet();

            state._fsp--;

             current =iv_rulePetriNet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:76:1: rulePetriNet returns [EObject current=null] : ( ( (lv_resources_0_0= ruleResource ) )+ ( (lv_places_1_0= rulePlace ) )+ ( (lv_transactions_2_0= ruleTransaction ) )+ ) ;
    public final EObject rulePetriNet() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject lv_places_1_0 = null;

        EObject lv_transactions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:79:28: ( ( ( (lv_resources_0_0= ruleResource ) )+ ( (lv_places_1_0= rulePlace ) )+ ( (lv_transactions_2_0= ruleTransaction ) )+ ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:80:1: ( ( (lv_resources_0_0= ruleResource ) )+ ( (lv_places_1_0= rulePlace ) )+ ( (lv_transactions_2_0= ruleTransaction ) )+ )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:80:1: ( ( (lv_resources_0_0= ruleResource ) )+ ( (lv_places_1_0= rulePlace ) )+ ( (lv_transactions_2_0= ruleTransaction ) )+ )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:80:2: ( (lv_resources_0_0= ruleResource ) )+ ( (lv_places_1_0= rulePlace ) )+ ( (lv_transactions_2_0= ruleTransaction ) )+
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:80:2: ( (lv_resources_0_0= ruleResource ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:81:1: (lv_resources_0_0= ruleResource )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:81:1: (lv_resources_0_0= ruleResource )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:82:3: lv_resources_0_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getResourcesResourceParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_rulePetriNet131);
            	    lv_resources_0_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_0_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:98:3: ( (lv_places_1_0= rulePlace ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:99:1: (lv_places_1_0= rulePlace )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:99:1: (lv_places_1_0= rulePlace )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:100:3: lv_places_1_0= rulePlace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getPlacesPlaceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlace_in_rulePetriNet153);
            	    lv_places_1_0=rulePlace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"places",
            	            		lv_places_1_0, 
            	            		"Place");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:116:3: ( (lv_transactions_2_0= ruleTransaction ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:117:1: (lv_transactions_2_0= ruleTransaction )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:117:1: (lv_transactions_2_0= ruleTransaction )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:118:3: lv_transactions_2_0= ruleTransaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getTransactionsTransactionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransaction_in_rulePetriNet175);
            	    lv_transactions_2_0=ruleTransaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transactions",
            	            		lv_transactions_2_0, 
            	            		"Transaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleResource"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:142:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:143:2: (iv_ruleResource= ruleResource EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:144:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource212);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:151:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:154:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:155:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:155:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:155:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleResource259); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:159:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:160:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:160:1: (lv_name_1_0= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:161:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource276); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePlace"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:185:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:186:2: (iv_rulePlace= rulePlace EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:187:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace317);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:194:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_storages_3_0= ruleStorage ) )* otherlv_4= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_storages_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:197:28: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_storages_3_0= ruleStorage ) )* otherlv_4= '}' ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:198:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_storages_3_0= ruleStorage ) )* otherlv_4= '}' )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:198:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_storages_3_0= ruleStorage ) )* otherlv_4= '}' )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:198:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_storages_3_0= ruleStorage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePlace364); 

                	newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:203:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:203:1: (lv_name_1_0= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlace381); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePlace398); 

                	newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:224:1: ( (lv_storages_3_0= ruleStorage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:225:1: (lv_storages_3_0= ruleStorage )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:225:1: (lv_storages_3_0= ruleStorage )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:226:3: lv_storages_3_0= ruleStorage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlaceAccess().getStoragesStorageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStorage_in_rulePlace419);
            	    lv_storages_3_0=ruleStorage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"storages",
            	            		lv_storages_3_0, 
            	            		"Storage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePlace432); 

                	newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleStorage"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:254:1: entryRuleStorage returns [EObject current=null] : iv_ruleStorage= ruleStorage EOF ;
    public final EObject entryRuleStorage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStorage = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:255:2: (iv_ruleStorage= ruleStorage EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:256:2: iv_ruleStorage= ruleStorage EOF
            {
             newCompositeNode(grammarAccess.getStorageRule()); 
            pushFollow(FOLLOW_ruleStorage_in_entryRuleStorage468);
            iv_ruleStorage=ruleStorage();

            state._fsp--;

             current =iv_ruleStorage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStorage478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStorage"


    // $ANTLR start "ruleStorage"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:263:1: ruleStorage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= '/' ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' ) ) ;
    public final EObject ruleStorage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_count_2_0=null;
        Token otherlv_3=null;
        Token lv_capacity_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:266:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= '/' ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:267:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= '/' ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' ) )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:267:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= '/' ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:267:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= '/' ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:267:2: ( (otherlv_0= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:268:1: (otherlv_0= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:268:1: (otherlv_0= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:269:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStorageRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStorage523); 

            		newLeafNode(otherlv_0, grammarAccess.getStorageAccess().getResourceRefResourceCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStorage535); 

                	newLeafNode(otherlv_1, grammarAccess.getStorageAccess().getColonKeyword_1());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:284:1: ( (lv_count_2_0= RULE_INT ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:285:1: (lv_count_2_0= RULE_INT )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:285:1: (lv_count_2_0= RULE_INT )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:286:3: lv_count_2_0= RULE_INT
            {
            lv_count_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStorage552); 

            			newLeafNode(lv_count_2_0, grammarAccess.getStorageAccess().getCountINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStorageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStorage569); 

                	newLeafNode(otherlv_3, grammarAccess.getStorageAccess().getSolidusKeyword_3());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:306:1: ( ( (lv_capacity_4_0= RULE_INT ) ) | otherlv_5= '..' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:306:2: ( (lv_capacity_4_0= RULE_INT ) )
                    {
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:306:2: ( (lv_capacity_4_0= RULE_INT ) )
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:307:1: (lv_capacity_4_0= RULE_INT )
                    {
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:307:1: (lv_capacity_4_0= RULE_INT )
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:308:3: lv_capacity_4_0= RULE_INT
                    {
                    lv_capacity_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStorage587); 

                    			newLeafNode(lv_capacity_4_0, grammarAccess.getStorageAccess().getCapacityINTTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStorageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"capacity",
                            		lv_capacity_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:325:7: otherlv_5= '..'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStorage610); 

                        	newLeafNode(otherlv_5, grammarAccess.getStorageAccess().getFullStopFullStopKeyword_4_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStorage"


    // $ANTLR start "entryRuleTransaction"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:337:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:338:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:339:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction647);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:346:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'transaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_assureStatements_3_0= ruleAssureStatement ) )* ( (lv_takeStatements_4_0= ruleTakeStatement ) )* ( (lv_putStatements_5_0= rulePutStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_assureStatements_3_0 = null;

        EObject lv_takeStatements_4_0 = null;

        EObject lv_putStatements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:349:28: ( (otherlv_0= 'transaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_assureStatements_3_0= ruleAssureStatement ) )* ( (lv_takeStatements_4_0= ruleTakeStatement ) )* ( (lv_putStatements_5_0= rulePutStatement ) )* otherlv_6= '}' ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:350:1: (otherlv_0= 'transaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_assureStatements_3_0= ruleAssureStatement ) )* ( (lv_takeStatements_4_0= ruleTakeStatement ) )* ( (lv_putStatements_5_0= rulePutStatement ) )* otherlv_6= '}' )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:350:1: (otherlv_0= 'transaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_assureStatements_3_0= ruleAssureStatement ) )* ( (lv_takeStatements_4_0= ruleTakeStatement ) )* ( (lv_putStatements_5_0= rulePutStatement ) )* otherlv_6= '}' )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:350:3: otherlv_0= 'transaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_assureStatements_3_0= ruleAssureStatement ) )* ( (lv_takeStatements_4_0= ruleTakeStatement ) )* ( (lv_putStatements_5_0= rulePutStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTransaction694); 

                	newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:354:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:355:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:355:1: (lv_name_1_0= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:356:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransaction711); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTransaction728); 

                	newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:376:1: ( (lv_assureStatements_3_0= ruleAssureStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:377:1: (lv_assureStatements_3_0= ruleAssureStatement )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:377:1: (lv_assureStatements_3_0= ruleAssureStatement )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:378:3: lv_assureStatements_3_0= ruleAssureStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransactionAccess().getAssureStatementsAssureStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssureStatement_in_ruleTransaction749);
            	    lv_assureStatements_3_0=ruleAssureStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assureStatements",
            	            		lv_assureStatements_3_0, 
            	            		"AssureStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:394:3: ( (lv_takeStatements_4_0= ruleTakeStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:395:1: (lv_takeStatements_4_0= ruleTakeStatement )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:395:1: (lv_takeStatements_4_0= ruleTakeStatement )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:396:3: lv_takeStatements_4_0= ruleTakeStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransactionAccess().getTakeStatementsTakeStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTakeStatement_in_ruleTransaction771);
            	    lv_takeStatements_4_0=ruleTakeStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"takeStatements",
            	            		lv_takeStatements_4_0, 
            	            		"TakeStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:412:3: ( (lv_putStatements_5_0= rulePutStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:413:1: (lv_putStatements_5_0= rulePutStatement )
            	    {
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:413:1: (lv_putStatements_5_0= rulePutStatement )
            	    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:414:3: lv_putStatements_5_0= rulePutStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransactionAccess().getPutStatementsPutStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePutStatement_in_ruleTransaction793);
            	    lv_putStatements_5_0=rulePutStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"putStatements",
            	            		lv_putStatements_5_0, 
            	            		"PutStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTransaction806); 

                	newLeafNode(otherlv_6, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleAssureStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:442:1: entryRuleAssureStatement returns [EObject current=null] : iv_ruleAssureStatement= ruleAssureStatement EOF ;
    public final EObject entryRuleAssureStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssureStatement = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:443:2: (iv_ruleAssureStatement= ruleAssureStatement EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:444:2: iv_ruleAssureStatement= ruleAssureStatement EOF
            {
             newCompositeNode(grammarAccess.getAssureStatementRule()); 
            pushFollow(FOLLOW_ruleAssureStatement_in_entryRuleAssureStatement842);
            iv_ruleAssureStatement=ruleAssureStatement();

            state._fsp--;

             current =iv_ruleAssureStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssureStatement852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssureStatement"


    // $ANTLR start "ruleAssureStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:451:1: ruleAssureStatement returns [EObject current=null] : (otherlv_0= 'assure' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleAssureStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_count_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:454:28: ( (otherlv_0= 'assure' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:455:1: (otherlv_0= 'assure' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:455:1: (otherlv_0= 'assure' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:455:3: otherlv_0= 'assure' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAssureStatement889); 

                	newLeafNode(otherlv_0, grammarAccess.getAssureStatementAccess().getAssureKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:459:1: ( (lv_count_1_0= RULE_INT ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:460:1: (lv_count_1_0= RULE_INT )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:460:1: (lv_count_1_0= RULE_INT )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:461:3: lv_count_1_0= RULE_INT
            {
            lv_count_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssureStatement906); 

            			newLeafNode(lv_count_1_0, grammarAccess.getAssureStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssureStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_1_0, 
                    		"INT");
            	    

            }


            }

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:477:2: ( (otherlv_2= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:478:1: (otherlv_2= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:478:1: (otherlv_2= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:479:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssureStatementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssureStatement931); 

            		newLeafNode(otherlv_2, grammarAccess.getAssureStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAssureStatement943); 

                	newLeafNode(otherlv_3, grammarAccess.getAssureStatementAccess().getInKeyword_3());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:494:1: ( (otherlv_4= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:495:1: (otherlv_4= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:495:1: (otherlv_4= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:496:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssureStatementRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssureStatement963); 

            		newLeafNode(otherlv_4, grammarAccess.getAssureStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssureStatement"


    // $ANTLR start "entryRuleTakeStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:515:1: entryRuleTakeStatement returns [EObject current=null] : iv_ruleTakeStatement= ruleTakeStatement EOF ;
    public final EObject entryRuleTakeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeStatement = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:516:2: (iv_ruleTakeStatement= ruleTakeStatement EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:517:2: iv_ruleTakeStatement= ruleTakeStatement EOF
            {
             newCompositeNode(grammarAccess.getTakeStatementRule()); 
            pushFollow(FOLLOW_ruleTakeStatement_in_entryRuleTakeStatement999);
            iv_ruleTakeStatement=ruleTakeStatement();

            state._fsp--;

             current =iv_ruleTakeStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTakeStatement1009); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTakeStatement"


    // $ANTLR start "ruleTakeStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:524:1: ruleTakeStatement returns [EObject current=null] : (otherlv_0= 'take' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTakeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_count_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:527:28: ( (otherlv_0= 'take' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:528:1: (otherlv_0= 'take' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:528:1: (otherlv_0= 'take' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:528:3: otherlv_0= 'take' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTakeStatement1046); 

                	newLeafNode(otherlv_0, grammarAccess.getTakeStatementAccess().getTakeKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:532:1: ( (lv_count_1_0= RULE_INT ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:533:1: (lv_count_1_0= RULE_INT )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:533:1: (lv_count_1_0= RULE_INT )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:534:3: lv_count_1_0= RULE_INT
            {
            lv_count_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTakeStatement1063); 

            			newLeafNode(lv_count_1_0, grammarAccess.getTakeStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTakeStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_1_0, 
                    		"INT");
            	    

            }


            }

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:550:2: ( (otherlv_2= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:551:1: (otherlv_2= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:551:1: (otherlv_2= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:552:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTakeStatementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTakeStatement1088); 

            		newLeafNode(otherlv_2, grammarAccess.getTakeStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTakeStatement1100); 

                	newLeafNode(otherlv_3, grammarAccess.getTakeStatementAccess().getFromKeyword_3());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:567:1: ( (otherlv_4= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:568:1: (otherlv_4= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:568:1: (otherlv_4= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:569:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTakeStatementRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTakeStatement1120); 

            		newLeafNode(otherlv_4, grammarAccess.getTakeStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTakeStatement"


    // $ANTLR start "entryRulePutStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:588:1: entryRulePutStatement returns [EObject current=null] : iv_rulePutStatement= rulePutStatement EOF ;
    public final EObject entryRulePutStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutStatement = null;


        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:589:2: (iv_rulePutStatement= rulePutStatement EOF )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:590:2: iv_rulePutStatement= rulePutStatement EOF
            {
             newCompositeNode(grammarAccess.getPutStatementRule()); 
            pushFollow(FOLLOW_rulePutStatement_in_entryRulePutStatement1156);
            iv_rulePutStatement=rulePutStatement();

            state._fsp--;

             current =iv_rulePutStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePutStatement1166); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutStatement"


    // $ANTLR start "rulePutStatement"
    // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:597:1: rulePutStatement returns [EObject current=null] : (otherlv_0= 'put' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'into' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePutStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_count_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:600:28: ( (otherlv_0= 'put' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'into' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:601:1: (otherlv_0= 'put' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'into' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:601:1: (otherlv_0= 'put' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'into' ( (otherlv_4= RULE_ID ) ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:601:3: otherlv_0= 'put' ( (lv_count_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'into' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePutStatement1203); 

                	newLeafNode(otherlv_0, grammarAccess.getPutStatementAccess().getPutKeyword_0());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:605:1: ( (lv_count_1_0= RULE_INT ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:606:1: (lv_count_1_0= RULE_INT )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:606:1: (lv_count_1_0= RULE_INT )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:607:3: lv_count_1_0= RULE_INT
            {
            lv_count_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePutStatement1220); 

            			newLeafNode(lv_count_1_0, grammarAccess.getPutStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPutStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_1_0, 
                    		"INT");
            	    

            }


            }

            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:623:2: ( (otherlv_2= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:624:1: (otherlv_2= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:624:1: (otherlv_2= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:625:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPutStatementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePutStatement1245); 

            		newLeafNode(otherlv_2, grammarAccess.getPutStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePutStatement1257); 

                	newLeafNode(otherlv_3, grammarAccess.getPutStatementAccess().getIntoKeyword_3());
                
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:640:1: ( (otherlv_4= RULE_ID ) )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:641:1: (otherlv_4= RULE_ID )
            {
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:641:1: (otherlv_4= RULE_ID )
            // ../de.bomzhi.petrinet/src-gen/de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.g:642:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPutStatementRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePutStatement1277); 

            		newLeafNode(otherlv_4, grammarAccess.getPutStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rulePetriNet131 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rulePlace_in_rulePetriNet153 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_ruleTransaction_in_rulePetriNet175 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleResource259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlace364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlace381 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlace398 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleStorage_in_rulePlace419 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_rulePlace432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorage_in_entryRuleStorage468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStorage478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStorage523 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStorage535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStorage552 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStorage569 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStorage587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStorage610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTransaction694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransaction711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransaction728 = new BitSet(new long[]{0x0000000000A84000L});
    public static final BitSet FOLLOW_ruleAssureStatement_in_ruleTransaction749 = new BitSet(new long[]{0x0000000000A84000L});
    public static final BitSet FOLLOW_ruleTakeStatement_in_ruleTransaction771 = new BitSet(new long[]{0x0000000000A04000L});
    public static final BitSet FOLLOW_rulePutStatement_in_ruleTransaction793 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleTransaction806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssureStatement_in_entryRuleAssureStatement842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssureStatement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssureStatement889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssureStatement906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssureStatement931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssureStatement943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssureStatement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTakeStatement_in_entryRuleTakeStatement999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTakeStatement1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTakeStatement1046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTakeStatement1063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTakeStatement1088 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTakeStatement1100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTakeStatement1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutStatement_in_entryRulePutStatement1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutStatement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePutStatement1203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePutStatement1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePutStatement1245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePutStatement1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePutStatement1277 = new BitSet(new long[]{0x0000000000000002L});

}