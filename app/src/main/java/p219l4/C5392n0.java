package p219l4;

import android.os.IBinder;
import android.os.Parcel;
import p172i4.C4867h0;
import p172i4.C4871j0;
import p172i4.C4875l0;
import p325s4.InterfaceC6675a;
import p394x4.AbstractC7493a;
import p394x4.AbstractC7495c;

/* renamed from: l4.n0 */
/* loaded from: classes.dex */
public final class C5392n0 extends AbstractC7493a implements InterfaceC5398p0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5392n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p219l4.InterfaceC5398p0
    /* renamed from: H */
    public final C4871j0 mo21788H(C4867h0 c4867h0) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28699d(m28695d, c4867h0);
        Parcel m28694a = m28694a(6, m28695d);
        C4871j0 c4871j0 = (C4871j0) AbstractC7495c.m28696a(m28694a, C4871j0.CREATOR);
        m28694a.recycle();
        return c4871j0;
    }

    @Override // p219l4.InterfaceC5398p0
    /* renamed from: J */
    public final boolean mo21789J(C4875l0 c4875l0, InterfaceC6675a interfaceC6675a) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28699d(m28695d, c4875l0);
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        Parcel m28694a = m28694a(5, m28695d);
        boolean m28701f = AbstractC7495c.m28701f(m28694a);
        m28694a.recycle();
        return m28701f;
    }

    @Override // p219l4.InterfaceC5398p0
    /* renamed from: K */
    public final C4871j0 mo21790K(C4867h0 c4867h0) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28699d(m28695d, c4867h0);
        Parcel m28694a = m28694a(8, m28695d);
        C4871j0 c4871j0 = (C4871j0) AbstractC7495c.m28696a(m28694a, C4871j0.CREATOR);
        m28694a.recycle();
        return c4871j0;
    }

    @Override // p219l4.InterfaceC5398p0
    /* renamed from: i */
    public final boolean mo21791i() {
        Parcel m28694a = m28694a(7, m28695d());
        boolean m28701f = AbstractC7495c.m28701f(m28694a);
        m28694a.recycle();
        return m28701f;
    }
}
