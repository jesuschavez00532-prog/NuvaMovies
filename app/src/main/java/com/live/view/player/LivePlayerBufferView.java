package com.live.view.player;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.module.view.net.NetSpeedTextView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p012ab.C0128d;

/* loaded from: classes2.dex */
public final class LivePlayerBufferView extends LinearLayout {

    /* renamed from: a */
    private ObjectAnimator f11042a;

    /* renamed from: b */
    public Map f11043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePlayerBufferView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f11043b = new LinkedHashMap();
        setOrientation(1);
        setBackgroundResource(R$color.transparent);
        LayoutInflater.from(context).inflate(R$layout.layout_live_buffer, (ViewGroup) this, true);
    }

    /* renamed from: b */
    private final void m11676b() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m11678a(R$id.mTextSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTextSpeed");
        c0128d.m510e(netSpeedTextView);
    }

    /* renamed from: d */
    private final void m11677d() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m11678a(R$id.mTextSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTextSpeed");
        c0128d.m513n(netSpeedTextView);
    }

    /* renamed from: a */
    public View m11678a(int i10) {
        Map map = this.f11043b;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final void m11679c() {
        ((NetSpeedTextView) m11678a(R$id.mTextSpeed)).setVisibility(8);
    }

    /* renamed from: e */
    public final void m11680e() {
        ((NetSpeedTextView) m11678a(R$id.mTextSpeed)).setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = R$id.mImageView;
        ((ImageView) m11678a(i10)).setImageResource(R$drawable.ic_buffer_loading);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m11678a(i10), "rotation", 0.0f, 360.0f);
        this.f11042a = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(1500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
        m11676b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        setVisibility(8);
        this.f11042a = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        super.setVisibility(i10);
        boolean z10 = true;
        if (i10 == 0) {
            ObjectAnimator objectAnimator3 = this.f11042a;
            if (objectAnimator3 == null || objectAnimator3.isRunning()) {
                z10 = false;
            }
            if (z10 && (objectAnimator2 = this.f11042a) != null) {
                objectAnimator2.start();
            }
            m11676b();
            return;
        }
        ObjectAnimator objectAnimator4 = this.f11042a;
        if (objectAnimator4 == null || !objectAnimator4.isRunning()) {
            z10 = false;
        }
        if (z10 && (objectAnimator = this.f11042a) != null) {
            objectAnimator.cancel();
        }
        m11677d();
    }
}
