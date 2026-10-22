package p283p6;

import java.io.OutputStream;

/* renamed from: p6.b */
/* loaded from: classes.dex */
final class C6221b extends OutputStream {

    /* renamed from: a */
    private long f24417a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m24812a() {
        return this.f24417a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f24417a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f24417a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f24417a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
