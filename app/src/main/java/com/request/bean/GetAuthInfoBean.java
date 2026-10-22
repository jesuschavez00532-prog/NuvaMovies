package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetAuthInfoBean implements Serializable {
    private String lang;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;

    public GetAuthInfoBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "portalCode");
        AbstractC5868k.m23674f(str5, "lang");
        this.userToken = str;
        this.userId = str2;
        this.type = str3;
        this.portalCode = str4;
        this.lang = str5;
    }

    public static /* synthetic */ GetAuthInfoBean copy$default(GetAuthInfoBean getAuthInfoBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAuthInfoBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getAuthInfoBean.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = getAuthInfoBean.type;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = getAuthInfoBean.portalCode;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = getAuthInfoBean.lang;
        }
        return getAuthInfoBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.portalCode;
    }

    public final String component5() {
        return this.lang;
    }

    public final GetAuthInfoBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "portalCode");
        AbstractC5868k.m23674f(str5, "lang");
        return new GetAuthInfoBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthInfoBean)) {
            return false;
        }
        GetAuthInfoBean getAuthInfoBean = (GetAuthInfoBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getAuthInfoBean.userToken) && AbstractC5868k.m23669a(this.userId, getAuthInfoBean.userId) && AbstractC5868k.m23669a(this.type, getAuthInfoBean.type) && AbstractC5868k.m23669a(this.portalCode, getAuthInfoBean.portalCode) && AbstractC5868k.m23669a(this.lang, getAuthInfoBean.lang);
    }

    public final String getLang() {
        return this.lang;
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

    public int hashCode() {
        return (((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.lang.hashCode();
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
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

    public String toString() {
        return "GetAuthInfoBean(userToken=" + this.userToken + ", userId=" + this.userId + ", type=" + this.type + ", portalCode=" + this.portalCode + ", lang=" + this.lang + ')';
    }
}
