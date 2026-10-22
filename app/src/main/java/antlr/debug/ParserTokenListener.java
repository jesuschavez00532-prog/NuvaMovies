package antlr.debug;

/* loaded from: classes.dex */
public interface ParserTokenListener extends ListenerBase {
    void parserConsume(ParserTokenEvent parserTokenEvent);

    void parserLA(ParserTokenEvent parserTokenEvent);
}
