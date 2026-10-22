package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class CheckVerifiCodeBean {
    private String areaCode;
    private String password;
    private String phone;
    private String type;
    private String userId;
    private String userToken;
    private String verificationCode;

    public CheckVerifiCodeBean(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "type");
        this.phone = str;
        this.areaCode = str2;
        this.verificationCode = str3;
        this.type = str4;
        this.userId = str5;
        this.userToken = str6;
        this.password = str7;
    }

    public static /* synthetic */ CheckVerifiCodeBean copy$default(CheckVerifiCodeBean checkVerifiCodeBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkVerifiCodeBean.phone;
        }
        if ((i10 & 2) != 0) {
            str2 = checkVerifiCodeBean.areaCode;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = checkVerifiCodeBean.verificationCode;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = checkVerifiCodeBean.type;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = checkVerifiCodeBean.userId;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = checkVerifiCodeBean.userToken;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = checkVerifiCodeBean.password;
        }
        return checkVerifiCodeBean.copy(str, str8, str9, str10, str11, str12, str7);
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
        return this.type;
    }

    public final String component5() {
        return this.userId;
    }

    public final String component6() {
        return this.userToken;
    }

    public final String component7() {
        return this.password;
    }

    public final CheckVerifiCodeBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "type");
        return new CheckVerifiCodeBean(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckVerifiCodeBean)) {
            return false;
        }
        CheckVerifiCodeBean checkVerifiCodeBean = (CheckVerifiCodeBean) obj;
        return AbstractC5868k.m23669a(this.phone, checkVerifiCodeBean.phone) && AbstractC5868k.m23669a(this.areaCode, checkVerifiCodeBean.areaCode) && AbstractC5868k.m23669a(this.verificationCode, checkVerifiCodeBean.verificationCode) && AbstractC5868k.m23669a(this.type, checkVerifiCodeBean.type) && AbstractC5868k.m23669a(this.userId, checkVerifiCodeBean.userId) && AbstractC5868k.m23669a(this.userToken, checkVerifiCodeBean.userToken) && AbstractC5868k.m23669a(this.password, checkVerifiCodeBean.password);
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
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

    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public int hashCode() {
        int hashCode = ((((((this.phone.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.verificationCode.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.phone = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public final void setVerificationCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verificationCode = str;
    }

    public String toString() {
        return "CheckVerifiCodeBean(phone=" + this.phone + ", areaCode=" + this.areaCode + ", verificationCode=" + this.verificationCode + ", type=" + this.type + ", userId=" + this.userId + ", userToken=" + this.userToken + ", password=" + this.password + ')';
    }
}
