package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetVerifiCodeResult {
    private String errorMessage;
    private String returnCode;

    public GetVerifiCodeResult(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ GetVerifiCodeResult copy$default(GetVerifiCodeResult getVerifiCodeResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getVerifiCodeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getVerifiCodeResult.errorMessage;
        }
        return getVerifiCodeResult.copy(str, str2);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetVerifiCodeResult copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetVerifiCodeResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetVerifiCodeResult)) {
            return false;
        }
        GetVerifiCodeResult getVerifiCodeResult = (GetVerifiCodeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getVerifiCodeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getVerifiCodeResult.errorMessage);
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
        return "GetVerifiCodeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
