package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetExchangeOrderInfoResult {
    private List<ExchangeOrderInfo> data;
    private String errorMessage;
    private String returnCode;

    public GetExchangeOrderInfoResult(String str, String str2, List<ExchangeOrderInfo> list) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(list, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetExchangeOrderInfoResult copy$default(GetExchangeOrderInfoResult getExchangeOrderInfoResult, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getExchangeOrderInfoResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getExchangeOrderInfoResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            list = getExchangeOrderInfoResult.data;
        }
        return getExchangeOrderInfoResult.copy(str, str2, list);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final List<ExchangeOrderInfo> component3() {
        return this.data;
    }

    public final GetExchangeOrderInfoResult copy(String str, String str2, List<ExchangeOrderInfo> list) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(list, "data");
        return new GetExchangeOrderInfoResult(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetExchangeOrderInfoResult)) {
            return false;
        }
        GetExchangeOrderInfoResult getExchangeOrderInfoResult = (GetExchangeOrderInfoResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getExchangeOrderInfoResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getExchangeOrderInfoResult.errorMessage) && AbstractC5868k.m23669a(this.data, getExchangeOrderInfoResult.data);
    }

    public final List<ExchangeOrderInfo> getData() {
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

    public final void setData(List<ExchangeOrderInfo> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.data = list;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetExchangeOrderInfoResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
