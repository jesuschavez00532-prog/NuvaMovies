package ve;

import android.support.v4.media.session.AbstractC0272b;
import ee.InterfaceC4184g;

/* renamed from: ve.u1 */
/* loaded from: classes3.dex */
public final class C7322u1 extends AbstractC7329x {

    /* renamed from: b */
    public static final C7322u1 f27230b = new C7322u1();

    private C7322u1() {
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        AbstractC0272b.m941a(interfaceC4184g.get(AbstractC7328w1.f27235a));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // ve.AbstractC7329x
    /* renamed from: y */
    public boolean mo21240y(InterfaceC4184g interfaceC4184g) {
        return false;
    }
}
