package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
/* loaded from: classes.dex */
public final class C1918f5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1918f5 zza;
    private int zze;
    private int zzf;
    private InterfaceC1906e9 zzg = AbstractC2222z8.m9399l();

    static {
        C1918f5 c1918f5 = new C1918f5();
        zza = c1918f5;
        AbstractC2222z8.m9405s(C1918f5.class, c1918f5);
    }

    private C1918f5() {
    }

    /* renamed from: A */
    public static C1902e5 m8377A() {
        return (C1902e5) zza.m9407t();
    }

    /* renamed from: D */
    public static /* synthetic */ void m8379D(C1918f5 c1918f5, int i10) {
        c1918f5.zze |= 1;
        c1918f5.zzf = i10;
    }

    /* renamed from: E */
    public static /* synthetic */ void m8380E(C1918f5 c1918f5, Iterable iterable) {
        InterfaceC1906e9 interfaceC1906e9 = c1918f5.zzg;
        if (!interfaceC1906e9.mo8387f()) {
            c1918f5.zzg = AbstractC2222z8.m9400m(interfaceC1906e9);
        }
        AbstractC2026m7.m8701h(iterable, c1918f5.zzg);
    }

    /* renamed from: C */
    public final List m8381C() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean m8382F() {
        return (this.zze & 1) != 0;
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
                    return new C1902e5(null);
                }
                return new C1918f5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8383x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int m8384y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final long m8385z(int i10) {
        return this.zzg.mo8291a(i10);
    }
}
