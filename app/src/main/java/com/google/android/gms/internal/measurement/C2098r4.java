package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes.dex */
public final class C2098r4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2098r4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC1922f9 zzk = AbstractC2222z8.m9401n();

    static {
        C2098r4 c2098r4 = new C2098r4();
        zza = c2098r4;
        AbstractC2222z8.m9405s(C2098r4.class, c2098r4);
    }

    private C2098r4() {
    }

    /* renamed from: B */
    public static C2083q4 m8877B() {
        return (C2083q4) zza.m9407t();
    }

    /* renamed from: G */
    public static /* synthetic */ void m8879G(C2098r4 c2098r4, String str) {
        str.getClass();
        c2098r4.zze |= 1;
        c2098r4.zzf = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m8880H(C2098r4 c2098r4, String str) {
        str.getClass();
        c2098r4.zze |= 2;
        c2098r4.zzg = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m8881I(C2098r4 c2098r4) {
        c2098r4.zze &= -3;
        c2098r4.zzg = zza.zzg;
    }

    /* renamed from: J */
    public static /* synthetic */ void m8882J(C2098r4 c2098r4, long j10) {
        c2098r4.zze |= 4;
        c2098r4.zzh = j10;
    }

    /* renamed from: K */
    public static /* synthetic */ void m8883K(C2098r4 c2098r4) {
        c2098r4.zze &= -5;
        c2098r4.zzh = 0L;
    }

    /* renamed from: L */
    public static /* synthetic */ void m8884L(C2098r4 c2098r4, double d10) {
        c2098r4.zze |= 16;
        c2098r4.zzj = d10;
    }

    /* renamed from: M */
    public static /* synthetic */ void m8885M(C2098r4 c2098r4) {
        c2098r4.zze &= -17;
        c2098r4.zzj = 0.0d;
    }

    /* renamed from: N */
    public static /* synthetic */ void m8886N(C2098r4 c2098r4, C2098r4 c2098r42) {
        c2098r42.getClass();
        c2098r4.m8889X();
        c2098r4.zzk.add(c2098r42);
    }

    /* renamed from: O */
    public static /* synthetic */ void m8887O(C2098r4 c2098r4, Iterable iterable) {
        c2098r4.m8889X();
        AbstractC2026m7.m8701h(iterable, c2098r4.zzk);
    }

    /* renamed from: X */
    private final void m8889X() {
        InterfaceC1922f9 interfaceC1922f9 = this.zzk;
        if (!interfaceC1922f9.mo8387f()) {
            this.zzk = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
    }

    /* renamed from: A */
    public final long m8890A() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String m8891D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String m8892E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List m8893F() {
        return this.zzk;
    }

    /* renamed from: Q */
    public final boolean m8894Q() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: R */
    public final boolean m8895R() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: U */
    public final boolean m8896U() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: V */
    public final boolean m8897V() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: W */
    public final boolean m8898W() {
        return (this.zze & 2) != 0;
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
                    return new C2083q4(null);
                }
                return new C2098r4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2098r4.class});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final double m8899x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final float m8900y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final int m8901z() {
        return this.zzk.size();
    }
}
