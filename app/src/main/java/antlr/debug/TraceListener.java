package antlr.debug;

/* loaded from: classes.dex */
public interface TraceListener extends ListenerBase {
    void enterRule(TraceEvent traceEvent);

    void exitRule(TraceEvent traceEvent);
}
