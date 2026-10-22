package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
/* loaded from: classes.dex */
public final class C1886d5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1886d5 zza;
    private InterfaceC1906e9 zze = AbstractC2222z8.m9399l();
    private InterfaceC1906e9 zzf = AbstractC2222z8.m9399l();
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();
    private InterfaceC1922f9 zzh = AbstractC2222z8.m9401n();

    static {
        C1886d5 c1886d5 = new C1886d5();
        zza = c1886d5;
        AbstractC2222z8.m9405s(C1886d5.class, c1886d5);
    }

    private C1886d5() {
    }

    /* renamed from: C */
    public static C1870c5 m8222C() {
        return (C1870c5) zza.m9407t();
    }

    /* renamed from: E */
    public static C1886d5 m8224E() {
        return zza;
    }

    /* renamed from: K */
    public static /* synthetic */ void m8225K(C1886d5 c1886d5, Iterable iterable) {
        InterfaceC1906e9 interfaceC1906e9 = c1886d5.zze;
        if (!interfaceC1906e9.mo8387f()) {
            c1886d5.zze = AbstractC2222z8.m9400m(interfaceC1906e9);
        }
        AbstractC2026m7.m8701h(iterable, c1886d5.zze);
    }

    /* renamed from: M */
    public static /* synthetic */ void m8227M(C1886d5 c1886d5, Iterable iterable) {
        InterfaceC1906e9 interfaceC1906e9 = c1886d5.zzf;
        if (!interfaceC1906e9.mo8387f()) {
            c1886d5.zzf = AbstractC2222z8.m9400m(interfaceC1906e9);
        }
        AbstractC2026m7.m8701h(iterable, c1886d5.zzf);
    }

    /* renamed from: O */
    public static /* synthetic */ void m8229O(C1886d5 c1886d5, Iterable iterable) {
        c1886d5.m8235W();
        AbstractC2026m7.m8701h(iterable, c1886d5.zzg);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m8231Q(C1886d5 c1886d5, int i10) {
        c1886d5.m8235W();
        c1886d5.zzg.remove(i10);
    }

    /* renamed from: R */
    public static /* synthetic */ void m8232R(C1886d5 c1886d5, Iterable iterable) {
        c1886d5.m8236X();
        AbstractC2026m7.m8701h(iterable, c1886d5.zzh);
    }

    /* renamed from: V */
    public static /* synthetic */ void m8234V(C1886d5 c1886d5, int i10) {
        c1886d5.m8236X();
        c1886d5.zzh.remove(i10);
    }

    /* renamed from: W */
    private final void m8235W() {
        InterfaceC1922f9 interfaceC1922f9 = this.zzg;
        if (!interfaceC1922f9.mo8387f()) {
            this.zzg = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
    }

    /* renamed from: X */
    private final void m8236X() {
        InterfaceC1922f9 interfaceC1922f9 = this.zzh;
        if (!interfaceC1922f9.mo8387f()) {
            this.zzh = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
    }

    /* renamed from: A */
    public final int m8237A() {
        return this.zze.size();
    }

    /* renamed from: B */
    public final C2008l4 m8238B(int i10) {
        return (C2008l4) this.zzg.get(i10);
    }

    /* renamed from: F */
    public final C1918f5 m8239F(int i10) {
        return (C1918f5) this.zzh.get(i10);
    }

    /* renamed from: G */
    public final List m8240G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List m8241H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List m8242I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List m8243J() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1870c5(null);
                }
                return new C1886d5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2008l4.class, "zzh", C1918f5.class});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8244x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int m8245y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final int m8246z() {
        return this.zzh.size();
    }
}
