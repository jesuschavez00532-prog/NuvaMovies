package com.umeng.message.proguard;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: com.umeng.message.proguard.ei */
/* loaded from: classes3.dex */
public final class C3675ei extends Drawable {

    /* renamed from: a */
    private final Bitmap f16473a;

    /* renamed from: c */
    private final BitmapShader f16475c;

    /* renamed from: h */
    private int f16480h;

    /* renamed from: i */
    private int f16481i;

    /* renamed from: j */
    private final int f16482j;

    /* renamed from: b */
    private final Paint f16474b = new Paint(3);

    /* renamed from: d */
    private final Matrix f16476d = new Matrix();

    /* renamed from: e */
    private final Rect f16477e = new Rect();

    /* renamed from: f */
    private final RectF f16478f = new RectF();

    /* renamed from: g */
    private boolean f16479g = true;

    public C3675ei(Bitmap bitmap, int i10) {
        this.f16473a = bitmap;
        this.f16482j = i10;
        this.f16480h = bitmap.getWidth();
        this.f16481i = bitmap.getHeight();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f16475c = new BitmapShader(bitmap, tileMode, tileMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f16473a;
        if (bitmap == null) {
            return;
        }
        canvas.getClipBounds(this.f16477e);
        if (this.f16479g) {
            this.f16478f.set(this.f16477e);
            if (this.f16475c != null) {
                Matrix matrix = this.f16476d;
                RectF rectF = this.f16478f;
                matrix.setTranslate(rectF.left, rectF.top);
                int width = this.f16473a.getWidth();
                int height = this.f16473a.getHeight();
                if (width != 0 && height != 0) {
                    this.f16476d.preScale((this.f16477e.width() * 1.0f) / width, (this.f16477e.height() * 1.0f) / height);
                    this.f16475c.setLocalMatrix(this.f16476d);
                    this.f16474b.setShader(this.f16475c);
                }
            }
            this.f16479g = false;
        }
        if (this.f16474b.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f16477e, this.f16474b);
            return;
        }
        RectF rectF2 = this.f16478f;
        int i10 = this.f16482j;
        canvas.drawRoundRect(rectF2, i10, i10, this.f16474b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16474b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f16474b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16481i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16480h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16479g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 != this.f16474b.getAlpha()) {
            this.f16474b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16474b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f16474b.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f16474b.setFilterBitmap(z10);
        invalidateSelf();
    }
}
