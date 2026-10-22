package com.request.bean;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AutoLoginBean {
    private String accountType;
    private String areaCode;
    private String password;
    private String userId;
    private String username;
    private String verificationCode;
    private String verificationToken;

    public AutoLoginBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AutoLoginBean copy$default(AutoLoginBean autoLoginBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = autoLoginBean.accountType;
        }
        if ((i10 & 2) != 0) {
            str2 = autoLoginBean.username;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = autoLoginBean.password;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = autoLoginBean.areaCode;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = autoLoginBean.verificationToken;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = autoLoginBean.verificationCode;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = autoLoginBean.userId;
        }
        return autoLoginBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.accountType;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.areaCode;
    }

    public final String component5() {
        return this.verificationToken;
    }

    public final String component6() {
        return this.verificationCode;
    }

    public final String component7() {
        return this.userId;
    }

    public final AutoLoginBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "username");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "areaCode");
        AbstractC5868k.m23674f(str5, "verificationToken");
        AbstractC5868k.m23674f(str6, "verificationCode");
        AbstractC5868k.m23674f(str7, "userId");
        return new AutoLoginBean(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoLoginBean)) {
            return false;
        }
        AutoLoginBean autoLoginBean = (AutoLoginBean) obj;
        return AbstractC5868k.m23669a(this.accountType, autoLoginBean.accountType) && AbstractC5868k.m23669a(this.username, autoLoginBean.username) && AbstractC5868k.m23669a(this.password, autoLoginBean.password) && AbstractC5868k.m23669a(this.areaCode, autoLoginBean.areaCode) && AbstractC5868k.m23669a(this.verificationToken, autoLoginBean.verificationToken) && AbstractC5868k.m23669a(this.verificationCode, autoLoginBean.verificationCode) && AbstractC5868k.m23669a(this.userId, autoLoginBean.userId);
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        return (((((((((((this.accountType.hashCode() * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31) + this.areaCode.hashCode()) * 31) + this.verificationToken.hashCode()) * 31) + this.verificationCode.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setAccountType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.accountType = str;
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
    }

    public final void setPassword(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.password = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUsername(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.username = str;
    }

    public final void setVerificationCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verificationCode = str;
    }

    public final void setVerificationToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verificationToken = str;
    }

    public String toString() {
        return "AutoLoginBean(accountType=" + this.accountType + ", username=" + this.username + ", password=" + this.password + ", areaCode=" + this.areaCode + ", verificationToken=" + this.verificationToken + ", verificationCode=" + this.verificationCode + ", userId=" + this.userId + ')';
    }

    public AutoLoginBean(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "username");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "areaCode");
        AbstractC5868k.m23674f(str5, "verificationToken");
        AbstractC5868k.m23674f(str6, "verificationCode");
        AbstractC5868k.m23674f(str7, "userId");
        this.accountType = str;
        this.username = str2;
        this.password = str3;
        this.areaCode = str4;
        this.verificationToken = str5;
        this.verificationCode = str6;
        this.userId = str7;
    }

    public /* synthetic */ AutoLoginBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7);
    }
}
