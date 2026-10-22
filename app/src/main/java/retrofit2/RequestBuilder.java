package retrofit2;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes3.dex */
final class RequestBuilder {

    /* renamed from: l */
    private static final char[] f25319l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f25320m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f25321a;

    /* renamed from: b */
    private final HttpUrl f25322b;

    /* renamed from: c */
    private String f25323c;

    /* renamed from: d */
    private HttpUrl.Builder f25324d;

    /* renamed from: e */
    private final Request.Builder f25325e = new Request.Builder();

    /* renamed from: f */
    private final Headers.Builder f25326f;

    /* renamed from: g */
    private MediaType f25327g;

    /* renamed from: h */
    private final boolean f25328h;

    /* renamed from: i */
    private MultipartBody.Builder f25329i;

    /* renamed from: j */
    private FormBody.Builder f25330j;

    /* renamed from: k */
    private RequestBody f25331k;

    /* loaded from: classes3.dex */
    private static class ContentTypeOverridingRequestBody extends RequestBody {

        /* renamed from: a */
        private final RequestBody f25332a;

        /* renamed from: b */
        private final MediaType f25333b;

        ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.f25332a = requestBody;
            this.f25333b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f25332a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f25333b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) {
            this.f25332a.writeTo(bufferedSink);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f25321a = str;
        this.f25322b = httpUrl;
        this.f25323c = str2;
        this.f25327g = mediaType;
        this.f25328h = z10;
        if (headers != null) {
            this.f25326f = headers.newBuilder();
        } else {
            this.f25326f = new Headers.Builder();
        }
        if (z11) {
            this.f25330j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f25329i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: i */
    private static String m25734i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                i10 += Character.charCount(codePointAt);
            } else {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i10);
                m25735j(buffer, str, i10, length, z10);
                return buffer.readUtf8();
            }
        }
        return str;
    }

    /* renamed from: j */
    private static void m25735j(Buffer buffer, String str, int i10, int i11, boolean z10) {
        Buffer buffer2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                    buffer.writeUtf8CodePoint(codePointAt);
                } else {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        int readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        char[] cArr = f25319l;
                        buffer.writeByte((int) cArr[(readByte >> 4) & 15]);
                        buffer.writeByte((int) cArr[readByte & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25736a(String str, String str2, boolean z10) {
        if (z10) {
            this.f25330j.addEncoded(str, str2);
        } else {
            this.f25330j.add(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m25737b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f25327g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        }
        this.f25326f.add(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m25738c(Headers headers) {
        this.f25326f.addAll(headers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m25739d(Headers headers, RequestBody requestBody) {
        this.f25329i.addPart(headers, requestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m25740e(MultipartBody.Part part) {
        this.f25329i.addPart(part);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m25741f(String str, String str2, boolean z10) {
        if (this.f25323c != null) {
            String m25734i = m25734i(str2, z10);
            String replace = this.f25323c.replace("{" + str + "}", m25734i);
            if (!f25320m.matcher(replace).matches()) {
                this.f25323c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m25742g(String str, String str2, boolean z10) {
        String str3 = this.f25323c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f25322b.newBuilder(str3);
            this.f25324d = newBuilder;
            if (newBuilder != null) {
                this.f25323c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f25322b + ", Relative: " + this.f25323c);
            }
        }
        if (z10) {
            this.f25324d.addEncodedQueryParameter(str, str2);
        } else {
            this.f25324d.addQueryParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m25743h(Class cls, Object obj) {
        this.f25325e.tag(cls, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Request.Builder m25744k() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.f25324d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.f25322b.resolve(this.f25323c);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f25322b + ", Relative: " + this.f25323c);
            }
        }
        RequestBody requestBody = this.f25331k;
        if (requestBody == null) {
            FormBody.Builder builder2 = this.f25330j;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f25329i;
                if (builder3 != null) {
                    requestBody = builder3.build();
                } else if (this.f25328h) {
                    requestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f25327g;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new ContentTypeOverridingRequestBody(requestBody, mediaType);
            } else {
                this.f25326f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f25325e.url(resolve).headers(this.f25326f.build()).method(this.f25321a, requestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m25745l(RequestBody requestBody) {
        this.f25331k = requestBody;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m25746m(Object obj) {
        this.f25323c = obj.toString();
    }
}
