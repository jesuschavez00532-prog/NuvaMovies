package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class Epg4bRequestBean implements Serializable {
    private String app;
    private String pkg;

    /* renamed from: sn */
    private String f12696sn;
    private String vercode;
    private String version;

    public Epg4bRequestBean(String str, String str2, String str3, String str4, String str5) {
        this.f12696sn = str;
        this.app = str2;
        this.version = str3;
        this.pkg = str4;
        this.vercode = str5;
    }

    public static /* synthetic */ Epg4bRequestBean copy$default(Epg4bRequestBean epg4bRequestBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = epg4bRequestBean.f12696sn;
        }
        if ((i10 & 2) != 0) {
            str2 = epg4bRequestBean.app;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = epg4bRequestBean.version;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = epg4bRequestBean.pkg;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = epg4bRequestBean.vercode;
        }
        return epg4bRequestBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.f12696sn;
    }

    public final String component2() {
        return this.app;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.pkg;
    }

    public final String component5() {
        return this.vercode;
    }

    public final Epg4bRequestBean copy(String str, String str2, String str3, String str4, String str5) {
        return new Epg4bRequestBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Epg4bRequestBean)) {
            return false;
        }
        Epg4bRequestBean epg4bRequestBean = (Epg4bRequestBean) obj;
        return AbstractC5868k.m23669a(this.f12696sn, epg4bRequestBean.f12696sn) && AbstractC5868k.m23669a(this.app, epg4bRequestBean.app) && AbstractC5868k.m23669a(this.version, epg4bRequestBean.version) && AbstractC5868k.m23669a(this.pkg, epg4bRequestBean.pkg) && AbstractC5868k.m23669a(this.vercode, epg4bRequestBean.vercode);
    }

    public final String getApp() {
        return this.app;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final String getSn() {
        return this.f12696sn;
    }

    public final String getVercode() {
        return this.vercode;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f12696sn;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.app;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pkg;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vercode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setApp(String str) {
        this.app = str;
    }

    public final void setPkg(String str) {
        this.pkg = str;
    }

    public final void setSn(String str) {
        this.f12696sn = str;
    }

    public final void setVercode(String str) {
        this.vercode = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "Epg4bRequestBean(sn=" + this.f12696sn + ", app=" + this.app + ", version=" + this.version + ", pkg=" + this.pkg + ", vercode=" + this.vercode + ')';
    }
}
