package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AuthReportBean implements Serializable {
    private String app;
    private String appVersion;
    private String lang;
    private String libVersion;
    private String ottModel;
    private String pkg;
    private int remainingDays;
    private String snValue;
    private String sysVersion;
    private String tips;
    private String type;
    private String userId;

    public AuthReportBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11) {
        this.snValue = str;
        this.app = str2;
        this.appVersion = str3;
        this.pkg = str4;
        this.libVersion = str5;
        this.sysVersion = str6;
        this.ottModel = str7;
        this.lang = str8;
        this.tips = str9;
        this.type = str10;
        this.remainingDays = i10;
        this.userId = str11;
    }

    public final String component1() {
        return this.snValue;
    }

    public final String component10() {
        return this.type;
    }

    public final int component11() {
        return this.remainingDays;
    }

    public final String component12() {
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
        return this.lang;
    }

    public final String component9() {
        return this.tips;
    }

    public final AuthReportBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11) {
        return new AuthReportBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthReportBean)) {
            return false;
        }
        AuthReportBean authReportBean = (AuthReportBean) obj;
        return AbstractC5868k.m23669a(this.snValue, authReportBean.snValue) && AbstractC5868k.m23669a(this.app, authReportBean.app) && AbstractC5868k.m23669a(this.appVersion, authReportBean.appVersion) && AbstractC5868k.m23669a(this.pkg, authReportBean.pkg) && AbstractC5868k.m23669a(this.libVersion, authReportBean.libVersion) && AbstractC5868k.m23669a(this.sysVersion, authReportBean.sysVersion) && AbstractC5868k.m23669a(this.ottModel, authReportBean.ottModel) && AbstractC5868k.m23669a(this.lang, authReportBean.lang) && AbstractC5868k.m23669a(this.tips, authReportBean.tips) && AbstractC5868k.m23669a(this.type, authReportBean.type) && this.remainingDays == authReportBean.remainingDays && AbstractC5868k.m23669a(this.userId, authReportBean.userId);
    }

    public final String getApp() {
        return this.app;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLibVersion() {
        return this.libVersion;
    }

    public final String getOttModel() {
        return this.ottModel;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final int getRemainingDays() {
        return this.remainingDays;
    }

    public final String getSnValue() {
        return this.snValue;
    }

    public final String getSysVersion() {
        return this.sysVersion;
    }

    public final String getTips() {
        return this.tips;
    }

    public final String getType() {
        return this.type;
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
        String str8 = this.lang;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tips;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.type;
        int hashCode10 = (((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.remainingDays) * 31;
        String str11 = this.userId;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setApp(String str) {
        this.app = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final void setLibVersion(String str) {
        this.libVersion = str;
    }

    public final void setOttModel(String str) {
        this.ottModel = str;
    }

    public final void setPkg(String str) {
        this.pkg = str;
    }

    public final void setRemainingDays(int i10) {
        this.remainingDays = i10;
    }

    public final void setSnValue(String str) {
        this.snValue = str;
    }

    public final void setSysVersion(String str) {
        this.sysVersion = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "AuthReportBean(snValue=" + this.snValue + ", app=" + this.app + ", appVersion=" + this.appVersion + ", pkg=" + this.pkg + ", libVersion=" + this.libVersion + ", sysVersion=" + this.sysVersion + ", ottModel=" + this.ottModel + ", lang=" + this.lang + ", tips=" + this.tips + ", type=" + this.type + ", remainingDays=" + this.remainingDays + ", userId=" + this.userId + ')';
    }
}
