package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsCP1252Verifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsCP1252Verifier() {
        cclass = r0;
        int[] iArr = {572662305, 2236962, 572662306, 572654114, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662274, 16851234, 572662304, 285286690, 572662306, 572662306, 572662306, 572662306, 286331153, 286331153, 554766609, 286331153, 286331153, 286331153, 554766609, 286331153};
        states = r0;
        int[] iArr2 = {571543601, 340853778, 65};
        charset = "windows-1252";
        stFactor = 3;
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
