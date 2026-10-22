package com.umeng.p079ut.p080a.p083c;

import android.content.Context;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.ut.a.c.a */
/* loaded from: classes3.dex */
public class C3752a {
    /* renamed from: a */
    public static boolean m15940a(Context context) {
        try {
            return UMUtils.isMainProgress(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }
}
