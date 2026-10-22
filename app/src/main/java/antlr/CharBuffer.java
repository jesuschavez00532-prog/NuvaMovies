package antlr;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class CharBuffer extends InputBuffer {
    transient Reader input;

    public CharBuffer(Reader reader) {
        this.input = reader;
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
