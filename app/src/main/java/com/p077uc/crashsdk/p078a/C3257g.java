package com.p077uc.crashsdk.p078a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import anet.channel.bytes.C0905a;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3264g;
import com.p077uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3373dn;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: com.uc.crashsdk.a.g */
/* loaded from: classes3.dex */
public class C3257g {

    /* renamed from: a */
    static final /* synthetic */ boolean f13673a = true;

    /* renamed from: b */
    private static Context f13674b;

    /* renamed from: c */
    private static String f13675c;

    /* renamed from: d */
    private static String f13676d;

    /* renamed from: e */
    private static String f13677e;

    /* renamed from: f */
    private static String f13678f;

    /* renamed from: g */
    private static String f13679g;

    /* renamed from: h */
    private static boolean f13680h;

    /* renamed from: i */
    private static final Object f13681i = new Object();

    /* renamed from: j */
    private static final char[] f13682j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m13219a(File file, File file2) {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[C0905a.MAX_POOL_SIZE];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            m13218a(fileInputStream2);
                            m13218a(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m13218a(fileInputStream);
                        m13218a(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* renamed from: b */
    public static void m13228b(File file) {
        m13223a(file, "");
    }

    /* renamed from: c */
    public static String m13233c(File file) {
        String str = "";
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[256];
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    sb2.append(new String(bArr, 0, read));
                }
                str = sb2.toString();
                m13218a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    m13221a(th, false);
                    return str;
                } finally {
                    m13218a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
    }

    /* renamed from: d */
    public static String m13235d(File file) {
        return m13212a(file, 64, true);
    }

    /* renamed from: e */
    public static byte[] m13238e(File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                return bArr;
            } catch (Throwable th) {
                th = th;
                try {
                    m13221a(th, false);
                    return null;
                } finally {
                    m13218a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* renamed from: f */
    public static boolean m13239f() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m13240g() {
        int indexOf;
        String m13242i = m13242i();
        if (!m13225a(m13242i) && (indexOf = m13242i.indexOf(" root ")) > 0) {
            String substring = m13242i.substring(0, indexOf);
            if (substring.contains("x") || substring.contains(C3325bt.f14190aH)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m13241h() {
        m13245l();
        if (m13225a(f13678f)) {
            return "";
        }
        return f13678f;
    }

    /* renamed from: i */
    public static String m13242i() {
        m13245l();
        if (m13225a(f13679g)) {
            return "";
        }
        return f13679g;
    }

    /* renamed from: j */
    public static void m13243j() {
        C3256f.m13207a(0, new RunnableC3255e(800), 15000L);
    }

    /* renamed from: k */
    public static void m13244k() {
        if (C3259b.f13741d && f13680h) {
            JNIBridge.set(123, f13678f);
            JNIBridge.set(124, f13679g);
        }
    }

    /* renamed from: l */
    private static void m13245l() {
        String trim;
        int indexOf;
        int indexOf2;
        if (f13680h) {
            return;
        }
        synchronized (f13681i) {
            if (f13680h) {
                return;
            }
            String m13214a = m13214a(new String[]{"sh", "-c", "type su"});
            if (!m13225a(m13214a) && (indexOf = (trim = m13214a.trim()).indexOf(32)) > 0 && trim.contains("/su") && (indexOf2 = trim.indexOf(47, indexOf + 1)) > 0) {
                String substring = trim.substring(indexOf2);
                f13678f = substring;
                String m13214a2 = m13214a(new String[]{"ls", "-l", substring});
                if (!m13225a(m13214a2)) {
                    f13679g = m13214a2.trim();
                }
            }
            f13680h = true;
            m13244k();
        }
    }

    /* renamed from: a */
    public static boolean m13222a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m13222a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m13230b(String str) {
        return !m13225a(str);
    }

    /* renamed from: d */
    public static String m13234d() {
        String str = f13677e;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static void m13229b(Throwable th) {
        m13221a(th, true);
    }

    /* renamed from: d */
    public static String m13236d(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i10 = length + 0;
            for (int i11 = 0; i11 < i10; i11++) {
                byte b10 = digest[i11];
                char[] cArr = f13682j;
                char c10 = cArr[(b10 & 240) >> 4];
                char c11 = cArr[b10 & C3373dn.f14525m];
                sb2.append(c10);
                sb2.append(c11);
            }
            return sb2.toString();
        } catch (Exception e10) {
            C3251a.m13169a("crashsdk", "getMD5: ", e10);
            return null;
        }
    }

    /* renamed from: b */
    public static String m13227b() {
        return f13675c;
    }

    /* renamed from: a */
    public static String m13212a(File file, int i10, boolean z10) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[i10];
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    return new String(bArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                if (z10) {
                    try {
                        m13221a(th, false);
                    } finally {
                        m13218a(fileInputStream);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m13237e() {
        if (m13240g()) {
            return true;
        }
        return m13239f();
    }

    /* renamed from: c */
    public static long m13231c(String str) {
        if (m13225a(str)) {
            return 0L;
        }
        try {
            long parseLong = Long.parseLong(str.trim());
            if (parseLong < 0) {
                return 0L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    public static String m13232c() {
        return f13676d;
    }

    /* renamed from: a */
    public static ArrayList<String> m13215a(File file, int i10) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i11 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                        i11++;
                        if (i10 > 0 && i11 >= i10) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            m13221a(th, false);
                            m13218a(fileReader);
                            m13218a(bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            m13218a(fileReader);
                            m13218a(bufferedReader);
                            throw th2;
                        }
                    }
                }
                m13218a(fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        m13218a(bufferedReader);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m13224a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m13218a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    m13221a(th, false);
                    m13218a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m13218a(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m13223a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                m13218a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    m13221a(th, false);
                    return false;
                } finally {
                    m13218a(fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m13218a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m13221a(th, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r2.toLowerCase().startsWith(anet.channel.util.HttpConstant.HTTP) != false) goto L10;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m13213a(java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = com.p077uc.crashsdk.p078a.C3252b.m13174a(r2)
            boolean r0 = m13225a(r2)
            if (r0 == 0) goto L17
            goto L2a
        L17:
            if (r4 == 0) goto L29
            java.lang.String r2 = r2.trim()
            java.lang.String r4 = r2.toLowerCase()
            java.lang.String r0 = "http"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 != 0) goto L2d
            goto L2e
        L2d:
            r3 = r1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3257g.m13213a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m13225a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static boolean m13226a(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    /* renamed from: a */
    public static void m13220a(Throwable th) {
        m13221a(th, false);
    }

    /* renamed from: a */
    private static void m13221a(Throwable th, boolean z10) {
        if (!z10) {
            try {
                if (!C3264g.m13570P()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    /* renamed from: a */
    public static void m13217a(Context context) {
        if (f13674b != null) {
            C3251a.m13170b("mContext is existed");
        }
        f13674b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f13675c = applicationInfo.dataDir;
        f13676d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            f13677e = (String) obj;
        } catch (Throwable th) {
            m13221a(th, false);
        }
    }

    /* renamed from: a */
    public static Context m13211a() {
        return f13674b;
    }

    /* renamed from: a */
    public static void m13216a(int i10) {
        if (i10 != 800) {
            if (!f13673a) {
                throw new AssertionError();
            }
        } else {
            m13245l();
        }
    }

    /* renamed from: a */
    private static String m13214a(String[] strArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 512);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            return sb2.toString().trim();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        m13221a(th, false);
                        return null;
                    } finally {
                        m13218a(bufferedReader);
                        m13218a(inputStreamReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }
}
