package com.advertlib.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.analytics.pro.C3325bt;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AdvertBean {
    private String ad_version;
    private String apk_versioncode;
    private String os_version;
    private String osd_language;
    private String pic_suport;
    private String pkg;
    private String platform;

    /* renamed from: sn */
    private String f5859sn;
    private String video_suport;

    public AdvertBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str, DispatchConstants.PLATFORM);
        AbstractC5868k.m23674f(str2, C3325bt.f14283y);
        AbstractC5868k.m23674f(str3, "ad_version");
        AbstractC5868k.m23674f(str4, "sn");
        AbstractC5868k.m23674f(str5, "osd_language");
        AbstractC5868k.m23674f(str6, "pic_suport");
        AbstractC5868k.m23674f(str7, "video_suport");
        AbstractC5868k.m23674f(str8, "pkg");
        AbstractC5868k.m23674f(str9, "apk_versioncode");
        this.platform = str;
        this.os_version = str2;
        this.ad_version = str3;
        this.f5859sn = str4;
        this.osd_language = str5;
        this.pic_suport = str6;
        this.video_suport = str7;
        this.pkg = str8;
        this.apk_versioncode = str9;
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.os_version;
    }

    public final String component3() {
        return this.ad_version;
    }

    public final String component4() {
        return this.f5859sn;
    }

    public final String component5() {
        return this.osd_language;
    }

    public final String component6() {
        return this.pic_suport;
    }

    public final String component7() {
        return this.video_suport;
    }

    public final String component8() {
        return this.pkg;
    }

    public final String component9() {
        return this.apk_versioncode;
    }

    public final AdvertBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str, DispatchConstants.PLATFORM);
        AbstractC5868k.m23674f(str2, C3325bt.f14283y);
        AbstractC5868k.m23674f(str3, "ad_version");
        AbstractC5868k.m23674f(str4, "sn");
        AbstractC5868k.m23674f(str5, "osd_language");
        AbstractC5868k.m23674f(str6, "pic_suport");
        AbstractC5868k.m23674f(str7, "video_suport");
        AbstractC5868k.m23674f(str8, "pkg");
        AbstractC5868k.m23674f(str9, "apk_versioncode");
        return new AdvertBean(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertBean)) {
            return false;
        }
        AdvertBean advertBean = (AdvertBean) obj;
        return AbstractC5868k.m23669a(this.platform, advertBean.platform) && AbstractC5868k.m23669a(this.os_version, advertBean.os_version) && AbstractC5868k.m23669a(this.ad_version, advertBean.ad_version) && AbstractC5868k.m23669a(this.f5859sn, advertBean.f5859sn) && AbstractC5868k.m23669a(this.osd_language, advertBean.osd_language) && AbstractC5868k.m23669a(this.pic_suport, advertBean.pic_suport) && AbstractC5868k.m23669a(this.video_suport, advertBean.video_suport) && AbstractC5868k.m23669a(this.pkg, advertBean.pkg) && AbstractC5868k.m23669a(this.apk_versioncode, advertBean.apk_versioncode);
    }

    public final String getAd_version() {
        return this.ad_version;
    }

    public final String getApk_versioncode() {
        return this.apk_versioncode;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getOsd_language() {
        return this.osd_language;
    }

    public final String getPic_suport() {
        return this.pic_suport;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSn() {
        return this.f5859sn;
    }

    public final String getVideo_suport() {
        return this.video_suport;
    }

    public int hashCode() {
        return (((((((((((((((this.platform.hashCode() * 31) + this.os_version.hashCode()) * 31) + this.ad_version.hashCode()) * 31) + this.f5859sn.hashCode()) * 31) + this.osd_language.hashCode()) * 31) + this.pic_suport.hashCode()) * 31) + this.video_suport.hashCode()) * 31) + this.pkg.hashCode()) * 31) + this.apk_versioncode.hashCode();
    }

    public final void setAd_version(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.ad_version = str;
    }

    public final void setApk_versioncode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.apk_versioncode = str;
    }

    public final void setOs_version(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.os_version = str;
    }

    public final void setOsd_language(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.osd_language = str;
    }

    public final void setPic_suport(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pic_suport = str;
    }

    public final void setPkg(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pkg = str;
    }

    public final void setPlatform(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.platform = str;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f5859sn = str;
    }

    public final void setVideo_suport(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.video_suport = str;
    }

    public String toString() {
        return "AdvertBean(platform=" + this.platform + ", os_version=" + this.os_version + ", ad_version=" + this.ad_version + ", sn=" + this.f5859sn + ", osd_language=" + this.osd_language + ", pic_suport=" + this.pic_suport + ", video_suport=" + this.video_suport + ", pkg=" + this.pkg + ", apk_versioncode=" + this.apk_versioncode + ')';
    }
}
