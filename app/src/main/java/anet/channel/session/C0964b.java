package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0905a;
import anet.channel.entity.EventType;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C1016a;
import anet.channel.util.C1017b;
import anet.channel.util.C1022g;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.session.b */
/* loaded from: classes.dex */
public class C0964b {

    /* renamed from: anet.channel.session.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f4021a;

        /* renamed from: b */
        public byte[] f4022b;

        /* renamed from: c */
        public Map<String, List<String>> f4023c;

        /* renamed from: d */
        public int f4024d;

        /* renamed from: e */
        public boolean f4025e;
    }

    private C0964b() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:8|(6:9|10|(2:128|129)|12|13|(3:14|15|16))|(3:17|18|19)|(4:20|21|(1:94)(2:25|(8:27|28|29|30|31|32|34|35)(3:58|59|60))|61)|(11:72|(1:74)|(1:76)|77|78|79|(1:81)|(1:83)|85|86|49)|92|78|79|(0)|(0)|85|86|49|6) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026c, code lost:
    
        anet.channel.util.ALog.m4786e("awcn.HttpConnector", "http disconnect", null, r0, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0220, code lost:
    
        r22.onResponseCode(r10.f4021a, r10.f4023c);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cf A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:10:0x0033, B:129:0x003d, B:12:0x00a3, B:15:0x00a8, B:18:0x00b1, B:21:0x00b7, B:23:0x0119, B:25:0x0123, B:27:0x0129, B:30:0x0132, B:41:0x0296, B:43:0x029c, B:44:0x02a3, B:46:0x02ab, B:47:0x02bf, B:56:0x02ba, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227, B:109:0x033c, B:111:0x0367, B:98:0x03a4, B:100:0x03cf, B:162:0x02e0, B:202:0x0315, B:153:0x0409, B:180:0x0431, B:193:0x0457, B:171:0x047d), top: B:9:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0367 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:10:0x0033, B:129:0x003d, B:12:0x00a3, B:15:0x00a8, B:18:0x00b1, B:21:0x00b7, B:23:0x0119, B:25:0x0123, B:27:0x0129, B:30:0x0132, B:41:0x0296, B:43:0x029c, B:44:0x02a3, B:46:0x02ab, B:47:0x02bf, B:56:0x02ba, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227, B:109:0x033c, B:111:0x0367, B:98:0x03a4, B:100:0x03cf, B:162:0x02e0, B:202:0x0315, B:153:0x0409, B:180:0x0431, B:193:0x0457, B:171:0x047d), top: B:9:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029c A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:10:0x0033, B:129:0x003d, B:12:0x00a3, B:15:0x00a8, B:18:0x00b1, B:21:0x00b7, B:23:0x0119, B:25:0x0123, B:27:0x0129, B:30:0x0132, B:41:0x0296, B:43:0x029c, B:44:0x02a3, B:46:0x02ab, B:47:0x02bf, B:56:0x02ba, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227, B:109:0x033c, B:111:0x0367, B:98:0x03a4, B:100:0x03cf, B:162:0x02e0, B:202:0x0315, B:153:0x0409, B:180:0x0431, B:193:0x0457, B:171:0x047d), top: B:9:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ab A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:10:0x0033, B:129:0x003d, B:12:0x00a3, B:15:0x00a8, B:18:0x00b1, B:21:0x00b7, B:23:0x0119, B:25:0x0123, B:27:0x0129, B:30:0x0132, B:41:0x0296, B:43:0x029c, B:44:0x02a3, B:46:0x02ab, B:47:0x02bf, B:56:0x02ba, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227, B:109:0x033c, B:111:0x0367, B:98:0x03a4, B:100:0x03cf, B:162:0x02e0, B:202:0x0315, B:153:0x0409, B:180:0x0431, B:193:0x0457, B:171:0x047d), top: B:9:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ba A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:10:0x0033, B:129:0x003d, B:12:0x00a3, B:15:0x00a8, B:18:0x00b1, B:21:0x00b7, B:23:0x0119, B:25:0x0123, B:27:0x0129, B:30:0x0132, B:41:0x0296, B:43:0x029c, B:44:0x02a3, B:46:0x02ab, B:47:0x02bf, B:56:0x02ba, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227, B:109:0x033c, B:111:0x0367, B:98:0x03a4, B:100:0x03cf, B:162:0x02e0, B:202:0x0315, B:153:0x0409, B:180:0x0431, B:193:0x0457, B:171:0x047d), top: B:9:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246 A[Catch: Exception -> 0x0276, SSLException -> 0x0278, SSLHandshakeException -> 0x027b, all -> 0x028e, IOException -> 0x02dc, CancellationException -> 0x0311, ConnectException -> 0x0405, ConnectTimeoutException -> 0x042d, SocketTimeoutException -> 0x0453, UnknownHostException -> 0x0479, TRY_ENTER, TryCatch #3 {Exception -> 0x0276, blocks: (B:30:0x0132, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227), top: B:29:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025f A[Catch: Exception -> 0x0276, SSLException -> 0x0278, SSLHandshakeException -> 0x027b, all -> 0x028e, IOException -> 0x02dc, CancellationException -> 0x0311, ConnectException -> 0x0405, ConnectTimeoutException -> 0x042d, SocketTimeoutException -> 0x0453, UnknownHostException -> 0x0479, TRY_LEAVE, TryCatch #3 {Exception -> 0x0276, blocks: (B:30:0x0132, B:60:0x0196, B:61:0x01ad, B:63:0x01cf, B:72:0x01e2, B:74:0x01fd, B:76:0x020b, B:77:0x0212, B:78:0x022f, B:81:0x0246, B:83:0x025f, B:91:0x0220, B:92:0x0227), top: B:29:0x0132 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anet.channel.session.C0964b.a m4665a(anet.channel.request.Request r21, anet.channel.RequestCb r22) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0964b.m4665a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    /* renamed from: a */
    private static void m4667a(Request request, a aVar, RequestCb requestCb, int i10, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i10);
        ALog.m4787e("awcn.HttpConnector", "onException", request.getSeq(), Constants.KEY_ERROR_CODE, Integer.valueOf(i10), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost());
        if (aVar != null) {
            aVar.f4021a = i10;
        }
        if (!request.f3956a.isDone.get()) {
            request.f3956a.statusCode = i10;
            request.f3956a.msg = errMsg;
            request.f3956a.rspEnd = System.currentTimeMillis();
            if (i10 != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i10, errMsg, request.f3956a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i10, errMsg, request.f3956a);
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m4666a(Request request) {
        HttpURLConnection httpURLConnection;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        C1022g m4808a = C1022g.m4808a();
        if (NetworkStatusHelper.getStatus().isMobile() && m4808a != null) {
            proxy = m4808a.m4809b();
        }
        URL url = request.getUrl();
        if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        String concatString = request.getHttpUrl().containsNonDefaultPort() ? StringUtils.concatString(str, ":", String.valueOf(request.getHttpUrl().getPort())) : str;
        httpURLConnection.setRequestProperty(HttpConstant.HOST, concatString);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, concatString);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (m4808a != null) {
            httpURLConnection.setRequestProperty(HttpConstant.AUTHORIZATION, m4808a.m4810c());
        }
        if (url.getProtocol().equalsIgnoreCase(HttpConstant.HTTPS)) {
            m4669a(httpURLConnection, request, str);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static void m4669a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.m4787e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else {
            SSLSocketFactory sSLSocketFactory = C1017b.f4209a;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                if (ALog.isPrintLog(2)) {
                    ALog.m4788i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "SslSocketFactory", C1017b.f4209a);
                }
            }
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            return;
        }
        HostnameVerifier hostnameVerifier = C1017b.f4210b;
        if (hostnameVerifier != null) {
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            if (ALog.isPrintLog(2)) {
                ALog.m4788i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "HostnameVerifier", C1017b.f4210b);
                return;
            }
            return;
        }
        httpsURLConnection.setHostnameVerifier(new C0965c(str));
    }

    /* renamed from: a */
    private static int m4664a(HttpURLConnection httpURLConnection, Request request) {
        int i10 = 0;
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    int postBody = request.postBody(outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e10) {
                            ALog.m4786e("awcn.HttpConnector", "postData", request.getSeq(), e10, new Object[0]);
                        }
                    }
                    i10 = postBody;
                } catch (Exception e11) {
                    ALog.m4786e("awcn.HttpConnector", "postData error", request.getSeq(), e11, new Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e12) {
                            ALog.m4786e("awcn.HttpConnector", "postData", request.getSeq(), e12, new Object[0]);
                        }
                    }
                }
                long j10 = i10;
                request.f3956a.reqBodyInflateSize = j10;
                request.f3956a.reqBodyDeflateSize = j10;
                request.f3956a.sendDataSize = j10;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e13) {
                        ALog.m4786e("awcn.HttpConnector", "postData", request.getSeq(), e13, new Object[0]);
                    }
                }
                throw th;
            }
        }
        return i10;
    }

    /* renamed from: a */
    private static void m4668a(HttpURLConnection httpURLConnection, Request request, a aVar, RequestCb requestCb) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        httpURLConnection.getURL().toString();
        C1016a c1016a = null;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                ALog.m4790w("awcn.HttpConnector", "File not found", request.getSeq(), "url", request.getUrlString());
            }
            try {
                inputStream = httpURLConnection.getErrorStream();
            } catch (Exception e11) {
                ALog.m4786e("awcn.HttpConnector", "get error stream failed.", request.getSeq(), e11, new Object[0]);
                inputStream = null;
            }
        }
        if (inputStream == null) {
            m4667a(request, aVar, requestCb, ErrorConstant.ERROR_IO_EXCEPTION, null);
            return;
        }
        if (requestCb == null) {
            int i10 = aVar.f4024d;
            if (i10 <= 0) {
                i10 = EventType.AUTH_FAIL;
            } else if (aVar.f4025e) {
                i10 *= 2;
            }
            byteArrayOutputStream = new ByteArrayOutputStream(i10);
        } else {
            byteArrayOutputStream = null;
        }
        try {
            C1016a c1016a2 = new C1016a(inputStream);
            try {
                InputStream gZIPInputStream = aVar.f4025e ? new GZIPInputStream(c1016a2) : c1016a2;
                ByteArray byteArray = null;
                while (!Thread.currentThread().isInterrupted()) {
                    if (byteArray == null) {
                        byteArray = C0905a.a.f3805a.m4510a(2048);
                    }
                    int readFrom = byteArray.readFrom(gZIPInputStream);
                    if (readFrom != -1) {
                        if (byteArrayOutputStream != null) {
                            byteArray.writeTo(byteArrayOutputStream);
                        } else {
                            requestCb.onDataReceive(byteArray, false);
                            byteArray = null;
                        }
                        long j10 = readFrom;
                        request.f3956a.recDataSize += j10;
                        request.f3956a.rspBodyInflateSize += j10;
                    } else {
                        if (byteArrayOutputStream != null) {
                            byteArray.recycle();
                        } else {
                            requestCb.onDataReceive(byteArray, true);
                        }
                        if (byteArrayOutputStream != null) {
                            aVar.f4022b = byteArrayOutputStream.toByteArray();
                        }
                        request.f3956a.recDataTime = System.currentTimeMillis() - request.f3956a.rspStart;
                        request.f3956a.rspBodyDeflateSize = c1016a2.m4791a();
                        try {
                            gZIPInputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
                throw new CancellationException("task cancelled");
            } catch (Throwable th) {
                th = th;
                c1016a = c1016a2;
                request.f3956a.recDataTime = System.currentTimeMillis() - request.f3956a.rspStart;
                request.f3956a.rspBodyDeflateSize = c1016a.m4791a();
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
