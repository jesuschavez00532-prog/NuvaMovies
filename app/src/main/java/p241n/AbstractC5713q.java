package p241n;

import java.util.ArrayList;
import p228m.C5560c;

/* renamed from: n.q */
/* loaded from: classes.dex */
public abstract class AbstractC5713q extends C5702f {

    /* renamed from: v0 */
    protected ArrayList f22936v0 = new ArrayList();

    @Override // p241n.C5702f
    /* renamed from: F0 */
    public void mo22954F0() {
        super.mo22954F0();
        ArrayList arrayList = this.f22936v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5702f c5702f = (C5702f) this.f22936v0.get(i10);
            c5702f.mo22996n0(m22999p(), m23001q());
            if (!(c5702f instanceof C5703g)) {
                c5702f.mo22954F0();
            }
        }
    }

    /* renamed from: I0 */
    public void m23084I0(C5702f c5702f) {
        this.f22936v0.add(c5702f);
        if (c5702f.m23009u() != null) {
            ((AbstractC5713q) c5702f.m23009u()).m23086L0(c5702f);
        }
        c5702f.m23000p0(this);
    }

    /* renamed from: J0 */
    public C5703g m23085J0() {
        C5703g c5703g;
        C5702f m23009u = m23009u();
        if (this instanceof C5703g) {
            c5703g = (C5703g) this;
        } else {
            c5703g = null;
        }
        while (m23009u != null) {
            C5702f m23009u2 = m23009u.m23009u();
            if (m23009u instanceof C5703g) {
                c5703g = (C5703g) m23009u;
            }
            m23009u = m23009u2;
        }
        return c5703g;
    }

    /* renamed from: K0 */
    public abstract void mo23024K0();

    /* renamed from: L0 */
    public void m23086L0(C5702f c5702f) {
        this.f22936v0.remove(c5702f);
        c5702f.m23000p0(null);
    }

    /* renamed from: M0 */
    public void m23087M0() {
        this.f22936v0.clear();
    }

    @Override // p241n.C5702f
    /* renamed from: Q */
    public void mo22966Q() {
        this.f22936v0.clear();
        super.mo22966Q();
    }

    @Override // p241n.C5702f
    /* renamed from: T */
    public void mo22968T(C5560c c5560c) {
        super.mo22968T(c5560c);
        int size = this.f22936v0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C5702f) this.f22936v0.get(i10)).mo22968T(c5560c);
        }
    }

    @Override // p241n.C5702f
    /* renamed from: n0 */
    public void mo22996n0(int i10, int i11) {
        super.mo22996n0(i10, i11);
        int size = this.f22936v0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((C5702f) this.f22936v0.get(i12)).mo22996n0(m23019z(), m22943A());
        }
    }
}
