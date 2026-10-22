package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0648y0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0600m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p331t.C6871b;

/* renamed from: androidx.fragment.app.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC0715f0 {

    /* renamed from: androidx.fragment.app.f0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f2825a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2826b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f2827c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2828d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f2829e;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2825a = i10;
            this.f2826b = arrayList;
            this.f2827c = arrayList2;
            this.f2828d = arrayList3;
            this.f2829e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f2825a; i10++) {
                AbstractC0616q0.m2580B0((View) this.f2826b.get(i10), (String) this.f2827c.get(i10));
                AbstractC0616q0.m2580B0((View) this.f2828d.get(i10), (String) this.f2829e.get(i10));
            }
        }
    }

    /* renamed from: androidx.fragment.app.f0$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2831a;

        /* renamed from: b */
        final /* synthetic */ Map f2832b;

        b(ArrayList arrayList, Map map) {
            this.f2831a = arrayList;
            this.f2832b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2831a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2831a.get(i10);
                String m2592J = AbstractC0616q0.m2592J(view);
                if (m2592J != null) {
                    AbstractC0616q0.m2580B0(view, AbstractC0715f0.m3331i(this.f2832b, m2592J));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.f0$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2834a;

        /* renamed from: b */
        final /* synthetic */ Map f2835b;

        c(ArrayList arrayList, Map map) {
            this.f2834a = arrayList;
            this.f2835b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2834a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2834a.get(i10);
                AbstractC0616q0.m2580B0(view, (String) this.f2835b.get(AbstractC0616q0.m2592J(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m3329d(List list, View view) {
        int size = list.size();
        if (m3330h(list, view, size)) {
            return;
        }
        if (AbstractC0616q0.m2592J(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m3330h(list, childAt, size) && AbstractC0616q0.m2592J(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m3330h(List list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m3331i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m3332l(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public abstract void mo3308A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: B */
    public abstract Object mo3309B(Object obj);

    /* renamed from: a */
    public abstract void mo3310a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3311b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo3312c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3313e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3333f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (AbstractC0648y0.m2839a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m3333f(arrayList, viewGroup.getChildAt(i10));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo3314g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3334j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String m2592J = AbstractC0616q0.m2592J(view);
            if (m2592J != null) {
                map.put(m2592J, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m3334j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m3335k(View view, Rect rect) {
        if (!AbstractC0616q0.m2599Q(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: m */
    public abstract Object mo3315m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3316n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList m3336o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            arrayList2.add(AbstractC0616q0.m2592J(view));
            AbstractC0616q0.m2580B0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo3317p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3318q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: r */
    public abstract void mo3319r(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m3337s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo3320t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: u */
    public abstract void mo3321u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3322v(Object obj, View view);

    /* renamed from: w */
    public void mo3323w(Fragment fragment, Object obj, C6871b c6871b, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m3338x(View view, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m3339y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList.get(i10);
            String m2592J = AbstractC0616q0.m2592J(view2);
            arrayList4.add(m2592J);
            if (m2592J != null) {
                AbstractC0616q0.m2580B0(view2, null);
                String str = (String) map.get(m2592J);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        AbstractC0616q0.m2580B0((View) arrayList2.get(i11), m2592J);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo3324z(Object obj, View view, ArrayList arrayList);
}
