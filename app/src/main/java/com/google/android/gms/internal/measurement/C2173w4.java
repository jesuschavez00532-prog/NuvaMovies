package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
/* loaded from: classes.dex */
public final class C2173w4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2173w4 zza;
    private InterfaceC1922f9 zze = AbstractC2222z8.m9401n();

    static {
        C2173w4 c2173w4 = new C2173w4();
        zza = c2173w4;
        AbstractC2222z8.m9405s(C2173w4.class, c2173w4);
    }

    private C2173w4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m9066B(C2173w4 c2173w4, C2203y4 c2203y4) {
        c2203y4.getClass();
        InterfaceC1922f9 interfaceC1922f9 = c2173w4.zze;
        if (!interfaceC1922f9.mo8387f()) {
            c2173w4.zze = AbstractC2222z8.m9402o(interfaceC1922f9);
        }
        c2173w4.zze.add(c2203y4);
    }

    /* renamed from: x */
    public static C2143u4 m9067x() {
        return (C2143u4) zza.m9407t();
    }

    /* renamed from: A */
    public final List m9069A() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC1901e4 abstractC1901e4 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2143u4(abstractC1901e4);
                }
                return new C2173w4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2203y4.class});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final C2203y4 m9070z(int i10) {
        return (C2203y4) this.zze.get(0);
    }
}
