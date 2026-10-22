package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class CheckForceBindResult {
    private ForceBindData data;
    private String errorMessage;
    private String returnCode;

    public CheckForceBindResult(String str, String str2, ForceBindData forceBindData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = forceBindData;
    }

    public static /* synthetic */ CheckForceBindResult copy$default(CheckForceBindResult checkForceBindResult, String str, String str2, ForceBindData forceBindData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkForceBindResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = checkForceBindResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            forceBindData = checkForceBindResult.data;
        }
        return checkForceBindResult.copy(str, str2, forceBindData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final ForceBindData component3() {
        return this.data;
    }

    public final CheckForceBindResult copy(String str, String str2, ForceBindData forceBindData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new CheckForceBindResult(str, str2, forceBindData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckForceBindResult)) {
            return false;
        }
        CheckForceBindResult checkForceBindResult = (CheckForceBindResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, checkForceBindResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, checkForceBindResult.errorMessage) && AbstractC5868k.m23669a(this.data, checkForceBindResult.data);
    }

    public final ForceBindData getData() {
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
        ForceBindData forceBindData = this.data;
        return hashCode2 + (forceBindData != null ? forceBindData.hashCode() : 0);
    }

    public final void setData(ForceBindData forceBindData) {
        this.data = forceBindData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "CheckForceBindResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
