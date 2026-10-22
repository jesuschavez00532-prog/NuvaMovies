package com.umeng.message.proguard;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.p079ut.device.UTDevice;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.umeng.message.proguard.d */
/* loaded from: classes3.dex */
public final class C3637d {

    /* renamed from: a */
    public static String f16279a;

    /* renamed from: b */
    public static String f16280b;

    /* renamed from: c */
    public static String f16281c;

    /* renamed from: d */
    private static String f16282d;

    /* renamed from: e */
    private static Boolean f16283e;

    /* renamed from: f */
    private static Boolean f16284f;

    /* renamed from: g */
    private static String f16285g;

    /* renamed from: h */
    private static Boolean f16286h;

    /* renamed from: a */
    public static String m15596a(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    /* renamed from: b */
    public static String m15600b(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    /* renamed from: c */
    public static String m15601c() {
        return "02:00:00:00:00:00";
    }

    /* renamed from: d */
    public static String m15604d(Context context) {
        String m15627s;
        String str = "";
        try {
            m15627s = m15627s(context);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (TextUtils.isEmpty(m15627s)) {
                return "";
            }
            String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
            if (messageAppkey == null || messageAppkey.length() < 16) {
                return m15627s;
            }
            return C3593bk.m15427a(m15627s, messageAppkey.substring(0, 16), C3588bf.m15405a("bm1ldWcuZjkvT20rTDgyMw=="));
        } catch (Exception e11) {
            e = e11;
            str = m15627s;
            UPLog.m15196e("DeviceConfig", e);
            return str;
        }
    }

    /* renamed from: e */
    public static String m15606e(Context context) {
        return DeviceConfig.getAndroidId(context);
    }

    /* renamed from: f */
    public static String m15608f(Context context) {
        return UMUtils.MD5(m15627s(context));
    }

    /* renamed from: g */
    public static String[] m15610g(Context context) {
        return UMUtils.getNetworkAccessMode(context);
    }

    /* renamed from: h */
    public static boolean m15612h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return true;
        } catch (Throwable th) {
            UPLog.m15196e("DeviceConfig", th);
            return true;
        }
    }

    /* renamed from: i */
    public static int m15613i(Context context) {
        try {
            return Calendar.getInstance(m15628t(context)).getTimeZone().getRawOffset() / 3600000;
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            return 8;
        }
    }

    /* renamed from: j */
    public static String[] m15616j(Context context) {
        String[] strArr = new String[2];
        try {
            Locale m15628t = m15628t(context);
            strArr[0] = m15628t.getCountry();
            strArr[1] = m15628t.getLanguage();
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            return strArr;
        }
    }

    /* renamed from: k */
    public static String m15618k(Context context) {
        String uMId = UMUtils.getUMId(context);
        return uMId == null ? "" : uMId;
    }

