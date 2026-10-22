package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p326s5.C6686i;
import p326s5.C6690m;

/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
class C2607d extends C6686i {

    /* renamed from: w */
    private final Paint f9920w;

    /* renamed from: x */
    private final RectF f9921x;

    /* renamed from: y */
    private int f9922y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2607d(C6690m c6690m) {
        super(c6690m == null ? new C6690m() : c6690m);
        this.f9920w = new Paint(1);
        m10750j0();
        this.f9921x = new RectF();
    }

    /* renamed from: d0 */
    private void m10747d0(Canvas canvas) {
        if (!m10751k0(getCallback())) {
            canvas.restoreToCount(this.f9922y);
        }
    }

    /* renamed from: e0 */
    private void m10748e0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m10751k0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m10749g0(canvas);
    }

    /* renamed from: g0 */
    private void m10749g0(Canvas canvas) {
        int saveLayer;
        if (Build.VERSION.SDK_INT >= 21) {
            saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
            this.f9922y = saveLayer;
        } else {
            this.f9922y = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    /* renamed from: j0 */
    private void m10750j0() {
        this.f9920w.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9920w.setColor(-1);
        this.f9920w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: k0 */
    private boolean m10751k0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public boolean m10752c0() {
        return !this.f9921x.isEmpty();
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m10748e0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f9921x, this.f9920w);
        m10747d0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m10753f0() {
        m10754h0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: h0 */
    void m10754h0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f9921x;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void m10755i0(RectF rectF) {
        m10754h0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
