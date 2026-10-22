package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
abstract class AbstractC2521a extends AbstractC2523c {

    /* renamed from: d */
    private Runnable f9383d;

    /* renamed from: e */
    OverScroller f9384e;

    /* renamed from: f */
    private boolean f9385f;

    /* renamed from: g */
    private int f9386g;

    /* renamed from: h */
    private int f9387h;

    /* renamed from: i */
    private int f9388i;

    /* renamed from: j */
    private VelocityTracker f9389j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f9390a;

        /* renamed from: b */
        private final View f9391b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f9390a = coordinatorLayout;
            this.f9391b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f9391b != null && (overScroller = AbstractC2521a.this.f9384e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC2521a abstractC2521a = AbstractC2521a.this;
                    abstractC2521a.m10160O(this.f9390a, this.f9391b, abstractC2521a.f9384e.getCurrY());
                    AbstractC0616q0.m2620f0(this.f9391b, this);
                    return;
                }
                AbstractC2521a.this.mo10131M(this.f9390a, this.f9391b);
            }
        }
    }

    public AbstractC2521a() {
        this.f9386g = -1;
        this.f9388i = -1;
    }

    /* renamed from: H */
    private void m10157H() {
        if (this.f9389j == null) {
            this.f9389j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2110D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f9388i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f9388i = r0
        L12:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            r3 = -1
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L25
            r12 = 3
            if (r0 == r12) goto L7e
            goto Lae
        L25:
            int r0 = r11.f9386g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            return r2
        L2e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f9387h
            int r2 = r2 - r0
            boolean r3 = r11.f9385f
            if (r3 != 0) goto L49
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f9388i
            if (r3 <= r4) goto L49
            r11.f9385f = r1
            if (r2 <= 0) goto L48
            int r2 = r2 - r4
            goto L49
        L48:
            int r2 = r2 + r4
        L49:
            r6 = r2
            boolean r2 = r11.f9385f
            if (r2 == 0) goto Lae
            r11.f9387h = r0
            int r7 = r11.mo10128J(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.m10159N(r4, r5, r6, r7, r8)
            goto Lae
        L5c:
            android.view.VelocityTracker r0 = r11.f9389j
            if (r0 == 0) goto L7e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f9389j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f9389j
            int r4 = r11.f9386g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo10129K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m10158I(r6, r7, r8, r9, r10)
        L7e:
            r11.f9385f = r2
            r11.f9386g = r3
            android.view.VelocityTracker r12 = r11.f9389j
            if (r12 == 0) goto Lae
            r12.recycle()
            r12 = 0
            r11.f9389j = r12
            goto Lae
        L8d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.m2106z(r13, r0, r3)
            if (r12 == 0) goto Lb6
            boolean r12 = r11.mo10127G(r13)
            if (r12 == 0) goto Lb6
            r11.f9387h = r3
            int r12 = r14.getPointerId(r2)
            r11.f9386g = r12
            r11.m10157H()
        Lae:
            android.view.VelocityTracker r12 = r11.f9389j
            if (r12 == 0) goto Lb5
            r12.addMovement(r14)
        Lb5:
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC2521a.mo2110D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: G */
    abstract boolean mo10127G(View view);

    /* renamed from: I */
    final boolean m10158I(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f9383d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f9383d = null;
        }
        if (this.f9384e == null) {
            this.f9384e = new OverScroller(view.getContext());
        }
        this.f9384e.fling(0, mo10149E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f9384e.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, view);
            this.f9383d = aVar;
            AbstractC0616q0.m2620f0(view, aVar);
            return true;
        }
        mo10131M(coordinatorLayout, view);
        return false;
    }

    /* renamed from: J */
    abstract int mo10128J(View view);

    /* renamed from: K */
    abstract int mo10129K(View view);

    /* renamed from: L */
    abstract int mo10130L();

    /* renamed from: M */
    abstract void mo10131M(CoordinatorLayout coordinatorLayout, View view);

    /* renamed from: N */
    final int m10159N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return mo10132P(coordinatorLayout, view, mo10130L() - i10, i11, i12);
    }

    /* renamed from: O */
    int m10160O(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return mo10132P(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: P */
    abstract int mo10132P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != 3) goto L35;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2121k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f9388i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f9388i = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f9385f
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.f9386g
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f9387h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f9388i
            if (r6 <= r0) goto L83
            r4.f9385f = r2
            r4.f9387h = r5
            goto L83
        L51:
            r4.f9385f = r3
            r4.f9386g = r5
            android.view.VelocityTracker r5 = r4.f9389j
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.f9389j = r5
            goto L83
        L60:
            r4.f9385f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo10127G(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.m2106z(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.f9387h = r1
            int r5 = r7.getPointerId(r3)
            r4.f9386g = r5
            r4.m10157H()
        L83:
            android.view.VelocityTracker r5 = r4.f9389j
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.f9385f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC2521a.mo2121k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractC2521a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9386g = -1;
        this.f9388i = -1;
    }
}
