package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class UserFeedBackBean {
    private String appVersion;
    private String customer;
    private String email;
    private String mobile;
    private String pictureUrl;
    private String pkg;
    private String programName;
    private String sysVersion;
    private String type;
    private String userId;
    private String userName;
    private String userOperateSys;
    private String userSug;

    public UserFeedBackBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userSug");
        AbstractC5868k.m23674f(str3, "email");
        AbstractC5868k.m23674f(str4, "mobile");
        AbstractC5868k.m23674f(str5, "appVersion");
        AbstractC5868k.m23674f(str6, "pkg");
        AbstractC5868k.m23674f(str7, "userOperateSys");
        AbstractC5868k.m23674f(str8, "userName");
        AbstractC5868k.m23674f(str9, "sysVersion");
        AbstractC5868k.m23674f(str10, "programName");
        AbstractC5868k.m23674f(str12, "customer");
        this.type = str;
        this.userSug = str2;
        this.email = str3;
        this.mobile = str4;
        this.appVersion = str5;
        this.pkg = str6;
        this.userOperateSys = str7;
        this.userName = str8;
        this.sysVersion = str9;
        this.programName = str10;
        this.pictureUrl = str11;
        this.customer = str12;
        this.userId = str13;
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.programName;
    }

    public final String component11() {
        return this.pictureUrl;
    }

    public final String component12() {
        return this.customer;
    }

    public final String component13() {
        return this.userId;
    }

    public final String component2() {
        return this.userSug;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.mobile;
    }

    public final String component5() {
        return this.appVersion;
    }

    public final String component6() {
        return this.pkg;
    }

    public final String component7() {
        return this.userOperateSys;
    }

    public final String component8() {
        return this.userName;
    }

    public final String component9() {
        return this.sysVersion;
    }

    public final UserFeedBackBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userSug");
        AbstractC5868k.m23674f(str3, "email");
        AbstractC5868k.m23674f(str4, "mobile");
        AbstractC5868k.m23674f(str5, "appVersion");
        AbstractC5868k.m23674f(str6, "pkg");
        AbstractC5868k.m23674f(str7, "userOperateSys");
        AbstractC5868k.m23674f(str8, "userName");
        AbstractC5868k.m23674f(str9, "sysVersion");
        AbstractC5868k.m23674f(str10, "programName");
        AbstractC5868k.m23674f(str12, "customer");
        return new UserFeedBackBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFeedBackBean)) {
            return false;
        }
        UserFeedBackBean userFeedBackBean = (UserFeedBackBean) obj;
        return AbstractC5868k.m23669a(this.type, userFeedBackBean.type) && AbstractC5868k.m23669a(this.userSug, userFeedBackBean.userSug) && AbstractC5868k.m23669a(this.email, userFeedBackBean.email) && AbstractC5868k.m23669a(this.mobile, userFeedBackBean.mobile) && AbstractC5868k.m23669a(this.appVersion, userFeedBackBean.appVersion) && AbstractC5868k.m23669a(this.pkg, userFeedBackBean.pkg) && AbstractC5868k.m23669a(this.userOperateSys, userFeedBackBean.userOperateSys) && AbstractC5868k.m23669a(this.userName, userFeedBackBean.userName) && AbstractC5868k.m23669a(this.sysVersion, userFeedBackBean.sysVersion) && AbstractC5868k.m23669a(this.programName, userFeedBackBean.programName) && AbstractC5868k.m23669a(this.pictureUrl, userFeedBackBean.pictureUrl) && AbstractC5868k.m23669a(this.customer, userFeedBackBean.customer) && AbstractC5868k.m23669a(this.userId, userFeedBackBean.userId);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final String getProgramName() {
        return this.programName;
    }

    public final String getSysVersion() {
        return this.sysVersion;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserOperateSys() {
        return this.userOperateSys;
    }

    public final String getUserSug() {
        return this.userSug;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.type.hashCode() * 31) + this.userSug.hashCode()) * 31) + this.email.hashCode()) * 31) + this.mobile.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.pkg.hashCode()) * 31) + this.userOperateSys.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.sysVersion.hashCode()) * 31) + this.programName.hashCode()) * 31;
        String str = this.pictureUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.customer.hashCode()) * 31;
        String str2 = this.userId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAppVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setCustomer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.customer = str;
    }

    public final void setEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.email = str;
    }

    public final void setMobile(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.mobile = str;
    }

    public final void setPictureUrl(String str) {
        this.pictureUrl = str;
    }

    public final void setPkg(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pkg = str;
    }

    public final void setProgramName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.programName = str;
    }

    public final void setSysVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.sysVersion = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserOperateSys(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userOperateSys = str;
    }

    public final void setUserSug(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userSug = str;
    }

    public String toString() {
        return "UserFeedBackBean(type=" + this.type + ", userSug=" + this.userSug + ", email=" + this.email + ", mobile=" + this.mobile + ", appVersion=" + this.appVersion + ", pkg=" + this.pkg + ", userOperateSys=" + this.userOperateSys + ", userName=" + this.userName + ", sysVersion=" + this.sysVersion + ", programName=" + this.programName + ", pictureUrl=" + this.pictureUrl + ", customer=" + this.customer + ", userId=" + this.userId + ')';
    }
}
