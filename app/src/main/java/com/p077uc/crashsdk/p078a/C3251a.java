package com.p077uc.crashsdk.p078a;

import android.util.Log;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3264g;
import com.p077uc.crashsdk.JNIBridge;

/* renamed from: com.uc.crashsdk.a.a */
/* loaded from: classes3.dex */
public final class C3251a {
    /* renamed from: a */
    public static void m13167a(String str) {
        if (C3264g.m13570P()) {
            Log.d("crashsdk", str);
        }
    }

    /* renamed from: b */
    public static void m13170b(String str) {
        if (C3264g.m13570P()) {
            Log.w("crashsdk", str);
        }
    }

    /* renamed from: c */
    public static void m13172c(String str, String str2) {
        if (C3259b.f13741d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m13173d(String str, String str2) {
        if (C3259b.f13741d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m13168a(String str, String str2) {
        if (C3264g.m13570P()) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m13171b(String str, String str2) {
        if (C3259b.f13741d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m13169a(String str, String str2, Throwable th) {
        if (C3264g.m13570P()) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
