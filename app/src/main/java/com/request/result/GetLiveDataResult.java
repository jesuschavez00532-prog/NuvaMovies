package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetLiveDataResult implements Serializable {
    private GetLiveDataResultData data;
    private String errorMessage;
    private String returnCode;

    public GetLiveDataResult(String str, String str2, GetLiveDataResultData getLiveDataResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getLiveDataResultData;
    }

    public static /* synthetic */ GetLiveDataResult copy$default(GetLiveDataResult getLiveDataResult, String str, String str2, GetLiveDataResultData getLiveDataResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getLiveDataResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getLiveDataResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getLiveDataResultData = getLiveDataResult.data;
        }
        return getLiveDataResult.copy(str, str2, getLiveDataResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetLiveDataResultData component3() {
        return this.data;
    }

    public final GetLiveDataResult copy(String str, String str2, GetLiveDataResultData getLiveDataResultData) {
        return new GetLiveDataResult(str, str2, getLiveDataResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLiveDataResult)) {
            return false;
        }
        GetLiveDataResult getLiveDataResult = (GetLiveDataResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getLiveDataResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getLiveDataResult.errorMessage) && AbstractC5868k.m23669a(this.data, getLiveDataResult.data);
    }

    public final GetLiveDataResultData getData() {
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
        GetLiveDataResultData getLiveDataResultData = this.data;
        return hashCode2 + (getLiveDataResultData != null ? getLiveDataResultData.hashCode() : 0);
    }

    public final void setData(GetLiveDataResultData getLiveDataResultData) {
        this.data = getLiveDataResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "GetLiveDataResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
