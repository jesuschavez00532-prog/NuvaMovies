package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0616q0;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0658a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f2462r = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    final View f2465c;

    /* renamed from: d */
    private Runnable f2466d;

    /* renamed from: g */
    private int f2469g;

    /* renamed from: h */
    private int f2470h;

    /* renamed from: l */
    private boolean f2474l;

    /* renamed from: m */
    boolean f2475m;

    /* renamed from: n */
    boolean f2476n;

    /* renamed from: o */
    boolean f2477o;

    /* renamed from: p */
    private boolean f2478p;

    /* renamed from: q */
    private boolean f2479q;

    /* renamed from: a */
    final a f2463a = new a();

    /* renamed from: b */
    private final Interpolator f2464b = new AccelerateInterpolator();

    /* renamed from: e */
    private float[] f2467e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f2468f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    private float[] f2471i = {0.0f, 0.0f};

    /* renamed from: j */
    private float[] f2472j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2473k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f2480a;

        /* renamed from: b */
        private int f2481b;

        /* renamed from: c */
        private float f2482c;

        /* renamed from: d */
        private float f2483d;

        /* renamed from: j */
        private float f2489j;

        /* renamed from: k */
        private int f2490k;

        /* renamed from: e */
        private long f2484e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f2488i = -1;

        /* renamed from: f */
        private long f2485f = 0;

        /* renamed from: g */
        private int f2486g = 0;

        /* renamed from: h */
        private int f2487h = 0;

        a() {
        }

        /* renamed from: e */
        private float m2912e(long j10) {
            long j11 = this.f2484e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2488i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f2489j;
                return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC0658a.m2891e(((float) (j10 - j12)) / this.f2490k, 0.0f, 1.0f));
            }
            return AbstractViewOnTouchListenerC0658a.m2891e(((float) (j10 - j11)) / this.f2480a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m2913g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* renamed from: a */
        public void m2914a() {
            if (this.f2485f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m2913g = m2913g(m2912e(currentAnimationTimeMillis));
                long j10 = currentAnimationTimeMillis - this.f2485f;
                this.f2485f = currentAnimationTimeMillis;
                float f10 = ((float) j10) * m2913g;
                this.f2486g = (int) (this.f2482c * f10);
                this.f2487h = (int) (f10 * this.f2483d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m2915b() {
            return this.f2486g;
        }

        /* renamed from: c */
        public int m2916c() {
            return this.f2487h;
        }

        /* renamed from: d */
        public int m2917d() {
            float f10 = this.f2482c;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: f */
        public int m2918f() {
            float f10 = this.f2483d;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: h */
        public boolean m2919h() {
            if (this.f2488i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2488i + this.f2490k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m2920i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2490k = AbstractViewOnTouchListenerC0658a.m2892f((int) (currentAnimationTimeMillis - this.f2484e), 0, this.f2481b);
            this.f2489j = m2912e(currentAnimationTimeMillis);
            this.f2488i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m2921j(int i10) {
            this.f2481b = i10;
        }

        /* renamed from: k */
        public void m2922k(int i10) {
            this.f2480a = i10;
        }

        /* renamed from: l */
        public void m2923l(float f10, float f11) {
            this.f2482c = f10;
            this.f2483d = f11;
        }

        /* renamed from: m */
        public void m2924m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2484e = currentAnimationTimeMillis;
            this.f2488i = -1L;
            this.f2485f = currentAnimationTimeMillis;
            this.f2489j = 0.5f;
            this.f2486g = 0;
            this.f2487h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0658a abstractViewOnTouchListenerC0658a = AbstractViewOnTouchListenerC0658a.this;
            if (!abstractViewOnTouchListenerC0658a.f2477o) {
                return;
            }
            if (abstractViewOnTouchListenerC0658a.f2475m) {
                abstractViewOnTouchListenerC0658a.f2475m = false;
                abstractViewOnTouchListenerC0658a.f2463a.m2924m();
            }
            a aVar = AbstractViewOnTouchListenerC0658a.this.f2463a;
            if (!aVar.m2919h() && AbstractViewOnTouchListenerC0658a.this.m2911u()) {
                AbstractViewOnTouchListenerC0658a abstractViewOnTouchListenerC0658a2 = AbstractViewOnTouchListenerC0658a.this;
                if (abstractViewOnTouchListenerC0658a2.f2476n) {
                    abstractViewOnTouchListenerC0658a2.f2476n = false;
                    abstractViewOnTouchListenerC0658a2.m2899c();
                }
                aVar.m2914a();
                AbstractViewOnTouchListenerC0658a.this.mo2900j(aVar.m2915b(), aVar.m2916c());
                AbstractC0616q0.m2620f0(AbstractViewOnTouchListenerC0658a.this.f2465c, this);
                return;
            }
            AbstractViewOnTouchListenerC0658a.this.f2477o = false;
        }
    }

    public AbstractViewOnTouchListenerC0658a(View view) {
        this.f2465c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        m2905o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        m2906p(f12, f12);
        m2902l(1);
        m2904n(Float.MAX_VALUE, Float.MAX_VALUE);
        m2909s(0.2f, 0.2f);
        m2910t(1.0f, 1.0f);
        m2901k(f2462r);
        m2908r(500);
        m2907q(500);
    }

    /* renamed from: d */
    private float m2890d(int i10, float f10, float f11, float f12) {
        float m2894h = m2894h(this.f2467e[i10], f11, this.f2468f[i10], f10);
        if (m2894h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f2471i[i10];
        float f14 = this.f2472j[i10];
        float f15 = this.f2473k[i10];
        float f16 = f13 * f12;
        if (m2894h > 0.0f) {
            return m2891e(m2894h * f16, f14, f15);
        }
        return -m2891e((-m2894h) * f16, f14, f15);
    }

    /* renamed from: e */
    static float m2891e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* renamed from: f */
    static int m2892f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: g */
    private float m2893g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2469g;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        } else if (f10 < f11) {
            if (f10 >= 0.0f) {
                return 1.0f - (f10 / f11);
            }
            if (this.f2477o && i10 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m2894h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float m2891e = m2891e(f10 * f11, 0.0f, f12);
        float m2893g = m2893g(f11 - f13, m2891e) - m2893g(f13, m2891e);
        if (m2893g < 0.0f) {
            interpolation = -this.f2464b.getInterpolation(-m2893g);
        } else {
            if (m2893g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2464b.getInterpolation(m2893g);
        }
        return m2891e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m2895i() {
        if (this.f2475m) {
            this.f2477o = false;
        } else {
            this.f2463a.m2920i();
        }
    }

    /* renamed from: v */
    private void m2896v() {
        int i10;
        if (this.f2466d == null) {
            this.f2466d = new b();
        }
        this.f2477o = true;
        this.f2475m = true;
        if (!this.f2474l && (i10 = this.f2470h) > 0) {
            AbstractC0616q0.m2622g0(this.f2465c, this.f2466d, i10);
        } else {
            this.f2466d.run();
        }
        this.f2474l = true;
    }

    /* renamed from: a */
    public abstract boolean mo2897a(int i10);

    /* renamed from: b */
    public abstract boolean mo2898b(int i10);

    /* renamed from: c */
    void m2899c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2465c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo2900j(int i10, int i11);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0658a m2901k(int i10) {
        this.f2470h = i10;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC0658a m2902l(int i10) {
        this.f2469g = i10;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC0658a m2903m(boolean z10) {
        if (this.f2478p && !z10) {
            m2895i();
        }
        this.f2478p = z10;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC0658a m2904n(float f10, float f11) {
        float[] fArr = this.f2468f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC0658a m2905o(float f10, float f11) {
        float[] fArr = this.f2473k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2478p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m2895i()
            goto L58
        L1a:
            r5.f2476n = r2
            r5.f2474l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2465c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2890d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2465c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2890d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2463a
            r7.m2923l(r0, r6)
            boolean r6 = r5.f2477o
            if (r6 != 0) goto L58
            boolean r6 = r5.m2911u()
            if (r6 == 0) goto L58
            r5.m2896v()
        L58:
            boolean r6 = r5.f2479q
            if (r6 == 0) goto L61
            boolean r6 = r5.f2477o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0658a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC0658a m2906p(float f10, float f11) {
        float[] fArr = this.f2472j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC0658a m2907q(int i10) {
        this.f2463a.m2921j(i10);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC0658a m2908r(int i10) {
        this.f2463a.m2922k(i10);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC0658a m2909s(float f10, float f11) {
        float[] fArr = this.f2467e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC0658a m2910t(float f10, float f11) {
        float[] fArr = this.f2471i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m2911u() {
        a aVar = this.f2463a;
        int m2918f = aVar.m2918f();
        int m2917d = aVar.m2917d();
        if ((m2918f != 0 && mo2898b(m2918f)) || (m2917d != 0 && mo2897a(m2917d))) {
            return true;
        }
        return false;
    }
}
