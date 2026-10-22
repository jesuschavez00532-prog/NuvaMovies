package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SendEmailVerifyCodeBean {
    private String email;
    private String type;
    private String userId;
    private String userToken;

    public SendEmailVerifyCodeBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "userToken");
        AbstractC5868k.m23674f(str4, "userId");
        this.email = str;
        this.type = str2;
        this.userToken = str3;
        this.userId = str4;
    }

    public static /* synthetic */ SendEmailVerifyCodeBean copy$default(SendEmailVerifyCodeBean sendEmailVerifyCodeBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sendEmailVerifyCodeBean.email;
        }
        if ((i10 & 2) != 0) {
            str2 = sendEmailVerifyCodeBean.type;
        }
        if ((i10 & 4) != 0) {
            str3 = sendEmailVerifyCodeBean.userToken;
        }
        if ((i10 & 8) != 0) {
            str4 = sendEmailVerifyCodeBean.userId;
        }
        return sendEmailVerifyCodeBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.userToken;
    }

    public final String component4() {
        return this.userId;
    }

    public final SendEmailVerifyCodeBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "userToken");
        AbstractC5868k.m23674f(str4, "userId");
        return new SendEmailVerifyCodeBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailVerifyCodeBean)) {
            return false;
        }
        SendEmailVerifyCodeBean sendEmailVerifyCodeBean = (SendEmailVerifyCodeBean) obj;
        return AbstractC5868k.m23669a(this.email, sendEmailVerifyCodeBean.email) && AbstractC5868k.m23669a(this.type, sendEmailVerifyCodeBean.type) && AbstractC5868k.m23669a(this.userToken, sendEmailVerifyCodeBean.userToken) && AbstractC5868k.m23669a(this.userId, sendEmailVerifyCodeBean.userId);
    }

    public final String getEmail() {
        return this.email;
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
        return (((((this.email.hashCode() * 31) + this.type.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.email = str;
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
        return "SendEmailVerifyCodeBean(email=" + this.email + ", type=" + this.type + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
