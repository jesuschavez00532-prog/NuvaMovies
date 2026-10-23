package p137ff;

/* renamed from: ff.c */
/* loaded from: classes3.dex */
public class C4316c extends AbstractC4315b {
    @Override // p137ff.AbstractC4315b
    /* renamed from: b */
    protected int mo18095b(byte[] bArr, int i10) {
        int i11 = 0;
        if ((bArr[i10] & 255) != 130 || (i11 = bArr[i10 + 1] & 255) < 159 || i11 > 241) {
            return -1;
        }
        return i11 - 159;
    }
}
