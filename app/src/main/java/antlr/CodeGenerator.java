package antlr;

import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class CodeGenerator {
    protected static final int BITSET_OPTIMIZE_INIT_THRESHOLD = 8;
    protected static final int DEFAULT_BITSET_TEST_THRESHOLD = 4;
    protected static final int DEFAULT_MAKE_SWITCH_THRESHOLD = 2;
    private static boolean OLD_ACTION_TRANSLATOR = true;
    public static String TokenTypesFileExt = ".txt";
    public static String TokenTypesFileSuffix = "TokenTypes";
    protected LLkGrammarAnalyzer analyzer;
    protected Tool antlrTool;
    protected DefineGrammarSymbols behavior;
    protected Vector bitsetsUsed;
    protected CharFormatter charFormatter;
    protected transient PrintWriter currentOutput;
    protected int tabs = 0;
    protected Grammar grammar = null;
    protected boolean DEBUG_CODE_GENERATOR = false;
    protected int makeSwitchThreshold = 2;
    protected int bitsetTestThreshold = 4;

    public static String decodeLexerRuleName(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(1, str.length());
    }

    public static boolean elementsAreRange(int[] iArr) {
        if (iArr.length == 0) {
            return false;
        }
        int i10 = iArr[0];
        int i11 = iArr[iArr.length - 1];
        if (iArr.length <= 2 || (i11 - i10) + 1 > iArr.length) {
            return false;
        }
        int i12 = i10 + 1;
        for (int i13 = 1; i13 < iArr.length - 1; i13++) {
            if (i12 != iArr[i13]) {
                return false;
            }
            i12++;
        }
        return true;
    }

    public static String encodeLexerRuleName(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("m");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private void reset() {
        this.tabs = 0;
        this.bitsetsUsed = new Vector();
        this.currentOutput = null;
        this.grammar = null;
        this.DEBUG_CODE_GENERATOR = false;
        this.makeSwitchThreshold = 2;
        this.bitsetTestThreshold = 4;
    }

    public static String reverseLexerRuleName(String str) {
        return str.substring(1, str.length());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void _print(String str) {
        if (str != null) {
            this.currentOutput.print(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void _printAction(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            r0 = 0
            r1 = 0
        L5:
            int r2 = r8.length()
            if (r1 >= r2) goto L18
            char r2 = r8.charAt(r1)
            boolean r2 = java.lang.Character.isSpaceChar(r2)
            if (r2 == 0) goto L18
            int r1 = r1 + 1
            goto L5
        L18:
            int r2 = r8.length()
            r3 = 1
            int r2 = r2 - r3
        L1e:
            if (r2 <= r1) goto L2d
            char r4 = r8.charAt(r2)
            boolean r4 = java.lang.Character.isSpaceChar(r4)
            if (r4 == 0) goto L2d
            int r2 = r2 + (-1)
            goto L1e
        L2d:
            if (r1 > r2) goto L68
            char r4 = r8.charAt(r1)
            int r1 = r1 + 1
            r5 = 10
            if (r4 == r5) goto L4e
            r6 = 13
            if (r4 == r6) goto L44
            java.io.PrintWriter r5 = r7.currentOutput
            r5.print(r4)
            r4 = 0
            goto L4f
        L44:
            if (r1 > r2) goto L4e
            char r4 = r8.charAt(r1)
            if (r4 != r5) goto L4e
            int r1 = r1 + 1
        L4e:
            r4 = 1
        L4f:
            if (r4 == 0) goto L2d
            java.io.PrintWriter r4 = r7.currentOutput
            r4.println()
            r7.printTabs()
        L59:
            if (r1 > r2) goto L2d
            char r4 = r8.charAt(r1)
            boolean r4 = java.lang.Character.isSpaceChar(r4)
            if (r4 == 0) goto L2d
            int r1 = r1 + 1
            goto L59
        L68:
            java.io.PrintWriter r8 = r7.currentOutput
            r8.println()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.CodeGenerator._printAction(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void _println(String str) {
        if (str != null) {
            this.currentOutput.println(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String extractIdOfAction(Token token) {
        return extractIdOfAction(token.getText(), token.getLine(), token.getColumn());
    }

    protected String extractTypeOfAction(Token token) {
        return extractTypeOfAction(token.getText(), token.getLine(), token.getColumn());
    }

    public abstract void gen();

    public abstract void gen(ActionElement actionElement);

    public abstract void gen(AlternativeBlock alternativeBlock);

    public abstract void gen(BlockEndElement blockEndElement);

    public abstract void gen(CharLiteralElement charLiteralElement);

    public abstract void gen(CharRangeElement charRangeElement);

    public abstract void gen(LexerGrammar lexerGrammar);

    public abstract void gen(OneOrMoreBlock oneOrMoreBlock);

    public abstract void gen(ParserGrammar parserGrammar);

    public abstract void gen(RuleRefElement ruleRefElement);

    public abstract void gen(StringLiteralElement stringLiteralElement);

    public abstract void gen(TokenRangeElement tokenRangeElement);

    public abstract void gen(TokenRefElement tokenRefElement);

    public abstract void gen(TreeElement treeElement);

    public abstract void gen(TreeWalkerGrammar treeWalkerGrammar);

    public abstract void gen(WildcardElement wildcardElement);

    public abstract void gen(ZeroOrMoreBlock zeroOrMoreBlock);

    /* JADX INFO: Access modifiers changed from: protected */
    public void genTokenInterchange(TokenManager tokenManager) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tokenManager.getName());
        stringBuffer.append(TokenTypesFileSuffix);
        stringBuffer.append(TokenTypesFileExt);
        String stringBuffer2 = stringBuffer.toString();
        this.currentOutput = this.antlrTool.openOutputFile(stringBuffer2);
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("// $ANTLR ");
        stringBuffer3.append(Tool.version);
        stringBuffer3.append(": ");
        Tool tool = this.antlrTool;
        stringBuffer3.append(tool.fileMinusPath(tool.grammarFile));
        stringBuffer3.append(" -> ");
        stringBuffer3.append(stringBuffer2);
        stringBuffer3.append("$");
        println(stringBuffer3.toString());
        this.tabs = 0;
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(tokenManager.getName());
        stringBuffer4.append("    // output token vocab name");
        println(stringBuffer4.toString());
        Vector vocabulary = tokenManager.getVocabulary();
        for (int i10 = 4; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (this.DEBUG_CODE_GENERATOR) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("gen persistence file entry for: ");
                stringBuffer5.append(str);
                printStream.println(stringBuffer5.toString());
            }
            if (str != null && !str.startsWith(Operator.Operation.LESS_THAN)) {
                if (str.startsWith("\"")) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) tokenManager.getTokenSymbol(str);
                    if (stringLiteralSymbol != null && stringLiteralSymbol.label != null) {
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append(stringLiteralSymbol.label);
                        stringBuffer6.append(Operator.Operation.EQUALS);
                        print(stringBuffer6.toString());
                    }
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append(str);
                    stringBuffer7.append(Operator.Operation.EQUALS);
                    stringBuffer7.append(i10);
                    println(stringBuffer7.toString());
                } else {
                    print(str);
                    TokenSymbol tokenSymbol = tokenManager.getTokenSymbol(str);
                    if (tokenSymbol == null) {
                        Tool tool2 = this.antlrTool;
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("undefined token symbol: ");
                        stringBuffer8.append(str);
                        tool2.warning(stringBuffer8.toString());
                    } else if (tokenSymbol.getParaphrase() != null) {
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("(");
                        stringBuffer9.append(tokenSymbol.getParaphrase());
                        stringBuffer9.append(")");
                        print(stringBuffer9.toString());
                    }
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append(Operator.Operation.EQUALS);
                    stringBuffer10.append(i10);
                    println(stringBuffer10.toString());
                }
            }
        }
        this.currentOutput.close();
        this.currentOutput = null;
    }

    public abstract String getASTCreateString(GrammarAtom grammarAtom, String str);

    public abstract String getASTCreateString(Vector vector);

    /* JADX INFO: Access modifiers changed from: protected */
    public String getBitsetName(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("_tokenSet_");
        stringBuffer.append(i10);
        return stringBuffer.toString();
    }

    public String getFIRSTBitSet(String str, int i10) {
        GrammarSymbol symbol = this.grammar.getSymbol(str);
        if (!(symbol instanceof RuleSymbol)) {
            return null;
        }
        return getBitsetName(markBitsetForGen(this.grammar.theLLkAnalyzer.look(i10, ((RuleSymbol) symbol).getBlock()).fset));
    }

    public String getFOLLOWBitSet(String str, int i10) {
        GrammarSymbol symbol = this.grammar.getSymbol(str);
        if (!(symbol instanceof RuleSymbol)) {
            return null;
        }
        return getBitsetName(markBitsetForGen(this.grammar.theLLkAnalyzer.FOLLOW(i10, ((RuleSymbol) symbol).getBlock().endNode).fset));
    }

    public abstract String mapTreeId(String str, ActionTransInfo actionTransInfo);

    /* JADX INFO: Access modifiers changed from: protected */
    public int markBitsetForGen(BitSet bitSet) {
        for (int i10 = 0; i10 < this.bitsetsUsed.size(); i10++) {
            if (bitSet.equals((BitSet) this.bitsetsUsed.elementAt(i10))) {
                return i10;
            }
        }
        this.bitsetsUsed.appendElement(bitSet.clone());
        return this.bitsetsUsed.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void print(String str) {
        if (str != null) {
            printTabs();
            this.currentOutput.print(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void printAction(String str) {
        if (str != null) {
            printTabs();
            _printAction(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void printTabs() {
        for (int i10 = 1; i10 <= this.tabs; i10++) {
            this.currentOutput.print("\t");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void println(String str) {
        if (str != null) {
            printTabs();
            this.currentOutput.println(str);
        }
    }

    protected abstract String processActionForSpecialSymbols(String str, int i10, RuleBlock ruleBlock, ActionTransInfo actionTransInfo);

    public String processStringForASTConstructor(String str) {
        return str;
    }

    protected String removeAssignmentFromDeclaration(String str) {
        if (str.indexOf(61) >= 0) {
            return str.substring(0, str.indexOf(61)).trim();
        }
        return str;
    }

    public void setAnalyzer(LLkGrammarAnalyzer lLkGrammarAnalyzer) {
        this.analyzer = lLkGrammarAnalyzer;
    }

    public void setBehavior(DefineGrammarSymbols defineGrammarSymbols) {
        this.behavior = defineGrammarSymbols;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setGrammar(Grammar grammar) {
        reset();
        this.grammar = grammar;
        if (grammar.hasOption("codeGenMakeSwitchThreshold")) {
            try {
                this.makeSwitchThreshold = this.grammar.getIntegerOption("codeGenMakeSwitchThreshold");
            } catch (NumberFormatException unused) {
                Token option = this.grammar.getOption("codeGenMakeSwitchThreshold");
                this.antlrTool.error("option 'codeGenMakeSwitchThreshold' must be an integer", this.grammar.getClassName(), option.getLine(), option.getColumn());
            }
        }
        if (this.grammar.hasOption("codeGenBitsetTestThreshold")) {
            try {
                this.bitsetTestThreshold = this.grammar.getIntegerOption("codeGenBitsetTestThreshold");
            } catch (NumberFormatException unused2) {
                Token option2 = this.grammar.getOption("codeGenBitsetTestThreshold");
                this.antlrTool.error("option 'codeGenBitsetTestThreshold' must be an integer", this.grammar.getClassName(), option2.getLine(), option2.getColumn());
            }
        }
        if (this.grammar.hasOption("codeGenDebug")) {
            Token option3 = this.grammar.getOption("codeGenDebug");
            if (option3.getText().equals("true")) {
                this.DEBUG_CODE_GENERATOR = true;
            } else if (option3.getText().equals("false")) {
                this.DEBUG_CODE_GENERATOR = false;
            } else {
                this.antlrTool.error("option 'codeGenDebug' must be true or false", this.grammar.getClassName(), option3.getLine(), option3.getColumn());
            }
        }
    }

    public void setTool(Tool tool) {
        this.antlrTool = tool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String extractIdOfAction(String str, int i10, int i11) {
        String removeAssignmentFromDeclaration = removeAssignmentFromDeclaration(str);
        for (int length = removeAssignmentFromDeclaration.length() - 2; length >= 0; length--) {
            if (!Character.isLetterOrDigit(removeAssignmentFromDeclaration.charAt(length)) && removeAssignmentFromDeclaration.charAt(length) != '_') {
                return removeAssignmentFromDeclaration.substring(length + 1);
            }
        }
        this.antlrTool.warning("Ill-formed action", this.grammar.getFilename(), i10, i11);
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String extractTypeOfAction(String str, int i10, int i11) {
        String removeAssignmentFromDeclaration = removeAssignmentFromDeclaration(str);
        for (int length = removeAssignmentFromDeclaration.length() - 2; length >= 0; length--) {
            if (!Character.isLetterOrDigit(removeAssignmentFromDeclaration.charAt(length)) && removeAssignmentFromDeclaration.charAt(length) != '_') {
                return removeAssignmentFromDeclaration.substring(0, length + 1);
            }
        }
        this.antlrTool.warning("Ill-formed action", this.grammar.getFilename(), i10, i11);
        return "";
    }
}
