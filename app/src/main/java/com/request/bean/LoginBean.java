package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class LoginBean implements Serializable {
    private String accountType;
    private String areaCode;
    private String channel;
    private String macAddr;
    private String matadata;
    private String password;
    private String signdata;
    private String type;
    private String userName;
    private String userToken;
    private String verificationCode;
    private String verificationToken;

    public LoginBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "userName");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str9, "matadata");
        AbstractC5868k.m23674f(str10, "signdata");
        AbstractC5868k.m23674f(str12, "channel");
        this.accountType = str;
        this.userName = str2;
        this.password = str3;
        this.type = str4;
        this.macAddr = str5;
        this.areaCode = str6;
        this.verificationCode = str7;
        this.verificationToken = str8;
        this.matadata = str9;
        this.signdata = str10;
        this.userToken = str11;
        this.channel = str12;
    }

    public final String component1() {
        return this.accountType;
    }

    public final String component10() {
        return this.signdata;
    }

    public final String component11() {
        return this.userToken;
    }

    public final String component12() {
        return this.channel;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.macAddr;
    }

    public final String component6() {
        return this.areaCode;
    }

    public final String component7() {
        return this.verificationCode;
    }

    public final String component8() {
        return this.verificationToken;
    }

    public final String component9() {
        return this.matadata;
    }

    public final LoginBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "userName");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str9, "matadata");
        AbstractC5868k.m23674f(str10, "signdata");
        AbstractC5868k.m23674f(str12, "channel");
        return new LoginBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginBean)) {
            return false;
        }
        LoginBean loginBean = (LoginBean) obj;
        return AbstractC5868k.m23669a(this.accountType, loginBean.accountType) && AbstractC5868k.m23669a(this.userName, loginBean.userName) && AbstractC5868k.m23669a(this.password, loginBean.password) && AbstractC5868k.m23669a(this.type, loginBean.type) && AbstractC5868k.m23669a(this.macAddr, loginBean.macAddr) && AbstractC5868k.m23669a(this.areaCode, loginBean.areaCode) && AbstractC5868k.m23669a(this.verificationCode, loginBean.verificationCode) && AbstractC5868k.m23669a(this.verificationToken, loginBean.verificationToken) && AbstractC5868k.m23669a(this.matadata, loginBean.matadata) && AbstractC5868k.m23669a(this.signdata, loginBean.signdata) && AbstractC5868k.m23669a(this.userToken, loginBean.userToken) && AbstractC5868k.m23669a(this.channel, loginBean.channel);
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getMacAddr() {
        return this.macAddr;
    }

    public final String getMatadata() {
        return this.matadata;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getSigndata() {
        return this.signdata;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        int hashCode = ((((this.accountType.hashCode() * 31) + this.userName.hashCode()) * 31) + this.password.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.macAddr.hashCode()) * 31;
        String str2 = this.areaCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verificationCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verificationToken;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.matadata.hashCode()) * 31) + this.signdata.hashCode()) * 31;
        String str5 = this.userToken;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.channel.hashCode();
    }

    public final void setAccountType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.accountType = str;
    }

    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    public final void setChannel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channel = str;
    }

    public final void setMacAddr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.macAddr = str;
    }

    public final void setMatadata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matadata = str;
    }

    public final void setPassword(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.password = str;
    }

    public final void setSigndata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.signdata = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUserName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public final void setVerificationCode(String str) {
        this.verificationCode = str;
    }

    public final void setVerificationToken(String str) {
        this.verificationToken = str;
    }

    public String toString() {
        return "LoginBean(accountType=" + this.accountType + ", userName=" + this.userName + ", password=" + this.password + ", type=" + this.type + ", macAddr=" + this.macAddr + ", areaCode=" + this.areaCode + ", verificationCode=" + this.verificationCode + ", verificationToken=" + this.verificationToken + ", matadata=" + this.matadata + ", signdata=" + this.signdata + ", userToken=" + this.userToken + ", channel=" + this.channel + ')';
    }

    public /* synthetic */ LoginBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i10 & 256) != 0 ? "" : str9, (i10 & 512) != 0 ? "" : str10, str11, str12);
    }
}
