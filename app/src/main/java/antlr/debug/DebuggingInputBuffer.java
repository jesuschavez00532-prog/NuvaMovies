package antlr.debug;

import antlr.CharStreamException;
import antlr.InputBuffer;
import java.util.Vector;

/* loaded from: classes.dex */
public class DebuggingInputBuffer extends InputBuffer {
    private InputBuffer buffer;
    private boolean debugMode = true;
    private InputBufferEventSupport inputBufferEventSupport = new InputBufferEventSupport(this);

    public DebuggingInputBuffer(InputBuffer inputBuffer) {
        this.buffer = inputBuffer;
    }

    @Override // antlr.InputBuffer
    /* renamed from: LA */
    public char mo4815LA(int i10) {
        char mo4815LA = this.buffer.mo4815LA(i10);
        if (this.debugMode) {
            this.inputBufferEventSupport.fireLA(mo4815LA, i10);
        }
        return mo4815LA;
    }

    public void addInputBufferListener(InputBufferListener inputBufferListener) {
        this.inputBufferEventSupport.addInputBufferListener(inputBufferListener);
    }

    @Override // antlr.InputBuffer
    public void consume() {
        char c10;
        try {
            c10 = this.buffer.mo4815LA(1);
        } catch (CharStreamException unused) {
            c10 = ' ';
        }
        this.buffer.consume();
        if (this.debugMode) {
            this.inputBufferEventSupport.fireConsume(c10);
        }
    }

    @Override // antlr.InputBuffer
    public void fill(int i10) {
        this.buffer.fill(i10);
    }

    public Vector getInputBufferListeners() {
        return this.inputBufferEventSupport.getInputBufferListeners();
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    @Override // antlr.InputBuffer
    public boolean isMarked() {
        return this.buffer.isMarked();
    }

    @Override // antlr.InputBuffer
    public int mark() {
        int mark = this.buffer.mark();
        this.inputBufferEventSupport.fireMark(mark);
        return mark;
    }

    public void removeInputBufferListener(InputBufferListener inputBufferListener) {
        InputBufferEventSupport inputBufferEventSupport = this.inputBufferEventSupport;
        if (inputBufferEventSupport != null) {
            inputBufferEventSupport.removeInputBufferListener(inputBufferListener);
        }
    }

    @Override // antlr.InputBuffer
    public void rewind(int i10) {
        this.buffer.rewind(i10);
        this.inputBufferEventSupport.fireRewind(i10);
    }

    public void setDebugMode(boolean z10) {
        this.debugMode = z10;
    }
}
