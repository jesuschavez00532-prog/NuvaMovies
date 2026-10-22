package antlr;

/* loaded from: classes.dex */
public interface LLkGrammarAnalyzer extends GrammarAnalyzer {
    Lookahead FOLLOW(int i10, RuleEndElement ruleEndElement);

    boolean deterministic(AlternativeBlock alternativeBlock);

    boolean deterministic(OneOrMoreBlock oneOrMoreBlock);

    boolean deterministic(ZeroOrMoreBlock zeroOrMoreBlock);

    Lookahead look(int i10, ActionElement actionElement);

    Lookahead look(int i10, AlternativeBlock alternativeBlock);

    Lookahead look(int i10, BlockEndElement blockEndElement);

    Lookahead look(int i10, CharLiteralElement charLiteralElement);

    Lookahead look(int i10, CharRangeElement charRangeElement);

    Lookahead look(int i10, GrammarAtom grammarAtom);

    Lookahead look(int i10, OneOrMoreBlock oneOrMoreBlock);

    Lookahead look(int i10, RuleBlock ruleBlock);

    Lookahead look(int i10, RuleEndElement ruleEndElement);

    Lookahead look(int i10, RuleRefElement ruleRefElement);

    Lookahead look(int i10, StringLiteralElement stringLiteralElement);

    Lookahead look(int i10, SynPredBlock synPredBlock);

    Lookahead look(int i10, TokenRangeElement tokenRangeElement);

    Lookahead look(int i10, TreeElement treeElement);

    Lookahead look(int i10, WildcardElement wildcardElement);

    Lookahead look(int i10, ZeroOrMoreBlock zeroOrMoreBlock);

    Lookahead look(int i10, String str);

    void setGrammar(Grammar grammar);

    boolean subruleCanBeInverted(AlternativeBlock alternativeBlock, boolean z10);
}
