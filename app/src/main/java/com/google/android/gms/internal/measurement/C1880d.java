package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes.dex */
final class C1880d implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f7698a;

    /* renamed from: b */
    final /* synthetic */ Iterator f7699b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1880d(C1912f c1912f, Iterator it, Iterator it2) {
        this.f7698a = it;
        this.f7699b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7698a.hasNext()) {
            return true;
        }
        return this.f7699b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7698a.hasNext()) {
            return new C2138u(((Integer) this.f7698a.next()).toString());
        }
        if (this.f7699b.hasNext()) {
            return new C2138u((String) this.f7699b.next());
        }
        throw new NoSuchElementException();
    }
}
