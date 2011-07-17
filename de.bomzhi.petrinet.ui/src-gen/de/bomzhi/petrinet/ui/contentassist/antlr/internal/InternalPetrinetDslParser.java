package de.bomzhi.petrinet.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.bomzhi.petrinet.services.PetrinetDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'resource'", "'place'", "'{'", "'}'", "':'", "'/'", "'transaction'", "'assure'", "'in'", "'take'", "'from'", "'put'", "'into'"
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
    public String getGrammarFileName() { return "../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g"; }


     
     	private PetrinetDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PetrinetDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePetriNet"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:61:1: entryRulePetriNet : rulePetriNet EOF ;
    public final void entryRulePetriNet() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:62:1: ( rulePetriNet EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:63:1: rulePetriNet EOF
            {
             before(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet61);
            rulePetriNet();

            state._fsp--;

             after(grammarAccess.getPetriNetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:70:1: rulePetriNet : ( ( rule__PetriNet__Group__0 ) ) ;
    public final void rulePetriNet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:74:2: ( ( ( rule__PetriNet__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:75:1: ( ( rule__PetriNet__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:75:1: ( ( rule__PetriNet__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:76:1: ( rule__PetriNet__Group__0 )
            {
             before(grammarAccess.getPetriNetAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:77:1: ( rule__PetriNet__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:77:2: rule__PetriNet__Group__0
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94);
            rule__PetriNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleResource"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:89:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:90:1: ( ruleResource EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:91:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource121);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:98:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:102:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:103:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:103:1: ( ( rule__Resource__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:104:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:105:1: ( rule__Resource__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:105:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource154);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePlace"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:117:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:118:1: ( rulePlace EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:119:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace181);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:126:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:130:2: ( ( ( rule__Place__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:131:1: ( ( rule__Place__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:131:1: ( ( rule__Place__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:132:1: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:133:1: ( rule__Place__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:133:2: rule__Place__Group__0
            {
            pushFollow(FOLLOW_rule__Place__Group__0_in_rulePlace214);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleStorage"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:145:1: entryRuleStorage : ruleStorage EOF ;
    public final void entryRuleStorage() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:146:1: ( ruleStorage EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:147:1: ruleStorage EOF
            {
             before(grammarAccess.getStorageRule()); 
            pushFollow(FOLLOW_ruleStorage_in_entryRuleStorage241);
            ruleStorage();

            state._fsp--;

             after(grammarAccess.getStorageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStorage248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStorage"


    // $ANTLR start "ruleStorage"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:154:1: ruleStorage : ( ( rule__Storage__Group__0 ) ) ;
    public final void ruleStorage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:158:2: ( ( ( rule__Storage__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:159:1: ( ( rule__Storage__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:159:1: ( ( rule__Storage__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:160:1: ( rule__Storage__Group__0 )
            {
             before(grammarAccess.getStorageAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:161:1: ( rule__Storage__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:161:2: rule__Storage__Group__0
            {
            pushFollow(FOLLOW_rule__Storage__Group__0_in_ruleStorage274);
            rule__Storage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStorage"


    // $ANTLR start "entryRuleTransaction"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:173:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:174:1: ( ruleTransaction EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:175:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction301);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:182:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:186:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:187:1: ( ( rule__Transaction__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:187:1: ( ( rule__Transaction__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:188:1: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:189:1: ( rule__Transaction__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:189:2: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0_in_ruleTransaction334);
            rule__Transaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleAssureStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:201:1: entryRuleAssureStatement : ruleAssureStatement EOF ;
    public final void entryRuleAssureStatement() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:202:1: ( ruleAssureStatement EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:203:1: ruleAssureStatement EOF
            {
             before(grammarAccess.getAssureStatementRule()); 
            pushFollow(FOLLOW_ruleAssureStatement_in_entryRuleAssureStatement361);
            ruleAssureStatement();

            state._fsp--;

             after(grammarAccess.getAssureStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssureStatement368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssureStatement"


    // $ANTLR start "ruleAssureStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:210:1: ruleAssureStatement : ( ( rule__AssureStatement__Group__0 ) ) ;
    public final void ruleAssureStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:214:2: ( ( ( rule__AssureStatement__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:215:1: ( ( rule__AssureStatement__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:215:1: ( ( rule__AssureStatement__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:216:1: ( rule__AssureStatement__Group__0 )
            {
             before(grammarAccess.getAssureStatementAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:217:1: ( rule__AssureStatement__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:217:2: rule__AssureStatement__Group__0
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__0_in_ruleAssureStatement394);
            rule__AssureStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssureStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssureStatement"


    // $ANTLR start "entryRuleTakeStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:229:1: entryRuleTakeStatement : ruleTakeStatement EOF ;
    public final void entryRuleTakeStatement() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:230:1: ( ruleTakeStatement EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:231:1: ruleTakeStatement EOF
            {
             before(grammarAccess.getTakeStatementRule()); 
            pushFollow(FOLLOW_ruleTakeStatement_in_entryRuleTakeStatement421);
            ruleTakeStatement();

            state._fsp--;

             after(grammarAccess.getTakeStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTakeStatement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTakeStatement"


    // $ANTLR start "ruleTakeStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:238:1: ruleTakeStatement : ( ( rule__TakeStatement__Group__0 ) ) ;
    public final void ruleTakeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:242:2: ( ( ( rule__TakeStatement__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:243:1: ( ( rule__TakeStatement__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:243:1: ( ( rule__TakeStatement__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:244:1: ( rule__TakeStatement__Group__0 )
            {
             before(grammarAccess.getTakeStatementAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:245:1: ( rule__TakeStatement__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:245:2: rule__TakeStatement__Group__0
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__0_in_ruleTakeStatement454);
            rule__TakeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTakeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTakeStatement"


    // $ANTLR start "entryRulePutStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:257:1: entryRulePutStatement : rulePutStatement EOF ;
    public final void entryRulePutStatement() throws RecognitionException {
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:258:1: ( rulePutStatement EOF )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:259:1: rulePutStatement EOF
            {
             before(grammarAccess.getPutStatementRule()); 
            pushFollow(FOLLOW_rulePutStatement_in_entryRulePutStatement481);
            rulePutStatement();

            state._fsp--;

             after(grammarAccess.getPutStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePutStatement488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePutStatement"


    // $ANTLR start "rulePutStatement"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:266:1: rulePutStatement : ( ( rule__PutStatement__Group__0 ) ) ;
    public final void rulePutStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:270:2: ( ( ( rule__PutStatement__Group__0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:271:1: ( ( rule__PutStatement__Group__0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:271:1: ( ( rule__PutStatement__Group__0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:272:1: ( rule__PutStatement__Group__0 )
            {
             before(grammarAccess.getPutStatementAccess().getGroup()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:273:1: ( rule__PutStatement__Group__0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:273:2: rule__PutStatement__Group__0
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__0_in_rulePutStatement514);
            rule__PutStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPutStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePutStatement"


    // $ANTLR start "rule__Storage__Alternatives_4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:285:1: rule__Storage__Alternatives_4 : ( ( ( rule__Storage__CapacityAssignment_4_0 ) ) | ( '..' ) );
    public final void rule__Storage__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:289:1: ( ( ( rule__Storage__CapacityAssignment_4_0 ) ) | ( '..' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:290:1: ( ( rule__Storage__CapacityAssignment_4_0 ) )
                    {
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:290:1: ( ( rule__Storage__CapacityAssignment_4_0 ) )
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:291:1: ( rule__Storage__CapacityAssignment_4_0 )
                    {
                     before(grammarAccess.getStorageAccess().getCapacityAssignment_4_0()); 
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:292:1: ( rule__Storage__CapacityAssignment_4_0 )
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:292:2: rule__Storage__CapacityAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Storage__CapacityAssignment_4_0_in_rule__Storage__Alternatives_4550);
                    rule__Storage__CapacityAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStorageAccess().getCapacityAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:296:6: ( '..' )
                    {
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:296:6: ( '..' )
                    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:297:1: '..'
                    {
                     before(grammarAccess.getStorageAccess().getFullStopFullStopKeyword_4_1()); 
                    match(input,11,FOLLOW_11_in_rule__Storage__Alternatives_4569); 
                     after(grammarAccess.getStorageAccess().getFullStopFullStopKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Alternatives_4"


    // $ANTLR start "rule__PetriNet__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:311:1: rule__PetriNet__Group__0 : rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 ;
    public final void rule__PetriNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:315:1: ( rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:316:2: rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0601);
            rule__PetriNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0604);
            rule__PetriNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0"


    // $ANTLR start "rule__PetriNet__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:323:1: rule__PetriNet__Group__0__Impl : ( ( ( rule__PetriNet__ResourcesAssignment_0 ) ) ( ( rule__PetriNet__ResourcesAssignment_0 )* ) ) ;
    public final void rule__PetriNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:327:1: ( ( ( ( rule__PetriNet__ResourcesAssignment_0 ) ) ( ( rule__PetriNet__ResourcesAssignment_0 )* ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:328:1: ( ( ( rule__PetriNet__ResourcesAssignment_0 ) ) ( ( rule__PetriNet__ResourcesAssignment_0 )* ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:328:1: ( ( ( rule__PetriNet__ResourcesAssignment_0 ) ) ( ( rule__PetriNet__ResourcesAssignment_0 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:329:1: ( ( rule__PetriNet__ResourcesAssignment_0 ) ) ( ( rule__PetriNet__ResourcesAssignment_0 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:329:1: ( ( rule__PetriNet__ResourcesAssignment_0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:330:1: ( rule__PetriNet__ResourcesAssignment_0 )
            {
             before(grammarAccess.getPetriNetAccess().getResourcesAssignment_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:331:1: ( rule__PetriNet__ResourcesAssignment_0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:331:2: rule__PetriNet__ResourcesAssignment_0
            {
            pushFollow(FOLLOW_rule__PetriNet__ResourcesAssignment_0_in_rule__PetriNet__Group__0__Impl633);
            rule__PetriNet__ResourcesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getResourcesAssignment_0()); 

            }

            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:334:1: ( ( rule__PetriNet__ResourcesAssignment_0 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:335:1: ( rule__PetriNet__ResourcesAssignment_0 )*
            {
             before(grammarAccess.getPetriNetAccess().getResourcesAssignment_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:336:1: ( rule__PetriNet__ResourcesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:336:2: rule__PetriNet__ResourcesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__ResourcesAssignment_0_in_rule__PetriNet__Group__0__Impl645);
            	    rule__PetriNet__ResourcesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getResourcesAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0__Impl"


    // $ANTLR start "rule__PetriNet__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:347:1: rule__PetriNet__Group__1 : rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 ;
    public final void rule__PetriNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:351:1: ( rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:352:2: rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1678);
            rule__PetriNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1681);
            rule__PetriNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1"


    // $ANTLR start "rule__PetriNet__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:359:1: rule__PetriNet__Group__1__Impl : ( ( ( rule__PetriNet__PlacesAssignment_1 ) ) ( ( rule__PetriNet__PlacesAssignment_1 )* ) ) ;
    public final void rule__PetriNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:363:1: ( ( ( ( rule__PetriNet__PlacesAssignment_1 ) ) ( ( rule__PetriNet__PlacesAssignment_1 )* ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:364:1: ( ( ( rule__PetriNet__PlacesAssignment_1 ) ) ( ( rule__PetriNet__PlacesAssignment_1 )* ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:364:1: ( ( ( rule__PetriNet__PlacesAssignment_1 ) ) ( ( rule__PetriNet__PlacesAssignment_1 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:365:1: ( ( rule__PetriNet__PlacesAssignment_1 ) ) ( ( rule__PetriNet__PlacesAssignment_1 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:365:1: ( ( rule__PetriNet__PlacesAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:366:1: ( rule__PetriNet__PlacesAssignment_1 )
            {
             before(grammarAccess.getPetriNetAccess().getPlacesAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:367:1: ( rule__PetriNet__PlacesAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:367:2: rule__PetriNet__PlacesAssignment_1
            {
            pushFollow(FOLLOW_rule__PetriNet__PlacesAssignment_1_in_rule__PetriNet__Group__1__Impl710);
            rule__PetriNet__PlacesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getPlacesAssignment_1()); 

            }

            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:370:1: ( ( rule__PetriNet__PlacesAssignment_1 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:371:1: ( rule__PetriNet__PlacesAssignment_1 )*
            {
             before(grammarAccess.getPetriNetAccess().getPlacesAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:372:1: ( rule__PetriNet__PlacesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:372:2: rule__PetriNet__PlacesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__PlacesAssignment_1_in_rule__PetriNet__Group__1__Impl722);
            	    rule__PetriNet__PlacesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getPlacesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1__Impl"


    // $ANTLR start "rule__PetriNet__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:383:1: rule__PetriNet__Group__2 : rule__PetriNet__Group__2__Impl ;
    public final void rule__PetriNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:387:1: ( rule__PetriNet__Group__2__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:388:2: rule__PetriNet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2755);
            rule__PetriNet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2"


    // $ANTLR start "rule__PetriNet__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:394:1: rule__PetriNet__Group__2__Impl : ( ( ( rule__PetriNet__TransactionsAssignment_2 ) ) ( ( rule__PetriNet__TransactionsAssignment_2 )* ) ) ;
    public final void rule__PetriNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:398:1: ( ( ( ( rule__PetriNet__TransactionsAssignment_2 ) ) ( ( rule__PetriNet__TransactionsAssignment_2 )* ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:399:1: ( ( ( rule__PetriNet__TransactionsAssignment_2 ) ) ( ( rule__PetriNet__TransactionsAssignment_2 )* ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:399:1: ( ( ( rule__PetriNet__TransactionsAssignment_2 ) ) ( ( rule__PetriNet__TransactionsAssignment_2 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:400:1: ( ( rule__PetriNet__TransactionsAssignment_2 ) ) ( ( rule__PetriNet__TransactionsAssignment_2 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:400:1: ( ( rule__PetriNet__TransactionsAssignment_2 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:401:1: ( rule__PetriNet__TransactionsAssignment_2 )
            {
             before(grammarAccess.getPetriNetAccess().getTransactionsAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:402:1: ( rule__PetriNet__TransactionsAssignment_2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:402:2: rule__PetriNet__TransactionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PetriNet__TransactionsAssignment_2_in_rule__PetriNet__Group__2__Impl784);
            rule__PetriNet__TransactionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getTransactionsAssignment_2()); 

            }

            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:405:1: ( ( rule__PetriNet__TransactionsAssignment_2 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:406:1: ( rule__PetriNet__TransactionsAssignment_2 )*
            {
             before(grammarAccess.getPetriNetAccess().getTransactionsAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:407:1: ( rule__PetriNet__TransactionsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:407:2: rule__PetriNet__TransactionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__TransactionsAssignment_2_in_rule__PetriNet__Group__2__Impl796);
            	    rule__PetriNet__TransactionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getTransactionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:424:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:428:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:429:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__0835);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__0838);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:436:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:440:1: ( ( 'resource' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:441:1: ( 'resource' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:441:1: ( 'resource' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:442:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Resource__Group__0__Impl866); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:455:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:459:1: ( rule__Resource__Group__1__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:460:2: rule__Resource__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__1897);
            rule__Resource__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:466:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:470:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:471:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:471:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:472:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:473:1: ( rule__Resource__NameAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:473:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl924);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:487:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:491:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:492:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0958);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0961);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:499:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:503:1: ( ( 'place' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:504:1: ( 'place' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:504:1: ( 'place' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:505:1: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Place__Group__0__Impl989); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:518:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:522:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:523:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__11020);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__2_in_rule__Place__Group__11023);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:530:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:534:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:535:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:535:1: ( ( rule__Place__NameAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:536:1: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:537:1: ( rule__Place__NameAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:537:2: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl1050);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:547:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:551:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:552:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__21080);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__3_in_rule__Place__Group__21083);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:559:1: rule__Place__Group__2__Impl : ( '{' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:563:1: ( ( '{' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:564:1: ( '{' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:564:1: ( '{' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:565:1: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Place__Group__2__Impl1111); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:578:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:582:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:583:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__31142);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__4_in_rule__Place__Group__31145);
            rule__Place__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:590:1: rule__Place__Group__3__Impl : ( ( rule__Place__StoragesAssignment_3 )* ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:594:1: ( ( ( rule__Place__StoragesAssignment_3 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:595:1: ( ( rule__Place__StoragesAssignment_3 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:595:1: ( ( rule__Place__StoragesAssignment_3 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:596:1: ( rule__Place__StoragesAssignment_3 )*
            {
             before(grammarAccess.getPlaceAccess().getStoragesAssignment_3()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:597:1: ( rule__Place__StoragesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:597:2: rule__Place__StoragesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Place__StoragesAssignment_3_in_rule__Place__Group__3__Impl1172);
            	    rule__Place__StoragesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getStoragesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:607:1: rule__Place__Group__4 : rule__Place__Group__4__Impl ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:611:1: ( rule__Place__Group__4__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:612:2: rule__Place__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__41203);
            rule__Place__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:618:1: rule__Place__Group__4__Impl : ( '}' ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:622:1: ( ( '}' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:623:1: ( '}' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:623:1: ( '}' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:624:1: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Place__Group__4__Impl1231); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Storage__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:647:1: rule__Storage__Group__0 : rule__Storage__Group__0__Impl rule__Storage__Group__1 ;
    public final void rule__Storage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:651:1: ( rule__Storage__Group__0__Impl rule__Storage__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:652:2: rule__Storage__Group__0__Impl rule__Storage__Group__1
            {
            pushFollow(FOLLOW_rule__Storage__Group__0__Impl_in_rule__Storage__Group__01272);
            rule__Storage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Storage__Group__1_in_rule__Storage__Group__01275);
            rule__Storage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__0"


    // $ANTLR start "rule__Storage__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:659:1: rule__Storage__Group__0__Impl : ( ( rule__Storage__ResourceRefAssignment_0 ) ) ;
    public final void rule__Storage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:663:1: ( ( ( rule__Storage__ResourceRefAssignment_0 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:664:1: ( ( rule__Storage__ResourceRefAssignment_0 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:664:1: ( ( rule__Storage__ResourceRefAssignment_0 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:665:1: ( rule__Storage__ResourceRefAssignment_0 )
            {
             before(grammarAccess.getStorageAccess().getResourceRefAssignment_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:666:1: ( rule__Storage__ResourceRefAssignment_0 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:666:2: rule__Storage__ResourceRefAssignment_0
            {
            pushFollow(FOLLOW_rule__Storage__ResourceRefAssignment_0_in_rule__Storage__Group__0__Impl1302);
            rule__Storage__ResourceRefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getResourceRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__0__Impl"


    // $ANTLR start "rule__Storage__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:676:1: rule__Storage__Group__1 : rule__Storage__Group__1__Impl rule__Storage__Group__2 ;
    public final void rule__Storage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:680:1: ( rule__Storage__Group__1__Impl rule__Storage__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:681:2: rule__Storage__Group__1__Impl rule__Storage__Group__2
            {
            pushFollow(FOLLOW_rule__Storage__Group__1__Impl_in_rule__Storage__Group__11332);
            rule__Storage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Storage__Group__2_in_rule__Storage__Group__11335);
            rule__Storage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__1"


    // $ANTLR start "rule__Storage__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:688:1: rule__Storage__Group__1__Impl : ( ':' ) ;
    public final void rule__Storage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:692:1: ( ( ':' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:693:1: ( ':' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:693:1: ( ':' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:694:1: ':'
            {
             before(grammarAccess.getStorageAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Storage__Group__1__Impl1363); 
             after(grammarAccess.getStorageAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__1__Impl"


    // $ANTLR start "rule__Storage__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:707:1: rule__Storage__Group__2 : rule__Storage__Group__2__Impl rule__Storage__Group__3 ;
    public final void rule__Storage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:711:1: ( rule__Storage__Group__2__Impl rule__Storage__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:712:2: rule__Storage__Group__2__Impl rule__Storage__Group__3
            {
            pushFollow(FOLLOW_rule__Storage__Group__2__Impl_in_rule__Storage__Group__21394);
            rule__Storage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Storage__Group__3_in_rule__Storage__Group__21397);
            rule__Storage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__2"


    // $ANTLR start "rule__Storage__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:719:1: rule__Storage__Group__2__Impl : ( ( rule__Storage__CountAssignment_2 ) ) ;
    public final void rule__Storage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:723:1: ( ( ( rule__Storage__CountAssignment_2 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:724:1: ( ( rule__Storage__CountAssignment_2 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:724:1: ( ( rule__Storage__CountAssignment_2 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:725:1: ( rule__Storage__CountAssignment_2 )
            {
             before(grammarAccess.getStorageAccess().getCountAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:726:1: ( rule__Storage__CountAssignment_2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:726:2: rule__Storage__CountAssignment_2
            {
            pushFollow(FOLLOW_rule__Storage__CountAssignment_2_in_rule__Storage__Group__2__Impl1424);
            rule__Storage__CountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getCountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__2__Impl"


    // $ANTLR start "rule__Storage__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:736:1: rule__Storage__Group__3 : rule__Storage__Group__3__Impl rule__Storage__Group__4 ;
    public final void rule__Storage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:740:1: ( rule__Storage__Group__3__Impl rule__Storage__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:741:2: rule__Storage__Group__3__Impl rule__Storage__Group__4
            {
            pushFollow(FOLLOW_rule__Storage__Group__3__Impl_in_rule__Storage__Group__31454);
            rule__Storage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Storage__Group__4_in_rule__Storage__Group__31457);
            rule__Storage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__3"


    // $ANTLR start "rule__Storage__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:748:1: rule__Storage__Group__3__Impl : ( '/' ) ;
    public final void rule__Storage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:752:1: ( ( '/' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:753:1: ( '/' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:753:1: ( '/' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:754:1: '/'
            {
             before(grammarAccess.getStorageAccess().getSolidusKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Storage__Group__3__Impl1485); 
             after(grammarAccess.getStorageAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__3__Impl"


    // $ANTLR start "rule__Storage__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:767:1: rule__Storage__Group__4 : rule__Storage__Group__4__Impl ;
    public final void rule__Storage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:771:1: ( rule__Storage__Group__4__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:772:2: rule__Storage__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Storage__Group__4__Impl_in_rule__Storage__Group__41516);
            rule__Storage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__4"


    // $ANTLR start "rule__Storage__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:778:1: rule__Storage__Group__4__Impl : ( ( rule__Storage__Alternatives_4 ) ) ;
    public final void rule__Storage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:782:1: ( ( ( rule__Storage__Alternatives_4 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:783:1: ( ( rule__Storage__Alternatives_4 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:783:1: ( ( rule__Storage__Alternatives_4 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:784:1: ( rule__Storage__Alternatives_4 )
            {
             before(grammarAccess.getStorageAccess().getAlternatives_4()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:785:1: ( rule__Storage__Alternatives_4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:785:2: rule__Storage__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Storage__Alternatives_4_in_rule__Storage__Group__4__Impl1543);
            rule__Storage__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:805:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:809:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:810:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__01583);
            rule__Transaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__01586);
            rule__Transaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:817:1: rule__Transaction__Group__0__Impl : ( 'transaction' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:821:1: ( ( 'transaction' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:822:1: ( 'transaction' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:822:1: ( 'transaction' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:823:1: 'transaction'
            {
             before(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Transaction__Group__0__Impl1614); 
             after(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:836:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:840:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:841:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__11645);
            rule__Transaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__11648);
            rule__Transaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:848:1: rule__Transaction__Group__1__Impl : ( ( rule__Transaction__NameAssignment_1 ) ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:852:1: ( ( ( rule__Transaction__NameAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:853:1: ( ( rule__Transaction__NameAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:853:1: ( ( rule__Transaction__NameAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:854:1: ( rule__Transaction__NameAssignment_1 )
            {
             before(grammarAccess.getTransactionAccess().getNameAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:855:1: ( rule__Transaction__NameAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:855:2: rule__Transaction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl1675);
            rule__Transaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:865:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:869:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:870:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__21705);
            rule__Transaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__21708);
            rule__Transaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:877:1: rule__Transaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:881:1: ( ( '{' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:882:1: ( '{' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:882:1: ( '{' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:883:1: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Transaction__Group__2__Impl1736); 
             after(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:896:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:900:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:901:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__31767);
            rule__Transaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__31770);
            rule__Transaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:908:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__AssureStatementsAssignment_3 )* ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:912:1: ( ( ( rule__Transaction__AssureStatementsAssignment_3 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:913:1: ( ( rule__Transaction__AssureStatementsAssignment_3 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:913:1: ( ( rule__Transaction__AssureStatementsAssignment_3 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:914:1: ( rule__Transaction__AssureStatementsAssignment_3 )*
            {
             before(grammarAccess.getTransactionAccess().getAssureStatementsAssignment_3()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:915:1: ( rule__Transaction__AssureStatementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:915:2: rule__Transaction__AssureStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__AssureStatementsAssignment_3_in_rule__Transaction__Group__3__Impl1797);
            	    rule__Transaction__AssureStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getAssureStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:925:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:929:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:930:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__41828);
            rule__Transaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__41831);
            rule__Transaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:937:1: rule__Transaction__Group__4__Impl : ( ( rule__Transaction__TakeStatementsAssignment_4 )* ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:941:1: ( ( ( rule__Transaction__TakeStatementsAssignment_4 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:942:1: ( ( rule__Transaction__TakeStatementsAssignment_4 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:942:1: ( ( rule__Transaction__TakeStatementsAssignment_4 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:943:1: ( rule__Transaction__TakeStatementsAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getTakeStatementsAssignment_4()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:944:1: ( rule__Transaction__TakeStatementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:944:2: rule__Transaction__TakeStatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__TakeStatementsAssignment_4_in_rule__Transaction__Group__4__Impl1858);
            	    rule__Transaction__TakeStatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getTakeStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:954:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:958:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:959:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__51889);
            rule__Transaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__51892);
            rule__Transaction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:966:1: rule__Transaction__Group__5__Impl : ( ( rule__Transaction__PutStatementsAssignment_5 )* ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:970:1: ( ( ( rule__Transaction__PutStatementsAssignment_5 )* ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:971:1: ( ( rule__Transaction__PutStatementsAssignment_5 )* )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:971:1: ( ( rule__Transaction__PutStatementsAssignment_5 )* )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:972:1: ( rule__Transaction__PutStatementsAssignment_5 )*
            {
             before(grammarAccess.getTransactionAccess().getPutStatementsAssignment_5()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:973:1: ( rule__Transaction__PutStatementsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:973:2: rule__Transaction__PutStatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__PutStatementsAssignment_5_in_rule__Transaction__Group__5__Impl1919);
            	    rule__Transaction__PutStatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getPutStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__6"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:983:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:987:1: ( rule__Transaction__Group__6__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:988:2: rule__Transaction__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__61950);
            rule__Transaction__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6"


    // $ANTLR start "rule__Transaction__Group__6__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:994:1: rule__Transaction__Group__6__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:998:1: ( ( '}' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:999:1: ( '}' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:999:1: ( '}' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1000:1: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Transaction__Group__6__Impl1978); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6__Impl"


    // $ANTLR start "rule__AssureStatement__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1027:1: rule__AssureStatement__Group__0 : rule__AssureStatement__Group__0__Impl rule__AssureStatement__Group__1 ;
    public final void rule__AssureStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1031:1: ( rule__AssureStatement__Group__0__Impl rule__AssureStatement__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1032:2: rule__AssureStatement__Group__0__Impl rule__AssureStatement__Group__1
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__0__Impl_in_rule__AssureStatement__Group__02023);
            rule__AssureStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssureStatement__Group__1_in_rule__AssureStatement__Group__02026);
            rule__AssureStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__0"


    // $ANTLR start "rule__AssureStatement__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1039:1: rule__AssureStatement__Group__0__Impl : ( 'assure' ) ;
    public final void rule__AssureStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1043:1: ( ( 'assure' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1044:1: ( 'assure' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1044:1: ( 'assure' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1045:1: 'assure'
            {
             before(grammarAccess.getAssureStatementAccess().getAssureKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__AssureStatement__Group__0__Impl2054); 
             after(grammarAccess.getAssureStatementAccess().getAssureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__0__Impl"


    // $ANTLR start "rule__AssureStatement__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1058:1: rule__AssureStatement__Group__1 : rule__AssureStatement__Group__1__Impl rule__AssureStatement__Group__2 ;
    public final void rule__AssureStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1062:1: ( rule__AssureStatement__Group__1__Impl rule__AssureStatement__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1063:2: rule__AssureStatement__Group__1__Impl rule__AssureStatement__Group__2
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__1__Impl_in_rule__AssureStatement__Group__12085);
            rule__AssureStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssureStatement__Group__2_in_rule__AssureStatement__Group__12088);
            rule__AssureStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__1"


    // $ANTLR start "rule__AssureStatement__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1070:1: rule__AssureStatement__Group__1__Impl : ( ( rule__AssureStatement__CountAssignment_1 ) ) ;
    public final void rule__AssureStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1074:1: ( ( ( rule__AssureStatement__CountAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1075:1: ( ( rule__AssureStatement__CountAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1075:1: ( ( rule__AssureStatement__CountAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1076:1: ( rule__AssureStatement__CountAssignment_1 )
            {
             before(grammarAccess.getAssureStatementAccess().getCountAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1077:1: ( rule__AssureStatement__CountAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1077:2: rule__AssureStatement__CountAssignment_1
            {
            pushFollow(FOLLOW_rule__AssureStatement__CountAssignment_1_in_rule__AssureStatement__Group__1__Impl2115);
            rule__AssureStatement__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssureStatementAccess().getCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__1__Impl"


    // $ANTLR start "rule__AssureStatement__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1087:1: rule__AssureStatement__Group__2 : rule__AssureStatement__Group__2__Impl rule__AssureStatement__Group__3 ;
    public final void rule__AssureStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1091:1: ( rule__AssureStatement__Group__2__Impl rule__AssureStatement__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1092:2: rule__AssureStatement__Group__2__Impl rule__AssureStatement__Group__3
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__2__Impl_in_rule__AssureStatement__Group__22145);
            rule__AssureStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssureStatement__Group__3_in_rule__AssureStatement__Group__22148);
            rule__AssureStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__2"


    // $ANTLR start "rule__AssureStatement__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1099:1: rule__AssureStatement__Group__2__Impl : ( ( rule__AssureStatement__ResourceRefAssignment_2 ) ) ;
    public final void rule__AssureStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1103:1: ( ( ( rule__AssureStatement__ResourceRefAssignment_2 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1104:1: ( ( rule__AssureStatement__ResourceRefAssignment_2 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1104:1: ( ( rule__AssureStatement__ResourceRefAssignment_2 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1105:1: ( rule__AssureStatement__ResourceRefAssignment_2 )
            {
             before(grammarAccess.getAssureStatementAccess().getResourceRefAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1106:1: ( rule__AssureStatement__ResourceRefAssignment_2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1106:2: rule__AssureStatement__ResourceRefAssignment_2
            {
            pushFollow(FOLLOW_rule__AssureStatement__ResourceRefAssignment_2_in_rule__AssureStatement__Group__2__Impl2175);
            rule__AssureStatement__ResourceRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssureStatementAccess().getResourceRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__2__Impl"


    // $ANTLR start "rule__AssureStatement__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1116:1: rule__AssureStatement__Group__3 : rule__AssureStatement__Group__3__Impl rule__AssureStatement__Group__4 ;
    public final void rule__AssureStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1120:1: ( rule__AssureStatement__Group__3__Impl rule__AssureStatement__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1121:2: rule__AssureStatement__Group__3__Impl rule__AssureStatement__Group__4
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__3__Impl_in_rule__AssureStatement__Group__32205);
            rule__AssureStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssureStatement__Group__4_in_rule__AssureStatement__Group__32208);
            rule__AssureStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__3"


    // $ANTLR start "rule__AssureStatement__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1128:1: rule__AssureStatement__Group__3__Impl : ( 'in' ) ;
    public final void rule__AssureStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1132:1: ( ( 'in' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1133:1: ( 'in' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1133:1: ( 'in' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1134:1: 'in'
            {
             before(grammarAccess.getAssureStatementAccess().getInKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__AssureStatement__Group__3__Impl2236); 
             after(grammarAccess.getAssureStatementAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__3__Impl"


    // $ANTLR start "rule__AssureStatement__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1147:1: rule__AssureStatement__Group__4 : rule__AssureStatement__Group__4__Impl ;
    public final void rule__AssureStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1151:1: ( rule__AssureStatement__Group__4__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1152:2: rule__AssureStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssureStatement__Group__4__Impl_in_rule__AssureStatement__Group__42267);
            rule__AssureStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__4"


    // $ANTLR start "rule__AssureStatement__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1158:1: rule__AssureStatement__Group__4__Impl : ( ( rule__AssureStatement__PlaceRefAssignment_4 ) ) ;
    public final void rule__AssureStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1162:1: ( ( ( rule__AssureStatement__PlaceRefAssignment_4 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1163:1: ( ( rule__AssureStatement__PlaceRefAssignment_4 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1163:1: ( ( rule__AssureStatement__PlaceRefAssignment_4 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1164:1: ( rule__AssureStatement__PlaceRefAssignment_4 )
            {
             before(grammarAccess.getAssureStatementAccess().getPlaceRefAssignment_4()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1165:1: ( rule__AssureStatement__PlaceRefAssignment_4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1165:2: rule__AssureStatement__PlaceRefAssignment_4
            {
            pushFollow(FOLLOW_rule__AssureStatement__PlaceRefAssignment_4_in_rule__AssureStatement__Group__4__Impl2294);
            rule__AssureStatement__PlaceRefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssureStatementAccess().getPlaceRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__Group__4__Impl"


    // $ANTLR start "rule__TakeStatement__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1185:1: rule__TakeStatement__Group__0 : rule__TakeStatement__Group__0__Impl rule__TakeStatement__Group__1 ;
    public final void rule__TakeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1189:1: ( rule__TakeStatement__Group__0__Impl rule__TakeStatement__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1190:2: rule__TakeStatement__Group__0__Impl rule__TakeStatement__Group__1
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__0__Impl_in_rule__TakeStatement__Group__02334);
            rule__TakeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TakeStatement__Group__1_in_rule__TakeStatement__Group__02337);
            rule__TakeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__0"


    // $ANTLR start "rule__TakeStatement__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1197:1: rule__TakeStatement__Group__0__Impl : ( 'take' ) ;
    public final void rule__TakeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1201:1: ( ( 'take' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1202:1: ( 'take' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1202:1: ( 'take' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1203:1: 'take'
            {
             before(grammarAccess.getTakeStatementAccess().getTakeKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TakeStatement__Group__0__Impl2365); 
             after(grammarAccess.getTakeStatementAccess().getTakeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__0__Impl"


    // $ANTLR start "rule__TakeStatement__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1216:1: rule__TakeStatement__Group__1 : rule__TakeStatement__Group__1__Impl rule__TakeStatement__Group__2 ;
    public final void rule__TakeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1220:1: ( rule__TakeStatement__Group__1__Impl rule__TakeStatement__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1221:2: rule__TakeStatement__Group__1__Impl rule__TakeStatement__Group__2
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__1__Impl_in_rule__TakeStatement__Group__12396);
            rule__TakeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TakeStatement__Group__2_in_rule__TakeStatement__Group__12399);
            rule__TakeStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__1"


    // $ANTLR start "rule__TakeStatement__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1228:1: rule__TakeStatement__Group__1__Impl : ( ( rule__TakeStatement__CountAssignment_1 ) ) ;
    public final void rule__TakeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1232:1: ( ( ( rule__TakeStatement__CountAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1233:1: ( ( rule__TakeStatement__CountAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1233:1: ( ( rule__TakeStatement__CountAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1234:1: ( rule__TakeStatement__CountAssignment_1 )
            {
             before(grammarAccess.getTakeStatementAccess().getCountAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1235:1: ( rule__TakeStatement__CountAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1235:2: rule__TakeStatement__CountAssignment_1
            {
            pushFollow(FOLLOW_rule__TakeStatement__CountAssignment_1_in_rule__TakeStatement__Group__1__Impl2426);
            rule__TakeStatement__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTakeStatementAccess().getCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__1__Impl"


    // $ANTLR start "rule__TakeStatement__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1245:1: rule__TakeStatement__Group__2 : rule__TakeStatement__Group__2__Impl rule__TakeStatement__Group__3 ;
    public final void rule__TakeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1249:1: ( rule__TakeStatement__Group__2__Impl rule__TakeStatement__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1250:2: rule__TakeStatement__Group__2__Impl rule__TakeStatement__Group__3
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__2__Impl_in_rule__TakeStatement__Group__22456);
            rule__TakeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TakeStatement__Group__3_in_rule__TakeStatement__Group__22459);
            rule__TakeStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__2"


    // $ANTLR start "rule__TakeStatement__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1257:1: rule__TakeStatement__Group__2__Impl : ( ( rule__TakeStatement__ResourceRefAssignment_2 ) ) ;
    public final void rule__TakeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1261:1: ( ( ( rule__TakeStatement__ResourceRefAssignment_2 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1262:1: ( ( rule__TakeStatement__ResourceRefAssignment_2 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1262:1: ( ( rule__TakeStatement__ResourceRefAssignment_2 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1263:1: ( rule__TakeStatement__ResourceRefAssignment_2 )
            {
             before(grammarAccess.getTakeStatementAccess().getResourceRefAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1264:1: ( rule__TakeStatement__ResourceRefAssignment_2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1264:2: rule__TakeStatement__ResourceRefAssignment_2
            {
            pushFollow(FOLLOW_rule__TakeStatement__ResourceRefAssignment_2_in_rule__TakeStatement__Group__2__Impl2486);
            rule__TakeStatement__ResourceRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTakeStatementAccess().getResourceRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__2__Impl"


    // $ANTLR start "rule__TakeStatement__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1274:1: rule__TakeStatement__Group__3 : rule__TakeStatement__Group__3__Impl rule__TakeStatement__Group__4 ;
    public final void rule__TakeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1278:1: ( rule__TakeStatement__Group__3__Impl rule__TakeStatement__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1279:2: rule__TakeStatement__Group__3__Impl rule__TakeStatement__Group__4
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__3__Impl_in_rule__TakeStatement__Group__32516);
            rule__TakeStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TakeStatement__Group__4_in_rule__TakeStatement__Group__32519);
            rule__TakeStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__3"


    // $ANTLR start "rule__TakeStatement__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1286:1: rule__TakeStatement__Group__3__Impl : ( 'from' ) ;
    public final void rule__TakeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1290:1: ( ( 'from' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1291:1: ( 'from' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1291:1: ( 'from' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1292:1: 'from'
            {
             before(grammarAccess.getTakeStatementAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__TakeStatement__Group__3__Impl2547); 
             after(grammarAccess.getTakeStatementAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__3__Impl"


    // $ANTLR start "rule__TakeStatement__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1305:1: rule__TakeStatement__Group__4 : rule__TakeStatement__Group__4__Impl ;
    public final void rule__TakeStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1309:1: ( rule__TakeStatement__Group__4__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1310:2: rule__TakeStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TakeStatement__Group__4__Impl_in_rule__TakeStatement__Group__42578);
            rule__TakeStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__4"


    // $ANTLR start "rule__TakeStatement__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1316:1: rule__TakeStatement__Group__4__Impl : ( ( rule__TakeStatement__PlaceRefAssignment_4 ) ) ;
    public final void rule__TakeStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1320:1: ( ( ( rule__TakeStatement__PlaceRefAssignment_4 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1321:1: ( ( rule__TakeStatement__PlaceRefAssignment_4 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1321:1: ( ( rule__TakeStatement__PlaceRefAssignment_4 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1322:1: ( rule__TakeStatement__PlaceRefAssignment_4 )
            {
             before(grammarAccess.getTakeStatementAccess().getPlaceRefAssignment_4()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1323:1: ( rule__TakeStatement__PlaceRefAssignment_4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1323:2: rule__TakeStatement__PlaceRefAssignment_4
            {
            pushFollow(FOLLOW_rule__TakeStatement__PlaceRefAssignment_4_in_rule__TakeStatement__Group__4__Impl2605);
            rule__TakeStatement__PlaceRefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTakeStatementAccess().getPlaceRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__Group__4__Impl"


    // $ANTLR start "rule__PutStatement__Group__0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1343:1: rule__PutStatement__Group__0 : rule__PutStatement__Group__0__Impl rule__PutStatement__Group__1 ;
    public final void rule__PutStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1347:1: ( rule__PutStatement__Group__0__Impl rule__PutStatement__Group__1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1348:2: rule__PutStatement__Group__0__Impl rule__PutStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__0__Impl_in_rule__PutStatement__Group__02645);
            rule__PutStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PutStatement__Group__1_in_rule__PutStatement__Group__02648);
            rule__PutStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__0"


    // $ANTLR start "rule__PutStatement__Group__0__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1355:1: rule__PutStatement__Group__0__Impl : ( 'put' ) ;
    public final void rule__PutStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1359:1: ( ( 'put' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1360:1: ( 'put' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1360:1: ( 'put' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1361:1: 'put'
            {
             before(grammarAccess.getPutStatementAccess().getPutKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__PutStatement__Group__0__Impl2676); 
             after(grammarAccess.getPutStatementAccess().getPutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__0__Impl"


    // $ANTLR start "rule__PutStatement__Group__1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1374:1: rule__PutStatement__Group__1 : rule__PutStatement__Group__1__Impl rule__PutStatement__Group__2 ;
    public final void rule__PutStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1378:1: ( rule__PutStatement__Group__1__Impl rule__PutStatement__Group__2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1379:2: rule__PutStatement__Group__1__Impl rule__PutStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__1__Impl_in_rule__PutStatement__Group__12707);
            rule__PutStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PutStatement__Group__2_in_rule__PutStatement__Group__12710);
            rule__PutStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__1"


    // $ANTLR start "rule__PutStatement__Group__1__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1386:1: rule__PutStatement__Group__1__Impl : ( ( rule__PutStatement__CountAssignment_1 ) ) ;
    public final void rule__PutStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1390:1: ( ( ( rule__PutStatement__CountAssignment_1 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1391:1: ( ( rule__PutStatement__CountAssignment_1 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1391:1: ( ( rule__PutStatement__CountAssignment_1 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1392:1: ( rule__PutStatement__CountAssignment_1 )
            {
             before(grammarAccess.getPutStatementAccess().getCountAssignment_1()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1393:1: ( rule__PutStatement__CountAssignment_1 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1393:2: rule__PutStatement__CountAssignment_1
            {
            pushFollow(FOLLOW_rule__PutStatement__CountAssignment_1_in_rule__PutStatement__Group__1__Impl2737);
            rule__PutStatement__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPutStatementAccess().getCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__1__Impl"


    // $ANTLR start "rule__PutStatement__Group__2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1403:1: rule__PutStatement__Group__2 : rule__PutStatement__Group__2__Impl rule__PutStatement__Group__3 ;
    public final void rule__PutStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1407:1: ( rule__PutStatement__Group__2__Impl rule__PutStatement__Group__3 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1408:2: rule__PutStatement__Group__2__Impl rule__PutStatement__Group__3
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__2__Impl_in_rule__PutStatement__Group__22767);
            rule__PutStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PutStatement__Group__3_in_rule__PutStatement__Group__22770);
            rule__PutStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__2"


    // $ANTLR start "rule__PutStatement__Group__2__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1415:1: rule__PutStatement__Group__2__Impl : ( ( rule__PutStatement__ResourceRefAssignment_2 ) ) ;
    public final void rule__PutStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1419:1: ( ( ( rule__PutStatement__ResourceRefAssignment_2 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1420:1: ( ( rule__PutStatement__ResourceRefAssignment_2 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1420:1: ( ( rule__PutStatement__ResourceRefAssignment_2 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1421:1: ( rule__PutStatement__ResourceRefAssignment_2 )
            {
             before(grammarAccess.getPutStatementAccess().getResourceRefAssignment_2()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1422:1: ( rule__PutStatement__ResourceRefAssignment_2 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1422:2: rule__PutStatement__ResourceRefAssignment_2
            {
            pushFollow(FOLLOW_rule__PutStatement__ResourceRefAssignment_2_in_rule__PutStatement__Group__2__Impl2797);
            rule__PutStatement__ResourceRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPutStatementAccess().getResourceRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__2__Impl"


    // $ANTLR start "rule__PutStatement__Group__3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1432:1: rule__PutStatement__Group__3 : rule__PutStatement__Group__3__Impl rule__PutStatement__Group__4 ;
    public final void rule__PutStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1436:1: ( rule__PutStatement__Group__3__Impl rule__PutStatement__Group__4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1437:2: rule__PutStatement__Group__3__Impl rule__PutStatement__Group__4
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__3__Impl_in_rule__PutStatement__Group__32827);
            rule__PutStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PutStatement__Group__4_in_rule__PutStatement__Group__32830);
            rule__PutStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__3"


    // $ANTLR start "rule__PutStatement__Group__3__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1444:1: rule__PutStatement__Group__3__Impl : ( 'into' ) ;
    public final void rule__PutStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1448:1: ( ( 'into' ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1449:1: ( 'into' )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1449:1: ( 'into' )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1450:1: 'into'
            {
             before(grammarAccess.getPutStatementAccess().getIntoKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__PutStatement__Group__3__Impl2858); 
             after(grammarAccess.getPutStatementAccess().getIntoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__3__Impl"


    // $ANTLR start "rule__PutStatement__Group__4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1463:1: rule__PutStatement__Group__4 : rule__PutStatement__Group__4__Impl ;
    public final void rule__PutStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1467:1: ( rule__PutStatement__Group__4__Impl )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1468:2: rule__PutStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PutStatement__Group__4__Impl_in_rule__PutStatement__Group__42889);
            rule__PutStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__4"


    // $ANTLR start "rule__PutStatement__Group__4__Impl"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1474:1: rule__PutStatement__Group__4__Impl : ( ( rule__PutStatement__PlaceRefAssignment_4 ) ) ;
    public final void rule__PutStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1478:1: ( ( ( rule__PutStatement__PlaceRefAssignment_4 ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1479:1: ( ( rule__PutStatement__PlaceRefAssignment_4 ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1479:1: ( ( rule__PutStatement__PlaceRefAssignment_4 ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1480:1: ( rule__PutStatement__PlaceRefAssignment_4 )
            {
             before(grammarAccess.getPutStatementAccess().getPlaceRefAssignment_4()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1481:1: ( rule__PutStatement__PlaceRefAssignment_4 )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1481:2: rule__PutStatement__PlaceRefAssignment_4
            {
            pushFollow(FOLLOW_rule__PutStatement__PlaceRefAssignment_4_in_rule__PutStatement__Group__4__Impl2916);
            rule__PutStatement__PlaceRefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPutStatementAccess().getPlaceRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__Group__4__Impl"


    // $ANTLR start "rule__PetriNet__ResourcesAssignment_0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1502:1: rule__PetriNet__ResourcesAssignment_0 : ( ruleResource ) ;
    public final void rule__PetriNet__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1506:1: ( ( ruleResource ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1507:1: ( ruleResource )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1507:1: ( ruleResource )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1508:1: ruleResource
            {
             before(grammarAccess.getPetriNetAccess().getResourcesResourceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__PetriNet__ResourcesAssignment_02961);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getResourcesResourceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__ResourcesAssignment_0"


    // $ANTLR start "rule__PetriNet__PlacesAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1517:1: rule__PetriNet__PlacesAssignment_1 : ( rulePlace ) ;
    public final void rule__PetriNet__PlacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1521:1: ( ( rulePlace ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1522:1: ( rulePlace )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1522:1: ( rulePlace )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1523:1: rulePlace
            {
             before(grammarAccess.getPetriNetAccess().getPlacesPlaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlace_in_rule__PetriNet__PlacesAssignment_12992);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getPlacesPlaceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__PlacesAssignment_1"


    // $ANTLR start "rule__PetriNet__TransactionsAssignment_2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1532:1: rule__PetriNet__TransactionsAssignment_2 : ( ruleTransaction ) ;
    public final void rule__PetriNet__TransactionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1536:1: ( ( ruleTransaction ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1537:1: ( ruleTransaction )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1537:1: ( ruleTransaction )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1538:1: ruleTransaction
            {
             before(grammarAccess.getPetriNetAccess().getTransactionsTransactionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__PetriNet__TransactionsAssignment_23023);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getTransactionsTransactionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__TransactionsAssignment_2"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1547:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1551:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1552:1: ( RULE_ID )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1552:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1553:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_13054); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1562:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1566:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1567:1: ( RULE_ID )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1567:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1568:1: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Place__NameAssignment_13085); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__StoragesAssignment_3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1577:1: rule__Place__StoragesAssignment_3 : ( ruleStorage ) ;
    public final void rule__Place__StoragesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1581:1: ( ( ruleStorage ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1582:1: ( ruleStorage )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1582:1: ( ruleStorage )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1583:1: ruleStorage
            {
             before(grammarAccess.getPlaceAccess().getStoragesStorageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStorage_in_rule__Place__StoragesAssignment_33116);
            ruleStorage();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getStoragesStorageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__StoragesAssignment_3"


    // $ANTLR start "rule__Storage__ResourceRefAssignment_0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1592:1: rule__Storage__ResourceRefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Storage__ResourceRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1596:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1597:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1597:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1598:1: ( RULE_ID )
            {
             before(grammarAccess.getStorageAccess().getResourceRefResourceCrossReference_0_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1599:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1600:1: RULE_ID
            {
             before(grammarAccess.getStorageAccess().getResourceRefResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Storage__ResourceRefAssignment_03151); 
             after(grammarAccess.getStorageAccess().getResourceRefResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStorageAccess().getResourceRefResourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__ResourceRefAssignment_0"


    // $ANTLR start "rule__Storage__CountAssignment_2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1611:1: rule__Storage__CountAssignment_2 : ( RULE_INT ) ;
    public final void rule__Storage__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1615:1: ( ( RULE_INT ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1616:1: ( RULE_INT )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1616:1: ( RULE_INT )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1617:1: RULE_INT
            {
             before(grammarAccess.getStorageAccess().getCountINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Storage__CountAssignment_23186); 
             after(grammarAccess.getStorageAccess().getCountINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__CountAssignment_2"


    // $ANTLR start "rule__Storage__CapacityAssignment_4_0"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1626:1: rule__Storage__CapacityAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__Storage__CapacityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1630:1: ( ( RULE_INT ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1631:1: ( RULE_INT )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1631:1: ( RULE_INT )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1632:1: RULE_INT
            {
             before(grammarAccess.getStorageAccess().getCapacityINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Storage__CapacityAssignment_4_03217); 
             after(grammarAccess.getStorageAccess().getCapacityINTTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storage__CapacityAssignment_4_0"


    // $ANTLR start "rule__Transaction__NameAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1641:1: rule__Transaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1645:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1646:1: ( RULE_ID )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1646:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1647:1: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_13248); 
             after(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__NameAssignment_1"


    // $ANTLR start "rule__Transaction__AssureStatementsAssignment_3"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1656:1: rule__Transaction__AssureStatementsAssignment_3 : ( ruleAssureStatement ) ;
    public final void rule__Transaction__AssureStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1660:1: ( ( ruleAssureStatement ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1661:1: ( ruleAssureStatement )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1661:1: ( ruleAssureStatement )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1662:1: ruleAssureStatement
            {
             before(grammarAccess.getTransactionAccess().getAssureStatementsAssureStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAssureStatement_in_rule__Transaction__AssureStatementsAssignment_33279);
            ruleAssureStatement();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getAssureStatementsAssureStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__AssureStatementsAssignment_3"


    // $ANTLR start "rule__Transaction__TakeStatementsAssignment_4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1671:1: rule__Transaction__TakeStatementsAssignment_4 : ( ruleTakeStatement ) ;
    public final void rule__Transaction__TakeStatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1675:1: ( ( ruleTakeStatement ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1676:1: ( ruleTakeStatement )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1676:1: ( ruleTakeStatement )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1677:1: ruleTakeStatement
            {
             before(grammarAccess.getTransactionAccess().getTakeStatementsTakeStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTakeStatement_in_rule__Transaction__TakeStatementsAssignment_43310);
            ruleTakeStatement();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getTakeStatementsTakeStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__TakeStatementsAssignment_4"


    // $ANTLR start "rule__Transaction__PutStatementsAssignment_5"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1686:1: rule__Transaction__PutStatementsAssignment_5 : ( rulePutStatement ) ;
    public final void rule__Transaction__PutStatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1690:1: ( ( rulePutStatement ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1691:1: ( rulePutStatement )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1691:1: ( rulePutStatement )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1692:1: rulePutStatement
            {
             before(grammarAccess.getTransactionAccess().getPutStatementsPutStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePutStatement_in_rule__Transaction__PutStatementsAssignment_53341);
            rulePutStatement();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getPutStatementsPutStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__PutStatementsAssignment_5"


    // $ANTLR start "rule__AssureStatement__CountAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1701:1: rule__AssureStatement__CountAssignment_1 : ( RULE_INT ) ;
    public final void rule__AssureStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1705:1: ( ( RULE_INT ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1706:1: ( RULE_INT )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1706:1: ( RULE_INT )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1707:1: RULE_INT
            {
             before(grammarAccess.getAssureStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AssureStatement__CountAssignment_13372); 
             after(grammarAccess.getAssureStatementAccess().getCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__CountAssignment_1"


    // $ANTLR start "rule__AssureStatement__ResourceRefAssignment_2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1716:1: rule__AssureStatement__ResourceRefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AssureStatement__ResourceRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1720:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1721:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1721:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1722:1: ( RULE_ID )
            {
             before(grammarAccess.getAssureStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1723:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1724:1: RULE_ID
            {
             before(grammarAccess.getAssureStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssureStatement__ResourceRefAssignment_23407); 
             after(grammarAccess.getAssureStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssureStatementAccess().getResourceRefResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__ResourceRefAssignment_2"


    // $ANTLR start "rule__AssureStatement__PlaceRefAssignment_4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1735:1: rule__AssureStatement__PlaceRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AssureStatement__PlaceRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1739:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1740:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1740:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1741:1: ( RULE_ID )
            {
             before(grammarAccess.getAssureStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1742:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1743:1: RULE_ID
            {
             before(grammarAccess.getAssureStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssureStatement__PlaceRefAssignment_43446); 
             after(grammarAccess.getAssureStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssureStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssureStatement__PlaceRefAssignment_4"


    // $ANTLR start "rule__TakeStatement__CountAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1754:1: rule__TakeStatement__CountAssignment_1 : ( RULE_INT ) ;
    public final void rule__TakeStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1758:1: ( ( RULE_INT ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1759:1: ( RULE_INT )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1759:1: ( RULE_INT )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1760:1: RULE_INT
            {
             before(grammarAccess.getTakeStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TakeStatement__CountAssignment_13481); 
             after(grammarAccess.getTakeStatementAccess().getCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__CountAssignment_1"


    // $ANTLR start "rule__TakeStatement__ResourceRefAssignment_2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1769:1: rule__TakeStatement__ResourceRefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TakeStatement__ResourceRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1773:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1774:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1774:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1775:1: ( RULE_ID )
            {
             before(grammarAccess.getTakeStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1776:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1777:1: RULE_ID
            {
             before(grammarAccess.getTakeStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TakeStatement__ResourceRefAssignment_23516); 
             after(grammarAccess.getTakeStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTakeStatementAccess().getResourceRefResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__ResourceRefAssignment_2"


    // $ANTLR start "rule__TakeStatement__PlaceRefAssignment_4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1788:1: rule__TakeStatement__PlaceRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TakeStatement__PlaceRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1792:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1793:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1793:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1794:1: ( RULE_ID )
            {
             before(grammarAccess.getTakeStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1795:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1796:1: RULE_ID
            {
             before(grammarAccess.getTakeStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TakeStatement__PlaceRefAssignment_43555); 
             after(grammarAccess.getTakeStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTakeStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TakeStatement__PlaceRefAssignment_4"


    // $ANTLR start "rule__PutStatement__CountAssignment_1"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1807:1: rule__PutStatement__CountAssignment_1 : ( RULE_INT ) ;
    public final void rule__PutStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1811:1: ( ( RULE_INT ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1812:1: ( RULE_INT )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1812:1: ( RULE_INT )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1813:1: RULE_INT
            {
             before(grammarAccess.getPutStatementAccess().getCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PutStatement__CountAssignment_13590); 
             after(grammarAccess.getPutStatementAccess().getCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__CountAssignment_1"


    // $ANTLR start "rule__PutStatement__ResourceRefAssignment_2"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1822:1: rule__PutStatement__ResourceRefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PutStatement__ResourceRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1826:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1827:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1827:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1828:1: ( RULE_ID )
            {
             before(grammarAccess.getPutStatementAccess().getResourceRefResourceCrossReference_2_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1829:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1830:1: RULE_ID
            {
             before(grammarAccess.getPutStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PutStatement__ResourceRefAssignment_23625); 
             after(grammarAccess.getPutStatementAccess().getResourceRefResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPutStatementAccess().getResourceRefResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__ResourceRefAssignment_2"


    // $ANTLR start "rule__PutStatement__PlaceRefAssignment_4"
    // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1841:1: rule__PutStatement__PlaceRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PutStatement__PlaceRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1845:1: ( ( ( RULE_ID ) ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1846:1: ( ( RULE_ID ) )
            {
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1846:1: ( ( RULE_ID ) )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1847:1: ( RULE_ID )
            {
             before(grammarAccess.getPutStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1848:1: ( RULE_ID )
            // ../de.bomzhi.petrinet.ui/src-gen/de/bomzhi/petrinet/ui/contentassist/antlr/internal/InternalPetrinetDsl.g:1849:1: RULE_ID
            {
             before(grammarAccess.getPutStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PutStatement__PlaceRefAssignment_43664); 
             after(grammarAccess.getPutStatementAccess().getPlaceRefPlaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPutStatementAccess().getPlaceRefPlaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutStatement__PlaceRefAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0_in_rulePlace214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorage_in_entryRuleStorage241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStorage248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__0_in_ruleStorage274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0_in_ruleTransaction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssureStatement_in_entryRuleAssureStatement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssureStatement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__0_in_ruleAssureStatement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTakeStatement_in_entryRuleTakeStatement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTakeStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__0_in_ruleTakeStatement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutStatement_in_entryRulePutStatement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutStatement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__0_in_rulePutStatement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__CapacityAssignment_4_0_in_rule__Storage__Alternatives_4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Storage__Alternatives_4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0601 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__ResourcesAssignment_0_in_rule__PetriNet__Group__0__Impl633 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PetriNet__ResourcesAssignment_0_in_rule__PetriNet__Group__0__Impl645 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__PlacesAssignment_1_in_rule__PetriNet__Group__1__Impl710 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__PetriNet__PlacesAssignment_1_in_rule__PetriNet__Group__1__Impl722 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__TransactionsAssignment_2_in_rule__PetriNet__Group__2__Impl784 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__PetriNet__TransactionsAssignment_2_in_rule__PetriNet__Group__2__Impl796 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__0835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__0838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Resource__Group__0__Impl866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Place__Group__0__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__11020 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Place__Group__2_in_rule__Place__Group__11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__21080 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Place__Group__3_in_rule__Place__Group__21083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Place__Group__2__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__31142 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Place__Group__4_in_rule__Place__Group__31145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__StoragesAssignment_3_in_rule__Place__Group__3__Impl1172 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__41203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Place__Group__4__Impl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__0__Impl_in_rule__Storage__Group__01272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Storage__Group__1_in_rule__Storage__Group__01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__ResourceRefAssignment_0_in_rule__Storage__Group__0__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__1__Impl_in_rule__Storage__Group__11332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Storage__Group__2_in_rule__Storage__Group__11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Storage__Group__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__2__Impl_in_rule__Storage__Group__21394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Storage__Group__3_in_rule__Storage__Group__21397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__CountAssignment_2_in_rule__Storage__Group__2__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__3__Impl_in_rule__Storage__Group__31454 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Storage__Group__4_in_rule__Storage__Group__31457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Storage__Group__3__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Group__4__Impl_in_rule__Storage__Group__41516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Storage__Alternatives_4_in_rule__Storage__Group__4__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__01583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__01586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transaction__Group__0__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__11645 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__11648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__21705 = new BitSet(new long[]{0x0000000000A88000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__21708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transaction__Group__2__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__31767 = new BitSet(new long[]{0x0000000000A88000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__31770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AssureStatementsAssignment_3_in_rule__Transaction__Group__3__Impl1797 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__41828 = new BitSet(new long[]{0x0000000000A88000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__41831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__TakeStatementsAssignment_4_in_rule__Transaction__Group__4__Impl1858 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__51889 = new BitSet(new long[]{0x0000000000A88000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__51892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__PutStatementsAssignment_5_in_rule__Transaction__Group__5__Impl1919 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__61950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transaction__Group__6__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__0__Impl_in_rule__AssureStatement__Group__02023 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__1_in_rule__AssureStatement__Group__02026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AssureStatement__Group__0__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__1__Impl_in_rule__AssureStatement__Group__12085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__2_in_rule__AssureStatement__Group__12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__CountAssignment_1_in_rule__AssureStatement__Group__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__2__Impl_in_rule__AssureStatement__Group__22145 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__3_in_rule__AssureStatement__Group__22148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__ResourceRefAssignment_2_in_rule__AssureStatement__Group__2__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__3__Impl_in_rule__AssureStatement__Group__32205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__4_in_rule__AssureStatement__Group__32208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AssureStatement__Group__3__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__Group__4__Impl_in_rule__AssureStatement__Group__42267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssureStatement__PlaceRefAssignment_4_in_rule__AssureStatement__Group__4__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__0__Impl_in_rule__TakeStatement__Group__02334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__1_in_rule__TakeStatement__Group__02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TakeStatement__Group__0__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__1__Impl_in_rule__TakeStatement__Group__12396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__2_in_rule__TakeStatement__Group__12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__CountAssignment_1_in_rule__TakeStatement__Group__1__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__2__Impl_in_rule__TakeStatement__Group__22456 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__3_in_rule__TakeStatement__Group__22459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__ResourceRefAssignment_2_in_rule__TakeStatement__Group__2__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__3__Impl_in_rule__TakeStatement__Group__32516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__4_in_rule__TakeStatement__Group__32519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TakeStatement__Group__3__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__Group__4__Impl_in_rule__TakeStatement__Group__42578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TakeStatement__PlaceRefAssignment_4_in_rule__TakeStatement__Group__4__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__0__Impl_in_rule__PutStatement__Group__02645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__1_in_rule__PutStatement__Group__02648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PutStatement__Group__0__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__1__Impl_in_rule__PutStatement__Group__12707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__2_in_rule__PutStatement__Group__12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__CountAssignment_1_in_rule__PutStatement__Group__1__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__2__Impl_in_rule__PutStatement__Group__22767 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__3_in_rule__PutStatement__Group__22770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__ResourceRefAssignment_2_in_rule__PutStatement__Group__2__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__3__Impl_in_rule__PutStatement__Group__32827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__4_in_rule__PutStatement__Group__32830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PutStatement__Group__3__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__Group__4__Impl_in_rule__PutStatement__Group__42889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PutStatement__PlaceRefAssignment_4_in_rule__PutStatement__Group__4__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__PetriNet__ResourcesAssignment_02961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_rule__PetriNet__PlacesAssignment_12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__PetriNet__TransactionsAssignment_23023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Place__NameAssignment_13085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorage_in_rule__Place__StoragesAssignment_33116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Storage__ResourceRefAssignment_03151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Storage__CountAssignment_23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Storage__CapacityAssignment_4_03217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssureStatement_in_rule__Transaction__AssureStatementsAssignment_33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTakeStatement_in_rule__Transaction__TakeStatementsAssignment_43310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutStatement_in_rule__Transaction__PutStatementsAssignment_53341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AssureStatement__CountAssignment_13372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssureStatement__ResourceRefAssignment_23407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssureStatement__PlaceRefAssignment_43446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TakeStatement__CountAssignment_13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TakeStatement__ResourceRefAssignment_23516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TakeStatement__PlaceRefAssignment_43555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PutStatement__CountAssignment_13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PutStatement__ResourceRefAssignment_23625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PutStatement__PlaceRefAssignment_43664 = new BitSet(new long[]{0x0000000000000002L});

}