package p151h0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p151h0.AbstractC4485n;

/* renamed from: h0.r */
/* loaded from: classes.dex */
public class C4493r extends AbstractC4485n {

    /* renamed from: L */
    int f19454L;

    /* renamed from: J */
    private ArrayList f19452J = new ArrayList();

    /* renamed from: K */
    private boolean f19453K = true;

    /* renamed from: M */
    boolean f19455M = false;

    /* renamed from: N */
    private int f19456N = 0;

    /* renamed from: h0.r$a */
    /* loaded from: classes.dex */
    class a extends AbstractC4487o {

        /* renamed from: a */
        final /* synthetic */ AbstractC4485n f19457a;

        a(AbstractC4485n abstractC4485n) {
            this.f19457a = abstractC4485n;
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            this.f19457a.mo18757X();
            abstractC4485n.mo18754R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.r$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC4487o {

        /* renamed from: a */
        C4493r f19459a;

        b(C4493r c4493r) {
            this.f19459a = c4493r;
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: c */
        public void mo18709c(AbstractC4485n abstractC4485n) {
            C4493r c4493r = this.f19459a;
            if (!c4493r.f19455M) {
                c4493r.m18766e0();
                this.f19459a.f19455M = true;
            }
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            C4493r c4493r = this.f19459a;
            int i10 = c4493r.f19454L - 1;
            c4493r.f19454L = i10;
            if (i10 == 0) {
                c4493r.f19455M = false;
                c4493r.m18774r();
            }
            abstractC4485n.mo18754R(this);
        }
    }

    /* renamed from: j0 */
    private void m18795j0(AbstractC4485n abstractC4485n) {
        this.f19452J.add(abstractC4485n);
        abstractC4485n.f19405r = this;
    }

    /* renamed from: s0 */
    private void m18796s0() {
        b bVar = new b(this);
        Iterator it = this.f19452J.iterator();
        while (it.hasNext()) {
            ((AbstractC4485n) it.next()).mo18760a(bVar);
        }
        this.f19454L = this.f19452J.size();
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: P */
    public void mo18752P(View view) {
        super.mo18752P(view);
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18752P(view);
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: V */
    public void mo18756V(View view) {
        super.mo18756V(view);
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18756V(view);
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: X */
    protected void mo18757X() {
        if (this.f19452J.isEmpty()) {
            m18766e0();
            m18774r();
            return;
        }
        m18796s0();
        if (!this.f19453K) {
            for (int i10 = 1; i10 < this.f19452J.size(); i10++) {
                ((AbstractC4485n) this.f19452J.get(i10 - 1)).mo18760a(new a((AbstractC4485n) this.f19452J.get(i10)));
            }
            AbstractC4485n abstractC4485n = (AbstractC4485n) this.f19452J.get(0);
            if (abstractC4485n != null) {
                abstractC4485n.mo18757X();
                return;
            }
            return;
        }
        Iterator it = this.f19452J.iterator();
        while (it.hasNext()) {
            ((AbstractC4485n) it.next()).mo18757X();
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: Z */
    public void mo18759Z(AbstractC4485n.e eVar) {
        super.mo18759Z(eVar);
        this.f19456N |= 8;
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18759Z(eVar);
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: b0 */
    public void mo18763b0(AbstractC4473h abstractC4473h) {
        super.mo18763b0(abstractC4473h);
        this.f19456N |= 4;
        if (this.f19452J != null) {
            for (int i10 = 0; i10 < this.f19452J.size(); i10++) {
                ((AbstractC4485n) this.f19452J.get(i10)).mo18763b0(abstractC4473h);
            }
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: c0 */
    public void mo18764c0(AbstractC4491q abstractC4491q) {
        super.mo18764c0(abstractC4491q);
        this.f19456N |= 2;
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18764c0(abstractC4491q);
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: f0 */
    String mo18768f0(String str) {
        String mo18768f0 = super.mo18768f0(str);
        for (int i10 = 0; i10 < this.f19452J.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo18768f0);
            sb2.append("\n");
            sb2.append(((AbstractC4485n) this.f19452J.get(i10)).mo18768f0(str + "  "));
            mo18768f0 = sb2.toString();
        }
        return mo18768f0;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: g */
    public void mo18667g(C4497u c4497u) {
        if (m18751I(c4497u.f19464b)) {
            Iterator it = this.f19452J.iterator();
            while (it.hasNext()) {
                AbstractC4485n abstractC4485n = (AbstractC4485n) it.next();
                if (abstractC4485n.m18751I(c4497u.f19464b)) {
                    abstractC4485n.mo18667g(c4497u);
                    c4497u.f19465c.add(abstractC4485n);
                }
            }
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18760a(AbstractC4485n.f fVar) {
        return (C4493r) super.mo18760a(fVar);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18762b(View view) {
        for (int i10 = 0; i10 < this.f19452J.size(); i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18762b(view);
        }
        return (C4493r) super.mo18762b(view);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: i */
    void mo18769i(C4497u c4497u) {
        super.mo18769i(c4497u);
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18769i(c4497u);
        }
    }

    /* renamed from: i0 */
    public C4493r m18799i0(AbstractC4485n abstractC4485n) {
        m18795j0(abstractC4485n);
        long j10 = this.f19390c;
        if (j10 >= 0) {
            abstractC4485n.mo18758Y(j10);
        }
        if ((this.f19456N & 1) != 0) {
            abstractC4485n.mo18761a0(m18777u());
        }
        if ((this.f19456N & 2) != 0) {
            m18781y();
            abstractC4485n.mo18764c0(null);
        }
        if ((this.f19456N & 4) != 0) {
            abstractC4485n.mo18763b0(m18780x());
        }
        if ((this.f19456N & 8) != 0) {
            abstractC4485n.mo18759Z(m18776t());
        }
        return this;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: j */
    public void mo18668j(C4497u c4497u) {
        if (m18751I(c4497u.f19464b)) {
            Iterator it = this.f19452J.iterator();
            while (it.hasNext()) {
                AbstractC4485n abstractC4485n = (AbstractC4485n) it.next();
                if (abstractC4485n.m18751I(c4497u.f19464b)) {
                    abstractC4485n.mo18668j(c4497u);
                    c4497u.f19465c.add(abstractC4485n);
                }
            }
        }
    }

    /* renamed from: k0 */
    public AbstractC4485n m18800k0(int i10) {
        if (i10 >= 0 && i10 < this.f19452J.size()) {
            return (AbstractC4485n) this.f19452J.get(i10);
        }
        return null;
    }

    /* renamed from: l0 */
    public int m18801l0() {
        return this.f19452J.size();
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4485n clone() {
        C4493r c4493r = (C4493r) super.clone();
        c4493r.f19452J = new ArrayList();
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            c4493r.m18795j0(((AbstractC4485n) this.f19452J.get(i10)).clone());
        }
        return c4493r;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18754R(AbstractC4485n.f fVar) {
        return (C4493r) super.mo18754R(fVar);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18755U(View view) {
        for (int i10 = 0; i10 < this.f19452J.size(); i10++) {
            ((AbstractC4485n) this.f19452J.get(i10)).mo18755U(view);
        }
        return (C4493r) super.mo18755U(view);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18758Y(long j10) {
        ArrayList arrayList;
        super.mo18758Y(j10);
        if (this.f19390c >= 0 && (arrayList = this.f19452J) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4485n) this.f19452J.get(i10)).mo18758Y(j10);
            }
        }
        return this;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: p */
    protected void mo18773p(ViewGroup viewGroup, C4498v c4498v, C4498v c4498v2, ArrayList arrayList, ArrayList arrayList2) {
        long m18744A = m18744A();
        int size = this.f19452J.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4485n abstractC4485n = (AbstractC4485n) this.f19452J.get(i10);
            if (m18744A > 0 && (this.f19453K || i10 == 0)) {
                long m18744A2 = abstractC4485n.m18744A();
                if (m18744A2 > 0) {
                    abstractC4485n.mo18765d0(m18744A2 + m18744A);
                } else {
                    abstractC4485n.mo18765d0(m18744A);
                }
            }
            abstractC4485n.mo18773p(viewGroup, c4498v, c4498v2, arrayList, arrayList2);
        }
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18761a0(TimeInterpolator timeInterpolator) {
        this.f19456N |= 1;
        ArrayList arrayList = this.f19452J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4485n) this.f19452J.get(i10)).mo18761a0(timeInterpolator);
            }
        }
        return (C4493r) super.mo18761a0(timeInterpolator);
    }

    /* renamed from: q0 */
    public C4493r m18806q0(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f19453K = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
        } else {
            this.f19453K = true;
        }
        return this;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C4493r mo18765d0(long j10) {
        return (C4493r) super.mo18765d0(j10);
    }
}
