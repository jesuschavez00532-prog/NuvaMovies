package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.AbstractC2588f;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public abstract class AbstractC2594d extends FrameLayout {

    /* renamed from: d */
    private static final View.OnTouchListener f9827d = new a();

    /* renamed from: a */
    private int f9828a;

    /* renamed from: b */
    private final float f9829b;

    /* renamed from: c */
    private final float f9830c;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes.dex */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2594d(Context context, AttributeSet attributeSet) {
        super(AbstractC2588f.m10655f(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f9360t0);
        if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
            AbstractC0616q0.m2650u0(this, obtainStyledAttributes.getDimensionPixelSize(r4, 0));
        }
        this.f9828a = obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
        this.f9829b = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f9830c = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f9827d);
        setFocusable(true);
    }

    float getActionTextColorAlpha() {
        return this.f9830c;
    }

    int getAnimationMode() {
        return this.f9828a;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f9829b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0616q0.m2630k0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    void setAnimationMode(int i10) {
        this.f9828a = i10;
    }

    void setOnAttachStateChangeListener(InterfaceC2592b interfaceC2592b) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = f9827d;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(InterfaceC2593c interfaceC2593c) {
    }
}
