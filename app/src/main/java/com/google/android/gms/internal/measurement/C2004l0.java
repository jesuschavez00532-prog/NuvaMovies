package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* loaded from: classes.dex */
public final class C2004l0 extends AbstractC2183x {
    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        if (str != null && !str.isEmpty() && c2158v4.m9033h(str)) {
            InterfaceC2078q m9029d = c2158v4.m9029d(str);
            if (m9029d instanceof AbstractC1973j) {
                return ((AbstractC1973j) m9029d).mo8107a(c2158v4, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
