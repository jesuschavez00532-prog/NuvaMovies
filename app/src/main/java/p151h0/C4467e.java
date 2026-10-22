package p151h0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0715f0;
import java.util.ArrayList;
import java.util.List;
import p151h0.AbstractC4485n;

/* renamed from: h0.e */
/* loaded from: classes.dex */
public class C4467e extends AbstractC0715f0 {

    /* renamed from: h0.e$a */
    /* loaded from: classes.dex */
    class a extends AbstractC4485n.e {

        /* renamed from: a */
        final /* synthetic */ Rect f19353a;

        a(Rect rect) {
            this.f19353a = rect;
        }
    }

    /* renamed from: h0.e$b */
    /* loaded from: classes.dex */
    class b implements AbstractC4485n.f {

        /* renamed from: a */
        final /* synthetic */ View f19355a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f19356b;

        b(View view, ArrayList arrayList) {
            this.f19355a = view;
            this.f19356b = arrayList;
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: a */
        public void mo18682a(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: b */
        public void mo18683b(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: c */
        public void mo18709c(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: d */
        public void mo18684d(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            abstractC4485n.mo18754R(this);
            this.f19355a.setVisibility(8);
            int size = this.f19356b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f19356b.get(i10)).setVisibility(0);
            }
        }
    }

    /* renamed from: h0.e$c */
    /* loaded from: classes.dex */
    class c extends AbstractC4487o {

        /* renamed from: a */
        final /* synthetic */ Object f19358a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f19359b;

        /* renamed from: c */
        final /* synthetic */ Object f19360c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f19361d;

        /* renamed from: e */
        final /* synthetic */ Object f19362e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f19363f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f19358a = obj;
            this.f19359b = arrayList;
            this.f19360c = obj2;
            this.f19361d = arrayList2;
            this.f19362e = obj3;
            this.f19363f = arrayList3;
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: c */
        public void mo18709c(AbstractC4485n abstractC4485n) {
            Object obj = this.f19358a;
            if (obj != null) {
                C4467e.this.mo3318q(obj, this.f19359b, null);
            }
            Object obj2 = this.f19360c;
            if (obj2 != null) {
                C4467e.this.mo3318q(obj2, this.f19361d, null);
            }
            Object obj3 = this.f19362e;
            if (obj3 != null) {
                C4467e.this.mo3318q(obj3, this.f19363f, null);
            }
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            abstractC4485n.mo18754R(this);
        }
    }

    /* renamed from: h0.e$d */
    /* loaded from: classes.dex */
    class d extends AbstractC4485n.e {

        /* renamed from: a */
        final /* synthetic */ Rect f19365a;

        d(Rect rect) {
            this.f19365a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m18708C(AbstractC4485n abstractC4485n) {
        if (AbstractC0715f0.m3332l(abstractC4485n.m18745B()) && AbstractC0715f0.m3332l(abstractC4485n.m18746C()) && AbstractC0715f0.m3332l(abstractC4485n.m18747D())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: A */
    public void mo3308A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C4493r c4493r = (C4493r) obj;
        if (c4493r != null) {
            c4493r.m18748E().clear();
            c4493r.m18748E().addAll(arrayList2);
            mo3318q(c4493r, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: B */
    public Object mo3309B(Object obj) {
        if (obj == null) {
            return null;
        }
        C4493r c4493r = new C4493r();
        c4493r.m18799i0((AbstractC4485n) obj);
        return c4493r;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: a */
    public void mo3310a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC4485n) obj).mo18762b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: b */
    public void mo3311b(Object obj, ArrayList arrayList) {
        AbstractC4485n abstractC4485n = (AbstractC4485n) obj;
        if (abstractC4485n == null) {
            return;
        }
        int i10 = 0;
        if (abstractC4485n instanceof C4493r) {
            C4493r c4493r = (C4493r) abstractC4485n;
            int m18801l0 = c4493r.m18801l0();
            while (i10 < m18801l0) {
                mo3311b(c4493r.m18800k0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (!m18708C(abstractC4485n) && AbstractC0715f0.m3332l(abstractC4485n.m18748E())) {
            int size = arrayList.size();
            while (i10 < size) {
                abstractC4485n.mo18762b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: c */
    public void mo3312c(ViewGroup viewGroup, Object obj) {
        AbstractC4489p.m18783a(viewGroup, (AbstractC4485n) obj);
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: e */
    public boolean mo3313e(Object obj) {
        return obj instanceof AbstractC4485n;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: g */
    public Object mo3314g(Object obj) {
        if (obj != null) {
            return ((AbstractC4485n) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: m */
    public Object mo3315m(Object obj, Object obj2, Object obj3) {
        AbstractC4485n abstractC4485n = (AbstractC4485n) obj;
        AbstractC4485n abstractC4485n2 = (AbstractC4485n) obj2;
        AbstractC4485n abstractC4485n3 = (AbstractC4485n) obj3;
        if (abstractC4485n != null && abstractC4485n2 != null) {
            abstractC4485n = new C4493r().m18799i0(abstractC4485n).m18799i0(abstractC4485n2).m18806q0(1);
        } else if (abstractC4485n == null) {
            if (abstractC4485n2 != null) {
                abstractC4485n = abstractC4485n2;
            } else {
                abstractC4485n = null;
            }
        }
        if (abstractC4485n3 != null) {
            C4493r c4493r = new C4493r();
            if (abstractC4485n != null) {
                c4493r.m18799i0(abstractC4485n);
            }
            c4493r.m18799i0(abstractC4485n3);
            return c4493r;
        }
        return abstractC4485n;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: n */
    public Object mo3316n(Object obj, Object obj2, Object obj3) {
        C4493r c4493r = new C4493r();
        if (obj != null) {
            c4493r.m18799i0((AbstractC4485n) obj);
        }
        if (obj2 != null) {
            c4493r.m18799i0((AbstractC4485n) obj2);
        }
        if (obj3 != null) {
            c4493r.m18799i0((AbstractC4485n) obj3);
        }
        return c4493r;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: p */
    public void mo3317p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC4485n) obj).mo18755U(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: q */
    public void mo3318q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        AbstractC4485n abstractC4485n = (AbstractC4485n) obj;
        int i10 = 0;
        if (abstractC4485n instanceof C4493r) {
            C4493r c4493r = (C4493r) abstractC4485n;
            int m18801l0 = c4493r.m18801l0();
            while (i10 < m18801l0) {
                mo3318q(c4493r.m18800k0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (!m18708C(abstractC4485n)) {
            List m18748E = abstractC4485n.m18748E();
            if (m18748E.size() == arrayList.size() && m18748E.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    abstractC4485n.mo18762b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    abstractC4485n.mo18755U((View) arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: r */
    public void mo3319r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC4485n) obj).mo18760a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: t */
    public void mo3320t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC4485n) obj).mo18760a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: u */
    public void mo3321u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC4485n) obj).mo18759Z(new d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: v */
    public void mo3322v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3335k(view, rect);
            ((AbstractC4485n) obj).mo18759Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: z */
    public void mo3324z(Object obj, View view, ArrayList arrayList) {
        C4493r c4493r = (C4493r) obj;
        List m18748E = c4493r.m18748E();
        m18748E.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0715f0.m3329d(m18748E, (View) arrayList.get(i10));
        }
        m18748E.add(view);
        arrayList.add(view);
        mo3311b(c4493r, arrayList);
    }
}
