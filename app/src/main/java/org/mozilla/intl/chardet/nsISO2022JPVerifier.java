package org.mozilla.intl.chardet;

import com.p077uc.crashsdk.export.LogType;

/* loaded from: classes3.dex */
public class nsISO2022JPVerifier extends nsVerifier {
    static int[] cclass;
    static String charset;
    static int stFactor;
    static int[] states;

    public nsISO2022JPVerifier() {
        cclass = r0;
        int[] iArr = {2, 570425344, 0, 4096, 458752, 3, 0, 0, 1030, LogType.UNEXP_ANR, 0, 0, 0, 0, 0, 0, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306};
        states = r0;
        int[] iArr2 = {304, 286331153, 572662306, 1091653905, 303173905, 287445265};
        charset = "ISO-2022-JP";
        stFactor = 8;
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
