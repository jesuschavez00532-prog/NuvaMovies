package com.request.bean;

import java.io.Serializable;
import java.util.Arrays;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetSlbInfoBean implements Serializable {
    private String appParams;
    private String appVer;
    private int encMediaSupported;
    private String hasPay;
    private String lang;
    private String[] liveCodeList;
    private String pipFlag;
    private String portalCode;
    private String reserve1;
    private String type;
    private String userId;
    private String userIdentity;
    private String userToken;

    public GetSlbInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String[] strArr, String str9, String str10, String str11) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "userIdentity");
        AbstractC5868k.m23674f(str5, "portalCode");
        AbstractC5868k.m23674f(str6, "type");
        AbstractC5868k.m23674f(str7, "appVer");
        AbstractC5868k.m23674f(str8, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        AbstractC5868k.m23674f(str9, "appParams");
        AbstractC5868k.m23674f(str10, "reserve1");
        AbstractC5868k.m23674f(str11, "pipFlag");
        this.userToken = str;
        this.userId = str2;
        this.hasPay = str3;
        this.userIdentity = str4;
        this.portalCode = str5;
        this.type = str6;
        this.appVer = str7;
        this.lang = str8;
        this.encMediaSupported = i10;
        this.liveCodeList = strArr;
        this.appParams = str9;
        this.reserve1 = str10;
        this.pipFlag = str11;
    }

    public final String component1() {
        return this.userToken;
    }

    public final String[] component10() {
        return this.liveCodeList;
    }

    public final String component11() {
        return this.appParams;
    }

    public final String component12() {
        return this.reserve1;
    }

    public final String component13() {
        return this.pipFlag;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.hasPay;
    }

    public final String component4() {
        return this.userIdentity;
    }

    public final String component5() {
        return this.portalCode;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.appVer;
    }

    public final String component8() {
        return this.lang;
    }

    public final int component9() {
        return this.encMediaSupported;
    }

    public final GetSlbInfoBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String[] strArr, String str9, String str10, String str11) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "userIdentity");
        AbstractC5868k.m23674f(str5, "portalCode");
        AbstractC5868k.m23674f(str6, "type");
        AbstractC5868k.m23674f(str7, "appVer");
        AbstractC5868k.m23674f(str8, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        AbstractC5868k.m23674f(str9, "appParams");
        AbstractC5868k.m23674f(str10, "reserve1");
        AbstractC5868k.m23674f(str11, "pipFlag");
        return new GetSlbInfoBean(str, str2, str3, str4, str5, str6, str7, str8, i10, strArr, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSlbInfoBean)) {
            return false;
        }
        GetSlbInfoBean getSlbInfoBean = (GetSlbInfoBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getSlbInfoBean.userToken) && AbstractC5868k.m23669a(this.userId, getSlbInfoBean.userId) && AbstractC5868k.m23669a(this.hasPay, getSlbInfoBean.hasPay) && AbstractC5868k.m23669a(this.userIdentity, getSlbInfoBean.userIdentity) && AbstractC5868k.m23669a(this.portalCode, getSlbInfoBean.portalCode) && AbstractC5868k.m23669a(this.type, getSlbInfoBean.type) && AbstractC5868k.m23669a(this.appVer, getSlbInfoBean.appVer) && AbstractC5868k.m23669a(this.lang, getSlbInfoBean.lang) && this.encMediaSupported == getSlbInfoBean.encMediaSupported && AbstractC5868k.m23669a(this.liveCodeList, getSlbInfoBean.liveCodeList) && AbstractC5868k.m23669a(this.appParams, getSlbInfoBean.appParams) && AbstractC5868k.m23669a(this.reserve1, getSlbInfoBean.reserve1) && AbstractC5868k.m23669a(this.pipFlag, getSlbInfoBean.pipFlag);
    }

    public final String getAppParams() {
        return this.appParams;
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final int getEncMediaSupported() {
        return this.encMediaSupported;
    }

    public final String getHasPay() {
        return this.hasPay;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String[] getLiveCodeList() {
        return this.liveCodeList;
    }

    public final String getPipFlag() {
        return this.pipFlag;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getReserve1() {
        return this.reserve1;
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

    public int hashCode() {
        return (((((((((((((((((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.hasPay.hashCode()) * 31) + this.userIdentity.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.appVer.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.encMediaSupported) * 31) + Arrays.hashCode(this.liveCodeList)) * 31) + this.appParams.hashCode()) * 31) + this.reserve1.hashCode()) * 31) + this.pipFlag.hashCode();
    }

    public final void setAppParams(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appParams = str;
    }

    public final void setAppVer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appVer = str;
    }

    public final void setEncMediaSupported(int i10) {
        this.encMediaSupported = i10;
    }

    public final void setHasPay(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasPay = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public final void setLiveCodeList(String[] strArr) {
        AbstractC5868k.m23674f(strArr, "<set-?>");
        this.liveCodeList = strArr;
    }

    public final void setPipFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pipFlag = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setReserve1(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.reserve1 = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
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

    public String toString() {
        return "GetSlbInfoBean(userToken=" + this.userToken + ", userId=" + this.userId + ", hasPay=" + this.hasPay + ", userIdentity=" + this.userIdentity + ", portalCode=" + this.portalCode + ", type=" + this.type + ", appVer=" + this.appVer + ", lang=" + this.lang + ", encMediaSupported=" + this.encMediaSupported + ", liveCodeList=" + Arrays.toString(this.liveCodeList) + ", appParams=" + this.appParams + ", reserve1=" + this.reserve1 + ", pipFlag=" + this.pipFlag + ')';
    }
}
