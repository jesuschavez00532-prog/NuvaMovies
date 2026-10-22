package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class LiveSearchBean {
    private int pageNum;
    private int pageSize;
    private String portalCode;
    private String userId;
    private String userToken;
    private String value;

    public LiveSearchBean(String str, String str2, String str3, String str4, int i10, int i11) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "value");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.value = str4;
        this.pageSize = i10;
        this.pageNum = i11;
    }

    public static /* synthetic */ LiveSearchBean copy$default(LiveSearchBean liveSearchBean, String str, String str2, String str3, String str4, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = liveSearchBean.userToken;
        }
        if ((i12 & 2) != 0) {
            str2 = liveSearchBean.userId;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = liveSearchBean.portalCode;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = liveSearchBean.value;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            i10 = liveSearchBean.pageSize;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = liveSearchBean.pageNum;
        }
        return liveSearchBean.copy(str, str5, str6, str7, i13, i11);
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

    public final int component5() {
        return this.pageSize;
    }

    public final int component6() {
        return this.pageNum;
    }

    public final LiveSearchBean copy(String str, String str2, String str3, String str4, int i10, int i11) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "value");
        return new LiveSearchBean(str, str2, str3, str4, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveSearchBean)) {
            return false;
        }
        LiveSearchBean liveSearchBean = (LiveSearchBean) obj;
        return AbstractC5868k.m23669a(this.userToken, liveSearchBean.userToken) && AbstractC5868k.m23669a(this.userId, liveSearchBean.userId) && AbstractC5868k.m23669a(this.portalCode, liveSearchBean.portalCode) && AbstractC5868k.m23669a(this.value, liveSearchBean.value) && this.pageSize == liveSearchBean.pageSize && this.pageNum == liveSearchBean.pageNum;
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

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.value.hashCode()) * 31) + this.pageSize) * 31) + this.pageNum;
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

    public final void setValue(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        return "LiveSearchBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", value=" + this.value + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ')';
    }
}
