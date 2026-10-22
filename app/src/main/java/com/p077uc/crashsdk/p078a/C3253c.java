package com.p077uc.crashsdk.p078a;

import anet.channel.entity.EventType;
import com.lzy.okgo.model.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.uc.crashsdk.a.c */
/* loaded from: classes3.dex */
public class C3253c {

    /* renamed from: a */
    static final /* synthetic */ boolean f13650a = true;

    /* renamed from: b */
    private static String f13651b = "";

    /* renamed from: a */
    public static byte[] m13186a(byte[] bArr, byte[] bArr2) {
        return m13188a(bArr, bArr2, true, false);
    }

    /* renamed from: b */
    public static byte[] m13190b(byte[] bArr, byte[] bArr2) {
        return m13188a(bArr, bArr2, true, true);
    }

    /* renamed from: a */
    public static byte[] m13187a(byte[] bArr, byte[] bArr2, boolean z10) {
        return m13188a(bArr, bArr2, z10, true);
    }

    /* renamed from: b */
    private static boolean m13189b(File file, String str, String str2) {
        try {
            byte[] m13183a = m13183a(file);
            if (m13183a != null && m13183a.length != 0) {
                return m13181a(m13183a, str, str2);
            }
            return false;
        } catch (Exception e10) {
            C3257g.m13220a(e10);
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m13188a(byte[] bArr, byte[] bArr2, boolean z10, boolean z11) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(z10 ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z10) {
            return cipher.doFinal(bArr);
        }
        if (!z11) {
            bArr = m13185a(bArr);
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m13185a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 16];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i10 = 4; i10 < 16; i10++) {
            bArr2[i10] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m13182a() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m13184a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L85
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.net.URLConnection r7 = r1.openConnection()     // Catch: java.lang.Throwable -> L85
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L85
            r1 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L83
            r7.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 1
            r7.setDoInput(r1)     // Catch: java.lang.Throwable -> L83
            r7.setDoOutput(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "POST"
            r7.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r7.setUseCaches(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Content-Length"
            int r3 = r8.length     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L83
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L83
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L83
            r2.write(r8)     // Catch: java.lang.Throwable -> L80
            int r8 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L80
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 == r3) goto L51
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r2)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r0)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r0)
            r7.disconnect()     // Catch: java.lang.Throwable -> L50
        L50:
            return r0
        L51:
            java.io.InputStream r8 = r7.getInputStream()     // Catch: java.lang.Throwable -> L80
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7e
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7e
            int r5 = r8.available()     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e
        L62:
            int r5 = r8.read(r3)     // Catch: java.lang.Throwable -> L89
            r6 = -1
            if (r5 == r6) goto L6d
            r4.write(r3, r1, r5)     // Catch: java.lang.Throwable -> L89
            goto L62
        L6d:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L89
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r2)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r8)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r4)
            r7.disconnect()     // Catch: java.lang.Throwable -> L7d
        L7d:
            return r0
        L7e:
            r4 = r0
            goto L89
        L80:
            r8 = r0
            r4 = r8
            goto L89
        L83:
            r8 = r0
            goto L87
        L85:
            r7 = r0
            r8 = r7
        L87:
            r2 = r8
            r4 = r2
        L89:
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r2)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r8)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r4)
            if (r7 == 0) goto L97
            r7.disconnect()     // Catch: java.lang.Throwable -> L97
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3253c.m13184a(java.lang.String, byte[]):byte[]");
    }

    /* renamed from: a */
    public static void m13179a(byte[] bArr, int i10, byte[] bArr2) {
        if (!f13650a && bArr2.length != 4) {
            throw new AssertionError();
        }
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11 + i10] = bArr2[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: a */
    private static byte[] m13183a(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        int length;
        BufferedInputStream bufferedInputStream;
        Object r12 = 0;
        byte[] bArr2 = null;
        r1 = null;
        Closeable closeable = null;
        r12 = 0;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                length = (int) file.length();
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e10) {
                    e = e10;
                    bArr = null;
                }
            } catch (Exception e11) {
                e = e11;
                bArr = null;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                bArr2 = new byte[length];
                int i10 = 0;
                while (i10 < length) {
                    int read = bufferedInputStream.read(bArr2, i10, length - i10);
                    if (-1 == read) {
                        break;
                    }
                    i10 += read;
                }
                C3257g.m13218a(bufferedInputStream);
                C3257g.m13218a(fileInputStream);
                r12 = bArr2;
            } catch (Exception e12) {
                e = e12;
                byte[] bArr3 = bArr2;
                closeable = bufferedInputStream;
                bArr = bArr3;
                C3257g.m13229b(e);
                C3257g.m13218a(closeable);
                C3257g.m13218a(fileInputStream);
                r12 = bArr;
                return r12;
            } catch (Throwable th2) {
                th = th2;
                r12 = bufferedInputStream;
                C3257g.m13218a((Closeable) r12);
                C3257g.m13218a(fileInputStream);
                throw th;
            }
            return r12;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m13180a(File file, String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (m13189b(file, str, str2)) {
                return true;
            }
            C3251a.m13168a("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m13181a(byte[] bArr, String str, String str2) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream;
        C3251a.m13167a("Uploading to " + str2);
        OutputStream outputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("------------izQ290kHh6g3Yn2IeyJCoc\r\n");
                sb2.append("Content-Disposition: form-data; name=\"file\";");
                sb2.append(" filename=\"");
                sb2.append(str);
                sb2.append("\"\r\n");
                sb2.append("Content-Type: application/octet-stream\r\n");
                sb2.append("\r\n");
                int length = sb2.length() + 40 + bArr.length;
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                httpURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_CONTENT_DISPOSITION, "form-data; name=\"file\"; filename=" + str);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(sb2.toString().getBytes());
                    outputStream2.write(bArr);
                    outputStream2.write("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n".getBytes());
                    int responseCode = httpURLConnection.getResponseCode();
                    C3251a.m13168a("crashsdk", "Response code: " + responseCode);
                    if (responseCode != 200) {
                        C3257g.m13218a(outputStream2);
                        C3257g.m13218a((Closeable) null);
                        C3257g.m13218a((Closeable) null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        return false;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[EventType.AUTH_FAIL];
                        byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                        while (true) {
                            try {
                                int read = inputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                outputStream = outputStream2;
                                try {
                                    C3257g.m13229b(th);
                                    C3257g.m13218a(outputStream);
                                    C3257g.m13218a(inputStream);
                                    C3257g.m13218a(byteArrayOutputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    C3257g.m13218a(outputStream);
                                    C3257g.m13218a(inputStream);
                                    C3257g.m13218a(byteArrayOutputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray != null) {
                            C3251a.m13168a("crashsdk", "Log upload response: " + new String(byteArray));
                            C3257g.m13218a(outputStream2);
                            C3257g.m13218a(inputStream);
                            C3257g.m13218a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused4) {
                            }
                            return true;
                        }
                        C3257g.m13218a(outputStream2);
                        C3257g.m13218a(inputStream);
                        C3257g.m13218a(byteArrayOutputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused5) {
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            httpURLConnection = null;
            byteArrayOutputStream = null;
        }
    }
}
