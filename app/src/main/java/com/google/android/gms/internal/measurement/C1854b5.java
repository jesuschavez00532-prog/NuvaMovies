package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
/* loaded from: classes.dex */
public final class C1854b5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1854b5 zza;
    private int zze;
    private int zzf = 1;
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();

    static {
        C1854b5 c1854b5 = new C1854b5();
        zza = c1854b5;
        AbstractC2222z8.m9405s(C1854b5.class, c1854b5);
    }

    private C1854b5() {
    }

    /* renamed from: x */
    public static C2218z4 m8131x() {
        return (C2218z4) zza.m9407t();
    }

    /* renamed from: z */
    public static /* synthetic */ void m8133z(C1854b5 c1854b5, C2068p4 c2068p4) {
        c2068p4.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c1854b5.zzg;
        if (!interfaceC1922f9.mo8387f()) {
            c1854b5.zzg = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c1854b5.zzg.add(c2068p4);
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
                    return new C2218z4(null);
                }
                return new C1854b5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C1838a5.f7650a, "zzg", C2068p4.class});
        }
        return (byte) 1;
    }
}
