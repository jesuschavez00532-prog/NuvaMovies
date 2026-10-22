package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import androidx.fragment.R$id;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p331t.C6871b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0721i0 {

    /* renamed from: a */
    private final ViewGroup f2847a;

    /* renamed from: b */
    final ArrayList f2848b = new ArrayList();

    /* renamed from: c */
    final ArrayList f2849c = new ArrayList();

    /* renamed from: d */
    boolean f2850d = false;

    /* renamed from: e */
    boolean f2851e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.i0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f2852a;

        a(d dVar) {
            this.f2852a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0721i0.this.f2848b.contains(this.f2852a)) {
                this.f2852a.m3372e().m3381a(this.f2852a.m3373f().f2625H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.i0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f2854a;

        b(d dVar) {
            this.f2854a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0721i0.this.f2848b.remove(this.f2854a);
            AbstractC0721i0.this.f2849c.remove(this.f2854a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.i0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2856a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2857b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2857b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2857b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2857b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2856a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2856a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2856a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2856a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.i0$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h */
        private final C0736v f2858h;

        d(e.c cVar, e.b bVar, C0736v c0736v, C6871b c6871b) {
            super(cVar, bVar, c0736v.m3603k(), c6871b);
            this.f2858h = c0736v;
        }

        @Override // androidx.fragment.app.AbstractC0721i0.e
        /* renamed from: c */
        public void mo3367c() {
            super.mo3367c();
            this.f2858h.m3604m();
        }

        @Override // androidx.fragment.app.AbstractC0721i0.e
        /* renamed from: l */
        void mo3368l() {
            if (m3374g() == e.b.ADDING) {
                Fragment m3603k = this.f2858h.m3603k();
                View findFocus = m3603k.f2625H.findFocus();
                if (findFocus != null) {
                    m3603k.m3135W8(findFocus);
                    if (AbstractC0729o.m3432F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m3603k);
                    }
                }
                View m3113O8 = m3373f().m3113O8();
                if (m3113O8.getParent() == null) {
                    this.f2858h.m3594b();
                    m3113O8.setAlpha(0.0f);
                }
                if (m3113O8.getAlpha() == 0.0f && m3113O8.getVisibility() == 0) {
                    m3113O8.setVisibility(4);
                }
                m3113O8.setAlpha(m3603k.m3148b7());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.i0$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private c f2859a;

        /* renamed from: b */
        private b f2860b;

        /* renamed from: c */
        private final Fragment f2861c;

        /* renamed from: d */
        private final List f2862d = new ArrayList();

        /* renamed from: e */
        private final HashSet f2863e = new HashSet();

        /* renamed from: f */
        private boolean f2864f = false;

        /* renamed from: g */
        private boolean f2865g = false;

        /* renamed from: androidx.fragment.app.i0$e$a */
        /* loaded from: classes.dex */
        class a implements C6871b.a {
            a() {
            }

            @Override // p331t.C6871b.a
            /* renamed from: a */
            public void mo3255a() {
                e.this.m3370b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.i0$e$b */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.i0$e$c */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: b */
            public static c m3379b(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i10);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: c */
            public static c m3380c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m3379b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a */
            public void m3381a(View view) {
                int i10 = c.f2856a[ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                if (AbstractC0729o.m3432F0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (AbstractC0729o.m3432F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (AbstractC0729o.m3432F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (AbstractC0729o.m3432F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, C6871b c6871b) {
            this.f2859a = cVar;
            this.f2860b = bVar;
            this.f2861c = fragment;
            c6871b.m26781c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m3369a(Runnable runnable) {
            this.f2862d.add(runnable);
        }

        /* renamed from: b */
        final void m3370b() {
            if (m3375h()) {
                return;
            }
            this.f2864f = true;
            if (this.f2863e.isEmpty()) {
                mo3367c();
                return;
            }
            Iterator it = new ArrayList(this.f2863e).iterator();
            while (it.hasNext()) {
                ((C6871b) it.next()).m26779a();
            }
        }

        /* renamed from: c */
        public void mo3367c() {
            if (this.f2865g) {
                return;
            }
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2865g = true;
            Iterator it = this.f2862d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* renamed from: d */
        public final void m3371d(C6871b c6871b) {
            if (this.f2863e.remove(c6871b) && this.f2863e.isEmpty()) {
                mo3367c();
            }
        }

        /* renamed from: e */
        public c m3372e() {
            return this.f2859a;
        }

        /* renamed from: f */
        public final Fragment m3373f() {
            return this.f2861c;
        }

        /* renamed from: g */
        b m3374g() {
            return this.f2860b;
        }

        /* renamed from: h */
        final boolean m3375h() {
            return this.f2864f;
        }

        /* renamed from: i */
        final boolean m3376i() {
            return this.f2865g;
        }

        /* renamed from: j */
        public final void m3377j(C6871b c6871b) {
            mo3368l();
            this.f2863e.add(c6871b);
        }

        /* renamed from: k */
        final void m3378k(c cVar, b bVar) {
            int i10 = c.f2857b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f2859a != c.REMOVED) {
                        if (AbstractC0729o.m3432F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2861c + " mFinalState = " + this.f2859a + " -> " + cVar + ". ");
                        }
                        this.f2859a = cVar;
                        return;
                    }
                    return;
                }
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2861c + " mFinalState = " + this.f2859a + " -> REMOVED. mLifecycleImpact  = " + this.f2860b + " to REMOVING.");
                }
                this.f2859a = c.REMOVED;
                this.f2860b = b.REMOVING;
                return;
            }
            if (this.f2859a == c.REMOVED) {
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2861c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2860b + " to ADDING.");
                }
                this.f2859a = c.VISIBLE;
                this.f2860b = b.ADDING;
            }
        }

        /* renamed from: l */
        abstract void mo3368l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2859a + "} {mLifecycleImpact = " + this.f2860b + "} {mFragment = " + this.f2861c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0721i0(ViewGroup viewGroup) {
        this.f2847a = viewGroup;
    }

    /* renamed from: a */
    private void m3350a(e.c cVar, e.b bVar, C0736v c0736v) {
        synchronized (this.f2848b) {
            C6871b c6871b = new C6871b();
            e m3351h = m3351h(c0736v.m3603k());
            if (m3351h != null) {
                m3351h.m3378k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0736v, c6871b);
            this.f2848b.add(dVar);
            dVar.m3369a(new a(dVar));
            dVar.m3369a(new b(dVar));
        }
    }

    /* renamed from: h */
    private e m3351h(Fragment fragment) {
        Iterator it = this.f2848b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.m3373f().equals(fragment) && !eVar.m3375h()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    private e m3352i(Fragment fragment) {
        Iterator it = this.f2849c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.m3373f().equals(fragment) && !eVar.m3375h()) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC0721i0 m3353n(ViewGroup viewGroup, AbstractC0729o abstractC0729o) {
        return m3354o(viewGroup, abstractC0729o.m3555y0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC0721i0 m3354o(ViewGroup viewGroup, InterfaceC0723j0 interfaceC0723j0) {
        int i10 = R$id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof AbstractC0721i0) {
            return (AbstractC0721i0) tag;
        }
        AbstractC0721i0 mo3406a = interfaceC0723j0.mo3406a(viewGroup);
        viewGroup.setTag(i10, mo3406a);
        return mo3406a;
    }

    /* renamed from: q */
    private void m3355q() {
        Iterator it = this.f2848b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.m3374g() == e.b.ADDING) {
                eVar.m3378k(e.c.m3379b(eVar.m3373f().m3113O8().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3356b(e.c cVar, C0736v c0736v) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0736v.m3603k());
        }
        m3350a(cVar, e.b.ADDING, c0736v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3357c(C0736v c0736v) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0736v.m3603k());
        }
        m3350a(e.c.GONE, e.b.NONE, c0736v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3358d(C0736v c0736v) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0736v.m3603k());
        }
        m3350a(e.c.REMOVED, e.b.REMOVING, c0736v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3359e(C0736v c0736v) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0736v.m3603k());
        }
        m3350a(e.c.VISIBLE, e.b.NONE, c0736v);
    }

    /* renamed from: f */
    abstract void mo3250f(List list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3360g() {
        if (this.f2851e) {
            return;
        }
        if (!AbstractC0616q0.m2599Q(this.f2847a)) {
            m3361j();
            this.f2850d = false;
            return;
        }
        synchronized (this.f2848b) {
            if (!this.f2848b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2849c);
                this.f2849c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (AbstractC0729o.m3432F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m3370b();
                    if (!eVar.m3376i()) {
                        this.f2849c.add(eVar);
                    }
                }
                m3355q();
                ArrayList arrayList2 = new ArrayList(this.f2848b);
                this.f2848b.clear();
                this.f2849c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo3368l();
                }
                mo3250f(arrayList2, this.f2850d);
                this.f2850d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3361j() {
        String str;
        String str2;
        boolean m2599Q = AbstractC0616q0.m2599Q(this.f2847a);
        synchronized (this.f2848b) {
            m3355q();
            Iterator it = this.f2848b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).mo3368l();
            }
            Iterator it2 = new ArrayList(this.f2849c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (AbstractC0729o.m3432F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m2599Q) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2847a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m3370b();
            }
            Iterator it3 = new ArrayList(this.f2848b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (AbstractC0729o.m3432F0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m2599Q) {
                        str = "";
                    } else {
                        str = "Container " + this.f2847a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m3370b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m3362k() {
        if (this.f2851e) {
            this.f2851e = false;
            m3360g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public e.b m3363l(C0736v c0736v) {
        e.b bVar;
        e m3351h = m3351h(c0736v.m3603k());
        if (m3351h != null) {
            bVar = m3351h.m3374g();
        } else {
            bVar = null;
        }
        e m3352i = m3352i(c0736v.m3603k());
        if (m3352i != null && (bVar == null || bVar == e.b.NONE)) {
            return m3352i.m3374g();
        }
        return bVar;
    }

    /* renamed from: m */
    public ViewGroup m3364m() {
        return this.f2847a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m3365p() {
        synchronized (this.f2848b) {
            m3355q();
            this.f2851e = false;
            int size = this.f2848b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = (e) this.f2848b.get(size);
                e.c m3380c = e.c.m3380c(eVar.m3373f().f2625H);
                e.c m3372e = eVar.m3372e();
                e.c cVar = e.c.VISIBLE;
                if (m3372e == cVar && m3380c != cVar) {
                    this.f2851e = eVar.m3373f().m3204y7();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m3366r(boolean z10) {
        this.f2850d = z10;
    }
}
