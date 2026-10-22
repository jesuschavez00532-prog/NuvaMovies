package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes.dex */
final class C2432s implements Iterator {

    /* renamed from: a */
    final Iterator f9048a;

    /* renamed from: b */
    final /* synthetic */ C2443t f9049b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2432s(C2443t c2443t) {
        Bundle bundle;
        this.f9049b = c2443t;
        bundle = c2443t.f9068a;
        this.f9048a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f9048a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9048a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
