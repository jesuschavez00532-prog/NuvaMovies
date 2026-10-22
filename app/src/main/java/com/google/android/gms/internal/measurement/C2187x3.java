package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* loaded from: classes.dex */
public final class C2187x3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2187x3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C2187x3 c2187x3 = new C2187x3();
        zza = c2187x3;
        AbstractC2222z8.m9405s(C2187x3.class, c2187x3);
    }

    private C2187x3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m9089A(C2187x3 c2187x3, String str) {
        str.getClass();
        c2187x3.zze |= 1;
        c2187x3.zzf = str;
    }

    /* renamed from: B */
    public final boolean m9091B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m9092C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean m9093D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean m9094E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean m9095F() {
        return (this.zze & 8) != 0;
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
                    return new C2172w3(abstractC2112s3);
                }
                return new C2187x3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m9096x() {
        return this.zzi;
    }

    /* renamed from: z */
    public final String m9097z() {
        return this.zzf;
    }
}
