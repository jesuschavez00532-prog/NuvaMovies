package kotlinx.coroutines.internal;

import ee.InterfaceC4184g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.z */
/* loaded from: classes3.dex */
public final class C5287z {

    /* renamed from: a */
    private Object[] f21515a;

    /* renamed from: b */
    private int f21516b;

    /* renamed from: c */
    private final InterfaceC4184g f21517c;

    public C5287z(InterfaceC4184g interfaceC4184g, int i10) {
        this.f21517c = interfaceC4184g;
        this.f21515a = new Object[i10];
    }

    /* renamed from: a */
    public final void m21284a(Object obj) {
        Object[] objArr = this.f21515a;
        int i10 = this.f21516b;
        this.f21516b = i10 + 1;
        objArr[i10] = obj;
    }

    /* renamed from: b */
    public final InterfaceC4184g m21285b() {
        return this.f21517c;
    }

    /* renamed from: c */
    public final void m21286c() {
        this.f21516b = 0;
    }

    /* renamed from: d */
    public final Object m21287d() {
        Object[] objArr = this.f21515a;
        int i10 = this.f21516b;
        this.f21516b = i10 + 1;
        return objArr[i10];
    }
}
