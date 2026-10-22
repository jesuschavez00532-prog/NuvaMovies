package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes.dex */
public final class C1896e implements Iterator {

    /* renamed from: a */
    private int f7708a = 0;

    /* renamed from: b */
    final /* synthetic */ C1912f f7709b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1896e(C1912f c1912f) {
        this.f7709b = c1912f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7708a < this.f7709b.m8358t()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7708a < this.f7709b.m8358t()) {
            C1912f c1912f = this.f7709b;
            int i10 = this.f7708a;
            this.f7708a = i10 + 1;
            return c1912f.m8359u(i10);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f7708a);
    }
}
