package antlr;

import antlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class TokenStreamBasicFilter implements TokenStream {
    protected BitSet discardMask = new BitSet();
    protected TokenStream input;

    public TokenStreamBasicFilter(TokenStream tokenStream) {
        this.input = tokenStream;
    }

    public void discard(int i10) {
        this.discardMask.add(i10);
    }

    @Override // antlr.TokenStream
    public Token nextToken() {
        Token nextToken = this.input.nextToken();
        while (nextToken != null && this.discardMask.member(nextToken.getType())) {
            nextToken = this.input.nextToken();
        }
        return nextToken;
    }

    public void discard(BitSet bitSet) {
        this.discardMask = bitSet;
    }
}
