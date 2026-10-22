package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsHZVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsHZVerifier() {
        cclass = r0;
        int[] iArr = {1, 0, 0, 4096, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 38813696, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153};
        states = r0;
        int[] iArr2 = {285213456, 572657937, 335548706, 341120533, 336872468, 36};
        charset = "HZ-GB-2312";
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
