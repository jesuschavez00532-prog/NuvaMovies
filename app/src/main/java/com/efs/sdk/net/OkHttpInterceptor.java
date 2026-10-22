package com.efs.sdk.net;

import com.efs.sdk.net.p057a.p058a.C1756a;
import com.efs.sdk.net.p057a.p058a.C1760e;
import com.efs.sdk.net.p057a.p058a.C1762g;
import com.efs.sdk.net.p057a.p058a.C1763h;
import com.efs.sdk.net.p057a.p058a.InterfaceC1761f;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes.dex */
public class OkHttpInterceptor implements Interceptor {

    /* renamed from: a */
    private final InterfaceC1761f f7328a = C1762g.m7855c();

    /* renamed from: com.efs.sdk.net.OkHttpInterceptor$a */
    /* loaded from: classes.dex */
    static class C1750a extends ResponseBody {

        /* renamed from: a */
        private final ResponseBody f7329a;

        /* renamed from: b */
        private final BufferedSource f7330b;

        public C1750a(ResponseBody responseBody, InputStream inputStream) {
            this.f7329a = responseBody;
            this.f7330b = Okio.buffer(Okio.source(inputStream));
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f7329a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f7329a.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return this.f7330b;
        }
    }

    /* renamed from: com.efs.sdk.net.OkHttpInterceptor$b */
    /* loaded from: classes.dex */
    static class C1751b implements InterfaceC1761f.b {

        /* renamed from: a */
        private final String f7331a;

        /* renamed from: b */
        private final Request f7332b;

        /* renamed from: c */
        private C1763h f7333c;

        public C1751b(String str, Request request, C1763h c1763h) {
            this.f7331a = str;
            this.f7332b = request;
            this.f7333c = c1763h;
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.c
        /* renamed from: a */
        public final String mo7822a() {
            return this.f7331a;
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.b
        /* renamed from: b */
        public final String mo7824b() {
            return this.f7332b.url().toString();
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.b
        /* renamed from: c */
        public final String mo7826c() {
            return this.f7332b.method();
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.b
        /* renamed from: d */
        public final byte[] mo7827d() {
            OutputStream outputStream;
            RequestBody body = this.f7332b.body();
            if (body == null) {
                return null;
            }
            C1763h c1763h = this.f7333c;
            String header = this.f7332b.header("Content-Encoding");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if ("gzip".equals(header)) {
                outputStream = C1760e.m7847a(byteArrayOutputStream);
            } else if ("deflate".equals(header)) {
                outputStream = new InflaterOutputStream(byteArrayOutputStream);
            } else {
                outputStream = byteArrayOutputStream;
            }
            C1756a c1756a = new C1756a(outputStream);
            c1763h.f7364c = c1756a;
            c1763h.f7363b = byteArrayOutputStream;
            BufferedSink buffer = Okio.buffer(Okio.sink(c1756a));
            try {
                body.writeTo(buffer);
                buffer.close();
                C1763h c1763h2 = this.f7333c;
                c1763h2.m7857b();
                return c1763h2.f7363b.toByteArray();
            } catch (Throwable th) {
                buffer.close();
                throw th;
            }
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: e */
        public final int mo7828e() {
            return this.f7332b.headers().size();
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: a */
        public final String mo7823a(int i10) {
            return this.f7332b.headers().name(i10);
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: b */
        public final String mo7825b(int i10) {
            return this.f7332b.headers().value(i10);
        }
    }

    /* renamed from: com.efs.sdk.net.OkHttpInterceptor$c */
    /* loaded from: classes.dex */
    static class C1752c implements InterfaceC1761f.d {

        /* renamed from: a */
        private final String f7334a;

        /* renamed from: b */
        private final Request f7335b;

        /* renamed from: c */
        private final Response f7336c;

        /* renamed from: d */
        private final Connection f7337d;

        public C1752c(String str, Request request, Response response, Connection connection) {
            this.f7334a = str;
            this.f7335b = request;
            this.f7336c = response;
            this.f7337d = connection;
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.e
        /* renamed from: a */
        public final String mo7829a() {
            return this.f7334a;
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.e
        /* renamed from: b */
        public final int mo7830b() {
            return this.f7336c.code();
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: e */
        public final int mo7828e() {
            return this.f7336c.headers().size();
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: a */
        public final String mo7823a(int i10) {
            return this.f7336c.headers().name(i10);
        }

        @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f.a
        /* renamed from: b */
        public final String mo7825b(int i10) {
            return this.f7336c.headers().value(i10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(1:5)|(3:55|56|(1:58)(6:59|15|(3:38|39|(1:41)(1:42))|(1:20)|21|(6:23|(1:25)(1:35)|26|(1:28)|29|(2:31|32)(1:34))(2:36|37)))|(1:9)(1:54)|10|11|12|13|14|15|(0)|(2:18|20)|21|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        r8 = r3;
        r3 = r0;
        r0 = r5;
        r5 = r4;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        r5 = r4;
        r4 = r3;
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:39:0x00a3, B:18:0x00ae, B:20:0x00b4, B:21:0x00c1, B:23:0x00c7, B:25:0x00d7, B:26:0x00e2, B:28:0x00e6, B:29:0x00ea, B:31:0x00fd, B:36:0x0110, B:37:0x0117), top: B:38:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:39:0x00a3, B:18:0x00ae, B:20:0x00b4, B:21:0x00c1, B:23:0x00c7, B:25:0x00d7, B:26:0x00e2, B:28:0x00e6, B:29:0x00ea, B:31:0x00fd, B:36:0x0110, B:37:0x0117), top: B:38:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:39:0x00a3, B:18:0x00ae, B:20:0x00b4, B:21:0x00c1, B:23:0x00c7, B:25:0x00d7, B:26:0x00e2, B:28:0x00e6, B:29:0x00ea, B:31:0x00fd, B:36:0x0110, B:37:0x0117), top: B:38:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
