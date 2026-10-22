package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ExchangeBean implements Serializable {
    private String exchangeCode;
    private String portalCode;
    private String userId;
    private String userToken;

    public ExchangeBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "exchangeCode");
        AbstractC5868k.m23674f(str4, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.exchangeCode = str3;
        this.portalCode = str4;
    }

    public static /* synthetic */ ExchangeBean copy$default(ExchangeBean exchangeBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exchangeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = exchangeBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = exchangeBean.exchangeCode;
        }
        if ((i10 & 8) != 0) {
            str4 = exchangeBean.portalCode;
        }
        return exchangeBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.exchangeCode;
    }

    public final String component4() {
        return this.portalCode;
    }

    public final ExchangeBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "exchangeCode");
        AbstractC5868k.m23674f(str4, "portalCode");
        return new ExchangeBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeBean)) {
            return false;
        }
        ExchangeBean exchangeBean = (ExchangeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, exchangeBean.userToken) && AbstractC5868k.m23669a(this.userId, exchangeBean.userId) && AbstractC5868k.m23669a(this.exchangeCode, exchangeBean.exchangeCode) && AbstractC5868k.m23669a(this.portalCode, exchangeBean.portalCode);
    }

    public final String getExchangeCode() {
        return this.exchangeCode;
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
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.exchangeCode.hashCode()) * 31) + this.portalCode.hashCode();
    }

    public final void setExchangeCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.exchangeCode = str;
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
        return "ExchangeBean(userToken=" + this.userToken + ", userId=" + this.userId + ", exchangeCode=" + this.exchangeCode + ", portalCode=" + this.portalCode + ')';
    }
}
