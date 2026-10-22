package antlr.debug;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class ParserReporter extends Tracer implements ParserListener {
    @Override // antlr.debug.ParserTokenListener
    public void parserConsume(ParserTokenEvent parserTokenEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserTokenEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.ParserTokenListener
    public void parserLA(ParserTokenEvent parserTokenEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserTokenEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.ParserMatchListener
    public void parserMatch(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.ParserMatchListener
    public void parserMatchNot(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.ParserMatchListener
    public void parserMismatch(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.ParserMatchListener
    public void parserMismatchNot(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.MessageListener
    public void reportError(MessageEvent messageEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(messageEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.MessageListener
    public void reportWarning(MessageEvent messageEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(messageEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.SemanticPredicateListener
    public void semanticPredicateEvaluated(SemanticPredicateEvent semanticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(semanticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.SyntacticPredicateListener
    public void syntacticPredicateFailed(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.SyntacticPredicateListener
    public void syntacticPredicateStarted(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // antlr.debug.SyntacticPredicateListener
    public void syntacticPredicateSucceeded(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.indent);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }
}
