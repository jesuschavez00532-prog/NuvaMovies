package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchByContentResult implements Serializable {
    private SearchByContentResultData data;
    private String errorMessage;
    private String returnCode;

    public SearchByContentResult(String str, String str2, SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(searchByContentResultData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = searchByContentResultData;
    }

    public static /* synthetic */ SearchByContentResult copy$default(SearchByContentResult searchByContentResult, String str, String str2, SearchByContentResultData searchByContentResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchByContentResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = searchByContentResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            searchByContentResultData = searchByContentResult.data;
        }
        return searchByContentResult.copy(str, str2, searchByContentResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final SearchByContentResultData component3() {
        return this.data;
    }

    public final SearchByContentResult copy(String str, String str2, SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(searchByContentResultData, "data");
        return new SearchByContentResult(str, str2, searchByContentResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByContentResult)) {
            return false;
        }
        SearchByContentResult searchByContentResult = (SearchByContentResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, searchByContentResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, searchByContentResult.errorMessage) && AbstractC5868k.m23669a(this.data, searchByContentResult.data);
    }

    public final SearchByContentResultData getData() {
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

    public final void setData(SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(searchByContentResultData, "<set-?>");
        this.data = searchByContentResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "SearchByContentResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
