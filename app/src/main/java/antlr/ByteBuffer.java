package antlr;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ByteBuffer extends InputBuffer {
    transient InputStream input;

    public ByteBuffer(InputStream inputStream) {
        this.input = inputStream;
    }

    @Override // antlr.InputBuffer
    public void fill(int i10) {
        try {
            syncConsume();
            while (true) {
                CharQueue charQueue = this.queue;
                if (charQueue.nbrEntries < this.markerOffset + i10) {
                    charQueue.append((char) this.input.read());
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            throw new CharStreamIOException(e10);
        }
    }
}
