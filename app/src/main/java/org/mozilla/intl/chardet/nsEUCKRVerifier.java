package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsEUCKRVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsEUCKRVerifier() {
        cclass = r0;
        int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 0, 0, 0, 0, 572662304, 858923554, 572662306, 572662306, 572662306, 572662322, 572662306, 572662306, 572662306, 572662306, 572662306, 35791394};
        states = r0;
        int[] iArr2 = {286331649, 1122850};
        charset = "EUC-KR";
        stFactor = 4;
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
