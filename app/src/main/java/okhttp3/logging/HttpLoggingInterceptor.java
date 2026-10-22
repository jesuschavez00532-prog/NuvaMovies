package okhttp3.logging;

import anet.channel.request.Request;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName(Request.DEFAULT_CHARSET);
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* loaded from: classes3.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* loaded from: classes3.dex */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: okhttp3.logging.HttpLoggingInterceptor.Logger.1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Platform.get().log(4, str, null);
            }
        };

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    private static boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str != null && !str.equalsIgnoreCase("identity") && !str.equalsIgnoreCase("gzip")) {
            return true;
        }
        return false;
    }

    static boolean isPlaintext(Buffer buffer) {
        long j10;
        try {
            Buffer buffer2 = new Buffer();
            if (buffer.size() < 64) {
                j10 = buffer.size();
            } else {
                j10 = 64;
            }
            buffer.copyTo(buffer2, 0L, j10);
            for (int i10 = 0; i10 < 16; i10++) {
                if (!buffer2.exhausted()) {
                    int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                    if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private void logHeader(Headers headers, int i10) {
        String value;
        if (this.headersToRedact.contains(headers.name(i10))) {
            value = "██";
        } else {
            value = headers.value(i10);
        }
        this.logger.log(headers.name(i10) + ": " + value);
    }

    public Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Long] */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        long j10;
        char c10;
        String sb2;
        String str3;
        Level level = this.level;
        okhttp3.Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z12 = true;
        if (level == Level.BODY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && level != Level.HEADERS) {
            z11 = false;
        } else {
            z11 = true;
        }
        RequestBody body = request.body();
        if (body == null) {
            z12 = false;
        }
        Connection connection = chain.connection();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(request.method());
        sb3.append(' ');
        sb3.append(request.url());
        if (connection == null) {
            str = "";
        } else {
            str = " " + connection.protocol();
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        if (!z11 && z12) {
            sb4 = sb4 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb4);
        if (z11) {
            if (z12) {
                if (body.contentType() != null) {
                    this.logger.log("Content-Type: " + body.contentType());
                }
                if (body.contentLength() != -1) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String name = headers.name(i10);
                if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
                    logHeader(headers, i10);
                }
            }
            if (z10 && z12) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else {
                    Buffer buffer = new Buffer();
                    body.writeTo(buffer);
                    Charset charset = UTF8;
                    MediaType contentType = body.contentType();
                    if (contentType != null) {
                        charset = contentType.charset(charset);
                    }
                    this.logger.log("");
                    if (isPlaintext(buffer)) {
                        this.logger.log(buffer.readString(charset));
                        this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                    } else {
                        this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.logger.log("--> END " + request.method());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger = this.logger;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<-- ");
            sb5.append(proceed.code());
            if (proceed.message().isEmpty()) {
                sb2 = "";
                j10 = contentLength;
                c10 = ' ';
            } else {
                StringBuilder sb6 = new StringBuilder();
                j10 = contentLength;
                c10 = ' ';
                sb6.append(' ');
                sb6.append(proceed.message());
                sb2 = sb6.toString();
            }
            sb5.append(sb2);
            sb5.append(c10);
            sb5.append(proceed.request().url());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            if (z11) {
                str3 = "";
            } else {
                str3 = ", " + str2 + " body";
            }
            sb5.append(str3);
            sb5.append(')');
            logger.log(sb5.toString());
            if (z11) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    logHeader(headers2, i11);
                }
                if (z10 && HttpHeaders.hasBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        BufferedSource source = body2.source();
                        source.request(Long.MAX_VALUE);
                        Buffer buffer2 = source.buffer();
                        GzipSource gzipSource = null;
                        if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                            Object valueOf = Long.valueOf(buffer2.size());
                            try {
                                GzipSource gzipSource2 = new GzipSource(buffer2.clone());
                                try {
                                    buffer2 = new Buffer();
                                    buffer2.writeAll(gzipSource2);
                                    gzipSource2.close();
                                    gzipSource = valueOf;
                                } catch (Throwable th) {
                                    th = th;
                                    gzipSource = gzipSource2;
                                    if (gzipSource != null) {
                                        gzipSource.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        Charset charset2 = UTF8;
                        MediaType contentType2 = body2.contentType();
                        if (contentType2 != null) {
                            charset2 = contentType2.charset(charset2);
                        }
                        if (!isPlaintext(buffer2)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                            return proceed;
                        }
                        if (j10 != 0) {
                            this.logger.log("");
                            this.logger.log(buffer2.clone().readString(charset2));
                        }
                        if (gzipSource != null) {
                            this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte, " + gzipSource + "-gzipped-byte body)");
                        } else {
                            this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                        }
                    }
                } else {
                    this.logger.log("<-- END HTTP");
                }
            }
            return proceed;
        } catch (Exception e10) {
            this.logger.log("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    public void redactHeader(String str) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public HttpLoggingInterceptor setLevel(Level level) {
        if (level != null) {
            this.level = level;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.headersToRedact = Collections.emptySet();
        this.level = Level.NONE;
        this.logger = logger;
    }
}
