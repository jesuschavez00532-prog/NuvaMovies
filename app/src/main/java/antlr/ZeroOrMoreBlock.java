package antlr;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZeroOrMoreBlock extends BlockWithImpliedExitPath {
    public ZeroOrMoreBlock(Grammar grammar) {
        super(grammar);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(Operator.Operation.MULTIPLY);
        return stringBuffer.toString();
    }

    public ZeroOrMoreBlock(Grammar grammar, Token token) {
        super(grammar, token);
    }
}
