package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetColumnRecommendsResult implements Serializable {
    private GetColumnRecommendsData data;
    private String errorMessage;
    private String returnCode;

    public GetColumnRecommendsResult(String str, String str2, GetColumnRecommendsData getColumnRecommendsData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getColumnRecommendsData;
    }

    public static /* synthetic */ GetColumnRecommendsResult copy$default(GetColumnRecommendsResult getColumnRecommendsResult, String str, String str2, GetColumnRecommendsData getColumnRecommendsData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getColumnRecommendsResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getColumnRecommendsResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getColumnRecommendsData = getColumnRecommendsResult.data;
        }
        return getColumnRecommendsResult.copy(str, str2, getColumnRecommendsData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetColumnRecommendsData component3() {
        return this.data;
    }

    public final GetColumnRecommendsResult copy(String str, String str2, GetColumnRecommendsData getColumnRecommendsData) {
        return new GetColumnRecommendsResult(str, str2, getColumnRecommendsData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetColumnRecommendsResult)) {
            return false;
        }
        GetColumnRecommendsResult getColumnRecommendsResult = (GetColumnRecommendsResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getColumnRecommendsResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getColumnRecommendsResult.errorMessage) && AbstractC5868k.m23669a(this.data, getColumnRecommendsResult.data);
    }

    public final GetColumnRecommendsData getData() {
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
        GetColumnRecommendsData getColumnRecommendsData = this.data;
        return hashCode2 + (getColumnRecommendsData != null ? getColumnRecommendsData.hashCode() : 0);
    }

    public final void setData(GetColumnRecommendsData getColumnRecommendsData) {
        this.data = getColumnRecommendsData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "GetColumnRecommendsResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
