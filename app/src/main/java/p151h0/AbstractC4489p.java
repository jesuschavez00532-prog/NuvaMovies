package p151h0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC0616q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p214l.C5303a;

/* renamed from: h0.p */
/* loaded from: classes.dex */
public abstract class AbstractC4489p {

    /* renamed from: a */
    private static AbstractC4485n f19426a = new C4461b();

    /* renamed from: b */
    private static ThreadLocal f19427b = new ThreadLocal();

    /* renamed from: c */
    static ArrayList f19428c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.p$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        AbstractC4485n f19429a;

        /* renamed from: b */
        ViewGroup f19430b;

        /* renamed from: h0.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C7849a extends AbstractC4487o {

            /* renamed from: a */
            final /* synthetic */ C5303a f19431a;

            C7849a(C5303a c5303a) {
                this.f19431a = c5303a;
            }

            @Override // p151h0.AbstractC4485n.f
            /* renamed from: e */
            public void mo18685e(AbstractC4485n abstractC4485n) {
                ((ArrayList) this.f19431a.get(a.this.f19430b)).remove(abstractC4485n);
                abstractC4485n.mo18754R(this);
            }
        }

        a(AbstractC4485n abstractC4485n, ViewGroup viewGroup) {
            this.f19429a = abstractC4485n;
            this.f19430b = viewGroup;
        }

        /* renamed from: a */
        private void m18787a() {
            this.f19430b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19430b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m18787a();
            if (!AbstractC4489p.f19428c.remove(this.f19430b)) {
                return true;
            }
            C5303a m18784b = AbstractC4489p.m18784b();
            ArrayList arrayList = (ArrayList) m18784b.get(this.f19430b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                m18784b.put(this.f19430b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f19429a);
            this.f19429a.mo18760a(new C7849a(m18784b));
            this.f19429a.m18770k(this.f19430b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC4485n) it.next()).mo18756V(this.f19430b);
                }
            }
            this.f19429a.m18753Q(this.f19430b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m18787a();
            AbstractC4489p.f19428c.remove(this.f19430b);
            ArrayList arrayList = (ArrayList) AbstractC4489p.m18784b().get(this.f19430b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC4485n) it.next()).mo18756V(this.f19430b);
                }
            }
            this.f19429a.m18771l(true);
        }
    }

    /* renamed from: a */
    public static void m18783a(ViewGroup viewGroup, AbstractC4485n abstractC4485n) {
        if (!f19428c.contains(viewGroup) && AbstractC0616q0.m2600R(viewGroup)) {
            f19428c.add(viewGroup);
            if (abstractC4485n == null) {
                abstractC4485n = f19426a;
            }
            AbstractC4485n clone = abstractC4485n.clone();
            m18786d(viewGroup, clone);
            AbstractC4483m.m18731b(viewGroup, null);
            m18785c(viewGroup, clone);
        }
    }

    /* renamed from: b */
    static C5303a m18784b() {
        C5303a c5303a;
        WeakReference weakReference = (WeakReference) f19427b.get();
        if (weakReference != null && (c5303a = (C5303a) weakReference.get()) != null) {
            return c5303a;
        }
        C5303a c5303a2 = new C5303a();
        f19427b.set(new WeakReference(c5303a2));
        return c5303a2;
    }

    /* renamed from: c */
    private static void m18785c(ViewGroup viewGroup, AbstractC4485n abstractC4485n) {
        if (abstractC4485n != null && viewGroup != null) {
            a aVar = new a(abstractC4485n, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m18786d(ViewGroup viewGroup, AbstractC4485n abstractC4485n) {
        ArrayList arrayList = (ArrayList) m18784b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC4485n) it.next()).mo18752P(viewGroup);
            }
        }
        if (abstractC4485n != null) {
            abstractC4485n.m18770k(viewGroup, true);
        }
        AbstractC4483m.m18730a(viewGroup);
    }
}
