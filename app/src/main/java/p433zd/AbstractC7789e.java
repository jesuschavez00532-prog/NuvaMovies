package p433zd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import anet.channel.strategy.dispatch.DispatchConstants;

/* renamed from: zd.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7789e {
    /* renamed from: a */
    public static int[] m30171a(Context context, boolean z10) {
        int[] iArr = new int[2];
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (!z10) {
            iArr[0] = i10;
            iArr[1] = i11 - m30172b(context);
            return iArr;
        }
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

    /* renamed from: b */
    public static int m30172b(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
            if (identifier <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
