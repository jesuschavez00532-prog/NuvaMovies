package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public abstract class nsVerifier {
    static final int eBitSft4bits = 2;
    static final byte eError = 1;
    static final byte eItsMe = 2;
    static final int eSftMsk4bits = 7;
    static final byte eStart = 0;
    static final int eUnitMsk4bits = 15;
    static final int eidxSft4bits = 3;

    public static byte getNextState(nsVerifier nsverifier, byte b10, byte b11) {
        int i10 = (b10 & 255) >> 3;
        int i11 = (b10 & 7) << 2;
        return (byte) ((nsverifier.states()[(((nsverifier.stFactor() * b11) + ((nsverifier.cclass()[i10] >> i11) & 15)) & 255) >> 3] >> (((((b11 * nsverifier.stFactor()) + ((nsverifier.cclass()[i10] >> i11) & 15)) & 255) & 7) << 2)) & 15 & 255);
    }

    public abstract int[] cclass();

    public abstract String charset();

    public abstract boolean isUCS2();

    public abstract int stFactor();

    public abstract int[] states();
}
