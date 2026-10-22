package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PlayErrorCollectBean implements Serializable {
    private String apk_id;
    private String apk_version;
    private Long current_time;
    private String deadtime;
    private String error_code;
    private String media_code;
    private String module_name;
    private Long number_operations;
    private Long response_time;
    private String server_ip;

    /* renamed from: sn */
    private String f12698sn;
    private Long startup_report_time;
    private String title;
    private String trans_id;

    public PlayErrorCollectBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l10, String str10, Long l11, Long l12, Long l13) {
        this.trans_id = str;
        this.f12698sn = str2;
        this.media_code = str3;
        this.title = str4;
        this.module_name = str5;
        this.server_ip = str6;
        this.apk_id = str7;
        this.apk_version = str8;
        this.error_code = str9;
        this.response_time = l10;
        this.deadtime = str10;
        this.startup_report_time = l11;
        this.number_operations = l12;
        this.current_time = l13;
    }

    public final String component1() {
        return this.trans_id;
    }

    public final Long component10() {
        return this.response_time;
    }

    public final String component11() {
        return this.deadtime;
    }

    public final Long component12() {
        return this.startup_report_time;
    }

    public final Long component13() {
        return this.number_operations;
    }

    public final Long component14() {
        return this.current_time;
    }

    public final String component2() {
        return this.f12698sn;
    }

    public final String component3() {
        return this.media_code;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.module_name;
    }

    public final String component6() {
        return this.server_ip;
    }

    public final String component7() {
        return this.apk_id;
    }

    public final String component8() {
        return this.apk_version;
    }

    public final String component9() {
        return this.error_code;
    }

    public final PlayErrorCollectBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l10, String str10, Long l11, Long l12, Long l13) {
        return new PlayErrorCollectBean(str, str2, str3, str4, str5, str6, str7, str8, str9, l10, str10, l11, l12, l13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayErrorCollectBean)) {
            return false;
        }
        PlayErrorCollectBean playErrorCollectBean = (PlayErrorCollectBean) obj;
        return AbstractC5868k.m23669a(this.trans_id, playErrorCollectBean.trans_id) && AbstractC5868k.m23669a(this.f12698sn, playErrorCollectBean.f12698sn) && AbstractC5868k.m23669a(this.media_code, playErrorCollectBean.media_code) && AbstractC5868k.m23669a(this.title, playErrorCollectBean.title) && AbstractC5868k.m23669a(this.module_name, playErrorCollectBean.module_name) && AbstractC5868k.m23669a(this.server_ip, playErrorCollectBean.server_ip) && AbstractC5868k.m23669a(this.apk_id, playErrorCollectBean.apk_id) && AbstractC5868k.m23669a(this.apk_version, playErrorCollectBean.apk_version) && AbstractC5868k.m23669a(this.error_code, playErrorCollectBean.error_code) && AbstractC5868k.m23669a(this.response_time, playErrorCollectBean.response_time) && AbstractC5868k.m23669a(this.deadtime, playErrorCollectBean.deadtime) && AbstractC5868k.m23669a(this.startup_report_time, playErrorCollectBean.startup_report_time) && AbstractC5868k.m23669a(this.number_operations, playErrorCollectBean.number_operations) && AbstractC5868k.m23669a(this.current_time, playErrorCollectBean.current_time);
    }

    public final String getApk_id() {
        return this.apk_id;
    }

    public final String getApk_version() {
        return this.apk_version;
    }

    public final Long getCurrent_time() {
        return this.current_time;
    }

    public final String getDeadtime() {
        return this.deadtime;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final String getModule_name() {
        return this.module_name;
    }

    public final Long getNumber_operations() {
        return this.number_operations;
    }

    public final Long getResponse_time() {
        return this.response_time;
    }

    public final String getServer_ip() {
        return this.server_ip;
    }

    public final String getSn() {
        return this.f12698sn;
    }

    public final Long getStartup_report_time() {
        return this.startup_report_time;
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
        String str2 = this.f12698sn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.media_code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.module_name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.server_ip;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.apk_id;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.apk_version;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.error_code;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l10 = this.response_time;
        int hashCode10 = (hashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str10 = this.deadtime;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l11 = this.startup_report_time;
        int hashCode12 = (hashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.number_operations;
        int hashCode13 = (hashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.current_time;
        return hashCode13 + (l13 != null ? l13.hashCode() : 0);
    }

    public final void setApk_id(String str) {
        this.apk_id = str;
    }

    public final void setApk_version(String str) {
        this.apk_version = str;
    }

    public final void setCurrent_time(Long l10) {
        this.current_time = l10;
    }

    public final void setDeadtime(String str) {
        this.deadtime = str;
    }

    public final void setError_code(String str) {
        this.error_code = str;
    }

    public final void setMedia_code(String str) {
        this.media_code = str;
    }

    public final void setModule_name(String str) {
        this.module_name = str;
    }

    public final void setNumber_operations(Long l10) {
        this.number_operations = l10;
    }

    public final void setResponse_time(Long l10) {
        this.response_time = l10;
    }

    public final void setServer_ip(String str) {
        this.server_ip = str;
    }

    public final void setSn(String str) {
        this.f12698sn = str;
    }

    public final void setStartup_report_time(Long l10) {
        this.startup_report_time = l10;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrans_id(String str) {
        this.trans_id = str;
    }

    public String toString() {
        return "PlayErrorCollectBean(trans_id=" + this.trans_id + ", sn=" + this.f12698sn + ", media_code=" + this.media_code + ", title=" + this.title + ", module_name=" + this.module_name + ", server_ip=" + this.server_ip + ", apk_id=" + this.apk_id + ", apk_version=" + this.apk_version + ", error_code=" + this.error_code + ", response_time=" + this.response_time + ", deadtime=" + this.deadtime + ", startup_report_time=" + this.startup_report_time + ", number_operations=" + this.number_operations + ", current_time=" + this.current_time + ')';
    }
}
