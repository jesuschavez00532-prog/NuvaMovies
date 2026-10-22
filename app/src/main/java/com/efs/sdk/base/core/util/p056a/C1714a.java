package com.efs.sdk.base.core.util.p056a;

import anet.channel.entity.EventType;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.lzy.okgo.model.HttpHeaders;
import com.umeng.analytics.pro.C3330by;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.util.a.a */
/* loaded from: classes.dex */
public final class C1714a implements IHttpUtil {

    /* renamed from: com.efs.sdk.base.core.util.a.a$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static final C1714a f7193a = new C1714a(0);
    }

    private C1714a() {
    }

    /* synthetic */ C1714a(byte b10) {
        this();
    }

    /* renamed from: a */
    public static C1714a m7753a() {
        return a.f7193a;
    }

    /* renamed from: b */
    private static void m7757b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                FileUtil.safeClose(httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse get(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpResponse httpResponse = new HttpResponse();
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            httpURLConnection = null;
            try {
                try {
                    httpURLConnection = m7756a(str, map);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_CONNECTION, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE);
                    httpURLConnection.connect();
                    httpResponse = m7755a(httpURLConnection);
                    m7757b(httpURLConnection);
                    break;
                } finally {
                    try {
                        i10++;
                        m7757b(httpURLConnection);
                    } catch (Throwable th) {
                        m7757b(httpURLConnection);
                    }
                }
            } catch (SocketTimeoutException e10) {
                httpResponse.setHttpCode(-3);
                Log.m7727e("efs.util.http", "post file '" + str + "' error", e10);
            } catch (UnknownHostException e11) {
                httpResponse.setHttpCode(-2);
                Log.m7727e("efs.util.http", "get request '" + str + "' error， maybe network is disconnect", e11);
            }
            i10++;
            m7757b(httpURLConnection);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, File file) {
        return m7754a(str, map, file, null);
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return m7754a(str, map, null, bArr);
    }

