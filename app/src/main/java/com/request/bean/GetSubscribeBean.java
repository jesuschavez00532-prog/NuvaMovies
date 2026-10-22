package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetSubscribeBean {
    private String type;
    private String userId;
    private String userToken;

    public GetSubscribeBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        this.userToken = str;
        this.userId = str2;
        this.type = str3;
    }

    public static /* synthetic */ GetSubscribeBean copy$default(GetSubscribeBean getSubscribeBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getSubscribeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getSubscribeBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = getSubscribeBean.type;
        }
        return getSubscribeBean.copy(str, str2, str3);
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

    public final GetSubscribeBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return new GetSubscribeBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSubscribeBean)) {
            return false;
        }
        GetSubscribeBean getSubscribeBean = (GetSubscribeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getSubscribeBean.userToken) && AbstractC5868k.m23669a(this.userId, getSubscribeBean.userId) && AbstractC5868k.m23669a(this.type, getSubscribeBean.type);
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
        int hashCode = ((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31;
        String str = this.type;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setType(String str) {
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
        return "GetSubscribeBean(userToken=" + this.userToken + ", userId=" + this.userId + ", type=" + this.type + ')';
    }
}
