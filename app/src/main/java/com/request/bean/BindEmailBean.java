package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class BindEmailBean {
    private String email;
    private String pwd;
    private String type;
    private String userId;
    private String userToken;

    public BindEmailBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "pwd");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        this.email = str;
        this.type = str2;
        this.pwd = str3;
        this.userToken = str4;
        this.userId = str5;
    }

    public static /* synthetic */ BindEmailBean copy$default(BindEmailBean bindEmailBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bindEmailBean.email;
        }
        if ((i10 & 2) != 0) {
            str2 = bindEmailBean.type;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = bindEmailBean.pwd;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = bindEmailBean.userToken;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = bindEmailBean.userId;
        }
        return bindEmailBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.pwd;
    }

    public final String component4() {
        return this.userToken;
    }

    public final String component5() {
        return this.userId;
    }

    public final BindEmailBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "pwd");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return new BindEmailBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindEmailBean)) {
            return false;
        }
        BindEmailBean bindEmailBean = (BindEmailBean) obj;
        return AbstractC5868k.m23669a(this.email, bindEmailBean.email) && AbstractC5868k.m23669a(this.type, bindEmailBean.type) && AbstractC5868k.m23669a(this.pwd, bindEmailBean.pwd) && AbstractC5868k.m23669a(this.userToken, bindEmailBean.userToken) && AbstractC5868k.m23669a(this.userId, bindEmailBean.userId);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPwd() {
        return this.pwd;
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
        return (((((((this.email.hashCode() * 31) + this.type.hashCode()) * 31) + this.pwd.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.email = str;
    }

    public final void setPwd(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pwd = str;
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
        return "BindEmailBean(email=" + this.email + ", type=" + this.type + ", pwd=" + this.pwd + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
