package com.advertlib.bean;

import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class AdReportBean {
    private String ad_id;
    private String ad_name;
    private String ad_type;
    private int apk_version;
    private String app_id;
    private int click_times;
    private int display_times;
    private long game_stay_time;
    private long last_update_timestamp;
    private String media_type;

    /* renamed from: sn */
    private String f5857sn;
    private String user_id;
    private String user_name;

    public AdReportBean(String str, String str2, int i10, int i11, String str3, String str4, String str5, int i12, String str6, String str7, String str8, long j10, long j11) {
        AbstractC5868k.m23674f(str, "ad_id");
        AbstractC5868k.m23674f(str2, "ad_name");
        AbstractC5868k.m23674f(str3, "sn");
        AbstractC5868k.m23674f(str4, "user_id");
        AbstractC5868k.m23674f(str5, "user_name");
        AbstractC5868k.m23674f(str6, "app_id");
        AbstractC5868k.m23674f(str7, "media_type");
        AbstractC5868k.m23674f(str8, "ad_type");
        this.ad_id = str;
        this.ad_name = str2;
        this.display_times = i10;
        this.click_times = i11;
        this.f5857sn = str3;
        this.user_id = str4;
        this.user_name = str5;
        this.apk_version = i12;
        this.app_id = str6;
        this.media_type = str7;
        this.ad_type = str8;
        this.last_update_timestamp = j10;
        this.game_stay_time = j11;
    }

    public final String component1() {
        return this.ad_id;
    }

    public final String component10() {
        return this.media_type;
    }

    public final String component11() {
        return this.ad_type;
    }

    public final long component12() {
        return this.last_update_timestamp;
    }

    public final long component13() {
        return this.game_stay_time;
    }

    public final String component2() {
        return this.ad_name;
    }

    public final int component3() {
        return this.display_times;
    }

    public final int component4() {
        return this.click_times;
    }

    public final String component5() {
        return this.f5857sn;
    }

    public final String component6() {
        return this.user_id;
    }

    public final String component7() {
        return this.user_name;
    }

    public final int component8() {
        return this.apk_version;
    }

    public final String component9() {
        return this.app_id;
    }

    public final AdReportBean copy(String str, String str2, int i10, int i11, String str3, String str4, String str5, int i12, String str6, String str7, String str8, long j10, long j11) {
        AbstractC5868k.m23674f(str, "ad_id");
        AbstractC5868k.m23674f(str2, "ad_name");
        AbstractC5868k.m23674f(str3, "sn");
        AbstractC5868k.m23674f(str4, "user_id");
        AbstractC5868k.m23674f(str5, "user_name");
        AbstractC5868k.m23674f(str6, "app_id");
        AbstractC5868k.m23674f(str7, "media_type");
        AbstractC5868k.m23674f(str8, "ad_type");
        return new AdReportBean(str, str2, i10, i11, str3, str4, str5, i12, str6, str7, str8, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdReportBean)) {
            return false;
        }
        AdReportBean adReportBean = (AdReportBean) obj;
        return AbstractC5868k.m23669a(this.ad_id, adReportBean.ad_id) && AbstractC5868k.m23669a(this.ad_name, adReportBean.ad_name) && this.display_times == adReportBean.display_times && this.click_times == adReportBean.click_times && AbstractC5868k.m23669a(this.f5857sn, adReportBean.f5857sn) && AbstractC5868k.m23669a(this.user_id, adReportBean.user_id) && AbstractC5868k.m23669a(this.user_name, adReportBean.user_name) && this.apk_version == adReportBean.apk_version && AbstractC5868k.m23669a(this.app_id, adReportBean.app_id) && AbstractC5868k.m23669a(this.media_type, adReportBean.media_type) && AbstractC5868k.m23669a(this.ad_type, adReportBean.ad_type) && this.last_update_timestamp == adReportBean.last_update_timestamp && this.game_stay_time == adReportBean.game_stay_time;
    }

    public final String getAd_id() {
        return this.ad_id;
    }

    public final String getAd_name() {
        return this.ad_name;
    }

    public final String getAd_type() {
        return this.ad_type;
    }

    public final int getApk_version() {
        return this.apk_version;
    }

    public final String getApp_id() {
        return this.app_id;
    }

    public final int getClick_times() {
        return this.click_times;
    }

    public final int getDisplay_times() {
        return this.display_times;
    }

    public final long getGame_stay_time() {
        return this.game_stay_time;
    }

    public final long getLast_update_timestamp() {
        return this.last_update_timestamp;
    }

    public final String getMedia_type() {
        return this.media_type;
    }

    public final String getSn() {
        return this.f5857sn;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getUser_name() {
        return this.user_name;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.ad_id.hashCode() * 31) + this.ad_name.hashCode()) * 31) + this.display_times) * 31) + this.click_times) * 31) + this.f5857sn.hashCode()) * 31) + this.user_id.hashCode()) * 31) + this.user_name.hashCode()) * 31) + this.apk_version) * 31) + this.app_id.hashCode()) * 31) + this.media_type.hashCode()) * 31) + this.ad_type.hashCode()) * 31) + AbstractC6322a.m25086a(this.last_update_timestamp)) * 31) + AbstractC6322a.m25086a(this.game_stay_time);
    }

    public final void setAd_id(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.ad_id = str;
    }

    public final void setAd_name(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.ad_name = str;
    }

    public final void setAd_type(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.ad_type = str;
    }

    public final void setApk_version(int i10) {
        this.apk_version = i10;
    }

    public final void setApp_id(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.app_id = str;
    }

    public final void setClick_times(int i10) {
        this.click_times = i10;
    }

    public final void setDisplay_times(int i10) {
        this.display_times = i10;
    }

    public final void setGame_stay_time(long j10) {
        this.game_stay_time = j10;
    }

    public final void setLast_update_timestamp(long j10) {
        this.last_update_timestamp = j10;
    }

    public final void setMedia_type(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.media_type = str;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f5857sn = str;
    }

    public final void setUser_id(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.user_id = str;
    }

    public final void setUser_name(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.user_name = str;
    }

    public String toString() {
        return "AdReportBean(ad_id=" + this.ad_id + ", ad_name=" + this.ad_name + ", display_times=" + this.display_times + ", click_times=" + this.click_times + ", sn=" + this.f5857sn + ", user_id=" + this.user_id + ", user_name=" + this.user_name + ", apk_version=" + this.apk_version + ", app_id=" + this.app_id + ", media_type=" + this.media_type + ", ad_type=" + this.ad_type + ", last_update_timestamp=" + this.last_update_timestamp + ", game_stay_time=" + this.game_stay_time + ')';
    }
}
