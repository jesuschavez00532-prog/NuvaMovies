package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ya */
/* loaded from: classes.dex */
final class C2209ya implements Iterator {

    /* renamed from: a */
    final Iterator f8285a;

    /* renamed from: b */
    final /* synthetic */ C2224za f8286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2209ya(C2224za c2224za) {
        InterfaceC2013l9 interfaceC2013l9;
        this.f8286b = c2224za;
        interfaceC2013l9 = c2224za.f8310a;
        this.f8285a = interfaceC2013l9.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8285a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8285a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
