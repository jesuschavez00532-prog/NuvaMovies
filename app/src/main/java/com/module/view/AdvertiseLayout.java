package com.module.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import com.advertlib.bean.AdInfo;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.R$color;
import com.module.R$styleable;
import com.module.utils.glide.MyOkHttpGlideModule;
import p178ia.C4919a;
import p178ia.C4922d;
import p184j1.EnumC4971b;
import p277p0.C6156m;
import p348u2.AbstractC7026c;
import p400xa.C7580j1;

/* loaded from: classes2.dex */
public class AdvertiseLayout extends FrameLayout {

    /* renamed from: a */
    private String f12127a;

    /* renamed from: b */
    private int f12128b;

    /* renamed from: c */
    private String f12129c;

    /* renamed from: d */
    private int f12130d;

    /* renamed from: e */
    private int f12131e;

    public AdvertiseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12130d = -1;
        this.f12131e = -1;
        m12058a(context, attributeSet);
    }

    /* renamed from: a */
    private void m12058a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12018q1);
            this.f12127a = obtainStyledAttributes.getString(R$styleable.ad_type_view_ad_type);
            this.f12128b = obtainStyledAttributes.getResourceId(R$styleable.ad_type_view_defaultBgId, R$color.color_0b0b0b);
            obtainStyledAttributes.recycle();
        }
        m12059b(context);
    }

    /* renamed from: b */
    private void m12059b(Context context) {
        m12061c();
    }

    /* renamed from: d */
    private void m12060d(String str) {
        if (str.endsWith(".gif")) {
            ((C1596k) ((C1596k) ComponentCallbacks2C1586c.m7283v(this).mo7379d().mo7367H0(C7580j1.f27853a.m29089b(str, "key_poster")).mo49d0(AbstractC7026c.m27111a(getContext(), this.f12128b))).mo59k(AbstractC7026c.m27111a(getContext(), this.f12128b))).m7363B0(new C4922d(this, -1));
            return;
        }
        C1596k c1596k = (C1596k) ((C1596k) ComponentCallbacks2C1586c.m7283v(this).mo7387m(C7580j1.f27853a.m29089b(str, "key_poster")).mo49d0(AbstractC7026c.m27111a(getContext(), this.f12128b))).mo59k(AbstractC7026c.m27111a(getContext(), this.f12128b));
        if (MyOkHttpGlideModule.f12122b.m12057a()) {
            if (this.f12130d == -1 || this.f12131e == -1) {
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                this.f12130d = displayMetrics.widthPixels / 2;
                this.f12131e = displayMetrics.heightPixels / 2;
            }
            int i10 = this.f12130d;
            if (i10 == -1) {
                i10 = 960;
            }
            int i11 = this.f12131e;
            if (i11 == -1) {
                i11 = 540;
            }
            c1596k = (C1596k) c1596k.mo46b0(i10, i11);
        }
        ((C1596k) c1596k.mo63m(EnumC4971b.PREFER_RGB_565)).m7363B0(new C4919a(this));
    }

    /* renamed from: c */
    public void m12061c() {
        if (!TextUtils.isEmpty(this.f12129c)) {
            return;
        }
        ComponentCallbacks2C1586c.m7283v(this).m7380e(this);
        String str = this.f12127a;
        if (str == null) {
            setBackgroundDrawable(AbstractC7026c.m27111a(getContext(), this.f12128b));
            return;
        }
        AdInfo m24561M = C6156m.f24180a.m24561M(str, "picture");
        if (m24561M != null && m24561M.getUrl() != null) {
            m12060d(m24561M.getUrl());
        } else {
            setBackgroundDrawable(AbstractC7026c.m27111a(getContext(), this.f12128b));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setColumnUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f12129c)) {
                this.f12129c = str;
                m12061c();
                return;
            }
            return;
        }
        this.f12129c = str;
        m12060d(str);
    }
}
