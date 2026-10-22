package com.alibaba.sdk.android.utils.crashdefend;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.e */
/* loaded from: classes.dex */
class C1573e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        if (r0 == null) goto L37;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7260a(android.content.Context r8, com.alibaba.sdk.android.utils.crashdefend.C1569a r9, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C1571c> r10) {
        /*
            if (r8 != 0) goto L3
            return
        L3:
            monitor-enter(r10)
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            if (r9 == 0) goto L13
            java.lang.String r2 = "startSerialNumber"
            long r3 = r9.f6060a     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
        L13:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r9.<init>()     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.util.Iterator r2 = r10.iterator()     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
        L1c:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            com.alibaba.sdk.android.utils.crashdefend.c r3 = (com.alibaba.sdk.android.utils.crashdefend.C1571c) r3     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            if (r3 == 0) goto L1c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.<init>()     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "sdkId"
            java.lang.String r6 = r3.f6074a     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "sdkVersion"
            java.lang.String r6 = r3.f6077b     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "crashLimit"
            int r6 = r3.f6071a     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "crashCount"
            int r6 = r3.crashCount     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "waitTime"
            int r6 = r3.f6075b     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "registerSerialNumber"
            long r6 = r3.f6076b     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "startSerialNumber"
            long r6 = r3.f6072a     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r5 = "restoreCount"
            int r3 = r3.f6078c     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r4.put(r5, r3)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r9.put(r4)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            goto L1c
        L6b:
            java.lang.String r2 = "sdkList"
            r1.put(r2, r9)     // Catch: org.json.JSONException -> L71 java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            goto L79
        L71:
            r9 = move-exception
            java.lang.String r2 = "CrashUtils"
            java.lang.String r3 = "save sdk json fail:"
            android.util.Log.w(r2, r3, r9)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
        L79:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            boolean r1 = m7261a(r8)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r2 = 0
            if (r1 == 0) goto L8c
            java.lang.String r1 = "com_alibaba_aliyun_crash_defend_sdk_info"
            java.io.FileOutputStream r8 = r8.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
        L8a:
            r0 = r8
            goto La6
        L8c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r3 = "com_alibaba_aliyun_crash_defend_sdk_info_"
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r3 = m7259a(r8)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            java.io.FileOutputStream r8 = r8.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            goto L8a
        La6:
            byte[] r8 = r9.getBytes()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
            r0.write(r8)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3 java.io.IOException -> Lbe
        Lad:
            r0.close()     // Catch: java.io.IOException -> Lc9 java.lang.Throwable -> Ld1
            goto Lc9
        Lb1:
            r8 = move-exception
            goto Lcb
        Lb3:
            r8 = move-exception
            java.lang.String r9 = "CrashUtils"
            java.lang.String r1 = "save sdk exception:"
            android.util.Log.w(r9, r1, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto Lc9
            goto Lad
        Lbe:
            r8 = move-exception
            java.lang.String r9 = "CrashUtils"
            java.lang.String r1 = "save sdk io fail:"
            android.util.Log.w(r9, r1, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto Lc9
            goto Lad
        Lc9:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ld1
            return
        Lcb:
            if (r0 == 0) goto Ld0
            r0.close()     // Catch: java.io.IOException -> Ld0 java.lang.Throwable -> Ld1
        Ld0:
            throw r8     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r8 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld4:
            throw r8
        Ld5:
            goto Ld4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C1573e.m7260a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):void");
    }

    /* renamed from: b */
    private static String m7263b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* renamed from: c */
    private static String m7264c(Context context) {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, context.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e10) {
            Log.d("CrashUtils", "getProcessNameByActivityThread error: " + e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[Catch: all -> 0x0123, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {, blocks: (B:19:0x0047, B:22:0x0082, B:24:0x0088, B:27:0x008a, B:28:0x00a4, B:30:0x00aa, B:32:0x00b0, B:34:0x0103, B:40:0x011a, B:46:0x010a, B:44:0x0113, B:64:0x011f, B:62:0x0122, B:10:0x000c, B:12:0x0012, B:14:0x0034, B:15:0x0038, B:17:0x003e, B:48:0x001a, B:57:0x004f, B:53:0x005a, B:50:0x0065), top: B:9:0x000c, inners: #8, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m7262a(android.content.Context r9, com.alibaba.sdk.android.utils.crashdefend.C1569a r10, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C1571c> r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C1573e.m7262a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):boolean");
    }

    /* renamed from: a */
    private static boolean m7261a(Context context) {
        return context.getPackageName().equalsIgnoreCase(m7259a(context));
    }

    /* renamed from: a */
    private static String m7259a(Context context) {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        String m7264c = m7264c(context);
        if (!TextUtils.isEmpty(m7264c)) {
            return m7264c;
        }
        String m7258a = m7258a();
        return !TextUtils.isEmpty(m7258a) ? m7258a : m7263b(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.StringBuilder] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m7258a() {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.append(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            if (r0 == 0) goto L3e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L73
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L73
            r6 = r1
            r1 = r0
            r0 = r6
            goto L3f
        L3c:
            r2 = move-exception
            goto L52
        L3e:
            r0 = r1
        L3f:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r1 = move-exception
            r1.printStackTrace()
        L49:
            r1 = r0
            goto L72
        L4b:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L74
        L50:
            r2 = move-exception
            r0 = r1
        L52:
            java.lang.String r3 = "CrashUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "getProcessNameByPid error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L73
            r4.append(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L73
            android.util.Log.d(r3, r2)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L72
            r0.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            return r1
        L73:
            r1 = move-exception
        L74:
            if (r0 == 0) goto L7e
            r0.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r0.printStackTrace()
        L7e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C1573e.m7258a():java.lang.String");
    }
}
