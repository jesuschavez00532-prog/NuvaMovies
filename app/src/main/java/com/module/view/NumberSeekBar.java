package com.module.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.SeekBar;
import com.module.R$mipmap;
import com.module.R$styleable;
import com.umeng.analytics.pro.C3384f;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.C5881x;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class NumberSeekBar extends SeekBar {

    /* renamed from: p */
    public static final C3021a f12276p = new C3021a(null);

    /* renamed from: q */
    private static final int f12277q = 1;

    /* renamed from: r */
    private static final int f12278r = 2;

    /* renamed from: a */
    private int f12279a;

    /* renamed from: b */
    private float f12280b;

    /* renamed from: c */
    private String f12281c;

    /* renamed from: d */
    private Bitmap f12282d;

    /* renamed from: e */
    private float f12283e;

    /* renamed from: f */
    private float f12284f;

    /* renamed from: g */
    private final Paint f12285g;

    /* renamed from: h */
    private int f12286h;

    /* renamed from: i */
    private float f12287i;

    /* renamed from: j */
    private float f12288j;

    /* renamed from: k */
    private int f12289k;

    /* renamed from: l */
    private int f12290l;

    /* renamed from: m */
    private int f12291m;

    /* renamed from: n */
    private int f12292n;

    /* renamed from: o */
    public Map f12293o;

    /* renamed from: com.module.view.NumberSeekBar$a */
    /* loaded from: classes2.dex */
    public static final class C3021a {
        private C3021a() {
        }

        public /* synthetic */ C3021a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12293o = new LinkedHashMap();
        this.f12285g = new Paint();
        this.f12289k = 1;
        this.f12290l = 10;
        this.f12291m = 3;
        this.f12292n = 2;
        m12233a(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m12233a(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f11933I0, i10, 0);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.theme.obtainStyl…mberSeekBar, defStyle, 0)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == R$styleable.NumberSeekBar_textColor) {
                this.f12279a = obtainStyledAttributes.getColor(index, -1);
            } else if (index == R$styleable.NumberSeekBar_textSize) {
                this.f12280b = AbstractC7786b.m30163g((int) obtainStyledAttributes.getDimension(index, 14.0f));
            } else if (index == R$styleable.NumberSeekBar_textBackground) {
                Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), obtainStyledAttributes.getResourceId(index, R$mipmap.bg_seekbar_text));
                this.f12282d = decodeResource;
                AbstractC5868k.m23671c(decodeResource);
                this.f12283e = decodeResource.getWidth();
                AbstractC5868k.m23671c(this.f12282d);
                this.f12284f = r0.getHeight();
            } else if (index == R$styleable.NumberSeekBar_textOrientation) {
                this.f12286h = obtainStyledAttributes.getInt(index, f12277q);
            }
        }
        obtainStyledAttributes.recycle();
        this.f12285g.setAntiAlias(true);
        this.f12285g.setColor(this.f12279a);
        this.f12285g.setTextSize(this.f12280b);
        if (this.f12286h == f12277q) {
            setPadding(((int) Math.ceil(this.f12283e)) / 2, ((int) Math.ceil(this.f12284f)) + 5, ((int) Math.ceil(this.f12283e)) / 2, 0);
        } else {
            setPadding(((int) Math.ceil(this.f12283e)) / 2, 0, ((int) Math.ceil(this.f12283e)) / 2, ((int) Math.ceil(this.f12284f)) + 5);
        }
    }

    /* renamed from: b */
    private final void m12234b() {
        int i10;
        int i11 = this.f12291m - 1;
        this.f12291m = i11;
        if (i11 <= 0) {
            int i12 = this.f12292n;
            if (i12 <= this.f12290l && (i10 = this.f12289k) != 0) {
                setKeyProgressIncrement(i12 * i10);
                this.f12292n++;
            }
            this.f12291m = 3;
        }
    }

    /* renamed from: c */
    private final String m12235c(int i10) {
        int i11 = i10 / 60;
        C5881x c5881x = C5881x.f23415a;
        String format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60), Integer.valueOf(i10 % 60)}, 3));
        AbstractC5868k.m23673e(format, "format(locale, format, *args)");
        return format;
    }

    private final void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f12285g.getFontMetrics();
        String m12235c = m12235c(getProgress() / 1000);
        this.f12281c = m12235c;
        this.f12287i = this.f12285g.measureText(m12235c);
        float f10 = 2;
        this.f12288j = (this.f12284f / f10) + ((fontMetrics.descent - fontMetrics.ascent) / f10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        float f10;
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        getTextLocation();
        AbstractC5868k.m23673e(getProgressDrawable().getBounds(), "progressDrawable.bounds");
        float width = r0.width() * (getProgress() / getMax());
        if (this.f12286h == f12278r) {
            f10 = this.f12284f + 10;
        } else {
            f10 = 0.0f;
        }
        float abs = (Math.abs(this.f12283e - this.f12287i) / 2) + width;
        double d10 = this.f12288j;
        double d11 = f10;
        Double.isNaN(d10);
        Double.isNaN(d11);
        double d12 = d10 + d11;
        double d13 = this.f12284f;
        Double.isNaN(d13);
        double d14 = 2;
        Double.isNaN(d14);
        double d15 = d12 + ((d13 * 0.16d) / d14);
        double m30163g = AbstractC7786b.m30163g(8);
        Double.isNaN(m30163g);
        float f11 = (float) (d15 - m30163g);
        Bitmap bitmap = this.f12282d;
        AbstractC5868k.m23671c(bitmap);
        canvas.drawBitmap(bitmap, width, f10, this.f12285g);
        String str = this.f12281c;
        AbstractC5868k.m23671c(str);
        canvas.drawText(str, abs, f11, this.f12285g);
    }

    @Override // android.widget.AbsSeekBar, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        int progress = getProgress();
        if (i10 != 21) {
            if (i10 == 22) {
                if (progress >= getMax()) {
                    return true;
                }
                m12234b();
                if (isEnabled()) {
                    setProgress(progress + getKeyProgressIncrement());
                    return true;
                }
            }
        } else {
            if (progress <= 0) {
                return true;
            }
            m12234b();
            if (isEnabled()) {
                setProgress(progress - getKeyProgressIncrement());
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 21 || i10 == 22) {
            this.f12291m = 3;
            this.f12292n = 2;
            setKeyProgressIncrement(this.f12289k);
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i10) {
        super.setMax(i10);
        if (i10 >= 3600000) {
            this.f12290l = 30;
            this.f12289k = getMax() / 500;
        } else if (i10 >= 1800000) {
            this.f12290l = 20;
            this.f12289k = getMax() / 500;
        } else if (i10 >= 600000) {
            this.f12290l = 10;
            this.f12289k = getMax() / 100;
        } else {
            this.f12290l = 3;
            this.f12289k = getMax() / 50;
        }
        setKeyProgressIncrement(this.f12289k);
    }
}
