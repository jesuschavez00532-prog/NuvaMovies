package kotlinx.coroutines.internal;

import p043ce.AbstractC1494g;

/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: classes3.dex */
public class C5262a {

    /* renamed from: a */
    private Object[] f21462a = new Object[16];

    /* renamed from: b */
    private int f21463b;

    /* renamed from: c */
    private int f21464c;

    /* renamed from: b */
    private final void m21168b() {
        Object[] objArr = this.f21462a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        AbstractC1494g.m6950c(objArr, objArr2, 0, this.f21463b, 0, 10, null);
        Object[] objArr3 = this.f21462a;
        int length2 = objArr3.length;
        int i10 = this.f21463b;
        AbstractC1494g.m6950c(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f21462a = objArr2;
        this.f21463b = 0;
        this.f21464c = length;
    }

    /* renamed from: a */
    public final void m21169a(Object obj) {
        Object[] objArr = this.f21462a;
        int i10 = this.f21464c;
        objArr[i10] = obj;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f21464c = length;
        if (length == this.f21463b) {
            m21168b();
        }
    }

    /* renamed from: c */
    public final boolean m21170c() {
        if (this.f21463b == this.f21464c) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Object m21171d() {
        int i10 = this.f21463b;
        if (i10 == this.f21464c) {
            return null;
        }
        Object[] objArr = this.f21462a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f21463b = (i10 + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }
}
