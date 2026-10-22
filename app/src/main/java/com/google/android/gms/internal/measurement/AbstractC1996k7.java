package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* loaded from: classes.dex */
public abstract class AbstractC1996k7 {
    /* renamed from: a */
    public static InterfaceC1936g7 m8583a(InterfaceC1936g7 interfaceC1936g7) {
        if (!(interfaceC1936g7 instanceof C1966i7) && !(interfaceC1936g7 instanceof C1951h7)) {
            if (interfaceC1936g7 instanceof Serializable) {
                return new C1951h7(interfaceC1936g7);
            }
            return new C1966i7(interfaceC1936g7);
        }
        return interfaceC1936g7;
    }

    /* renamed from: b */
    public static InterfaceC1936g7 m8584b(Object obj) {
        return new C1981j7(obj);
    }
}
