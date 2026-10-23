package p151h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.AbstractC0616q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p214l.C5303a;
import p214l.C5308f;

/* renamed from: h0.n */
/* loaded from: classes.dex */
public abstract class AbstractC4485n implements Cloneable {

    /* renamed from: G */
    private static final int[] f19379G = {2, 1, 3, 4};

    /* renamed from: H */
    private static final AbstractC4473h f19380H = new a();

    /* renamed from: I */
    private static ThreadLocal f19381I = new ThreadLocal();

    /* renamed from: D */
    private e f19385D;

    /* renamed from: E */
    private C5303a f19386E;

    /* renamed from: t */
    private ArrayList f19407t;

    /* renamed from: u */
    private ArrayList f19408u;

    /* renamed from: a */
    private String f19388a = getClass().getName();

    /* renamed from: b */
    private long f19389b = -1;

    /* renamed from: c */
    long f19390c = -1;

    /* renamed from: d */
    private TimeInterpolator f19391d = null;

    /* renamed from: e */
    ArrayList f19392e = new ArrayList();

    /* renamed from: f */
    ArrayList f19393f = new ArrayList();

    /* renamed from: g */
    private ArrayList f19394g = null;

    /* renamed from: h */
    private ArrayList f19395h = null;

    /* renamed from: i */
    private ArrayList f19396i = null;

    /* renamed from: j */
    private ArrayList f19397j = null;

    /* renamed from: k */
    private ArrayList f19398k = null;

    /* renamed from: l */
    private ArrayList f19399l = null;

    /* renamed from: m */
    private ArrayList f19400m = null;

    /* renamed from: n */
    private ArrayList f19401n = null;

    /* renamed from: o */
    private ArrayList f19402o = null;

    /* renamed from: p */
    private C4498v f19403p = new C4498v();

    /* renamed from: q */
    private C4498v f19404q = new C4498v();

    /* renamed from: r */
    C4493r f19405r = null;

    /* renamed from: s */
    private int[] f19406s = f19379G;

    /* renamed from: v */
    private ViewGroup f19409v = null;

    /* renamed from: w */
    boolean f19410w = false;

    /* renamed from: x */
    ArrayList f19411x = new ArrayList();

    /* renamed from: y */
    private int f19412y = 0;

    /* renamed from: z */
    private boolean f19413z = false;

    /* renamed from: A */
    private boolean f19382A = false;

    /* renamed from: B */
    private ArrayList f19383B = null;

    /* renamed from: C */
    private ArrayList f19384C = new ArrayList();

    /* renamed from: F */
    private AbstractC4473h f19387F = f19380H;

    /* renamed from: h0.n$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC4473h {
        a() {
        }

        @Override // p151h0.AbstractC4473h
        /* renamed from: a */
        public Path mo18718a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.n$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5303a f19414a;

        b(C5303a c5303a) {
            this.f19414a = c5303a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19414a.remove(animator);
            AbstractC4485n.this.f19411x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC4485n.this.f19411x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.n$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC4485n.this.m18774r();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.n$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f19417a;

        /* renamed from: b */
        String f19418b;

        /* renamed from: c */
        C4497u f19419c;

        /* renamed from: d */
        InterfaceC4494r0 f19420d;

        /* renamed from: e */
        AbstractC4485n f19421e;

        d(View view, String str, AbstractC4485n abstractC4485n, InterfaceC4494r0 interfaceC4494r0, C4497u c4497u) {
            this.f19417a = view;
            this.f19418b = str;
            this.f19419c = c4497u;
            this.f19420d = interfaceC4494r0;
            this.f19421e = abstractC4485n;
        }
    }

    /* renamed from: h0.n$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: h0.n$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo18682a(AbstractC4485n abstractC4485n);

        /* renamed from: b */
        void mo18683b(AbstractC4485n abstractC4485n);

        /* renamed from: c */
        void mo18709c(AbstractC4485n abstractC4485n);

        /* renamed from: d */
        void mo18684d(AbstractC4485n abstractC4485n);

