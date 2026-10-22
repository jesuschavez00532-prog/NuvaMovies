package com.dcs.bean;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class URLInfo {
    private String host_alias;
    private String url;

    public URLInfo(String str, String str2) {
        AbstractC5868k.m23674f(str, "host_alias");
        AbstractC5868k.m23674f(str2, "url");
        this.host_alias = str;
        this.url = str2;
    }

    public static /* synthetic */ URLInfo copy$default(URLInfo uRLInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uRLInfo.host_alias;
        }
        if ((i10 & 2) != 0) {
            str2 = uRLInfo.url;
        }
        return uRLInfo.copy(str, str2);
    }

    public final String component1() {
        return this.host_alias;
    }

    public final String component2() {
        return this.url;
    }

    public final URLInfo copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "host_alias");
        AbstractC5868k.m23674f(str2, "url");
        return new URLInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLInfo)) {
            return false;
        }
        URLInfo uRLInfo = (URLInfo) obj;
        return AbstractC5868k.m23669a(this.host_alias, uRLInfo.host_alias) && AbstractC5868k.m23669a(this.url, uRLInfo.url);
    }

    public final String getHost_alias() {
        return this.host_alias;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.host_alias.hashCode() * 31) + this.url.hashCode();
    }

    public final void setHost_alias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.host_alias = str;
    }

    public final void setUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "URLInfo(host_alias=" + this.host_alias + ", url=" + this.url + ')';
    }
}
