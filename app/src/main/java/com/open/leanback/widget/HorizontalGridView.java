package com.open.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.open.leanback.R$styleable;

/* loaded from: classes2.dex */
public class HorizontalGridView extends AbstractC3050a {

    /* renamed from: m */
    private boolean f12485m;

    /* renamed from: n */
    private boolean f12486n;

    /* renamed from: o */
    private Paint f12487o;

    /* renamed from: p */
    private Bitmap f12488p;

    /* renamed from: q */
    private LinearGradient f12489q;

    /* renamed from: r */
    private int f12490r;

    /* renamed from: s */
    private int f12491s;

    /* renamed from: t */
    private Bitmap f12492t;

    /* renamed from: u */
    private LinearGradient f12493u;

    /* renamed from: v */
    private int f12494v;

    /* renamed from: w */
    private int f12495w;

    /* renamed from: x */
    private Rect f12496x;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f12492t;
        if (bitmap == null || bitmap.getWidth() != this.f12494v || this.f12492t.getHeight() != getHeight()) {
            this.f12492t = Bitmap.createBitmap(this.f12494v, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f12492t;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f12488p;
        if (bitmap == null || bitmap.getWidth() != this.f12490r || this.f12488p.getHeight() != getHeight()) {
            this.f12488p = Bitmap.createBitmap(this.f12490r, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f12488p;
    }

    /* renamed from: h */
    private boolean m12511h() {
        if (!this.f12486n) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f12501a.m12412K(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.f12495w) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m12512i() {
        if (!this.f12485m) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (this.f12501a.m12411J(getChildAt(i10)) < getPaddingLeft() - this.f12491s) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m12513j() {
        if (!this.f12485m && !this.f12486n) {
            setLayerType(0, null);
            setWillNotDraw(true);
        } else {
            setLayerType(2, null);
            setWillNotDraw(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int width;
        int i11;
        int i12;
        boolean m12512i = m12512i();
        boolean m12511h = m12511h();
        if (!m12512i) {
            this.f12488p = null;
        }
        if (!m12511h) {
            this.f12492t = null;
        }
        if (!m12512i && !m12511h) {
            super.draw(canvas);
            return;
        }
        if (this.f12485m) {
            i10 = (getPaddingLeft() - this.f12491s) - this.f12490r;
        } else {
            i10 = 0;
        }
        if (this.f12486n) {
            width = (getWidth() - getPaddingRight()) + this.f12495w + this.f12494v;
        } else {
            width = getWidth();
        }
        int save = canvas.save();
        if (this.f12485m) {
            i11 = this.f12490r;
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        if (this.f12486n) {
            i12 = this.f12494v;
        } else {
            i12 = 0;
        }
        canvas.clipRect(i13, 0, width - i12, getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f12496x;
        rect.top = 0;
        rect.bottom = getHeight();
        if (m12512i && this.f12490r > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f12490r, getHeight());
            float f10 = -i10;
            canvas2.translate(f10, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.f12487o.setShader(this.f12489q);
            canvas2.drawRect(0.0f, 0.0f, this.f12490r, getHeight(), this.f12487o);
            Rect rect2 = this.f12496x;
            rect2.left = 0;
            rect2.right = this.f12490r;
            canvas.translate(i10, 0.0f);
            Rect rect3 = this.f12496x;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f10, 0.0f);
        }
        if (m12511h && this.f12494v > 0) {
            Bitmap tempBitmapHigh = getTempBitmapHigh();
            tempBitmapHigh.eraseColor(0);
            canvas2.setBitmap(tempBitmapHigh);
            int save3 = canvas2.save();
            canvas2.clipRect(0, 0, this.f12494v, getHeight());
            canvas2.translate(-(width - this.f12494v), 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save3);
            this.f12487o.setShader(this.f12493u);
            canvas2.drawRect(0.0f, 0.0f, this.f12494v, getHeight(), this.f12487o);
            Rect rect4 = this.f12496x;
            rect4.left = 0;
            rect4.right = this.f12494v;
            canvas.translate(width - r5, 0.0f);
            Rect rect5 = this.f12496x;
            canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
            canvas.translate(-(width - this.f12494v), 0.0f);
        }
    }

    /* renamed from: g */
    protected void m12514g(Context context, AttributeSet attributeSet) {
        m12519e(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12394a0);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(R$styleable.lbHorizontalGridView_numberOfRows, 1));
        obtainStyledAttributes.recycle();
        m12513j();
        Paint paint = new Paint();
        this.f12487o = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final boolean getFadingLeftEdge() {
        return this.f12485m;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f12490r;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f12491s;
    }

    public final boolean getFadingRightEdge() {
        return this.f12486n;
    }

    public final int getFadingRightEdgeLength() {
        return this.f12494v;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f12495w;
    }

    public final void setFadingLeftEdge(boolean z10) {
        if (this.f12485m != z10) {
            this.f12485m = z10;
            if (!z10) {
                this.f12488p = null;
            }
            invalidate();
            m12513j();
        }
    }

    public final void setFadingLeftEdgeLength(int i10) {
        if (this.f12490r != i10) {
            this.f12490r = i10;
            if (i10 != 0) {
                this.f12489q = new LinearGradient(0.0f, 0.0f, this.f12490r, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.f12489q = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i10) {
        if (this.f12491s != i10) {
            this.f12491s = i10;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z10) {
        if (this.f12486n != z10) {
            this.f12486n = z10;
            if (!z10) {
                this.f12492t = null;
            }
            invalidate();
            m12513j();
        }
    }

    public final void setFadingRightEdgeLength(int i10) {
        if (this.f12494v != i10) {
            this.f12494v = i10;
            if (i10 != 0) {
                this.f12493u = new LinearGradient(0.0f, 0.0f, this.f12494v, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.f12493u = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i10) {
        if (this.f12495w != i10) {
            this.f12495w = i10;
            invalidate();
        }
    }

    public void setNumRows(int i10) {
        this.f12501a.m12449j1(i10);
        requestLayout();
    }

    void setRowHeight(TypedArray typedArray) {
        int i10 = R$styleable.lbHorizontalGridView_rowHeight;
        if (typedArray.peekValue(i10) != null) {
            setRowHeight(typedArray.getLayoutDimension(i10, 0));
        }
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12487o = new Paint();
        this.f12496x = new Rect();
        this.f12501a.setOrientation(0);
        m12514g(context, attributeSet);
    }

    public void setRowHeight(int i10) {
        this.f12501a.m12461o1(i10);
        requestLayout();
    }
}
