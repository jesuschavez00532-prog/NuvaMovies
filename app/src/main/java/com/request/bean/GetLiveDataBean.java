package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetLiveDataBean implements Serializable {
    private int columnId;
    private String dataVersion;
    private String expireTimeStr;
    private Integer pageNum;
    private Integer pageSize;
    private String portalCode;
    private String userId;
    private String userToken;

    public GetLiveDataBean(String str, String str2, String str3, int i10, String str4, Integer num, Integer num2, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = i10;
        this.dataVersion = str4;
        this.pageSize = num;
        this.pageNum = num2;
        this.expireTimeStr = str5;
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

    public final int component4() {
        return this.columnId;
    }

    public final String component5() {
        return this.dataVersion;
    }

    public final Integer component6() {
        return this.pageSize;
    }

    public final Integer component7() {
        return this.pageNum;
    }

    public final String component8() {
        return this.expireTimeStr;
    }

    public final GetLiveDataBean copy(String str, String str2, String str3, int i10, String str4, Integer num, Integer num2, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return new GetLiveDataBean(str, str2, str3, i10, str4, num, num2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLiveDataBean)) {
            return false;
        }
        GetLiveDataBean getLiveDataBean = (GetLiveDataBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getLiveDataBean.userToken) && AbstractC5868k.m23669a(this.userId, getLiveDataBean.userId) && AbstractC5868k.m23669a(this.portalCode, getLiveDataBean.portalCode) && this.columnId == getLiveDataBean.columnId && AbstractC5868k.m23669a(this.dataVersion, getLiveDataBean.dataVersion) && AbstractC5868k.m23669a(this.pageSize, getLiveDataBean.pageSize) && AbstractC5868k.m23669a(this.pageNum, getLiveDataBean.pageNum) && AbstractC5868k.m23669a(this.expireTimeStr, getLiveDataBean.expireTimeStr);
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getDataVersion() {
        return this.dataVersion;
    }

    public final String getExpireTimeStr() {
        return this.expireTimeStr;
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

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int hashCode = ((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.columnId) * 31;
        String str = this.dataVersion;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pageSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageNum;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.expireTimeStr;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setDataVersion(String str) {
        this.dataVersion = str;
    }

    public final void setExpireTimeStr(String str) {
        this.expireTimeStr = str;
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

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "GetLiveDataBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", dataVersion=" + this.dataVersion + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", expireTimeStr=" + this.expireTimeStr + ')';
    }
}
