package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsEUCSampler {
    int mTotal = 0;
    int mThreshold = 200;
    int mState = 0;
    public int[] mFirstByteCnt = new int[94];
    public int[] mSecondByteCnt = new int[94];
    public float[] mFirstByteFreq = new float[94];
    public float[] mSecondByteFreq = new float[94];

    public nsEUCSampler() {
        Reset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void CalFreq() {
        for (int i10 = 0; i10 < 94; i10++) {
            float[] fArr = this.mFirstByteFreq;
            float f10 = this.mFirstByteCnt[i10];
            int i11 = this.mTotal;
            fArr[i10] = f10 / i11;
            this.mSecondByteFreq[i10] = this.mSecondByteCnt[i10] / i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean EnoughData() {
        if (this.mTotal > this.mThreshold) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float GetScore(float[] fArr, float f10, float[] fArr2, float f11) {
        return (f10 * GetScore(fArr, this.mFirstByteFreq)) + (f11 * GetScore(fArr2, this.mSecondByteFreq));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean GetSomeData() {
        if (this.mTotal > 1) {
            return true;
        }
        return false;
    }

    public void Reset() {
        this.mTotal = 0;
        this.mState = 0;
        for (int i10 = 0; i10 < 94; i10++) {
            this.mFirstByteCnt[i10] = 0;
            this.mSecondByteCnt[i10] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Sample(byte[] bArr, int i10) {
        if (this.mState == 1) {
            return false;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = this.mState;
            if (1 == i13) {
                break;
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        this.mState = 1;
                    } else {
                        byte b10 = bArr[i12];
                        if ((b10 & 128) != 0) {
                            if (255 != (b10 & 255) && 161 <= (b10 & 255)) {
                                this.mTotal++;
                                int[] iArr = this.mSecondByteCnt;
                                int i14 = (b10 & 255) - 161;
                                iArr[i14] = iArr[i14] + 1;
                                this.mState = 0;
                            } else {
                                this.mState = 1;
                            }
                        } else {
                            this.mState = 1;
                        }
                    }
                }
            } else {
                byte b11 = bArr[i12];
                if ((b11 & 128) != 0) {
                    if (255 != (b11 & 255) && 161 <= (b11 & 255)) {
                        this.mTotal++;
                        int[] iArr2 = this.mFirstByteCnt;
                        int i15 = (b11 & 255) - 161;
                        iArr2[i15] = iArr2[i15] + 1;
                        this.mState = 2;
                    } else {
                        this.mState = 1;
                    }
                }
            }
            i11++;
            i12++;
        }
        if (1 == this.mState) {
            return false;
        }
        return true;
    }

    float GetScore(float[] fArr, float[] fArr2) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < 94; i10++) {
            float f11 = fArr[i10] - fArr2[i10];
            f10 += f11 * f11;
        }
        return ((float) Math.sqrt(f10)) / 94.0f;
    }
}
