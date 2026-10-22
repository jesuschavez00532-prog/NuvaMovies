package com.umeng.message.common;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3581b;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3697p;
import com.umeng.message.proguard.C3698q;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UPLog {
    /* renamed from: a */
    private static String m15193a(String str) {
        return TextUtils.isEmpty(str) ? "UPush" : "UPush.".concat(String.valueOf(str));
    }

    /* renamed from: d */
    public static void m15195d(String str, Object... objArr) {
        C3698q.m15801a().mo4520d(m15193a(str), m15194a(objArr));
    }

    /* renamed from: e */
    public static void m15197e(String str, Object... objArr) {
        C3698q.m15801a().mo4521e(m15193a(str), m15194a(objArr));
    }

    public static String getStackTrace(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* renamed from: i */
    public static void m15198i(String str, Object... objArr) {
        C3698q.m15801a().mo4523i(m15193a(str), m15194a(objArr));
    }

    public static boolean isEnable() {
        return C3698q.m15801a().f16574a;
    }

    public static void setEnable(boolean z10) {
        C3698q.m15801a().f16574a = z10;
    }

    public static void upload() {
        C3698q m15801a = C3698q.m15801a();
        if (C3678f.f16510b) {
            final C3697p c3697p = m15801a.f16575b;
            if (!c3697p.f16554b) {
                final C3697p.b bVar = new C3697p.b();
                C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.p.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10;
                        long j10;
                        Application m15840a = C3706y.m15840a();
                        if (!UMUtils.isMainProgress(m15840a)) {
                            return;
                        }
                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
                        String m15169c = messageSharedPrefs.m15169c();
                        if (TextUtils.isEmpty(m15169c)) {
                            UPLog.m15195d("Log", "init skipped.");
                            return;
                        }
                        String m15179l = messageSharedPrefs.m15179l();
                        String m15606e = C3637d.m15606e(m15840a);
                        if (TextUtils.isEmpty(m15179l) && TextUtils.isEmpty(m15606e)) {
                            UPLog.m15195d("Log", "id skipped.");
                            return;
                        }
                        if (!messageSharedPrefs.m15164a("l_u_q")) {
                            UPLog.m15198i("Log", "req skipped.");
                            return;
                        }
                        JSONObject m15797a = b.m15797a(m15169c, m15179l, m15606e);
                        long j11 = 86400;
                        if (m15797a != null) {
                            z10 = m15797a.optBoolean("enable");
                            j11 = Math.max(60L, m15797a.optLong(C3325bt.f14236ba, 86400L));
                        } else {
                            z10 = false;
                        }
                        boolean m15180m = messageSharedPrefs.m15180m();
                        messageSharedPrefs.f15770b.m15398a("l_u_e", z10);
                        messageSharedPrefs.m15159a("l_u_q", j11);
                        if (z10) {
                            Runnable runnable = new Runnable() { // from class: com.umeng.message.proguard.p.b.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        b bVar2 = b.this;
                                        Application m15840a2 = C3706y.m15840a();
                                        File file = new File(m15840a2.getFilesDir(), ".upush_log");
                                        File file2 = new File(file, new SimpleDateFormat("yyMMddHHmmssSSS", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
                                        try {
                                            bVar2.m15799a(file, file2);
                                            if (file2.length() < 512) {
                                                UPLog.m15198i("Log", "len small skipped! ", Long.valueOf(file2.length()));
                                                return;
                                            }
                                            if (file2.length() > 1048576) {
                                                UPLog.m15198i("Log", "len large skipped! ", Long.valueOf(file2.length()));
                                                return;
                                            }
                                            String messageAppkey = PushAgent.getInstance(m15840a2).getMessageAppkey();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("appkey", messageAppkey);
                                            jSONObject.put("utdid", C3637d.m15623o(m15840a2));
                                            jSONObject.put(C3325bt.f14265g, C3637d.m15618k(m15840a2));
                                            jSONObject.put("device_token", PushAgent.getInstance(m15840a2).getRegistrationId());
                                            jSONObject.put("md5", UMUtils.getFileMD5(file2));
                                            jSONObject.put("ts", System.currentTimeMillis());
                                            jSONObject.put("app_v", C3637d.m15600b(m15840a2));
                                            jSONObject.put("sdk_v", MsgConstant.SDK_VERSION);
                                            jSONObject.put("os_v", Build.VERSION.RELEASE);
                                            jSONObject.put(Constants.KEY_BRAND, C3637d.m15607f());
                                            jSONObject.put(Constants.KEY_MODEL, C3637d.m15603d());
                                            jSONObject.put("android_id", C3637d.m15606e(m15840a2));
                                            jSONObject.put(C3325bt.f14220al, UMUtils.getZid(m15840a2));
                                            jSONObject.put("os_i", Build.VERSION.SDK_INT);
                                            C3680g.m15763a(jSONObject, "https://offmsg.umeng.com/log/upload", messageAppkey, file2);
                                        } catch (Throwable th) {
                                            try {
                                                UPLog.m15198i("Log", UPLog.getStackTrace(th));
                                            } finally {
                                                C3595bm.m15430a(file2.getPath());
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        UPLog.m15198i("Log", UPLog.getStackTrace(th2));
                                    }
                                }
                            };
                            if (m15180m) {
                                j10 = 0;
                            } else {
                                j10 = 1;
                            }
                            C3581b.m15376b(runnable, j10, TimeUnit.MINUTES);
                        } else {
                            UPLog.m15198i("Log", "enable skipped.");
                        }
                        c3697p.f16553a = Boolean.valueOf(z10);
                    }
                });
                c3697p.f16554b = true;
            }
        }
    }

    /* renamed from: w */
    public static void m15200w(String str, Object... objArr) {
        C3698q.m15801a().mo4524w(m15193a(str), m15194a(objArr));
    }

    /* renamed from: e */
    public static void m15196e(String str, Throwable th) {
        C3698q.m15801a().mo4521e(m15193a(str), getStackTrace(th));
    }

    /* renamed from: w */
    public static void m15199w(String str, Throwable th) {
        C3698q.m15801a().mo4524w(m15193a(str), getStackTrace(th));
    }

    /* renamed from: a */
    private static String m15194a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(objArr[0]);
        for (int i10 = 1; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                sb2.append(" ");
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }
}
