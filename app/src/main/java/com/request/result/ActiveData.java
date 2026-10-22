package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ActiveData implements Serializable {
    private String accountType;
    private String activeTime;
    private String appModel;
    private String areaCode;
    private String areaFlag;
    private List<AuthInfoList> authInfoList;
    private int availableTime;
    private String bindMail;
    private String bindMobile;
    private String cacheTime;
    private String chargeFlag;
    private String childLockPwd;
    private String customer;
    private String email;
    private int expRemainingDays;
    private String getFreeAuthDays;
    private String getFreeAuthFlag;
    private String hasFreeAuth;
    private String hasPay;
    private String hasPwd;
    private String heartBeatTime;
    private String mobile;
    private String nowTime;
    private String payCoreAddress;
    private String playlistUrl;
    private List<PortalCodeList> portalCodeList;
    private String qrcodeDisplay;
    private String qrcodeMessage;
    private String recommCacheTime;
    private int remainingDays;
    private String renewFlag;
    private String restrictedStatus;
    private String showFlag;
    private String showType;
    private String tips;
    private String type;
    private String userId;
    private String userIdentity;
    private String userToken;
    private String userType;
    private int vodFreeCount;

    public ActiveData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, List<PortalCodeList> list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i11, String str20, String str21, String str22, int i12, int i13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, List<AuthInfoList> list2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "customer");
        AbstractC5868k.m23674f(str4, "bindMail");
        AbstractC5868k.m23674f(str6, "hasPay");
        AbstractC5868k.m23674f(str7, "restrictedStatus");
        AbstractC5868k.m23674f(str8, "hasPwd");
        AbstractC5868k.m23674f(str10, "userIdentity");
        AbstractC5868k.m23674f(str11, "appModel");
        AbstractC5868k.m23674f(str16, "bindMobile");
        AbstractC5868k.m23674f(str19, "heartBeatTime");
        AbstractC5868k.m23674f(str27, "getFreeAuthFlag");
        this.userId = str;
        this.userToken = str2;
        this.customer = str3;
        this.bindMail = str4;
        this.email = str5;
        this.hasPay = str6;
        this.restrictedStatus = str7;
        this.hasPwd = str8;
        this.childLockPwd = str9;
        this.vodFreeCount = i10;
        this.userIdentity = str10;
        this.appModel = str11;
        this.portalCodeList = list;
        this.accountType = str12;
        this.activeTime = str13;
        this.areaCode = str14;
        this.mobile = str15;
        this.bindMobile = str16;
        this.cacheTime = str17;
        this.recommCacheTime = str18;
        this.heartBeatTime = str19;
        this.availableTime = i11;
        this.nowTime = str20;
        this.tips = str21;
        this.type = str22;
        this.remainingDays = i12;
        this.expRemainingDays = i13;
        this.qrcodeMessage = str23;
        this.qrcodeDisplay = str24;
        this.payCoreAddress = str25;
        this.userType = str26;
        this.getFreeAuthFlag = str27;
        this.getFreeAuthDays = str28;
        this.hasFreeAuth = str29;
        this.showFlag = str30;
        this.showType = str31;
        this.renewFlag = str32;
        this.areaFlag = str33;
        this.playlistUrl = str34;
        this.chargeFlag = str35;
        this.authInfoList = list2;
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.vodFreeCount;
    }

    public final String component11() {
        return this.userIdentity;
    }

    public final String component12() {
        return this.appModel;
    }

    public final List<PortalCodeList> component13() {
        return this.portalCodeList;
    }

    public final String component14() {
        return this.accountType;
    }

    public final String component15() {
        return this.activeTime;
    }

    public final String component16() {
        return this.areaCode;
    }

    public final String component17() {
        return this.mobile;
    }

    public final String component18() {
        return this.bindMobile;
    }

    public final String component19() {
        return this.cacheTime;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component20() {
        return this.recommCacheTime;
    }

    public final String component21() {
        return this.heartBeatTime;
    }

    public final int component22() {
        return this.availableTime;
    }

    public final String component23() {
        return this.nowTime;
    }

    public final String component24() {
        return this.tips;
    }

    public final String component25() {
        return this.type;
    }

    public final int component26() {
        return this.remainingDays;
    }

    public final int component27() {
        return this.expRemainingDays;
    }

    public final String component28() {
        return this.qrcodeMessage;
    }

    public final String component29() {
        return this.qrcodeDisplay;
    }

    public final String component3() {
        return this.customer;
    }

    public final String component30() {
        return this.payCoreAddress;
    }

    public final String component31() {
        return this.userType;
    }

    public final String component32() {
        return this.getFreeAuthFlag;
    }

    public final String component33() {
        return this.getFreeAuthDays;
    }

    public final String component34() {
        return this.hasFreeAuth;
    }

    public final String component35() {
        return this.showFlag;
    }

    public final String component36() {
        return this.showType;
    }

    public final String component37() {
        return this.renewFlag;
    }

    public final String component38() {
        return this.areaFlag;
    }

    public final String component39() {
        return this.playlistUrl;
    }

    public final String component4() {
        return this.bindMail;
    }

    public final String component40() {
        return this.chargeFlag;
    }

    public final List<AuthInfoList> component41() {
        return this.authInfoList;
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

    public final ActiveData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, List<PortalCodeList> list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i11, String str20, String str21, String str22, int i12, int i13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, List<AuthInfoList> list2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "customer");
        AbstractC5868k.m23674f(str4, "bindMail");
        AbstractC5868k.m23674f(str6, "hasPay");
        AbstractC5868k.m23674f(str7, "restrictedStatus");
        AbstractC5868k.m23674f(str8, "hasPwd");
        AbstractC5868k.m23674f(str10, "userIdentity");
        AbstractC5868k.m23674f(str11, "appModel");
        AbstractC5868k.m23674f(str16, "bindMobile");
        AbstractC5868k.m23674f(str19, "heartBeatTime");
        AbstractC5868k.m23674f(str27, "getFreeAuthFlag");
        return new ActiveData(str, str2, str3, str4, str5, str6, str7, str8, str9, i10, str10, str11, list, str12, str13, str14, str15, str16, str17, str18, str19, i11, str20, str21, str22, i12, i13, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveData)) {
            return false;
        }
        ActiveData activeData = (ActiveData) obj;
        return AbstractC5868k.m23669a(this.userId, activeData.userId) && AbstractC5868k.m23669a(this.userToken, activeData.userToken) && AbstractC5868k.m23669a(this.customer, activeData.customer) && AbstractC5868k.m23669a(this.bindMail, activeData.bindMail) && AbstractC5868k.m23669a(this.email, activeData.email) && AbstractC5868k.m23669a(this.hasPay, activeData.hasPay) && AbstractC5868k.m23669a(this.restrictedStatus, activeData.restrictedStatus) && AbstractC5868k.m23669a(this.hasPwd, activeData.hasPwd) && AbstractC5868k.m23669a(this.childLockPwd, activeData.childLockPwd) && this.vodFreeCount == activeData.vodFreeCount && AbstractC5868k.m23669a(this.userIdentity, activeData.userIdentity) && AbstractC5868k.m23669a(this.appModel, activeData.appModel) && AbstractC5868k.m23669a(this.portalCodeList, activeData.portalCodeList) && AbstractC5868k.m23669a(this.accountType, activeData.accountType) && AbstractC5868k.m23669a(this.activeTime, activeData.activeTime) && AbstractC5868k.m23669a(this.areaCode, activeData.areaCode) && AbstractC5868k.m23669a(this.mobile, activeData.mobile) && AbstractC5868k.m23669a(this.bindMobile, activeData.bindMobile) && AbstractC5868k.m23669a(this.cacheTime, activeData.cacheTime) && AbstractC5868k.m23669a(this.recommCacheTime, activeData.recommCacheTime) && AbstractC5868k.m23669a(this.heartBeatTime, activeData.heartBeatTime) && this.availableTime == activeData.availableTime && AbstractC5868k.m23669a(this.nowTime, activeData.nowTime) && AbstractC5868k.m23669a(this.tips, activeData.tips) && AbstractC5868k.m23669a(this.type, activeData.type) && this.remainingDays == activeData.remainingDays && this.expRemainingDays == activeData.expRemainingDays && AbstractC5868k.m23669a(this.qrcodeMessage, activeData.qrcodeMessage) && AbstractC5868k.m23669a(this.qrcodeDisplay, activeData.qrcodeDisplay) && AbstractC5868k.m23669a(this.payCoreAddress, activeData.payCoreAddress) && AbstractC5868k.m23669a(this.userType, activeData.userType) && AbstractC5868k.m23669a(this.getFreeAuthFlag, activeData.getFreeAuthFlag) && AbstractC5868k.m23669a(this.getFreeAuthDays, activeData.getFreeAuthDays) && AbstractC5868k.m23669a(this.hasFreeAuth, activeData.hasFreeAuth) && AbstractC5868k.m23669a(this.showFlag, activeData.showFlag) && AbstractC5868k.m23669a(this.showType, activeData.showType) && AbstractC5868k.m23669a(this.renewFlag, activeData.renewFlag) && AbstractC5868k.m23669a(this.areaFlag, activeData.areaFlag) && AbstractC5868k.m23669a(this.playlistUrl, activeData.playlistUrl) && AbstractC5868k.m23669a(this.chargeFlag, activeData.chargeFlag) && AbstractC5868k.m23669a(this.authInfoList, activeData.authInfoList);
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

    public final String getAreaFlag() {
        return this.areaFlag;
    }

    public final List<AuthInfoList> getAuthInfoList() {
        return this.authInfoList;
    }

    public final int getAvailableTime() {
        return this.availableTime;
    }

    public final String getBindMail() {
        return this.bindMail;
    }

    public final String getBindMobile() {
        return this.bindMobile;
    }

    public final String getCacheTime() {
        return this.cacheTime;
    }

    public final String getChargeFlag() {
        return this.chargeFlag;
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

    public final int getExpRemainingDays() {
        return this.expRemainingDays;
    }

    public final String getGetFreeAuthDays() {
        return this.getFreeAuthDays;
    }

    public final String getGetFreeAuthFlag() {
        return this.getFreeAuthFlag;
    }

    public final String getHasFreeAuth() {
        return this.hasFreeAuth;
    }

    public final String getHasPay() {
        return this.hasPay;
    }

    public final String getHasPwd() {
        return this.hasPwd;
    }

    public final String getHeartBeatTime() {
        return this.heartBeatTime;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getNowTime() {
        return this.nowTime;
    }

    public final String getPayCoreAddress() {
        return this.payCoreAddress;
    }

    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public final List<PortalCodeList> getPortalCodeList() {
        return this.portalCodeList;
    }

    public final String getQrcodeDisplay() {
        return this.qrcodeDisplay;
    }

    public final String getQrcodeMessage() {
        return this.qrcodeMessage;
    }

    public final String getRecommCacheTime() {
        return this.recommCacheTime;
    }

    public final int getRemainingDays() {
        return this.remainingDays;
    }

    public final String getRenewFlag() {
        return this.renewFlag;
    }

    public final String getRestrictedStatus() {
        return this.restrictedStatus;
    }

    public final String getShowFlag() {
        return this.showFlag;
    }

    public final String getShowType() {
        return this.showType;
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

    public final String getUserIdentity() {
        return this.userIdentity;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final int getVodFreeCount() {
        return this.vodFreeCount;
    }

    public int hashCode() {
        int hashCode = ((((((this.userId.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.customer.hashCode()) * 31) + this.bindMail.hashCode()) * 31;
        String str = this.email;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.hasPay.hashCode()) * 31) + this.restrictedStatus.hashCode()) * 31) + this.hasPwd.hashCode()) * 31;
        String str2 = this.childLockPwd;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.vodFreeCount) * 31) + this.userIdentity.hashCode()) * 31) + this.appModel.hashCode()) * 31;
        List<PortalCodeList> list = this.portalCodeList;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.accountType;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activeTime;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.areaCode;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mobile;
        int hashCode8 = (((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.bindMobile.hashCode()) * 31;
        String str7 = this.cacheTime;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.recommCacheTime;
        int hashCode10 = (((((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.heartBeatTime.hashCode()) * 31) + this.availableTime) * 31;
        String str9 = this.nowTime;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tips;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int hashCode13 = (((((hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.remainingDays) * 31) + this.expRemainingDays) * 31;
        String str12 = this.qrcodeMessage;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.qrcodeDisplay;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.payCoreAddress;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.userType;
        int hashCode17 = (((hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.getFreeAuthFlag.hashCode()) * 31;
        String str16 = this.getFreeAuthDays;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.hasFreeAuth;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.showFlag;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.showType;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.renewFlag;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.areaFlag;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.playlistUrl;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.chargeFlag;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        List<AuthInfoList> list2 = this.authInfoList;
        return hashCode25 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAccountType(String str) {
        this.accountType = str;
    }

    public final void setActiveTime(String str) {
        this.activeTime = str;
    }

    public final void setAppModel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appModel = str;
    }

    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    public final void setAreaFlag(String str) {
        this.areaFlag = str;
    }

    public final void setAuthInfoList(List<AuthInfoList> list) {
        this.authInfoList = list;
    }

    public final void setAvailableTime(int i10) {
        this.availableTime = i10;
    }

    public final void setBindMail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.bindMail = str;
    }

    public final void setBindMobile(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.bindMobile = str;
    }

    public final void setCacheTime(String str) {
        this.cacheTime = str;
    }

    public final void setChargeFlag(String str) {
        this.chargeFlag = str;
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

    public final void setExpRemainingDays(int i10) {
        this.expRemainingDays = i10;
    }

    public final void setGetFreeAuthDays(String str) {
        this.getFreeAuthDays = str;
    }

    public final void setGetFreeAuthFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.getFreeAuthFlag = str;
    }

    public final void setHasFreeAuth(String str) {
        this.hasFreeAuth = str;
    }

    public final void setHasPay(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasPay = str;
    }

    public final void setHasPwd(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasPwd = str;
    }

    public final void setHeartBeatTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.heartBeatTime = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setNowTime(String str) {
        this.nowTime = str;
    }

    public final void setPayCoreAddress(String str) {
        this.payCoreAddress = str;
    }

    public final void setPlaylistUrl(String str) {
        this.playlistUrl = str;
    }

    public final void setPortalCodeList(List<PortalCodeList> list) {
        this.portalCodeList = list;
    }

    public final void setQrcodeDisplay(String str) {
        this.qrcodeDisplay = str;
    }

    public final void setQrcodeMessage(String str) {
        this.qrcodeMessage = str;
    }

    public final void setRecommCacheTime(String str) {
        this.recommCacheTime = str;
    }

    public final void setRemainingDays(int i10) {
        this.remainingDays = i10;
    }

    public final void setRenewFlag(String str) {
        this.renewFlag = str;
    }

    public final void setRestrictedStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.restrictedStatus = str;
    }

    public final void setShowFlag(String str) {
        this.showFlag = str;
    }

    public final void setShowType(String str) {
        this.showType = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setType(String str) {
        this.type = str;
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

    public final void setUserType(String str) {
        this.userType = str;
    }

    public final void setVodFreeCount(int i10) {
        this.vodFreeCount = i10;
    }

    public String toString() {
        return "ActiveData(userId=" + this.userId + ", userToken=" + this.userToken + ", customer=" + this.customer + ", bindMail=" + this.bindMail + ", email=" + this.email + ", hasPay=" + this.hasPay + ", restrictedStatus=" + this.restrictedStatus + ", hasPwd=" + this.hasPwd + ", childLockPwd=" + this.childLockPwd + ", vodFreeCount=" + this.vodFreeCount + ", userIdentity=" + this.userIdentity + ", appModel=" + this.appModel + ", portalCodeList=" + this.portalCodeList + ", accountType=" + this.accountType + ", activeTime=" + this.activeTime + ", areaCode=" + this.areaCode + ", mobile=" + this.mobile + ", bindMobile=" + this.bindMobile + ", cacheTime=" + this.cacheTime + ", recommCacheTime=" + this.recommCacheTime + ", heartBeatTime=" + this.heartBeatTime + ", availableTime=" + this.availableTime + ", nowTime=" + this.nowTime + ", tips=" + this.tips + ", type=" + this.type + ", remainingDays=" + this.remainingDays + ", expRemainingDays=" + this.expRemainingDays + ", qrcodeMessage=" + this.qrcodeMessage + ", qrcodeDisplay=" + this.qrcodeDisplay + ", payCoreAddress=" + this.payCoreAddress + ", userType=" + this.userType + ", getFreeAuthFlag=" + this.getFreeAuthFlag + ", getFreeAuthDays=" + this.getFreeAuthDays + ", hasFreeAuth=" + this.hasFreeAuth + ", showFlag=" + this.showFlag + ", showType=" + this.showType + ", renewFlag=" + this.renewFlag + ", areaFlag=" + this.areaFlag + ", playlistUrl=" + this.playlistUrl + ", chargeFlag=" + this.chargeFlag + ", authInfoList=" + this.authInfoList + ')';
    }
}
