package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PlayMessageCollectBean implements Serializable {
    private String action;
    private String apk_id;
    private String apk_version;
    private Integer caton_number;
    private Long current_time;
    private String deadtime;
    private Integer kcp_status;
    private String media_code;
    private Long number_operations;
    private Integer play_time;
    private Integer play_url_time;
    private String provider;
    private String server_ip;

    /* renamed from: sn */
    private String f12699sn;
    private Long startup_time;
    private String title;
    private String trans_id;

    public PlayMessageCollectBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, Integer num4, String str9, String str10, Long l10, Long l11, Long l12) {
        this.trans_id = str;
        this.f12699sn = str2;
        this.media_code = str3;
        this.title = str4;
        this.server_ip = str5;
        this.action = str6;
        this.caton_number = num;
        this.play_url_time = num2;
        this.play_time = num3;
        this.apk_id = str7;
        this.apk_version = str8;
        this.kcp_status = num4;
        this.provider = str9;
        this.deadtime = str10;
        this.startup_time = l10;
        this.number_operations = l11;
        this.current_time = l12;
    }

    public final String component1() {
        return this.trans_id;
    }

    public final String component10() {
        return this.apk_id;
    }

    public final String component11() {
        return this.apk_version;
    }

    public final Integer component12() {
        return this.kcp_status;
    }

    public final String component13() {
        return this.provider;
    }

    public final String component14() {
        return this.deadtime;
    }

    public final Long component15() {
        return this.startup_time;
    }

    public final Long component16() {
        return this.number_operations;
    }

    public final Long component17() {
        return this.current_time;
    }

    public final String component2() {
        return this.f12699sn;
    }

    public final String component3() {
        return this.media_code;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.server_ip;
    }

    public final String component6() {
        return this.action;
    }

    public final Integer component7() {
        return this.caton_number;
    }

    public final Integer component8() {
        return this.play_url_time;
    }

    public final Integer component9() {
        return this.play_time;
    }

    public final PlayMessageCollectBean copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, Integer num4, String str9, String str10, Long l10, Long l11, Long l12) {
        return new PlayMessageCollectBean(str, str2, str3, str4, str5, str6, num, num2, num3, str7, str8, num4, str9, str10, l10, l11, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayMessageCollectBean)) {
            return false;
        }
        PlayMessageCollectBean playMessageCollectBean = (PlayMessageCollectBean) obj;
        return AbstractC5868k.m23669a(this.trans_id, playMessageCollectBean.trans_id) && AbstractC5868k.m23669a(this.f12699sn, playMessageCollectBean.f12699sn) && AbstractC5868k.m23669a(this.media_code, playMessageCollectBean.media_code) && AbstractC5868k.m23669a(this.title, playMessageCollectBean.title) && AbstractC5868k.m23669a(this.server_ip, playMessageCollectBean.server_ip) && AbstractC5868k.m23669a(this.action, playMessageCollectBean.action) && AbstractC5868k.m23669a(this.caton_number, playMessageCollectBean.caton_number) && AbstractC5868k.m23669a(this.play_url_time, playMessageCollectBean.play_url_time) && AbstractC5868k.m23669a(this.play_time, playMessageCollectBean.play_time) && AbstractC5868k.m23669a(this.apk_id, playMessageCollectBean.apk_id) && AbstractC5868k.m23669a(this.apk_version, playMessageCollectBean.apk_version) && AbstractC5868k.m23669a(this.kcp_status, playMessageCollectBean.kcp_status) && AbstractC5868k.m23669a(this.provider, playMessageCollectBean.provider) && AbstractC5868k.m23669a(this.deadtime, playMessageCollectBean.deadtime) && AbstractC5868k.m23669a(this.startup_time, playMessageCollectBean.startup_time) && AbstractC5868k.m23669a(this.number_operations, playMessageCollectBean.number_operations) && AbstractC5868k.m23669a(this.current_time, playMessageCollectBean.current_time);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getApk_id() {
        return this.apk_id;
    }

    public final String getApk_version() {
        return this.apk_version;
    }

    public final Integer getCaton_number() {
        return this.caton_number;
    }

    public final Long getCurrent_time() {
        return this.current_time;
    }

    public final String getDeadtime() {
        return this.deadtime;
    }

    public final Integer getKcp_status() {
        return this.kcp_status;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final Long getNumber_operations() {
        return this.number_operations;
    }

    public final Integer getPlay_time() {
        return this.play_time;
    }

    public final Integer getPlay_url_time() {
        return this.play_url_time;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getServer_ip() {
        return this.server_ip;
    }

    public final String getSn() {
        return this.f12699sn;
    }

    public final Long getStartup_time() {
        return this.startup_time;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrans_id() {
        return this.trans_id;
    }

    public int hashCode() {
        String str = this.trans_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12699sn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.media_code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.server_ip;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.caton_number;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.play_url_time;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.play_time;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.apk_id;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.apk_version;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.kcp_status;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.provider;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.deadtime;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l10 = this.startup_time;
        int hashCode15 = (hashCode14 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.number_operations;
        int hashCode16 = (hashCode15 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.current_time;
        return hashCode16 + (l12 != null ? l12.hashCode() : 0);
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setApk_id(String str) {
        this.apk_id = str;
    }

    public final void setApk_version(String str) {
        this.apk_version = str;
    }

    public final void setCaton_number(Integer num) {
        this.caton_number = num;
    }

    public final void setCurrent_time(Long l10) {
        this.current_time = l10;
    }

    public final void setDeadtime(String str) {
        this.deadtime = str;
    }

    public final void setKcp_status(Integer num) {
        this.kcp_status = num;
    }

    public final void setMedia_code(String str) {
        this.media_code = str;
    }

    public final void setNumber_operations(Long l10) {
        this.number_operations = l10;
    }

    public final void setPlay_time(Integer num) {
        this.play_time = num;
    }

    public final void setPlay_url_time(Integer num) {
        this.play_url_time = num;
    }

    public final void setProvider(String str) {
        this.provider = str;
    }

    public final void setServer_ip(String str) {
        this.server_ip = str;
    }

    public final void setSn(String str) {
        this.f12699sn = str;
    }

    public final void setStartup_time(Long l10) {
        this.startup_time = l10;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrans_id(String str) {
        this.trans_id = str;
    }

    public String toString() {
        return "PlayMessageCollectBean(trans_id=" + this.trans_id + ", sn=" + this.f12699sn + ", media_code=" + this.media_code + ", title=" + this.title + ", server_ip=" + this.server_ip + ", action=" + this.action + ", caton_number=" + this.caton_number + ", play_url_time=" + this.play_url_time + ", play_time=" + this.play_time + ", apk_id=" + this.apk_id + ", apk_version=" + this.apk_version + ", kcp_status=" + this.kcp_status + ", provider=" + this.provider + ", deadtime=" + this.deadtime + ", startup_time=" + this.startup_time + ", number_operations=" + this.number_operations + ", current_time=" + this.current_time + ')';
    }
}
