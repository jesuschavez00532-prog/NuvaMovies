package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p150h.InterfaceC4458e;

/* renamed from: androidx.appcompat.widget.r1 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0441r1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1870a;

    /* renamed from: b */
    private final int f1871b;

    /* renamed from: c */
    private final int f1872c;

    /* renamed from: d */
    final View f1873d;

    /* renamed from: e */
    private Runnable f1874e;

    /* renamed from: f */
    private Runnable f1875f;

    /* renamed from: g */
    private boolean f1876g;

    /* renamed from: h */
    private int f1877h;

    /* renamed from: i */
    private final int[] f1878i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.r1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0441r1.this.f1873d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.r1$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0441r1.this.m1902e();
        }
    }

    public AbstractViewOnTouchListenerC0441r1(View view) {
        this.f1873d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1870a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1871b = tapTimeout;
        this.f1872c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1896a() {
        Runnable runnable = this.f1875f;
        if (runnable != null) {
            this.f1873d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1874e;
        if (runnable2 != null) {
            this.f1873d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1897f(MotionEvent motionEvent) {
        C0433p1 c0433p1;
        boolean z10;
        View view = this.f1873d;
        InterfaceC4458e mo1266b = mo1266b();
        if (mo1266b == null || !mo1266b.isShowing() || (c0433p1 = (C0433p1) mo1266b.mo1301h()) == null || !c0433p1.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1900i(view, obtainNoHistory);
        m1901j(c0433p1, obtainNoHistory);
        boolean mo1630e = c0433p1.mo1630e(obtainNoHistory, this.f1877h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!mo1630e || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m1898g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1873d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1877h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1870a
            boolean r6 = m1899h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m1896a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m1896a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1877h = r6
            java.lang.Runnable r6 = r5.f1874e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.r1$a r6 = new androidx.appcompat.widget.r1$a
            r6.<init>()
            r5.f1874e = r6
        L52:
            java.lang.Runnable r6 = r5.f1874e
            int r1 = r5.f1871b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1875f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.r1$b r6 = new androidx.appcompat.widget.r1$b
            r6.<init>()
            r5.f1875f = r6
        L65:
            java.lang.Runnable r6 = r5.f1875f
            int r1 = r5.f1872c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1.m1898g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1899h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        if (f10 >= f13 && f11 >= f13 && f10 < (view.getRight() - view.getLeft()) + f12 && f11 < (view.getBottom() - view.getTop()) + f12) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m1900i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1878i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1901j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1878i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC4458e mo1266b();

    /* renamed from: c */
    protected abstract boolean mo1267c();

    /* renamed from: d */
    protected boolean mo1690d() {
        InterfaceC4458e mo1266b = mo1266b();
        if (mo1266b != null && mo1266b.isShowing()) {
            mo1266b.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    void m1902e() {
        m1896a();
        View view = this.f1873d;
        if (!view.isEnabled() || view.isLongClickable() || !mo1267c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f1876g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1876g;
        if (z11) {
            if (!m1897f(motionEvent) && mo1690d()) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            if (m1898g(motionEvent) && mo1267c()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1873d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1876g = z10;
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1876g = false;
        this.f1877h = -1;
        Runnable runnable = this.f1874e;
        if (runnable != null) {
            this.f1873d.removeCallbacks(runnable);
        }
    }
}
