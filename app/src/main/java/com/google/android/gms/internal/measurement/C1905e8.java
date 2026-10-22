package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e8 */
/* loaded from: classes.dex */
final class C1905e8 extends AbstractC1937g8 {

    /* renamed from: b */
    private final byte[] f7716b;

    /* renamed from: c */
    private int f7717c;

    /* renamed from: d */
    private int f7718d;

    /* renamed from: e */
    private int f7719e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1905e8(byte[] bArr, int i10, int i11, boolean z10, AbstractC1889d8 abstractC1889d8) {
        super(null);
        this.f7719e = Integer.MAX_VALUE;
        this.f7716b = bArr;
        this.f7717c = 0;
    }

    /* renamed from: c */
    public final int m8290c(int i10) {
        int i11 = this.f7719e;
        this.f7719e = 0;
        int i12 = this.f7717c + this.f7718d;
        this.f7717c = i12;
        if (i12 > 0) {
            this.f7718d = i12;
            this.f7717c = i12 - i12;
        } else {
            this.f7718d = 0;
        }
        return i11;
    }
}
