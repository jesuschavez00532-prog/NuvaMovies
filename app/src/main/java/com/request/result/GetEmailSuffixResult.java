package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetEmailSuffixResult {
    private EmailSuffixData data;
    private String errorMessage;
    private String returnCode;

    public GetEmailSuffixResult(String str, String str2, EmailSuffixData emailSuffixData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = emailSuffixData;
    }

    public static /* synthetic */ GetEmailSuffixResult copy$default(GetEmailSuffixResult getEmailSuffixResult, String str, String str2, EmailSuffixData emailSuffixData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getEmailSuffixResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getEmailSuffixResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            emailSuffixData = getEmailSuffixResult.data;
        }
        return getEmailSuffixResult.copy(str, str2, emailSuffixData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final EmailSuffixData component3() {
        return this.data;
    }

    public final GetEmailSuffixResult copy(String str, String str2, EmailSuffixData emailSuffixData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetEmailSuffixResult(str, str2, emailSuffixData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEmailSuffixResult)) {
            return false;
        }
        GetEmailSuffixResult getEmailSuffixResult = (GetEmailSuffixResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getEmailSuffixResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getEmailSuffixResult.errorMessage) && AbstractC5868k.m23669a(this.data, getEmailSuffixResult.data);
    }

    public final EmailSuffixData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = this.returnCode.hashCode() * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EmailSuffixData emailSuffixData = this.data;
        return hashCode2 + (emailSuffixData != null ? emailSuffixData.hashCode() : 0);
    }

    public final void setData(EmailSuffixData emailSuffixData) {
        this.data = emailSuffixData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetEmailSuffixResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
