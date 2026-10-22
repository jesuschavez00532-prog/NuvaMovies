package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DefaultToolErrorHandler implements ToolErrorHandler {
    private final Tool antlrTool;
    CharFormatter javaCharFormatter = new JavaCharFormatter();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultToolErrorHandler(Tool tool) {
        this.antlrTool = tool;
    }

    private void dumpSets(String[] strArr, int i10, Grammar grammar, boolean z10, int i11, Lookahead[] lookaheadArr) {
        StringBuffer stringBuffer = new StringBuffer(100);
        int i12 = 1;
        while (i12 <= i11) {
            stringBuffer.append("k==");
            stringBuffer.append(i12);
            stringBuffer.append(':');
            if (z10) {
                String stringWithRanges = lookaheadArr[i12].fset.toStringWithRanges(",", this.javaCharFormatter);
                if (lookaheadArr[i12].containsEpsilon()) {
                    stringBuffer.append("<end-of-token>");
                    if (stringWithRanges.length() > 0) {
                        stringBuffer.append(',');
                    }
                }
                stringBuffer.append(stringWithRanges);
            } else {
                stringBuffer.append(lookaheadArr[i12].fset.toString(",", grammar.tokenManager.getVocabulary()));
            }
            strArr[i10] = stringBuffer.toString();
            stringBuffer.setLength(0);
            i12++;
            i10++;
        }
    }

    @Override // antlr.ToolErrorHandler
    public void warnAltAmbiguity(Grammar grammar, AlternativeBlock alternativeBlock, boolean z10, int i10, Lookahead[] lookaheadArr, int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer(100);
        if ((alternativeBlock instanceof RuleBlock) && ((RuleBlock) alternativeBlock).isLexerAutoGenRule()) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(i11);
            Alternative alternativeAt2 = alternativeBlock.getAlternativeAt(i12);
            RuleRefElement ruleRefElement = (RuleRefElement) alternativeAt.head;
            RuleRefElement ruleRefElement2 = (RuleRefElement) alternativeAt2.head;
            String reverseLexerRuleName = CodeGenerator.reverseLexerRuleName(ruleRefElement.targetRule);
            String reverseLexerRuleName2 = CodeGenerator.reverseLexerRuleName(ruleRefElement2.targetRule);
            stringBuffer.append("lexical nondeterminism between rules ");
            stringBuffer.append(reverseLexerRuleName);
            stringBuffer.append(" and ");
            stringBuffer.append(reverseLexerRuleName2);
            stringBuffer.append(" upon");
        } else {
            if (z10) {
                stringBuffer.append("lexical ");
            }
            stringBuffer.append("nondeterminism between alts ");
            stringBuffer.append(i11 + 1);
            stringBuffer.append(" and ");
            stringBuffer.append(i12 + 1);
            stringBuffer.append(" of block upon");
        }
        String[] strArr = new String[i10 + 1];
        strArr[0] = stringBuffer.toString();
        dumpSets(strArr, 1, grammar, z10, i10, lookaheadArr);
        this.antlrTool.warning(strArr, grammar.getFilename(), alternativeBlock.getLine(), alternativeBlock.getColumn());
    }

    @Override // antlr.ToolErrorHandler
    public void warnAltExitAmbiguity(Grammar grammar, BlockWithImpliedExitPath blockWithImpliedExitPath, boolean z10, int i10, Lookahead[] lookaheadArr, int i11) {
        String str;
        String[] strArr = new String[i10 + 2];
        StringBuffer stringBuffer = new StringBuffer();
        if (z10) {
            str = "lexical ";
        } else {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append("nondeterminism upon");
        strArr[0] = stringBuffer.toString();
        dumpSets(strArr, 1, grammar, z10, i10, lookaheadArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("between alt ");
        stringBuffer2.append(i11 + 1);
        stringBuffer2.append(" and exit branch of block");
        strArr[i10 + 1] = stringBuffer2.toString();
        this.antlrTool.warning(strArr, grammar.getFilename(), blockWithImpliedExitPath.getLine(), blockWithImpliedExitPath.getColumn());
    }
}
