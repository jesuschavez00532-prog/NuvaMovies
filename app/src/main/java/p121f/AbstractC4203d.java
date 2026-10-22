package p121f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p290q.AbstractC6306k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f.d */
/* loaded from: classes.dex */
public abstract class AbstractC4203d extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private d f18403a;

    /* renamed from: b */
    private Rect f18404b;

    /* renamed from: c */
    private Drawable f18405c;

    /* renamed from: d */
    private Drawable f18406d;

    /* renamed from: f */
    private boolean f18408f;

    /* renamed from: h */
    private boolean f18410h;

    /* renamed from: i */
    private Runnable f18411i;

    /* renamed from: j */
    private long f18412j;

    /* renamed from: k */
    private long f18413k;

    /* renamed from: l */
    private c f18414l;

    /* renamed from: e */
    private int f18407e = 255;

    /* renamed from: g */
    private int f18409g = -1;

    /* renamed from: f.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4203d.this.m17542a(true);
            AbstractC4203d.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.d$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static boolean m17546a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m17547b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m17548c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.d$c */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f18416a;

        c() {
        }

        /* renamed from: a */
        public Drawable.Callback m17549a() {
            Drawable.Callback callback = this.f18416a;
            this.f18416a = null;
            return callback;
        }

        /* renamed from: b */
        public c m17550b(Drawable.Callback callback) {
            this.f18416a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f18416a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f18416a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.d$d */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {

        /* renamed from: A */
        int f18417A;

        /* renamed from: B */
        int f18418B;

        /* renamed from: C */
        boolean f18419C;

        /* renamed from: D */
        ColorFilter f18420D;

        /* renamed from: E */
        boolean f18421E;

        /* renamed from: F */
        ColorStateList f18422F;

        /* renamed from: G */
        PorterDuff.Mode f18423G;

        /* renamed from: H */
        boolean f18424H;

        /* renamed from: I */
        boolean f18425I;

        /* renamed from: a */
        final AbstractC4203d f18426a;

        /* renamed from: b */
        Resources f18427b;

        /* renamed from: c */
        int f18428c;

        /* renamed from: d */
        int f18429d;

        /* renamed from: e */
        int f18430e;

        /* renamed from: f */
        SparseArray f18431f;

        /* renamed from: g */
        Drawable[] f18432g;

        /* renamed from: h */
        int f18433h;

        /* renamed from: i */
        boolean f18434i;

        /* renamed from: j */
        boolean f18435j;

        /* renamed from: k */
        Rect f18436k;

        /* renamed from: l */
        boolean f18437l;

        /* renamed from: m */
        boolean f18438m;

        /* renamed from: n */
        int f18439n;

        /* renamed from: o */
        int f18440o;

        /* renamed from: p */
        int f18441p;

        /* renamed from: q */
        int f18442q;

        /* renamed from: r */
        boolean f18443r;

        /* renamed from: s */
        int f18444s;

        /* renamed from: t */
        boolean f18445t;

        /* renamed from: u */
        boolean f18446u;

        /* renamed from: v */
        boolean f18447v;

        /* renamed from: w */
        boolean f18448w;

        /* renamed from: x */
        boolean f18449x;

        /* renamed from: y */
        boolean f18450y;

        /* renamed from: z */
        int f18451z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, AbstractC4203d abstractC4203d, Resources resources) {
            Resources resources2;
            int i10;
            this.f18434i = false;
            this.f18437l = false;
            this.f18449x = true;
            this.f18417A = 0;
            this.f18418B = 0;
            this.f18426a = abstractC4203d;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f18427b;
            } else {
                resources2 = null;
            }
            this.f18427b = resources2;
            if (dVar != null) {
                i10 = dVar.f18428c;
            } else {
                i10 = 0;
            }
            int m17541f = AbstractC4203d.m17541f(resources, i10);
            this.f18428c = m17541f;
            if (dVar != null) {
                this.f18429d = dVar.f18429d;
                this.f18430e = dVar.f18430e;
                this.f18447v = true;
                this.f18448w = true;
                this.f18434i = dVar.f18434i;
                this.f18437l = dVar.f18437l;
                this.f18449x = dVar.f18449x;
                this.f18450y = dVar.f18450y;
                this.f18451z = dVar.f18451z;
                this.f18417A = dVar.f18417A;
                this.f18418B = dVar.f18418B;
                this.f18419C = dVar.f18419C;
                this.f18420D = dVar.f18420D;
                this.f18421E = dVar.f18421E;
                this.f18422F = dVar.f18422F;
                this.f18423G = dVar.f18423G;
                this.f18424H = dVar.f18424H;
                this.f18425I = dVar.f18425I;
                if (dVar.f18428c == m17541f) {
                    if (dVar.f18435j) {
                        this.f18436k = dVar.f18436k != null ? new Rect(dVar.f18436k) : null;
                        this.f18435j = true;
                    }
                    if (dVar.f18438m) {
                        this.f18439n = dVar.f18439n;
                        this.f18440o = dVar.f18440o;
                        this.f18441p = dVar.f18441p;
                        this.f18442q = dVar.f18442q;
                        this.f18438m = true;
                    }
                }
                if (dVar.f18443r) {
                    this.f18444s = dVar.f18444s;
                    this.f18443r = true;
                }
                if (dVar.f18445t) {
                    this.f18446u = dVar.f18446u;
                    this.f18445t = true;
                }
                Drawable[] drawableArr = dVar.f18432g;
                this.f18432g = new Drawable[drawableArr.length];
                this.f18433h = dVar.f18433h;
                SparseArray sparseArray = dVar.f18431f;
                if (sparseArray != null) {
                    this.f18431f = sparseArray.clone();
                } else {
                    this.f18431f = new SparseArray(this.f18433h);
                }
                int i11 = this.f18433h;
                for (int i12 = 0; i12 < i11; i12++) {
                    Drawable drawable = drawableArr[i12];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f18431f.put(i12, constantState);
                        } else {
                            this.f18432g[i12] = drawableArr[i12];
                        }
                    }
                }
                return;
            }
            this.f18432g = new Drawable[10];
            this.f18433h = 0;
        }

        /* renamed from: e */
        private void m17551e() {
            SparseArray sparseArray = this.f18431f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f18432g[this.f18431f.keyAt(i10)] = m17552s(((Drawable.ConstantState) this.f18431f.valueAt(i10)).newDrawable(this.f18427b));
                }
                this.f18431f = null;
            }
        }

        /* renamed from: s */
        private Drawable m17552s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC6306k.m25067m(drawable, this.f18451z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f18426a);
            return mutate;
        }

        /* renamed from: a */
        public final int m17553a(Drawable drawable) {
            int i10 = this.f18433h;
            if (i10 >= this.f18432g.length) {
                mo17566o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f18426a);
            this.f18432g[i10] = drawable;
            this.f18433h++;
            this.f18430e = drawable.getChangingConfigurations() | this.f18430e;
            m17567p();
            this.f18436k = null;
            this.f18435j = false;
            this.f18438m = false;
            this.f18447v = false;
            return i10;
        }

        /* renamed from: b */
        final void m17554b(Resources.Theme theme) {
            if (theme != null) {
                m17551e();
                int i10 = this.f18433h;
                Drawable[] drawableArr = this.f18432g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && AbstractC6306k.m25056b(drawable)) {
                        AbstractC6306k.m25055a(drawableArr[i11], theme);
                        this.f18430e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                m17574y(b.m17548c(theme));
            }
        }

        /* renamed from: c */
        public boolean m17555c() {
            if (this.f18447v) {
                return this.f18448w;
            }
            m17551e();
            this.f18447v = true;
            int i10 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f18448w = false;
                    return false;
                }
            }
            this.f18448w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (AbstractC6306k.m25056b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18431f.get(i11);
                    if (constantState != null && b.m17546a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m17556d() {
            this.f18438m = true;
            m17551e();
            int i10 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            this.f18440o = -1;
            this.f18439n = -1;
            this.f18442q = 0;
            this.f18441p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f18439n) {
                    this.f18439n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f18440o) {
                    this.f18440o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f18441p) {
                    this.f18441p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f18442q) {
                    this.f18442q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m17557f() {
            return this.f18432g.length;
        }

        /* renamed from: g */
        public final Drawable m17558g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f18432g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f18431f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable m17552s = m17552s(((Drawable.ConstantState) this.f18431f.valueAt(indexOfKey)).newDrawable(this.f18427b));
            this.f18432g[i10] = m17552s;
            this.f18431f.removeAt(indexOfKey);
            if (this.f18431f.size() == 0) {
                this.f18431f = null;
            }
            return m17552s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f18429d | this.f18430e;
        }

        /* renamed from: h */
        public final int m17559h() {
            return this.f18433h;
        }

        /* renamed from: i */
        public final int m17560i() {
            if (!this.f18438m) {
                m17556d();
            }
            return this.f18440o;
        }

        /* renamed from: j */
        public final int m17561j() {
            if (!this.f18438m) {
                m17556d();
            }
            return this.f18442q;
        }

        /* renamed from: k */
        public final int m17562k() {
            if (!this.f18438m) {
                m17556d();
            }
            return this.f18441p;
        }

        /* renamed from: l */
        public final Rect m17563l() {
            Rect rect = null;
            if (this.f18434i) {
                return null;
            }
            Rect rect2 = this.f18436k;
            if (rect2 == null && !this.f18435j) {
                m17551e();
                Rect rect3 = new Rect();
                int i10 = this.f18433h;
                Drawable[] drawableArr = this.f18432g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect3.left;
                        if (i12 > rect.left) {
                            rect.left = i12;
                        }
                        int i13 = rect3.top;
                        if (i13 > rect.top) {
                            rect.top = i13;
                        }
                        int i14 = rect3.right;
                        if (i14 > rect.right) {
                            rect.right = i14;
                        }
                        int i15 = rect3.bottom;
                        if (i15 > rect.bottom) {
                            rect.bottom = i15;
                        }
                    }
                }
                this.f18435j = true;
                this.f18436k = rect;
                return rect;
            }
            return rect2;
        }

        /* renamed from: m */
        public final int m17564m() {
            if (!this.f18438m) {
                m17556d();
            }
            return this.f18439n;
        }

        /* renamed from: n */
        public final int m17565n() {
            int i10;
            if (this.f18443r) {
                return this.f18444s;
            }
            m17551e();
            int i11 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            } else {
                i10 = -2;
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            this.f18444s = i10;
            this.f18443r = true;
            return i10;
        }

        /* renamed from: o */
        public void mo17566o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f18432g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f18432g = drawableArr;
        }

        /* renamed from: p */
        void m17567p() {
            this.f18443r = false;
            this.f18445t = false;
        }

        /* renamed from: q */
        public final boolean m17568q() {
            return this.f18437l;
        }

        /* renamed from: r */
        abstract void mo17534r();

        /* renamed from: t */
        public final void m17569t(boolean z10) {
            this.f18437l = z10;
        }

        /* renamed from: u */
        public final void m17570u(int i10) {
            this.f18417A = i10;
        }

        /* renamed from: v */
        public final void m17571v(int i10) {
            this.f18418B = i10;
        }

        /* renamed from: w */
        final boolean m17572w(int i10, int i11) {
            boolean z10;
            int i12 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            boolean z11 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z10 = AbstractC6306k.m25067m(drawable, i10);
                    } else {
                        z10 = false;
                    }
                    if (i13 == i11) {
                        z11 = z10;
                    }
                }
            }
            this.f18451z = i10;
            return z11;
        }

        /* renamed from: x */
        public final void m17573x(boolean z10) {
            this.f18434i = z10;
        }

        /* renamed from: y */
        final void m17574y(Resources resources) {
            if (resources != null) {
                this.f18427b = resources;
                int m17541f = AbstractC4203d.m17541f(resources, this.f18428c);
                int i10 = this.f18428c;
                this.f18428c = m17541f;
                if (i10 != m17541f) {
                    this.f18438m = false;
                    this.f18435j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m17539d(Drawable drawable) {
        if (this.f18414l == null) {
            this.f18414l = new c();
        }
        drawable.setCallback(this.f18414l.m17550b(drawable.getCallback()));
        try {
            if (this.f18403a.f18417A <= 0 && this.f18408f) {
                drawable.setAlpha(this.f18407e);
            }
            d dVar = this.f18403a;
            if (dVar.f18421E) {
                drawable.setColorFilter(dVar.f18420D);
            } else {
                if (dVar.f18424H) {
                    AbstractC6306k.m25069o(drawable, dVar.f18422F);
                }
                d dVar2 = this.f18403a;
                if (dVar2.f18425I) {
                    AbstractC6306k.m25070p(drawable, dVar2.f18423G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18403a.f18449x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                AbstractC6306k.m25067m(drawable, AbstractC6306k.m25060f(this));
            }
            AbstractC6306k.m25064j(drawable, this.f18403a.f18419C);
            Rect rect = this.f18404b;
            if (i10 >= 21 && rect != null) {
                AbstractC6306k.m25066l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f18414l.m17549a());
        }
    }

    /* renamed from: e */
    private boolean m17540e() {
        if (isAutoMirrored() && AbstractC6306k.m25060f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    static int m17541f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m17542a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f18408f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f18405c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f18412j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f18407e
            r3.setAlpha(r9)
            r13.f18412j = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.d$d r9 = r13.f18403a
            int r9 = r9.f18417A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f18407e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f18412j = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f18406d
            if (r9 == 0) goto L65
            long r10 = r13.f18413k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f18406d = r0
            r13.f18413k = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.d$d r4 = r13.f18403a
            int r4 = r4.f18418B
            int r3 = r3 / r4
            int r4 = r13.f18407e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f18413k = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f18411i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121f.AbstractC4203d.m17542a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f18403a.m17554b(theme);
    }

    /* renamed from: b */
    abstract d mo17520b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m17543c() {
        return this.f18409g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f18403a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18406d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m17544g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f18409g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.d$d r0 = r9.f18403a
            int r0 = r0.f18418B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f18406d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f18405c
            if (r0 == 0) goto L29
            r9.f18406d = r0
            f.d$d r0 = r9.f18403a
            int r0 = r0.f18418B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f18413k = r0
            goto L35
        L29:
            r9.f18406d = r4
            r9.f18413k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f18405c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.d$d r0 = r9.f18403a
            int r1 = r0.f18433h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m17558g(r10)
            r9.f18405c = r0
            r9.f18409g = r10
            if (r0 == 0) goto L5a
            f.d$d r10 = r9.f18403a
            int r10 = r10.f18417A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f18412j = r2
        L51:
            r9.m17539d(r0)
            goto L5a
        L55:
            r9.f18405c = r4
            r10 = -1
            r9.f18409g = r10
        L5a:
            long r0 = r9.f18412j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f18413k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f18411i
            if (r0 != 0) goto L73
            f.d$a r0 = new f.d$a
            r0.<init>()
            r9.f18411i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m17542a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p121f.AbstractC4203d.m17544g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18407e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18403a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18403a.m17555c()) {
            this.f18403a.f18429d = getChangingConfigurations();
            return this.f18403a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f18405c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18404b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f18403a.m17568q()) {
            return this.f18403a.m17560i();
        }
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f18403a.m17568q()) {
            return this.f18403a.m17564m();
        }
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f18403a.m17568q()) {
            return this.f18403a.m17561j();
        }
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f18403a.m17568q()) {
            return this.f18403a.m17562k();
        }
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f18405c;
        if (drawable != null && drawable.isVisible()) {
            return this.f18403a.m17565n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            b.m17547b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m17563l = this.f18403a.m17563l();
        if (m17563l != null) {
            rect.set(m17563l);
            if ((m17563l.right | m17563l.left | m17563l.top | m17563l.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f18405c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m17540e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17521h(d dVar) {
        this.f18403a = dVar;
        int i10 = this.f18409g;
        if (i10 >= 0) {
            Drawable m17558g = dVar.m17558g(i10);
            this.f18405c = m17558g;
            if (m17558g != null) {
                m17539d(m17558g);
            }
        }
        this.f18406d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m17545i(Resources resources) {
        this.f18403a.m17574y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f18403a;
        if (dVar != null) {
            dVar.m17567p();
        }
        if (drawable == this.f18405c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f18403a.f18419C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f18406d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18406d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f18405c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18408f) {
                this.f18405c.setAlpha(this.f18407e);
            }
        }
        if (this.f18413k != 0) {
            this.f18413k = 0L;
            z10 = true;
        }
        if (this.f18412j != 0) {
            this.f18412j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f18410h && super.mutate() == this) {
            d mo17520b = mo17520b();
            mo17520b.mo17534r();
            mo17521h(mo17520b);
            this.f18410h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18406d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18405c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f18403a.m17572w(i10, m17543c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f18406d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f18405c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f18405c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (!this.f18408f || this.f18407e != i10) {
            this.f18408f = true;
            this.f18407e = i10;
            Drawable drawable = this.f18405c;
            if (drawable != null) {
                if (this.f18412j == 0) {
                    drawable.setAlpha(i10);
                } else {
                    m17542a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f18403a;
        if (dVar.f18419C != z10) {
            dVar.f18419C = z10;
            Drawable drawable = this.f18405c;
            if (drawable != null) {
                AbstractC6306k.m25064j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f18403a;
        dVar.f18421E = true;
        if (dVar.f18420D != colorFilter) {
            dVar.f18420D = colorFilter;
            Drawable drawable = this.f18405c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f18403a;
        if (dVar.f18449x != z10) {
            dVar.f18449x = z10;
            Drawable drawable = this.f18405c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            AbstractC6306k.m25065k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f18404b;
        if (rect == null) {
            this.f18404b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f18405c;
        if (drawable != null) {
            AbstractC6306k.m25066l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f18403a;
        dVar.f18424H = true;
        if (dVar.f18422F != colorStateList) {
            dVar.f18422F = colorStateList;
            AbstractC6306k.m25069o(this.f18405c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f18403a;
        dVar.f18425I = true;
        if (dVar.f18423G != mode) {
            dVar.f18423G = mode;
            AbstractC6306k.m25070p(this.f18405c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f18406d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f18405c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f18405c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
