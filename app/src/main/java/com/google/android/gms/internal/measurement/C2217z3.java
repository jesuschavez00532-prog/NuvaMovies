package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes.dex */
public final class C2217z3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2217z3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private InterfaceC1922f9 zzi = AbstractC2222z8.m9401n();
    private InterfaceC1922f9 zzj = AbstractC2222z8.m9401n();
    private InterfaceC1922f9 zzk = AbstractC2222z8.m9401n();
    private String zzl = "";
    private InterfaceC1922f9 zzn = AbstractC2222z8.m9401n();
    private InterfaceC1922f9 zzo = AbstractC2222z8.m9401n();
    private String zzp = "";

    static {
        C2217z3 c2217z3 = new C2217z3();
        zza = c2217z3;
        AbstractC2222z8.m9405s(C2217z3.class, c2217z3);
    }

    private C2217z3() {
    }

    /* renamed from: B */
    public static C2202y3 m9375B() {
        return (C2202y3) zza.m9407t();
    }

    /* renamed from: D */
    public static C2217z3 m9377D() {
        return zza;
    }

    /* renamed from: K */
    public static /* synthetic */ void m9378K(C2217z3 c2217z3, int i10, C2187x3 c2187x3) {
        c2187x3.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c2217z3.zzj;
        if (!interfaceC1922f9.mo8387f()) {
            c2217z3.zzj = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c2217z3.zzj.set(i10, c2187x3);
    }

    /* renamed from: A */
    public final C2187x3 m9380A(int i10) {
        return (C2187x3) this.zzj.get(i10);
    }

    /* renamed from: E */
    public final String m9381E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String m9382F() {
        return this.zzp;
    }

    /* renamed from: G */
    public final List m9383G() {
        return this.zzk;
    }

    /* renamed from: H */
    public final List m9384H() {
        return this.zzo;
    }

    /* renamed from: I */
    public final List m9385I() {
        return this.zzn;
    }

    /* renamed from: J */
    public final List m9386J() {
        return this.zzi;
    }

    /* renamed from: M */
    public final boolean m9387M() {
        return this.zzm;
    }

    /* renamed from: N */
    public final boolean m9388N() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: O */
    public final boolean m9389O() {
        return (this.zze & 1) != 0;
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
                    return new C2202y3(null);
                }
                return new C2217z3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1885d4.class, "zzj", C2187x3.class, "zzk", C1852b3.class, "zzl", "zzm", "zzn", C2054o5.class, "zzo", C2157v3.class, "zzp"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m9390x() {
        return this.zzn.size();
    }

    /* renamed from: y */
    public final int m9391y() {
        return this.zzj.size();
    }

    /* renamed from: z */
    public final long m9392z() {
        return this.zzf;
    }
}
