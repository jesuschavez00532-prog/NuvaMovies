package org.mozilla.intl.chardet;

import anet.channel.request.Request;

/* loaded from: classes3.dex */
public class nsUTF8Verifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsUTF8Verifier() {
        cclass = r0;
        int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 858989090, 1145324612, 1145324612, 1145324612, 1431655765, 1431655765, 1431655765, 1431655765, 1717986816, 1717986918, 1717986918, 1717986918, -2004318073, -2003269496, -1145324614, 16702940};
        states = r0;
        int[] iArr2 = {-1408167679, 878082233, 286331153, 286331153, 572662306, 572662306, 290805009, 286331153, 290803985, 286331153, 293041937, 286331153, 293015825, 286331153, 295278865, 286331153, 294719761, 286331153, 298634257, 286331153, 297865489, 286331153, 287099921, 286331153, 285212689, 286331153};
        charset = Request.DEFAULT_CHARSET;
        stFactor = 16;
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
