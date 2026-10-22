package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FilterByContentResult implements Serializable {
    private FilterByContentResultData data;
    private String errorMessage;
    private String returnCode;

    public FilterByContentResult(String str, String str2, FilterByContentResultData filterByContentResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(filterByContentResultData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = filterByContentResultData;
    }

    public static /* synthetic */ FilterByContentResult copy$default(FilterByContentResult filterByContentResult, String str, String str2, FilterByContentResultData filterByContentResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterByContentResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = filterByContentResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            filterByContentResultData = filterByContentResult.data;
        }
        return filterByContentResult.copy(str, str2, filterByContentResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final FilterByContentResultData component3() {
        return this.data;
    }

    public final FilterByContentResult copy(String str, String str2, FilterByContentResultData filterByContentResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(filterByContentResultData, "data");
        return new FilterByContentResult(str, str2, filterByContentResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterByContentResult)) {
            return false;
        }
        FilterByContentResult filterByContentResult = (FilterByContentResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, filterByContentResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, filterByContentResult.errorMessage) && AbstractC5868k.m23669a(this.data, filterByContentResult.data);
    }

    public final FilterByContentResultData getData() {
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

    public final void setData(FilterByContentResultData filterByContentResultData) {
        AbstractC5868k.m23674f(filterByContentResultData, "<set-?>");
        this.data = filterByContentResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "FilterByContentResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
