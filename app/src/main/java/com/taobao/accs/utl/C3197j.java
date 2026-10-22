package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.taobao.accs.IProcessName;
import com.taobao.accs.client.C3131a;
import com.umeng.message.entity.UMessage;
import com.umeng.p079ut.device.UTDevice;
import java.io.File;

/* renamed from: com.taobao.accs.utl.j */
/* loaded from: classes.dex */
public class C3197j {

    /* renamed from: a */
    private static String f13200a = "";

    /* renamed from: b */
    private static String f13201b = "";

    /* renamed from: c */
    private static boolean f13202c = true;
    public static final String channelService = "com.taobao.accs.ChannelService";

    /* renamed from: d */
    private static boolean f13203d = false;
    public static final String msgService = "com.taobao.accs.data.MsgDistributeService";

    /* renamed from: a */
    public static boolean m13005a(Context context) {
        String str;
        if (f13203d) {
            return f13202c;
        }
        try {
            if (TextUtils.isEmpty(C3131a.f12859c)) {
                if (TextUtils.isEmpty(f13200a)) {
                    f13200a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                }
                str = f13200a;
            } else {
                str = C3131a.f12859c;
            }
            if (TextUtils.isEmpty(f13201b)) {
                f13201b = m13003a(context, Process.myPid());
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(f13201b)) {
                f13202c = str.equalsIgnoreCase(f13201b);
                f13203d = true;
            }
        } catch (Throwable th) {
            ALog.m12939e("AdapterUtilityImpl", "isMainProcess", th, new Object[0]);
        }
        return f13202c;
    }

    /* renamed from: b */
    public static String m13007b(Context context) {
        return UTDevice.getUtdid(context);
    }

    /* renamed from: c */
    public static String m13008c(Context context) {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).areNotificationsEnabled();
                return String.valueOf(areNotificationsEnabled);
            } catch (Throwable th) {
                ALog.m12939e("AdapterUtilityImpl", "Android above 7.0 isNotificationEnabled", th, new Object[0]);
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i10 = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                boolean z10 = true;
                if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i10), packageName)).intValue() != 0) {
                    z10 = false;
                }
                return String.valueOf(z10);
            } catch (Throwable th2) {
                ALog.m12939e("AdapterUtilityImpl", "isNotificationEnabled", th2, new Object[0]);
            }
        }
        return "unknown";
    }

    /* renamed from: a */
    public static String m13003a(Context context, int i10) {
        IProcessName iProcessName = C3131a.f12861e;
        if (iProcessName != null) {
            return iProcessName.getCurrProcessName();
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C3131a.m12732a(context).m12735a().getRunningAppProcesses()) {
            try {
                if (runningAppProcessInfo.pid == i10) {
                    str = runningAppProcessInfo.processName;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* renamed from: a */
    public static long m13002a() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1L;
            }
            return dataDirectory.getUsableSpace();
        } catch (Throwable th) {
            ALog.m12939e("AdapterUtilityImpl", "getUsableSpace", th, new Object[0]);
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m13004a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append("\n");
                }
            }
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static boolean m13006a(String str, int i10) {
        if (str == null) {
            return false;
        }
        try {
            StatFs statFs = new StatFs(str);
            int blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("st.getAvailableBlocks()=");
            sb2.append(statFs.getAvailableBlocks());
            sb2.append(",st.getAvailableBlocks() * blockSize=");
            long j10 = blockSize;
            sb2.append(statFs.getAvailableBlocks() * j10);
            ALog.m12938d("FileCheckUtils", sb2.toString(), new Object[0]);
            return statFs.getAvailableBlocks() > 10 && availableBlocks * j10 > ((long) i10);
        } catch (Throwable unused) {
            return false;
        }
    }
}
