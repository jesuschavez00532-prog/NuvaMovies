package com.widget.custom;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* loaded from: classes3.dex */
public class FixedSpeedOverScroller extends OverScroller {
    private int mDuration;

    public FixedSpeedOverScroller(Context context) {
        super(context);
        this.mDuration = 500;
    }

    public int getScrollDuration() {
        return this.mDuration;
    }

    public void setScrollDuration(int i10) {
        this.mDuration = i10;
    }

    @Override // android.widget.OverScroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, this.mDuration);
    }

    @Override // android.widget.OverScroller
    public void startScroll(int i10, int i11, int i12, int i13) {
        super.startScroll(i10, i11, i12, i13, this.mDuration);
    }

    public FixedSpeedOverScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mDuration = 500;
    }
}
