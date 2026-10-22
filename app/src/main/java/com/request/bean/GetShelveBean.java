package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetShelveBean implements Serializable {
    private int columnId;
    private String columnType;
    private Integer encryptVersion;
    private Integer numDisplay;
    private int pageNum;
    private int pageSize;
    private String portalCode;
    private String userId;
    private String userToken;

    public GetShelveBean(String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "columnType");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = i10;
        this.columnType = str4;
        this.pageSize = i11;
        this.pageNum = i12;
        this.numDisplay = num;
        this.encryptVersion = num2;
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
        return this.columnType;
    }

    public final int component6() {
        return this.pageSize;
    }

    public final int component7() {
        return this.pageNum;
    }

    public final Integer component8() {
        return this.numDisplay;
    }

    public final Integer component9() {
        return this.encryptVersion;
    }

    public final GetShelveBean copy(String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "columnType");
        return new GetShelveBean(str, str2, str3, i10, str4, i11, i12, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetShelveBean)) {
            return false;
        }
        GetShelveBean getShelveBean = (GetShelveBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getShelveBean.userToken) && AbstractC5868k.m23669a(this.userId, getShelveBean.userId) && AbstractC5868k.m23669a(this.portalCode, getShelveBean.portalCode) && this.columnId == getShelveBean.columnId && AbstractC5868k.m23669a(this.columnType, getShelveBean.columnType) && this.pageSize == getShelveBean.pageSize && this.pageNum == getShelveBean.pageNum && AbstractC5868k.m23669a(this.numDisplay, getShelveBean.numDisplay) && AbstractC5868k.m23669a(this.encryptVersion, getShelveBean.encryptVersion);
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getColumnType() {
        return this.columnType;
    }

    public final Integer getEncryptVersion() {
        return this.encryptVersion;
    }

    public final Integer getNumDisplay() {
        return this.numDisplay;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
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
        int hashCode = ((((((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.columnId) * 31) + this.columnType.hashCode()) * 31) + this.pageSize) * 31) + this.pageNum) * 31;
        Integer num = this.numDisplay;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.encryptVersion;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setColumnType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.columnType = str;
    }

    public final void setEncryptVersion(Integer num) {
        this.encryptVersion = num;
    }

    public final void setNumDisplay(Integer num) {
        this.numDisplay = num;
    }

    public final void setPageNum(int i10) {
        this.pageNum = i10;
    }

    public final void setPageSize(int i10) {
        this.pageSize = i10;
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
        return "GetShelveBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", columnType=" + this.columnType + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", numDisplay=" + this.numDisplay + ", encryptVersion=" + this.encryptVersion + ')';
    }
}
