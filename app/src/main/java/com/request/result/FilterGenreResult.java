package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FilterGenreResult implements Serializable {
    private FilterGenreResultData data;
    private String errorMessage;
    private String returnCode;

    public FilterGenreResult(String str, String str2, FilterGenreResultData filterGenreResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = filterGenreResultData;
    }

    public static /* synthetic */ FilterGenreResult copy$default(FilterGenreResult filterGenreResult, String str, String str2, FilterGenreResultData filterGenreResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterGenreResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = filterGenreResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            filterGenreResultData = filterGenreResult.data;
        }
        return filterGenreResult.copy(str, str2, filterGenreResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final FilterGenreResultData component3() {
        return this.data;
    }

    public final FilterGenreResult copy(String str, String str2, FilterGenreResultData filterGenreResultData) {
        return new FilterGenreResult(str, str2, filterGenreResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGenreResult)) {
            return false;
        }
        FilterGenreResult filterGenreResult = (FilterGenreResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, filterGenreResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, filterGenreResult.errorMessage) && AbstractC5868k.m23669a(this.data, filterGenreResult.data);
    }

    public final FilterGenreResultData getData() {
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
        FilterGenreResultData filterGenreResultData = this.data;
        return hashCode2 + (filterGenreResultData != null ? filterGenreResultData.hashCode() : 0);
    }

    public final void setData(FilterGenreResultData filterGenreResultData) {
        this.data = filterGenreResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "FilterGenreResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
