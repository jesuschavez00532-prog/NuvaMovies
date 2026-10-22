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

/* renamed from: com.umeng.message.proguard.au */
/* loaded from: classes3.dex */
public final class C3575au extends Drawable {

    /* renamed from: a */
    private final Bitmap f15989a;

    /* renamed from: c */
    private final BitmapShader f15991c;

    /* renamed from: h */
    private final int f15996h;

    /* renamed from: i */
    private final int f15997i;

    /* renamed from: j */
    private final int f15998j;

    /* renamed from: b */
    private final Paint f15990b = new Paint(3);

    /* renamed from: d */
    private final Matrix f15992d = new Matrix();

    /* renamed from: e */
    private final Rect f15993e = new Rect();

    /* renamed from: f */
    private final RectF f15994f = new RectF();

    /* renamed from: g */
    private boolean f15995g = true;

    public C3575au(Bitmap bitmap, int i10) {
        this.f15989a = bitmap;
        this.f15998j = i10;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f15991c = new BitmapShader(bitmap, tileMode, tileMode);
        this.f15996h = bitmap.getWidth();
        this.f15997i = bitmap.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (canvas == null || (bitmap = this.f15989a) == null) {
            return;
        }
        canvas.getClipBounds(this.f15993e);
        if (this.f15995g) {
            this.f15994f.set(this.f15993e);
            if (this.f15991c != null) {
                Matrix matrix = this.f15992d;
                RectF rectF = this.f15994f;
                matrix.setTranslate(rectF.left, rectF.top);
                int width = this.f15989a.getWidth();
                int height = this.f15989a.getHeight();
                if (width != 0 && height != 0) {
                    this.f15992d.preScale((this.f15993e.width() * 1.0f) / width, (this.f15993e.height() * 1.0f) / height);
                    this.f15991c.setLocalMatrix(this.f15992d);
                    this.f15990b.setShader(this.f15991c);
                }
            }
            this.f15995g = false;
        }
        if (this.f15990b.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f15993e, this.f15990b);
            return;
        }
        RectF rectF2 = this.f15994f;
        int i10 = this.f15998j;
        canvas.drawRoundRect(rectF2, i10, i10, this.f15990b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15990b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f15990b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15997i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15996h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15995g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 != this.f15990b.getAlpha()) {
            this.f15990b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15990b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f15990b.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f15990b.setFilterBitmap(z10);
        invalidateSelf();
    }
}
