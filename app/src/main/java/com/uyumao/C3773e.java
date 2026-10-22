package com.uyumao;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.entity.EventType;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.uyumao.e */
/* loaded from: classes3.dex */
public class C3773e {

    /* renamed from: a */
    public static Context f16951a;

    /* renamed from: b */
    public static WeakReference<Future<?>> f16952b;

    /* renamed from: c */
    public static WeakReference<Future<?>> f16953c;

    /* renamed from: a */
    public static Context m16002a() {
        return f16951a;
    }

    /* renamed from: a */
    public static JSONArray m16005a(Context context) {
        return null;
    }

    /* renamed from: b */
    public static Boolean m16015b() {
        Boolean bool = Boolean.FALSE;
        try {
            UMLog uMLog = UMConfigure.umDebugLog;
            Method declaredMethod = UMConfigure.class.getDeclaredMethod("isInForeground", new Class[0]);
            if (declaredMethod == null) {
                return bool;
            }
            declaredMethod.setAccessible(true);
            return (Boolean) declaredMethod.invoke(UMConfigure.class, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return bool;
        }
    }

    /* renamed from: b */
    public static JSONObject m16017b(Context context) {
        return null;
    }

    /* renamed from: c */
    public static String[] m16018c(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        if (!m16012a(context, "android.permission.ACCESS_NETWORK_STATE")) {
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
            strArr[0] = "mobile_network";
            strArr[1] = networkInfo2.getSubtypeName();
        }
        return strArr;
    }

    /*  JADX ERROR: MOVE_RESULT instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: MOVE_RESULT instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:698)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:612)
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
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
    /* renamed from: d */
    public static java.lang.String m16019d(android.content.Context r1) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> Le
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Le
            r1 = move-result     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Claro"
            return r1
        Le:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.C3773e.m16019d(android.content.Context):java.lang.String");
    }

    /* renamed from: e */
    public static JSONArray m16020e(Context context) {
        return null;
    }

