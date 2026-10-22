package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0600m0;
import androidx.fragment.app.AbstractC0738x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p151h0.C4467e;
import p214l.C5303a;
import p331t.C6871b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public abstract class AbstractC0739y {

    /* renamed from: a */
    private static final int[] f3027a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC0715f0 f3028b;

    /* renamed from: c */
    static final AbstractC0715f0 f3029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f3030a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3031b;

        /* renamed from: c */
        final /* synthetic */ C6871b f3032c;

        a(g gVar, Fragment fragment, C6871b c6871b) {
            this.f3030a = gVar;
            this.f3031b = fragment;
            this.f3032c = c6871b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3030a.mo3559a(this.f3031b, this.f3032c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3033a;

        b(ArrayList arrayList) {
            this.f3033a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0739y.m3647A(this.f3033a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f3034a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3035b;

        /* renamed from: c */
        final /* synthetic */ C6871b f3036c;

        c(g gVar, Fragment fragment, C6871b c6871b) {
            this.f3034a = gVar;
            this.f3035b = fragment;
            this.f3036c = c6871b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3034a.mo3559a(this.f3035b, this.f3036c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f3037a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0715f0 f3038b;

        /* renamed from: c */
        final /* synthetic */ View f3039c;

        /* renamed from: d */
        final /* synthetic */ Fragment f3040d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3041e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3042f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3043g;

        /* renamed from: h */
        final /* synthetic */ Object f3044h;

        d(Object obj, AbstractC0715f0 abstractC0715f0, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3037a = obj;
            this.f3038b = abstractC0715f0;
            this.f3039c = view;
            this.f3040d = fragment;
            this.f3041e = arrayList;
            this.f3042f = arrayList2;
            this.f3043g = arrayList3;
            this.f3044h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3037a;
            if (obj != null) {
                this.f3038b.mo3317p(obj, this.f3039c);
                this.f3042f.addAll(AbstractC0739y.m3659k(this.f3038b, this.f3037a, this.f3040d, this.f3041e, this.f3039c));
            }
            if (this.f3043g != null) {
                if (this.f3044h != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3039c);
                    this.f3038b.mo3318q(this.f3044h, this.f3043g, arrayList);
                }
                this.f3043g.clear();
                this.f3043g.add(this.f3039c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f3045a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3046b;

        /* renamed from: c */
        final /* synthetic */ boolean f3047c;

        /* renamed from: d */
        final /* synthetic */ C5303a f3048d;

        /* renamed from: e */
        final /* synthetic */ View f3049e;

        /* renamed from: f */
        final /* synthetic */ AbstractC0715f0 f3050f;

        /* renamed from: g */
        final /* synthetic */ Rect f3051g;

        e(Fragment fragment, Fragment fragment2, boolean z10, C5303a c5303a, View view, AbstractC0715f0 abstractC0715f0, Rect rect) {
            this.f3045a = fragment;
            this.f3046b = fragment2;
            this.f3047c = z10;
            this.f3048d = c5303a;
            this.f3049e = view;
            this.f3050f = abstractC0715f0;
            this.f3051g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0739y.m3654f(this.f3045a, this.f3046b, this.f3047c, this.f3048d, false);
            View view = this.f3049e;
            if (view != null) {
                this.f3050f.m3335k(view, this.f3051g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0715f0 f3052a;

        /* renamed from: b */
        final /* synthetic */ C5303a f3053b;

        /* renamed from: c */
        final /* synthetic */ Object f3054c;

        /* renamed from: d */
        final /* synthetic */ h f3055d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3056e;

        /* renamed from: f */
        final /* synthetic */ View f3057f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3058g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3059h;

        /* renamed from: i */
        final /* synthetic */ boolean f3060i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3061j;

        /* renamed from: k */
        final /* synthetic */ Object f3062k;

        /* renamed from: l */
        final /* synthetic */ Rect f3063l;

        f(AbstractC0715f0 abstractC0715f0, C5303a c5303a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3052a = abstractC0715f0;
            this.f3053b = c5303a;
            this.f3054c = obj;
            this.f3055d = hVar;
            this.f3056e = arrayList;
            this.f3057f = view;
            this.f3058g = fragment;
            this.f3059h = fragment2;
            this.f3060i = z10;
            this.f3061j = arrayList2;
            this.f3062k = obj2;
            this.f3063l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5303a m3656h = AbstractC0739y.m3656h(this.f3052a, this.f3053b, this.f3054c, this.f3055d);
            if (m3656h != null) {
                this.f3056e.addAll(m3656h.values());
                this.f3056e.add(this.f3057f);
            }
            AbstractC0739y.m3654f(this.f3058g, this.f3059h, this.f3060i, m3656h, false);
            Object obj = this.f3054c;
            if (obj != null) {
                this.f3052a.mo3308A(obj, this.f3061j, this.f3056e);
                View m3667s = AbstractC0739y.m3667s(m3656h, this.f3055d, this.f3062k, this.f3060i);
                if (m3667s != null) {
                    this.f3052a.m3335k(m3667s, this.f3063l);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo3559a(Fragment fragment, C6871b c6871b);

        /* renamed from: b */
        void mo3560b(Fragment fragment, C6871b c6871b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public Fragment f3064a;

        /* renamed from: b */
        public boolean f3065b;

        /* renamed from: c */
        public C0704a f3066c;

        /* renamed from: d */
        public Fragment f3067d;

        /* renamed from: e */
        public boolean f3068e;

        /* renamed from: f */
        public C0704a f3069f;

        h() {
        }
    }

    static {
        C0713e0 c0713e0;
        if (Build.VERSION.SDK_INT >= 21) {
            c0713e0 = new C0713e0();
        } else {
            c0713e0 = null;
        }
        f3028b = c0713e0;
        f3029c = m3671w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m3647A(ArrayList arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m3648B(Context context, AbstractC0716g abstractC0716g, ArrayList arrayList, ArrayList arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            C0704a c0704a = (C0704a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                m3653e(c0704a, sparseArray, z10);
            } else {
                m3651c(c0704a, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                C5303a m3652d = m3652d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (abstractC0716g.mo3210d() && (viewGroup = (ViewGroup) abstractC0716g.mo3209c(keyAt)) != null) {
                    if (z10) {
                        m3663o(viewGroup, hVar, view, m3652d, gVar);
                    } else {
                        m3662n(viewGroup, hVar, view, m3652d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3649a(ArrayList arrayList, C5303a c5303a, Collection collection) {
        for (int size = c5303a.size() - 1; size >= 0; size--) {
            View view = (View) c5303a.m21435m(size);
            if (collection.contains(AbstractC0616q0.m2592J(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0039, code lost:
    
        if (r0.f2654l != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006e, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x008a, code lost:
    
        if (r0.f2669z == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m3650b(androidx.fragment.app.C0704a r8, androidx.fragment.app.AbstractC0738x.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0739y.m3650b(androidx.fragment.app.a, androidx.fragment.app.x$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m3651c(C0704a c0704a, SparseArray sparseArray, boolean z10) {
        int size = c0704a.f3002c.size();
        for (int i10 = 0; i10 < size; i10++) {
            m3650b(c0704a, (AbstractC0738x.a) c0704a.f3002c.get(i10), sparseArray, false, z10);
        }
    }

    /* renamed from: d */
    private static C5303a m3652d(int i10, ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        C5303a c5303a = new C5303a();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            C0704a c0704a = (C0704a) arrayList.get(i13);
            if (c0704a.m3220D(i10)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i13)).booleanValue();
                ArrayList arrayList5 = c0704a.f3015p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0704a.f3015p;
                        arrayList4 = c0704a.f3016q;
                    } else {
                        ArrayList arrayList6 = c0704a.f3015p;
                        arrayList3 = c0704a.f3016q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = (String) arrayList4.get(i14);
                        String str2 = (String) arrayList3.get(i14);
                        String str3 = (String) c5303a.remove(str2);
                        if (str3 != null) {
                            c5303a.put(str, str3);
                        } else {
                            c5303a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c5303a;
    }

    /* renamed from: e */
    public static void m3653e(C0704a c0704a, SparseArray sparseArray, boolean z10) {
        if (!c0704a.f2703t.m3536n0().mo3210d()) {
            return;
        }
        for (int size = c0704a.f3002c.size() - 1; size >= 0; size--) {
            m3650b(c0704a, (AbstractC0738x.a) c0704a.f3002c.get(size), sparseArray, true, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m3654f(Fragment fragment, Fragment fragment2, boolean z10, C5303a c5303a, boolean z11) {
        if (z10) {
            fragment2.m3105M6();
        } else {
            fragment.m3105M6();
        }
    }

    /* renamed from: g */
    private static boolean m3655g(AbstractC0715f0 abstractC0715f0, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!abstractC0715f0.mo3313e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C5303a m3656h(AbstractC0715f0 abstractC0715f0, C5303a c5303a, Object obj, h hVar) {
        ArrayList arrayList;
        Fragment fragment = hVar.f3064a;
        View m3182n7 = fragment.m3182n7();
        if (!c5303a.isEmpty() && obj != null && m3182n7 != null) {
            C5303a c5303a2 = new C5303a();
            abstractC0715f0.m3334j(c5303a2, m3182n7);
            C0704a c0704a = hVar.f3066c;
            if (hVar.f3065b) {
                fragment.m3114P6();
                arrayList = c0704a.f3015p;
            } else {
                fragment.m3105M6();
                arrayList = c0704a.f3016q;
            }
            if (arrayList != null) {
                c5303a2.m21350o(arrayList);
                c5303a2.m21350o(c5303a.values());
            }
            m3672x(c5303a, c5303a2);
            return c5303a2;
        }
        c5303a.clear();
        return null;
    }

    /* renamed from: i */
    private static C5303a m3657i(AbstractC0715f0 abstractC0715f0, C5303a c5303a, Object obj, h hVar) {
        ArrayList arrayList;
        if (!c5303a.isEmpty() && obj != null) {
            Fragment fragment = hVar.f3067d;
            C5303a c5303a2 = new C5303a();
            abstractC0715f0.m3334j(c5303a2, fragment.m3113O8());
            C0704a c0704a = hVar.f3069f;
            if (hVar.f3068e) {
                fragment.m3105M6();
                arrayList = c0704a.f3016q;
            } else {
                fragment.m3114P6();
                arrayList = c0704a.f3015p;
            }
            if (arrayList != null) {
                c5303a2.m21350o(arrayList);
            }
            c5303a.m21350o(c5303a2.keySet());
            return c5303a2;
        }
        c5303a.clear();
        return null;
    }

    /* renamed from: j */
    private static AbstractC0715f0 m3658j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m3111O6 = fragment.m3111O6();
            if (m3111O6 != null) {
                arrayList.add(m3111O6);
            }
            Object m3157e7 = fragment.m3157e7();
            if (m3157e7 != null) {
                arrayList.add(m3157e7);
            }
            Object m3163g7 = fragment.m3163g7();
            if (m3163g7 != null) {
                arrayList.add(m3163g7);
            }
        }
        if (fragment2 != null) {
            Object m3102L6 = fragment2.m3102L6();
            if (m3102L6 != null) {
                arrayList.add(m3102L6);
            }
            Object m3151c7 = fragment2.m3151c7();
            if (m3151c7 != null) {
                arrayList.add(m3151c7);
            }
            Object m3160f7 = fragment2.m3160f7();
            if (m3160f7 != null) {
                arrayList.add(m3160f7);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0715f0 abstractC0715f0 = f3028b;
        if (abstractC0715f0 != null && m3655g(abstractC0715f0, arrayList)) {
            return abstractC0715f0;
        }
        AbstractC0715f0 abstractC0715f02 = f3029c;
        if (abstractC0715f02 != null && m3655g(abstractC0715f02, arrayList)) {
            return abstractC0715f02;
        }
        if (abstractC0715f0 == null && abstractC0715f02 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList m3659k(AbstractC0715f0 abstractC0715f0, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj != null) {
            ArrayList arrayList2 = new ArrayList();
            View m3182n7 = fragment.m3182n7();
            if (m3182n7 != null) {
                abstractC0715f0.m3333f(arrayList2, m3182n7);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC0715f0.mo3311b(obj, arrayList2);
                return arrayList2;
            }
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    private static Object m3660l(AbstractC0715f0 abstractC0715f0, ViewGroup viewGroup, View view, C5303a c5303a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object m3668t;
        C5303a c5303a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3064a;
        Fragment fragment2 = hVar.f3067d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3065b;
        if (c5303a.isEmpty()) {
            c5303a2 = c5303a;
            m3668t = null;
        } else {
            m3668t = m3668t(abstractC0715f0, fragment, fragment2, z10);
            c5303a2 = c5303a;
        }
        C5303a m3657i = m3657i(abstractC0715f0, c5303a2, m3668t, hVar);
        if (c5303a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m3657i.values());
            obj3 = m3668t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m3654f(fragment, fragment2, z10, m3657i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0715f0.mo3324z(obj3, view, arrayList);
            m3674z(abstractC0715f0, obj3, obj2, m3657i, hVar.f3068e, hVar.f3069f);
            if (obj != null) {
                abstractC0715f0.mo3321u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(viewGroup, new f(abstractC0715f0, c5303a, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m3661m(AbstractC0715f0 abstractC0715f0, ViewGroup viewGroup, View view, C5303a c5303a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object m3668t;
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3064a;
        Fragment fragment2 = hVar.f3067d;
        if (fragment != null) {
            fragment.m3113O8().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3065b;
        if (c5303a.isEmpty()) {
            m3668t = null;
        } else {
            m3668t = m3668t(abstractC0715f0, fragment, fragment2, z10);
        }
        C5303a m3657i = m3657i(abstractC0715f0, c5303a, m3668t, hVar);
        C5303a m3656h = m3656h(abstractC0715f0, c5303a, m3668t, hVar);
        if (c5303a.isEmpty()) {
            if (m3657i != null) {
                m3657i.clear();
            }
            if (m3656h != null) {
                m3656h.clear();
            }
            obj3 = null;
        } else {
            m3649a(arrayList, m3657i, c5303a.keySet());
            m3649a(arrayList2, m3656h, c5303a.values());
            obj3 = m3668t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m3654f(fragment, fragment2, z10, m3657i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0715f0.mo3324z(obj3, view, arrayList);
            m3674z(abstractC0715f0, obj3, obj2, m3657i, hVar.f3068e, hVar.f3069f);
            Rect rect2 = new Rect();
            View m3667s = m3667s(m3656h, hVar, obj, z10);
            if (m3667s != null) {
                abstractC0715f0.mo3321u(obj, rect2);
            }
            rect = rect2;
            view2 = m3667s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(viewGroup, new e(fragment, fragment2, z10, m3656h, view2, abstractC0715f0, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m3662n(ViewGroup viewGroup, h hVar, View view, C5303a c5303a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3064a;
        Fragment fragment2 = hVar.f3067d;
        AbstractC0715f0 m3658j = m3658j(fragment2, fragment);
        if (m3658j == null) {
            return;
        }
        boolean z10 = hVar.f3065b;
        boolean z11 = hVar.f3068e;
        Object m3665q = m3665q(m3658j, fragment, z10);
        Object m3666r = m3666r(m3658j, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object m3660l = m3660l(m3658j, viewGroup, view, c5303a, hVar, arrayList, arrayList2, m3665q, m3666r);
        if (m3665q == null && m3660l == null) {
            obj = m3666r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m3666r;
        }
        ArrayList m3659k = m3659k(m3658j, obj, fragment2, arrayList, view);
        if (m3659k == null || m3659k.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        m3658j.mo3310a(m3665q, view);
        Object m3669u = m3669u(m3658j, m3665q, obj2, m3660l, fragment, hVar.f3065b);
        if (fragment2 != null && m3659k != null && (m3659k.size() > 0 || arrayList.size() > 0)) {
            C6871b c6871b = new C6871b();
            gVar.mo3560b(fragment2, c6871b);
            m3658j.mo3323w(fragment2, m3669u, c6871b, new c(gVar, fragment2, c6871b));
        }
        if (m3669u != null) {
            ArrayList arrayList3 = new ArrayList();
            m3658j.mo3320t(m3669u, m3665q, arrayList3, obj2, m3659k, m3660l, arrayList2);
            m3673y(m3658j, viewGroup, fragment, view, arrayList2, m3665q, arrayList3, obj2, m3659k);
            m3658j.m3338x(viewGroup, arrayList2, c5303a);
            m3658j.mo3312c(viewGroup, m3669u);
            m3658j.m3337s(viewGroup, arrayList2, c5303a);
        }
    }

    /* renamed from: o */
    private static void m3663o(ViewGroup viewGroup, h hVar, View view, C5303a c5303a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3064a;
        Fragment fragment2 = hVar.f3067d;
        AbstractC0715f0 m3658j = m3658j(fragment2, fragment);
        if (m3658j == null) {
            return;
        }
        boolean z10 = hVar.f3065b;
        boolean z11 = hVar.f3068e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object m3665q = m3665q(m3658j, fragment, z10);
        Object m3666r = m3666r(m3658j, fragment2, z11);
        Object m3661m = m3661m(m3658j, viewGroup, view, c5303a, hVar, arrayList2, arrayList, m3665q, m3666r);
        if (m3665q == null && m3661m == null) {
            obj = m3666r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m3666r;
        }
        ArrayList m3659k = m3659k(m3658j, obj, fragment2, arrayList2, view);
        ArrayList m3659k2 = m3659k(m3658j, m3665q, fragment, arrayList, view);
        m3647A(m3659k2, 4);
        Object m3669u = m3669u(m3658j, m3665q, obj, m3661m, fragment, z10);
        if (fragment2 != null && m3659k != null && (m3659k.size() > 0 || arrayList2.size() > 0)) {
            C6871b c6871b = new C6871b();
            gVar.mo3560b(fragment2, c6871b);
            m3658j.mo3323w(fragment2, m3669u, c6871b, new a(gVar, fragment2, c6871b));
        }
        if (m3669u != null) {
            m3670v(m3658j, obj, fragment2, m3659k);
            ArrayList m3336o = m3658j.m3336o(arrayList);
            m3658j.mo3320t(m3669u, m3665q, m3659k2, obj, m3659k, m3661m, arrayList);
            m3658j.mo3312c(viewGroup, m3669u);
            m3658j.m3339y(viewGroup, arrayList2, arrayList, m3336o, c5303a);
            m3647A(m3659k2, 0);
            m3658j.mo3308A(m3661m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static h m3664p(h hVar, SparseArray sparseArray, int i10) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i10, hVar2);
            return hVar2;
        }
        return hVar;
    }

    /* renamed from: q */
    private static Object m3665q(AbstractC0715f0 abstractC0715f0, Fragment fragment, boolean z10) {
        Object m3102L6;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            m3102L6 = fragment.m3151c7();
        } else {
            m3102L6 = fragment.m3102L6();
        }
        return abstractC0715f0.mo3314g(m3102L6);
    }

    /* renamed from: r */
    private static Object m3666r(AbstractC0715f0 abstractC0715f0, Fragment fragment, boolean z10) {
        Object m3111O6;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            m3111O6 = fragment.m3157e7();
        } else {
            m3111O6 = fragment.m3111O6();
        }
        return abstractC0715f0.mo3314g(m3111O6);
    }

    /* renamed from: s */
    static View m3667s(C5303a c5303a, h hVar, Object obj, boolean z10) {
        ArrayList arrayList;
        String str;
        C0704a c0704a = hVar.f3066c;
        if (obj != null && c5303a != null && (arrayList = c0704a.f3015p) != null && !arrayList.isEmpty()) {
            if (z10) {
                str = (String) c0704a.f3015p.get(0);
            } else {
                str = (String) c0704a.f3016q.get(0);
            }
            return (View) c5303a.get(str);
        }
        return null;
    }

    /* renamed from: t */
    private static Object m3668t(AbstractC0715f0 abstractC0715f0, Fragment fragment, Fragment fragment2, boolean z10) {
        Object m3160f7;
        if (fragment != null && fragment2 != null) {
            if (z10) {
                m3160f7 = fragment2.m3163g7();
            } else {
                m3160f7 = fragment.m3160f7();
            }
            return abstractC0715f0.mo3309B(abstractC0715f0.mo3314g(m3160f7));
        }
        return null;
    }

    /* renamed from: u */
    private static Object m3669u(AbstractC0715f0 abstractC0715f0, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean z11;
        if (obj != null && obj2 != null && fragment != null) {
            if (z10) {
                z11 = fragment.m3081E6();
            } else {
                z11 = fragment.m3078D6();
            }
        } else {
            z11 = true;
        }
        if (z11) {
            return abstractC0715f0.mo3316n(obj2, obj, obj3);
        }
        return abstractC0715f0.mo3315m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m3670v(AbstractC0715f0 abstractC0715f0, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f2654l && fragment.f2669z && fragment.f2631N) {
            fragment.m3138X8(true);
            abstractC0715f0.mo3319r(obj, fragment.m3182n7(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(fragment.f2624G, new b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC0715f0 m3671w() {
        try {
            return (AbstractC0715f0) C4467e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m3672x(C5303a c5303a, C5303a c5303a2) {
        for (int size = c5303a.size() - 1; size >= 0; size--) {
            if (!c5303a2.containsKey((String) c5303a.m21435m(size))) {
                c5303a.mo17198k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m3673y(AbstractC0715f0 abstractC0715f0, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(viewGroup, new d(obj, abstractC0715f0, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m3674z(AbstractC0715f0 abstractC0715f0, Object obj, Object obj2, C5303a c5303a, boolean z10, C0704a c0704a) {
        String str;
        ArrayList arrayList = c0704a.f3015p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                str = (String) c0704a.f3016q.get(0);
            } else {
                str = (String) c0704a.f3015p.get(0);
            }
            View view = (View) c5303a.get(str);
            abstractC0715f0.mo3322v(obj, view);
            if (obj2 != null) {
                abstractC0715f0.mo3322v(obj2, view);
            }
        }
    }
}
