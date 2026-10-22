package com.request.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SendPackageEmailBean {
    private String appId;
    private String appName;
    private String appVersion;
    private String buyerEmail;
    private String exprireTime;
    private String lang;
    private String loginType;
    private int packageId;
    private int packageType;

    /* renamed from: sn */
    private String f12700sn;
    private String userId;
    private String userToken;

    public SendPackageEmailBean(String str, String str2, int i10, String str3, int i11, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "lang");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "appId");
        AbstractC5868k.m23674f(str4, "exprireTime");
        AbstractC5868k.m23674f(str5, DispatchConstants.APP_NAME);
        AbstractC5868k.m23674f(str6, "buyerEmail");
        AbstractC5868k.m23674f(str7, "appVersion");
        AbstractC5868k.m23674f(str8, "sn");
        AbstractC5868k.m23674f(str9, "userToken");
        AbstractC5868k.m23674f(str10, "loginType");
        this.lang = str;
        this.userId = str2;
        this.packageId = i10;
        this.appId = str3;
        this.packageType = i11;
        this.exprireTime = str4;
        this.appName = str5;
        this.buyerEmail = str6;
        this.appVersion = str7;
        this.f12700sn = str8;
        this.userToken = str9;
        this.loginType = str10;
    }

    public final String component1() {
        return this.lang;
    }

    public final String component10() {
        return this.f12700sn;
    }

    public final String component11() {
        return this.userToken;
    }

    public final String component12() {
        return this.loginType;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.packageId;
    }

    public final String component4() {
        return this.appId;
    }

    public final int component5() {
        return this.packageType;
    }

    public final String component6() {
        return this.exprireTime;
    }

    public final String component7() {
        return this.appName;
    }

    public final String component8() {
        return this.buyerEmail;
    }

    public final String component9() {
        return this.appVersion;
    }

    public final SendPackageEmailBean copy(String str, String str2, int i10, String str3, int i11, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "lang");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "appId");
        AbstractC5868k.m23674f(str4, "exprireTime");
        AbstractC5868k.m23674f(str5, DispatchConstants.APP_NAME);
        AbstractC5868k.m23674f(str6, "buyerEmail");
        AbstractC5868k.m23674f(str7, "appVersion");
        AbstractC5868k.m23674f(str8, "sn");
        AbstractC5868k.m23674f(str9, "userToken");
        AbstractC5868k.m23674f(str10, "loginType");
        return new SendPackageEmailBean(str, str2, i10, str3, i11, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendPackageEmailBean)) {
            return false;
        }
        SendPackageEmailBean sendPackageEmailBean = (SendPackageEmailBean) obj;
        return AbstractC5868k.m23669a(this.lang, sendPackageEmailBean.lang) && AbstractC5868k.m23669a(this.userId, sendPackageEmailBean.userId) && this.packageId == sendPackageEmailBean.packageId && AbstractC5868k.m23669a(this.appId, sendPackageEmailBean.appId) && this.packageType == sendPackageEmailBean.packageType && AbstractC5868k.m23669a(this.exprireTime, sendPackageEmailBean.exprireTime) && AbstractC5868k.m23669a(this.appName, sendPackageEmailBean.appName) && AbstractC5868k.m23669a(this.buyerEmail, sendPackageEmailBean.buyerEmail) && AbstractC5868k.m23669a(this.appVersion, sendPackageEmailBean.appVersion) && AbstractC5868k.m23669a(this.f12700sn, sendPackageEmailBean.f12700sn) && AbstractC5868k.m23669a(this.userToken, sendPackageEmailBean.userToken) && AbstractC5868k.m23669a(this.loginType, sendPackageEmailBean.loginType);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBuyerEmail() {
        return this.buyerEmail;
    }

    public final String getExprireTime() {
        return this.exprireTime;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public final int getPackageId() {
        return this.packageId;
    }

    public final int getPackageType() {
        return this.packageType;
    }

    public final String getSn() {
        return this.f12700sn;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.lang.hashCode() * 31) + this.userId.hashCode()) * 31) + this.packageId) * 31) + this.appId.hashCode()) * 31) + this.packageType) * 31) + this.exprireTime.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.buyerEmail.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.f12700sn.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.loginType.hashCode();
    }

    public final void setAppId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appId = str;
    }

    public final void setAppName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appName = str;
    }

    public final void setAppVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBuyerEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.buyerEmail = str;
    }

    public final void setExprireTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.exprireTime = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public final void setLoginType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.loginType = str;
    }

    public final void setPackageId(int i10) {
        this.packageId = i10;
    }

    public final void setPackageType(int i10) {
        this.packageType = i10;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12700sn = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "SendPackageEmailBean(lang=" + this.lang + ", userId=" + this.userId + ", packageId=" + this.packageId + ", appId=" + this.appId + ", packageType=" + this.packageType + ", exprireTime=" + this.exprireTime + ", appName=" + this.appName + ", buyerEmail=" + this.buyerEmail + ", appVersion=" + this.appVersion + ", sn=" + this.f12700sn + ", userToken=" + this.userToken + ", loginType=" + this.loginType + ')';
    }
}
