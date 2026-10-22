package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p331t.C6871b;

/* renamed from: androidx.fragment.app.e0 */
/* loaded from: classes.dex */
class C0713e0 extends AbstractC0715f0 {

    /* renamed from: androidx.fragment.app.e0$a */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2791a;

        a(Rect rect) {
            this.f2791a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f2791a;
        }
    }

    /* renamed from: androidx.fragment.app.e0$b */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2793a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2794b;

        b(View view, ArrayList arrayList) {
            this.f2793a = view;
            this.f2794b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2793a.setVisibility(8);
            int size = this.f2794b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f2794b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.e0$c */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2796a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2797b;

        /* renamed from: c */
        final /* synthetic */ Object f2798c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2799d;

        /* renamed from: e */
        final /* synthetic */ Object f2800e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2801f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2796a = obj;
            this.f2797b = arrayList;
            this.f2798c = obj2;
            this.f2799d = arrayList2;
            this.f2800e = obj3;
            this.f2801f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f2796a;
            if (obj != null) {
                C0713e0.this.mo3318q(obj, this.f2797b, null);
            }
            Object obj2 = this.f2798c;
            if (obj2 != null) {
                C0713e0.this.mo3318q(obj2, this.f2799d, null);
            }
            Object obj3 = this.f2800e;
            if (obj3 != null) {
                C0713e0.this.mo3318q(obj3, this.f2801f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e0$d */
    /* loaded from: classes.dex */
    class d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f2803a;

        d(Runnable runnable) {
            this.f2803a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f2803a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.e0$e */
    /* loaded from: classes.dex */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2805a;

        e(Rect rect) {
            this.f2805a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2805a;
            if (rect != null && !rect.isEmpty()) {
                return this.f2805a;
            }
            return null;
        }
    }

    /* renamed from: C */
    private static boolean m3307C(Transition transition) {
        List targetNames;
        List targetTypes;
        if (AbstractC0715f0.m3332l(transition.getTargetIds())) {
            targetNames = transition.getTargetNames();
            if (AbstractC0715f0.m3332l(targetNames)) {
                targetTypes = transition.getTargetTypes();
                if (AbstractC0715f0.m3332l(targetTypes)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: A */
    public void mo3308A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3318q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: B */
    public Object mo3309B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: a */
    public void mo3310a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: b */
    public void mo3311b(Object obj, ArrayList arrayList) {
        int transitionCount;
        Transition transitionAt;
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                transitionAt = transitionSet.getTransitionAt(i10);
                mo3311b(transitionAt, arrayList);
                i10++;
            }
            return;
        }
        if (!m3307C(transition) && AbstractC0715f0.m3332l(transition.getTargets())) {
            int size = arrayList.size();
            while (i10 < size) {
                transition.addTarget((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: c */
    public void mo3312c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: e */
    public boolean mo3313e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: g */
    public Object mo3314g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: m */
    public Object mo3315m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: n */
    public Object mo3316n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: p */
    public void mo3317p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: q */
    public void mo3318q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        int transitionCount;
        Transition transitionAt;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                transitionAt = transitionSet.getTransitionAt(i10);
                mo3318q(transitionAt, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (!m3307C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i10 < size) {
                transition.addTarget((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: r */
    public void mo3319r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: t */
    public void mo3320t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: u */
    public void mo3321u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: v */
    public void mo3322v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3335k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: w */
    public void mo3323w(Fragment fragment, Object obj, C6871b c6871b, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0715f0
    /* renamed from: z */
    public void mo3324z(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0715f0.m3329d(targets, (View) arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo3311b(transitionSet, arrayList);
    }
}
