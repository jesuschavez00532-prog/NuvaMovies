package p007a6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p077uc.crashsdk.export.LogType;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.ccg.C3417a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p395x5.C7503f;

/* renamed from: a6.g */
/* loaded from: classes.dex */
public abstract class AbstractC0074g {

    /* renamed from: a */
    private static final char[] f203a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f204b = -1;

    /* renamed from: a6.g$a */
    /* loaded from: classes.dex */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: k */
        private static final Map f215k;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f215k = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        /* renamed from: a */
        static a m277a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C7503f.m28716f().m28723i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f215k.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }
    }

    /* renamed from: A */
    public static boolean m248A(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: B */
    public static String m249B(String str) {
        return m270t(str, "SHA-1");
    }

    /* renamed from: C */
    public static String m250C(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* renamed from: a */
    public static long m251a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m252b(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    /* renamed from: c */
    public static boolean m253c(Context context) {
        if (!m254d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m254d(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m255e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                C7503f.m28716f().m28720e(str, e10);
            }
        }
    }

    /* renamed from: f */
    public static void m256f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m257g(String str, String str2, int i10) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    /* renamed from: h */
    public static String m258h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(Operator.Operation.MINUS, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String sb3 = sb2.toString();
        if (sb3.length() <= 0) {
            return null;
        }
        return m249B(sb3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3[1];
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m259i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r3 == 0) goto L36
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r2 = r6
        L36:
            m255e(r1, r0)
            goto L5f
        L3a:
            r7 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5b
        L3e:
            r7 = move-exception
            r1 = r2
        L40:
            x5.f r3 = p395x5.C7503f.m28716f()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.m28720e(r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L36
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            m255e(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.AbstractC0074g.m259i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m260j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m261k(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m267q = m267q(context, str, "bool");
            if (m267q > 0) {
                return resources.getBoolean(m267q);
            }
            int m267q2 = m267q(context, str, "string");
            if (m267q2 > 0) {
                return Boolean.parseBoolean(context.getString(m267q2));
            }
        }
        return z10;
    }

    /* renamed from: l */
    public static int m262l() {
        return a.m277a().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: m */
    public static int m263m() {
        boolean m275y = m275y();
        Object r02 = m275y;
        if (m276z()) {
            r02 = (m275y ? 1 : 0) | 2;
        }
        if (m274x()) {
            return r02 | 4;
        }
        return r02;
    }

    /* renamed from: n */
    public static String m264n(Context context) {
        int m267q = m267q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m267q == 0) {
            m267q = m267q(context, "com.crashlytics.android.build_id", "string");
        }
        if (m267q != 0) {
            return context.getResources().getString(m267q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m265o(Context context) {
        if (m275y() || ((SensorManager) context.getSystemService(C3325bt.f14211ac)).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static String m266p(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i10);
                if (DispatchConstants.ANDROID.equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    /* renamed from: q */
    public static int m267q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m266p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m268r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m269s() {
        long j10;
        long m257g;
        synchronized (AbstractC0074g.class) {
            if (f204b == -1) {
                String m259i = m259i(new File("/proc/meminfo"), "MemTotal");
                long j11 = 0;
                if (!TextUtils.isEmpty(m259i)) {
                    String upperCase = m259i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            m257g = m257g(upperCase, "KB", EventType.AUTH_FAIL);
                        } else if (upperCase.endsWith("MB")) {
                            m257g = m257g(upperCase, "MB", LogType.ANR);
                        } else if (upperCase.endsWith("GB")) {
                            m257g = m257g(upperCase, "GB", 1073741824);
                        } else {
                            C7503f.m28716f().m28725k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                        j11 = m257g;
                    } catch (NumberFormatException e10) {
                        C7503f.m28716f().m28720e("Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                }
                f204b = j11;
            }
            j10 = f204b;
        }
        return j10;
    }

    /* renamed from: t */
    private static String m270t(String str, String str2) {
        return m271u(str.getBytes(), str2);
    }

    /* renamed from: u */
    private static String m271u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m272v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            C7503f.m28716f().m28720e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    /* renamed from: v */
    public static String m272v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f203a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m273w(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m274x() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m275y() {
        if (!Build.PRODUCT.contains(C3417a.f14999u)) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m276z() {
        boolean m275y = m275y();
        String str = Build.TAGS;
        if ((!m275y && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!m275y && file.exists()) {
            return true;
        }
        return false;
    }
}
