package p041c9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;

/* renamed from: c9.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1438g {
    /* renamed from: a */
    private static String m6697a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m6698b(Context context) {
        return m6699c(context, null);
    }

    /* renamed from: c */
    public static String m6699c(Context context, String str) {
        C1433b m6700d = m6700d(context);
        if (m6700d == null) {
            return str;
        }
        return m6700d.m6687a();
    }

    /* renamed from: d */
    public static C1433b m6700d(Context context) {
        String m6697a = m6697a(context);
        if (TextUtils.isEmpty(m6697a)) {
            return null;
        }
        return AbstractC1434c.m6688a(new File(m6697a));
    }
}