        /* renamed from: e */
        void mo18685e(AbstractC4485n abstractC4485n);
    }

    /* renamed from: J */
    private static boolean m18733J(C4497u c4497u, C4497u c4497u2, String str) {
        Object obj = c4497u.f19463a.get(str);
        Object obj2 = c4497u2.f19463a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: K */
    private void m18734K(C5303a c5303a, C5303a c5303a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && m18751I(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && m18751I(view)) {
                C4497u c4497u = (C4497u) c5303a.get(view2);
                C4497u c4497u2 = (C4497u) c5303a2.get(view);
                if (c4497u != null && c4497u2 != null) {
                    this.f19407t.add(c4497u);
                    this.f19408u.add(c4497u2);
                    c5303a.remove(view2);
                    c5303a2.remove(view);
                }
            }
        }
    }

    /* renamed from: L */
    private void m18735L(C5303a c5303a, C5303a c5303a2) {
        C4497u c4497u;
        for (int size = c5303a.size() - 1; size >= 0; size--) {
            View view = (View) c5303a.m21434i(size);
            if (view != null && m18751I(view) && (c4497u = (C4497u) c5303a2.remove(view)) != null && m18751I(c4497u.f19464b)) {
                this.f19407t.add((C4497u) c5303a.mo17198k(size));
                this.f19408u.add(c4497u);
            }
        }
    }

    /* renamed from: M */
    private void m18736M(C5303a c5303a, C5303a c5303a2, C5308f c5308f, C5308f c5308f2) {
        View view;
        int m21402p = c5308f.m21402p();
        for (int i10 = 0; i10 < m21402p; i10++) {
            View view2 = (View) c5308f.m21403r(i10);
            if (view2 != null && m18751I(view2) && (view = (View) c5308f2.m21394g(c5308f.m21398k(i10))) != null && m18751I(view)) {
                C4497u c4497u = (C4497u) c5303a.get(view2);
                C4497u c4497u2 = (C4497u) c5303a2.get(view);
                if (c4497u != null && c4497u2 != null) {
                    this.f19407t.add(c4497u);
                    this.f19408u.add(c4497u2);
                    c5303a.remove(view2);
                    c5303a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    private void m18737N(C5303a c5303a, C5303a c5303a2, C5303a c5303a3, C5303a c5303a4) {
        View view;
        int size = c5303a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c5303a3.m21435m(i10);
            if (view2 != null && m18751I(view2) && (view = (View) c5303a4.get(c5303a3.m21434i(i10))) != null && m18751I(view)) {
                C4497u c4497u = (C4497u) c5303a.get(view2);
                C4497u c4497u2 = (C4497u) c5303a2.get(view);
                if (c4497u != null && c4497u2 != null) {
                    this.f19407t.add(c4497u);
                    this.f19408u.add(c4497u2);
                    c5303a.remove(view2);
                    c5303a2.remove(view);
                }
            }
        }
    }

    /* renamed from: O */
    private void m18738O(C4498v c4498v, C4498v c4498v2) {
        C5303a c5303a = new C5303a(c4498v.f19466a);
        C5303a c5303a2 = new C5303a(c4498v2.f19466a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19406s;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                m18736M(c5303a, c5303a2, c4498v.f19468c, c4498v2.f19468c);
                            }
                        } else {
                            m18734K(c5303a, c5303a2, c4498v.f19467b, c4498v2.f19467b);
                        }
                    } else {
                        m18737N(c5303a, c5303a2, c4498v.f19469d, c4498v2.f19469d);
                    }
                } else {
                    m18735L(c5303a, c5303a2);
                }
                i10++;
            } else {
                m18740d(c5303a, c5303a2);
                return;
            }
        }
    }

    /* renamed from: W */
    private void m18739W(Animator animator, C5303a c5303a) {
        if (animator != null) {
            animator.addListener(new b(c5303a));
            m18767f(animator);
        }
    }

    /* renamed from: d */
    private void m18740d(C5303a c5303a, C5303a c5303a2) {
        for (int i10 = 0; i10 < c5303a.size(); i10++) {
            C4497u c4497u = (C4497u) c5303a.m21435m(i10);
            if (m18751I(c4497u.f19464b)) {
                this.f19407t.add(c4497u);
                this.f19408u.add(null);
            }
        }
        for (int i11 = 0; i11 < c5303a2.size(); i11++) {
            C4497u c4497u2 = (C4497u) c5303a2.m21435m(i11);
            if (m18751I(c4497u2.f19464b)) {
                this.f19408u.add(c4497u2);
                this.f19407t.add(null);
            }
        }
    }

    /* renamed from: e */
    private static void m18741e(C4498v c4498v, View view, C4497u c4497u) {
        c4498v.f19466a.put(view, c4497u);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c4498v.f19467b.indexOfKey(id2) >= 0) {
                c4498v.f19467b.put(id2, null);
            } else {
                c4498v.f19467b.put(id2, view);
            }
        }
        String m2592J = AbstractC0616q0.m2592J(view);
        if (m2592J != null) {
            if (c4498v.f19469d.containsKey(m2592J)) {
                c4498v.f19469d.put(m2592J, null);
            } else {
                c4498v.f19469d.put(m2592J, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c4498v.f19468c.m21396i(itemIdAtPosition) >= 0) {
                    View view2 = (View) c4498v.f19468c.m21394g(itemIdAtPosition);
                    if (view2 != null) {
                        AbstractC0616q0.m2652v0(view2, false);
                        c4498v.f19468c.m21399l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                AbstractC0616q0.m2652v0(view, true);
                c4498v.f19468c.m21399l(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    private void m18742h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f19396i;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList arrayList2 = this.f19397j;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList arrayList3 = this.f19398k;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f19398k.get(i10)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            C4497u c4497u = new C4497u(view);
            if (z10) {
                mo18668j(c4497u);
            } else {
                mo18667g(c4497u);
            }
            c4497u.f19465c.add(this);
            mo18769i(c4497u);
            if (z10) {
                m18741e(this.f19403p, view, c4497u);
            } else {
                m18741e(this.f19404q, view, c4497u);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList4 = this.f19400m;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
                return;
            }
            ArrayList arrayList5 = this.f19401n;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList arrayList6 = this.f19402o;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((Class) this.f19402o.get(i11)).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                m18742h(viewGroup.getChildAt(i12), z10);
            }
        }
    }

    /* renamed from: z */
    private static C5303a m18743z() {
        C5303a c5303a = (C5303a) f19381I.get();
        if (c5303a == null) {
            C5303a c5303a2 = new C5303a();
            f19381I.set(c5303a2);
            return c5303a2;
        }
        return c5303a;
    }

    /* renamed from: A */
    public long m18744A() {
        return this.f19389b;
    }

    /* renamed from: B */
    public List m18745B() {
        return this.f19392e;
    }

    /* renamed from: C */
    public List m18746C() {
        return this.f19394g;
    }

    /* renamed from: D */
    public List m18747D() {
        return this.f19395h;
    }

    /* renamed from: E */
    public List m18748E() {
        return this.f19393f;
    }

    /* renamed from: F */
    public String[] mo18666F() {
        return null;
    }

    /* renamed from: G */
    public C4497u m18749G(View view, boolean z10) {
        C4498v c4498v;
        C4493r c4493r = this.f19405r;
        if (c4493r != null) {
            return c4493r.m18749G(view, z10);
        }
        if (z10) {
            c4498v = this.f19403p;
        } else {
            c4498v = this.f19404q;
        }
        return (C4497u) c4498v.f19466a.get(view);
    }

    /* renamed from: H */
    public boolean mo18750H(C4497u c4497u, C4497u c4497u2) {
        if (c4497u == null || c4497u2 == null) {
            return false;
        }
        String[] mo18666F = mo18666F();
        if (mo18666F != null) {
            for (String str : mo18666F) {
                if (!m18733J(c4497u, c4497u2, str)) {
                }
            }
            return false;
        }
        Iterator it = c4497u.f19463a.keySet().iterator();
        while (it.hasNext()) {
            if (m18733J(c4497u, c4497u2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean m18751I(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f19396i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f19397j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f19398k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f19398k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f19399l != null && AbstractC0616q0.m2592J(view) != null && this.f19399l.contains(AbstractC0616q0.m2592J(view))) {
            return false;
        }
        if ((this.f19392e.size() == 0 && this.f19393f.size() == 0 && (((arrayList = this.f19395h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19394g) == null || arrayList2.isEmpty()))) || this.f19392e.contains(Integer.valueOf(id2)) || this.f19393f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f19394g;
        if (arrayList6 != null && arrayList6.contains(AbstractC0616q0.m2592J(view))) {
            return true;
        }
        if (this.f19395h != null) {
            for (int i11 = 0; i11 < this.f19395h.size(); i11++) {
                if (((Class) this.f19395h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P */
    public void mo18752P(View view) {
        if (!this.f19382A) {
            C5303a m18743z = m18743z();
            int size = m18743z.size();
            InterfaceC4494r0 m18692d = AbstractC4464c0.m18692d(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = (d) m18743z.m21435m(i10);
                if (dVar.f19417a != null && m18692d.equals(dVar.f19420d)) {
                    AbstractC4459a.m18659b((Animator) m18743z.m21434i(i10));
                }
            }
            ArrayList arrayList = this.f19383B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19383B.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((f) arrayList2.get(i11)).mo18682a(this);
                }
            }
            this.f19413z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m18753Q(ViewGroup viewGroup) {
        d dVar;
        boolean z10;
        this.f19407t = new ArrayList();
        this.f19408u = new ArrayList();
        m18738O(this.f19403p, this.f19404q);
        C5303a m18743z = m18743z();
        int size = m18743z.size();
        InterfaceC4494r0 m18692d = AbstractC4464c0.m18692d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) m18743z.m21434i(i10);
            if (animator != null && (dVar = (d) m18743z.get(animator)) != null && dVar.f19417a != null && m18692d.equals(dVar.f19420d)) {
                C4497u c4497u = dVar.f19419c;
                View view = dVar.f19417a;
                C4497u m18749G = m18749G(view, true);
                C4497u m18778v = m18778v(view, true);
                if (m18749G == null && m18778v == null) {
                    m18778v = (C4497u) this.f19404q.f19466a.get(view);
                }
                if ((m18749G != null || m18778v != null) && dVar.f19421e.mo18750H(c4497u, m18778v)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (!animator.isRunning() && !animator.isStarted()) {
                        m18743z.remove(animator);
                    } else {
                        animator.cancel();
                    }
                }
            }
        }
        mo18773p(viewGroup, this.f19403p, this.f19404q, this.f19407t, this.f19408u);
        mo18757X();
    }

    /* renamed from: R */
    public AbstractC4485n mo18754R(f fVar) {
        ArrayList arrayList = this.f19383B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f19383B.size() == 0) {
            this.f19383B = null;
        }
        return this;
    }

    /* renamed from: U */
    public AbstractC4485n mo18755U(View view) {
        this.f19393f.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo18756V(View view) {
        if (this.f19413z) {
            if (!this.f19382A) {
                C5303a m18743z = m18743z();
                int size = m18743z.size();
                InterfaceC4494r0 m18692d = AbstractC4464c0.m18692d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d dVar = (d) m18743z.m21435m(i10);
                    if (dVar.f19417a != null && m18692d.equals(dVar.f19420d)) {
                        AbstractC4459a.m18660c((Animator) m18743z.m21434i(i10));
                    }
                }
                ArrayList arrayList = this.f19383B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f19383B.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).mo18684d(this);
                    }
                }
            }
            this.f19413z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void mo18757X() {
        m18766e0();
        C5303a m18743z = m18743z();
        Iterator it = this.f19384C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m18743z.containsKey(animator)) {
                m18766e0();
                m18739W(animator, m18743z);
            }
        }
        this.f19384C.clear();
        m18774r();
    }

    /* renamed from: Y */
    public AbstractC4485n mo18758Y(long j10) {
        this.f19390c = j10;
        return this;
    }

    /* renamed from: Z */
    public void mo18759Z(e eVar) {
        this.f19385D = eVar;
    }

    /* renamed from: a */
    public AbstractC4485n mo18760a(f fVar) {
        if (this.f19383B == null) {
            this.f19383B = new ArrayList();
        }
        this.f19383B.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public AbstractC4485n mo18761a0(TimeInterpolator timeInterpolator) {
        this.f19391d = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public AbstractC4485n mo18762b(View view) {
        this.f19393f.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo18763b0(AbstractC4473h abstractC4473h) {
        if (abstractC4473h == null) {
            this.f19387F = f19380H;
        } else {
            this.f19387F = abstractC4473h;
        }
    }

    /* renamed from: c0 */
    public void mo18764c0(AbstractC4491q abstractC4491q) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f19411x.size() - 1; size >= 0; size--) {
            ((Animator) this.f19411x.get(size)).cancel();
        }
        ArrayList arrayList = this.f19383B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f19383B.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).mo18683b(this);
            }
        }
    }

    /* renamed from: d0 */
    public AbstractC4485n mo18765d0(long j10) {
        this.f19389b = j10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public void m18766e0() {
        if (this.f19412y == 0) {
            ArrayList arrayList = this.f19383B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19383B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).mo18709c(this);
                }
            }
            this.f19382A = false;
        }
        this.f19412y++;
    }

    /* renamed from: f */
    protected void m18767f(Animator animator) {
        if (animator == null) {
            m18774r();
            return;
        }
        if (m18775s() >= 0) {
            animator.setDuration(m18775s());
        }
        if (m18744A() >= 0) {
            animator.setStartDelay(m18744A() + animator.getStartDelay());
        }
        if (m18777u() != null) {
            animator.setInterpolator(m18777u());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public String mo18768f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f19390c != -1) {
            str2 = str2 + "dur(" + this.f19390c + ") ";
        }
        if (this.f19389b != -1) {
            str2 = str2 + "dly(" + this.f19389b + ") ";
        }
        if (this.f19391d != null) {
            str2 = str2 + "interp(" + this.f19391d + ") ";
        }
        if (this.f19392e.size() > 0 || this.f19393f.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f19392e.size() > 0) {
                for (int i10 = 0; i10 < this.f19392e.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19392e.get(i10);
                }
            }
            if (this.f19393f.size() > 0) {
                for (int i11 = 0; i11 < this.f19393f.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19393f.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: g */
    public abstract void mo18667g(C4497u c4497u);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo18769i(C4497u c4497u) {
    }

    /* renamed from: j */
    public abstract void mo18668j(C4497u c4497u);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m18770k(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C5303a c5303a;
        m18771l(z10);
        if ((this.f19392e.size() <= 0 && this.f19393f.size() <= 0) || (((arrayList = this.f19394g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f19395h) != null && !arrayList2.isEmpty()))) {
            m18742h(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f19392e.size(); i10++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f19392e.get(i10)).intValue());
                if (findViewById != null) {
                    C4497u c4497u = new C4497u(findViewById);
                    if (z10) {
                        mo18668j(c4497u);
                    } else {
                        mo18667g(c4497u);
                    }
                    c4497u.f19465c.add(this);
                    mo18769i(c4497u);
                    if (z10) {
                        m18741e(this.f19403p, findViewById, c4497u);
                    } else {
                        m18741e(this.f19404q, findViewById, c4497u);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f19393f.size(); i11++) {
                View view = (View) this.f19393f.get(i11);
                C4497u c4497u2 = new C4497u(view);
                if (z10) {
                    mo18668j(c4497u2);
                } else {
                    mo18667g(c4497u2);
                }
                c4497u2.f19465c.add(this);
                mo18769i(c4497u2);
                if (z10) {
                    m18741e(this.f19403p, view, c4497u2);
                } else {
                    m18741e(this.f19404q, view, c4497u2);
                }
            }
        }
        if (!z10 && (c5303a = this.f19386E) != null) {
            int size = c5303a.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f19403p.f19469d.remove((String) this.f19386E.m21434i(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f19403p.f19469d.put((String) this.f19386E.m21435m(i13), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m18771l(boolean z10) {
        if (z10) {
            this.f19403p.f19466a.clear();
            this.f19403p.f19467b.clear();
            this.f19403p.f19468c.m21391b();
        } else {
            this.f19404q.f19466a.clear();
            this.f19404q.f19467b.clear();
            this.f19404q.f19468c.m21391b();
        }
    }

    @Override // 
    /* renamed from: m */
    public AbstractC4485n clone() {
        try {
            AbstractC4485n abstractC4485n = (AbstractC4485n) super.clone();
            abstractC4485n.f19384C = new ArrayList();
            abstractC4485n.f19403p = new C4498v();
            abstractC4485n.f19404q = new C4498v();
            abstractC4485n.f19407t = null;
            abstractC4485n.f19408u = null;
            return abstractC4485n;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public Animator mo18669o(ViewGroup viewGroup, C4497u c4497u, C4497u c4497u2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18773p(ViewGroup viewGroup, C4498v c4498v, C4498v c4498v2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        View view;
        Animator animator;
        C4497u c4497u;
        int i10 = 0;
        Animator animator2;
        C4497u c4497u2;
        C5303a m18743z = m18743z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C4497u c4497u3 = (C4497u) arrayList.get(i11);
            C4497u c4497u4 = (C4497u) arrayList2.get(i11);
            if (c4497u3 != null && !c4497u3.f19465c.contains(this)) {
                c4497u3 = null;
            }
            if (c4497u4 != null && !c4497u4.f19465c.contains(this)) {
                c4497u4 = null;
            }
            if (c4497u3 != null || c4497u4 != null) {
                if (c4497u3 != null && c4497u4 != null && !mo18750H(c4497u3, c4497u4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Animator mo18669o = mo18669o(viewGroup, c4497u3, c4497u4);
                    if (mo18669o != null) {
                        if (c4497u4 != null) {
                            View view2 = c4497u4.f19464b;
                            String[] mo18666F = mo18666F();
                            if (mo18666F != null && mo18666F.length > 0) {
                                c4497u2 = new C4497u(view2);
                                C4497u c4497u5 = (C4497u) c4498v2.f19466a.get(view2);
                                if (c4497u5 != null) {
                                    int i12 = 0;
                                    while (i12 < mo18666F.length) {
                                        Map map = c4497u2.f19463a;
                                        Animator animator3 = mo18669o;
                                        String str = mo18666F[i12];
                                        map.put(str, c4497u5.f19463a.get(str));
                                        i12++;
                                        mo18669o = animator3;
                                        mo18666F = mo18666F;
                                    }
                                }
                                Animator animator4 = mo18669o;
                                int size2 = m18743z.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        d dVar = (d) m18743z.get((Animator) m18743z.m21434i(i13));
                                        if (dVar.f19419c != null && dVar.f19417a == view2 && dVar.f19418b.equals(m18779w()) && dVar.f19419c.equals(c4497u2)) {
                                            animator2 = null;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        animator2 = animator4;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = mo18669o;
                                c4497u2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c4497u = c4497u2;
                        } else {
                            view = c4497u3.f19464b;
                            animator = mo18669o;
                            c4497u = null;
                        }
                        if (animator != null) {
                            i10 = size;
                            m18743z.put(animator, new d(view, m18779w(), this, AbstractC4464c0.m18692d(viewGroup), c4497u));
                            this.f19384C.add(animator);
                            i11++;
                            size = i10;
                        }
                        i10 = size;
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = (Animator) this.f19384C.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m18774r() {
        int i10 = this.f19412y - 1;
        this.f19412y = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f19383B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19383B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).mo18685e(this);
                }
            }
            for (int i12 = 0; i12 < this.f19403p.f19468c.m21402p(); i12++) {
                View view = (View) this.f19403p.f19468c.m21403r(i12);
                if (view != null) {
                    AbstractC0616q0.m2652v0(view, false);
                }
            }
            for (int i13 = 0; i13 < this.f19404q.f19468c.m21402p(); i13++) {
                View view2 = (View) this.f19404q.f19468c.m21403r(i13);
                if (view2 != null) {
                    AbstractC0616q0.m2652v0(view2, false);
                }
            }
            this.f19382A = true;
        }
    }

    /* renamed from: s */
    public long m18775s() {
        return this.f19390c;
    }

    /* renamed from: t */
    public e m18776t() {
        return this.f19385D;
    }

    public String toString() {
        return mo18768f0("");
    }

    /* renamed from: u */
    public TimeInterpolator m18777u() {
        return this.f19391d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C4497u m18778v(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C4493r c4493r = this.f19405r;
        if (c4493r != null) {
            return c4493r.m18778v(view, z10);
        }
        if (z10) {
            arrayList = this.f19407t;
        } else {
            arrayList = this.f19408u;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                C4497u c4497u = (C4497u) arrayList.get(i10);
                if (c4497u == null) {
                    return null;
                }
                if (c4497u.f19464b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f19408u;
        } else {
            arrayList2 = this.f19407t;
        }
        return (C4497u) arrayList2.get(i10);
    }

    /* renamed from: w */
    public String m18779w() {
        return this.f19388a;
    }

    /* renamed from: x */
    public AbstractC4473h m18780x() {
        return this.f19387F;
    }

    /* renamed from: y */
    public AbstractC4491q m18781y() {
        return null;
    }
}
