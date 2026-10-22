package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetColumnRecommendBean implements Serializable {
    private int columnId;
    private String columnType;
    private String portalCode;
    private String userId;
    private String userToken;

    public GetColumnRecommendBean(String str, String str2, String str3, int i10, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "columnType");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = i10;
        this.columnType = str4;
    }

    public static /* synthetic */ GetColumnRecommendBean copy$default(GetColumnRecommendBean getColumnRecommendBean, String str, String str2, String str3, int i10, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getColumnRecommendBean.userToken;
        }
        if ((i11 & 2) != 0) {
            str2 = getColumnRecommendBean.userId;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = getColumnRecommendBean.portalCode;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            i10 = getColumnRecommendBean.columnId;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str4 = getColumnRecommendBean.columnType;
        }
        return getColumnRecommendBean.copy(str, str5, str6, i12, str4);
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

    public final GetColumnRecommendBean copy(String str, String str2, String str3, int i10, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "columnType");
        return new GetColumnRecommendBean(str, str2, str3, i10, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetColumnRecommendBean)) {
            return false;
        }
        GetColumnRecommendBean getColumnRecommendBean = (GetColumnRecommendBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getColumnRecommendBean.userToken) && AbstractC5868k.m23669a(this.userId, getColumnRecommendBean.userId) && AbstractC5868k.m23669a(this.portalCode, getColumnRecommendBean.portalCode) && this.columnId == getColumnRecommendBean.columnId && AbstractC5868k.m23669a(this.columnType, getColumnRecommendBean.columnType);
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getColumnType() {
        return this.columnType;
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
        return (((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.columnId) * 31) + this.columnType.hashCode();
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setColumnType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.columnType = str;
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
        return "GetColumnRecommendBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", columnType=" + this.columnType + ')';
    }
}
