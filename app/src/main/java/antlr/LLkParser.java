package antlr;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class LLkParser extends Parser {

    /* renamed from: k */
    int f4238k;

    public LLkParser(int i10) {
        this.f4238k = i10;
    }

    private void trace(String str, String str2) {
        String str3;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str2);
        if (this.inputState.guessing > 0) {
            str3 = "; [guessing]";
        } else {
            str3 = "; ";
        }
        stringBuffer.append(str3);
        printStream.print(stringBuffer.toString());
        for (int i10 = 1; i10 <= this.f4238k; i10++) {
            if (i10 != 1) {
                System.out.print(", ");
            }
            if (mo4817LT(i10) != null) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("LA(");
                stringBuffer2.append(i10);
                stringBuffer2.append(")==");
                stringBuffer2.append(mo4817LT(i10).getText());
                printStream2.print(stringBuffer2.toString());
            } else {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("LA(");
                stringBuffer3.append(i10);
                stringBuffer3.append(")==null");
                printStream3.print(stringBuffer3.toString());
            }
        }
        System.out.println("");
    }

    @Override // antlr.Parser
    /* renamed from: LA */
    public int mo4816LA(int i10) {
        return this.inputState.input.m4819LA(i10);
    }

    @Override // antlr.Parser
    /* renamed from: LT */
    public Token mo4817LT(int i10) {
        return this.inputState.input.m4820LT(i10);
    }

    @Override // antlr.Parser
    public void consume() {
        this.inputState.input.consume();
    }

    @Override // antlr.Parser
    public void traceIn(String str) {
        this.traceDepth++;
        trace("> ", str);
    }

    @Override // antlr.Parser
    public void traceOut(String str) {
        trace("< ", str);
        this.traceDepth--;
    }

    public LLkParser(ParserSharedInputState parserSharedInputState, int i10) {
        super(parserSharedInputState);
        this.f4238k = i10;
    }

    public LLkParser(TokenBuffer tokenBuffer, int i10) {
        this.f4238k = i10;
        setTokenBuffer(tokenBuffer);
    }

    public LLkParser(TokenStream tokenStream, int i10) {
        this.f4238k = i10;
        setTokenBuffer(new TokenBuffer(tokenStream));
    }
}