    /* renamed from: a */
    private static HttpURLConnection m7756a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(C3330by.f14355b);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        if (map == null) {
            map = Collections.emptyMap();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.net.HttpURLConnection] */
    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, byte[] bArr) {
        HttpResponse httpResponse = new HttpResponse();
        OutputStream outputStream = null;
        try {
            try {
                map = m7756a(str, map);
                try {
                    map.setRequestMethod("POST");
                    map.setRequestProperty(HttpHeaders.HEAD_KEY_CONNECTION, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE);
                    outputStream = map.getOutputStream();
                    outputStream.write(bArr);
                    httpResponse = m7755a(map);
                } catch (SocketTimeoutException e10) {
                    e = e10;
                    httpResponse.setHttpCode(-3);
                    Log.m7727e("efs.util.http", "post file '" + str + "' error", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (UnknownHostException e11) {
                    e = e11;
                    httpResponse.setHttpCode(-2);
                    Log.m7727e("efs.util.http", "post data to '" + str + "' error， maybe network is disconnect", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (Throwable th) {
                    th = th;
                    Log.m7727e("efs.util.http", "post data '" + str + "' error", th);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                }
            } finally {
                FileUtil.safeClose(outputStream);
                m7757b(map);
            }
        } catch (SocketTimeoutException e12) {
            e = e12;
            map = 0;
        } catch (UnknownHostException e13) {
            e = e13;
            map = 0;
        } catch (Throwable th2) {
            th = th2;
            map = 0;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    /* renamed from: a */
    private static HttpResponse m7755a(HttpURLConnection httpURLConnection) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        HttpResponse httpResponse = new HttpResponse();
        if (httpURLConnection == null) {
            return httpResponse;
        }
        try {
            httpResponse.setHttpCode(httpURLConnection.getResponseCode());
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[EventType.AUTH_FAIL];
                byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Log.m7727e("efs.util.http", "get response error", th);
                            return httpResponse;
                        } finally {
                            FileUtil.safeClose(inputStream);
                            FileUtil.safeClose(byteArrayOutputStream);
                        }
                    }
                }
                httpResponse.data = byteArrayOutputStream.toString();
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
            }
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
        return httpResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: a */
    private static HttpResponse m7754a(String str, Map<String, String> map, File file, byte[] bArr) {
        FileInputStream fileInputStream;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        HttpResponse httpResponse = new HttpResponse();
        HttpURLConnection httpURLConnection = null;
        r4 = null;
        r4 = null;
        r4 = null;
        ?? r42 = null;
        httpURLConnection = null;
        httpURLConnection = null;
        httpURLConnection = null;
        try {
            try {
                HttpURLConnection m7756a = m7756a(str, map);
                try {
                    m7756a.setRequestMethod("POST");
                    m7756a.setRequestProperty(HttpHeaders.HEAD_KEY_CONNECTION, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE);
                    m7756a.setRequestProperty("Content-Type", "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb");
                    outputStream = m7756a.getOutputStream();
                    try {
                        dataOutputStream = new DataOutputStream(outputStream);
                        try {
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb\r\n");
                            if (bArr == 0) {
                                if (file != null && file.exists()) {
                                    dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"" + file.getName() + "\"\r\n");
                                    dataOutputStream.writeBytes("\r\n");
                                    fileInputStream4 = new FileInputStream(file);
                                    try {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int read = fileInputStream4.read(bArr2);
                                            if (read == -1) {
                                                break;
                                            }
                                            dataOutputStream.write(bArr2, 0, read);
                                        }
                                        r42 = fileInputStream4;
                                    } catch (SocketTimeoutException e10) {
                                        e = e10;
                                        httpURLConnection = m7756a;
                                        fileInputStream3 = fileInputStream4;
                                        httpResponse.setHttpCode(-3);
                                        Log.m7727e("efs.util.http", "post file '" + str + "' error", e);
                                        bArr = fileInputStream3;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (UnknownHostException e11) {
                                        e = e11;
                                        httpURLConnection = m7756a;
                                        fileInputStream2 = fileInputStream4;
                                        httpResponse.setHttpCode(-2);
                                        Log.m7727e("efs.util.http", "post file '" + str + "' error， maybe network is disconnect", e);
                                        bArr = fileInputStream2;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection = m7756a;
                                        fileInputStream = fileInputStream4;
                                        Log.m7727e("efs.util.http", "post file '" + str + "' error", th);
                                        bArr = fileInputStream;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    }
                                }
                                m7757b(m7756a);
                                FileUtil.safeClose(outputStream);
                                FileUtil.safeClose(dataOutputStream);
                                FileUtil.safeClose(null);
                                return httpResponse;
                            }
                            dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bArr, 0, bArr.length);
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                            httpResponse = m7755a(m7756a);
                            m7757b(m7756a);
                            FileUtil.safeClose(outputStream);
                            FileUtil.safeClose(dataOutputStream);
                            FileUtil.safeClose(r42);
                        } catch (SocketTimeoutException e12) {
                            e = e12;
                            fileInputStream4 = r42;
                        } catch (UnknownHostException e13) {
                            e = e13;
                            fileInputStream4 = r42;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream4 = r42;
                        }
                    } catch (SocketTimeoutException e14) {
                        e = e14;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (UnknownHostException e15) {
                        e = e15;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    }
                } catch (SocketTimeoutException e16) {
                    e = e16;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (UnknownHostException e17) {
                    e = e17;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                }
            } finally {
                m7757b(httpURLConnection);
                FileUtil.safeClose(outputStream);
                FileUtil.safeClose(dataOutputStream);
                FileUtil.safeClose(bArr);
            }
        } catch (SocketTimeoutException e18) {
            e = e18;
            fileInputStream3 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (UnknownHostException e19) {
            e = e19;
            fileInputStream2 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            outputStream = null;
            dataOutputStream = null;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }
}
