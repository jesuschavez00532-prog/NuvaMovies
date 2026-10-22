package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class EmailSuffixData {
    private String emailSuffixStr;

    public EmailSuffixData(String str) {
        AbstractC5868k.m23674f(str, "emailSuffixStr");
        this.emailSuffixStr = str;
    }

    public static /* synthetic */ EmailSuffixData copy$default(EmailSuffixData emailSuffixData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailSuffixData.emailSuffixStr;
        }
        return emailSuffixData.copy(str);
    }

    public final String component1() {
        return this.emailSuffixStr;
    }

    public final EmailSuffixData copy(String str) {
        AbstractC5868k.m23674f(str, "emailSuffixStr");
        return new EmailSuffixData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailSuffixData) && AbstractC5868k.m23669a(this.emailSuffixStr, ((EmailSuffixData) obj).emailSuffixStr);
    }

    public final String getEmailSuffixStr() {
        return this.emailSuffixStr;
    }

    public int hashCode() {
        return this.emailSuffixStr.hashCode();
    }

    public final void setEmailSuffixStr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.emailSuffixStr = str;
    }

    public String toString() {
        return "EmailSuffixData(emailSuffixStr=" + this.emailSuffixStr + ')';
    }
}
