package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetRecommendsResult implements Serializable {
    private GetRecommendsResultData data;
    private String errorMessage;
    private String returnCode;

    public GetRecommendsResult(String str, String str2, GetRecommendsResultData getRecommendsResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getRecommendsResultData;
    }

    public static /* synthetic */ GetRecommendsResult copy$default(GetRecommendsResult getRecommendsResult, String str, String str2, GetRecommendsResultData getRecommendsResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getRecommendsResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getRecommendsResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getRecommendsResultData = getRecommendsResult.data;
        }
        return getRecommendsResult.copy(str, str2, getRecommendsResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetRecommendsResultData component3() {
        return this.data;
    }

    public final GetRecommendsResult copy(String str, String str2, GetRecommendsResultData getRecommendsResultData) {
        return new GetRecommendsResult(str, str2, getRecommendsResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRecommendsResult)) {
            return false;
        }
        GetRecommendsResult getRecommendsResult = (GetRecommendsResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getRecommendsResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getRecommendsResult.errorMessage) && AbstractC5868k.m23669a(this.data, getRecommendsResult.data);
    }

    public final GetRecommendsResultData getData() {
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
        GetRecommendsResultData getRecommendsResultData = this.data;
        return hashCode2 + (getRecommendsResultData != null ? getRecommendsResultData.hashCode() : 0);
    }

    public final void setData(GetRecommendsResultData getRecommendsResultData) {
        this.data = getRecommendsResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "GetRecommendsResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
