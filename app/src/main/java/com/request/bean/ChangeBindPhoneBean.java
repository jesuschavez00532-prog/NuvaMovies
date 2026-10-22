package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ChangeBindPhoneBean {
    private String areaCode;
    private String loginType;
    private String phone;
    private String userId;
    private String userToken;
    private String verificationCode;

    public ChangeBindPhoneBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "loginType");
        this.phone = str;
        this.areaCode = str2;
        this.verificationCode = str3;
        this.userToken = str4;
        this.userId = str5;
        this.loginType = str6;
    }

    public static /* synthetic */ ChangeBindPhoneBean copy$default(ChangeBindPhoneBean changeBindPhoneBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changeBindPhoneBean.phone;
        }
        if ((i10 & 2) != 0) {
            str2 = changeBindPhoneBean.areaCode;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = changeBindPhoneBean.verificationCode;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = changeBindPhoneBean.userToken;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = changeBindPhoneBean.userId;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = changeBindPhoneBean.loginType;
        }
        return changeBindPhoneBean.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.areaCode;
    }

    public final String component3() {
        return this.verificationCode;
    }

    public final String component4() {
        return this.userToken;
    }

    public final String component5() {
        return this.userId;
    }

    public final String component6() {
        return this.loginType;
    }

    public final ChangeBindPhoneBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "loginType");
        return new ChangeBindPhoneBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeBindPhoneBean)) {
            return false;
        }
        ChangeBindPhoneBean changeBindPhoneBean = (ChangeBindPhoneBean) obj;
        return AbstractC5868k.m23669a(this.phone, changeBindPhoneBean.phone) && AbstractC5868k.m23669a(this.areaCode, changeBindPhoneBean.areaCode) && AbstractC5868k.m23669a(this.verificationCode, changeBindPhoneBean.verificationCode) && AbstractC5868k.m23669a(this.userToken, changeBindPhoneBean.userToken) && AbstractC5868k.m23669a(this.userId, changeBindPhoneBean.userId) && AbstractC5868k.m23669a(this.loginType, changeBindPhoneBean.loginType);
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public int hashCode() {
        return (((((((((this.phone.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.verificationCode.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.loginType.hashCode();
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
    }

    public final void setLoginType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.loginType = str;
    }

    public final void setPhone(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.phone = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public final void setVerificationCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verificationCode = str;
    }

    public String toString() {
        return "ChangeBindPhoneBean(phone=" + this.phone + ", areaCode=" + this.areaCode + ", verificationCode=" + this.verificationCode + ", userToken=" + this.userToken + ", userId=" + this.userId + ", loginType=" + this.loginType + ')';
    }
}
