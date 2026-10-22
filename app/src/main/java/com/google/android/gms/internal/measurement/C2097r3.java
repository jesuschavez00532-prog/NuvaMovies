package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes.dex */
public final class C2097r3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2097r3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC1922f9 zzi = AbstractC2222z8.m9401n();

    static {
        C2097r3 c2097r3 = new C2097r3();
        zza = c2097r3;
        AbstractC2222z8.m9405s(C2097r3.class, c2097r3);
    }

    private C2097r3() {
    }

    /* renamed from: z */
    public static C2097r3 m8868z() {
        return zza;
    }

    /* renamed from: A */
    public final String m8869A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final List m8870B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean m8871C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean m8872D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m8873E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean m8874F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final int m8875G() {
        int m8781a = AbstractC2082q3.m8781a(this.zzf);
        if (m8781a == 0) {
            return 1;
        }
        return m8781a;
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
                    return new C2037n3(null);
                }
                return new C2097r3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C2067p3.f7993a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8876x() {
        return this.zzi.size();
    }
}
