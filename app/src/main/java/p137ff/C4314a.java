package p137ff;

/* renamed from: ff.a */
/* loaded from: classes3.dex */
public class C4314a extends AbstractC4315b {
    @Override // p137ff.AbstractC4315b
    /* renamed from: b */
    protected int mo18095b(byte[] bArr, int i10) {
        int i11;
        if ((bArr[i10] & 255) != 164 || (i11 = bArr[i10 + 1] & 255) < 161 || i11 > 243) {
            return -1;
        }
        return i11 - 161;
    }
}
