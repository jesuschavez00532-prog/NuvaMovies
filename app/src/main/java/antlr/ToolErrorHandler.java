package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ToolErrorHandler {
    void warnAltAmbiguity(Grammar grammar, AlternativeBlock alternativeBlock, boolean z10, int i10, Lookahead[] lookaheadArr, int i11, int i12);

    void warnAltExitAmbiguity(Grammar grammar, BlockWithImpliedExitPath blockWithImpliedExitPath, boolean z10, int i10, Lookahead[] lookaheadArr, int i11);
}
