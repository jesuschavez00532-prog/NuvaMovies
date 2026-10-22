package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PasswordSetBean {
    private String password;
    private String userId;
    private String userToken;

    public PasswordSetBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        this.userToken = str;
        this.userId = str2;
        this.password = str3;
    }

    public static /* synthetic */ PasswordSetBean copy$default(PasswordSetBean passwordSetBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = passwordSetBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = passwordSetBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = passwordSetBean.password;
        }
        return passwordSetBean.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.password;
    }

    public final PasswordSetBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        return new PasswordSetBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordSetBean)) {
            return false;
        }
        PasswordSetBean passwordSetBean = (PasswordSetBean) obj;
        return AbstractC5868k.m23669a(this.userToken, passwordSetBean.userToken) && AbstractC5868k.m23669a(this.userId, passwordSetBean.userId) && AbstractC5868k.m23669a(this.password, passwordSetBean.password);
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.password.hashCode();
    }

    public final void setPassword(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.password = str;
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
        return "PasswordSetBean(userToken=" + this.userToken + ", userId=" + this.userId + ", password=" + this.password + ')';
    }
}
