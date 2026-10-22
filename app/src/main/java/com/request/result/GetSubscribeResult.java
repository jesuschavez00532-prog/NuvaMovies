package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetSubscribeResult {
    private SubscribeListData data;
    private String errorMessage;
    private String returnCode;

    public GetSubscribeResult(String str, String str2, SubscribeListData subscribeListData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = subscribeListData;
    }

    public static /* synthetic */ GetSubscribeResult copy$default(GetSubscribeResult getSubscribeResult, String str, String str2, SubscribeListData subscribeListData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getSubscribeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getSubscribeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            subscribeListData = getSubscribeResult.data;
        }
        return getSubscribeResult.copy(str, str2, subscribeListData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final SubscribeListData component3() {
        return this.data;
    }

    public final GetSubscribeResult copy(String str, String str2, SubscribeListData subscribeListData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetSubscribeResult(str, str2, subscribeListData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSubscribeResult)) {
            return false;
        }
        GetSubscribeResult getSubscribeResult = (GetSubscribeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getSubscribeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getSubscribeResult.errorMessage) && AbstractC5868k.m23669a(this.data, getSubscribeResult.data);
    }

    public final SubscribeListData getData() {
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
        SubscribeListData subscribeListData = this.data;
        return hashCode2 + (subscribeListData != null ? subscribeListData.hashCode() : 0);
    }

    public final void setData(SubscribeListData subscribeListData) {
        this.data = subscribeListData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetSubscribeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
