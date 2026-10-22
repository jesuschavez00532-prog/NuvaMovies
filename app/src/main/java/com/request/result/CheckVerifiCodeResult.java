package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class CheckVerifiCodeResult {
    private String errorMessage;
    private String returnCode;

    public CheckVerifiCodeResult(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ CheckVerifiCodeResult copy$default(CheckVerifiCodeResult checkVerifiCodeResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkVerifiCodeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = checkVerifiCodeResult.errorMessage;
        }
        return checkVerifiCodeResult.copy(str, str2);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final CheckVerifiCodeResult copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new CheckVerifiCodeResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckVerifiCodeResult)) {
            return false;
        }
        CheckVerifiCodeResult checkVerifiCodeResult = (CheckVerifiCodeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, checkVerifiCodeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, checkVerifiCodeResult.errorMessage);
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
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "CheckVerifiCodeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
