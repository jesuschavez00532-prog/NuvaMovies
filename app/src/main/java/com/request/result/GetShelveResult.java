package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetShelveResult implements Serializable {
    private GetShelveData data;
    private String errorMessage;
    private String returnCode;

    public GetShelveResult(String str, String str2, GetShelveData getShelveData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(getShelveData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getShelveData;
    }

    public static /* synthetic */ GetShelveResult copy$default(GetShelveResult getShelveResult, String str, String str2, GetShelveData getShelveData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getShelveResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getShelveResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getShelveData = getShelveResult.data;
        }
        return getShelveResult.copy(str, str2, getShelveData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetShelveData component3() {
        return this.data;
    }

    public final GetShelveResult copy(String str, String str2, GetShelveData getShelveData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(getShelveData, "data");
        return new GetShelveResult(str, str2, getShelveData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetShelveResult)) {
            return false;
        }
        GetShelveResult getShelveResult = (GetShelveResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getShelveResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getShelveResult.errorMessage) && AbstractC5868k.m23669a(this.data, getShelveResult.data);
    }

    public final GetShelveData getData() {
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
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
    }

    public final void setData(GetShelveData getShelveData) {
        AbstractC5868k.m23674f(getShelveData, "<set-?>");
        this.data = getShelveData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetShelveResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
