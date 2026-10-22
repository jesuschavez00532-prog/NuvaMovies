package antlr;

import antlr.collections.impl.Vector;

/* loaded from: classes.dex */
class ExceptionSpec {
    protected Vector handlers = new Vector();
    protected Token label;

    public ExceptionSpec(Token token) {
        this.label = token;
    }

    public void addHandler(ExceptionHandler exceptionHandler) {
        this.handlers.appendElement(exceptionHandler);
    }
}
