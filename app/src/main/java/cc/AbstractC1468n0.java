package cc;

import android.provider.Settings;
import android.text.TextUtils;
import p201k2.AbstractC5093j;
import p287pb.AbstractApplicationC6253c;

/* renamed from: cc.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC1468n0 {

    /* renamed from: a */
    private static String f5646a = "";

    /* renamed from: b */
    private static String f5647b = "";

    /* renamed from: c */
    private static volatile String f5648c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0 = r4.substring(r4.indexOf("sunxi_serial") + 12).replaceAll(":", "").replaceAll(" ", "").trim();
        cc.AbstractC1468n0.f5647b = r0;
        cc.AbstractC1468n0.f5647b = cc.AbstractC1459j.m6799d(r0, "combrasiltvaslgklxckbcombrasiltv");
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007e -> B:22:0x0081). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6893a() {
        /*
            java.lang.String r0 = "sunxi_serial"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            java.lang.String r3 = ""
            if (r1 >= r2) goto L17
            k2.m r1 = p201k2.C5096m.f20979a
            java.lang.String r1 = r1.m20690a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L17
            return r3
        L17:
            java.lang.String r1 = cc.AbstractC1468n0.f5647b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        L22:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r4 = "cat /sys/class/sunxi_info/sys_info"
            java.lang.Process r1 = r2.exec(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r3     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L3d:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r4 == 0) goto L6d
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r5 == 0) goto L3d
            int r0 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r0 = r0 + 12
            java.lang.String r0 = r4.substring(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = ":"
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = " "
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = "combrasiltvaslgklxckbcombrasiltv"
            java.lang.String r0 = cc.AbstractC1459j.m6799d(r0, r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L6d:
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L71:
            r0 = move-exception
            goto L84
        L73:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L81
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r0 = move-exception
            r0.printStackTrace()
        L81:
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        L84:
            if (r1 == 0) goto L8e
            r1.destroy()     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            r1.printStackTrace()
        L8e:
            goto L90
        L8f:
            throw r0
        L90:
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.AbstractC1468n0.m6893a():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0 = r4.substring(r4.indexOf("Serial") + 6).replaceAll(":", "").replaceAll(" ", "").trim();
        cc.AbstractC1468n0.f5647b = r0;
        cc.AbstractC1468n0.f5647b = cc.AbstractC1459j.m6799d(r0, "combrasiltvaslgklxckbcombrasiltv");
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007e -> B:22:0x0081). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6894b() {
        /*
            java.lang.String r0 = "Serial"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            java.lang.String r3 = ""
            if (r1 >= r2) goto L17
            k2.m r1 = p201k2.C5096m.f20979a
            java.lang.String r1 = r1.m20690a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L17
            return r3
        L17:
            java.lang.String r1 = cc.AbstractC1468n0.f5647b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        L22:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r4 = "cat /proc/cpu_chipid"
            java.lang.Process r1 = r2.exec(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r3     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L3d:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r4 == 0) goto L6d
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r5 == 0) goto L3d
            int r0 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r0 = r0 + 6
            java.lang.String r0 = r4.substring(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = ":"
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = " "
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = "combrasiltvaslgklxckbcombrasiltv"
            java.lang.String r0 = cc.AbstractC1459j.m6799d(r0, r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L6d:
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L71:
            r0 = move-exception
            goto L84
        L73:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L81
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r0 = move-exception
            r0.printStackTrace()
        L81:
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        L84:
            if (r1 == 0) goto L8e
            r1.destroy()     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            r1.printStackTrace()
        L8e:
            goto L90
        L8f:
            throw r0
        L90:
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.AbstractC1468n0.m6894b():java.lang.String");
    }

    /* renamed from: c */
    public static String m6895c() {
        if (!TextUtils.isEmpty(f5646a)) {
            return f5646a;
        }
        String string = Settings.System.getString(AbstractApplicationC6253c.f24485c.getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(string)) {
            f5646a = string;
        } else {
            f5646a = AbstractC1459j.m6799d("4b4d354a69546a7636736d2f73776a2b705834316d3874536576774470327448", "combrasiltvaslgklxckbcombrasiltv");
        }
        return f5646a;
    }

    /* renamed from: d */
    public static String m6896d() {
        if (f5648c == null) {
            synchronized (AbstractC1468n0.class) {
                if (f5648c == null) {
                    f5648c = "";
                    f5648c = AbstractC1459j.m6799d(AbstractC5093j.m20678j(), "combrasiltvaslgklxckbcombrasiltv");
                }
            }
        }
        return f5648c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0 = r4.substring(r4.indexOf("Serial") + 6).replaceAll(":", "").replaceAll(" ", "").trim();
        cc.AbstractC1468n0.f5647b = r0;
        cc.AbstractC1468n0.f5647b = cc.AbstractC1459j.m6799d(r0, "combrasiltvaslgklxckbcombrasiltv");
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007e -> B:22:0x0081). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6897e() {
        /*
            java.lang.String r0 = "Serial"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            java.lang.String r3 = ""
            if (r1 >= r2) goto L17
            k2.m r1 = p201k2.C5096m.f20979a
            java.lang.String r1 = r1.m20690a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L17
            return r3
        L17:
            java.lang.String r1 = cc.AbstractC1468n0.f5647b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        L22:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r4 = "cat proc/cpuinfo"
            java.lang.Process r1 = r2.exec(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r3     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L3d:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r4 == 0) goto L6d
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r5 == 0) goto L3d
            int r0 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r0 = r0 + 6
            java.lang.String r0 = r4.substring(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = ":"
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = " "
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = "combrasiltvaslgklxckbcombrasiltv"
            java.lang.String r0 = cc.AbstractC1459j.m6799d(r0, r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            cc.AbstractC1468n0.f5647b = r0     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
        L6d:
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L71:
            r0 = move-exception
            goto La0
        L73:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L81
            r1.destroy()     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r0 = move-exception
            r0.printStackTrace()
        L81:
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8f
            java.lang.String r0 = m6893a()
            cc.AbstractC1468n0.f5647b = r0
        L8f:
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9d
            java.lang.String r0 = m6894b()
            cc.AbstractC1468n0.f5647b = r0
        L9d:
            java.lang.String r0 = cc.AbstractC1468n0.f5647b
            return r0
        La0:
            if (r1 == 0) goto Laa
            r1.destroy()     // Catch: java.lang.Exception -> La6
            goto Laa
        La6:
            r1 = move-exception
            r1.printStackTrace()
        Laa:
            goto Lac
        Lab:
            throw r0
        Lac:
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.AbstractC1468n0.m6897e():java.lang.String");
    }

    /* renamed from: f */
    public static void m6898f() {
        m6896d();
    }
}
