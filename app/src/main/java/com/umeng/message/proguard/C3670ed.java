package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/* renamed from: com.umeng.message.proguard.ed */
/* loaded from: classes3.dex */
public final class C3670ed {
    /* renamed from: a */
    public static int m15728a(float f10) {
        return Math.round(Resources.getSystem().getDisplayMetrics().density * f10);
    }

    /* renamed from: a */
    public static Point m15729a(Context context) {
        Point point = new Point();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        } catch (Throwable unused) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        return point;
    }

    /* renamed from: a */
    public static float m15727a(Point point) {
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            return ((float) Math.round(Math.sqrt(Math.pow(point.x / displayMetrics.xdpi, 2.0d) + Math.pow(point.y / displayMetrics.ydpi, 2.0d)) * 100.0d)) / 100.0f;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public static boolean m15730a(Activity activity) {
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            Point m15729a = m15729a((Context) activity);
            return width != m15729a.x && height <= (m15729a.y * 2) / 3;
        }
        throw new IllegalArgumentException("activity cant be null!");
    }
}
