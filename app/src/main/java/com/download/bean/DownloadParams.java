package com.download.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DownloadParams implements Serializable {
    private int priority = 100;
    private String cdn_type = "";
    private String url = "";
    private String media_code = "";
    private String auth = "";
    private String license = "";

    public final String getAuth() {
        return this.auth;
    }

    public final String getCdn_type() {
        return this.cdn_type;
    }

    public final String getLicense() {
        return this.license;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAuth(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.auth = str;
    }

    public final void setCdn_type(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.cdn_type = str;
    }

    public final void setLicense(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.license = str;
    }

    public final void setMedia_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.media_code = str;
    }

    public final void setPriority(int i10) {
        this.priority = i10;
    }

    public final void setUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "DownloadParams(priority=" + this.priority + ", cdn_type='" + this.cdn_type + "', url='" + this.url + "', media_code='" + this.media_code + "', auth='" + this.auth + "', license='" + this.license + "')";
    }
}
