package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.analytics.pro.bf */
/* loaded from: classes3.dex */
public class C3311bf {

    /* renamed from: a */
    private static InterfaceC3310be f14121a;

    /* renamed from: b */
    private static String f14122b;

    /* renamed from: c */
    private static boolean f14123c;

    /* renamed from: a */
    public static synchronized String m13866a(Context context) {
        synchronized (C3311bf.class) {
            if (!UMConfigure.shouldCollectOaid()) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** OpenDeviceId.getOAID(): oaid开关已关闭。");
                return null;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** real call OpenDeviceId.getOaid()");
            if (context == null) {
                return null;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            if (f14121a == null) {
                f14121a = C3313bh.m13878a();
            }
            InterfaceC3310be interfaceC3310be = f14121a;
            if (interfaceC3310be != null) {
                try {
                    String mo13865a = interfaceC3310be.mo13865a(context);
                    if (!TextUtils.isEmpty(mo13865a)) {
                        f14122b = mo13865a;
                    }
                    f14123c = true;
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "OpenDeviceId:getOAID() result: " + f14122b);
                    return f14122b;
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static String m13867b(Context context) {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** OpenDeviceId.getOAIDFromCache(): oaid开关已关闭。");
            return null;
        }
        if (f14123c) {
            return f14122b;
        }
        return m13866a(context);
    }

    @Deprecated
    /* renamed from: c */
    public static synchronized String m13868c(Context context) {
        synchronized (C3311bf.class) {
            if (UMConfigure.shouldCollectOaid()) {
                return null;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** OpenDeviceId.getHonorCompatibleOaid(): oaid开关已关闭。");
            return null;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static synchronized String m13869d(Context context) {
        synchronized (C3311bf.class) {
            if (UMConfigure.shouldCollectOaid()) {
                return null;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** OpenDeviceId.getHonorCompatibleOaidFromCache(): oaid开关已关闭。");
            return null;
        }
    }
}
