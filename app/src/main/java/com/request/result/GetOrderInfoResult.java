package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetOrderInfoResult {
    private List<OrderInfo> data;
    private String errorMessage;
    private String returnCode;
    private int totalSize;

    public GetOrderInfoResult(String str, String str2, List<OrderInfo> list, int i10) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = list;
        this.totalSize = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOrderInfoResult copy$default(GetOrderInfoResult getOrderInfoResult, String str, String str2, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getOrderInfoResult.returnCode;
        }
        if ((i11 & 2) != 0) {
            str2 = getOrderInfoResult.errorMessage;
        }
        if ((i11 & 4) != 0) {
            list = getOrderInfoResult.data;
        }
        if ((i11 & 8) != 0) {
            i10 = getOrderInfoResult.totalSize;
        }
        return getOrderInfoResult.copy(str, str2, list, i10);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final List<OrderInfo> component3() {
        return this.data;
    }

    public final int component4() {
        return this.totalSize;
    }

    public final GetOrderInfoResult copy(String str, String str2, List<OrderInfo> list, int i10) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new GetOrderInfoResult(str, str2, list, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOrderInfoResult)) {
            return false;
        }
        GetOrderInfoResult getOrderInfoResult = (GetOrderInfoResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getOrderInfoResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getOrderInfoResult.errorMessage) && AbstractC5868k.m23669a(this.data, getOrderInfoResult.data) && this.totalSize == getOrderInfoResult.totalSize;
    }

    public final List<OrderInfo> getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int hashCode = this.returnCode.hashCode() * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<OrderInfo> list = this.data;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.totalSize;
    }

    public final void setData(List<OrderInfo> list) {
        this.data = list;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public String toString() {
        return "GetOrderInfoResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ", totalSize=" + this.totalSize + ')';
    }
}
