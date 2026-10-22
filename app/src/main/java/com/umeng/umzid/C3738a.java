package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import anet.channel.entity.EventType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: com.umeng.umzid.a */
/* loaded from: classes3.dex */
public class C3738a {
    /* renamed from: a */
    public static SharedPreferences m15901a(Context context) {
        if (context != null) {
            return context.getSharedPreferences("umzid_general_config", 0);
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m15903a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static synchronized String m15902a(String str, String str2) {
        byte[] bArr;
        synchronized (C3738a.class) {
            try {
                String host = Uri.parse(str).getHost();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setHostnameVerifier(new C3739b(host));
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
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
                outputStream.write(m15903a(bArr, "7EC2papS9acZxgIb".getBytes()));
                outputStream.flush();
                outputStream.close();
                if (httpsURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    byte[] bArr2 = new byte[EventType.AUTH_FAIL];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            return new String(m15903a(byteArrayOutputStream2.toByteArray(), "7EC2papS9acZxgIb".getBytes()));
                        }
                        byteArrayOutputStream2.write(bArr2, 0, read);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return null;
        }
    }
}
