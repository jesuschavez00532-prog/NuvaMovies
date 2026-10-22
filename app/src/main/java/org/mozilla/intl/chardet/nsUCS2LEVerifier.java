package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsUCS2LEVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsUCS2LEVerifier() {
        cclass = r0;
        int[] iArr = {0, 2097408, 0, 12288, 0, 3355440, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1409286144};
        states = r0;
        int[] iArr2 = {288647014, 572657937, 303387938, 1712657749, 357927015, 1427182933, 1381717};
        charset = "UTF-16LE";
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
