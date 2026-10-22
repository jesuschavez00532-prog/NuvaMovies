package com.google.android.gms.measurement.internal;

import p025b5.AbstractC1102d;

/* renamed from: com.google.android.gms.measurement.internal.b3 */
/* loaded from: classes.dex */
public final class C2249b3 {

    /* renamed from: h */
    private static final Object f8378h = new Object();

    /* renamed from: a */
    private final String f8379a;

    /* renamed from: b */
    private final InterfaceC2501y2 f8380b;

    /* renamed from: c */
    private final Object f8381c;

    /* renamed from: d */
    private final Object f8382d;

    /* renamed from: e */
    private final Object f8383e = new Object();

    /* renamed from: f */
    private volatile Object f8384f = null;

    /* renamed from: g */
    private volatile Object f8385g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2249b3(String str, Object obj, Object obj2, InterfaceC2501y2 interfaceC2501y2, AbstractC1102d abstractC1102d) {
        this.f8379a = str;
        this.f8381c = obj;
        this.f8382d = obj2;
        this.f8380b = interfaceC2501y2;
    }

    /* renamed from: a */
    public final Object m9456a(Object obj) {
        Object obj2;
        synchronized (this.f8383e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2512z2.f9246a == null) {
            return this.f8381c;
        }
        synchronized (f8378h) {
            if (C2256c.m9513a()) {
                if (this.f8385g == null) {
                    obj2 = this.f8381c;
                } else {
                    obj2 = this.f8385g;
                }
                return obj2;
            }
            try {
                for (C2249b3 c2249b3 : AbstractC2260c3.m9515b()) {
                    if (!C2256c.m9513a()) {
                        Object obj3 = null;
                        try {
                            InterfaceC2501y2 interfaceC2501y2 = c2249b3.f8380b;
                            if (interfaceC2501y2 != null) {
                                obj3 = interfaceC2501y2.mo9418a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f8378h) {
                            c2249b3.f8385g = obj3;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC2501y2 interfaceC2501y22 = this.f8380b;
            if (interfaceC2501y22 == null) {
                return this.f8381c;
            }
            try {
                return interfaceC2501y22.mo9418a();
            } catch (IllegalStateException unused3) {
                return this.f8381c;
            } catch (SecurityException unused4) {
                return this.f8381c;
            }
        }
    }

    /* renamed from: b */
    public final String m9457b() {
        return this.f8379a;
    }
}
