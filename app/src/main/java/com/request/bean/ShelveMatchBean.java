package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ShelveMatchBean {
    private String portalCode;
    private String userId;
    private String userToken;

    public ShelveMatchBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
    }

    public static /* synthetic */ ShelveMatchBean copy$default(ShelveMatchBean shelveMatchBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shelveMatchBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = shelveMatchBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = shelveMatchBean.portalCode;
        }
        return shelveMatchBean.copy(str, str2, str3);
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

    public final ShelveMatchBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return new ShelveMatchBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShelveMatchBean)) {
            return false;
        }
        ShelveMatchBean shelveMatchBean = (ShelveMatchBean) obj;
        return AbstractC5868k.m23669a(this.userToken, shelveMatchBean.userToken) && AbstractC5868k.m23669a(this.userId, shelveMatchBean.userId) && AbstractC5868k.m23669a(this.portalCode, shelveMatchBean.portalCode);
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
        return "ShelveMatchBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ')';
    }
}
