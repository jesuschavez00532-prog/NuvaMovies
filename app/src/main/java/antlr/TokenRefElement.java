package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TokenRefElement extends GrammarAtom {
    public TokenRefElement(Grammar grammar, Token token, boolean z10, int i10) {
        super(grammar, token, i10);
        this.not = z10;
        TokenSymbol tokenSymbol = this.grammar.tokenManager.getTokenSymbol(this.atomText);
        if (tokenSymbol == null) {
            Tool tool = grammar.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Undefined token symbol: ");
            stringBuffer.append(this.atomText);
            tool.error(stringBuffer.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
        } else {
            this.tokenType = tokenSymbol.getTokenType();
            setASTNodeType(tokenSymbol.getASTNodeType());
        }
        this.line = token.getLine();
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
