package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class FilterGenreBean implements Serializable {
    private String language;
    private String portalCode;
    private String userId;
    private String userToken;

    public FilterGenreBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.language = str4;
    }

    public static /* synthetic */ FilterGenreBean copy$default(FilterGenreBean filterGenreBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterGenreBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = filterGenreBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = filterGenreBean.portalCode;
        }
        if ((i10 & 8) != 0) {
            str4 = filterGenreBean.language;
        }
        return filterGenreBean.copy(str, str2, str3, str4);
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
        return this.language;
    }

    public final FilterGenreBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return new FilterGenreBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGenreBean)) {
            return false;
        }
        FilterGenreBean filterGenreBean = (FilterGenreBean) obj;
        return AbstractC5868k.m23669a(this.userToken, filterGenreBean.userToken) && AbstractC5868k.m23669a(this.userId, filterGenreBean.userId) && AbstractC5868k.m23669a(this.portalCode, filterGenreBean.portalCode) && AbstractC5868k.m23669a(this.language, filterGenreBean.language);
    }

    public final String getLanguage() {
        return this.language;
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
        int hashCode = ((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31;
        String str = this.language;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setLanguage(String str) {
        this.language = str;
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
        return "FilterGenreBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", language=" + this.language + ')';
    }
}
