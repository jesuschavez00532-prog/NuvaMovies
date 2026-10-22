package org.xutils.http.cookie;

import android.text.TextUtils;
import com.lzy.okgo.cookie.SerializableCookie;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.net.HttpCookie;
import java.net.URI;
import org.xutils.p274db.annotation.Column;

/* renamed from: org.xutils.http.cookie.a */
/* loaded from: classes3.dex */
final class C6106a {
    private static final long MAX_EXPIRY = System.currentTimeMillis() + 3110400000000L;

    @Column(name = "comment")
    private String comment;

    @Column(name = "commentURL")
    private String commentURL;

    @Column(name = "discard")
    private boolean discard;

    @Column(name = "domain")
    private String domain;

    @Column(name = "expiry")
    private long expiry;

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private long f24046id;

    @Column(name = SerializableCookie.NAME)
    private String name;

    @Column(name = "path")
    private String path;

    @Column(name = "portList")
    private String portList;

    @Column(name = "secure")
    private boolean secure;

    @Column(name = "uri")
    private String uri;

    @Column(name = "value")
    private String value;

    @Column(name = "version")
    private int version;

    public C6106a() {
        this.expiry = MAX_EXPIRY;
        this.version = 1;
    }

    public long getId() {
        return this.f24046id;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isExpired() {
        long j10 = this.expiry;
        if (j10 != -1 && j10 < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void setId(long j10) {
        this.f24046id = j10;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public HttpCookie toHttpCookie() {
        HttpCookie httpCookie = new HttpCookie(this.name, this.value);
        httpCookie.setComment(this.comment);
        httpCookie.setCommentURL(this.commentURL);
        httpCookie.setDiscard(this.discard);
        httpCookie.setDomain(this.domain);
        long j10 = this.expiry;
        if (j10 == -1) {
            httpCookie.setMaxAge(-1L);
        } else {
            httpCookie.setMaxAge((j10 - System.currentTimeMillis()) / 1000);
        }
        httpCookie.setPath(this.path);
        httpCookie.setPortlist(this.portList);
        httpCookie.setSecure(this.secure);
        httpCookie.setVersion(this.version);
        return httpCookie;
    }

    public C6106a(URI uri, HttpCookie httpCookie) {
        long j10 = MAX_EXPIRY;
        this.expiry = j10;
        this.version = 1;
        this.uri = uri == null ? null : uri.toString();
        this.name = httpCookie.getName();
        this.value = httpCookie.getValue();
        this.comment = httpCookie.getComment();
        this.commentURL = httpCookie.getCommentURL();
        this.discard = httpCookie.getDiscard();
        this.domain = httpCookie.getDomain();
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0) {
            long currentTimeMillis = (maxAge * 1000) + System.currentTimeMillis();
            this.expiry = currentTimeMillis;
            if (currentTimeMillis < 0) {
                this.expiry = j10;
            }
        } else {
            this.expiry = -1L;
        }
        String path = httpCookie.getPath();
        this.path = path;
        if (!TextUtils.isEmpty(path) && this.path.length() > 1 && this.path.endsWith(Operator.Operation.DIVISION)) {
            String str = this.path;
            this.path = str.substring(0, str.length() - 1);
        }
        this.portList = httpCookie.getPortlist();
        this.secure = httpCookie.getSecure();
        this.version = httpCookie.getVersion();
    }
}
