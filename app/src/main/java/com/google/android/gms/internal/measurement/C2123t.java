package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes.dex */
final class C2123t implements Iterator {

    /* renamed from: a */
    private int f8061a = 0;

    /* renamed from: b */
    final /* synthetic */ C2138u f8062b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2123t(C2138u c2138u) {
        this.f8062b = c2138u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f8061a;
        str = this.f8062b.f8133a;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i10 = this.f8061a;
        C2138u c2138u = this.f8062b;
        str = c2138u.f8133a;
        if (i10 < str.length()) {
            str2 = c2138u.f8133a;
            this.f8061a = i10 + 1;
            return new C2138u(String.valueOf(str2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
