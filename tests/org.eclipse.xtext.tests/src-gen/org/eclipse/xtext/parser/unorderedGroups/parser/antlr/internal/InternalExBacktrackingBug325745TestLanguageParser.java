package org.eclipse.xtext.parser.unorderedGroups.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.unorderedGroups.services.ExBacktrackingBug325745TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExBacktrackingBug325745TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_6", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_STRING=12;
    public static final int RULE_ANY_OTHER=16;
    public static final int KEYWORD_6=4;
    public static final int KEYWORD_1=5;
    public static final int RULE_INT=11;
    public static final int KEYWORD_5=9;
    public static final int KEYWORD_4=8;
    public static final int KEYWORD_3=7;
    public static final int KEYWORD_2=6;
    public static final int RULE_WS=15;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=13;

    // delegates
    // delegators


        public InternalExBacktrackingBug325745TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExBacktrackingBug325745TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExBacktrackingBug325745TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private ExBacktrackingBug325745TestLanguageGrammarAccess grammarAccess;
    	 	
    	public InternalExBacktrackingBug325745TestLanguageParser(TokenStream input, ExBacktrackingBug325745TestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "DelegateModel";	
    	} 
    	   	   	
    	@Override
    	protected ExBacktrackingBug325745TestLanguageGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleDelegateModel"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:68:1: entryRuleDelegateModel returns [EObject current=null] : iv_ruleDelegateModel= ruleDelegateModel EOF ;
    public final EObject entryRuleDelegateModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateModel = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:69:2: (iv_ruleDelegateModel= ruleDelegateModel EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:70:2: iv_ruleDelegateModel= ruleDelegateModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDelegateModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDelegateModel_in_entryRuleDelegateModel73);
            iv_ruleDelegateModel=ruleDelegateModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelegateModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelegateModel83); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDelegateModel"


    // $ANTLR start "ruleDelegateModel"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:77:1: ruleDelegateModel returns [EObject current=null] : this_Model_0= ruleModel ;
    public final EObject ruleDelegateModel() throws RecognitionException {
        EObject current = null;

        EObject this_Model_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:80:28: (this_Model_0= ruleModel )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:82:2: this_Model_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDelegateModelAccess().getModelParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleDelegateModel132);
            this_Model_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_Model_0;
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDelegateModel"


    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:101:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:102:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:103:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel165);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel175); if (state.failed) return current;

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:110:1: ruleModel returns [EObject current=null] : ( () ( (lv_fields_1_0= ruleElement ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:113:28: ( ( () ( (lv_fields_1_0= ruleElement ) )+ ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:114:1: ( () ( (lv_fields_1_0= ruleElement ) )+ )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:114:1: ( () ( (lv_fields_1_0= ruleElement ) )+ )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:114:2: () ( (lv_fields_1_0= ruleElement ) )+
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:114:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:115:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelAccess().getModelAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:123:2: ( (lv_fields_1_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:124:1: (lv_fields_1_0= ruleElement )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:124:1: (lv_fields_1_0= ruleElement )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:125:3: lv_fields_1_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getFieldsElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleModel233);
            	    lv_fields_1_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_1_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:149:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:150:2: (iv_ruleElement= ruleElement EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:151:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement269);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement279); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:158:1: ruleElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= KEYWORD_3 ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        EObject lv_dataType_1_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:161:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= KEYWORD_3 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:162:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= KEYWORD_3 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:162:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= KEYWORD_3 )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:162:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= KEYWORD_3
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:162:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:163:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:163:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:164:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleElement321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:180:2: ( (lv_dataType_1_0= ruleDataType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalExBacktrackingBug325745TestLanguageParser()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:181:1: (lv_dataType_1_0= ruleDataType )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:181:1: (lv_dataType_1_0= ruleDataType )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:182:3: lv_dataType_1_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementAccess().getDataTypeDataTypeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleElement347);
                    lv_dataType_1_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                      	        }
                             		set(
                             			current, 
                             			"dataType",
                              		lv_dataType_1_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:198:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:199:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:199:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:200:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleElement369);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleElement382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getFullStopKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataType"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:229:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:230:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:231:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType416);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType426); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:238:1: ruleDataType returns [EObject current=null] : ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_baseType_0_0=null;
        Token otherlv_1=null;
        Token lv_defaultValue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:241:28: ( ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:242:1: ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:242:1: ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:242:2: ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:242:2: ( (lv_baseType_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:243:1: (lv_baseType_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:243:1: (lv_baseType_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:244:3: lv_baseType_0_0= RULE_ID
            {
            lv_baseType_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_baseType_0_0, grammarAccess.getDataTypeAccess().getBaseTypeIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"baseType",
                      		lv_baseType_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:260:2: (otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_6) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:261:2: otherlv_1= KEYWORD_6 ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleDataType487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getColonEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:265:1: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:266:1: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:266:1: (lv_defaultValue_2_0= RULE_STRING )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:267:3: lv_defaultValue_2_0= RULE_STRING
                    {
                    lv_defaultValue_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataType503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_defaultValue_2_0, grammarAccess.getDataTypeAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:291:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 
        			grammarAccess.getExpressionAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:298:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:299:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression551);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression561); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:309:1: ruleExpression returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_postfix_9_0=null;
        EObject lv_terms_5_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 
        			grammarAccess.getExpressionAccess().getUnorderedGroup_3()
        		);
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:316:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:317:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:317:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:317:2: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:317:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:318:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionAccess().getExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:326:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:329:2: ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExpressionAccess().getUnorderedGroup_1());
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:332:2: ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:333:3: ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:333:3: ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_4) ) {
                    int LA4_1 = input.LA(2);

                    if ( synpred4_InternalExBacktrackingBug325745TestLanguageParser() && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_STRING) ) {
                    int LA4_3 = input.LA(2);

                    if ( synpred5_InternalExBacktrackingBug325745TestLanguageParser() && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:335:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:335:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:336:5: {...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:336:107: ( ({...}? => (otherlv_2= KEYWORD_4 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:337:6: ({...}? => (otherlv_2= KEYWORD_4 ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0);
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:6: ({...}? => (otherlv_2= KEYWORD_4 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:7: {...}? => (otherlv_2= KEYWORD_4 )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:16: (otherlv_2= KEYWORD_4 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:341:2: otherlv_2= KEYWORD_4
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleExpression661); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:352:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:352:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:353:5: {...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:353:107: ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:354:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1);
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:7: {...}? => ( (lv_prefix_3_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:16: ( (lv_prefix_3_0= RULE_STRING ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:358:1: (lv_prefix_3_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:358:1: (lv_prefix_3_0= RULE_STRING )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:359:3: lv_prefix_3_0= RULE_STRING
            	    {
            	    lv_prefix_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExpression732); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_prefix_3_0, grammarAccess.getExpressionAccess().getPrefixSTRINGTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExpressionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"prefix",
            	              		lv_prefix_3_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:389:2: ( (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_4||(LA7_0>=RULE_ID && LA7_0<=RULE_INT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:389:3: (otherlv_4= KEYWORD_4 )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= KEYWORD_5 )?
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:389:3: (otherlv_4= KEYWORD_4 )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==KEYWORD_4) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:390:2: otherlv_4= KEYWORD_4
            	            {
            	            otherlv_4=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleExpression792); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_0());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:394:3: ( (lv_terms_5_0= ruleSimpleTerm ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:395:1: (lv_terms_5_0= ruleSimpleTerm )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:395:1: (lv_terms_5_0= ruleSimpleTerm )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:396:3: lv_terms_5_0= ruleSimpleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAccess().getTermsSimpleTermParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleTerm_in_ruleExpression814);
            	    lv_terms_5_0=ruleSimpleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"terms",
            	              		lv_terms_5_0, 
            	              		"SimpleTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:412:2: (otherlv_6= KEYWORD_5 )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==KEYWORD_5) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (synpred7_InternalExBacktrackingBug325745TestLanguageParser()) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:413:2: otherlv_6= KEYWORD_5
            	            {
            	            otherlv_6=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleExpression828); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:417:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:419:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:419:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:420:2: ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExpressionAccess().getUnorderedGroup_3());
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:423:2: ( ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:424:3: ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:424:3: ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 ==KEYWORD_5 && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:426:4: ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:426:4: ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:427:5: {...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:427:107: ( ({...}? => (otherlv_8= KEYWORD_5 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:428:6: ({...}? => (otherlv_8= KEYWORD_5 ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0);
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:6: ({...}? => (otherlv_8= KEYWORD_5 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:7: {...}? => (otherlv_8= KEYWORD_5 )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:16: (otherlv_8= KEYWORD_5 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:432:2: otherlv_8= KEYWORD_5
            	    {
            	    otherlv_8=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleExpression890); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_3_0());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:443:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:443:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:444:5: {...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:444:107: ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:445:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1);
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:7: {...}? => ( (lv_postfix_9_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:16: ( (lv_postfix_9_0= RULE_STRING ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:449:1: (lv_postfix_9_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:449:1: (lv_postfix_9_0= RULE_STRING )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:450:3: lv_postfix_9_0= RULE_STRING
            	    {
            	    lv_postfix_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExpression961); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_postfix_9_0, grammarAccess.getExpressionAccess().getPostfixSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExpressionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"postfix",
            	              		lv_postfix_9_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimpleTerm"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:491:1: entryRuleSimpleTerm returns [EObject current=null] : iv_ruleSimpleTerm= ruleSimpleTerm EOF ;
    public final EObject entryRuleSimpleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTerm = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:492:2: (iv_ruleSimpleTerm= ruleSimpleTerm EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:493:2: iv_ruleSimpleTerm= ruleSimpleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTerm_in_entryRuleSimpleTerm1045);
            iv_ruleSimpleTerm=ruleSimpleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleTerm1055); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleTerm"


    // $ANTLR start "ruleSimpleTerm"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:500:1: ruleSimpleTerm returns [EObject current=null] : ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_lineCount_0_0=null;
        Token otherlv_1=null;
        Token lv_charCount_2_0=null;
        Token otherlv_3=null;
        Token lv_charSet_4_0=null;
        Token lv_refChar_5_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:503:28: ( ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:1: ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:1: ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:2: ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:2: ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )? )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:3: ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= KEYWORD_2 )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= KEYWORD_1 )? ( (lv_charSet_4_0= RULE_ID ) )?
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:504:3: ( (lv_lineCount_0_0= RULE_INT ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:505:1: (lv_lineCount_0_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:505:1: (lv_lineCount_0_0= RULE_INT )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:506:3: lv_lineCount_0_0= RULE_INT
                    {
                    lv_lineCount_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSimpleTerm1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_lineCount_0_0, grammarAccess.getSimpleTermAccess().getLineCountINTTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"lineCount",
                              		lv_lineCount_0_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:522:2: (otherlv_1= KEYWORD_2 )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==KEYWORD_2) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:523:2: otherlv_1= KEYWORD_2
                            {
                            otherlv_1=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleSimpleTerm1117); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getSimpleTermAccess().getAsteriskKeyword_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:527:3: ( (lv_charCount_2_0= RULE_INT ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred12_InternalExBacktrackingBug325745TestLanguageParser()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:528:1: (lv_charCount_2_0= RULE_INT )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:528:1: (lv_charCount_2_0= RULE_INT )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:529:3: lv_charCount_2_0= RULE_INT
                            {
                            lv_charCount_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSimpleTerm1135); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_charCount_2_0, grammarAccess.getSimpleTermAccess().getCharCountINTTerminalRuleCall_0_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleTermRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"charCount",
                                      		lv_charCount_2_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:545:3: (otherlv_3= KEYWORD_1 )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==KEYWORD_1) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:546:2: otherlv_3= KEYWORD_1
                            {
                            otherlv_3=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleSimpleTerm1155); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSimpleTermAccess().getExclamationMarkKeyword_0_3());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:550:3: ( (lv_charSet_4_0= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred14_InternalExBacktrackingBug325745TestLanguageParser()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:551:1: (lv_charSet_4_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:551:1: (lv_charSet_4_0= RULE_ID )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:552:3: lv_charSet_4_0= RULE_ID
                            {
                            lv_charSet_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleTerm1173); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_charSet_4_0, grammarAccess.getSimpleTermAccess().getCharSetIDTerminalRuleCall_0_4_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleTermRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"charSet",
                                      		lv_charSet_4_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:569:6: ( (lv_refChar_5_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:569:6: ( (lv_refChar_5_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:570:1: (lv_refChar_5_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:570:1: (lv_refChar_5_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:571:3: lv_refChar_5_0= RULE_ID
                    {
                    lv_refChar_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleTerm1203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_refChar_5_0, grammarAccess.getSimpleTermAccess().getRefCharIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"refChar",
                              		lv_refChar_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleTerm"

    // $ANTLR start synpred2_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred2_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        EObject lv_dataType_1_0 = null;


        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:181:1: ( (lv_dataType_1_0= ruleDataType ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:181:1: (lv_dataType_1_0= ruleDataType )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:181:1: (lv_dataType_1_0= ruleDataType )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:182:3: lv_dataType_1_0= ruleDataType
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getElementAccess().getDataTypeDataTypeParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDataType_in_synpred2_InternalExBacktrackingBug325745TestLanguageParser347);
        lv_dataType_1_0=ruleDataType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred4_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred4_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:335:4: ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:335:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:335:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:336:5: {...}? => ( ({...}? => (otherlv_2= KEYWORD_4 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalExBacktrackingBug325745TestLanguageParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0)");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:336:107: ( ({...}? => (otherlv_2= KEYWORD_4 ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:337:6: ({...}? => (otherlv_2= KEYWORD_4 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0);
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:6: ({...}? => (otherlv_2= KEYWORD_4 ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:7: {...}? => (otherlv_2= KEYWORD_4 )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalExBacktrackingBug325745TestLanguageParser", "true");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:340:16: (otherlv_2= KEYWORD_4 )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:341:2: otherlv_2= KEYWORD_4
        {
        otherlv_2=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_synpred4_InternalExBacktrackingBug325745TestLanguageParser661); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred5_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred5_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token lv_prefix_3_0=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:352:4: ( ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:352:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:352:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:353:5: {...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalExBacktrackingBug325745TestLanguageParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1)");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:353:107: ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:354:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1);
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:7: {...}? => ( (lv_prefix_3_0= RULE_STRING ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalExBacktrackingBug325745TestLanguageParser", "true");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:357:16: ( (lv_prefix_3_0= RULE_STRING ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:358:1: (lv_prefix_3_0= RULE_STRING )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:358:1: (lv_prefix_3_0= RULE_STRING )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:359:3: lv_prefix_3_0= RULE_STRING
        {
        lv_prefix_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred5_InternalExBacktrackingBug325745TestLanguageParser732); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred7_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred7_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token otherlv_6=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:413:2: (otherlv_6= KEYWORD_5 )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:413:2: otherlv_6= KEYWORD_5
        {
        otherlv_6=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_synpred7_InternalExBacktrackingBug325745TestLanguageParser828); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred9_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred9_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token otherlv_8=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:426:4: ( ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:426:4: ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:426:4: ({...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:427:5: {...}? => ( ({...}? => (otherlv_8= KEYWORD_5 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalExBacktrackingBug325745TestLanguageParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0)");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:427:107: ( ({...}? => (otherlv_8= KEYWORD_5 ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:428:6: ({...}? => (otherlv_8= KEYWORD_5 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0);
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:6: ({...}? => (otherlv_8= KEYWORD_5 ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:7: {...}? => (otherlv_8= KEYWORD_5 )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalExBacktrackingBug325745TestLanguageParser", "true");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:431:16: (otherlv_8= KEYWORD_5 )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:432:2: otherlv_8= KEYWORD_5
        {
        otherlv_8=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_synpred9_InternalExBacktrackingBug325745TestLanguageParser890); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred10_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred10_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token lv_postfix_9_0=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:443:4: ( ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:443:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:443:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:444:5: {...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalExBacktrackingBug325745TestLanguageParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1)");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:444:107: ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:445:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1);
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:7: {...}? => ( (lv_postfix_9_0= RULE_STRING ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalExBacktrackingBug325745TestLanguageParser", "true");
        }
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:448:16: ( (lv_postfix_9_0= RULE_STRING ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:449:1: (lv_postfix_9_0= RULE_STRING )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:449:1: (lv_postfix_9_0= RULE_STRING )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:450:3: lv_postfix_9_0= RULE_STRING
        {
        lv_postfix_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred10_InternalExBacktrackingBug325745TestLanguageParser961); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred12_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred12_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token lv_charCount_2_0=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:528:1: ( (lv_charCount_2_0= RULE_INT ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:528:1: (lv_charCount_2_0= RULE_INT )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:528:1: (lv_charCount_2_0= RULE_INT )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:529:3: lv_charCount_2_0= RULE_INT
        {
        lv_charCount_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred12_InternalExBacktrackingBug325745TestLanguageParser1135); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalExBacktrackingBug325745TestLanguageParser

    // $ANTLR start synpred14_InternalExBacktrackingBug325745TestLanguageParser
    public final void synpred14_InternalExBacktrackingBug325745TestLanguageParser_fragment() throws RecognitionException {   
        Token lv_charSet_4_0=null;

        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:551:1: ( (lv_charSet_4_0= RULE_ID ) )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:551:1: (lv_charSet_4_0= RULE_ID )
        {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:551:1: (lv_charSet_4_0= RULE_ID )
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/parser/antlr/internal/InternalExBacktrackingBug325745TestLanguageParser.g:552:3: lv_charSet_4_0= RULE_ID
        {
        lv_charSet_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred14_InternalExBacktrackingBug325745TestLanguageParser1173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalExBacktrackingBug325745TestLanguageParser

    // Delegated rules

    public final boolean synpred12_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalExBacktrackingBug325745TestLanguageParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalExBacktrackingBug325745TestLanguageParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDelegateModel_in_entryRuleDelegateModel73 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelegateModel83 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_ruleDelegateModel132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleModel233 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement269 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleElement321 = new BitSet(new long[]{0x0000000000001F80L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleElement347 = new BitSet(new long[]{0x0000000000001F80L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleElement369 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleElement382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType468 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleDataType487 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleExpression661 = new BitSet(new long[]{0x0000000000001F02L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression732 = new BitSet(new long[]{0x0000000000001F02L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleExpression792 = new BitSet(new long[]{0x0000000000000D00L});
        public static final BitSet FOLLOW_ruleSimpleTerm_in_ruleExpression814 = new BitSet(new long[]{0x0000000000001F02L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleExpression828 = new BitSet(new long[]{0x0000000000001F02L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleExpression890 = new BitSet(new long[]{0x0000000000001202L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression961 = new BitSet(new long[]{0x0000000000001202L});
        public static final BitSet FOLLOW_ruleSimpleTerm_in_entryRuleSimpleTerm1045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTerm1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleTerm1098 = new BitSet(new long[]{0x0000000000000C62L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleSimpleTerm1117 = new BitSet(new long[]{0x0000000000000C22L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleTerm1135 = new BitSet(new long[]{0x0000000000000422L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleSimpleTerm1155 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTerm1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTerm1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_synpred2_InternalExBacktrackingBug325745TestLanguageParser347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_synpred4_InternalExBacktrackingBug325745TestLanguageParser661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred5_InternalExBacktrackingBug325745TestLanguageParser732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_5_in_synpred7_InternalExBacktrackingBug325745TestLanguageParser828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_5_in_synpred9_InternalExBacktrackingBug325745TestLanguageParser890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred10_InternalExBacktrackingBug325745TestLanguageParser961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred12_InternalExBacktrackingBug325745TestLanguageParser1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred14_InternalExBacktrackingBug325745TestLanguageParser1173 = new BitSet(new long[]{0x0000000000000002L});
    }


}