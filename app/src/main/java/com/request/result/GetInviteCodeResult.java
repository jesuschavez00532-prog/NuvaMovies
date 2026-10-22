package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetInviteCodeResult {
    private GetInviteCodeData data;
    private String errorMessage;
    private String returnCode;

    public GetInviteCodeResult(String str, String str2, GetInviteCodeData getInviteCodeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getInviteCodeData;
    }

    public static /* synthetic */ GetInviteCodeResult copy$default(GetInviteCodeResult getInviteCodeResult, String str, String str2, GetInviteCodeData getInviteCodeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getInviteCodeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getInviteCodeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getInviteCodeData = getInviteCodeResult.data;
        }
        return getInviteCodeResult.copy(str, str2, getInviteCodeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetInviteCodeData component3() {
        return this.data;
    }

    public final GetInviteCodeResult copy(String str, String str2, GetInviteCodeData getInviteCodeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetInviteCodeResult(str, str2, getInviteCodeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetInviteCodeResult)) {
            return false;
        }
        GetInviteCodeResult getInviteCodeResult = (GetInviteCodeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getInviteCodeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getInviteCodeResult.errorMessage) && AbstractC5868k.m23669a(this.data, getInviteCodeResult.data);
    }

    public final GetInviteCodeData getData() {
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
        GetInviteCodeData getInviteCodeData = this.data;
        return hashCode2 + (getInviteCodeData != null ? getInviteCodeData.hashCode() : 0);
    }

    public final void setData(GetInviteCodeData getInviteCodeData) {
        this.data = getInviteCodeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetInviteCodeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
