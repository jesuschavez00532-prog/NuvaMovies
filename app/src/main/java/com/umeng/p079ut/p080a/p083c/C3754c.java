package com.umeng.p079ut.p080a.p083c;

import android.content.Context;
import com.umeng.commonsdk.framework.UMFrUtils;

/* renamed from: com.umeng.ut.a.c.c */
/* loaded from: classes3.dex */
public class C3754c {
    /* renamed from: b */
    public static boolean m15946b(Context context) {
        if (context != null) {
            try {
                return UMFrUtils.isOnline(context);
            } catch (Throwable th) {
                C3756e.m15953a("", th, new Object[0]);
                return true;
            }
        }
        return true;
    }
}
