package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetAllbackProgramBean implements Serializable {
    private String channelCode;
    private int columnId;
    private Integer pageNum;
    private Integer pageSize;
    private String portalCode;
    private String userId;
    private String userToken;
    private String version;

    public GetAllbackProgramBean(String str, String str2, String str3, int i10, String str4, Integer num, Integer num2, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = i10;
        this.channelCode = str4;
        this.pageSize = num;
        this.pageNum = num2;
        this.version = str5;
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
        return this.channelCode;
    }

    public final Integer component6() {
        return this.pageSize;
    }

    public final Integer component7() {
        return this.pageNum;
    }

    public final String component8() {
        return this.version;
    }

    public final GetAllbackProgramBean copy(String str, String str2, String str3, int i10, String str4, Integer num, Integer num2, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return new GetAllbackProgramBean(str, str2, str3, i10, str4, num, num2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllbackProgramBean)) {
            return false;
        }
        GetAllbackProgramBean getAllbackProgramBean = (GetAllbackProgramBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getAllbackProgramBean.userToken) && AbstractC5868k.m23669a(this.userId, getAllbackProgramBean.userId) && AbstractC5868k.m23669a(this.portalCode, getAllbackProgramBean.portalCode) && this.columnId == getAllbackProgramBean.columnId && AbstractC5868k.m23669a(this.channelCode, getAllbackProgramBean.channelCode) && AbstractC5868k.m23669a(this.pageSize, getAllbackProgramBean.pageSize) && AbstractC5868k.m23669a(this.pageNum, getAllbackProgramBean.pageNum) && AbstractC5868k.m23669a(this.version, getAllbackProgramBean.version);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final int getColumnId() {
        return this.columnId;
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

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.columnId) * 31;
        String str = this.channelCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pageSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageNum;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.version;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
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

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "GetAllbackProgramBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", channelCode=" + this.channelCode + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", version=" + this.version + ')';
    }
}
