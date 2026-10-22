package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ApkReportBean implements Serializable {
    private String app;
    private String appVersion;
    private String gatewayAddress;
    private String libVersion;
    private String networkAddress;
    private String ottModel;
    private String pkg;
    private String snValue;
    private String sysVersion;
    private String userId;

    public ApkReportBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str10, "userId");
        this.snValue = str;
        this.app = str2;
        this.appVersion = str3;
        this.pkg = str4;
        this.libVersion = str5;
        this.sysVersion = str6;
        this.ottModel = str7;
        this.gatewayAddress = str8;
        this.networkAddress = str9;
        this.userId = str10;
    }

    public final String component1() {
        return this.snValue;
    }

    public final String component10() {
        return this.userId;
    }

    public final String component2() {
        return this.app;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final String component4() {
        return this.pkg;
    }

    public final String component5() {
        return this.libVersion;
    }

    public final String component6() {
        return this.sysVersion;
    }

    public final String component7() {
        return this.ottModel;
    }

    public final String component8() {
        return this.gatewayAddress;
    }

    public final String component9() {
        return this.networkAddress;
    }

    public final ApkReportBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str10, "userId");
        return new ApkReportBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApkReportBean)) {
            return false;
        }
        ApkReportBean apkReportBean = (ApkReportBean) obj;
        return AbstractC5868k.m23669a(this.snValue, apkReportBean.snValue) && AbstractC5868k.m23669a(this.app, apkReportBean.app) && AbstractC5868k.m23669a(this.appVersion, apkReportBean.appVersion) && AbstractC5868k.m23669a(this.pkg, apkReportBean.pkg) && AbstractC5868k.m23669a(this.libVersion, apkReportBean.libVersion) && AbstractC5868k.m23669a(this.sysVersion, apkReportBean.sysVersion) && AbstractC5868k.m23669a(this.ottModel, apkReportBean.ottModel) && AbstractC5868k.m23669a(this.gatewayAddress, apkReportBean.gatewayAddress) && AbstractC5868k.m23669a(this.networkAddress, apkReportBean.networkAddress) && AbstractC5868k.m23669a(this.userId, apkReportBean.userId);
    }

    public final String getApp() {
        return this.app;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getGatewayAddress() {
        return this.gatewayAddress;
    }

    public final String getLibVersion() {
        return this.libVersion;
    }

    public final String getNetworkAddress() {
        return this.networkAddress;
    }

    public final String getOttModel() {
        return this.ottModel;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final String getSnValue() {
        return this.snValue;
    }

    public final String getSysVersion() {
        return this.sysVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.snValue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.app;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appVersion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pkg;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.libVersion;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sysVersion;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ottModel;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.gatewayAddress;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.networkAddress;
        return ((hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.userId.hashCode();
    }

    public final void setApp(String str) {
        this.app = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setGatewayAddress(String str) {
        this.gatewayAddress = str;
    }

    public final void setLibVersion(String str) {
        this.libVersion = str;
    }

    public final void setNetworkAddress(String str) {
        this.networkAddress = str;
    }

    public final void setOttModel(String str) {
        this.ottModel = str;
    }

    public final void setPkg(String str) {
        this.pkg = str;
    }

    public final void setSnValue(String str) {
        this.snValue = str;
    }

    public final void setSysVersion(String str) {
        this.sysVersion = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "ApkReportBean(snValue=" + this.snValue + ", app=" + this.app + ", appVersion=" + this.appVersion + ", pkg=" + this.pkg + ", libVersion=" + this.libVersion + ", sysVersion=" + this.sysVersion + ", ottModel=" + this.ottModel + ", gatewayAddress=" + this.gatewayAddress + ", networkAddress=" + this.networkAddress + ", userId=" + this.userId + ')';
    }
}
