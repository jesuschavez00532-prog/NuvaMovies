package p387wd;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ne.AbstractC5868k;
import p170i2.C4842a;
import p415y9.AbstractApplicationC7689d;

/* renamed from: wd.a */
/* loaded from: classes3.dex */
public final class C7394a extends Drawable {

    /* renamed from: a */
    private final Paint f27406a;

    /* renamed from: b */
    private RectF f27407b;

    /* renamed from: c */
    private final float f27408c;

    public C7394a() {
        String str = null;
        Paint paint = new Paint(1);
        this.f27406a = paint;
        if (C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC7689d.f28135d.m29494a()).equals("com.android.flutv")) {
            str = "#ff1818";
        } else {
            str = "#3A66FE";
        }
        paint.setColor(Color.parseColor(str));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(m28505a(2.0f));
        this.f27408c = paint.getStrokeWidth() / 2;
    }

    /* renamed from: a */
    private final float m28505a(float f10) {
        return TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        RectF rectF = this.f27407b;
        if (rectF != null) {
            canvas.drawRect(rectF, this.f27406a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27406a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float f10 = this.f27408c;
        this.f27407b = new RectF(i10 + f10, i11 + f10, i12 - f10, i13 - f10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27406a.setColorFilter(colorFilter);
    }
}
