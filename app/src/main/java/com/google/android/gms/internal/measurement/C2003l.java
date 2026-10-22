package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes.dex */
public final class C2003l implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f7860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2003l(Iterator it) {
        this.f7860a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7860a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2138u((String) this.f7860a.next());
    }
}
