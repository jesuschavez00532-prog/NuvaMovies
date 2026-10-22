package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsGB18030Verifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsGB18030Verifier() {
        cclass = r0;
        int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 858993459, 286331187, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 1109533218, 1717986917, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 107374182};
        states = r0;
        int[] iArr2 = {318767105, 571543825, 17965602, 286326804, 303109393, 17};
        charset = "GB18030";
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
