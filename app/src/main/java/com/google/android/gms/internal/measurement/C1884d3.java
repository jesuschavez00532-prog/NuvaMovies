package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d3 */
/* loaded from: classes.dex */
public final class C1884d3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1884d3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC1922f9 zzh = AbstractC2222z8.m9401n();
    private boolean zzi;
    private C1992k3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1884d3 c1884d3 = new C1884d3();
        zza = c1884d3;
        AbstractC2222z8.m9405s(C1884d3.class, c1884d3);
    }

    private C1884d3() {
    }

    /* renamed from: F */
    public static /* synthetic */ void m8204F(C1884d3 c1884d3, String str) {
        c1884d3.zze |= 2;
        c1884d3.zzg = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m8205G(C1884d3 c1884d3, int i10, C1916f3 c1916f3) {
        c1916f3.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c1884d3.zzh;
        if (!interfaceC1922f9.mo8387f()) {
            c1884d3.zzh = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c1884d3.zzh.set(i10, c1916f3);
    }

    /* renamed from: z */
    public static C1868c3 m8206z() {
        return (C1868c3) zza.m9407t();
    }

    /* renamed from: B */
    public final C1916f3 m8207B(int i10) {
        return (C1916f3) this.zzh.get(i10);
    }

    /* renamed from: C */
    public final C1992k3 m8208C() {
        C1992k3 c1992k3 = this.zzj;
        if (c1992k3 == null) {
            return C1992k3.m8565y();
        }
        return c1992k3;
    }

    /* renamed from: D */
    public final String m8209D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List m8210E() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m8211H() {
        return this.zzk;
    }

    /* renamed from: I */
    public final boolean m8212I() {
        return this.zzl;
    }

    /* renamed from: J */
    public final boolean m8213J() {
        return this.zzm;
    }

    /* renamed from: K */
    public final boolean m8214K() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: L */
    public final boolean m8215L() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: M */
    public final boolean m8216M() {
        return (this.zze & 64) != 0;
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
                    return new C1868c3(null);
                }
                return new C1884d3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1916f3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8217x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int m8218y() {
        return this.zzf;
    }
}
