package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0640w0;

/* renamed from: androidx.appcompat.widget.u2 */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0454u2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    private static ViewOnLongClickListenerC0454u2 f1947j;

    /* renamed from: k */
    private static ViewOnLongClickListenerC0454u2 f1948k;

    /* renamed from: a */
    private final View f1949a;

    /* renamed from: b */
    private final CharSequence f1950b;

    /* renamed from: c */
    private final int f1951c;

    /* renamed from: d */
    private final Runnable f1952d = new a();

    /* renamed from: e */
    private final Runnable f1953e = new b();

    /* renamed from: f */
    private int f1954f;

    /* renamed from: g */
    private int f1955g;

    /* renamed from: h */
    private C0458v2 f1956h;

    /* renamed from: i */
    private boolean f1957i;

    /* renamed from: androidx.appcompat.widget.u2$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0454u2.this.m1984g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.u2$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0454u2.this.m1983c();
        }
    }

    private ViewOnLongClickListenerC0454u2(View view, CharSequence charSequence) {
        this.f1949a = view;
        this.f1950b = charSequence;
        this.f1951c = AbstractC0640w0.m2829c(ViewConfiguration.get(view.getContext()));
        m1978b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1977a() {
        this.f1949a.removeCallbacks(this.f1952d);
    }

    /* renamed from: b */
    private void m1978b() {
        this.f1954f = Integer.MAX_VALUE;
        this.f1955g = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1979d() {
        this.f1949a.postDelayed(this.f1952d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1980e(ViewOnLongClickListenerC0454u2 viewOnLongClickListenerC0454u2) {
        ViewOnLongClickListenerC0454u2 viewOnLongClickListenerC0454u22 = f1947j;
        if (viewOnLongClickListenerC0454u22 != null) {
            viewOnLongClickListenerC0454u22.m1977a();
        }
        f1947j = viewOnLongClickListenerC0454u2;
        if (viewOnLongClickListenerC0454u2 != null) {
            viewOnLongClickListenerC0454u2.m1979d();
        }
    }

    /* renamed from: f */
    public static void m1981f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0454u2 viewOnLongClickListenerC0454u2 = f1947j;
        if (viewOnLongClickListenerC0454u2 != null && viewOnLongClickListenerC0454u2.f1949a == view) {
            m1980e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC0454u2 viewOnLongClickListenerC0454u22 = f1948k;
            if (viewOnLongClickListenerC0454u22 != null && viewOnLongClickListenerC0454u22.f1949a == view) {
                viewOnLongClickListenerC0454u22.m1983c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC0454u2(view, charSequence);
    }

    /* renamed from: h */
    private boolean m1982h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1954f) <= this.f1951c && Math.abs(y10 - this.f1955g) <= this.f1951c) {
            return false;
        }
        this.f1954f = x10;
        this.f1955g = y10;
        return true;
    }

    /* renamed from: c */
    void m1983c() {
        if (f1948k == this) {
            f1948k = null;
            C0458v2 c0458v2 = this.f1956h;
            if (c0458v2 != null) {
                c0458v2.m1989c();
                this.f1956h = null;
                m1978b();
                this.f1949a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1947j == this) {
            m1980e(null);
        }
        this.f1949a.removeCallbacks(this.f1953e);
    }

    /* renamed from: g */
    void m1984g(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (!AbstractC0616q0.m2599Q(this.f1949a)) {
            return;
        }
        m1980e(null);
        ViewOnLongClickListenerC0454u2 viewOnLongClickListenerC0454u2 = f1948k;
        if (viewOnLongClickListenerC0454u2 != null) {
            viewOnLongClickListenerC0454u2.m1983c();
        }
        f1948k = this;
        this.f1957i = z10;
        C0458v2 c0458v2 = new C0458v2(this.f1949a.getContext());
        this.f1956h = c0458v2;
        c0458v2.m1991e(this.f1949a, this.f1954f, this.f1955g, this.f1957i, this.f1950b);
        this.f1949a.addOnAttachStateChangeListener(this);
        if (this.f1957i) {
            j11 = 2500;
        } else {
            if ((AbstractC0616q0.m2593K(this.f1949a) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        this.f1949a.removeCallbacks(this.f1953e);
        this.f1949a.postDelayed(this.f1953e, j11);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1956h != null && this.f1957i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1949a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1978b();
                m1983c();
            }
        } else if (this.f1949a.isEnabled() && this.f1956h == null && m1982h(motionEvent)) {
            m1980e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1954f = view.getWidth() / 2;
        this.f1955g = view.getHeight() / 2;
        m1984g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1983c();
    }
}
