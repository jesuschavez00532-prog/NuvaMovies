package antlr.debug;

/* loaded from: classes.dex */
public interface SyntacticPredicateListener extends ListenerBase {
    void syntacticPredicateFailed(SyntacticPredicateEvent syntacticPredicateEvent);

    void syntacticPredicateStarted(SyntacticPredicateEvent syntacticPredicateEvent);

    void syntacticPredicateSucceeded(SyntacticPredicateEvent syntacticPredicateEvent);
}