    /* renamed from: l */
    public static String m15620l(Context context) {
        int i10;
        int i11;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i11 = m15594a(displayMetrics, "noncompatWidthPixels");
                i10 = m15594a(displayMetrics, "noncompatHeightPixels");
            } else {
                i10 = 0;
                i11 = -1;
            }
            if (i11 == -1 || i10 == -1) {
                i11 = displayMetrics.widthPixels;
                i10 = displayMetrics.heightPixels;
            }
            return i11 + Operator.Operation.MULTIPLY + i10;
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            return "Unknown";
        }
    }

    /* renamed from: m */
    public static String m15621m(Context context) {
        try {
            return UMUtils.getOperator(context);
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    /* renamed from: n */
    public static String m15622n(Context context) {
        String channelByXML = UMUtils.getChannelByXML(context);
        if (!TextUtils.isEmpty(channelByXML)) {
            return channelByXML;
        }
        return "Unknown";
    }

    /* renamed from: o */
    public static String m15623o(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable th) {
            UPLog.m15197e("DeviceConfig", "utdid failed! " + th.getMessage());
            return "";
        }
    }

    /* renamed from: p */
    public static String m15624p(Context context) {
        int m15625q = m15625q(context);
        if (m15625q == 0) {
            return Boolean.toString(false);
        }
        if (m15625q == 1) {
            return Boolean.toString(true);
        }
        return "unknown";
    }

    /* renamed from: q */
    public static int m15625q(Context context) {
        boolean areNotificationsEnabled;
        boolean z10;
        if (C3678f.m15752b()) {
            UPLog.m15198i("DeviceConfig", "silent mode disabled");
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).areNotificationsEnabled();
                if (!areNotificationsEnabled) {
                    return 0;
                }
                return 1;
            } catch (Throwable th) {
                UPLog.m15196e("DeviceConfig", th);
                return -1;
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return 0;
            }
            return 1;
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            return -1;
        }
    }

    /* renamed from: r */
    public static boolean m15626r(Context context) {
        if (C3678f.m15752b()) {
            UPLog.m15198i("DeviceConfig", "silent mode disabled");
            return false;
        }
        try {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            } else if (i10 >= 21) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            UPLog.m15196e("DeviceConfig", th);
            try {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts(Constants.KEY_PACKAGE, context.getPackageName(), null));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th2) {
                UPLog.m15196e("DeviceConfig", th2);
                return false;
            }
        }
    }

    /* renamed from: s */
    private static String m15627s(Context context) {
        if (!TextUtils.isEmpty(f16282d)) {
            return f16282d;
        }
        String imeiNew = DeviceConfig.getImeiNew(context);
        f16282d = imeiNew;
        if (!TextUtils.isEmpty(imeiNew)) {
            return f16282d;
        }
        String androidId = DeviceConfig.getAndroidId(context);
        f16282d = androidId;
        if (!TextUtils.isEmpty(androidId)) {
            return f16282d;
        }
        String serial = DeviceConfig.getSerial();
        f16282d = serial;
        if (TextUtils.isEmpty(serial)) {
            f16282d = "";
        }
        return f16282d;
    }

    /* renamed from: t */
    private static Locale m15628t(Context context) {
        Locale locale;
        try {
            Configuration configuration = new Configuration();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            locale = null;
        }
        if (locale == null) {
            return Locale.getDefault();
        }
        return locale;
    }

    /* renamed from: a */
    public static String m15595a() {
        return UMUtils.getCPU();
    }

    /* renamed from: b */
    public static String m15599b() {
        return DeviceConfig.getSerial();
    }

    /* renamed from: c */
    public static String m15602c(Context context) {
        String imeiNew;
        String str = "";
        try {
            imeiNew = DeviceConfig.getImeiNew(context);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (TextUtils.isEmpty(imeiNew)) {
                return "";
            }
            String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
            if (messageAppkey == null || messageAppkey.length() < 16) {
                return imeiNew;
            }
            return C3593bk.m15427a(imeiNew, messageAppkey.substring(0, 16), C3588bf.m15405a("bm1ldWcuZjkvT20rTDgyMw=="));
        } catch (Exception e11) {
            e = e11;
            str = imeiNew;
            UPLog.m15196e("DeviceConfig", e);
            return str;
        }
    }

    /* renamed from: e */
    public static String m15605e() {
        if (TextUtils.isEmpty(f16281c)) {
            f16281c = Build.BOARD;
        }
        return f16281c;
    }

    /* renamed from: f */
    public static String m15607f() {
        if (TextUtils.isEmpty(f16280b)) {
            String str = Build.BRAND;
            f16280b = str;
            if (TextUtils.isEmpty(str)) {
                f16280b = Build.MANUFACTURER;
            }
        }
        return f16280b;
    }

    /* renamed from: g */
    public static boolean m15609g() {
        String m15607f;
        Boolean bool = f16283e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            m15607f = m15607f();
        } catch (Throwable unused) {
        }
        if ("huawei".equalsIgnoreCase(m15607f)) {
            f16283e = Boolean.TRUE;
            return true;
        }
        if (UPushThirdTokenCallback.TYPE_HONOR.equalsIgnoreCase(m15607f)) {
            f16283e = Boolean.TRUE;
            return true;
        }
        f16283e = Boolean.FALSE;
        return false;
    }

    /* renamed from: k */
    public static String m15617k() {
        return m15598a("debug.umeng.push");
    }

    /* renamed from: a */
    public static String m15597a(Context context, String str) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
            if (string != null) {
                return string.trim();
            }
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
        }
        UPLog.m15200w("DeviceConfig", String.format("Could not read meta-data %s from AndroidManifest.xml.", str));
        return null;
    }

    /* renamed from: h */
    public static boolean m15611h() {
        Boolean bool = f16284f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ("vivo".equalsIgnoreCase(m15607f())) {
            f16284f = Boolean.TRUE;
            return true;
        }
        String m15619l = m15619l();
        if (TextUtils.isEmpty(m15619l)) {
            f16284f = Boolean.FALSE;
            return false;
        }
        if (m15619l.startsWith("OriginOS") || m15619l.startsWith("Funtouch")) {
            f16284f = Boolean.TRUE;
            return true;
        }
        f16284f = Boolean.FALSE;
        return false;
    }

    /* renamed from: i */
    public static boolean m15614i() {
        Boolean bool = f16286h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Boolean valueOf = Boolean.valueOf("harmony".equalsIgnoreCase((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            f16286h = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            f16286h = Boolean.FALSE;
            return false;
        }
    }

    /* renamed from: j */
    public static String m15615j() {
        return m15598a("hw_sc.build.platform.version");
    }

    /* renamed from: a */
    private static int m15594a(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Exception e10) {
            UPLog.m15196e("DeviceConfig", e10);
            return -1;
        }
    }

    /* renamed from: d */
    public static String m15603d() {
        if (TextUtils.isEmpty(f16279a)) {
            f16279a = Build.MODEL;
        }
        return f16279a;
    }

    /* renamed from: l */
    private static String m15619l() {
        String str = f16285g;
        if (str != null) {
            return str;
        }
        if (!"vivo".equalsIgnoreCase(m15607f())) {
            f16285g = "";
            return "";
        }
        String m15598a = m15598a("ro.vivo.os.build.display.id");
        f16285g = m15598a;
        if (!TextUtils.isEmpty(m15598a)) {
            return f16285g;
        }
        String m15598a2 = m15598a("ro.iqoo.os.build.display.id");
        f16285g = m15598a2;
        if (!TextUtils.isEmpty(m15598a2)) {
            return f16285g;
        }
        f16285g = "";
        return "";
    }

    /* renamed from: a */
    private static String m15598a(String str) {
        try {
            return (String) C3596bn.m15433a("android.os.SystemProperties", "get", new Class[]{String.class}, null, new Object[]{str});
        } catch (Throwable unused) {
            return "";
        }
    }
}
