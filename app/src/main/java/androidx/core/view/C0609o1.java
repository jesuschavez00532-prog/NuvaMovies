package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p276p.C6134g;
import p373w.AbstractC7338c;
import p373w.AbstractC7342g;

/* renamed from: androidx.core.view.o1 */
/* loaded from: classes.dex */
public class C0609o1 {

    /* renamed from: b */
    public static final C0609o1 f2360b;

    /* renamed from: a */
    private final l f2361a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.o1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static Field f2362a;

        /* renamed from: b */
        private static Field f2363b;

        /* renamed from: c */
        private static Field f2364c;

        /* renamed from: d */
        private static boolean f2365d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2362a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2363b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2364c = declaredField3;
                declaredField3.setAccessible(true);
                f2365d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        /* renamed from: a */
        public static C0609o1 m2530a(View view) {
            if (f2365d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2362a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2363b.get(obj);
                        Rect rect2 = (Rect) f2364c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0609o1 m2531a = new b().m2532b(C6134g.m24435c(rect)).m2533c(C6134g.m24435c(rect2)).m2531a();
                            m2531a.m2527r(m2531a);
                            m2531a.m2514d(view.getRootView());
                            return m2531a;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.o1$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(C0609o1 c0609o1) {
            super(c0609o1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.o1$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final C0609o1 f2374a;

        /* renamed from: b */
        C6134g[] f2375b;

        f() {
            this(new C0609o1((C0609o1) null));
        }

        /* renamed from: a */
        protected final void m2541a() {
            C6134g[] c6134gArr = this.f2375b;
            if (c6134gArr != null) {
                C6134g c6134g = c6134gArr[m.m2566a(1)];
                C6134g c6134g2 = this.f2375b[m.m2566a(2)];
                if (c6134g2 == null) {
                    c6134g2 = this.f2374a.m2516f(2);
                }
                if (c6134g == null) {
                    c6134g = this.f2374a.m2516f(1);
                }
                mo2537f(C6134g.m24433a(c6134g, c6134g2));
                C6134g c6134g3 = this.f2375b[m.m2566a(16)];
                if (c6134g3 != null) {
                    mo2539e(c6134g3);
                }
                C6134g c6134g4 = this.f2375b[m.m2566a(32)];
                if (c6134g4 != null) {
                    mo2538c(c6134g4);
                }
                C6134g c6134g5 = this.f2375b[m.m2566a(64)];
                if (c6134g5 != null) {
                    mo2540g(c6134g5);
                }
            }
        }

        /* renamed from: b */
        C0609o1 mo2535b() {
            m2541a();
            return this.f2374a;
        }

        /* renamed from: c */
        void mo2538c(C6134g c6134g) {
        }

        /* renamed from: d */
        void mo2536d(C6134g c6134g) {
        }

        /* renamed from: e */
        void mo2539e(C6134g c6134g) {
        }

        /* renamed from: f */
        void mo2537f(C6134g c6134g) {
        }

        /* renamed from: g */
        void mo2540g(C6134g c6134g) {
        }

        f(C0609o1 c0609o1) {
            this.f2374a = c0609o1;
        }
    }

    /* renamed from: androidx.core.view.o1$i */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(C0609o1 c0609o1, WindowInsets windowInsets) {
            super(c0609o1, windowInsets);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: a */
        C0609o1 mo2561a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f2381c.consumeDisplayCutout();
            return C0609o1.m2509u(consumeDisplayCutout);
        }

        @Override // androidx.core.view.C0609o1.g, androidx.core.view.C0609o1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f2381c, iVar.f2381c) && Objects.equals(this.f2385g, iVar.f2385g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: f */
        C0615q mo2562f() {
            DisplayCutout displayCutout;
            displayCutout = this.f2381c.getDisplayCutout();
            return C0615q.m2572e(displayCutout);
        }

        @Override // androidx.core.view.C0609o1.l
        public int hashCode() {
            int hashCode;
            hashCode = this.f2381c.hashCode();
            return hashCode;
        }

        i(C0609o1 c0609o1, i iVar) {
            super(c0609o1, iVar);
        }
    }

    /* renamed from: androidx.core.view.o1$k */
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q */
        static final C0609o1 f2390q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f2390q = C0609o1.m2509u(windowInsets);
        }

        k(C0609o1 c0609o1, WindowInsets windowInsets) {
            super(c0609o1, windowInsets);
        }

        @Override // androidx.core.view.C0609o1.g, androidx.core.view.C0609o1.l
        /* renamed from: d */
        final void mo2546d(View view) {
        }

        @Override // androidx.core.view.C0609o1.g, androidx.core.view.C0609o1.l
        /* renamed from: g */
        public C6134g mo2548g(int i10) {
            Insets insets;
            insets = this.f2381c.getInsets(n.m2567a(i10));
            return C6134g.m24436d(insets);
        }

        k(C0609o1 c0609o1, k kVar) {
            super(c0609o1, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.o1$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        static final C0609o1 f2391b = new b().m2531a().m2511a().m2512b().m2513c();

        /* renamed from: a */
        final C0609o1 f2392a;

        l(C0609o1 c0609o1) {
            this.f2392a = c0609o1;
        }

        /* renamed from: a */
        C0609o1 mo2561a() {
            return this.f2392a;
        }

        /* renamed from: b */
        C0609o1 mo2556b() {
            return this.f2392a;
        }

        /* renamed from: c */
        C0609o1 mo2557c() {
            return this.f2392a;
        }

        /* renamed from: d */
        void mo2546d(View view) {
        }

        /* renamed from: e */
        void mo2547e(C0609o1 c0609o1) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (mo2551o() == lVar.mo2551o() && mo2559n() == lVar.mo2559n() && AbstractC7338c.m28317a(mo2549k(), lVar.mo2549k()) && AbstractC7338c.m28317a(mo2558i(), lVar.mo2558i()) && AbstractC7338c.m28317a(mo2562f(), lVar.mo2562f())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        C0615q mo2562f() {
            return null;
        }

        /* renamed from: g */
        C6134g mo2548g(int i10) {
            return C6134g.f24117e;
        }

        /* renamed from: h */
        C6134g mo2563h() {
            return mo2549k();
        }

        public int hashCode() {
            return AbstractC7338c.m28318b(Boolean.valueOf(mo2551o()), Boolean.valueOf(mo2559n()), mo2549k(), mo2558i(), mo2562f());
        }

        /* renamed from: i */
        C6134g mo2558i() {
            return C6134g.f24117e;
        }

        /* renamed from: j */
        C6134g mo2564j() {
            return mo2549k();
        }

        /* renamed from: k */
        C6134g mo2549k() {
            return C6134g.f24117e;
        }

        /* renamed from: l */
        C6134g mo2565l() {
            return mo2549k();
        }

        /* renamed from: m */
        C0609o1 mo2550m(int i10, int i11, int i12, int i13) {
            return f2391b;
        }

        /* renamed from: n */
        boolean mo2559n() {
            return false;
        }

        /* renamed from: o */
        boolean mo2551o() {
            return false;
        }

        /* renamed from: p */
        public void mo2552p(C6134g[] c6134gArr) {
        }

        /* renamed from: q */
        void mo2553q(C6134g c6134g) {
        }

        /* renamed from: r */
        void mo2554r(C0609o1 c0609o1) {
        }

        /* renamed from: s */
        public void mo2560s(C6134g c6134g) {
        }
    }

    /* renamed from: androidx.core.view.o1$m */
    /* loaded from: classes.dex */
    public static final class m {
        /* renamed from: a */
        static int m2566a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 != 8) {
                    if (i10 == 16) {
                        return 4;
                    }
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                if (i10 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.view.o1$n */
    /* loaded from: classes.dex */
    private static final class n {
        /* renamed from: a */
        static int m2567a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2360b = k.f2390q;
        } else {
            f2360b = l.f2391b;
        }
    }

    private C0609o1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2361a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f2361a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 28) {
            this.f2361a = new i(this, windowInsets);
            return;
        }
        if (i10 >= 21) {
            this.f2361a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f2361a = new g(this, windowInsets);
        } else {
            this.f2361a = new l(this);
        }
    }

    /* renamed from: m */
    static C6134g m2508m(C6134g c6134g, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c6134g.f24118a - i10);
        int max2 = Math.max(0, c6134g.f24119b - i11);
        int max3 = Math.max(0, c6134g.f24120c - i12);
        int max4 = Math.max(0, c6134g.f24121d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return c6134g;
        }
        return C6134g.m24434b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C0609o1 m2509u(WindowInsets windowInsets) {
        return m2510v(windowInsets, null);
    }

    /* renamed from: v */
    public static C0609o1 m2510v(WindowInsets windowInsets, View view) {
        C0609o1 c0609o1 = new C0609o1(AbstractC0605n1.m2504a(AbstractC7342g.m28327g(windowInsets)));
        if (view != null && AbstractC0616q0.m2599Q(view)) {
            c0609o1.m2527r(AbstractC0616q0.m2590H(view));
            c0609o1.m2514d(view.getRootView());
        }
        return c0609o1;
    }

    /* renamed from: a */
    public C0609o1 m2511a() {
        return this.f2361a.mo2561a();
    }

    /* renamed from: b */
    public C0609o1 m2512b() {
        return this.f2361a.mo2556b();
    }

    /* renamed from: c */
    public C0609o1 m2513c() {
        return this.f2361a.mo2557c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2514d(View view) {
        this.f2361a.mo2546d(view);
    }

    /* renamed from: e */
    public C0615q m2515e() {
        return this.f2361a.mo2562f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0609o1)) {
            return false;
        }
        return AbstractC7338c.m28317a(this.f2361a, ((C0609o1) obj).f2361a);
    }

    /* renamed from: f */
    public C6134g m2516f(int i10) {
        return this.f2361a.mo2548g(i10);
    }

    /* renamed from: g */
    public C6134g m2517g() {
        return this.f2361a.mo2558i();
    }

    /* renamed from: h */
    public int m2518h() {
        return this.f2361a.mo2549k().f24121d;
    }

    public int hashCode() {
        l lVar = this.f2361a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    /* renamed from: i */
    public int m2519i() {
        return this.f2361a.mo2549k().f24118a;
    }

    /* renamed from: j */
    public int m2520j() {
        return this.f2361a.mo2549k().f24120c;
    }

    /* renamed from: k */
    public int m2521k() {
        return this.f2361a.mo2549k().f24119b;
    }

    /* renamed from: l */
    public C0609o1 m2522l(int i10, int i11, int i12, int i13) {
        return this.f2361a.mo2550m(i10, i11, i12, i13);
    }

    /* renamed from: n */
    public boolean m2523n() {
        return this.f2361a.mo2559n();
    }

    /* renamed from: o */
    public C0609o1 m2524o(int i10, int i11, int i12, int i13) {
        return new b(this).m2533c(C6134g.m24434b(i10, i11, i12, i13)).m2531a();
    }

    /* renamed from: p */
    void m2525p(C6134g[] c6134gArr) {
        this.f2361a.mo2552p(c6134gArr);
    }

    /* renamed from: q */
    void m2526q(C6134g c6134g) {
        this.f2361a.mo2553q(c6134g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2527r(C0609o1 c0609o1) {
        this.f2361a.mo2554r(c0609o1);
    }

    /* renamed from: s */
    void m2528s(C6134g c6134g) {
        this.f2361a.mo2560s(c6134g);
    }

    /* renamed from: t */
    public WindowInsets m2529t() {
        l lVar = this.f2361a;
        if (lVar instanceof g) {
            return ((g) lVar).f2381c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.o1$c */
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e */
        private static Field f2367e;

        /* renamed from: f */
        private static boolean f2368f;

        /* renamed from: g */
        private static Constructor f2369g;

        /* renamed from: h */
        private static boolean f2370h;

        /* renamed from: c */
        private WindowInsets f2371c;

        /* renamed from: d */
        private C6134g f2372d;

        c() {
            this.f2371c = m2534h();
        }

        /* renamed from: h */
        private static WindowInsets m2534h() {
            if (!f2368f) {
                try {
                    f2367e = AbstractC0613p1.m2570a().getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f2368f = true;
            }
            Field field = f2367e;
            if (field != null) {
                try {
                    WindowInsets m2504a = AbstractC0605n1.m2504a(field.get(null));
                    if (m2504a != null) {
                        return new WindowInsets(m2504a);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f2370h) {
                try {
                    f2369g = AbstractC0613p1.m2570a().getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f2370h = true;
            }
            Constructor constructor = f2369g;
            if (constructor != null) {
                try {
                    return AbstractC0605n1.m2504a(constructor.newInstance(new Rect()));
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: b */
        C0609o1 mo2535b() {
            m2541a();
            C0609o1 m2509u = C0609o1.m2509u(this.f2371c);
            m2509u.m2525p(this.f2375b);
            m2509u.m2528s(this.f2372d);
            return m2509u;
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: d */
        void mo2536d(C6134g c6134g) {
            this.f2372d = c6134g;
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: f */
        void mo2537f(C6134g c6134g) {
            WindowInsets replaceSystemWindowInsets;
            WindowInsets windowInsets = this.f2371c;
            if (windowInsets != null) {
                replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(c6134g.f24118a, c6134g.f24119b, c6134g.f24120c, c6134g.f24121d);
                this.f2371c = replaceSystemWindowInsets;
            }
        }

        c(C0609o1 c0609o1) {
            super(c0609o1);
            this.f2371c = c0609o1.m2529t();
        }
    }

    /* renamed from: androidx.core.view.o1$d */
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f2373c;

        d() {
            this.f2373c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: b */
        C0609o1 mo2535b() {
            WindowInsets build;
            m2541a();
            build = this.f2373c.build();
            C0609o1 m2509u = C0609o1.m2509u(build);
            m2509u.m2525p(this.f2375b);
            return m2509u;
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: c */
        void mo2538c(C6134g c6134g) {
            this.f2373c.setMandatorySystemGestureInsets(c6134g.m24437e());
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: d */
        void mo2536d(C6134g c6134g) {
            this.f2373c.setStableInsets(c6134g.m24437e());
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: e */
        void mo2539e(C6134g c6134g) {
            this.f2373c.setSystemGestureInsets(c6134g.m24437e());
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: f */
        void mo2537f(C6134g c6134g) {
            this.f2373c.setSystemWindowInsets(c6134g.m24437e());
        }

        @Override // androidx.core.view.C0609o1.f
        /* renamed from: g */
        void mo2540g(C6134g c6134g) {
            this.f2373c.setTappableElementInsets(c6134g.m24437e());
        }

        d(C0609o1 c0609o1) {
            super(c0609o1);
            WindowInsets.Builder builder;
            WindowInsets m2529t = c0609o1.m2529t();
            if (m2529t != null) {
                builder = new WindowInsets.Builder(m2529t);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2373c = builder;
        }
    }

    /* renamed from: androidx.core.view.o1$h */
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m */
        private C6134g f2386m;

        h(C0609o1 c0609o1, WindowInsets windowInsets) {
            super(c0609o1, windowInsets);
            this.f2386m = null;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: b */
        C0609o1 mo2556b() {
            WindowInsets consumeStableInsets;
            consumeStableInsets = this.f2381c.consumeStableInsets();
            return C0609o1.m2509u(consumeStableInsets);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: c */
        C0609o1 mo2557c() {
            WindowInsets consumeSystemWindowInsets;
            consumeSystemWindowInsets = this.f2381c.consumeSystemWindowInsets();
            return C0609o1.m2509u(consumeSystemWindowInsets);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: i */
        final C6134g mo2558i() {
            int stableInsetLeft;
            int stableInsetTop;
            int stableInsetRight;
            int stableInsetBottom;
            if (this.f2386m == null) {
                stableInsetLeft = this.f2381c.getStableInsetLeft();
                stableInsetTop = this.f2381c.getStableInsetTop();
                stableInsetRight = this.f2381c.getStableInsetRight();
                stableInsetBottom = this.f2381c.getStableInsetBottom();
                this.f2386m = C6134g.m24434b(stableInsetLeft, stableInsetTop, stableInsetRight, stableInsetBottom);
            }
            return this.f2386m;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: n */
        boolean mo2559n() {
            boolean isConsumed;
            isConsumed = this.f2381c.isConsumed();
            return isConsumed;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: s */
        public void mo2560s(C6134g c6134g) {
            this.f2386m = c6134g;
        }

        h(C0609o1 c0609o1, h hVar) {
            super(c0609o1, hVar);
            this.f2386m = null;
            this.f2386m = hVar.f2386m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.o1$g */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        private static boolean f2376h;

        /* renamed from: i */
        private static Method f2377i;

        /* renamed from: j */
        private static Class f2378j;

        /* renamed from: k */
        private static Field f2379k;

        /* renamed from: l */
        private static Field f2380l;

        /* renamed from: c */
        final WindowInsets f2381c;

        /* renamed from: d */
        private C6134g[] f2382d;

        /* renamed from: e */
        private C6134g f2383e;

        /* renamed from: f */
        private C0609o1 f2384f;

        /* renamed from: g */
        C6134g f2385g;

        g(C0609o1 c0609o1, WindowInsets windowInsets) {
            super(c0609o1);
            this.f2383e = null;
            this.f2381c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C6134g m2542t(int i10, boolean z10) {
            C6134g c6134g = C6134g.f24117e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c6134g = C6134g.m24433a(c6134g, m2555u(i11, z10));
                }
            }
            return c6134g;
        }

        /* renamed from: v */
        private C6134g m2543v() {
            C0609o1 c0609o1 = this.f2384f;
            if (c0609o1 != null) {
                return c0609o1.m2517g();
            }
            return C6134g.f24117e;
        }

        /* renamed from: w */
        private C6134g m2544w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2376h) {
                    m2545x();
                }
                Method method = f2377i;
                if (method != null && f2378j != null && f2379k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2379k.get(f2380l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return C6134g.m24435c(rect);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m2545x() {
            try {
                f2377i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2378j = cls;
                f2379k = cls.getDeclaredField("mVisibleInsets");
                f2380l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2379k.setAccessible(true);
                f2380l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f2376h = true;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: d */
        void mo2546d(View view) {
            C6134g m2544w = m2544w(view);
            if (m2544w == null) {
                m2544w = C6134g.f24117e;
            }
            mo2553q(m2544w);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: e */
        void mo2547e(C0609o1 c0609o1) {
            c0609o1.m2527r(this.f2384f);
            c0609o1.m2526q(this.f2385g);
        }

        @Override // androidx.core.view.C0609o1.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2385g, ((g) obj).f2385g);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: g */
        public C6134g mo2548g(int i10) {
            return m2542t(i10, false);
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: k */
        final C6134g mo2549k() {
            int systemWindowInsetLeft;
            int systemWindowInsetTop;
            int systemWindowInsetRight;
            int systemWindowInsetBottom;
            if (this.f2383e == null) {
                systemWindowInsetLeft = this.f2381c.getSystemWindowInsetLeft();
                systemWindowInsetTop = this.f2381c.getSystemWindowInsetTop();
                systemWindowInsetRight = this.f2381c.getSystemWindowInsetRight();
                systemWindowInsetBottom = this.f2381c.getSystemWindowInsetBottom();
                this.f2383e = C6134g.m24434b(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            }
            return this.f2383e;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: m */
        C0609o1 mo2550m(int i10, int i11, int i12, int i13) {
            b bVar = new b(C0609o1.m2509u(this.f2381c));
            bVar.m2533c(C0609o1.m2508m(mo2549k(), i10, i11, i12, i13));
            bVar.m2532b(C0609o1.m2508m(mo2558i(), i10, i11, i12, i13));
            return bVar.m2531a();
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: o */
        boolean mo2551o() {
            boolean isRound;
            isRound = this.f2381c.isRound();
            return isRound;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: p */
        public void mo2552p(C6134g[] c6134gArr) {
            this.f2382d = c6134gArr;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: q */
        void mo2553q(C6134g c6134g) {
            this.f2385g = c6134g;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: r */
        void mo2554r(C0609o1 c0609o1) {
            this.f2384f = c0609o1;
        }

        /* renamed from: u */
        protected C6134g m2555u(int i10, boolean z10) {
            int i11;
            C0615q mo2562f;
            if (i10 != 1) {
                C6134g c6134g = null;
                if (i10 != 2) {
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return C6134g.f24117e;
                                    }
                                    C0609o1 c0609o1 = this.f2384f;
                                    if (c0609o1 != null) {
                                        mo2562f = c0609o1.m2515e();
                                    } else {
                                        mo2562f = mo2562f();
                                    }
                                    if (mo2562f != null) {
                                        return C6134g.m24434b(mo2562f.m2574b(), mo2562f.m2576d(), mo2562f.m2575c(), mo2562f.m2573a());
                                    }
                                    return C6134g.f24117e;
                                }
                                return mo2565l();
                            }
                            return mo2563h();
                        }
                        return mo2564j();
                    }
                    C6134g[] c6134gArr = this.f2382d;
                    if (c6134gArr != null) {
                        c6134g = c6134gArr[m.m2566a(8)];
                    }
                    if (c6134g != null) {
                        return c6134g;
                    }
                    C6134g mo2549k = mo2549k();
                    C6134g m2543v = m2543v();
                    int i12 = mo2549k.f24121d;
                    if (i12 > m2543v.f24121d) {
                        return C6134g.m24434b(0, 0, 0, i12);
                    }
                    C6134g c6134g2 = this.f2385g;
                    if (c6134g2 != null && !c6134g2.equals(C6134g.f24117e) && (i11 = this.f2385g.f24121d) > m2543v.f24121d) {
                        return C6134g.m24434b(0, 0, 0, i11);
                    }
                    return C6134g.f24117e;
                }
                if (z10) {
                    C6134g m2543v2 = m2543v();
                    C6134g mo2558i = mo2558i();
                    return C6134g.m24434b(Math.max(m2543v2.f24118a, mo2558i.f24118a), 0, Math.max(m2543v2.f24120c, mo2558i.f24120c), Math.max(m2543v2.f24121d, mo2558i.f24121d));
                }
                C6134g mo2549k2 = mo2549k();
                C0609o1 c0609o12 = this.f2384f;
                if (c0609o12 != null) {
                    c6134g = c0609o12.m2517g();
                }
                int i13 = mo2549k2.f24121d;
                if (c6134g != null) {
                    i13 = Math.min(i13, c6134g.f24121d);
                }
                return C6134g.m24434b(mo2549k2.f24118a, 0, mo2549k2.f24120c, i13);
            }
            if (z10) {
                return C6134g.m24434b(0, Math.max(m2543v().f24119b, mo2549k().f24119b), 0, 0);
            }
            return C6134g.m24434b(0, mo2549k().f24119b, 0, 0);
        }

        g(C0609o1 c0609o1, g gVar) {
            this(c0609o1, new WindowInsets(gVar.f2381c));
        }
    }

    /* renamed from: androidx.core.view.o1$j */
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n */
        private C6134g f2387n;

        /* renamed from: o */
        private C6134g f2388o;

        /* renamed from: p */
        private C6134g f2389p;

        j(C0609o1 c0609o1, WindowInsets windowInsets) {
            super(c0609o1, windowInsets);
            this.f2387n = null;
            this.f2388o = null;
            this.f2389p = null;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: h */
        C6134g mo2563h() {
            Insets mandatorySystemGestureInsets;
            if (this.f2388o == null) {
                mandatorySystemGestureInsets = this.f2381c.getMandatorySystemGestureInsets();
                this.f2388o = C6134g.m24436d(mandatorySystemGestureInsets);
            }
            return this.f2388o;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: j */
        C6134g mo2564j() {
            Insets systemGestureInsets;
            if (this.f2387n == null) {
                systemGestureInsets = this.f2381c.getSystemGestureInsets();
                this.f2387n = C6134g.m24436d(systemGestureInsets);
            }
            return this.f2387n;
        }

        @Override // androidx.core.view.C0609o1.l
        /* renamed from: l */
        C6134g mo2565l() {
            Insets tappableElementInsets;
            if (this.f2389p == null) {
                tappableElementInsets = this.f2381c.getTappableElementInsets();
                this.f2389p = C6134g.m24436d(tappableElementInsets);
            }
            return this.f2389p;
        }

        @Override // androidx.core.view.C0609o1.g, androidx.core.view.C0609o1.l
        /* renamed from: m */
        C0609o1 mo2550m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f2381c.inset(i10, i11, i12, i13);
            return C0609o1.m2509u(inset);
        }

        @Override // androidx.core.view.C0609o1.h, androidx.core.view.C0609o1.l
        /* renamed from: s */
        public void mo2560s(C6134g c6134g) {
        }

        j(C0609o1 c0609o1, j jVar) {
            super(c0609o1, jVar);
            this.f2387n = null;
            this.f2388o = null;
            this.f2389p = null;
        }
    }

    /* renamed from: androidx.core.view.o1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final f f2366a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2366a = new e();
                return;
            }
            if (i10 >= 29) {
                this.f2366a = new d();
            } else if (i10 >= 20) {
                this.f2366a = new c();
            } else {
                this.f2366a = new f();
            }
        }

        /* renamed from: a */
        public C0609o1 m2531a() {
            return this.f2366a.mo2535b();
        }

        /* renamed from: b */
        public b m2532b(C6134g c6134g) {
            this.f2366a.mo2536d(c6134g);
            return this;
        }

        /* renamed from: c */
        public b m2533c(C6134g c6134g) {
            this.f2366a.mo2537f(c6134g);
            return this;
        }

        public b(C0609o1 c0609o1) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2366a = new e(c0609o1);
                return;
            }
            if (i10 >= 29) {
                this.f2366a = new d(c0609o1);
            } else if (i10 >= 20) {
                this.f2366a = new c(c0609o1);
            } else {
                this.f2366a = new f(c0609o1);
            }
        }
    }

    public C0609o1(C0609o1 c0609o1) {
        if (c0609o1 != null) {
            l lVar = c0609o1.f2361a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f2361a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f2361a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f2361a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f2361a = new h(this, (h) lVar);
            } else if (i10 >= 20 && (lVar instanceof g)) {
                this.f2361a = new g(this, (g) lVar);
            } else {
                this.f2361a = new l(this);
            }
            lVar.mo2547e(this);
            return;
        }
        this.f2361a = new l(this);
    }
}
