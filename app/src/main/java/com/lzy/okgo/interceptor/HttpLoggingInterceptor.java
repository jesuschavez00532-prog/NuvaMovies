package com.lzy.okgo.interceptor;

import anet.channel.request.Request;
import com.lzy.okgo.utils.IOUtils;
import com.lzy.okgo.utils.OkLogger;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;

/* loaded from: classes2.dex */
public class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName(Request.DEFAULT_CHARSET);
    private java.util.logging.Level colorLevel;
    private Logger logger;
    private volatile Level printLevel = Level.NONE;

    /* loaded from: classes2.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public HttpLoggingInterceptor(String str) {
        this.logger = Logger.getLogger(str);
    }

    private void bodyToString(okhttp3.Request request) {
        try {
            RequestBody body = request.newBuilder().build().body();
            if (body == null) {
                return;
            }
            Buffer buffer = new Buffer();
            body.writeTo(buffer);
            log("\tbody:" + buffer.readString(getCharset(body.contentType())));
        } catch (Exception e10) {
            OkLogger.printStackTrace(e10);
        }
    }

    private static Charset getCharset(MediaType mediaType) {
        Charset charset;
        if (mediaType != null) {
            charset = mediaType.charset(UTF8);
        } else {
            charset = UTF8;
        }
        if (charset == null) {
            return UTF8;
        }
        return charset;
    }

    private static boolean isPlaintext(MediaType mediaType) {
        if (mediaType == null) {
            return false;
        }
        if (mediaType.type() != null && mediaType.type().equals("text")) {
            return true;
        }
        String subtype = mediaType.subtype();
        if (subtype != null) {
            String lowerCase = subtype.toLowerCase();
            if (lowerCase.contains("x-www-form-urlencoded") || lowerCase.contains("json") || lowerCase.contains("xml") || lowerCase.contains("html")) {
                return true;
            }
        }
        return false;
    }

    private void log(String str) {
        this.logger.log(this.colorLevel, str);
    }

    private void logForRequest(okhttp3.Request request, Connection connection) {
        boolean z10;
        boolean z11;
        Protocol protocol;
        StringBuilder sb2;
        Level level = this.printLevel;
        Level level2 = Level.BODY;
        boolean z12 = true;
        if (level == level2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.printLevel != level2 && this.printLevel != Level.HEADERS) {
            z11 = false;
        } else {
            z11 = true;
        }
        RequestBody body = request.body();
        if (body == null) {
            z12 = false;
        }
        if (connection != null) {
            protocol = connection.protocol();
        } else {
            protocol = Protocol.HTTP_1_1;
        }
        try {
            try {
                log("--> " + request.method() + ' ' + request.url() + ' ' + protocol);
                if (z11) {
                    if (z12) {
                        if (body.contentType() != null) {
                            log("\tContent-Type: " + body.contentType());
                        }
                        if (body.contentLength() != -1) {
                            log("\tContent-Length: " + body.contentLength());
                        }
                    }
                    Headers headers = request.headers();
                    int size = headers.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String name = headers.name(i10);
                        if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
                            log("\t" + name + ": " + headers.value(i10));
                        }
                    }
                    log(" ");
                    if (z10 && z12) {
                        if (isPlaintext(body.contentType())) {
                            bodyToString(request);
                        } else {
                            log("\tbody: maybe [binary body], omitted!");
                        }
                    }
                }
                sb2 = new StringBuilder();
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                sb2 = new StringBuilder();
            }
            sb2.append("--> END ");
            sb2.append(request.method());
            log(sb2.toString());
        } catch (Throwable th) {
            log("--> END " + request.method());
            throw th;
        }
    }

    private Response logForResponse(Response response, long j10) {
        boolean z10;
        Response build = response.newBuilder().build();
        ResponseBody body = build.body();
        Level level = this.printLevel;
        Level level2 = Level.BODY;
        boolean z11 = true;
        if (level == level2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.printLevel != level2 && this.printLevel != Level.HEADERS) {
            z11 = false;
        }
        try {
            try {
                log("<-- " + build.code() + ' ' + build.message() + ' ' + build.request().url() + " (" + j10 + "ms）");
                if (z11) {
                    Headers headers = build.headers();
                    int size = headers.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        log("\t" + headers.name(i10) + ": " + headers.value(i10));
                    }
                    log(" ");
                    if (z10 && HttpHeaders.hasBody(build)) {
                        if (body == null) {
                            return response;
                        }
                        if (isPlaintext(body.contentType())) {
                            byte[] byteArray = IOUtils.toByteArray(body.byteStream());
                            log("\tbody:" + new String(byteArray, getCharset(body.contentType())));
                            return response.newBuilder().body(ResponseBody.create(body.contentType(), byteArray)).build();
                        }
                        log("\tbody: maybe [binary body], omitted!");
                    }
                }
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
            }
            return response;
        } finally {
            log("<-- END HTTP");
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        okhttp3.Request request = chain.request();
        if (this.printLevel == Level.NONE) {
            return chain.proceed(request);
        }
        logForRequest(request, chain.connection());
        try {
            return logForResponse(chain.proceed(request), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - System.nanoTime()));
        } catch (Exception e10) {
            log("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    public void setColorLevel(java.util.logging.Level level) {
        this.colorLevel = level;
    }

    public void setPrintLevel(Level level) {
        if (this.printLevel != null) {
            this.printLevel = level;
            return;
        }
        throw new NullPointerException("printLevel == null. Use Level.NONE instead.");
    }
}
