package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ParserGrammar extends Grammar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ParserGrammar(String str, Tool tool, String str2) {
        super(str, tool, str2);
    }

    @Override // antlr.Grammar
    public void generate() {
        this.generator.gen(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.Grammar
    public String getSuperClass() {
        if (this.debuggingOutput) {
            return "debug.LLkDebuggingParser";
        }
        return "LLkParser";
    }

    @Override // antlr.Grammar
    public void processArguments(String[] strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("-trace")) {
                this.traceRules = true;
                this.antlrTool.setArgOK(i10);
            } else if (strArr[i10].equals("-traceParser")) {
                this.traceRules = true;
                this.antlrTool.setArgOK(i10);
            } else if (strArr[i10].equals("-debug")) {
                this.debuggingOutput = true;
                this.antlrTool.setArgOK(i10);
            }
        }
    }

    @Override // antlr.Grammar
    public boolean setOption(String str, Token token) {
        String text = token.getText();
        if (str.equals("buildAST")) {
            if (text.equals("true")) {
                this.buildAST = true;
            } else if (text.equals("false")) {
                this.buildAST = false;
            } else {
                this.antlrTool.error("buildAST option must be true or false", getFilename(), token.getLine(), token.getColumn());
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
        if (str.equals("ASTLabelType")) {
            super.setOption(str, token);
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
