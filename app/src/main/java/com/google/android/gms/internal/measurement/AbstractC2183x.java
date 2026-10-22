package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes.dex */
public abstract class AbstractC2183x {

    /* renamed from: a */
    final List f8243a = new ArrayList();

    /* renamed from: a */
    public abstract InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC2078q m9087b(String str) {
        if (this.f8243a.contains(AbstractC2174w5.m9075e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
