package com.umeng.p079ut.p084b.p087b;

import android.content.Context;
import com.umeng.p079ut.p080a.C3742a;

/* renamed from: com.umeng.ut.b.b.c */
/* loaded from: classes3.dex */
public class C3764c {
    public static String getTid(Context context) {
        if (context == null) {
            return null;
        }
        return C3765d.m15978a(context).m15994m();
    }

    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        C3742a.m15925a().m15930a(context);
        return C3762a.m15971a().getUtdid(context);
    }

    public static boolean isNewDid(Context context) {
        if (context == null) {
            return false;
        }
        return C3765d.m15978a(context).m15992d();
    }

    public static void removeTid(Context context) {
        if (context == null) {
            return;
        }
        C3765d.m15978a(context).m15993f();
    }

    public static void resetDid(Context context, String str, long j10) {
        if (context == null) {
            return;
        }
        C3765d.m15978a(context).m15990a(str, j10);
    }
}
