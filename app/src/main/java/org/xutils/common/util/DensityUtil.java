package org.xutils.common.util;

import org.xutils.C6127x;

/* loaded from: classes3.dex */
public final class DensityUtil {
    private static float density = -1.0f;
    private static int heightPixels = -1;
    private static int widthPixels = -1;

    private DensityUtil() {
    }

    public static int dip2px(float f10) {
        return (int) ((f10 * getDensity()) + 0.5f);
    }

    public static float getDensity() {
        if (density <= 0.0f) {
            density = C6127x.app().getResources().getDisplayMetrics().density;
        }
        return density;
    }

    public static int getScreenHeight() {
        if (heightPixels <= 0) {
            heightPixels = C6127x.app().getResources().getDisplayMetrics().heightPixels;
        }
        return heightPixels;
    }

    public static int getScreenWidth() {
        if (widthPixels <= 0) {
            widthPixels = C6127x.app().getResources().getDisplayMetrics().widthPixels;
        }
        return widthPixels;
    }

    public static int px2dip(float f10) {
        return (int) ((f10 / getDensity()) + 0.5f);
    }
}
