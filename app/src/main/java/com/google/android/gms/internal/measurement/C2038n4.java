package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes.dex */
public final class C2038n4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2038n4 zza;
    private int zze;
    private InterfaceC1922f9 zzf = AbstractC2222z8.m9401n();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C2038n4 c2038n4 = new C2038n4();
        zza = c2038n4;
        AbstractC2222z8.m9405s(C2038n4.class, c2038n4);
    }

    private C2038n4() {
    }

    /* renamed from: B */
    public static C2023m4 m8715B() {
        return (C2023m4) zza.m9407t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m8717G(C2038n4 c2038n4, int i10, C2098r4 c2098r4) {
        c2098r4.getClass();
        c2038n4.m8725R();
        c2038n4.zzf.set(i10, c2098r4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m8718H(C2038n4 c2038n4, C2098r4 c2098r4) {
        c2098r4.getClass();
        c2038n4.m8725R();
        c2038n4.zzf.add(c2098r4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m8719I(C2038n4 c2038n4, Iterable iterable) {
        c2038n4.m8725R();
        AbstractC2026m7.m8701h(iterable, c2038n4.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m8721K(C2038n4 c2038n4, int i10) {
        c2038n4.m8725R();
        c2038n4.zzf.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m8722L(C2038n4 c2038n4, String str) {
        str.getClass();
        c2038n4.zze |= 1;
        c2038n4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m8723M(C2038n4 c2038n4, long j10) {
        c2038n4.zze |= 2;
        c2038n4.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m8724N(C2038n4 c2038n4, long j10) {
        c2038n4.zze |= 4;
        c2038n4.zzi = j10;
    }

    /* renamed from: R */
    private final void m8725R() {
        InterfaceC1922f9 interfaceC1922f9 = this.zzf;
        if (!interfaceC1922f9.mo8387f()) {
            this.zzf = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
    }

    /* renamed from: A */
    public final long m8726A() {
        return this.zzh;
    }

    /* renamed from: D */
    public final C2098r4 m8727D(int i10) {
        return (C2098r4) this.zzf.get(i10);
    }

    /* renamed from: E */
    public final String m8728E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List m8729F() {
        return this.zzf;
    }

    /* renamed from: O */
    public final boolean m8730O() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: P */
    public final boolean m8731P() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: Q */
    public final boolean m8732Q() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC1901e4 abstractC1901e4 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2023m4(abstractC1901e4);
                }
                return new C2038n4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2098r4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8733x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final int m8734y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final long m8735z() {
        return this.zzi;
    }
}
