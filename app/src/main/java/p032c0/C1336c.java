package p032c0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0616q0;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public class C1336c {

    /* renamed from: w */
    private static final Interpolator f5028w = new a();

    /* renamed from: a */
    private int f5029a;

    /* renamed from: b */
    private int f5030b;

    /* renamed from: d */
    private float[] f5032d;

    /* renamed from: e */
    private float[] f5033e;

    /* renamed from: f */
    private float[] f5034f;

    /* renamed from: g */
    private float[] f5035g;

    /* renamed from: h */
    private int[] f5036h;

    /* renamed from: i */
    private int[] f5037i;

    /* renamed from: j */
    private int[] f5038j;

    /* renamed from: k */
    private int f5039k;

    /* renamed from: l */
    private VelocityTracker f5040l;

    /* renamed from: m */
    private float f5041m;

    /* renamed from: n */
    private float f5042n;

    /* renamed from: o */
    private int f5043o;

    /* renamed from: p */
    private int f5044p;

    /* renamed from: q */
    private OverScroller f5045q;

    /* renamed from: r */
    private final c f5046r;

    /* renamed from: s */
    private View f5047s;

    /* renamed from: t */
    private boolean f5048t;

    /* renamed from: u */
    private final ViewGroup f5049u;

    /* renamed from: c */
    private int f5031c = -1;

    /* renamed from: v */
    private final Runnable f5050v = new b();

    /* renamed from: c0.c$a */
    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: c0.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1336c.this.m6069E(0);
        }
    }

    /* renamed from: c0.c$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo6083a(View view, int i10, int i11);

        /* renamed from: b */
        public abstract int mo6084b(View view, int i10, int i11);

        /* renamed from: c */
        public int m6085c(int i10) {
            return i10;
        }

        /* renamed from: d */
        public int mo6086d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo6087e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m6088f(int i10, int i11) {
        }

        /* renamed from: g */
        public boolean m6089g(int i10) {
            return false;
        }

        /* renamed from: h */
        public void m6090h(int i10, int i11) {
        }

        /* renamed from: i */
        public void mo6091i(View view, int i10) {
        }

        /* renamed from: j */
        public abstract void mo6092j(int i10);

        /* renamed from: k */
        public abstract void mo6093k(View view, int i10, int i11, int i12, int i13);

        /* renamed from: l */
        public abstract void mo6094l(View view, float f10, float f11);

        /* renamed from: m */
        public abstract boolean mo6095m(View view, int i10);
    }

    private C1336c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup != null) {
            if (cVar != null) {
                this.f5049u = viewGroup;
                this.f5046r = cVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f5043o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f5030b = viewConfiguration.getScaledTouchSlop();
                this.f5041m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f5042n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f5045q = new OverScroller(context, f5028w);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    /* renamed from: A */
    private void m6048A() {
        this.f5040l.computeCurrentVelocity(1000, this.f5041m);
        m6062n(m6054e(this.f5040l.getXVelocity(this.f5031c), this.f5042n, this.f5041m), m6054e(this.f5040l.getYVelocity(this.f5031c), this.f5042n, this.f5041m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [c0.c$c] */
    /* renamed from: B */
    private void m6049B(float f10, float f11, int i10) {
        boolean m6052c = m6052c(f10, f11, i10, 1);
        boolean z10 = m6052c;
        if (m6052c(f11, f10, i10, 4)) {
            z10 = (m6052c ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (m6052c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        Object r02 = z11;
        if (m6052c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f5037i;
            iArr[i10] = iArr[i10] | r02;
            this.f5046r.m6088f(r02, i10);
        }
    }

    /* renamed from: C */
    private void m6050C(float f10, float f11, int i10) {
        m6065q(i10);
        float[] fArr = this.f5032d;
        this.f5034f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f5033e;
        this.f5035g[i10] = f11;
        fArr2[i10] = f11;
        this.f5036h[i10] = m6067t((int) f10, (int) f11);
        this.f5039k |= 1 << i10;
    }

    /* renamed from: D */
    private void m6051D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m6068x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f5034f[pointerId] = x10;
                this.f5035g[pointerId] = y10;
            }
        }
    }

    /* renamed from: c */
    private boolean m6052c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f5036h[i10] & i11) != i11 || (this.f5044p & i11) == 0 || (this.f5038j[i10] & i11) == i11 || (this.f5037i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f5030b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f5046r.m6089g(i11)) {
            int[] iArr = this.f5038j;
            iArr[i10] = iArr[i10] | i11;
            return false;
        }
        if ((this.f5037i[i10] & i11) != 0 || abs <= this.f5030b) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m6053d(View view, float f10, float f11) {
        boolean z10 = false;
        boolean z11 = false;
        if (view == null) {
            return false;
        }
        if (this.f5046r.mo6086d(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f5046r.mo6087e(view) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f5030b;
            if (f12 <= i10 * i10) {
                return false;
            }
            return true;
        }
        if (z10) {
            if (Math.abs(f10) <= this.f5030b) {
                return false;
            }
            return true;
        }
        if (!z11 || Math.abs(f11) <= this.f5030b) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private float m6054e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        if (abs > f12) {
            if (f10 <= 0.0f) {
                return -f12;
            }
            return f12;
        }
        return f10;
    }

    /* renamed from: f */
    private int m6055f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        if (abs > i12) {
            if (i10 <= 0) {
                return -i12;
            }
            return i12;
        }
        return i10;
    }

    /* renamed from: g */
    private void m6056g() {
        float[] fArr = this.f5032d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f5033e, 0.0f);
        Arrays.fill(this.f5034f, 0.0f);
        Arrays.fill(this.f5035g, 0.0f);
        Arrays.fill(this.f5036h, 0);
        Arrays.fill(this.f5037i, 0);
        Arrays.fill(this.f5038j, 0);
        this.f5039k = 0;
    }

    /* renamed from: h */
    private void m6057h(int i10) {
        if (this.f5032d != null && m6080w(i10)) {
            this.f5032d[i10] = 0.0f;
            this.f5033e[i10] = 0.0f;
            this.f5034f[i10] = 0.0f;
            this.f5035g[i10] = 0.0f;
            this.f5036h[i10] = 0;
            this.f5037i[i10] = 0;
            this.f5038j[i10] = 0;
            this.f5039k = ((1 << i10) ^ (-1)) & this.f5039k;
        }
    }

    /* renamed from: i */
    private int m6058i(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f5049u.getWidth();
        float f10 = width / 2;
        float m6063o = f10 + (m6063o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m6063o / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, IjkMediaCodecInfo.RANK_LAST_CHANCE);
    }

    /* renamed from: j */
    private int m6059j(View view, int i10, int i11, int i12, int i13) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int m6055f = m6055f(i12, (int) this.f5042n, (int) this.f5041m);
        int m6055f2 = m6055f(i13, (int) this.f5042n, (int) this.f5041m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(m6055f);
        int abs4 = Math.abs(m6055f2);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (m6055f != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (m6055f2 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((m6058i(i10, m6055f, this.f5046r.mo6086d(view)) * f14) + (m6058i(i11, m6055f2, this.f5046r.mo6087e(view)) * (f12 / f13)));
    }

    /* renamed from: l */
    public static C1336c m6060l(ViewGroup viewGroup, float f10, c cVar) {
        C1336c m6061m = m6061m(viewGroup, cVar);
        m6061m.f5030b = (int) (m6061m.f5030b * (1.0f / f10));
        return m6061m;
    }

    /* renamed from: m */
    public static C1336c m6061m(ViewGroup viewGroup, c cVar) {
        return new C1336c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m6062n(float f10, float f11) {
        this.f5048t = true;
        this.f5046r.mo6094l(this.f5047s, f10, f11);
        this.f5048t = false;
        if (this.f5029a == 1) {
            m6069E(0);
        }
    }

    /* renamed from: o */
    private float m6063o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    private void m6064p(int i10, int i11, int i12, int i13) {
        int left = this.f5047s.getLeft();
        int top = this.f5047s.getTop();
        if (i12 != 0) {
            i10 = this.f5046r.mo6083a(this.f5047s, i10, i12);
            AbstractC0616q0.m2606X(this.f5047s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f5046r.mo6084b(this.f5047s, i11, i13);
            AbstractC0616q0.m2607Y(this.f5047s, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f5046r.mo6093k(this.f5047s, i14, i15, i14 - left, i15 - top);
        }
    }

    /* renamed from: q */
    private void m6065q(int i10) {
        float[] fArr = this.f5032d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5033e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5034f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5035g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5036h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5037i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5038j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5032d = fArr2;
            this.f5033e = fArr3;
            this.f5034f = fArr4;
            this.f5035g = fArr5;
            this.f5036h = iArr;
            this.f5037i = iArr2;
            this.f5038j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m6066s(int i10, int i11, int i12, int i13) {
        int left = this.f5047s.getLeft();
        int top = this.f5047s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f5045q.abortAnimation();
            m6069E(0);
            return false;
        }
        this.f5045q.startScroll(left, top, i14, i15, m6059j(this.f5047s, i14, i15, i12, i13));
        m6069E(2);
        return true;
    }

    /* renamed from: t */
    private int m6067t(int i10, int i11) {
        int i12 = 0;
        if (i10 < this.f5049u.getLeft() + this.f5043o) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i11 < this.f5049u.getTop() + this.f5043o) {
            i12 |= 4;
        }
        if (i10 > this.f5049u.getRight() - this.f5043o) {
            i12 |= 2;
        }
        if (i11 > this.f5049u.getBottom() - this.f5043o) {
            return i12 | 8;
        }
        return i12;
    }

    /* renamed from: x */
    private boolean m6068x(int i10) {
        if (!m6080w(i10)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    /* renamed from: E */
    void m6069E(int i10) {
        this.f5049u.removeCallbacks(this.f5050v);
        if (this.f5029a != i10) {
            this.f5029a = i10;
            this.f5046r.mo6092j(i10);
            if (this.f5029a == 0) {
                this.f5047s = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m6070F(int i10, int i11) {
        if (this.f5048t) {
            return m6066s(i10, i11, (int) this.f5040l.getXVelocity(this.f5031c), (int) this.f5040l.getYVelocity(this.f5031c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m6071G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c0.C1336c.m6071G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m6072H(View view, int i10, int i11) {
        this.f5047s = view;
        this.f5031c = -1;
        boolean m6066s = m6066s(i10, i11, 0, 0);
        if (!m6066s && this.f5029a == 0 && this.f5047s != null) {
            this.f5047s = null;
        }
        return m6066s;
    }

    /* renamed from: I */
    boolean m6073I(View view, int i10) {
        if (view == this.f5047s && this.f5031c == i10) {
            return true;
        }
        if (view != null && this.f5046r.mo6095m(view, i10)) {
            this.f5031c = i10;
            m6075b(view, i10);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m6074a() {
        this.f5031c = -1;
        m6056g();
        VelocityTracker velocityTracker = this.f5040l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5040l = null;
        }
    }

    /* renamed from: b */
    public void m6075b(View view, int i10) {
        if (view.getParent() == this.f5049u) {
            this.f5047s = view;
            this.f5031c = i10;
            this.f5046r.mo6091i(view, i10);
            m6069E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5049u + ")");
    }

    /* renamed from: k */
    public boolean m6076k(boolean z10) {
        if (this.f5029a == 2) {
            boolean computeScrollOffset = this.f5045q.computeScrollOffset();
            int currX = this.f5045q.getCurrX();
            int currY = this.f5045q.getCurrY();
            int left = currX - this.f5047s.getLeft();
            int top = currY - this.f5047s.getTop();
            if (left != 0) {
                AbstractC0616q0.m2606X(this.f5047s, left);
            }
            if (top != 0) {
                AbstractC0616q0.m2607Y(this.f5047s, top);
            }
            if (left != 0 || top != 0) {
                this.f5046r.mo6093k(this.f5047s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f5045q.getFinalX() && currY == this.f5045q.getFinalY()) {
                this.f5045q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f5049u.post(this.f5050v);
                } else {
                    m6069E(0);
                }
            }
        }
        if (this.f5029a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public View m6077r(int i10, int i11) {
        for (int childCount = this.f5049u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5049u.getChildAt(this.f5046r.m6085c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int m6078u() {
        return this.f5030b;
    }

    /* renamed from: v */
    public boolean m6079v(int i10, int i11) {
        return m6081y(this.f5047s, i10, i11);
    }

    /* renamed from: w */
    public boolean m6080w(int i10) {
        if (((1 << i10) & this.f5039k) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean m6081y(View view, int i10, int i11) {
        if (view == null || i10 < view.getLeft() || i10 >= view.getRight() || i11 < view.getTop() || i11 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public void m6082z(MotionEvent motionEvent) {
        int i10 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m6074a();
        }
        if (this.f5040l == null) {
            this.f5040l = VelocityTracker.obtain();
        }
        this.f5040l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f5029a == 1 && pointerId == this.f5031c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f5031c) {
                                                View m6077r = m6077r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f5047s;
                                                if (m6077r == view && m6073I(view, pointerId2)) {
                                                    i10 = this.f5031c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        m6048A();
                                    }
                                }
                                m6057h(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        m6050C(x10, y10, pointerId3);
                        if (this.f5029a == 0) {
                            m6073I(m6077r((int) x10, (int) y10), pointerId3);
                            int i12 = this.f5036h[pointerId3];
                            int i13 = this.f5044p;
                            if ((i12 & i13) != 0) {
                                this.f5046r.m6090h(i12 & i13, pointerId3);
                                return;
                            }
                            return;
                        }
                        if (m6079v((int) x10, (int) y10)) {
                            m6073I(this.f5047s, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f5029a == 1) {
                        m6062n(0.0f, 0.0f);
                    }
                    m6074a();
                    return;
                }
                if (this.f5029a == 1) {
                    if (m6068x(this.f5031c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5031c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f5034f;
                        int i14 = this.f5031c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y11 - this.f5035g[i14]);
                        m6064p(this.f5047s.getLeft() + i15, this.f5047s.getTop() + i16, i15, i16);
                        m6051D(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (m6068x(pointerId4)) {
                        float x12 = motionEvent.getX(i11);
                        float y12 = motionEvent.getY(i11);
                        float f10 = x12 - this.f5032d[pointerId4];
                        float f11 = y12 - this.f5033e[pointerId4];
                        m6049B(f10, f11, pointerId4);
                        if (this.f5029a != 1) {
                            View m6077r2 = m6077r((int) x12, (int) y12);
                            if (m6053d(m6077r2, f10, f11) && m6073I(m6077r2, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                m6051D(motionEvent);
                return;
            }
            if (this.f5029a == 1) {
                m6048A();
            }
            m6074a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m6077r3 = m6077r((int) x13, (int) y13);
        m6050C(x13, y13, pointerId5);
        m6073I(m6077r3, pointerId5);
        int i17 = this.f5036h[pointerId5];
        int i18 = this.f5044p;
        if ((i17 & i18) != 0) {
            this.f5046r.m6090h(i17 & i18, pointerId5);
        }
    }
}
