package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes.dex */
public final class C2024m5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2024m5 zza;
    private int zze;
    private String zzf = "";
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();

    static {
        C2024m5 c2024m5 = new C2024m5();
        zza = c2024m5;
        AbstractC2222z8.m9405s(C2024m5.class, c2024m5);
    }

    private C2024m5() {
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
                    return new C2009l5(null);
                }
                return new C2024m5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C2129t5.class});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final String m8698y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final List m8699z() {
        return this.zzg;
    }
}
