package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetFavoritesResult implements Serializable {
    private GetFavoritesResultData data;
    private String errorMessage;
    private String returnCode;

    public GetFavoritesResult(String str, String str2, GetFavoritesResultData getFavoritesResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getFavoritesResultData;
    }

    public static /* synthetic */ GetFavoritesResult copy$default(GetFavoritesResult getFavoritesResult, String str, String str2, GetFavoritesResultData getFavoritesResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getFavoritesResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getFavoritesResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getFavoritesResultData = getFavoritesResult.data;
        }
        return getFavoritesResult.copy(str, str2, getFavoritesResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetFavoritesResultData component3() {
        return this.data;
    }

    public final GetFavoritesResult copy(String str, String str2, GetFavoritesResultData getFavoritesResultData) {
        return new GetFavoritesResult(str, str2, getFavoritesResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFavoritesResult)) {
            return false;
        }
        GetFavoritesResult getFavoritesResult = (GetFavoritesResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getFavoritesResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getFavoritesResult.errorMessage) && AbstractC5868k.m23669a(this.data, getFavoritesResult.data);
    }

    public final GetFavoritesResultData getData() {
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
        GetFavoritesResultData getFavoritesResultData = this.data;
        return hashCode2 + (getFavoritesResultData != null ? getFavoritesResultData.hashCode() : 0);
    }

    public final void setData(GetFavoritesResultData getFavoritesResultData) {
        this.data = getFavoritesResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "GetFavoritesResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
