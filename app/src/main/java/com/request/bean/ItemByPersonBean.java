package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ItemByPersonBean {
    private String macAddr;
    private Integer pageNum;
    private Integer pageSize;
    private String portalCode;
    private String puId;
    private String type;
    private String userId;
    private String userToken;

    public ItemByPersonBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "portalCode");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "puId");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "macAddr");
        this.portalCode = str;
        this.userToken = str2;
        this.userId = str3;
        this.puId = str4;
        this.type = str5;
        this.macAddr = str6;
        this.pageNum = num;
        this.pageSize = num2;
    }

    public final String component1() {
        return this.portalCode;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.puId;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.macAddr;
    }

    public final Integer component7() {
        return this.pageNum;
    }

    public final Integer component8() {
        return this.pageSize;
    }

    public final ItemByPersonBean copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "portalCode");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "puId");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "macAddr");
        return new ItemByPersonBean(str, str2, str3, str4, str5, str6, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemByPersonBean)) {
            return false;
        }
        ItemByPersonBean itemByPersonBean = (ItemByPersonBean) obj;
        return AbstractC5868k.m23669a(this.portalCode, itemByPersonBean.portalCode) && AbstractC5868k.m23669a(this.userToken, itemByPersonBean.userToken) && AbstractC5868k.m23669a(this.userId, itemByPersonBean.userId) && AbstractC5868k.m23669a(this.puId, itemByPersonBean.puId) && AbstractC5868k.m23669a(this.type, itemByPersonBean.type) && AbstractC5868k.m23669a(this.macAddr, itemByPersonBean.macAddr) && AbstractC5868k.m23669a(this.pageNum, itemByPersonBean.pageNum) && AbstractC5868k.m23669a(this.pageSize, itemByPersonBean.pageSize);
    }

    public final String getMacAddr() {
        return this.macAddr;
    }

    public final Integer getPageNum() {
        return this.pageNum;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getPuId() {
        return this.puId;
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
        int hashCode = ((((((((((this.portalCode.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.puId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.macAddr.hashCode()) * 31;
        Integer num = this.pageNum;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageSize;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setMacAddr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.macAddr = str;
    }

    public final void setPageNum(Integer num) {
        this.pageNum = num;
    }

    public final void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setPuId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.puId = str;
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
        return "ItemByPersonBean(portalCode=" + this.portalCode + ", userToken=" + this.userToken + ", userId=" + this.userId + ", puId=" + this.puId + ", type=" + this.type + ", macAddr=" + this.macAddr + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ')';
    }
}
