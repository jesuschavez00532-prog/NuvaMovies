package anet.channel.request;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class Request {
    public static final String DEFAULT_CHARSET = "UTF-8";

    /* renamed from: a */
    public final RequestStatistic f3956a;

    /* renamed from: b */
    private HttpUrl f3957b;

    /* renamed from: c */
    private HttpUrl f3958c;

    /* renamed from: d */
    private HttpUrl f3959d;

    /* renamed from: e */
    private URL f3960e;

    /* renamed from: f */
    private String f3961f;

    /* renamed from: g */
    private Map<String, String> f3962g;

    /* renamed from: h */
    private Map<String, String> f3963h;

    /* renamed from: i */
    private String f3964i;

    /* renamed from: j */
    private BodyEntry f3965j;

    /* renamed from: k */
    private boolean f3966k;

    /* renamed from: l */
    private String f3967l;

    /* renamed from: m */
    private String f3968m;

    /* renamed from: n */
    private int f3969n;

    /* renamed from: o */
    private int f3970o;

    /* renamed from: p */
    private int f3971p;

    /* renamed from: q */
    private HostnameVerifier f3972q;

    /* renamed from: r */
    private SSLSocketFactory f3973r;

    /* renamed from: s */
    private boolean f3974s;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private HttpUrl f3975a;

        /* renamed from: b */
        private HttpUrl f3976b;

        /* renamed from: e */
        private Map<String, String> f3979e;

        /* renamed from: f */
        private String f3980f;

        /* renamed from: g */
        private BodyEntry f3981g;

        /* renamed from: j */
        private HostnameVerifier f3984j;

        /* renamed from: k */
        private SSLSocketFactory f3985k;

        /* renamed from: l */
        private String f3986l;

        /* renamed from: m */
        private String f3987m;

        /* renamed from: q */
        private boolean f3991q;

        /* renamed from: c */
        private String f3977c = "GET";

        /* renamed from: d */
        private Map<String, String> f3978d = new HashMap();

        /* renamed from: h */
        private boolean f3982h = true;

        /* renamed from: i */
        private int f3983i = 0;

        /* renamed from: n */
        private int f3988n = 10000;

        /* renamed from: o */
        private int f3989o = 10000;

        /* renamed from: p */
        private RequestStatistic f3990p = null;

        public Builder addHeader(String str, String str2) {
            this.f3978d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f3979e == null) {
                this.f3979e = new HashMap();
            }
            this.f3979e.put(str, str2);
            this.f3976b = null;
            return this;
        }

        public Request build() {
            if (this.f3981g == null && this.f3979e == null && Method.m4641a(this.f3977c)) {
                ALog.m4787e("awcn.Request", "method " + this.f3977c + " must have a request body", null, new Object[0]);
            }
            if (this.f3981g != null && !Method.m4642b(this.f3977c)) {
                ALog.m4787e("awcn.Request", "method " + this.f3977c + " should not have a request body", null, new Object[0]);
                this.f3981g = null;
            }
            BodyEntry bodyEntry = this.f3981g;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.f3981g.getContentType());
            }
            return new Request(this);
        }

        public Builder setAllowRequestInBg(boolean z10) {
            this.f3991q = z10;
            return this;
        }

        public Builder setBizId(String str) {
            this.f3986l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f3981g = bodyEntry;
            return this;
        }

        public Builder setCharset(String str) {
            this.f3980f = str;
            this.f3976b = null;
            return this;
        }

        public Builder setConnectTimeout(int i10) {
            if (i10 > 0) {
                this.f3988n = i10;
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f3978d.clear();
            if (map != null) {
                this.f3978d.putAll(map);
            }
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f3984j = hostnameVerifier;
            return this;
        }

        public Builder setMethod(String str) {
            if (!TextUtils.isEmpty(str)) {
                if ("GET".equalsIgnoreCase(str)) {
                    this.f3977c = "GET";
                } else if ("POST".equalsIgnoreCase(str)) {
                    this.f3977c = "POST";
                } else if (Method.OPTION.equalsIgnoreCase(str)) {
                    this.f3977c = Method.OPTION;
                } else if (Method.HEAD.equalsIgnoreCase(str)) {
                    this.f3977c = Method.HEAD;
                } else if (Method.PUT.equalsIgnoreCase(str)) {
                    this.f3977c = Method.PUT;
                } else if ("DELETE".equalsIgnoreCase(str)) {
                    this.f3977c = "DELETE";
                } else {
                    this.f3977c = "GET";
                }
                return this;
            }
            throw new IllegalArgumentException("method is null or empty");
        }

        public Builder setParams(Map<String, String> map) {
            this.f3979e = map;
            this.f3976b = null;
            return this;
        }

        public Builder setReadTimeout(int i10) {
            if (i10 > 0) {
                this.f3989o = i10;
            }
            return this;
        }

        public Builder setRedirectEnable(boolean z10) {
            this.f3982h = z10;
            return this;
        }

        public Builder setRedirectTimes(int i10) {
            this.f3983i = i10;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f3990p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f3987m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f3985k = sSLSocketFactory;
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f3975a = httpUrl;
            this.f3976b = null;
            return this;
        }

        public Builder setUrl(String str) {
            HttpUrl parse = HttpUrl.parse(str);
            this.f3975a = parse;
            this.f3976b = null;
            if (parse != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }
    }

    /* loaded from: classes.dex */
    public static final class Method {
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTION = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";

        /* renamed from: a */
        static boolean m4641a(String str) {
            if (!str.equals("POST") && !str.equals(PUT)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        static boolean m4642b(String str) {
            if (!m4641a(str) && !str.equals("DELETE") && !str.equals(OPTION)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private Map<String, String> m4605a() {
        if (AwcnConfig.isCookieHeaderRedundantFix()) {
            return new HashMap(this.f3962g);
        }
        return this.f3962g;
    }

    /* renamed from: b */
    private void m4606b() {
        String m4778a = C1009d.m4778a(this.f3963h, getContentEncoding());
        if (!TextUtils.isEmpty(m4778a)) {
            if (Method.m4641a(this.f3961f) && this.f3965j == null) {
                try {
                    this.f3965j = new ByteArrayEntry(m4778a.getBytes(getContentEncoding()));
                    this.f3962g.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                String urlString = this.f3957b.urlString();
                StringBuilder sb2 = new StringBuilder(urlString);
                if (sb2.indexOf(Operator.Operation.EMPTY_PARAM) == -1) {
                    sb2.append('?');
                } else if (urlString.charAt(urlString.length() - 1) != '&') {
                    sb2.append('&');
                }
                sb2.append(m4778a);
                HttpUrl parse = HttpUrl.parse(sb2.toString());
                if (parse != null) {
                    this.f3958c = parse;
                }
            }
        }
        if (this.f3958c == null) {
            this.f3958c = this.f3957b;
        }
    }

    public boolean containsBody() {
        if (this.f3965j != null) {
            return true;
        }
        return false;
    }

    public String getBizId() {
        return this.f3967l;
    }

    public byte[] getBodyBytes() {
        if (this.f3965j != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
            try {
                postBody(byteArrayOutputStream);
            } catch (IOException unused) {
            }
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public int getConnectTimeout() {
        return this.f3970o;
    }

    public String getContentEncoding() {
        String str = this.f3964i;
        if (str == null) {
            return DEFAULT_CHARSET;
        }
        return str;
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f3962g);
    }

    public String getHost() {
        return this.f3958c.host();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f3972q;
    }

    public HttpUrl getHttpUrl() {
        return this.f3958c;
    }

    public String getMethod() {
        return this.f3961f;
    }

    public int getReadTimeout() {
        return this.f3971p;
    }

    public int getRedirectTimes() {
        return this.f3969n;
    }

    public String getSeq() {
        return this.f3968m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f3973r;
    }

    public URL getUrl() {
        if (this.f3960e == null) {
            HttpUrl httpUrl = this.f3959d;
            if (httpUrl == null) {
                httpUrl = this.f3958c;
            }
            this.f3960e = httpUrl.toURL();
        }
        return this.f3960e;
    }

    public String getUrlString() {
        return this.f3958c.urlString();
    }

    public boolean isAllowRequestInBg() {
        return this.f3974s;
    }

    public boolean isRedirectEnable() {
        return this.f3966k;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f3977c = this.f3961f;
        builder.f3978d = m4605a();
        builder.f3979e = this.f3963h;
        builder.f3981g = this.f3965j;
        builder.f3980f = this.f3964i;
        builder.f3982h = this.f3966k;
        builder.f3983i = this.f3969n;
        builder.f3984j = this.f3972q;
        builder.f3985k = this.f3973r;
        builder.f3975a = this.f3957b;
        builder.f3976b = this.f3958c;
        builder.f3986l = this.f3967l;
        builder.f3987m = this.f3968m;
        builder.f3988n = this.f3970o;
        builder.f3989o = this.f3971p;
        builder.f3990p = this.f3956a;
        builder.f3991q = this.f3974s;
        return builder;
    }

    public int postBody(OutputStream outputStream) {
        BodyEntry bodyEntry = this.f3965j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    public void setDnsOptimize(String str, int i10) {
        if (str != null) {
            if (this.f3959d == null) {
                this.f3959d = new HttpUrl(this.f3958c);
            }
            this.f3959d.replaceIpAndPort(str, i10);
        } else {
            this.f3959d = null;
        }
        this.f3960e = null;
        this.f3956a.setIPAndPort(str, i10);
    }

    public void setUrlScheme(boolean z10) {
        String str;
        if (this.f3959d == null) {
            this.f3959d = new HttpUrl(this.f3958c);
        }
        HttpUrl httpUrl = this.f3959d;
        if (z10) {
            str = HttpConstant.HTTPS;
        } else {
            str = HttpConstant.HTTP;
        }
        httpUrl.setScheme(str);
        this.f3960e = null;
    }

    private Request(Builder builder) {
        this.f3961f = "GET";
        this.f3966k = true;
        this.f3969n = 0;
        this.f3970o = 10000;
        this.f3971p = 10000;
        this.f3961f = builder.f3977c;
        this.f3962g = builder.f3978d;
        this.f3963h = builder.f3979e;
        this.f3965j = builder.f3981g;
        this.f3964i = builder.f3980f;
        this.f3966k = builder.f3982h;
        this.f3969n = builder.f3983i;
        this.f3972q = builder.f3984j;
        this.f3973r = builder.f3985k;
        this.f3967l = builder.f3986l;
        this.f3968m = builder.f3987m;
        this.f3970o = builder.f3988n;
        this.f3971p = builder.f3989o;
        this.f3957b = builder.f3975a;
        HttpUrl httpUrl = builder.f3976b;
        this.f3958c = httpUrl;
        if (httpUrl == null) {
            m4606b();
        }
        this.f3956a = builder.f3990p != null ? builder.f3990p : new RequestStatistic(getHost(), this.f3967l);
        this.f3974s = builder.f3991q;
    }
}
