package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* loaded from: classes.dex */
public final class C1852b3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1852b3 zza;
    private int zze;
    private int zzf;
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();
    private InterfaceC1922f9 zzh = AbstractC2222z8.m9401n();
    private boolean zzi;
    private boolean zzj;

    static {
        C1852b3 c1852b3 = new C1852b3();
        zza = c1852b3;
        AbstractC2222z8.m9405s(C1852b3.class, c1852b3);
    }

    private C1852b3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m8119F(C1852b3 c1852b3, int i10, C2022m3 c2022m3) {
        c2022m3.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c1852b3.zzg;
        if (!interfaceC1922f9.mo8387f()) {
            c1852b3.zzg = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c1852b3.zzg.set(i10, c2022m3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m8120G(C1852b3 c1852b3, int i10, C1884d3 c1884d3) {
        c1884d3.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c1852b3.zzh;
        if (!interfaceC1922f9.mo8387f()) {
            c1852b3.zzh = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c1852b3.zzh.set(i10, c1884d3);
    }

    /* renamed from: B */
    public final C1884d3 m8121B(int i10) {
        return (C1884d3) this.zzh.get(i10);
    }

    /* renamed from: C */
    public final C2022m3 m8122C(int i10) {
        return (C2022m3) this.zzg.get(i10);
    }

    /* renamed from: D */
    public final List m8123D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final List m8124E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean m8125H() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC2216z2 abstractC2216z2 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1836a3(abstractC2216z2);
                }
                return new C1852b3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C2022m3.class, "zzh", C1884d3.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8127x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final int m8128y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int m8129z() {
        return this.zzg.size();
    }
}
