package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class EmailResetPwdBean {
    private String email;
    private String password;
    private String type;
    private String userId;
    private String userToken;
    private String verifyCode;

    public EmailResetPwdBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "verifyCode");
        AbstractC5868k.m23674f(str5, "userToken");
        AbstractC5868k.m23674f(str6, "userId");
        this.type = str;
        this.email = str2;
        this.password = str3;
        this.verifyCode = str4;
        this.userToken = str5;
        this.userId = str6;
    }

    public static /* synthetic */ EmailResetPwdBean copy$default(EmailResetPwdBean emailResetPwdBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailResetPwdBean.type;
        }
        if ((i10 & 2) != 0) {
            str2 = emailResetPwdBean.email;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = emailResetPwdBean.password;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = emailResetPwdBean.verifyCode;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = emailResetPwdBean.userToken;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = emailResetPwdBean.userId;
        }
        return emailResetPwdBean.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.verifyCode;
    }

    public final String component5() {
        return this.userToken;
    }

    public final String component6() {
        return this.userId;
    }

    public final EmailResetPwdBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "verifyCode");
        AbstractC5868k.m23674f(str5, "userToken");
        AbstractC5868k.m23674f(str6, "userId");
        return new EmailResetPwdBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailResetPwdBean)) {
            return false;
        }
        EmailResetPwdBean emailResetPwdBean = (EmailResetPwdBean) obj;
        return AbstractC5868k.m23669a(this.type, emailResetPwdBean.type) && AbstractC5868k.m23669a(this.email, emailResetPwdBean.email) && AbstractC5868k.m23669a(this.password, emailResetPwdBean.password) && AbstractC5868k.m23669a(this.verifyCode, emailResetPwdBean.verifyCode) && AbstractC5868k.m23669a(this.userToken, emailResetPwdBean.userToken) && AbstractC5868k.m23669a(this.userId, emailResetPwdBean.userId);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
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

    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.verifyCode.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.email = str;
    }

    public final void setPassword(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.password = str;
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

    public final void setVerifyCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verifyCode = str;
    }

    public String toString() {
        return "EmailResetPwdBean(type=" + this.type + ", email=" + this.email + ", password=" + this.password + ", verifyCode=" + this.verifyCode + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
