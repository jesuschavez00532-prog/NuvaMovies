package antlr;

import antlr.actions.java.ActionLexer;
import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class JavaCodeGenerator extends CodeGenerator {
    protected static final String NONUNIQUE = new String();
    public static final int caseSizeThreshold = 127;
    String commonExtraArgs;
    String commonExtraParams;
    String commonLocalVars;
    String currentASTResult;
    RuleBlock currentRule;
    String exceptionThrown;
    String labeledElementASTType;
    String labeledElementInit;
    String labeledElementType;
    String lt1Value;
    private Vector semPreds;
    String throwNoViable;
    protected int syntacticPredLevel = 0;
    protected boolean genAST = false;
    protected boolean saveText = false;
    Hashtable treeVariableMap = new Hashtable();
    Hashtable declaredASTVariables = new Hashtable();
    int astVarNumber = 1;

    public JavaCodeGenerator() {
        this.charFormatter = new JavaCharFormatter();
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
            String processActionForSpecialSymbols = processActionForSpecialSymbols(ruleRefElement.args, 0, this.currentRule, actionTransInfo);
            if (actionTransInfo.assignToRoot || actionTransInfo.refRuleRoot != null) {
                Tool tool = this.antlrTool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Arguments of rule reference '");
                stringBuffer2.append(ruleRefElement.targetRule);
                stringBuffer2.append("' cannot set or ref #");
                stringBuffer2.append(this.currentRule.getRuleName());
                tool.error(stringBuffer2.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
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
        } else if (ruleSymbol.block.argAction != null) {
            Tool tool3 = this.antlrTool;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Missing parameters on reference to rule ");
            stringBuffer4.append(ruleRefElement.targetRule);
            tool3.warning(stringBuffer4.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
        }
        _println(");");
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_t = _retTree;");
        }
    }

    private void genBitSet(BitSet bitSet, int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("private static final long[] mk");
        stringBuffer.append(getBitsetName(i10));
        stringBuffer.append("() {");
        println(stringBuffer.toString());
        int lengthInLongWords = bitSet.lengthInLongWords();
        if (lengthInLongWords < 8) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\tlong[] data = { ");
            stringBuffer2.append(bitSet.toStringOfWords());
            stringBuffer2.append("};");
            println(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("\tlong[] data = new long[");
            stringBuffer3.append(lengthInLongWords);
            stringBuffer3.append("];");
            println(stringBuffer3.toString());
            long[] packedArray = bitSet.toPackedArray();
            int i11 = 0;
            while (i11 < packedArray.length) {
                long j10 = packedArray[i11];
                if (j10 == 0) {
                    i11++;
                } else {
                    int i12 = i11 + 1;
                    if (i12 != packedArray.length && j10 == packedArray[i12]) {
                        while (i12 < packedArray.length && packedArray[i12] == packedArray[i11]) {
                            i12++;
                        }
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("\tfor (int i = ");
                        stringBuffer4.append(i11);
                        stringBuffer4.append("; i<=");
                        stringBuffer4.append(i12 - 1);
                        stringBuffer4.append("; i++) { data[i]=");
                        stringBuffer4.append(packedArray[i11]);
                        stringBuffer4.append("L; }");
                        println(stringBuffer4.toString());
                    } else {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("\tdata[");
                        stringBuffer5.append(i11);
                        stringBuffer5.append("]=");
                        stringBuffer5.append(packedArray[i11]);
                        stringBuffer5.append("L;");
                        println(stringBuffer5.toString());
                    }
                    i11 = i12;
                }
            }
        }
        println("\treturn data;");
        println("}");
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("public static final BitSet ");
        stringBuffer6.append(getBitsetName(i10));
        stringBuffer6.append(" = new BitSet(");
        stringBuffer6.append("mk");
        stringBuffer6.append(getBitsetName(i10));
        stringBuffer6.append("()");
        stringBuffer6.append(");");
        println(stringBuffer6.toString());
    }

    private void genBlockFinish(JavaBlockFinishingInfo javaBlockFinishingInfo, String str) {
        boolean z10;
        if (javaBlockFinishingInfo.needAnErrorClause && ((z10 = javaBlockFinishingInfo.generatedAnIf) || javaBlockFinishingInfo.generatedSwitch)) {
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
        String str2 = javaBlockFinishingInfo.postscript;
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
            if (this.genAST && (alternativeElement.getLabel() != null || alternativeElement.getAutoGenType() != 3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (alternativeElement.getAutoGenType() != 3 && (alternativeElement instanceof TokenRefElement)) {
                z10 = true;
            }
            boolean z11 = this.grammar.hasSyntacticPredicate;
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
                        genASTDeclaration(alternativeElement, stringBuffer, grammarAtom.getASTNodeType());
                    } else {
                        genASTDeclaration(alternativeElement, stringBuffer, this.labeledElementASTType);
                    }
                } else {
                    genASTDeclaration(alternativeElement, stringBuffer, this.labeledElementASTType);
                }
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(stringBuffer);
            stringBuffer6.append("_AST");
            String stringBuffer7 = stringBuffer6.toString();
            mapTreeVariable(alternativeElement, stringBuffer7);
            if (this.grammar instanceof TreeWalkerGrammar) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(this.labeledElementASTType);
                stringBuffer8.append(" ");
                stringBuffer8.append(stringBuffer7);
                stringBuffer8.append("_in = null;");
                println(stringBuffer8.toString());
            }
            if (alternativeElement.getLabel() != null) {
                if (alternativeElement instanceof GrammarAtom) {
                    StringBuffer stringBuffer9 = new StringBuffer();
                    stringBuffer9.append(stringBuffer7);
                    stringBuffer9.append(" = ");
                    stringBuffer9.append(getASTCreateString((GrammarAtom) alternativeElement, str));
                    stringBuffer9.append(";");
                    println(stringBuffer9.toString());
                } else {
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append(stringBuffer7);
                    stringBuffer10.append(" = ");
                    stringBuffer10.append(getASTCreateString(str));
                    stringBuffer10.append(";");
                    println(stringBuffer10.toString());
                }
            }
            if (alternativeElement.getLabel() == null && z10) {
                String str3 = this.lt1Value;
                if (alternativeElement instanceof GrammarAtom) {
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append(stringBuffer7);
                    stringBuffer11.append(" = ");
                    stringBuffer11.append(getASTCreateString((GrammarAtom) alternativeElement, str3));
                    stringBuffer11.append(";");
                    println(stringBuffer11.toString());
                } else {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append(stringBuffer7);
                    stringBuffer12.append(" = ");
                    stringBuffer12.append(getASTCreateString(str3));
                    stringBuffer12.append(";");
                    println(stringBuffer12.toString());
                }
                if (this.grammar instanceof TreeWalkerGrammar) {
                    StringBuffer stringBuffer13 = new StringBuffer();
                    stringBuffer13.append(stringBuffer7);
                    stringBuffer13.append("_in = ");
                    stringBuffer13.append(str3);
                    stringBuffer13.append(";");
                    println(stringBuffer13.toString());
                }
            }
            if (this.genAST) {
                int autoGenType = alternativeElement.getAutoGenType();
                if (autoGenType != 1) {
                    if (autoGenType == 2) {
                        StringBuffer stringBuffer14 = new StringBuffer();
                        stringBuffer14.append("astFactory.makeASTRoot(currentAST, ");
                        stringBuffer14.append(stringBuffer7);
                        stringBuffer14.append(");");
                        println(stringBuffer14.toString());
                        return;
                    }
                    return;
                }
                StringBuffer stringBuffer15 = new StringBuffer();
                stringBuffer15.append("astFactory.addASTChild(currentAST, ");
                stringBuffer15.append(stringBuffer7);
                stringBuffer15.append(");");
                println(stringBuffer15.toString());
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
                println("if (inputState.guessing==0) {");
                this.tabs++;
            }
            printAction(processActionForSpecialSymbols(exceptionHandler.action.getText(), exceptionHandler.action.getLine(), this.currentRule, new ActionTransInfo()));
            if (this.grammar.hasSyntacticPredicate) {
                this.tabs--;
                println("} else {");
                this.tabs++;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("throw ");
                stringBuffer2.append(extractIdOfAction(exceptionHandler.exceptionTypeAndName));
                stringBuffer2.append(";");
                println(stringBuffer2.toString());
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
        println("_ttype = testLiteralsTable(new String(text.getBuffer(),_begin,text.length()-_begin),_ttype);");
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
        return id2;
    }

    private String lookaheadString(int i10) {
        if (this.grammar instanceof TreeWalkerGrammar) {
            return "_t.getType()";
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
            java.lang.String r0 = antlr.JavaCodeGenerator.NONUNIQUE
            r3.put(r2, r0)
            goto L41
        L3c:
            java.util.Hashtable r0 = r1.treeVariableMap
            r0.put(r2, r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.mapTreeVariable(antlr.AlternativeElement, java.lang.String):void");
    }

    private void setupGrammarParameters(Grammar grammar) {
        Token option;
        String stripFrontBack;
        Token option2;
        String stripFrontBack2;
        if (grammar instanceof ParserGrammar) {
            this.labeledElementASTType = "AST";
            if (grammar.hasOption("ASTLabelType") && (option2 = grammar.getOption("ASTLabelType")) != null && (stripFrontBack2 = StringUtils.stripFrontBack(option2.getText(), "\"", "\"")) != null) {
                this.labeledElementASTType = stripFrontBack2;
            }
            this.labeledElementType = "Token ";
            this.labeledElementInit = "null";
            this.commonExtraArgs = "";
            this.commonExtraParams = "";
            this.commonLocalVars = "";
            this.lt1Value = "LT(1)";
            this.exceptionThrown = "RecognitionException";
            this.throwNoViable = "throw new NoViableAltException(LT(1), getFilename());";
            return;
        }
        if (grammar instanceof LexerGrammar) {
            this.labeledElementType = "char ";
            this.labeledElementInit = "'\\0'";
            this.commonExtraArgs = "";
            this.commonExtraParams = "boolean _createToken";
            this.commonLocalVars = "int _ttype; Token _token=null; int _begin=text.length();";
            this.lt1Value = "LA(1)";
            this.exceptionThrown = "RecognitionException";
            this.throwNoViable = "throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());";
            return;
        }
        if (grammar instanceof TreeWalkerGrammar) {
            this.labeledElementASTType = "AST";
            this.labeledElementType = "AST";
            if (grammar.hasOption("ASTLabelType") && (option = grammar.getOption("ASTLabelType")) != null && (stripFrontBack = StringUtils.stripFrontBack(option.getText(), "\"", "\"")) != null) {
                this.labeledElementASTType = stripFrontBack;
                this.labeledElementType = stripFrontBack;
            }
            if (!grammar.hasOption("ASTLabelType")) {
                grammar.setOption("ASTLabelType", new Token(6, "AST"));
            }
            this.labeledElementInit = "null";
            this.commonExtraArgs = "_t";
            this.commonExtraParams = "AST _t";
            this.commonLocalVars = "";
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("(");
            stringBuffer.append(this.labeledElementASTType);
            stringBuffer.append(")_t");
            this.lt1Value = stringBuffer.toString();
            this.exceptionThrown = "RecognitionException";
            this.throwNoViable = "throw new NoViableAltException(_t);";
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

    protected int addSemPred(String str) {
        this.semPreds.appendElement(str);
        return this.semPreds.size() - 1;
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
                boolean z14 = this.grammar.hasSyntacticPredicate;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(((RuleBlock) alternativeBlock).getRuleName());
                stringBuffer.append("_AST = (");
                stringBuffer.append(this.labeledElementASTType);
                stringBuffer.append(")currentAST.root;");
                println(stringBuffer.toString());
                boolean z15 = this.grammar.hasSyntacticPredicate;
            } else if (alternativeBlock.getLabel() != null) {
                this.antlrTool.warning("Labeled subrules not yet supported", this.grammar.getFilename(), alternativeBlock.getLine(), alternativeBlock.getColumn());
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

    protected void genBitsets(Vector vector, int i10) {
        println("");
        for (int i11 = 0; i11 < vector.size(); i11++) {
            BitSet bitSet = (BitSet) vector.elementAt(i11);
            bitSet.growToInclude(i10);
            genBitSet(bitSet, i11);
        }
    }

    protected void genBlockInitAction(AlternativeBlock alternativeBlock) {
        String str = alternativeBlock.initAction;
        if (str != null) {
            printAction(processActionForSpecialSymbols(str, alternativeBlock.getLine(), this.currentRule, null));
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
                                    genASTDeclaration(alternativeElement, grammarAtom.getASTNodeType());
                                }
                            }
                            genASTDeclaration(alternativeElement);
                        }
                    } else {
                        if (!z10) {
                            AlternativeBlock alternativeBlock2 = (AlternativeBlock) alternativeElement;
                            if (alternativeBlock2.not && this.analyzer.subruleCanBeInverted(alternativeBlock2, this.grammar instanceof LexerGrammar)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append(this.labeledElementType);
                                stringBuffer2.append(" ");
                                stringBuffer2.append(alternativeElement.getLabel());
                                stringBuffer2.append(" = ");
                                stringBuffer2.append(this.labeledElementInit);
                                stringBuffer2.append(";");
                                println(stringBuffer2.toString());
                                if (this.grammar.buildAST) {
                                    genASTDeclaration(alternativeElement);
                                }
                            }
                        }
                        if (this.grammar.buildAST) {
                            genASTDeclaration(alternativeElement);
                        }
                        if (this.grammar instanceof LexerGrammar) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Token ");
                            stringBuffer3.append(alternativeElement.getLabel());
                            stringBuffer3.append("=null;");
                            println(stringBuffer3.toString());
                        }
                        if (this.grammar instanceof TreeWalkerGrammar) {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append(this.labeledElementType);
                            stringBuffer4.append(" ");
                            stringBuffer4.append(alternativeElement.getLabel());
                            stringBuffer4.append(" = ");
                            stringBuffer4.append(this.labeledElementInit);
                            stringBuffer4.append(";");
                            println(stringBuffer4.toString());
                        }
                    }
                }
            }
        }
    }

    protected void genCases(BitSet bitSet) {
        int i10;
        if (this.DEBUG_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCases(");
            stringBuffer.append(bitSet);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        int[] array = bitSet.toArray();
        if (this.grammar instanceof LexerGrammar) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        boolean z10 = true;
        int i11 = 1;
        for (int i12 : array) {
            if (i11 == 1) {
                print("");
            } else {
                _print("  ");
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("case ");
            stringBuffer2.append(getValueString(i12));
            stringBuffer2.append(":");
            _print(stringBuffer2.toString());
            if (i11 == i10) {
                _println("");
                z10 = true;
                i11 = 1;
            } else {
                i11++;
                z10 = false;
            }
        }
        if (!z10) {
            _println("");
        }
    }

    public JavaBlockFinishingInfo genCommonBlock(AlternativeBlock alternativeBlock, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        JavaBlockFinishingInfo javaBlockFinishingInfo;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        boolean lookaheadIsEmpty;
        String lookaheadTestExpression;
        boolean z17;
        boolean z18;
        int i11;
        int i12;
        JavaBlockFinishingInfo javaBlockFinishingInfo2;
        String str2;
        String str3;
        String str4;
        JavaBlockFinishingInfo javaBlockFinishingInfo3 = new JavaBlockFinishingInfo();
        if (this.DEBUG_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCommonBlock(");
            stringBuffer.append(alternativeBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        boolean z19 = this.genAST;
        if (z19 && alternativeBlock.getAutoGen()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.genAST = z11;
        boolean z20 = this.saveText;
        if (z20 && alternativeBlock.getAutoGen()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.saveText = z12;
        String str5 = "";
        if (alternativeBlock.not && this.analyzer.subruleCanBeInverted(alternativeBlock, this.grammar instanceof LexerGrammar)) {
            if (this.DEBUG_CODE_GENERATOR) {
                System.out.println("special case: ~(subrule)");
            }
            Lookahead look = this.analyzer.look(1, alternativeBlock);
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
                str5 = "_t,";
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("match(");
            stringBuffer3.append(str5);
            stringBuffer3.append(getBitsetName(markBitsetForGen(look.fset)));
            stringBuffer3.append(");");
            println(stringBuffer3.toString());
            if (this.grammar instanceof TreeWalkerGrammar) {
                println("_t = _t.getNextSibling();");
            }
            return javaBlockFinishingInfo3;
        }
        if (alternativeBlock.getAlternatives().size() == 1) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(0);
            if (alternativeAt.synPred != null) {
                this.antlrTool.warning("Syntactic predicate superfluous for single alternative", this.grammar.getFilename(), alternativeBlock.getAlternativeAt(0).synPred.getLine(), alternativeBlock.getAlternativeAt(0).synPred.getColumn());
            }
            if (z10) {
                String str6 = alternativeAt.semPred;
                if (str6 != null) {
                    genSemPred(str6, alternativeBlock.line);
                }
                genAlt(alternativeAt, alternativeBlock);
                return javaBlockFinishingInfo3;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < alternativeBlock.getAlternatives().size(); i14++) {
            if (suitableForCaseExpression(alternativeBlock.getAlternativeAt(i14))) {
                i13++;
            }
        }
        String str7 = "{";
        String str8 = "}";
        if (i13 >= this.makeSwitchThreshold) {
            String lookaheadString = lookaheadString(1);
            if (this.grammar instanceof TreeWalkerGrammar) {
                println("if (_t==null) _t=ASTNULL;");
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("switch ( ");
            stringBuffer4.append(lookaheadString);
            stringBuffer4.append(") {");
            println(stringBuffer4.toString());
            for (int i15 = 0; i15 < alternativeBlock.alternatives.size(); i15++) {
                Alternative alternativeAt2 = alternativeBlock.getAlternativeAt(i15);
                if (suitableForCaseExpression(alternativeAt2)) {
                    Lookahead lookahead = alternativeAt2.cache[1];
                    if (lookahead.fset.degree() == 0 && !lookahead.containsEpsilon()) {
                        this.antlrTool.warning("Alternate omitted due to empty prediction set", this.grammar.getFilename(), alternativeAt2.head.getLine(), alternativeAt2.head.getColumn());
                    } else {
                        genCases(lookahead.fset);
                        println("{");
                        this.tabs++;
                        genAlt(alternativeAt2, alternativeBlock);
                        println("break;");
                        this.tabs--;
                        println("}");
                    }
                }
            }
            println("default:");
            this.tabs++;
            z13 = true;
        } else {
            z13 = false;
        }
        Grammar grammar = this.grammar;
        if (grammar instanceof LexerGrammar) {
            i10 = grammar.maxk;
        } else {
            i10 = 0;
        }
        int i16 = 0;
        int i17 = 0;
        while (i10 >= 0) {
            if (this.DEBUG_CODE_GENERATOR) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("checking depth ");
                stringBuffer5.append(i10);
                printStream2.println(stringBuffer5.toString());
            }
            int i18 = 0;
            while (i18 < alternativeBlock.alternatives.size()) {
                Alternative alternativeAt3 = alternativeBlock.getAlternativeAt(i18);
                if (this.DEBUG_CODE_GENERATOR) {
                    PrintStream printStream3 = System.out;
                    str = str5;
                    StringBuffer stringBuffer6 = new StringBuffer();
                    z16 = z20;
                    stringBuffer6.append("genAlt: ");
                    stringBuffer6.append(i18);
                    printStream3.println(stringBuffer6.toString());
                } else {
                    z16 = z20;
                    str = str5;
                }
                if (z13 && suitableForCaseExpression(alternativeAt3)) {
                    if (this.DEBUG_CODE_GENERATOR) {
                        System.out.println("ignoring alt because it was in the switch");
                    }
                } else {
                    Grammar grammar2 = this.grammar;
                    if (grammar2 instanceof LexerGrammar) {
                        int i19 = alternativeAt3.lookaheadDepth;
                        if (i19 == Integer.MAX_VALUE) {
                            i19 = grammar2.maxk;
                        }
                        while (i19 >= 1 && alternativeAt3.cache[i19].containsEpsilon()) {
                            i19--;
                        }
                        if (i19 != i10) {
                            if (this.DEBUG_CODE_GENERATOR) {
                                PrintStream printStream4 = System.out;
                                StringBuffer stringBuffer7 = new StringBuffer();
                                stringBuffer7.append("ignoring alt because effectiveDepth!=altDepth;");
                                stringBuffer7.append(i19);
                                stringBuffer7.append(Operator.Operation.NOT_EQUALS);
                                stringBuffer7.append(i10);
                                printStream4.println(stringBuffer7.toString());
                            }
                        } else {
                            lookaheadIsEmpty = lookaheadIsEmpty(alternativeAt3, i19);
                            lookaheadTestExpression = getLookaheadTestExpression(alternativeAt3, i19);
                        }
                    } else {
                        lookaheadIsEmpty = lookaheadIsEmpty(alternativeAt3, grammar2.maxk);
                        lookaheadTestExpression = getLookaheadTestExpression(alternativeAt3, this.grammar.maxk);
                    }
                    z17 = z13;
                    z18 = z19;
                    i11 = i10;
                    i12 = i18;
                    if (alternativeAt3.cache[1].fset.degree() > 127 && suitableForCaseExpression(alternativeAt3)) {
                        if (i17 == 0) {
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append("if ");
                            stringBuffer8.append(lookaheadTestExpression);
                            stringBuffer8.append(" {");
                            println(stringBuffer8.toString());
                        } else {
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append("else if ");
                            stringBuffer9.append(lookaheadTestExpression);
                            stringBuffer9.append(" {");
                            println(stringBuffer9.toString());
                        }
                    } else if (lookaheadIsEmpty && alternativeAt3.semPred == null && alternativeAt3.synPred == null) {
                        if (i17 == 0) {
                            println(str7);
                        } else {
                            println("else {");
                        }
                        javaBlockFinishingInfo3.needAnErrorClause = false;
                    } else {
                        if (alternativeAt3.semPred != null) {
                            str2 = str7;
                            javaBlockFinishingInfo2 = javaBlockFinishingInfo3;
                            String processActionForSpecialSymbols = processActionForSpecialSymbols(alternativeAt3.semPred, alternativeBlock.line, this.currentRule, new ActionTransInfo());
                            Grammar grammar3 = this.grammar;
                            str3 = str8;
                            if (((grammar3 instanceof ParserGrammar) || (grammar3 instanceof LexerGrammar)) && grammar3.debuggingOutput) {
                                StringBuffer stringBuffer10 = new StringBuffer();
                                stringBuffer10.append("(");
                                stringBuffer10.append(lookaheadTestExpression);
                                stringBuffer10.append("&& fireSemanticPredicateEvaluated(antlr.debug.SemanticPredicateEvent.PREDICTING,");
                                stringBuffer10.append(addSemPred(this.charFormatter.escapeString(processActionForSpecialSymbols)));
                                stringBuffer10.append(",");
                                stringBuffer10.append(processActionForSpecialSymbols);
                                stringBuffer10.append("))");
                                lookaheadTestExpression = stringBuffer10.toString();
                            } else {
                                StringBuffer stringBuffer11 = new StringBuffer();
                                stringBuffer11.append("(");
                                stringBuffer11.append(lookaheadTestExpression);
                                stringBuffer11.append("&&(");
                                stringBuffer11.append(processActionForSpecialSymbols);
                                stringBuffer11.append("))");
                                lookaheadTestExpression = stringBuffer11.toString();
                            }
                        } else {
                            javaBlockFinishingInfo2 = javaBlockFinishingInfo3;
                            str2 = str7;
                            str3 = str8;
                        }
                        if (i17 > 0) {
                            if (alternativeAt3.synPred != null) {
                                println("else {");
                                this.tabs++;
                                genSynPred(alternativeAt3.synPred, lookaheadTestExpression);
                                i16++;
                            } else {
                                StringBuffer stringBuffer12 = new StringBuffer();
                                stringBuffer12.append("else if ");
                                stringBuffer12.append(lookaheadTestExpression);
                                stringBuffer12.append(" {");
                                println(stringBuffer12.toString());
                            }
                        } else {
                            SynPredBlock synPredBlock = alternativeAt3.synPred;
                            if (synPredBlock != null) {
                                genSynPred(synPredBlock, lookaheadTestExpression);
                            } else {
                                if (this.grammar instanceof TreeWalkerGrammar) {
                                    println("if (_t==null) _t=ASTNULL;");
                                }
                                StringBuffer stringBuffer13 = new StringBuffer();
                                stringBuffer13.append("if ");
                                stringBuffer13.append(lookaheadTestExpression);
                                stringBuffer13.append(" {");
                                println(stringBuffer13.toString());
                            }
                        }
                        i17++;
                        this.tabs++;
                        genAlt(alternativeAt3, alternativeBlock);
                        this.tabs--;
                        str4 = str3;
                        println(str4);
                        i18 = i12 + 1;
                        z13 = z17;
                        str8 = str4;
                        str5 = str;
                        z20 = z16;
                        str7 = str2;
                        z19 = z18;
                        i10 = i11;
                        javaBlockFinishingInfo3 = javaBlockFinishingInfo2;
                    }
                    javaBlockFinishingInfo2 = javaBlockFinishingInfo3;
                    str2 = str7;
                    str3 = str8;
                    i17++;
                    this.tabs++;
                    genAlt(alternativeAt3, alternativeBlock);
                    this.tabs--;
                    str4 = str3;
                    println(str4);
                    i18 = i12 + 1;
                    z13 = z17;
                    str8 = str4;
                    str5 = str;
                    z20 = z16;
                    str7 = str2;
                    z19 = z18;
                    i10 = i11;
                    javaBlockFinishingInfo3 = javaBlockFinishingInfo2;
                }
                javaBlockFinishingInfo2 = javaBlockFinishingInfo3;
                z18 = z19;
                i12 = i18;
                z17 = z13;
                i11 = i10;
                str2 = str7;
                str4 = str8;
                i18 = i12 + 1;
                z13 = z17;
                str8 = str4;
                str5 = str;
                z20 = z16;
                str7 = str2;
                z19 = z18;
                i10 = i11;
                javaBlockFinishingInfo3 = javaBlockFinishingInfo2;
            }
            i10--;
            javaBlockFinishingInfo3 = javaBlockFinishingInfo3;
        }
        JavaBlockFinishingInfo javaBlockFinishingInfo4 = javaBlockFinishingInfo3;
        boolean z21 = z19;
        boolean z22 = z13;
        boolean z23 = z20;
        String str9 = str8;
        for (int i20 = 1; i20 <= i16; i20++) {
            StringBuffer stringBuffer14 = new StringBuffer();
            stringBuffer14.append(str5);
            stringBuffer14.append(str9);
            str5 = stringBuffer14.toString();
        }
        this.genAST = z21;
        this.saveText = z23;
        if (z22) {
            this.tabs--;
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append(str5);
            stringBuffer15.append(str9);
            javaBlockFinishingInfo = javaBlockFinishingInfo4;
            javaBlockFinishingInfo.postscript = stringBuffer15.toString();
            javaBlockFinishingInfo.generatedSwitch = true;
            if (i17 > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            javaBlockFinishingInfo.generatedAnIf = z15;
        } else {
            javaBlockFinishingInfo = javaBlockFinishingInfo4;
            javaBlockFinishingInfo.postscript = str5;
            javaBlockFinishingInfo.generatedSwitch = false;
            if (i17 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            javaBlockFinishingInfo.generatedAnIf = z14;
        }
        return javaBlockFinishingInfo;
    }

    protected void genHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("// $ANTLR ");
        stringBuffer.append(Tool.version);
        stringBuffer.append(": ");
        stringBuffer.append("\"");
        Tool tool = this.antlrTool;
        stringBuffer.append(tool.fileMinusPath(tool.grammarFile));
        stringBuffer.append("\"");
        stringBuffer.append(" -> ");
        stringBuffer.append("\"");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".java\"$");
        println(stringBuffer.toString());
    }

    protected void genMatch(BitSet bitSet) {
    }

    protected void genMatchUsingAtomText(GrammarAtom grammarAtom) {
        String str;
        String str2;
        Grammar grammar = this.grammar;
        if (grammar instanceof TreeWalkerGrammar) {
            str = "_t,";
        } else {
            str = "";
        }
        if ((grammar instanceof LexerGrammar) && (!this.saveText || grammarAtom.getAutoGenType() == 3)) {
            println("_saveIndex=text.length();");
        }
        if (grammarAtom.not) {
            str2 = "matchNot(";
        } else {
            str2 = "match(";
        }
        print(str2);
        _print(str);
        if (grammarAtom.atomText.equals("EOF")) {
            _print("Token.EOF_TYPE");
        } else {
            _print(grammarAtom.atomText);
        }
        _println(");");
        if (this.grammar instanceof LexerGrammar) {
            if (!this.saveText || grammarAtom.getAutoGenType() == 3) {
                println("text.setLength(_saveIndex);");
            }
        }
    }

    protected void genMatchUsingAtomTokenType(GrammarAtom grammarAtom) {
        String str;
        String str2;
        if (this.grammar instanceof TreeWalkerGrammar) {
            str = "_t,";
        } else {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(getValueString(grammarAtom.getType()));
        String stringBuffer2 = stringBuffer.toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        if (grammarAtom.not) {
            str2 = "matchNot(";
        } else {
            str2 = "match(";
        }
        stringBuffer3.append(str2);
        stringBuffer3.append(stringBuffer2);
        stringBuffer3.append(");");
        println(stringBuffer3.toString());
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
            println("public Token nextToken() throws TokenStreamException {");
            println("\ttry {uponEOF();}");
            println("\tcatch(CharStreamIOException csioe) {");
            println("\t\tthrow new TokenStreamIOException(csioe.io);");
            println("\t}");
            println("\tcatch(CharStreamException cse) {");
            println("\t\tthrow new TokenStreamException(cse.getMessage());");
            println("\t}");
            println("\treturn new CommonToken(Token.EOF_TYPE, \"\");");
            println("}");
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
        println("public Token nextToken() throws TokenStreamException {");
        this.tabs++;
        println("Token theRetToken=null;");
        _println("tryAgain:");
        println("for (;;) {");
        this.tabs++;
        println("Token _token = null;");
        println("int _ttype = Token.INVALID_TYPE;");
        if (((LexerGrammar) this.grammar).filterMode) {
            println("setCommitToPath(false);");
            if (str != null) {
                if (!this.grammar.isDefined(CodeGenerator.encodeLexerRuleName(str))) {
                    Tool tool = this.grammar.antlrTool;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Filter rule ");
                    stringBuffer2.append(str);
                    stringBuffer2.append(" does not exist in this lexer");
                    tool.error(stringBuffer2.toString());
                } else {
                    RuleSymbol ruleSymbol3 = (RuleSymbol) this.grammar.getSymbol(CodeGenerator.encodeLexerRuleName(str));
                    if (!ruleSymbol3.isDefined()) {
                        Tool tool2 = this.grammar.antlrTool;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Filter rule ");
                        stringBuffer3.append(str);
                        stringBuffer3.append(" does not exist in this lexer");
                        tool2.error(stringBuffer3.toString());
                    } else if (ruleSymbol3.access.equals("public")) {
                        Tool tool3 = this.grammar.antlrTool;
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("Filter rule ");
                        stringBuffer4.append(str);
                        stringBuffer4.append(" must be protected");
                        tool3.error(stringBuffer4.toString());
                    }
                }
                println("int _m;");
                println("_m = mark();");
            }
        }
        println("resetText();");
        println("try {   // for char stream error handling");
        this.tabs++;
        println("try {   // for lexical error handling");
        this.tabs++;
        for (int i11 = 0; i11 < createNextTokenRule.getAlternatives().size(); i11++) {
            Alternative alternativeAt = createNextTokenRule.getAlternativeAt(i11);
            if (alternativeAt.cache[1].containsEpsilon()) {
                String decodeLexerRuleName = CodeGenerator.decodeLexerRuleName(((RuleRefElement) alternativeAt.head).targetRule);
                Tool tool4 = this.antlrTool;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("public lexical rule ");
                stringBuffer5.append(decodeLexerRuleName);
                stringBuffer5.append(" is optional (can match \"nothing\")");
                tool4.warning(stringBuffer5.toString());
            }
        }
        String property = System.getProperty("line.separator");
        JavaBlockFinishingInfo genCommonBlock = genCommonBlock(createNextTokenRule, false);
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}");
        stringBuffer6.append(property);
        stringBuffer6.append("\t\t\t\t");
        String stringBuffer7 = stringBuffer6.toString();
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(stringBuffer7);
                stringBuffer8.append("else {consume(); continue tryAgain;}");
                stringBuffer = stringBuffer8.toString();
            } else {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append(stringBuffer7);
                stringBuffer9.append("else {");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\tcommit();");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\ttry {m");
                stringBuffer9.append(str);
                stringBuffer9.append("(false);}");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\tcatch(RecognitionException e) {");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\t\t// catastrophic failure");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\t\treportError(e);");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\t\tconsume();");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\t}");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t\tcontinue tryAgain;");
                stringBuffer9.append(property);
                stringBuffer9.append("\t\t\t\t}");
                stringBuffer = stringBuffer9.toString();
            }
        } else {
            StringBuffer stringBuffer10 = new StringBuffer();
            stringBuffer10.append(stringBuffer7);
            stringBuffer10.append("else {");
            stringBuffer10.append(this.throwNoViable);
            stringBuffer10.append("}");
            stringBuffer = stringBuffer10.toString();
        }
        genBlockFinish(genCommonBlock, stringBuffer);
        if (((LexerGrammar) this.grammar).filterMode && str != null) {
            println("commit();");
        }
        println("if ( _returnToken==null ) continue tryAgain; // found SKIP token");
        println("_ttype = _returnToken.getType();");
        if (((LexerGrammar) this.grammar).getTestLiterals()) {
            genLiteralsTest();
        }
        println("_returnToken.setType(_ttype);");
        println("return _returnToken;");
        this.tabs--;
        println("}");
        println("catch (RecognitionException e) {");
        this.tabs++;
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                println("if ( !getCommitToPath() ) {consume(); continue tryAgain;}");
            } else {
                println("if ( !getCommitToPath() ) {");
                this.tabs++;
                println("rewind(_m);");
                println("resetText();");
                StringBuffer stringBuffer11 = new StringBuffer();
                stringBuffer11.append("try {m");
                stringBuffer11.append(str);
                stringBuffer11.append("(false);}");
                println(stringBuffer11.toString());
                println("catch(RecognitionException ee) {");
                println("\t// horrendous failure: error in filter rule");
                println("\treportError(ee);");
                println("\tconsume();");
                println("}");
                println("continue tryAgain;");
                this.tabs--;
                println("}");
            }
        }
        if (createNextTokenRule.getDefaultErrorHandler()) {
            println("reportError(e);");
            println("consume();");
        } else {
            println("throw new TokenStreamRecognitionException(e);");
        }
        this.tabs--;
        println("}");
        this.tabs--;
        println("}");
        println("catch (CharStreamException cse) {");
        println("\tif ( cse instanceof CharStreamIOException ) {");
        println("\t\tthrow new TokenStreamIOException(((CharStreamIOException)cse).io);");
        println("\t}");
        println("\telse {");
        println("\t\tthrow new TokenStreamException(cse.getMessage());");
        println("\t}");
        println("}");
        this.tabs--;
        println("}");
        this.tabs--;
        println("}");
        println("");
    }

    public void genRule(RuleSymbol ruleSymbol, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        String str;
        int i11;
        int i12;
        this.tabs = 1;
        if (this.DEBUG_CODE_GENERATOR) {
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
        boolean z13 = this.genAST;
        if (z13 && block.getAutoGen()) {
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
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(ruleSymbol.access);
        stringBuffer3.append(" final ");
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
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append(" throws ");
        stringBuffer6.append(this.exceptionThrown);
        _print(stringBuffer6.toString());
        Grammar grammar = this.grammar;
        if (grammar instanceof ParserGrammar) {
            _print(", TokenStreamException");
        } else if (grammar instanceof LexerGrammar) {
            _print(", CharStreamException, TokenStreamException");
        }
        if (block.throwsSpec != null) {
            if (this.grammar instanceof LexerGrammar) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("user-defined throws spec not allowed (yet) for lexer rule ");
                stringBuffer7.append(block.ruleName);
                tool2.error(stringBuffer7.toString());
            } else {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(", ");
                stringBuffer8.append(block.throwsSpec);
                _print(stringBuffer8.toString());
            }
        }
        _println(" {");
        this.tabs++;
        if (block.returnAction != null) {
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(block.returnAction);
            stringBuffer9.append(";");
            println(stringBuffer9.toString());
        }
        println(this.commonLocalVars);
        Grammar grammar2 = this.grammar;
        if (grammar2.traceRules) {
            if (grammar2 instanceof TreeWalkerGrammar) {
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append("traceIn(\"");
                stringBuffer10.append(ruleSymbol.getId());
                stringBuffer10.append("\",_t);");
                println(stringBuffer10.toString());
            } else {
                StringBuffer stringBuffer11 = new StringBuffer();
                stringBuffer11.append("traceIn(\"");
                stringBuffer11.append(ruleSymbol.getId());
                stringBuffer11.append("\");");
                println(stringBuffer11.toString());
            }
        }
        if (this.grammar instanceof LexerGrammar) {
            if (ruleSymbol.getId().equals("mEOF")) {
                println("_ttype = Token.EOF_TYPE;");
            } else {
                StringBuffer stringBuffer12 = new StringBuffer();
                stringBuffer12.append("_ttype = ");
                stringBuffer12.append(ruleSymbol.getId().substring(1));
                stringBuffer12.append(";");
                println(stringBuffer12.toString());
            }
            println("int _saveIndex;");
        }
        Grammar grammar3 = this.grammar;
        if (grammar3.debuggingOutput) {
            if (grammar3 instanceof ParserGrammar) {
                StringBuffer stringBuffer13 = new StringBuffer();
                stringBuffer13.append("fireEnterRule(");
                stringBuffer13.append(i10);
                stringBuffer13.append(",0);");
                println(stringBuffer13.toString());
            } else if (grammar3 instanceof LexerGrammar) {
                StringBuffer stringBuffer14 = new StringBuffer();
                stringBuffer14.append("fireEnterRule(");
                stringBuffer14.append(i10);
                stringBuffer14.append(",_ttype);");
                println(stringBuffer14.toString());
            }
        }
        Grammar grammar4 = this.grammar;
        if (grammar4.debuggingOutput || grammar4.traceRules) {
            println("try { // debugging");
            this.tabs++;
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append(this.labeledElementASTType);
            stringBuffer15.append(" ");
            stringBuffer15.append(ruleSymbol.getId());
            stringBuffer15.append("_AST_in = (_t == ASTNULL) ? null : (");
            stringBuffer15.append(this.labeledElementASTType);
            stringBuffer15.append(")_t;");
            println(stringBuffer15.toString());
        }
        if (this.grammar.buildAST) {
            println("returnAST = null;");
            println("ASTPair currentAST = new ASTPair();");
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(this.labeledElementASTType);
            stringBuffer16.append(" ");
            stringBuffer16.append(ruleSymbol.getId());
            stringBuffer16.append("_AST = null;");
            println(stringBuffer16.toString());
        }
        genBlockPreamble(block);
        genBlockInitAction(block);
        println("");
        ExceptionSpec findExceptionSpec = block.findExceptionSpec("");
        if (findExceptionSpec != null || block.getDefaultErrorHandler()) {
            println("try {      // for error handling");
            this.tabs++;
        }
        if (block.alternatives.size() == 1) {
            Alternative alternativeAt = block.getAlternativeAt(0);
            String str3 = alternativeAt.semPred;
            if (str3 != null) {
                genSemPred(str3, this.currentRule.line);
            }
            if (alternativeAt.synPred != null) {
                z12 = z13;
                str = "";
                this.antlrTool.warning("Syntactic predicate ignored for single alternative", this.grammar.getFilename(), alternativeAt.synPred.getLine(), alternativeAt.synPred.getColumn());
            } else {
                z12 = z13;
                str = "";
            }
            genAlt(alternativeAt, block);
        } else {
            z12 = z13;
            str = "";
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
            StringBuffer stringBuffer17 = new StringBuffer();
            stringBuffer17.append("catch (");
            stringBuffer17.append(this.exceptionThrown);
            stringBuffer17.append(" ex) {");
            println(stringBuffer17.toString());
            this.tabs++;
            if (this.grammar.hasSyntacticPredicate) {
                println("if (inputState.guessing==0) {");
                this.tabs++;
            }
            println("reportError(ex);");
            Grammar grammar5 = this.grammar;
            if (!(grammar5 instanceof TreeWalkerGrammar)) {
                String bitsetName = getBitsetName(markBitsetForGen(grammar5.theLLkAnalyzer.FOLLOW(1, block.endNode).fset));
                println("consume();");
                StringBuffer stringBuffer18 = new StringBuffer();
                stringBuffer18.append("consumeUntil(");
                stringBuffer18.append(bitsetName);
                stringBuffer18.append(");");
                println(stringBuffer18.toString());
            } else {
                println("if (_t!=null) {_t = _t.getNextSibling();}");
            }
            if (this.grammar.hasSyntacticPredicate) {
                i11 = 1;
                this.tabs--;
                println("} else {");
                println("  throw ex;");
                println("}");
            } else {
                i11 = 1;
            }
            this.tabs -= i11;
            println("}");
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer19 = new StringBuffer();
            stringBuffer19.append("returnAST = ");
            stringBuffer19.append(ruleSymbol.getId());
            stringBuffer19.append("_AST;");
            println(stringBuffer19.toString());
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
            println("if ( _createToken && _token==null && _ttype!=Token.SKIP ) {");
            println("\t_token = makeToken(_ttype);");
            println("\t_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));");
            println("}");
            println("_returnToken = _token;");
        }
        if (block.returnAction != null) {
            StringBuffer stringBuffer20 = new StringBuffer();
            stringBuffer20.append("return ");
            stringBuffer20.append(extractIdOfAction(block.returnAction, block.getLine(), block.getColumn()));
            stringBuffer20.append(";");
            println(stringBuffer20.toString());
        }
        Grammar grammar6 = this.grammar;
        if (!grammar6.debuggingOutput && !grammar6.traceRules) {
            i12 = 1;
        } else {
            this.tabs--;
            println("} finally { // debugging");
            this.tabs++;
            Grammar grammar7 = this.grammar;
            if (grammar7.debuggingOutput) {
                if (grammar7 instanceof ParserGrammar) {
                    StringBuffer stringBuffer21 = new StringBuffer();
                    stringBuffer21.append("fireExitRule(");
                    stringBuffer21.append(i10);
                    stringBuffer21.append(",0);");
                    println(stringBuffer21.toString());
                } else if (grammar7 instanceof LexerGrammar) {
                    StringBuffer stringBuffer22 = new StringBuffer();
                    stringBuffer22.append("fireExitRule(");
                    stringBuffer22.append(i10);
                    stringBuffer22.append(",_ttype);");
                    println(stringBuffer22.toString());
                }
            }
            Grammar grammar8 = this.grammar;
            if (grammar8.traceRules) {
                if (grammar8 instanceof TreeWalkerGrammar) {
                    StringBuffer stringBuffer23 = new StringBuffer();
                    stringBuffer23.append("traceOut(\"");
                    stringBuffer23.append(ruleSymbol.getId());
                    stringBuffer23.append("\",_t);");
                    println(stringBuffer23.toString());
                } else {
                    StringBuffer stringBuffer24 = new StringBuffer();
                    stringBuffer24.append("traceOut(\"");
                    stringBuffer24.append(ruleSymbol.getId());
                    stringBuffer24.append("\");");
                    println(stringBuffer24.toString());
                }
            }
            i12 = 1;
            this.tabs--;
            println("}");
        }
        this.tabs -= i12;
        println("}");
        println(str);
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
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("  throw new SemanticException(\"");
        stringBuffer3.append(escapeString);
        stringBuffer3.append("\");");
        println(stringBuffer3.toString());
    }

    protected void genSemPredMap() {
        Enumeration elements = this.semPreds.elements();
        println("private String _semPredNames[] = {");
        while (elements.hasMoreElements()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\"");
            stringBuffer.append(elements.nextElement());
            stringBuffer.append("\",");
            println(stringBuffer.toString());
        }
        println("};");
    }

    protected void genSynPred(SynPredBlock synPredBlock, String str) {
        if (this.DEBUG_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gen=>(");
            stringBuffer.append(synPredBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("boolean synPredMatched");
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
            stringBuffer4.append("AST __t");
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
        println("inputState.guessing++;");
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
        stringBuffer7.append(" pe) {");
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
        println("inputState.guessing--;");
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

    protected void genTokenASTNodeMap() {
        TokenSymbol tokenSymbol;
        println("");
        println("protected void buildTokenTypeASTClassMap() {");
        this.tabs++;
        Vector vocabulary = this.grammar.tokenManager.getVocabulary();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < vocabulary.size(); i11++) {
            String str = (String) vocabulary.elementAt(i11);
            if (str != null && (tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str)) != null && tokenSymbol.getASTNodeType() != null) {
                i10++;
                if (!z10) {
                    println("tokenTypeToASTClassMap = new Hashtable();");
                    z10 = true;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("tokenTypeToASTClassMap.put(new Integer(");
                stringBuffer.append(tokenSymbol.getTokenType());
                stringBuffer.append("), ");
                stringBuffer.append(tokenSymbol.getASTNodeType());
                stringBuffer.append(".class);");
                println(stringBuffer.toString());
            }
        }
        if (i10 == 0) {
            println("tokenTypeToASTClassMap=null;");
        }
        this.tabs--;
        println("};");
    }

    public void genTokenStrings() {
        TokenSymbol tokenSymbol;
        println("");
        println("public static final String[] _tokenNames = {");
        this.tabs++;
        Vector vocabulary = this.grammar.tokenManager.getVocabulary();
        for (int i10 = 0; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(Operator.Operation.LESS_THAN);
                stringBuffer.append(String.valueOf(i10));
                stringBuffer.append(Operator.Operation.GREATER_THAN);
                str = stringBuffer.toString();
            }
            if (!str.startsWith("\"") && !str.startsWith(Operator.Operation.LESS_THAN) && (tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str)) != null && tokenSymbol.getParaphrase() != null) {
                str = StringUtils.stripFrontBack(tokenSymbol.getParaphrase(), "\"", "\"");
            }
            print(this.charFormatter.literalString(str));
            if (i10 != vocabulary.size() - 1) {
                _print(",");
            }
            _println("");
        }
        this.tabs--;
        println("};");
    }

    protected void genTokenTypes(TokenManager tokenManager) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tokenManager.getName());
        stringBuffer.append(CodeGenerator.TokenTypesFileSuffix);
        setupOutput(stringBuffer.toString());
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("public interface ");
        stringBuffer2.append(tokenManager.getName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer2.append(" {");
        println(stringBuffer2.toString());
        this.tabs++;
        Vector vocabulary = tokenManager.getVocabulary();
        println("int EOF = 1;");
        println("int NULL_TREE_LOOKAHEAD = 3;");
        for (int i10 = 4; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str != null) {
                if (str.startsWith("\"")) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenManager.getTokenSymbol(str);
                    if (stringLiteralSymbol == null) {
                        Tool tool = this.antlrTool;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("String literal ");
                        stringBuffer3.append(str);
                        stringBuffer3.append(" not in symbol table");
                        tool.panic(stringBuffer3.toString());
                    } else if (stringLiteralSymbol.label != null) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("int ");
                        stringBuffer4.append(stringLiteralSymbol.label);
                        stringBuffer4.append(" = ");
                        stringBuffer4.append(i10);
                        stringBuffer4.append(";");
                        println(stringBuffer4.toString());
                    } else {
                        String mangleLiteral = mangleLiteral(str);
                        if (mangleLiteral != null) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("int ");
                            stringBuffer5.append(mangleLiteral);
                            stringBuffer5.append(" = ");
                            stringBuffer5.append(i10);
                            stringBuffer5.append(";");
                            println(stringBuffer5.toString());
                            stringLiteralSymbol.label = mangleLiteral;
                        } else {
                            StringBuffer stringBuffer6 = new StringBuffer();
                            stringBuffer6.append("// ");
                            stringBuffer6.append(str);
                            stringBuffer6.append(" = ");
                            stringBuffer6.append(i10);
                            println(stringBuffer6.toString());
                        }
                    }
                } else if (!str.startsWith(Operator.Operation.LESS_THAN)) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("int ");
                    stringBuffer7.append(str);
                    stringBuffer7.append(" = ");
                    stringBuffer7.append(i10);
                    stringBuffer7.append(";");
                    println(stringBuffer7.toString());
                }
            }
        }
        this.tabs--;
        println("}");
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
        stringBuffer2.append("(");
        stringBuffer2.append(this.labeledElementASTType);
        stringBuffer2.append(")astFactory.make( (new ASTArray(");
        stringBuffer2.append(vector.size());
        stringBuffer2.append("))");
        stringBuffer.append(stringBuffer2.toString());
        for (int i10 = 0; i10 < vector.size(); i10++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(".add(");
            stringBuffer3.append(vector.elementAt(i10));
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(")");
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
                stringBuffer2.append(Operator.Operation.CONCATENATE);
            }
            stringBuffer2.append(lookaheadString);
            stringBuffer2.append("==");
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mapTreeId(java.lang.String r7, antlr.ActionTransInfo r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.mapTreeId(java.lang.String, antlr.ActionTransInfo):java.lang.String");
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

    public void setupOutput(String str) {
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(".java");
        this.currentOutput = tool.openOutputFile(stringBuffer.toString());
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
            if (this.grammar instanceof LexerGrammar) {
                genMatchUsingAtomText(grammarAtom);
                return;
            }
            Tool tool = this.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("cannot ref character literals in grammar: ");
            stringBuffer.append(grammarAtom);
            tool.error(stringBuffer.toString());
            return;
        }
        if (grammarAtom instanceof TokenRefElement) {
            genMatchUsingAtomText(grammarAtom);
        } else if (grammarAtom instanceof WildcardElement) {
            gen((WildcardElement) grammarAtom);
        }
    }

    protected void genASTDeclaration(AlternativeElement alternativeElement, String str, String str2) {
        if (this.declaredASTVariables.contains(alternativeElement)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append("_AST = null;");
        println(stringBuffer.toString());
        this.declaredASTVariables.put(alternativeElement, alternativeElement);
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(GrammarAtom grammarAtom, String str) {
        if (grammarAtom != null && grammarAtom.getASTNodeType() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("(");
            stringBuffer.append(grammarAtom.getASTNodeType());
            stringBuffer.append(")");
            stringBuffer.append("astFactory.create(");
            stringBuffer.append(str);
            stringBuffer.append(",\"");
            stringBuffer.append(grammarAtom.getASTNodeType());
            stringBuffer.append("\")");
            return stringBuffer.toString();
        }
        return getASTCreateString(str);
    }

    protected String getLookaheadTestExpression(Alternative alternative, int i10) {
        int i11 = alternative.lookaheadDepth;
        if (i11 == Integer.MAX_VALUE) {
            i11 = this.grammar.maxk;
        }
        if (i10 == 0) {
            return "( true )";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(getLookaheadTestExpression(alternative.cache, i11));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public String getASTCreateString(String str) {
        if (str == null) {
            str = "";
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == ',') {
                i10++;
            }
        }
        if (i10 < 2) {
            int indexOf = str.indexOf(44);
            str.lastIndexOf(44);
            TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(i10 > 0 ? str.substring(0, indexOf) : str);
            if (tokenSymbol != null) {
                String aSTNodeType = tokenSymbol.getASTNodeType();
                String str2 = i10 == 0 ? ",\"\"" : "";
                if (aSTNodeType != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("(");
                    stringBuffer.append(aSTNodeType);
                    stringBuffer.append(")");
                    stringBuffer.append("astFactory.create(");
                    stringBuffer.append(str);
                    stringBuffer.append(str2);
                    stringBuffer.append(",\"");
                    stringBuffer.append(aSTNodeType);
                    stringBuffer.append("\")");
                    return stringBuffer.toString();
                }
            }
            if (this.labeledElementASTType.equals("AST")) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("astFactory.create(");
                stringBuffer2.append(str);
                stringBuffer2.append(")");
                return stringBuffer2.toString();
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("(");
            stringBuffer3.append(this.labeledElementASTType);
            stringBuffer3.append(")");
            stringBuffer3.append("astFactory.create(");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            return stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("(");
        stringBuffer4.append(this.labeledElementASTType);
        stringBuffer4.append(")astFactory.create(");
        stringBuffer4.append(str);
        stringBuffer4.append(")");
        return stringBuffer4.toString();
    }

    @Override // antlr.CodeGenerator
    public void gen(ActionElement actionElement) {
        if (this.DEBUG_CODE_GENERATOR) {
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
            println("if ( inputState.guessing==0 ) {");
            this.tabs++;
        }
        ActionTransInfo actionTransInfo = new ActionTransInfo();
        String processActionForSpecialSymbols = processActionForSpecialSymbols(actionElement.actionText, actionElement.getLine(), this.currentRule, actionTransInfo);
        if (actionTransInfo.refRuleRoot != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(actionTransInfo.refRuleRoot);
            stringBuffer2.append(" = (");
            stringBuffer2.append(this.labeledElementASTType);
            stringBuffer2.append(")currentAST.root;");
            println(stringBuffer2.toString());
        }
        printAction(processActionForSpecialSymbols);
        if (actionTransInfo.assignToRoot) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("currentAST.root = ");
            stringBuffer3.append(actionTransInfo.refRuleRoot);
            stringBuffer3.append(";");
            println(stringBuffer3.toString());
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("currentAST.child = ");
            stringBuffer4.append(actionTransInfo.refRuleRoot);
            stringBuffer4.append("!=null &&");
            stringBuffer4.append(actionTransInfo.refRuleRoot);
            stringBuffer4.append(".getFirstChild()!=null ?");
            println(stringBuffer4.toString());
            this.tabs++;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(actionTransInfo.refRuleRoot);
            stringBuffer5.append(".getFirstChild() : ");
            stringBuffer5.append(actionTransInfo.refRuleRoot);
            stringBuffer5.append(";");
            println(stringBuffer5.toString());
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
        if (this.DEBUG_CODE_GENERATOR) {
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
        if (this.DEBUG_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genRuleEnd(");
            stringBuffer.append(blockEndElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r4.getAutoGenType() == 1) goto L14;
     */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.CharLiteralElement r4) {
        /*
            r3 = this;
            boolean r0 = r3.DEBUG_CODE_GENERATOR
            if (r0 == 0) goto L1f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "genChar("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L1f:
            java.lang.String r0 = r4.getLabel()
            if (r0 == 0) goto L47
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
        L47:
            boolean r0 = r3.saveText
            if (r0 == 0) goto L53
            int r1 = r4.getAutoGenType()
            r2 = 1
            if (r1 != r2) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            r3.saveText = r2
            r3.genMatch(r4)
            r3.saveText = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.gen(antlr.CharLiteralElement):void");
    }

    @Override // antlr.CodeGenerator
    public void gen(CharRangeElement charRangeElement) {
        if (charRangeElement.getLabel() != null && this.syntacticPredLevel == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(charRangeElement.getLabel());
            stringBuffer.append(" = ");
            stringBuffer.append(this.lt1Value);
            stringBuffer.append(";");
            println(stringBuffer.toString());
        }
        boolean z10 = (this.grammar instanceof LexerGrammar) && (!this.saveText || charRangeElement.getAutoGenType() == 3);
        if (z10) {
            println("_saveIndex=text.length();");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("matchRange(");
        stringBuffer2.append(charRangeElement.beginText);
        stringBuffer2.append(",");
        stringBuffer2.append(charRangeElement.endText);
        stringBuffer2.append(");");
        println(stringBuffer2.toString());
        if (z10) {
            println("text.setLength(_saveIndex);");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(LexerGrammar lexerGrammar) {
        String str;
        String stripFrontBack;
        if (lexerGrammar.debuggingOutput) {
            this.semPreds = new Vector();
        }
        setGrammar(lexerGrammar);
        if (!(this.grammar instanceof LexerGrammar)) {
            this.antlrTool.panic("Internal error generating lexer");
        }
        setupOutput(this.grammar.getClassName());
        this.genAST = false;
        this.saveText = true;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        println("import java.io.InputStream;");
        println("import antlr.TokenStreamException;");
        println("import antlr.TokenStreamIOException;");
        println("import antlr.TokenStreamRecognitionException;");
        println("import antlr.CharStreamException;");
        println("import antlr.CharStreamIOException;");
        println("import antlr.ANTLRException;");
        println("import java.io.Reader;");
        println("import java.util.Hashtable;");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("import antlr.");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(";");
        println(stringBuffer.toString());
        println("import antlr.InputBuffer;");
        println("import antlr.ByteBuffer;");
        println("import antlr.CharBuffer;");
        println("import antlr.Token;");
        println("import antlr.CommonToken;");
        println("import antlr.RecognitionException;");
        println("import antlr.NoViableAltForCharException;");
        println("import antlr.MismatchedCharException;");
        println("import antlr.TokenStream;");
        println("import antlr.ANTLRHashString;");
        println("import antlr.LexerSharedInputState;");
        println("import antlr.collections.impl.BitSet;");
        println("import antlr.SemanticException;");
        println(this.grammar.preambleAction.getText());
        String str2 = this.grammar.superClass;
        if (str2 == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("antlr.");
            stringBuffer2.append(this.grammar.getSuperClass());
            str2 = stringBuffer2.toString();
        }
        String str3 = this.grammar.comment;
        if (str3 != null) {
            _println(str3);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null || (str = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) == null) {
            str = "public";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append(" ");
        print(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("class ");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append(" extends ");
        stringBuffer4.append(str2);
        print(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(" implements ");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer5.append(", TokenStream");
        println(stringBuffer5.toString());
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(", ");
            stringBuffer6.append(stripFrontBack);
            print(stringBuffer6.toString());
        }
        println(" {");
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("public ");
        stringBuffer7.append(this.grammar.getClassName());
        stringBuffer7.append("(InputStream in) {");
        println(stringBuffer7.toString());
        this.tabs++;
        println("this(new ByteBuffer(in));");
        this.tabs--;
        println("}");
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("public ");
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("(Reader in) {");
        println(stringBuffer8.toString());
        this.tabs++;
        println("this(new CharBuffer(in));");
        this.tabs--;
        println("}");
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("public ");
        stringBuffer9.append(this.grammar.getClassName());
        stringBuffer9.append("(InputBuffer ib) {");
        println(stringBuffer9.toString());
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            println("this(new LexerSharedInputState(new antlr.debug.DebuggingInputBuffer(ib)));");
        } else {
            println("this(new LexerSharedInputState(ib));");
        }
        this.tabs--;
        println("}");
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("public ");
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append("(LexerSharedInputState state) {");
        println(stringBuffer10.toString());
        this.tabs++;
        println("super(state);");
        if (this.grammar.debuggingOutput) {
            println("  ruleNames  = _ruleNames;");
            println("  semPredNames = _semPredNames;");
            println("  setupDebugging();");
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("caseSensitiveLiterals = ");
        stringBuffer11.append(lexerGrammar.caseSensitiveLiterals);
        stringBuffer11.append(";");
        println(stringBuffer11.toString());
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append("setCaseSensitive(");
        stringBuffer12.append(lexerGrammar.caseSensitive);
        stringBuffer12.append(");");
        println(stringBuffer12.toString());
        println("literals = new Hashtable();");
        Enumeration tokenSymbolKeys = this.grammar.tokenManager.getTokenSymbolKeys();
        while (tokenSymbolKeys.hasMoreElements()) {
            String str4 = (String) tokenSymbolKeys.nextElement();
            if (str4.charAt(0) == '\"') {
                TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str4);
                if (tokenSymbol instanceof StringLiteralSymbol) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenSymbol;
                    StringBuffer stringBuffer13 = new StringBuffer();
                    stringBuffer13.append("literals.put(new ANTLRHashString(");
                    stringBuffer13.append(stringLiteralSymbol.getId());
                    stringBuffer13.append(", this), new Integer(");
                    stringBuffer13.append(stringLiteralSymbol.getTokenType());
                    stringBuffer13.append("));");
                    println(stringBuffer13.toString());
                }
            }
        }
        this.tabs--;
        println("}");
        if (this.grammar.debuggingOutput) {
            println("private static final String _ruleNames[] = {");
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer14 = new StringBuffer();
                    stringBuffer14.append("  \"");
                    stringBuffer14.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer14.append("\",");
                    println(stringBuffer14.toString());
                }
            }
            println("};");
        }
        genNextToken();
        Enumeration elements2 = this.grammar.rules.elements();
        int i10 = 0;
        while (elements2.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements2.nextElement();
            if (!ruleSymbol.getId().equals("mnextToken")) {
                genRule(ruleSymbol, false, i10);
                i10++;
            }
            exitIfError();
        }
        if (this.grammar.debuggingOutput) {
            genSemPredMap();
        }
        genBitsets(this.bitsetsUsed, ((LexerGrammar) this.grammar).charVocabulary.size());
        println("");
        println("}");
        this.currentOutput.close();
        this.currentOutput = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.OneOrMoreBlock r11) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.gen(antlr.OneOrMoreBlock):void");
    }

    @Override // antlr.CodeGenerator
    public void gen(ParserGrammar parserGrammar) {
        String str;
        String stripFrontBack;
        if (parserGrammar.debuggingOutput) {
            this.semPreds = new Vector();
        }
        setGrammar(parserGrammar);
        if (!(this.grammar instanceof ParserGrammar)) {
            this.antlrTool.panic("Internal error generating parser");
        }
        setupOutput(this.grammar.getClassName());
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        println("import antlr.TokenBuffer;");
        println("import antlr.TokenStreamException;");
        println("import antlr.TokenStreamIOException;");
        println("import antlr.ANTLRException;");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("import antlr.");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(";");
        println(stringBuffer.toString());
        println("import antlr.Token;");
        println("import antlr.TokenStream;");
        println("import antlr.RecognitionException;");
        println("import antlr.NoViableAltException;");
        println("import antlr.MismatchedTokenException;");
        println("import antlr.SemanticException;");
        println("import antlr.ParserSharedInputState;");
        println("import antlr.collections.impl.BitSet;");
        if (this.genAST) {
            println("import antlr.collections.AST;");
            println("import java.util.Hashtable;");
            println("import antlr.ASTFactory;");
            println("import antlr.ASTPair;");
            println("import antlr.collections.impl.ASTArray;");
        }
        println(this.grammar.preambleAction.getText());
        String str2 = this.grammar.superClass;
        if (str2 == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("antlr.");
            stringBuffer2.append(this.grammar.getSuperClass());
            str2 = stringBuffer2.toString();
        }
        String str3 = this.grammar.comment;
        if (str3 != null) {
            _println(str3);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null || (str = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) == null) {
            str = "public";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append(" ");
        print(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("class ");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append(" extends ");
        stringBuffer4.append(str2);
        print(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("       implements ");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer5.toString());
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(", ");
            stringBuffer6.append(stripFrontBack);
            print(stringBuffer6.toString());
        }
        println(" {");
        if (this.grammar.debuggingOutput) {
            println("private static final String _ruleNames[] = {");
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("  \"");
                    stringBuffer7.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer7.append("\",");
                    println(stringBuffer7.toString());
                }
            }
            println("};");
        }
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        println("");
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("protected ");
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("(TokenBuffer tokenBuf, int k) {");
        println(stringBuffer8.toString());
        println("  super(tokenBuf,k);");
        println("  tokenNames = _tokenNames;");
        if (this.grammar.debuggingOutput) {
            println("  ruleNames  = _ruleNames;");
            println("  semPredNames = _semPredNames;");
            println("  setupDebugging(tokenBuf);");
        }
        if (this.grammar.buildAST) {
            println("  buildTokenTypeASTClassMap();");
            println("  astFactory = new ASTFactory(getTokenTypeToASTClassMap());");
        }
        println("}");
        println("");
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("public ");
        stringBuffer9.append(this.grammar.getClassName());
        stringBuffer9.append("(TokenBuffer tokenBuf) {");
        println(stringBuffer9.toString());
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("  this(tokenBuf,");
        stringBuffer10.append(this.grammar.maxk);
        stringBuffer10.append(");");
        println(stringBuffer10.toString());
        println("}");
        println("");
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("protected ");
        stringBuffer11.append(this.grammar.getClassName());
        stringBuffer11.append("(TokenStream lexer, int k) {");
        println(stringBuffer11.toString());
        println("  super(lexer,k);");
        println("  tokenNames = _tokenNames;");
        if (this.grammar.debuggingOutput) {
            println("  ruleNames  = _ruleNames;");
            println("  semPredNames = _semPredNames;");
            println("  setupDebugging(lexer);");
        }
        if (this.grammar.buildAST) {
            println("  buildTokenTypeASTClassMap();");
            println("  astFactory = new ASTFactory(getTokenTypeToASTClassMap());");
        }
        println("}");
        println("");
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append("public ");
        stringBuffer12.append(this.grammar.getClassName());
        stringBuffer12.append("(TokenStream lexer) {");
        println(stringBuffer12.toString());
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append("  this(lexer,");
        stringBuffer13.append(this.grammar.maxk);
        stringBuffer13.append(");");
        println(stringBuffer13.toString());
        println("}");
        println("");
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append("public ");
        stringBuffer14.append(this.grammar.getClassName());
        stringBuffer14.append("(ParserSharedInputState state) {");
        println(stringBuffer14.toString());
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append("  super(state,");
        stringBuffer15.append(this.grammar.maxk);
        stringBuffer15.append(");");
        println(stringBuffer15.toString());
        println("  tokenNames = _tokenNames;");
        if (this.grammar.buildAST) {
            println("  buildTokenTypeASTClassMap();");
            println("  astFactory = new ASTFactory(getTokenTypeToASTClassMap());");
        }
        println("}");
        println("");
        Enumeration elements2 = this.grammar.rules.elements();
        int i10 = 0;
        while (elements2.hasMoreElements()) {
            GrammarSymbol grammarSymbol2 = (GrammarSymbol) elements2.nextElement();
            if (grammarSymbol2 instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol2;
                genRule(ruleSymbol, ruleSymbol.references.size() == 0, i10);
                i10++;
            }
            exitIfError();
        }
        genTokenStrings();
        if (this.grammar.buildAST) {
            genTokenASTNodeMap();
        }
        genBitsets(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        if (this.grammar.debuggingOutput) {
            genSemPredMap();
        }
        println("");
        println("}");
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(RuleRefElement ruleRefElement) {
        if (this.DEBUG_CODE_GENERATOR) {
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
                stringBuffer2.append(" = _t==ASTNULL ? null : ");
                stringBuffer2.append(this.lt1Value);
                stringBuffer2.append(";");
                println(stringBuffer2.toString());
            }
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || ruleRefElement.getAutoGenType() == 3)) {
                println("_saveIndex=text.length();");
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
                println("text.setLength(_saveIndex);");
            }
            if (this.syntacticPredLevel == 0) {
                Grammar grammar = this.grammar;
                if (grammar.hasSyntacticPredicate && ((!grammar.buildAST || ruleRefElement.getLabel() == null) && this.genAST)) {
                    ruleRefElement.getAutoGenType();
                }
                if (this.grammar.buildAST && ruleRefElement.getLabel() != null) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append(ruleRefElement.getLabel());
                    stringBuffer6.append("_AST = (");
                    stringBuffer6.append(this.labeledElementASTType);
                    stringBuffer6.append(")returnAST;");
                    println(stringBuffer6.toString());
                }
                if (this.genAST) {
                    int autoGenType = ruleRefElement.getAutoGenType();
                    if (autoGenType == 1) {
                        println("astFactory.addASTChild(currentAST, returnAST);");
                    } else if (autoGenType == 2) {
                        this.antlrTool.error("Internal: encountered ^ after rule reference");
                    }
                }
                if ((this.grammar instanceof LexerGrammar) && ruleRefElement.getLabel() != null) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append(ruleRefElement.getLabel());
                    stringBuffer7.append("=_returnToken;");
                    println(stringBuffer7.toString());
                }
            }
            genErrorCatchForElement(ruleRefElement);
            return;
        }
        Tool tool3 = this.antlrTool;
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("Rule '");
        stringBuffer8.append(ruleRefElement.targetRule);
        stringBuffer8.append("' is not defined");
        tool3.error(stringBuffer8.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r4.getAutoGenType() == 1) goto L16;
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
            if (r0 == 0) goto L1f
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
        L1f:
            java.lang.String r0 = r4.getLabel()
            if (r0 == 0) goto L4b
            int r0 = r3.syntacticPredLevel
            if (r0 != 0) goto L4b
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
        L4b:
            r3.genElementAST(r4)
            boolean r0 = r3.saveText
            if (r0 == 0) goto L5a
            int r1 = r4.getAutoGenType()
            r2 = 1
            if (r1 != r2) goto L5a
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r3.saveText = r2
            r3.genMatch(r4)
            r3.saveText = r0
            antlr.Grammar r4 = r3.grammar
            boolean r4 = r4 instanceof antlr.TreeWalkerGrammar
            if (r4 == 0) goto L6d
            java.lang.String r4 = "_t = _t.getNextSibling();"
            r3.println(r4)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.gen(antlr.StringLiteralElement):void");
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
        if (this.DEBUG_CODE_GENERATOR) {
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
            println("_t = _t.getNextSibling();");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeElement treeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AST __t");
        stringBuffer.append(treeElement.f4235ID);
        stringBuffer.append(" = _t;");
        println(stringBuffer.toString());
        if (treeElement.root.getLabel() != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(treeElement.root.getLabel());
            stringBuffer2.append(" = _t==ASTNULL ? null :(");
            stringBuffer2.append(this.labeledElementASTType);
            stringBuffer2.append(")_t;");
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
            stringBuffer3.append("ASTPair __currentAST");
            stringBuffer3.append(treeElement.f4235ID);
            stringBuffer3.append(" = currentAST.copy();");
            println(stringBuffer3.toString());
            println("currentAST.root = currentAST.child;");
            println("currentAST.child = null;");
        }
        GrammarAtom grammarAtom = treeElement.root;
        if (grammarAtom instanceof WildcardElement) {
            println("if ( _t==null ) throw new MismatchedTokenException();");
        } else {
            genMatch(grammarAtom);
        }
        println("_t = _t.getFirstChild();");
        for (int i10 = 0; i10 < treeElement.getAlternatives().size(); i10++) {
            for (AlternativeElement alternativeElement = treeElement.getAlternativeAt(i10).head; alternativeElement != null; alternativeElement = alternativeElement.next) {
                alternativeElement.generate();
            }
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("currentAST = __currentAST");
            stringBuffer4.append(treeElement.f4235ID);
            stringBuffer4.append(";");
            println(stringBuffer4.toString());
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("_t = __t");
        stringBuffer5.append(treeElement.f4235ID);
        stringBuffer5.append(";");
        println(stringBuffer5.toString());
        println("_t = _t.getNextSibling();");
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeWalkerGrammar treeWalkerGrammar) {
        String str;
        String stripFrontBack;
        setGrammar(treeWalkerGrammar);
        if (!(this.grammar instanceof TreeWalkerGrammar)) {
            this.antlrTool.panic("Internal error generating tree-walker");
        }
        setupOutput(this.grammar.getClassName());
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("import antlr.");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(";");
        println(stringBuffer.toString());
        println("import antlr.Token;");
        println("import antlr.collections.AST;");
        println("import antlr.RecognitionException;");
        println("import antlr.ANTLRException;");
        println("import antlr.NoViableAltException;");
        println("import antlr.MismatchedTokenException;");
        println("import antlr.SemanticException;");
        println("import antlr.collections.impl.BitSet;");
        println("import antlr.ASTPair;");
        println("import antlr.collections.impl.ASTArray;");
        println(this.grammar.preambleAction.getText());
        String str2 = this.grammar.superClass;
        if (str2 == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("antlr.");
            stringBuffer2.append(this.grammar.getSuperClass());
            str2 = stringBuffer2.toString();
        }
        println("");
        String str3 = this.grammar.comment;
        if (str3 != null) {
            _println(str3);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null || (str = StringUtils.stripFrontBack(token.getText(), "\"", "\"")) == null) {
            str = "public";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append(" ");
        print(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("class ");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append(" extends ");
        stringBuffer4.append(str2);
        print(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("       implements ");
        stringBuffer5.append(this.grammar.tokenManager.getName());
        stringBuffer5.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer5.toString());
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(", ");
            stringBuffer6.append(stripFrontBack);
            print(stringBuffer6.toString());
        }
        println(" {");
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("public ");
        stringBuffer7.append(this.grammar.getClassName());
        stringBuffer7.append("() {");
        println(stringBuffer7.toString());
        this.tabs++;
        println("tokenNames = _tokenNames;");
        this.tabs--;
        println("}");
        println("");
        Enumeration elements = this.grammar.rules.elements();
        int i10 = 0;
        while (elements.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol;
                genRule(ruleSymbol, ruleSymbol.references.size() == 0, i10);
                i10++;
            }
            exitIfError();
        }
        genTokenStrings();
        genBitsets(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        println("}");
        println("");
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
            println("if ( _t==null ) throw new MismatchedTokenException();");
        } else if (grammar instanceof LexerGrammar) {
            if ((grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                println("_saveIndex=text.length();");
            }
            println("matchNot(EOF_CHAR);");
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                println("text.setLength(_saveIndex);");
            }
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("matchNot(");
            stringBuffer2.append(getValueString(1));
            stringBuffer2.append(");");
            println(stringBuffer2.toString());
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("_t = _t.getNextSibling();");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.ZeroOrMoreBlock r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.JavaCodeGenerator.gen(antlr.ZeroOrMoreBlock):void");
    }
}
