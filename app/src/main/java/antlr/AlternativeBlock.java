package antlr;

import antlr.collections.impl.Vector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlternativeBlock extends AlternativeElement {
    protected static int nblks;

    /* renamed from: ID */
    protected int f4235ID;
    protected Vector alternatives;
    protected int alti;
    protected int altj;
    protected int analysisAlt;
    protected boolean doAutoGen;
    protected boolean generateAmbigWarnings;
    boolean greedy;
    boolean greedySet;
    protected boolean hasASynPred;
    protected boolean hasAnAction;
    protected String initAction;
    protected String label;
    boolean not;
    protected boolean warnWhenFollowAmbig;

    public AlternativeBlock(Grammar grammar) {
        super(grammar);
        this.initAction = null;
        this.hasAnAction = false;
        this.hasASynPred = false;
        this.f4235ID = 0;
        this.not = false;
        this.greedy = true;
        this.greedySet = false;
        this.doAutoGen = true;
        this.warnWhenFollowAmbig = true;
        this.generateAmbigWarnings = true;
        this.alternatives = new Vector(5);
        this.not = false;
        int i10 = nblks + 1;
        nblks = i10;
        this.f4235ID = i10;
    }

    public void addAlternative(Alternative alternative) {
        this.alternatives.appendElement(alternative);
    }

    @Override // antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    public Alternative getAlternativeAt(int i10) {
        return (Alternative) this.alternatives.elementAt(i10);
    }

    public Vector getAlternatives() {
        return this.alternatives;
    }

    public boolean getAutoGen() {
        return this.doAutoGen;
    }

    public String getInitAction() {
        return this.initAction;
    }

    @Override // antlr.AlternativeElement
    public String getLabel() {
        return this.label;
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    public void prepareForAnalysis() {
        for (int i10 = 0; i10 < this.alternatives.size(); i10++) {
            Alternative alternative = (Alternative) this.alternatives.elementAt(i10);
            alternative.cache = new Lookahead[this.grammar.maxk + 1];
            alternative.lookaheadDepth = -1;
        }
    }

    public void removeTrackingOfRuleRefs(Grammar grammar) {
        for (int i10 = 0; i10 < this.alternatives.size(); i10++) {
            for (AlternativeElement alternativeElement = getAlternativeAt(i10).head; alternativeElement != null; alternativeElement = alternativeElement.next) {
                if (alternativeElement instanceof RuleRefElement) {
                    RuleRefElement ruleRefElement = (RuleRefElement) alternativeElement;
                    RuleSymbol ruleSymbol = (RuleSymbol) grammar.getSymbol(ruleRefElement.targetRule);
                    if (ruleSymbol == null) {
                        Tool tool = this.grammar.antlrTool;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("rule ");
                        stringBuffer.append(ruleRefElement.targetRule);
                        stringBuffer.append(" referenced in (...)=>, but not defined");
                        tool.error(stringBuffer.toString());
                    } else {
                        ruleSymbol.references.removeElement(ruleRefElement);
                    }
                } else if (alternativeElement instanceof AlternativeBlock) {
                    ((AlternativeBlock) alternativeElement).removeTrackingOfRuleRefs(grammar);
                }
            }
        }
    }

    public void setAlternatives(Vector vector) {
        this.alternatives = vector;
    }

    public void setAutoGen(boolean z10) {
        this.doAutoGen = z10;
    }

    public void setInitAction(String str) {
        this.initAction = str;
    }

    @Override // antlr.AlternativeElement
    public void setLabel(String str) {
        this.label = str;
    }

    public void setOption(Token token, Token token2) {
        if (token.getText().equals("warnWhenFollowAmbig")) {
            if (token2.getText().equals("true")) {
                this.warnWhenFollowAmbig = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.warnWhenFollowAmbig = false;
                return;
            } else {
                Grammar grammar = this.grammar;
                grammar.antlrTool.error("Value for warnWhenFollowAmbig must be true or false", grammar.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        if (token.getText().equals("generateAmbigWarnings")) {
            if (token2.getText().equals("true")) {
                this.generateAmbigWarnings = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.generateAmbigWarnings = false;
                return;
            } else {
                Grammar grammar2 = this.grammar;
                grammar2.antlrTool.error("Value for generateAmbigWarnings must be true or false", grammar2.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        if (token.getText().equals("greedy")) {
            if (token2.getText().equals("true")) {
                this.greedy = true;
                this.greedySet = true;
                return;
            } else if (token2.getText().equals("false")) {
                this.greedy = false;
                this.greedySet = true;
                return;
            } else {
                Grammar grammar3 = this.grammar;
                grammar3.antlrTool.error("Value for greedy must be true or false", grammar3.getFilename(), token.getLine(), token.getColumn());
                return;
            }
        }
        Tool tool = this.grammar.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid subrule option: ");
        stringBuffer.append(token.getText());
        tool.error(stringBuffer.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
    }

    @Override // antlr.GrammarElement
    public String toString() {
        String str = " (";
        if (this.initAction != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" (");
            stringBuffer.append(this.initAction);
            str = stringBuffer.toString();
        }
        for (int i10 = 0; i10 < this.alternatives.size(); i10++) {
            Alternative alternativeAt = getAlternativeAt(i10);
            Lookahead[] lookaheadArr = alternativeAt.cache;
            int i11 = alternativeAt.lookaheadDepth;
            if (i11 != -1) {
                if (i11 == Integer.MAX_VALUE) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("{?}:");
                    str = stringBuffer2.toString();
                } else {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(str);
                    stringBuffer3.append(" {");
                    String stringBuffer4 = stringBuffer3.toString();
                    for (int i12 = 1; i12 <= i11; i12++) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append(stringBuffer4);
                        stringBuffer5.append(lookaheadArr[i12].toString(",", this.grammar.tokenManager.getVocabulary()));
                        stringBuffer4 = stringBuffer5.toString();
                        if (i12 < i11 && lookaheadArr[i12 + 1] != null) {
                            StringBuffer stringBuffer6 = new StringBuffer();
                            stringBuffer6.append(stringBuffer4);
                            stringBuffer6.append(";");
                            stringBuffer4 = stringBuffer6.toString();
                        }
                    }
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append(stringBuffer4);
                    stringBuffer7.append("}:");
                    str = stringBuffer7.toString();
                }
            }
            String str2 = alternativeAt.semPred;
            if (str2 != null) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(str);
                stringBuffer8.append(str2);
                str = stringBuffer8.toString();
            }
            for (AlternativeElement alternativeElement = alternativeAt.head; alternativeElement != null; alternativeElement = alternativeElement.next) {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append(str);
                stringBuffer9.append(alternativeElement);
                str = stringBuffer9.toString();
            }
            if (i10 < this.alternatives.size() - 1) {
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append(str);
                stringBuffer10.append(" |");
                str = stringBuffer10.toString();
            }
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append(str);
        stringBuffer11.append(" )");
        return stringBuffer11.toString();
    }

    public AlternativeBlock(Grammar grammar, Token token, boolean z10) {
        super(grammar, token);
        this.initAction = null;
        this.hasAnAction = false;
        this.hasASynPred = false;
        this.f4235ID = 0;
        this.not = false;
        this.greedy = true;
        this.greedySet = false;
        this.doAutoGen = true;
        this.warnWhenFollowAmbig = true;
        this.generateAmbigWarnings = true;
        this.alternatives = new Vector(5);
        this.not = z10;
        int i10 = nblks + 1;
        nblks = i10;
        this.f4235ID = i10;
    }
}
