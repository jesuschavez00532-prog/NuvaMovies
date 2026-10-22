package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC0616q0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public class C0818e extends RecyclerView.AbstractC0796o implements RecyclerView.InterfaceC0801t {

    /* renamed from: D */
    private static final int[] f3414D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f3415E = new int[0];

    /* renamed from: A */
    int f3416A;

    /* renamed from: B */
    private final Runnable f3417B;

    /* renamed from: C */
    private final RecyclerView.AbstractC0802u f3418C;

    /* renamed from: a */
    private final int f3419a;

    /* renamed from: b */
    private final int f3420b;

    /* renamed from: c */
    final StateListDrawable f3421c;

    /* renamed from: d */
    final Drawable f3422d;

    /* renamed from: e */
    private final int f3423e;

    /* renamed from: f */
    private final int f3424f;

    /* renamed from: g */
    private final StateListDrawable f3425g;

    /* renamed from: h */
    private final Drawable f3426h;

    /* renamed from: i */
    private final int f3427i;

    /* renamed from: j */
    private final int f3428j;

    /* renamed from: k */
    int f3429k;

    /* renamed from: l */
    int f3430l;

    /* renamed from: m */
    float f3431m;

    /* renamed from: n */
    int f3432n;

    /* renamed from: o */
    int f3433o;

    /* renamed from: p */
    float f3434p;

    /* renamed from: s */
    private RecyclerView f3437s;

    /* renamed from: z */
    final ValueAnimator f3444z;

    /* renamed from: q */
    private int f3435q = 0;

    /* renamed from: r */
    private int f3436r = 0;

    /* renamed from: t */
    private boolean f3438t = false;

    /* renamed from: u */
    private boolean f3439u = false;

    /* renamed from: v */
    private int f3440v = 0;

    /* renamed from: w */
    private int f3441w = 0;

    /* renamed from: x */
    private final int[] f3442x = new int[2];

    /* renamed from: y */
    private final int[] f3443y = new int[2];

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0818e.this.m4185k(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    class b extends RecyclerView.AbstractC0802u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            C0818e.this.m4191v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3447a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3447a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3447a) {
                this.f3447a = false;
                return;
            }
            if (((Float) C0818e.this.f3444z.getAnimatedValue()).floatValue() == 0.0f) {
                C0818e c0818e = C0818e.this;
                c0818e.f3416A = 0;
                c0818e.m4189s(0);
            } else {
                C0818e c0818e2 = C0818e.this;
                c0818e2.f3416A = 2;
                c0818e2.m4188p();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0818e.this.f3421c.setAlpha(floatValue);
            C0818e.this.f3422d.setAlpha(floatValue);
            C0818e.this.m4188p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0818e(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3444z = ofFloat;
        this.f3416A = 0;
        this.f3417B = new a();
        this.f3418C = new b();
        this.f3421c = stateListDrawable;
        this.f3422d = drawable;
        this.f3425g = stateListDrawable2;
        this.f3426h = drawable2;
        this.f3423e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3424f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3427i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3428j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3419a = i11;
        this.f3420b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m4184d(recyclerView);
    }

    /* renamed from: e */
    private void m4172e() {
        this.f3437s.removeCallbacks(this.f3417B);
    }

    /* renamed from: f */
    private void m4173f() {
        this.f3437s.removeItemDecoration(this);
        this.f3437s.removeOnItemTouchListener(this);
        this.f3437s.removeOnScrollListener(this.f3418C);
        m4172e();
    }

    /* renamed from: g */
    private void m4174g(Canvas canvas) {
        int i10 = this.f3436r;
        int i11 = this.f3427i;
        int i12 = this.f3433o;
        int i13 = this.f3432n;
        this.f3425g.setBounds(0, 0, i13, i11);
        this.f3426h.setBounds(0, 0, this.f3435q, this.f3428j);
        canvas.translate(0.0f, i10 - i11);
        this.f3426h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f3425g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: h */
    private void m4175h(Canvas canvas) {
        int i10 = this.f3435q;
        int i11 = this.f3423e;
        int i12 = i10 - i11;
        int i13 = this.f3430l;
        int i14 = this.f3429k;
        int i15 = i13 - (i14 / 2);
        this.f3421c.setBounds(0, 0, i11, i14);
        this.f3422d.setBounds(0, 0, this.f3424f, this.f3436r);
        if (m4179m()) {
            this.f3422d.draw(canvas);
            canvas.translate(this.f3423e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f3421c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f3423e, -i15);
            return;
        }
        canvas.translate(i12, 0.0f);
        this.f3422d.draw(canvas);
        canvas.translate(0.0f, i15);
        this.f3421c.draw(canvas);
        canvas.translate(-i12, -i15);
    }

    /* renamed from: i */
    private int[] m4176i() {
        int[] iArr = this.f3443y;
        int i10 = this.f3420b;
        iArr[0] = i10;
        iArr[1] = this.f3435q - i10;
        return iArr;
    }

    /* renamed from: j */
    private int[] m4177j() {
        int[] iArr = this.f3442x;
        int i10 = this.f3420b;
        iArr[0] = i10;
        iArr[1] = this.f3436r - i10;
        return iArr;
    }

    /* renamed from: l */
    private void m4178l(float f10) {
        int[] m4176i = m4176i();
        float max = Math.max(m4176i[0], Math.min(m4176i[1], f10));
        if (Math.abs(this.f3433o - max) < 2.0f) {
            return;
        }
        int m4181r = m4181r(this.f3434p, max, m4176i, this.f3437s.computeHorizontalScrollRange(), this.f3437s.computeHorizontalScrollOffset(), this.f3435q);
        if (m4181r != 0) {
            this.f3437s.scrollBy(m4181r, 0);
        }
        this.f3434p = max;
    }

    /* renamed from: m */
    private boolean m4179m() {
        if (AbstractC0616q0.m2579B(this.f3437s) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private void m4180q(int i10) {
        m4172e();
        this.f3437s.postDelayed(this.f3417B, i10);
    }

    /* renamed from: r */
    private int m4181r(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    /* renamed from: t */
    private void m4182t() {
        this.f3437s.addItemDecoration(this);
        this.f3437s.addOnItemTouchListener(this);
        this.f3437s.addOnScrollListener(this.f3418C);
    }

    /* renamed from: w */
    private void m4183w(float f10) {
        int[] m4177j = m4177j();
        float max = Math.max(m4177j[0], Math.min(m4177j[1], f10));
        if (Math.abs(this.f3430l - max) < 2.0f) {
            return;
        }
        int m4181r = m4181r(this.f3431m, max, m4177j, this.f3437s.computeVerticalScrollRange(), this.f3437s.computeVerticalScrollOffset(), this.f3436r);
        if (m4181r != 0) {
            this.f3437s.scrollBy(0, m4181r);
        }
        this.f3431m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0801t
    /* renamed from: a */
    public void mo3931a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3440v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m4187o = m4187o(motionEvent.getX(), motionEvent.getY());
            boolean m4186n = m4186n(motionEvent.getX(), motionEvent.getY());
            if (m4187o || m4186n) {
                if (m4186n) {
                    this.f3441w = 1;
                    this.f3434p = (int) motionEvent.getX();
                } else if (m4187o) {
                    this.f3441w = 2;
                    this.f3431m = (int) motionEvent.getY();
                }
                m4189s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3440v == 2) {
            this.f3431m = 0.0f;
            this.f3434p = 0.0f;
            m4189s(1);
            this.f3441w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3440v == 2) {
            m4190u();
            if (this.f3441w == 1) {
                m4178l(motionEvent.getX());
            }
            if (this.f3441w == 2) {
                m4183w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0801t
    /* renamed from: b */
    public boolean mo3932b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3440v;
        if (i10 == 1) {
            boolean m4187o = m4187o(motionEvent.getX(), motionEvent.getY());
            boolean m4186n = m4186n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m4187o && !m4186n) {
                return false;
            }
            if (m4186n) {
                this.f3441w = 1;
                this.f3434p = (int) motionEvent.getX();
            } else if (m4187o) {
                this.f3441w = 2;
                this.f3431m = (int) motionEvent.getY();
            }
            m4189s(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0801t
    /* renamed from: c */
    public void mo3933c(boolean z10) {
    }

    /* renamed from: d */
    public void m4184d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3437s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4173f();
        }
        this.f3437s = recyclerView;
        if (recyclerView != null) {
            m4182t();
        }
    }

    /* renamed from: k */
    void m4185k(int i10) {
        int i11 = this.f3416A;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
        } else {
            this.f3444z.cancel();
        }
        this.f3416A = 3;
        ValueAnimator valueAnimator = this.f3444z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3444z.setDuration(i10);
        this.f3444z.start();
    }

    /* renamed from: n */
    boolean m4186n(float f10, float f11) {
        if (f11 >= this.f3436r - this.f3427i) {
            int i10 = this.f3433o;
            int i11 = this.f3432n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    boolean m4187o(float f10, float f11) {
        if (!m4179m() ? f10 >= this.f3435q - this.f3423e : f10 <= this.f3423e) {
            int i10 = this.f3430l;
            int i11 = this.f3429k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0) {
        if (this.f3435q == this.f3437s.getWidth() && this.f3436r == this.f3437s.getHeight()) {
            if (this.f3416A != 0) {
                if (this.f3438t) {
                    m4175h(canvas);
                }
                if (this.f3439u) {
                    m4174g(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f3435q = this.f3437s.getWidth();
        this.f3436r = this.f3437s.getHeight();
        m4189s(0);
    }

    /* renamed from: p */
    void m4188p() {
        this.f3437s.invalidate();
    }

    /* renamed from: s */
    void m4189s(int i10) {
        if (i10 == 2 && this.f3440v != 2) {
            this.f3421c.setState(f3414D);
            m4172e();
        }
        if (i10 == 0) {
            m4188p();
        } else {
            m4190u();
        }
        if (this.f3440v == 2 && i10 != 2) {
            this.f3421c.setState(f3415E);
            m4180q(1200);
        } else if (i10 == 1) {
            m4180q(1500);
        }
        this.f3440v = i10;
    }

    /* renamed from: u */
    public void m4190u() {
        int i10 = this.f3416A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3444z.cancel();
            } else {
                return;
            }
        }
        this.f3416A = 1;
        ValueAnimator valueAnimator = this.f3444z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3444z.setDuration(500L);
        this.f3444z.setStartDelay(0L);
        this.f3444z.start();
    }

    /* renamed from: v */
    void m4191v(int i10, int i11) {
        boolean z10;
        boolean z11;
        int computeVerticalScrollRange = this.f3437s.computeVerticalScrollRange();
        int i12 = this.f3436r;
        if (computeVerticalScrollRange - i12 > 0 && i12 >= this.f3419a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3438t = z10;
        int computeHorizontalScrollRange = this.f3437s.computeHorizontalScrollRange();
        int i13 = this.f3435q;
        if (computeHorizontalScrollRange - i13 > 0 && i13 >= this.f3419a) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3439u = z11;
        boolean z12 = this.f3438t;
        if (!z12 && !z11) {
            if (this.f3440v != 0) {
                m4189s(0);
                return;
            }
            return;
        }
        if (z12) {
            float f10 = i12;
            this.f3430l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f3429k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f3439u) {
            float f11 = i13;
            this.f3433o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f3432n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f3440v;
        if (i14 == 0 || i14 == 1) {
            m4189s(1);
        }
    }
}
