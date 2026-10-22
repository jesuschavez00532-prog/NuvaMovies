package com.bytedance.boost_multidex;

import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class BoostNative {
    private static volatile boolean alreadyInit;
    private static boolean supportFastLoadDex;

    static {
        Monitor.get().loadLibrary(Constants.BOOST_MULTIDEX_DIR_NAME);
    }

    BoostNative() {
    }

    private static void checkSupportFastLoad(Result result) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            int i10 = Build.VERSION.SDK_INT;
            String str = (String) declaredMethod.invoke(null, "persist.sys.dalvik.vm.lib", null);
            result.vmLibName = str;
            Monitor.get().logInfo("VM lib is " + str);
            if ("libart.so".equals(str)) {
                Monitor.get().logWarning("VM lib is art, skip!");
                return;
            }
            String str2 = (String) declaredMethod.invoke(null, "ro.yunos.version", null);
            if ((str2 == null || str2.isEmpty()) && !new File(Constants.LIB_YUNOS_PATH).exists()) {
                boolean initialize = initialize(i10, RuntimeException.class);
                supportFastLoadDex = initialize;
                result.supportFastLoadDex = initialize;
                return;
            }
            result.isYunOS = true;
            Monitor.get().logWarning("Yun os is " + str2 + ", skip boost!");
        } catch (Throwable th) {
            result.addUnFatalThrowable(th);
            Monitor.get().logWarning("Fail to init", th);
        }
    }

    private static native boolean initialize(int i10, Class<RuntimeException> cls);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized boolean isSupportFastLoad() {
        boolean z10;
        synchronized (BoostNative.class) {
            if (!alreadyInit) {
                checkSupportFastLoad(Result.get());
                alreadyInit = true;
            }
            z10 = supportFastLoadDex;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native Object loadDirectDex(String str, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean makeOptDexFile(String str, String str2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long obtainCheckSum(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void recoverAction();
}
