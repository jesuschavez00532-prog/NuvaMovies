package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsEUCTWVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsEUCTWVerifier() {
        cclass = r0;
        int[] iArr = {572662306, 2236962, 572662306, 572654114, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 0, 100663296, 0, 0, 1145324592, 286331221, 286331153, 286331153, 858985233, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 53687091};
        states = r0;
        int[] iArr2 = {338898961, 571543825, 269623842, 286330880, 1052949, 16};
        charset = "x-euc-tw";
        stFactor = 7;
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
