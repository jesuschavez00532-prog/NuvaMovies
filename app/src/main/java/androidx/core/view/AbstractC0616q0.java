package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import androidx.core.view.C0551a;
import androidx.core.view.C0609o1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p214l.C5311i;
import p389x.C7458h0;
import p389x.InterfaceC7468m0;

/* renamed from: androidx.core.view.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0616q0 {

    /* renamed from: b */
    private static WeakHashMap f2395b;

    /* renamed from: d */
    private static Field f2397d;

    /* renamed from: f */
    private static ThreadLocal f2399f;

    /* renamed from: a */
    private static final AtomicInteger f2394a = new AtomicInteger(1);

    /* renamed from: c */
    private static WeakHashMap f2396c = null;

    /* renamed from: e */
    private static boolean f2398e = false;

    /* renamed from: g */
    private static final int[] f2400g = {R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};

    /* renamed from: h */
    private static final InterfaceC0596l0 f2401h = new InterfaceC0596l0() { // from class: androidx.core.view.p0
        @Override // androidx.core.view.InterfaceC0596l0
        /* renamed from: a */
        public final C0559c mo1826a(C0559c c0559c) {
            C0559c m2604V;
            m2604V = AbstractC0616q0.m2604V(c0559c);
            return m2604V;
        }
    };

    /* renamed from: i */
    private static final e f2402i = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$a */
    /* loaded from: classes.dex */
    public class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2661d(View view) {
            return Boolean.valueOf(p.m2775d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2662e(View view, Boolean bool) {
            p.m2780i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2663h(Boolean bool, Boolean bool2) {
            return !m2680a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$b */
    /* loaded from: classes.dex */
    public class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2661d(View view) {
            return p.m2773b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2662e(View view, CharSequence charSequence) {
            p.m2779h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2663h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$c */
    /* loaded from: classes.dex */
    public class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2661d(View view) {
            return r.m2785a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2662e(View view, CharSequence charSequence) {
            r.m2786b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2663h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$d */
    /* loaded from: classes.dex */
    public class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2661d(View view) {
            return Boolean.valueOf(p.m2774c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2662e(View view, Boolean bool) {
            p.m2778g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0616q0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2663h(Boolean bool, Boolean bool2) {
            return !m2680a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.q0$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap f2403a = new WeakHashMap();

        e() {
        }

        /* renamed from: a */
        private void m2676a(View view, boolean z10) {
            boolean z11;
            int i10;
            if (view.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (z11) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                AbstractC0616q0.m2605W(view, i10);
                this.f2403a.put(view, Boolean.valueOf(z11));
            }
        }

        /* renamed from: b */
        private void m2677b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f2403a.entrySet()) {
                    m2676a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m2677b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$f */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        private final int f2404a;

        /* renamed from: b */
        private final Class f2405b;

        /* renamed from: c */
        private final int f2406c;

        /* renamed from: d */
        private final int f2407d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        /* renamed from: b */
        private boolean m2678b() {
            return true;
        }

        /* renamed from: c */
        private boolean m2679c() {
            if (Build.VERSION.SDK_INT >= this.f2406c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        boolean m2680a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        abstract Object mo2661d(View view);

        /* renamed from: e */
        abstract void mo2662e(View view, Object obj);

        /* renamed from: f */
        Object m2681f(View view) {
            if (m2679c()) {
                return mo2661d(view);
            }
            if (m2678b()) {
                Object tag = view.getTag(this.f2404a);
                if (this.f2405b.isInstance(tag)) {
                    return tag;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        void m2682g(View view, Object obj) {
            if (m2679c()) {
                mo2662e(view, obj);
            } else if (m2678b() && mo2663h(m2681f(view), obj)) {
                AbstractC0616q0.m2629k(view);
                view.setTag(this.f2404a, obj);
                AbstractC0616q0.m2605W(view, this.f2407d);
            }
        }

        /* renamed from: h */
        abstract boolean mo2663h(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f2404a = i10;
            this.f2405b = cls;
            this.f2407d = i11;
            this.f2406c = i12;
        }
    }

    /* renamed from: androidx.core.view.q0$g */
    /* loaded from: classes.dex */
    static class g {
        /* renamed from: a */
        static boolean m2683a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static AccessibilityNodeProvider m2684a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m2685b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m2686c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m2687d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m2688e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m2689f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m2690g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m2691h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m2692i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m2693j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        /* renamed from: k */
        static void m2694k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m2695l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        /* renamed from: m */
        static void m2696m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m2697n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        /* renamed from: o */
        static void m2698o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m2699p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m2700q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m2701r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        /* renamed from: s */
        static void m2702s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* renamed from: androidx.core.view.q0$i */
    /* loaded from: classes.dex */
    static class i {
        /* renamed from: a */
        static int m2703a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m2704b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m2705c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m2706d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m2707e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m2708f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m2709g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m2710h(View view, int i10) {
            view.setLabelFor(i10);
        }

        /* renamed from: i */
        static void m2711i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m2712j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        /* renamed from: k */
        static void m2713k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* renamed from: androidx.core.view.q0$j */
    /* loaded from: classes.dex */
    static class j {
        /* renamed from: a */
        static Rect m2714a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m2715b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m2716c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static int m2717a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m2718b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m2719c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m2720d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m2721e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        /* renamed from: f */
        static void m2722f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        /* renamed from: g */
        static void m2723g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static WindowInsets m2724a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m2725b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m2726c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.q0$m */
    /* loaded from: classes.dex */
    public static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.view.q0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0609o1 f2408a = null;

            /* renamed from: b */
            final /* synthetic */ View f2409b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC0588j0 f2410c;

            a(View view, InterfaceC0588j0 interfaceC0588j0) {
                this.f2409b = view;
                this.f2410c = interfaceC0588j0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0609o1 m2510v = C0609o1.m2510v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.m2727a(windowInsets, this.f2409b);
                    if (m2510v.equals(this.f2408a)) {
                        return this.f2410c.onApplyWindowInsets(view, m2510v).m2529t();
                    }
                }
                this.f2408a = m2510v;
                C0609o1 onApplyWindowInsets = this.f2410c.onApplyWindowInsets(view, m2510v);
                if (i10 >= 30) {
                    return onApplyWindowInsets.m2529t();
                }
                AbstractC0616q0.m2630k0(view);
                return onApplyWindowInsets.m2529t();
            }
        }

        /* renamed from: a */
        static void m2727a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0609o1 m2728b(View view, C0609o1 c0609o1, Rect rect) {
            WindowInsets m2529t = c0609o1.m2529t();
            if (m2529t != null) {
                return C0609o1.m2510v(view.computeSystemWindowInsets(m2529t, rect), view);
            }
            rect.setEmpty();
            return c0609o1;
        }

        /* renamed from: c */
        static boolean m2729c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        /* renamed from: d */
        static boolean m2730d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        /* renamed from: e */
        static boolean m2731e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m2732f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        /* renamed from: g */
        static ColorStateList m2733g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m2734h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m2735i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0609o1 m2736j(View view) {
            return C0609o1.a.m2530a(view);
        }

        /* renamed from: k */
        static String m2737k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m2738l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m2739m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m2740n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m2741o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m2742p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m2743q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m2744r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m2745s(View view, float f10) {
            view.setElevation(f10);
        }

        /* renamed from: t */
        static void m2746t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        /* renamed from: u */
        static void m2747u(View view, InterfaceC0588j0 interfaceC0588j0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R$id.tag_on_apply_window_listener, interfaceC0588j0);
            }
            if (interfaceC0588j0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0588j0));
            }
        }

        /* renamed from: v */
        static void m2748v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m2749w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        /* renamed from: x */
        static void m2750x(View view, float f10) {
            view.setZ(f10);
        }

        /* renamed from: y */
        static boolean m2751y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        /* renamed from: z */
        static void m2752z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.q0$n */
    /* loaded from: classes.dex */
    private static class n {
        /* renamed from: a */
        public static C0609o1 m2753a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0609o1 m2509u = C0609o1.m2509u(rootWindowInsets);
            m2509u.m2527r(m2509u);
            m2509u.m2514d(view.getRootView());
            return m2509u;
        }

        /* renamed from: b */
        static int m2754b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m2755c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        /* renamed from: d */
        static void m2756d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: androidx.core.view.q0$o */
    /* loaded from: classes.dex */
    static class o {
        /* renamed from: a */
        static void m2757a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        /* renamed from: b */
        static int m2758b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m2759c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m2760d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m2761e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m2762f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m2763g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m2764h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        /* renamed from: i */
        static boolean m2765i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m2766j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m2767k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        /* renamed from: l */
        static void m2768l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        /* renamed from: m */
        static void m2769m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        /* renamed from: n */
        static void m2770n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        /* renamed from: o */
        static void m2771o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.q0$p */
    /* loaded from: classes.dex */
    public static class p {
        /* renamed from: a */
        static void m2772a(View view, final u uVar) {
            int i10 = R$id.tag_unhandled_key_listeners;
            C5311i c5311i = (C5311i) view.getTag(i10);
            if (c5311i == null) {
                c5311i = new C5311i();
                view.setTag(i10, c5311i);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(uVar) { // from class: androidx.core.view.r0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            c5311i.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        static CharSequence m2773b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m2774c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m2775d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m2776e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C5311i c5311i = (C5311i) view.getTag(R$id.tag_unhandled_key_listeners);
            if (c5311i != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c5311i.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m2777f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        /* renamed from: g */
        static void m2778g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* renamed from: h */
        static void m2779h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m2780i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.q0$q */
    /* loaded from: classes.dex */
    public static class q {
        /* renamed from: a */
        static View.AccessibilityDelegate m2781a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m2782b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m2783c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        /* renamed from: d */
        static void m2784d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.q0$r */
    /* loaded from: classes.dex */
    public static class r {
        /* renamed from: a */
        static CharSequence m2785a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m2786b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.q0$s */
    /* loaded from: classes.dex */
    private static final class s {
        /* renamed from: a */
        public static String[] m2787a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C0559c m2788b(View view, C0559c c0559c) {
            ContentInfo m2418f = c0559c.m2418f();
            ContentInfo performReceiveContent = view.performReceiveContent(m2418f);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == m2418f) {
                return c0559c;
            }
            return C0559c.m2414g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m2789c(View view, String[] strArr, InterfaceC0592k0 interfaceC0592k0) {
            if (interfaceC0592k0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(interfaceC0592k0));
            }
        }
    }

    /* renamed from: androidx.core.view.q0$t */
    /* loaded from: classes.dex */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC0592k0 f2411a;

        t(InterfaceC0592k0 interfaceC0592k0) {
            this.f2411a = interfaceC0592k0;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0559c m2414g = C0559c.m2414g(contentInfo);
            C0559c mo2495a = this.f2411a.mo2495a(view, m2414g);
            if (mo2495a == null) {
                return null;
            }
            if (mo2495a == m2414g) {
                return contentInfo;
            }
            return mo2495a.m2418f();
        }
    }

    /* renamed from: androidx.core.view.q0$u */
    /* loaded from: classes.dex */
    public interface u {
    }

    /* renamed from: androidx.core.view.q0$v */
    /* loaded from: classes.dex */
    static class v {

        /* renamed from: d */
        private static final ArrayList f2412d = new ArrayList();

        /* renamed from: a */
        private WeakHashMap f2413a = null;

        /* renamed from: b */
        private SparseArray f2414b = null;

        /* renamed from: c */
        private WeakReference f2415c = null;

        v() {
        }

        /* renamed from: a */
        static v m2790a(View view) {
            int i10 = R$id.tag_unhandled_key_event_manager;
            v vVar = (v) view.getTag(i10);
            if (vVar == null) {
                v vVar2 = new v();
                view.setTag(i10, vVar2);
                return vVar2;
            }
            return vVar;
        }

        /* renamed from: c */
        private View m2791c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2413a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m2791c = m2791c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m2791c != null) {
                            return m2791c;
                        }
                    }
                }
                if (m2793e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray m2792d() {
            if (this.f2414b == null) {
                this.f2414b = new SparseArray();
            }
            return this.f2414b;
        }

        /* renamed from: e */
        private boolean m2793e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                AbstractC0272b.m941a(arrayList.get(size));
                throw null;
            }
            return false;
        }

        /* renamed from: g */
        private void m2794g() {
            WeakHashMap weakHashMap = this.f2413a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2412d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2413a == null) {
                    this.f2413a = new WeakHashMap();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList arrayList2 = f2412d;
                    View view = (View) ((WeakReference) arrayList2.get(size)).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2413a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2413a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m2795b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2794g();
            }
            View m2791c = m2791c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m2791c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2792d().put(keyCode, new WeakReference(m2791c));
                }
            }
            if (m2791c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        boolean m2796f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f2415c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f2415c = new WeakReference(keyEvent);
            SparseArray m2792d = m2792d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m2792d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference) m2792d.valueAt(indexOfKey);
                m2792d.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = (WeakReference) m2792d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && AbstractC0616q0.m2599Q(view)) {
                m2793e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m2577A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.m2758b(view);
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m2578A0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.m2756d(view, i10, i11);
        }
    }

    /* renamed from: B */
    public static int m2579B(View view) {
        return i.m2706d(view);
    }

    /* renamed from: B0 */
    public static void m2580B0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2748v(view, str);
            return;
        }
        if (f2395b == null) {
            f2395b = new WeakHashMap();
        }
        f2395b.put(view, str);
    }

    /* renamed from: C */
    public static int m2581C(View view) {
        return h.m2687d(view);
    }

    /* renamed from: C0 */
    private static void m2582C0(View view) {
        if (m2659z(view) == 0) {
            m2654w0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m2659z((View) parent) == 4) {
                m2654w0(view, 2);
                return;
            }
        }
    }

    /* renamed from: D */
    public static int m2583D(View view) {
        return h.m2688e(view);
    }

    /* renamed from: D0 */
    private static f m2584D0() {
        return new c(R$id.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: E */
    public static String[] m2585E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s.m2787a(view);
        }
        return (String[]) view.getTag(R$id.tag_on_receive_content_mime_types);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E0 */
    public static void m2586E0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2752z(view);
        } else if (view instanceof InterfaceC0564d0) {
            ((InterfaceC0564d0) view).stopNestedScroll();
        }
    }

    /* renamed from: F */
    public static int m2587F(View view) {
        return i.m2707e(view);
    }

    /* renamed from: F0 */
    private static void m2588F0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: G */
    public static int m2589G(View view) {
        return i.m2708f(view);
    }

    /* renamed from: H */
    public static C0609o1 m2590H(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.m2753a(view);
        }
        if (i10 >= 21) {
            return m.m2736j(view);
        }
        return null;
    }

    /* renamed from: I */
    public static CharSequence m2591I(View view) {
        return (CharSequence) m2584D0().m2681f(view);
    }

    /* renamed from: J */
    public static String m2592J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2737k(view);
        }
        WeakHashMap weakHashMap = f2395b;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: K */
    public static int m2593K(View view) {
        return h.m2690g(view);
    }

    /* renamed from: L */
    public static float m2594L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2739m(view);
        }
        return 0.0f;
    }

    /* renamed from: M */
    public static boolean m2595M(View view) {
        return g.m2683a(view);
    }

    /* renamed from: N */
    public static boolean m2596N(View view) {
        return h.m2691h(view);
    }

    /* renamed from: O */
    public static boolean m2597O(View view) {
        return h.m2692i(view);
    }

    /* renamed from: P */
    public static boolean m2598P(View view) {
        Boolean bool = (Boolean) m2611b().m2681f(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m2599Q(View view) {
        return k.m2718b(view);
    }

    /* renamed from: R */
    public static boolean m2600R(View view) {
        return k.m2719c(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public static boolean m2601S(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2742p(view);
        }
        if (view instanceof InterfaceC0564d0) {
            return ((InterfaceC0564d0) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m2602T(View view) {
        return i.m2709g(view);
    }

    /* renamed from: U */
    public static boolean m2603U(View view) {
        Boolean bool = (Boolean) m2634m0().m2681f(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ C0559c m2604V(C0559c c0559c) {
        return c0559c;
    }

    /* renamed from: W */
    static void m2605W(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m2639p(view) != null && view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (m2637o(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k.m2723g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m2639p(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m2721e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        k.m2723g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(m2639p(view));
            m2582C0(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: X */
    public static void m2606X(View view, int i10) {
        boolean z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        if (i11 >= 21) {
            Rect m2653w = m2653w();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2653w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !m2653w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z10 = false;
            }
            m2617e(view, i10);
            if (z10 && m2653w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2653w);
                return;
            }
            return;
        }
        m2617e(view, i10);
    }

    /* renamed from: Y */
    public static void m2607Y(View view, int i10) {
        boolean z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        if (i11 >= 21) {
            Rect m2653w = m2653w();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2653w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !m2653w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z10 = false;
            }
            m2619f(view, i10);
            if (z10 && m2653w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2653w);
                return;
            }
            return;
        }
        m2619f(view, i10);
    }

    /* renamed from: Z */
    public static C0609o1 m2608Z(View view, C0609o1 c0609o1) {
        WindowInsets m2529t;
        boolean equals;
        if (Build.VERSION.SDK_INT >= 21 && (m2529t = c0609o1.m2529t()) != null) {
            WindowInsets m2725b = l.m2725b(view, m2529t);
            equals = m2725b.equals(m2529t);
            if (!equals) {
                return C0609o1.m2510v(m2725b, view);
            }
        }
        return c0609o1;
    }

    /* renamed from: a0 */
    public static void m2610a0(View view, C7458h0 c7458h0) {
        view.onInitializeAccessibilityNodeInfo(c7458h0.m28635u0());
    }

    /* renamed from: b */
    private static f m2611b() {
        return new d(R$id.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    private static f m2612b0() {
        return new b(R$id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: c */
    private static void m2613c(View view, C7458h0.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2629k(view);
            m2626i0(aVar.m28640b(), view);
            m2641q(view).add(aVar);
            m2605W(view, 0);
        }
    }

    /* renamed from: c0 */
    public static boolean m2614c0(View view, int i10, Bundle bundle) {
        return h.m2693j(view, i10, bundle);
    }

    /* renamed from: d */
    public static C0589j1 m2615d(View view) {
        if (f2396c == null) {
            f2396c = new WeakHashMap();
        }
        C0589j1 c0589j1 = (C0589j1) f2396c.get(view);
        if (c0589j1 == null) {
            C0589j1 c0589j12 = new C0589j1(view);
            f2396c.put(view, c0589j12);
            return c0589j12;
        }
        return c0589j1;
    }

    /* renamed from: d0 */
    public static C0559c m2616d0(View view, C0559c c0559c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0559c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.m2788b(view, c0559c);
        }
        InterfaceC0592k0 interfaceC0592k0 = (InterfaceC0592k0) view.getTag(R$id.tag_on_receive_content_listener);
        if (interfaceC0592k0 != null) {
            C0559c mo2495a = interfaceC0592k0.mo2495a(view, c0559c);
            if (mo2495a == null) {
                return null;
            }
            return m2655x(view).mo1826a(mo2495a);
        }
        return m2655x(view).mo1826a(c0559c);
    }

    /* renamed from: e */
    private static void m2617e(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            m2588F0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2588F0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m2618e0(View view) {
        h.m2694k(view);
    }

    /* renamed from: f */
    private static void m2619f(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            m2588F0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2588F0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m2620f0(View view, Runnable runnable) {
        h.m2696m(view, runnable);
    }

    /* renamed from: g */
    public static C0609o1 m2621g(View view, C0609o1 c0609o1, Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2728b(view, c0609o1, rect);
        }
        return c0609o1;
    }

    /* renamed from: g0 */
    public static void m2622g0(View view, Runnable runnable, long j10) {
        h.m2697n(view, runnable, j10);
    }

    /* renamed from: h */
    public static C0609o1 m2623h(View view, C0609o1 c0609o1) {
        WindowInsets m2529t;
        boolean equals;
        if (Build.VERSION.SDK_INT >= 21 && (m2529t = c0609o1.m2529t()) != null) {
            WindowInsets m2724a = l.m2724a(view, m2529t);
            equals = m2724a.equals(m2529t);
            if (!equals) {
                return C0609o1.m2510v(m2724a, view);
            }
        }
        return c0609o1;
    }

    /* renamed from: h0 */
    public static void m2624h0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2626i0(i10, view);
            m2605W(view, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m2625i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.m2790a(view).m2795b(view, keyEvent);
    }

    /* renamed from: i0 */
    private static void m2626i0(int i10, View view) {
        List m2641q = m2641q(view);
        for (int i11 = 0; i11 < m2641q.size(); i11++) {
            if (((C7458h0.a) m2641q.get(i11)).m28640b() == i10) {
                m2641q.remove(i11);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m2627j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.m2790a(view).m2796f(keyEvent);
    }

    /* renamed from: j0 */
    public static void m2628j0(View view, C7458h0.a aVar, CharSequence charSequence, InterfaceC7468m0 interfaceC7468m0) {
        if (interfaceC7468m0 == null && charSequence == null) {
            m2624h0(view, aVar.m28640b());
        } else {
            m2613c(view, aVar.m28639a(charSequence, interfaceC7468m0));
        }
    }

    /* renamed from: k */
    static void m2629k(View view) {
        C0551a m2631l = m2631l(view);
        if (m2631l == null) {
            m2631l = new C0551a();
        }
        m2636n0(view, m2631l);
    }

    /* renamed from: k0 */
    public static void m2630k0(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            l.m2726c(view);
        } else {
            h.m2699p(view);
        }
    }

    /* renamed from: l */
    public static C0551a m2631l(View view) {
        View.AccessibilityDelegate m2633m = m2633m(view);
        if (m2633m == null) {
            return null;
        }
        if (m2633m instanceof C0551a.a) {
            return ((C0551a.a) m2633m).f2319a;
        }
        return new C0551a(m2633m);
    }

    /* renamed from: l0 */
    public static void m2632l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.m2783c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m2633m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.m2781a(view);
        }
        return m2635n(view);
    }

    /* renamed from: m0 */
    private static f m2634m0() {
        return new a(R$id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m2635n(View view) {
        if (f2398e) {
            return null;
        }
        if (f2397d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2397d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2398e = true;
                return null;
            }
        }
        try {
            Object obj = f2397d.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f2398e = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m2636n0(View view, C0551a c0551a) {
        View.AccessibilityDelegate m2380d;
        if (c0551a == null && (m2633m(view) instanceof C0551a.a)) {
            c0551a = new C0551a();
        }
        if (c0551a == null) {
            m2380d = null;
        } else {
            m2380d = c0551a.m2380d();
        }
        view.setAccessibilityDelegate(m2380d);
    }

    /* renamed from: o */
    public static int m2637o(View view) {
        return k.m2717a(view);
    }

    /* renamed from: o0 */
    public static void m2638o0(View view, boolean z10) {
        m2611b().m2682g(view, Boolean.valueOf(z10));
    }

    /* renamed from: p */
    public static CharSequence m2639p(View view) {
        return (CharSequence) m2612b0().m2681f(view);
    }

    /* renamed from: p0 */
    public static void m2640p0(View view, int i10) {
        k.m2722f(view, i10);
    }

    /* renamed from: q */
    private static List m2641q(View view) {
        int i10 = R$id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static void m2642q0(View view, Drawable drawable) {
        h.m2700q(view, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static ColorStateList m2643r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2733g(view);
        }
        if (view instanceof InterfaceC0604n0) {
            return ((InterfaceC0604n0) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r0 */
    public static void m2644r0(View view, ColorStateList colorStateList) {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.m2743q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                if (m.m2733g(view) == null && m.m2734h(view) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.m2700q(view, background);
                    return;
                }
                return;
            }
            return;
        }
        if (view instanceof InterfaceC0604n0) {
            ((InterfaceC0604n0) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static PorterDuff.Mode m2645s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2734h(view);
        }
        if (view instanceof InterfaceC0604n0) {
            return ((InterfaceC0604n0) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s0 */
    public static void m2646s0(View view, PorterDuff.Mode mode) {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.m2744r(view, mode);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                if (m.m2733g(view) == null && m.m2734h(view) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.m2700q(view, background);
                    return;
                }
                return;
            }
            return;
        }
        if (view instanceof InterfaceC0604n0) {
            ((InterfaceC0604n0) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: t */
    public static Rect m2647t(View view) {
        return j.m2714a(view);
    }

    /* renamed from: t0 */
    public static void m2648t0(View view, Rect rect) {
        j.m2716c(view, rect);
    }

    /* renamed from: u */
    public static Display m2649u(View view) {
        return i.m2704b(view);
    }

    /* renamed from: u0 */
    public static void m2650u0(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2745s(view, f10);
        }
    }

    /* renamed from: v */
    public static float m2651v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m2735i(view);
        }
        return 0.0f;
    }

    /* renamed from: v0 */
    public static void m2652v0(View view, boolean z10) {
        h.m2701r(view, z10);
    }

    /* renamed from: w */
    private static Rect m2653w() {
        if (f2399f == null) {
            f2399f = new ThreadLocal();
        }
        Rect rect = (Rect) f2399f.get();
        if (rect == null) {
            rect = new Rect();
            f2399f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: w0 */
    public static void m2654w0(View view, int i10) {
        h.m2702s(view, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private static InterfaceC0596l0 m2655x(View view) {
        if (view instanceof InterfaceC0596l0) {
            return (InterfaceC0596l0) view;
        }
        return f2401h;
    }

    /* renamed from: x0 */
    public static void m2656x0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m2768l(view, i10);
        }
    }

    /* renamed from: y */
    public static boolean m2657y(View view) {
        return h.m2685b(view);
    }

    /* renamed from: y0 */
    public static void m2658y0(View view, InterfaceC0588j0 interfaceC0588j0) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m2747u(view, interfaceC0588j0);
        }
    }

    /* renamed from: z */
    public static int m2659z(View view) {
        return h.m2686c(view);
    }

    /* renamed from: z0 */
    public static void m2660z0(View view, int i10, int i11, int i12, int i13) {
        i.m2713k(view, i10, i11, i12, i13);
    }
}
