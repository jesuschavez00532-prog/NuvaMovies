package com.module.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$styleable;

/* loaded from: classes2.dex */
public class LoadingView extends LinearLayout {

    /* renamed from: a */
    private ImageView f12201a;

    /* renamed from: b */
    private ObjectAnimator f12202b;

    public LoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private ObjectAnimator m12117a() {
        if (this.f12202b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12201a, "rotation", 0.0f, 360.0f);
            this.f12202b = ofFloat;
            ofFloat.setDuration(1500L);
            this.f12202b.setRepeatCount(-1);
            this.f12202b.setRepeatMode(1);
            this.f12202b.setInterpolator(new LinearInterpolator());
        }
        return this.f12202b;
    }

    /* renamed from: b */
    private void m12118b() {
        ObjectAnimator m12117a = m12117a();
        if (!m12117a.isRunning()) {
            m12117a.start();
        }
    }

    /* renamed from: c */
    private void m12119c() {
        ObjectAnimator m12117a = m12117a();
        if (m12117a.isRunning()) {
            m12117a.cancel();
        }
        this.f12202b = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12119c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            m12118b();
        } else {
            m12119c();
        }
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12202b = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12002l0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.LoadingView_anim);
        obtainStyledAttributes.recycle();
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R$layout.layout_loading, (ViewGroup) this, true).findViewById(R$id.loading_image);
        this.f12201a = imageView;
        if (drawable != null) {
            imageView.setBackgroundDrawable(drawable);
        }
    }
}
