package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetFavoritesBean implements Serializable {
    private String blFlag;
    private String queryType;
    private String userId;
    private String userToken;

    public GetFavoritesBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "queryType");
        AbstractC5868k.m23674f(str4, "blFlag");
        this.userToken = str;
        this.userId = str2;
        this.queryType = str3;
        this.blFlag = str4;
    }

    public static /* synthetic */ GetFavoritesBean copy$default(GetFavoritesBean getFavoritesBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getFavoritesBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getFavoritesBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = getFavoritesBean.queryType;
        }
        if ((i10 & 8) != 0) {
            str4 = getFavoritesBean.blFlag;
        }
        return getFavoritesBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.queryType;
    }

    public final String component4() {
        return this.blFlag;
    }

    public final GetFavoritesBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "queryType");
        AbstractC5868k.m23674f(str4, "blFlag");
        return new GetFavoritesBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFavoritesBean)) {
            return false;
        }
        GetFavoritesBean getFavoritesBean = (GetFavoritesBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getFavoritesBean.userToken) && AbstractC5868k.m23669a(this.userId, getFavoritesBean.userId) && AbstractC5868k.m23669a(this.queryType, getFavoritesBean.queryType) && AbstractC5868k.m23669a(this.blFlag, getFavoritesBean.blFlag);
    }

    public final String getBlFlag() {
        return this.blFlag;
    }

    public final String getQueryType() {
        return this.queryType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.queryType.hashCode()) * 31) + this.blFlag.hashCode();
    }

    public final void setBlFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.blFlag = str;
    }

    public final void setQueryType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.queryType = str;
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
        return "GetFavoritesBean(userToken=" + this.userToken + ", userId=" + this.userId + ", queryType=" + this.queryType + ", blFlag=" + this.blFlag + ')';
    }
}
