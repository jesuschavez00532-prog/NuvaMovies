package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.UUID;

/* renamed from: com.efs.sdk.base.core.util.c */
/* loaded from: classes.dex */
public class C1719c {

    /* renamed from: a */
    private static volatile String f7204a = "";

    /* renamed from: a */
    public static String m7766a(Context context) {
        if (TextUtils.isEmpty(f7204a)) {
            synchronized (C1719c.class) {
                if (TextUtils.isEmpty(f7204a)) {
                    String m7767b = m7767b(context);
                    f7204a = m7767b;
                    if (TextUtils.isEmpty(m7767b)) {
                        f7204a = m7768c(context);
                    }
                }
            }
        }
        return f7204a;
    }

    /* renamed from: b */
    private static String m7767b(Context context) {
        try {
            File file = new File(C1713a.m7741a(context), "efsid");
            if (!file.exists()) {
                return null;
            }
            return FileUtil.read(file);
        } catch (Exception e10) {
            Log.m7727e("efs.base", "get uuid error", e10);
            return null;
        }
    }

    /* renamed from: c */
    private static String m7768c(Context context) {
        String str = "";
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                str = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        }
        try {
            File m7741a = C1713a.m7741a(context);
            File file = new File(m7741a, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileUtil.write(file, str);
            if (file.renameTo(new File(m7741a, "efsid"))) {
                file.delete();
            }
        } catch (Exception e10) {
            Log.m7727e("efs.base", "save uuid '" + str + "' error", e10);
        }
        return str;
    }
}
