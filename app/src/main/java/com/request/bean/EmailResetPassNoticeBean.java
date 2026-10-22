package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class EmailResetPassNoticeBean {
    private String email;
    private String lang;

    public EmailResetPassNoticeBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "lang");
        this.email = str;
        this.lang = str2;
    }

    public static /* synthetic */ EmailResetPassNoticeBean copy$default(EmailResetPassNoticeBean emailResetPassNoticeBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailResetPassNoticeBean.email;
        }
        if ((i10 & 2) != 0) {
            str2 = emailResetPassNoticeBean.lang;
        }
        return emailResetPassNoticeBean.copy(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.lang;
    }

    public final EmailResetPassNoticeBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "lang");
        return new EmailResetPassNoticeBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailResetPassNoticeBean)) {
            return false;
        }
        EmailResetPassNoticeBean emailResetPassNoticeBean = (EmailResetPassNoticeBean) obj;
        return AbstractC5868k.m23669a(this.email, emailResetPassNoticeBean.email) && AbstractC5868k.m23669a(this.lang, emailResetPassNoticeBean.lang);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.lang.hashCode();
    }

    public final void setEmail(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.email = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public String toString() {
        return "EmailResetPassNoticeBean(email=" + this.email + ", lang=" + this.lang + ')';
    }
}
