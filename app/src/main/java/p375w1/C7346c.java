package p375w1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0272b;
import android.view.Gravity;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import java.nio.ByteBuffer;
import java.util.List;
import p109e2.AbstractC4121k;
import p152h1.InterfaceC4503a;
import p184j1.InterfaceC4981l;
import p375w1.C7350g;

/* renamed from: w1.c */
/* loaded from: classes.dex */
public class C7346c extends Drawable implements C7350g.b, Animatable {

    /* renamed from: a */
    private final a f27255a;

    /* renamed from: b */
    private boolean f27256b;

    /* renamed from: c */
    private boolean f27257c;

    /* renamed from: d */
    private boolean f27258d;

    /* renamed from: e */
    private boolean f27259e;

    /* renamed from: f */
    private int f27260f;

    /* renamed from: g */
    private int f27261g;

    /* renamed from: h */
    private boolean f27262h;

    /* renamed from: i */
    private Paint f27263i;

    /* renamed from: j */
    private Rect f27264j;

    /* renamed from: k */
    private List f27265k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.c$a */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final C7350g f27266a;

        a(C7350g c7350g) {
            this.f27266a = c7350g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C7346c(this);
        }
    }

    public C7346c(Context context, InterfaceC4503a interfaceC4503a, InterfaceC4981l interfaceC4981l, int i10, int i11, Bitmap bitmap) {
        this(new a(new C7350g(ComponentCallbacks2C1586c.m7276d(context), interfaceC4503a, i10, i11, interfaceC4981l, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private Drawable.Callback m28337b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m28338d() {
        if (this.f27264j == null) {
            this.f27264j = new Rect();
        }
        return this.f27264j;
    }

    /* renamed from: h */
    private Paint m28339h() {
        if (this.f27263i == null) {
            this.f27263i = new Paint(2);
        }
        return this.f27263i;
    }

    /* renamed from: j */
    private void m28340j() {
        List list = this.f27265k;
        if (list != null && list.size() > 0) {
            AbstractC0272b.m941a(this.f27265k.get(0));
            throw null;
        }
    }

    /* renamed from: l */
    private void m28341l() {
        this.f27260f = 0;
    }

    /* renamed from: p */
    private void m28342p() {
        AbstractC4121k.m17223a(!this.f27258d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f27255a.f27266a.m28366f() == 1) {
            invalidateSelf();
        } else if (!this.f27256b) {
            this.f27256b = true;
            this.f27255a.f27266a.m28374t(this);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    private void m28343q() {
        this.f27256b = false;
        this.f27255a.f27266a.m28375u(this);
    }

    @Override // p375w1.C7350g.b
    /* renamed from: a */
    public void mo28344a() {
        if (m28337b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m28348g() == m28347f() - 1) {
            this.f27260f++;
        }
        int i10 = this.f27261g;
        if (i10 != -1 && this.f27260f >= i10) {
            m28340j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer m28345c() {
        return this.f27255a.f27266a.m28362b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f27258d) {
            return;
        }
        if (this.f27262h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m28338d());
            this.f27262h = false;
        }
        canvas.drawBitmap(this.f27255a.f27266a.m28363c(), (Rect) null, m28338d(), m28339h());
    }

    /* renamed from: e */
    public Bitmap m28346e() {
        return this.f27255a.f27266a.m28365e();
    }

    /* renamed from: f */
    public int m28347f() {
        return this.f27255a.f27266a.m28366f();
    }

    /* renamed from: g */
    public int m28348g() {
        return this.f27255a.f27266a.m28364d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f27255a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27255a.f27266a.m28367h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27255a.f27266a.m28370l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int m28349i() {
        return this.f27255a.f27266a.m28369k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f27256b;
    }

    /* renamed from: k */
    public void m28350k() {
        this.f27258d = true;
        this.f27255a.f27266a.m28361a();
    }

    /* renamed from: m */
    public void m28351m(InterfaceC4981l interfaceC4981l, Bitmap bitmap) {
        this.f27255a.f27266a.m28372p(interfaceC4981l, bitmap);
    }

    /* renamed from: n */
    public void m28352n(int i10) {
        int i11 = -1;
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 == 0) {
            int m28368i = this.f27255a.f27266a.m28368i();
            if (m28368i != 0) {
                i11 = m28368i;
            }
            this.f27261g = i11;
            return;
        }
        this.f27261g = i10;
    }

    /* renamed from: o */
    public void m28353o() {
        AbstractC4121k.m17223a(!this.f27256b, "You cannot restart a currently running animation.");
        this.f27255a.f27266a.m28373q();
        start();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27262h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        m28339h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m28339h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        AbstractC4121k.m17223a(!this.f27258d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f27259e = z10;
        if (!z10) {
            m28343q();
        } else if (this.f27257c) {
            m28342p();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f27257c = true;
        m28341l();
        if (this.f27259e) {
            m28342p();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f27257c = false;
        m28343q();
    }

    C7346c(a aVar) {
        this.f27259e = true;
        this.f27261g = -1;
        this.f27255a = (a) AbstractC4121k.m17226d(aVar);
    }
}
