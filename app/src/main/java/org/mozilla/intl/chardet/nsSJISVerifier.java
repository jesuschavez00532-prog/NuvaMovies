package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsSJISVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsSJISVerifier() {
        cclass = r0;
        int[] iArr = {286331152, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 304226850, 858993459, 858993459, 858993459, 858993459, 572662308, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 858993459, 1145393971, 1145324612, 279620};
        states = r0;
        int[] iArr2 = {286339073, 572657937, 4386};
        charset = "Shift_JIS";
        stFactor = 6;
    }

    @Override // org.mozilla.intl.chardet.nsVerifier
    public int[] cclass() {
        return cclass;
    }

    @Override // org.mozilla.intl.chardet.nsVerifier
    public String charset() {
        return charset;
    }

    @Override // org.mozilla.intl.chardet.nsVerifier
    public boolean isUCS2() {
        return false;
    }

    @Override // org.mozilla.intl.chardet.nsVerifier
    public int stFactor() {
        return stFactor;
    }

    @Override // org.mozilla.intl.chardet.nsVerifier
    public int[] states() {
        return states;
    }
}
