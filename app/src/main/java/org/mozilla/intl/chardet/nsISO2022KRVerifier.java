package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsISO2022KRVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsISO2022KRVerifier() {
        cclass = r0;
        int[] iArr = {2, 0, 0, 4096, 196608, 64, 0, 0, 20480, 0, 0, 0, 0, 0, 0, 0, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306};
        states = r0;
        int[] iArr2 = {285212976, 572657937, 289476898, 286593297, 8465};
        charset = "ISO-2022-KR";
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
