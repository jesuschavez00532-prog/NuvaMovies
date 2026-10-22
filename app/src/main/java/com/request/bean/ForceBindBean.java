package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ForceBindBean {
    private String userId;
    private String userToken;

    public ForceBindBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        this.userId = str;
        this.userToken = str2;
    }

    public static /* synthetic */ ForceBindBean copy$default(ForceBindBean forceBindBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = forceBindBean.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = forceBindBean.userToken;
        }
        return forceBindBean.copy(str, str2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userToken;
    }

    public final ForceBindBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return new ForceBindBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceBindBean)) {
            return false;
        }
        ForceBindBean forceBindBean = (ForceBindBean) obj;
        return AbstractC5868k.m23669a(this.userId, forceBindBean.userId) && AbstractC5868k.m23669a(this.userToken, forceBindBean.userToken);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.userToken.hashCode();
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
        return "ForceBindBean(userId=" + this.userId + ", userToken=" + this.userToken + ')';
    }
}
