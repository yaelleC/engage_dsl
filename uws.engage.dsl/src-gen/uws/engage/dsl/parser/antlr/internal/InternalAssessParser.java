package uws.engage.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uws.engage.dsl.services.AssessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssessParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End'", "':'", "'Int'", "'Float'", "'String'", "'Bool'", "'Char'", "'Text'", "'Enum'", "'('", "','", "')'", "'Serious-game'", "'Game'", "'SGname'", "'SGdeveloper'", "'SGdesc'", "'SGageRange'", "'SGlanguage'", "'SGcountry'", "'SGgenre'", "'SGsubject'", "'SGpublic'", "'-'", "'Player'", "'Learning-outcomes'", "'Scores'", "'knowledge'", "'skill'", "'competence'", "'Feedback-messages'", "'Feedback'", "'win'", "'lose'", "'end'", "'positive'", "'negative'", "'neutral'", "'badge'", "'hint'", "'adaptation'", "'Evidence-model'", "'Action-sequence'", "'before'", "'after'", "'else'", "'Timer-actions'", "'within'", "'sec'", "'->'", "'immediate'", "'delayed'", "'in {'", "'}'", "'LogOnly'", "'others'", "'='", "'+'", "'.'", "'true'", "'false'", "'When'", "'any'", "'all'", "'Feedback-model'", "'<'", "'>'", "'inactivity'", "'Badge-model'", "'numberGameplays'", "'numberWin'", "'totalTime'", "'averageTime'", "'sumScore'", "'averageScore'", "'maxScore'", "'minScore'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalAssessParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssessParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssessParser.tokenNames; }
    public String getGrammarFileName() { return "../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g"; }



     	private AssessGrammarAccess grammarAccess;
     	
        public InternalAssessParser(TokenStream input, AssessGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AssessGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_game_0_0= ruleGameDescription ) ) ( (lv_player_1_0= rulePlayerDescription ) )? ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) ) ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )? ( (lv_evidenceModel_4_0= ruleEvidenceModel ) ) ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )? ( (lv_badgeModel_6_0= ruleBadgeModel ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_game_0_0 = null;

        EObject lv_player_1_0 = null;

        EObject lv_learningOutcomes_2_0 = null;

        EObject lv_feedbackMessages_3_0 = null;

        EObject lv_evidenceModel_4_0 = null;

        EObject lv_feedbackModel_5_0 = null;

        EObject lv_badgeModel_6_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:79:28: ( ( ( (lv_game_0_0= ruleGameDescription ) ) ( (lv_player_1_0= rulePlayerDescription ) )? ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) ) ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )? ( (lv_evidenceModel_4_0= ruleEvidenceModel ) ) ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )? ( (lv_badgeModel_6_0= ruleBadgeModel ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:80:1: ( ( (lv_game_0_0= ruleGameDescription ) ) ( (lv_player_1_0= rulePlayerDescription ) )? ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) ) ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )? ( (lv_evidenceModel_4_0= ruleEvidenceModel ) ) ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )? ( (lv_badgeModel_6_0= ruleBadgeModel ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:80:1: ( ( (lv_game_0_0= ruleGameDescription ) ) ( (lv_player_1_0= rulePlayerDescription ) )? ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) ) ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )? ( (lv_evidenceModel_4_0= ruleEvidenceModel ) ) ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )? ( (lv_badgeModel_6_0= ruleBadgeModel ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:80:2: ( (lv_game_0_0= ruleGameDescription ) ) ( (lv_player_1_0= rulePlayerDescription ) )? ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) ) ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )? ( (lv_evidenceModel_4_0= ruleEvidenceModel ) ) ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )? ( (lv_badgeModel_6_0= ruleBadgeModel ) )?
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:80:2: ( (lv_game_0_0= ruleGameDescription ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:81:1: (lv_game_0_0= ruleGameDescription )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:81:1: (lv_game_0_0= ruleGameDescription )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:82:3: lv_game_0_0= ruleGameDescription
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGameGameDescriptionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGameDescription_in_ruleModel131);
            lv_game_0_0=ruleGameDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"game",
                    		lv_game_0_0, 
                    		"GameDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:98:2: ( (lv_player_1_0= rulePlayerDescription ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:99:1: (lv_player_1_0= rulePlayerDescription )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:99:1: (lv_player_1_0= rulePlayerDescription )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:100:3: lv_player_1_0= rulePlayerDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPlayerPlayerDescriptionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePlayerDescription_in_ruleModel152);
                    lv_player_1_0=rulePlayerDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"player",
                            		lv_player_1_0, 
                            		"PlayerDescription");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:116:3: ( (lv_learningOutcomes_2_0= ruleLearningOutcomes ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:117:1: (lv_learningOutcomes_2_0= ruleLearningOutcomes )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:117:1: (lv_learningOutcomes_2_0= ruleLearningOutcomes )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:118:3: lv_learningOutcomes_2_0= ruleLearningOutcomes
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getLearningOutcomesLearningOutcomesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLearningOutcomes_in_ruleModel174);
            lv_learningOutcomes_2_0=ruleLearningOutcomes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"learningOutcomes",
                    		lv_learningOutcomes_2_0, 
                    		"LearningOutcomes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:134:2: ( (lv_feedbackMessages_3_0= ruleFeedbackMessages ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=41 && LA2_0<=42)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:135:1: (lv_feedbackMessages_3_0= ruleFeedbackMessages )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:135:1: (lv_feedbackMessages_3_0= ruleFeedbackMessages )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:136:3: lv_feedbackMessages_3_0= ruleFeedbackMessages
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getFeedbackMessagesFeedbackMessagesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeedbackMessages_in_ruleModel195);
                    lv_feedbackMessages_3_0=ruleFeedbackMessages();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"feedbackMessages",
                            		lv_feedbackMessages_3_0, 
                            		"FeedbackMessages");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:152:3: ( (lv_evidenceModel_4_0= ruleEvidenceModel ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:153:1: (lv_evidenceModel_4_0= ruleEvidenceModel )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:153:1: (lv_evidenceModel_4_0= ruleEvidenceModel )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:154:3: lv_evidenceModel_4_0= ruleEvidenceModel
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getEvidenceModelEvidenceModelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEvidenceModel_in_ruleModel217);
            lv_evidenceModel_4_0=ruleEvidenceModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"evidenceModel",
                    		lv_evidenceModel_4_0, 
                    		"EvidenceModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:170:2: ( (lv_feedbackModel_5_0= ruleFeedbackModel ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==75) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:171:1: (lv_feedbackModel_5_0= ruleFeedbackModel )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:171:1: (lv_feedbackModel_5_0= ruleFeedbackModel )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:172:3: lv_feedbackModel_5_0= ruleFeedbackModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getFeedbackModelFeedbackModelParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeedbackModel_in_ruleModel238);
                    lv_feedbackModel_5_0=ruleFeedbackModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"feedbackModel",
                            		lv_feedbackModel_5_0, 
                            		"FeedbackModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:188:3: ( (lv_badgeModel_6_0= ruleBadgeModel ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==79) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:189:1: (lv_badgeModel_6_0= ruleBadgeModel )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:189:1: (lv_badgeModel_6_0= ruleBadgeModel )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:190:3: lv_badgeModel_6_0= ruleBadgeModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBadgeModelBadgeModelParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBadgeModel_in_ruleModel260);
                    lv_badgeModel_6_0=ruleBadgeModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"badgeModel",
                            		lv_badgeModel_6_0, 
                            		"BadgeModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEnd"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:214:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:215:2: (iv_ruleEnd= ruleEnd EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:216:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_ruleEnd_in_entryRuleEnd298);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnd309); 

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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:223:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'End' ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:226:28: (kw= 'End' )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:228:2: kw= 'End'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleEnd346); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndAccess().getEndKeyword()); 
                

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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleSeparator"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:243:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:244:2: (iv_ruleSeparator= ruleSeparator EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:245:2: iv_ruleSeparator= ruleSeparator EOF
            {
             newCompositeNode(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_ruleSeparator_in_entryRuleSeparator388);
            iv_ruleSeparator=ruleSeparator();

            state._fsp--;

             current =iv_ruleSeparator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeparator399); 

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
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:252:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:255:28: (kw= ':' )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:257:2: kw= ':'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleSeparator436); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSeparatorAccess().getColonKeyword()); 
                

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
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleType"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:270:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:271:2: (iv_ruleType= ruleType EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:272:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType475);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType485); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:279:1: ruleType returns [EObject current=null] : ( ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) ) | ( (lv_enumType_1_0= ruleEnum ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_simpleType_0_1=null;
        Token lv_simpleType_0_2=null;
        Token lv_simpleType_0_3=null;
        Token lv_simpleType_0_4=null;
        Token lv_simpleType_0_5=null;
        Token lv_simpleType_0_6=null;
        EObject lv_enumType_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:282:28: ( ( ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) ) | ( (lv_enumType_1_0= ruleEnum ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:283:1: ( ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) ) | ( (lv_enumType_1_0= ruleEnum ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:283:1: ( ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) ) | ( (lv_enumType_1_0= ruleEnum ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=18)) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:283:2: ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:283:2: ( ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:284:1: ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:284:1: ( (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:285:1: (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:285:1: (lv_simpleType_0_1= 'Int' | lv_simpleType_0_2= 'Float' | lv_simpleType_0_3= 'String' | lv_simpleType_0_4= 'Bool' | lv_simpleType_0_5= 'Char' | lv_simpleType_0_6= 'Text' )
                    int alt5=6;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt5=1;
                        }
                        break;
                    case 14:
                        {
                        alt5=2;
                        }
                        break;
                    case 15:
                        {
                        alt5=3;
                        }
                        break;
                    case 16:
                        {
                        alt5=4;
                        }
                        break;
                    case 17:
                        {
                        alt5=5;
                        }
                        break;
                    case 18:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:286:3: lv_simpleType_0_1= 'Int'
                            {
                            lv_simpleType_0_1=(Token)match(input,13,FOLLOW_13_in_ruleType530); 

                                    newLeafNode(lv_simpleType_0_1, grammarAccess.getTypeAccess().getSimpleTypeIntKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:298:8: lv_simpleType_0_2= 'Float'
                            {
                            lv_simpleType_0_2=(Token)match(input,14,FOLLOW_14_in_ruleType559); 

                                    newLeafNode(lv_simpleType_0_2, grammarAccess.getTypeAccess().getSimpleTypeFloatKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:310:8: lv_simpleType_0_3= 'String'
                            {
                            lv_simpleType_0_3=(Token)match(input,15,FOLLOW_15_in_ruleType588); 

                                    newLeafNode(lv_simpleType_0_3, grammarAccess.getTypeAccess().getSimpleTypeStringKeyword_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:322:8: lv_simpleType_0_4= 'Bool'
                            {
                            lv_simpleType_0_4=(Token)match(input,16,FOLLOW_16_in_ruleType617); 

                                    newLeafNode(lv_simpleType_0_4, grammarAccess.getTypeAccess().getSimpleTypeBoolKeyword_0_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:334:8: lv_simpleType_0_5= 'Char'
                            {
                            lv_simpleType_0_5=(Token)match(input,17,FOLLOW_17_in_ruleType646); 

                                    newLeafNode(lv_simpleType_0_5, grammarAccess.getTypeAccess().getSimpleTypeCharKeyword_0_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_5, null);
                            	    

                            }
                            break;
                        case 6 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:346:8: lv_simpleType_0_6= 'Text'
                            {
                            lv_simpleType_0_6=(Token)match(input,18,FOLLOW_18_in_ruleType675); 

                                    newLeafNode(lv_simpleType_0_6, grammarAccess.getTypeAccess().getSimpleTypeTextKeyword_0_0_5());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "simpleType", lv_simpleType_0_6, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:362:6: ( (lv_enumType_1_0= ruleEnum ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:362:6: ( (lv_enumType_1_0= ruleEnum ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:363:1: (lv_enumType_1_0= ruleEnum )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:363:1: (lv_enumType_1_0= ruleEnum )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:364:3: lv_enumType_1_0= ruleEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeEnumParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnum_in_ruleType718);
                    lv_enumType_1_0=ruleEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"enumType",
                            		lv_enumType_1_0, 
                            		"Enum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnum"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:388:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:389:2: (iv_ruleEnum= ruleEnum EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:390:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum754);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum764); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:397:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' otherlv_1= '(' ( (lv_enumValues_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_enumValues_2_0=null;
        Token otherlv_3=null;
        Token lv_enumValues_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:400:28: ( (otherlv_0= 'Enum' otherlv_1= '(' ( (lv_enumValues_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:401:1: (otherlv_0= 'Enum' otherlv_1= '(' ( (lv_enumValues_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:401:1: (otherlv_0= 'Enum' otherlv_1= '(' ( (lv_enumValues_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:401:3: otherlv_0= 'Enum' otherlv_1= '(' ( (lv_enumValues_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnum801); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEnum813); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getLeftParenthesisKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:409:1: ( (lv_enumValues_2_0= RULE_STRING ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:410:1: (lv_enumValues_2_0= RULE_STRING )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:410:1: (lv_enumValues_2_0= RULE_STRING )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:411:3: lv_enumValues_2_0= RULE_STRING
            {
            lv_enumValues_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum830); 

            			newLeafNode(lv_enumValues_2_0, grammarAccess.getEnumAccess().getEnumValuesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"enumValues",
                    		lv_enumValues_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:427:2: (otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:427:4: otherlv_3= ',' ( (lv_enumValues_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleEnum848); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getCommaKeyword_3_0());
            	        
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:431:1: ( (lv_enumValues_4_0= RULE_STRING ) )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:432:1: (lv_enumValues_4_0= RULE_STRING )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:432:1: (lv_enumValues_4_0= RULE_STRING )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:433:3: lv_enumValues_4_0= RULE_STRING
            	    {
            	    lv_enumValues_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum865); 

            	    			newLeafNode(lv_enumValues_4_0, grammarAccess.getEnumAccess().getEnumValuesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"enumValues",
            	            		lv_enumValues_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleEnum884); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleGameDescription"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:461:1: entryRuleGameDescription returns [EObject current=null] : iv_ruleGameDescription= ruleGameDescription EOF ;
    public final EObject entryRuleGameDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameDescription = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:462:2: (iv_ruleGameDescription= ruleGameDescription EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:463:2: iv_ruleGameDescription= ruleGameDescription EOF
            {
             newCompositeNode(grammarAccess.getGameDescriptionRule()); 
            pushFollow(FOLLOW_ruleGameDescription_in_entryRuleGameDescription920);
            iv_ruleGameDescription=ruleGameDescription();

            state._fsp--;

             current =iv_ruleGameDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGameDescription930); 

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
    // $ANTLR end "entryRuleGameDescription"


    // $ANTLR start "ruleGameDescription"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:470:1: ruleGameDescription returns [EObject current=null] : ( (otherlv_0= 'Serious-game' | otherlv_1= 'Game' ) otherlv_2= 'SGname' ruleSeparator ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'SGdeveloper' ruleSeparator ( (lv_dev_7_0= RULE_INT ) ) (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )? (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )? (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )? (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )? (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )? (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )? (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )? ruleEnd ) ;
    public final EObject ruleGameDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_dev_7_0=null;
        Token otherlv_8=null;
        Token lv_desc_10_0=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token lv_lang_16_0=null;
        Token otherlv_17=null;
        Token lv_country_19_0=null;
        Token otherlv_20=null;
        Token lv_genre_22_0=null;
        Token otherlv_23=null;
        Token lv_subject_25_0=null;
        Token otherlv_26=null;
        EObject lv_ageRange_13_0 = null;

        AntlrDatatypeRuleToken lv_public_28_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:473:28: ( ( (otherlv_0= 'Serious-game' | otherlv_1= 'Game' ) otherlv_2= 'SGname' ruleSeparator ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'SGdeveloper' ruleSeparator ( (lv_dev_7_0= RULE_INT ) ) (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )? (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )? (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )? (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )? (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )? (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )? (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )? ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:474:1: ( (otherlv_0= 'Serious-game' | otherlv_1= 'Game' ) otherlv_2= 'SGname' ruleSeparator ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'SGdeveloper' ruleSeparator ( (lv_dev_7_0= RULE_INT ) ) (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )? (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )? (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )? (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )? (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )? (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )? (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )? ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:474:1: ( (otherlv_0= 'Serious-game' | otherlv_1= 'Game' ) otherlv_2= 'SGname' ruleSeparator ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'SGdeveloper' ruleSeparator ( (lv_dev_7_0= RULE_INT ) ) (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )? (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )? (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )? (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )? (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )? (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )? (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )? ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:474:2: (otherlv_0= 'Serious-game' | otherlv_1= 'Game' ) otherlv_2= 'SGname' ruleSeparator ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'SGdeveloper' ruleSeparator ( (lv_dev_7_0= RULE_INT ) ) (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )? (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )? (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )? (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )? (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )? (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )? (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )? ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:474:2: (otherlv_0= 'Serious-game' | otherlv_1= 'Game' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:474:4: otherlv_0= 'Serious-game'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleGameDescription968); 

                        	newLeafNode(otherlv_0, grammarAccess.getGameDescriptionAccess().getSeriousGameKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:479:7: otherlv_1= 'Game'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleGameDescription986); 

                        	newLeafNode(otherlv_1, grammarAccess.getGameDescriptionAccess().getGameKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleGameDescription999); 

                	newLeafNode(otherlv_2, grammarAccess.getGameDescriptionAccess().getSGnameKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1015);
            ruleSeparator();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:495:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:496:1: (lv_name_4_0= RULE_STRING )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:496:1: (lv_name_4_0= RULE_STRING )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:497:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGameDescription1031); 

            			newLeafNode(lv_name_4_0, grammarAccess.getGameDescriptionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGameDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleGameDescription1048); 

                	newLeafNode(otherlv_5, grammarAccess.getGameDescriptionAccess().getSGdeveloperKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1064);
            ruleSeparator();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:525:1: ( (lv_dev_7_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:526:1: (lv_dev_7_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:526:1: (lv_dev_7_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:527:3: lv_dev_7_0= RULE_INT
            {
            lv_dev_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGameDescription1080); 

            			newLeafNode(lv_dev_7_0, grammarAccess.getGameDescriptionAccess().getDevINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGameDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dev",
                    		lv_dev_7_0, 
                    		"INT");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:543:2: (otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:543:4: otherlv_8= 'SGdesc' ruleSeparator ( (lv_desc_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleGameDescription1098); 

                        	newLeafNode(otherlv_8, grammarAccess.getGameDescriptionAccess().getSGdescKeyword_7_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1114);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:555:1: ( (lv_desc_10_0= RULE_STRING ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:556:1: (lv_desc_10_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:556:1: (lv_desc_10_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:557:3: lv_desc_10_0= RULE_STRING
                    {
                    lv_desc_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGameDescription1130); 

                    			newLeafNode(lv_desc_10_0, grammarAccess.getGameDescriptionAccess().getDescSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGameDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"desc",
                            		lv_desc_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:573:4: (otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:573:6: otherlv_11= 'SGageRange' ruleSeparator ( (lv_ageRange_13_0= ruleAge ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleGameDescription1150); 

                        	newLeafNode(otherlv_11, grammarAccess.getGameDescriptionAccess().getSGageRangeKeyword_8_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_8_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1166);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:585:1: ( (lv_ageRange_13_0= ruleAge ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:586:1: (lv_ageRange_13_0= ruleAge )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:586:1: (lv_ageRange_13_0= ruleAge )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:587:3: lv_ageRange_13_0= ruleAge
                    {
                     
                    	        newCompositeNode(grammarAccess.getGameDescriptionAccess().getAgeRangeAgeParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAge_in_ruleGameDescription1186);
                    lv_ageRange_13_0=ruleAge();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGameDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"ageRange",
                            		lv_ageRange_13_0, 
                            		"Age");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:603:4: (otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:603:6: otherlv_14= 'SGlanguage' ruleSeparator ( (lv_lang_16_0= RULE_ID ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleGameDescription1201); 

                        	newLeafNode(otherlv_14, grammarAccess.getGameDescriptionAccess().getSGlanguageKeyword_9_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1217);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:615:1: ( (lv_lang_16_0= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:616:1: (lv_lang_16_0= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:616:1: (lv_lang_16_0= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:617:3: lv_lang_16_0= RULE_ID
                    {
                    lv_lang_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGameDescription1233); 

                    			newLeafNode(lv_lang_16_0, grammarAccess.getGameDescriptionAccess().getLangIDTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGameDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lang",
                            		lv_lang_16_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:633:4: (otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:633:6: otherlv_17= 'SGcountry' ruleSeparator ( (lv_country_19_0= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleGameDescription1253); 

                        	newLeafNode(otherlv_17, grammarAccess.getGameDescriptionAccess().getSGcountryKeyword_10_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_10_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1269);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:645:1: ( (lv_country_19_0= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:646:1: (lv_country_19_0= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:646:1: (lv_country_19_0= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:647:3: lv_country_19_0= RULE_ID
                    {
                    lv_country_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGameDescription1285); 

                    			newLeafNode(lv_country_19_0, grammarAccess.getGameDescriptionAccess().getCountryIDTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGameDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"country",
                            		lv_country_19_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:663:4: (otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:663:6: otherlv_20= 'SGgenre' ruleSeparator ( (lv_genre_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_31_in_ruleGameDescription1305); 

                        	newLeafNode(otherlv_20, grammarAccess.getGameDescriptionAccess().getSGgenreKeyword_11_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_11_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1321);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:675:1: ( (lv_genre_22_0= RULE_STRING ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:676:1: (lv_genre_22_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:676:1: (lv_genre_22_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:677:3: lv_genre_22_0= RULE_STRING
                    {
                    lv_genre_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGameDescription1337); 

                    			newLeafNode(lv_genre_22_0, grammarAccess.getGameDescriptionAccess().getGenreSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGameDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"genre",
                            		lv_genre_22_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:693:4: (otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:693:6: otherlv_23= 'SGsubject' ruleSeparator ( (lv_subject_25_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_32_in_ruleGameDescription1357); 

                        	newLeafNode(otherlv_23, grammarAccess.getGameDescriptionAccess().getSGsubjectKeyword_12_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_12_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1373);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:705:1: ( (lv_subject_25_0= RULE_STRING ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:706:1: (lv_subject_25_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:706:1: (lv_subject_25_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:707:3: lv_subject_25_0= RULE_STRING
                    {
                    lv_subject_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGameDescription1389); 

                    			newLeafNode(lv_subject_25_0, grammarAccess.getGameDescriptionAccess().getSubjectSTRINGTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGameDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subject",
                            		lv_subject_25_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:723:4: (otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:723:6: otherlv_26= 'SGpublic' ruleSeparator ( (lv_public_28_0= ruleBOOL ) )
                    {
                    otherlv_26=(Token)match(input,33,FOLLOW_33_in_ruleGameDescription1409); 

                        	newLeafNode(otherlv_26, grammarAccess.getGameDescriptionAccess().getSGpublicKeyword_13_0());
                        
                     
                            newCompositeNode(grammarAccess.getGameDescriptionAccess().getSeparatorParserRuleCall_13_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleGameDescription1425);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:735:1: ( (lv_public_28_0= ruleBOOL ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:736:1: (lv_public_28_0= ruleBOOL )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:736:1: (lv_public_28_0= ruleBOOL )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:737:3: lv_public_28_0= ruleBOOL
                    {
                     
                    	        newCompositeNode(grammarAccess.getGameDescriptionAccess().getPublicBOOLParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOL_in_ruleGameDescription1445);
                    lv_public_28_0=ruleBOOL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGameDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"public",
                            		lv_public_28_0, 
                            		"BOOL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getGameDescriptionAccess().getEndParserRuleCall_14()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleGameDescription1463);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleGameDescription"


    // $ANTLR start "entryRuleAge"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:769:1: entryRuleAge returns [EObject current=null] : iv_ruleAge= ruleAge EOF ;
    public final EObject entryRuleAge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAge = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:770:2: (iv_ruleAge= ruleAge EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:771:2: iv_ruleAge= ruleAge EOF
            {
             newCompositeNode(grammarAccess.getAgeRule()); 
            pushFollow(FOLLOW_ruleAge_in_entryRuleAge1498);
            iv_ruleAge=ruleAge();

            state._fsp--;

             current =iv_ruleAge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAge1508); 

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
    // $ANTLR end "entryRuleAge"


    // $ANTLR start "ruleAge"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:778:1: ruleAge returns [EObject current=null] : ( ( (lv_ageMin_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_ageMax_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAge() throws RecognitionException {
        EObject current = null;

        Token lv_ageMin_0_0=null;
        Token otherlv_1=null;
        Token lv_ageMax_2_0=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:781:28: ( ( ( (lv_ageMin_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_ageMax_2_0= RULE_INT ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:782:1: ( ( (lv_ageMin_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_ageMax_2_0= RULE_INT ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:782:1: ( ( (lv_ageMin_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_ageMax_2_0= RULE_INT ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:782:2: ( (lv_ageMin_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_ageMax_2_0= RULE_INT ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:782:2: ( (lv_ageMin_0_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:783:1: (lv_ageMin_0_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:783:1: (lv_ageMin_0_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:784:3: lv_ageMin_0_0= RULE_INT
            {
            lv_ageMin_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAge1550); 

            			newLeafNode(lv_ageMin_0_0, grammarAccess.getAgeAccess().getAgeMinINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ageMin",
                    		lv_ageMin_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleAge1567); 

                	newLeafNode(otherlv_1, grammarAccess.getAgeAccess().getHyphenMinusKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:804:1: ( (lv_ageMax_2_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:805:1: (lv_ageMax_2_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:805:1: (lv_ageMax_2_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:806:3: lv_ageMax_2_0= RULE_INT
            {
            lv_ageMax_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAge1584); 

            			newLeafNode(lv_ageMax_2_0, grammarAccess.getAgeAccess().getAgeMaxINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ageMax",
                    		lv_ageMax_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleAge"


    // $ANTLR start "entryRulePlayerDescription"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:830:1: entryRulePlayerDescription returns [EObject current=null] : iv_rulePlayerDescription= rulePlayerDescription EOF ;
    public final EObject entryRulePlayerDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerDescription = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:831:2: (iv_rulePlayerDescription= rulePlayerDescription EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:832:2: iv_rulePlayerDescription= rulePlayerDescription EOF
            {
             newCompositeNode(grammarAccess.getPlayerDescriptionRule()); 
            pushFollow(FOLLOW_rulePlayerDescription_in_entryRulePlayerDescription1625);
            iv_rulePlayerDescription=rulePlayerDescription();

            state._fsp--;

             current =iv_rulePlayerDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayerDescription1635); 

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
    // $ANTLR end "entryRulePlayerDescription"


    // $ANTLR start "rulePlayerDescription"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:839:1: rulePlayerDescription returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_characteristics_1_0= ruleCharacteristic ) )+ ruleEnd ) ;
    public final EObject rulePlayerDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_characteristics_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:842:28: ( (otherlv_0= 'Player' ( (lv_characteristics_1_0= ruleCharacteristic ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:843:1: (otherlv_0= 'Player' ( (lv_characteristics_1_0= ruleCharacteristic ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:843:1: (otherlv_0= 'Player' ( (lv_characteristics_1_0= ruleCharacteristic ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:843:3: otherlv_0= 'Player' ( (lv_characteristics_1_0= ruleCharacteristic ) )+ ruleEnd
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulePlayerDescription1672); 

                	newLeafNode(otherlv_0, grammarAccess.getPlayerDescriptionAccess().getPlayerKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:847:1: ( (lv_characteristics_1_0= ruleCharacteristic ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:848:1: (lv_characteristics_1_0= ruleCharacteristic )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:848:1: (lv_characteristics_1_0= ruleCharacteristic )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:849:3: lv_characteristics_1_0= ruleCharacteristic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlayerDescriptionAccess().getCharacteristicsCharacteristicParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCharacteristic_in_rulePlayerDescription1693);
            	    lv_characteristics_1_0=ruleCharacteristic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlayerDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characteristics",
            	            		lv_characteristics_1_0, 
            	            		"Characteristic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getPlayerDescriptionAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_rulePlayerDescription1710);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePlayerDescription"


    // $ANTLR start "entryRuleCharacteristic"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:881:1: entryRuleCharacteristic returns [EObject current=null] : iv_ruleCharacteristic= ruleCharacteristic EOF ;
    public final EObject entryRuleCharacteristic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristic = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:882:2: (iv_ruleCharacteristic= ruleCharacteristic EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:883:2: iv_ruleCharacteristic= ruleCharacteristic EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicRule()); 
            pushFollow(FOLLOW_ruleCharacteristic_in_entryRuleCharacteristic1745);
            iv_ruleCharacteristic=ruleCharacteristic();

            state._fsp--;

             current =iv_ruleCharacteristic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacteristic1755); 

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
    // $ANTLR end "entryRuleCharacteristic"


    // $ANTLR start "ruleCharacteristic"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:890:1: ruleCharacteristic returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSeparator )? ( (lv_type_2_0= ruleType ) ) ( (lv_question_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleCharacteristic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_question_3_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:893:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSeparator )? ( (lv_type_2_0= ruleType ) ) ( (lv_question_3_0= RULE_STRING ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:894:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSeparator )? ( (lv_type_2_0= ruleType ) ) ( (lv_question_3_0= RULE_STRING ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:894:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSeparator )? ( (lv_type_2_0= ruleType ) ) ( (lv_question_3_0= RULE_STRING ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:894:2: ( (lv_name_0_0= RULE_ID ) ) ( ruleSeparator )? ( (lv_type_2_0= ruleType ) ) ( (lv_question_3_0= RULE_STRING ) )?
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:894:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:895:1: (lv_name_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:895:1: (lv_name_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:896:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCharacteristic1797); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCharacteristicAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacteristicRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:912:2: ( ruleSeparator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:913:5: ruleSeparator
                    {
                     
                            newCompositeNode(grammarAccess.getCharacteristicAccess().getSeparatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSeparator_in_ruleCharacteristic1819);
                    ruleSeparator();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:920:3: ( (lv_type_2_0= ruleType ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:921:1: (lv_type_2_0= ruleType )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:921:1: (lv_type_2_0= ruleType )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:922:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCharacteristicAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCharacteristic1841);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:938:2: ( (lv_question_3_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:939:1: (lv_question_3_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:939:1: (lv_question_3_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:940:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacteristic1858); 

                    			newLeafNode(lv_question_3_0, grammarAccess.getCharacteristicAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacteristicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"question",
                            		lv_question_3_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleCharacteristic"


    // $ANTLR start "entryRuleLearningOutcomes"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:964:1: entryRuleLearningOutcomes returns [EObject current=null] : iv_ruleLearningOutcomes= ruleLearningOutcomes EOF ;
    public final EObject entryRuleLearningOutcomes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLearningOutcomes = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:965:2: (iv_ruleLearningOutcomes= ruleLearningOutcomes EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:966:2: iv_ruleLearningOutcomes= ruleLearningOutcomes EOF
            {
             newCompositeNode(grammarAccess.getLearningOutcomesRule()); 
            pushFollow(FOLLOW_ruleLearningOutcomes_in_entryRuleLearningOutcomes1900);
            iv_ruleLearningOutcomes=ruleLearningOutcomes();

            state._fsp--;

             current =iv_ruleLearningOutcomes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLearningOutcomes1910); 

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
    // $ANTLR end "entryRuleLearningOutcomes"


    // $ANTLR start "ruleLearningOutcomes"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:973:1: ruleLearningOutcomes returns [EObject current=null] : ( (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' ) ( (lv_outcomes_2_0= ruleOutcome ) )+ ruleEnd ) ;
    public final EObject ruleLearningOutcomes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_outcomes_2_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:976:28: ( ( (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' ) ( (lv_outcomes_2_0= ruleOutcome ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:977:1: ( (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' ) ( (lv_outcomes_2_0= ruleOutcome ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:977:1: ( (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' ) ( (lv_outcomes_2_0= ruleOutcome ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:977:2: (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' ) ( (lv_outcomes_2_0= ruleOutcome ) )+ ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:977:2: (otherlv_0= 'Learning-outcomes' | otherlv_1= 'Scores' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:977:4: otherlv_0= 'Learning-outcomes'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleLearningOutcomes1948); 

                        	newLeafNode(otherlv_0, grammarAccess.getLearningOutcomesAccess().getLearningOutcomesKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:982:7: otherlv_1= 'Scores'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleLearningOutcomes1966); 

                        	newLeafNode(otherlv_1, grammarAccess.getLearningOutcomesAccess().getScoresKeyword_0_1());
                        

                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:986:2: ( (lv_outcomes_2_0= ruleOutcome ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:987:1: (lv_outcomes_2_0= ruleOutcome )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:987:1: (lv_outcomes_2_0= ruleOutcome )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:988:3: lv_outcomes_2_0= ruleOutcome
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLearningOutcomesAccess().getOutcomesOutcomeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutcome_in_ruleLearningOutcomes1988);
            	    lv_outcomes_2_0=ruleOutcome();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLearningOutcomesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outcomes",
            	            		lv_outcomes_2_0, 
            	            		"Outcome");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getLearningOutcomesAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleLearningOutcomes2005);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLearningOutcomes"


    // $ANTLR start "entryRuleOutcome"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1020:1: entryRuleOutcome returns [EObject current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final EObject entryRuleOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcome = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1021:2: (iv_ruleOutcome= ruleOutcome EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1022:2: iv_ruleOutcome= ruleOutcome EOF
            {
             newCompositeNode(grammarAccess.getOutcomeRule()); 
            pushFollow(FOLLOW_ruleOutcome_in_entryRuleOutcome2040);
            iv_ruleOutcome=ruleOutcome();

            state._fsp--;

             current =iv_ruleOutcome; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutcome2050); 

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
    // $ANTLR end "entryRuleOutcome"


    // $ANTLR start "ruleOutcome"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1029:1: ruleOutcome returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_desc_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_INT ) )? ( (lv_type_3_0= ruleTypeOutcome ) )? ) ;
    public final EObject ruleOutcome() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_desc_1_0=null;
        Token lv_value_2_0=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1032:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_desc_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_INT ) )? ( (lv_type_3_0= ruleTypeOutcome ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1033:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_desc_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_INT ) )? ( (lv_type_3_0= ruleTypeOutcome ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1033:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_desc_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_INT ) )? ( (lv_type_3_0= ruleTypeOutcome ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1033:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_desc_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_INT ) )? ( (lv_type_3_0= ruleTypeOutcome ) )?
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1033:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1034:1: (lv_name_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1034:1: (lv_name_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1035:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutcome2092); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOutcomeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutcomeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1051:2: ( (lv_desc_1_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1052:1: (lv_desc_1_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1052:1: (lv_desc_1_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1053:3: lv_desc_1_0= RULE_STRING
                    {
                    lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutcome2114); 

                    			newLeafNode(lv_desc_1_0, grammarAccess.getOutcomeAccess().getDescSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"desc",
                            		lv_desc_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1069:3: ( (lv_value_2_0= RULE_INT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1070:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1070:1: (lv_value_2_0= RULE_INT )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1071:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOutcome2137); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getOutcomeAccess().getValueINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1087:3: ( (lv_type_3_0= ruleTypeOutcome ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=38 && LA23_0<=40)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1088:1: (lv_type_3_0= ruleTypeOutcome )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1088:1: (lv_type_3_0= ruleTypeOutcome )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1089:3: lv_type_3_0= ruleTypeOutcome
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutcomeAccess().getTypeTypeOutcomeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeOutcome_in_ruleOutcome2164);
                    lv_type_3_0=ruleTypeOutcome();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutcomeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"TypeOutcome");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleOutcome"


    // $ANTLR start "entryRuleTypeOutcome"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1113:1: entryRuleTypeOutcome returns [EObject current=null] : iv_ruleTypeOutcome= ruleTypeOutcome EOF ;
    public final EObject entryRuleTypeOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeOutcome = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1114:2: (iv_ruleTypeOutcome= ruleTypeOutcome EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1115:2: iv_ruleTypeOutcome= ruleTypeOutcome EOF
            {
             newCompositeNode(grammarAccess.getTypeOutcomeRule()); 
            pushFollow(FOLLOW_ruleTypeOutcome_in_entryRuleTypeOutcome2201);
            iv_ruleTypeOutcome=ruleTypeOutcome();

            state._fsp--;

             current =iv_ruleTypeOutcome; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeOutcome2211); 

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
    // $ANTLR end "entryRuleTypeOutcome"


    // $ANTLR start "ruleTypeOutcome"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1122:1: ruleTypeOutcome returns [EObject current=null] : ( ( (lv_knowledge_0_0= 'knowledge' ) ) | ( (lv_skill_1_0= 'skill' ) ) | ( (lv_competence_2_0= 'competence' ) ) ) ;
    public final EObject ruleTypeOutcome() throws RecognitionException {
        EObject current = null;

        Token lv_knowledge_0_0=null;
        Token lv_skill_1_0=null;
        Token lv_competence_2_0=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1125:28: ( ( ( (lv_knowledge_0_0= 'knowledge' ) ) | ( (lv_skill_1_0= 'skill' ) ) | ( (lv_competence_2_0= 'competence' ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1126:1: ( ( (lv_knowledge_0_0= 'knowledge' ) ) | ( (lv_skill_1_0= 'skill' ) ) | ( (lv_competence_2_0= 'competence' ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1126:1: ( ( (lv_knowledge_0_0= 'knowledge' ) ) | ( (lv_skill_1_0= 'skill' ) ) | ( (lv_competence_2_0= 'competence' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 40:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1126:2: ( (lv_knowledge_0_0= 'knowledge' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1126:2: ( (lv_knowledge_0_0= 'knowledge' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1127:1: (lv_knowledge_0_0= 'knowledge' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1127:1: (lv_knowledge_0_0= 'knowledge' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1128:3: lv_knowledge_0_0= 'knowledge'
                    {
                    lv_knowledge_0_0=(Token)match(input,38,FOLLOW_38_in_ruleTypeOutcome2254); 

                            newLeafNode(lv_knowledge_0_0, grammarAccess.getTypeOutcomeAccess().getKnowledgeKnowledgeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeOutcomeRule());
                    	        }
                           		setWithLastConsumed(current, "knowledge", true, "knowledge");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1142:6: ( (lv_skill_1_0= 'skill' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1142:6: ( (lv_skill_1_0= 'skill' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1143:1: (lv_skill_1_0= 'skill' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1143:1: (lv_skill_1_0= 'skill' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1144:3: lv_skill_1_0= 'skill'
                    {
                    lv_skill_1_0=(Token)match(input,39,FOLLOW_39_in_ruleTypeOutcome2291); 

                            newLeafNode(lv_skill_1_0, grammarAccess.getTypeOutcomeAccess().getSkillSkillKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeOutcomeRule());
                    	        }
                           		setWithLastConsumed(current, "skill", true, "skill");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1158:6: ( (lv_competence_2_0= 'competence' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1158:6: ( (lv_competence_2_0= 'competence' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1159:1: (lv_competence_2_0= 'competence' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1159:1: (lv_competence_2_0= 'competence' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1160:3: lv_competence_2_0= 'competence'
                    {
                    lv_competence_2_0=(Token)match(input,40,FOLLOW_40_in_ruleTypeOutcome2328); 

                            newLeafNode(lv_competence_2_0, grammarAccess.getTypeOutcomeAccess().getCompetenceCompetenceKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeOutcomeRule());
                    	        }
                           		setWithLastConsumed(current, "competence", true, "competence");
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTypeOutcome"


    // $ANTLR start "entryRuleFeedbackMessages"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1181:1: entryRuleFeedbackMessages returns [EObject current=null] : iv_ruleFeedbackMessages= ruleFeedbackMessages EOF ;
    public final EObject entryRuleFeedbackMessages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackMessages = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1182:2: (iv_ruleFeedbackMessages= ruleFeedbackMessages EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1183:2: iv_ruleFeedbackMessages= ruleFeedbackMessages EOF
            {
             newCompositeNode(grammarAccess.getFeedbackMessagesRule()); 
            pushFollow(FOLLOW_ruleFeedbackMessages_in_entryRuleFeedbackMessages2377);
            iv_ruleFeedbackMessages=ruleFeedbackMessages();

            state._fsp--;

             current =iv_ruleFeedbackMessages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackMessages2387); 

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
    // $ANTLR end "entryRuleFeedbackMessages"


    // $ANTLR start "ruleFeedbackMessages"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1190:1: ruleFeedbackMessages returns [EObject current=null] : ( (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' ) ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+ ruleEnd ) ;
    public final EObject ruleFeedbackMessages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_feedbackMsgs_2_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1193:28: ( ( (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' ) ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1194:1: ( (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' ) ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1194:1: ( (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' ) ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1194:2: (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' ) ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+ ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1194:2: (otherlv_0= 'Feedback-messages' | otherlv_1= 'Feedback' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( (LA25_0==42) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1194:4: otherlv_0= 'Feedback-messages'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleFeedbackMessages2425); 

                        	newLeafNode(otherlv_0, grammarAccess.getFeedbackMessagesAccess().getFeedbackMessagesKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1199:7: otherlv_1= 'Feedback'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleFeedbackMessages2443); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeedbackMessagesAccess().getFeedbackKeyword_0_1());
                        

                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1203:2: ( (lv_feedbackMsgs_2_0= ruleFeedback ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1204:1: (lv_feedbackMsgs_2_0= ruleFeedback )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1204:1: (lv_feedbackMsgs_2_0= ruleFeedback )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1205:3: lv_feedbackMsgs_2_0= ruleFeedback
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeedbackMessagesAccess().getFeedbackMsgsFeedbackParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeedback_in_ruleFeedbackMessages2465);
            	    lv_feedbackMsgs_2_0=ruleFeedback();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeedbackMessagesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"feedbackMsgs",
            	            		lv_feedbackMsgs_2_0, 
            	            		"Feedback");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getFeedbackMessagesAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleFeedbackMessages2482);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFeedbackMessages"


    // $ANTLR start "entryRuleFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1237:1: entryRuleFeedback returns [EObject current=null] : iv_ruleFeedback= ruleFeedback EOF ;
    public final EObject entryRuleFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedback = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1238:2: (iv_ruleFeedback= ruleFeedback EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1239:2: iv_ruleFeedback= ruleFeedback EOF
            {
             newCompositeNode(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_ruleFeedback_in_entryRuleFeedback2517);
            iv_ruleFeedback=ruleFeedback();

            state._fsp--;

             current =iv_ruleFeedback; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedback2527); 

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
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1246:1: ruleFeedback returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_message_1_0= RULE_STRING ) ) ( (lv_image_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleTypeFeedback ) )? ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )? ) ;
    public final EObject ruleFeedback() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_message_1_0=null;
        Token lv_image_2_0=null;
        Token lv_win_4_0=null;
        Token lv_lose_5_0=null;
        Token lv_end_6_0=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1249:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_message_1_0= RULE_STRING ) ) ( (lv_image_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleTypeFeedback ) )? ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1250:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_message_1_0= RULE_STRING ) ) ( (lv_image_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleTypeFeedback ) )? ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1250:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_message_1_0= RULE_STRING ) ) ( (lv_image_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleTypeFeedback ) )? ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1250:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_message_1_0= RULE_STRING ) ) ( (lv_image_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleTypeFeedback ) )? ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )?
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1250:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1251:1: (lv_name_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1251:1: (lv_name_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1252:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeedback2569); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeedbackAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeedbackRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1268:2: ( (lv_message_1_0= RULE_STRING ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1269:1: (lv_message_1_0= RULE_STRING )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1269:1: (lv_message_1_0= RULE_STRING )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1270:3: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeedback2591); 

            			newLeafNode(lv_message_1_0, grammarAccess.getFeedbackAccess().getMessageSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeedbackRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1286:2: ( (lv_image_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1287:1: (lv_image_2_0= RULE_STRING )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1287:1: (lv_image_2_0= RULE_STRING )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1288:3: lv_image_2_0= RULE_STRING
                    {
                    lv_image_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeedback2613); 

                    			newLeafNode(lv_image_2_0, grammarAccess.getFeedbackAccess().getImageSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeedbackRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"image",
                            		lv_image_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1304:3: ( (lv_type_3_0= ruleTypeFeedback ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=46 && LA28_0<=51)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1305:1: (lv_type_3_0= ruleTypeFeedback )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1305:1: (lv_type_3_0= ruleTypeFeedback )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1306:3: lv_type_3_0= ruleTypeFeedback
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeedbackAccess().getTypeTypeFeedbackParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeFeedback_in_ruleFeedback2640);
                    lv_type_3_0=ruleTypeFeedback();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeedbackRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"TypeFeedback");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1322:3: ( ( (lv_win_4_0= 'win' ) ) | ( (lv_lose_5_0= 'lose' ) ) | ( (lv_end_6_0= 'end' ) ) )?
            int alt29=4;
            switch ( input.LA(1) ) {
                case 43:
                    {
                    alt29=1;
                    }
                    break;
                case 44:
                    {
                    alt29=2;
                    }
                    break;
                case 45:
                    {
                    alt29=3;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1322:4: ( (lv_win_4_0= 'win' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1322:4: ( (lv_win_4_0= 'win' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1323:1: (lv_win_4_0= 'win' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1323:1: (lv_win_4_0= 'win' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1324:3: lv_win_4_0= 'win'
                    {
                    lv_win_4_0=(Token)match(input,43,FOLLOW_43_in_ruleFeedback2660); 

                            newLeafNode(lv_win_4_0, grammarAccess.getFeedbackAccess().getWinWinKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeedbackRule());
                    	        }
                           		setWithLastConsumed(current, "win", true, "win");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1338:6: ( (lv_lose_5_0= 'lose' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1338:6: ( (lv_lose_5_0= 'lose' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1339:1: (lv_lose_5_0= 'lose' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1339:1: (lv_lose_5_0= 'lose' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1340:3: lv_lose_5_0= 'lose'
                    {
                    lv_lose_5_0=(Token)match(input,44,FOLLOW_44_in_ruleFeedback2697); 

                            newLeafNode(lv_lose_5_0, grammarAccess.getFeedbackAccess().getLoseLoseKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeedbackRule());
                    	        }
                           		setWithLastConsumed(current, "lose", true, "lose");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1354:6: ( (lv_end_6_0= 'end' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1354:6: ( (lv_end_6_0= 'end' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1355:1: (lv_end_6_0= 'end' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1355:1: (lv_end_6_0= 'end' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1356:3: lv_end_6_0= 'end'
                    {
                    lv_end_6_0=(Token)match(input,45,FOLLOW_45_in_ruleFeedback2734); 

                            newLeafNode(lv_end_6_0, grammarAccess.getFeedbackAccess().getEndEndKeyword_4_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeedbackRule());
                    	        }
                           		setWithLastConsumed(current, "end", true, "end");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleFeedback"


    // $ANTLR start "entryRuleTypeFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1377:1: entryRuleTypeFeedback returns [String current=null] : iv_ruleTypeFeedback= ruleTypeFeedback EOF ;
    public final String entryRuleTypeFeedback() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFeedback = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1378:2: (iv_ruleTypeFeedback= ruleTypeFeedback EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1379:2: iv_ruleTypeFeedback= ruleTypeFeedback EOF
            {
             newCompositeNode(grammarAccess.getTypeFeedbackRule()); 
            pushFollow(FOLLOW_ruleTypeFeedback_in_entryRuleTypeFeedback2786);
            iv_ruleTypeFeedback=ruleTypeFeedback();

            state._fsp--;

             current =iv_ruleTypeFeedback.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFeedback2797); 

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
    // $ANTLR end "entryRuleTypeFeedback"


    // $ANTLR start "ruleTypeFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1386:1: ruleTypeFeedback returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'positive' | kw= 'negative' | kw= 'neutral' | kw= 'badge' | kw= 'hint' | kw= 'adaptation' ) ;
    public final AntlrDatatypeRuleToken ruleTypeFeedback() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1389:28: ( (kw= 'positive' | kw= 'negative' | kw= 'neutral' | kw= 'badge' | kw= 'hint' | kw= 'adaptation' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1390:1: (kw= 'positive' | kw= 'negative' | kw= 'neutral' | kw= 'badge' | kw= 'hint' | kw= 'adaptation' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1390:1: (kw= 'positive' | kw= 'negative' | kw= 'neutral' | kw= 'badge' | kw= 'hint' | kw= 'adaptation' )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 48:
                {
                alt30=3;
                }
                break;
            case 49:
                {
                alt30=4;
                }
                break;
            case 50:
                {
                alt30=5;
                }
                break;
            case 51:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1391:2: kw= 'positive'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTypeFeedback2835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getPositiveKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1398:2: kw= 'negative'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleTypeFeedback2854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getNegativeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1405:2: kw= 'neutral'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleTypeFeedback2873); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getNeutralKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1412:2: kw= 'badge'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleTypeFeedback2892); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getBadgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1419:2: kw= 'hint'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleTypeFeedback2911); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getHintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1426:2: kw= 'adaptation'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleTypeFeedback2930); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFeedbackAccess().getAdaptationKeyword_5()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleTypeFeedback"


    // $ANTLR start "entryRuleEvidenceModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1439:1: entryRuleEvidenceModel returns [EObject current=null] : iv_ruleEvidenceModel= ruleEvidenceModel EOF ;
    public final EObject entryRuleEvidenceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidenceModel = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1440:2: (iv_ruleEvidenceModel= ruleEvidenceModel EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1441:2: iv_ruleEvidenceModel= ruleEvidenceModel EOF
            {
             newCompositeNode(grammarAccess.getEvidenceModelRule()); 
            pushFollow(FOLLOW_ruleEvidenceModel_in_entryRuleEvidenceModel2970);
            iv_ruleEvidenceModel=ruleEvidenceModel();

            state._fsp--;

             current =iv_ruleEvidenceModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvidenceModel2980); 

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
    // $ANTLR end "entryRuleEvidenceModel"


    // $ANTLR start "ruleEvidenceModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1448:1: ruleEvidenceModel returns [EObject current=null] : (otherlv_0= 'Evidence-model' ( (lv_actions_1_0= ruleAction ) )+ ( (lv_timerActions_2_0= ruleTimerActions ) )? ( (lv_actionSequence_3_0= ruleActionSequences ) )? ruleEnd ) ;
    public final EObject ruleEvidenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_actions_1_0 = null;

        EObject lv_timerActions_2_0 = null;

        EObject lv_actionSequence_3_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1451:28: ( (otherlv_0= 'Evidence-model' ( (lv_actions_1_0= ruleAction ) )+ ( (lv_timerActions_2_0= ruleTimerActions ) )? ( (lv_actionSequence_3_0= ruleActionSequences ) )? ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1452:1: (otherlv_0= 'Evidence-model' ( (lv_actions_1_0= ruleAction ) )+ ( (lv_timerActions_2_0= ruleTimerActions ) )? ( (lv_actionSequence_3_0= ruleActionSequences ) )? ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1452:1: (otherlv_0= 'Evidence-model' ( (lv_actions_1_0= ruleAction ) )+ ( (lv_timerActions_2_0= ruleTimerActions ) )? ( (lv_actionSequence_3_0= ruleActionSequences ) )? ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1452:3: otherlv_0= 'Evidence-model' ( (lv_actions_1_0= ruleAction ) )+ ( (lv_timerActions_2_0= ruleTimerActions ) )? ( (lv_actionSequence_3_0= ruleActionSequences ) )? ruleEnd
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleEvidenceModel3017); 

                	newLeafNode(otherlv_0, grammarAccess.getEvidenceModelAccess().getEvidenceModelKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1456:1: ( (lv_actions_1_0= ruleAction ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1457:1: (lv_actions_1_0= ruleAction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1457:1: (lv_actions_1_0= ruleAction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1458:3: lv_actions_1_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvidenceModelAccess().getActionsActionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleEvidenceModel3038);
            	    lv_actions_1_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvidenceModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_1_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1474:3: ( (lv_timerActions_2_0= ruleTimerActions ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1475:1: (lv_timerActions_2_0= ruleTimerActions )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1475:1: (lv_timerActions_2_0= ruleTimerActions )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1476:3: lv_timerActions_2_0= ruleTimerActions
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceModelAccess().getTimerActionsTimerActionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimerActions_in_ruleEvidenceModel3060);
                    lv_timerActions_2_0=ruleTimerActions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceModelRule());
                    	        }
                           		set(
                           			current, 
                           			"timerActions",
                            		lv_timerActions_2_0, 
                            		"TimerActions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1492:3: ( (lv_actionSequence_3_0= ruleActionSequences ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1493:1: (lv_actionSequence_3_0= ruleActionSequences )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1493:1: (lv_actionSequence_3_0= ruleActionSequences )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1494:3: lv_actionSequence_3_0= ruleActionSequences
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceModelAccess().getActionSequenceActionSequencesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionSequences_in_ruleEvidenceModel3082);
                    lv_actionSequence_3_0=ruleActionSequences();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceModelRule());
                    	        }
                           		set(
                           			current, 
                           			"actionSequence",
                            		lv_actionSequence_3_0, 
                            		"ActionSequences");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getEvidenceModelAccess().getEndParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleEvidenceModel3099);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleEvidenceModel"


    // $ANTLR start "entryRuleActionSequences"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1526:1: entryRuleActionSequences returns [EObject current=null] : iv_ruleActionSequences= ruleActionSequences EOF ;
    public final EObject entryRuleActionSequences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSequences = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1527:2: (iv_ruleActionSequences= ruleActionSequences EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1528:2: iv_ruleActionSequences= ruleActionSequences EOF
            {
             newCompositeNode(grammarAccess.getActionSequencesRule()); 
            pushFollow(FOLLOW_ruleActionSequences_in_entryRuleActionSequences3134);
            iv_ruleActionSequences=ruleActionSequences();

            state._fsp--;

             current =iv_ruleActionSequences; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSequences3144); 

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
    // $ANTLR end "entryRuleActionSequences"


    // $ANTLR start "ruleActionSequences"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1535:1: ruleActionSequences returns [EObject current=null] : (otherlv_0= 'Action-sequence' ( (lv_actionSequences_1_0= ruleActionSequence ) ) ruleEnd ) ;
    public final EObject ruleActionSequences() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_actionSequences_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1538:28: ( (otherlv_0= 'Action-sequence' ( (lv_actionSequences_1_0= ruleActionSequence ) ) ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1539:1: (otherlv_0= 'Action-sequence' ( (lv_actionSequences_1_0= ruleActionSequence ) ) ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1539:1: (otherlv_0= 'Action-sequence' ( (lv_actionSequences_1_0= ruleActionSequence ) ) ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1539:3: otherlv_0= 'Action-sequence' ( (lv_actionSequences_1_0= ruleActionSequence ) ) ruleEnd
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleActionSequences3181); 

                	newLeafNode(otherlv_0, grammarAccess.getActionSequencesAccess().getActionSequenceKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1543:1: ( (lv_actionSequences_1_0= ruleActionSequence ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1544:1: (lv_actionSequences_1_0= ruleActionSequence )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1544:1: (lv_actionSequences_1_0= ruleActionSequence )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1545:3: lv_actionSequences_1_0= ruleActionSequence
            {
             
            	        newCompositeNode(grammarAccess.getActionSequencesAccess().getActionSequencesActionSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleActionSequence_in_ruleActionSequences3202);
            lv_actionSequences_1_0=ruleActionSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionSequencesRule());
            	        }
                   		add(
                   			current, 
                   			"actionSequences",
                    		lv_actionSequences_1_0, 
                    		"ActionSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getActionSequencesAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleActionSequences3218);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleActionSequences"


    // $ANTLR start "entryRuleActionSequence"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1577:1: entryRuleActionSequence returns [EObject current=null] : iv_ruleActionSequence= ruleActionSequence EOF ;
    public final EObject entryRuleActionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSequence = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1578:2: (iv_ruleActionSequence= ruleActionSequence EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1579:2: iv_ruleActionSequence= ruleActionSequence EOF
            {
             newCompositeNode(grammarAccess.getActionSequenceRule()); 
            pushFollow(FOLLOW_ruleActionSequence_in_entryRuleActionSequence3253);
            iv_ruleActionSequence=ruleActionSequence();

            state._fsp--;

             current =iv_ruleActionSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSequence3263); 

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
    // $ANTLR end "entryRuleActionSequence"


    // $ANTLR start "ruleActionSequence"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1586:1: ruleActionSequence returns [EObject current=null] : ( ( (lv_action1_0_0= RULE_ID ) ) ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) ) ( (lv_action2_3_0= RULE_ID ) ) otherlv_4= 'else' ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+ ruleEnd ) ;
    public final EObject ruleActionSequence() throws RecognitionException {
        EObject current = null;

        Token lv_action1_0_0=null;
        Token lv_before_1_0=null;
        Token lv_after_2_0=null;
        Token lv_action2_3_0=null;
        Token otherlv_4=null;
        EObject lv_sequenceReactions_5_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1589:28: ( ( ( (lv_action1_0_0= RULE_ID ) ) ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) ) ( (lv_action2_3_0= RULE_ID ) ) otherlv_4= 'else' ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1590:1: ( ( (lv_action1_0_0= RULE_ID ) ) ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) ) ( (lv_action2_3_0= RULE_ID ) ) otherlv_4= 'else' ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1590:1: ( ( (lv_action1_0_0= RULE_ID ) ) ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) ) ( (lv_action2_3_0= RULE_ID ) ) otherlv_4= 'else' ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1590:2: ( (lv_action1_0_0= RULE_ID ) ) ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) ) ( (lv_action2_3_0= RULE_ID ) ) otherlv_4= 'else' ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+ ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1590:2: ( (lv_action1_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1591:1: (lv_action1_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1591:1: (lv_action1_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1592:3: lv_action1_0_0= RULE_ID
            {
            lv_action1_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionSequence3305); 

            			newLeafNode(lv_action1_0_0, grammarAccess.getActionSequenceAccess().getAction1IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"action1",
                    		lv_action1_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1608:2: ( ( (lv_before_1_0= 'before' ) ) | ( (lv_after_2_0= 'after' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            else if ( (LA34_0==55) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1608:3: ( (lv_before_1_0= 'before' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1608:3: ( (lv_before_1_0= 'before' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1609:1: (lv_before_1_0= 'before' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1609:1: (lv_before_1_0= 'before' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1610:3: lv_before_1_0= 'before'
                    {
                    lv_before_1_0=(Token)match(input,54,FOLLOW_54_in_ruleActionSequence3329); 

                            newLeafNode(lv_before_1_0, grammarAccess.getActionSequenceAccess().getBeforeBeforeKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionSequenceRule());
                    	        }
                           		setWithLastConsumed(current, "before", true, "before");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1624:6: ( (lv_after_2_0= 'after' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1624:6: ( (lv_after_2_0= 'after' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1625:1: (lv_after_2_0= 'after' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1625:1: (lv_after_2_0= 'after' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1626:3: lv_after_2_0= 'after'
                    {
                    lv_after_2_0=(Token)match(input,55,FOLLOW_55_in_ruleActionSequence3366); 

                            newLeafNode(lv_after_2_0, grammarAccess.getActionSequenceAccess().getAfterAfterKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionSequenceRule());
                    	        }
                           		setWithLastConsumed(current, "after", true, "after");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1639:3: ( (lv_action2_3_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1640:1: (lv_action2_3_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1640:1: (lv_action2_3_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1641:3: lv_action2_3_0= RULE_ID
            {
            lv_action2_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionSequence3397); 

            			newLeafNode(lv_action2_3_0, grammarAccess.getActionSequenceAccess().getAction2IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"action2",
                    		lv_action2_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleActionSequence3414); 

                	newLeafNode(otherlv_4, grammarAccess.getActionSequenceAccess().getElseKeyword_3());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1661:1: ( (lv_sequenceReactions_5_0= ruleActionReaction ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==12) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1662:1: (lv_sequenceReactions_5_0= ruleActionReaction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1662:1: (lv_sequenceReactions_5_0= ruleActionReaction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1663:3: lv_sequenceReactions_5_0= ruleActionReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionSequenceAccess().getSequenceReactionsActionReactionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionReaction_in_ruleActionSequence3435);
            	    lv_sequenceReactions_5_0=ruleActionReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequenceReactions",
            	            		lv_sequenceReactions_5_0, 
            	            		"ActionReaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getActionSequenceAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleActionSequence3452);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleActionSequence"


    // $ANTLR start "entryRuleTimerActions"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1695:1: entryRuleTimerActions returns [EObject current=null] : iv_ruleTimerActions= ruleTimerActions EOF ;
    public final EObject entryRuleTimerActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerActions = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1696:2: (iv_ruleTimerActions= ruleTimerActions EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1697:2: iv_ruleTimerActions= ruleTimerActions EOF
            {
             newCompositeNode(grammarAccess.getTimerActionsRule()); 
            pushFollow(FOLLOW_ruleTimerActions_in_entryRuleTimerActions3487);
            iv_ruleTimerActions=ruleTimerActions();

            state._fsp--;

             current =iv_ruleTimerActions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimerActions3497); 

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
    // $ANTLR end "entryRuleTimerActions"


    // $ANTLR start "ruleTimerActions"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1704:1: ruleTimerActions returns [EObject current=null] : (otherlv_0= 'Timer-actions' ( (lv_timerActions_1_0= ruleTimerAction ) )+ ruleEnd ) ;
    public final EObject ruleTimerActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_timerActions_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1707:28: ( (otherlv_0= 'Timer-actions' ( (lv_timerActions_1_0= ruleTimerAction ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1708:1: (otherlv_0= 'Timer-actions' ( (lv_timerActions_1_0= ruleTimerAction ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1708:1: (otherlv_0= 'Timer-actions' ( (lv_timerActions_1_0= ruleTimerAction ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1708:3: otherlv_0= 'Timer-actions' ( (lv_timerActions_1_0= ruleTimerAction ) )+ ruleEnd
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleTimerActions3534); 

                	newLeafNode(otherlv_0, grammarAccess.getTimerActionsAccess().getTimerActionsKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1712:1: ( (lv_timerActions_1_0= ruleTimerAction ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1713:1: (lv_timerActions_1_0= ruleTimerAction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1713:1: (lv_timerActions_1_0= ruleTimerAction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1714:3: lv_timerActions_1_0= ruleTimerAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTimerActionsAccess().getTimerActionsTimerActionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTimerAction_in_ruleTimerActions3555);
            	    lv_timerActions_1_0=ruleTimerAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTimerActionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"timerActions",
            	            		lv_timerActions_1_0, 
            	            		"TimerAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getTimerActionsAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleTimerActions3572);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTimerActions"


    // $ANTLR start "entryRuleTimerAction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1746:1: entryRuleTimerAction returns [EObject current=null] : iv_ruleTimerAction= ruleTimerAction EOF ;
    public final EObject entryRuleTimerAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerAction = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1747:2: (iv_ruleTimerAction= ruleTimerAction EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1748:2: iv_ruleTimerAction= ruleTimerAction EOF
            {
             newCompositeNode(grammarAccess.getTimerActionRule()); 
            pushFollow(FOLLOW_ruleTimerAction_in_entryRuleTimerAction3607);
            iv_ruleTimerAction=ruleTimerAction();

            state._fsp--;

             current =iv_ruleTimerAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimerAction3617); 

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
    // $ANTLR end "entryRuleTimerAction"


    // $ANTLR start "ruleTimerAction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1755:1: ruleTimerAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_timings_1_0= ruleTiming ) )+ ruleEnd ) ;
    public final EObject ruleTimerAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_timings_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1758:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_timings_1_0= ruleTiming ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1759:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_timings_1_0= ruleTiming ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1759:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_timings_1_0= ruleTiming ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1759:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_timings_1_0= ruleTiming ) )+ ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1759:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1760:1: (lv_name_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1760:1: (lv_name_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1761:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimerAction3659); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTimerActionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1777:2: ( (lv_timings_1_0= ruleTiming ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==55||LA37_0==58) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1778:1: (lv_timings_1_0= ruleTiming )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1778:1: (lv_timings_1_0= ruleTiming )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1779:3: lv_timings_1_0= ruleTiming
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTimerActionAccess().getTimingsTimingParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTiming_in_ruleTimerAction3685);
            	    lv_timings_1_0=ruleTiming();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTimerActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"timings",
            	            		lv_timings_1_0, 
            	            		"Timing");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getTimerActionAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleTimerAction3702);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTimerAction"


    // $ANTLR start "entryRuleTiming"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1811:1: entryRuleTiming returns [EObject current=null] : iv_ruleTiming= ruleTiming EOF ;
    public final EObject entryRuleTiming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTiming = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1812:2: (iv_ruleTiming= ruleTiming EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1813:2: iv_ruleTiming= ruleTiming EOF
            {
             newCompositeNode(grammarAccess.getTimingRule()); 
            pushFollow(FOLLOW_ruleTiming_in_entryRuleTiming3737);
            iv_ruleTiming=ruleTiming();

            state._fsp--;

             current =iv_ruleTiming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTiming3747); 

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
    // $ANTLR end "entryRuleTiming"


    // $ANTLR start "ruleTiming"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1820:1: ruleTiming returns [EObject current=null] : ( ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_timingReactions_4_0= ruleActionReaction ) )+ ruleEnd ) ;
    public final EObject ruleTiming() throws RecognitionException {
        EObject current = null;

        Token lv_before_0_0=null;
        Token lv_after_1_0=null;
        Token lv_limit_2_0=null;
        Token otherlv_3=null;
        EObject lv_timingReactions_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1823:28: ( ( ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_timingReactions_4_0= ruleActionReaction ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:1: ( ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_timingReactions_4_0= ruleActionReaction ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:1: ( ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_timingReactions_4_0= ruleActionReaction ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:2: ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_timingReactions_4_0= ruleActionReaction ) )+ ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:2: ( ( (lv_before_0_0= 'within' ) ) | ( (lv_after_1_0= 'after' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            else if ( (LA38_0==55) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:3: ( (lv_before_0_0= 'within' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1824:3: ( (lv_before_0_0= 'within' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1825:1: (lv_before_0_0= 'within' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1825:1: (lv_before_0_0= 'within' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1826:3: lv_before_0_0= 'within'
                    {
                    lv_before_0_0=(Token)match(input,58,FOLLOW_58_in_ruleTiming3791); 

                            newLeafNode(lv_before_0_0, grammarAccess.getTimingAccess().getBeforeWithinKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimingRule());
                    	        }
                           		setWithLastConsumed(current, "before", true, "within");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1840:6: ( (lv_after_1_0= 'after' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1840:6: ( (lv_after_1_0= 'after' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1841:1: (lv_after_1_0= 'after' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1841:1: (lv_after_1_0= 'after' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1842:3: lv_after_1_0= 'after'
                    {
                    lv_after_1_0=(Token)match(input,55,FOLLOW_55_in_ruleTiming3828); 

                            newLeafNode(lv_after_1_0, grammarAccess.getTimingAccess().getAfterAfterKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimingRule());
                    	        }
                           		setWithLastConsumed(current, "after", true, "after");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1855:3: ( (lv_limit_2_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1856:1: (lv_limit_2_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1856:1: (lv_limit_2_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1857:3: lv_limit_2_0= RULE_INT
            {
            lv_limit_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTiming3859); 

            			newLeafNode(lv_limit_2_0, grammarAccess.getTimingAccess().getLimitINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limit",
                    		lv_limit_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleTiming3876); 

                	newLeafNode(otherlv_3, grammarAccess.getTimingAccess().getSecKeyword_2());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1877:1: ( (lv_timingReactions_4_0= ruleActionReaction ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==12) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1878:1: (lv_timingReactions_4_0= ruleActionReaction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1878:1: (lv_timingReactions_4_0= ruleActionReaction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1879:3: lv_timingReactions_4_0= ruleActionReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTimingAccess().getTimingReactionsActionReactionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionReaction_in_ruleTiming3897);
            	    lv_timingReactions_4_0=ruleActionReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTimingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"timingReactions",
            	            		lv_timingReactions_4_0, 
            	            		"ActionReaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getTimingAccess().getEndParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleTiming3914);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTiming"


    // $ANTLR start "entryRuleActionReaction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1911:1: entryRuleActionReaction returns [EObject current=null] : iv_ruleActionReaction= ruleActionReaction EOF ;
    public final EObject entryRuleActionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionReaction = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1912:2: (iv_ruleActionReaction= ruleActionReaction EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1913:2: iv_ruleActionReaction= ruleActionReaction EOF
            {
             newCompositeNode(grammarAccess.getActionReactionRule()); 
            pushFollow(FOLLOW_ruleActionReaction_in_entryRuleActionReaction3949);
            iv_ruleActionReaction=ruleActionReaction();

            state._fsp--;

             current =iv_ruleActionReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionReaction3959); 

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
    // $ANTLR end "entryRuleActionReaction"


    // $ANTLR start "ruleActionReaction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1920:1: ruleActionReaction returns [EObject current=null] : ( ( (lv_updateScore_0_0= ruleUpdateScore ) ) | ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) ) ) ;
    public final EObject ruleActionReaction() throws RecognitionException {
        EObject current = null;

        EObject lv_updateScore_0_0 = null;

        EObject lv_triggerFeedback_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1923:28: ( ( ( (lv_updateScore_0_0= ruleUpdateScore ) ) | ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1924:1: ( ( (lv_updateScore_0_0= ruleUpdateScore ) ) | ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1924:1: ( ( (lv_updateScore_0_0= ruleUpdateScore ) ) | ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==12) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1924:2: ( (lv_updateScore_0_0= ruleUpdateScore ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1924:2: ( (lv_updateScore_0_0= ruleUpdateScore ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1925:1: (lv_updateScore_0_0= ruleUpdateScore )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1925:1: (lv_updateScore_0_0= ruleUpdateScore )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1926:3: lv_updateScore_0_0= ruleUpdateScore
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionReactionAccess().getUpdateScoreUpdateScoreParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdateScore_in_ruleActionReaction4005);
                    lv_updateScore_0_0=ruleUpdateScore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionReactionRule());
                    	        }
                           		set(
                           			current, 
                           			"updateScore",
                            		lv_updateScore_0_0, 
                            		"UpdateScore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1943:6: ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1943:6: ( (lv_triggerFeedback_1_0= ruleTriggerFeedback ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1944:1: (lv_triggerFeedback_1_0= ruleTriggerFeedback )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1944:1: (lv_triggerFeedback_1_0= ruleTriggerFeedback )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1945:3: lv_triggerFeedback_1_0= ruleTriggerFeedback
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionReactionAccess().getTriggerFeedbackTriggerFeedbackParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTriggerFeedback_in_ruleActionReaction4032);
                    lv_triggerFeedback_1_0=ruleTriggerFeedback();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionReactionRule());
                    	        }
                           		set(
                           			current, 
                           			"triggerFeedback",
                            		lv_triggerFeedback_1_0, 
                            		"TriggerFeedback");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleActionReaction"


    // $ANTLR start "entryRuleUpdateScore"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1969:1: entryRuleUpdateScore returns [EObject current=null] : iv_ruleUpdateScore= ruleUpdateScore EOF ;
    public final EObject entryRuleUpdateScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateScore = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1970:2: (iv_ruleUpdateScore= ruleUpdateScore EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1971:2: iv_ruleUpdateScore= ruleUpdateScore EOF
            {
             newCompositeNode(grammarAccess.getUpdateScoreRule()); 
            pushFollow(FOLLOW_ruleUpdateScore_in_entryRuleUpdateScore4068);
            iv_ruleUpdateScore=ruleUpdateScore();

            state._fsp--;

             current =iv_ruleUpdateScore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateScore4078); 

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
    // $ANTLR end "entryRuleUpdateScore"


    // $ANTLR start "ruleUpdateScore"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1978:1: ruleUpdateScore returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_pts_2_0= rulePoint ) ) ) ;
    public final EObject ruleUpdateScore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pts_2_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1981:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_pts_2_0= rulePoint ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1982:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_pts_2_0= rulePoint ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1982:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_pts_2_0= rulePoint ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1982:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_pts_2_0= rulePoint ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1982:2: ( (otherlv_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1983:1: (otherlv_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1983:1: (otherlv_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1984:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUpdateScoreRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateScore4123); 

            		newLeafNode(otherlv_0, grammarAccess.getUpdateScoreAccess().getOutcomeOutcomeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleUpdateScore4135); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateScoreAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:1999:1: ( (lv_pts_2_0= rulePoint ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2000:1: (lv_pts_2_0= rulePoint )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2000:1: (lv_pts_2_0= rulePoint )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2001:3: lv_pts_2_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getUpdateScoreAccess().getPtsPointParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleUpdateScore4156);
            lv_pts_2_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateScoreRule());
            	        }
                   		set(
                   			current, 
                   			"pts",
                    		lv_pts_2_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleUpdateScore"


    // $ANTLR start "entryRuleTriggerFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2025:1: entryRuleTriggerFeedback returns [EObject current=null] : iv_ruleTriggerFeedback= ruleTriggerFeedback EOF ;
    public final EObject entryRuleTriggerFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerFeedback = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2026:2: (iv_ruleTriggerFeedback= ruleTriggerFeedback EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2027:2: iv_ruleTriggerFeedback= ruleTriggerFeedback EOF
            {
             newCompositeNode(grammarAccess.getTriggerFeedbackRule()); 
            pushFollow(FOLLOW_ruleTriggerFeedback_in_entryRuleTriggerFeedback4192);
            iv_ruleTriggerFeedback=ruleTriggerFeedback();

            state._fsp--;

             current =iv_ruleTriggerFeedback; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerFeedback4202); 

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
    // $ANTLR end "entryRuleTriggerFeedback"


    // $ANTLR start "ruleTriggerFeedback"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2034:1: ruleTriggerFeedback returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delayed_3_0= 'delayed' ) )? ) ;
    public final EObject ruleTriggerFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_immediate_2_0=null;
        Token lv_delayed_3_0=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2037:28: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delayed_3_0= 'delayed' ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2038:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delayed_3_0= 'delayed' ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2038:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delayed_3_0= 'delayed' ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2038:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delayed_3_0= 'delayed' ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTriggerFeedback4239); 

                	newLeafNode(otherlv_0, grammarAccess.getTriggerFeedbackAccess().getColonKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2042:1: ( (otherlv_1= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2043:1: (otherlv_1= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2043:1: (otherlv_1= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2044:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerFeedbackRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTriggerFeedback4259); 

            		newLeafNode(otherlv_1, grammarAccess.getTriggerFeedbackAccess().getFeedbackFeedbackCrossReference_1_0()); 
            	

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2055:2: ( (lv_immediate_2_0= 'immediate' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2056:1: (lv_immediate_2_0= 'immediate' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2056:1: (lv_immediate_2_0= 'immediate' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2057:3: lv_immediate_2_0= 'immediate'
                    {
                    lv_immediate_2_0=(Token)match(input,61,FOLLOW_61_in_ruleTriggerFeedback4277); 

                            newLeafNode(lv_immediate_2_0, grammarAccess.getTriggerFeedbackAccess().getImmediateImmediateKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerFeedbackRule());
                    	        }
                           		setWithLastConsumed(current, "immediate", true, "immediate");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2070:3: ( (lv_delayed_3_0= 'delayed' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2071:1: (lv_delayed_3_0= 'delayed' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2071:1: (lv_delayed_3_0= 'delayed' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2072:3: lv_delayed_3_0= 'delayed'
                    {
                    lv_delayed_3_0=(Token)match(input,62,FOLLOW_62_in_ruleTriggerFeedback4309); 

                            newLeafNode(lv_delayed_3_0, grammarAccess.getTriggerFeedbackAccess().getDelayedDelayedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerFeedbackRule());
                    	        }
                           		setWithLastConsumed(current, "delayed", true, "delayed");
                    	    

                    }


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
    // $ANTLR end "ruleTriggerFeedback"


    // $ANTLR start "entryRuleAction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2093:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2094:2: (iv_ruleAction= ruleAction EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2095:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4359);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4369); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2102:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )* otherlv_5= ')' ( (lv_desc_6_0= RULE_STRING ) ) ( (lv_paramsIn_7_0= ruleParamsIn ) )? ( (lv_points_8_0= rulePoints ) )+ ( (lv_reactions_9_0= ruleReactions ) )? ruleEnd ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_desc_6_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_paramsIn_7_0 = null;

        EObject lv_points_8_0 = null;

        EObject lv_reactions_9_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2105:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )* otherlv_5= ')' ( (lv_desc_6_0= RULE_STRING ) ) ( (lv_paramsIn_7_0= ruleParamsIn ) )? ( (lv_points_8_0= rulePoints ) )+ ( (lv_reactions_9_0= ruleReactions ) )? ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2106:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )* otherlv_5= ')' ( (lv_desc_6_0= RULE_STRING ) ) ( (lv_paramsIn_7_0= ruleParamsIn ) )? ( (lv_points_8_0= rulePoints ) )+ ( (lv_reactions_9_0= ruleReactions ) )? ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2106:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )* otherlv_5= ')' ( (lv_desc_6_0= RULE_STRING ) ) ( (lv_paramsIn_7_0= ruleParamsIn ) )? ( (lv_points_8_0= rulePoints ) )+ ( (lv_reactions_9_0= ruleReactions ) )? ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2106:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )* otherlv_5= ')' ( (lv_desc_6_0= RULE_STRING ) ) ( (lv_paramsIn_7_0= ruleParamsIn ) )? ( (lv_points_8_0= rulePoints ) )+ ( (lv_reactions_9_0= ruleReactions ) )? ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2106:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2107:1: (lv_name_0_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2107:1: (lv_name_0_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2108:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction4411); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAction4428); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2128:1: ( (lv_params_2_0= ruleParameter ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2129:1: (lv_params_2_0= ruleParameter )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2129:1: (lv_params_2_0= ruleParameter )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2130:3: lv_params_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getParamsParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAction4449);
            lv_params_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2146:2: (otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==21) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2146:4: otherlv_3= ',' ( (lv_params_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAction4462); 

            	        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCommaKeyword_3_0());
            	        
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2150:1: ( (lv_params_4_0= ruleParameter ) )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2151:1: (lv_params_4_0= ruleParameter )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2151:1: (lv_params_4_0= ruleParameter )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2152:3: lv_params_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAccess().getParamsParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleAction4483);
            	    lv_params_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAction4497); 

                	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2172:1: ( (lv_desc_6_0= RULE_STRING ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2173:1: (lv_desc_6_0= RULE_STRING )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2173:1: (lv_desc_6_0= RULE_STRING )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2174:3: lv_desc_6_0= RULE_STRING
            {
            lv_desc_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction4514); 

            			newLeafNode(lv_desc_6_0, grammarAccess.getActionAccess().getDescSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2190:2: ( (lv_paramsIn_7_0= ruleParamsIn ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==63) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2191:1: (lv_paramsIn_7_0= ruleParamsIn )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2191:1: (lv_paramsIn_7_0= ruleParamsIn )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2192:3: lv_paramsIn_7_0= ruleParamsIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParamsInParamsInParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsIn_in_ruleAction4540);
                    lv_paramsIn_7_0=ruleParamsIn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"paramsIn",
                            		lv_paramsIn_7_0, 
                            		"ParamsIn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2208:3: ( (lv_points_8_0= rulePoints ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_ID)||LA45_0==34||LA45_0==67) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2209:1: (lv_points_8_0= rulePoints )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2209:1: (lv_points_8_0= rulePoints )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2210:3: lv_points_8_0= rulePoints
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAccess().getPointsPointsParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoints_in_ruleAction4562);
            	    lv_points_8_0=rulePoints();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"points",
            	            		lv_points_8_0, 
            	            		"Points");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2226:3: ( (lv_reactions_9_0= ruleReactions ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2227:1: (lv_reactions_9_0= ruleReactions )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2227:1: (lv_reactions_9_0= ruleReactions )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2228:3: lv_reactions_9_0= ruleReactions
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getReactionsReactionsParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReactions_in_ruleAction4584);
                    lv_reactions_9_0=ruleReactions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"reactions",
                            		lv_reactions_9_0, 
                            		"Reactions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getActionAccess().getEndParserRuleCall_9()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleAction4601);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParamsIn"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2260:1: entryRuleParamsIn returns [EObject current=null] : iv_ruleParamsIn= ruleParamsIn EOF ;
    public final EObject entryRuleParamsIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsIn = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2261:2: (iv_ruleParamsIn= ruleParamsIn EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2262:2: iv_ruleParamsIn= ruleParamsIn EOF
            {
             newCompositeNode(grammarAccess.getParamsInRule()); 
            pushFollow(FOLLOW_ruleParamsIn_in_entryRuleParamsIn4636);
            iv_ruleParamsIn=ruleParamsIn();

            state._fsp--;

             current =iv_ruleParamsIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsIn4646); 

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
    // $ANTLR end "entryRuleParamsIn"


    // $ANTLR start "ruleParamsIn"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2269:1: ruleParamsIn returns [EObject current=null] : ( (lv_paramIn_0_0= ruleParamIn ) )+ ;
    public final EObject ruleParamsIn() throws RecognitionException {
        EObject current = null;

        EObject lv_paramIn_0_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2272:28: ( ( (lv_paramIn_0_0= ruleParamIn ) )+ )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2273:1: ( (lv_paramIn_0_0= ruleParamIn ) )+
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2273:1: ( (lv_paramIn_0_0= ruleParamIn ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==63) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2274:1: (lv_paramIn_0_0= ruleParamIn )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2274:1: (lv_paramIn_0_0= ruleParamIn )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2275:3: lv_paramIn_0_0= ruleParamIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsInAccess().getParamInParamInParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParamIn_in_ruleParamsIn4691);
            	    lv_paramIn_0_0=ruleParamIn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsInRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"paramIn",
            	            		lv_paramIn_0_0, 
            	            		"ParamIn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


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
    // $ANTLR end "ruleParamsIn"


    // $ANTLR start "entryRuleParamIn"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2299:1: entryRuleParamIn returns [EObject current=null] : iv_ruleParamIn= ruleParamIn EOF ;
    public final EObject entryRuleParamIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamIn = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2300:2: (iv_ruleParamIn= ruleParamIn EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2301:2: iv_ruleParamIn= ruleParamIn EOF
            {
             newCompositeNode(grammarAccess.getParamInRule()); 
            pushFollow(FOLLOW_ruleParamIn_in_entryRuleParamIn4727);
            iv_ruleParamIn=ruleParamIn();

            state._fsp--;

             current =iv_ruleParamIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamIn4737); 

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
    // $ANTLR end "entryRuleParamIn"


    // $ANTLR start "ruleParamIn"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2308:1: ruleParamIn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in {' ( (lv_valuesPoss_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParamIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valuesPoss_2_0 = null;

        AntlrDatatypeRuleToken lv_valuesPoss_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2311:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in {' ( (lv_valuesPoss_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )* otherlv_5= '}' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2312:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in {' ( (lv_valuesPoss_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )* otherlv_5= '}' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2312:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in {' ( (lv_valuesPoss_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )* otherlv_5= '}' )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2312:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in {' ( (lv_valuesPoss_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )* otherlv_5= '}'
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2312:2: ( (otherlv_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2313:1: (otherlv_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2313:1: (otherlv_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2314:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParamInRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamIn4782); 

            		newLeafNode(otherlv_0, grammarAccess.getParamInAccess().getParamParameterCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleParamIn4794); 

                	newLeafNode(otherlv_1, grammarAccess.getParamInAccess().getInKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2329:1: ( (lv_valuesPoss_2_0= ruleParam ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2330:1: (lv_valuesPoss_2_0= ruleParam )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2330:1: (lv_valuesPoss_2_0= ruleParam )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2331:3: lv_valuesPoss_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getParamInAccess().getValuesPossParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleParamIn4815);
            lv_valuesPoss_2_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamInRule());
            	        }
                   		add(
                   			current, 
                   			"valuesPoss",
                    		lv_valuesPoss_2_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2347:2: (otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2347:4: otherlv_3= ',' ( (lv_valuesPoss_4_0= ruleParam ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleParamIn4828); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamInAccess().getCommaKeyword_3_0());
            	        
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2351:1: ( (lv_valuesPoss_4_0= ruleParam ) )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2352:1: (lv_valuesPoss_4_0= ruleParam )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2352:1: (lv_valuesPoss_4_0= ruleParam )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2353:3: lv_valuesPoss_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamInAccess().getValuesPossParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleParamIn4849);
            	    lv_valuesPoss_4_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamInRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"valuesPoss",
            	            		lv_valuesPoss_4_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleParamIn4863); 

                	newLeafNode(otherlv_5, grammarAccess.getParamInAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleParamIn"


    // $ANTLR start "entryRuleParameter"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2381:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2382:2: (iv_ruleParameter= ruleParameter EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2383:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4899);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4909); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2390:1: ruleParameter returns [EObject current=null] : ( ( (lv_logOnly_0_0= 'LogOnly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_logOnly_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2393:28: ( ( ( (lv_logOnly_0_0= 'LogOnly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2394:1: ( ( (lv_logOnly_0_0= 'LogOnly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2394:1: ( ( (lv_logOnly_0_0= 'LogOnly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2394:2: ( (lv_logOnly_0_0= 'LogOnly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2394:2: ( (lv_logOnly_0_0= 'LogOnly' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2395:1: (lv_logOnly_0_0= 'LogOnly' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2395:1: (lv_logOnly_0_0= 'LogOnly' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2396:3: lv_logOnly_0_0= 'LogOnly'
                    {
                    lv_logOnly_0_0=(Token)match(input,65,FOLLOW_65_in_ruleParameter4952); 

                            newLeafNode(lv_logOnly_0_0, grammarAccess.getParameterAccess().getLogOnlyLogOnlyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "logOnly", true, "LogOnly");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2409:3: ( (lv_type_1_0= ruleType ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2410:1: (lv_type_1_0= ruleType )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2410:1: (lv_type_1_0= ruleType )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2411:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter4987);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2427:2: ( (lv_name_2_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2428:1: (lv_name_2_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2428:1: (lv_name_2_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2429:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter5004); 

            			newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePoints"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2453:1: entryRulePoints returns [EObject current=null] : iv_rulePoints= rulePoints EOF ;
    public final EObject entryRulePoints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoints = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2454:2: (iv_rulePoints= rulePoints EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2455:2: iv_rulePoints= rulePoints EOF
            {
             newCompositeNode(grammarAccess.getPointsRule()); 
            pushFollow(FOLLOW_rulePoints_in_entryRulePoints5045);
            iv_rulePoints=rulePoints();

            state._fsp--;

             current =iv_rulePoints; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoints5055); 

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
    // $ANTLR end "entryRulePoints"


    // $ANTLR start "rulePoints"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2462:1: rulePoints returns [EObject current=null] : ( ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) ) (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )? ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ ) ruleEnd ) ;
    public final EObject rulePoints() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_others_3_1=null;
        Token lv_others_3_2=null;
        EObject lv_outcomesPoints_0_0 = null;

        EObject lv_outcomesPoints_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2465:28: ( ( ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) ) (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )? ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ ) ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2466:1: ( ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) ) (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )? ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ ) ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2466:1: ( ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) ) (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )? ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ ) ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2466:2: ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) ) (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )? ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ ) ruleEnd
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2466:2: ( (lv_outcomesPoints_0_0= ruleOutcomesPoints ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2467:1: (lv_outcomesPoints_0_0= ruleOutcomesPoints )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2467:1: (lv_outcomesPoints_0_0= ruleOutcomesPoints )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2468:3: lv_outcomesPoints_0_0= ruleOutcomesPoints
            {
             
            	        newCompositeNode(grammarAccess.getPointsAccess().getOutcomesPointsOutcomesPointsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOutcomesPoints_in_rulePoints5101);
            lv_outcomesPoints_0_0=ruleOutcomesPoints();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointsRule());
            	        }
                   		add(
                   			current, 
                   			"outcomesPoints",
                    		lv_outcomesPoints_0_0, 
                    		"OutcomesPoints");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2484:2: (otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2484:4: otherlv_1= ',' ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulePoints5114); 

                        	newLeafNode(otherlv_1, grammarAccess.getPointsAccess().getCommaKeyword_1_0());
                        
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2488:1: ( (lv_outcomesPoints_2_0= ruleOutcomesPoints ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2489:1: (lv_outcomesPoints_2_0= ruleOutcomesPoints )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2489:1: (lv_outcomesPoints_2_0= ruleOutcomesPoints )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2490:3: lv_outcomesPoints_2_0= ruleOutcomesPoints
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointsAccess().getOutcomesPointsOutcomesPointsParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutcomesPoints_in_rulePoints5135);
                    lv_outcomesPoints_2_0=ruleOutcomesPoints();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointsRule());
                    	        }
                           		add(
                           			current, 
                           			"outcomesPoints",
                            		lv_outcomesPoints_2_0, 
                            		"OutcomesPoints");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2506:4: ( ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) ) | ( (lv_params_4_0= ruleParams ) )+ )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56||LA53_0==66) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||(LA53_0>=70 && LA53_0<=71)) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2506:5: ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2506:5: ( ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2507:1: ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2507:1: ( (lv_others_3_1= 'others' | lv_others_3_2= 'else' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2508:1: (lv_others_3_1= 'others' | lv_others_3_2= 'else' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2508:1: (lv_others_3_1= 'others' | lv_others_3_2= 'else' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==66) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==56) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2509:3: lv_others_3_1= 'others'
                            {
                            lv_others_3_1=(Token)match(input,66,FOLLOW_66_in_rulePoints5158); 

                                    newLeafNode(lv_others_3_1, grammarAccess.getPointsAccess().getOthersOthersKeyword_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPointsRule());
                            	        }
                                   		setWithLastConsumed(current, "others", true, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2521:8: lv_others_3_2= 'else'
                            {
                            lv_others_3_2=(Token)match(input,56,FOLLOW_56_in_rulePoints5187); 

                                    newLeafNode(lv_others_3_2, grammarAccess.getPointsAccess().getOthersElseKeyword_2_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPointsRule());
                            	        }
                                   		setWithLastConsumed(current, "others", true, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2537:6: ( (lv_params_4_0= ruleParams ) )+
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2537:6: ( (lv_params_4_0= ruleParams ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=70 && LA52_0<=71)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2538:1: (lv_params_4_0= ruleParams )
                    	    {
                    	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2538:1: (lv_params_4_0= ruleParams )
                    	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2539:3: lv_params_4_0= ruleParams
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPointsAccess().getParamsParamsParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParams_in_rulePoints5230);
                    	    lv_params_4_0=ruleParams();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPointsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
                    	            		"Params");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getPointsAccess().getEndParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleEnd_in_rulePoints5248);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePoints"


    // $ANTLR start "entryRuleOutcomesPoints"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2571:1: entryRuleOutcomesPoints returns [EObject current=null] : iv_ruleOutcomesPoints= ruleOutcomesPoints EOF ;
    public final EObject entryRuleOutcomesPoints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcomesPoints = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2572:2: (iv_ruleOutcomesPoints= ruleOutcomesPoints EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2573:2: iv_ruleOutcomesPoints= ruleOutcomesPoints EOF
            {
             newCompositeNode(grammarAccess.getOutcomesPointsRule()); 
            pushFollow(FOLLOW_ruleOutcomesPoints_in_entryRuleOutcomesPoints5283);
            iv_ruleOutcomesPoints=ruleOutcomesPoints();

            state._fsp--;

             current =iv_ruleOutcomesPoints; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutcomesPoints5293); 

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
    // $ANTLR end "entryRuleOutcomesPoints"


    // $ANTLR start "ruleOutcomesPoints"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2580:1: ruleOutcomesPoints returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_resetValue_2_0= '=' ) )? ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleOutcomesPoints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_resetValue_2_0=null;
        Token otherlv_4=null;
        EObject lv_pts_3_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2583:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_resetValue_2_0= '=' ) )? ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_resetValue_2_0= '=' ) )? ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_resetValue_2_0= '=' ) )? ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_resetValue_2_0= '=' ) )? ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==60) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2584:3: ( (otherlv_0= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2585:1: (otherlv_0= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2585:1: (otherlv_0= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2586:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomesPointsRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutcomesPoints5339); 

                    		newLeafNode(otherlv_0, grammarAccess.getOutcomesPointsAccess().getOutcomeOutcomeCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleOutcomesPoints5351); 

                        	newLeafNode(otherlv_1, grammarAccess.getOutcomesPointsAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2601:3: ( (lv_resetValue_2_0= '=' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2602:1: (lv_resetValue_2_0= '=' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2602:1: (lv_resetValue_2_0= '=' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2603:3: lv_resetValue_2_0= '='
                    {
                    lv_resetValue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleOutcomesPoints5371); 

                            newLeafNode(lv_resetValue_2_0, grammarAccess.getOutcomesPointsAccess().getResetValueEqualsSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomesPointsRule());
                    	        }
                           		setWithLastConsumed(current, "resetValue", true, "=");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2616:3: ( ( (lv_pts_3_0= rulePoint ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT||LA56_0==34) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2616:4: ( (lv_pts_3_0= rulePoint ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2616:4: ( (lv_pts_3_0= rulePoint ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2617:1: (lv_pts_3_0= rulePoint )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2617:1: (lv_pts_3_0= rulePoint )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2618:3: lv_pts_3_0= rulePoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutcomesPointsAccess().getPtsPointParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleOutcomesPoints5407);
                    lv_pts_3_0=rulePoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutcomesPointsRule());
                    	        }
                           		set(
                           			current, 
                           			"pts",
                            		lv_pts_3_0, 
                            		"Point");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2635:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2635:6: ( (otherlv_4= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2636:1: (otherlv_4= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2636:1: (otherlv_4= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2637:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomesPointsRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutcomesPoints5433); 

                    		newLeafNode(otherlv_4, grammarAccess.getOutcomesPointsAccess().getVarParameterCrossReference_2_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleOutcomesPoints"


    // $ANTLR start "entryRulePoint"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2656:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2657:2: (iv_rulePoint= rulePoint EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2658:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint5470);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint5480); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2665:1: rulePoint returns [EObject current=null] : ( ( (lv_negative_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_negative_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2668:28: ( ( ( (lv_negative_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2669:1: ( ( (lv_negative_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2669:1: ( ( (lv_negative_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2669:2: ( (lv_negative_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2669:2: ( (lv_negative_0_0= '-' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==34) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2670:1: (lv_negative_0_0= '-' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2670:1: (lv_negative_0_0= '-' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2671:3: lv_negative_0_0= '-'
                    {
                    lv_negative_0_0=(Token)match(input,34,FOLLOW_34_in_rulePoint5523); 

                            newLeafNode(lv_negative_0_0, grammarAccess.getPointAccess().getNegativeHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPointRule());
                    	        }
                           		setWithLastConsumed(current, "negative", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2684:3: ( (lv_value_1_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2685:1: (lv_value_1_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2685:1: (lv_value_1_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2686:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint5554); 

            			newLeafNode(lv_value_1_0, grammarAccess.getPointAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleSign"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2710:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2711:2: (iv_ruleSign= ruleSign EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2712:2: iv_ruleSign= ruleSign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_ruleSign_in_entryRuleSign5596);
            iv_ruleSign=ruleSign();

            state._fsp--;

             current =iv_ruleSign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSign5607); 

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
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2719:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2722:28: ( (kw= '+' | kw= '-' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2723:1: (kw= '+' | kw= '-' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2723:1: (kw= '+' | kw= '-' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==68) ) {
                alt58=1;
            }
            else if ( (LA58_0==34) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2724:2: kw= '+'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleSign5645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2731:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleSign5664); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleParams"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2744:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2745:2: (iv_ruleParams= ruleParams EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2746:2: iv_ruleParams= ruleParams EOF
            {
             newCompositeNode(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_ruleParams_in_entryRuleParams5704);
            iv_ruleParams=ruleParams();

            state._fsp--;

             current =iv_ruleParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParams5714); 

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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2753:1: ruleParams returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_values_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2756:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_values_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )* ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_values_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )* )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_values_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )* )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_values_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )*
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==12) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2757:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2758:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2758:1: (lv_name_0_0= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2759:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParams5757); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getParamsAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleParams5774); 

                        	newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2779:3: ( (lv_values_2_0= ruleParam ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2780:1: (lv_values_2_0= ruleParam )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2780:1: (lv_values_2_0= ruleParam )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2781:3: lv_values_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getParamsAccess().getValuesParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleParams5797);
            lv_values_2_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamsRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2797:2: (otherlv_3= ',' ( (lv_values_4_0= ruleParam ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==21) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2797:4: otherlv_3= ',' ( (lv_values_4_0= ruleParam ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleParams5810); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamsAccess().getCommaKeyword_2_0());
            	        
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2801:1: ( (lv_values_4_0= ruleParam ) )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2802:1: (lv_values_4_0= ruleParam )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2802:1: (lv_values_4_0= ruleParam )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2803:3: lv_values_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsAccess().getValuesParamParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleParams5831);
            	    lv_values_4_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleParam"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2827:1: entryRuleParam returns [String current=null] : iv_ruleParam= ruleParam EOF ;
    public final String entryRuleParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParam = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2828:2: (iv_ruleParam= ruleParam EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2829:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam5870);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam5881); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2836:1: ruleParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOL_3= ruleBOOL | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_BOOL_3 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2839:28: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOL_3= ruleBOOL | this_ID_4= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2840:1: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOL_3= ruleBOOL | this_ID_4= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2840:1: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOL_3= ruleBOOL | this_ID_4= RULE_ID )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==EOF||(LA61_1>=RULE_STRING && LA61_1<=RULE_ID)||LA61_1==11||LA61_1==21||LA61_1==64||(LA61_1>=70 && LA61_1<=71)) ) {
                    alt61=1;
                }
                else if ( (LA61_1==69) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt61=3;
                }
                break;
            case 70:
            case 71:
                {
                alt61=4;
                }
                break;
            case RULE_ID:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2840:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam5921); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getParamAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2849:5: this_FLOAT_1= ruleFLOAT
                    {
                     
                            newCompositeNode(grammarAccess.getParamAccess().getFLOATParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleParam5954);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    		current.merge(this_FLOAT_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2860:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam5980); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getParamAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2869:5: this_BOOL_3= ruleBOOL
                    {
                     
                            newCompositeNode(grammarAccess.getParamAccess().getBOOLParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBOOL_in_ruleParam6013);
                    this_BOOL_3=ruleBOOL();

                    state._fsp--;


                    		current.merge(this_BOOL_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2880:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam6039); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getParamAccess().getIDTerminalRuleCall_4()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFLOAT"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2895:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2896:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2897:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT6085);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT6096); 

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2904:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2907:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2908:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2908:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2908:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT6136); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2915:1: (kw= '.' this_INT_2= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2916:2: kw= '.' this_INT_2= RULE_INT
            {
            kw=(Token)match(input,69,FOLLOW_69_in_ruleFLOAT6155); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT6170); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1()); 
                

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleBOOL"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2936:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2937:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2938:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL6217);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL6228); 

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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2945:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2948:28: ( (kw= 'true' | kw= 'false' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2949:1: (kw= 'true' | kw= 'false' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2949:1: (kw= 'true' | kw= 'false' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==70) ) {
                alt62=1;
            }
            else if ( (LA62_0==71) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2950:2: kw= 'true'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBOOL6266); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2957:2: kw= 'false'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleBOOL6285); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleReactions"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2970:1: entryRuleReactions returns [EObject current=null] : iv_ruleReactions= ruleReactions EOF ;
    public final EObject entryRuleReactions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactions = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2971:2: (iv_ruleReactions= ruleReactions EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2972:2: iv_ruleReactions= ruleReactions EOF
            {
             newCompositeNode(grammarAccess.getReactionsRule()); 
            pushFollow(FOLLOW_ruleReactions_in_entryRuleReactions6325);
            iv_ruleReactions=ruleReactions();

            state._fsp--;

             current =iv_ruleReactions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactions6335); 

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
    // $ANTLR end "entryRuleReactions"


    // $ANTLR start "ruleReactions"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2979:1: ruleReactions returns [EObject current=null] : (otherlv_0= 'When' ( (lv_reaction_1_0= ruleReaction ) )+ ruleEnd ) ;
    public final EObject ruleReactions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reaction_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2982:28: ( (otherlv_0= 'When' ( (lv_reaction_1_0= ruleReaction ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2983:1: (otherlv_0= 'When' ( (lv_reaction_1_0= ruleReaction ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2983:1: (otherlv_0= 'When' ( (lv_reaction_1_0= ruleReaction ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2983:3: otherlv_0= 'When' ( (lv_reaction_1_0= ruleReaction ) )+ ruleEnd
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleReactions6372); 

                	newLeafNode(otherlv_0, grammarAccess.getReactionsAccess().getWhenKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2987:1: ( (lv_reaction_1_0= ruleReaction ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID||LA63_0==56||LA63_0==66||(LA63_0>=73 && LA63_0<=74)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2988:1: (lv_reaction_1_0= ruleReaction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2988:1: (lv_reaction_1_0= ruleReaction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:2989:3: lv_reaction_1_0= ruleReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReactionsAccess().getReactionReactionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReaction_in_ruleReactions6393);
            	    lv_reaction_1_0=ruleReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReactionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reaction",
            	            		lv_reaction_1_0, 
            	            		"Reaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getReactionsAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleReactions6410);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleReactions"


    // $ANTLR start "entryRuleReaction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3021:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3022:2: (iv_ruleReaction= ruleReaction EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3023:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_ruleReaction_in_entryRuleReaction6445);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReaction6455); 

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3030:1: ruleReaction returns [EObject current=null] : ( ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_delayed_5_0= 'delayed' ) )? ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_immediate_4_0=null;
        Token lv_delayed_5_0=null;
        EObject lv_paramsC_0_0 = null;

        EObject lv_pointsC_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3033:28: ( ( ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_delayed_5_0= 'delayed' ) )? ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:1: ( ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_delayed_5_0= 'delayed' ) )? )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:1: ( ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_delayed_5_0= 'delayed' ) )? )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:2: ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_delayed_5_0= 'delayed' ) )?
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:2: ( ( (lv_paramsC_0_0= ruleParamCondition ) ) | ( (lv_pointsC_1_0= rulePointsCondition ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==56||LA64_0==66) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=73 && LA64_0<=74)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:3: ( (lv_paramsC_0_0= ruleParamCondition ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3034:3: ( (lv_paramsC_0_0= ruleParamCondition ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3035:1: (lv_paramsC_0_0= ruleParamCondition )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3035:1: (lv_paramsC_0_0= ruleParamCondition )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3036:3: lv_paramsC_0_0= ruleParamCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getReactionAccess().getParamsCParamConditionParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamCondition_in_ruleReaction6502);
                    lv_paramsC_0_0=ruleParamCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReactionRule());
                    	        }
                           		set(
                           			current, 
                           			"paramsC",
                            		lv_paramsC_0_0, 
                            		"ParamCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3053:6: ( (lv_pointsC_1_0= rulePointsCondition ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3053:6: ( (lv_pointsC_1_0= rulePointsCondition ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3054:1: (lv_pointsC_1_0= rulePointsCondition )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3054:1: (lv_pointsC_1_0= rulePointsCondition )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3055:3: lv_pointsC_1_0= rulePointsCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getReactionAccess().getPointsCPointsConditionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePointsCondition_in_ruleReaction6529);
                    lv_pointsC_1_0=rulePointsCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReactionRule());
                    	        }
                           		set(
                           			current, 
                           			"pointsC",
                            		lv_pointsC_1_0, 
                            		"PointsCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleReaction6542); 

                	newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getColonKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3075:1: ( (otherlv_3= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3076:1: (otherlv_3= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3076:1: (otherlv_3= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3077:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReaction6562); 

            		newLeafNode(otherlv_3, grammarAccess.getReactionAccess().getFeedbackFeedbackCrossReference_2_0()); 
            	

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3088:2: ( (lv_immediate_4_0= 'immediate' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==61) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3089:1: (lv_immediate_4_0= 'immediate' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3089:1: (lv_immediate_4_0= 'immediate' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3090:3: lv_immediate_4_0= 'immediate'
                    {
                    lv_immediate_4_0=(Token)match(input,61,FOLLOW_61_in_ruleReaction6580); 

                            newLeafNode(lv_immediate_4_0, grammarAccess.getReactionAccess().getImmediateImmediateKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReactionRule());
                    	        }
                           		setWithLastConsumed(current, "immediate", true, "immediate");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3103:3: ( (lv_delayed_5_0= 'delayed' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==62) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3104:1: (lv_delayed_5_0= 'delayed' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3104:1: (lv_delayed_5_0= 'delayed' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3105:3: lv_delayed_5_0= 'delayed'
                    {
                    lv_delayed_5_0=(Token)match(input,62,FOLLOW_62_in_ruleReaction6612); 

                            newLeafNode(lv_delayed_5_0, grammarAccess.getReactionAccess().getDelayedDelayedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReactionRule());
                    	        }
                           		setWithLastConsumed(current, "delayed", true, "delayed");
                    	    

                    }


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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleParamCondition"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3126:1: entryRuleParamCondition returns [EObject current=null] : iv_ruleParamCondition= ruleParamCondition EOF ;
    public final EObject entryRuleParamCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCondition = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3127:2: (iv_ruleParamCondition= ruleParamCondition EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3128:2: iv_ruleParamCondition= ruleParamCondition EOF
            {
             newCompositeNode(grammarAccess.getParamConditionRule()); 
            pushFollow(FOLLOW_ruleParamCondition_in_entryRuleParamCondition6662);
            iv_ruleParamCondition=ruleParamCondition();

            state._fsp--;

             current =iv_ruleParamCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCondition6672); 

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
    // $ANTLR end "entryRuleParamCondition"


    // $ANTLR start "ruleParamCondition"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3135:1: ruleParamCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) ) ) ;
    public final EObject ruleParamCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionOther_1_1=null;
        Token lv_conditionOther_1_2=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3138:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3139:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3139:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==56||LA68_0==66) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3139:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3139:2: ( (otherlv_0= RULE_ID ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3140:1: (otherlv_0= RULE_ID )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3140:1: (otherlv_0= RULE_ID )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3141:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamConditionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamCondition6717); 

                    		newLeafNode(otherlv_0, grammarAccess.getParamConditionAccess().getParamsParamsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3153:6: ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3153:6: ( ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3154:1: ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3154:1: ( (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3155:1: (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3155:1: (lv_conditionOther_1_1= 'others' | lv_conditionOther_1_2= 'else' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==66) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==56) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3156:3: lv_conditionOther_1_1= 'others'
                            {
                            lv_conditionOther_1_1=(Token)match(input,66,FOLLOW_66_in_ruleParamCondition6743); 

                                    newLeafNode(lv_conditionOther_1_1, grammarAccess.getParamConditionAccess().getConditionOtherOthersKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParamConditionRule());
                            	        }
                                   		setWithLastConsumed(current, "conditionOther", true, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3168:8: lv_conditionOther_1_2= 'else'
                            {
                            lv_conditionOther_1_2=(Token)match(input,56,FOLLOW_56_in_ruleParamCondition6772); 

                                    newLeafNode(lv_conditionOther_1_2, grammarAccess.getParamConditionAccess().getConditionOtherElseKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParamConditionRule());
                            	        }
                                   		setWithLastConsumed(current, "conditionOther", true, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleParamCondition"


    // $ANTLR start "entryRulePointsCondition"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3191:1: entryRulePointsCondition returns [EObject current=null] : iv_rulePointsCondition= rulePointsCondition EOF ;
    public final EObject entryRulePointsCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointsCondition = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3192:2: (iv_rulePointsCondition= rulePointsCondition EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3193:2: iv_rulePointsCondition= rulePointsCondition EOF
            {
             newCompositeNode(grammarAccess.getPointsConditionRule()); 
            pushFollow(FOLLOW_rulePointsCondition_in_entryRulePointsCondition6824);
            iv_rulePointsCondition=rulePointsCondition();

            state._fsp--;

             current =iv_rulePointsCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointsCondition6834); 

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
    // $ANTLR end "entryRulePointsCondition"


    // $ANTLR start "rulePointsCondition"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3200:1: rulePointsCondition returns [EObject current=null] : ( ( (lv_keyWd_0_0= rulePointsKeyWd ) ) otherlv_1= '(' ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) ) otherlv_4= ')' ) ;
    public final EObject rulePointsCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_keyWd_0_0 = null;

        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3203:28: ( ( ( (lv_keyWd_0_0= rulePointsKeyWd ) ) otherlv_1= '(' ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) ) otherlv_4= ')' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3204:1: ( ( (lv_keyWd_0_0= rulePointsKeyWd ) ) otherlv_1= '(' ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) ) otherlv_4= ')' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3204:1: ( ( (lv_keyWd_0_0= rulePointsKeyWd ) ) otherlv_1= '(' ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) ) otherlv_4= ')' )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3204:2: ( (lv_keyWd_0_0= rulePointsKeyWd ) ) otherlv_1= '(' ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) ) otherlv_4= ')'
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3204:2: ( (lv_keyWd_0_0= rulePointsKeyWd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3205:1: (lv_keyWd_0_0= rulePointsKeyWd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3205:1: (lv_keyWd_0_0= rulePointsKeyWd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3206:3: lv_keyWd_0_0= rulePointsKeyWd
            {
             
            	        newCompositeNode(grammarAccess.getPointsConditionAccess().getKeyWdPointsKeyWdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePointsKeyWd_in_rulePointsCondition6880);
            lv_keyWd_0_0=rulePointsKeyWd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointsConditionRule());
            	        }
                   		set(
                   			current, 
                   			"keyWd",
                    		lv_keyWd_0_0, 
                    		"PointsKeyWd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePointsCondition6892); 

                	newLeafNode(otherlv_1, grammarAccess.getPointsConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3226:1: ( ( (lv_sign_2_0= ruleSign ) ) | ( (lv_value_3_0= rulePoint ) ) )
            int alt69=2;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt69=1;
                }
                break;
            case 34:
                {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==22) ) {
                    alt69=1;
                }
                else if ( (LA69_2==RULE_INT) ) {
                    alt69=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt69=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3226:2: ( (lv_sign_2_0= ruleSign ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3226:2: ( (lv_sign_2_0= ruleSign ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3227:1: (lv_sign_2_0= ruleSign )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3227:1: (lv_sign_2_0= ruleSign )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3228:3: lv_sign_2_0= ruleSign
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointsConditionAccess().getSignSignParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSign_in_rulePointsCondition6914);
                    lv_sign_2_0=ruleSign();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointsConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"sign",
                            		lv_sign_2_0, 
                            		"Sign");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3245:6: ( (lv_value_3_0= rulePoint ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3245:6: ( (lv_value_3_0= rulePoint ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3246:1: (lv_value_3_0= rulePoint )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3246:1: (lv_value_3_0= rulePoint )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3247:3: lv_value_3_0= rulePoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointsConditionAccess().getValuePointParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_rulePointsCondition6941);
                    lv_value_3_0=rulePoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointsConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Point");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_rulePointsCondition6954); 

                	newLeafNode(otherlv_4, grammarAccess.getPointsConditionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePointsCondition"


    // $ANTLR start "entryRulePointsKeyWd"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3275:1: entryRulePointsKeyWd returns [String current=null] : iv_rulePointsKeyWd= rulePointsKeyWd EOF ;
    public final String entryRulePointsKeyWd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointsKeyWd = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3276:2: (iv_rulePointsKeyWd= rulePointsKeyWd EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3277:2: iv_rulePointsKeyWd= rulePointsKeyWd EOF
            {
             newCompositeNode(grammarAccess.getPointsKeyWdRule()); 
            pushFollow(FOLLOW_rulePointsKeyWd_in_entryRulePointsKeyWd6991);
            iv_rulePointsKeyWd=rulePointsKeyWd();

            state._fsp--;

             current =iv_rulePointsKeyWd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointsKeyWd7002); 

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
    // $ANTLR end "entryRulePointsKeyWd"


    // $ANTLR start "rulePointsKeyWd"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3284:1: rulePointsKeyWd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'all' ) ;
    public final AntlrDatatypeRuleToken rulePointsKeyWd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3287:28: ( (kw= 'any' | kw= 'all' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3288:1: (kw= 'any' | kw= 'all' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3288:1: (kw= 'any' | kw= 'all' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==73) ) {
                alt70=1;
            }
            else if ( (LA70_0==74) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3289:2: kw= 'any'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_rulePointsKeyWd7040); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointsKeyWdAccess().getAnyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3296:2: kw= 'all'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_rulePointsKeyWd7059); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointsKeyWdAccess().getAllKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "rulePointsKeyWd"


    // $ANTLR start "entryRuleFeedbackModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3309:1: entryRuleFeedbackModel returns [EObject current=null] : iv_ruleFeedbackModel= ruleFeedbackModel EOF ;
    public final EObject entryRuleFeedbackModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackModel = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3310:2: (iv_ruleFeedbackModel= ruleFeedbackModel EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3311:2: iv_ruleFeedbackModel= ruleFeedbackModel EOF
            {
             newCompositeNode(grammarAccess.getFeedbackModelRule()); 
            pushFollow(FOLLOW_ruleFeedbackModel_in_entryRuleFeedbackModel7099);
            iv_ruleFeedbackModel=ruleFeedbackModel();

            state._fsp--;

             current =iv_ruleFeedbackModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackModel7109); 

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
    // $ANTLR end "entryRuleFeedbackModel"


    // $ANTLR start "ruleFeedbackModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3318:1: ruleFeedbackModel returns [EObject current=null] : (otherlv_0= 'Feedback-model' ( (lv_triggers_1_0= ruleTrigger ) )+ ruleEnd ) ;
    public final EObject ruleFeedbackModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_triggers_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3321:28: ( (otherlv_0= 'Feedback-model' ( (lv_triggers_1_0= ruleTrigger ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3322:1: (otherlv_0= 'Feedback-model' ( (lv_triggers_1_0= ruleTrigger ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3322:1: (otherlv_0= 'Feedback-model' ( (lv_triggers_1_0= ruleTrigger ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3322:3: otherlv_0= 'Feedback-model' ( (lv_triggers_1_0= ruleTrigger ) )+ ruleEnd
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleFeedbackModel7146); 

                	newLeafNode(otherlv_0, grammarAccess.getFeedbackModelAccess().getFeedbackModelKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3326:1: ( (lv_triggers_1_0= ruleTrigger ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID||LA71_0==78) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3327:1: (lv_triggers_1_0= ruleTrigger )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3327:1: (lv_triggers_1_0= ruleTrigger )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3328:3: lv_triggers_1_0= ruleTrigger
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeedbackModelAccess().getTriggersTriggerParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrigger_in_ruleFeedbackModel7167);
            	    lv_triggers_1_0=ruleTrigger();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeedbackModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggers",
            	            		lv_triggers_1_0, 
            	            		"Trigger");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getFeedbackModelAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleFeedbackModel7184);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFeedbackModel"


    // $ANTLR start "entryRuleTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3360:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3361:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3362:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger7219);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger7229); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3369:1: ruleTrigger returns [EObject current=null] : ( ( (lv_perf_0_0= ruleOutcomeValueLimit ) ) | ( (lv_inactivity_1_0= ruleInactivityLimit ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject lv_perf_0_0 = null;

        EObject lv_inactivity_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3372:28: ( ( ( (lv_perf_0_0= ruleOutcomeValueLimit ) ) | ( (lv_inactivity_1_0= ruleInactivityLimit ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3373:1: ( ( (lv_perf_0_0= ruleOutcomeValueLimit ) ) | ( (lv_inactivity_1_0= ruleInactivityLimit ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3373:1: ( ( (lv_perf_0_0= ruleOutcomeValueLimit ) ) | ( (lv_inactivity_1_0= ruleInactivityLimit ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==78) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3373:2: ( (lv_perf_0_0= ruleOutcomeValueLimit ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3373:2: ( (lv_perf_0_0= ruleOutcomeValueLimit ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3374:1: (lv_perf_0_0= ruleOutcomeValueLimit )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3374:1: (lv_perf_0_0= ruleOutcomeValueLimit )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3375:3: lv_perf_0_0= ruleOutcomeValueLimit
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getPerfOutcomeValueLimitParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutcomeValueLimit_in_ruleTrigger7275);
                    lv_perf_0_0=ruleOutcomeValueLimit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"perf",
                            		lv_perf_0_0, 
                            		"OutcomeValueLimit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3392:6: ( (lv_inactivity_1_0= ruleInactivityLimit ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3392:6: ( (lv_inactivity_1_0= ruleInactivityLimit ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3393:1: (lv_inactivity_1_0= ruleInactivityLimit )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3393:1: (lv_inactivity_1_0= ruleInactivityLimit )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3394:3: lv_inactivity_1_0= ruleInactivityLimit
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getInactivityInactivityLimitParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInactivityLimit_in_ruleTrigger7302);
                    lv_inactivity_1_0=ruleInactivityLimit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"inactivity",
                            		lv_inactivity_1_0, 
                            		"InactivityLimit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleOutcomeValueLimit"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3418:1: entryRuleOutcomeValueLimit returns [EObject current=null] : iv_ruleOutcomeValueLimit= ruleOutcomeValueLimit EOF ;
    public final EObject entryRuleOutcomeValueLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcomeValueLimit = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3419:2: (iv_ruleOutcomeValueLimit= ruleOutcomeValueLimit EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3420:2: iv_ruleOutcomeValueLimit= ruleOutcomeValueLimit EOF
            {
             newCompositeNode(grammarAccess.getOutcomeValueLimitRule()); 
            pushFollow(FOLLOW_ruleOutcomeValueLimit_in_entryRuleOutcomeValueLimit7338);
            iv_ruleOutcomeValueLimit=ruleOutcomeValueLimit();

            state._fsp--;

             current =iv_ruleOutcomeValueLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutcomeValueLimit7348); 

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
    // $ANTLR end "entryRuleOutcomeValueLimit"


    // $ANTLR start "ruleOutcomeValueLimit"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3427:1: ruleOutcomeValueLimit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ ) ;
    public final EObject ruleOutcomeValueLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_negativeLimit_2_0=null;
        Token lv_limit_3_0=null;
        AntlrDatatypeRuleToken lv_sign_1_0 = null;

        EObject lv_triggerReactions_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3430:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3431:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3431:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3431:2: ( (otherlv_0= RULE_ID ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3431:2: ( (otherlv_0= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3432:1: (otherlv_0= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3432:1: (otherlv_0= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3433:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutcomeValueLimitRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutcomeValueLimit7393); 

            		newLeafNode(otherlv_0, grammarAccess.getOutcomeValueLimitAccess().getOutcomeOutcomeCrossReference_0_0()); 
            	

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3444:2: ( (lv_sign_1_0= ruleCompSign ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3445:1: (lv_sign_1_0= ruleCompSign )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3445:1: (lv_sign_1_0= ruleCompSign )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3446:3: lv_sign_1_0= ruleCompSign
            {
             
            	        newCompositeNode(grammarAccess.getOutcomeValueLimitAccess().getSignCompSignParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCompSign_in_ruleOutcomeValueLimit7414);
            lv_sign_1_0=ruleCompSign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutcomeValueLimitRule());
            	        }
                   		set(
                   			current, 
                   			"sign",
                    		lv_sign_1_0, 
                    		"CompSign");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3462:2: ( (lv_negativeLimit_2_0= '-' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==34) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3463:1: (lv_negativeLimit_2_0= '-' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3463:1: (lv_negativeLimit_2_0= '-' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3464:3: lv_negativeLimit_2_0= '-'
                    {
                    lv_negativeLimit_2_0=(Token)match(input,34,FOLLOW_34_in_ruleOutcomeValueLimit7432); 

                            newLeafNode(lv_negativeLimit_2_0, grammarAccess.getOutcomeValueLimitAccess().getNegativeLimitHyphenMinusKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutcomeValueLimitRule());
                    	        }
                           		setWithLastConsumed(current, "negativeLimit", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3477:3: ( (lv_limit_3_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3478:1: (lv_limit_3_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3478:1: (lv_limit_3_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3479:3: lv_limit_3_0= RULE_INT
            {
            lv_limit_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOutcomeValueLimit7463); 

            			newLeafNode(lv_limit_3_0, grammarAccess.getOutcomeValueLimitAccess().getLimitINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutcomeValueLimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limit",
                    		lv_limit_3_0, 
                    		"INT");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3495:2: ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==12) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3496:1: (lv_triggerReactions_4_0= ruleTriggerFeedback )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3496:1: (lv_triggerReactions_4_0= ruleTriggerFeedback )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3497:3: lv_triggerReactions_4_0= ruleTriggerFeedback
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutcomeValueLimitAccess().getTriggerReactionsTriggerFeedbackParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTriggerFeedback_in_ruleOutcomeValueLimit7489);
            	    lv_triggerReactions_4_0=ruleTriggerFeedback();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutcomeValueLimitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggerReactions",
            	            		lv_triggerReactions_4_0, 
            	            		"TriggerFeedback");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // $ANTLR end "ruleOutcomeValueLimit"


    // $ANTLR start "entryRuleCompSign"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3521:1: entryRuleCompSign returns [String current=null] : iv_ruleCompSign= ruleCompSign EOF ;
    public final String entryRuleCompSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompSign = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3522:2: (iv_ruleCompSign= ruleCompSign EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3523:2: iv_ruleCompSign= ruleCompSign EOF
            {
             newCompositeNode(grammarAccess.getCompSignRule()); 
            pushFollow(FOLLOW_ruleCompSign_in_entryRuleCompSign7527);
            iv_ruleCompSign=ruleCompSign();

            state._fsp--;

             current =iv_ruleCompSign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompSign7538); 

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
    // $ANTLR end "entryRuleCompSign"


    // $ANTLR start "ruleCompSign"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3530:1: ruleCompSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleCompSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3533:28: ( (kw= '<' | kw= '>' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3534:1: (kw= '<' | kw= '>' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3534:1: (kw= '<' | kw= '>' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==76) ) {
                alt75=1;
            }
            else if ( (LA75_0==77) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3535:2: kw= '<'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleCompSign7576); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompSignAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3542:2: kw= '>'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleCompSign7595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompSignAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleCompSign"


    // $ANTLR start "entryRuleInactivityLimit"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3555:1: entryRuleInactivityLimit returns [EObject current=null] : iv_ruleInactivityLimit= ruleInactivityLimit EOF ;
    public final EObject entryRuleInactivityLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInactivityLimit = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3556:2: (iv_ruleInactivityLimit= ruleInactivityLimit EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3557:2: iv_ruleInactivityLimit= ruleInactivityLimit EOF
            {
             newCompositeNode(grammarAccess.getInactivityLimitRule()); 
            pushFollow(FOLLOW_ruleInactivityLimit_in_entryRuleInactivityLimit7635);
            iv_ruleInactivityLimit=ruleInactivityLimit();

            state._fsp--;

             current =iv_ruleInactivityLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInactivityLimit7645); 

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
    // $ANTLR end "entryRuleInactivityLimit"


    // $ANTLR start "ruleInactivityLimit"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3564:1: ruleInactivityLimit returns [EObject current=null] : (otherlv_0= 'inactivity' ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_triggerReactions_4_0= ruleActionReaction ) )+ ) ;
    public final EObject ruleInactivityLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_limit_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_sign_1_0 = null;

        EObject lv_triggerReactions_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3567:28: ( (otherlv_0= 'inactivity' ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_triggerReactions_4_0= ruleActionReaction ) )+ ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3568:1: (otherlv_0= 'inactivity' ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_triggerReactions_4_0= ruleActionReaction ) )+ )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3568:1: (otherlv_0= 'inactivity' ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_triggerReactions_4_0= ruleActionReaction ) )+ )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3568:3: otherlv_0= 'inactivity' ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_limit_2_0= RULE_INT ) ) otherlv_3= 'sec' ( (lv_triggerReactions_4_0= ruleActionReaction ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleInactivityLimit7682); 

                	newLeafNode(otherlv_0, grammarAccess.getInactivityLimitAccess().getInactivityKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3572:1: ( (lv_sign_1_0= ruleCompSign ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3573:1: (lv_sign_1_0= ruleCompSign )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3573:1: (lv_sign_1_0= ruleCompSign )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3574:3: lv_sign_1_0= ruleCompSign
            {
             
            	        newCompositeNode(grammarAccess.getInactivityLimitAccess().getSignCompSignParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCompSign_in_ruleInactivityLimit7703);
            lv_sign_1_0=ruleCompSign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInactivityLimitRule());
            	        }
                   		set(
                   			current, 
                   			"sign",
                    		lv_sign_1_0, 
                    		"CompSign");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3590:2: ( (lv_limit_2_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3591:1: (lv_limit_2_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3591:1: (lv_limit_2_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3592:3: lv_limit_2_0= RULE_INT
            {
            lv_limit_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInactivityLimit7720); 

            			newLeafNode(lv_limit_2_0, grammarAccess.getInactivityLimitAccess().getLimitINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInactivityLimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limit",
                    		lv_limit_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleInactivityLimit7737); 

                	newLeafNode(otherlv_3, grammarAccess.getInactivityLimitAccess().getSecKeyword_3());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3612:1: ( (lv_triggerReactions_4_0= ruleActionReaction ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==60) ) {
                        alt76=1;
                    }


                }
                else if ( (LA76_0==12) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3613:1: (lv_triggerReactions_4_0= ruleActionReaction )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3613:1: (lv_triggerReactions_4_0= ruleActionReaction )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3614:3: lv_triggerReactions_4_0= ruleActionReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInactivityLimitAccess().getTriggerReactionsActionReactionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionReaction_in_ruleInactivityLimit7758);
            	    lv_triggerReactions_4_0=ruleActionReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInactivityLimitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggerReactions",
            	            		lv_triggerReactions_4_0, 
            	            		"ActionReaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
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
    // $ANTLR end "ruleInactivityLimit"


    // $ANTLR start "entryRuleBadgeModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3638:1: entryRuleBadgeModel returns [EObject current=null] : iv_ruleBadgeModel= ruleBadgeModel EOF ;
    public final EObject entryRuleBadgeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBadgeModel = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3639:2: (iv_ruleBadgeModel= ruleBadgeModel EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3640:2: iv_ruleBadgeModel= ruleBadgeModel EOF
            {
             newCompositeNode(grammarAccess.getBadgeModelRule()); 
            pushFollow(FOLLOW_ruleBadgeModel_in_entryRuleBadgeModel7795);
            iv_ruleBadgeModel=ruleBadgeModel();

            state._fsp--;

             current =iv_ruleBadgeModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBadgeModel7805); 

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
    // $ANTLR end "entryRuleBadgeModel"


    // $ANTLR start "ruleBadgeModel"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3647:1: ruleBadgeModel returns [EObject current=null] : (otherlv_0= 'Badge-model' ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+ ruleEnd ) ;
    public final EObject ruleBadgeModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_genericTriggers_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3650:28: ( (otherlv_0= 'Badge-model' ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+ ruleEnd ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3651:1: (otherlv_0= 'Badge-model' ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+ ruleEnd )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3651:1: (otherlv_0= 'Badge-model' ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+ ruleEnd )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3651:3: otherlv_0= 'Badge-model' ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+ ruleEnd
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleBadgeModel7842); 

                	newLeafNode(otherlv_0, grammarAccess.getBadgeModelAccess().getBadgeModelKeyword_0());
                
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3655:1: ( (lv_genericTriggers_1_0= ruleGenericTrigger ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=80 && LA77_0<=87)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3656:1: (lv_genericTriggers_1_0= ruleGenericTrigger )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3656:1: (lv_genericTriggers_1_0= ruleGenericTrigger )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3657:3: lv_genericTriggers_1_0= ruleGenericTrigger
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBadgeModelAccess().getGenericTriggersGenericTriggerParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenericTrigger_in_ruleBadgeModel7863);
            	    lv_genericTriggers_1_0=ruleGenericTrigger();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBadgeModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"genericTriggers",
            	            		lv_genericTriggers_1_0, 
            	            		"GenericTrigger");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getBadgeModelAccess().getEndParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleEnd_in_ruleBadgeModel7880);
            ruleEnd();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleBadgeModel"


    // $ANTLR start "entryRuleGenericTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3689:1: entryRuleGenericTrigger returns [EObject current=null] : iv_ruleGenericTrigger= ruleGenericTrigger EOF ;
    public final EObject entryRuleGenericTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTrigger = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3690:2: (iv_ruleGenericTrigger= ruleGenericTrigger EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3691:2: iv_ruleGenericTrigger= ruleGenericTrigger EOF
            {
             newCompositeNode(grammarAccess.getGenericTriggerRule()); 
            pushFollow(FOLLOW_ruleGenericTrigger_in_entryRuleGenericTrigger7915);
            iv_ruleGenericTrigger=ruleGenericTrigger();

            state._fsp--;

             current =iv_ruleGenericTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericTrigger7925); 

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
    // $ANTLR end "entryRuleGenericTrigger"


    // $ANTLR start "ruleGenericTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3698:1: ruleGenericTrigger returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimpleTrigger ) ) | ( (lv_lo_1_0= ruleLOTrigger ) ) ) ;
    public final EObject ruleGenericTrigger() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_lo_1_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3701:28: ( ( ( (lv_simple_0_0= ruleSimpleTrigger ) ) | ( (lv_lo_1_0= ruleLOTrigger ) ) ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3702:1: ( ( (lv_simple_0_0= ruleSimpleTrigger ) ) | ( (lv_lo_1_0= ruleLOTrigger ) ) )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3702:1: ( ( (lv_simple_0_0= ruleSimpleTrigger ) ) | ( (lv_lo_1_0= ruleLOTrigger ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=80 && LA78_0<=83)) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=84 && LA78_0<=87)) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3702:2: ( (lv_simple_0_0= ruleSimpleTrigger ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3702:2: ( (lv_simple_0_0= ruleSimpleTrigger ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3703:1: (lv_simple_0_0= ruleSimpleTrigger )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3703:1: (lv_simple_0_0= ruleSimpleTrigger )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3704:3: lv_simple_0_0= ruleSimpleTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericTriggerAccess().getSimpleSimpleTriggerParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleTrigger_in_ruleGenericTrigger7971);
                    lv_simple_0_0=ruleSimpleTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"SimpleTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3721:6: ( (lv_lo_1_0= ruleLOTrigger ) )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3721:6: ( (lv_lo_1_0= ruleLOTrigger ) )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3722:1: (lv_lo_1_0= ruleLOTrigger )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3722:1: (lv_lo_1_0= ruleLOTrigger )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3723:3: lv_lo_1_0= ruleLOTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericTriggerAccess().getLoLOTriggerParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLOTrigger_in_ruleGenericTrigger7998);
                    lv_lo_1_0=ruleLOTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"lo",
                            		lv_lo_1_0, 
                            		"LOTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleGenericTrigger"


    // $ANTLR start "entryRuleSimpleTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3747:1: entryRuleSimpleTrigger returns [EObject current=null] : iv_ruleSimpleTrigger= ruleSimpleTrigger EOF ;
    public final EObject entryRuleSimpleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTrigger = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3748:2: (iv_ruleSimpleTrigger= ruleSimpleTrigger EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3749:2: iv_ruleSimpleTrigger= ruleSimpleTrigger EOF
            {
             newCompositeNode(grammarAccess.getSimpleTriggerRule()); 
            pushFollow(FOLLOW_ruleSimpleTrigger_in_entryRuleSimpleTrigger8034);
            iv_ruleSimpleTrigger=ruleSimpleTrigger();

            state._fsp--;

             current =iv_ruleSimpleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTrigger8044); 

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
    // $ANTLR end "entryRuleSimpleTrigger"


    // $ANTLR start "ruleSimpleTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3756:1: ruleSimpleTrigger returns [EObject current=null] : ( ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ ) ;
    public final EObject ruleSimpleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_negativeLimit_2_0=null;
        Token lv_limit_3_0=null;
        AntlrDatatypeRuleToken lv_function_0_0 = null;

        AntlrDatatypeRuleToken lv_sign_1_0 = null;

        EObject lv_triggerReactions_4_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3759:28: ( ( ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3760:1: ( ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3760:1: ( ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+ )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3760:2: ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) ) ( (lv_sign_1_0= ruleCompSign ) ) ( (lv_negativeLimit_2_0= '-' ) )? ( (lv_limit_3_0= RULE_INT ) ) ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3760:2: ( (lv_function_0_0= ruleFeedbackKeywordsSimple ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3761:1: (lv_function_0_0= ruleFeedbackKeywordsSimple )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3761:1: (lv_function_0_0= ruleFeedbackKeywordsSimple )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3762:3: lv_function_0_0= ruleFeedbackKeywordsSimple
            {
             
            	        newCompositeNode(grammarAccess.getSimpleTriggerAccess().getFunctionFeedbackKeywordsSimpleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFeedbackKeywordsSimple_in_ruleSimpleTrigger8090);
            lv_function_0_0=ruleFeedbackKeywordsSimple();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_0_0, 
                    		"FeedbackKeywordsSimple");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3778:2: ( (lv_sign_1_0= ruleCompSign ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3779:1: (lv_sign_1_0= ruleCompSign )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3779:1: (lv_sign_1_0= ruleCompSign )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3780:3: lv_sign_1_0= ruleCompSign
            {
             
            	        newCompositeNode(grammarAccess.getSimpleTriggerAccess().getSignCompSignParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCompSign_in_ruleSimpleTrigger8111);
            lv_sign_1_0=ruleCompSign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"sign",
                    		lv_sign_1_0, 
                    		"CompSign");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3796:2: ( (lv_negativeLimit_2_0= '-' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==34) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3797:1: (lv_negativeLimit_2_0= '-' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3797:1: (lv_negativeLimit_2_0= '-' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3798:3: lv_negativeLimit_2_0= '-'
                    {
                    lv_negativeLimit_2_0=(Token)match(input,34,FOLLOW_34_in_ruleSimpleTrigger8129); 

                            newLeafNode(lv_negativeLimit_2_0, grammarAccess.getSimpleTriggerAccess().getNegativeLimitHyphenMinusKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleTriggerRule());
                    	        }
                           		setWithLastConsumed(current, "negativeLimit", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3811:3: ( (lv_limit_3_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3812:1: (lv_limit_3_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3812:1: (lv_limit_3_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3813:3: lv_limit_3_0= RULE_INT
            {
            lv_limit_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleTrigger8160); 

            			newLeafNode(lv_limit_3_0, grammarAccess.getSimpleTriggerAccess().getLimitINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTriggerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limit",
                    		lv_limit_3_0, 
                    		"INT");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3829:2: ( (lv_triggerReactions_4_0= ruleTriggerFeedback ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==12) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3830:1: (lv_triggerReactions_4_0= ruleTriggerFeedback )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3830:1: (lv_triggerReactions_4_0= ruleTriggerFeedback )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3831:3: lv_triggerReactions_4_0= ruleTriggerFeedback
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleTriggerAccess().getTriggerReactionsTriggerFeedbackParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTriggerFeedback_in_ruleSimpleTrigger8186);
            	    lv_triggerReactions_4_0=ruleTriggerFeedback();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleTriggerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggerReactions",
            	            		lv_triggerReactions_4_0, 
            	            		"TriggerFeedback");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
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
    // $ANTLR end "ruleSimpleTrigger"


    // $ANTLR start "entryRuleLOTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3855:1: entryRuleLOTrigger returns [EObject current=null] : iv_ruleLOTrigger= ruleLOTrigger EOF ;
    public final EObject entryRuleLOTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOTrigger = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3856:2: (iv_ruleLOTrigger= ruleLOTrigger EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3857:2: iv_ruleLOTrigger= ruleLOTrigger EOF
            {
             newCompositeNode(grammarAccess.getLOTriggerRule()); 
            pushFollow(FOLLOW_ruleLOTrigger_in_entryRuleLOTrigger8223);
            iv_ruleLOTrigger=ruleLOTrigger();

            state._fsp--;

             current =iv_ruleLOTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOTrigger8233); 

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
    // $ANTLR end "entryRuleLOTrigger"


    // $ANTLR start "ruleLOTrigger"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3864:1: ruleLOTrigger returns [EObject current=null] : ( ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_sign_2_0= ruleCompSign ) ) ( (lv_negativeLimit_3_0= '-' ) )? ( (lv_limit_4_0= RULE_INT ) ) ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+ ) ;
    public final EObject ruleLOTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_negativeLimit_3_0=null;
        Token lv_limit_4_0=null;
        AntlrDatatypeRuleToken lv_function_0_0 = null;

        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_triggerReactions_5_0 = null;


         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3867:28: ( ( ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_sign_2_0= ruleCompSign ) ) ( (lv_negativeLimit_3_0= '-' ) )? ( (lv_limit_4_0= RULE_INT ) ) ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+ ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3868:1: ( ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_sign_2_0= ruleCompSign ) ) ( (lv_negativeLimit_3_0= '-' ) )? ( (lv_limit_4_0= RULE_INT ) ) ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+ )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3868:1: ( ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_sign_2_0= ruleCompSign ) ) ( (lv_negativeLimit_3_0= '-' ) )? ( (lv_limit_4_0= RULE_INT ) ) ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+ )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3868:2: ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_sign_2_0= ruleCompSign ) ) ( (lv_negativeLimit_3_0= '-' ) )? ( (lv_limit_4_0= RULE_INT ) ) ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3868:2: ( (lv_function_0_0= ruleFeedbackKeywordsComplex ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3869:1: (lv_function_0_0= ruleFeedbackKeywordsComplex )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3869:1: (lv_function_0_0= ruleFeedbackKeywordsComplex )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3870:3: lv_function_0_0= ruleFeedbackKeywordsComplex
            {
             
            	        newCompositeNode(grammarAccess.getLOTriggerAccess().getFunctionFeedbackKeywordsComplexParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFeedbackKeywordsComplex_in_ruleLOTrigger8279);
            lv_function_0_0=ruleFeedbackKeywordsComplex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLOTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_0_0, 
                    		"FeedbackKeywordsComplex");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3886:2: ( (otherlv_1= RULE_ID ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3887:1: (otherlv_1= RULE_ID )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3887:1: (otherlv_1= RULE_ID )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3888:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLOTriggerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLOTrigger8299); 

            		newLeafNode(otherlv_1, grammarAccess.getLOTriggerAccess().getOutcomeOutcomeCrossReference_1_0()); 
            	

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3899:2: ( (lv_sign_2_0= ruleCompSign ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3900:1: (lv_sign_2_0= ruleCompSign )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3900:1: (lv_sign_2_0= ruleCompSign )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3901:3: lv_sign_2_0= ruleCompSign
            {
             
            	        newCompositeNode(grammarAccess.getLOTriggerAccess().getSignCompSignParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCompSign_in_ruleLOTrigger8320);
            lv_sign_2_0=ruleCompSign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLOTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"sign",
                    		lv_sign_2_0, 
                    		"CompSign");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3917:2: ( (lv_negativeLimit_3_0= '-' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==34) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3918:1: (lv_negativeLimit_3_0= '-' )
                    {
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3918:1: (lv_negativeLimit_3_0= '-' )
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3919:3: lv_negativeLimit_3_0= '-'
                    {
                    lv_negativeLimit_3_0=(Token)match(input,34,FOLLOW_34_in_ruleLOTrigger8338); 

                            newLeafNode(lv_negativeLimit_3_0, grammarAccess.getLOTriggerAccess().getNegativeLimitHyphenMinusKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLOTriggerRule());
                    	        }
                           		setWithLastConsumed(current, "negativeLimit", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3932:3: ( (lv_limit_4_0= RULE_INT ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3933:1: (lv_limit_4_0= RULE_INT )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3933:1: (lv_limit_4_0= RULE_INT )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3934:3: lv_limit_4_0= RULE_INT
            {
            lv_limit_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLOTrigger8369); 

            			newLeafNode(lv_limit_4_0, grammarAccess.getLOTriggerAccess().getLimitINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLOTriggerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limit",
                    		lv_limit_4_0, 
                    		"INT");
            	    

            }


            }

            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3950:2: ( (lv_triggerReactions_5_0= ruleTriggerFeedback ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==12) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3951:1: (lv_triggerReactions_5_0= ruleTriggerFeedback )
            	    {
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3951:1: (lv_triggerReactions_5_0= ruleTriggerFeedback )
            	    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3952:3: lv_triggerReactions_5_0= ruleTriggerFeedback
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTriggerAccess().getTriggerReactionsTriggerFeedbackParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTriggerFeedback_in_ruleLOTrigger8395);
            	    lv_triggerReactions_5_0=ruleTriggerFeedback();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLOTriggerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggerReactions",
            	            		lv_triggerReactions_5_0, 
            	            		"TriggerFeedback");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
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
    // $ANTLR end "ruleLOTrigger"


    // $ANTLR start "entryRuleFeedbackKeywordsSimple"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3976:1: entryRuleFeedbackKeywordsSimple returns [String current=null] : iv_ruleFeedbackKeywordsSimple= ruleFeedbackKeywordsSimple EOF ;
    public final String entryRuleFeedbackKeywordsSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeedbackKeywordsSimple = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3977:2: (iv_ruleFeedbackKeywordsSimple= ruleFeedbackKeywordsSimple EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3978:2: iv_ruleFeedbackKeywordsSimple= ruleFeedbackKeywordsSimple EOF
            {
             newCompositeNode(grammarAccess.getFeedbackKeywordsSimpleRule()); 
            pushFollow(FOLLOW_ruleFeedbackKeywordsSimple_in_entryRuleFeedbackKeywordsSimple8433);
            iv_ruleFeedbackKeywordsSimple=ruleFeedbackKeywordsSimple();

            state._fsp--;

             current =iv_ruleFeedbackKeywordsSimple.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackKeywordsSimple8444); 

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
    // $ANTLR end "entryRuleFeedbackKeywordsSimple"


    // $ANTLR start "ruleFeedbackKeywordsSimple"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3985:1: ruleFeedbackKeywordsSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'numberGameplays' | kw= 'numberWin' | kw= 'totalTime' | kw= 'averageTime' ) ;
    public final AntlrDatatypeRuleToken ruleFeedbackKeywordsSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3988:28: ( (kw= 'numberGameplays' | kw= 'numberWin' | kw= 'totalTime' | kw= 'averageTime' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3989:1: (kw= 'numberGameplays' | kw= 'numberWin' | kw= 'totalTime' | kw= 'averageTime' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3989:1: (kw= 'numberGameplays' | kw= 'numberWin' | kw= 'totalTime' | kw= 'averageTime' )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt83=1;
                }
                break;
            case 81:
                {
                alt83=2;
                }
                break;
            case 82:
                {
                alt83=3;
                }
                break;
            case 83:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3990:2: kw= 'numberGameplays'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleFeedbackKeywordsSimple8482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsSimpleAccess().getNumberGameplaysKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:3997:2: kw= 'numberWin'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleFeedbackKeywordsSimple8501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsSimpleAccess().getNumberWinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4004:2: kw= 'totalTime'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleFeedbackKeywordsSimple8520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsSimpleAccess().getTotalTimeKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4011:2: kw= 'averageTime'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleFeedbackKeywordsSimple8539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsSimpleAccess().getAverageTimeKeyword_3()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFeedbackKeywordsSimple"


    // $ANTLR start "entryRuleFeedbackKeywordsComplex"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4024:1: entryRuleFeedbackKeywordsComplex returns [String current=null] : iv_ruleFeedbackKeywordsComplex= ruleFeedbackKeywordsComplex EOF ;
    public final String entryRuleFeedbackKeywordsComplex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeedbackKeywordsComplex = null;


        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4025:2: (iv_ruleFeedbackKeywordsComplex= ruleFeedbackKeywordsComplex EOF )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4026:2: iv_ruleFeedbackKeywordsComplex= ruleFeedbackKeywordsComplex EOF
            {
             newCompositeNode(grammarAccess.getFeedbackKeywordsComplexRule()); 
            pushFollow(FOLLOW_ruleFeedbackKeywordsComplex_in_entryRuleFeedbackKeywordsComplex8580);
            iv_ruleFeedbackKeywordsComplex=ruleFeedbackKeywordsComplex();

            state._fsp--;

             current =iv_ruleFeedbackKeywordsComplex.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackKeywordsComplex8591); 

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
    // $ANTLR end "entryRuleFeedbackKeywordsComplex"


    // $ANTLR start "ruleFeedbackKeywordsComplex"
    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4033:1: ruleFeedbackKeywordsComplex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sumScore' | kw= 'averageScore' | kw= 'maxScore' | kw= 'minScore' ) ;
    public final AntlrDatatypeRuleToken ruleFeedbackKeywordsComplex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4036:28: ( (kw= 'sumScore' | kw= 'averageScore' | kw= 'maxScore' | kw= 'minScore' ) )
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4037:1: (kw= 'sumScore' | kw= 'averageScore' | kw= 'maxScore' | kw= 'minScore' )
            {
            // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4037:1: (kw= 'sumScore' | kw= 'averageScore' | kw= 'maxScore' | kw= 'minScore' )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt84=1;
                }
                break;
            case 85:
                {
                alt84=2;
                }
                break;
            case 86:
                {
                alt84=3;
                }
                break;
            case 87:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4038:2: kw= 'sumScore'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleFeedbackKeywordsComplex8629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsComplexAccess().getSumScoreKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4045:2: kw= 'averageScore'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleFeedbackKeywordsComplex8648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsComplexAccess().getAverageScoreKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4052:2: kw= 'maxScore'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleFeedbackKeywordsComplex8667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsComplexAccess().getMaxScoreKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../uws.engage.dsl/src-gen/uws/engage/dsl/parser/antlr/internal/InternalAssess.g:4059:2: kw= 'minScore'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleFeedbackKeywordsComplex8686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedbackKeywordsComplexAccess().getMinScoreKeyword_3()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFeedbackKeywordsComplex"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGameDescription_in_ruleModel131 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rulePlayerDescription_in_ruleModel152 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_ruleLearningOutcomes_in_ruleModel174 = new BitSet(new long[]{0x0010060000000000L});
    public static final BitSet FOLLOW_ruleFeedbackMessages_in_ruleModel195 = new BitSet(new long[]{0x0010060000000000L});
    public static final BitSet FOLLOW_ruleEvidenceModel_in_ruleModel217 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
    public static final BitSet FOLLOW_ruleFeedbackModel_in_ruleModel238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleBadgeModel_in_ruleModel260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnd_in_entryRuleEnd298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnd309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEnd346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeparator_in_entryRuleSeparator388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeparator399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSeparator436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleType530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleType718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnum801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnum813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum830 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleEnum848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum865 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleEnum884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGameDescription_in_entryRuleGameDescription920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGameDescription930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleGameDescription968 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24_in_ruleGameDescription986 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGameDescription999 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGameDescription1031 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGameDescription1048 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGameDescription1080 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_27_in_ruleGameDescription1098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGameDescription1130 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_28_in_ruleGameDescription1150 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAge_in_ruleGameDescription1186 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_29_in_ruleGameDescription1201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGameDescription1233 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_30_in_ruleGameDescription1253 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGameDescription1285 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_31_in_ruleGameDescription1305 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGameDescription1337 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_32_in_ruleGameDescription1357 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGameDescription1389 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_33_in_ruleGameDescription1409 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleGameDescription1425 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleGameDescription1445 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleGameDescription1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_entryRuleAge1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAge1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAge1550 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAge1567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAge1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayerDescription_in_entryRulePlayerDescription1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayerDescription1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePlayerDescription1672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCharacteristic_in_rulePlayerDescription1693 = new BitSet(new long[]{0x00000003F8000840L});
    public static final BitSet FOLLOW_ruleEnd_in_rulePlayerDescription1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacteristic_in_entryRuleCharacteristic1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacteristic1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCharacteristic1797 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleCharacteristic1819 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCharacteristic1841 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacteristic1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLearningOutcomes_in_entryRuleLearningOutcomes1900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLearningOutcomes1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLearningOutcomes1948 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37_in_ruleLearningOutcomes1966 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutcome_in_ruleLearningOutcomes1988 = new BitSet(new long[]{0x00000003F8000840L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleLearningOutcomes2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcome_in_entryRuleOutcome2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutcome2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutcome2092 = new BitSet(new long[]{0x000001C000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutcome2114 = new BitSet(new long[]{0x000001C000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOutcome2137 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleTypeOutcome_in_ruleOutcome2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeOutcome_in_entryRuleTypeOutcome2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeOutcome2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeOutcome2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeOutcome2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeOutcome2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackMessages_in_entryRuleFeedbackMessages2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackMessages2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFeedbackMessages2425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42_in_ruleFeedbackMessages2443 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFeedback_in_ruleFeedbackMessages2465 = new BitSet(new long[]{0x00000003F8000840L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleFeedbackMessages2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedback_in_entryRuleFeedback2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedback2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeedback2569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeedback2591 = new BitSet(new long[]{0x000FF80000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeedback2613 = new BitSet(new long[]{0x000FF80000000002L});
    public static final BitSet FOLLOW_ruleTypeFeedback_in_ruleFeedback2640 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_43_in_ruleFeedback2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFeedback2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFeedback2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFeedback_in_entryRuleTypeFeedback2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFeedback2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeFeedback2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeFeedback2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeFeedback2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeFeedback2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeFeedback2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeFeedback2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvidenceModel_in_entryRuleEvidenceModel2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvidenceModel2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEvidenceModel3017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAction_in_ruleEvidenceModel3038 = new BitSet(new long[]{0x02200003F8000840L});
    public static final BitSet FOLLOW_ruleTimerActions_in_ruleEvidenceModel3060 = new BitSet(new long[]{0x00200003F8000800L});
    public static final BitSet FOLLOW_ruleActionSequences_in_ruleEvidenceModel3082 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleEvidenceModel3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSequences_in_entryRuleActionSequences3134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSequences3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleActionSequences3181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleActionSequence_in_ruleActionSequences3202 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleActionSequences3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSequence_in_entryRuleActionSequence3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSequence3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionSequence3305 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleActionSequence3329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55_in_ruleActionSequence3366 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionSequence3397 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleActionSequence3414 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleActionReaction_in_ruleActionSequence3435 = new BitSet(new long[]{0x00000003F8001840L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleActionSequence3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerActions_in_entryRuleTimerActions3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimerActions3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTimerActions3534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTimerAction_in_ruleTimerActions3555 = new BitSet(new long[]{0x00000003F8000840L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleTimerActions3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerAction_in_entryRuleTimerAction3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimerAction3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimerAction3659 = new BitSet(new long[]{0x0480000000000000L});
    public static final BitSet FOLLOW_ruleTiming_in_ruleTimerAction3685 = new BitSet(new long[]{0x04800003F8000800L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleTimerAction3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTiming_in_entryRuleTiming3737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTiming3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTiming3791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_55_in_ruleTiming3828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTiming3859 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleTiming3876 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleActionReaction_in_ruleTiming3897 = new BitSet(new long[]{0x00000003F8001840L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleTiming3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionReaction_in_entryRuleActionReaction3949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionReaction3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateScore_in_ruleActionReaction4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerFeedback_in_ruleActionReaction4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateScore_in_entryRuleUpdateScore4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateScore4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateScore4123 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleUpdateScore4135 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rulePoint_in_ruleUpdateScore4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerFeedback_in_entryRuleTriggerFeedback4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerFeedback4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTriggerFeedback4239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerFeedback4259 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTriggerFeedback4277 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTriggerFeedback4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction4411 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAction4428 = new BitSet(new long[]{0x00000000000FF000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAction4449 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleAction4462 = new BitSet(new long[]{0x00000000000FF000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAction4483 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleAction4497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction4514 = new BitSet(new long[]{0x0000000400000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleParamsIn_in_ruleAction4540 = new BitSet(new long[]{0x0000000400000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_rulePoints_in_ruleAction4562 = new BitSet(new long[]{0x00000007F8000860L,0x0000000000000108L});
    public static final BitSet FOLLOW_ruleReactions_in_ruleAction4584 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleAction4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsIn_in_entryRuleParamsIn4636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsIn4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamIn_in_ruleParamsIn4691 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleParamIn_in_entryRuleParamIn4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamIn4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamIn4782 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleParamIn4794 = new BitSet(new long[]{0x0000000000000070L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleParam_in_ruleParamIn4815 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_21_in_ruleParamIn4828 = new BitSet(new long[]{0x0000000000000070L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleParam_in_ruleParamIn4849 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleParamIn4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleParameter4952 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter4987 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoints_in_entryRulePoints5045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoints5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcomesPoints_in_rulePoints5101 = new BitSet(new long[]{0x0100000000200070L,0x00000000000000C4L});
    public static final BitSet FOLLOW_21_in_rulePoints5114 = new BitSet(new long[]{0x0000000400000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleOutcomesPoints_in_rulePoints5135 = new BitSet(new long[]{0x0100000000200070L,0x00000000000000C4L});
    public static final BitSet FOLLOW_66_in_rulePoints5158 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_56_in_rulePoints5187 = new BitSet(new long[]{0x00000003F8000800L});
    public static final BitSet FOLLOW_ruleParams_in_rulePoints5230 = new BitSet(new long[]{0x01000003F8200870L,0x00000000000000C4L});
    public static final BitSet FOLLOW_ruleEnd_in_rulePoints5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcomesPoints_in_entryRuleOutcomesPoints5283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutcomesPoints5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutcomesPoints5339 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleOutcomesPoints5351 = new BitSet(new long[]{0x0000000400000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleOutcomesPoints5371 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_rulePoint_in_ruleOutcomesPoints5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutcomesPoints5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint5470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePoint5523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_entryRuleSign5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSign5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSign5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSign5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParams_in_entryRuleParams5704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParams5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParams5757 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleParams5774 = new BitSet(new long[]{0x0000000000000070L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleParam_in_ruleParams5797 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleParams5810 = new BitSet(new long[]{0x0000000000000070L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleParam_in_ruleParams5831 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam5870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleParam5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleParam6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT6085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT6136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFLOAT6155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL6217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBOOL6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBOOL6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactions_in_entryRuleReactions6325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactions6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleReactions6372 = new BitSet(new long[]{0x0100000000000040L,0x0000000000000604L});
    public static final BitSet FOLLOW_ruleReaction_in_ruleReactions6393 = new BitSet(new long[]{0x01000003F8000840L,0x0000000000000604L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleReactions6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReaction_in_entryRuleReaction6445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReaction6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCondition_in_ruleReaction6502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePointsCondition_in_ruleReaction6529 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleReaction6542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReaction6562 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleReaction6580 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleReaction6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCondition_in_entryRuleParamCondition6662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCondition6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamCondition6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleParamCondition6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleParamCondition6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointsCondition_in_entryRulePointsCondition6824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointsCondition6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointsKeyWd_in_rulePointsCondition6880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePointsCondition6892 = new BitSet(new long[]{0x0000000400000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSign_in_rulePointsCondition6914 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePointsCondition6941 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePointsCondition6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointsKeyWd_in_entryRulePointsKeyWd6991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointsKeyWd7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePointsKeyWd7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePointsKeyWd7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackModel_in_entryRuleFeedbackModel7099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackModel7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleFeedbackModel7146 = new BitSet(new long[]{0x0000000000000040L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleFeedbackModel7167 = new BitSet(new long[]{0x00000003F8000840L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleFeedbackModel7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger7219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcomeValueLimit_in_ruleTrigger7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInactivityLimit_in_ruleTrigger7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcomeValueLimit_in_entryRuleOutcomeValueLimit7338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutcomeValueLimit7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutcomeValueLimit7393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleCompSign_in_ruleOutcomeValueLimit7414 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_ruleOutcomeValueLimit7432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOutcomeValueLimit7463 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleTriggerFeedback_in_ruleOutcomeValueLimit7489 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleCompSign_in_entryRuleCompSign7527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompSign7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCompSign7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCompSign7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInactivityLimit_in_entryRuleInactivityLimit7635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInactivityLimit7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleInactivityLimit7682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleCompSign_in_ruleInactivityLimit7703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInactivityLimit7720 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleInactivityLimit7737 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleActionReaction_in_ruleInactivityLimit7758 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleBadgeModel_in_entryRuleBadgeModel7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBadgeModel7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleBadgeModel7842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FF0000L});
    public static final BitSet FOLLOW_ruleGenericTrigger_in_ruleBadgeModel7863 = new BitSet(new long[]{0x00000003F8000800L,0x0000000000FF0000L});
    public static final BitSet FOLLOW_ruleEnd_in_ruleBadgeModel7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTrigger_in_entryRuleGenericTrigger7915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericTrigger7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTrigger_in_ruleGenericTrigger7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOTrigger_in_ruleGenericTrigger7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTrigger_in_entryRuleSimpleTrigger8034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTrigger8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackKeywordsSimple_in_ruleSimpleTrigger8090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleCompSign_in_ruleSimpleTrigger8111 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_ruleSimpleTrigger8129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleTrigger8160 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleTriggerFeedback_in_ruleSimpleTrigger8186 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleLOTrigger_in_entryRuleLOTrigger8223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOTrigger8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackKeywordsComplex_in_ruleLOTrigger8279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLOTrigger8299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleCompSign_in_ruleLOTrigger8320 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_ruleLOTrigger8338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLOTrigger8369 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_ruleTriggerFeedback_in_ruleLOTrigger8395 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleFeedbackKeywordsSimple_in_entryRuleFeedbackKeywordsSimple8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackKeywordsSimple8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleFeedbackKeywordsSimple8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleFeedbackKeywordsSimple8501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleFeedbackKeywordsSimple8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleFeedbackKeywordsSimple8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackKeywordsComplex_in_entryRuleFeedbackKeywordsComplex8580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackKeywordsComplex8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFeedbackKeywordsComplex8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleFeedbackKeywordsComplex8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleFeedbackKeywordsComplex8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFeedbackKeywordsComplex8686 = new BitSet(new long[]{0x0000000000000002L});

}