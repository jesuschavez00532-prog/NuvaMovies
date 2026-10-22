package com.widget.view;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.widget.C3890R;
import com.widget.bridge.BaseEffectBridge;
import com.widget.bridge.OpenEffectBridge;

/* loaded from: classes3.dex */
public class MainUpView extends FrameLayout {
    private static final float DEFUALT_SCALE = 1.0f;
    private static final String TAG = "MainUpView";
    private BaseEffectBridge mEffectBridge;

    public MainUpView(Context context) {
        super(context, null, 0);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        initEffectBridge();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3890R.styleable.MainUpView);
            Drawable drawable = obtainStyledAttributes.getDrawable(C3890R.styleable.MainUpView_upImageRes);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(C3890R.styleable.MainUpView_shadowImageRes);
            setUpRectDrawable(drawable);
            setShadowDrawable(drawable2);
            obtainStyledAttributes.recycle();
        }
    }

    private void initEffectBridge() {
        OpenEffectBridge openEffectBridge = new OpenEffectBridge();
        openEffectBridge.onInitBridge(this);
        openEffectBridge.setMainUpView(this);
        setEffectBridge(openEffectBridge);
    }

    public void attach2Window(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        viewGroup.addView(this, new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public Rect getDrawShadowRect() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            RectF drawShadowRect = baseEffectBridge.getDrawShadowRect();
            return new Rect((int) Math.rint(drawShadowRect.left), (int) Math.rint(drawShadowRect.top), (int) Math.rint(drawShadowRect.right), (int) Math.rint(drawShadowRect.bottom));
        }
        return null;
    }

    public RectF getDrawShadowRectF() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            return baseEffectBridge.getDrawShadowRect();
        }
        return null;
    }

    public Rect getDrawUpRect() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            RectF drawUpRect = baseEffectBridge.getDrawUpRect();
            return new Rect((int) Math.rint(drawUpRect.left), (int) Math.rint(drawUpRect.top), (int) Math.rint(drawUpRect.right), (int) Math.rint(drawUpRect.bottom));
        }
        return null;
    }

    public RectF getDrawUpRectF() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            return baseEffectBridge.getDrawUpRect();
        }
        return null;
    }

    public BaseEffectBridge getEffectBridge() {
        return this.mEffectBridge;
    }

    public Drawable getShadowDrawable() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            return baseEffectBridge.getShadowDrawable();
        }
        return null;
    }

    public Drawable getUpRectDrawable() {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            return baseEffectBridge.getUpRectDrawable();
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null && baseEffectBridge.onDrawMainUpView(canvas)) {
            return;
        }
        super.onDraw(canvas);
    }

    public void setDrawShadowPadding(int i10) {
        setDrawShadowRectPadding(new Rect(i10, i10, i10, i10));
    }

    public void setDrawShadowRectPadding(Rect rect) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setDrawShadowRectPadding(rect);
            invalidate();
        }
    }

    public void setDrawUpRectPadding(int i10) {
        setDrawUpRectPadding(new Rect(i10, i10, i10, i10));
    }

    public void setEffectBridge(BaseEffectBridge baseEffectBridge) {
        this.mEffectBridge = baseEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.onInitBridge(this);
            this.mEffectBridge.setMainUpView(this);
            invalidate();
        }
    }

    public void setFocusView(View view, View view2, float f10) {
        setFocusView(view, f10);
        setUnFocusView(view2);
    }

    public void setFocusViewWhenBorder(View view, View view2, float f10) {
        setFocusView(view, f10);
        if (view == view2) {
            if (!view.hasFocus()) {
                setUnFocusView(view2);
                return;
            }
            return;
        }
        setUnFocusView(view2);
    }

    public void setShadowDrawable(Drawable drawable) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setShadowDrawable(drawable);
            invalidate();
        }
    }

    public void setShadowResource(int i10) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setShadowResource(i10);
            invalidate();
        }
    }

    public void setUnFocusView(View view) {
        setUnFocusView(view, DEFUALT_SCALE, DEFUALT_SCALE);
    }

    public void setUpRectDrawable(Drawable drawable) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setUpRectDrawable(drawable);
        }
    }

    public void setUpRectResource(int i10) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setUpRectResource(i10);
        }
    }

    public void setDrawUpRectPadding(Rect rect) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setDrawUpRectPadding(rect);
            invalidate();
        }
    }

    public void setUnFocusView(View view, float f10, float f11) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.onOldFocusView(view, f10, f11);
        }
    }

    public MainUpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        init(context, attributeSet);
    }

    public void setFocusView(View view, float f10) {
        setFocusView(view, f10, f10);
    }

    public void setFocusView(View view, float f10, float f11) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.onFocusView(view, f10, f11);
        }
    }

    public MainUpView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet);
    }

    public void setDrawUpRectPadding(RectF rectF) {
        BaseEffectBridge baseEffectBridge = this.mEffectBridge;
        if (baseEffectBridge != null) {
            baseEffectBridge.setDrawUpRectPadding(rectF);
            invalidate();
        }
    }
}
