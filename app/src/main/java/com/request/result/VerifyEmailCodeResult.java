package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class VerifyEmailCodeResult {
    private VerifyEmailCodeData data;
    private String errorMessage;
    private String returnCode;

    public VerifyEmailCodeResult(String str, String str2, VerifyEmailCodeData verifyEmailCodeData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = verifyEmailCodeData;
    }

    public static /* synthetic */ VerifyEmailCodeResult copy$default(VerifyEmailCodeResult verifyEmailCodeResult, String str, String str2, VerifyEmailCodeData verifyEmailCodeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verifyEmailCodeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = verifyEmailCodeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            verifyEmailCodeData = verifyEmailCodeResult.data;
        }
        return verifyEmailCodeResult.copy(str, str2, verifyEmailCodeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final VerifyEmailCodeData component3() {
        return this.data;
    }

    public final VerifyEmailCodeResult copy(String str, String str2, VerifyEmailCodeData verifyEmailCodeData) {
        return new VerifyEmailCodeResult(str, str2, verifyEmailCodeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailCodeResult)) {
            return false;
        }
        VerifyEmailCodeResult verifyEmailCodeResult = (VerifyEmailCodeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, verifyEmailCodeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, verifyEmailCodeResult.errorMessage) && AbstractC5868k.m23669a(this.data, verifyEmailCodeResult.data);
    }

    public final VerifyEmailCodeData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        String str = this.returnCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VerifyEmailCodeData verifyEmailCodeData = this.data;
        return hashCode2 + (verifyEmailCodeData != null ? verifyEmailCodeData.hashCode() : 0);
    }

    public final void setData(VerifyEmailCodeData verifyEmailCodeData) {
        this.data = verifyEmailCodeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "VerifyEmailCodeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
