package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes.dex */
public final class C2068p4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2068p4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C2068p4 c2068p4 = new C2068p4();
        zza = c2068p4;
        AbstractC2222z8.m9405s(C2068p4.class, c2068p4);
    }

    private C2068p4() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m8762A(C2068p4 c2068p4, long j10) {
        c2068p4.zze |= 2;
        c2068p4.zzg = j10;
    }

    /* renamed from: x */
    public static C2053o4 m8763x() {
        return (C2053o4) zza.m9407t();
    }

    /* renamed from: z */
    public static /* synthetic */ void m8765z(C2068p4 c2068p4, String str) {
        str.getClass();
        c2068p4.zze |= 1;
        c2068p4.zzf = str;
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
                    return new C2053o4(null);
                }
                return new C2068p4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
