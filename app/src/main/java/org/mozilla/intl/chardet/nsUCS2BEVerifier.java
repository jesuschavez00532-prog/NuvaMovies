package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsUCS2BEVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsUCS2BEVerifier() {
        cclass = r0;
        int[] iArr = {0, 2097408, 0, 12288, 0, 3355440, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1409286144};
        states = r0;
        int[] iArr2 = {288626549, 572657937, 291923490, 1713792614, 393569894, 1717659269, 1140326};
        charset = "UTF-16BE";
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
        return true;
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
