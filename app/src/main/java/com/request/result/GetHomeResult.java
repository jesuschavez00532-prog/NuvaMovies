package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetHomeResult {
    private GetHomeData data;
    private String errorMessage;
    private String returnCode;

    public GetHomeResult(String str, String str2, GetHomeData getHomeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getHomeData;
    }

    public static /* synthetic */ GetHomeResult copy$default(GetHomeResult getHomeResult, String str, String str2, GetHomeData getHomeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getHomeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getHomeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getHomeData = getHomeResult.data;
        }
        return getHomeResult.copy(str, str2, getHomeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetHomeData component3() {
        return this.data;
    }

    public final GetHomeResult copy(String str, String str2, GetHomeData getHomeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetHomeResult(str, str2, getHomeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHomeResult)) {
            return false;
        }
        GetHomeResult getHomeResult = (GetHomeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getHomeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getHomeResult.errorMessage) && AbstractC5868k.m23669a(this.data, getHomeResult.data);
    }

    public final GetHomeData getData() {
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
        GetHomeData getHomeData = this.data;
        return hashCode2 + (getHomeData != null ? getHomeData.hashCode() : 0);
    }

    public final void setData(GetHomeData getHomeData) {
        this.data = getHomeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetHomeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
