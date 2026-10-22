package antlr;

import antlr.collections.impl.Vector;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class RuleBlock extends AlternativeBlock {
    protected String argAction;
    protected Lookahead[] cache;
    protected boolean defaultErrorHandler;
    protected RuleEndElement endNode;
    Hashtable exceptionSpecs;
    protected String ignoreRule;
    Vector labeledElements;
    protected boolean[] lock;
    protected String returnAction;
    protected String ruleName;
    protected boolean testLiterals;
    protected String throwsSpec;

    public RuleBlock(Grammar grammar, String str) {
        super(grammar);
        this.argAction = null;
        this.throwsSpec = null;
        this.returnAction = null;
        this.testLiterals = false;
        this.defaultErrorHandler = true;
        this.ignoreRule = null;
        this.ruleName = str;
        this.labeledElements = new Vector();
        this.cache = new Lookahead[grammar.maxk + 1];
        this.exceptionSpecs = new Hashtable();
        setAutoGen(grammar instanceof ParserGrammar);
    }

    public void addExceptionSpec(ExceptionSpec exceptionSpec) {
        String text;
        if (findExceptionSpec(exceptionSpec.label) != null) {
            if (exceptionSpec.label != null) {
                Tool tool = this.grammar.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Rule '");
                stringBuffer.append(this.ruleName);
                stringBuffer.append("' already has an exception handler for label: ");
                stringBuffer.append(exceptionSpec.label);
                tool.error(stringBuffer.toString());
                return;
            }
            Tool tool2 = this.grammar.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Rule '");
            stringBuffer2.append(this.ruleName);
            stringBuffer2.append("' already has an exception handler");
            tool2.error(stringBuffer2.toString());
            return;
        }
        Hashtable hashtable = this.exceptionSpecs;
        Token token = exceptionSpec.label;
        if (token == null) {
            text = "";
        } else {
            text = token.getText();
        }
        hashtable.put(text, exceptionSpec);
    }

    public ExceptionSpec findExceptionSpec(Token token) {
        return (ExceptionSpec) this.exceptionSpecs.get(token == null ? "" : token.getText());
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    public boolean getDefaultErrorHandler() {
        return this.defaultErrorHandler;
    }

    public RuleEndElement getEndElement() {
        return this.endNode;
    }

    public String getIgnoreRule() {
        return this.ignoreRule;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public boolean getTestLiterals() {
        return this.testLiterals;
    }

    public boolean isLexerAutoGenRule() {
        return this.ruleName.equals("nextToken");
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.AlternativeBlock
    public void prepareForAnalysis() {
        super.prepareForAnalysis();
        this.lock = new boolean[this.grammar.maxk + 1];
    }

    public void setDefaultErrorHandler(boolean z10) {
        this.defaultErrorHandler = z10;
    }

    public void setEndElement(RuleEndElement ruleEndElement) {
        this.endNode = ruleEndElement;
    }

    @Override // antlr.AlternativeBlock
    public void setOption(Token token, Token token2) {
        if (token.getText().equals("defaultErrorHandler")) {
            if (token2.getText().equals("true")) {
                this.defaultErrorHandler = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.defaultErrorHandler = false;
                return;
            } else {
                Grammar grammar = this.grammar;
                grammar.antlrTool.error("Value for defaultErrorHandler must be true or false", grammar.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        if (token.getText().equals("testLiterals")) {
            Grammar grammar2 = this.grammar;
            if (!(grammar2 instanceof LexerGrammar)) {
                grammar2.antlrTool.error("testLiterals option only valid for lexer rules", grammar2.getFilename(), token.getLine(), token.getColumn());
                return;
            }
            if (token2.getText().equals("true")) {
                this.testLiterals = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.testLiterals = false;
                return;
            } else {
                Grammar grammar3 = this.grammar;
                grammar3.antlrTool.error("Value for testLiterals must be true or false", grammar3.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        if (token.getText().equals("ignore")) {
            Grammar grammar4 = this.grammar;
            if (!(grammar4 instanceof LexerGrammar)) {
                grammar4.antlrTool.error("ignore option only valid for lexer rules", grammar4.getFilename(), token.getLine(), token.getColumn());
                return;
            } else {
                this.ignoreRule = token2.getText();
                return;
            }
        }
        if (token.getText().equals("paraphrase")) {
            Grammar grammar5 = this.grammar;
            if (!(grammar5 instanceof LexerGrammar)) {
                grammar5.antlrTool.error("paraphrase option only valid for lexer rules", grammar5.getFilename(), token.getLine(), token.getColumn());
                return;
            }
            TokenSymbol tokenSymbol = grammar5.tokenManager.getTokenSymbol(this.ruleName);
            if (tokenSymbol == null) {
                Tool tool = this.grammar.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("cannot find token associated with rule ");
                stringBuffer.append(this.ruleName);
                tool.panic(stringBuffer.toString());
            }
            tokenSymbol.setParaphrase(token2.getText());
            return;
        }
        if (token.getText().equals("generateAmbigWarnings")) {
            if (token2.getText().equals("true")) {
                this.generateAmbigWarnings = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.generateAmbigWarnings = false;
                return;
            } else {
                Grammar grammar6 = this.grammar;
                grammar6.antlrTool.error("Value for generateAmbigWarnings must be true or false", grammar6.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        Tool tool2 = this.grammar.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Invalid rule option: ");
        stringBuffer2.append(token.getText());
        tool2.error(stringBuffer2.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public String toString() {
        Lookahead[] lookaheadArr = this.endNode.cache;
        int i10 = this.grammar.maxk;
        String str = " FOLLOW={";
        boolean z10 = true;
        for (int i11 = 1; i11 <= i10; i11++) {
            if (lookaheadArr[i11] != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(lookaheadArr[i11].toString(",", this.grammar.tokenManager.getVocabulary()));
                str = stringBuffer.toString();
                z10 = false;
                if (i11 < i10 && lookaheadArr[i11 + 1] != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append(";");
                    str = stringBuffer2.toString();
                }
            }
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append("}");
        String stringBuffer4 = stringBuffer3.toString();
        if (z10) {
            stringBuffer4 = "";
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(this.ruleName);
        stringBuffer5.append(": ");
        stringBuffer5.append(super.toString());
        stringBuffer5.append(" ;");
        stringBuffer5.append(stringBuffer4);
        return stringBuffer5.toString();
    }

    public ExceptionSpec findExceptionSpec(String str) {
        Hashtable hashtable = this.exceptionSpecs;
        if (str == null) {
            str = "";
        }
        return (ExceptionSpec) hashtable.get(str);
    }

    public RuleBlock(Grammar grammar, String str, int i10, boolean z10) {
        this(grammar, str);
        this.line = i10;
        setAutoGen(z10);
    }
}
