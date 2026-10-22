package p280p3;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.download.R$string;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p258o3.C5913i;

/* renamed from: p3.e */
/* loaded from: classes.dex */
public final class C6193e extends View {

    /* renamed from: o */
    public static final a f24343o = new a(null);

    /* renamed from: a */
    private float f24344a;

    /* renamed from: b */
    private RectF f24345b;

    /* renamed from: c */
    private float f24346c;

    /* renamed from: d */
    private String f24347d;

    /* renamed from: e */
    private Rect f24348e;

    /* renamed from: f */
    private Path f24349f;

    /* renamed from: g */
    private ObjectAnimator f24350g;

    /* renamed from: h */
    private final float f24351h;

    /* renamed from: i */
    private int f24352i;

    /* renamed from: j */
    private float f24353j;

    /* renamed from: k */
    private final InterfaceC1312h f24354k;

    /* renamed from: l */
    private final InterfaceC1312h f24355l;

    /* renamed from: m */
    private final InterfaceC1312h f24356m;

    /* renamed from: n */
    public Map f24357n;

    /* renamed from: p3.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: p3.e$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f24358a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint(1);
        }
    }

    /* renamed from: p3.e$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f24359a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager.LayoutParams invoke() {
            return new WindowManager.LayoutParams();
        }
    }

    /* renamed from: p3.e$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager invoke() {
            Object systemService = C6193e.this.getContext().getSystemService("window");
            AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6193e(Context context) {
        super(context);
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f24357n = new LinkedHashMap();
        this.f24347d = "";
        this.f24348e = new Rect();
        this.f24349f = new Path();
        m5965b = AbstractC1314j.m5965b(b.f24358a);
        this.f24354k = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new d());
        this.f24355l = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(c.f24359a);
        this.f24356m = m5965b3;
        if (Build.VERSION.SDK_INT >= 26) {
            getParams().type = 2038;
        } else {
            getParams().type = 2003;
        }
        getParams().format = -3;
        getParams().flags = 8;
        getParams().gravity = 8388693;
        getParams().width = (int) C5913i.m23912a(133.0f);
        getParams().height = (int) C5913i.m23912a(39.0f);
        getParams().x = (int) C5913i.m23912a(40.0f);
        getParams().y = (int) C5913i.m23912a(50.0f);
    }

    private final ObjectAnimator getAnimator() {
        if (this.f24350g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "arrowDownFraction", -1.0f, 1.0f);
            ofFloat.setDuration(1500L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f24350g = ofFloat;
        }
        ObjectAnimator objectAnimator = this.f24350g;
        AbstractC5868k.m23671c(objectAnimator);
        return objectAnimator;
    }

    private final float getArrowDownFraction() {
        return this.f24353j;
    }

    private final Paint getPaint() {
        return (Paint) this.f24354k.getValue();
    }

    private final WindowManager.LayoutParams getParams() {
        return (WindowManager.LayoutParams) this.f24356m.getValue();
    }

    private final WindowManager getWindowManager() {
        return (WindowManager) this.f24355l.getValue();
    }

    private final void setArrowDownFraction(float f10) {
        this.f24353j = f10;
        invalidate();
    }

    /* renamed from: a */
    public final boolean m24730a() {
        if (!isAttachedToWindow()) {
            getWindowManager().addView(this, getParams());
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m24731b() {
        if (isAttachedToWindow()) {
            getWindowManager().removeViewImmediate(this);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m24732c(long j10) {
        this.f24347d = C5913i.m23913b(j10) + "/s";
        if (this.f24352i != 0) {
            setState(0);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24352i == 0) {
            getAnimator().start();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        String string;
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        getPaint().setColor(Color.parseColor("#ff9500"));
        RectF rectF = this.f24345b;
        if (rectF == null) {
            AbstractC5868k.m23686r("bgRect");
            rectF = null;
        }
        float f10 = this.f24344a;
        canvas.drawRoundRect(rectF, f10, f10, getPaint());
        getPaint().setColor(Color.parseColor("#855108"));
        canvas.drawCircle(getHeight() / 2.0f, getHeight() / 2.0f, this.f24344a, getPaint());
        canvas.save();
        canvas.translate((getHeight() / 2.0f) - C5913i.m23912a(10.5f), getArrowDownFraction() * getHeight());
        getPaint().setColor(-1);
        this.f24349f.moveTo(C5913i.m23912a(7.0f), this.f24351h);
        this.f24349f.lineTo(C5913i.m23912a(14.0f), this.f24351h);
        this.f24349f.lineTo(C5913i.m23912a(14.0f), this.f24351h + C5913i.m23912a(14.0f));
        this.f24349f.lineTo(C5913i.m23912a(21.0f), this.f24351h + C5913i.m23912a(14.0f));
        this.f24349f.lineTo(C5913i.m23912a(10.5f), this.f24351h + C5913i.m23912a(23.0f));
        this.f24349f.lineTo(C5913i.m23912a(0.0f), this.f24351h + C5913i.m23912a(14.0f));
        this.f24349f.lineTo(C5913i.m23912a(7.0f), this.f24351h + C5913i.m23912a(14.0f));
        this.f24349f.close();
        canvas.drawPath(this.f24349f, getPaint());
        this.f24349f.reset();
        canvas.restore();
        getPaint().setColor(-1);
        getPaint().setTextSize(C5913i.m23912a(16.0f));
        if (this.f24352i == 0) {
            string = this.f24347d;
        } else {
            string = getResources().getString(R$string.download_pause);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.download_pause)");
        }
        getPaint().getTextBounds(string, 0, string.length(), this.f24348e);
        Rect rect = this.f24348e;
        canvas.drawText(string, getHeight() + C5913i.m23912a(7.0f), (getHeight() / 2.0f) + ((rect.bottom - rect.top) / 2.0f), getPaint());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f24345b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        this.f24344a = getHeight() / 2.0f;
        this.f24346c = getHeight() - C5913i.m23912a(2.0f);
    }

    public final void setState(int i10) {
        if (this.f24352i == i10) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                this.f24352i = i10;
                getAnimator().cancel();
                setArrowDownFraction(C5913i.m23912a(8.0f) / getHeight());
                return;
            }
            return;
        }
        this.f24352i = i10;
        getAnimator().start();
        invalidate();
    }
}
