package antlr;

/* loaded from: classes.dex */
public class TokenBuffer {
    protected TokenStream input;
    int nMarkers = 0;
    int markerOffset = 0;
    int numToConsume = 0;
    TokenQueue queue = new TokenQueue(1);

    public TokenBuffer(TokenStream tokenStream) {
        this.input = tokenStream;
    }

    private final void fill(int i10) {
        syncConsume();
        while (true) {
            TokenQueue tokenQueue = this.queue;
            if (tokenQueue.nbrEntries < this.markerOffset + i10) {
                tokenQueue.append(this.input.nextToken());
            } else {
                return;
            }
        }
    }

    private final void syncConsume() {
        while (this.numToConsume > 0) {
            if (this.nMarkers > 0) {
                this.markerOffset++;
            } else {
                this.queue.removeFirst();
            }
            this.numToConsume--;
        }
    }

    /* renamed from: LA */
    public final int m4819LA(int i10) {
        fill(i10);
        return this.queue.elementAt((this.markerOffset + i10) - 1).type;
    }

    /* renamed from: LT */
    public final Token m4820LT(int i10) {
        fill(i10);
        return this.queue.elementAt((this.markerOffset + i10) - 1);
    }

    public final void consume() {
        this.numToConsume++;
    }

    public TokenStream getInput() {
        return this.input;
    }

    public final int mark() {
        syncConsume();
        this.nMarkers++;
        return this.markerOffset;
    }

    public final void reset() {
        this.nMarkers = 0;
        this.markerOffset = 0;
        this.numToConsume = 0;
        this.queue.reset();
    }

    public final void rewind(int i10) {
        syncConsume();
        this.markerOffset = i10;
        this.nMarkers--;
    }
}
