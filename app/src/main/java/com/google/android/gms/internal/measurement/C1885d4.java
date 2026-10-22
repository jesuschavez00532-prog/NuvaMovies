package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes.dex */
public final class C1885d4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1885d4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C1885d4 c1885d4 = new C1885d4();
        zza = c1885d4;
        AbstractC2222z8.m9405s(C1885d4.class, c1885d4);
    }

    private C1885d4() {
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
                    return new C1869c4(abstractC2112s3);
                }
                return new C1885d4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final String m8220y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String m8221z() {
        return this.zzg;
    }
}
