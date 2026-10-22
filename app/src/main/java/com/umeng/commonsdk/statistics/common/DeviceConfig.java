package com.umeng.commonsdk.statistics.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import anet.channel.entity.EventType;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p077uc.crashsdk.export.LogType;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3279aa;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.C3491c;
import com.umeng.commonsdk.statistics.idtracking.C3497i;
import com.umeng.commonsdk.utils.C3518b;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.entity.UMessage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import javax.microedition.khronos.opengles.GL10;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    private static volatile String sWifiMac = "";
    private static volatile String sImei = "";
    private static volatile String sMeid = "";
    private static volatile String sImsi = "";
    private static volatile String sSerialNo = "";
    private static volatile String sAndroidID = "";
    private static volatile String sIDFA = "";
    private static volatile String sOAID = "";
    private static volatile String sHonorOAID = "";
    private static volatile String sSecondImei = "";
    private static volatile String sSimSerialNumber = "";
    private static volatile boolean hasReadImeiOrMeid = false;
    private static volatile boolean hasReadSimSerialNumber = false;
    private static volatile boolean hasReadIMEI2 = false;
    private static volatile boolean hasReadSerialNo = false;
    private static volatile boolean hasReadAndroidID = false;
    private static volatile boolean hasReadMac = false;
    private static volatile boolean hasReadImsi = false;
    private static volatile boolean hasReadOAID = false;
    private static volatile boolean hasReadHonorOAID = false;
    private static volatile boolean hasReadIDFA = false;
    private static volatile String sAppName = "";
    private static volatile String sAppPkgName = "";
    private static volatile boolean hasReadOperator = false;
    private static volatile String sOperator = "";
    private static volatile boolean hasReadOperatorName = false;
    private static volatile String sOperatorName = "";
    private static volatile String sCustomAgt = "";

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            String hexString = Integer.toHexString(bArr[i10]);
            int length = hexString.length();
            if (length == 1) {
                hexString = MessageService.MSG_DB_READY_REPORT + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb2.append(hexString.toUpperCase(Locale.getDefault()));
            if (i10 < bArr.length - 1) {
                sb2.append(':');
            }
        }
        return sb2.toString();
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static String getAndroidId(Context context) {
        if (!UMConfigure.shouldCollectAid()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read aid.");
            return null;
        }
        if (!TextUtils.isEmpty(sAndroidID)) {
            return sAndroidID;
        }
        if (hasReadAndroidID) {
            return null;
        }
        if (FieldManager.allow(C3520d.f15687i) && context != null) {
            try {
                try {
                    sAndroidID = Settings.Secure.getString(context.getContentResolver(), "android_id");
                } finally {
                    hasReadAndroidID = true;
                }
            } catch (Throwable unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m14783w("can't read android id");
                }
            }
        }
        return sAndroidID;
    }

    public static String getAppHashKey(Context context) {
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, getPackageName(context), 64);
            if (m15117a != null) {
                Signature[] signatureArr = m15117a.signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                    messageDigest.update(signature.toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 0).trim();
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, getPackageName(context), 64);
            if (m15117a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(m15117a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppName(Context context) {
        if (!TextUtils.isEmpty(sAppName)) {
            return sAppName;
        }
        if (context == null) {
            return null;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, context.getPackageName(), 64);
            if (m15117a != null) {
                sAppName = m15117a.applicationInfo.loadLabel(context.getPackageManager()).toString();
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m14773i(LOG_TAG, th);
            }
        }
        return sAppName;
    }

    public static String getAppSHA1Key(Context context) {
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, getPackageName(context), 64);
            if (m15117a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(m15117a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String getApplicationLable(Context context) {
        if (context == null) {
            return "";
        }
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    private static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Throwable unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return properties;
        }
        return properties;
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, EventType.AUTH_FAIL);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MLog.m14766e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e10) {
            MLog.m14766e(LOG_TAG, "Could not open file /proc/cpuinfo", e10);
        }
        if (str != null) {
            return str.substring(str.indexOf(58) + 1).trim();
        }
        return "";
    }

    public static String getCustomAgt() {
        if (!TextUtils.isEmpty(sCustomAgt)) {
            return sCustomAgt;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Dalvik/");
        sb2.append(System.getProperty("java.vm.version"));
        sb2.append(" (Linux; U; Android ");
        sb2.append(")");
        sCustomAgt = sb2.toString();
        return sCustomAgt;
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdForBox(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                if (FieldManager.allow(C3520d.f15687i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.m14774i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    String macBySystemInterface = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.m14774i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface);
                    }
                    if (TextUtils.isEmpty(macBySystemInterface)) {
                        String serialNo = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(serialNo)) {
                            String imei = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                            return imei;
                        }
                        return serialNo;
                    }
                    return macBySystemInterface;
                }
                return str;
            }
            if (i10 == 23) {
                if (FieldManager.allow(C3520d.f15687i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.m14774i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    String macByJavaAPI = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum2;
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            macByJavaAPI = getMacShell();
                            deviceTypeEnum = deviceTypeEnum2;
                        } else {
                            macByJavaAPI = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum2;
                        }
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.m14774i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
                    }
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        String serialNo2 = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(serialNo2)) {
                            String imei2 = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                            return imei2;
                        }
                        return serialNo2;
                    }
                    return macByJavaAPI;
                }
                return str;
            }
            if (i10 >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(oaid)) {
                    String idfa = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(idfa)) {
                        String androidId = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(androidId)) {
                            String serialNo3 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(serialNo3)) {
                                String macByJavaAPI2 = getMacByJavaAPI();
                                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                                deviceTypeEnum = deviceTypeEnum3;
                                if (TextUtils.isEmpty(macByJavaAPI2)) {
                                    String macBySystemInterface2 = getMacBySystemInterface(context);
                                    deviceTypeEnum = deviceTypeEnum3;
                                    return macBySystemInterface2;
                                }
                                return macByJavaAPI2;
                            }
                            return serialNo3;
                        }
                        return androidId;
                    }
                    return idfa;
                }
                return oaid;
            }
            if (FieldManager.allow(C3520d.f15687i)) {
                str = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m14774i(LOG_TAG, "getDeviceId: ANDROID_ID: " + str);
                }
            }
            if (TextUtils.isEmpty(str)) {
                String serialNo4 = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                if (TextUtils.isEmpty(serialNo4)) {
                    String imei3 = getIMEI(context);
                    deviceTypeEnum = DeviceTypeEnum.IMEI;
                    if (TextUtils.isEmpty(imei3)) {
                        String macByJavaAPI3 = getMacByJavaAPI();
                        DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                        deviceTypeEnum = deviceTypeEnum4;
                        if (TextUtils.isEmpty(macByJavaAPI3)) {
                            String macBySystemInterface3 = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum4;
                            if (AnalyticsConstants.UM_DEBUG) {
                                MLog.m14774i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface3);
                                return macBySystemInterface3;
                            }
                            return macBySystemInterface3;
                        }
                        return macByJavaAPI3;
                    }
                    return imei3;
                }
                return serialNo4;
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDeviceIdForGeneral(Context context) {
        if (context == null) {
            return "";
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                String imei = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(imei)) {
                    boolean z10 = AnalyticsConstants.UM_DEBUG;
                    if (z10) {
                        MLog.m14786w(LOG_TAG, "No IMEI.");
                    }
                    String macBySystemInterface = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(macBySystemInterface)) {
                        if (FieldManager.allow(C3520d.f15687i)) {
                            macBySystemInterface = getAndroidId(context);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (z10) {
                                MLog.m14774i(LOG_TAG, "getDeviceId, ANDROID_ID: " + macBySystemInterface);
                            }
                        }
                        if (TextUtils.isEmpty(macBySystemInterface)) {
                            String serialNo = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            return serialNo;
                        }
                        return macBySystemInterface;
                    }
                    return macBySystemInterface;
                }
                return imei;
            }
            if (i10 == 23) {
                String imei2 = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(imei2)) {
                    String macByJavaAPI = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum2;
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            macByJavaAPI = getMacShell();
                            deviceTypeEnum = deviceTypeEnum2;
                        } else {
                            macByJavaAPI = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum2;
                        }
                    }
                    boolean z11 = AnalyticsConstants.UM_DEBUG;
                    if (z11) {
                        MLog.m14774i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
                    }
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (FieldManager.allow(C3520d.f15687i)) {
                            macByJavaAPI = getAndroidId(context);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (z11) {
                                MLog.m14774i(LOG_TAG, "getDeviceId, ANDROID_ID: " + macByJavaAPI);
                            }
                        }
                        if (TextUtils.isEmpty(macByJavaAPI)) {
                            String serialNo2 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            return serialNo2;
                        }
                        return macByJavaAPI;
                    }
                    return macByJavaAPI;
                }
                return imei2;
            }
            if (i10 >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(oaid)) {
                    String idfa = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(idfa)) {
                        String androidId = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(androidId)) {
                            String serialNo3 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(serialNo3)) {
                                String macByJavaAPI2 = getMacByJavaAPI();
                                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                                deviceTypeEnum = deviceTypeEnum3;
                                if (TextUtils.isEmpty(macByJavaAPI2)) {
                                    String macBySystemInterface2 = getMacBySystemInterface(context);
                                    deviceTypeEnum = deviceTypeEnum3;
                                    return macBySystemInterface2;
                                }
                                return macByJavaAPI2;
                            }
                            return serialNo3;
                        }
                        return androidId;
                    }
                    return idfa;
                }
                return oaid;
            }
            String imei3 = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            if (TextUtils.isEmpty(imei3)) {
                String serialNo4 = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                if (TextUtils.isEmpty(serialNo4)) {
                    if (FieldManager.allow(C3520d.f15687i)) {
                        serialNo4 = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.m14774i(LOG_TAG, "getDeviceId, ANDROID_ID: " + serialNo4);
                        }
                    }
                    if (TextUtils.isEmpty(serialNo4)) {
                        String macByJavaAPI3 = getMacByJavaAPI();
                        DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                        deviceTypeEnum = deviceTypeEnum4;
                        if (TextUtils.isEmpty(macByJavaAPI3)) {
                            String macBySystemInterface3 = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum4;
                            if (AnalyticsConstants.UM_DEBUG) {
                                MLog.m14774i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface3);
                                return macBySystemInterface3;
                            }
                            return macBySystemInterface3;
                        }
                        return macByJavaAPI3;
                    }
                    return serialNo4;
                }
                return serialNo4;
            }
            return imei3;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getDeviceType(Context context) {
        boolean z10;
        if (context == null) {
            return "Phone";
        }
        try {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return "Phone";
            }
            return "Tablet";
        } catch (Throwable unused) {
            return "Phone";
        }
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i10 = displayMetrics.widthPixels;
                return String.valueOf(displayMetrics.heightPixels) + Operator.Operation.MULTIPLY + String.valueOf(i10);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m14766e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    public static String getHonorOaid(Context context) {
        if (!UMConfigure.shouldCollectOaid()) {
            return "";
        }
        if (!TextUtils.isEmpty(sHonorOAID)) {
            return sHonorOAID;
        }
        if (hasReadHonorOAID) {
            return "";
        }
        if (FieldManager.allow(C3520d.f15636G)) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(C3491c.f15453a, 0);
                if (sharedPreferences != null) {
                    sHonorOAID = sharedPreferences.getString(C3491c.f15454b, "");
                }
            } catch (Throwable unused) {
            }
            hasReadHonorOAID = true;
        }
        return sHonorOAID;
    }

    private static String getIMEI(Context context) {
        String str = "";
        if (!UMConfigure.shouldCollectImei()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read IMEI.");
            return "";
        }
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        if (hasReadImeiOrMeid) {
            return "";
        }
        if (FieldManager.allow(C3520d.f15685g)) {
            if (context == null) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        String deviceId = telephonyManager.getDeviceId();
                        try {
                            if (AnalyticsConstants.UM_DEBUG) {
                                MLog.m14774i(LOG_TAG, "getDeviceId, IMEI: " + deviceId);
                            }
                            str = deviceId;
                        } catch (Throwable th) {
                            th = th;
                            str = deviceId;
                            try {
                                if (AnalyticsConstants.UM_DEBUG) {
                                    MLog.m14784w(LOG_TAG, "No IMEI.", th);
                                }
                                sImei = str;
                                return sImei;
                            } finally {
                                hasReadImeiOrMeid = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        sImei = str;
        return sImei;
    }

    public static String getIdfa(Context context) {
        if (!TextUtils.isEmpty(sIDFA)) {
            return sIDFA;
        }
        if (hasReadIDFA) {
            return "";
        }
        try {
            if (FieldManager.allow(C3520d.f15701w)) {
                sIDFA = C3484a.m14819a(context);
            }
        } catch (Throwable unused) {
        }
        hasReadIDFA = true;
        return sIDFA;
    }

    public static String getImei(Context context) {
        TelephonyManager telephonyManager;
        String str = null;
        if (!UMConfigure.shouldCollectImei()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read IMEI.");
            return null;
        }
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(C3520d.f15685g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getDeviceId();
            }
        } finally {
            try {
                sImei = str;
                return str;
            } finally {
            }
        }
        sImei = str;
        return str;
    }

    public static String getImeiNew(Context context) {
        TelephonyManager telephonyManager;
        String str = null;
        if (!UMConfigure.shouldCollectImei()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read IMEI.");
            return null;
        }
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(C3520d.f15685g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Method method = telephonyManager.getClass().getMethod("getImei", new Class[0]);
                        method.setAccessible(true);
                        str = (String) method.invoke(telephonyManager, new Object[0]);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = telephonyManager.getDeviceId();
                    }
                } else {
                    str = telephonyManager.getDeviceId();
                }
            }
        } finally {
            try {
                sImei = str;
                return str;
            } finally {
            }
        }
        sImei = str;
        return str;
    }

    public static String getImsi(Context context) {
        String str = null;
        if (!UMConfigure.shouldCollectImsi()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read IMSI.");
            return null;
        }
        if (!TextUtils.isEmpty(sImsi)) {
            return sImsi;
        }
        if (hasReadImsi || context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (FieldManager.allow(C3520d.f15668al)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
            hasReadImsi = true;
        }
        sImsi = str;
        return sImsi;
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.m14768e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            return Locale.getDefault();
        }
        return locale;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th) {
            MLog.m14766e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        if (getImsi(context) == null) {
            return null;
        }
        int i10 = context.getResources().getConfiguration().mcc;
        int i11 = context.getResources().getConfiguration().mnc;
        if (i10 != 0) {
            String valueOf = String.valueOf(i11);
            if (i11 < 10) {
                valueOf = String.format("%02d", Integer.valueOf(i11));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i10));
            stringBuffer.append(valueOf);
            return stringBuffer.toString();
        }
        return null;
    }

    public static String getMac(Context context) {
        return "";
    }

    @TargetApi(9)
    private static String getMacByJavaAPI() {
        return "";
    }

    private static String getMacBySystemInterface(Context context) {
        return "";
    }

    private static String getMacShell() {
        return "";
    }

    public static String getMeid(Context context) {
        String str = null;
        if (context == null || ((TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        if (FieldManager.allow(C3520d.f15669am)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    if (Build.VERSION.SDK_INT < 26) {
                        str = getIMEI(context);
                    } else {
                        str = meid(context);
                        if (TextUtils.isEmpty(str)) {
                            str = getIMEI(context);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            strArr[0] = "";
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            strArr[0] = "";
            return strArr;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "Wi-Fi";
            return strArr;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "2G/3G";
            strArr[1] = networkInfo2.getSubtypeName();
        }
        return strArr;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String, boolean] */
    public static String getNetworkOperatorName(Context context) {
        if (!TextUtils.isEmpty(sOperatorName)) {
            return sOperatorName;
        }
        if (hasReadOperatorName || context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            ?? checkPermission = checkPermission(context, "android.permission.READ_PHONE_STATE");
            if (checkPermission != 0 && telephonyManager != null) {
                sOperatorName = checkPermission;
            }
        } catch (Throwable unused) {
        }
        hasReadOperatorName = true;
        return sOperatorName;
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static String getNotificationStatus(Context context) {
        boolean areNotificationsEnabled;
        if (!FieldManager.allow(C3520d.f15639J)) {
            return "unknown";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).areNotificationsEnabled();
                return Boolean.toString(areNotificationsEnabled);
            } catch (Throwable unused) {
                return "unknown";
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            boolean z10 = false;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0) {
                z10 = true;
            }
            return Boolean.toString(z10);
        } catch (Throwable unused2) {
            return "unknown";
        }
    }

    public static String getOaid(Context context) {
        if (!UMConfigure.shouldCollectOaid()) {
            return "";
        }
        if (!TextUtils.isEmpty(sOAID)) {
            return sOAID;
        }
        if (hasReadOAID) {
            return "";
        }
        if (FieldManager.allow(C3520d.f15636G)) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(C3497i.f15477a, 0);
                if (sharedPreferences != null) {
                    sOAID = sharedPreferences.getString(C3497i.f15478b, "");
                }
            } catch (Throwable unused) {
            }
            hasReadOAID = true;
        }
        return sOAID;
    }

    public static String getPackageName(Context context) {
        if (!TextUtils.isEmpty(sAppPkgName)) {
            return sAppPkgName;
        }
        if (context == null) {
            return null;
        }
        sAppPkgName = context.getPackageName();
        return sAppPkgName;
    }

    public static int getRandNumber(int i10, int i11) {
        return new Random().nextInt((i11 - i10) + 1) + i10;
    }

    /*  JADX ERROR: MOVE_RESULT instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: MOVE_RESULT instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:698)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:612)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:498)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    public static java.lang.String getRegisteredOperator(android.content.Context r3) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            return r3
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperator
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            if (r3 != 0) goto L14
            return r1
        L14:
            r0 = 1
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2a
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r3 = checkPermission(r3, r2)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2a
            if (r1 == 0) goto L2a
            r3 = move-result     // Catch: java.lang.Throwable -> L2a
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator = r3     // Catch: java.lang.Throwable -> L2a
        L2a:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperator = r0
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getRegisteredOperator(android.content.Context):java.lang.String");
    }

    public static int[] getResolutionArray(Context context) {
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Method method = Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class);
                if (method != null) {
                    method.invoke(defaultDisplay, displayMetrics);
                    int i10 = displayMetrics.widthPixels;
                    int i11 = displayMetrics.heightPixels;
                    if (i10 > i11) {
                        iArr[0] = i11;
                        iArr[1] = i10;
                    } else {
                        iArr[0] = i10;
                        iArr[1] = i11;
                    }
                    iArr[0] = i10;
                    iArr[1] = i11;
                    return iArr;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static int getRingerMode(Context context) {
        if (!FieldManager.allow(C3520d.f15640K)) {
            return -1;
        }
        try {
            return ((AudioManager) context.getSystemService("audio")).getRingerMode();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getSecondSimIMEi(Context context) {
        return null;
    }

    public static String getSerial() {
        return getSerialNo();
    }

    @TargetApi(9)
    private static String getSerialNo() {
        return "";
    }

    public static String getSid(Context context) {
        return C3279aa.m13712a().m13727d(context);
    }

    public static String getSimICCID(Context context) {
        if (!UMConfigure.shouldCollectIccid()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "disallow read ICCID.");
            return null;
        }
        if (!TextUtils.isEmpty(sSimSerialNumber)) {
            return sSimSerialNumber;
        }
        if (hasReadSimSerialNumber) {
            return null;
        }
        if (FieldManager.allow(C3520d.f15672ap)) {
            if (context != null) {
                try {
                    if (UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            hasReadSimSerialNumber = true;
                            return null;
                        }
                        sSimSerialNumber = telephonyManager.getSimSerialNumber();
                    }
                } catch (Throwable unused) {
                }
            }
            hasReadSimSerialNumber = true;
        }
        return sSimSerialNumber;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                if (isFlyMe()) {
                    return "Flyme";
                }
                if (isEmui(buildProp)) {
                    return "Emui";
                }
                if (!TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                    return "YunOS";
                }
                return property;
            }
            return "MIUI";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                try {
                    if (isFlyMe()) {
                        property = getFlymeVersion(buildProp);
                    } else if (isEmui(buildProp)) {
                        property = getEmuiVersion(buildProp);
                    } else {
                        property = getYunOSVersion(buildProp);
                    }
                    return property;
                } catch (Throwable unused) {
                    return property;
                }
            }
            return property;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.m14772i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    private static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasOpsPermission(Context context) {
        if (!FieldManager.allow(C3520d.f15678av)) {
            return false;
        }
        try {
            if (((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), getPackageName(context)) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean hasRequestPermission(Context context, String str) {
        if (!FieldManager.allow(C3520d.f15678av)) {
            return false;
        }
        try {
            for (String str2 : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isChineseAera(Context context) {
        String imprintProperty;
        if (context == null) {
            return false;
        }
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(context, C3325bt.f14170O, "");
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(imprintProperty)) {
            if (!imprintProperty.equals("cn")) {
                return false;
            }
            return true;
        }
        if (getImsi(context) == null) {
            String str = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("cn")) {
                return true;
            }
        } else {
            int i10 = context.getResources().getConfiguration().mcc;
            if (i10 != 460 && i10 != 461) {
                if (i10 == 0) {
                    String str2 = getLocaleInfo(context)[0];
                    if (TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase("cn")) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isEmui(Properties properties) {
        if (properties.getProperty(KEY_EMUI_VERSION_CODE, null) == null) {
            return false;
        }
        return true;
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isHarmony(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", DispatchConstants.ANDROID)).equals("harmony");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isHonorDevice() {
        return Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isSystemApp(Context context) {
        if (!FieldManager.allow(C3520d.f15677au)) {
            return false;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, getPackageName(context), LogType.ANR);
            if (m15117a == null) {
                return false;
            }
            if ((m15117a.applicationInfo.flags & 1) == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    private static String meid(Context context) {
        if (!TextUtils.isEmpty(sMeid)) {
            return sMeid;
        }
        String str = null;
        if (hasReadImeiOrMeid || context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof String)) {
                str = (String) invoke;
            }
        } finally {
            try {
                hasReadImeiOrMeid = true;
                sMeid = str;
                return sMeid;
            } catch (Throwable th) {
            }
        }
        hasReadImeiOrMeid = true;
        sMeid = str;
        return sMeid;
    }

    private static String reaMac(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            fileReader = new FileReader(str);
        } catch (Throwable unused) {
        }
        try {
            bufferedReader = new BufferedReader(fileReader, EventType.AUTH_FAIL);
            try {
                str2 = bufferedReader.readLine();
                try {
                    fileReader.close();
                } catch (Throwable unused2) {
                }
                bufferedReader.close();
                return str2;
            } catch (Throwable th) {
                th = th;
                try {
                    fileReader.close();
                } catch (Throwable unused3) {
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
