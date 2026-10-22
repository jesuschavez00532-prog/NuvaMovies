package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class VerifyEmailCodeBean {
    private String email;
    private String type;
    private String userId;
    private String userToken;
    private String verifyCode;

    public VerifyEmailCodeBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        this.type = str;
        this.email = str2;
        this.verifyCode = str3;
        this.userToken = str4;
        this.userId = str5;
    }

    public static /* synthetic */ VerifyEmailCodeBean copy$default(VerifyEmailCodeBean verifyEmailCodeBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verifyEmailCodeBean.type;
        }
        if ((i10 & 2) != 0) {
            str2 = verifyEmailCodeBean.email;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = verifyEmailCodeBean.verifyCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = verifyEmailCodeBean.userToken;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = verifyEmailCodeBean.userId;
        }
        return verifyEmailCodeBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.verifyCode;
    }

    public final String component4() {
        return this.userToken;
    }

    public final String component5() {
        return this.userId;
    }

    public final VerifyEmailCodeBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return new VerifyEmailCodeBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailCodeBean)) {
            return false;
        }
        VerifyEmailCodeBean verifyEmailCodeBean = (VerifyEmailCodeBean) obj;
        return AbstractC5868k.m23669a(this.type, verifyEmailCodeBean.type) && AbstractC5868k.m23669a(this.email, verifyEmailCodeBean.email) && AbstractC5868k.m23669a(this.verifyCode, verifyEmailCodeBean.verifyCode) && AbstractC5868k.m23669a(this.userToken, verifyEmailCodeBean.userToken) && AbstractC5868k.m23669a(this.userId, verifyEmailCodeBean.userId);
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

    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.email.hashCode()) * 31) + this.verifyCode.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
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

    public final void setVerifyCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verifyCode = str;
    }

    public String toString() {
        return "VerifyEmailCodeBean(type=" + this.type + ", email=" + this.email + ", verifyCode=" + this.verifyCode + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
