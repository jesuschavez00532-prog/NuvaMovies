package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes2.dex */
public final class VodPlayStartCollectBean implements Serializable {
    private String apk_version;
    private String app_id;
    private String cdn_type;
    private int kcp_status;
    private long loading_time;
    private String media_code;
    private String retcode;
    private String server_ip;
    private long slb_delay;

    /* renamed from: sn */
    private String f12702sn;
    private String trans_id;
    private String type;

    public VodPlayStartCollectBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j10, long j11, String str9, int i10) {
        AbstractC5868k.m23674f(str, "app_id");
        AbstractC5868k.m23674f(str2, "sn");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "media_code");
        AbstractC5868k.m23674f(str9, "apk_version");
        this.app_id = str;
        this.f12702sn = str2;
        this.trans_id = str3;
        this.type = str4;
        this.media_code = str5;
        this.server_ip = str6;
        this.cdn_type = str7;
        this.retcode = str8;
        this.slb_delay = j10;
        this.loading_time = j11;
        this.apk_version = str9;
        this.kcp_status = i10;
    }

    public final String component1() {
        return this.app_id;
    }

    public final long component10() {
        return this.loading_time;
    }

    public final String component11() {
        return this.apk_version;
    }

    public final int component12() {
        return this.kcp_status;
    }

    public final String component2() {
        return this.f12702sn;
    }

    public final String component3() {
        return this.trans_id;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.media_code;
    }

    public final String component6() {
        return this.server_ip;
    }

    public final String component7() {
        return this.cdn_type;
    }

    public final String component8() {
        return this.retcode;
    }

    public final long component9() {
        return this.slb_delay;
    }

    public final VodPlayStartCollectBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j10, long j11, String str9, int i10) {
        AbstractC5868k.m23674f(str, "app_id");
        AbstractC5868k.m23674f(str2, "sn");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "media_code");
        AbstractC5868k.m23674f(str9, "apk_version");
        return new VodPlayStartCollectBean(str, str2, str3, str4, str5, str6, str7, str8, j10, j11, str9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodPlayStartCollectBean)) {
            return false;
        }
        VodPlayStartCollectBean vodPlayStartCollectBean = (VodPlayStartCollectBean) obj;
        return AbstractC5868k.m23669a(this.app_id, vodPlayStartCollectBean.app_id) && AbstractC5868k.m23669a(this.f12702sn, vodPlayStartCollectBean.f12702sn) && AbstractC5868k.m23669a(this.trans_id, vodPlayStartCollectBean.trans_id) && AbstractC5868k.m23669a(this.type, vodPlayStartCollectBean.type) && AbstractC5868k.m23669a(this.media_code, vodPlayStartCollectBean.media_code) && AbstractC5868k.m23669a(this.server_ip, vodPlayStartCollectBean.server_ip) && AbstractC5868k.m23669a(this.cdn_type, vodPlayStartCollectBean.cdn_type) && AbstractC5868k.m23669a(this.retcode, vodPlayStartCollectBean.retcode) && this.slb_delay == vodPlayStartCollectBean.slb_delay && this.loading_time == vodPlayStartCollectBean.loading_time && AbstractC5868k.m23669a(this.apk_version, vodPlayStartCollectBean.apk_version) && this.kcp_status == vodPlayStartCollectBean.kcp_status;
    }

    public final String getApk_version() {
        return this.apk_version;
    }

    public final String getApp_id() {
        return this.app_id;
    }

    public final String getCdn_type() {
        return this.cdn_type;
    }

    public final int getKcp_status() {
        return this.kcp_status;
    }

    public final long getLoading_time() {
        return this.loading_time;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final String getRetcode() {
        return this.retcode;
    }

    public final String getServer_ip() {
        return this.server_ip;
    }

    public final long getSlb_delay() {
        return this.slb_delay;
    }

    public final String getSn() {
        return this.f12702sn;
    }

    public final String getTrans_id() {
        return this.trans_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.app_id.hashCode() * 31) + this.f12702sn.hashCode()) * 31;
        String str = this.trans_id;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.media_code.hashCode()) * 31;
        String str2 = this.server_ip;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cdn_type;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retcode;
        return ((((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + AbstractC6322a.m25086a(this.slb_delay)) * 31) + AbstractC6322a.m25086a(this.loading_time)) * 31) + this.apk_version.hashCode()) * 31) + this.kcp_status;
    }

    public final void setApk_version(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.apk_version = str;
    }

    public final void setApp_id(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.app_id = str;
    }

    public final void setCdn_type(String str) {
        this.cdn_type = str;
    }

    public final void setKcp_status(int i10) {
        this.kcp_status = i10;
    }

    public final void setLoading_time(long j10) {
        this.loading_time = j10;
    }

    public final void setMedia_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.media_code = str;
    }

    public final void setRetcode(String str) {
        this.retcode = str;
    }

    public final void setServer_ip(String str) {
        this.server_ip = str;
    }

    public final void setSlb_delay(long j10) {
        this.slb_delay = j10;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12702sn = str;
    }

    public final void setTrans_id(String str) {
        this.trans_id = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        return "VodPlayStartCollectBean(app_id=" + this.app_id + ", sn=" + this.f12702sn + ", trans_id=" + this.trans_id + ", type=" + this.type + ", media_code=" + this.media_code + ", server_ip=" + this.server_ip + ", cdn_type=" + this.cdn_type + ", retcode=" + this.retcode + ", slb_delay=" + this.slb_delay + ", loading_time=" + this.loading_time + ", apk_version=" + this.apk_version + ", kcp_status=" + this.kcp_status + ')';
    }
}
