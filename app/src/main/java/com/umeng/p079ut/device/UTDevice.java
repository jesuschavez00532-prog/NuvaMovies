package com.umeng.p079ut.device;

import android.content.Context;
import com.umeng.p079ut.p084b.p087b.C3764c;

/* loaded from: classes3.dex */
public class UTDevice {
    private static String getTid(Context context) {
        return C3764c.getTid(context);
    }

    public static String getUtdid(Context context) {
        return C3764c.getUtdid(context);
    }

    private static boolean isNewDid(Context context) {
        return C3764c.isNewDid(context);
    }

    private static void removeTid(Context context) {
        C3764c.removeTid(context);
    }

    private static void resetDid(Context context, String str, long j10) {
        C3764c.resetDid(context, str, j10);
    }
}
