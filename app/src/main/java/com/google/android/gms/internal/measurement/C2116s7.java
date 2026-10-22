package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s7 */
/* loaded from: classes.dex */
final class C2116s7 extends AbstractC2146u7 {

    /* renamed from: a */
    private int f8054a = 0;

    /* renamed from: b */
    private final int f8055b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1873c8 f8056c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2116s7(AbstractC1873c8 abstractC1873c8) {
        this.f8056c = abstractC1873c8;
        this.f8055b = abstractC1873c8.mo8182i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2176w7
    /* renamed from: a */
    public final byte mo8912a() {
        int i10 = this.f8054a;
        if (i10 < this.f8055b) {
            this.f8054a = i10 + 1;
            return this.f8056c.mo8181g(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8054a < this.f8055b;
    }
}
