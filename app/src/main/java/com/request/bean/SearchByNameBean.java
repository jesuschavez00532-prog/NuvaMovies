package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SearchByNameBean implements Serializable {
    private String columnId;
    private String filter;
    private Integer pageNum;
    private Integer pageSize;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;
    private String value;

    public SearchByNameBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str5, "value");
        AbstractC5868k.m23674f(str6, "type");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = str4;
        this.value = str5;
        this.type = str6;
        this.pageSize = num;
        this.pageNum = num2;
        this.filter = str7;
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
        return this.columnId;
    }

    public final String component5() {
        return this.value;
    }

    public final String component6() {
        return this.type;
    }

    public final Integer component7() {
        return this.pageSize;
    }

    public final Integer component8() {
        return this.pageNum;
    }

    public final String component9() {
        return this.filter;
    }

    public final SearchByNameBean copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str5, "value");
        AbstractC5868k.m23674f(str6, "type");
        return new SearchByNameBean(str, str2, str3, str4, str5, str6, num, num2, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByNameBean)) {
            return false;
        }
        SearchByNameBean searchByNameBean = (SearchByNameBean) obj;
        return AbstractC5868k.m23669a(this.userToken, searchByNameBean.userToken) && AbstractC5868k.m23669a(this.userId, searchByNameBean.userId) && AbstractC5868k.m23669a(this.portalCode, searchByNameBean.portalCode) && AbstractC5868k.m23669a(this.columnId, searchByNameBean.columnId) && AbstractC5868k.m23669a(this.value, searchByNameBean.value) && AbstractC5868k.m23669a(this.type, searchByNameBean.type) && AbstractC5868k.m23669a(this.pageSize, searchByNameBean.pageSize) && AbstractC5868k.m23669a(this.pageNum, searchByNameBean.pageNum) && AbstractC5868k.m23669a(this.filter, searchByNameBean.filter);
    }

    public final String getColumnId() {
        return this.columnId;
    }

    public final String getFilter() {
        return this.filter;
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

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31;
        String str = this.columnId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.value.hashCode()) * 31) + this.type.hashCode()) * 31;
        Integer num = this.pageSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageNum;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.filter;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setColumnId(String str) {
        this.columnId = str;
    }

    public final void setFilter(String str) {
        this.filter = str;
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

    public final void setValue(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        return "SearchByNameBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", value=" + this.value + ", type=" + this.type + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", filter=" + this.filter + ')';
    }
}
