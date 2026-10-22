package antlr;

import antlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class TokenStreamHiddenTokenFilter extends TokenStreamBasicFilter {
    protected CommonHiddenStreamToken firstHidden;
    protected BitSet hideMask;
    protected CommonHiddenStreamToken lastHiddenToken;
    protected CommonHiddenStreamToken nextMonitoredToken;

    public TokenStreamHiddenTokenFilter(TokenStream tokenStream) {
        super(tokenStream);
        this.firstHidden = null;
        this.hideMask = new BitSet();
    }

    private void consumeFirst() {
        consume();
        CommonHiddenStreamToken commonHiddenStreamToken = null;
        while (true) {
            if (!this.hideMask.member(m4821LA(1).getType()) && !this.discardMask.member(m4821LA(1).getType())) {
                return;
            }
            if (this.hideMask.member(m4821LA(1).getType())) {
                if (commonHiddenStreamToken == null) {
                    commonHiddenStreamToken = m4821LA(1);
                } else {
                    commonHiddenStreamToken.setHiddenAfter(m4821LA(1));
                    m4821LA(1).setHiddenBefore(commonHiddenStreamToken);
                    commonHiddenStreamToken = m4821LA(1);
                }
                this.lastHiddenToken = commonHiddenStreamToken;
                if (this.firstHidden == null) {
                    this.firstHidden = commonHiddenStreamToken;
                }
            }
            consume();
        }
    }

    /* renamed from: LA */
    protected CommonHiddenStreamToken m4821LA(int i10) {
        return this.nextMonitoredToken;
    }

    protected void consume() {
        this.nextMonitoredToken = (CommonHiddenStreamToken) this.input.nextToken();
    }

    public BitSet getDiscardMask() {
        return this.discardMask;
    }

    public CommonHiddenStreamToken getHiddenAfter(CommonHiddenStreamToken commonHiddenStreamToken) {
        return commonHiddenStreamToken.getHiddenAfter();
    }

    public CommonHiddenStreamToken getHiddenBefore(CommonHiddenStreamToken commonHiddenStreamToken) {
        return commonHiddenStreamToken.getHiddenBefore();
    }

    public BitSet getHideMask() {
        return this.hideMask;
    }

    public CommonHiddenStreamToken getInitialHiddenToken() {
        return this.firstHidden;
    }

    public void hide(int i10) {
        this.hideMask.add(i10);
    }

    @Override // antlr.TokenStreamBasicFilter, antlr.TokenStream
    public Token nextToken() {
        if (m4821LA(1) == null) {
            consumeFirst();
        }
        CommonHiddenStreamToken m4821LA = m4821LA(1);
        m4821LA.setHiddenBefore(this.lastHiddenToken);
        this.lastHiddenToken = null;
        consume();
        CommonHiddenStreamToken commonHiddenStreamToken = m4821LA;
        while (true) {
            if (!this.hideMask.member(m4821LA(1).getType()) && !this.discardMask.member(m4821LA(1).getType())) {
                return m4821LA;
            }
            if (this.hideMask.member(m4821LA(1).getType())) {
                commonHiddenStreamToken.setHiddenAfter(m4821LA(1));
                if (commonHiddenStreamToken != m4821LA) {
                    m4821LA(1).setHiddenBefore(commonHiddenStreamToken);
                }
                commonHiddenStreamToken = m4821LA(1);
                this.lastHiddenToken = commonHiddenStreamToken;
            }
            consume();
        }
    }

    public void hide(BitSet bitSet) {
        this.hideMask = bitSet;
    }
}
