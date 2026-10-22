package com.umeng.pagesdk;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.ProcessUtil;

/* renamed from: com.umeng.pagesdk.e */
/* loaded from: classes3.dex */
public final class C3717e {
    /* renamed from: a */
    public static boolean m15878a(Context context) {
        try {
            String currentProcessName = ProcessUtil.getCurrentProcessName();
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName)) {
                return false;
            }
            return currentProcessName.equals(packageName);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
