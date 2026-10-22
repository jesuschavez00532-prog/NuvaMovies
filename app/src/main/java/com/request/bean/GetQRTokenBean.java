package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetQRTokenBean {
    private String type;
    private String userId;
    private String userToken;

    public GetQRTokenBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        this.type = str;
        this.userToken = str2;
        this.userId = str3;
    }

    public static /* synthetic */ GetQRTokenBean copy$default(GetQRTokenBean getQRTokenBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getQRTokenBean.type;
        }
        if ((i10 & 2) != 0) {
            str2 = getQRTokenBean.userToken;
        }
        if ((i10 & 4) != 0) {
            str3 = getQRTokenBean.userId;
        }
        return getQRTokenBean.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.userId;
    }

    public final GetQRTokenBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        return new GetQRTokenBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetQRTokenBean)) {
            return false;
        }
        GetQRTokenBean getQRTokenBean = (GetQRTokenBean) obj;
        return AbstractC5868k.m23669a(this.type, getQRTokenBean.type) && AbstractC5868k.m23669a(this.userToken, getQRTokenBean.userToken) && AbstractC5868k.m23669a(this.userId, getQRTokenBean.userId);
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
        return (((this.type.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
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
        return "GetQRTokenBean(type=" + this.type + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
