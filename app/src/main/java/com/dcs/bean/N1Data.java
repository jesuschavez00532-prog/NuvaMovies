package com.dcs.bean;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class N1Data {
    private String apk;
    private String apk_ver;
    private String auth_version;
    private String gateway_mac;
    private String pre_code;
    private String reserve1;

    /* renamed from: sn */
    private String f6763sn;
    private String spkg_ver;
    private String user_id;
    private String user_identity;

    public N1Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str3, "auth_version");
        AbstractC5868k.m23674f(str4, "apk");
        AbstractC5868k.m23674f(str5, "apk_ver");
        AbstractC5868k.m23674f(str7, "gateway_mac");
        AbstractC5868k.m23674f(str8, "reserve1");
        this.f6763sn = str;
        this.pre_code = str2;
        this.auth_version = str3;
        this.apk = str4;
        this.apk_ver = str5;
        this.spkg_ver = str6;
        this.gateway_mac = str7;
        this.reserve1 = str8;
        this.user_id = str9;
        this.user_identity = str10;
    }

    public final String component1() {
        return this.f6763sn;
    }

    public final String component10() {
        return this.user_identity;
    }

    public final String component2() {
        return this.pre_code;
    }

    public final String component3() {
        return this.auth_version;
    }

    public final String component4() {
        return this.apk;
    }

    public final String component5() {
        return this.apk_ver;
    }

    public final String component6() {
        return this.spkg_ver;
    }

    public final String component7() {
        return this.gateway_mac;
    }

    public final String component8() {
        return this.reserve1;
    }

    public final String component9() {
        return this.user_id;
    }

    public final N1Data copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str3, "auth_version");
        AbstractC5868k.m23674f(str4, "apk");
        AbstractC5868k.m23674f(str5, "apk_ver");
        AbstractC5868k.m23674f(str7, "gateway_mac");
        AbstractC5868k.m23674f(str8, "reserve1");
        return new N1Data(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N1Data)) {
            return false;
        }
        N1Data n1Data = (N1Data) obj;
        return AbstractC5868k.m23669a(this.f6763sn, n1Data.f6763sn) && AbstractC5868k.m23669a(this.pre_code, n1Data.pre_code) && AbstractC5868k.m23669a(this.auth_version, n1Data.auth_version) && AbstractC5868k.m23669a(this.apk, n1Data.apk) && AbstractC5868k.m23669a(this.apk_ver, n1Data.apk_ver) && AbstractC5868k.m23669a(this.spkg_ver, n1Data.spkg_ver) && AbstractC5868k.m23669a(this.gateway_mac, n1Data.gateway_mac) && AbstractC5868k.m23669a(this.reserve1, n1Data.reserve1) && AbstractC5868k.m23669a(this.user_id, n1Data.user_id) && AbstractC5868k.m23669a(this.user_identity, n1Data.user_identity);
    }

    public final String getApk() {
        return this.apk;
    }

    public final String getApk_ver() {
        return this.apk_ver;
    }

    public final String getAuth_version() {
        return this.auth_version;
    }

    public final String getGateway_mac() {
        return this.gateway_mac;
    }

    public final String getPre_code() {
        return this.pre_code;
    }

    public final String getReserve1() {
        return this.reserve1;
    }

    public final String getSn() {
        return this.f6763sn;
    }

    public final String getSpkg_ver() {
        return this.spkg_ver;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getUser_identity() {
        return this.user_identity;
    }

    public int hashCode() {
        int hashCode = this.f6763sn.hashCode() * 31;
        String str = this.pre_code;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.auth_version.hashCode()) * 31) + this.apk.hashCode()) * 31) + this.apk_ver.hashCode()) * 31;
        String str2 = this.spkg_ver;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.gateway_mac.hashCode()) * 31) + this.reserve1.hashCode()) * 31;
        String str3 = this.user_id;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user_identity;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setApk(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.apk = str;
    }

    public final void setApk_ver(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.apk_ver = str;
    }

    public final void setAuth_version(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.auth_version = str;
    }

    public final void setGateway_mac(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gateway_mac = str;
    }

    public final void setPre_code(String str) {
        this.pre_code = str;
    }

    public final void setReserve1(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.reserve1 = str;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f6763sn = str;
    }

    public final void setSpkg_ver(String str) {
        this.spkg_ver = str;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public final void setUser_identity(String str) {
        this.user_identity = str;
    }

    public String toString() {
        return "N1Data(sn=" + this.f6763sn + ", pre_code=" + this.pre_code + ", auth_version=" + this.auth_version + ", apk=" + this.apk + ", apk_ver=" + this.apk_ver + ", spkg_ver=" + this.spkg_ver + ", gateway_mac=" + this.gateway_mac + ", reserve1=" + this.reserve1 + ", user_id=" + this.user_id + ", user_identity=" + this.user_identity + ')';
    }
}
