package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchROrPResult {
    private SearchROrPData data;
    private String errorMessage;
    private String returnCode;

    public SearchROrPResult(String str, String str2, SearchROrPData searchROrPData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = searchROrPData;
    }

    public static /* synthetic */ SearchROrPResult copy$default(SearchROrPResult searchROrPResult, String str, String str2, SearchROrPData searchROrPData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchROrPResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = searchROrPResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            searchROrPData = searchROrPResult.data;
        }
        return searchROrPResult.copy(str, str2, searchROrPData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final SearchROrPData component3() {
        return this.data;
    }

    public final SearchROrPResult copy(String str, String str2, SearchROrPData searchROrPData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new SearchROrPResult(str, str2, searchROrPData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchROrPResult)) {
            return false;
        }
        SearchROrPResult searchROrPResult = (SearchROrPResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, searchROrPResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, searchROrPResult.errorMessage) && AbstractC5868k.m23669a(this.data, searchROrPResult.data);
    }

    public final SearchROrPData getData() {
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
        SearchROrPData searchROrPData = this.data;
        return hashCode2 + (searchROrPData != null ? searchROrPData.hashCode() : 0);
    }

    public final void setData(SearchROrPData searchROrPData) {
        this.data = searchROrPData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "SearchROrPResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
