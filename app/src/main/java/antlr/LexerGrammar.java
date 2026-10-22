package antlr;

import antlr.collections.impl.BitSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LexerGrammar extends Grammar {
    protected boolean caseSensitive;
    protected boolean caseSensitiveLiterals;
    protected BitSet charVocabulary;
    protected boolean filterMode;
    protected String filterRule;
    protected boolean testLiterals;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LexerGrammar(String str, Tool tool, String str2) {
        super(str, tool, str2);
        this.testLiterals = true;
        this.caseSensitiveLiterals = true;
        this.caseSensitive = true;
        this.filterMode = false;
        this.filterRule = null;
        this.charVocabulary = new BitSet();
        this.defaultErrorHandler = false;
    }

    @Override // antlr.Grammar
    public void generate() {
        this.generator.gen(this);
    }

    @Override // antlr.Grammar
    public String getSuperClass() {
        if (this.debuggingOutput) {
            return "debug.DebuggingCharScanner";
        }
        return "CharScanner";
    }

    public boolean getTestLiterals() {
        return this.testLiterals;
    }

    @Override // antlr.Grammar
    public void processArguments(String[] strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("-trace")) {
                this.traceRules = true;
                this.antlrTool.setArgOK(i10);
            } else if (strArr[i10].equals("-traceLexer")) {
                this.traceRules = true;
                this.antlrTool.setArgOK(i10);
            } else if (strArr[i10].equals("-debug")) {
                this.debuggingOutput = true;
                this.antlrTool.setArgOK(i10);
            }
        }
    }

    public void setCharVocabulary(BitSet bitSet) {
        this.charVocabulary = bitSet;
    }

    @Override // antlr.Grammar
    public boolean setOption(String str, Token token) {
        String text = token.getText();
        if (str.equals("buildAST")) {
            this.antlrTool.warning("buildAST option is not valid for lexer", getFilename(), token.getLine(), token.getColumn());
            return true;
        }
        if (str.equals("testLiterals")) {
            if (text.equals("true")) {
                this.testLiterals = true;
            } else if (text.equals("false")) {
                this.testLiterals = false;
            } else {
                this.antlrTool.warning("testLiterals option must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("interactive")) {
            if (text.equals("true")) {
                this.interactive = true;
            } else if (text.equals("false")) {
                this.interactive = false;
            } else {
                this.antlrTool.error("interactive option must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("caseSensitive")) {
            if (text.equals("true")) {
                this.caseSensitive = true;
            } else if (text.equals("false")) {
                this.caseSensitive = false;
            } else {
                this.antlrTool.warning("caseSensitive option must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("caseSensitiveLiterals")) {
            if (text.equals("true")) {
                this.caseSensitiveLiterals = true;
            } else if (text.equals("false")) {
                this.caseSensitiveLiterals = false;
            } else {
                this.antlrTool.warning("caseSensitiveLiterals option must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("filter")) {
            if (text.equals("true")) {
                this.filterMode = true;
            } else if (text.equals("false")) {
                this.filterMode = false;
            } else if (token.getType() == 24) {
                this.filterMode = true;
                this.filterRule = text;
            } else {
                this.antlrTool.warning("filter option must be true, false, or a lexer rule name", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("longestPossible")) {
            this.antlrTool.warning("longestPossible option has been deprecated; ignoring it...", getFilename(), token.getLine(), token.getColumn());
            return true;
        }
        if (super.setOption(str, token)) {
            return true;
        }
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid option: ");
        stringBuffer.append(str);
        tool.error(stringBuffer.toString(), getFilename(), token.getLine(), token.getColumn());
        return false;
    }
}
