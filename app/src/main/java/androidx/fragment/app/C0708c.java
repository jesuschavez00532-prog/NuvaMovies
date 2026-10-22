package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0648y0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0600m0;
import androidx.fragment.app.AbstractC0714f;
import androidx.fragment.app.AbstractC0721i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p214l.C5303a;
import p331t.C6871b;
import p373w.AbstractC7342g;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
class C0708c extends AbstractC0721i0 {

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2720a;

        static {
            int[] iArr = new int[AbstractC0721i0.e.c.values().length];
            f2720a = iArr;
            try {
                iArr[AbstractC0721i0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2720a[AbstractC0721i0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2720a[AbstractC0721i0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2720a[AbstractC0721i0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f2721a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0721i0.e f2722b;

        b(List list, AbstractC0721i0.e eVar) {
            this.f2721a = list;
            this.f2722b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2721a.contains(this.f2722b)) {
                this.f2721a.remove(this.f2722b);
                C0708c.this.m3251s(this.f2722b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2724a;

        /* renamed from: b */
        final /* synthetic */ View f2725b;

        /* renamed from: c */
        final /* synthetic */ boolean f2726c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0721i0.e f2727d;

        /* renamed from: e */
        final /* synthetic */ k f2728e;

        c(ViewGroup viewGroup, View view, boolean z10, AbstractC0721i0.e eVar, k kVar) {
            this.f2724a = viewGroup;
            this.f2725b = view;
            this.f2726c = z10;
            this.f2727d = eVar;
            this.f2728e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2724a.endViewTransition(this.f2725b);
            if (this.f2726c) {
                this.f2727d.m3372e().m3381a(this.f2725b);
            }
            this.f2728e.m3257a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    public class d implements C6871b.a {

        /* renamed from: a */
        final /* synthetic */ Animator f2730a;

        d(Animator animator) {
            this.f2730a = animator;
        }

        @Override // p331t.C6871b.a
        /* renamed from: a */
        public void mo3255a() {
            this.f2730a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2732a;

        /* renamed from: b */
        final /* synthetic */ View f2733b;

        /* renamed from: c */
        final /* synthetic */ k f2734c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2732a.endViewTransition(eVar.f2733b);
                e.this.f2734c.m3257a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2732a = viewGroup;
            this.f2733b = view;
            this.f2734c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2732a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$f */
    /* loaded from: classes.dex */
    public class f implements C6871b.a {

        /* renamed from: a */
        final /* synthetic */ View f2737a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2738b;

        /* renamed from: c */
        final /* synthetic */ k f2739c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2737a = view;
            this.f2738b = viewGroup;
            this.f2739c = kVar;
        }

        @Override // p331t.C6871b.a
        /* renamed from: a */
        public void mo3255a() {
            this.f2737a.clearAnimation();
            this.f2738b.endViewTransition(this.f2737a);
            this.f2739c.m3257a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0721i0.e f2741a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0721i0.e f2742b;

        /* renamed from: c */
        final /* synthetic */ boolean f2743c;

        /* renamed from: d */
        final /* synthetic */ C5303a f2744d;

        g(AbstractC0721i0.e eVar, AbstractC0721i0.e eVar2, boolean z10, C5303a c5303a) {
            this.f2741a = eVar;
            this.f2742b = eVar2;
            this.f2743c = z10;
            this.f2744d = c5303a;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0739y.m3654f(this.f2741a.m3373f(), this.f2742b.m3373f(), this.f2743c, this.f2744d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0715f0 f2746a;

        /* renamed from: b */
        final /* synthetic */ View f2747b;

        /* renamed from: c */
        final /* synthetic */ Rect f2748c;

        h(AbstractC0715f0 abstractC0715f0, View view, Rect rect) {
            this.f2746a = abstractC0715f0;
            this.f2747b = view;
            this.f2748c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2746a.m3335k(this.f2747b, this.f2748c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2750a;

        i(ArrayList arrayList) {
            this.f2750a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0739y.m3647A(this.f2750a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ m f2752a;

        j(m mVar) {
            this.f2752a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2752a.m3257a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$k */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c */
        private boolean f2754c;

        /* renamed from: d */
        private boolean f2755d;

        /* renamed from: e */
        private AbstractC0714f.d f2756e;

        k(AbstractC0721i0.e eVar, C6871b c6871b, boolean z10) {
            super(eVar, c6871b);
            this.f2755d = false;
            this.f2754c = z10;
        }

        /* renamed from: e */
        AbstractC0714f.d m3256e(Context context) {
            boolean z10;
            if (this.f2755d) {
                return this.f2756e;
            }
            Fragment m3373f = m3258b().m3373f();
            if (m3258b().m3372e() == AbstractC0721i0.e.c.VISIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC0714f.d m3327c = AbstractC0714f.m3327c(context, m3373f, z10, this.f2754c);
            this.f2756e = m3327c;
            this.f2755d = true;
            return m3327c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        private final AbstractC0721i0.e f2757a;

        /* renamed from: b */
        private final C6871b f2758b;

        l(AbstractC0721i0.e eVar, C6871b c6871b) {
            this.f2757a = eVar;
            this.f2758b = c6871b;
        }

        /* renamed from: a */
        void m3257a() {
            this.f2757a.m3371d(this.f2758b);
        }

        /* renamed from: b */
        AbstractC0721i0.e m3258b() {
            return this.f2757a;
        }

        /* renamed from: c */
        C6871b m3259c() {
            return this.f2758b;
        }

        /* renamed from: d */
        boolean m3260d() {
            AbstractC0721i0.e.c cVar;
            AbstractC0721i0.e.c m3380c = AbstractC0721i0.e.c.m3380c(this.f2757a.m3373f().f2625H);
            AbstractC0721i0.e.c m3372e = this.f2757a.m3372e();
            if (m3380c != m3372e && (m3380c == (cVar = AbstractC0721i0.e.c.VISIBLE) || m3372e == cVar)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$m */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c */
        private final Object f2759c;

        /* renamed from: d */
        private final boolean f2760d;

        /* renamed from: e */
        private final Object f2761e;

        m(AbstractC0721i0.e eVar, C6871b c6871b, boolean z10, boolean z11) {
            super(eVar, c6871b);
            Object m3111O6;
            Object m3102L6;
            boolean m3078D6;
            if (eVar.m3372e() == AbstractC0721i0.e.c.VISIBLE) {
                if (z10) {
                    m3102L6 = eVar.m3373f().m3151c7();
                } else {
                    m3102L6 = eVar.m3373f().m3102L6();
                }
                this.f2759c = m3102L6;
                if (z10) {
                    m3078D6 = eVar.m3373f().m3081E6();
                } else {
                    m3078D6 = eVar.m3373f().m3078D6();
                }
                this.f2760d = m3078D6;
            } else {
                if (z10) {
                    m3111O6 = eVar.m3373f().m3157e7();
                } else {
                    m3111O6 = eVar.m3373f().m3111O6();
                }
                this.f2759c = m3111O6;
                this.f2760d = true;
            }
            if (z11) {
                if (z10) {
                    this.f2761e = eVar.m3373f().m3163g7();
                    return;
                } else {
                    this.f2761e = eVar.m3373f().m3160f7();
                    return;
                }
            }
            this.f2761e = null;
        }

        /* renamed from: f */
        private AbstractC0715f0 m3261f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0715f0 abstractC0715f0 = AbstractC0739y.f3028b;
            if (abstractC0715f0 != null && abstractC0715f0.mo3313e(obj)) {
                return abstractC0715f0;
            }
            AbstractC0715f0 abstractC0715f02 = AbstractC0739y.f3029c;
            if (abstractC0715f02 != null && abstractC0715f02.mo3313e(obj)) {
                return abstractC0715f02;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m3258b().m3373f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC0715f0 m3262e() {
            AbstractC0715f0 m3261f = m3261f(this.f2759c);
            AbstractC0715f0 m3261f2 = m3261f(this.f2761e);
            if (m3261f != null && m3261f2 != null && m3261f != m3261f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m3258b().m3373f() + " returned Transition " + this.f2759c + " which uses a different Transition  type than its shared element transition " + this.f2761e);
            }
            if (m3261f == null) {
                return m3261f2;
            }
            return m3261f;
        }

        /* renamed from: g */
        public Object m3263g() {
            return this.f2761e;
        }

        /* renamed from: h */
        Object m3264h() {
            return this.f2759c;
        }

        /* renamed from: i */
        public boolean m3265i() {
            if (this.f2761e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        boolean m3266j() {
            return this.f2760d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0708c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m3248w(List list, List list2, boolean z10, Map map) {
        boolean z11;
        ViewGroup m3364m = m3364m();
        Context context = m3364m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.m3260d()) {
                kVar.m3257a();
            } else {
                AbstractC0714f.d m3256e = kVar.m3256e(context);
                if (m3256e == null) {
                    kVar.m3257a();
                } else {
                    Animator animator = m3256e.f2819b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        AbstractC0721i0.e m3258b = kVar.m3258b();
                        Fragment m3373f = m3258b.m3373f();
                        if (Boolean.TRUE.equals(map.get(m3258b))) {
                            if (AbstractC0729o.m3432F0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m3373f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m3257a();
                        } else {
                            if (m3258b.m3372e() == AbstractC0721i0.e.c.GONE) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                list2.remove(m3258b);
                            }
                            View view = m3373f.f2625H;
                            m3364m.startViewTransition(view);
                            animator.addListener(new c(m3364m, view, z11, m3258b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m3259c().m26781c(new d(animator));
                            z12 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            AbstractC0721i0.e m3258b2 = kVar2.m3258b();
            Fragment m3373f2 = m3258b2.m3373f();
            if (z10) {
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m3373f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m3257a();
            } else if (z12) {
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m3373f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m3257a();
            } else {
                View view2 = m3373f2.f2625H;
                Animation animation = (Animation) AbstractC7342g.m28327g(((AbstractC0714f.d) AbstractC7342g.m28327g(kVar2.m3256e(context))).f2818a);
                if (m3258b2.m3372e() != AbstractC0721i0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m3257a();
                } else {
                    m3364m.startViewTransition(view2);
                    AbstractC0714f.e eVar = new AbstractC0714f.e(animation, m3364m, view2);
                    eVar.setAnimationListener(new e(m3364m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m3259c().m26781c(new f(view2, m3364m, kVar2));
            }
        }
    }

    /* renamed from: x */
    private Map m3249x(List list, List list2, boolean z10, AbstractC0721i0.e eVar, AbstractC0721i0.e eVar2) {
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        AbstractC0721i0.e eVar3;
        AbstractC0721i0.e eVar4;
        View view2;
        Object mo3316n;
        C5303a c5303a;
        ArrayList arrayList3;
        AbstractC0721i0.e eVar5;
        ArrayList arrayList4;
        Rect rect;
        View view3;
        AbstractC0715f0 abstractC0715f0;
        AbstractC0721i0.e eVar6;
        View view4;
        boolean z11 = z10;
        AbstractC0721i0.e eVar7 = eVar;
        AbstractC0721i0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        AbstractC0715f0 abstractC0715f02 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.m3260d()) {
                AbstractC0715f0 m3262e = mVar.m3262e();
                if (abstractC0715f02 == null) {
                    abstractC0715f02 = m3262e;
                } else if (m3262e != null && abstractC0715f02 != m3262e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m3258b().m3373f() + " returned Transition " + mVar.m3264h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0715f02 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap.put(mVar2.m3258b(), Boolean.FALSE);
                mVar2.m3257a();
            }
            return hashMap;
        }
        View view5 = new View(m3364m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C5303a c5303a2 = new C5303a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (!mVar3.m3265i() || eVar7 == null || eVar8 == null) {
                c5303a = c5303a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                abstractC0715f0 = abstractC0715f02;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object mo3309B = abstractC0715f02.mo3309B(abstractC0715f02.mo3314g(mVar3.m3263g()));
                ArrayList m3166h7 = eVar2.m3373f().m3166h7();
                ArrayList m3166h72 = eVar.m3373f().m3166h7();
                ArrayList m3169i7 = eVar.m3373f().m3169i7();
                View view7 = view6;
                int i10 = 0;
                while (i10 < m3169i7.size()) {
                    int indexOf = m3166h7.indexOf(m3169i7.get(i10));
                    ArrayList arrayList7 = m3169i7;
                    if (indexOf != -1) {
                        m3166h7.set(indexOf, m3166h72.get(i10));
                    }
                    i10++;
                    m3169i7 = arrayList7;
                }
                ArrayList m3169i72 = eVar2.m3373f().m3169i7();
                if (!z11) {
                    eVar.m3373f().m3114P6();
                    eVar2.m3373f().m3105M6();
                } else {
                    eVar.m3373f().m3105M6();
                    eVar2.m3373f().m3114P6();
                }
                int i11 = 0;
                for (int size = m3166h7.size(); i11 < size; size = size) {
                    c5303a2.put((String) m3166h7.get(i11), (String) m3169i72.get(i11));
                    i11++;
                }
                C5303a c5303a3 = new C5303a();
                m3253u(c5303a3, eVar.m3373f().f2625H);
                c5303a3.m21350o(m3166h7);
                c5303a2.m21350o(c5303a3.keySet());
                C5303a c5303a4 = new C5303a();
                m3253u(c5303a4, eVar2.m3373f().f2625H);
                c5303a4.m21350o(m3169i72);
                c5303a4.m21350o(c5303a2.values());
                AbstractC0739y.m3672x(c5303a2, c5303a4);
                m3254v(c5303a3, c5303a2.keySet());
                m3254v(c5303a4, c5303a2.values());
                if (c5303a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c5303a = c5303a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0715f0 = abstractC0715f02;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    AbstractC0739y.m3654f(eVar2.m3373f(), eVar.m3373f(), z11, c5303a3, true);
                    c5303a = c5303a2;
                    ArrayList arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(m3364m(), new g(eVar2, eVar, z10, c5303a4));
                    arrayList5.addAll(c5303a3.values());
                    if (m3166h7.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) c5303a3.get((String) m3166h7.get(0));
                        abstractC0715f02.mo3322v(mo3309B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c5303a4.values());
                    if (!m3169i72.isEmpty() && (view4 = (View) c5303a4.get((String) m3169i72.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(m3364m(), new h(abstractC0715f02, view4, rect2));
                        z12 = true;
                    }
                    abstractC0715f02.mo3324z(mo3309B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0715f0 = abstractC0715f02;
                    abstractC0715f02.mo3320t(mo3309B, null, null, null, null, mo3309B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = mo3309B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c5303a2 = c5303a;
            z11 = z10;
            arrayList6 = arrayList3;
            abstractC0715f02 = abstractC0715f0;
        }
        View view9 = view6;
        C5303a c5303a5 = c5303a2;
        ArrayList arrayList9 = arrayList6;
        AbstractC0721i0.e eVar9 = eVar7;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        AbstractC0715f0 abstractC0715f03 = abstractC0715f02;
        AbstractC0721i0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Iterator it4 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it4.hasNext()) {
            m mVar4 = (m) it4.next();
            if (mVar4.m3260d()) {
                hashMap.put(mVar4.m3258b(), Boolean.FALSE);
                mVar4.m3257a();
            } else {
                Object mo3314g = abstractC0715f03.mo3314g(mVar4.m3264h());
                AbstractC0721i0.e m3258b = mVar4.m3258b();
                boolean z13 = obj3 != null && (m3258b == eVar9 || m3258b == eVar10);
                if (mo3314g == null) {
                    if (!z13) {
                        hashMap.put(m3258b, Boolean.FALSE);
                        mVar4.m3257a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    mo3316n = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    Object obj6 = obj4;
                    m3252t(arrayList12, m3258b.m3373f().f2625H);
                    if (z13) {
                        if (m3258b == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC0715f03.mo3310a(mo3314g, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = m3258b;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        abstractC0715f03.mo3311b(mo3314g, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        abstractC0715f03.mo3320t(mo3314g, mo3314g, arrayList12, null, null, null, null);
                        if (m3258b.m3372e() == AbstractC0721i0.e.c.GONE) {
                            eVar4 = m3258b;
                            list2.remove(eVar4);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(eVar4.m3373f().f2625H);
                            abstractC0715f03.mo3319r(mo3314g, eVar4.m3373f().f2625H, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(m3364m(), new i(arrayList12));
                        } else {
                            eVar4 = m3258b;
                        }
                    }
                    if (eVar4.m3372e() == AbstractC0721i0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            abstractC0715f03.mo3321u(mo3314g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        abstractC0715f03.mo3322v(mo3314g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.m3266j()) {
                        obj5 = abstractC0715f03.mo3316n(obj2, mo3314g, null);
                        mo3316n = obj;
                    } else {
                        mo3316n = abstractC0715f03.mo3316n(obj, mo3314g, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = mo3316n;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        ArrayList arrayList15 = arrayList10;
        AbstractC0721i0.e eVar11 = eVar10;
        Object mo3315m = abstractC0715f03.mo3315m(obj5, obj4, obj3);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            m mVar5 = (m) it5.next();
            if (!mVar5.m3260d()) {
                Object m3264h = mVar5.m3264h();
                AbstractC0721i0.e m3258b2 = mVar5.m3258b();
                boolean z14 = obj3 != null && (m3258b2 == eVar9 || m3258b2 == eVar11);
                if (m3264h != null || z14) {
                    if (!AbstractC0616q0.m2600R(m3364m())) {
                        if (AbstractC0729o.m3432F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m3364m() + " has not been laid out. Completing operation " + m3258b2);
                        }
                        mVar5.m3257a();
                    } else {
                        abstractC0715f03.mo3323w(mVar5.m3258b().m3373f(), mo3315m, mVar5.m3259c(), new j(mVar5));
                    }
                }
            }
        }
        if (!AbstractC0616q0.m2600R(m3364m())) {
            return hashMap;
        }
        AbstractC0739y.m3647A(arrayList11, 4);
        ArrayList m3336o = abstractC0715f03.m3336o(arrayList14);
        abstractC0715f03.mo3312c(m3364m(), mo3315m);
        abstractC0715f03.m3339y(m3364m(), arrayList15, arrayList14, m3336o, c5303a5);
        AbstractC0739y.m3647A(arrayList11, 0);
        abstractC0715f03.mo3308A(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC0721i0
    /* renamed from: f */
    void mo3250f(List list, boolean z10) {
        Iterator it = list.iterator();
        AbstractC0721i0.e eVar = null;
        AbstractC0721i0.e eVar2 = null;
        while (it.hasNext()) {
            AbstractC0721i0.e eVar3 = (AbstractC0721i0.e) it.next();
            AbstractC0721i0.e.c m3380c = AbstractC0721i0.e.c.m3380c(eVar3.m3373f().f2625H);
            int i10 = a.f2720a[eVar3.m3372e().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 && m3380c != AbstractC0721i0.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (m3380c == AbstractC0721i0.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC0721i0.e eVar4 = (AbstractC0721i0.e) it2.next();
            C6871b c6871b = new C6871b();
            eVar4.m3377j(c6871b);
            arrayList.add(new k(eVar4, c6871b, z10));
            C6871b c6871b2 = new C6871b();
            eVar4.m3377j(c6871b2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c6871b2, z10, z11));
                    eVar4.m3369a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c6871b2, z10, z11));
                eVar4.m3369a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c6871b2, z10, z11));
                    eVar4.m3369a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c6871b2, z10, z11));
                eVar4.m3369a(new b(arrayList3, eVar4));
            }
        }
        Map m3249x = m3249x(arrayList2, arrayList3, z10, eVar, eVar2);
        m3248w(arrayList, arrayList3, m3249x.containsValue(Boolean.TRUE), m3249x);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            m3251s((AbstractC0721i0.e) it3.next());
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m3251s(AbstractC0721i0.e eVar) {
        eVar.m3372e().m3381a(eVar.m3373f().f2625H);
    }

    /* renamed from: t */
    void m3252t(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC0648y0.m2839a(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m3252t(arrayList, childAt);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    void m3253u(Map map, View view) {
        String m2592J = AbstractC0616q0.m2592J(view);
        if (m2592J != null) {
            map.put(m2592J, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m3253u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m3254v(C5303a c5303a, Collection collection) {
        Iterator it = c5303a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AbstractC0616q0.m2592J((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
