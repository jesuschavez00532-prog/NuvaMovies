package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StringLiteralElement extends GrammarAtom {
    protected String processedAtomText;

    public StringLiteralElement(Grammar grammar, Token token, int i10) {
        super(grammar, token, i10);
        int i11;
        boolean z10 = grammar instanceof LexerGrammar;
        if (!z10) {
            TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(this.atomText);
            if (tokenSymbol == null) {
                Tool tool = grammar.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Undefined literal: ");
                stringBuffer.append(this.atomText);
                tool.error(stringBuffer.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
            } else {
                this.tokenType = tokenSymbol.getTokenType();
            }
        }
        this.line = token.getLine();
        this.processedAtomText = new String();
        int i12 = 1;
        while (i12 < this.atomText.length() - 1) {
            char charAt = this.atomText.charAt(i12);
            if (charAt == '\\' && (i11 = i12 + 1) < this.atomText.length() - 1) {
                charAt = this.atomText.charAt(i11);
                if (charAt != 'n') {
                    if (charAt != 'r') {
                        if (charAt == 't') {
                            charAt = '\t';
                        }
                    } else {
                        charAt = '\r';
                    }
                } else {
                    charAt = '\n';
                }
                i12 = i11;
            }
            if (z10) {
                ((LexerGrammar) grammar).charVocabulary.add(charAt);
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.processedAtomText);
            stringBuffer2.append(charAt);
            this.processedAtomText = stringBuffer2.toString();
            i12++;
        }
    }

    @Override // antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }
}
