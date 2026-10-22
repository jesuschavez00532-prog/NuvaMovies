package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetSlbInfoBeanResult implements Serializable {
    private GetSlbInfoBeanResultData data;
    private String errorMessage;
    private String returnCode;

    public GetSlbInfoBeanResult(String str, String str2, GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getSlbInfoBeanResultData;
    }

    public static /* synthetic */ GetSlbInfoBeanResult copy$default(GetSlbInfoBeanResult getSlbInfoBeanResult, String str, String str2, GetSlbInfoBeanResultData getSlbInfoBeanResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getSlbInfoBeanResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getSlbInfoBeanResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getSlbInfoBeanResultData = getSlbInfoBeanResult.data;
        }
        return getSlbInfoBeanResult.copy(str, str2, getSlbInfoBeanResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetSlbInfoBeanResultData component3() {
        return this.data;
    }

    public final GetSlbInfoBeanResult copy(String str, String str2, GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetSlbInfoBeanResult(str, str2, getSlbInfoBeanResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSlbInfoBeanResult)) {
            return false;
        }
        GetSlbInfoBeanResult getSlbInfoBeanResult = (GetSlbInfoBeanResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getSlbInfoBeanResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getSlbInfoBeanResult.errorMessage) && AbstractC5868k.m23669a(this.data, getSlbInfoBeanResult.data);
    }

    public final GetSlbInfoBeanResultData getData() {
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
        GetSlbInfoBeanResultData getSlbInfoBeanResultData = this.data;
        return hashCode2 + (getSlbInfoBeanResultData != null ? getSlbInfoBeanResultData.hashCode() : 0);
    }

    public final void setData(GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        this.data = getSlbInfoBeanResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetSlbInfoBeanResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
