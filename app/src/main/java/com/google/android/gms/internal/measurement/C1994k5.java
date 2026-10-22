package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
/* loaded from: classes.dex */
public final class C1994k5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1994k5 zza;
    private InterfaceC1922f9 zze = AbstractC2222z8.m9401n();

    static {
        C1994k5 c1994k5 = new C1994k5();
        zza = c1994k5;
        AbstractC2222z8.m9405s(C1994k5.class, c1994k5);
    }

    private C1994k5() {
    }

    /* renamed from: z */
    public static C1994k5 m8579z() {
        return zza;
    }

    /* renamed from: A */
    public final List m8580A() {
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
                    return new C1979j5(null);
                }
                return new C1994k5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2024m5.class});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8581x() {
        return this.zze.size();
    }
}
