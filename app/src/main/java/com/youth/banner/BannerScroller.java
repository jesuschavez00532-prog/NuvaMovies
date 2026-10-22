package com.youth.banner;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes3.dex */
public class BannerScroller extends Scroller {
    private int mDuration;

    public BannerScroller(Context context) {
        super(context);
        this.mDuration = 800;
    }

    public void setDuration(int i10) {
        this.mDuration = i10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, this.mDuration);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13) {
        super.startScroll(i10, i11, i12, i13, this.mDuration);
    }

    public BannerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mDuration = 800;
    }

    public BannerScroller(Context context, Interpolator interpolator, boolean z10) {
        super(context, interpolator, z10);
        this.mDuration = 800;
    }
}
