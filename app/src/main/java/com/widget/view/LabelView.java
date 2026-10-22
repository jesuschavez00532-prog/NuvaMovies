package com.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.widget.C3890R;

/* loaded from: classes3.dex */
public class LabelView extends View {
    private static final int DEFAULT_DEGREES = 45;
    private int mBackgroundColor;
    private Paint mBackgroundPaint;
    private boolean mFillTriangle;
    private int mGravity;
    private float mMinSize;
    private float mPadding;
    private Path mPath;
    private boolean mTextAllCaps;
    private boolean mTextBold;
    private int mTextColor;
    private String mTextContent;
    private Paint mTextPaint;
    private float mTextSize;

    public LabelView(Context context) {
        this(context, null);
    }

    private void drawText(int i10, float f10, Canvas canvas, float f11, boolean z10) {
        float f12;
        canvas.save();
        float f13 = i10 / 2.0f;
        canvas.rotate(f10, f13, f13);
        float f14 = f11 + (this.mPadding * 2.0f);
        if (z10) {
            f12 = (-f14) / 2.0f;
        } else {
            f12 = f14 / 2.0f;
        }
        float descent = ((i10 / 2) - ((this.mTextPaint.descent() + this.mTextPaint.ascent()) / 2.0f)) + f12;
        String str = this.mTextContent;
        if (str != null) {
            if (this.mTextAllCaps) {
                str = str.toUpperCase();
            }
            canvas.drawText(str, getPaddingLeft() + (((i10 - getPaddingLeft()) - getPaddingRight()) / 2), descent, this.mTextPaint);
        }
        canvas.restore();
    }

    private void drawTextWhenFill(int i10, float f10, Canvas canvas, boolean z10) {
        int i11;
        String str;
        canvas.save();
        float f11 = i10 / 2.0f;
        canvas.rotate(f10, f11, f11);
        if (z10) {
            i11 = (-i10) / 4;
        } else {
            i11 = i10 / 4;
        }
        float descent = ((i10 / 2) - ((this.mTextPaint.descent() + this.mTextPaint.ascent()) / 2.0f)) + i11;
        if (this.mTextAllCaps) {
            str = this.mTextContent.toUpperCase();
        } else {
            str = this.mTextContent;
        }
        canvas.drawText(str, getPaddingLeft() + (((i10 - getPaddingLeft()) - getPaddingRight()) / 2), descent, this.mTextPaint);
        canvas.restore();
    }

