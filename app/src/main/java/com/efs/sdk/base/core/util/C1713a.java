package com.efs.sdk.base.core.util;

import android.content.Context;
import java.io.File;

/* renamed from: com.efs.sdk.base.core.util.a */
/* loaded from: classes.dex */
public class C1713a {

    /* renamed from: a */
    private static String f7191a = "efs";

    /* renamed from: b */
    private static File f7192b;

    /* renamed from: a */
    public static void m7743a(String str) {
        f7191a = str;
    }

    /* renamed from: b */
    public static File m7744b(Context context, String str) {
        return new File(m7752j(context, str), "efs_config");
    }

    /* renamed from: c */
    public static File m7745c(Context context, String str) {
        return new File(m7752j(context, str), "efs_flow");
    }

    /* renamed from: d */
    public static File m7746d(Context context, String str) {
        File file = new File(m7752j(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    public static File m7747e(Context context, String str) {
        File file = new File(m7752j(context, str), "ready_codelog");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static File m7748f(Context context, String str) {
        File file = new File(m7746d(context, str), String.valueOf(ProcessUtil.myPid()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    public static File m7749g(Context context, String str) {
        File file = new File(m7747e(context, str), String.valueOf(ProcessUtil.myPid()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: h */
    public static File m7750h(Context context, String str) {
        File file = new File(m7752j(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: i */
    public static File m7751i(Context context, String str) {
        File file = new File(m7752j(context, str), "upload_codelog");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: j */
    private static File m7752j(Context context, String str) {
        if (f7192b == null) {
            synchronized (C1713a.class) {
                if (f7192b == null) {
                    f7192b = m7741a(context);
                }
            }
        }
        File file = new File(f7192b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static File m7741a(Context context) {
        File dir = context.getDir(f7191a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: a */
    public static File m7742a(Context context, String str) {
        return new File(m7752j(context, str), "efs_cst");
    }
}
