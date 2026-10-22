package antlr;

import antlr.actions.csharp.ActionLexer;
import antlr.collections.impl.BitSet;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class CSharpCodeGenerator extends CodeGenerator {
    public static final int caseSizeThreshold = 127;
    private Vector astTypes;
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
    private antlr.collections.impl.Vector semPreds;
    String throwNoViable;
    protected static final String NONUNIQUE = new String();
    private static CSharpNameSpace nameSpace = null;
    protected int syntacticPredLevel = 0;
    protected boolean genAST = false;
    protected boolean saveText = false;
    boolean usingCustomAST = false;
    Hashtable treeVariableMap = new Hashtable();
    Hashtable declaredASTVariables = new Hashtable();
    int astVarNumber = 1;
    boolean bSaveIndexCreated = false;

    public CSharpCodeGenerator() {
        this.charFormatter = new CSharpCharFormatter();
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
            println("_t = retTree_;");
        }
    }

    private static String OctalToUnicode(String str) {
        if (4 <= str.length() && '\'' == str.charAt(0) && '\\' == str.charAt(1) && '0' <= str.charAt(2) && '7' >= str.charAt(2) && '\'' == str.charAt(str.length() - 1)) {
            Integer valueOf = Integer.valueOf(str.substring(2, str.length() - 1), 8);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("'\\x");
            stringBuffer.append(Integer.toHexString(valueOf.intValue()));
            stringBuffer.append("'");
            return stringBuffer.toString();
        }
        return str;
    }

    private void declareSaveIndexVariableIfNeeded() {
        if (!this.bSaveIndexCreated) {
            println("int _saveIndex = 0;");
            this.bSaveIndexCreated = true;
        }
    }

    private void genBitSet(BitSet bitSet, int i10) {
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("private static long[] mk_");
        stringBuffer.append(getBitsetName(i10));
        stringBuffer.append("()");
        println(stringBuffer.toString());
        println("{");
        this.tabs++;
        int lengthInLongWords = bitSet.lengthInLongWords();
        if (lengthInLongWords < 8) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("long[] data = { ");
            stringBuffer2.append(bitSet.toStringOfWords());
            stringBuffer2.append("};");
            println(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("long[] data = new long[");
            stringBuffer3.append(lengthInLongWords);
            stringBuffer3.append("];");
            println(stringBuffer3.toString());
            long[] packedArray = bitSet.toPackedArray();
            for (int i12 = 0; i12 < packedArray.length; i12 = i11) {
                i11 = i12 + 1;
                if (i11 != packedArray.length && packedArray[i12] == packedArray[i11]) {
                    while (i11 < packedArray.length && packedArray[i11] == packedArray[i12]) {
                        i11++;
                    }
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("for (int i = ");
                    stringBuffer4.append(i12);
                    stringBuffer4.append("; i<=");
                    stringBuffer4.append(i11 - 1);
                    stringBuffer4.append("; i++) { data[i]=");
                    stringBuffer4.append(packedArray[i12]);
                    stringBuffer4.append("L; }");
                    println(stringBuffer4.toString());
                } else {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("data[");
                    stringBuffer5.append(i12);
                    stringBuffer5.append("]=");
                    stringBuffer5.append(packedArray[i12]);
                    stringBuffer5.append("L;");
                    println(stringBuffer5.toString());
                }
            }
        }
        println("return data;");
        this.tabs--;
        println("}");
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("public static readonly BitSet ");
        stringBuffer6.append(getBitsetName(i10));
        stringBuffer6.append(" = new BitSet(");
        stringBuffer6.append("mk_");
        stringBuffer6.append(getBitsetName(i10));
        stringBuffer6.append("()");
        stringBuffer6.append(");");
        println(stringBuffer6.toString());
    }

    private void genBlockFinish(CSharpBlockFinishingInfo cSharpBlockFinishingInfo, String str) {
        boolean z10;
        if (cSharpBlockFinishingInfo.needAnErrorClause && ((z10 = cSharpBlockFinishingInfo.generatedAnIf) || cSharpBlockFinishingInfo.generatedSwitch)) {
            if (z10) {
                println("else");
                println("{");
            } else {
                println("{");
            }
            this.tabs++;
            println(str);
            this.tabs--;
            println("}");
        }
        String str2 = cSharpBlockFinishingInfo.postscript;
        if (str2 != null) {
            if (cSharpBlockFinishingInfo.needAnErrorClause && cSharpBlockFinishingInfo.generatedSwitch && !cSharpBlockFinishingInfo.generatedAnIf && str != null) {
                if (str.indexOf("throw") != 0 && str.indexOf("goto") != 0) {
                    println(cSharpBlockFinishingInfo.postscript);
                    return;
                } else {
                    println(cSharpBlockFinishingInfo.postscript.substring(cSharpBlockFinishingInfo.postscript.indexOf("break;") + 6));
                    return;
                }
            }
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
                        if (!this.usingCustomAST && (!(alternativeElement instanceof GrammarAtom) || ((GrammarAtom) alternativeElement).getASTNodeType() == null)) {
                            StringBuffer stringBuffer14 = new StringBuffer();
                            stringBuffer14.append("astFactory.makeASTRoot(currentAST, ");
                            stringBuffer14.append(stringBuffer7);
                            stringBuffer14.append(");");
                            println(stringBuffer14.toString());
                            return;
                        }
                        StringBuffer stringBuffer15 = new StringBuffer();
                        stringBuffer15.append("astFactory.makeASTRoot(currentAST, (AST)");
                        stringBuffer15.append(stringBuffer7);
                        stringBuffer15.append(");");
                        println(stringBuffer15.toString());
                        return;
                    }
                    return;
                }
                if (!this.usingCustomAST && (!(alternativeElement instanceof GrammarAtom) || ((GrammarAtom) alternativeElement).getASTNodeType() == null)) {
                    StringBuffer stringBuffer16 = new StringBuffer();
                    stringBuffer16.append("astFactory.addASTChild(currentAST, ");
                    stringBuffer16.append(stringBuffer7);
                    stringBuffer16.append(");");
                    println(stringBuffer16.toString());
                    return;
                }
                StringBuffer stringBuffer17 = new StringBuffer();
                stringBuffer17.append("astFactory.addASTChild(currentAST, (AST)");
                stringBuffer17.append(stringBuffer7);
                stringBuffer17.append(");");
                println(stringBuffer17.toString());
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
            stringBuffer.append(")");
            println(stringBuffer.toString());
            println("{");
            this.tabs++;
            if (this.grammar.hasSyntacticPredicate) {
                println("if (0 == inputState.guessing)");
                println("{");
                this.tabs++;
            }
            printAction(processActionForSpecialSymbols(exceptionHandler.action.getText(), exceptionHandler.action.getLine(), this.currentRule, new ActionTransInfo()));
            if (this.grammar.hasSyntacticPredicate) {
                this.tabs--;
                println("}");
                println("else");
                println("{");
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
            println("try   // for error handling");
            println("{");
            this.tabs++;
        }
    }

    private void genLiteralsTest() {
        println("_ttype = testLiteralsTable(_ttype);");
    }

    private void genLiteralsTestForPartialToken() {
        println("_ttype = testLiteralsTable(text.ToString(_begin, text.Length-_begin), _ttype);");
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
            return "_t.Type";
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
            java.lang.String r0 = antlr.CSharpCodeGenerator.NONUNIQUE
            r3.put(r2, r0)
            goto L41
        L3c:
            java.util.Hashtable r0 = r1.treeVariableMap
            r0.put(r2, r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.mapTreeVariable(antlr.AlternativeElement, java.lang.String):void");
    }

    private void setupGrammarParameters(Grammar grammar) {
        Token option;
        Token option2;
        String stripFrontBack;
        Token option3;
        String stripFrontBack2;
        boolean z10 = grammar instanceof ParserGrammar;
        if (z10 || (grammar instanceof LexerGrammar) || (grammar instanceof TreeWalkerGrammar)) {
            NameSpace nameSpace2 = this.antlrTool.nameSpace;
            if (nameSpace2 != null) {
                nameSpace = new CSharpNameSpace(nameSpace2.getName());
            }
            if (grammar.hasOption("namespace") && (option = grammar.getOption("namespace")) != null) {
                nameSpace = new CSharpNameSpace(option.getText());
            }
        }
        if (z10) {
            this.labeledElementASTType = "AST";
            if (grammar.hasOption("ASTLabelType") && (option3 = grammar.getOption("ASTLabelType")) != null && (stripFrontBack2 = StringUtils.stripFrontBack(option3.getText(), "\"", "\"")) != null) {
                this.usingCustomAST = true;
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
            this.commonExtraParams = "bool _createToken";
            this.commonLocalVars = "int _ttype; Token _token=null; int _begin=text.Length;";
            this.lt1Value = "LA(1)";
            this.exceptionThrown = "RecognitionException";
            this.throwNoViable = "throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());";
            return;
        }
        if (grammar instanceof TreeWalkerGrammar) {
            this.labeledElementASTType = "AST";
            this.labeledElementType = "AST";
            if (grammar.hasOption("ASTLabelType") && (option2 = grammar.getOption("ASTLabelType")) != null && (stripFrontBack = StringUtils.stripFrontBack(option2.getText(), "\"", "\"")) != null) {
                this.usingCustomAST = true;
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
            if (this.usingCustomAST) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("(_t==ASTNULL) ? null : (");
                stringBuffer.append(this.labeledElementASTType);
                stringBuffer.append(")_t");
                this.lt1Value = stringBuffer.toString();
            } else {
                this.lt1Value = "_t";
            }
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
            println("try        // for error handling");
            println("{");
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
                    stringBuffer.append("_AST = (");
                    stringBuffer.append(this.labeledElementASTType);
                    stringBuffer.append(")currentAST.root;");
                    println(stringBuffer.toString());
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(ruleBlock.getRuleName());
                    stringBuffer2.append("_AST = currentAST.root;");
                    println(stringBuffer2.toString());
                }
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

    protected void genBitsets(antlr.collections.impl.Vector vector, int i10) {
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
                            stringBuffer3.append(" = null;");
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

    public void genBody(LexerGrammar lexerGrammar) {
        String stripFrontBack;
        setupOutput(this.grammar.getClassName());
        this.genAST = false;
        this.saveText = true;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        CSharpNameSpace cSharpNameSpace = nameSpace;
        if (cSharpNameSpace != null) {
            cSharpNameSpace.emitDeclarations(this.currentOutput);
        }
        this.tabs++;
        println("// Generate header specific to lexer CSharp file");
        println("using System;");
        println("using Stream                          = System.IO.Stream;");
        println("using TextReader                      = System.IO.TextReader;");
        println("using Hashtable                       = System.Collections.Hashtable;");
        println("using Comparer                        = System.Collections.Comparer;");
        if (!lexerGrammar.caseSensitiveLiterals) {
            println("using CaseInsensitiveHashCodeProvider = System.Collections.CaseInsensitiveHashCodeProvider;");
            println("using CaseInsensitiveComparer         = System.Collections.CaseInsensitiveComparer;");
        }
        println("");
        println("using TokenStreamException            = antlr.TokenStreamException;");
        println("using TokenStreamIOException          = antlr.TokenStreamIOException;");
        println("using TokenStreamRecognitionException = antlr.TokenStreamRecognitionException;");
        println("using CharStreamException             = antlr.CharStreamException;");
        println("using CharStreamIOException           = antlr.CharStreamIOException;");
        println("using ANTLRException                  = antlr.ANTLRException;");
        println("using CharScanner                     = antlr.CharScanner;");
        println("using InputBuffer                     = antlr.InputBuffer;");
        println("using ByteBuffer                      = antlr.ByteBuffer;");
        println("using CharBuffer                      = antlr.CharBuffer;");
        println("using Token                           = antlr.Token;");
        println("using CommonToken                     = antlr.CommonToken;");
        println("using SemanticException               = antlr.SemanticException;");
        println("using RecognitionException            = antlr.RecognitionException;");
        println("using NoViableAltForCharException     = antlr.NoViableAltForCharException;");
        println("using MismatchedCharException         = antlr.MismatchedCharException;");
        println("using TokenStream                     = antlr.TokenStream;");
        println("using LexerSharedInputState           = antlr.LexerSharedInputState;");
        println("using BitSet                          = antlr.collections.impl.BitSet;");
        println(this.grammar.preambleAction.getText());
        String str = this.grammar.superClass;
        if (str == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("antlr.");
            stringBuffer.append(this.grammar.getSuperClass());
            str = stringBuffer.toString();
        }
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null) {
            print("public ");
        } else {
            String stripFrontBack2 = StringUtils.stripFrontBack(token.getText(), "\"", "\"");
            if (stripFrontBack2 == null) {
                print("public ");
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(stripFrontBack2);
                stringBuffer2.append(" ");
                print(stringBuffer2.toString());
            }
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("class ");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(" : ");
        stringBuffer3.append(str);
        print(stringBuffer3.toString());
        println(", TokenStream");
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(", ");
            stringBuffer4.append(stripFrontBack);
            print(stringBuffer4.toString());
        }
        println(" {");
        this.tabs++;
        genTokenDefinitions(this.grammar.tokenManager);
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("public ");
        stringBuffer5.append(this.grammar.getClassName());
        stringBuffer5.append("(Stream ins) : this(new ByteBuffer(ins))");
        println(stringBuffer5.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("public ");
        stringBuffer6.append(this.grammar.getClassName());
        stringBuffer6.append("(TextReader r) : this(new CharBuffer(r))");
        println(stringBuffer6.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("public ");
        stringBuffer7.append(this.grammar.getClassName());
        stringBuffer7.append("(InputBuffer ib)");
        print(stringBuffer7.toString());
        if (this.grammar.debuggingOutput) {
            println(" : this(new LexerSharedInputState(new antlr.debug.DebuggingInputBuffer(ib)))");
        } else {
            println(" : this(new LexerSharedInputState(ib))");
        }
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("public ");
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("(LexerSharedInputState state) : base(state)");
        println(stringBuffer8.toString());
        println("{");
        this.tabs++;
        println("initialize();");
        this.tabs--;
        println("}");
        println("private void initialize()");
        println("{");
        this.tabs++;
        if (this.grammar.debuggingOutput) {
            println("ruleNames  = _ruleNames;");
            println("semPredNames = _semPredNames;");
            println("setupDebugging();");
        }
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("caseSensitiveLiterals = ");
        stringBuffer9.append(lexerGrammar.caseSensitiveLiterals);
        stringBuffer9.append(";");
        println(stringBuffer9.toString());
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("setCaseSensitive(");
        stringBuffer10.append(lexerGrammar.caseSensitive);
        stringBuffer10.append(");");
        println(stringBuffer10.toString());
        if (lexerGrammar.caseSensitiveLiterals) {
            println("literals = new Hashtable(100, (float) 0.4, null, Comparer.Default);");
        } else {
            println("literals = new Hashtable(100, (float) 0.4, CaseInsensitiveHashCodeProvider.Default, CaseInsensitiveComparer.Default);");
        }
        Enumeration tokenSymbolKeys = this.grammar.tokenManager.getTokenSymbolKeys();
        while (tokenSymbolKeys.hasMoreElements()) {
            String str3 = (String) tokenSymbolKeys.nextElement();
            if (str3.charAt(0) == '\"') {
                TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str3);
                if (tokenSymbol instanceof StringLiteralSymbol) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenSymbol;
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append("literals.Add(");
                    stringBuffer11.append(stringLiteralSymbol.getId());
                    stringBuffer11.append(", ");
                    stringBuffer11.append(stringLiteralSymbol.getTokenType());
                    stringBuffer11.append(");");
                    println(stringBuffer11.toString());
                }
            }
        }
        this.tabs--;
        println("}");
        if (this.grammar.debuggingOutput) {
            println("private const string[] _ruleNames = {");
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append("  \"");
                    stringBuffer12.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer12.append("\",");
                    println(stringBuffer12.toString());
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
                genRule(ruleSymbol, false, i10, this.grammar.tokenManager);
                i10++;
            }
            exitIfError();
        }
        if (this.grammar.debuggingOutput) {
            genSemPredMap();
        }
        genBitsets(this.bitsetsUsed, ((LexerGrammar) this.grammar).charVocabulary.size());
        println("");
        this.tabs--;
        println("}");
        this.tabs--;
        CSharpNameSpace cSharpNameSpace2 = nameSpace;
        if (cSharpNameSpace2 != null) {
            cSharpNameSpace2.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
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

    public CSharpBlockFinishingInfo genCommonBlock(AlternativeBlock alternativeBlock, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        CSharpBlockFinishingInfo cSharpBlockFinishingInfo;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        boolean lookaheadIsEmpty;
        String lookaheadTestExpression;
        boolean z17;
        boolean z18;
        int i11;
        CSharpBlockFinishingInfo cSharpBlockFinishingInfo2;
        int i12;
        String str2;
        String str3;
        CSharpBlockFinishingInfo cSharpBlockFinishingInfo3 = new CSharpBlockFinishingInfo();
        if (this.DEBUG_CODE_GENERATOR) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("genCommonBlock(");
            stringBuffer.append(alternativeBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        boolean z19 = this.genAST;
        boolean z20 = false;
        if (z19 && alternativeBlock.getAutoGen()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.genAST = z11;
        boolean z21 = this.saveText;
        if (z21 && alternativeBlock.getAutoGen()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.saveText = z12;
        String str4 = "";
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
                if (this.usingCustomAST) {
                    str4 = "(AST)_t,";
                } else {
                    str4 = "_t,";
                }
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("match(");
            stringBuffer3.append(str4);
            stringBuffer3.append(getBitsetName(markBitsetForGen(look.fset)));
            stringBuffer3.append(");");
            println(stringBuffer3.toString());
            if (this.grammar instanceof TreeWalkerGrammar) {
                println("_t = _t.getNextSibling();");
            }
            return cSharpBlockFinishingInfo3;
        }
        if (alternativeBlock.getAlternatives().size() == 1) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(0);
            if (alternativeAt.synPred != null) {
                this.antlrTool.warning("Syntactic predicate superfluous for single alternative", this.grammar.getFilename(), alternativeBlock.getAlternativeAt(0).synPred.getLine(), alternativeBlock.getAlternativeAt(0).synPred.getColumn());
            }
            if (z10) {
                String str5 = alternativeAt.semPred;
                if (str5 != null) {
                    genSemPred(str5, alternativeBlock.line);
                }
                genAlt(alternativeAt, alternativeBlock);
                return cSharpBlockFinishingInfo3;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < alternativeBlock.getAlternatives().size(); i14++) {
            if (suitableForCaseExpression(alternativeBlock.getAlternativeAt(i14))) {
                i13++;
            }
        }
        String str6 = "}";
        if (i13 >= this.makeSwitchThreshold) {
            String lookaheadString = lookaheadString(1);
            if (this.grammar instanceof TreeWalkerGrammar) {
                println("if (null == _t)");
                this.tabs++;
                println("_t = ASTNULL;");
                this.tabs--;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("switch ( ");
            stringBuffer4.append(lookaheadString);
            stringBuffer4.append(" )");
            println(stringBuffer4.toString());
            println("{");
            int i15 = 0;
            while (i15 < alternativeBlock.alternatives.size()) {
                Alternative alternativeAt2 = alternativeBlock.getAlternativeAt(i15);
                this.bSaveIndexCreated = z20;
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
                i15++;
                z20 = false;
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
                    str = str4;
                    StringBuffer stringBuffer6 = new StringBuffer();
                    z16 = z21;
                    stringBuffer6.append("genAlt: ");
                    stringBuffer6.append(i18);
                    printStream3.println(stringBuffer6.toString());
                } else {
                    z16 = z21;
                    str = str4;
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
                    if (alternativeAt3.cache[1].fset.degree() > 127 && suitableForCaseExpression(alternativeAt3)) {
                        if (i17 == 0) {
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append("if ");
                            stringBuffer8.append(lookaheadTestExpression);
                            println(stringBuffer8.toString());
                            println("{");
                        } else {
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append("else if ");
                            stringBuffer9.append(lookaheadTestExpression);
                            println(stringBuffer9.toString());
                            println("{");
                        }
                    } else if (lookaheadIsEmpty && alternativeAt3.semPred == null && alternativeAt3.synPred == null) {
                        if (i17 == 0) {
                            println("{");
                        } else {
                            println("else {");
                        }
                        cSharpBlockFinishingInfo3.needAnErrorClause = false;
                    } else {
                        if (alternativeAt3.semPred != null) {
                            cSharpBlockFinishingInfo2 = cSharpBlockFinishingInfo3;
                            i12 = i18;
                            String processActionForSpecialSymbols = processActionForSpecialSymbols(alternativeAt3.semPred, alternativeBlock.line, this.currentRule, new ActionTransInfo());
                            Grammar grammar3 = this.grammar;
                            str2 = str6;
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
                            cSharpBlockFinishingInfo2 = cSharpBlockFinishingInfo3;
                            i12 = i18;
                            str2 = str6;
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
                                    println("if (_t == null)");
                                    this.tabs++;
                                    println("_t = ASTNULL;");
                                    this.tabs--;
                                }
                                StringBuffer stringBuffer13 = new StringBuffer();
                                stringBuffer13.append("if ");
                                stringBuffer13.append(lookaheadTestExpression);
                                println(stringBuffer13.toString());
                                println("{");
                            }
                        }
                        i17++;
                        this.tabs++;
                        genAlt(alternativeAt3, alternativeBlock);
                        this.tabs--;
                        str3 = str2;
                        println(str3);
                        i18 = i12 + 1;
                        z13 = z17;
                        str6 = str3;
                        str4 = str;
                        z21 = z16;
                        z19 = z18;
                        i10 = i11;
                        cSharpBlockFinishingInfo3 = cSharpBlockFinishingInfo2;
                    }
                    cSharpBlockFinishingInfo2 = cSharpBlockFinishingInfo3;
                    i12 = i18;
                    str2 = str6;
                    i17++;
                    this.tabs++;
                    genAlt(alternativeAt3, alternativeBlock);
                    this.tabs--;
                    str3 = str2;
                    println(str3);
                    i18 = i12 + 1;
                    z13 = z17;
                    str6 = str3;
                    str4 = str;
                    z21 = z16;
                    z19 = z18;
                    i10 = i11;
                    cSharpBlockFinishingInfo3 = cSharpBlockFinishingInfo2;
                }
                cSharpBlockFinishingInfo2 = cSharpBlockFinishingInfo3;
                z18 = z19;
                i12 = i18;
                z17 = z13;
                i11 = i10;
                str3 = str6;
                i18 = i12 + 1;
                z13 = z17;
                str6 = str3;
                str4 = str;
                z21 = z16;
                z19 = z18;
                i10 = i11;
                cSharpBlockFinishingInfo3 = cSharpBlockFinishingInfo2;
            }
            i10--;
            cSharpBlockFinishingInfo3 = cSharpBlockFinishingInfo3;
        }
        CSharpBlockFinishingInfo cSharpBlockFinishingInfo4 = cSharpBlockFinishingInfo3;
        boolean z22 = z19;
        boolean z23 = z13;
        boolean z24 = z21;
        String str7 = str6;
        for (int i20 = 1; i20 <= i16; i20++) {
            StringBuffer stringBuffer14 = new StringBuffer();
            stringBuffer14.append(str4);
            stringBuffer14.append(str7);
            str4 = stringBuffer14.toString();
        }
        this.genAST = z22;
        this.saveText = z24;
        if (z23) {
            this.tabs--;
            StringBuffer stringBuffer15 = new StringBuffer();
            stringBuffer15.append(str4);
            stringBuffer15.append("break; }");
            cSharpBlockFinishingInfo = cSharpBlockFinishingInfo4;
            cSharpBlockFinishingInfo.postscript = stringBuffer15.toString();
            cSharpBlockFinishingInfo.generatedSwitch = true;
            if (i17 > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            cSharpBlockFinishingInfo.generatedAnIf = z15;
        } else {
            cSharpBlockFinishingInfo = cSharpBlockFinishingInfo4;
            cSharpBlockFinishingInfo.postscript = str4;
            cSharpBlockFinishingInfo.generatedSwitch = false;
            if (i17 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            cSharpBlockFinishingInfo.generatedAnIf = z14;
        }
        return cSharpBlockFinishingInfo;
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
        stringBuffer.append(".cs\"$");
        println(stringBuffer.toString());
    }

    public void genInitFactory(Grammar grammar) {
        TokenSymbol tokenSymbol;
        if (grammar.buildAST) {
            println("static public void initializeASTFactory( ASTFactory factory )");
            println("{");
            this.tabs++;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("factory.setMaxNodeType(");
            stringBuffer.append(grammar.tokenManager.maxTokenType());
            stringBuffer.append(");");
            println(stringBuffer.toString());
            antlr.collections.impl.Vector vocabulary = grammar.tokenManager.getVocabulary();
            for (int i10 = 0; i10 < vocabulary.size(); i10++) {
                String str = (String) vocabulary.elementAt(i10);
                if (str != null && (tokenSymbol = grammar.tokenManager.getTokenSymbol(str)) != null && tokenSymbol.getASTNodeType() != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("factory.setTokenTypeASTNodeType(");
                    stringBuffer2.append(str);
                    stringBuffer2.append(", \"");
                    stringBuffer2.append(tokenSymbol.getASTNodeType());
                    stringBuffer2.append("\");");
                    println(stringBuffer2.toString());
                }
            }
            this.tabs--;
            println("}");
        }
    }

    protected void genMatch(BitSet bitSet) {
    }

    protected void genMatchUsingAtomText(GrammarAtom grammarAtom) {
        String str;
        String str2;
        Grammar grammar = this.grammar;
        if (grammar instanceof TreeWalkerGrammar) {
            if (this.usingCustomAST) {
                str = "(AST)_t,";
            } else {
                str = "_t,";
            }
        } else {
            str = "";
        }
        if ((grammar instanceof LexerGrammar) && (!this.saveText || grammarAtom.getAutoGenType() == 3)) {
            declareSaveIndexVariableIfNeeded();
            println("_saveIndex = text.Length;");
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
                declareSaveIndexVariableIfNeeded();
                println("text.Length = _saveIndex;");
            }
        }
    }

    protected void genMatchUsingAtomTokenType(GrammarAtom grammarAtom) {
        String str;
        String str2;
        if (this.grammar instanceof TreeWalkerGrammar) {
            if (this.usingCustomAST) {
                str = "(AST)_t,";
            } else {
                str = "_t,";
            }
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
            println("override public Token nextToken()\t\t\t//throws TokenStreamException");
            println("{");
            this.tabs++;
            println("try");
            println("{");
            this.tabs++;
            println("uponEOF();");
            this.tabs--;
            println("}");
            println("catch(CharStreamIOException csioe)");
            println("{");
            this.tabs++;
            println("throw new TokenStreamIOException(csioe.io);");
            this.tabs--;
            println("}");
            println("catch(CharStreamException cse)");
            println("{");
            this.tabs++;
            println("throw new TokenStreamException(cse.Message);");
            this.tabs--;
            println("}");
            println("return new CommonToken(Token.EOF_TYPE, \"\");");
            this.tabs--;
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
        println("override public Token nextToken()\t\t\t//throws TokenStreamException");
        println("{");
        this.tabs++;
        println("Token theRetToken = null;");
        _println("tryAgain:");
        println("for (;;)");
        println("{");
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
        println("try     // for char stream error handling");
        println("{");
        this.tabs++;
        println("try     // for lexical error handling");
        println("{");
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
        CSharpBlockFinishingInfo genCommonBlock = genCommonBlock(createNextTokenRule, false);
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("if (LA(1)==EOF_CHAR) { uponEOF(); returnToken_ = makeToken(Token.EOF_TYPE); }");
        stringBuffer6.append(property);
        stringBuffer6.append("\t\t\t\t");
        String stringBuffer7 = stringBuffer6.toString();
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(stringBuffer7);
                stringBuffer8.append("\t\t\t\telse");
                String stringBuffer9 = stringBuffer8.toString();
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append(stringBuffer9);
                stringBuffer10.append("\t\t\t\t{");
                String stringBuffer11 = stringBuffer10.toString();
                StringBuffer stringBuffer12 = new StringBuffer();
                stringBuffer12.append(stringBuffer11);
                stringBuffer12.append("\t\t\t\t\tconsume();");
                String stringBuffer13 = stringBuffer12.toString();
                StringBuffer stringBuffer14 = new StringBuffer();
                stringBuffer14.append(stringBuffer13);
                stringBuffer14.append("\t\t\t\t\tgoto tryAgain;");
                String stringBuffer15 = stringBuffer14.toString();
                StringBuffer stringBuffer16 = new StringBuffer();
                stringBuffer16.append(stringBuffer15);
                stringBuffer16.append("\t\t\t\t}");
                stringBuffer = stringBuffer16.toString();
            } else {
                StringBuffer stringBuffer17 = new StringBuffer();
                stringBuffer17.append(stringBuffer7);
                stringBuffer17.append("\t\t\t\t\telse");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t{");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\tcommit();");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\ttry {m");
                stringBuffer17.append(str);
                stringBuffer17.append("(false);}");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\tcatch(RecognitionException e)");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t{");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t\t// catastrophic failure");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t\treportError(e);");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t\tconsume();");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\t}");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t\tgoto tryAgain;");
                stringBuffer17.append(property);
                stringBuffer17.append("\t\t\t\t}");
                stringBuffer = stringBuffer17.toString();
            }
        } else {
            StringBuffer stringBuffer18 = new StringBuffer();
            stringBuffer18.append(stringBuffer7);
            stringBuffer18.append("else {");
            stringBuffer18.append(this.throwNoViable);
            stringBuffer18.append("}");
            stringBuffer = stringBuffer18.toString();
        }
        genBlockFinish(genCommonBlock, stringBuffer);
        if (((LexerGrammar) this.grammar).filterMode && str != null) {
            println("commit();");
        }
        println("if ( null==returnToken_ ) goto tryAgain; // found SKIP token");
        println("_ttype = returnToken_.Type;");
        if (((LexerGrammar) this.grammar).getTestLiterals()) {
            genLiteralsTest();
        }
        println("returnToken_.Type = _ttype;");
        println("return returnToken_;");
        this.tabs--;
        println("}");
        println("catch (RecognitionException e) {");
        this.tabs++;
        if (((LexerGrammar) this.grammar).filterMode) {
            if (str == null) {
                println("if (!getCommitToPath())");
                println("{");
                this.tabs++;
                println("consume();");
                println("goto tryAgain;");
                this.tabs--;
                println("}");
            } else {
                println("if (!getCommitToPath())");
                println("{");
                this.tabs++;
                println("rewind(_m);");
                println("resetText();");
                StringBuffer stringBuffer19 = new StringBuffer();
                stringBuffer19.append("try {m");
                stringBuffer19.append(str);
                stringBuffer19.append("(false);}");
                println(stringBuffer19.toString());
                println("catch(RecognitionException ee) {");
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
            println("throw new TokenStreamRecognitionException(e);");
            this.tabs--;
        }
        this.tabs--;
        println("}");
        this.tabs--;
        println("}");
        println("catch (CharStreamException cse) {");
        println("\tif ( cse is CharStreamIOException ) {");
        println("\t\tthrow new TokenStreamIOException(((CharStreamIOException)cse).io);");
        println("\t}");
        println("\telse {");
        println("\t\tthrow new TokenStreamException(cse.Message);");
        println("\t}");
        println("}");
        this.tabs--;
        println("}");
        this.tabs--;
        println("}");
        println("");
    }

    public void genRule(RuleSymbol ruleSymbol, boolean z10, int i10, TokenManager tokenManager) {
        boolean z11;
        int i11;
        boolean z12;
        String str;
        String str2;
        int i12;
        int i13;
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
        String str3 = ruleSymbol.comment;
        if (str3 != null) {
            _println(str3);
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(ruleSymbol.access);
        stringBuffer3.append(" ");
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
        stringBuffer6.append(" //throws ");
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
        _println("");
        _println("{");
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
                if (this.usingCustomAST) {
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("traceIn(\"");
                    stringBuffer10.append(ruleSymbol.getId());
                    stringBuffer10.append("\",(AST)_t);");
                    println(stringBuffer10.toString());
                } else {
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append("traceIn(\"");
                    stringBuffer11.append(ruleSymbol.getId());
                    stringBuffer11.append("\",_t);");
                    println(stringBuffer11.toString());
                }
            } else {
                StringBuffer stringBuffer12 = new StringBuffer();
                stringBuffer12.append("traceIn(\"");
                stringBuffer12.append(ruleSymbol.getId());
                stringBuffer12.append("\");");
                println(stringBuffer12.toString());
            }
        }
        if (this.grammar instanceof LexerGrammar) {
            if (ruleSymbol.getId().equals("mEOF")) {
                println("_ttype = Token.EOF_TYPE;");
            } else {
                StringBuffer stringBuffer13 = new StringBuffer();
                stringBuffer13.append("_ttype = ");
                stringBuffer13.append(ruleSymbol.getId().substring(1));
                stringBuffer13.append(";");
                println(stringBuffer13.toString());
            }
            this.bSaveIndexCreated = false;
        }
        Grammar grammar3 = this.grammar;
        if (grammar3.debuggingOutput) {
            if (grammar3 instanceof ParserGrammar) {
                StringBuffer stringBuffer14 = new StringBuffer();
                stringBuffer14.append("fireEnterRule(");
                stringBuffer14.append(i10);
                stringBuffer14.append(",0);");
                println(stringBuffer14.toString());
            } else if (grammar3 instanceof LexerGrammar) {
                StringBuffer stringBuffer15 = new StringBuffer();
                stringBuffer15.append("fireEnterRule(");
                stringBuffer15.append(i10);
                stringBuffer15.append(",_ttype);");
                println(stringBuffer15.toString());
            }
        }
        Grammar grammar4 = this.grammar;
        if (grammar4.debuggingOutput || grammar4.traceRules) {
            println("try { // debugging");
            this.tabs++;
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(this.labeledElementASTType);
            stringBuffer16.append(" ");
            stringBuffer16.append(ruleSymbol.getId());
            stringBuffer16.append("_AST_in = (");
            stringBuffer16.append(this.labeledElementASTType);
            stringBuffer16.append(")_t;");
            println(stringBuffer16.toString());
        }
        if (this.grammar.buildAST) {
            println("returnAST = null;");
            println("ASTPair currentAST = new ASTPair();");
            StringBuffer stringBuffer17 = new StringBuffer();
            stringBuffer17.append(this.labeledElementASTType);
            stringBuffer17.append(" ");
            stringBuffer17.append(ruleSymbol.getId());
            stringBuffer17.append("_AST = null;");
            println(stringBuffer17.toString());
        }
        genBlockPreamble(block);
        genBlockInitAction(block);
        println("");
        ExceptionSpec findExceptionSpec = block.findExceptionSpec("");
        if (findExceptionSpec == null && !block.getDefaultErrorHandler()) {
            i11 = 1;
        } else {
            println("try {      // for error handling");
            i11 = 1;
            this.tabs++;
        }
        if (block.alternatives.size() == i11) {
            Alternative alternativeAt = block.getAlternativeAt(0);
            String str4 = alternativeAt.semPred;
            if (str4 != null) {
                genSemPred(str4, this.currentRule.line);
            }
            if (alternativeAt.synPred != null) {
                z12 = z13;
                str = "";
                str2 = "\");";
                this.antlrTool.warning("Syntactic predicate ignored for single alternative", this.grammar.getFilename(), alternativeAt.synPred.getLine(), alternativeAt.synPred.getColumn());
            } else {
                z12 = z13;
                str = "";
                str2 = "\");";
            }
            genAlt(alternativeAt, block);
        } else {
            z12 = z13;
            str = "";
            str2 = "\");";
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
            stringBuffer18.append(" ex)");
            println(stringBuffer18.toString());
            println("{");
            this.tabs++;
            if (this.grammar.hasSyntacticPredicate) {
                println("if (0 == inputState.guessing)");
                println("{");
                this.tabs++;
            }
            println("reportError(ex);");
            Grammar grammar5 = this.grammar;
            if (!(grammar5 instanceof TreeWalkerGrammar)) {
                String bitsetName = getBitsetName(markBitsetForGen(grammar5.theLLkAnalyzer.FOLLOW(1, block.endNode).fset));
                println("consume();");
                StringBuffer stringBuffer19 = new StringBuffer();
                stringBuffer19.append("consumeUntil(");
                stringBuffer19.append(bitsetName);
                stringBuffer19.append(");");
                println(stringBuffer19.toString());
                i12 = 1;
            } else {
                println("if (null != _t)");
                println("{");
                i12 = 1;
                this.tabs++;
                println("_t = _t.getNextSibling();");
                this.tabs--;
                println("}");
            }
            if (this.grammar.hasSyntacticPredicate) {
                this.tabs -= i12;
                println("}");
                println("else");
                println("{");
                this.tabs += i12;
                println("throw;");
                this.tabs -= i12;
                println("}");
            }
            this.tabs -= i12;
            println("}");
        }
        if (this.grammar.buildAST) {
            StringBuffer stringBuffer20 = new StringBuffer();
            stringBuffer20.append("returnAST = ");
            stringBuffer20.append(ruleSymbol.getId());
            stringBuffer20.append("_AST;");
            println(stringBuffer20.toString());
        }
        if (this.grammar instanceof TreeWalkerGrammar) {
            println("retTree_ = _t;");
        }
        if (block.getTestLiterals()) {
            if (ruleSymbol.access.equals("protected")) {
                genLiteralsTestForPartialToken();
            } else {
                genLiteralsTest();
            }
        }
        if (this.grammar instanceof LexerGrammar) {
            println("if (_createToken && (null == _token) && (_ttype != Token.SKIP))");
            println("{");
            this.tabs++;
            println("_token = makeToken(_ttype);");
            println("_token.setText(text.ToString(_begin, text.Length-_begin));");
            this.tabs--;
            println("}");
            println("returnToken_ = _token;");
        }
        if (block.returnAction != null) {
            StringBuffer stringBuffer21 = new StringBuffer();
            stringBuffer21.append("return ");
            stringBuffer21.append(extractIdOfAction(block.returnAction, block.getLine(), block.getColumn()));
            stringBuffer21.append(";");
            println(stringBuffer21.toString());
        }
        Grammar grammar6 = this.grammar;
        if (!grammar6.debuggingOutput && !grammar6.traceRules) {
            i13 = 1;
        } else {
            this.tabs--;
            println("}");
            println("finally");
            println("{ // debugging");
            this.tabs++;
            Grammar grammar7 = this.grammar;
            if (grammar7.debuggingOutput) {
                if (grammar7 instanceof ParserGrammar) {
                    StringBuffer stringBuffer22 = new StringBuffer();
                    stringBuffer22.append("fireExitRule(");
                    stringBuffer22.append(i10);
                    stringBuffer22.append(",0);");
                    println(stringBuffer22.toString());
                } else if (grammar7 instanceof LexerGrammar) {
                    StringBuffer stringBuffer23 = new StringBuffer();
                    stringBuffer23.append("fireExitRule(");
                    stringBuffer23.append(i10);
                    stringBuffer23.append(",_ttype);");
                    println(stringBuffer23.toString());
                }
            }
            Grammar grammar8 = this.grammar;
            if (grammar8.traceRules) {
                if (grammar8 instanceof TreeWalkerGrammar) {
                    StringBuffer stringBuffer24 = new StringBuffer();
                    stringBuffer24.append("traceOut(\"");
                    stringBuffer24.append(ruleSymbol.getId());
                    stringBuffer24.append("\",_t);");
                    println(stringBuffer24.toString());
                } else {
                    StringBuffer stringBuffer25 = new StringBuffer();
                    stringBuffer25.append("traceOut(\"");
                    stringBuffer25.append(ruleSymbol.getId());
                    stringBuffer25.append(str2);
                    println(stringBuffer25.toString());
                }
            }
            i13 = 1;
            this.tabs--;
            println("}");
        }
        this.tabs -= i13;
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
        println("private string[] _semPredNames = {");
        this.tabs++;
        while (elements.hasMoreElements()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\"");
            stringBuffer.append(elements.nextElement());
            stringBuffer.append("\",");
            println(stringBuffer.toString());
        }
        this.tabs--;
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
        stringBuffer2.append("bool synPredMatched");
        stringBuffer2.append(synPredBlock.f4235ID);
        stringBuffer2.append(" = false;");
        println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("if (");
        stringBuffer3.append(str);
        stringBuffer3.append(")");
        println(stringBuffer3.toString());
        println("{");
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
        stringBuffer7.append(")");
        println(stringBuffer7.toString());
        println("{");
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
        stringBuffer12.append(" )");
        println(stringBuffer12.toString());
        println("{");
    }

    protected void genTokenDefinitions(TokenManager tokenManager) {
        antlr.collections.impl.Vector vocabulary = tokenManager.getVocabulary();
        println("public const int EOF = 1;");
        println("public const int NULL_TREE_LOOKAHEAD = 3;");
        for (int i10 = 4; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str != null) {
                if (str.startsWith("\"")) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenManager.getTokenSymbol(str);
                    if (stringLiteralSymbol == null) {
                        Tool tool = this.antlrTool;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("String literal ");
                        stringBuffer.append(str);
                        stringBuffer.append(" not in symbol table");
                        tool.panic(stringBuffer.toString());
                    } else if (stringLiteralSymbol.label != null) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("public const int ");
                        stringBuffer2.append(stringLiteralSymbol.label);
                        stringBuffer2.append(" = ");
                        stringBuffer2.append(i10);
                        stringBuffer2.append(";");
                        println(stringBuffer2.toString());
                    } else {
                        String mangleLiteral = mangleLiteral(str);
                        if (mangleLiteral != null) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("public const int ");
                            stringBuffer3.append(mangleLiteral);
                            stringBuffer3.append(" = ");
                            stringBuffer3.append(i10);
                            stringBuffer3.append(";");
                            println(stringBuffer3.toString());
                            stringLiteralSymbol.label = mangleLiteral;
                        } else {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("// ");
                            stringBuffer4.append(str);
                            stringBuffer4.append(" = ");
                            stringBuffer4.append(i10);
                            println(stringBuffer4.toString());
                        }
                    }
                } else if (!str.startsWith(Operator.Operation.LESS_THAN)) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("public const int ");
                    stringBuffer5.append(str);
                    stringBuffer5.append(" = ");
                    stringBuffer5.append(i10);
                    stringBuffer5.append(";");
                    println(stringBuffer5.toString());
                }
            }
        }
        println("");
    }

    public void genTokenStrings() {
        println("");
        println("public static readonly string[] tokenNames_ = new string[] {");
        this.tabs++;
        antlr.collections.impl.Vector vocabulary = this.grammar.tokenManager.getVocabulary();
        for (int i10 = 0; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(Operator.Operation.LESS_THAN);
                stringBuffer.append(String.valueOf(i10));
                stringBuffer.append(Operator.Operation.GREATER_THAN);
                str = stringBuffer.toString();
            }
            if (!str.startsWith("\"") && !str.startsWith(Operator.Operation.LESS_THAN)) {
                TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str);
                if (tokenSymbol != null && tokenSymbol.getParaphrase() != null) {
                    str = StringUtils.stripFrontBack(tokenSymbol.getParaphrase(), "\"", "\"");
                }
            } else if (str.startsWith("\"")) {
                str = StringUtils.stripFrontBack(str, "\"", "\"");
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
        CSharpNameSpace cSharpNameSpace = nameSpace;
        if (cSharpNameSpace != null) {
            cSharpNameSpace.emitDeclarations(this.currentOutput);
        }
        this.tabs++;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("public class ");
        stringBuffer2.append(tokenManager.getName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileSuffix);
        println(stringBuffer2.toString());
        println("{");
        this.tabs++;
        genTokenDefinitions(tokenManager);
        this.tabs--;
        println("}");
        this.tabs--;
        CSharpNameSpace cSharpNameSpace2 = nameSpace;
        if (cSharpNameSpace2 != null) {
            cSharpNameSpace2.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
        exitIfError();
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(antlr.collections.impl.Vector vector) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CodeGenerator
    public String getBitsetName(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tokenSet_");
        stringBuffer.append(i10);
        stringBuffer.append("_");
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

    public String getTokenTypesClassName() {
        TokenManager tokenManager = this.grammar.tokenManager;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tokenManager.getName());
        stringBuffer.append(CodeGenerator.TokenTypesFileSuffix);
        return new String(stringBuffer.toString());
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
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.mapTreeId(java.lang.String, antlr.ActionTransInfo):java.lang.String");
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
                stringBuffer.append("(AST)");
                stringBuffer.append(str);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    public void setupOutput(String str) {
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(".cs");
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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("astFactory.create(");
        stringBuffer.append(str);
        stringBuffer.append(")");
        String stringBuffer2 = stringBuffer.toString();
        if (grammarAtom == null) {
            return getASTCreateString(str);
        }
        if (grammarAtom.getASTNodeType() != null) {
            TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(grammarAtom.getText());
            if (tokenSymbol != null && tokenSymbol.getASTNodeType() == grammarAtom.getASTNodeType()) {
                if (tokenSymbol.getASTNodeType() == null) {
                    return stringBuffer2;
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("(");
                stringBuffer3.append(tokenSymbol.getASTNodeType());
                stringBuffer3.append(") ");
                stringBuffer3.append(stringBuffer2);
                return stringBuffer3.toString();
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("(");
            stringBuffer4.append(grammarAtom.getASTNodeType());
            stringBuffer4.append(") astFactory.create(");
            stringBuffer4.append(str);
            stringBuffer4.append(", \"");
            stringBuffer4.append(grammarAtom.getASTNodeType());
            stringBuffer4.append("\")");
            return stringBuffer4.toString();
        }
        if (!this.usingCustomAST) {
            return stringBuffer2;
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("(");
        stringBuffer5.append(this.labeledElementASTType);
        stringBuffer5.append(") ");
        stringBuffer5.append(stringBuffer2);
        return stringBuffer5.toString();
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
            println("if (0==inputState.guessing)");
            println("{");
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
            stringBuffer4.append("if ( (null != ");
            stringBuffer4.append(actionTransInfo.refRuleRoot);
            stringBuffer4.append(") && (null != ");
            stringBuffer4.append(actionTransInfo.refRuleRoot);
            stringBuffer4.append(".getFirstChild()) )");
            println(stringBuffer4.toString());
            this.tabs++;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("currentAST.child = ");
            stringBuffer5.append(actionTransInfo.refRuleRoot);
            stringBuffer5.append(".getFirstChild();");
            println(stringBuffer5.toString());
            this.tabs--;
            println("else");
            this.tabs++;
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("currentAST.child = ");
            stringBuffer6.append(actionTransInfo.refRuleRoot);
            stringBuffer6.append(";");
            println(stringBuffer6.toString());
            this.tabs--;
            println("currentAST.advanceChildToEnd();");
        }
        if (this.grammar.hasSyntacticPredicate) {
            this.tabs--;
            println("}");
        }
    }

    public String getASTCreateString(String str) {
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("astFactory.create(");
        stringBuffer.append(str);
        stringBuffer.append(")");
        String stringBuffer2 = stringBuffer.toString();
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            str.substring(indexOf + 1, str.length()).indexOf(44);
            str = substring;
        }
        TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str);
        if (tokenSymbol != null && tokenSymbol.getASTNodeType() != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("(");
            stringBuffer3.append(tokenSymbol.getASTNodeType());
            stringBuffer3.append(") ");
            stringBuffer3.append(stringBuffer2);
            return stringBuffer3.toString();
        }
        if (!this.usingCustomAST) {
            return stringBuffer2;
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("(");
        stringBuffer4.append(this.labeledElementASTType);
        stringBuffer4.append(") ");
        stringBuffer4.append(stringBuffer2);
        return stringBuffer4.toString();
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
        this.tabs++;
        genBlockPreamble(alternativeBlock);
        genBlockInitAction(alternativeBlock);
        String str = this.currentASTResult;
        if (alternativeBlock.getLabel() != null) {
            this.currentASTResult = alternativeBlock.getLabel();
        }
        this.grammar.theLLkAnalyzer.deterministic(alternativeBlock);
        genBlockFinish(genCommonBlock(alternativeBlock, true), this.throwNoViable);
        this.tabs--;
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
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.gen(antlr.CharLiteralElement):void");
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
            println("_saveIndex = text.Length;");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("matchRange(");
        stringBuffer2.append(OctalToUnicode(charRangeElement.beginText));
        stringBuffer2.append(",");
        stringBuffer2.append(OctalToUnicode(charRangeElement.endText));
        stringBuffer2.append(");");
        println(stringBuffer2.toString());
        if (z10) {
            println("text.Length = _saveIndex;");
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(LexerGrammar lexerGrammar) {
        if (lexerGrammar.debuggingOutput) {
            this.semPreds = new antlr.collections.impl.Vector();
        }
        setGrammar(lexerGrammar);
        if (!(this.grammar instanceof LexerGrammar)) {
            this.antlrTool.panic("Internal error generating lexer");
        }
        genBody(lexerGrammar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.OneOrMoreBlock r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.gen(antlr.OneOrMoreBlock):void");
    }

    @Override // antlr.CodeGenerator
    public void gen(ParserGrammar parserGrammar) {
        if (parserGrammar.debuggingOutput) {
            this.semPreds = new antlr.collections.impl.Vector();
        }
        setGrammar(parserGrammar);
        if (!(this.grammar instanceof ParserGrammar)) {
            this.antlrTool.panic("Internal error generating parser");
        }
        genBody(parserGrammar);
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
                declareSaveIndexVariableIfNeeded();
                println("_saveIndex = text.Length;");
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
                declareSaveIndexVariableIfNeeded();
                println("text.Length = _saveIndex;");
            }
            if (this.syntacticPredLevel == 0) {
                Grammar grammar = this.grammar;
                boolean z10 = grammar.hasSyntacticPredicate && ((grammar.buildAST && ruleRefElement.getLabel() != null) || (this.genAST && ruleRefElement.getAutoGenType() == 1));
                if (z10) {
                    println("if (0 == inputState.guessing)");
                    println("{");
                    this.tabs++;
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
                    if (autoGenType != 1) {
                        if (autoGenType == 2) {
                            this.antlrTool.error("Internal: encountered ^ after rule reference");
                        }
                    } else if (this.usingCustomAST) {
                        println("astFactory.addASTChild(currentAST, (AST)returnAST);");
                    } else {
                        println("astFactory.addASTChild(currentAST, returnAST);");
                    }
                }
                if ((this.grammar instanceof LexerGrammar) && ruleRefElement.getLabel() != null) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append(ruleRefElement.getLabel());
                    stringBuffer7.append(" = returnToken_;");
                    println(stringBuffer7.toString());
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
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("Rule '");
        stringBuffer8.append(ruleRefElement.targetRule);
        stringBuffer8.append("' is not defined");
        tool3.error(stringBuffer8.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
    }

    public void genBody(ParserGrammar parserGrammar) {
        String stripFrontBack;
        setupOutput(this.grammar.getClassName());
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        CSharpNameSpace cSharpNameSpace = nameSpace;
        if (cSharpNameSpace != null) {
            cSharpNameSpace.emitDeclarations(this.currentOutput);
        }
        this.tabs++;
        println("// Generate the header common to all output files.");
        println("using System;");
        println("");
        println("using TokenBuffer              = antlr.TokenBuffer;");
        println("using TokenStreamException     = antlr.TokenStreamException;");
        println("using TokenStreamIOException   = antlr.TokenStreamIOException;");
        println("using ANTLRException           = antlr.ANTLRException;");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("using ");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(" = antlr.");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(";");
        println(stringBuffer.toString());
        println("using Token                    = antlr.Token;");
        println("using TokenStream              = antlr.TokenStream;");
        println("using RecognitionException     = antlr.RecognitionException;");
        println("using NoViableAltException     = antlr.NoViableAltException;");
        println("using MismatchedTokenException = antlr.MismatchedTokenException;");
        println("using SemanticException        = antlr.SemanticException;");
        println("using ParserSharedInputState   = antlr.ParserSharedInputState;");
        println("using BitSet                   = antlr.collections.impl.BitSet;");
        if (this.genAST) {
            println("using AST                      = antlr.collections.AST;");
            println("using ASTPair                  = antlr.ASTPair;");
            println("using ASTFactory               = antlr.ASTFactory;");
            println("using ASTArray                 = antlr.collections.impl.ASTArray;");
        }
        println(this.grammar.preambleAction.getText());
        String str = this.grammar.superClass;
        if (str == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("antlr.");
            stringBuffer2.append(this.grammar.getSuperClass());
            str = stringBuffer2.toString();
        }
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null) {
            print("public ");
        } else {
            String stripFrontBack2 = StringUtils.stripFrontBack(token.getText(), "\"", "\"");
            if (stripFrontBack2 == null) {
                print("public ");
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(stripFrontBack2);
                stringBuffer3.append(" ");
                print(stringBuffer3.toString());
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("class ");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append(" : ");
        stringBuffer4.append(str);
        println(stringBuffer4.toString());
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("              , ");
            stringBuffer5.append(stripFrontBack);
            print(stringBuffer5.toString());
        }
        println("{");
        this.tabs++;
        genTokenDefinitions(this.grammar.tokenManager);
        if (this.grammar.debuggingOutput) {
            println("private const string[] _ruleNames = {");
            this.tabs++;
            Enumeration elements = this.grammar.rules.elements();
            while (elements.hasMoreElements()) {
                GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
                if (grammarSymbol instanceof RuleSymbol) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("  \"");
                    stringBuffer6.append(((RuleSymbol) grammarSymbol).getId());
                    stringBuffer6.append("\",");
                    println(stringBuffer6.toString());
                }
            }
            this.tabs--;
            println("};");
        }
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        println("");
        println("protected void initialize()");
        println("{");
        this.tabs++;
        println("tokenNames = tokenNames_;");
        if (this.grammar.buildAST) {
            println("initializeFactory();");
        }
        if (this.grammar.debuggingOutput) {
            println("ruleNames  = _ruleNames;");
            println("semPredNames = _semPredNames;");
            println("setupDebugging(tokenBuf);");
        }
        this.tabs--;
        println("}");
        println("");
        println("");
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("protected ");
        stringBuffer7.append(this.grammar.getClassName());
        stringBuffer7.append("(TokenBuffer tokenBuf, int k) : base(tokenBuf, k)");
        println(stringBuffer7.toString());
        println("{");
        this.tabs++;
        println("initialize();");
        this.tabs--;
        println("}");
        println("");
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("public ");
        stringBuffer8.append(this.grammar.getClassName());
        stringBuffer8.append("(TokenBuffer tokenBuf) : this(tokenBuf,");
        stringBuffer8.append(this.grammar.maxk);
        stringBuffer8.append(")");
        println(stringBuffer8.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("protected ");
        stringBuffer9.append(this.grammar.getClassName());
        stringBuffer9.append("(TokenStream lexer, int k) : base(lexer,k)");
        println(stringBuffer9.toString());
        println("{");
        this.tabs++;
        println("initialize();");
        this.tabs--;
        println("}");
        println("");
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("public ");
        stringBuffer10.append(this.grammar.getClassName());
        stringBuffer10.append("(TokenStream lexer) : this(lexer,");
        stringBuffer10.append(this.grammar.maxk);
        stringBuffer10.append(")");
        println(stringBuffer10.toString());
        println("{");
        println("}");
        println("");
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("public ");
        stringBuffer11.append(this.grammar.getClassName());
        stringBuffer11.append("(ParserSharedInputState state) : base(state,");
        stringBuffer11.append(this.grammar.maxk);
        stringBuffer11.append(")");
        println(stringBuffer11.toString());
        println("{");
        this.tabs++;
        println("initialize();");
        this.tabs--;
        println("}");
        println("");
        this.astTypes = new Vector(100);
        Enumeration elements2 = this.grammar.rules.elements();
        int i10 = 0;
        while (elements2.hasMoreElements()) {
            GrammarSymbol grammarSymbol2 = (GrammarSymbol) elements2.nextElement();
            if (grammarSymbol2 instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol2;
                genRule(ruleSymbol, ruleSymbol.references.size() == 0, i10, this.grammar.tokenManager);
                i10++;
            }
            exitIfError();
        }
        if (this.usingCustomAST) {
            StringBuffer stringBuffer12 = new StringBuffer();
            stringBuffer12.append("public new ");
            stringBuffer12.append(this.labeledElementASTType);
            stringBuffer12.append(" getAST()");
            println(stringBuffer12.toString());
            println("{");
            this.tabs++;
            StringBuffer stringBuffer13 = new StringBuffer();
            stringBuffer13.append("return (");
            stringBuffer13.append(this.labeledElementASTType);
            stringBuffer13.append(") returnAST;");
            println(stringBuffer13.toString());
            this.tabs--;
            println("}");
            println("");
        }
        println("private void initializeFactory()");
        println("{");
        this.tabs++;
        if (this.grammar.buildAST) {
            println("if (astFactory == null)");
            println("{");
            this.tabs++;
            if (this.usingCustomAST) {
                StringBuffer stringBuffer14 = new StringBuffer();
                stringBuffer14.append("astFactory = new ASTFactory(\"");
                stringBuffer14.append(this.labeledElementASTType);
                stringBuffer14.append("\");");
                println(stringBuffer14.toString());
            } else {
                println("astFactory = new ASTFactory();");
            }
            this.tabs--;
            println("}");
            println("initializeASTFactory( astFactory );");
        }
        this.tabs--;
        println("}");
        genInitFactory(parserGrammar);
        genTokenStrings();
        genBitsets(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        if (this.grammar.debuggingOutput) {
            genSemPredMap();
        }
        println("");
        this.tabs--;
        println("}");
        this.tabs--;
        CSharpNameSpace cSharpNameSpace2 = nameSpace;
        if (cSharpNameSpace2 != null) {
            cSharpNameSpace2.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
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
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.gen(antlr.StringLiteralElement):void");
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
        stringBuffer2.append(OctalToUnicode(tokenRangeElement.beginText));
        stringBuffer2.append(",");
        stringBuffer2.append(OctalToUnicode(tokenRangeElement.endText));
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
            stringBuffer2.append(" = (ASTNULL == _t) ? null : (");
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
            println("if (null == _t) throw new MismatchedTokenException();");
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
        setGrammar(treeWalkerGrammar);
        if (!(this.grammar instanceof TreeWalkerGrammar)) {
            this.antlrTool.panic("Internal error generating tree-walker");
        }
        genBody(treeWalkerGrammar);
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
            println("if (null == _t) throw new MismatchedTokenException();");
        } else if (grammar instanceof LexerGrammar) {
            if ((grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                declareSaveIndexVariableIfNeeded();
                println("_saveIndex = text.Length;");
            }
            println("matchNot(EOF/*_CHAR*/);");
            if ((this.grammar instanceof LexerGrammar) && (!this.saveText || wildcardElement.getAutoGenType() == 3)) {
                declareSaveIndexVariableIfNeeded();
                println("text.Length = _saveIndex;");
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    @Override // antlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gen(antlr.ZeroOrMoreBlock r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CSharpCodeGenerator.gen(antlr.ZeroOrMoreBlock):void");
    }

    public void genBody(TreeWalkerGrammar treeWalkerGrammar) {
        String stripFrontBack;
        setupOutput(this.grammar.getClassName());
        this.genAST = this.grammar.buildAST;
        this.tabs = 0;
        genHeader();
        println(this.behavior.getHeaderAction(""));
        CSharpNameSpace cSharpNameSpace = nameSpace;
        if (cSharpNameSpace != null) {
            cSharpNameSpace.emitDeclarations(this.currentOutput);
        }
        this.tabs++;
        println("// Generate header specific to the tree-parser CSharp file");
        println("using System;");
        println("");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("using ");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(" = antlr.");
        stringBuffer.append(this.grammar.getSuperClass());
        stringBuffer.append(";");
        println(stringBuffer.toString());
        println("using Token                    = antlr.Token;");
        println("using AST                      = antlr.collections.AST;");
        println("using RecognitionException     = antlr.RecognitionException;");
        println("using ANTLRException           = antlr.ANTLRException;");
        println("using NoViableAltException     = antlr.NoViableAltException;");
        println("using MismatchedTokenException = antlr.MismatchedTokenException;");
        println("using SemanticException        = antlr.SemanticException;");
        println("using BitSet                   = antlr.collections.impl.BitSet;");
        println("using ASTPair                  = antlr.ASTPair;");
        println("using ASTFactory               = antlr.ASTFactory;");
        println("using ASTArray                 = antlr.collections.impl.ASTArray;");
        println(this.grammar.preambleAction.getText());
        String str = this.grammar.superClass;
        if (str == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("antlr.");
            stringBuffer2.append(this.grammar.getSuperClass());
            str = stringBuffer2.toString();
        }
        println("");
        String str2 = this.grammar.comment;
        if (str2 != null) {
            _println(str2);
        }
        Token token = (Token) this.grammar.options.get("classHeaderPrefix");
        if (token == null) {
            print("public ");
        } else {
            String stripFrontBack2 = StringUtils.stripFrontBack(token.getText(), "\"", "\"");
            if (stripFrontBack2 == null) {
                print("public ");
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(stripFrontBack2);
                stringBuffer3.append(" ");
                print(stringBuffer3.toString());
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("class ");
        stringBuffer4.append(this.grammar.getClassName());
        stringBuffer4.append(" : ");
        stringBuffer4.append(str);
        println(stringBuffer4.toString());
        Token token2 = (Token) this.grammar.options.get("classHeaderSuffix");
        if (token2 != null && (stripFrontBack = StringUtils.stripFrontBack(token2.getText(), "\"", "\"")) != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("              , ");
            stringBuffer5.append(stripFrontBack);
            print(stringBuffer5.toString());
        }
        println("{");
        this.tabs++;
        genTokenDefinitions(this.grammar.tokenManager);
        print(processActionForSpecialSymbols(this.grammar.classMemberAction.getText(), this.grammar.classMemberAction.getLine(), this.currentRule, null));
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("public ");
        stringBuffer6.append(this.grammar.getClassName());
        stringBuffer6.append("()");
        println(stringBuffer6.toString());
        println("{");
        this.tabs++;
        println("tokenNames = tokenNames_;");
        this.tabs--;
        println("}");
        println("");
        this.astTypes = new Vector();
        Enumeration elements = this.grammar.rules.elements();
        int i10 = 0;
        while (elements.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                RuleSymbol ruleSymbol = (RuleSymbol) grammarSymbol;
                genRule(ruleSymbol, ruleSymbol.references.size() == 0, i10, this.grammar.tokenManager);
                i10++;
            }
            exitIfError();
        }
        if (this.usingCustomAST) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("public new ");
            stringBuffer7.append(this.labeledElementASTType);
            stringBuffer7.append(" getAST()");
            println(stringBuffer7.toString());
            println("{");
            this.tabs++;
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("return (");
            stringBuffer8.append(this.labeledElementASTType);
            stringBuffer8.append(") returnAST;");
            println(stringBuffer8.toString());
            this.tabs--;
            println("}");
            println("");
        }
        genInitFactory(this.grammar);
        genTokenStrings();
        genBitsets(this.bitsetsUsed, this.grammar.tokenManager.maxTokenType());
        this.tabs--;
        println("}");
        println("");
        this.tabs--;
        CSharpNameSpace cSharpNameSpace2 = nameSpace;
        if (cSharpNameSpace2 != null) {
            cSharpNameSpace2.emitClosures(this.currentOutput);
        }
        this.currentOutput.close();
        this.currentOutput = null;
    }
}
