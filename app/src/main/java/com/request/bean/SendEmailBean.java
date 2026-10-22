package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SendEmailBean implements Serializable {
    private String buyerEmail;
    private String jumpType;
    private String lang;
    private String portalCode;
    private int remainingDays;
    private String userId;
    private String userType;

    public SendEmailBean(String str, String str2, String str3, String str4, String str5, int i10, String str6) {
        AbstractC5868k.m23674f(str, "buyerEmail");
        AbstractC5868k.m23674f(str2, "portalCode");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "userType");
        AbstractC5868k.m23674f(str5, "lang");
        AbstractC5868k.m23674f(str6, "jumpType");
        this.buyerEmail = str;
        this.portalCode = str2;
        this.userId = str3;
        this.userType = str4;
        this.lang = str5;
        this.remainingDays = i10;
        this.jumpType = str6;
    }

    public static /* synthetic */ SendEmailBean copy$default(SendEmailBean sendEmailBean, String str, String str2, String str3, String str4, String str5, int i10, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sendEmailBean.buyerEmail;
        }
        if ((i11 & 2) != 0) {
            str2 = sendEmailBean.portalCode;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = sendEmailBean.userId;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = sendEmailBean.userType;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = sendEmailBean.lang;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            i10 = sendEmailBean.remainingDays;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            str6 = sendEmailBean.jumpType;
        }
        return sendEmailBean.copy(str, str7, str8, str9, str10, i12, str6);
    }

    public final String component1() {
        return this.buyerEmail;
    }

    public final String component2() {
        return this.portalCode;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.userType;
    }

    public final String component5() {
        return this.lang;
    }

    public final int component6() {
        return this.remainingDays;
    }

    public final String component7() {
        return this.jumpType;
    }

    public final SendEmailBean copy(String str, String str2, String str3, String str4, String str5, int i10, String str6) {
        AbstractC5868k.m23674f(str, "buyerEmail");
        AbstractC5868k.m23674f(str2, "portalCode");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "userType");
        AbstractC5868k.m23674f(str5, "lang");
        AbstractC5868k.m23674f(str6, "jumpType");
        return new SendEmailBean(str, str2, str3, str4, str5, i10, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailBean)) {
            return false;
        }
        SendEmailBean sendEmailBean = (SendEmailBean) obj;
        return AbstractC5868k.m23669a(this.buyerEmail, sendEmailBean.buyerEmail) && AbstractC5868k.m23669a(this.portalCode, sendEmailBean.portalCode) && AbstractC5868k.m23669a(this.userId, sendEmailBean.userId) && AbstractC5868k.m23669a(this.userType, sendEmailBean.userType) && AbstractC5868k.m23669a(this.lang, sendEmailBean.lang) && this.remainingDays == sendEmailBean.remainingDays && AbstractC5868k.m23669a(this.jumpType, sendEmailBean.jumpType);
    }

    public final String getBuyerEmail() {
        return this.buyerEmail;
    }

    public final String getJumpType() {
        return this.jumpType;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final int getRemainingDays() {
        return this.remainingDays;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return (((((((((((this.buyerEmail.hashCode() * 31) + this.portalCode.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.userType.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.remainingDays) * 31) + this.jumpType.hashCode();
    }

    public final void setBuyerEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.buyerEmail = str;
    }

    public final void setJumpType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.jumpType = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setRemainingDays(int i10) {
        this.remainingDays = i10;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userType = str;
    }

    public String toString() {
        return "SendEmailBean(buyerEmail=" + this.buyerEmail + ", portalCode=" + this.portalCode + ", userId=" + this.userId + ", userType=" + this.userType + ", lang=" + this.lang + ", remainingDays=" + this.remainingDays + ", jumpType=" + this.jumpType + ')';
    }
}
