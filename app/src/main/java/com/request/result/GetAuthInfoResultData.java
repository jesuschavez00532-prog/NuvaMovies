package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAuthInfoResultData implements Serializable {
    private String areaFlag;
    private List<AuthInfoList> authInfoList;
    private String bindMail;
    private String bindMobile;
    private String chargeFlag;
    private String childLockPwd;
    private String getFreeAuthDays;
    private String getFreeAuthFlag;
    private String hasFreeAuth;
    private String hasPay;
    private String hasPwd;
    private String nowTime;
    private String payCoreAddress;
    private String playlistUrl;
    private String qrcodeDisplay;
    private String qrcodeMessage;
    private int remainingDays;
    private String renewFlag;
    private String restrictedStatus;
    private String showFlag;
    private String showType;
    private String tips;
    private String type;
    private String userIdentity;
    private String userType;

    public GetAuthInfoResultData(List<AuthInfoList> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        AbstractC5868k.m23674f(str, "bindMail");
        AbstractC5868k.m23674f(str2, "bindMobile");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "restrictedStatus");
        AbstractC5868k.m23674f(str6, "hasPwd");
        AbstractC5868k.m23674f(str15, "getFreeAuthFlag");
        this.authInfoList = list;
        this.bindMail = str;
        this.bindMobile = str2;
        this.hasPay = str3;
        this.restrictedStatus = str4;
        this.childLockPwd = str5;
        this.hasPwd = str6;
        this.nowTime = str7;
        this.tips = str8;
        this.type = str9;
        this.remainingDays = i10;
        this.qrcodeMessage = str10;
        this.qrcodeDisplay = str11;
        this.payCoreAddress = str12;
        this.userType = str13;
        this.userIdentity = str14;
        this.getFreeAuthFlag = str15;
        this.getFreeAuthDays = str16;
        this.hasFreeAuth = str17;
        this.showFlag = str18;
        this.showType = str19;
        this.renewFlag = str20;
        this.playlistUrl = str21;
        this.areaFlag = str22;
        this.chargeFlag = str23;
    }

    public final List<AuthInfoList> component1() {
        return this.authInfoList;
    }

    public final String component10() {
        return this.type;
    }

    public final int component11() {
        return this.remainingDays;
    }

    public final String component12() {
        return this.qrcodeMessage;
    }

    public final String component13() {
        return this.qrcodeDisplay;
    }

    public final String component14() {
        return this.payCoreAddress;
    }

    public final String component15() {
        return this.userType;
    }

    public final String component16() {
        return this.userIdentity;
    }

    public final String component17() {
        return this.getFreeAuthFlag;
    }

    public final String component18() {
        return this.getFreeAuthDays;
    }

    public final String component19() {
        return this.hasFreeAuth;
    }

    public final String component2() {
        return this.bindMail;
    }

    public final String component20() {
        return this.showFlag;
    }

    public final String component21() {
        return this.showType;
    }

    public final String component22() {
        return this.renewFlag;
    }

    public final String component23() {
        return this.playlistUrl;
    }

    public final String component24() {
        return this.areaFlag;
    }

    public final String component25() {
        return this.chargeFlag;
    }

    public final String component3() {
        return this.bindMobile;
    }

    public final String component4() {
        return this.hasPay;
    }

    public final String component5() {
        return this.restrictedStatus;
    }

    public final String component6() {
        return this.childLockPwd;
    }

    public final String component7() {
        return this.hasPwd;
    }

    public final String component8() {
        return this.nowTime;
    }

    public final String component9() {
        return this.tips;
    }

    public final GetAuthInfoResultData copy(List<AuthInfoList> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        AbstractC5868k.m23674f(str, "bindMail");
        AbstractC5868k.m23674f(str2, "bindMobile");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "restrictedStatus");
        AbstractC5868k.m23674f(str6, "hasPwd");
        AbstractC5868k.m23674f(str15, "getFreeAuthFlag");
        return new GetAuthInfoResultData(list, str, str2, str3, str4, str5, str6, str7, str8, str9, i10, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthInfoResultData)) {
            return false;
        }
        GetAuthInfoResultData getAuthInfoResultData = (GetAuthInfoResultData) obj;
        return AbstractC5868k.m23669a(this.authInfoList, getAuthInfoResultData.authInfoList) && AbstractC5868k.m23669a(this.bindMail, getAuthInfoResultData.bindMail) && AbstractC5868k.m23669a(this.bindMobile, getAuthInfoResultData.bindMobile) && AbstractC5868k.m23669a(this.hasPay, getAuthInfoResultData.hasPay) && AbstractC5868k.m23669a(this.restrictedStatus, getAuthInfoResultData.restrictedStatus) && AbstractC5868k.m23669a(this.childLockPwd, getAuthInfoResultData.childLockPwd) && AbstractC5868k.m23669a(this.hasPwd, getAuthInfoResultData.hasPwd) && AbstractC5868k.m23669a(this.nowTime, getAuthInfoResultData.nowTime) && AbstractC5868k.m23669a(this.tips, getAuthInfoResultData.tips) && AbstractC5868k.m23669a(this.type, getAuthInfoResultData.type) && this.remainingDays == getAuthInfoResultData.remainingDays && AbstractC5868k.m23669a(this.qrcodeMessage, getAuthInfoResultData.qrcodeMessage) && AbstractC5868k.m23669a(this.qrcodeDisplay, getAuthInfoResultData.qrcodeDisplay) && AbstractC5868k.m23669a(this.payCoreAddress, getAuthInfoResultData.payCoreAddress) && AbstractC5868k.m23669a(this.userType, getAuthInfoResultData.userType) && AbstractC5868k.m23669a(this.userIdentity, getAuthInfoResultData.userIdentity) && AbstractC5868k.m23669a(this.getFreeAuthFlag, getAuthInfoResultData.getFreeAuthFlag) && AbstractC5868k.m23669a(this.getFreeAuthDays, getAuthInfoResultData.getFreeAuthDays) && AbstractC5868k.m23669a(this.hasFreeAuth, getAuthInfoResultData.hasFreeAuth) && AbstractC5868k.m23669a(this.showFlag, getAuthInfoResultData.showFlag) && AbstractC5868k.m23669a(this.showType, getAuthInfoResultData.showType) && AbstractC5868k.m23669a(this.renewFlag, getAuthInfoResultData.renewFlag) && AbstractC5868k.m23669a(this.playlistUrl, getAuthInfoResultData.playlistUrl) && AbstractC5868k.m23669a(this.areaFlag, getAuthInfoResultData.areaFlag) && AbstractC5868k.m23669a(this.chargeFlag, getAuthInfoResultData.chargeFlag);
    }

    public final String getAreaFlag() {
        return this.areaFlag;
    }

    public final List<AuthInfoList> getAuthInfoList() {
        return this.authInfoList;
    }

    public final String getBindMail() {
        return this.bindMail;
    }

    public final String getBindMobile() {
        return this.bindMobile;
    }

    public final String getChargeFlag() {
        return this.chargeFlag;
    }

    public final String getChildLockPwd() {
        return this.childLockPwd;
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

    public final String getNowTime() {
        return this.nowTime;
    }

    public final String getPayCoreAddress() {
        return this.payCoreAddress;
    }

    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public final String getQrcodeDisplay() {
        return this.qrcodeDisplay;
    }

    public final String getQrcodeMessage() {
        return this.qrcodeMessage;
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

    public final String getUserIdentity() {
        return this.userIdentity;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        List<AuthInfoList> list = this.authInfoList;
        int hashCode = (((((((((list == null ? 0 : list.hashCode()) * 31) + this.bindMail.hashCode()) * 31) + this.bindMobile.hashCode()) * 31) + this.hasPay.hashCode()) * 31) + this.restrictedStatus.hashCode()) * 31;
        String str = this.childLockPwd;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.hasPwd.hashCode()) * 31;
        String str2 = this.nowTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.remainingDays) * 31;
        String str5 = this.qrcodeMessage;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qrcodeDisplay;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payCoreAddress;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userIdentity;
        int hashCode10 = (((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.getFreeAuthFlag.hashCode()) * 31;
        String str10 = this.getFreeAuthDays;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.hasFreeAuth;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.showFlag;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.showType;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.renewFlag;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.playlistUrl;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.areaFlag;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.chargeFlag;
        return hashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    public final void setAreaFlag(String str) {
        this.areaFlag = str;
    }

    public final void setAuthInfoList(List<AuthInfoList> list) {
        this.authInfoList = list;
    }

    public final void setBindMail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.bindMail = str;
    }

    public final void setBindMobile(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.bindMobile = str;
    }

    public final void setChargeFlag(String str) {
        this.chargeFlag = str;
    }

    public final void setChildLockPwd(String str) {
        this.childLockPwd = str;
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

    public final void setNowTime(String str) {
        this.nowTime = str;
    }

    public final void setPayCoreAddress(String str) {
        this.payCoreAddress = str;
    }

    public final void setPlaylistUrl(String str) {
        this.playlistUrl = str;
    }

    public final void setQrcodeDisplay(String str) {
        this.qrcodeDisplay = str;
    }

    public final void setQrcodeMessage(String str) {
        this.qrcodeMessage = str;
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

    public final void setUserIdentity(String str) {
        this.userIdentity = str;
    }

    public final void setUserType(String str) {
        this.userType = str;
    }

    public String toString() {
        return "GetAuthInfoResultData(authInfoList=" + this.authInfoList + ", bindMail=" + this.bindMail + ", bindMobile=" + this.bindMobile + ", hasPay=" + this.hasPay + ", restrictedStatus=" + this.restrictedStatus + ", childLockPwd=" + this.childLockPwd + ", hasPwd=" + this.hasPwd + ", nowTime=" + this.nowTime + ", tips=" + this.tips + ", type=" + this.type + ", remainingDays=" + this.remainingDays + ", qrcodeMessage=" + this.qrcodeMessage + ", qrcodeDisplay=" + this.qrcodeDisplay + ", payCoreAddress=" + this.payCoreAddress + ", userType=" + this.userType + ", userIdentity=" + this.userIdentity + ", getFreeAuthFlag=" + this.getFreeAuthFlag + ", getFreeAuthDays=" + this.getFreeAuthDays + ", hasFreeAuth=" + this.hasFreeAuth + ", showFlag=" + this.showFlag + ", showType=" + this.showType + ", renewFlag=" + this.renewFlag + ", playlistUrl=" + this.playlistUrl + ", areaFlag=" + this.areaFlag + ", chargeFlag=" + this.chargeFlag + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAuthInfoResultData(ActiveData activeData) {
        this(activeData.getAuthInfoList(), activeData.getBindMail(), activeData.getBindMobile(), activeData.getHasPay(), activeData.getRestrictedStatus(), activeData.getChildLockPwd(), activeData.getHasPwd(), activeData.getNowTime(), activeData.getTips(), activeData.getType(), activeData.getRemainingDays(), activeData.getQrcodeMessage(), activeData.getQrcodeDisplay(), activeData.getPayCoreAddress(), activeData.getUserType(), activeData.getUserIdentity(), activeData.getGetFreeAuthFlag(), activeData.getGetFreeAuthDays(), activeData.getHasFreeAuth(), activeData.getShowFlag(), activeData.getShowType(), activeData.getRenewFlag(), activeData.getAreaFlag(), activeData.getPlaylistUrl(), activeData.getChargeFlag());
        AbstractC5868k.m23674f(activeData, "data");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAuthInfoResultData(LoginResultData loginResultData) {
        this(loginResultData.getAuthInfoList(), loginResultData.getBindMail(), loginResultData.getBindMobile(), loginResultData.getHasPay(), loginResultData.getRestrictedStatus(), loginResultData.getChildLockPwd(), loginResultData.getHasPwd(), loginResultData.getNowTime(), loginResultData.getTips(), loginResultData.getType(), loginResultData.getRemainingDays(), loginResultData.getQrcodeMessage(), loginResultData.getQrcodeDisplay(), loginResultData.getPayCoreAddress(), loginResultData.getUserType(), loginResultData.getUserIdentity(), loginResultData.getGetFreeAuthFlag(), loginResultData.getGetFreeAuthDays(), loginResultData.getHasFreeAuth(), loginResultData.getShowFlag(), loginResultData.getShowType(), loginResultData.getRenewFlag(), loginResultData.getAreaFlag(), loginResultData.getPlaylistUrl(), loginResultData.getChargeFlag());
        AbstractC5868k.m23674f(loginResultData, "data");
    }
}
