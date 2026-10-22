package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

/* renamed from: com.umeng.analytics.pro.ap */
/* loaded from: classes3.dex */
public class C3294ap {

    /* renamed from: a */
    private static HostnameVerifier f14006a;

    /* renamed from: a */
    private static HostnameVerifier m13789a() {
        if (f14006a == null) {
            f14006a = new HostnameVerifier() { // from class: com.umeng.analytics.pro.ap.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    if (!TextUtils.isEmpty(str)) {
                        if ("pre-ucc.umeng.com".equalsIgnoreCase(str) || "ucc.umeng.com".equalsIgnoreCase(str) || "aspect-upush.umeng.com".equalsIgnoreCase(str) || "pre-msg.umengcloud.com".equalsIgnoreCase(str) || "ulogs.umeng.com".equalsIgnoreCase(str) || "preulogs.umeng.com".equalsIgnoreCase(str) || "cnlogs.umeng.com".equalsIgnoreCase(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            };
        }
        return f14006a;
    }

    /* renamed from: a */
    public static byte[] m13792a(String str, String str2) {
        return m13793a(str, str2.getBytes());
    }

    /* renamed from: a */
    public static byte[] m13793a(String str, byte[] bArr) {
        byte[] bArr2 = null;
        try {
            HttpsURLConnection m13790a = m13790a(str, "ak", C3302ax.m13817a(bArr, UMConfigure.sAppkey.getBytes()));
            if (m13790a != null && m13790a.getResponseCode() == 200) {
                InputStream inputStream = m13790a.getInputStream();
                try {
                    byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                    try {
                        String headerField = m13790a.getHeaderField("ak");
                        if (!TextUtils.isEmpty(headerField)) {
                            bArr2 = C3302ax.m13817a(readStreamToByteArray, headerField.getBytes());
                        } else {
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "ccg 应答不包含ak!");
                        }
                        HelperUtils.safeClose(inputStream);
                    } catch (Throwable th) {
                        th = th;
                        HelperUtils.safeClose(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable unused) {
        }
        return bArr2;
    }

    /* renamed from: a */
    public static void m13791a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        int responseCode;
        HttpsURLConnection httpsURLConnection = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C3302ax.m13816a(bArr, byteArrayOutputStream);
                bArr2 = C3302ax.m13817a(byteArrayOutputStream.toByteArray(), UMConfigure.sAppkey.getBytes());
            } catch (Throwable unused) {
                bArr2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "appkey";
            }
            httpsURLConnection = m13790a(str, str2, bArr2);
            if (httpsURLConnection != null && (responseCode = httpsURLConnection.getResponseCode()) != 200) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "SC/ActUp/EkvError event report error, http error code: " + responseCode);
            }
            if (httpsURLConnection == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                if (httpsURLConnection == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (httpsURLConnection != null) {
                    try {
                        httpsURLConnection.disconnect();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
        try {
            httpsURLConnection.disconnect();
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    private static HttpsURLConnection m13790a(String str, String str2, byte[] bArr) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(m13789a());
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setConnectTimeout(C3330by.f14355b);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setReadTimeout(C3330by.f14355b);
            httpsURLConnection.addRequestProperty("Content-Type", "application/octet-stream");
            httpsURLConnection.addRequestProperty(str2, UMConfigure.sAppkey);
            httpsURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_USER_AGENT, DeviceConfig.getCustomAgt());
            httpsURLConnection.connect();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            outputStream.close();
            return httpsURLConnection;
        } catch (Exception e11) {
            e = e11;
            httpsURLConnection2 = httpsURLConnection;
            e.printStackTrace();
            return httpsURLConnection2;
        }
    }
}