    /* renamed from: f */
    public static JSONArray m16021f(Context context) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, boolean] */
    /* renamed from: g */
    public static String[] m16022g(Context context) {
        ?? m16012a;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String[] strArr = {"", ""};
        try {
            ?? m16012a2 = m16012a(context, "android.permission.ACCESS_WIFI_STATE");
            if (m16012a2 != 0 && (m16012a = m16012a(context, (String) m16012a2)) != 0 && m16012a(context, (String) m16012a) && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                String ssid = connectionInfo.getSSID();
                String bssid = connectionInfo.getBSSID();
                if (ssid.length() > 2 && ssid.charAt(0) == '\"' && ssid.charAt(ssid.length() - 1) == '\"') {
                    strArr[0] = ssid.substring(1, ssid.length() - 1);
                }
                if (bssid != null) {
                    strArr[1] = bssid;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return strArr;
    }

    /* renamed from: h */
    public static boolean m16023h(Context context) {
        int i10;
        WifiManager wifiManager;
        if (context == null) {
            return false;
        }
        try {
            if (m16012a(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null) {
                i10 = wifiManager.getWifiState();
            } else {
                i10 = -1;
            }
        } catch (Throwable unused) {
        }
        if (3 != i10) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m16014a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static JSONObject m16007a(JSONObject jSONObject, String str, String str2, boolean z10) {
        SystemClock.elapsedRealtime();
        return new JSONObject(m16004a(jSONObject.toString(), (HttpURLConnection) new URL(str).openConnection(), str2));
    }

    /* renamed from: b */
    public static String m16016b(File file) {
        FileInputStream fileInputStream;
        String str = "";
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[EventType.AUTH_FAIL];
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        sb2.append(new String(bArr, 0, read));
                    }
                    str = sb2.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.e("efs.util.file", "read file error", th);
                        return str;
                    } finally {
                        m16008a(fileInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m16011a(byte[] bArr, OutputStream outputStream) {
        GZIPInputStream gZIPInputStream;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArr2 = new byte[EventType.AUTH_FAIL];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr2, 0, read);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            gZIPInputStream = null;
        }
        C3782n.m16035a(gZIPInputStream);
    }

    /* renamed from: a */
    public static boolean m16013a(File file, byte[] bArr, boolean z10) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file, z10);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                m16008a(fileOutputStream);
                return true;
            } catch (Throwable th) {
                th = th;
                try {
                    Log.e("efs.util.file", "write file error, filename is " + file.getName(), th);
                    m16008a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m16008a(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* renamed from: a */
    public static String m16004a(String str, HttpURLConnection httpURLConnection, String str2) {
        GZIPOutputStream gZIPOutputStream;
        InputStream errorStream;
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes2 = str.getBytes();
        InputStream inputStream = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            gZIPOutputStream = null;
        }
        C3782n.m16035a(gZIPOutputStream);
        byte[] m16014a = m16014a(byteArrayOutputStream.toByteArray(), bytes);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.addRequestProperty("Content-Type", "application/octet-stream");
        httpURLConnection.addRequestProperty("Content-Encoding", "xgzip");
        httpURLConnection.addRequestProperty("appkey", str2);
        httpURLConnection.setFixedLengthStreamingMode(m16014a.length);
        httpURLConnection.setDoOutput(true);
        try {
            inputStream = httpURLConnection.getOutputStream();
            inputStream.write(m16014a);
            C3782n.m16035a(inputStream);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 400) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            byteArrayOutputStream.reset();
            if (inputStream != null) {
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } finally {
                    }
                }
            }
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused3) {
            }
            if (responseCode == 200 && TextUtils.equals("xgzip", httpURLConnection.getHeaderField("Content-Encoding"))) {
                byte[] m16014a2 = m16014a(byteArrayOutputStream.toByteArray(), bytes);
                byteArrayOutputStream.reset();
                m16011a(m16014a2, byteArrayOutputStream);
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            if (responseCode == 200) {
                return byteArrayOutputStream2;
            }
            throw new IOException("code:" + responseCode + " msg:" + byteArrayOutputStream2);
        } finally {
        }
    }

    /* renamed from: a */
    public static void m16010a(JSONObject jSONObject, String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        boolean z10;
        String jSONObject2 = jSONObject.toString();
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes2 = jSONObject2.getBytes();
        InputStream inputStream = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            gZIPOutputStream = null;
        }
        C3782n.m16035a(gZIPOutputStream);
        byte[] m16014a = m16014a(byteArrayOutputStream.toByteArray(), bytes);
        SystemClock.elapsedRealtime();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.addRequestProperty("Content-Type", "application/octet-stream");
                httpURLConnection.addRequestProperty("appkey", str2);
                if (TextUtils.isEmpty(jSONObject.optString("uuid"))) {
                    z10 = true;
                } else {
                    httpURLConnection.addRequestProperty("Rich-Resp-Code", "1");
                    z10 = false;
                }
                httpURLConnection.setFixedLengthStreamingMode(m16014a.length);
                httpURLConnection.setDoOutput(true);
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(m16014a);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 400) {
                        inputStream = httpURLConnection.getInputStream();
                    } else {
                        inputStream = httpURLConnection.getErrorStream();
                    }
                    byteArrayOutputStream.reset();
                    if (inputStream != null) {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                    }
                    C3782n.m16035a(outputStream);
                    C3782n.m16035a(inputStream);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                    if (responseCode == 200) {
                        byte[] m16014a2 = m16014a(byteArrayOutputStream.toByteArray(), bytes);
                        byteArrayOutputStream.reset();
                        if (z10) {
                            m16011a(m16014a2, byteArrayOutputStream);
                            byteArrayOutputStream.toString();
                        } else {
                            new String(m16014a2);
                        }
                    }
                    if (responseCode == 200) {
                        return;
                    }
                    throw new Exception("response code " + responseCode);
                } catch (Throwable th) {
                    th = th;
                    C3782n.m16035a(outputStream);
                    C3782n.m16035a(inputStream);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    /* renamed from: a */
    public static void m16009a(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                        for (File file2 : listFiles) {
                            m16009a(file2);
                        }
                    }
                    file.delete();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m16003a(NetworkInfo networkInfo) {
        int subtype;
        try {
            subtype = networkInfo.getSubtype();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
        if (subtype == 20) {
            return "5G";
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                String subtypeName = networkInfo.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName)) {
                    return "";
                }
                if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName)) {
                    if (!"CDMA2000".equalsIgnoreCase(subtypeName)) {
                        return subtypeName;
                    }
                }
                return "3G";
        }
        th.printStackTrace();
        return "";
    }

    /* renamed from: a */
    public static void m16008a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e("efs.util.file", "safe close error", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m16012a(Context context, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static JSONArray m16006a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            try {
                if (jSONObject != null && jSONObject2 != null) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                    if (jSONObject2.length() > 0) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject3.put(next, jSONObject2.get(next));
                        }
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject3);
                    jSONObject = jSONArray;
                } else {
                    if (jSONObject != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            jSONArray2.put(jSONObject);
                            return jSONArray2;
                        } catch (Throwable unused) {
                            return jSONArray2;
                        }
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject2);
                    jSONObject = jSONArray3;
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
