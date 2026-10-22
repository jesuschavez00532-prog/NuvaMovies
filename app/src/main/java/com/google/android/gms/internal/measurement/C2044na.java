package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.na */
/* loaded from: classes.dex */
final class C2044na implements InterfaceC1843aa {

    /* renamed from: a */
    private final InterfaceC1891da f7967a;

    /* renamed from: b */
    private final String f7968b;

    /* renamed from: c */
    private final Object[] f7969c;

    /* renamed from: d */
    private final int f7970d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2044na(InterfaceC1891da interfaceC1891da, String str, Object[] objArr) {
        this.f7967a = interfaceC1891da;
        this.f7968b = str;
        this.f7969c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7970d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f7970d = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1843aa
    /* renamed from: a */
    public final InterfaceC1891da mo8097a() {
        return this.f7967a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m8740b() {
        return this.f7968b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] m8741c() {
        return this.f7969c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1843aa
    /* renamed from: e */
    public final boolean mo8098e() {
        return (this.f7970d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1843aa
    /* renamed from: f */
    public final int mo8099f() {
        return (this.f7970d & 1) == 1 ? 1 : 2;
    }
}
