package antlr.debug;

import java.util.EventListener;

/* loaded from: classes.dex */
public interface ListenerBase extends EventListener {
    void doneParsing(TraceEvent traceEvent);

    void refresh();
}
