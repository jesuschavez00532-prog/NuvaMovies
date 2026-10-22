package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetOrderInfoBean {
    private String userId;
    private String userToken;

    public GetOrderInfoBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        this.userToken = str;
        this.userId = str2;
    }

    public static /* synthetic */ GetOrderInfoBean copy$default(GetOrderInfoBean getOrderInfoBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getOrderInfoBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getOrderInfoBean.userId;
        }
        return getOrderInfoBean.copy(str, str2);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final GetOrderInfoBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return new GetOrderInfoBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOrderInfoBean)) {
            return false;
        }
        GetOrderInfoBean getOrderInfoBean = (GetOrderInfoBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getOrderInfoBean.userToken) && AbstractC5868k.m23669a(this.userId, getOrderInfoBean.userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (this.userToken.hashCode() * 31) + this.userId.hashCode();
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
        return "GetOrderInfoBean(userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
