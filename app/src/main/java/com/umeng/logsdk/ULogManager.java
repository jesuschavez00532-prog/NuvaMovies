package com.umeng.logsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.common.Constants;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ULogManager {
    public static final String TAG = "CodeLogManager";

    /* renamed from: a */
    private static Context f15726a = null;

    /* renamed from: b */
    private static ULogConfigManager f15727b = null;

    /* renamed from: c */
    private static EfsReporter f15728c = null;

    /* renamed from: d */
    private static boolean f15729d = false;

    /* renamed from: e */
    private static String f15730e = "";

    /* renamed from: f */
    private static String f15731f = "";

    /* renamed from: h */
    private static long f15733h = 0;

    /* renamed from: i */
    private static long f15734i = 0;
    public static boolean isDebug = true;

    /* renamed from: g */
    private static JSONArray f15732g = new JSONArray();

    /* renamed from: j */
    private static Handler f15735j = new Handler(Looper.getMainLooper()) { // from class: com.umeng.logsdk.ULogManager.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 0) {
                ULogManager.m15143a(message);
            } else {
                if (i10 != 1) {
                    return;
                }
                ULogManager.m15148e();
            }
        }
    };

    /* renamed from: k */
    private static int f15736k = 0;

    /* renamed from: b */
    static /* synthetic */ int m15144b() {
        int i10 = f15736k;
        f15736k = i10 + 1;
        return i10;
    }

    /* renamed from: d */
    static /* synthetic */ int m15146d() {
        int i10 = f15736k;
        f15736k = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15148e() {
        /*
            org.json.JSONArray r0 = com.umeng.logsdk.ULogManager.f15732g
            int r0 = r0.length()
            if (r0 <= 0) goto L89
            long r0 = java.lang.System.currentTimeMillis()
            com.umeng.logsdk.ULogManager.f15734i = r0
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "taskid"
            java.lang.String r2 = ""
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "status"
            r2 = 0
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "time_start"
            long r2 = com.umeng.logsdk.ULogManager.f15733h     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "time_end"
            long r2 = com.umeng.logsdk.ULogManager.f15734i     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "uid"
            java.lang.String r2 = getUserID()     // Catch: java.lang.Throwable -> L51
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = com.umeng.logsdk.C3529c.m15155b(r2)     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "did"
            java.lang.String r2 = getDeviceID()     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "body"
            org.json.JSONArray r2 = com.umeng.logsdk.ULogManager.f15732g     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r0 = move-exception
            goto L57
        L53:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L57:
            r0.printStackTrace()
        L5a:
            if (r1 == 0) goto L89
            com.efs.sdk.base.protocol.record.EfsJSONLog r0 = new com.efs.sdk.base.protocol.record.EfsJSONLog
            java.lang.String r2 = "codelogperf"
            r0.<init>(r2)
            long r2 = com.umeng.logsdk.ULogManager.f15733h
            r0.setLogBeginTime(r2)
            long r2 = com.umeng.logsdk.ULogManager.f15734i
            r0.setLogEndTime(r2)
            java.lang.String r2 = "codelog"
            r0.put(r2, r1)
            com.efs.sdk.base.EfsReporter r1 = getReporter()
            if (r1 == 0) goto L89
            java.lang.String r2 = "CodeLogManager"
            java.lang.String r3 = "upload and send."
            android.util.Log.i(r2, r3)
            r1.send(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.umeng.logsdk.ULogManager.f15732g = r0
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.logsdk.ULogManager.m15148e():void");
    }

    public static String getDeviceID() {
        return f15730e;
    }

    public static EfsReporter getReporter() {
        return f15728c;
    }

    public static ULogConfigManager getULogConfigManager() {
        return f15727b;
    }

    public static String getUserID() {
        return f15731f;
    }

    /* renamed from: i */
    public static void m15150i(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 2;
        Bundle bundle = new Bundle();
        bundle.putString(Progress.TAG, str);
        bundle.putString(Constants.SHARED_MESSAGE_ID_FILE, str2);
        message.setData(bundle);
        f15735j.sendMessage(message);
    }

    public static void init(Context context, EfsReporter efsReporter) {
        try {
            Log.i(TAG, "begin init code log.");
            if (context != null && efsReporter != null) {
                if (isInit()) {
                    if (isDebug) {
                        Log.e(TAG, "invalid init ！");
                        return;
                    }
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                f15726a = applicationContext;
                f15728c = efsReporter;
                f15727b = new ULogConfigManager(applicationContext, efsReporter);
                registerActivityCallback(context);
                f15729d = true;
                if (isDebug) {
                    Log.i(TAG, "finish init code log.");
                    return;
                }
                return;
            }
            if (isDebug) {
                Log.e(TAG, "init code log manager error! parameter is null!");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isInit() {
        return f15729d;
    }

    public static void registerActivityCallback(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.logsdk.ULogManager.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    ULogManager.m15144b();
                    if (ULogManager.f15736k == 1) {
                        Log.i(ULogManager.TAG, "code log. listener front.");
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    ULogManager.m15146d();
                    if (ULogManager.f15736k == 0) {
                        Log.i(ULogManager.TAG, "code log. listener background.");
                        ULogManager.m15148e();
                    }
                }
            });
        }
    }

    public static void setDeviceID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            f15730e = str;
        } else if (isDebug) {
            Log.e(TAG, "device id over length!");
        }
    }

    public static void setUserID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            f15731f = C3529c.m15154a(str.getBytes());
        } else if (isDebug) {
            Log.e(TAG, "user id over length!");
        }
    }

    /* renamed from: v */
    public static void m15151v(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 0;
        Bundle bundle = new Bundle();
        bundle.putString(Progress.TAG, str);
        bundle.putString(Constants.SHARED_MESSAGE_ID_FILE, str2);
        message.setData(bundle);
        f15735j.sendMessage(message);
    }

    /* renamed from: w */
    public static void m15152w(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 3;
        Bundle bundle = new Bundle();
        bundle.putString(Progress.TAG, str);
        bundle.putString(Constants.SHARED_MESSAGE_ID_FILE, str2);
        message.setData(bundle);
        f15735j.sendMessage(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m15143a(android.os.Message r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.logsdk.ULogManager.m15143a(android.os.Message):void");
    }

    /* renamed from: d */
    public static void m15147d(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 1;
        Bundle bundle = new Bundle();
        bundle.putString(Progress.TAG, str);
        bundle.putString(Constants.SHARED_MESSAGE_ID_FILE, str2);
        message.setData(bundle);
        f15735j.sendMessage(message);
    }

    /* renamed from: e */
    public static void m15149e(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 4;
        Bundle bundle = new Bundle();
        bundle.putString(Progress.TAG, str);
        bundle.putString(Constants.SHARED_MESSAGE_ID_FILE, str2);
        message.setData(bundle);
        f15735j.sendMessage(message);
    }
}
