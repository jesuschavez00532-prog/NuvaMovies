package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsEUCJPVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsEUCJPVerifier() {
        cclass = r0;
        int[] iArr = {1145324612, 1430537284, 1145324612, 1145328708, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1431655765, 827675989, 1431655765, 1431655765, 572662309, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 0, 0, 0, 1342177280};
        states = r0;
        int[] iArr2 = {286282563, 572657937, 286265378, 319885329, 4371};
        charset = "EUC-JP";
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
