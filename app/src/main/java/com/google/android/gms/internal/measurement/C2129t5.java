package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* loaded from: classes.dex */
public final class C2129t5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2129t5 zza;
    private int zze;
    private int zzf;
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C2129t5 c2129t5 = new C2129t5();
        zza = c2129t5;
        AbstractC2222z8.m9405s(C2129t5.class, c2129t5);
    }

    private C2129t5() {
    }

    /* renamed from: A */
    public final String m8954A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final List m8955B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m8956C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final boolean m8957D() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: E */
    public final boolean m8958E() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: F */
    public final boolean m8959F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final int m8960G() {
        int m8911a = AbstractC2114s5.m8911a(this.zzf);
        if (m8911a == 0) {
            return 1;
        }
        return m8911a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC1964i5 abstractC1964i5 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2069p5(abstractC1964i5);
                }
                return new C2129t5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C2099r5.f8038a, "zzg", C2129t5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final double m8961x() {
        return this.zzk;
    }

    /* renamed from: z */
    public final String m8962z() {
        return this.zzh;
    }
}
