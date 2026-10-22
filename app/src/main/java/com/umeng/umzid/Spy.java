package com.umeng.umzid;

import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
public class Spy {
    public static boolean initSuccess;

    static {
        try {
            System.loadLibrary("umeng-spy");
            initSuccess = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String getID() {
        if (initSuccess) {
            return getNativeID(Build.VERSION.SDK_INT >= 29);
        }
        return null;
    }

    public static native String getNativeID(boolean z10);

    public static native String getNativeLibraryVersion();

    public static native String getNativeTag(boolean z10, boolean z11, boolean z12);

    public static synchronized String getTag(Context context) {
        boolean m15924j;
        String nativeTag;
        synchronized (Spy.class) {
            if (context != null) {
                try {
                    m15924j = C3741d.m15924j(context);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                m15924j = false;
            }
            nativeTag = getNativeTag(m15924j, context != null ? C3741d.m15923i(context) : false, Build.VERSION.SDK_INT >= 29);
        }
        return nativeTag;
    }

    public static String getVersion() {
        if (initSuccess) {
            return getNativeLibraryVersion();
        }
        return null;
    }
}
