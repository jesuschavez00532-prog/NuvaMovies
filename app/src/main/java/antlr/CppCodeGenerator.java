package antlr;

import antlr.actions.cpp.ActionLexer;
import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class CppCodeGenerator extends CodeGenerator {
    public static final int caseSizeThreshold = 127;
    private static final String postIncludeCpp = "post_include_cpp";
    private static final String postIncludeHpp = "post_include_hpp";
    private static final String preIncludeCpp = "pre_include_cpp";
    private static final String preIncludeHpp = "pre_include_hpp";
    private Vector astTypes;
    String commonExtraArgs;
    String commonExtraParams;
    String commonLocalVars;
    String currentASTResult;
    RuleBlock currentRule;
    String exceptionThrown;
    String labeledElementASTInit;
    String labeledElementASTType;
    String labeledElementInit;
    String labeledElementType;
    String lt1Value;
    protected String outputFile;
    protected int outputLine;
    private Vector semPreds;
    String throwNoViable;
    protected static final String NONUNIQUE = new String();
    private static String namespaceStd = "ANTLR_USE_NAMESPACE(std)";
    private static String namespaceAntlr = "ANTLR_USE_NAMESPACE(antlr)";
    private static NameSpace nameSpace = null;
    boolean DEBUG_CPP_CODE_GENERATOR = false;
    protected int syntacticPredLevel = 0;
    protected boolean genAST = false;
    protected boolean saveText = false;
    protected boolean genHashLines = true;
    protected boolean noConstructors = false;
    boolean usingCustomAST = false;
    Hashtable treeVariableMap = new Hashtable();
    Hashtable declaredASTVariables = new Hashtable();
    int astVarNumber = 1;

    public CppCodeGenerator() {
        this.charFormatter = new CppCharFormatter();
    }

    private void GenRuleInvocation(RuleRefElement ruleRefElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ruleRefElement.targetRule);
        stringBuffer.append("(");
        _print(stringBuffer.toString());
        if (this.grammar instanceof LexerGrammar) {
            if (ruleRefElement.getLabel() != null) {
                _print("true");
            } else {
                _print("false");
            }
            if (this.commonExtraArgs.length() != 0 || ruleRefElement.args != null) {
                _print(",");
            }
        }
        _print(this.commonExtraArgs);
        if (this.commonExtraArgs.length() != 0 && ruleRefElement.args != null) {
            _print(",");
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(ruleRefElement.targetRule);
        if (ruleRefElement.args != null) {
            ActionTransInfo actionTransInfo = new ActionTransInfo();
            String processActionForSpecialSymbols = processActionForSpecialSymbols(ruleRefElement.args, ruleRefElement.line, this.currentRule, actionTransInfo);
            if (actionTransInfo.assignToRoot || actionTransInfo.refRuleRoot != null) {
                Tool tool = this.antlrTool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Arguments of rule reference '");
                stringBuffer2.append(ruleRefElement.targetRule);
                stringBuffer2.append("' cannot set or ref #");
                stringBuffer2.append(this.currentRule.getRuleName());
                stringBuffer2.append(" on line ");
                stringBuffer2.append(ruleRefElement.getLine());
                tool.error(stringBuffer2.toString());
            }
            _print(processActionForSpecialSymbols);
            if (ruleSymbol.block.argAction == null) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Rule '");
                stringBuffer3.append(ruleRefElement.targetRule);
                stringBuffer3.append("' accepts no arguments");
                tool2.warning(stringBuffer3.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
            }
        }
        _println(");");
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_t = _retTree;");
        }
    }

    private boolean charIsDigit(String str, int i10) {
        if (i10 < str.length() && Character.isDigit(str.charAt(i10))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String convertJavaToCppString(java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CppCodeGenerator.convertJavaToCppString(java.lang.String, boolean):java.lang.String");
    }

    private String fixNameSpaceOption(String str) {
        String stripFrontBack = StringUtils.stripFrontBack(str, "\"", "\"");
        if (stripFrontBack.length() > 2 && !stripFrontBack.substring(stripFrontBack.length() - 2, stripFrontBack.length()).equals("::")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(stripFrontBack);
            stringBuffer.append("::");
            return stringBuffer.toString();
        }
        return stripFrontBack;
    }

    private void genBlockFinish(CppBlockFinishingInfo cppBlockFinishingInfo, String str) {
        boolean z10;
        if (cppBlockFinishingInfo.needAnErrorClause && ((z10 = cppBlockFinishingInfo.generatedAnIf) || cppBlockFinishingInfo.generatedSwitch)) {
            if (z10) {
                println("else {");
            } else {
                println("{");
            }
            this.tabs++;
            println(str);
            this.tabs--;
            println("}");
        }
        String str2 = cppBlockFinishingInfo.postscript;
        if (str2 != null) {
            println(str2);
        }
    }

    private void genElementAST(AlternativeElement alternativeElement) {
        boolean z10;
        String str;
        String stringBuffer;
        Grammar grammar = this.grammar;
        if ((grammar instanceof TreeWalkerGrammar) && !grammar.buildAST) {
            if (alternativeElement.getLabel() == null) {
                String str2 = this.lt1Value;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("tmp");
                stringBuffer2.append(this.astVarNumber);
                stringBuffer2.append("_AST");
                String stringBuffer3 = stringBuffer2.toString();
                this.astVarNumber++;
                mapTreeVariable(alternativeElement, stringBuffer3);
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(this.labeledElementASTType);
                stringBuffer4.append(" ");
                stringBuffer4.append(stringBuffer3);
                stringBuffer4.append("_in = ");
                stringBuffer4.append(str2);
                stringBuffer4.append(";");
                println(stringBuffer4.toString());
                return;
            }
            return;
        }
        if (grammar.buildAST && this.syntacticPredLevel == 0) {
            boolean z11 = false;
            if (this.genAST && (alternativeElement.getLabel() != null || alternativeElement.getAutoGenType() != 3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (alternativeElement.getAutoGenType() != 3 && (alternativeElement instanceof TokenRefElement)) {
                z10 = true;
            }
            if (this.grammar.hasSyntacticPredicate && z10) {
                z11 = true;
            }
            if (alternativeElement.getLabel() != null) {
                str = alternativeElement.getLabel();
                stringBuffer = alternativeElement.getLabel();
            } else {
                str = this.lt1Value;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("tmp");
                stringBuffer5.append(this.astVarNumber);
                stringBuffer = stringBuffer5.toString();
                this.astVarNumber++;
            }
            if (z10) {
                if (alternativeElement instanceof GrammarAtom) {
                    GrammarAtom grammarAtom = (GrammarAtom) alternativeElement;
                    if (grammarAtom.getASTNodeType() != null) {
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("Ref");
                        stringBuffer6.append(grammarAtom.getASTNodeType());
                        genASTDeclaration(alternativeElement, stringBuffer, stringBuffer6.toString());
                    } else {
                        genASTDeclaration(alternativeElement, stringBuffer, this.labeledElementASTType);
                    }
                } else {
                    genASTDeclaration(alternativeElement, stringBuffer, this.labeledElementASTType);
                }
            }
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(stringBuffer);
            stringBuffer7.append("_AST");
            String stringBuffer8 = stringBuffer7.toString();
            mapTreeVariable(alternativeElement, stringBuffer8);
            if (this.grammar instanceof TreeWalkerGrammar) {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append(this.labeledElementASTType);
                stringBuffer9.append(" ");
                stringBuffer9.append(stringBuffer8);
                stringBuffer9.append("_in = ");
                stringBuffer9.append(this.labeledElementASTInit);
                stringBuffer9.append(";");
                println(stringBuffer9.toString());
            }
            if (z11) {
                println("if ( inputState->guessing == 0 ) {");
                this.tabs++;
            }
            if (alternativeElement.getLabel() != null) {
                if (alternativeElement instanceof GrammarAtom) {
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append(stringBuffer8);
                    stringBuffer10.append(" = ");
                    stringBuffer10.append(getASTCreateString((GrammarAtom) alternativeElement, str));
                    stringBuffer10.append(";");
                    println(stringBuffer10.toString());
                } else {
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append(stringBuffer8);
                    stringBuffer11.append(" = ");
                    stringBuffer11.append(getASTCreateString(str));
                    stringBuffer11.append(";");
                    println(stringBuffer11.toString());
                }
            }
            if (alternativeElement.getLabel() == null && z10) {
                String str3 = this.lt1Value;
                if (alternativeElement instanceof GrammarAtom) {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append(stringBuffer8);
                    stringBuffer12.append(" = ");
                    stringBuffer12.append(getASTCreateString((GrammarAtom) alternativeElement, str3));
                    stringBuffer12.append(";");
                    println(stringBuffer12.toString());
                } else {
                    StringBuffer stringBuffer13 = new StringBuffer();
                    stringBuffer13.append(stringBuffer8);
                    stringBuffer13.append(" = ");
                    stringBuffer13.append(getASTCreateString(str3));
                    stringBuffer13.append(";");
                    println(stringBuffer13.toString());
                }
                if (this.grammar instanceof TreeWalkerGrammar) {
                    StringBuffer stringBuffer14 = new StringBuffer();
                    stringBuffer14.append(stringBuffer8);
                    stringBuffer14.append("_in = ");
                    stringBuffer14.append(str3);
                    stringBuffer14.append(";");
                    println(stringBuffer14.toString());
                }
            }
            if (this.genAST) {
                int autoGenType = alternativeElement.getAutoGenType();
                if (autoGenType != 1) {
                    if (autoGenType == 2) {
                        if (!this.usingCustomAST && (!(alternativeElement instanceof GrammarAtom) || ((GrammarAtom) alternativeElement).getASTNodeType() == null)) {
                            StringBuffer stringBuffer15 = new StringBuffer();
                            stringBuffer15.append("astFactory->makeASTRoot(currentAST, ");
                            stringBuffer15.append(stringBuffer8);
                            stringBuffer15.append(");");
                            println(stringBuffer15.toString());
                        } else {
                            StringBuffer stringBuffer16 = new StringBuffer();
                            stringBuffer16.append("astFactory->makeASTRoot(currentAST, ");
                            stringBuffer16.append(namespaceAntlr);
                            stringBuffer16.append("RefAST(");
                            stringBuffer16.append(stringBuffer8);
                            stringBuffer16.append("));");
                            println(stringBuffer16.toString());
                        }
                    }
                } else if (!this.usingCustomAST && (!(alternativeElement instanceof GrammarAtom) || ((GrammarAtom) alternativeElement).getASTNodeType() == null)) {
                    StringBuffer stringBuffer17 = new StringBuffer();
                    stringBuffer17.append("astFactory->addASTChild(currentAST, ");
                    stringBuffer17.append(stringBuffer8);
                    stringBuffer17.append(");");
                    println(stringBuffer17.toString());
                } else {
                    StringBuffer stringBuffer18 = new StringBuffer();
                    stringBuffer18.append("astFactory->addASTChild(currentAST, ");
                    stringBuffer18.append(namespaceAntlr);
                    stringBuffer18.append("RefAST(");
                    stringBuffer18.append(stringBuffer8);
                    stringBuffer18.append("));");
                    println(stringBuffer18.toString());
                }
            }
            if (z11) {
                this.tabs--;
                println("}");
            }
        }
    }

    private void genErrorCatchForElement(AlternativeElement alternativeElement) {
        if (alternativeElement.getLabel() == null) {
            return;
        }
        String str = alternativeElement.enclosingRuleName;
        if (this.grammar instanceof LexerGrammar) {
            str = CodeGenerator.encodeLexerRuleName(str);
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(str);
        if (ruleSymbol == null) {
            this.antlrTool.panic("Enclosing rule not found!");
        }
        ExceptionSpec findExceptionSpec = ruleSymbol.block.findExceptionSpec(alternativeElement.getLabel());
        if (findExceptionSpec != null) {
            this.tabs--;
            println("}");
            genErrorHandler(findExceptionSpec);
        }
    }

    private void genErrorHandler(ExceptionSpec exceptionSpec) {
        for (int i10 = 0; i10 < exceptionSpec.handlers.size(); i10++) {
            ExceptionHandler exceptionHandler = (ExceptionHandler) exceptionSpec.handlers.elementAt(i10);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("catch (");
            stringBuffer.append(exceptionHandler.exceptionTypeAndName.getText());
            stringBuffer.append(") {");
            println(stringBuffer.toString());
            this.tabs++;
            if (this.grammar.hasSyntacticPredicate) {
                println("if (inputState->guessing==0) {");
                this.tabs++;
            }
            ActionTransInfo actionTransInfo = new ActionTransInfo();
            genLineNo(exceptionHandler.action);
            printAction(processActionForSpecialSymbols(exceptionHandler.action.getText(), exceptionHandler.action.getLine(), this.currentRule, actionTransInfo));
            genLineNo2();
            if (this.grammar.hasSyntacticPredicate) {
                this.tabs--;
                println("} else {");
                this.tabs++;
                println("throw;");
                this.tabs--;
                println("}");
            }
            this.tabs--;
            println("}");
        }
    }

    private void genErrorTryForElement(AlternativeElement alternativeElement) {
        if (alternativeElement.getLabel() == null) {
            return;
        }
        String str = alternativeElement.enclosingRuleName;
        if (this.grammar instanceof LexerGrammar) {
            str = CodeGenerator.encodeLexerRuleName(str);
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(str);
        if (ruleSymbol == null) {
            this.antlrTool.panic("Enclosing rule not found!");
        }
        if (ruleSymbol.block.findExceptionSpec(alternativeElement.getLabel()) != null) {
            println("try { // for error handling");
            this.tabs++;
        }
    }

    private void genLiteralsTest() {
        println("_ttype = testLiteralsTable(_ttype);");
    }

    private void genLiteralsTestForPartialToken() {
        println("_ttype = testLiteralsTable(text.substr(_begin, text.length()-_begin),_ttype);");
    }

    private String getValueString(int i10) {
        Grammar grammar = this.grammar;
        if (grammar instanceof LexerGrammar) {
            return this.charFormatter.literalChar(i10);
        }
        TokenSymbol tokenSymbolAt = grammar.tokenManager.getTokenSymbolAt(i10);
        if (tokenSymbolAt == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(i10);
            return stringBuffer.toString();
        }
        String id2 = tokenSymbolAt.getId();
        if (tokenSymbolAt instanceof StringLiteralSymbol) {
            String label = ((StringLiteralSymbol) tokenSymbolAt).getLabel();
            if (label == null && (label = mangleLiteral(id2)) == null) {
                return String.valueOf(i10);
            }
            return label;
        }
        if (id2.equals("EOF")) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("Token::EOF_TYPE");
            return stringBuffer2.toString();
        }
        return id2;
    }

    private String lookaheadString(int i10) {
        if (this.grammar instanceof TreeWalkerGrammar) {
            return "_t->getType()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LA(");
        stringBuffer.append(i10);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    private String mangleLiteral(String str) {
        String str2 = Tool.literalsPrefix;
        for (int i10 = 1; i10 < str.length() - 1; i10++) {
            if (!Character.isLetter(str.charAt(i10)) && str.charAt(i10) != '_') {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(str.charAt(i10));
            str2 = stringBuffer.toString();
        }
        if (Tool.upperCaseMangledLiterals) {
            return str2.toUpperCase();
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void mapTreeVariable(antlr.AlternativeElement r2, java.lang.String r3) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof antlr.TreeElement
            if (r0 == 0) goto Lc
            antlr.TreeElement r2 = (antlr.TreeElement) r2
            antlr.GrammarAtom r2 = r2.root
            r1.mapTreeVariable(r2, r3)
            return
        Lc:
            java.lang.String r0 = r2.getLabel()
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof antlr.TokenRefElement
            if (r0 == 0) goto L1b
            antlr.TokenRefElement r2 = (antlr.TokenRefElement) r2
            java.lang.String r2 = r2.atomText
            goto L25
        L1b:
            boolean r0 = r2 instanceof antlr.RuleRefElement
            if (r0 == 0) goto L24
            antlr.RuleRefElement r2 = (antlr.RuleRefElement) r2
            java.lang.String r2 = r2.targetRule
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L41
            java.util.Hashtable r0 = r1.treeVariableMap
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L3c
            java.util.Hashtable r3 = r1.treeVariableMap
            r3.remove(r2)
            java.util.Hashtable r3 = r1.treeVariableMap
            java.lang.String r0 = antlr.CppCodeGenerator.NONUNIQUE
            r3.put(r2, r0)
            goto L41
        L3c:
            java.util.Hashtable r0 = r1.treeVariableMap
            r0.put(r2, r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CppCodeGenerator.mapTreeVariable(antlr.AlternativeElement, java.lang.String):void");
    }

    private void setupGrammarParameters(Grammar grammar) {
        Token option;
        Token option2;
        String stripFrontBack;
        Token option3;
        String stripFrontBack2;
        Token option4;
        Token option5;
        String stripFrontBack3;
        Token option6;
        String stripFrontBack4;
        boolean z10 = grammar instanceof ParserGrammar;
        if (z10 || (grammar instanceof LexerGrammar) || (grammar instanceof TreeWalkerGrammar)) {
            Tool tool = this.antlrTool;
            NameSpace nameSpace2 = tool.nameSpace;
            if (nameSpace2 != null) {
                nameSpace = nameSpace2;
            }
            String str = tool.namespaceStd;
            if (str != null) {
                namespaceStd = fixNameSpaceOption(str);
            }
            String str2 = this.antlrTool.namespaceAntlr;
            if (str2 != null) {
                namespaceAntlr = fixNameSpaceOption(str2);
            }
            this.genHashLines = this.antlrTool.genHashLines;
            if (grammar.hasOption("namespace") && (option4 = grammar.getOption("namespace")) != null) {
                nameSpace = new NameSpace(option4.getText());
            }
            if (grammar.hasOption("namespaceAntlr") && (option3 = grammar.getOption("namespaceAntlr")) != null && (stripFrontBack2 = StringUtils.stripFrontBack(option3.getText(), "\"", "\"")) != null) {
                if (stripFrontBack2.length() > 2 && !stripFrontBack2.substring(stripFrontBack2.length() - 2, stripFrontBack2.length()).equals("::")) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(stripFrontBack2);
                    stringBuffer.append("::");
                    stripFrontBack2 = stringBuffer.toString();
                }
                namespaceAntlr = stripFrontBack2;
            }
            if (grammar.hasOption("namespaceStd") && (option2 = grammar.getOption("namespaceStd")) != null && (stripFrontBack = StringUtils.stripFrontBack(option2.getText(), "\"", "\"")) != null) {
                if (stripFrontBack.length() > 2 && !stripFrontBack.substring(stripFrontBack.length() - 2, stripFrontBack.length()).equals("::")) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(stripFrontBack);
                    stringBuffer2.append("::");
                    stripFrontBack = stringBuffer2.toString();
                }
                namespaceStd = stripFrontBack;
            }
            if (grammar.hasOption("genHashLines") && (option = grammar.getOption("genHashLines")) != null) {
                this.genHashLines = StringUtils.stripFrontBack(option.getText(), "\"", "\"").equals("true");
            }
            this.noConstructors = this.antlrTool.noConstructors;
            if (grammar.hasOption("noConstructors")) {
                Token option7 = grammar.getOption("noConstructors");
                if (option7 != null && !option7.getText().equals("true") && !option7.getText().equals("false")) {
                    Tool tool2 = this.antlrTool;
                    tool2.error("noConstructors option must be true or false", tool2.getGrammarFile(), option7.getLine(), option7.getColumn());
                }
                this.noConstructors = option7.getText().equals("true");
            }
        }
        if (z10) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(namespaceAntlr);
            stringBuffer3.append("RefAST");
            this.labeledElementASTType = stringBuffer3.toString();
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(namespaceAntlr);
            stringBuffer4.append("nullAST");
            this.labeledElementASTInit = stringBuffer4.toString();
            if (grammar.hasOption("ASTLabelType") && (option6 = grammar.getOption("ASTLabelType")) != null && (stripFrontBack4 = StringUtils.stripFrontBack(option6.getText(), "\"", "\"")) != null) {
                this.usingCustomAST = true;
                this.labeledElementASTType = stripFrontBack4;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(stripFrontBack4);
                stringBuffer5.append("(");
                stringBuffer5.append(namespaceAntlr);
                stringBuffer5.append("nullAST)");
                this.labeledElementASTInit = stringBuffer5.toString();
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(namespaceAntlr);
            stringBuffer6.append("RefToken ");
            this.labeledElementType = stringBuffer6.toString();
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(namespaceAntlr);
            stringBuffer7.append("nullToken");
            this.labeledElementInit = stringBuffer7.toString();
            this.commonExtraArgs = "";
            this.commonExtraParams = "";
            this.commonLocalVars = "";
            this.lt1Value = "LT(1)";
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append(namespaceAntlr);
            stringBuffer8.append("RecognitionException");
            this.exceptionThrown = stringBuffer8.toString();
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append("throw ");
            stringBuffer9.append(namespaceAntlr);
            stringBuffer9.append("NoViableAltException(LT(1), getFilename());");
            this.throwNoViable = stringBuffer9.toString();
            return;
        }
        if (grammar instanceof LexerGrammar) {
            this.labeledElementType = "char ";
            this.labeledElementInit = "'\\0'";
            this.commonExtraArgs = "";
            this.commonExtraParams = "bool _createToken";
            StringBuffer stringBuffer10 = new StringBuffer();
            stringBuffer10.append("int _ttype; ");
            stringBuffer10.append(namespaceAntlr);
            stringBuffer10.append("RefToken _token; int _begin=text.length();");
            this.commonLocalVars = stringBuffer10.toString();
            this.lt1Value = "LA(1)";
            StringBuffer stringBuffer11 = new StringBuffer();
            stringBuffer11.append(namespaceAntlr);
            stringBuffer11.append("RecognitionException");
            this.exceptionThrown = stringBuffer11.toString();
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append("throw ");
            stringBuffer12.append(namespaceAntlr);
            stringBuffer12.append("NoViableAltForCharException(LA(1), getFilename(), getLine(), getColumn());");
            this.throwNoViable = stringBuffer12.toString();
            return;
        }
        if (grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer13 = new StringBuffer();
            stringBuffer13.append(namespaceAntlr);
            stringBuffer13.append("nullAST");
            this.labeledElementInit = stringBuffer13.toString();
            StringBuffer stringBuffer14 = new StringBuffer();
            stringBuffer14.append(namespaceAntlr);
            stringBuffer14.append("nullAST");
            this.labeledElementASTInit = stringBuffer14.toString();
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append(namespaceAntlr);
            stringBuffer15.append("RefAST");
            this.labeledElementASTType = stringBuffer15.toString();
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(namespaceAntlr);
            stringBuffer16.append("RefAST");
            this.labeledElementType = stringBuffer16.toString();
            StringBuffer stringBuffer17 = new StringBuffer();
            stringBuffer17.append(namespaceAntlr);
            stringBuffer17.append("RefAST _t");
            this.commonExtraParams = stringBuffer17.toString();
            StringBuffer stringBuffer18 = new StringBuffer();
            stringBuffer18.append("throw ");
            stringBuffer18.append(namespaceAntlr);
            stringBuffer18.append("NoViableAltException(_t);");
            this.throwNoViable = stringBuffer18.toString();
            this.lt1Value = "_t";
            if (grammar.hasOption("ASTLabelType") && (option5 = grammar.getOption("ASTLabelType")) != null && (stripFrontBack3 = StringUtils.stripFrontBack(option5.getText(), "\"", "\"")) != null) {
                this.usingCustomAST = true;
                this.labeledElementASTType = stripFrontBack3;
                this.labeledElementType = stripFrontBack3;
                StringBuffer stringBuffer19 = new StringBuffer();
                stringBuffer19.append(stripFrontBack3);
                stringBuffer19.append("(");
                stringBuffer19.append(namespaceAntlr);
                stringBuffer19.append("nullAST)");
                String stringBuffer20 = stringBuffer19.toString();
                this.labeledElementInit = stringBuffer20;
                this.labeledElementASTInit = stringBuffer20;
                StringBuffer stringBuffer21 = new StringBuffer();
                stringBuffer21.append(stripFrontBack3);
                stringBuffer21.append(" _t");
                this.commonExtraParams = stringBuffer21.toString();
                StringBuffer stringBuffer22 = new StringBuffer();
                stringBuffer22.append("throw ");
                stringBuffer22.append(namespaceAntlr);
                stringBuffer22.append("NoViableAltException(");
                stringBuffer22.append(namespaceAntlr);
                stringBuffer22.append("RefAST(_t));");
                this.throwNoViable = stringBuffer22.toString();
                this.lt1Value = "_t";
            }
            if (!grammar.hasOption("ASTLabelType")) {
                StringBuffer stringBuffer23 = new StringBuffer();
                stringBuffer23.append(namespaceAntlr);
                stringBuffer23.append("RefAST");
                grammar.setOption("ASTLabelType", new Token(6, stringBuffer23.toString()));
            }
            this.commonExtraArgs = "_t";
            this.commonLocalVars = "";
            StringBuffer stringBuffer24 = new StringBuffer();
            stringBuffer24.append(namespaceAntlr);
            stringBuffer24.append("RecognitionException");
            this.exceptionThrown = stringBuffer24.toString();
            return;
        }
        this.antlrTool.panic("Unknown grammar type");
    }

    private static boolean suitableForCaseExpression(Alternative alternative) {
        if (alternative.lookaheadDepth == 1 && alternative.semPred == null && !alternative.cache[1].containsEpsilon() && alternative.cache[1].fset.degree() <= 127) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CodeGenerator
    public void _print(String str) {
        if (str != null) {
            this.outputLine += countLines(str);
            this.currentOutput.print(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CodeGenerator
    public void _printAction(String str) {
        if (str != null) {
            this.outputLine += countLines(str) + 1;
            super._printAction(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CodeGenerator
    public void _println(String str) {
        if (str != null) {
            this.outputLine += countLines(str) + 1;
            this.currentOutput.println(str);
        }
    }

    protected int addSemPred(String str) {
        this.semPreds.appendElement(str);
        return this.semPreds.size() - 1;
    }

    protected int countLines(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '\n') {
                i10++;
            }
        }
        return i10;
    }

    public void exitIfError() {
        if (this.antlrTool.hasError()) {
            this.antlrTool.fatalError("Exiting due to errors.");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen() {
        try {
            Enumeration elements = this.behavior.grammars.elements();
            while (elements.hasMoreElements()) {
                Grammar grammar = (Grammar) elements.nextElement();
                if (grammar.debuggingOutput) {
                    Tool tool = this.antlrTool;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(grammar.getFilename());
                    stringBuffer.append(": C++ mode does not support -debug");
                    tool.error(stringBuffer.toString());
                }
                grammar.setGrammarAnalyzer(this.analyzer);
                grammar.setCodeGenerator(this);
                this.analyzer.setGrammar(grammar);
                setupGrammarParameters(grammar);
                grammar.generate();
                exitIfError();
            }
            Enumeration elements2 = this.behavior.tokenManagers.elements();
            while (elements2.hasMoreElements()) {
                TokenManager tokenManager = (TokenManager) elements2.nextElement();
                if (!tokenManager.isReadOnly()) {
                    genTokenTypes(tokenManager);
                    genTokenInterchange(tokenManager);
                }
                exitIfError();
            }
        } catch (IOException e10) {
            this.antlrTool.reportException(e10, null);
        }
    }

    protected void genASTDeclaration(AlternativeElement alternativeElement) {
        genASTDeclaration(alternativeElement, this.labeledElementASTType);
    }

    protected void genAlt(Alternative alternative, AlternativeBlock alternativeBlock) {
        boolean z10;
        boolean z11 = this.genAST;
        boolean z12 = false;
        if (z11 && alternative.getAutoGen()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.genAST = z10;
        boolean z13 = this.saveText;
        if (z13 && alternative.getAutoGen()) {
            z12 = true;
        }
        this.saveText = z12;
        Hashtable hashtable = this.treeVariableMap;
        this.treeVariableMap = new Hashtable();
        if (alternative.exceptionSpec != null) {
            println("try {      // for error handling");
            this.tabs++;
        }
        for (AlternativeElement alternativeElement = alternative.head; !(alternativeElement instanceof BlockEndElement); alternativeElement = alternativeElement.next) {
            alternativeElement.generate();
        }
        if (this.genAST) {
            if (alternativeBlock instanceof RuleBlock) {
                RuleBlock ruleBlock = (RuleBlock) alternativeBlock;
                if (this.usingCustomAST) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(ruleBlock.getRuleName());
                    stringBuffer.append("_AST = ");
                    stringBuffer.append(this.labeledElementASTType);
                    stringBuffer.append("(currentAST.root);");
                    println(stringBuffer.toString());
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(ruleBlock.getRuleName());
                    stringBuffer2.append("_AST = currentAST.root;");
                    println(stringBuffer2.toString());
                }
            } else if (alternativeBlock.getLabel() != null) {
                this.antlrTool.warning("Labeled subrules are not implemented", this.grammar.getFilename(), alternativeBlock.getLine(), alternativeBlock.getColumn());
            }
        }
        if (alternative.exceptionSpec != null) {
            this.tabs--;
            println("}");
            genErrorHandler(alternative.exceptionSpec);
        }
        this.genAST = z11;
        this.saveText = z13;
        this.treeVariableMap = hashtable;
    }

    protected void genBitsets(Vector vector, int i10, String str) {
        TokenManager tokenManager = this.grammar.tokenManager;
        println("");
        for (int i11 = 0; i11 < vector.size(); i11++) {
            BitSet bitSet = (BitSet) vector.elementAt(i11);
            bitSet.growToInclude(i10);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("const unsigned long ");
            stringBuffer.append(str);
            stringBuffer.append(getBitsetName(i11));
            stringBuffer.append("_data_");
            stringBuffer.append("[] = { ");
            stringBuffer.append(bitSet.toStringOfHalfWords());
            stringBuffer.append(" };");
            println(stringBuffer.toString());
            String str2 = "// ";
            for (int i12 = 0; i12 < tokenManager.getVocabulary().size(); i12++) {
                if (bitSet.member(i12)) {
                    if (this.grammar instanceof LexerGrammar) {
                        if (32 <= i12 && i12 < 127) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append(str2);
                            stringBuffer2.append(this.charFormatter.escapeChar(i12, true));
                            stringBuffer2.append(" ");
                            str2 = stringBuffer2.toString();
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(str2);
                            stringBuffer3.append("0x");
                            stringBuffer3.append(Integer.toString(i12, 16));
                            stringBuffer3.append(" ");
                            str2 = stringBuffer3.toString();
                        }
                    } else {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append(str2);
                        stringBuffer4.append(tokenManager.getTokenStringAt(i12));
                        stringBuffer4.append(" ");
                        str2 = stringBuffer4.toString();
                    }
                    if (str2.length() > 70) {
                        println(str2);
                        str2 = "// ";
                    }
                }
            }
            if (str2 != "// ") {
                println(str2);
            }
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("const ");
            stringBuffer5.append(namespaceAntlr);
            stringBuffer5.append("BitSet ");
            stringBuffer5.append(str);
            stringBuffer5.append(getBitsetName(i11));
            stringBuffer5.append("(");
            stringBuffer5.append(getBitsetName(i11));
            stringBuffer5.append("_data_,");
            stringBuffer5.append(bitSet.size() / 32);
            stringBuffer5.append(");");
            println(stringBuffer5.toString());
        }
    }

    protected void genBitsetsHeader(Vector vector, int i10) {
        println("");
        for (int i11 = 0; i11 < vector.size(); i11++) {
            ((BitSet) vector.elementAt(i11)).growToInclude(i10);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("static const unsigned long ");
            stringBuffer.append(getBitsetName(i11));
            stringBuffer.append("_data_");
            stringBuffer.append("[];");
            println(stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("static const ");
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("BitSet ");
            stringBuffer2.append(getBitsetName(i11));
            stringBuffer2.append(";");
            println(stringBuffer2.toString());
        }
    }

    protected void genBlockInitAction(AlternativeBlock alternativeBlock) {
        if (alternativeBlock.initAction != null) {
            genLineNo(alternativeBlock);
            printAction(processActionForSpecialSymbols(alternativeBlock.initAction, alternativeBlock.line, this.currentRule, null));
            genLineNo2();
        }
    }

    protected void genBlockPreamble(AlternativeBlock alternativeBlock) {
        if (alternativeBlock instanceof RuleBlock) {
            RuleBlock ruleBlock = (RuleBlock) alternativeBlock;
            if (ruleBlock.labeledElements != null) {
                for (int i10 = 0; i10 < ruleBlock.labeledElements.size(); i10++) {
                    AlternativeElement alternativeElement = (AlternativeElement) ruleBlock.labeledElements.elementAt(i10);
                    boolean z10 = alternativeElement instanceof RuleRefElement;
                    if (!z10 && (!(alternativeElement instanceof AlternativeBlock) || (alternativeElement instanceof RuleBlock) || (alternativeElement instanceof SynPredBlock))) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(this.labeledElementType);
                        stringBuffer.append(" ");
                        stringBuffer.append(alternativeElement.getLabel());
                        stringBuffer.append(" = ");
                        stringBuffer.append(this.labeledElementInit);
                        stringBuffer.append(";");
                        println(stringBuffer.toString());
                        if (this.grammar.buildAST) {
                            if (alternativeElement instanceof GrammarAtom) {
                                GrammarAtom grammarAtom = (GrammarAtom) alternativeElement;
                                if (grammarAtom.getASTNodeType() != null) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("Ref");
                                    stringBuffer2.append(grammarAtom.getASTNodeType());
                                    genASTDeclaration(alternativeElement, stringBuffer2.toString());
                                }
                            }
                            genASTDeclaration(alternativeElement);
                        }
                    } else {
                        if (!z10) {
                            AlternativeBlock alternativeBlock2 = (AlternativeBlock) alternativeElement;
                            if (alternativeBlock2.not && this.analyzer.subruleCanBeInverted(alternativeBlock2, this.grammar instanceof LexerGrammar)) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append(this.labeledElementType);
                                stringBuffer3.append(" ");
                                stringBuffer3.append(alternativeElement.getLabel());
                                stringBuffer3.append(" = ");
                                stringBuffer3.append(this.labeledElementInit);
                                stringBuffer3.append(";");
                                println(stringBuffer3.toString());
                                if (this.grammar.buildAST) {
                                    genASTDeclaration(alternativeElement);
                                }
                            }
                        }
                        if (this.grammar.buildAST) {
                            genASTDeclaration(alternativeElement);
                        }
                        if (this.grammar instanceof LexerGrammar) {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append(namespaceAntlr);
                            stringBuffer4.append("RefToken ");
                            stringBuffer4.append(alternativeElement.getLabel());
                            stringBuffer4.append(";");
                            println(stringBuffer4.toString());
                        }
                        if (this.grammar instanceof TreeWalkerGrammar) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append(this.labeledElementType);
                            stringBuffer5.append(" ");
                            stringBuffer5.append(alternativeElement.getLabel());
                            stringBuffer5.append(" = ");
                            stringBuffer5.append(this.labeledElementInit);
                            stringBuffer5.append(";");
                            println(stringBuffer5.toString());
                        }
                    }
                }
            }
        }
    }

    public void genBody(LexerGrammar lexerGrammar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".cpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = false;
        this.saveText = true;
        this.tabs = 0;
        genHeader(this.outputFile);
        printHeaderAction(preIncludeCpp);
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#include \"");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(".hpp\"");
        println(stringBuffer3.toString());
        println("#include <antlr/CharBuffer.hpp>");
        println("#include <antlr/TokenStreamException.hpp>");
        println("#include <antlr/TokenStreamIOException.hpp>");
        println("#include <antlr/TokenStreamRecognitionException.hpp>");
        println("#include <antlr/CharStreamException.hpp>");
        println("#include <antlr/CharStreamIOException.hpp>");
        println("#include <antlr/NoViableAltForCharException.hpp>");
        if (this.grammar.debuggingOutput) {
            println("#include <antlr/DebuggingInputBuffer.hpp>");
        }
        println("");
        printHeaderAction(postIncludeCpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printAction(this.grammar.preambleAction);
        Grammar grammar = this.grammar;
        String str = grammar.superClass;
        if (str == null) {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(namespaceAntlr);
            stringBuffer4.append(superClass);
            str = stringBuffer4.toString();
        }
        if (this.noConstructors) {
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(this.grammar.getClassName());
        stringBuffer5.append("::");
        stringBuffer5.append(this.grammar.getClassName());
        stringBuffer5.append("(");
        stringBuffer5.append(namespaceStd);
        stringBuffer5.append("istream& in)");
        println(stringBuffer5.toString());
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(": ");
            stringBuffer6.append(str);
            stringBuffer6.append("(new ");
            stringBuffer6.append(namespaceAntlr);
            stringBuffer6.append("DebuggingInputBuffer(new ");
            stringBuffer6.append(namespaceAntlr);
            stringBuffer6.append("CharBuffer(in)),");
            stringBuffer6.append(lexerGrammar.caseSensitive);
            stringBuffer6.append(")");
            println(stringBuffer6.toString());
        } else {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(": ");
            stringBuffer7.append(str);
            stringBuffer7.append("(new ");
            stringBuffer7.append(namespaceAntlr);
            stringBuffer7.append("CharBuffer(in),");
            stringBuffer7.append(lexerGrammar.caseSensitive);
            stringBuffer7.append(")");
            println(stringBuffer7.toString());
        }
        this.tabs--;
        println("{");
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            println("setRuleNames(_ruleNames);");
            println("setSemPredNames(_semPredNames);");
            println("setupDebugging();");
        }
        println("initLiterals();");
        this.tabs--;
        println("}");
        println("");
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("::");
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("(");
        stringBuffer8.append(namespaceAntlr);
        stringBuffer8.append("InputBuffer& ib)");
        println(stringBuffer8.toString());
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(": ");
            stringBuffer9.append(str);
            stringBuffer9.append("(new ");
            stringBuffer9.append(namespaceAntlr);
            stringBuffer9.append("DebuggingInputBuffer(ib),");
            stringBuffer9.append(lexerGrammar.caseSensitive);
            stringBuffer9.append(")");
            println(stringBuffer9.toString());
        } else {
            StringBuffer stringBuffer10 = new StringBuffer();
            stringBuffer10.append(": ");
            stringBuffer10.append(str);
            stringBuffer10.append("(ib,");
            stringBuffer10.append(lexerGrammar.caseSensitive);
            stringBuffer10.append(")");
            println(stringBuffer10.toString());
        }
        this.tabs--;
        println("{");
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            println("setRuleNames(_ruleNames);");
            println("setSemPredNames(_semPredNames);");
            println("setupDebugging();");
        }
        println("initLiterals();");
        this.tabs--;
        println("}");
        println("");
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append(this.grammar.getClassName());
        stringBuffer11.append("::");
        stringBuffer11.append(this.grammar.getClassName());
        stringBuffer11.append("(const ");
        stringBuffer11.append(namespaceAntlr);
        stringBuffer11.append("LexerSharedInputState& state)");
        println(stringBuffer11.toString());
        this.tabs++;
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append(": ");
        stringBuffer12.append(str);
        stringBuffer12.append("(state,");
        stringBuffer12.append(lexerGrammar.caseSensitive);
        stringBuffer12.append(")");
        println(stringBuffer12.toString());
        this.tabs--;
        println("{");
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            println("setRuleNames(_ruleNames);");
            println("setSemPredNames(_semPredNames);");
            println("setupDebugging();");
        }
        println("initLiterals();");
        this.tabs--;
        println("}");
        println("");
        if (this.noConstructors) {
            println("// constructor creation turned of with 'noConstructor' option");
            println("#endif");
        }
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append("void ");
        stringBuffer13.append(this.grammar.getClassName());
        stringBuffer13.append("::initLiterals()");
        println(stringBuffer13.toString());
        println("{");
        this.tabs++;
        Enumeration tokenSymbolKeys = this.grammar.tokenManager.getTokenSymbolKeys();
        while (tokenSymbolKeys.hasMoreElements()) {
            String str2 = (String) tokenSymbolKeys.nextElement();
            if (str2.charAt(0) == '\"') {
                TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str2);
                if (tokenSymbol instanceof StringLiteralSymbol) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenSymbol;
                    StringBuffer stringBuffer14 = new StringBuffer();
                    stringBuffer14.append("literals[");
                    stringBuffer14.append(stringLiteralSymbol.getId());
                    stringBuffer14.append("] = ");
                    stringBuffer14.append(stringLiteralSymbol.getTokenType());
                    stringBuffer14.append(";");
                    println(stringBuffer14.toString());
                }
            }
        }
        this.tabs--;
        println("}");
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append("const char* ");
            stringBuffer15.append(this.grammar.getClassName());
            stringBuffer15.append("::_ruleNames[] = {");
            println(stringBuffer15.toString());
            this.tabs++;
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer16 = new StringBuffer();
                    stringBuffer16.append("\"");
                    stringBuffer16.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer16.append("\",");
                    println(stringBuffer16.toString());
                }
            }
            println(MessageService.MSG_DB_READY_REPORT);
            this.tabs--;
            println("};");
        }
        genNextToken();
        Enumeration elements2 = this.grammar.rules.elements();
        int i10 = 0;
        while (elements2.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements2.nextElement();
            if (!ruleSymbol.getId().equals("mnextToken")) {
                StringBuffer stringBuffer17 = new StringBuffer();
                stringBuffer17.append(this.grammar.getClassName());
                stringBuffer17.append("::");
                genRule(ruleSymbol, false, i10, stringBuffer17.toString());
                i10++;
            }
            exitIfError();
        }
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer18 = new StringBuffer();
            stringBuffer18.append(this.grammar.getClassName());
            stringBuffer18.append("::");
            genSemPredMap(stringBuffer18.toString());
        }
        Vector vector = this.bitsetsUsed;
        int size = ((LexerGrammar) this.grammar).charVocabulary.size();
        StringBuffer stringBuffer19 = new StringBuffer();
        stringBuffer19.append(this.grammar.getClassName());
        stringBuffer19.append("::");
        genBitsets(vector, size, stringBuffer19.toString());
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
    }

    protected void genCases(BitSet bitSet) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCases(");
            stringBuffer.append(bitSet);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        for (int i10 : bitSet.toArray()) {
            print("");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("case ");
            stringBuffer2.append(getValueString(i10));
            stringBuffer2.append(":");
            _print(stringBuffer2.toString());
            _println("");
        }
    }

    public CppBlockFinishingInfo genCommonBlock(AlternativeBlock alternativeBlock, boolean z10) {
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        int i10;
        CppBlockFinishingInfo cppBlockFinishingInfo;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        String str2;
        boolean lookaheadIsEmpty;
        String lookaheadTestExpression;
        boolean z17;
        int i12;
        int i13;
        CppBlockFinishingInfo cppBlockFinishingInfo2;
        String str3;
        String str4;
        String str5;
        AlternativeBlock alternativeBlock2 = alternativeBlock;
        CppBlockFinishingInfo cppBlockFinishingInfo3 = new CppBlockFinishingInfo();
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCommonBlk(");
            stringBuffer.append(alternativeBlock2);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        boolean z18 = this.genAST;
        char c10 = 1;
        if (z18 && alternativeBlock.getAutoGen()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.genAST = z11;
        boolean z19 = this.saveText;
        if (z19 && alternativeBlock.getAutoGen()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.saveText = z12;
        String str6 = "";
        if (alternativeBlock2.not && this.analyzer.subruleCanBeInverted(alternativeBlock2, this.grammar instanceof LexerGrammar)) {
            Lookahead look = this.analyzer.look(1, alternativeBlock2);
            if (alternativeBlock.getLabel() != null && this.syntacticPredLevel == 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(alternativeBlock.getLabel());
                stringBuffer2.append(" = ");
                stringBuffer2.append(this.lt1Value);
                stringBuffer2.append(";");
                println(stringBuffer2.toString());
            }
            genElementAST(alternativeBlock);
            if (this.grammar instanceof TreeWalkerGrammar) {
                if (this.usingCustomAST) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(namespaceAntlr);
                    stringBuffer3.append("RefAST");
                    stringBuffer3.append("(_t),");
                    str6 = stringBuffer3.toString();
                } else {
                    str6 = "_t,";
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("match(");
            stringBuffer4.append(str6);
            stringBuffer4.append(getBitsetName(markBitsetForGen(look.fset)));
            stringBuffer4.append(");");
            println(stringBuffer4.toString());
            if (this.grammar instanceof TreeWalkerGrammar) {
                println("_t = _t->getNextSibling();");
            }
            return cppBlockFinishingInfo3;
        }
        if (alternativeBlock.getAlternatives().size() == 1) {
            Alternative alternativeAt = alternativeBlock2.getAlternativeAt(0);
            if (alternativeAt.synPred != null) {
                this.antlrTool.warning("Syntactic predicate superfluous for single alternative", this.grammar.getFilename(), alternativeBlock2.getAlternativeAt(0).synPred.getLine(), alternativeBlock2.getAlternativeAt(0).synPred.getColumn());
            }
            if (z10) {
                String str7 = alternativeAt.semPred;
                if (str7 != null) {
                    genSemPred(str7, alternativeBlock2.line);
                }
                genAlt(alternativeAt, alternativeBlock2);
                return cppBlockFinishingInfo3;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < alternativeBlock.getAlternatives().size(); i15++) {
            if (suitableForCaseExpression(alternativeBlock2.getAlternativeAt(i15))) {
                i14++;
            }
        }
        String str8 = "{";
        String str9 = "}";
        if (i14 < this.makeSwitchThreshold) {
            str = "";
            z13 = false;
        } else {
            String lookaheadString = lookaheadString(1);
            if (this.grammar instanceof TreeWalkerGrammar) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("if (_t == ");
                stringBuffer5.append(this.labeledElementASTInit);
                stringBuffer5.append(" )");
                println(stringBuffer5.toString());
                this.tabs++;
                println("_t = ASTNULL;");
                this.tabs--;
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("switch ( ");
            stringBuffer6.append(lookaheadString);
            stringBuffer6.append(") {");
            println(stringBuffer6.toString());
            int i16 = 0;
            while (i16 < alternativeBlock2.alternatives.size()) {
                Alternative alternativeAt2 = alternativeBlock2.getAlternativeAt(i16);
                if (!suitableForCaseExpression(alternativeAt2)) {
                    str5 = str6;
                } else {
                    Lookahead lookahead = alternativeAt2.cache[c10];
                    if (lookahead.fset.degree() == 0 && !lookahead.containsEpsilon()) {
                        str5 = str6;
                        this.antlrTool.warning("Alternate omitted due to empty prediction set", this.grammar.getFilename(), alternativeAt2.head.getLine(), alternativeAt2.head.getColumn());
                    } else {
                        str5 = str6;
                        genCases(lookahead.fset);
                        println("{");
                        this.tabs++;
                        genAlt(alternativeAt2, alternativeBlock2);
                        println("break;");
                        this.tabs--;
                        println("}");
                        i16++;
                        str6 = str5;
                        c10 = 1;
                    }
                }
                i16++;
                str6 = str5;
                c10 = 1;
            }
            str = str6;
            println("default:");
            this.tabs++;
            z13 = true;
        }
        Grammar grammar = this.grammar;
        if (grammar instanceof LexerGrammar) {
            i10 = grammar.maxk;
        } else {
            i10 = 0;
        }
        int i17 = 0;
        int i18 = 0;
        while (i10 >= 0) {
            if (!this.DEBUG_CODE_GENERATOR && !this.DEBUG_CPP_CODE_GENERATOR) {
                i11 = i18;
            } else {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer7 = new StringBuffer();
                i11 = i18;
                stringBuffer7.append("checking depth ");
                stringBuffer7.append(i10);
                printStream2.println(stringBuffer7.toString());
            }
            i18 = i11;
            int i19 = 0;
            while (i19 < alternativeBlock2.alternatives.size()) {
                Alternative alternativeAt3 = alternativeBlock2.getAlternativeAt(i19);
                boolean z20 = z19;
                if (!this.DEBUG_CODE_GENERATOR && !this.DEBUG_CPP_CODE_GENERATOR) {
                    z16 = z18;
                    str2 = str9;
                } else {
                    PrintStream printStream3 = System.out;
                    z16 = z18;
                    StringBuffer stringBuffer8 = new StringBuffer();
                    str2 = str9;
                    stringBuffer8.append("genAlt: ");
                    stringBuffer8.append(i19);
                    printStream3.println(stringBuffer8.toString());
                }
                if (z13 && suitableForCaseExpression(alternativeAt3)) {
                    if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
                        System.out.println("ignoring alt because it was in the switch");
                    }
                } else {
                    Grammar grammar2 = this.grammar;
                    if (grammar2 instanceof LexerGrammar) {
                        int i20 = alternativeAt3.lookaheadDepth;
                        if (i20 == Integer.MAX_VALUE) {
                            i20 = grammar2.maxk;
                        }
                        while (i20 >= 1 && alternativeAt3.cache[i20].containsEpsilon()) {
                            i20--;
                        }
                        if (i20 != i10) {
                            if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
                                PrintStream printStream4 = System.out;
                                StringBuffer stringBuffer9 = new StringBuffer();
                                stringBuffer9.append("ignoring alt because effectiveDepth!=altDepth;");
                                stringBuffer9.append(i20);
                                stringBuffer9.append(Operator.Operation.NOT_EQUALS);
                                stringBuffer9.append(i10);
                                printStream4.println(stringBuffer9.toString());
                            }
                        } else {
                            lookaheadIsEmpty = lookaheadIsEmpty(alternativeAt3, i20);
                            lookaheadTestExpression = getLookaheadTestExpression(alternativeAt3, i20);
                        }
                    } else {
                        lookaheadIsEmpty = lookaheadIsEmpty(alternativeAt3, grammar2.maxk);
                        lookaheadTestExpression = getLookaheadTestExpression(alternativeAt3, this.grammar.maxk);
                    }
                    z17 = z13;
                    i12 = i10;
                    i13 = i19;
                    int i21 = i17;
                    if (alternativeAt3.cache[1].fset.degree() > 127 && suitableForCaseExpression(alternativeAt3)) {
                        if (i18 == 0) {
                            if (this.grammar instanceof TreeWalkerGrammar) {
                                StringBuffer stringBuffer10 = new StringBuffer();
                                stringBuffer10.append("if (_t == ");
                                stringBuffer10.append(this.labeledElementASTInit);
                                stringBuffer10.append(" )");
                                println(stringBuffer10.toString());
                                this.tabs++;
                                println("_t = ASTNULL;");
                                this.tabs--;
                            }
                            StringBuffer stringBuffer11 = new StringBuffer();
                            stringBuffer11.append("if ");
                            stringBuffer11.append(lookaheadTestExpression);
                            stringBuffer11.append(" {");
                            println(stringBuffer11.toString());
                        } else {
                            StringBuffer stringBuffer12 = new StringBuffer();
                            stringBuffer12.append("else if ");
                            stringBuffer12.append(lookaheadTestExpression);
                            stringBuffer12.append(" {");
                            println(stringBuffer12.toString());
                        }
                    } else if (lookaheadIsEmpty && alternativeAt3.semPred == null && alternativeAt3.synPred == null) {
                        if (i18 == 0) {
                            println(str8);
                        } else {
                            println("else {");
                        }
                        cppBlockFinishingInfo3.needAnErrorClause = false;
                    } else {
                        if (alternativeAt3.semPred != null) {
                            str3 = str8;
                            cppBlockFinishingInfo2 = cppBlockFinishingInfo3;
                            String processActionForSpecialSymbols = processActionForSpecialSymbols(alternativeAt3.semPred, alternativeBlock2.line, this.currentRule, new ActionTransInfo());
                            Grammar grammar3 = this.grammar;
                            if (grammar3.debuggingOutput && ((grammar3 instanceof ParserGrammar) || (grammar3 instanceof LexerGrammar))) {
                                StringBuffer stringBuffer13 = new StringBuffer();
                                stringBuffer13.append("(");
                                stringBuffer13.append(lookaheadTestExpression);
                                stringBuffer13.append("&& fireSemanticPredicateEvaluated(antlr.debug.SemanticPredicateEvent.PREDICTING,");
                                stringBuffer13.append(addSemPred(this.charFormatter.escapeString(processActionForSpecialSymbols)));
                                stringBuffer13.append(",");
                                stringBuffer13.append(processActionForSpecialSymbols);
                                stringBuffer13.append("))");
                                lookaheadTestExpression = stringBuffer13.toString();
                            } else {
                                StringBuffer stringBuffer14 = new StringBuffer();
                                stringBuffer14.append("(");
                                stringBuffer14.append(lookaheadTestExpression);
                                stringBuffer14.append("&&(");
                                stringBuffer14.append(processActionForSpecialSymbols);
                                stringBuffer14.append("))");
                                lookaheadTestExpression = stringBuffer14.toString();
                            }
                        } else {
                            cppBlockFinishingInfo2 = cppBlockFinishingInfo3;
                            str3 = str8;
                        }
                        if (i18 > 0) {
                            if (alternativeAt3.synPred != null) {
                                println("else {");
                                this.tabs++;
                                genSynPred(alternativeAt3.synPred, lookaheadTestExpression);
                                i17 = i21 + 1;
                                i18++;
                                this.tabs++;
                                alternativeBlock2 = alternativeBlock;
                                genAlt(alternativeAt3, alternativeBlock2);
                                this.tabs--;
                                str4 = str2;
                                println(str4);
                                i19 = i13 + 1;
                                str9 = str4;
                                z19 = z20;
                                z18 = z16;
                                z13 = z17;
                                i10 = i12;
                                str8 = str3;
                                cppBlockFinishingInfo3 = cppBlockFinishingInfo2;
                            } else {
                                StringBuffer stringBuffer15 = new StringBuffer();
                                stringBuffer15.append("else if ");
                                stringBuffer15.append(lookaheadTestExpression);
                                stringBuffer15.append(" {");
                                println(stringBuffer15.toString());
                            }
                        } else {
                            SynPredBlock synPredBlock = alternativeAt3.synPred;
                            if (synPredBlock != null) {
                                genSynPred(synPredBlock, lookaheadTestExpression);
                            } else {
                                if (this.grammar instanceof TreeWalkerGrammar) {
                                    StringBuffer stringBuffer16 = new StringBuffer();
                                    stringBuffer16.append("if (_t == ");
                                    stringBuffer16.append(this.labeledElementASTInit);
                                    stringBuffer16.append(" )");
                                    println(stringBuffer16.toString());
                                    this.tabs++;
                                    println("_t = ASTNULL;");
                                    this.tabs--;
                                }
                                StringBuffer stringBuffer17 = new StringBuffer();
                                stringBuffer17.append("if ");
                                stringBuffer17.append(lookaheadTestExpression);
                                stringBuffer17.append(" {");
                                println(stringBuffer17.toString());
                            }
                        }
                        i17 = i21;
                        i18++;
                        this.tabs++;
                        alternativeBlock2 = alternativeBlock;
                        genAlt(alternativeAt3, alternativeBlock2);
                        this.tabs--;
                        str4 = str2;
                        println(str4);
                        i19 = i13 + 1;
                        str9 = str4;
                        z19 = z20;
                        z18 = z16;
                        z13 = z17;
                        i10 = i12;
                        str8 = str3;
                        cppBlockFinishingInfo3 = cppBlockFinishingInfo2;
                    }
                    cppBlockFinishingInfo2 = cppBlockFinishingInfo3;
                    str3 = str8;
                    i17 = i21;
                    i18++;
                    this.tabs++;
                    alternativeBlock2 = alternativeBlock;
                    genAlt(alternativeAt3, alternativeBlock2);
                    this.tabs--;
                    str4 = str2;
                    println(str4);
                    i19 = i13 + 1;
                    str9 = str4;
                    z19 = z20;
                    z18 = z16;
                    z13 = z17;
                    i10 = i12;
                    str8 = str3;
                    cppBlockFinishingInfo3 = cppBlockFinishingInfo2;
                }
                cppBlockFinishingInfo2 = cppBlockFinishingInfo3;
                i12 = i10;
                z17 = z13;
                i13 = i19;
                str3 = str8;
                str4 = str2;
                i19 = i13 + 1;
                str9 = str4;
                z19 = z20;
                z18 = z16;
                z13 = z17;
                i10 = i12;
                str8 = str3;
                cppBlockFinishingInfo3 = cppBlockFinishingInfo2;
            }
            i10--;
            cppBlockFinishingInfo3 = cppBlockFinishingInfo3;
        }
        CppBlockFinishingInfo cppBlockFinishingInfo4 = cppBlockFinishingInfo3;
        boolean z21 = z18;
        boolean z22 = z13;
        boolean z23 = z19;
        int i22 = i18;
        String str10 = str9;
        String str11 = str;
        for (int i23 = 1; i23 <= i17; i23++) {
            this.tabs--;
            StringBuffer stringBuffer18 = new StringBuffer();
            stringBuffer18.append(str11);
            stringBuffer18.append(str10);
            str11 = stringBuffer18.toString();
        }
        this.genAST = z21;
        this.saveText = z23;
        if (z22) {
            this.tabs--;
            StringBuffer stringBuffer19 = new StringBuffer();
            stringBuffer19.append(str11);
            stringBuffer19.append(str10);
            cppBlockFinishingInfo = cppBlockFinishingInfo4;
            cppBlockFinishingInfo.postscript = stringBuffer19.toString();
            cppBlockFinishingInfo.generatedSwitch = true;
            if (i22 > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            cppBlockFinishingInfo.generatedAnIf = z15;
        } else {
            cppBlockFinishingInfo = cppBlockFinishingInfo4;
            cppBlockFinishingInfo.postscript = str11;
            cppBlockFinishingInfo.generatedSwitch = false;
            if (i22 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            cppBlockFinishingInfo.generatedAnIf = z14;
        }
        return cppBlockFinishingInfo;
    }

    protected void genHeader(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/* $ANTLR ");
        stringBuffer.append(Tool.version);
        stringBuffer.append(": ");
        stringBuffer.append("\"");
        Tool tool = this.antlrTool;
        stringBuffer.append(tool.fileMinusPath(tool.grammarFile));
        stringBuffer.append("\"");
        stringBuffer.append(" -> ");
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\"$ */");
        println(stringBuffer.toString());
    }

    public void genInclude(LexerGrammar lexerGrammar) {
        String stripFrontBack;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".hpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = false;
        this.saveText = true;
        this.tabs = 0;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#ifndef INC_");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("_hpp_");
        println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("#define INC_");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append("_hpp_");
        println(stringBuffer4.toString());
        println("");
        printHeaderAction(preIncludeHpp);
        println("#include <antlr/config.hpp>");
        genHeader(this.outputFile);
        println("#include <antlr/CommonToken.hpp>");
        println("#include <antlr/InputBuffer.hpp>");
        println("#include <antlr/BitSet.hpp>");
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("#include \"");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer5.append(".hpp\"");
        println(stringBuffer5.toString());
        Grammar grammar = this.grammar;
        String str = grammar.superClass;
        if (str != null) {
            println("\n// Include correct superclass header with a header statement for example:");
            println("// header \"post_include_hpp\" {");
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("// #include \"");
            stringBuffer6.append(str);
            stringBuffer6.append(".hpp\"");
            println(stringBuffer6.toString());
            println("// }");
            println("// Or....");
            println("// header {");
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("// #include \"");
            stringBuffer7.append(str);
            stringBuffer7.append(".hpp\"");
            println(stringBuffer7.toString());
            println("// }\n");
        } else {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("#include <antlr/");
            stringBuffer8.append(superClass);
            stringBuffer8.append(".hpp>");
            println(stringBuffer8.toString());
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(namespaceAntlr);
            stringBuffer9.append(superClass);
            str = stringBuffer9.toString();
        }
        printHeaderAction(postIncludeHpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printHeaderAction("");
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("class CUSTOM_API ");
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append(" : public ");
        stringBuffer10.append(str);
        print(stringBuffer10.toString());
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append(", public ");
        stringBuffer11.append(this.grammar.tokenManager.getName());
        stringBuffer11.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer11.toString());
        Token token = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token != null && (stripFrontBack = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append(", ");
            stringBuffer12.append(stripFrontBack);
            print(stringBuffer12.toString());
        }
        println("{");
        Token token2 = this.grammar.classMemberAction;
        if (token2 != null) {
            genLineNo(token2);
            print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
            genLineNo2();
        }
        this.tabs = 0;
        println("private:");
        this.tabs = 1;
        println("void initLiterals();");
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        println("bool getCaseSensitiveLiterals() const");
        println("{");
        this.tabs++;
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append("return ");
        stringBuffer13.append(lexerGrammar.caseSensitiveLiterals);
        stringBuffer13.append(";");
        println(stringBuffer13.toString());
        this.tabs--;
        println("}");
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        if (this.noConstructors) {
            this.tabs = 0;
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
            this.tabs = 1;
        }
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append(this.grammar.getClassName());
        stringBuffer14.append("(");
        stringBuffer14.append(namespaceStd);
        stringBuffer14.append("istream& in);");
        println(stringBuffer14.toString());
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append(this.grammar.getClassName());
        stringBuffer15.append("(");
        stringBuffer15.append(namespaceAntlr);
        stringBuffer15.append("InputBuffer& ib);");
        println(stringBuffer15.toString());
        StringBuffer stringBuffer16 = new StringBuffer();
        stringBuffer16.append(this.grammar.getClassName());
        stringBuffer16.append("(const ");
        stringBuffer16.append(namespaceAntlr);
        stringBuffer16.append("LexerSharedInputState& state);");
        println(stringBuffer16.toString());
        if (this.noConstructors) {
            this.tabs = 0;
            println("// constructor creation turned of with 'noConstructor' option");
            println("#endif");
            this.tabs = 1;
        }
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append(namespaceAntlr);
        stringBuffer17.append("RefToken nextToken();");
        println(stringBuffer17.toString());
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements.nextElement();
            if (!ruleSymbol.getId().equals("mnextToken")) {
                genRuleHeader(ruleSymbol, false);
            }
            exitIfError();
        }
        this.tabs = 0;
        println("private:");
        this.tabs = 1;
        if (this.grammar.debuggingOutput) {
            println("static const char* _ruleNames[];");
        }
        if (this.grammar.debuggingOutput) {
            println("static const char* _semPredNames[];");
        }
        genBitsetsHeader(this.bitsetsUsed, ((LexerGrammar) this.grammar).charVocabulary.size());
        this.tabs = 0;
        println("};");
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append("#endif /*INC_");
        stringBuffer18.append(this.grammar.getClassName());
        stringBuffer18.append("_hpp_*/");
        println(stringBuffer18.toString());
        this.currentOutput.close();
        this.currentOutput = null;
    }

    public void genInitFactory(Grammar grammar) {
        String str;
        if (!grammar.buildAST) {
            str = "";
        } else {
            str = "factory ";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("void ");
        stringBuffer.append(grammar.getClassName());
        stringBuffer.append("::initializeASTFactory( ");
        stringBuffer.append(namespaceAntlr);
        stringBuffer.append("ASTFactory& ");
        stringBuffer.append(str);
        stringBuffer.append(")");
        println(stringBuffer.toString());
        println("{");
        this.tabs++;
        if (grammar.buildAST) {
            TokenManager tokenManager = this.grammar.tokenManager;
            Enumeration tokenSymbolKeys = tokenManager.getTokenSymbolKeys();
            while (tokenSymbolKeys.hasMoreElements()) {
                String str2 = (String) tokenSymbolKeys.nextElement();
                TokenSymbol tokenSymbol = tokenManager.getTokenSymbol(str2);
                if (tokenSymbol.getASTNodeType() != null) {
                    this.astTypes.ensureCapacity(tokenSymbol.getTokenType());
                    String str3 = (String) this.astTypes.elementAt(tokenSymbol.getTokenType());
                    if (str3 == null) {
                        this.astTypes.setElementAt(tokenSymbol.getASTNodeType(), tokenSymbol.getTokenType());
                    } else if (!tokenSymbol.getASTNodeType().equals(str3)) {
                        Tool tool = this.antlrTool;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Token ");
                        stringBuffer2.append(str2);
                        stringBuffer2.append(" taking most specific AST type");
                        tool.warning(stringBuffer2.toString(), this.grammar.getFilename(), 1, 1);
                        Tool tool2 = this.antlrTool;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("  using ");
                        stringBuffer3.append(str3);
                        stringBuffer3.append(" ignoring ");
                        stringBuffer3.append(tokenSymbol.getASTNodeType());
                        tool2.warning(stringBuffer3.toString(), this.grammar.getFilename(), 1, 1);
                    }
                }
            }
            for (int i10 = 0; i10 < this.astTypes.size(); i10++) {
                String str4 = (String) this.astTypes.elementAt(i10);
                if (str4 != null) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("factory.registerFactory(");
                    stringBuffer4.append(i10);
                    stringBuffer4.append(", \"");
                    stringBuffer4.append(str4);
                    stringBuffer4.append("\", ");
                    stringBuffer4.append(str4);
                    stringBuffer4.append("::factory);");
                    println(stringBuffer4.toString());
                }
            }
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("factory.setMaxNodeType(");
            stringBuffer5.append(this.grammar.tokenManager.maxTokenType());
            stringBuffer5.append(");");
            println(stringBuffer5.toString());
        }
        this.tabs--;
        println("}");
    }

    public void genLineNo(int i10) {
        if (i10 == 0) {
            i10++;
        }
        if (this.genHashLines) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("#line ");
            stringBuffer.append(i10);
            stringBuffer.append(" \"");
            Tool tool = this.antlrTool;
            stringBuffer.append(tool.fileMinusPath(tool.grammarFile));
            stringBuffer.append("\"");
            _println(stringBuffer.toString());
        }
    }

    public void genLineNo2() {
        if (this.genHashLines) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("#line ");
            stringBuffer.append(this.outputLine + 1);
            stringBuffer.append(" \"");
            stringBuffer.append(this.outputFile);
            stringBuffer.append("\"");
            _println(stringBuffer.toString());
        }
    }

    protected void genMatch(BitSet bitSet) {
    }

    protected void genMatchUsingAtomText(GrammarAtom grammarAtom) {
        String str;
        String str2;
        if (this.grammar instanceof TreeWalkerGrammar) {
            if (this.usingCustomAST) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(namespaceAntlr);
                stringBuffer.append("RefAST");
                stringBuffer.append("(_t),");
                str = stringBuffer.toString();
            } else {
                str = "_t,";
            }
        } else {
            str = "";
        }
        if ((this.grammar instanceof LexerGrammar) && (!this.saveText || grammarAtom.getAutoGenType() == 3)) {
            println("_saveIndex = text.length();");
        }
        if (grammarAtom.not) {
            str2 = "matchNot(";
        } else {
            str2 = "match(";
        }
        print(str2);
        _print(str);
        if (grammarAtom.atomText.equals("EOF")) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("Token::EOF_TYPE");
            _print(stringBuffer2.toString());
        } else if (this.grammar instanceof LexerGrammar) {
            _print(convertJavaToCppString(grammarAtom.atomText, false));
        } else {
            _print(grammarAtom.atomText);
        }
        _println(");");
        if (this.grammar instanceof LexerGrammar) {
            if (!this.saveText || grammarAtom.getAutoGenType() == 3) {
                println("text.erase(_saveIndex);");
            }
        }
    }

    protected void genMatchUsingAtomTokenType(GrammarAtom grammarAtom) {
        String str;
        String str2;
        if (this.grammar instanceof TreeWalkerGrammar) {
            if (this.usingCustomAST) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(namespaceAntlr);
                stringBuffer.append("RefAST");
                stringBuffer.append("(_t),");
                str = stringBuffer.toString();
            } else {
                str = "_t,";
            }
        } else {
            str = "";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append(getValueString(grammarAtom.getType()));
        String stringBuffer3 = stringBuffer2.toString();
        StringBuffer stringBuffer4 = new StringBuffer();
        if (grammarAtom.not) {
            str2 = "matchNot(";
        } else {
            str2 = "match(";
        }
        stringBuffer4.append(str2);
        stringBuffer4.append(stringBuffer3);
        stringBuffer4.append(");");
        println(stringBuffer4.toString());
    }

    public void genNextToken() {
        boolean z10;
        String str;
        String stringBuffer;
        int i10 = 0;
        while (true) {
            if (i10 < this.grammar.rules.size()) {
                RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.rules.elementAt(i10);
                if (ruleSymbol.isDefined() && ruleSymbol.access.equals("public")) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            println("");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("RefToken ");
            stringBuffer2.append(this.grammar.getClassName());
            stringBuffer2.append("::nextToken() { return ");
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("RefToken(new ");
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("CommonToken(");
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("Token::EOF_TYPE, \"\")); }");
            println(stringBuffer2.toString());
            println("");
            return;
        }
        Grammar grammar = this.grammar;
        RuleBlock createNextTokenRule = MakeGrammar.createNextTokenRule(grammar, grammar.rules, "nextToken");
        RuleSymbol ruleSymbol2 = new RuleSymbol("mnextToken");
        ruleSymbol2.setDefined();
        ruleSymbol2.setBlock(createNextTokenRule);
        ruleSymbol2.access = "private";
        this.grammar.define(ruleSymbol2);
        this.grammar.theLLkAnalyzer.deterministic(createNextTokenRule);
        Grammar grammar2 = this.grammar;
        if (((LexerGrammar) grammar2).filterMode) {
            str = ((LexerGrammar) grammar2).filterRule;
        } else {
            str = null;
        }
        println("");
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(namespaceAntlr);
        stringBuffer3.append("RefToken ");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("::nextToken()");
        println(stringBuffer3.toString());
        println("{");
        this.tabs++;
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(namespaceAntlr);
        stringBuffer4.append("RefToken theRetToken;");
        println(stringBuffer4.toString());
        println("for (;;) {");
        this.tabs++;
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(namespaceAntlr);
        stringBuffer5.append("RefToken theRetToken;");
        println(stringBuffer5.toString());
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("int _ttype = ");
        stringBuffer6.append(namespaceAntlr);
        stringBuffer6.append("Token::INVALID_TYPE;");
        println(stringBuffer6.toString());
        if (((LexerGrammar) this.grammar).filterMode) {
            println("setCommitToPath(false);");
            if (str != null) {
                if (!this.grammar.isDefined(CodeGenerator.encodeLexerRuleName(str))) {
                    Tool tool = this.grammar.antlrTool;
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("Filter rule ");
                    stringBuffer7.append(str);
                    stringBuffer7.append(" does not exist in this lexer");
                    tool.error(stringBuffer7.toString());
                } else {
                    RuleSymbol ruleSymbol3 = (RuleSymbol) this.grammar.getSymbol(CodeGenerator.encodeLexerRuleName(str));
                    if (!ruleSymbol3.isDefined()) {
                        Tool tool2 = this.grammar.antlrTool;
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("Filter rule ");
                        stringBuffer8.append(str);
                        stringBuffer8.append(" does not exist in this lexer");
                        tool2.error(stringBuffer8.toString());
                    } else if (ruleSymbol3.access.equals("public")) {
                        Tool tool3 = this.grammar.antlrTool;
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("Filter rule ");
                        stringBuffer9.append(str);
                        stringBuffer9.append(" must be protected");
                        tool3.error(stringBuffer9.toString());
                    }
                }
                println("int _m;");
                println("_m = mark();");
            }
        }
        println("resetText();");
        println("try {   // for lexical and char stream error handling");
        this.tabs++;
        for (int i11 = 0; i11 < createNextTokenRule.getAlternatives().size(); i11++) {
            if (createNextTokenRule.getAlternativeAt(i11).cache[1].containsEpsilon()) {
                this.antlrTool.warning("found optional path in nextToken()");
            }
        }
        String property = System.getProperty("line.separator");
        CppBlockFinishingInfo genCommonBlock = genCommonBlock(createNextTokenRule, false);
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("if (LA(1)==EOF_CHAR)");
        stringBuffer10.append(property);
        stringBuffer10.append("\t\t\t\t{");
        stringBuffer10.append(property);
        stringBuffer10.append("\t\t\t\t\tuponEOF();");
        stringBuffer10.append(property);
        stringBuffer10.append("\t\t\t\t\t_returnToken = makeToken(");
        stringBuffer10.append(namespaceAntlr);
        stringBuffer10.append("Token::EOF_TYPE);");
        stringBuffer10.append(property);
        stringBuffer10.append("\t\t\t\t}");
        String stringBuffer11 = stringBuffer10.toString();
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append(stringBuffer11);
        stringBuffer12.append(property);
        stringBuffer12.append("\t\t\t\t");
        String stringBuffer13 = stringBuffer12.toString();
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                StringBuffer stringBuffer14 = new StringBuffer();
                stringBuffer14.append(stringBuffer13);
                stringBuffer14.append("else {consume(); goto tryAgain;}");
                stringBuffer = stringBuffer14.toString();
            } else {
                StringBuffer stringBuffer15 = new StringBuffer();
                stringBuffer15.append(stringBuffer13);
                stringBuffer15.append("else {");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\tcommit();");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\ttry {m");
                stringBuffer15.append(str);
                stringBuffer15.append("(false);}");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\tcatch(");
                stringBuffer15.append(namespaceAntlr);
                stringBuffer15.append("RecognitionException& e) {");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\t\t// catastrophic failure");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\t\treportError(e);");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\t\tconsume();");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\t}");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t\tgoto tryAgain;");
                stringBuffer15.append(property);
                stringBuffer15.append("\t\t\t\t}");
                stringBuffer = stringBuffer15.toString();
            }
        } else {
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(stringBuffer13);
            stringBuffer16.append("else {");
            stringBuffer16.append(this.throwNoViable);
            stringBuffer16.append("}");
            stringBuffer = stringBuffer16.toString();
        }
        genBlockFinish(genCommonBlock, stringBuffer);
        if (((LexerGrammar) this.grammar).filterMode && str != null) {
            println("commit();");
        }
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append("if ( !_returnToken )");
        stringBuffer17.append(property);
        stringBuffer17.append("\t\t\t\tgoto tryAgain; // found SKIP token");
        stringBuffer17.append(property);
        println(stringBuffer17.toString());
        println("_ttype = _returnToken->getType();");
        if (((LexerGrammar) this.grammar).getTestLiterals()) {
            genLiteralsTest();
        }
        println("_returnToken->setType(_ttype);");
        println("return _returnToken;");
        this.tabs--;
        println("}");
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append("catch (");
        stringBuffer18.append(namespaceAntlr);
        stringBuffer18.append("RecognitionException& e) {");
        println(stringBuffer18.toString());
        this.tabs++;
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                println("if ( !getCommitToPath() ) {");
                this.tabs++;
                println("consume();");
                println("goto tryAgain;");
                this.tabs--;
                println("}");
            } else {
                println("if ( !getCommitToPath() ) {");
                this.tabs++;
                println("rewind(_m);");
                println("resetText();");
                StringBuffer stringBuffer19 = new StringBuffer();
                stringBuffer19.append("try {m");
                stringBuffer19.append(str);
                stringBuffer19.append("(false);}");
                println(stringBuffer19.toString());
                StringBuffer stringBuffer20 = new StringBuffer();
                stringBuffer20.append("catch(");
                stringBuffer20.append(namespaceAntlr);
                stringBuffer20.append("RecognitionException& ee) {");
                println(stringBuffer20.toString());
                println("\t// horrendous failure: error in filter rule");
                println("\treportError(ee);");
                println("\tconsume();");
                println("}");
                this.tabs--;
                println("}");
                println("else");
            }
        }
        if (createNextTokenRule.getDefaultErrorHandler()) {
            println("{");
            this.tabs++;
            println("reportError(e);");
            println("consume();");
            this.tabs--;
            println("}");
        } else {
            this.tabs++;
            StringBuffer stringBuffer21 = new StringBuffer();
            stringBuffer21.append("throw ");
            stringBuffer21.append(namespaceAntlr);
            stringBuffer21.append("TokenStreamRecognitionException(e);");
            println(stringBuffer21.toString());
            this.tabs--;
        }
        this.tabs--;
        println("}");
        StringBuffer stringBuffer22 = new StringBuffer();
        stringBuffer22.append("catch (");
        stringBuffer22.append(namespaceAntlr);
        stringBuffer22.append("CharStreamIOException& csie) {");
        println(stringBuffer22.toString());
        StringBuffer stringBuffer23 = new StringBuffer();
        stringBuffer23.append("\tthrow ");
        stringBuffer23.append(namespaceAntlr);
        stringBuffer23.append("TokenStreamIOException(csie.io);");
        println(stringBuffer23.toString());
        println("}");
        StringBuffer stringBuffer24 = new StringBuffer();
        stringBuffer24.append("catch (");
        stringBuffer24.append(namespaceAntlr);
        stringBuffer24.append("CharStreamException& cse) {");
        println(stringBuffer24.toString());
        StringBuffer stringBuffer25 = new StringBuffer();
        stringBuffer25.append("\tthrow ");
        stringBuffer25.append(namespaceAntlr);
        stringBuffer25.append("TokenStreamException(cse.getMessage());");
        println(stringBuffer25.toString());
        println("}");
        _println("tryAgain:;");
        this.tabs--;
        println("}");
        this.tabs--;
        println("}");
        println("");
    }

    public void genRule(RuleSymbol ruleSymbol, boolean z10, int i10, String str) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genRule(");
            stringBuffer.append(ruleSymbol.getId());
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (!ruleSymbol.isDefined()) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("undefined rule: ");
            stringBuffer2.append(ruleSymbol.getId());
            tool.error(stringBuffer2.toString());
            return;
        }
        RuleBlock block = ruleSymbol.getBlock();
        this.currentRule = block;
        this.currentASTResult = ruleSymbol.getId();
        this.declaredASTVariables.clear();
        boolean z12 = this.genAST;
        if (z12 && block.getAutoGen()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.genAST = z11;
        this.saveText = block.getAutoGen();
        String str2 = ruleSymbol.comment;
        if (str2 != null) {
            _println(str2);
        }
        if (block.returnAction != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(extractTypeOfAction(block.returnAction, block.getLine(), block.getColumn()));
            stringBuffer3.append(" ");
            _print(stringBuffer3.toString());
        } else {
            _print("void ");
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(str);
        stringBuffer4.append(ruleSymbol.getId());
        stringBuffer4.append("(");
        _print(stringBuffer4.toString());
        _print(this.commonExtraParams);
        if (this.commonExtraParams.length() != 0 && block.argAction != null) {
            _print(",");
        }
        if (block.argAction != null) {
            _println("");
            this.tabs++;
            String str3 = block.argAction;
            int indexOf = str3.indexOf(61);
            if (indexOf != -1) {
                String str4 = "";
                int i14 = indexOf;
                int i15 = 0;
                String str5 = str3;
                str3 = str4;
                while (i15 != -1) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(str3);
                    stringBuffer5.append(str4);
                    stringBuffer5.append(str5.substring(0, i14).trim());
                    str3 = stringBuffer5.toString();
                    i15 = str5.indexOf(44, i14);
                    str4 = ", ";
                    if (i15 != -1) {
                        str5 = str5.substring(i15 + 1).trim();
                        i14 = str5.indexOf(61);
                    }
                }
            }
            println(str3);
            i11 = 1;
            this.tabs--;
            print(") ");
        } else {
            i11 = 1;
            _print(") ");
        }
        _println("{");
        this.tabs += i11;
        Grammar grammar = this.grammar;
        if (grammar.traceRules) {
            if (grammar instanceof TreeWalkerGrammar) {
                if (this.usingCustomAST) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("Tracer traceInOut(this,\"");
                    stringBuffer6.append(ruleSymbol.getId());
                    stringBuffer6.append("\",");
                    stringBuffer6.append(namespaceAntlr);
                    stringBuffer6.append("RefAST");
                    stringBuffer6.append("(_t));");
                    println(stringBuffer6.toString());
                } else {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("Tracer traceInOut(this,\"");
                    stringBuffer7.append(ruleSymbol.getId());
                    stringBuffer7.append("\",_t);");
                    println(stringBuffer7.toString());
                }
            } else {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("Tracer traceInOut(this, \"");
                stringBuffer8.append(ruleSymbol.getId());
                stringBuffer8.append("\");");
                println(stringBuffer8.toString());
            }
        }
        if (block.returnAction != null) {
            genLineNo(block);
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(block.returnAction);
            stringBuffer9.append(";");
            println(stringBuffer9.toString());
            genLineNo2();
        }
        if (!this.commonLocalVars.equals("")) {
            println(this.commonLocalVars);
        }
        if (this.grammar instanceof LexerGrammar) {
            if (ruleSymbol.getId().equals("mEOF")) {
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append("_ttype = ");
                stringBuffer10.append(namespaceAntlr);
                stringBuffer10.append("Token::EOF_TYPE;");
                println(stringBuffer10.toString());
            } else {
                StringBuffer stringBuffer11 = new StringBuffer();
                stringBuffer11.append("_ttype = ");
                stringBuffer11.append(ruleSymbol.getId().substring(1));
                stringBuffer11.append(";");
                println(stringBuffer11.toString());
            }
            println("int _saveIndex;");
        }
        Grammar grammar2 = this.grammar;
        if (grammar2.debuggingOutput) {
            if (grammar2 instanceof ParserGrammar) {
                StringBuffer stringBuffer12 = new StringBuffer();
                stringBuffer12.append("fireEnterRule(");
                stringBuffer12.append(i10);
                stringBuffer12.append(",0);");
                println(stringBuffer12.toString());
            } else if (grammar2 instanceof LexerGrammar) {
                StringBuffer stringBuffer13 = new StringBuffer();
                stringBuffer13.append("fireEnterRule(");
                stringBuffer13.append(i10);
                stringBuffer13.append(",_ttype);");
                println(stringBuffer13.toString());
            }
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer14 = new StringBuffer();
            stringBuffer14.append(this.labeledElementASTType);
            stringBuffer14.append(" ");
            stringBuffer14.append(ruleSymbol.getId());
            stringBuffer14.append("_AST_in = (_t == ASTNULL) ? ");
            stringBuffer14.append(this.labeledElementASTInit);
            stringBuffer14.append(" : _t;");
            println(stringBuffer14.toString());
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append("returnAST = ");
            stringBuffer15.append(this.labeledElementASTInit);
            stringBuffer15.append(";");
            println(stringBuffer15.toString());
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(namespaceAntlr);
            stringBuffer16.append("ASTPair currentAST;");
            println(stringBuffer16.toString());
            StringBuffer stringBuffer17 = new StringBuffer();
            stringBuffer17.append(this.labeledElementASTType);
            stringBuffer17.append(" ");
            stringBuffer17.append(ruleSymbol.getId());
            stringBuffer17.append("_AST = ");
            stringBuffer17.append(this.labeledElementASTInit);
            stringBuffer17.append(";");
            println(stringBuffer17.toString());
        }
        genBlockPreamble(block);
        genBlockInitAction(block);
        println("");
        ExceptionSpec findExceptionSpec = block.findExceptionSpec("");
        if (findExceptionSpec == null && !block.getDefaultErrorHandler()) {
            i12 = 1;
        } else {
            println("try {      // for error handling");
            i12 = 1;
            this.tabs++;
        }
        if (block.alternatives.size() == i12) {
            Alternative alternativeAt = block.getAlternativeAt(0);
            String str6 = alternativeAt.semPred;
            if (str6 != null) {
                genSemPred(str6, this.currentRule.line);
            }
            if (alternativeAt.synPred != null) {
                this.antlrTool.warning("Syntactic predicate ignored for single alternative", this.grammar.getFilename(), alternativeAt.synPred.getLine(), alternativeAt.synPred.getColumn());
            }
            genAlt(alternativeAt, block);
        } else {
            this.grammar.theLLkAnalyzer.deterministic(block);
            genBlockFinish(genCommonBlock(block, false), this.throwNoViable);
        }
        if (findExceptionSpec != null || block.getDefaultErrorHandler()) {
            this.tabs--;
            println("}");
        }
        if (findExceptionSpec != null) {
            genErrorHandler(findExceptionSpec);
        } else if (block.getDefaultErrorHandler()) {
            StringBuffer stringBuffer18 = new StringBuffer();
            stringBuffer18.append("catch (");
            stringBuffer18.append(this.exceptionThrown);
            stringBuffer18.append("& ex) {");
            println(stringBuffer18.toString());
            this.tabs++;
            if (this.grammar.hasSyntacticPredicate) {
                println("if( inputState->guessing == 0 ) {");
                this.tabs++;
            }
            println("reportError(ex);");
            Grammar grammar3 = this.grammar;
            if (!(grammar3 instanceof TreeWalkerGrammar)) {
                String bitsetName = getBitsetName(markBitsetForGen(grammar3.theLLkAnalyzer.FOLLOW(1, block.endNode).fset));
                println("consume();");
                StringBuffer stringBuffer19 = new StringBuffer();
                stringBuffer19.append("consumeUntil(");
                stringBuffer19.append(bitsetName);
                stringBuffer19.append(");");
                println(stringBuffer19.toString());
                i13 = 1;
            } else {
                StringBuffer stringBuffer20 = new StringBuffer();
                stringBuffer20.append("if ( _t != ");
                stringBuffer20.append(this.labeledElementASTInit);
                stringBuffer20.append(" )");
                println(stringBuffer20.toString());
                i13 = 1;
                this.tabs++;
                println("_t = _t->getNextSibling();");
                this.tabs--;
            }
            if (this.grammar.hasSyntacticPredicate) {
                this.tabs -= i13;
                println("} else {");
                this.tabs += i13;
                println("throw;");
                this.tabs -= i13;
                println("}");
            }
            this.tabs -= i13;
            println("}");
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer21 = new StringBuffer();
            stringBuffer21.append("returnAST = ");
            stringBuffer21.append(ruleSymbol.getId());
            stringBuffer21.append("_AST;");
            println(stringBuffer21.toString());
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_retTree = _t;");
        }
        if (block.getTestLiterals()) {
            if (ruleSymbol.access.equals("protected")) {
                genLiteralsTestForPartialToken();
            } else {
                genLiteralsTest();
            }
        }
        if (this.grammar instanceof LexerGrammar) {
            StringBuffer stringBuffer22 = new StringBuffer();
            stringBuffer22.append("if ( _createToken && _token==");
            stringBuffer22.append(namespaceAntlr);
            stringBuffer22.append("nullToken && _ttype!=");
            stringBuffer22.append(namespaceAntlr);
            stringBuffer22.append("Token::SKIP ) {");
            println(stringBuffer22.toString());
            println("   _token = makeToken(_ttype);");
            println("   _token->setText(text.substr(_begin, text.length()-_begin));");
            println("}");
            println("_returnToken = _token;");
            println("_saveIndex=0;");
        }
        if (block.returnAction != null) {
            StringBuffer stringBuffer23 = new StringBuffer();
            stringBuffer23.append("return ");
            stringBuffer23.append(extractIdOfAction(block.returnAction, block.getLine(), block.getColumn()));
            stringBuffer23.append(";");
            println(stringBuffer23.toString());
        }
        this.tabs--;
        println("}");
        println("");
        this.genAST = z12;
    }

    public void genRuleHeader(RuleSymbol ruleSymbol, boolean z10) {
        boolean z11;
        this.tabs = 1;
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genRuleHeader(");
            stringBuffer.append(ruleSymbol.getId());
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (!ruleSymbol.isDefined()) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("undefined rule: ");
            stringBuffer2.append(ruleSymbol.getId());
            tool.error(stringBuffer2.toString());
            return;
        }
        RuleBlock block = ruleSymbol.getBlock();
        this.currentRule = block;
        this.currentASTResult = ruleSymbol.getId();
        boolean z12 = this.genAST;
        if (z12 && block.getAutoGen()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.genAST = z11;
        this.saveText = block.getAutoGen();
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(ruleSymbol.access);
        stringBuffer3.append(": ");
        print(stringBuffer3.toString());
        if (block.returnAction != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(extractTypeOfAction(block.returnAction, block.getLine(), block.getColumn()));
            stringBuffer4.append(" ");
            _print(stringBuffer4.toString());
        } else {
            _print("void ");
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(ruleSymbol.getId());
        stringBuffer5.append("(");
        _print(stringBuffer5.toString());
        _print(this.commonExtraParams);
        if (this.commonExtraParams.length() != 0 && block.argAction != null) {
            _print(",");
        }
        if (block.argAction != null) {
            _println("");
            this.tabs++;
            println(block.argAction);
            this.tabs--;
            print(")");
        } else {
            _print(")");
        }
        _println(";");
        this.tabs--;
        this.genAST = z12;
    }

    protected void genSemPred(String str, int i10) {
        String processActionForSpecialSymbols = processActionForSpecialSymbols(str, i10, this.currentRule, new ActionTransInfo());
        String escapeString = this.charFormatter.escapeString(processActionForSpecialSymbols);
        Grammar grammar = this.grammar;
        if (grammar.debuggingOutput && ((grammar instanceof ParserGrammar) || (grammar instanceof LexerGrammar))) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("fireSemanticPredicateEvaluated(antlr.debug.SemanticPredicateEvent.VALIDATING,");
            stringBuffer.append(addSemPred(escapeString));
            stringBuffer.append(",");
            stringBuffer.append(processActionForSpecialSymbols);
            stringBuffer.append(")");
            processActionForSpecialSymbols = stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("if (!(");
        stringBuffer2.append(processActionForSpecialSymbols);
        stringBuffer2.append("))");
        println(stringBuffer2.toString());
        this.tabs++;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("throw ");
        stringBuffer3.append(namespaceAntlr);
        stringBuffer3.append("SemanticException(\"");
        stringBuffer3.append(escapeString);
        stringBuffer3.append("\");");
        println(stringBuffer3.toString());
        this.tabs--;
    }

    protected void genSemPredMap(String str) {
        Enumeration elements = this.semPreds.elements();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("const char* ");
        stringBuffer.append(str);
        stringBuffer.append("_semPredNames[] = {");
        println(stringBuffer.toString());
        this.tabs++;
        while (elements.hasMoreElements()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\"");
            stringBuffer2.append(elements.nextElement());
            stringBuffer2.append("\",");
            println(stringBuffer2.toString());
        }
        println(MessageService.MSG_DB_READY_REPORT);
        this.tabs--;
        println("};");
    }

    protected void genSynPred(SynPredBlock synPredBlock, String str) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gen=>(");
            stringBuffer.append(synPredBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("bool synPredMatched");
        stringBuffer2.append(synPredBlock.f4235ID);
        stringBuffer2.append(" = false;");
        println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("if (");
        stringBuffer3.append(str);
        stringBuffer3.append(") {");
        println(stringBuffer3.toString());
        this.tabs++;
        if (this.grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(this.labeledElementType);
            stringBuffer4.append(" __t");
            stringBuffer4.append(synPredBlock.f4235ID);
            stringBuffer4.append(" = _t;");
            println(stringBuffer4.toString());
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("int _m");
            stringBuffer5.append(synPredBlock.f4235ID);
            stringBuffer5.append(" = mark();");
            println(stringBuffer5.toString());
        }
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("synPredMatched");
        stringBuffer6.append(synPredBlock.f4235ID);
        stringBuffer6.append(" = true;");
        println(stringBuffer6.toString());
        println("inputState->guessing++;");
        Grammar grammar = this.grammar;
        if (grammar.debuggingOutput && ((grammar instanceof ParserGrammar) || (grammar instanceof LexerGrammar))) {
            println("fireSyntacticPredicateStarted();");
        }
        this.syntacticPredLevel++;
        println("try {");
        this.tabs++;
        gen(synPredBlock);
        this.tabs--;
        println("}");
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("catch (");
        stringBuffer7.append(this.exceptionThrown);
        stringBuffer7.append("& pe) {");
        println(stringBuffer7.toString());
        this.tabs++;
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("synPredMatched");
        stringBuffer8.append(synPredBlock.f4235ID);
        stringBuffer8.append(" = false;");
        println(stringBuffer8.toString());
        this.tabs--;
        println("}");
        if (this.grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append("_t = __t");
            stringBuffer9.append(synPredBlock.f4235ID);
            stringBuffer9.append(";");
            println(stringBuffer9.toString());
        } else {
            StringBuffer stringBuffer10 = new StringBuffer();
            stringBuffer10.append("rewind(_m");
            stringBuffer10.append(synPredBlock.f4235ID);
            stringBuffer10.append(");");
            println(stringBuffer10.toString());
        }
        println("inputState->guessing--;");
        Grammar grammar2 = this.grammar;
        if (grammar2.debuggingOutput && ((grammar2 instanceof ParserGrammar) || (grammar2 instanceof LexerGrammar))) {
            StringBuffer stringBuffer11 = new StringBuffer();
            stringBuffer11.append("if (synPredMatched");
            stringBuffer11.append(synPredBlock.f4235ID);
            stringBuffer11.append(")");
            println(stringBuffer11.toString());
            println("  fireSyntacticPredicateSucceeded();");
            println("else");
            println("  fireSyntacticPredicateFailed();");
        }
        this.syntacticPredLevel--;
        this.tabs--;
        println("}");
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append("if ( synPredMatched");
        stringBuffer12.append(synPredBlock.f4235ID);
        stringBuffer12.append(" ) {");
        println(stringBuffer12.toString());
    }

    public void genTokenStrings(String str) {
        TokenSymbol tokenSymbol;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("const char* ");
        stringBuffer.append(str);
        stringBuffer.append("tokenNames[] = {");
        println(stringBuffer.toString());
        this.tabs++;
        Vector vocabulary = this.grammar.tokenManager.getVocabulary();
        for (int i10 = 0; i10 < vocabulary.size(); i10++) {
            String str2 = (String) vocabulary.elementAt(i10);
            if (str2 == null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(Operator.Operation.LESS_THAN);
                stringBuffer2.append(String.valueOf(i10));
                stringBuffer2.append(Operator.Operation.GREATER_THAN);
                str2 = stringBuffer2.toString();
            }
            if (!str2.startsWith("\"") && !str2.startsWith(Operator.Operation.LESS_THAN) && (tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str2)) != null && tokenSymbol.getParaphrase() != null) {
                str2 = StringUtils.stripFrontBack(tokenSymbol.getParaphrase(), "\"", "\"");
            }
            print(this.charFormatter.literalString(str2));
            _println(",");
        }
        println(MessageService.MSG_DB_READY_REPORT);
        this.tabs--;
        println("};");
    }

    protected void genTokenTypes(TokenManager tokenManager) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tokenManager.getName());
        stringBuffer.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer.append(".hpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.tabs = 0;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#ifndef INC_");
        stringBuffer3.append(tokenManager.getName());
        stringBuffer3.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer3.append("_hpp_");
        println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("#define INC_");
        stringBuffer4.append(tokenManager.getName());
        stringBuffer4.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer4.append("_hpp_");
        println(stringBuffer4.toString());
        println("");
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        genHeader(this.outputFile);
        println("");
        println("#ifndef CUSTOM_API");
        println("# define CUSTOM_API");
        println("#endif");
        println("");
        println("#ifdef __cplusplus");
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("struct CUSTOM_API ");
        stringBuffer5.append(tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer5.append(" {");
        println(stringBuffer5.toString());
        println("#endif");
        this.tabs++;
        println("enum {");
        this.tabs++;
        Vector vocabulary = tokenManager.getVocabulary();
        println("EOF_ = 1,");
        for (int i10 = 4; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str != null) {
                if (str.startsWith("\"")) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenManager.getTokenSymbol(str);
                    if (stringLiteralSymbol == null) {
                        Tool tool = this.antlrTool;
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("String literal ");
                        stringBuffer6.append(str);
                        stringBuffer6.append(" not in symbol table");
                        tool.panic(stringBuffer6.toString());
                    } else if (stringLiteralSymbol.label != null) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append(stringLiteralSymbol.label);
                        stringBuffer7.append(" = ");
                        stringBuffer7.append(i10);
                        stringBuffer7.append(",");
                        println(stringBuffer7.toString());
                    } else {
                        String mangleLiteral = mangleLiteral(str);
                        if (mangleLiteral != null) {
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append(mangleLiteral);
                            stringBuffer8.append(" = ");
                            stringBuffer8.append(i10);
                            stringBuffer8.append(",");
                            println(stringBuffer8.toString());
                            stringLiteralSymbol.label = mangleLiteral;
                        } else {
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append("// ");
                            stringBuffer9.append(str);
                            stringBuffer9.append(" = ");
                            stringBuffer9.append(i10);
                            println(stringBuffer9.toString());
                        }
                    }
                } else if (!str.startsWith(Operator.Operation.LESS_THAN)) {
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append(str);
                    stringBuffer10.append(" = ");
                    stringBuffer10.append(i10);
                    stringBuffer10.append(",");
                    println(stringBuffer10.toString());
                }
            }
        }
        println("NULL_TREE_LOOKAHEAD = 3");
        this.tabs--;
        println("};");
        this.tabs--;
        println("#ifdef __cplusplus");
        println("};");
        println("#endif");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("#endif /*INC_");
        stringBuffer11.append(tokenManager.getName());
        stringBuffer11.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer11.append("_hpp_*/");
        println(stringBuffer11.toString());
        this.currentOutput.close();
        this.currentOutput = null;
        exitIfError();
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(Vector vector) {
        if (vector.size() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.labeledElementASTType);
        stringBuffer2.append("(astFactory->make((new ");
        stringBuffer2.append(namespaceAntlr);
        stringBuffer2.append("ASTArray(");
        stringBuffer2.append(vector.size());
        stringBuffer2.append("))");
        stringBuffer.append(stringBuffer2.toString());
        for (int i10 = 0; i10 < vector.size(); i10++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("->add(");
            stringBuffer3.append(vector.elementAt(i10));
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append("))");
        return stringBuffer.toString();
    }

    protected String getLookaheadTestExpression(Lookahead[] lookaheadArr, int i10) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("(");
        int i11 = 1;
        boolean z10 = true;
        while (i11 <= i10) {
            BitSet bitSet = lookaheadArr[i11].fset;
            if (!z10) {
                stringBuffer.append(") && (");
            }
            if (lookaheadArr[i11].containsEpsilon()) {
                stringBuffer.append("true");
            } else {
                stringBuffer.append(getLookaheadTestTerm(i11, bitSet));
            }
            i11++;
            z10 = false;
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    protected String getLookaheadTestTerm(int i10, BitSet bitSet) {
        String lookaheadString = lookaheadString(i10);
        int[] array = bitSet.toArray();
        if (CodeGenerator.elementsAreRange(array)) {
            return getRangeExpression(i10, array);
        }
        int degree = bitSet.degree();
        if (degree == 0) {
            return "true";
        }
        if (degree >= this.bitsetTestThreshold) {
            int markBitsetForGen = markBitsetForGen(bitSet);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getBitsetName(markBitsetForGen));
            stringBuffer.append(".member(");
            stringBuffer.append(lookaheadString);
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i11 = 0; i11 < array.length; i11++) {
            String valueString = getValueString(array[i11]);
            if (i11 > 0) {
                stringBuffer2.append(" || ");
            }
            stringBuffer2.append(lookaheadString);
            stringBuffer2.append(" == ");
            stringBuffer2.append(valueString);
        }
        return stringBuffer2.toString();
    }

    public String getRangeExpression(int i10, int[] iArr) {
        if (!CodeGenerator.elementsAreRange(iArr)) {
            this.antlrTool.panic("getRangeExpression called with non-range");
        }
        int i11 = iArr[0];
        int i12 = iArr[iArr.length - 1];
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(lookaheadString(i10));
        stringBuffer.append(" >= ");
        stringBuffer.append(getValueString(i11));
        stringBuffer.append(" && ");
        stringBuffer.append(lookaheadString(i10));
        stringBuffer.append(" <= ");
        stringBuffer.append(getValueString(i12));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    protected boolean lookaheadIsEmpty(Alternative alternative, int i10) {
        int i11 = alternative.lookaheadDepth;
        if (i11 == Integer.MAX_VALUE) {
            i11 = this.grammar.maxk;
        }
        for (int i12 = 1; i12 <= i11 && i12 <= i10; i12++) {
            if (alternative.cache[i12].fset.degree() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // antlr.CodeGenerator
    public String mapTreeId(String str, ActionTransInfo actionTransInfo) {
        boolean z10;
        StringBuffer stringBuffer;
        if (this.currentRule == null) {
            return str;
        }
        Grammar grammar = this.grammar;
        if (grammar instanceof TreeWalkerGrammar) {
            z10 = true;
            boolean z11 = !grammar.buildAST;
            if (str.length() > 3 && str.lastIndexOf("_in") == str.length() - 3) {
                str = str.substring(0, str.length() - 3);
            } else {
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < this.currentRule.labeledElements.size(); i10++) {
            if (((AlternativeElement) this.currentRule.labeledElements.elementAt(i10)).getLabel().equals(str)) {
                if (!z10) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("_AST");
                    return stringBuffer2.toString();
                }
                return str;
            }
        }
        String str2 = (String) this.treeVariableMap.get(str);
        if (str2 != null) {
            if (str2 == NONUNIQUE) {
                Tool tool = this.antlrTool;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Ambiguous reference to AST element ");
                stringBuffer3.append(str);
                stringBuffer3.append(" in rule ");
                stringBuffer3.append(this.currentRule.getRuleName());
                tool.error(stringBuffer3.toString());
                return null;
            }
            if (str2.equals(this.currentRule.getRuleName())) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Ambiguous reference to AST element ");
                stringBuffer4.append(str);
                stringBuffer4.append(" in rule ");
                stringBuffer4.append(this.currentRule.getRuleName());
                tool2.error(stringBuffer4.toString());
                return null;
            }
            if (z10) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(str2);
                stringBuffer5.append("_in");
                return stringBuffer5.toString();
            }
            return str2;
        }
        if (str.equals(this.currentRule.getRuleName())) {
            if (z10) {
                stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append("_AST_in");
            } else {
                stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append("_AST");
            }
            str = stringBuffer.toString();
            if (actionTransInfo != null && !z10) {
                actionTransInfo.refRuleRoot = str;
            }
        }
        return str;
    }

    public void printAction(Token token) {
        if (token != null) {
            genLineNo(token.getLine());
            printTabs();
            _printAction(processActionForSpecialSymbols(token.getText(), token.getLine(), null, null));
            genLineNo2();
        }
    }

    public void printHeaderAction(String str) {
        Token token = (Token) this.behavior.headerActions.get(str);
        if (token != null) {
            genLineNo(token.getLine());
            println(processActionForSpecialSymbols(token.getText(), token.getLine(), null, null));
            genLineNo2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CodeGenerator
    public void println(String str) {
        if (str != null) {
            printTabs();
            this.outputLine += countLines(str) + 1;
            this.currentOutput.println(str);
        }
    }

    @Override // antlr.CodeGenerator
    protected String processActionForSpecialSymbols(String str, int i10, RuleBlock ruleBlock, ActionTransInfo actionTransInfo) {
        if (str != null && str.length() != 0) {
            Grammar grammar = this.grammar;
            if (grammar == null) {
                return str;
            }
            if (!grammar.buildAST || str.indexOf(35) == -1) {
                Grammar grammar2 = this.grammar;
                if (!(grammar2 instanceof TreeWalkerGrammar) && ((!(grammar2 instanceof LexerGrammar) && !(grammar2 instanceof ParserGrammar)) || str.indexOf(36) == -1)) {
                    return str;
                }
            }
            ActionLexer actionLexer = new ActionLexer(str, ruleBlock, this, actionTransInfo);
            actionLexer.setLineOffset(i10);
            actionLexer.setFilename(this.grammar.getFilename());
            actionLexer.setTool(this.antlrTool);
            try {
                actionLexer.mACTION(true);
                return actionLexer.getTokenObject().getText();
            } catch (CharStreamException unused) {
                Tool tool = this.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Error reading action:");
                stringBuffer.append(str);
                tool.panic(stringBuffer.toString());
                return str;
            } catch (RecognitionException e10) {
                actionLexer.reportError(e10);
                return str;
            } catch (TokenStreamException unused2) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Error reading action:");
                stringBuffer2.append(str);
                tool2.panic(stringBuffer2.toString());
                return str;
            }
        }
        return null;
    }

    @Override // antlr.CodeGenerator
    public String processStringForASTConstructor(String str) {
        if (this.usingCustomAST) {
            Grammar grammar = this.grammar;
            if (((grammar instanceof TreeWalkerGrammar) || (grammar instanceof ParserGrammar)) && !grammar.tokenManager.tokenDefined(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(namespaceAntlr);
                stringBuffer.append("RefAST(");
                stringBuffer.append(str);
                stringBuffer.append(")");
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    protected void genASTDeclaration(AlternativeElement alternativeElement, String str) {
        genASTDeclaration(alternativeElement, alternativeElement.getLabel(), str);
    }

    protected void genMatch(GrammarAtom grammarAtom) {
        if (grammarAtom instanceof StringLiteralElement) {
            if (this.grammar instanceof LexerGrammar) {
                genMatchUsingAtomText(grammarAtom);
                return;
            } else {
                genMatchUsingAtomTokenType(grammarAtom);
                return;
            }
        }
        if (grammarAtom instanceof CharLiteralElement) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("cannot ref character literals in grammar: ");
            stringBuffer.append(grammarAtom);
            tool.error(stringBuffer.toString());
            return;
        }
        if (grammarAtom instanceof TokenRefElement) {
            genMatchUsingAtomTokenType(grammarAtom);
        } else if (grammarAtom instanceof WildcardElement) {
            gen((WildcardElement) grammarAtom);
        }
    }

    protected void genASTDeclaration(AlternativeElement alternativeElement, String str, String str2) {
        if (this.declaredASTVariables.contains(alternativeElement)) {
            return;
        }
        String str3 = this.labeledElementASTInit;
        if (alternativeElement instanceof GrammarAtom) {
            GrammarAtom grammarAtom = (GrammarAtom) alternativeElement;
            if (grammarAtom.getASTNodeType() != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Ref");
                stringBuffer.append(grammarAtom.getASTNodeType());
                stringBuffer.append("(");
                stringBuffer.append(this.labeledElementASTInit);
                stringBuffer.append(")");
                str3 = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str2);
        stringBuffer2.append(" ");
        stringBuffer2.append(str);
        stringBuffer2.append("_AST = ");
        stringBuffer2.append(str3);
        stringBuffer2.append(";");
        println(stringBuffer2.toString());
        this.declaredASTVariables.put(alternativeElement, alternativeElement);
    }

    public void genLineNo(GrammarElement grammarElement) {
        if (grammarElement != null) {
            genLineNo(grammarElement.getLine());
        }
    }

    public void genLineNo(Token token) {
        if (token != null) {
            genLineNo(token.getLine());
        }
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(GrammarAtom grammarAtom, String str) {
        if (grammarAtom != null && grammarAtom.getASTNodeType() != null) {
            this.astTypes.ensureCapacity(grammarAtom.getType());
            this.astTypes.setElementAt(grammarAtom.getASTNodeType(), grammarAtom.getType());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("astFactory->create(");
            stringBuffer.append(str);
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
        boolean z10 = str.indexOf(44) != -1 ? this.grammar.tokenManager.tokenDefined(str.substring(0, str.indexOf(44))) : false;
        if (this.usingCustomAST) {
            Grammar grammar = this.grammar;
            if ((grammar instanceof TreeWalkerGrammar) && !grammar.tokenManager.tokenDefined(str) && !z10) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("astFactory->create(");
                stringBuffer2.append(namespaceAntlr);
                stringBuffer2.append("RefAST(");
                stringBuffer2.append(str);
                stringBuffer2.append("))");
                return stringBuffer2.toString();
            }
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("astFactory->create(");
        stringBuffer3.append(str);
        stringBuffer3.append(")");
        return stringBuffer3.toString();
    }

    protected String getLookaheadTestExpression(Alternative alternative, int i10) {
        int i11 = alternative.lookaheadDepth;
        if (i11 == Integer.MAX_VALUE) {
            i11 = this.grammar.maxk;
        }
        if (i10 == 0) {
            return "true";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(getLookaheadTestExpression(alternative.cache, i11));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public String getASTCreateString(String str) {
        if (this.usingCustomAST) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.labeledElementASTType);
            stringBuffer.append("(astFactory->create(");
            stringBuffer.append(namespaceAntlr);
            stringBuffer.append("RefAST(");
            stringBuffer.append(str);
            stringBuffer.append(")))");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("astFactory->create(");
        stringBuffer2.append(str);
        stringBuffer2.append(")");
        return stringBuffer2.toString();
    }

    @Override // antlr.CodeGenerator
    public void gen(ActionElement actionElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genAction(");
            stringBuffer.append(actionElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (actionElement.isSemPred) {
            genSemPred(actionElement.actionText, actionElement.line);
            return;
        }
        if (this.grammar.hasSyntacticPredicate) {
            println("if ( inputState->guessing==0 ) {");
            this.tabs++;
        }
        ActionTransInfo actionTransInfo = new ActionTransInfo();
        String processActionForSpecialSymbols = processActionForSpecialSymbols(actionElement.actionText, actionElement.getLine(), this.currentRule, actionTransInfo);
        if (actionTransInfo.refRuleRoot != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(actionTransInfo.refRuleRoot);
            stringBuffer2.append(" = ");
            stringBuffer2.append(this.labeledElementASTType);
            stringBuffer2.append("(currentAST.root);");
            println(stringBuffer2.toString());
        }
        genLineNo(actionElement);
        printAction(processActionForSpecialSymbols);
        genLineNo2();
        if (actionTransInfo.assignToRoot) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("currentAST.root = ");
            stringBuffer3.append(actionTransInfo.refRuleRoot);
            stringBuffer3.append(";");
            println(stringBuffer3.toString());
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("if ( ");
            stringBuffer4.append(actionTransInfo.refRuleRoot);
            stringBuffer4.append(Operator.Operation.NOT_EQUALS);
            stringBuffer4.append(this.labeledElementASTInit);
            stringBuffer4.append(" &&");
            println(stringBuffer4.toString());
            this.tabs++;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(actionTransInfo.refRuleRoot);
            stringBuffer5.append("->getFirstChild() != ");
            stringBuffer5.append(this.labeledElementASTInit);
            stringBuffer5.append(" )");
            println(stringBuffer5.toString());
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("  currentAST.child = ");
            stringBuffer6.append(actionTransInfo.refRuleRoot);
            stringBuffer6.append("->getFirstChild();");
            println(stringBuffer6.toString());
            this.tabs--;
            println("else");
            this.tabs++;
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("currentAST.child = ");
            stringBuffer7.append(actionTransInfo.refRuleRoot);
            stringBuffer7.append(";");
            println(stringBuffer7.toString());
            this.tabs--;
            println("currentAST.advanceChildToEnd();");
        }
        if (this.grammar.hasSyntacticPredicate) {
            this.tabs--;
            println("}");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(AlternativeBlock alternativeBlock) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gen(");
            stringBuffer.append(alternativeBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        println("{");
        genBlockPreamble(alternativeBlock);
        genBlockInitAction(alternativeBlock);
        String str = this.currentASTResult;
        if (alternativeBlock.getLabel() != null) {
            this.currentASTResult = alternativeBlock.getLabel();
        }
        this.grammar.theLLkAnalyzer.deterministic(alternativeBlock);
        genBlockFinish(genCommonBlock(alternativeBlock, true), this.throwNoViable);
        println("}");
        this.currentASTResult = str;
    }

    @Override // antlr.CodeGenerator
    public void gen(BlockEndElement blockEndElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genRuleEnd(");
            stringBuffer.append(blockEndElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(CharLiteralElement charLiteralElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genChar(");
            stringBuffer.append(charLiteralElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (!(this.grammar instanceof LexerGrammar)) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("cannot ref character literals in grammar: ");
            stringBuffer2.append(charLiteralElement);
            tool.error(stringBuffer2.toString());
        }
        if (charLiteralElement.getLabel() != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(charLiteralElement.getLabel());
            stringBuffer3.append(" = ");
            stringBuffer3.append(this.lt1Value);
            stringBuffer3.append(";");
            println(stringBuffer3.toString());
        }
        boolean z10 = this.saveText;
        boolean z11 = z10 && charLiteralElement.getAutoGenType() == 1;
        this.saveText = z11;
        if (!z11 || charLiteralElement.getAutoGenType() == 3) {
            println("_saveIndex = text.length();");
        }
        print(charLiteralElement.not ? "matchNot(" : "match(");
        _print(convertJavaToCppString(charLiteralElement.atomText, true));
        _println(");");
        if (!this.saveText || charLiteralElement.getAutoGenType() == 3) {
            println("text.erase(_saveIndex);");
        }
        this.saveText = z10;
    }

    @Override // antlr.CodeGenerator
    public void gen(CharRangeElement charRangeElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCharRangeElement(");
            stringBuffer.append(charRangeElement.beginText);
            stringBuffer.append("..");
            stringBuffer.append(charRangeElement.endText);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (!(this.grammar instanceof LexerGrammar)) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("cannot ref character range in grammar: ");
            stringBuffer2.append(charRangeElement);
            tool.error(stringBuffer2.toString());
        }
        if (charRangeElement.getLabel() != null && this.syntacticPredLevel == 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(charRangeElement.getLabel());
            stringBuffer3.append(" = ");
            stringBuffer3.append(this.lt1Value);
            stringBuffer3.append(";");
            println(stringBuffer3.toString());
        }
        boolean z10 = (this.grammar instanceof LexerGrammar) && (!this.saveText || charRangeElement.getAutoGenType() == 3);
        if (z10) {
            println("_saveIndex=text.length();");
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("matchRange(");
        stringBuffer4.append(convertJavaToCppString(charRangeElement.beginText, true));
        stringBuffer4.append(",");
        stringBuffer4.append(convertJavaToCppString(charRangeElement.endText, true));
        stringBuffer4.append(");");
        println(stringBuffer4.toString());
        if (z10) {
            println("text.setLength(_saveIndex);");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(LexerGrammar lexerGrammar) {
        if (lexerGrammar.debuggingOutput) {
            this.semPreds = new Vector();
        }
        if (lexerGrammar.charVocabulary.size() > 256) {
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(lexerGrammar.getFilename());
            stringBuffer.append(": C++ mode does not support more than 8 bit characters (vocabulary size now: ");
            stringBuffer.append(lexerGrammar.charVocabulary.size());
            stringBuffer.append(")");
            tool.warning(stringBuffer.toString());
        }
        setGrammar(lexerGrammar);
        if (!(this.grammar instanceof LexerGrammar)) {
            this.antlrTool.panic("Internal error generating lexer");
        }
        genBody(lexerGrammar);
        genInclude(lexerGrammar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.OneOrMoreBlock r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CppCodeGenerator.gen(antlr.OneOrMoreBlock):void");
    }

    public void genInclude(ParserGrammar parserGrammar) {
        String stripFrontBack;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".hpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#ifndef INC_");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("_hpp_");
        println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("#define INC_");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append("_hpp_");
        println(stringBuffer4.toString());
        println("");
        printHeaderAction(preIncludeHpp);
        println("#include <antlr/config.hpp>");
        genHeader(this.outputFile);
        println("#include <antlr/TokenStream.hpp>");
        println("#include <antlr/TokenBuffer.hpp>");
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("#include \"");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer5.append(".hpp\"");
        println(stringBuffer5.toString());
        Grammar grammar = this.grammar;
        String str = grammar.superClass;
        if (str != null) {
            println("\n// Include correct superclass header with a header statement for example:");
            println("// header \"post_include_hpp\" {");
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("// #include \"");
            stringBuffer6.append(str);
            stringBuffer6.append(".hpp\"");
            println(stringBuffer6.toString());
            println("// }");
            println("// Or....");
            println("// header {");
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("// #include \"");
            stringBuffer7.append(str);
            stringBuffer7.append(".hpp\"");
            println(stringBuffer7.toString());
            println("// }\n");
        } else {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("#include <antlr/");
            stringBuffer8.append(superClass);
            stringBuffer8.append(".hpp>");
            println(stringBuffer8.toString());
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(namespaceAntlr);
            stringBuffer9.append(superClass);
            str = stringBuffer9.toString();
        }
        println("");
        printHeaderAction(postIncludeHpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printHeaderAction("");
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("class CUSTOM_API ");
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append(" : public ");
        stringBuffer10.append(str);
        print(stringBuffer10.toString());
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append(", public ");
        stringBuffer11.append(this.grammar.tokenManager.getName());
        stringBuffer11.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer11.toString());
        Token token = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token != null && (stripFrontBack = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append(", ");
            stringBuffer12.append(stripFrontBack);
            print(stringBuffer12.toString());
        }
        println("{");
        if (this.grammar.debuggingOutput) {
            println("public: static const char* _ruleNames[];");
        }
        Token token2 = this.grammar.classMemberAction;
        if (token2 != null) {
            genLineNo(token2.getLine());
            print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
            genLineNo2();
        }
        println("public:");
        this.tabs = 1;
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append("void initializeASTFactory( ");
        stringBuffer13.append(namespaceAntlr);
        stringBuffer13.append("ASTFactory& factory );");
        println(stringBuffer13.toString());
        this.tabs = 0;
        if (this.noConstructors) {
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
        }
        println("protected:");
        this.tabs = 1;
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append(this.grammar.getClassName());
        stringBuffer14.append("(");
        stringBuffer14.append(namespaceAntlr);
        stringBuffer14.append("TokenBuffer& tokenBuf, int k);");
        println(stringBuffer14.toString());
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append(this.grammar.getClassName());
        stringBuffer15.append("(");
        stringBuffer15.append(namespaceAntlr);
        stringBuffer15.append("TokenBuffer& tokenBuf);");
        println(stringBuffer15.toString());
        this.tabs = 0;
        println("protected:");
        this.tabs = 1;
        StringBuffer stringBuffer16 = new StringBuffer();
        stringBuffer16.append(this.grammar.getClassName());
        stringBuffer16.append("(");
        stringBuffer16.append(namespaceAntlr);
        stringBuffer16.append("TokenStream& lexer, int k);");
        println(stringBuffer16.toString());
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append(this.grammar.getClassName());
        stringBuffer17.append("(");
        stringBuffer17.append(namespaceAntlr);
        stringBuffer17.append("TokenStream& lexer);");
        println(stringBuffer17.toString());
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append(this.grammar.getClassName());
        stringBuffer18.append("(const ");
        stringBuffer18.append(namespaceAntlr);
        stringBuffer18.append("ParserSharedInputState& state);");
        println(stringBuffer18.toString());
        if (this.noConstructors) {
            this.tabs = 0;
            println("// constructor creation turned of with 'noConstructor' option");
            println("#endif");
            this.tabs = 1;
        }
        println("int getNumTokens() const");
        println("{");
        this.tabs++;
        StringBuffer stringBuffer19 = new StringBuffer();
        stringBuffer19.append("return ");
        stringBuffer19.append(this.grammar.getClassName());
        stringBuffer19.append("::NUM_TOKENS;");
        println(stringBuffer19.toString());
        this.tabs--;
        println("}");
        println("const char* getTokenName( int type ) const");
        println("{");
        this.tabs++;
        println("if( type > getNumTokens() ) return 0;");
        StringBuffer stringBuffer20 = new StringBuffer();
        stringBuffer20.append("return ");
        stringBuffer20.append(this.grammar.getClassName());
        stringBuffer20.append("::tokenNames[type];");
        println(stringBuffer20.toString());
        this.tabs--;
        println("}");
        println("const char* const* getTokenNames() const");
        println("{");
        this.tabs++;
        StringBuffer stringBuffer21 = new StringBuffer();
        stringBuffer21.append("return ");
        stringBuffer21.append(this.grammar.getClassName());
        stringBuffer21.append("::tokenNames;");
        println(stringBuffer21.toString());
        this.tabs--;
        println("}");
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol;
                genRuleHeader(ruleSymbol, ruleSymbol.references.size() == 0);
            }
            exitIfError();
        }
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        StringBuffer stringBuffer22 = new StringBuffer();
        stringBuffer22.append(namespaceAntlr);
        stringBuffer22.append("RefAST getAST()");
        println(stringBuffer22.toString());
        println("{");
        if (this.usingCustomAST) {
            this.tabs++;
            StringBuffer stringBuffer23 = new StringBuffer();
            stringBuffer23.append("return ");
            stringBuffer23.append(namespaceAntlr);
            stringBuffer23.append("RefAST(returnAST);");
            println(stringBuffer23.toString());
            this.tabs--;
        } else {
            this.tabs++;
            println("return returnAST;");
            this.tabs--;
        }
        println("}");
        println("");
        this.tabs = 0;
        println("protected:");
        this.tabs = 1;
        StringBuffer stringBuffer24 = new StringBuffer();
        stringBuffer24.append(this.labeledElementASTType);
        stringBuffer24.append(" returnAST;");
        println(stringBuffer24.toString());
        this.tabs = 0;
        println("private:");
        this.tabs = 1;
        println("static const char* tokenNames[];");
        _println("#ifndef NO_STATIC_CONSTS");
        StringBuffer stringBuffer25 = new StringBuffer();
        stringBuffer25.append("static const int NUM_TOKENS = ");
        stringBuffer25.append(this.grammar.tokenManager.getVocabulary().size());
        stringBuffer25.append(";");
        println(stringBuffer25.toString());
        _println("#else");
        println("enum {");
        StringBuffer stringBuffer26 = new StringBuffer();
        stringBuffer26.append("\tNUM_TOKENS = ");
        stringBuffer26.append(this.grammar.tokenManager.getVocabulary().size());
        println(stringBuffer26.toString());
        println("};");
        _println("#endif");
        genBitsetsHeader(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        if (this.grammar.debuggingOutput) {
            println("static const char* _semPredNames[];");
        }
        this.tabs = 0;
        println("};");
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        StringBuffer stringBuffer27 = new StringBuffer();
        stringBuffer27.append("#endif /*INC_");
        stringBuffer27.append(this.grammar.getClassName());
        stringBuffer27.append("_hpp_*/");
        println(stringBuffer27.toString());
        this.currentOutput.close();
        this.currentOutput = null;
    }

    public void genBody(ParserGrammar parserGrammar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".cpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader(this.outputFile);
        printHeaderAction(preIncludeCpp);
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#include \"");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(".hpp\"");
        println(stringBuffer3.toString());
        println("#include <antlr/NoViableAltException.hpp>");
        println("#include <antlr/SemanticException.hpp>");
        println("#include <antlr/ASTFactory.hpp>");
        printHeaderAction(postIncludeCpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printAction(this.grammar.preambleAction);
        Grammar grammar = this.grammar;
        String str = grammar.superClass;
        if (str == null) {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(namespaceAntlr);
            stringBuffer4.append(superClass);
            str = stringBuffer4.toString();
        }
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("const char* ");
            stringBuffer5.append(this.grammar.getClassName());
            stringBuffer5.append("::_ruleNames[] = {");
            println(stringBuffer5.toString());
            this.tabs++;
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("\"");
                    stringBuffer6.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer6.append("\",");
                    println(stringBuffer6.toString());
                }
            }
            println(MessageService.MSG_DB_READY_REPORT);
            this.tabs--;
            println("};");
        }
        if (this.noConstructors) {
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append(this.grammar.getClassName());
        stringBuffer7.append("::");
        stringBuffer7.append(this.grammar.getClassName());
        print(stringBuffer7.toString());
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("(");
        stringBuffer8.append(namespaceAntlr);
        stringBuffer8.append("TokenBuffer& tokenBuf, int k)");
        println(stringBuffer8.toString());
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append(": ");
        stringBuffer9.append(str);
        stringBuffer9.append("(tokenBuf,k)");
        println(stringBuffer9.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append("::");
        stringBuffer10.append(this.grammar.getClassName());
        print(stringBuffer10.toString());
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("(");
        stringBuffer11.append(namespaceAntlr);
        stringBuffer11.append("TokenBuffer& tokenBuf)");
        println(stringBuffer11.toString());
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append(": ");
        stringBuffer12.append(str);
        stringBuffer12.append("(tokenBuf,");
        stringBuffer12.append(this.grammar.maxk);
        stringBuffer12.append(")");
        println(stringBuffer12.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append(this.grammar.getClassName());
        stringBuffer13.append("::");
        stringBuffer13.append(this.grammar.getClassName());
        print(stringBuffer13.toString());
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append("(");
        stringBuffer14.append(namespaceAntlr);
        stringBuffer14.append("TokenStream& lexer, int k)");
        println(stringBuffer14.toString());
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append(": ");
        stringBuffer15.append(str);
        stringBuffer15.append("(lexer,k)");
        println(stringBuffer15.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer16 = new StringBuffer();
        stringBuffer16.append(this.grammar.getClassName());
        stringBuffer16.append("::");
        stringBuffer16.append(this.grammar.getClassName());
        print(stringBuffer16.toString());
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append("(");
        stringBuffer17.append(namespaceAntlr);
        stringBuffer17.append("TokenStream& lexer)");
        println(stringBuffer17.toString());
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append(": ");
        stringBuffer18.append(str);
        stringBuffer18.append("(lexer,");
        stringBuffer18.append(this.grammar.maxk);
        stringBuffer18.append(")");
        println(stringBuffer18.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer19 = new StringBuffer();
        stringBuffer19.append(this.grammar.getClassName());
        stringBuffer19.append("::");
        stringBuffer19.append(this.grammar.getClassName());
        print(stringBuffer19.toString());
        StringBuffer stringBuffer20 = new StringBuffer();
        stringBuffer20.append("(const ");
        stringBuffer20.append(namespaceAntlr);
        stringBuffer20.append("ParserSharedInputState& state)");
        println(stringBuffer20.toString());
        StringBuffer stringBuffer21 = new StringBuffer();
        stringBuffer21.append(": ");
        stringBuffer21.append(str);
        stringBuffer21.append("(state,");
        stringBuffer21.append(this.grammar.maxk);
        stringBuffer21.append(")");
        println(stringBuffer21.toString());
        println("{");
        println("}");
        println("");
        if (this.noConstructors) {
            println("// constructor creation turned of with 'noConstructor' option");
            println("#endif");
        }
        this.astTypes = new Vector();
        Enumeration elements2 = this.grammar.rules.elements();
        int i10 = 0;
        while (elements2.hasMoreElements()) {
            GrammarSymbol grammarSymbol2 = (GrammarSymbol) elements2.nextElement();
            if (grammarSymbol2 instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol2;
                boolean z10 = ruleSymbol.references.size() == 0;
                StringBuffer stringBuffer22 = new StringBuffer();
                stringBuffer22.append(this.grammar.getClassName());
                stringBuffer22.append("::");
                genRule(ruleSymbol, z10, i10, stringBuffer22.toString());
                i10++;
            }
            exitIfError();
        }
        genInitFactory(parserGrammar);
        StringBuffer stringBuffer23 = new StringBuffer();
        stringBuffer23.append(this.grammar.getClassName());
        stringBuffer23.append("::");
        genTokenStrings(stringBuffer23.toString());
        Vector vector = this.bitsetsUsed;
        int maxTokenType = this.grammar.tokenManager.maxTokenType();
        StringBuffer stringBuffer24 = new StringBuffer();
        stringBuffer24.append(this.grammar.getClassName());
        stringBuffer24.append("::");
        genBitsets(vector, maxTokenType, stringBuffer24.toString());
        if (this.grammar.debuggingOutput) {
            StringBuffer stringBuffer25 = new StringBuffer();
            stringBuffer25.append(this.grammar.getClassName());
            stringBuffer25.append("::");
            genSemPredMap(stringBuffer25.toString());
        }
        println("");
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(ParserGrammar parserGrammar) {
        if (parserGrammar.debuggingOutput) {
            this.semPreds = new Vector();
        }
        setGrammar(parserGrammar);
        if (!(this.grammar instanceof ParserGrammar)) {
            this.antlrTool.panic("Internal error generating parser");
        }
        genBody(parserGrammar);
        genInclude(parserGrammar);
    }

    @Override // antlr.CodeGenerator
    public void gen(RuleRefElement ruleRefElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genRR(");
            stringBuffer.append(ruleRefElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(ruleRefElement.targetRule);
        if (ruleSymbol != null && ruleSymbol.isDefined()) {
            genErrorTryForElement(ruleRefElement);
            if ((this.grammar instanceof TreeWalkerGrammar) && ruleRefElement.getLabel() != null && this.syntacticPredLevel == 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(ruleRefElement.getLabel());
                stringBuffer2.append(" = (_t == ASTNULL) ? ");
                stringBuffer2.append(this.labeledElementASTInit);
                stringBuffer2.append(" : ");
                stringBuffer2.append(this.lt1Value);
                stringBuffer2.append(";");
                println(stringBuffer2.toString());
            }
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || ruleRefElement.getAutoGenType() == 3)) {
                println("_saveIndex = text.length();");
            }
            printTabs();
            if (ruleRefElement.idAssign != null) {
                if (ruleSymbol.block.returnAction == null) {
                    Tool tool = this.antlrTool;
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Rule '");
                    stringBuffer3.append(ruleRefElement.targetRule);
                    stringBuffer3.append("' has no return type");
                    tool.warning(stringBuffer3.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(ruleRefElement.idAssign);
                stringBuffer4.append(Operator.Operation.EQUALS);
                _print(stringBuffer4.toString());
            } else if (!(this.grammar instanceof LexerGrammar) && this.syntacticPredLevel == 0 && ruleSymbol.block.returnAction != null) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Rule '");
                stringBuffer5.append(ruleRefElement.targetRule);
                stringBuffer5.append("' returns a value");
                tool2.warning(stringBuffer5.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
            }
            GenRuleInvocation(ruleRefElement);
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || ruleRefElement.getAutoGenType() == 3)) {
                println("text.erase(_saveIndex);");
            }
            if (this.syntacticPredLevel == 0) {
                Grammar grammar = this.grammar;
                boolean z10 = grammar.hasSyntacticPredicate && ((grammar.buildAST && ruleRefElement.getLabel() != null) || (this.genAST && ruleRefElement.getAutoGenType() == 1));
                if (z10) {
                    println("if (inputState->guessing==0) {");
                    this.tabs++;
                }
                if (this.grammar.buildAST && ruleRefElement.getLabel() != null) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append(ruleRefElement.getLabel());
                    stringBuffer6.append("_AST = returnAST;");
                    println(stringBuffer6.toString());
                }
                if (this.genAST) {
                    int autoGenType = ruleRefElement.getAutoGenType();
                    if (autoGenType != 1) {
                        if (autoGenType == 2) {
                            this.antlrTool.error("Internal: encountered ^ after rule reference");
                        }
                    } else if (this.usingCustomAST) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("astFactory->addASTChild(currentAST, ");
                        stringBuffer7.append(namespaceAntlr);
                        stringBuffer7.append("RefAST(returnAST));");
                        println(stringBuffer7.toString());
                    } else {
                        println("astFactory->addASTChild( currentAST, returnAST );");
                    }
                }
                if ((this.grammar instanceof LexerGrammar) && ruleRefElement.getLabel() != null) {
                    StringBuffer stringBuffer8 = new StringBuffer();
                    stringBuffer8.append(ruleRefElement.getLabel());
                    stringBuffer8.append("=_returnToken;");
                    println(stringBuffer8.toString());
                }
                if (z10) {
                    this.tabs--;
                    println("}");
                }
            }
            genErrorCatchForElement(ruleRefElement);
            return;
        }
        Tool tool3 = this.antlrTool;
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("Rule '");
        stringBuffer9.append(ruleRefElement.targetRule);
        stringBuffer9.append("' is not defined");
        tool3.error(stringBuffer9.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r4.getAutoGenType() == 1) goto L18;
     */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.StringLiteralElement r4) {
        /*
            r3 = this;
            boolean r0 = r3.DEBUG_CODE_GENERATOR
            if (r0 != 0) goto L8
            boolean r0 = r3.DEBUG_CPP_CODE_GENERATOR
            if (r0 == 0) goto L23
        L8:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "genString("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L23:
            java.lang.String r0 = r4.getLabel()
            if (r0 == 0) goto L4f
            int r0 = r3.syntacticPredLevel
            if (r0 != 0) goto L4f
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r4.getLabel()
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
            java.lang.String r1 = r3.lt1Value
            r0.append(r1)
            java.lang.String r1 = ";"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.println(r0)
        L4f:
            r3.genElementAST(r4)
            boolean r0 = r3.saveText
            if (r0 == 0) goto L5e
            int r1 = r4.getAutoGenType()
            r2 = 1
            if (r1 != r2) goto L5e
            goto L5f
        L5e:
            r2 = 0
        L5f:
            r3.saveText = r2
            r3.genMatch(r4)
            r3.saveText = r0
            antlr.Grammar r4 = r3.grammar
            boolean r4 = r4 instanceof antlr.TreeWalkerGrammar
            if (r4 == 0) goto L71
            java.lang.String r4 = "_t = _t->getNextSibling();"
            r3.println(r4)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CppCodeGenerator.gen(antlr.StringLiteralElement):void");
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRangeElement tokenRangeElement) {
        genErrorTryForElement(tokenRangeElement);
        if (tokenRangeElement.getLabel() != null && this.syntacticPredLevel == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(tokenRangeElement.getLabel());
            stringBuffer.append(" = ");
            stringBuffer.append(this.lt1Value);
            stringBuffer.append(";");
            println(stringBuffer.toString());
        }
        genElementAST(tokenRangeElement);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("matchRange(");
        stringBuffer2.append(tokenRangeElement.beginText);
        stringBuffer2.append(",");
        stringBuffer2.append(tokenRangeElement.endText);
        stringBuffer2.append(");");
        println(stringBuffer2.toString());
        genErrorCatchForElement(tokenRangeElement);
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRefElement tokenRefElement) {
        if (this.DEBUG_CODE_GENERATOR || this.DEBUG_CPP_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genTokenRef(");
            stringBuffer.append(tokenRefElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (this.grammar instanceof LexerGrammar) {
            this.antlrTool.panic("Token reference found in lexer");
        }
        genErrorTryForElement(tokenRefElement);
        if (tokenRefElement.getLabel() != null && this.syntacticPredLevel == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(tokenRefElement.getLabel());
            stringBuffer2.append(" = ");
            stringBuffer2.append(this.lt1Value);
            stringBuffer2.append(";");
            println(stringBuffer2.toString());
        }
        genElementAST(tokenRefElement);
        genMatch(tokenRefElement);
        genErrorCatchForElement(tokenRefElement);
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_t = _t->getNextSibling();");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeElement treeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.labeledElementType);
        stringBuffer.append(" __t");
        stringBuffer.append(treeElement.f4235ID);
        stringBuffer.append(" = _t;");
        println(stringBuffer.toString());
        if (treeElement.root.getLabel() != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(treeElement.root.getLabel());
            stringBuffer2.append(" = (_t == ASTNULL) ? ");
            stringBuffer2.append(this.labeledElementASTInit);
            stringBuffer2.append(" : _t;");
            println(stringBuffer2.toString());
        }
        if (treeElement.root.getAutoGenType() == 3) {
            this.antlrTool.error("Suffixing a root node with '!' is not implemented", this.grammar.getFilename(), treeElement.getLine(), treeElement.getColumn());
            treeElement.root.setAutoGenType(1);
        }
        if (treeElement.root.getAutoGenType() == 2) {
            this.antlrTool.warning("Suffixing a root node with '^' is redundant; already a root", this.grammar.getFilename(), treeElement.getLine(), treeElement.getColumn());
            treeElement.root.setAutoGenType(1);
        }
        genElementAST(treeElement.root);
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(namespaceAntlr);
            stringBuffer3.append("ASTPair __currentAST");
            stringBuffer3.append(treeElement.f4235ID);
            stringBuffer3.append(" = currentAST;");
            println(stringBuffer3.toString());
            println("currentAST.root = currentAST.child;");
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("currentAST.child = ");
            stringBuffer4.append(this.labeledElementASTInit);
            stringBuffer4.append(";");
            println(stringBuffer4.toString());
        }
        GrammarAtom grammarAtom = treeElement.root;
        if (grammarAtom instanceof WildcardElement) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("if ( _t == ASTNULL ) throw ");
            stringBuffer5.append(namespaceAntlr);
            stringBuffer5.append("MismatchedTokenException();");
            println(stringBuffer5.toString());
        } else {
            genMatch(grammarAtom);
        }
        println("_t = _t->getFirstChild();");
        for (int i10 = 0; i10 < treeElement.getAlternatives().size(); i10++) {
            for (AlternativeElement alternativeElement = treeElement.getAlternativeAt(i10).head; alternativeElement != null; alternativeElement = alternativeElement.next) {
                alternativeElement.generate();
            }
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("currentAST = __currentAST");
            stringBuffer6.append(treeElement.f4235ID);
            stringBuffer6.append(";");
            println(stringBuffer6.toString());
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("_t = __t");
        stringBuffer7.append(treeElement.f4235ID);
        stringBuffer7.append(";");
        println(stringBuffer7.toString());
        println("_t = _t->getNextSibling();");
    }

    public void genBody(TreeWalkerGrammar treeWalkerGrammar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".cpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader(this.outputFile);
        printHeaderAction(preIncludeCpp);
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#include \"");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(".hpp\"");
        println(stringBuffer3.toString());
        println("#include <antlr/Token.hpp>");
        println("#include <antlr/AST.hpp>");
        println("#include <antlr/NoViableAltException.hpp>");
        println("#include <antlr/MismatchedTokenException.hpp>");
        println("#include <antlr/SemanticException.hpp>");
        println("#include <antlr/BitSet.hpp>");
        printHeaderAction(postIncludeCpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printAction(this.grammar.preambleAction);
        Grammar grammar = this.grammar;
        if (grammar.superClass == null) {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(namespaceAntlr);
            stringBuffer4.append(superClass);
        }
        if (this.noConstructors) {
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(this.grammar.getClassName());
        stringBuffer5.append("::");
        stringBuffer5.append(this.grammar.getClassName());
        stringBuffer5.append("()");
        println(stringBuffer5.toString());
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("\t: ");
        stringBuffer6.append(namespaceAntlr);
        stringBuffer6.append("TreeParser() {");
        println(stringBuffer6.toString());
        this.tabs = (this.tabs + 1) - 1;
        println("}");
        if (this.noConstructors) {
            println("// constructor creation turned of with 'noConstructor' option");
            println("#endif");
        }
        println("");
        this.astTypes = new Vector();
        Enumeration elements = this.grammar.rules.elements();
        int i10 = 0;
        while (elements.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol;
                boolean z10 = ruleSymbol.references.size() == 0;
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(this.grammar.getClassName());
                stringBuffer7.append("::");
                genRule(ruleSymbol, z10, i10, stringBuffer7.toString());
                i10++;
            }
            exitIfError();
        }
        genInitFactory(this.grammar);
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("::");
        genTokenStrings(stringBuffer8.toString());
        Vector vector = this.bitsetsUsed;
        int maxTokenType = this.grammar.tokenManager.maxTokenType();
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append(this.grammar.getClassName());
        stringBuffer9.append("::");
        genBitsets(vector, maxTokenType, stringBuffer9.toString());
        println("");
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeWalkerGrammar treeWalkerGrammar) {
        setGrammar(treeWalkerGrammar);
        if (!(this.grammar instanceof TreeWalkerGrammar)) {
            this.antlrTool.panic("Internal error generating tree-walker");
        }
        genBody(treeWalkerGrammar);
        genInclude(treeWalkerGrammar);
    }

    public void genInclude(TreeWalkerGrammar treeWalkerGrammar) {
        String stripFrontBack;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".hpp");
        String stringBuffer2 = stringBuffer.toString();
        this.outputFile = stringBuffer2;
        this.outputLine = 1;
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("#ifndef INC_");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("_hpp_");
        println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("#define INC_");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append("_hpp_");
        println(stringBuffer4.toString());
        println("");
        printHeaderAction(preIncludeHpp);
        println("#include <antlr/config.hpp>");
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("#include \"");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer5.append(".hpp\"");
        println(stringBuffer5.toString());
        genHeader(this.outputFile);
        Grammar grammar = this.grammar;
        String str = grammar.superClass;
        if (str != null) {
            println("\n// Include correct superclass header with a header statement for example:");
            println("// header \"post_include_hpp\" {");
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("// #include \"");
            stringBuffer6.append(str);
            stringBuffer6.append(".hpp\"");
            println(stringBuffer6.toString());
            println("// }");
            println("// Or....");
            println("// header {");
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("// #include \"");
            stringBuffer7.append(str);
            stringBuffer7.append(".hpp\"");
            println(stringBuffer7.toString());
            println("// }\n");
        } else {
            String superClass = grammar.getSuperClass();
            if (superClass.lastIndexOf(46) != -1) {
                superClass = superClass.substring(superClass.lastIndexOf(46) + 1);
            }
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("#include <antlr/");
            stringBuffer8.append(superClass);
            stringBuffer8.append(".hpp>");
            println(stringBuffer8.toString());
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(namespaceAntlr);
            stringBuffer9.append(superClass);
            str = stringBuffer9.toString();
        }
        println("");
        printHeaderAction(postIncludeHpp);
        NameSpace nameSpace2 = nameSpace;
        if (nameSpace2 != null) {
            nameSpace2.emitDeclarations(this.currentOutput);
        }
        printHeaderAction("");
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("class CUSTOM_API ");
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append(" : public ");
        stringBuffer10.append(str);
        print(stringBuffer10.toString());
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append(", public ");
        stringBuffer11.append(this.grammar.tokenManager.getName());
        stringBuffer11.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer11.toString());
        Token token = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token != null && (stripFrontBack = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append(", ");
            stringBuffer12.append(stripFrontBack);
            print(stringBuffer12.toString());
        }
        println("{");
        Token token2 = this.grammar.classMemberAction;
        if (token2 != null) {
            genLineNo(token2.getLine());
            print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
            genLineNo2();
        }
        this.tabs = 0;
        println("public:");
        if (this.noConstructors) {
            println("#if 0");
            println("// constructor creation turned of with 'noConstructor' option");
        }
        this.tabs = 1;
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append(this.grammar.getClassName());
        stringBuffer13.append("();");
        println(stringBuffer13.toString());
        if (this.noConstructors) {
            this.tabs = 0;
            println("#endif");
            this.tabs = 1;
        }
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append("static void initializeASTFactory( ");
        stringBuffer14.append(namespaceAntlr);
        stringBuffer14.append("ASTFactory& factory );");
        println(stringBuffer14.toString());
        println("int getNumTokens() const");
        println("{");
        this.tabs++;
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append("return ");
        stringBuffer15.append(this.grammar.getClassName());
        stringBuffer15.append("::NUM_TOKENS;");
        println(stringBuffer15.toString());
        this.tabs--;
        println("}");
        println("const char* getTokenName( int type ) const");
        println("{");
        this.tabs++;
        println("if( type > getNumTokens() ) return 0;");
        StringBuffer stringBuffer16 = new StringBuffer();
        stringBuffer16.append("return ");
        stringBuffer16.append(this.grammar.getClassName());
        stringBuffer16.append("::tokenNames[type];");
        println(stringBuffer16.toString());
        this.tabs--;
        println("}");
        println("const char* const* getTokenNames() const");
        println("{");
        this.tabs++;
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append("return ");
        stringBuffer17.append(this.grammar.getClassName());
        stringBuffer17.append("::tokenNames;");
        println(stringBuffer17.toString());
        this.tabs--;
        println("}");
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol;
                genRuleHeader(ruleSymbol, ruleSymbol.references.size() == 0);
            }
            exitIfError();
        }
        this.tabs = 0;
        println("public:");
        this.tabs = 1;
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append(namespaceAntlr);
        stringBuffer18.append("RefAST getAST()");
        println(stringBuffer18.toString());
        println("{");
        if (this.usingCustomAST) {
            this.tabs++;
            StringBuffer stringBuffer19 = new StringBuffer();
            stringBuffer19.append("return ");
            stringBuffer19.append(namespaceAntlr);
            stringBuffer19.append("RefAST(returnAST);");
            println(stringBuffer19.toString());
            this.tabs--;
        } else {
            this.tabs++;
            println("return returnAST;");
            this.tabs--;
        }
        println("}");
        println("");
        this.tabs = 0;
        println("protected:");
        this.tabs = 1;
        StringBuffer stringBuffer20 = new StringBuffer();
        stringBuffer20.append(this.labeledElementASTType);
        stringBuffer20.append(" returnAST;");
        println(stringBuffer20.toString());
        StringBuffer stringBuffer21 = new StringBuffer();
        stringBuffer21.append(this.labeledElementASTType);
        stringBuffer21.append(" _retTree;");
        println(stringBuffer21.toString());
        this.tabs = 0;
        println("private:");
        this.tabs = 1;
        println("static const char* tokenNames[];");
        _println("#ifndef NO_STATIC_CONSTS");
        StringBuffer stringBuffer22 = new StringBuffer();
        stringBuffer22.append("static const int NUM_TOKENS = ");
        stringBuffer22.append(this.grammar.tokenManager.getVocabulary().size());
        stringBuffer22.append(";");
        println(stringBuffer22.toString());
        _println("#else");
        println("enum {");
        StringBuffer stringBuffer23 = new StringBuffer();
        stringBuffer23.append("\tNUM_TOKENS = ");
        stringBuffer23.append(this.grammar.tokenManager.getVocabulary().size());
        println(stringBuffer23.toString());
        println("};");
        _println("#endif");
        genBitsetsHeader(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        this.tabs = 0;
        println("};");
        println("");
        NameSpace nameSpace3 = nameSpace;
        if (nameSpace3 != null) {
            nameSpace3.emitClosures(this.currentOutput);
        }
        StringBuffer stringBuffer24 = new StringBuffer();
        stringBuffer24.append("#endif /*INC_");
        stringBuffer24.append(this.grammar.getClassName());
        stringBuffer24.append("_hpp_*/");
        println(stringBuffer24.toString());
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(WildcardElement wildcardElement) {
        if (wildcardElement.getLabel() != null && this.syntacticPredLevel == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(wildcardElement.getLabel());
            stringBuffer.append(" = ");
            stringBuffer.append(this.lt1Value);
            stringBuffer.append(";");
            println(stringBuffer.toString());
        }
        genElementAST(wildcardElement);
        Grammar grammar = this.grammar;
        if (grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("if ( _t == ");
            stringBuffer2.append(this.labeledElementASTInit);
            stringBuffer2.append(" ) throw ");
            stringBuffer2.append(namespaceAntlr);
            stringBuffer2.append("MismatchedTokenException();");
            println(stringBuffer2.toString());
        } else if (grammar instanceof LexerGrammar) {
            if ((grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                println("_saveIndex = text.length();");
            }
            println("matchNot(EOF/*_CHAR*/);");
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                println("text.erase(_saveIndex);");
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("matchNot(");
            stringBuffer3.append(getValueString(1));
            stringBuffer3.append(");");
            println(stringBuffer3.toString());
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_t = _t->getNextSibling();");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.ZeroOrMoreBlock r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CppCodeGenerator.gen(antlr.ZeroOrMoreBlock):void");
    }
}
