package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* loaded from: classes.dex */
public final class C1853b4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1853b4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C1853b4 c1853b4 = new C1853b4();
        zza = c1853b4;
        AbstractC2222z8.m9405s(C1853b4.class, c1853b4);
    }

    private C1853b4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC2112s3 abstractC2112s3 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1837a4(abstractC2112s3);
                }
                return new C1853b4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
