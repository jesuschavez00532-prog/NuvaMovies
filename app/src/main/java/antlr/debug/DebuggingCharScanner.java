package antlr.debug;

import antlr.CharScanner;
import antlr.CharStreamException;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.MismatchedCharException;
import antlr.RecognitionException;
import antlr.Token;
import antlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public abstract class DebuggingCharScanner extends CharScanner implements DebuggingParser {
    private boolean _notDebugMode;
    private ParserEventSupport parserEventSupport;
    protected String[] ruleNames;
    protected String[] semPredNames;

    public DebuggingCharScanner(InputBuffer inputBuffer) {
        super(inputBuffer);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }

    @Override // antlr.CharScanner
    /* renamed from: LA */
    public char mo4814LA(int i10) {
        char mo4814LA = super.mo4814LA(i10);
        this.parserEventSupport.fireLA(i10, mo4814LA);
        return mo4814LA;
    }

    public void addMessageListener(MessageListener messageListener) {
        this.parserEventSupport.addMessageListener(messageListener);
    }

    public void addNewLineListener(NewLineListener newLineListener) {
        this.parserEventSupport.addNewLineListener(newLineListener);
    }

    public void addParserListener(ParserListener parserListener) {
        this.parserEventSupport.addParserListener(parserListener);
    }

    public void addParserMatchListener(ParserMatchListener parserMatchListener) {
        this.parserEventSupport.addParserMatchListener(parserMatchListener);
    }

    public void addParserTokenListener(ParserTokenListener parserTokenListener) {
        this.parserEventSupport.addParserTokenListener(parserTokenListener);
    }

    public void addSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        this.parserEventSupport.addSemanticPredicateListener(semanticPredicateListener);
    }

    public void addSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        this.parserEventSupport.addSyntacticPredicateListener(syntacticPredicateListener);
    }

    public void addTraceListener(TraceListener traceListener) {
        this.parserEventSupport.addTraceListener(traceListener);
    }

    @Override // antlr.CharScanner
    public void consume() {
        char c10;
        try {
            c10 = mo4814LA(1);
        } catch (CharStreamException unused) {
            c10 = 65437;
        }
        super.consume();
        this.parserEventSupport.fireConsume(c10);
    }

    protected void fireEnterRule(int i10, int i11) {
        if (isDebugMode()) {
            this.parserEventSupport.fireEnterRule(i10, this.inputState.guessing, i11);
        }
    }

    protected void fireExitRule(int i10, int i11) {
        if (isDebugMode()) {
            this.parserEventSupport.fireExitRule(i10, this.inputState.guessing, i11);
        }
    }

    protected boolean fireSemanticPredicateEvaluated(int i10, int i11, boolean z10) {
        if (isDebugMode()) {
            return this.parserEventSupport.fireSemanticPredicateEvaluated(i10, i11, z10, this.inputState.guessing);
        }
        return z10;
    }

    protected void fireSyntacticPredicateFailed() {
        if (isDebugMode()) {
            this.parserEventSupport.fireSyntacticPredicateFailed(this.inputState.guessing);
        }
    }

    protected void fireSyntacticPredicateStarted() {
        if (isDebugMode()) {
            this.parserEventSupport.fireSyntacticPredicateStarted(this.inputState.guessing);
        }
    }

    protected void fireSyntacticPredicateSucceeded() {
        if (isDebugMode()) {
            this.parserEventSupport.fireSyntacticPredicateSucceeded(this.inputState.guessing);
        }
    }

    @Override // antlr.debug.DebuggingParser
    public String getRuleName(int i10) {
        return this.ruleNames[i10];
    }

    @Override // antlr.debug.DebuggingParser
    public String getSemPredName(int i10) {
        return this.semPredNames[i10];
    }

    public synchronized void goToSleep() {
        try {
            wait();
        } catch (InterruptedException unused) {
        }
    }

    public boolean isDebugMode() {
        return !this._notDebugMode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.CharScanner
    public Token makeToken(int i10) {
        return super.makeToken(i10);
    }

    @Override // antlr.CharScanner
    public void match(char c10) {
        char mo4814LA = mo4814LA(1);
        try {
            super.match(c10);
            this.parserEventSupport.fireMatch(c10, this.inputState.guessing);
        } catch (MismatchedCharException e10) {
            int i10 = this.inputState.guessing;
            if (i10 == 0) {
                this.parserEventSupport.fireMismatch(mo4814LA, c10, i10);
            }
            throw e10;
        }
    }

    @Override // antlr.CharScanner
    public void matchNot(char c10) {
        char mo4814LA = mo4814LA(1);
        try {
            super.matchNot(c10);
            this.parserEventSupport.fireMatchNot(mo4814LA, c10, this.inputState.guessing);
        } catch (MismatchedCharException e10) {
            int i10 = this.inputState.guessing;
            if (i10 == 0) {
                this.parserEventSupport.fireMismatchNot(mo4814LA, c10, i10);
            }
            throw e10;
        }
    }

    @Override // antlr.CharScanner
    public void matchRange(char c10, char c11) {
        char mo4814LA = mo4814LA(1);
        try {
            super.matchRange(c10, c11);
            ParserEventSupport parserEventSupport = this.parserEventSupport;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(c10);
            stringBuffer.append(c11);
            parserEventSupport.fireMatch(mo4814LA, stringBuffer.toString(), this.inputState.guessing);
        } catch (MismatchedCharException e10) {
            if (this.inputState.guessing == 0) {
                ParserEventSupport parserEventSupport2 = this.parserEventSupport;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("");
                stringBuffer2.append(c10);
                stringBuffer2.append(c11);
                parserEventSupport2.fireMismatch(mo4814LA, stringBuffer2.toString(), this.inputState.guessing);
            }
            throw e10;
        }
    }

    @Override // antlr.CharScanner
    public void newline() {
        super.newline();
        this.parserEventSupport.fireNewLine(getLine());
    }

    public void removeMessageListener(MessageListener messageListener) {
        this.parserEventSupport.removeMessageListener(messageListener);
    }

    public void removeNewLineListener(NewLineListener newLineListener) {
        this.parserEventSupport.removeNewLineListener(newLineListener);
    }

    public void removeParserListener(ParserListener parserListener) {
        this.parserEventSupport.removeParserListener(parserListener);
    }

    public void removeParserMatchListener(ParserMatchListener parserMatchListener) {
        this.parserEventSupport.removeParserMatchListener(parserMatchListener);
    }

    public void removeParserTokenListener(ParserTokenListener parserTokenListener) {
        this.parserEventSupport.removeParserTokenListener(parserTokenListener);
    }

    public void removeSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        this.parserEventSupport.removeSemanticPredicateListener(semanticPredicateListener);
    }

    public void removeSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        this.parserEventSupport.removeSyntacticPredicateListener(syntacticPredicateListener);
    }

    public void removeTraceListener(TraceListener traceListener) {
        this.parserEventSupport.removeTraceListener(traceListener);
    }

    public void reportError(MismatchedCharException mismatchedCharException) {
        this.parserEventSupport.fireReportError(mismatchedCharException);
        super.reportError((RecognitionException) mismatchedCharException);
    }

    @Override // antlr.CharScanner
    public void reportWarning(String str) {
        this.parserEventSupport.fireReportWarning(str);
        super.reportWarning(str);
    }

    public void setDebugMode(boolean z10) {
        this._notDebugMode = !z10;
    }

    public void setupDebugging() {
    }

    public synchronized void wakeUp() {
        notify();
    }

    @Override // antlr.CharScanner
    public void reportError(String str) {
        this.parserEventSupport.fireReportError(str);
        super.reportError(str);
    }

    public DebuggingCharScanner(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }

    @Override // antlr.CharScanner
    public void match(BitSet bitSet) {
        String aNTLRStringBuffer = this.text.toString();
        char mo4814LA = mo4814LA(1);
        try {
            super.match(bitSet);
            this.parserEventSupport.fireMatch(mo4814LA, bitSet, aNTLRStringBuffer, this.inputState.guessing);
        } catch (MismatchedCharException e10) {
            int i10 = this.inputState.guessing;
            if (i10 == 0) {
                this.parserEventSupport.fireMismatch(mo4814LA, bitSet, aNTLRStringBuffer, i10);
            }
            throw e10;
        }
    }

    @Override // antlr.CharScanner
    public void match(String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        int length = str.length();
        for (int i10 = 1; i10 <= length; i10++) {
            try {
                stringBuffer.append(super.mo4814LA(i10));
            } catch (Exception unused) {
            }
        }
        try {
            super.match(str);
            this.parserEventSupport.fireMatch(str, this.inputState.guessing);
        } catch (MismatchedCharException e10) {
            if (this.inputState.guessing == 0) {
                this.parserEventSupport.fireMismatch(stringBuffer.toString(), str, this.inputState.guessing);
            }
            throw e10;
        }
    }
}
