package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class BindPhoneBean {
    private String areaCode;
    private String phone;
    private String pwd;
    private String userId;
    private String userToken;
    private String verificationCode;

    public BindPhoneBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "userToken");
        this.phone = str;
        this.areaCode = str2;
        this.verificationCode = str3;
        this.pwd = str4;
        this.userId = str5;
        this.userToken = str6;
    }

    public static /* synthetic */ BindPhoneBean copy$default(BindPhoneBean bindPhoneBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bindPhoneBean.phone;
        }
        if ((i10 & 2) != 0) {
            str2 = bindPhoneBean.areaCode;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = bindPhoneBean.verificationCode;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = bindPhoneBean.pwd;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = bindPhoneBean.userId;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = bindPhoneBean.userToken;
        }
        return bindPhoneBean.copy(str, str7, str8, str9, str10, str6);
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
        return this.pwd;
    }

    public final String component5() {
        return this.userId;
    }

    public final String component6() {
        return this.userToken;
    }

    public final BindPhoneBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "userToken");
        return new BindPhoneBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindPhoneBean)) {
            return false;
        }
        BindPhoneBean bindPhoneBean = (BindPhoneBean) obj;
        return AbstractC5868k.m23669a(this.phone, bindPhoneBean.phone) && AbstractC5868k.m23669a(this.areaCode, bindPhoneBean.areaCode) && AbstractC5868k.m23669a(this.verificationCode, bindPhoneBean.verificationCode) && AbstractC5868k.m23669a(this.pwd, bindPhoneBean.pwd) && AbstractC5868k.m23669a(this.userId, bindPhoneBean.userId) && AbstractC5868k.m23669a(this.userToken, bindPhoneBean.userToken);
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPwd() {
        return this.pwd;
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
        int hashCode = ((((this.phone.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.verificationCode.hashCode()) * 31;
        String str = this.pwd;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31) + this.userToken.hashCode();
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
    }

    public final void setPhone(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.phone = str;
    }

    public final void setPwd(String str) {
        this.pwd = str;
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
        return "BindPhoneBean(phone=" + this.phone + ", areaCode=" + this.areaCode + ", verificationCode=" + this.verificationCode + ", pwd=" + this.pwd + ", userId=" + this.userId + ", userToken=" + this.userToken + ')';
    }
}
