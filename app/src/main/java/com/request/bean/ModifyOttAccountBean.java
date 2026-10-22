package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ModifyOttAccountBean implements Serializable {
    private String email;
    private String mobile;
    private String newPassword;
    private String password;
    private String tel;
    private String userId;
    private String userToken;

    public ModifyOttAccountBean(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        this.userToken = str;
        this.userId = str2;
        this.password = str3;
        this.newPassword = str4;
        this.email = str5;
        this.mobile = str6;
        this.tel = str7;
    }

    public static /* synthetic */ ModifyOttAccountBean copy$default(ModifyOttAccountBean modifyOttAccountBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = modifyOttAccountBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = modifyOttAccountBean.userId;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = modifyOttAccountBean.password;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = modifyOttAccountBean.newPassword;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = modifyOttAccountBean.email;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = modifyOttAccountBean.mobile;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = modifyOttAccountBean.tel;
        }
        return modifyOttAccountBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.newPassword;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.mobile;
    }

    public final String component7() {
        return this.tel;
    }

    public final ModifyOttAccountBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return new ModifyOttAccountBean(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifyOttAccountBean)) {
            return false;
        }
        ModifyOttAccountBean modifyOttAccountBean = (ModifyOttAccountBean) obj;
        return AbstractC5868k.m23669a(this.userToken, modifyOttAccountBean.userToken) && AbstractC5868k.m23669a(this.userId, modifyOttAccountBean.userId) && AbstractC5868k.m23669a(this.password, modifyOttAccountBean.password) && AbstractC5868k.m23669a(this.newPassword, modifyOttAccountBean.newPassword) && AbstractC5868k.m23669a(this.email, modifyOttAccountBean.email) && AbstractC5868k.m23669a(this.mobile, modifyOttAccountBean.mobile) && AbstractC5868k.m23669a(this.tel, modifyOttAccountBean.tel);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getTel() {
        return this.tel;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int hashCode = ((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31;
        String str = this.password;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newPassword;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mobile;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tel;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setNewPassword(String str) {
        this.newPassword = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setTel(String str) {
        this.tel = str;
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
        return "ModifyOttAccountBean(userToken=" + this.userToken + ", userId=" + this.userId + ", password=" + this.password + ", newPassword=" + this.newPassword + ", email=" + this.email + ", mobile=" + this.mobile + ", tel=" + this.tel + ')';
    }
}
