package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PasswordCheckBean {
    private String password;
    private String userId;
    private String userToken;

    public PasswordCheckBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        this.userToken = str;
        this.userId = str2;
        this.password = str3;
    }

    public static /* synthetic */ PasswordCheckBean copy$default(PasswordCheckBean passwordCheckBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = passwordCheckBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = passwordCheckBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = passwordCheckBean.password;
        }
        return passwordCheckBean.copy(str, str2, str3);
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

    public final PasswordCheckBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        return new PasswordCheckBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordCheckBean)) {
            return false;
        }
        PasswordCheckBean passwordCheckBean = (PasswordCheckBean) obj;
        return AbstractC5868k.m23669a(this.userToken, passwordCheckBean.userToken) && AbstractC5868k.m23669a(this.userId, passwordCheckBean.userId) && AbstractC5868k.m23669a(this.password, passwordCheckBean.password);
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
        return "PasswordCheckBean(userToken=" + this.userToken + ", userId=" + this.userId + ", password=" + this.password + ')';
    }
}
