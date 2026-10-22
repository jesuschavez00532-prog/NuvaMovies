package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetHomeBean {
    private String homePageCode;
    private String portalCode;
    private String userId;
    private String userToken;
    private String version;

    public GetHomeBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "homePageCode");
        AbstractC5868k.m23674f(str5, "version");
        this.userId = str;
        this.userToken = str2;
        this.portalCode = str3;
        this.homePageCode = str4;
        this.version = str5;
    }

    public static /* synthetic */ GetHomeBean copy$default(GetHomeBean getHomeBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getHomeBean.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = getHomeBean.userToken;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = getHomeBean.portalCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = getHomeBean.homePageCode;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = getHomeBean.version;
        }
        return getHomeBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.portalCode;
    }

    public final String component4() {
        return this.homePageCode;
    }

    public final String component5() {
        return this.version;
    }

    public final GetHomeBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "homePageCode");
        AbstractC5868k.m23674f(str5, "version");
        return new GetHomeBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHomeBean)) {
            return false;
        }
        GetHomeBean getHomeBean = (GetHomeBean) obj;
        return AbstractC5868k.m23669a(this.userId, getHomeBean.userId) && AbstractC5868k.m23669a(this.userToken, getHomeBean.userToken) && AbstractC5868k.m23669a(this.portalCode, getHomeBean.portalCode) && AbstractC5868k.m23669a(this.homePageCode, getHomeBean.homePageCode) && AbstractC5868k.m23669a(this.version, getHomeBean.version);
    }

    public final String getHomePageCode() {
        return this.homePageCode;
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
        return (((((((this.userId.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.homePageCode.hashCode()) * 31) + this.version.hashCode();
    }

    public final void setHomePageCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.homePageCode = str;
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
        AbstractC5868k.m23674f(str, "<set-?>");
        this.version = str;
    }

    public String toString() {
        return "GetHomeBean(userId=" + this.userId + ", userToken=" + this.userToken + ", portalCode=" + this.portalCode + ", homePageCode=" + this.homePageCode + ", version=" + this.version + ')';
    }
}
