package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CharLiteralElement extends GrammarAtom {
    public CharLiteralElement(LexerGrammar lexerGrammar, Token token, boolean z10, int i10) {
        super(lexerGrammar, token, 1);
        int i11 = ANTLRLexer.tokenTypeForCharLiteral(token.getText());
        this.tokenType = i11;
        lexerGrammar.charVocabulary.add(i11);
        this.line = token.getLine();
        this.not = z10;
        this.autoGenType = i10;
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
