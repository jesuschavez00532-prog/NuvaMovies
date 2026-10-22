package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsBIG5Verifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsBIG5Verifier() {
        cclass = r0;
        int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 304226850, 1145324612, 1145324612, 1145324612, 1145324612, 858993460, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 53687091};
        states = r0;
        int[] iArr2 = {286339073, 304226833, 1};
        charset = "Big5";
        stFactor = 5;
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
