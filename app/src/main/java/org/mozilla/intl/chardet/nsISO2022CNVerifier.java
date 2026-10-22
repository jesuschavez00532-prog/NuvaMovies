package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsISO2022CNVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsISO2022CNVerifier() {
        cclass = r0;
        int[] iArr = {2, 0, 0, 4096, 0, 48, 0, 0, 16384, 0, 0, 0, 0, 0, 0, 0, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306};
        states = r0;
        int[] iArr2 = {304, 286331152, 572662289, 336663074, 286335249, 286331237, 286335249, 18944273};
        charset = "ISO-2022-CN";
        stFactor = 9;
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
