package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class FreeTimeBean {
    private String portalCode;
    private String userId;
    private String userToken;

    public FreeTimeBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
    }

    public static /* synthetic */ FreeTimeBean copy$default(FreeTimeBean freeTimeBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = freeTimeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = freeTimeBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = freeTimeBean.portalCode;
        }
        return freeTimeBean.copy(str, str2, str3);
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

    public final FreeTimeBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return new FreeTimeBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTimeBean)) {
            return false;
        }
        FreeTimeBean freeTimeBean = (FreeTimeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, freeTimeBean.userToken) && AbstractC5868k.m23669a(this.userId, freeTimeBean.userId) && AbstractC5868k.m23669a(this.portalCode, freeTimeBean.portalCode);
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
        return (((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode();
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
        return "FreeTimeBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ')';
    }
}
