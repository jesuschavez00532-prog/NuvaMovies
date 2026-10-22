package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetVerifiCodeBean {
    private String areaCode;
    private String phone;
    private String type;
    private String userId;
    private String userToken;

    public GetVerifiCodeBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        this.phone = str;
        this.areaCode = str2;
        this.type = str3;
        this.userToken = str4;
        this.userId = str5;
    }

    public static /* synthetic */ GetVerifiCodeBean copy$default(GetVerifiCodeBean getVerifiCodeBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getVerifiCodeBean.phone;
        }
        if ((i10 & 2) != 0) {
            str2 = getVerifiCodeBean.areaCode;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = getVerifiCodeBean.type;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = getVerifiCodeBean.userToken;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = getVerifiCodeBean.userId;
        }
        return getVerifiCodeBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.areaCode;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.userToken;
    }

    public final String component5() {
        return this.userId;
    }

    public final GetVerifiCodeBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return new GetVerifiCodeBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetVerifiCodeBean)) {
            return false;
        }
        GetVerifiCodeBean getVerifiCodeBean = (GetVerifiCodeBean) obj;
        return AbstractC5868k.m23669a(this.phone, getVerifiCodeBean.phone) && AbstractC5868k.m23669a(this.areaCode, getVerifiCodeBean.areaCode) && AbstractC5868k.m23669a(this.type, getVerifiCodeBean.type) && AbstractC5868k.m23669a(this.userToken, getVerifiCodeBean.userToken) && AbstractC5868k.m23669a(this.userId, getVerifiCodeBean.userId);
    }

    public final String getAreaCode() {
        return this.areaCode;
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

    public int hashCode() {
        return (((((((this.phone.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
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
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "GetVerifiCodeBean(phone=" + this.phone + ", areaCode=" + this.areaCode + ", type=" + this.type + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
