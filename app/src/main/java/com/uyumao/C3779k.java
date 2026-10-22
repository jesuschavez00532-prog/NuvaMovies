package com.uyumao;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

/* renamed from: com.uyumao.k */
/* loaded from: classes3.dex */
public class C3779k {

    /* renamed from: com.uyumao.k$a */
    /* loaded from: classes3.dex */
    public static class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            if (!TextUtils.isEmpty(str)) {
                if ("yumao.puata.info".equalsIgnoreCase(str) || "preulogs.umeng.com".equalsIgnoreCase(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized String m16027a(Context context, String str, String str2) {
        byte[] bArr;
        String str3;
        synchronized (C3779k.class) {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setHostnameVerifier(new a());
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                httpsURLConnection.setRequestProperty("appkey", UMUtils.getAppkey(context));
                httpsURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                byte[] bytes = str2.getBytes();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    bArr = null;
                }
                outputStream.write(m16028a(bArr, UMUtils.getAppkey(context).getBytes()));
                outputStream.flush();
                outputStream.close();
                if (httpsURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    byte[] bArr2 = new byte[EventType.AUTH_FAIL];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr2, 0, read);
                    }
                    if ("none".equals(httpsURLConnection.getContentEncoding())) {
                        str3 = new String(byteArrayOutputStream2.toByteArray());
                    } else {
                        str3 = new String(m16028a(byteArrayOutputStream2.toByteArray(), UMUtils.getAppkey(context).getBytes()));
                    }
                    return str3;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m16028a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
            }
        }
        return bArr;
    }
}
