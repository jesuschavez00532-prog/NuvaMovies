package com.widget.bridge;

/* loaded from: classes3.dex */
public abstract class BaseEffectHelper {
    protected boolean isCalibration = true;
    protected boolean isHideFirstBridge = true;
    protected int mFinalHeight;
    protected int mFinalWidth;
    protected int mFinalX;
    protected int mFinalY;

    public abstract void calibrationBorder();

    public void setCalibration() {
        this.isCalibration = true;
    }

    public void setFocusViewLocation(int i10, int i11) {
        this.mFinalX = i10;
        this.mFinalY = i11;
    }

    public void setFocusViewSize(int i10, int i11) {
        this.mFinalWidth = i10;
        this.mFinalHeight = i11;
    }

    public void setHideFirstBridge() {
        this.isHideFirstBridge = true;
    }
}
