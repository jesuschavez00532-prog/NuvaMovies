package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AllowQRLoginBean {
    private String isAllow;
    private String qrtoken;
    private String type;
    private String userId;
    private String userToken;

    public AllowQRLoginBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "qrtoken");
        AbstractC5868k.m23674f(str5, "isAllow");
        this.type = str;
        this.userToken = str2;
        this.userId = str3;
        this.qrtoken = str4;
        this.isAllow = str5;
    }

    public static /* synthetic */ AllowQRLoginBean copy$default(AllowQRLoginBean allowQRLoginBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = allowQRLoginBean.type;
        }
        if ((i10 & 2) != 0) {
            str2 = allowQRLoginBean.userToken;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = allowQRLoginBean.userId;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = allowQRLoginBean.qrtoken;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = allowQRLoginBean.isAllow;
        }
        return allowQRLoginBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.qrtoken;
    }

    public final String component5() {
        return this.isAllow;
    }

    public final AllowQRLoginBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "qrtoken");
        AbstractC5868k.m23674f(str5, "isAllow");
        return new AllowQRLoginBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowQRLoginBean)) {
            return false;
        }
        AllowQRLoginBean allowQRLoginBean = (AllowQRLoginBean) obj;
        return AbstractC5868k.m23669a(this.type, allowQRLoginBean.type) && AbstractC5868k.m23669a(this.userToken, allowQRLoginBean.userToken) && AbstractC5868k.m23669a(this.userId, allowQRLoginBean.userId) && AbstractC5868k.m23669a(this.qrtoken, allowQRLoginBean.qrtoken) && AbstractC5868k.m23669a(this.isAllow, allowQRLoginBean.isAllow);
    }

    public final String getQrtoken() {
        return this.qrtoken;
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
        return (((((((this.type.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.qrtoken.hashCode()) * 31) + this.isAllow.hashCode();
    }

    public final String isAllow() {
        return this.isAllow;
    }

    public final void setAllow(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.isAllow = str;
    }

    public final void setQrtoken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.qrtoken = str;
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
        return "AllowQRLoginBean(type=" + this.type + ", userToken=" + this.userToken + ", userId=" + this.userId + ", qrtoken=" + this.qrtoken + ", isAllow=" + this.isAllow + ')';
    }
}
