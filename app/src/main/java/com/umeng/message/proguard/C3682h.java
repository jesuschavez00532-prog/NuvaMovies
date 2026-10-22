package com.umeng.message.proguard;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.umeng.message.proguard.h */
/* loaded from: classes3.dex */
public final class C3682h {

    /* renamed from: a */
    private static String f16517a;

    /* renamed from: a */
    public static Uri m15767a(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(m15772f(context));
        builder.path("MsgAlias");
        return builder.build();
    }

    /* renamed from: b */
    public static Uri m15768b(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(m15772f(context));
        builder.path("MsgAliasDeleteAll");
        return builder.build();
    }

    /* renamed from: c */
    public static Uri m15769c(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(m15772f(context));
        builder.path("sp");
        return builder.build();
    }

    /* renamed from: d */
    public static Uri m15770d(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(m15772f(context));
        builder.path("MsgLogStores");
        return builder.build();
    }

    /* renamed from: e */
    public static Uri m15771e(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(m15772f(context));
        builder.path("InAppLogStores");
        return builder.build();
    }

    /* renamed from: f */
    public static String m15772f(Context context) {
        if (f16517a == null) {
            f16517a = context.getPackageName() + ".umeng.message";
        }
        return f16517a;
    }
}
