package com.widget.utils;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class DrawUtils {
    public static Path addRoundPath3(int i10, int i11, float f10) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), f10, f10, Path.Direction.CW);
        return path;
    }
}
