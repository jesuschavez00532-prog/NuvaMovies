package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetItemDataBean implements Serializable {
    private String contentId;
    private String language;
    private String macAddr;
    private String portalCode;
    private String sortType;
    private String type;
    private String userId;
    private String userToken;

    public GetItemDataBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str8, "macAddr");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.contentId = str4;
        this.type = str5;
        this.sortType = str6;
        this.language = str7;
        this.macAddr = str8;
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.portalCode;
    }

    public final String component4() {
        return this.contentId;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.sortType;
    }

    public final String component7() {
        return this.language;
    }

    public final String component8() {
        return this.macAddr;
    }

    public final GetItemDataBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str8, "macAddr");
        return new GetItemDataBean(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetItemDataBean)) {
            return false;
        }
        GetItemDataBean getItemDataBean = (GetItemDataBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getItemDataBean.userToken) && AbstractC5868k.m23669a(this.userId, getItemDataBean.userId) && AbstractC5868k.m23669a(this.portalCode, getItemDataBean.portalCode) && AbstractC5868k.m23669a(this.contentId, getItemDataBean.contentId) && AbstractC5868k.m23669a(this.type, getItemDataBean.type) && AbstractC5868k.m23669a(this.sortType, getItemDataBean.sortType) && AbstractC5868k.m23669a(this.language, getItemDataBean.language) && AbstractC5868k.m23669a(this.macAddr, getItemDataBean.macAddr);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMacAddr() {
        return this.macAddr;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getSortType() {
        return this.sortType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int hashCode = ((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.sortType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.language;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.macAddr.hashCode();
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setMacAddr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.macAddr = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setSortType(String str) {
        this.sortType = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
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
        return "GetItemDataBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", contentId=" + this.contentId + ", type=" + this.type + ", sortType=" + this.sortType + ", language=" + this.language + ", macAddr=" + this.macAddr + ')';
    }
}
