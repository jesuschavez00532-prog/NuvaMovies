package antlr;

import antlr.collections.impl.BitSet;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class LLkAnalyzer implements LLkGrammarAnalyzer {
    private AlternativeBlock currentBlock;
    protected Tool tool;
    public boolean DEBUG_ANALYZER = false;
    protected Grammar grammar = null;
    protected boolean lexicalAnalysis = false;
    CharFormatter charFormatter = new JavaCharFormatter();

    public LLkAnalyzer(Tool tool) {
        this.tool = null;
        this.tool = tool;
    }

    private Lookahead getAltLookahead(AlternativeBlock alternativeBlock, int i10, int i11) {
        Alternative alternativeAt = alternativeBlock.getAlternativeAt(i10);
        AlternativeElement alternativeElement = alternativeAt.head;
        Lookahead lookahead = alternativeAt.cache[i11];
        if (lookahead == null) {
            Lookahead look = alternativeElement.look(i11);
            alternativeAt.cache[i11] = look;
            return look;
        }
        return lookahead;
    }

    public static boolean lookaheadEquivForApproxAndFullAnalysis(Lookahead[] lookaheadArr, int i10) {
        for (int i11 = 1; i11 <= i10 - 1; i11++) {
            if (lookaheadArr[i11].fset.degree() > 1) {
                return false;
            }
        }
        return true;
    }

    private void removeCompetingPredictionSets(BitSet bitSet, AlternativeElement alternativeElement) {
        AlternativeBlock alternativeBlock = this.currentBlock;
        AlternativeElement alternativeElement2 = alternativeBlock.getAlternativeAt(alternativeBlock.analysisAlt).head;
        if (alternativeElement2 instanceof TreeElement) {
            if (((TreeElement) alternativeElement2).root != alternativeElement) {
                return;
            }
        } else if (alternativeElement != alternativeElement2) {
            return;
        }
        int i10 = 0;
        while (true) {
            AlternativeBlock alternativeBlock2 = this.currentBlock;
            if (i10 < alternativeBlock2.analysisAlt) {
                bitSet.subtractInPlace(alternativeBlock2.getAlternativeAt(i10).head.look(1).fset);
                i10++;
            } else {
                return;
            }
        }
    }

    private void removeCompetingPredictionSetsFromWildcard(Lookahead[] lookaheadArr, AlternativeElement alternativeElement, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            int i12 = 0;
            while (true) {
                AlternativeBlock alternativeBlock = this.currentBlock;
                if (i12 < alternativeBlock.analysisAlt) {
                    lookaheadArr[i11].fset.subtractInPlace(alternativeBlock.getAlternativeAt(i12).head.look(i11).fset);
                    i12++;
                }
            }
        }
    }

    private void reset() {
        this.grammar = null;
        this.DEBUG_ANALYZER = false;
        this.currentBlock = null;
        this.lexicalAnalysis = false;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead FOLLOW(int i10, RuleEndElement ruleEndElement) {
        String ruleName;
        Object obj;
        RuleBlock ruleBlock = (RuleBlock) ruleEndElement.block;
        if (this.lexicalAnalysis) {
            ruleName = CodeGenerator.encodeLexerRuleName(ruleBlock.getRuleName());
        } else {
            ruleName = ruleBlock.getRuleName();
        }
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("FOLLOW(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(ruleName);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        boolean[] zArr = ruleEndElement.lock;
        if (zArr[i10]) {
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("FOLLOW cycle to ");
                stringBuffer2.append(ruleName);
                printStream2.println(stringBuffer2.toString());
            }
            return new Lookahead(ruleName);
        }
        if (ruleEndElement.cache[i10] != null) {
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("cache entry FOLLOW(");
                stringBuffer3.append(i10);
                stringBuffer3.append(") for ");
                stringBuffer3.append(ruleName);
                stringBuffer3.append(": ");
                stringBuffer3.append(ruleEndElement.cache[i10].toString(",", this.charFormatter, this.grammar));
                printStream3.println(stringBuffer3.toString());
            }
            Lookahead lookahead = ruleEndElement.cache[i10];
            String str = lookahead.cycle;
            if (str == null) {
                return (Lookahead) lookahead.clone();
            }
            RuleEndElement ruleEndElement2 = ((RuleSymbol) this.grammar.getSymbol(str)).getBlock().endNode;
            if (ruleEndElement2.cache[i10] == null) {
                return (Lookahead) ruleEndElement.cache[i10].clone();
            }
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream4 = System.out;
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("combining FOLLOW(");
                stringBuffer4.append(i10);
                stringBuffer4.append(") for ");
                stringBuffer4.append(ruleName);
                stringBuffer4.append(": from ");
                stringBuffer4.append(ruleEndElement.cache[i10].toString(",", this.charFormatter, this.grammar));
                stringBuffer4.append(" with FOLLOW for ");
                stringBuffer4.append(((RuleBlock) ruleEndElement2.block).getRuleName());
                stringBuffer4.append(": ");
                stringBuffer4.append(ruleEndElement2.cache[i10].toString(",", this.charFormatter, this.grammar));
                printStream4.println(stringBuffer4.toString());
            }
            Lookahead lookahead2 = ruleEndElement2.cache[i10];
            if (lookahead2.cycle == null) {
                ruleEndElement.cache[i10].combineWith(lookahead2);
                ruleEndElement.cache[i10].cycle = null;
            } else {
                Lookahead FOLLOW = FOLLOW(i10, ruleEndElement2);
                ruleEndElement.cache[i10].combineWith(FOLLOW);
                ruleEndElement.cache[i10].cycle = FOLLOW.cycle;
            }
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream5 = System.out;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("saving FOLLOW(");
                stringBuffer5.append(i10);
                stringBuffer5.append(") for ");
                stringBuffer5.append(ruleName);
                stringBuffer5.append(": from ");
                stringBuffer5.append(ruleEndElement.cache[i10].toString(",", this.charFormatter, this.grammar));
                printStream5.println(stringBuffer5.toString());
            }
            return (Lookahead) ruleEndElement.cache[i10].clone();
        }
        zArr[i10] = true;
        Lookahead lookahead3 = new Lookahead();
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(ruleName);
        for (int i11 = 0; i11 < ruleSymbol.numReferences(); i11++) {
            RuleRefElement reference = ruleSymbol.getReference(i11);
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream6 = System.out;
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("next[");
                stringBuffer6.append(ruleName);
                stringBuffer6.append("] is ");
                stringBuffer6.append(reference.next.toString());
                printStream6.println(stringBuffer6.toString());
            }
            Lookahead look = reference.next.look(i10);
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream7 = System.out;
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("FIRST of next[");
                stringBuffer7.append(ruleName);
                stringBuffer7.append("] ptr is ");
                stringBuffer7.append(look.toString());
                printStream7.println(stringBuffer7.toString());
            }
            String str2 = look.cycle;
            if (str2 != null && str2.equals(ruleName)) {
                obj = null;
                look.cycle = null;
            } else {
                obj = null;
            }
            lookahead3.combineWith(look);
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream8 = System.out;
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("combined FOLLOW[");
                stringBuffer8.append(ruleName);
                stringBuffer8.append("] is ");
                stringBuffer8.append(lookahead3.toString());
                printStream8.println(stringBuffer8.toString());
            }
        }
        ruleEndElement.lock[i10] = false;
        if (lookahead3.fset.nil() && lookahead3.cycle == null) {
            Grammar grammar = this.grammar;
            if (grammar instanceof TreeWalkerGrammar) {
                lookahead3.fset.add(3);
            } else if (grammar instanceof LexerGrammar) {
                lookahead3.setEpsilon();
            } else {
                lookahead3.fset.add(1);
            }
        }
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream9 = System.out;
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append("saving FOLLOW(");
            stringBuffer9.append(i10);
            stringBuffer9.append(") for ");
            stringBuffer9.append(ruleName);
            stringBuffer9.append(": ");
            stringBuffer9.append(lookahead3.toString(",", this.charFormatter, this.grammar));
            printStream9.println(stringBuffer9.toString());
        }
        ruleEndElement.cache[i10] = (Lookahead) lookahead3.clone();
        return lookahead3;
    }

    protected boolean altUsesWildcardDefault(Alternative alternative) {
        AlternativeElement alternativeElement = alternative.head;
        if ((alternativeElement instanceof TreeElement) && (((TreeElement) alternativeElement).root instanceof WildcardElement)) {
            return true;
        }
        if ((alternativeElement instanceof WildcardElement) && (alternativeElement.next instanceof BlockEndElement)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0201, code lost:
    
        if ((r4.head instanceof antlr.BlockEndElement) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020b, code lost:
    
        if ((r1 instanceof antlr.BlockEndElement) == false) goto L54;
     */
    @Override // antlr.LLkGrammarAnalyzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean deterministic(antlr.AlternativeBlock r18) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.LLkAnalyzer.deterministic(antlr.AlternativeBlock):boolean");
    }

    public boolean deterministicImpliedPath(BlockWithImpliedExitPath blockWithImpliedExitPath) {
        boolean z10;
        int size = blockWithImpliedExitPath.getAlternatives().size();
        this.currentBlock.altj = -1;
        if (this.DEBUG_ANALYZER) {
            System.out.println("deterministicImpliedPath");
        }
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            Alternative alternativeAt = blockWithImpliedExitPath.getAlternativeAt(i10);
            if (alternativeAt.head instanceof BlockEndElement) {
                this.tool.warning("empty alternative makes no sense in (...)* or (...)+", this.grammar.getFilename(), blockWithImpliedExitPath.getLine(), blockWithImpliedExitPath.getColumn());
            }
            Lookahead[] lookaheadArr = new Lookahead[this.grammar.maxk + 1];
            int i11 = 1;
            do {
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream = System.out;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("checking depth ");
                    stringBuffer.append(i11);
                    stringBuffer.append(Operator.Operation.LESS_THAN_OR_EQUALS);
                    stringBuffer.append(this.grammar.maxk);
                    printStream.println(stringBuffer.toString());
                }
                Lookahead look = blockWithImpliedExitPath.next.look(i11);
                blockWithImpliedExitPath.exitCache[i11] = look;
                this.currentBlock.alti = i10;
                Lookahead altLookahead = getAltLookahead(blockWithImpliedExitPath, i10, i11);
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream2 = System.out;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("follow is ");
                    stringBuffer2.append(look.toString(",", this.charFormatter, this.grammar));
                    printStream2.println(stringBuffer2.toString());
                }
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream3 = System.out;
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("p is ");
                    stringBuffer3.append(altLookahead.toString(",", this.charFormatter, this.grammar));
                    printStream3.println(stringBuffer3.toString());
                }
                lookaheadArr[i11] = look.intersection(altLookahead);
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream4 = System.out;
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("intersection at depth ");
                    stringBuffer4.append(i11);
                    stringBuffer4.append(" is ");
                    stringBuffer4.append(lookaheadArr[i11]);
                    printStream4.println(stringBuffer4.toString());
                }
                if (!lookaheadArr[i11].nil()) {
                    i11++;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
            } while (i11 <= this.grammar.maxk);
            if (z10) {
                alternativeAt.lookaheadDepth = Integer.MAX_VALUE;
                blockWithImpliedExitPath.exitLookaheadDepth = Integer.MAX_VALUE;
                Alternative alternativeAt2 = blockWithImpliedExitPath.getAlternativeAt(this.currentBlock.alti);
                if (blockWithImpliedExitPath.warnWhenFollowAmbig && blockWithImpliedExitPath.generateAmbigWarnings) {
                    boolean z12 = blockWithImpliedExitPath.greedy;
                    if (z12 && blockWithImpliedExitPath.greedySet && !(alternativeAt2.head instanceof BlockEndElement)) {
                        if (this.DEBUG_ANALYZER) {
                            System.out.println("greedy loop");
                        }
                    } else if (!z12 && !(alternativeAt2.head instanceof BlockEndElement)) {
                        if (this.DEBUG_ANALYZER) {
                            System.out.println("nongreedy loop");
                        }
                        if (!lookaheadEquivForApproxAndFullAnalysis(blockWithImpliedExitPath.exitCache, this.grammar.maxk)) {
                            this.tool.warning(new String[]{"nongreedy block may exit incorrectly due", "\tto limitations of linear approximate lookahead (first k-1 sets", "\tin lookahead not singleton)."}, this.grammar.getFilename(), blockWithImpliedExitPath.getLine(), blockWithImpliedExitPath.getColumn());
                        }
                    } else {
                        ToolErrorHandler toolErrorHandler = this.tool.errorHandler;
                        Grammar grammar = this.grammar;
                        toolErrorHandler.warnAltExitAmbiguity(grammar, blockWithImpliedExitPath, this.lexicalAnalysis, grammar.maxk, lookaheadArr, i10);
                    }
                }
                z11 = false;
            } else {
                alternativeAt.lookaheadDepth = Math.max(alternativeAt.lookaheadDepth, i11);
                blockWithImpliedExitPath.exitLookaheadDepth = Math.max(blockWithImpliedExitPath.exitLookaheadDepth, i11);
            }
        }
        return z11;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, ActionElement actionElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookAction(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(actionElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return actionElement.next.look(i10);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public void setGrammar(Grammar grammar) {
        if (this.grammar != null) {
            reset();
        }
        this.grammar = grammar;
        this.lexicalAnalysis = grammar instanceof LexerGrammar;
        this.DEBUG_ANALYZER = grammar.analyzerDebug;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public boolean subruleCanBeInverted(AlternativeBlock alternativeBlock, boolean z10) {
        if ((alternativeBlock instanceof ZeroOrMoreBlock) || (alternativeBlock instanceof OneOrMoreBlock) || (alternativeBlock instanceof SynPredBlock) || alternativeBlock.alternatives.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < alternativeBlock.alternatives.size(); i10++) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(i10);
            if (alternativeAt.synPred == null && alternativeAt.semPred == null && alternativeAt.exceptionSpec == null) {
                AlternativeElement alternativeElement = alternativeAt.head;
                if (((alternativeElement instanceof CharLiteralElement) || (alternativeElement instanceof TokenRefElement) || (alternativeElement instanceof CharRangeElement) || (alternativeElement instanceof TokenRangeElement) || ((alternativeElement instanceof StringLiteralElement) && !z10)) && (alternativeElement.next instanceof BlockEndElement) && alternativeElement.getAutoGenType() == 1) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, AlternativeBlock alternativeBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookAltBlk(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(alternativeBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        AlternativeBlock alternativeBlock2 = this.currentBlock;
        this.currentBlock = alternativeBlock;
        Lookahead lookahead = new Lookahead();
        for (int i11 = 0; i11 < alternativeBlock.alternatives.size(); i11++) {
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("alt ");
                stringBuffer2.append(i11);
                stringBuffer2.append(" of ");
                stringBuffer2.append(alternativeBlock);
                printStream2.println(stringBuffer2.toString());
            }
            this.currentBlock.analysisAlt = i11;
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(i11);
            AlternativeElement alternativeElement = alternativeAt.head;
            if (this.DEBUG_ANALYZER && alternativeElement == alternativeAt.tail) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("alt ");
                stringBuffer3.append(i11);
                stringBuffer3.append(" is empty");
                printStream3.println(stringBuffer3.toString());
            }
            lookahead.combineWith(alternativeElement.look(i10));
        }
        if (i10 == 1 && alternativeBlock.not && subruleCanBeInverted(alternativeBlock, this.lexicalAnalysis)) {
            if (this.lexicalAnalysis) {
                BitSet bitSet = (BitSet) ((LexerGrammar) this.grammar).charVocabulary.clone();
                for (int i12 : lookahead.fset.toArray()) {
                    bitSet.remove(i12);
                }
                lookahead.fset = bitSet;
            } else {
                lookahead.fset.notInPlace(4, this.grammar.tokenManager.maxTokenType());
            }
        }
        this.currentBlock = alternativeBlock2;
        return lookahead;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, BlockEndElement blockEndElement) {
        Lookahead look;
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookBlockEnd(");
            stringBuffer.append(i10);
            stringBuffer.append(", ");
            stringBuffer.append(blockEndElement.block);
            stringBuffer.append("); lock is ");
            stringBuffer.append(blockEndElement.lock[i10]);
            printStream.println(stringBuffer.toString());
        }
        boolean[] zArr = blockEndElement.lock;
        if (zArr[i10]) {
            return new Lookahead();
        }
        AlternativeBlock alternativeBlock = blockEndElement.block;
        if (!(alternativeBlock instanceof ZeroOrMoreBlock) && !(alternativeBlock instanceof OneOrMoreBlock)) {
            look = new Lookahead();
        } else {
            zArr[i10] = true;
            look = look(i10, alternativeBlock);
            blockEndElement.lock[i10] = false;
        }
        AlternativeBlock alternativeBlock2 = blockEndElement.block;
        if (alternativeBlock2 instanceof TreeElement) {
            look.combineWith(Lookahead.m4818of(3));
        } else if (alternativeBlock2 instanceof SynPredBlock) {
            look.setEpsilon();
        } else {
            look.combineWith(alternativeBlock2.next.look(i10));
        }
        return look;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, CharLiteralElement charLiteralElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookCharLiteral(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(charLiteralElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i10 > 1) {
            return charLiteralElement.next.look(i10 - 1);
        }
        if (this.lexicalAnalysis) {
            if (charLiteralElement.not) {
                BitSet bitSet = (BitSet) ((LexerGrammar) this.grammar).charVocabulary.clone();
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream2 = System.out;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("charVocab is ");
                    stringBuffer2.append(bitSet.toString());
                    printStream2.println(stringBuffer2.toString());
                }
                removeCompetingPredictionSets(bitSet, charLiteralElement);
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream3 = System.out;
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("charVocab after removal of prior alt lookahead ");
                    stringBuffer3.append(bitSet.toString());
                    printStream3.println(stringBuffer3.toString());
                }
                bitSet.clear(charLiteralElement.getType());
                return new Lookahead(bitSet);
            }
            return Lookahead.m4818of(charLiteralElement.getType());
        }
        this.tool.panic("Character literal reference found in parser");
        return Lookahead.m4818of(charLiteralElement.getType());
    }

    @Override // antlr.LLkGrammarAnalyzer
    public boolean deterministic(OneOrMoreBlock oneOrMoreBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("deterministic(...)+(");
            stringBuffer.append(oneOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        AlternativeBlock alternativeBlock = this.currentBlock;
        this.currentBlock = oneOrMoreBlock;
        boolean deterministic = deterministic((AlternativeBlock) oneOrMoreBlock);
        boolean deterministicImpliedPath = deterministicImpliedPath(oneOrMoreBlock);
        this.currentBlock = alternativeBlock;
        return deterministicImpliedPath && deterministic;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public boolean deterministic(ZeroOrMoreBlock zeroOrMoreBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("deterministic(...)*(");
            stringBuffer.append(zeroOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        AlternativeBlock alternativeBlock = this.currentBlock;
        this.currentBlock = zeroOrMoreBlock;
        boolean deterministic = deterministic((AlternativeBlock) zeroOrMoreBlock);
        boolean deterministicImpliedPath = deterministicImpliedPath(zeroOrMoreBlock);
        this.currentBlock = alternativeBlock;
        return deterministicImpliedPath && deterministic;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, CharRangeElement charRangeElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookCharRange(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(charRangeElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i10 > 1) {
            return charRangeElement.next.look(i10 - 1);
        }
        BitSet m4822of = BitSet.m4822of(charRangeElement.begin);
        for (int i11 = charRangeElement.begin + 1; i11 <= charRangeElement.end; i11++) {
            m4822of.add(i11);
        }
        return new Lookahead(m4822of);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, GrammarAtom grammarAtom) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(grammarAtom);
            stringBuffer.append("[");
            stringBuffer.append(grammarAtom.getType());
            stringBuffer.append("])");
            printStream.println(stringBuffer.toString());
        }
        if (this.lexicalAnalysis) {
            this.tool.panic("token reference found in lexer");
        }
        if (i10 > 1) {
            return grammarAtom.next.look(i10 - 1);
        }
        Lookahead m4818of = Lookahead.m4818of(grammarAtom.getType());
        if (grammarAtom.not) {
            m4818of.fset.notInPlace(4, this.grammar.tokenManager.maxTokenType());
            removeCompetingPredictionSets(m4818of.fset, grammarAtom);
        }
        return m4818of;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, OneOrMoreBlock oneOrMoreBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look+");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(oneOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return look(i10, (AlternativeBlock) oneOrMoreBlock);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, RuleBlock ruleBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleBlk(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(ruleBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return look(i10, (AlternativeBlock) ruleBlock);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, RuleEndElement ruleEndElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleBlockEnd(");
            stringBuffer.append(i10);
            stringBuffer.append("); noFOLLOW=");
            stringBuffer.append(ruleEndElement.noFOLLOW);
            stringBuffer.append("; lock is ");
            stringBuffer.append(ruleEndElement.lock[i10]);
            printStream.println(stringBuffer.toString());
        }
        if (ruleEndElement.noFOLLOW) {
            Lookahead lookahead = new Lookahead();
            lookahead.setEpsilon();
            lookahead.epsilonDepth = BitSet.m4822of(i10);
            return lookahead;
        }
        return FOLLOW(i10, ruleEndElement);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, RuleRefElement ruleRefElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleRef(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(ruleRefElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(ruleRefElement.targetRule);
        if (ruleSymbol != null && ruleSymbol.defined) {
            RuleEndElement ruleEndElement = ruleSymbol.getBlock().endNode;
            boolean z10 = ruleEndElement.noFOLLOW;
            ruleEndElement.noFOLLOW = true;
            Lookahead look = look(i10, ruleRefElement.targetRule);
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("back from rule ref to ");
                stringBuffer2.append(ruleRefElement.targetRule);
                printStream2.println(stringBuffer2.toString());
            }
            ruleEndElement.noFOLLOW = z10;
            if (look.cycle != null) {
                Tool tool = this.tool;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("infinite recursion to rule ");
                stringBuffer3.append(look.cycle);
                stringBuffer3.append(" from rule ");
                stringBuffer3.append(ruleRefElement.enclosingRuleName);
                tool.error(stringBuffer3.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
            }
            if (look.containsEpsilon()) {
                if (this.DEBUG_ANALYZER) {
                    PrintStream printStream3 = System.out;
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("rule ref to ");
                    stringBuffer4.append(ruleRefElement.targetRule);
                    stringBuffer4.append(" has eps, depth: ");
                    stringBuffer4.append(look.epsilonDepth);
                    printStream3.println(stringBuffer4.toString());
                }
                look.resetEpsilon();
                int[] array = look.epsilonDepth.toArray();
                look.epsilonDepth = null;
                for (int i11 : array) {
                    look.combineWith(ruleRefElement.next.look(i10 - (i10 - i11)));
                }
            }
            return look;
        }
        Tool tool2 = this.tool;
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("no definition of rule ");
        stringBuffer5.append(ruleRefElement.targetRule);
        tool2.error(stringBuffer5.toString(), this.grammar.getFilename(), ruleRefElement.getLine(), ruleRefElement.getColumn());
        return new Lookahead();
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, StringLiteralElement stringLiteralElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookStringLiteral(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(stringLiteralElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (this.lexicalAnalysis) {
            if (i10 > stringLiteralElement.processedAtomText.length()) {
                return stringLiteralElement.next.look(i10 - stringLiteralElement.processedAtomText.length());
            }
            return Lookahead.m4818of(stringLiteralElement.processedAtomText.charAt(i10 - 1));
        }
        if (i10 > 1) {
            return stringLiteralElement.next.look(i10 - 1);
        }
        Lookahead m4818of = Lookahead.m4818of(stringLiteralElement.getType());
        if (stringLiteralElement.not) {
            m4818of.fset.notInPlace(4, this.grammar.tokenManager.maxTokenType());
        }
        return m4818of;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, SynPredBlock synPredBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look=>(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(synPredBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return synPredBlock.next.look(i10);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, TokenRangeElement tokenRangeElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookTokenRange(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(tokenRangeElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i10 > 1) {
            return tokenRangeElement.next.look(i10 - 1);
        }
        BitSet m4822of = BitSet.m4822of(tokenRangeElement.begin);
        for (int i11 = tokenRangeElement.begin + 1; i11 <= tokenRangeElement.end; i11++) {
            m4822of.add(i11);
        }
        return new Lookahead(m4822of);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, TreeElement treeElement) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(treeElement.root);
            stringBuffer.append("[");
            stringBuffer.append(treeElement.root.getType());
            stringBuffer.append("])");
            printStream.println(stringBuffer.toString());
        }
        if (i10 > 1) {
            return treeElement.next.look(i10 - 1);
        }
        GrammarAtom grammarAtom = treeElement.root;
        if (grammarAtom instanceof WildcardElement) {
            return grammarAtom.look(1);
        }
        Lookahead m4818of = Lookahead.m4818of(grammarAtom.getType());
        if (!treeElement.root.not) {
            return m4818of;
        }
        m4818of.fset.notInPlace(4, this.grammar.tokenManager.maxTokenType());
        return m4818of;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, WildcardElement wildcardElement) {
        BitSet bitSet;
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(wildcardElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i10 > 1) {
            return wildcardElement.next.look(i10 - 1);
        }
        if (this.lexicalAnalysis) {
            bitSet = (BitSet) ((LexerGrammar) this.grammar).charVocabulary.clone();
        } else {
            BitSet bitSet2 = new BitSet(1);
            bitSet2.notInPlace(4, this.grammar.tokenManager.maxTokenType());
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("look(");
                stringBuffer2.append(i10);
                stringBuffer2.append(",");
                stringBuffer2.append(wildcardElement);
                stringBuffer2.append(") after not: ");
                stringBuffer2.append(bitSet2);
                printStream2.println(stringBuffer2.toString());
            }
            bitSet = bitSet2;
        }
        return new Lookahead(bitSet);
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, ZeroOrMoreBlock zeroOrMoreBlock) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look*(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(zeroOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        Lookahead look = look(i10, (AlternativeBlock) zeroOrMoreBlock);
        look.combineWith(zeroOrMoreBlock.next.look(i10));
        return look;
    }

    @Override // antlr.LLkGrammarAnalyzer
    public Lookahead look(int i10, String str) {
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleName(");
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(str);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        RuleBlock block = ((RuleSymbol) this.grammar.getSymbol(str)).getBlock();
        boolean[] zArr = block.lock;
        if (zArr[i10]) {
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("infinite recursion to rule ");
                stringBuffer2.append(block.getRuleName());
                printStream2.println(stringBuffer2.toString());
            }
            return new Lookahead(str);
        }
        if (block.cache[i10] != null) {
            if (this.DEBUG_ANALYZER) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("found depth ");
                stringBuffer3.append(i10);
                stringBuffer3.append(" result in FIRST ");
                stringBuffer3.append(str);
                stringBuffer3.append(" cache: ");
                stringBuffer3.append(block.cache[i10].toString(",", this.charFormatter, this.grammar));
                printStream3.println(stringBuffer3.toString());
            }
            return (Lookahead) block.cache[i10].clone();
        }
        zArr[i10] = true;
        Lookahead look = look(i10, block);
        block.lock[i10] = false;
        block.cache[i10] = (Lookahead) look.clone();
        if (this.DEBUG_ANALYZER) {
            PrintStream printStream4 = System.out;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("saving depth ");
            stringBuffer4.append(i10);
            stringBuffer4.append(" result in FIRST ");
            stringBuffer4.append(str);
            stringBuffer4.append(" cache: ");
            stringBuffer4.append(block.cache[i10].toString(",", this.charFormatter, this.grammar));
            printStream4.println(stringBuffer4.toString());
        }
        return look;
    }
}
