package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class UpdatePwdBean {
    private String newPwd;
    private String password;
    private String userId;
    private String userToken;

    public UpdatePwdBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "newPwd");
        this.userToken = str;
        this.userId = str2;
        this.password = str3;
        this.newPwd = str4;
    }

    public static /* synthetic */ UpdatePwdBean copy$default(UpdatePwdBean updatePwdBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePwdBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = updatePwdBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = updatePwdBean.password;
        }
        if ((i10 & 8) != 0) {
            str4 = updatePwdBean.newPwd;
        }
        return updatePwdBean.copy(str, str2, str3, str4);
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

    public final String component4() {
        return this.newPwd;
    }

    public final UpdatePwdBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "newPwd");
        return new UpdatePwdBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePwdBean)) {
            return false;
        }
        UpdatePwdBean updatePwdBean = (UpdatePwdBean) obj;
        return AbstractC5868k.m23669a(this.userToken, updatePwdBean.userToken) && AbstractC5868k.m23669a(this.userId, updatePwdBean.userId) && AbstractC5868k.m23669a(this.password, updatePwdBean.password) && AbstractC5868k.m23669a(this.newPwd, updatePwdBean.newPwd);
    }

    public final String getNewPwd() {
        return this.newPwd;
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
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.password.hashCode()) * 31) + this.newPwd.hashCode();
    }

    public final void setNewPwd(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.newPwd = str;
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
        return "UpdatePwdBean(userToken=" + this.userToken + ", userId=" + this.userId + ", password=" + this.password + ", newPwd=" + this.newPwd + ')';
    }
}
