package p381w7;

import android.os.Process;
import android.text.TextUtils;
import java.net.HttpURLConnection;
import org.android.agoo.message.MessageService;
import p009a8.C0111a;
import p368v7.InterfaceC7246a;
import p428z7.C7760a;

/* renamed from: w7.a */
/* loaded from: classes2.dex */
public class RunnableC7380a implements Runnable {

    /* renamed from: a */
    private final String f27385a = "GetFileInfoTask";

    /* renamed from: b */
    private final InterfaceC7246a f27386b;

    /* renamed from: c */
    private final C7760a f27387c;

    /* renamed from: d */
    private final a f27388d;

    /* renamed from: w7.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: b */
        void mo28059b(long j10, boolean z10);
    }

    public RunnableC7380a(InterfaceC7246a interfaceC7246a, C7760a c7760a, a aVar) {
        this.f27386b = interfaceC7246a;
        this.f27387c = c7760a;
        this.f27388d = aVar;
    }

    /* renamed from: a */
    private void m28487a() {
        if (!this.f27387c.m30018q()) {
        } else {
            throw new C0111a(7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.net.HttpURLConnection] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28488b(java.lang.String r6) {
        /*
            r5 = this;
            z7.a r0 = r5.f27387c
            r0.m30025x(r6)
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61 java.net.ProtocolException -> L6e java.net.MalformedURLException -> L7b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61 java.net.ProtocolException -> L6e java.net.MalformedURLException -> L7b
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61 java.net.ProtocolException -> L6e java.net.MalformedURLException -> L7b
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61 java.net.ProtocolException -> L6e java.net.MalformedURLException -> L7b
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            r6.setReadTimeout(r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            java.lang.String r0 = "Range"
            java.lang.String r1 = "bytes=0-"
            r6.setRequestProperty(r0, r1)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            int r0 = r6.getResponseCode()     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L32
            r0 = 0
            r5.m28490d(r6, r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            goto L3a
        L32:
            r1 = 206(0xce, float:2.89E-43)
            if (r0 != r1) goto L3e
            r0 = 1
            r5.m28490d(r6, r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
        L3a:
            r6.disconnect()
            return
        L3e:
            a8.a r1 = new a8.a     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            r2.<init>()     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            java.lang.String r3 = "UnSupported response code:"
            r2.append(r3)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            r2.append(r0)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            r3 = 3
            r1.<init>(r3, r0, r2)     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
            throw r1     // Catch: java.io.IOException -> L56 java.net.ProtocolException -> L58 java.net.MalformedURLException -> L5a java.lang.Throwable -> L88
        L56:
            r0 = move-exception
            goto L65
        L58:
            r0 = move-exception
            goto L72
        L5a:
            r0 = move-exception
            goto L7f
        L5c:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L89
        L61:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L65:
            a8.a r1 = new a8.a     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "IO error"
            r3 = 5
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L88
        L6e:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L72:
            a8.a r1 = new a8.a     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Protocol error"
            r3 = 4
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L88
        L7b:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L7f:
            a8.a r1 = new a8.a     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Bad url."
            r3 = 2
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
        L89:
            if (r6 == 0) goto L8e
            r6.disconnect()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p381w7.RunnableC7380a.m28488b(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28489c(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            z7.a r0 = r5.f27387c
            r0.m30025x(r6)
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            r6.setReadTimeout(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            java.lang.String r0 = "Range"
            java.lang.String r1 = "bytes=0-"
            r6.setRequestProperty(r0, r1)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            int r0 = r6.getResponseCode()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L32
            r0 = 0
            r5.m28490d(r6, r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            goto L63
        L32:
            r1 = 206(0xce, float:2.89E-43)
            if (r0 != r1) goto L3b
            r0 = 1
            r5.m28490d(r6, r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            goto L63
        L3b:
            a8.a r1 = new a8.a     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            java.lang.String r3 = "UnSupported response code:"
            r2.append(r3)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            r2.append(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            r3 = 3
            r1.<init>(r3, r0, r2)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L67
        L53:
            r0 = move-exception
            goto L5b
        L55:
            r7 = move-exception
            goto L69
        L57:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L5b:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L67
            r5.m28488b(r7)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L66
        L63:
            r6.disconnect()
        L66:
            return
        L67:
            r7 = move-exception
            r0 = r6
        L69:
            if (r0 == 0) goto L6e
            r0.disconnect()
        L6e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p381w7.RunnableC7380a.m28489c(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    private void m28490d(HttpURLConnection httpURLConnection, boolean z10) {
        long contentLength;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (!TextUtils.isEmpty(headerField) && !headerField.equals(MessageService.MSG_DB_READY_REPORT) && !headerField.equals("-1")) {
            contentLength = Long.parseLong(headerField);
        } else {
            contentLength = httpURLConnection.getContentLength();
        }
        if (contentLength > 0) {
            m28487a();
            this.f27388d.mo28059b(contentLength, z10);
            return;
        }
        throw new C0111a(6, "length <= 0");
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        try {
            if (TextUtils.isEmpty(this.f27387c.m30002a())) {
                m28488b(this.f27387c.m30015n());
            } else {
                m28489c(this.f27387c.m30015n(), this.f27387c.m30002a());
            }
        } catch (C0111a e10) {
            this.f27386b.mo28054b(this.f27387c, e10);
        } catch (Exception e11) {
            this.f27386b.mo28054b(this.f27387c, new C0111a(9, e11));
        }
    }
}
