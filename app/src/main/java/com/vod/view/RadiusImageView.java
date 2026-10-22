package com.vod.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0439r;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p387wd.C7394a;

/* loaded from: classes3.dex */
public final class RadiusImageView extends C0439r {

    /* renamed from: c */
    private boolean f17473c;

    /* renamed from: d */
    private final C7394a f17474d;

    /* renamed from: e */
    public Map f17475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17475e = new LinkedHashMap();
        this.f17474d = new C7394a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.draw(canvas);
        if (isFocused() || this.f17473c) {
            this.f17474d.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17474d.setBounds(0, 0, i10, i11);
    }

    public final void setForceFocus(boolean z10) {
        this.f17473c = z10;
        invalidate();
    }
}
