package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAuthInfoResult implements Serializable {
    private GetAuthInfoResultData data;
    private String errorMessage;
    private String returnCode;

    public GetAuthInfoResult(String str, String str2, GetAuthInfoResultData getAuthInfoResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getAuthInfoResultData;
    }

    public static /* synthetic */ GetAuthInfoResult copy$default(GetAuthInfoResult getAuthInfoResult, String str, String str2, GetAuthInfoResultData getAuthInfoResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAuthInfoResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getAuthInfoResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getAuthInfoResultData = getAuthInfoResult.data;
        }
        return getAuthInfoResult.copy(str, str2, getAuthInfoResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetAuthInfoResultData component3() {
        return this.data;
    }

    public final GetAuthInfoResult copy(String str, String str2, GetAuthInfoResultData getAuthInfoResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetAuthInfoResult(str, str2, getAuthInfoResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthInfoResult)) {
            return false;
        }
        GetAuthInfoResult getAuthInfoResult = (GetAuthInfoResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getAuthInfoResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getAuthInfoResult.errorMessage) && AbstractC5868k.m23669a(this.data, getAuthInfoResult.data);
    }

    public final GetAuthInfoResultData getData() {
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
        GetAuthInfoResultData getAuthInfoResultData = this.data;
        return hashCode2 + (getAuthInfoResultData != null ? getAuthInfoResultData.hashCode() : 0);
    }

    public final void setData(GetAuthInfoResultData getAuthInfoResultData) {
        this.data = getAuthInfoResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetAuthInfoResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
