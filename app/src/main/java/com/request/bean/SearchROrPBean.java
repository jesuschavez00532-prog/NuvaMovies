package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SearchROrPBean {
    private Integer pageNum;
    private Integer pageSize;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;
    private String value;

    public SearchROrPBean(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "value");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.value = str4;
        this.type = str5;
        this.pageNum = num;
        this.pageSize = num2;
    }

    public static /* synthetic */ SearchROrPBean copy$default(SearchROrPBean searchROrPBean, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchROrPBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = searchROrPBean.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = searchROrPBean.portalCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = searchROrPBean.value;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = searchROrPBean.type;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            num = searchROrPBean.pageNum;
        }
        Integer num3 = num;
        if ((i10 & 64) != 0) {
            num2 = searchROrPBean.pageSize;
        }
        return searchROrPBean.copy(str, str6, str7, str8, str9, num3, num2);
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
        return this.value;
    }

    public final String component5() {
        return this.type;
    }

    public final Integer component6() {
        return this.pageNum;
    }

    public final Integer component7() {
        return this.pageSize;
    }

    public final SearchROrPBean copy(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "value");
        return new SearchROrPBean(str, str2, str3, str4, str5, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchROrPBean)) {
            return false;
        }
        SearchROrPBean searchROrPBean = (SearchROrPBean) obj;
        return AbstractC5868k.m23669a(this.userToken, searchROrPBean.userToken) && AbstractC5868k.m23669a(this.userId, searchROrPBean.userId) && AbstractC5868k.m23669a(this.portalCode, searchROrPBean.portalCode) && AbstractC5868k.m23669a(this.value, searchROrPBean.value) && AbstractC5868k.m23669a(this.type, searchROrPBean.type) && AbstractC5868k.m23669a(this.pageNum, searchROrPBean.pageNum) && AbstractC5868k.m23669a(this.pageSize, searchROrPBean.pageSize);
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
        int hashCode = ((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.value.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pageNum;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageSize;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
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
        return "SearchROrPBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", value=" + this.value + ", type=" + this.type + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ')';
    }
}
