package me.jessyan.autosize.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import anet.channel.strategy.dispatch.DispatchConstants;

/* loaded from: classes3.dex */
public class ScreenUtils {
    private ScreenUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static int getHeightOfNavigationBar(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return 0;
        }
        return getRawScreenSize(context)[1] - getScreenSize(context)[1];
    }

    public static int[] getRawScreenSize(Context context) {
        int[] iArr = new int[2];
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i10 = point.x;
            i11 = point.y;
        } catch (Exception unused) {
        }
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public static int[] getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int getStatusBarHeight() {
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
            if (identifier <= 0) {
                return 0;
            }
            return Resources.getSystem().getDimensionPixelSize(identifier);
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
