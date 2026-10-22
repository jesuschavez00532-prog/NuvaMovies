package com.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.widget.C3890R;
import com.widget.utils.DrawUtils;

/* loaded from: classes3.dex */
public class ReflectItemView extends FrameLayout {
    private static final int DEFUALT_RADIUS = 12;
    private static final int DEFUALT_REFHEIGHT = 80;
    private static final String TAG = "ReflectItemView";
    private static int sViewIDNum;
    private Paint mClearPaint;
    private boolean mIsDrawShape;
    private boolean mIsReflection;
    private float mRadius;
    private int mRefHeight;
    private Paint mRefPaint;
    private int mRefleSpacing;
    private Paint mShapePaint;
    private int viewIDNum;

    public ReflectItemView(Context context) {
        this(context, null, 0);
    }

    private void drawRefleCanvas(Canvas canvas) {
        if (this.mIsReflection) {
            canvas.save();
            canvas.translate(0, getHeight() + this.mRefleSpacing);
            drawReflection(canvas);
            canvas.restore();
        }
    }

    private void drawRefleCanvas4_3_18(Canvas canvas) {
        if (this.mIsReflection) {
            getViewCacheID();
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), this.mRefHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawPaint(this.mClearPaint);
            int width = canvas2.getWidth();
            int height = canvas2.getHeight();
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            Paint paint = new Paint(1);
            if (this.mIsDrawShape) {
                canvas2.drawPath(getShapePath(width, height + 50, this.mRadius), paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            canvas2.saveLayer(rectF, paint, 31);
            drawReflection4_3_18(canvas2);
            canvas2.restore();
            canvas.save();
            canvas.translate(0, getHeight() + this.mRefleSpacing);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void drawShapePathCanvas(Canvas canvas) {
        if (canvas != null) {
            int width = getWidth();
            int height = getHeight();
            if (width != 0 && height != 0) {
                int save = canvas.save();
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null, 31);
                Path shapePath = getShapePath(width, height, this.mRadius);
                super.draw(canvas);
                canvas.drawPath(shapePath, this.mShapePaint);
                if (saveLayer > 0) {
                    canvas.restoreToCount(saveLayer);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    private int getViewCacheID() {
        if (this.viewIDNum == 0) {
            int i10 = sViewIDNum + 1;
            sViewIDNum = i10;
            this.viewIDNum = i10;
        }
        return this.viewIDNum;
    }

    private void init(Context context, AttributeSet attributeSet) {
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3890R.styleable.reflectItemView);
            this.mIsReflection = obtainStyledAttributes.getBoolean(C3890R.styleable.reflectItemView_isReflect, false);
            this.mRefHeight = (int) obtainStyledAttributes.getDimension(C3890R.styleable.reflectItemView_reflect_height, 80.0f);
            this.mIsDrawShape = obtainStyledAttributes.getBoolean(C3890R.styleable.reflectItemView_isShape, false);
            this.mRadius = obtainStyledAttributes.getDimension(C3890R.styleable.reflectItemView_radius, 12.0f);
            this.mRefleSpacing = (int) obtainStyledAttributes.getDimension(C3890R.styleable.reflectItemView_refle_spacing, 0.0f);
            setRadius(this.mRadius);
            obtainStyledAttributes.recycle();
        }
        initShapePaint();
        initRefPaint();
    }

    private void initRefPaint() {
        if (this.mRefPaint == null) {
            Paint paint = new Paint(1);
            this.mRefPaint = paint;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.mRefHeight, new int[]{1996488704, 1722460842, 5242880, 0}, new float[]{0.0f, 0.1f, 0.9f, 1.0f}, Shader.TileMode.CLAMP));
            this.mRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        }
        if (this.mClearPaint == null) {
            Paint paint2 = new Paint();
            this.mClearPaint = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    private void initShapePaint() {
        Paint paint = new Paint();
        this.mShapePaint = paint;
        paint.setAntiAlias(true);
        this.mShapePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (canvas != null) {
            try {
                if (this.mIsDrawShape && this.mRadius > 0.0f) {
                    drawShapePathCanvas(canvas);
                } else {
                    super.draw(canvas);
                }
                drawRefleCanvas(canvas);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void drawReflection(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int save = canvas.save();
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, width, this.mRefHeight, null, 31);
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), this.mRefHeight);
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, -getHeight());
        super.draw(canvas);
        if (this.mIsDrawShape) {
            canvas.drawPath(getShapePath(width, height, this.mRadius), this.mShapePaint);
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.mRefHeight, this.mRefPaint);
        canvas.restore();
        if (saveLayer > 0) {
            canvas.restoreToCount(saveLayer);
        }
        canvas.restoreToCount(save);
    }

    public void drawReflection4_3_18(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), this.mRefHeight);
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, -getHeight());
        super.draw(canvas);
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.mRefHeight, this.mRefPaint);
        canvas.restore();
    }

    public int getRefHeight() {
        return this.mRefHeight;
    }

    public Path getShapePath(int i10, int i11, float f10) {
        return DrawUtils.addRoundPath3(getWidth(), getHeight(), f10);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
    }

    public boolean isDrawShape() {
        return this.mIsDrawShape;
    }

    public boolean isReflection() {
        return this.mIsReflection;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDrawShape(boolean z10) {
        this.mIsDrawShape = z10;
        invalidate();
    }

    public void setRadius(float f10) {
        this.mRadius = f10;
        invalidate();
    }

    public void setRefHeight(int i10) {
        this.mRefHeight = i10;
        invalidate();
    }

    public void setReflection(boolean z10) {
        this.mIsReflection = z10;
        invalidate();
    }

    public void setReflectionShader(Shader shader) {
        Paint paint = this.mRefPaint;
        if (paint != null) {
            paint.setShader(shader);
            invalidate();
        }
    }

    public void setReflectionSpacing(int i10) {
        this.mRefleSpacing = i10;
        invalidate();
    }

    public ReflectItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReflectItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mClearPaint = null;
        this.mShapePaint = null;
        this.mRefPaint = null;
        this.mRefHeight = 80;
        this.mIsDrawShape = false;
        this.mIsReflection = false;
        this.mRadius = 12.0f;
        this.mRefleSpacing = 0;
        this.viewIDNum = 0;
        init(context, attributeSet);
    }
}
