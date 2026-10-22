package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;
import androidx.core.view.C0584i0;
import androidx.core.view.C0609o1;
import androidx.core.view.InterfaceC0572f0;
import androidx.core.view.InterfaceC0576g0;
import androidx.core.view.InterfaceC0588j0;
import com.p077uc.crashsdk.export.LogType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p020b0.AbstractC1031a;
import p290q.AbstractC6306k;
import p373w.AbstractC7338c;
import p373w.C7341f;
import p373w.InterfaceC7339d;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0572f0, InterfaceC0576g0 {

    /* renamed from: u */
    static final String f2122u;

    /* renamed from: v */
    static final Class[] f2123v;

    /* renamed from: w */
    static final ThreadLocal f2124w;

    /* renamed from: x */
    static final Comparator f2125x;

    /* renamed from: y */
    private static final InterfaceC7339d f2126y;

    /* renamed from: a */
    private final List f2127a;

    /* renamed from: b */
    private final C0490b f2128b;

    /* renamed from: c */
    private final List f2129c;

    /* renamed from: d */
    private final List f2130d;

    /* renamed from: e */
    private Paint f2131e;

    /* renamed from: f */
    private final int[] f2132f;

    /* renamed from: g */
    private final int[] f2133g;

    /* renamed from: h */
    private boolean f2134h;

    /* renamed from: i */
    private boolean f2135i;

    /* renamed from: j */
    private int[] f2136j;

    /* renamed from: k */
    private View f2137k;

    /* renamed from: l */
    private View f2138l;

    /* renamed from: m */
    private ViewTreeObserverOnPreDrawListenerC0486f f2139m;

    /* renamed from: n */
    private boolean f2140n;

    /* renamed from: o */
    private C0609o1 f2141o;

    /* renamed from: p */
    private boolean f2142p;

    /* renamed from: q */
    private Drawable f2143q;

    /* renamed from: r */
    ViewGroup.OnHierarchyChangeListener f2144r;

    /* renamed from: s */
    private InterfaceC0588j0 f2145s;

    /* renamed from: t */
    private final C0584i0 f2146t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0481a implements InterfaceC0588j0 {
        C0481a() {
        }

        @Override // androidx.core.view.InterfaceC0588j0
        public C0609o1 onApplyWindowInsets(View view, C0609o1 c0609o1) {
            return CoordinatorLayout.this.m2094U(c0609o1);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0482b {
        public AbstractC0482b() {
        }

        /* renamed from: A */
        public boolean mo2107A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return mo2136z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        /* renamed from: B */
        public void m2108B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: C */
        public void mo2109C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                m2108B(coordinatorLayout, view, view2);
            }
        }

        /* renamed from: D */
        public boolean mo2110D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m2111a(CoordinatorLayout coordinatorLayout, View view) {
            if (m2114d(coordinatorLayout, view) > 0.0f) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo2112b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m2113c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* renamed from: d */
        public float m2114d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2115e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: f */
        public C0609o1 m2116f(CoordinatorLayout coordinatorLayout, View view, C0609o1 c0609o1) {
            return c0609o1;
        }

        /* renamed from: g */
        public void mo2117g(C0485e c0485e) {
        }

        /* renamed from: h */
        public boolean mo2118h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: i */
        public void m2119i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: j */
        public void mo2120j() {
        }

        /* renamed from: k */
        public boolean mo2121k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2123m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        /* renamed from: n */
        public boolean m2124n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2125o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        /* renamed from: p */
        public void m2126p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2127q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                m2126p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        /* renamed from: r */
        public void mo2128r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        /* renamed from: s */
        public void m2129s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                mo2128r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        /* renamed from: t */
        public void mo2130t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            m2129s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        /* renamed from: u */
        public void m2131u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        /* renamed from: v */
        public void m2132v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                m2131u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        /* renamed from: w */
        public boolean mo2133w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        /* renamed from: x */
        public void mo2134x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2135y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: z */
        public boolean mo2136z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public AbstractC0482b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public @interface InterfaceC0483c {
        Class value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    private class ViewGroupOnHierarchyChangeListenerC0484d implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0484d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2144r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m2089F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2144r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnPreDrawListenerC0486f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0486f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m2089F(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    static class C0488h implements Comparator {
        C0488h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float m2594L = AbstractC0616q0.m2594L(view);
            float m2594L2 = AbstractC0616q0.m2594L(view2);
            if (m2594L > m2594L2) {
                return -1;
            }
            if (m2594L < m2594L2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f2122u = str;
        if (Build.VERSION.SDK_INT >= 21) {
            f2125x = new C0488h();
        } else {
            f2125x = null;
        }
        f2123v = new Class[]{Context.class, AttributeSet.class};
        f2124w = new ThreadLocal();
        f2126y = new C7341f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.coordinatorLayoutStyle);
    }

    /* renamed from: A */
    private void m2065A(View view, int i10) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        Rect m2080a = m2080a();
        m2080a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0485e).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0485e).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0485e).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin);
        if (this.f2141o != null && AbstractC0616q0.m2657y(this) && !AbstractC0616q0.m2657y(view)) {
            m2080a.left += this.f2141o.m2519i();
            m2080a.top += this.f2141o.m2521k();
            m2080a.right -= this.f2141o.m2520j();
            m2080a.bottom -= this.f2141o.m2518h();
        }
        Rect m2080a2 = m2080a();
        AbstractC0619r.m2799a(m2075Q(c0485e.f2151c), view.getMeasuredWidth(), view.getMeasuredHeight(), m2080a, m2080a2, i10);
        view.layout(m2080a2.left, m2080a2.top, m2080a2.right, m2080a2.bottom);
        m2072M(m2080a);
        m2072M(m2080a2);
    }

    /* renamed from: B */
    private void m2066B(View view, View view2, int i10) {
        Rect m2080a = m2080a();
        Rect m2080a2 = m2080a();
        try {
            m2102r(view2, m2080a);
            m2103s(view, i10, m2080a, m2080a2);
            view.layout(m2080a2.left, m2080a2.top, m2080a2.right, m2080a2.bottom);
        } finally {
            m2072M(m2080a);
            m2072M(m2080a2);
        }
    }

    /* renamed from: C */
    private void m2067C(View view, int i10, int i11) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        int m2800b = AbstractC0619r.m2800b(m2076R(c0485e.f2151c), i11);
        int i12 = m2800b & 7;
        int i13 = m2800b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int m2085u = m2085u(i10) - measuredWidth;
        if (i12 != 1) {
            if (i12 == 5) {
                m2085u += measuredWidth;
            }
        } else {
            m2085u += measuredWidth / 2;
        }
        int i14 = 0;
        if (i13 != 16) {
            if (i13 == 80) {
                i14 = measuredHeight + 0;
            }
        } else {
            i14 = 0 + (measuredHeight / 2);
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0485e).leftMargin, Math.min(m2085u, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0485e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0485e).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: D */
    private void m2068D(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC0616q0.m2600R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0485e c0485e = (C0485e) view.getLayoutParams();
            AbstractC0482b m2144e = c0485e.m2144e();
            Rect m2080a = m2080a();
            Rect m2080a2 = m2080a();
            m2080a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m2144e != null && m2144e.mo2112b(this, view, m2080a)) {
                if (!m2080a2.contains(m2080a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m2080a.toShortString() + " | Bounds:" + m2080a2.toShortString());
                }
            } else {
                m2080a.set(m2080a2);
            }
            m2072M(m2080a2);
            if (m2080a.isEmpty()) {
                m2072M(m2080a);
                return;
            }
            int m2800b = AbstractC0619r.m2800b(c0485e.f2156h, i10);
            boolean z12 = true;
            if ((m2800b & 48) == 48 && (i15 = (m2080a.top - ((ViewGroup.MarginLayoutParams) c0485e).topMargin) - c0485e.f2158j) < (i16 = rect.top)) {
                m2078T(view, i16 - i15);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((m2800b & 80) == 80 && (height = ((getHeight() - m2080a.bottom) - ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin) + c0485e.f2158j) < (i14 = rect.bottom)) {
                m2078T(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                m2078T(view, 0);
            }
            if ((m2800b & 3) == 3 && (i12 = (m2080a.left - ((ViewGroup.MarginLayoutParams) c0485e).leftMargin) - c0485e.f2157i) < (i13 = rect.left)) {
                m2077S(view, i13 - i12);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((m2800b & 5) == 5 && (width = ((getWidth() - m2080a.right) - ((ViewGroup.MarginLayoutParams) c0485e).rightMargin) + c0485e.f2157i) < (i11 = rect.right)) {
                m2077S(view, width - i11);
            } else {
                z12 = z11;
            }
            if (!z12) {
                m2077S(view, 0);
            }
            m2072M(m2080a);
        }
    }

    /* renamed from: I */
    static AbstractC0482b m2069I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2122u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f2124w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2123v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0482b) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    /* renamed from: J */
    private boolean m2070J(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f2129c;
        m2086x(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            C0485e c0485e = (C0485e) view.getLayoutParams();
            AbstractC0482b m2144e = c0485e.m2144e();
            if ((z10 || z11) && actionMasked != 0) {
                if (m2144e != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            m2144e.mo2110D(this, view, motionEvent2);
                        }
                    } else {
                        m2144e.mo2121k(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z10 && m2144e != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z10 = m2144e.mo2110D(this, view, motionEvent);
                        }
                    } else {
                        z10 = m2144e.mo2121k(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f2137k = view;
                    }
                }
                boolean m2142c = c0485e.m2142c();
                boolean m2147h = c0485e.m2147h(this, view);
                if (m2147h && !m2142c) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m2147h && !z11) {
                    break;
                }
            }
        }
        list.clear();
        return z10;
    }

    /* renamed from: K */
    private void m2071K() {
        this.f2127a.clear();
        this.f2128b.m2166c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C0485e m2105w = m2105w(childAt);
            m2105w.m2143d(this, childAt);
            this.f2128b.m2165b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (m2105w.m2141b(this, childAt, childAt2)) {
                        if (!this.f2128b.m2167d(childAt2)) {
                            this.f2128b.m2165b(childAt2);
                        }
                        this.f2128b.m2164a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2127a.addAll(this.f2128b.m2169h());
        Collections.reverse(this.f2127a);
    }

    /* renamed from: M */
    private static void m2072M(Rect rect) {
        rect.setEmpty();
        f2126y.mo16817a(rect);
    }

    /* renamed from: O */
    private void m2073O(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0482b m2144e = ((C0485e) childAt.getLayoutParams()).m2144e();
            if (m2144e != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    m2144e.mo2121k(this, childAt, obtain);
                } else {
                    m2144e.mo2110D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C0485e) getChildAt(i11).getLayoutParams()).m2151l();
        }
        this.f2137k = null;
        this.f2134h = false;
    }

    /* renamed from: P */
    private static int m2074P(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    /* renamed from: Q */
    private static int m2075Q(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    /* renamed from: R */
    private static int m2076R(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    /* renamed from: S */
    private void m2077S(View view, int i10) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        int i11 = c0485e.f2157i;
        if (i11 != i10) {
            AbstractC0616q0.m2606X(view, i10 - i11);
            c0485e.f2157i = i10;
        }
    }

    /* renamed from: T */
    private void m2078T(View view, int i10) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        int i11 = c0485e.f2158j;
        if (i11 != i10) {
            AbstractC0616q0.m2607Y(view, i10 - i11);
            c0485e.f2158j = i10;
        }
    }

    /* renamed from: V */
    private void m2079V() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (AbstractC0616q0.m2657y(this)) {
            if (this.f2145s == null) {
                this.f2145s = new C0481a();
            }
            AbstractC0616q0.m2658y0(this, this.f2145s);
            setSystemUiVisibility(LogType.UNEXP_ANR);
            return;
        }
        AbstractC0616q0.m2658y0(this, null);
    }

    /* renamed from: a */
    private static Rect m2080a() {
        Rect rect = (Rect) f2126y.mo16818b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: c */
    private static int m2081c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    /* renamed from: d */
    private void m2082d(C0485e c0485e, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0485e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c0485e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0485e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    /* renamed from: f */
    private C0609o1 m2083f(C0609o1 c0609o1) {
        AbstractC0482b m2144e;
        if (c0609o1.m2523n()) {
            return c0609o1;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC0616q0.m2657y(childAt) && (m2144e = ((C0485e) childAt.getLayoutParams()).m2144e()) != null) {
                c0609o1 = m2144e.m2116f(this, childAt, c0609o1);
                if (c0609o1.m2523n()) {
                    break;
                }
            }
        }
        return c0609o1;
    }

    /* renamed from: t */
    private void m2084t(View view, int i10, Rect rect, Rect rect2, C0485e c0485e, int i11, int i12) {
        int width;
        int height;
        int m2800b = AbstractC0619r.m2800b(m2074P(c0485e.f2151c), i10);
        int m2800b2 = AbstractC0619r.m2800b(m2075Q(c0485e.f2152d), i10);
        int i13 = m2800b & 7;
        int i14 = m2800b & 112;
        int i15 = m2800b2 & 7;
        int i16 = m2800b2 & 112;
        if (i15 != 1) {
            if (i15 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i13 != 1) {
            if (i13 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i14 != 16) {
            if (i14 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    /* renamed from: u */
    private int m2085u(int i10) {
        int[] iArr = this.f2136j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* renamed from: x */
    private void m2086x(List list) {
        int i10;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            list.add(getChildAt(i10));
        }
        Comparator comparator = f2125x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: y */
    private boolean m2087y(View view) {
        return this.f2128b.m2170i(view);
    }

    /* renamed from: E */
    void m2088E(View view, int i10) {
        AbstractC0482b m2144e;
        C0485e c0485e = (C0485e) view.getLayoutParams();
        if (c0485e.f2159k != null) {
            Rect m2080a = m2080a();
            Rect m2080a2 = m2080a();
            Rect m2080a3 = m2080a();
            m2102r(c0485e.f2159k, m2080a);
            boolean z10 = false;
            m2100p(view, false, m2080a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m2084t(view, i10, m2080a, m2080a3, c0485e, measuredWidth, measuredHeight);
            if (m2080a3.left != m2080a2.left || m2080a3.top != m2080a2.top) {
                z10 = true;
            }
            m2082d(c0485e, m2080a3, measuredWidth, measuredHeight);
            int i11 = m2080a3.left - m2080a2.left;
            int i12 = m2080a3.top - m2080a2.top;
            if (i11 != 0) {
                AbstractC0616q0.m2606X(view, i11);
            }
            if (i12 != 0) {
                AbstractC0616q0.m2607Y(view, i12);
            }
            if (z10 && (m2144e = c0485e.m2144e()) != null) {
                m2144e.mo2118h(this, view, c0485e.f2159k);
            }
            m2072M(m2080a);
            m2072M(m2080a2);
            m2072M(m2080a3);
        }
    }

    /* renamed from: F */
    final void m2089F(int i10) {
        boolean z10;
        int m2579B = AbstractC0616q0.m2579B(this);
        int size = this.f2127a.size();
        Rect m2080a = m2080a();
        Rect m2080a2 = m2080a();
        Rect m2080a3 = m2080a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f2127a.get(i11);
            C0485e c0485e = (C0485e) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (c0485e.f2160l == ((View) this.f2127a.get(i12))) {
                        m2088E(view, m2579B);
                    }
                }
                m2100p(view, true, m2080a2);
                if (c0485e.f2155g != 0 && !m2080a2.isEmpty()) {
                    int m2800b = AbstractC0619r.m2800b(c0485e.f2155g, m2579B);
                    int i13 = m2800b & 112;
                    if (i13 != 48) {
                        if (i13 == 80) {
                            m2080a.bottom = Math.max(m2080a.bottom, getHeight() - m2080a2.top);
                        }
                    } else {
                        m2080a.top = Math.max(m2080a.top, m2080a2.bottom);
                    }
                    int i14 = m2800b & 7;
                    if (i14 != 3) {
                        if (i14 == 5) {
                            m2080a.right = Math.max(m2080a.right, getWidth() - m2080a2.left);
                        }
                    } else {
                        m2080a.left = Math.max(m2080a.left, m2080a2.right);
                    }
                }
                if (c0485e.f2156h != 0 && view.getVisibility() == 0) {
                    m2068D(view, m2080a, m2579B);
                }
                if (i10 != 2) {
                    m2104v(view, m2080a3);
                    if (!m2080a3.equals(m2080a2)) {
                        m2092L(view, m2080a2);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = (View) this.f2127a.get(i15);
                    C0485e c0485e2 = (C0485e) view2.getLayoutParams();
                    AbstractC0482b m2144e = c0485e2.m2144e();
                    if (m2144e != null && m2144e.mo2115e(this, view2, view)) {
                        if (i10 == 0 && c0485e2.m2145f()) {
                            c0485e2.m2149j();
                        } else {
                            if (i10 != 2) {
                                z10 = m2144e.mo2118h(this, view2, view);
                            } else {
                                m2144e.m2119i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                c0485e2.m2153o(z10);
                            }
                        }
                    }
                }
            }
        }
        m2072M(m2080a);
        m2072M(m2080a2);
        m2072M(m2080a3);
    }

    /* renamed from: G */
    public void m2090G(View view, int i10) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        if (!c0485e.m2140a()) {
            View view2 = c0485e.f2159k;
            if (view2 != null) {
                m2066B(view, view2, i10);
                return;
            }
            int i11 = c0485e.f2153e;
            if (i11 >= 0) {
                m2067C(view, i11, i10);
                return;
            } else {
                m2065A(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: H */
    public void m2091H(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* renamed from: L */
    void m2092L(View view, Rect rect) {
        ((C0485e) view.getLayoutParams()).m2154p(rect);
    }

    /* renamed from: N */
    void m2093N() {
        if (this.f2135i && this.f2139m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2139m);
        }
        this.f2140n = false;
    }

    /* renamed from: U */
    final C0609o1 m2094U(C0609o1 c0609o1) {
        boolean z10;
        if (!AbstractC7338c.m28317a(this.f2141o, c0609o1)) {
            this.f2141o = c0609o1;
            boolean z11 = true;
            if (c0609o1 != null && c0609o1.m2521k() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2142p = z10;
            if (z10 || getBackground() != null) {
                z11 = false;
            }
            setWillNotDraw(z11);
            C0609o1 m2083f = m2083f(c0609o1);
            requestLayout();
            return m2083f;
        }
        return c0609o1;
    }

    /* renamed from: b */
    void m2095b() {
        if (this.f2135i) {
            if (this.f2139m == null) {
                this.f2139m = new ViewTreeObserverOnPreDrawListenerC0486f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2139m);
        }
        this.f2140n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C0485e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        AbstractC0482b abstractC0482b = c0485e.f2149a;
        if (abstractC0482b != null) {
            float m2114d = abstractC0482b.m2114d(this, view);
            if (m2114d > 0.0f) {
                if (this.f2131e == null) {
                    this.f2131e = new Paint();
                }
                this.f2131e.setColor(c0485e.f2149a.m2113c(this, view));
                this.f2131e.setAlpha(m2081c(Math.round(m2114d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2131e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2143q;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // androidx.core.view.InterfaceC0576g0
    /* renamed from: e */
    public void mo1450e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC0482b m2144e;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0485e c0485e = (C0485e) childAt.getLayoutParams();
                if (c0485e.m2148i(i14) && (m2144e = c0485e.m2144e()) != null) {
                    int[] iArr2 = this.f2132f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m2144e.mo2130t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2132f;
                    if (i12 > 0) {
                        min = Math.max(i15, iArr3[0]);
                    } else {
                        min = Math.min(i15, iArr3[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, this.f2132f[1]);
                    } else {
                        min2 = Math.min(i16, this.f2132f[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            m2089F(1);
        }
    }

    /* renamed from: g */
    void m2096g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (m2087y(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f2140n) {
            if (z10) {
                m2095b();
            } else {
                m2093N();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m2071K();
        return Collections.unmodifiableList(this.f2127a);
    }

    public final C0609o1 getLastWindowInsets() {
        return this.f2141o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2146t.m2468a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2143q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0485e generateDefaultLayoutParams() {
        return new C0485e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0485e generateLayoutParams(AttributeSet attributeSet) {
        return new C0485e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0485e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0485e) {
            return new C0485e((C0485e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0485e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0485e(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: k */
    public void mo1456k(View view, int i10, int i11, int i12, int i13, int i14) {
        mo1450e(view, i10, i11, i12, i13, 0, this.f2133g);
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: l */
    public boolean mo1457l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0485e c0485e = (C0485e) childAt.getLayoutParams();
                AbstractC0482b m2144e = c0485e.m2144e();
                if (m2144e != null) {
                    boolean mo2107A = m2144e.mo2107A(this, childAt, view, view2, i10, i11);
                    z10 |= mo2107A;
                    c0485e.m2155q(i11, mo2107A);
                } else {
                    c0485e.m2155q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: m */
    public void mo1458m(View view, View view2, int i10, int i11) {
        AbstractC0482b m2144e;
        this.f2146t.m2470c(view, view2, i10, i11);
        this.f2138l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C0485e c0485e = (C0485e) childAt.getLayoutParams();
            if (c0485e.m2148i(i11) && (m2144e = c0485e.m2144e()) != null) {
                m2144e.m2132v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: n */
    public void mo1459n(View view, int i10) {
        this.f2146t.m2471d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0485e c0485e = (C0485e) childAt.getLayoutParams();
            if (c0485e.m2148i(i10)) {
                AbstractC0482b m2144e = c0485e.m2144e();
                if (m2144e != null) {
                    m2144e.mo2109C(this, childAt, view, i10);
                }
                c0485e.m2150k(i10);
                c0485e.m2149j();
            }
        }
        this.f2138l = null;
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: o */
    public void mo1460o(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC0482b m2144e;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0485e c0485e = (C0485e) childAt.getLayoutParams();
                if (c0485e.m2148i(i12) && (m2144e = c0485e.m2144e()) != null) {
                    int[] iArr2 = this.f2132f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m2144e.mo2127q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2132f;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    int[] iArr4 = this.f2132f;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr4[1]);
                    } else {
                        min2 = Math.min(i14, iArr4[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            m2089F(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2073O(false);
        if (this.f2140n) {
            if (this.f2139m == null) {
                this.f2139m = new ViewTreeObserverOnPreDrawListenerC0486f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2139m);
        }
        if (this.f2141o == null && AbstractC0616q0.m2657y(this)) {
            AbstractC0616q0.m2630k0(this);
        }
        this.f2135i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2073O(false);
        if (this.f2140n && this.f2139m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2139m);
        }
        View view = this.f2138l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2135i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f2142p && this.f2143q != null) {
            C0609o1 c0609o1 = this.f2141o;
            if (c0609o1 != null) {
                i10 = c0609o1.m2521k();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f2143q.setBounds(0, 0, getWidth(), i10);
                this.f2143q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2073O(true);
        }
        boolean m2070J = m2070J(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2073O(true);
        }
        return m2070J;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC0482b m2144e;
        int m2579B = AbstractC0616q0.m2579B(this);
        int size = this.f2127a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f2127a.get(i14);
            if (view.getVisibility() != 8 && ((m2144e = ((C0485e) view.getLayoutParams()).m2144e()) == null || !m2144e.mo2122l(this, view, m2579B))) {
                m2090G(view, m2579B);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        if (r0.mo2123m(r30, r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        AbstractC0482b m2144e;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0485e c0485e = (C0485e) childAt.getLayoutParams();
                if (c0485e.m2148i(0) && (m2144e = c0485e.m2144e()) != null) {
                    z11 |= m2144e.m2124n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            m2089F(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC0482b m2144e;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0485e c0485e = (C0485e) childAt.getLayoutParams();
                if (c0485e.m2148i(0) && (m2144e = c0485e.m2144e()) != null) {
                    z10 |= m2144e.mo2125o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1460o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo1456k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1458m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0487g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0487g c0487g = (C0487g) parcelable;
        super.onRestoreInstanceState(c0487g.m4828a());
        SparseArray sparseArray = c0487g.f2168c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0482b m2144e = m2105w(childAt).m2144e();
            if (id2 != -1 && m2144e != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                m2144e.mo2134x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo2135y;
        C0487g c0487g = new C0487g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0482b m2144e = ((C0485e) childAt.getLayoutParams()).m2144e();
            if (id2 != -1 && m2144e != null && (mo2135y = m2144e.mo2135y(this, childAt)) != null) {
                sparseArray.append(id2, mo2135y);
            }
        }
        c0487g.f2168c = sparseArray;
        return c0487g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1457l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onStopNestedScroll(View view) {
        mo1459n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2137k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m2070J(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f2137k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0485e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.m2144e()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f2137k
            boolean r6 = r6.mo2110D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f2137k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m2073O(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    void m2100p(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                m2102r(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    /* renamed from: q */
    public List m2101q(View view) {
        List m2168g = this.f2128b.m2168g(view);
        this.f2130d.clear();
        if (m2168g != null) {
            this.f2130d.addAll(m2168g);
        }
        return this.f2130d;
    }

    /* renamed from: r */
    void m2102r(View view, Rect rect) {
        AbstractC0491c.m2171a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0482b m2144e = ((C0485e) view.getLayoutParams()).m2144e();
        if (m2144e != null && m2144e.mo2133w(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f2134h) {
            m2073O(false);
            this.f2134h = true;
        }
    }

    /* renamed from: s */
    void m2103s(View view, int i10, Rect rect, Rect rect2) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2084t(view, i10, rect, rect2, c0485e, measuredWidth, measuredHeight);
        m2082d(c0485e, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m2079V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2144r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f2143q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2143q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2143q.setState(getDrawableState());
                }
                AbstractC6306k.m25067m(this.f2143q, AbstractC0616q0.m2579B(this));
                Drawable drawable4 = this.f2143q;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.f2143q.setCallback(this);
            }
            AbstractC0616q0.m2618e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AbstractC0547a.m2324f(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f2143q;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f2143q.setVisible(z10, false);
        }
    }

    /* renamed from: v */
    void m2104v(View view, Rect rect) {
        rect.set(((C0485e) view.getLayoutParams()).m2146g());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2143q) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    C0485e m2105w(View view) {
        C0485e c0485e = (C0485e) view.getLayoutParams();
        if (!c0485e.f2150b) {
            InterfaceC0483c interfaceC0483c = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0483c = (InterfaceC0483c) cls.getAnnotation(InterfaceC0483c.class);
                if (interfaceC0483c != null) {
                    break;
                }
            }
            if (interfaceC0483c != null) {
                try {
                    c0485e.m2152n((AbstractC0482b) interfaceC0483c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0483c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            c0485e.f2150b = true;
        }
        return c0485e;
    }

    /* renamed from: z */
    public boolean m2106z(View view, int i10, int i11) {
        Rect m2080a = m2080a();
        m2102r(view, m2080a);
        try {
            return m2080a.contains(i10, i11);
        } finally {
            m2072M(m2080a);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f2127a = new ArrayList();
        this.f2128b = new C0490b();
        this.f2129c = new ArrayList();
        this.f2130d = new ArrayList();
        this.f2132f = new int[2];
        this.f2133g = new int[2];
        this.f2146t = new C0584i0(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2116b, 0, R$style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2116b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, R$styleable.f2116b, attributeSet, obtainStyledAttributes, 0, R$style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R$styleable.f2116b, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2136j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2136j.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f2136j[i11] = (int) (r12[i11] * f10);
            }
        }
        this.f2143q = obtainStyledAttributes.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m2079V();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0484d());
        if (AbstractC0616q0.m2659z(this) == 0) {
            AbstractC0616q0.m2654w0(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public static class C0487g extends AbstractC1031a {
        public static final Parcelable.Creator<C0487g> CREATOR = new a();

        /* renamed from: c */
        SparseArray f2168c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0487g createFromParcel(Parcel parcel) {
                return new C0487g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0487g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0487g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0487g[] newArray(int i10) {
                return new C0487g[i10];
            }
        }

        public C0487g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2168c = new SparseArray(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2168c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int i11;
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f2168c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f2168c.keyAt(i12);
                parcelableArr[i12] = (Parcelable) this.f2168c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public C0487g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    public static class C0485e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0482b f2149a;

        /* renamed from: b */
        boolean f2150b;

        /* renamed from: c */
        public int f2151c;

        /* renamed from: d */
        public int f2152d;

        /* renamed from: e */
        public int f2153e;

        /* renamed from: f */
        int f2154f;

        /* renamed from: g */
        public int f2155g;

        /* renamed from: h */
        public int f2156h;

        /* renamed from: i */
        int f2157i;

        /* renamed from: j */
        int f2158j;

        /* renamed from: k */
        View f2159k;

        /* renamed from: l */
        View f2160l;

        /* renamed from: m */
        private boolean f2161m;

        /* renamed from: n */
        private boolean f2162n;

        /* renamed from: o */
        private boolean f2163o;

        /* renamed from: p */
        private boolean f2164p;

        /* renamed from: q */
        final Rect f2165q;

        /* renamed from: r */
        Object f2166r;

        public C0485e(int i10, int i11) {
            super(i10, i11);
            this.f2150b = false;
            this.f2151c = 0;
            this.f2152d = 0;
            this.f2153e = -1;
            this.f2154f = -1;
            this.f2155g = 0;
            this.f2156h = 0;
            this.f2165q = new Rect();
        }

        /* renamed from: m */
        private void m2137m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2154f);
            this.f2159k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f2160l = null;
                        this.f2159k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f2160l = null;
                            this.f2159k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = parent;
                    }
                }
                this.f2160l = findViewById;
                return;
            }
            if (coordinatorLayout.isInEditMode()) {
                this.f2160l = null;
                this.f2159k = null;
                return;
            }
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2154f) + " to anchor view " + view);
        }

        /* renamed from: r */
        private boolean m2138r(View view, int i10) {
            int m2800b = AbstractC0619r.m2800b(((C0485e) view.getLayoutParams()).f2155g, i10);
            if (m2800b != 0 && (AbstractC0619r.m2800b(this.f2156h, i10) & m2800b) == m2800b) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        private boolean m2139s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2159k.getId() != this.f2154f) {
                return false;
            }
            View view2 = this.f2159k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                } else {
                    this.f2160l = null;
                    this.f2159k = null;
                    return false;
                }
            }
            this.f2160l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m2140a() {
            if (this.f2159k == null && this.f2154f != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        boolean m2141b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0482b abstractC0482b;
            if (view2 != this.f2160l && !m2138r(view2, AbstractC0616q0.m2579B(coordinatorLayout)) && ((abstractC0482b = this.f2149a) == null || !abstractC0482b.mo2115e(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        boolean m2142c() {
            if (this.f2149a == null) {
                this.f2161m = false;
            }
            return this.f2161m;
        }

        /* renamed from: d */
        View m2143d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2154f == -1) {
                this.f2160l = null;
                this.f2159k = null;
                return null;
            }
            if (this.f2159k == null || !m2139s(view, coordinatorLayout)) {
                m2137m(view, coordinatorLayout);
            }
            return this.f2159k;
        }

        /* renamed from: e */
        public AbstractC0482b m2144e() {
            return this.f2149a;
        }

        /* renamed from: f */
        boolean m2145f() {
            return this.f2164p;
        }

        /* renamed from: g */
        Rect m2146g() {
            return this.f2165q;
        }

        /* renamed from: h */
        boolean m2147h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10;
            boolean z11 = this.f2161m;
            if (z11) {
                return true;
            }
            AbstractC0482b abstractC0482b = this.f2149a;
            if (abstractC0482b != null) {
                z10 = abstractC0482b.m2111a(coordinatorLayout, view);
            } else {
                z10 = false;
            }
            boolean z12 = z10 | z11;
            this.f2161m = z12;
            return z12;
        }

        /* renamed from: i */
        boolean m2148i(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f2163o;
            }
            return this.f2162n;
        }

        /* renamed from: j */
        void m2149j() {
            this.f2164p = false;
        }

        /* renamed from: k */
        void m2150k(int i10) {
            m2155q(i10, false);
        }

        /* renamed from: l */
        void m2151l() {
            this.f2161m = false;
        }

        /* renamed from: n */
        public void m2152n(AbstractC0482b abstractC0482b) {
            AbstractC0482b abstractC0482b2 = this.f2149a;
            if (abstractC0482b2 != abstractC0482b) {
                if (abstractC0482b2 != null) {
                    abstractC0482b2.mo2120j();
                }
                this.f2149a = abstractC0482b;
                this.f2166r = null;
                this.f2150b = true;
                if (abstractC0482b != null) {
                    abstractC0482b.mo2117g(this);
                }
            }
        }

        /* renamed from: o */
        void m2153o(boolean z10) {
            this.f2164p = z10;
        }

        /* renamed from: p */
        void m2154p(Rect rect) {
            this.f2165q.set(rect);
        }

        /* renamed from: q */
        void m2155q(int i10, boolean z10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f2163o = z10;
                    return;
                }
                return;
            }
            this.f2162n = z10;
        }

        C0485e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2150b = false;
            this.f2151c = 0;
            this.f2152d = 0;
            this.f2153e = -1;
            this.f2154f = -1;
            this.f2155g = 0;
            this.f2156h = 0;
            this.f2165q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2117c);
            this.f2151c = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2154f = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2152d = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2153e = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2155g = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2156h = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = R$styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2150b = hasValue;
            if (hasValue) {
                this.f2149a = CoordinatorLayout.m2069I(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            AbstractC0482b abstractC0482b = this.f2149a;
            if (abstractC0482b != null) {
                abstractC0482b.mo2117g(this);
            }
        }

        public C0485e(C0485e c0485e) {
            super((ViewGroup.MarginLayoutParams) c0485e);
            this.f2150b = false;
            this.f2151c = 0;
            this.f2152d = 0;
            this.f2153e = -1;
            this.f2154f = -1;
            this.f2155g = 0;
            this.f2156h = 0;
            this.f2165q = new Rect();
        }

        public C0485e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2150b = false;
            this.f2151c = 0;
            this.f2152d = 0;
            this.f2153e = -1;
            this.f2154f = -1;
            this.f2155g = 0;
            this.f2156h = 0;
            this.f2165q = new Rect();
        }

        public C0485e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2150b = false;
            this.f2151c = 0;
            this.f2152d = 0;
            this.f2153e = -1;
            this.f2154f = -1;
            this.f2155g = 0;
            this.f2156h = 0;
            this.f2165q = new Rect();
        }
    }
}
