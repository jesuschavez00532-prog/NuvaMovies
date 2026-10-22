package Andoid.google;

import android.graphics.drawable.GradientDrawable;
import np.dcc.protect.EntryPoint;

/* loaded from: classes.dex */
public class CustomBackground extends GradientDrawable {
    static {
        EntryPoint.stub(20);
    }

    private native void setSupportRTL(boolean z10);

    private native void useTint(int i10);

    public native CustomBackground getDrawable(int i10, int i11);

    public CustomBackground() {
        useTint(-1);
        setSupportRTL(false);
    }
}
