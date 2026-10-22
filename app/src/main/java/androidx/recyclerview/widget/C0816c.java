package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC0616q0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0816c extends AbstractC0828o {

    /* renamed from: s */
    private static TimeInterpolator f3359s;

    /* renamed from: h */
    private ArrayList f3360h = new ArrayList();

    /* renamed from: i */
    private ArrayList f3361i = new ArrayList();

    /* renamed from: j */
    private ArrayList f3362j = new ArrayList();

    /* renamed from: k */
    private ArrayList f3363k = new ArrayList();

    /* renamed from: l */
    ArrayList f3364l = new ArrayList();

    /* renamed from: m */
    ArrayList f3365m = new ArrayList();

    /* renamed from: n */
    ArrayList f3366n = new ArrayList();

    /* renamed from: o */
    ArrayList f3367o = new ArrayList();

    /* renamed from: p */
    ArrayList f3368p = new ArrayList();

    /* renamed from: q */
    ArrayList f3369q = new ArrayList();

    /* renamed from: r */
    ArrayList f3370r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3371a;

        a(ArrayList arrayList) {
            this.f3371a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3371a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C0816c.this.m4165X(jVar.f3405a, jVar.f3406b, jVar.f3407c, jVar.f3408d, jVar.f3409e);
            }
            this.f3371a.clear();
            C0816c.this.f3365m.remove(this.f3371a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3373a;

        b(ArrayList arrayList) {
            this.f3373a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3373a.iterator();
            while (it.hasNext()) {
                C0816c.this.m4164W((i) it.next());
            }
            this.f3373a.clear();
            C0816c.this.f3366n.remove(this.f3373a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3375a;

        c(ArrayList arrayList) {
            this.f3375a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3375a.iterator();
            while (it.hasNext()) {
                C0816c.this.m4163V((RecyclerView.AbstractC0787f0) it.next());
            }
            this.f3375a.clear();
            C0816c.this.f3364l.remove(this.f3375a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0787f0 f3377a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3378b;

        /* renamed from: c */
        final /* synthetic */ View f3379c;

        d(RecyclerView.AbstractC0787f0 abstractC0787f0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3377a = abstractC0787f0;
            this.f3378b = viewPropertyAnimator;
            this.f3379c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3378b.setListener(null);
            this.f3379c.setAlpha(1.0f);
            C0816c.this.m4263K(this.f3377a);
            C0816c.this.f3369q.remove(this.f3377a);
            C0816c.this.m4167a0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0816c.this.m4264L(this.f3377a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0787f0 f3381a;

        /* renamed from: b */
        final /* synthetic */ View f3382b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3383c;

        e(RecyclerView.AbstractC0787f0 abstractC0787f0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3381a = abstractC0787f0;
            this.f3382b = view;
            this.f3383c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3382b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3383c.setListener(null);
            C0816c.this.m4257E(this.f3381a);
            C0816c.this.f3367o.remove(this.f3381a);
            C0816c.this.m4167a0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0816c.this.m4258F(this.f3381a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0787f0 f3385a;

        /* renamed from: b */
        final /* synthetic */ int f3386b;

        /* renamed from: c */
        final /* synthetic */ View f3387c;

        /* renamed from: d */
        final /* synthetic */ int f3388d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3389e;

        f(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3385a = abstractC0787f0;
            this.f3386b = i10;
            this.f3387c = view;
            this.f3388d = i11;
            this.f3389e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3386b != 0) {
                this.f3387c.setTranslationX(0.0f);
            }
            if (this.f3388d != 0) {
                this.f3387c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3389e.setListener(null);
            C0816c.this.m4261I(this.f3385a);
            C0816c.this.f3368p.remove(this.f3385a);
            C0816c.this.m4167a0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0816c.this.m4262J(this.f3385a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f3391a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3392b;

        /* renamed from: c */
        final /* synthetic */ View f3393c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3391a = iVar;
            this.f3392b = viewPropertyAnimator;
            this.f3393c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3392b.setListener(null);
            this.f3393c.setAlpha(1.0f);
            this.f3393c.setTranslationX(0.0f);
            this.f3393c.setTranslationY(0.0f);
            C0816c.this.m4259G(this.f3391a.f3399a, true);
            C0816c.this.f3370r.remove(this.f3391a.f3399a);
            C0816c.this.m4167a0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0816c.this.m4260H(this.f3391a.f3399a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f3395a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3396b;

        /* renamed from: c */
        final /* synthetic */ View f3397c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3395a = iVar;
            this.f3396b = viewPropertyAnimator;
            this.f3397c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3396b.setListener(null);
            this.f3397c.setAlpha(1.0f);
            this.f3397c.setTranslationX(0.0f);
            this.f3397c.setTranslationY(0.0f);
            C0816c.this.m4259G(this.f3395a.f3400b, false);
            C0816c.this.f3370r.remove(this.f3395a.f3400b);
            C0816c.this.m4167a0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0816c.this.m4260H(this.f3395a.f3400b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC0787f0 f3405a;

        /* renamed from: b */
        public int f3406b;

        /* renamed from: c */
        public int f3407c;

        /* renamed from: d */
        public int f3408d;

        /* renamed from: e */
        public int f3409e;

        j(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11, int i12, int i13) {
            this.f3405a = abstractC0787f0;
            this.f3406b = i10;
            this.f3407c = i11;
            this.f3408d = i12;
            this.f3409e = i13;
        }
    }

    /* renamed from: Y */
    private void m4154Y(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        View view = abstractC0787f0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3369q.add(abstractC0787f0);
        animate.setDuration(m3898o()).alpha(0.0f).setListener(new d(abstractC0787f0, animate, view)).start();
    }

    /* renamed from: b0 */
    private void m4155b0(List list, RecyclerView.AbstractC0787f0 abstractC0787f0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (m4157d0(iVar, abstractC0787f0) && iVar.f3399a == null && iVar.f3400b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: c0 */
    private void m4156c0(i iVar) {
        RecyclerView.AbstractC0787f0 abstractC0787f0 = iVar.f3399a;
        if (abstractC0787f0 != null) {
            m4157d0(iVar, abstractC0787f0);
        }
        RecyclerView.AbstractC0787f0 abstractC0787f02 = iVar.f3400b;
        if (abstractC0787f02 != null) {
            m4157d0(iVar, abstractC0787f02);
        }
    }

    /* renamed from: d0 */
    private boolean m4157d0(i iVar, RecyclerView.AbstractC0787f0 abstractC0787f0) {
        boolean z10 = false;
        if (iVar.f3400b == abstractC0787f0) {
            iVar.f3400b = null;
        } else {
            if (iVar.f3399a != abstractC0787f0) {
                return false;
            }
            iVar.f3399a = null;
            z10 = true;
        }
        abstractC0787f0.itemView.setAlpha(1.0f);
        abstractC0787f0.itemView.setTranslationX(0.0f);
        abstractC0787f0.itemView.setTranslationY(0.0f);
        m4259G(abstractC0787f0, z10);
        return true;
    }

    /* renamed from: e0 */
    private void m4158e0(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        if (f3359s == null) {
            f3359s = new ValueAnimator().getInterpolator();
        }
        abstractC0787f0.itemView.animate().setInterpolator(f3359s);
        mo3893j(abstractC0787f0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0828o
    /* renamed from: A */
    public boolean mo4159A(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4158e0(abstractC0787f0);
        abstractC0787f0.itemView.setAlpha(0.0f);
        this.f3361i.add(abstractC0787f0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0828o
    /* renamed from: B */
    public boolean mo4160B(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0787f0 abstractC0787f02, int i10, int i11, int i12, int i13) {
        if (abstractC0787f0 == abstractC0787f02) {
            return mo4161C(abstractC0787f0, i10, i11, i12, i13);
        }
        float translationX = abstractC0787f0.itemView.getTranslationX();
        float translationY = abstractC0787f0.itemView.getTranslationY();
        float alpha = abstractC0787f0.itemView.getAlpha();
        m4158e0(abstractC0787f0);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        abstractC0787f0.itemView.setTranslationX(translationX);
        abstractC0787f0.itemView.setTranslationY(translationY);
        abstractC0787f0.itemView.setAlpha(alpha);
        if (abstractC0787f02 != null) {
            m4158e0(abstractC0787f02);
            abstractC0787f02.itemView.setTranslationX(-i14);
            abstractC0787f02.itemView.setTranslationY(-i15);
            abstractC0787f02.itemView.setAlpha(0.0f);
        }
        this.f3363k.add(new i(abstractC0787f0, abstractC0787f02, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0828o
    /* renamed from: C */
    public boolean mo4161C(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11, int i12, int i13) {
        View view = abstractC0787f0.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC0787f0.itemView.getTranslationY());
        m4158e0(abstractC0787f0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m4261I(abstractC0787f0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3362j.add(new j(abstractC0787f0, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0828o
    /* renamed from: D */
    public boolean mo4162D(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4158e0(abstractC0787f0);
        this.f3360h.add(abstractC0787f0);
        return true;
    }

    /* renamed from: V */
    void m4163V(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        View view = abstractC0787f0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3367o.add(abstractC0787f0);
        animate.alpha(1.0f).setDuration(m3895l()).setListener(new e(abstractC0787f0, view, animate)).start();
    }

    /* renamed from: W */
    void m4164W(i iVar) {
        View view;
        RecyclerView.AbstractC0787f0 abstractC0787f0 = iVar.f3399a;
        View view2 = null;
        if (abstractC0787f0 == null) {
            view = null;
        } else {
            view = abstractC0787f0.itemView;
        }
        RecyclerView.AbstractC0787f0 abstractC0787f02 = iVar.f3400b;
        if (abstractC0787f02 != null) {
            view2 = abstractC0787f02.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m3896m());
            this.f3370r.add(iVar.f3399a);
            duration.translationX(iVar.f3403e - iVar.f3401c);
            duration.translationY(iVar.f3404f - iVar.f3402d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3370r.add(iVar.f3400b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m3896m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: X */
    void m4165X(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11, int i12, int i13) {
        View view = abstractC0787f0.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3368p.add(abstractC0787f0);
        animate.setDuration(m3897n()).setListener(new f(abstractC0787f0, i14, view, i15, animate)).start();
    }

    /* renamed from: Z */
    void m4166Z(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC0787f0) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: a0 */
    void m4167a0() {
        if (!mo3899p()) {
            m3892i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: g */
    public boolean mo3890g(RecyclerView.AbstractC0787f0 abstractC0787f0, List list) {
        if (list.isEmpty() && !super.mo3890g(abstractC0787f0, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: j */
    public void mo3893j(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        View view = abstractC0787f0.itemView;
        view.animate().cancel();
        int size = this.f3362j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f3362j.get(size)).f3405a == abstractC0787f0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4261I(abstractC0787f0);
                this.f3362j.remove(size);
            }
        }
        m4155b0(this.f3363k, abstractC0787f0);
        if (this.f3360h.remove(abstractC0787f0)) {
            view.setAlpha(1.0f);
            m4263K(abstractC0787f0);
        }
        if (this.f3361i.remove(abstractC0787f0)) {
            view.setAlpha(1.0f);
            m4257E(abstractC0787f0);
        }
        for (int size2 = this.f3366n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3366n.get(size2);
            m4155b0(arrayList, abstractC0787f0);
            if (arrayList.isEmpty()) {
                this.f3366n.remove(size2);
            }
        }
        for (int size3 = this.f3365m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3365m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f3405a == abstractC0787f0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4261I(abstractC0787f0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3365m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3364l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3364l.get(size5);
            if (arrayList3.remove(abstractC0787f0)) {
                view.setAlpha(1.0f);
                m4257E(abstractC0787f0);
                if (arrayList3.isEmpty()) {
                    this.f3364l.remove(size5);
                }
            }
        }
        this.f3369q.remove(abstractC0787f0);
        this.f3367o.remove(abstractC0787f0);
        this.f3370r.remove(abstractC0787f0);
        this.f3368p.remove(abstractC0787f0);
        m4167a0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: k */
    public void mo3894k() {
        int size = this.f3362j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3362j.get(size);
            View view = jVar.f3405a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4261I(jVar.f3405a);
            this.f3362j.remove(size);
        }
        for (int size2 = this.f3360h.size() - 1; size2 >= 0; size2--) {
            m4263K((RecyclerView.AbstractC0787f0) this.f3360h.get(size2));
            this.f3360h.remove(size2);
        }
        int size3 = this.f3361i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0787f0 abstractC0787f0 = (RecyclerView.AbstractC0787f0) this.f3361i.get(size3);
            abstractC0787f0.itemView.setAlpha(1.0f);
            m4257E(abstractC0787f0);
            this.f3361i.remove(size3);
        }
        for (int size4 = this.f3363k.size() - 1; size4 >= 0; size4--) {
            m4156c0((i) this.f3363k.get(size4));
        }
        this.f3363k.clear();
        if (!mo3899p()) {
            return;
        }
        for (int size5 = this.f3365m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList = (ArrayList) this.f3365m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = (j) arrayList.get(size6);
                View view2 = jVar2.f3405a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                m4261I(jVar2.f3405a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f3365m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f3364l.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList2 = (ArrayList) this.f3364l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.AbstractC0787f0 abstractC0787f02 = (RecyclerView.AbstractC0787f0) arrayList2.get(size8);
                abstractC0787f02.itemView.setAlpha(1.0f);
                m4257E(abstractC0787f02);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f3364l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f3366n.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList3 = (ArrayList) this.f3366n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                m4156c0((i) arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f3366n.remove(arrayList3);
                }
            }
        }
        m4166Z(this.f3369q);
        m4166Z(this.f3368p);
        m4166Z(this.f3367o);
        m4166Z(this.f3370r);
        m3892i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: p */
    public boolean mo3899p() {
        if (this.f3361i.isEmpty() && this.f3363k.isEmpty() && this.f3362j.isEmpty() && this.f3360h.isEmpty() && this.f3368p.isEmpty() && this.f3369q.isEmpty() && this.f3367o.isEmpty() && this.f3370r.isEmpty() && this.f3365m.isEmpty() && this.f3364l.isEmpty() && this.f3366n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: u */
    public void mo3904u() {
        long j10;
        long j11;
        boolean z10 = !this.f3360h.isEmpty();
        boolean z11 = !this.f3362j.isEmpty();
        boolean z12 = !this.f3363k.isEmpty();
        boolean z13 = !this.f3361i.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator it = this.f3360h.iterator();
        while (it.hasNext()) {
            m4154Y((RecyclerView.AbstractC0787f0) it.next());
        }
        this.f3360h.clear();
        if (z11) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f3362j);
            this.f3365m.add(arrayList);
            this.f3362j.clear();
            a aVar = new a(arrayList);
            if (z10) {
                AbstractC0616q0.m2622g0(((j) arrayList.get(0)).f3405a.itemView, aVar, m3898o());
            } else {
                aVar.run();
            }
        }
        if (z12) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f3363k);
            this.f3366n.add(arrayList2);
            this.f3363k.clear();
            b bVar = new b(arrayList2);
            if (z10) {
                AbstractC0616q0.m2622g0(((i) arrayList2.get(0)).f3399a.itemView, bVar, m3898o());
            } else {
                bVar.run();
            }
        }
        if (z13) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f3361i);
            this.f3364l.add(arrayList3);
            this.f3361i.clear();
            c cVar = new c(arrayList3);
            if (!z10 && !z11 && !z12) {
                cVar.run();
                return;
            }
            long j12 = 0;
            if (z10) {
                j10 = m3898o();
            } else {
                j10 = 0;
            }
            if (z11) {
                j11 = m3897n();
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = m3896m();
            }
            AbstractC0616q0.m2622g0(((RecyclerView.AbstractC0787f0) arrayList3.get(0)).itemView, cVar, j10 + Math.max(j11, j12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC0787f0 f3399a;

        /* renamed from: b */
        public RecyclerView.AbstractC0787f0 f3400b;

        /* renamed from: c */
        public int f3401c;

        /* renamed from: d */
        public int f3402d;

        /* renamed from: e */
        public int f3403e;

        /* renamed from: f */
        public int f3404f;

        private i(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0787f0 abstractC0787f02) {
            this.f3399a = abstractC0787f0;
            this.f3400b = abstractC0787f02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3399a + ", newHolder=" + this.f3400b + ", fromX=" + this.f3401c + ", fromY=" + this.f3402d + ", toX=" + this.f3403e + ", toY=" + this.f3404f + '}';
        }

        i(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0787f0 abstractC0787f02, int i10, int i11, int i12, int i13) {
            this(abstractC0787f0, abstractC0787f02);
            this.f3401c = i10;
            this.f3402d = i11;
            this.f3403e = i12;
            this.f3404f = i13;
        }
    }
}
