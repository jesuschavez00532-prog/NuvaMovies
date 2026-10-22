package anet.channel.util;

import anet.channel.strategy.utils.C1009d;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class HttpUrl {
    private String host;
    private volatile boolean isSchemeLocked;
    private String path;
    private int port;
    private String scheme;
    private String simpleUrl;
    private String url;

    private HttpUrl() {
        this.isSchemeLocked = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r2 <= 65535) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anet.channel.util.HttpUrl parse(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public boolean containsNonDefaultPort() {
        if (this.port != 0 && ((HttpConstant.HTTP.equals(this.scheme) && this.port != 80) || (HttpConstant.HTTPS.equals(this.scheme) && this.port != 443))) {
            return true;
        }
        return false;
    }

    public void downgradeSchemeAndLock() {
        this.isSchemeLocked = true;
        if (!HttpConstant.HTTP.equals(this.scheme)) {
            this.scheme = HttpConstant.HTTP;
            String str = this.url;
            this.url = StringUtils.concatString(HttpConstant.HTTP, ":", str.substring(str.indexOf("//")));
        }
    }

    public int getPort() {
        return this.port;
    }

    public String host() {
        return this.host;
    }

    public boolean isSchemeLocked() {
        return this.isSchemeLocked;
    }

    public void lockScheme() {
        this.isSchemeLocked = true;
    }

    public String path() {
        return this.path;
    }

    public void replaceIpAndPort(String str, int i10) {
        if (str != null) {
            int indexOf = this.url.indexOf("//") + 2;
            while (indexOf < this.url.length() && this.url.charAt(indexOf) != '/') {
                indexOf++;
            }
            boolean m4780b = C1009d.m4780b(str);
            StringBuilder sb2 = new StringBuilder(this.url.length() + str.length());
            sb2.append(this.scheme);
            sb2.append(HttpConstant.SCHEME_SPLIT);
            if (m4780b) {
                sb2.append('[');
            }
            sb2.append(str);
            if (m4780b) {
                sb2.append(']');
            }
            if (i10 != 0) {
                sb2.append(':');
                sb2.append(i10);
            } else if (this.port != 0) {
                sb2.append(':');
                sb2.append(this.port);
            }
            sb2.append(this.url.substring(indexOf));
            this.url = sb2.toString();
        }
    }

    public String scheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        if (!this.isSchemeLocked && !str.equalsIgnoreCase(this.scheme)) {
            this.scheme = str;
            String str2 = this.url;
            String concatString = StringUtils.concatString(str, ":", str2.substring(str2.indexOf("//")));
            this.url = concatString;
            this.simpleUrl = StringUtils.concatString(str, ":", this.simpleUrl.substring(concatString.indexOf("//")));
        }
    }

    public String simpleUrlString() {
        return this.simpleUrl;
    }

    public String toString() {
        return this.url;
    }

    public URL toURL() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String urlString() {
        return this.url;
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.isSchemeLocked = false;
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }
}
