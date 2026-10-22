package com.efs.sdk.net.p057a.p058a;

import anet.channel.entity.EventType;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.p057a.C1755a;
import com.efs.sdk.net.p057a.C1766c;
import com.efs.sdk.net.p057a.p058a.InterfaceC1761f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.efs.sdk.net.a.a.b */
/* loaded from: classes.dex */
public final class C1757b {

    /* renamed from: a */
    Map<String, Long> f7350a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m7843a(InterfaceC1761f.b bVar) {
        try {
            if (bVar.mo7827d() != null) {
                return r2.length;
            }
            return 0L;
        } catch (IOException | OutOfMemoryError e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: a */
    public static InputStream m7845a(String str, String str2, String str3, InputStream inputStream) {
        Log.m7730i("NetTrace-Interceptor", "save interpret response stream");
        C1766c m7839a = C1755a.m7837a().m7839a(str);
        m7839a.f7378i = str2;
        if (str2 != null) {
            if (str2.contains("text") || str2.contains("json")) {
                ByteArrayOutputStream m7844a = m7844a(inputStream, m7839a, str3);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m7844a.toByteArray());
                try {
                    m7844a.close();
                } catch (IOException e10) {
                    Log.m7726e("NetTrace-Interceptor", "save interpret response stream, e is ".concat(String.valueOf(e10)));
                }
                return byteArrayInputStream;
            }
        }
        m7839a.f7379j = 0L;
        return inputStream;
    }

    /* renamed from: a */
    private static ByteArrayOutputStream m7844a(InputStream inputStream, C1766c c1766c, String str) {
        BufferedReader bufferedReader;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[EventType.AUTH_FAIL];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e10) {
                Log.m7726e("NetTrace-Interceptor", "parse and save body, e is ".concat(String.valueOf(e10)));
            }
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        if ("gzip".equals(str)) {
            bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(byteArrayInputStream)));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb2.append(readLine + '\n');
        }
        c1766c.f7379j = sb2.toString().getBytes().length;
        return byteArrayOutputStream;
    }
}
