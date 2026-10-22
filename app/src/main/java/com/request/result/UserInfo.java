package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class UserInfo {
    private String accountType;
    private String activeTime;
    private String appModel;
    private String areaCode;
    private String bindMail;
    private String bindMobile;
    private String childLockPwd;
    private String customer;
    private String email;
    private String hasPay;
    private String hasPwd;
    private String mobile;
    private String playlistUrl;
    private List<PortalCodeList> portalCodeList;
    private String restrictedStatus;
    private String userId;
    private String userIdentity;
    private String userToken;

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PortalCodeList> list, String str12, String str13, String str14, String str15, String str16, String str17) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "customer");
        AbstractC5868k.m23674f(str4, "bindMail");
        AbstractC5868k.m23674f(str7, "restrictedStatus");
        AbstractC5868k.m23674f(str8, "hasPwd");
        AbstractC5868k.m23674f(str10, "userIdentity");
        this.userId = str;
        this.userToken = str2;
        this.customer = str3;
        this.bindMail = str4;
        this.email = str5;
        this.hasPay = str6;
        this.restrictedStatus = str7;
        this.hasPwd = str8;
        this.childLockPwd = str9;
        this.userIdentity = str10;
        this.appModel = str11;
        this.portalCodeList = list;
        this.accountType = str12;
        this.activeTime = str13;
        this.areaCode = str14;
        this.mobile = str15;
        this.bindMobile = str16;
        this.playlistUrl = str17;
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.userIdentity;
    }

    public final String component11() {
        return this.appModel;
    }

    public final List<PortalCodeList> component12() {
        return this.portalCodeList;
    }

    public final String component13() {
        return this.accountType;
    }

    public final String component14() {
        return this.activeTime;
    }

    public final String component15() {
        return this.areaCode;
    }

    public final String component16() {
        return this.mobile;
    }

    public final String component17() {
        return this.bindMobile;
    }

    public final String component18() {
        return this.playlistUrl;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.customer;
    }

    public final String component4() {
        return this.bindMail;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.hasPay;
    }

    public final String component7() {
        return this.restrictedStatus;
    }

    public final String component8() {
        return this.hasPwd;
    }

    public final String component9() {
        return this.childLockPwd;
    }

    public final UserInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PortalCodeList> list, String str12, String str13, String str14, String str15, String str16, String str17) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "customer");
        AbstractC5868k.m23674f(str4, "bindMail");
        AbstractC5868k.m23674f(str7, "restrictedStatus");
        AbstractC5868k.m23674f(str8, "hasPwd");
        AbstractC5868k.m23674f(str10, "userIdentity");
        return new UserInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return AbstractC5868k.m23669a(this.userId, userInfo.userId) && AbstractC5868k.m23669a(this.userToken, userInfo.userToken) && AbstractC5868k.m23669a(this.customer, userInfo.customer) && AbstractC5868k.m23669a(this.bindMail, userInfo.bindMail) && AbstractC5868k.m23669a(this.email, userInfo.email) && AbstractC5868k.m23669a(this.hasPay, userInfo.hasPay) && AbstractC5868k.m23669a(this.restrictedStatus, userInfo.restrictedStatus) && AbstractC5868k.m23669a(this.hasPwd, userInfo.hasPwd) && AbstractC5868k.m23669a(this.childLockPwd, userInfo.childLockPwd) && AbstractC5868k.m23669a(this.userIdentity, userInfo.userIdentity) && AbstractC5868k.m23669a(this.appModel, userInfo.appModel) && AbstractC5868k.m23669a(this.portalCodeList, userInfo.portalCodeList) && AbstractC5868k.m23669a(this.accountType, userInfo.accountType) && AbstractC5868k.m23669a(this.activeTime, userInfo.activeTime) && AbstractC5868k.m23669a(this.areaCode, userInfo.areaCode) && AbstractC5868k.m23669a(this.mobile, userInfo.mobile) && AbstractC5868k.m23669a(this.bindMobile, userInfo.bindMobile) && AbstractC5868k.m23669a(this.playlistUrl, userInfo.playlistUrl);
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getActiveTime() {
        return this.activeTime;
    }

    public final String getAppModel() {
        return this.appModel;
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getBindMail() {
        return this.bindMail;
    }

    public final String getBindMobile() {
        return this.bindMobile;
    }

    public final String getChildLockPwd() {
        return this.childLockPwd;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getHasPay() {
        return this.hasPay;
    }

    public final String getHasPwd() {
        return this.hasPwd;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public final List<PortalCodeList> getPortalCodeList() {
        return this.portalCodeList;
    }

    public final String getRestrictedStatus() {
        return this.restrictedStatus;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserIdentity() {
        return this.userIdentity;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int hashCode = ((((((this.userId.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.customer.hashCode()) * 31) + this.bindMail.hashCode()) * 31;
        String str = this.email;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hasPay;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.restrictedStatus.hashCode()) * 31) + this.hasPwd.hashCode()) * 31;
        String str3 = this.childLockPwd;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.userIdentity.hashCode()) * 31;
        String str4 = this.appModel;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PortalCodeList> list = this.portalCodeList;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.accountType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.activeTime;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.areaCode;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mobile;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bindMobile;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.playlistUrl;
        return hashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setAccountType(String str) {
        this.accountType = str;
    }

    public final void setActiveTime(String str) {
        this.activeTime = str;
    }

    public final void setAppModel(String str) {
        this.appModel = str;
    }

    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    public final void setBindMail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.bindMail = str;
    }

    public final void setBindMobile(String str) {
        this.bindMobile = str;
    }

    public final void setChildLockPwd(String str) {
        this.childLockPwd = str;
    }

    public final void setCustomer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.customer = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setHasPay(String str) {
        this.hasPay = str;
    }

    public final void setHasPwd(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasPwd = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setPlaylistUrl(String str) {
        this.playlistUrl = str;
    }

    public final void setPortalCodeList(List<PortalCodeList> list) {
        this.portalCodeList = list;
    }

    public final void setRestrictedStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.restrictedStatus = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserIdentity(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userIdentity = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "UserInfo(userId=" + this.userId + ", userToken=" + this.userToken + ", customer=" + this.customer + ", bindMail=" + this.bindMail + ", email=" + this.email + ", hasPay=" + this.hasPay + ", restrictedStatus=" + this.restrictedStatus + ", hasPwd=" + this.hasPwd + ", childLockPwd=" + this.childLockPwd + ", userIdentity=" + this.userIdentity + ", appModel=" + this.appModel + ", portalCodeList=" + this.portalCodeList + ", accountType=" + this.accountType + ", activeTime=" + this.activeTime + ", areaCode=" + this.areaCode + ", mobile=" + this.mobile + ", bindMobile=" + this.bindMobile + ", playlistUrl=" + this.playlistUrl + ')';
    }
}
