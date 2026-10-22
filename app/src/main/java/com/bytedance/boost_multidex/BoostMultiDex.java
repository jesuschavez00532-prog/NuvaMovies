package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class BoostMultiDex {
    public static Result install(Context context) {
        return install(context, null);
    }

    public static boolean isOptimizeProcess(String str) {
        return Utility.isOptimizeProcess(str);
    }

    private static boolean isVMCapable(String str) {
        boolean z10 = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        Monitor monitor = Monitor.get();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VM with version ");
        sb2.append(str);
        sb2.append(z10 ? " has support" : " does not have support");
        monitor.logInfo(sb2.toString());
        return z10;
    }

    public static Result install(Context context, Monitor monitor) {
        ApplicationInfo applicationInfo;
        Monitor.init(monitor);
        Monitor monitor2 = Monitor.get();
        monitor2.logInfo("BoostMultiDex is installing, version is 1.0.1");
        if (isVMCapable(System.getProperty("java.vm.version"))) {
            monitor2.logInfo("BoostMultiDex support library is disabled for VM capable");
            return null;
        }
        Result result = Result.get();
        try {
            applicationInfo = context.getApplicationInfo();
        } catch (Throwable th) {
            monitor2.logError("BoostMultiDex installation failure", th);
            result.setFatalThrowable(th);
        }
        if (applicationInfo == null) {
            throw new RuntimeException("ApplicationInfo is NULL.");
        }
        File file = new File(applicationInfo.sourceDir);
        String processName = monitor2.getProcessName();
        if (processName == null) {
            processName = Utility.getCurProcessName(context);
        }
        if (Utility.isOptimizeProcess(processName)) {
            new DexInstallProcessor().doInstallationInOptProcess(context, file);
            return null;
        }
        new DexInstallProcessor().doInstallation(context, file, result);
        monitor2.logInfo("install done");
        return result;
    }
}
