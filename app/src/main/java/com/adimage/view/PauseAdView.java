package com.adimage.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adimage.R$drawable;
import com.adimage.R$id;
import com.adimage.R$layout;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p255o0.C5900c;

/* loaded from: classes.dex */
public final class PauseAdView extends AutoFrameLayout {

    /* renamed from: a */
    private C5900c f5745a;

    /* renamed from: b */
    public Map f5746b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PauseAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* renamed from: h */
    public static /* synthetic */ void m7048h(PauseAdView pauseAdView, Bitmap bitmap, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        pauseAdView.m7052g(bitmap, layoutParams);
    }

    /* renamed from: i */
    private final void m7049i() {
        if (getParent() != null && this.f5745a != null) {
            ViewParent parent = getParent();
            AbstractC5868k.m23672d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f5745a);
            this.f5745a = null;
        }
    }

    /* renamed from: a */
    public View m7050a(int i10) {
        Map map = this.f5746b;
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
    public final void m7051c() {
        setId(R$id.mPauseAd);
    }

    /* renamed from: g */
    public final void m7052g(Bitmap bitmap, ViewGroup.LayoutParams layoutParams) {
        AbstractC5868k.m23674f(bitmap, "bitmap");
        ((TraceAdImageView) m7050a(R$id.mIvKey0)).setVisibility(0);
        ((TextView) m7050a(R$id.mTvKeyDesc)).setVisibility(0);
        ViewParent parent = getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            C5900c c5900c = new C5900c(context, null, 0, 6, null);
            this.f5745a = c5900c;
            c5900c.setQrCode(bitmap);
            if (layoutParams == null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(8, getId());
                layoutParams2.addRule(0, getId());
                viewGroup.addView(this.f5745a, 1, layoutParams2);
                return;
            }
            viewGroup.addView(this.f5745a, 1, layoutParams);
        }
    }

    public final ImageView getAdView() {
        TraceAdImageView traceAdImageView = (TraceAdImageView) m7050a(R$id.mIvAd);
        AbstractC5868k.m23673e(traceAdImageView, "mIvAd");
        return traceAdImageView;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            m7049i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PauseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f5746b = new LinkedHashMap();
        LayoutInflater.from(context).inflate(R$layout.view_pause_ad, (ViewGroup) this, true);
        ((TraceAdImageView) m7050a(R$id.mIvAd)).setImageResource(R$drawable.ic_ad_key_down);
    }

    public /* synthetic */ PauseAdView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