    private int measureWidth(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            this.mTextPaint.setColor(this.mTextColor);
            this.mTextPaint.setTextSize(this.mTextSize);
            double measureText = paddingLeft + ((int) this.mTextPaint.measureText(this.mTextContent + ""));
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(measureText);
            int i11 = (int) (measureText * sqrt);
            if (mode == Integer.MIN_VALUE) {
                i11 = Math.min(i11, size);
            }
            return Math.max((int) this.mMinSize, i11);
        }
        return size;
    }

    private void obtainAttributes(Context context, AttributeSet attributeSet) {
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3890R.styleable.LabelView);
        this.mTextContent = obtainStyledAttributes.getString(C3890R.styleable.LabelView_lv_text);
        this.mTextColor = obtainStyledAttributes.getColor(C3890R.styleable.LabelView_lv_text_color, Color.parseColor("#ffffff"));
        this.mTextSize = obtainStyledAttributes.getDimension(C3890R.styleable.LabelView_lv_text_size, sp2px(11.0f));
        this.mTextBold = obtainStyledAttributes.getBoolean(C3890R.styleable.LabelView_lv_text_bold, true);
        this.mTextAllCaps = obtainStyledAttributes.getBoolean(C3890R.styleable.LabelView_lv_text_all_caps, true);
        this.mFillTriangle = obtainStyledAttributes.getBoolean(C3890R.styleable.LabelView_lv_fill_triangle, false);
        this.mBackgroundColor = obtainStyledAttributes.getColor(C3890R.styleable.LabelView_lv_background_color, Color.parseColor("#FF4081"));
        int i10 = C3890R.styleable.LabelView_lv_min_size;
        if (this.mFillTriangle) {
            f10 = 35.0f;
        } else {
            f10 = 50.0f;
        }
        this.mMinSize = obtainStyledAttributes.getDimension(i10, dp2px(f10));
        this.mPadding = obtainStyledAttributes.getDimension(C3890R.styleable.LabelView_lv_padding, dp2px(3.5f));
        this.mGravity = obtainStyledAttributes.getInt(C3890R.styleable.LabelView_lv_gravity, 51);
        obtainStyledAttributes.recycle();
    }

    protected int dp2px(float f10) {
        return (int) ((f10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getBgColor() {
        return this.mBackgroundColor;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public float getMinSize() {
        return this.mMinSize;
    }

    public float getPadding() {
        return this.mPadding;
    }

    public String getText() {
        return this.mTextContent;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public boolean isFillTriangle() {
        return this.mFillTriangle;
    }

    public boolean isTextAllCaps() {
        return this.mTextAllCaps;
    }

    public boolean isTextBold() {
        return this.mTextBold;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setFakeBoldText(this.mTextBold);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        float descent = this.mTextPaint.descent() - this.mTextPaint.ascent();
        if (this.mFillTriangle) {
            int i10 = this.mGravity;
            if (i10 == 51) {
                this.mPath.reset();
                this.mPath.moveTo(0.0f, 0.0f);
                float f10 = height;
                this.mPath.lineTo(0.0f, f10);
                this.mPath.lineTo(f10, 0.0f);
                this.mPath.close();
                canvas.drawPath(this.mPath, this.mBackgroundPaint);
                drawTextWhenFill(height, -45.0f, canvas, true);
                return;
            }
            if (i10 == 53) {
                this.mPath.reset();
                float f11 = height;
                this.mPath.moveTo(f11, 0.0f);
                this.mPath.lineTo(0.0f, 0.0f);
                this.mPath.lineTo(f11, f11);
                this.mPath.close();
                canvas.drawPath(this.mPath, this.mBackgroundPaint);
                drawTextWhenFill(height, 45.0f, canvas, true);
                return;
            }
            if (i10 == 83) {
                this.mPath.reset();
                float f12 = height;
                this.mPath.moveTo(0.0f, f12);
                this.mPath.lineTo(0.0f, 0.0f);
                this.mPath.lineTo(f12, f12);
                this.mPath.close();
                canvas.drawPath(this.mPath, this.mBackgroundPaint);
                drawTextWhenFill(height, 45.0f, canvas, false);
                return;
            }
            if (i10 == 85) {
                this.mPath.reset();
                float f13 = height;
                this.mPath.moveTo(f13, f13);
                this.mPath.lineTo(0.0f, f13);
                this.mPath.lineTo(f13, 0.0f);
                this.mPath.close();
                canvas.drawPath(this.mPath, this.mBackgroundPaint);
                drawTextWhenFill(height, -45.0f, canvas, false);
                return;
            }
            return;
        }
        double d10 = (this.mPadding * 2.0f) + descent;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d10);
        double d11 = d10 * sqrt;
        int i11 = this.mGravity;
        if (i11 == 51) {
            this.mPath.reset();
            Path path = this.mPath;
            double d12 = height;
            Double.isNaN(d12);
            float f14 = (float) (d12 - d11);
            path.moveTo(0.0f, f14);
            float f15 = height;
            this.mPath.lineTo(0.0f, f15);
            this.mPath.lineTo(f15, 0.0f);
            this.mPath.lineTo(f14, 0.0f);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mBackgroundPaint);
            drawText(height, -45.0f, canvas, descent, true);
            return;
        }
        if (i11 == 53) {
            this.mPath.reset();
            this.mPath.moveTo(0.0f, 0.0f);
            this.mPath.lineTo((float) d11, 0.0f);
            Path path2 = this.mPath;
            float f16 = height;
            double d13 = height;
            Double.isNaN(d13);
            path2.lineTo(f16, (float) (d13 - d11));
            this.mPath.lineTo(f16, f16);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mBackgroundPaint);
            drawText(height, 45.0f, canvas, descent, true);
            return;
        }
        if (i11 == 83) {
            this.mPath.reset();
            this.mPath.moveTo(0.0f, 0.0f);
            this.mPath.lineTo(0.0f, (float) d11);
            Path path3 = this.mPath;
            double d14 = height;
            Double.isNaN(d14);
            float f17 = height;
            path3.lineTo((float) (d14 - d11), f17);
            this.mPath.lineTo(f17, f17);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mBackgroundPaint);
            drawText(height, 45.0f, canvas, descent, false);
            return;
        }
        if (i11 == 85) {
            this.mPath.reset();
            float f18 = height;
            this.mPath.moveTo(0.0f, f18);
            float f19 = (float) d11;
            this.mPath.lineTo(f19, f18);
            this.mPath.lineTo(f18, f19);
            this.mPath.lineTo(f18, 0.0f);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mBackgroundPaint);
            drawText(height, -45.0f, canvas, descent, false);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measureWidth = measureWidth(i10);
        setMeasuredDimension(measureWidth, measureWidth);
    }

    public void setBgColor(int i10) {
        this.mBackgroundColor = i10;
        invalidate();
    }

    public void setFillTriangle(boolean z10) {
        this.mFillTriangle = z10;
        invalidate();
    }

    public void setGravity(int i10) {
        this.mGravity = i10;
    }

    public void setMinSize(float f10) {
        this.mMinSize = dp2px(f10);
        invalidate();
    }

    public void setPadding(float f10) {
        this.mPadding = dp2px(f10);
        invalidate();
    }

    public void setText(String str) {
        this.mTextContent = str;
        invalidate();
    }

    public void setTextAllCaps(boolean z10) {
        this.mTextAllCaps = z10;
        invalidate();
    }

    public void setTextBold(boolean z10) {
        this.mTextBold = z10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.mTextColor = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.mTextSize = sp2px(f10);
        invalidate();
    }

    protected int sp2px(float f10) {
        return (int) ((f10 * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextPaint = new Paint(1);
        this.mBackgroundPaint = new Paint(1);
        this.mPath = new Path();
        obtainAttributes(context, attributeSet);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
    }
}
