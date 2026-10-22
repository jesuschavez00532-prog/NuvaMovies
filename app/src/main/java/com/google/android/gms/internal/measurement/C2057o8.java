package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0272b;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o8 */
/* loaded from: classes.dex */
public final class C2057o8 {

    /* renamed from: b */
    private static volatile C2057o8 f7981b;

    /* renamed from: c */
    static final C2057o8 f7982c = new C2057o8(true);

    /* renamed from: a */
    private final Map f7983a = Collections.emptyMap();

    C2057o8(boolean z10) {
    }

    /* renamed from: a */
    public static C2057o8 m8755a() {
        C2057o8 c2057o8 = f7981b;
        if (c2057o8 != null) {
            return c2057o8;
        }
        synchronized (C2057o8.class) {
            C2057o8 c2057o82 = f7981b;
            if (c2057o82 != null) {
                return c2057o82;
            }
            C2057o8 m9010a = AbstractC2147u8.m9010a(C2057o8.class);
            f7981b = m9010a;
            return m9010a;
        }
    }

    /* renamed from: b */
    public final AbstractC2207y8 m8756b(InterfaceC1891da interfaceC1891da, int i10) {
        AbstractC0272b.m941a(this.f7983a.get(new C2042n8(interfaceC1891da, i10)));
        return null;
    }
}
