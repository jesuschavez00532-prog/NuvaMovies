package gf;

/* renamed from: gf.c */
/* loaded from: classes3.dex */
public class C4448c extends AbstractC4452g {
    @Override // gf.AbstractC4447b
    /* renamed from: b */
    protected int mo18642b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        if (i11 < 161) {
            return -1;
        }
        return (((i11 - 161) * 94) + (bArr[i10 + 1] & 255)) - 161;
    }
}
