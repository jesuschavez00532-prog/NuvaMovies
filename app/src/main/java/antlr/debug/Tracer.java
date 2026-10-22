package antlr.debug;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class Tracer extends TraceAdapter {
    String indent = "";

    protected void dedent() {
        if (this.indent.length() < 2) {
            this.indent = "";
        } else {
            this.indent = this.indent.substring(2);
        }
    }

    @Override // antlr.debug.TraceAdapter, antlr.debug.TraceListener
    public void enterRule(TraceEvent traceEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(traceEvent);
        printStream.println(stringBuffer.toString());
        indent();
    }

    @Override // antlr.debug.TraceAdapter, antlr.debug.TraceListener
    public void exitRule(TraceEvent traceEvent) {
        dedent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(traceEvent);
        printStream.println(stringBuffer.toString());
    }

    protected void indent() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append("  ");
        this.indent = stringBuffer.toString();
    }
}
