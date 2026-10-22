package antlr;

/* loaded from: classes.dex */
class ExceptionHandler {
    protected Token action;
    protected Token exceptionTypeAndName;

    public ExceptionHandler(Token token, Token token2) {
        this.exceptionTypeAndName = token;
        this.action = token2;
    }
}
