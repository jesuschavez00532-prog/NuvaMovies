package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes.dex */
final class C2108s implements Iterator {

    /* renamed from: a */
    private int f8047a = 0;

    /* renamed from: b */
    final /* synthetic */ C2138u f8048b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2108s(C2138u c2138u) {
        this.f8048b = c2138u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f8047a;
        str = this.f8048b.f8133a;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i10 = this.f8047a;
        str = this.f8048b.f8133a;
        if (i10 < str.length()) {
            this.f8047a = i10 + 1;
            return new C2138u(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
