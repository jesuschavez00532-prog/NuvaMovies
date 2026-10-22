package com.umeng.message.proguard;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.ccg.CcgAgent;
import com.umeng.ccg.ConfigListener;
import com.umeng.ccg.ConfigResult;
import com.umeng.ccg.ConfigUpdateListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.p079ut.device.UTDevice;
import java.io.Closeable;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.f */
/* loaded from: classes3.dex */
public final class C3678f {

    /* renamed from: e */
    private static String f16513e;

    /* renamed from: f */
    private static Boolean f16514f;

    /* renamed from: g */
    private static Boolean f16515g;

    /* renamed from: d */
    private static final AtomicInteger f16512d = new AtomicInteger(1);

    /* renamed from: a */
    public static boolean f16509a = true;

    /* renamed from: b */
    public static boolean f16510b = true;

    /* renamed from: c */
    public static boolean f16511c = false;

    /* renamed from: a */
    public static void m15748a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m15753b(Context context) {
        Boolean bool = f16514f;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        Boolean valueOf = Boolean.valueOf(!TextUtils.isEmpty(packageName) && TextUtils.equals(m15743a(context), packageName));
        f16514f = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: c */
    public static boolean m15755c(Context context) {
        Boolean bool = null;
        try {
            bool = (Boolean) C3596bn.m15436a(C3596bn.m15438a(UTDevice.class.getName(), "isNewDid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
        }
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: d */
    public static String m15756d(Context context) {
        try {
            return (String) C3596bn.m15436a(C3596bn.m15438a(UTDevice.class.getName(), "getTid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
            return null;
        }
    }

    /* renamed from: e */
    public static void m15757e(Context context) {
        try {
            C3596bn.m15436a(C3596bn.m15438a(UTDevice.class.getName(), "removeTid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
        }
    }

    /* renamed from: f */
    public static boolean m15758f(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }

    /* renamed from: g */
    public static File m15759g(Context context) {
        File file = new File(context.getCacheDir(), "umeng_push");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static void m15746a(Context context, Class<?> cls) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && packageManager.getApplicationEnabledSetting(context.getPackageName()) >= 0) {
                ComponentName componentName = new ComponentName(context, cls);
                if (m15751a(packageManager, componentName)) {
                    return;
                }
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
        }
    }

    /* renamed from: b */
    public static boolean m15752b() {
        Boolean bool = f16515g;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = null;
        try {
            bool2 = (Boolean) C3596bn.m15436a(C3596bn.m15438a(UMConfigure.class.getName(), "isSilentMode", (Class<?>[]) new Class[0]), (Object) null, (Object[]) null);
        } catch (Throwable unused) {
        }
        Boolean valueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        f16515g = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: c */
    public static void m15754c() {
        boolean z10;
        try {
            CcgAgent.getConfigInfo(new ConfigResult() { // from class: com.umeng.message.proguard.f.1
                @Override // com.umeng.ccg.ConfigResult
                public final void onConfigInfo(JSONObject jSONObject) {
                    C3565ak.m15312a().mo15321a("get", jSONObject);
                }
            });
            CcgAgent.registerConfigUpdateListener(new ConfigUpdateListener() { // from class: com.umeng.message.proguard.f.2
                @Override // com.umeng.ccg.ConfigUpdateListener
                public final void onConfigUpdate(JSONObject jSONObject) {
                    C3565ak.m15312a().mo15321a("update", jSONObject);
                }
            });
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (!z10) {
            try {
                CcgAgent.registerConfigListener(new ConfigListener() { // from class: com.umeng.message.proguard.f.3
                    @Override // com.umeng.ccg.ConfigListener
                    public final void onConfigReady(JSONObject jSONObject) {
                        C3565ak.m15312a().mo15321a("init", jSONObject);
                    }
                });
            } catch (Throwable unused2) {
            }
        }
        try {
            UMConfigure.registerActionInfo(new C3700s());
            f16511c = true;
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    private static boolean m15751a(PackageManager packageManager, ComponentName componentName) {
        try {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            return componentEnabledSetting == 1 || componentEnabledSetting == 0;
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
            return false;
        }
    }

    /* renamed from: a */
    public static String m15743a(Context context) {
        if (!TextUtils.isEmpty(f16513e)) {
            return f16513e;
        }
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            }
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
        }
        if (TextUtils.isEmpty(str)) {
            str = UMFrUtils.getCurrentProcessName(context);
        }
        f16513e = str;
        return str;
    }

    /* renamed from: a */
    public static String m15744a(Context context, String str) {
        String str2 = context.getCacheDir() + "/umeng_push_inapp/";
        if (str == null) {
            return str2;
        }
        return str2 + str + Operator.Operation.DIVISION;
    }

    /* renamed from: a */
    public static int m15740a() {
        return View.generateViewId();
    }

    /* renamed from: a */
    public static void m15747a(Context context, String str, long j10) {
        try {
            C3596bn.m15436a(C3596bn.m15438a(UTDevice.class.getName(), "resetDid", (Class<?>[]) new Class[]{Context.class, String.class, Long.TYPE}), (Object) null, new Object[]{context, str, Long.valueOf(j10)});
        } catch (Throwable th) {
            UPLog.m15196e("Helper", th);
        }
    }

    /* renamed from: a */
    public static Object m15742a(Object obj, String str) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m15750a(long j10) {
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1);
        int i11 = calendar.get(6);
        calendar.setTimeInMillis(j10);
        return i11 == calendar.get(6) && i10 == calendar.get(1);
    }

    /* renamed from: a */
    public static Bitmap m15741a(File file, int i10, int i11) {
        try {
            if (i11 != 0 && i10 != 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                float f10 = i10 >= i11 ? options.outWidth / i10 : options.outHeight / i11;
                if (f10 < 1.0f) {
                    f10 = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) f10;
                return BitmapFactory.decodeFile(file.getPath(), options);
            }
            return BitmapFactory.decodeFile(file.getPath(), null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m15745a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1753817752:
                if (str.equals("NIOPUSH_TOKEN")) {
                    c10 = 0;
                    break;
                }
                break;
            case -663492951:
                if (str.equals("HW_TOKEN")) {
                    c10 = 1;
                    break;
                }
                break;
            case -79525514:
                if (str.equals("MI_TOKEN")) {
                    c10 = 2;
                    break;
                }
                break;
            case 102161:
                if (str.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM)) {
                    c10 = 3;
                    break;
                }
                break;
            case 385022372:
                if (str.equals("HONOR_TOKEN")) {
                    c10 = 4;
                    break;
                }
                break;
            case 676859002:
                if (str.equals("OPPO_TOKEN")) {
                    c10 = 5;
                    break;
                }
                break;
            case 935471238:
                if (str.equals("VIVO_TOKEN")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2123135175:
                if (str.equals("MZ_TOKEN")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return UPushThirdTokenCallback.TYPE_NIO;
            case 1:
                return "huawei";
            case 2:
                return "xiaomi";
            case 3:
                return UPushThirdTokenCallback.TYPE_FCM;
            case 4:
                return UPushThirdTokenCallback.TYPE_HONOR;
            case 5:
                return "oppo";
            case 6:
                return "vivo";
            case 7:
                return "meizu";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static void m15749a(boolean z10) {
        f16509a = z10;
        try {
            C3596bn.m15436a(C3596bn.m15438a(UMConfigure.class.getName(), "enableAplCollection", (Class<?>[]) new Class[]{Boolean.TYPE}), (Object) null, new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
        }
    }
}
