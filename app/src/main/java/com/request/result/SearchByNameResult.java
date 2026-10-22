package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchByNameResult implements Serializable {
    private SearchByNameResultData data;
    private String errorMessage;
    private String returnCode;

    public SearchByNameResult(String str, String str2, SearchByNameResultData searchByNameResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = searchByNameResultData;
    }

    public static /* synthetic */ SearchByNameResult copy$default(SearchByNameResult searchByNameResult, String str, String str2, SearchByNameResultData searchByNameResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchByNameResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = searchByNameResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            searchByNameResultData = searchByNameResult.data;
        }
        return searchByNameResult.copy(str, str2, searchByNameResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final SearchByNameResultData component3() {
        return this.data;
    }

    public final SearchByNameResult copy(String str, String str2, SearchByNameResultData searchByNameResultData) {
        return new SearchByNameResult(str, str2, searchByNameResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByNameResult)) {
            return false;
        }
        SearchByNameResult searchByNameResult = (SearchByNameResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, searchByNameResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, searchByNameResult.errorMessage) && AbstractC5868k.m23669a(this.data, searchByNameResult.data);
    }

    public final SearchByNameResultData getData() {
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
        SearchByNameResultData searchByNameResultData = this.data;
        return hashCode2 + (searchByNameResultData != null ? searchByNameResultData.hashCode() : 0);
    }

    public final void setData(SearchByNameResultData searchByNameResultData) {
        this.data = searchByNameResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "SearchByNameResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
