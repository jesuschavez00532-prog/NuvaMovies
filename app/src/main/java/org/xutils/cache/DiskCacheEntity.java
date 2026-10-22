package org.xutils.cache;

import com.lzy.okgo.cache.CacheEntity;
import java.util.Date;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "disk_cache")
/* loaded from: classes3.dex */
public final class DiskCacheEntity {

    @Column(name = "bytesContent")
    private byte[] bytesContent;

    @Column(name = "etag")
    private String etag;

    @Column(name = "expires")
    private long expires = Long.MAX_VALUE;

    @Column(name = "hits")
    private long hits;

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private long f23990id;

    @Column(name = CacheEntity.KEY, property = "UNIQUE")
    private String key;

    @Column(name = "lastAccess")
    private long lastAccess;

    @Column(name = "lastModify")
    private Date lastModify;

    @Column(name = "path")
    private String path;

    @Column(name = "textContent")
    private String textContent;

    public byte[] getBytesContent() {
        return this.bytesContent;
    }

    public String getEtag() {
        return this.etag;
    }

    public long getExpires() {
        return this.expires;
    }

    public long getHits() {
        return this.hits;
    }

    public long getId() {
        return this.f23990id;
    }

    public String getKey() {
        return this.key;
    }

    public long getLastAccess() {
        long j10 = this.lastAccess;
        if (j10 == 0) {
            return System.currentTimeMillis();
        }
        return j10;
    }

    public Date getLastModify() {
        return this.lastModify;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getPath() {
        return this.path;
    }

    public String getTextContent() {
        return this.textContent;
    }

    public void setBytesContent(byte[] bArr) {
        this.bytesContent = bArr;
    }

    public void setEtag(String str) {
        this.etag = str;
    }

    public void setExpires(long j10) {
        this.expires = j10;
    }

    public void setHits(long j10) {
        this.hits = j10;
    }

    public void setId(long j10) {
        this.f23990id = j10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastAccess(long j10) {
        this.lastAccess = j10;
    }

    public void setLastModify(Date date) {
        this.lastModify = date;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPath(String str) {
        this.path = str;
    }

    public void setTextContent(String str) {
        this.textContent = str;
    }
}
