package antlr.debug;

import antlr.LLkParser;
import antlr.MismatchedTokenException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.collections.impl.BitSet;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class LLkDebuggingParser extends LLkParser implements DebuggingParser {
    static /* synthetic */ Class class$antlr$TokenBuffer;
    static /* synthetic */ Class class$antlr$TokenStream;
    static /* synthetic */ Class class$antlr$debug$LLkDebuggingParser;
    private boolean _notDebugMode;
    protected ParserEventSupport parserEventSupport;
    protected String[] ruleNames;
    protected String[] semPredNames;

    public LLkDebuggingParser(int i10) {
        super(i10);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    @Override // antlr.LLkParser, antlr.Parser
    /* renamed from: LA */
    public int mo4816LA(int i10) {
        int mo4816LA = super.mo4816LA(i10);
        this.parserEventSupport.fireLA(i10, mo4816LA);
        return mo4816LA;
    }

    @Override // antlr.Parser
    public void addMessageListener(MessageListener messageListener) {
        this.parserEventSupport.addMessageListener(messageListener);
    }

    @Override // antlr.Parser
    public void addParserListener(ParserListener parserListener) {
        this.parserEventSupport.addParserListener(parserListener);
    }

    @Override // antlr.Parser
    public void addParserMatchListener(ParserMatchListener parserMatchListener) {
        this.parserEventSupport.addParserMatchListener(parserMatchListener);
    }

    @Override // antlr.Parser
    public void addParserTokenListener(ParserTokenListener parserTokenListener) {
        this.parserEventSupport.addParserTokenListener(parserTokenListener);
    }

    @Override // antlr.Parser
    public void addSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        this.parserEventSupport.addSemanticPredicateListener(semanticPredicateListener);
    }

    @Override // antlr.Parser
    public void addSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        this.parserEventSupport.addSyntacticPredicateListener(syntacticPredicateListener);
    }

    @Override // antlr.Parser
    public void addTraceListener(TraceListener traceListener) {
        this.parserEventSupport.addTraceListener(traceListener);
    }

    @Override // antlr.LLkParser, antlr.Parser
    public void consume() {
        int i10;
        try {
            i10 = mo4816LA(1);
        } catch (TokenStreamException unused) {
            i10 = -99;
        }
        super.consume();
        this.parserEventSupport.fireConsume(i10);
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

    @Override // antlr.Parser
    public boolean isDebugMode() {
        return !this._notDebugMode;
    }

    public boolean isGuessing() {
        if (this.inputState.guessing > 0) {
            return true;
        }
        return false;
    }

    @Override // antlr.Parser
    public void match(int i10) {
        String text = mo4817LT(1).getText();
        int mo4816LA = mo4816LA(1);
        try {
            super.match(i10);
            this.parserEventSupport.fireMatch(i10, text, this.inputState.guessing);
        } catch (MismatchedTokenException e10) {
            int i11 = this.inputState.guessing;
            if (i11 == 0) {
                this.parserEventSupport.fireMismatch(mo4816LA, i10, text, i11);
            }
            throw e10;
        }
    }

    @Override // antlr.Parser
    public void matchNot(int i10) {
        String text = mo4817LT(1).getText();
        int mo4816LA = mo4816LA(1);
        try {
            super.matchNot(i10);
            this.parserEventSupport.fireMatchNot(mo4816LA, i10, text, this.inputState.guessing);
        } catch (MismatchedTokenException e10) {
            int i11 = this.inputState.guessing;
            if (i11 == 0) {
                this.parserEventSupport.fireMismatchNot(mo4816LA, i10, text, i11);
            }
            throw e10;
        }
    }

    @Override // antlr.Parser
    public void removeMessageListener(MessageListener messageListener) {
        this.parserEventSupport.removeMessageListener(messageListener);
    }

    @Override // antlr.Parser
    public void removeParserListener(ParserListener parserListener) {
        this.parserEventSupport.removeParserListener(parserListener);
    }

    @Override // antlr.Parser
    public void removeParserMatchListener(ParserMatchListener parserMatchListener) {
        this.parserEventSupport.removeParserMatchListener(parserMatchListener);
    }

    @Override // antlr.Parser
    public void removeParserTokenListener(ParserTokenListener parserTokenListener) {
        this.parserEventSupport.removeParserTokenListener(parserTokenListener);
    }

    @Override // antlr.Parser
    public void removeSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        this.parserEventSupport.removeSemanticPredicateListener(semanticPredicateListener);
    }

    @Override // antlr.Parser
    public void removeSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        this.parserEventSupport.removeSyntacticPredicateListener(syntacticPredicateListener);
    }

    @Override // antlr.Parser
    public void removeTraceListener(TraceListener traceListener) {
        this.parserEventSupport.removeTraceListener(traceListener);
    }

    @Override // antlr.Parser
    public void reportError(RecognitionException recognitionException) {
        this.parserEventSupport.fireReportError(recognitionException);
        super.reportError(recognitionException);
    }

    @Override // antlr.Parser
    public void reportWarning(String str) {
        this.parserEventSupport.fireReportWarning(str);
        super.reportWarning(str);
    }

    @Override // antlr.Parser
    public void setDebugMode(boolean z10) {
        this._notDebugMode = !z10;
    }

    public void setupDebugging(TokenBuffer tokenBuffer) {
        setupDebugging(null, tokenBuffer);
    }

    public synchronized void wakeUp() {
        notify();
    }

    public void setupDebugging(TokenStream tokenStream) {
        setupDebugging(tokenStream, null);
    }

    @Override // antlr.Parser
    public void reportError(String str) {
        this.parserEventSupport.fireReportError(str);
        super.reportError(str);
    }

    protected void setupDebugging(TokenStream tokenStream, TokenBuffer tokenBuffer) {
        setDebugMode(true);
        try {
            try {
                Class.forName("javax.swing.JButton");
            } catch (ClassNotFoundException unused) {
                System.err.println("Swing is required to use ParseView, but is not present in your CLASSPATH");
                System.exit(1);
            }
            Class<?> cls = Class.forName("antlr.parseview.ParseView");
            Class<?>[] clsArr = new Class[3];
            Class<?> cls2 = class$antlr$debug$LLkDebuggingParser;
            if (cls2 == null) {
                cls2 = class$("antlr.debug.LLkDebuggingParser");
                class$antlr$debug$LLkDebuggingParser = cls2;
            }
            clsArr[0] = cls2;
            Class<?> cls3 = class$antlr$TokenStream;
            if (cls3 == null) {
                cls3 = class$("antlr.TokenStream");
                class$antlr$TokenStream = cls3;
            }
            clsArr[1] = cls3;
            Class<?> cls4 = class$antlr$TokenBuffer;
            if (cls4 == null) {
                cls4 = class$("antlr.TokenBuffer");
                class$antlr$TokenBuffer = cls4;
            }
            clsArr[2] = cls4;
            cls.getConstructor(clsArr).newInstance(this, tokenStream, tokenBuffer);
        } catch (Exception e10) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Error initializing ParseView: ");
            stringBuffer.append(e10);
            printStream.println(stringBuffer.toString());
            System.err.println("Please report this to Scott Stanchfield, thetick@magelang.com");
            System.exit(1);
        }
    }

    public LLkDebuggingParser(ParserSharedInputState parserSharedInputState, int i10) {
        super(parserSharedInputState, i10);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }

    public LLkDebuggingParser(TokenBuffer tokenBuffer, int i10) {
        super(tokenBuffer, i10);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }

    @Override // antlr.Parser
    public void match(BitSet bitSet) {
        String text = mo4817LT(1).getText();
        int mo4816LA = mo4816LA(1);
        try {
            super.match(bitSet);
            this.parserEventSupport.fireMatch(mo4816LA, bitSet, text, this.inputState.guessing);
        } catch (MismatchedTokenException e10) {
            int i10 = this.inputState.guessing;
            if (i10 == 0) {
                this.parserEventSupport.fireMismatch(mo4816LA, bitSet, text, i10);
            }
            throw e10;
        }
    }

    public LLkDebuggingParser(TokenStream tokenStream, int i10) {
        super(tokenStream, i10);
        this.parserEventSupport = new ParserEventSupport(this);
        this._notDebugMode = false;
    }
}
