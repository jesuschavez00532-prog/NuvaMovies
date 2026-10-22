package p194jb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import p134fc.AbstractC4305b;

/* renamed from: jb.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5047b {
    /* renamed from: a */
    public static String m20499a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AbstractC4305b.m18076a(str, str2);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static int m20500b(Context context) {
        try {
            PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
