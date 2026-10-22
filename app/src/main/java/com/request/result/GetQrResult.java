package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetQrResult {
    private QrResultData data;
    private String errorMessage;
    private String returnCode;

    public GetQrResult(String str, String str2, QrResultData qrResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(qrResultData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = qrResultData;
    }

    public static /* synthetic */ GetQrResult copy$default(GetQrResult getQrResult, String str, String str2, QrResultData qrResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getQrResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getQrResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            qrResultData = getQrResult.data;
        }
        return getQrResult.copy(str, str2, qrResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final QrResultData component3() {
        return this.data;
    }

    public final GetQrResult copy(String str, String str2, QrResultData qrResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(qrResultData, "data");
        return new GetQrResult(str, str2, qrResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetQrResult)) {
            return false;
        }
        GetQrResult getQrResult = (GetQrResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getQrResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getQrResult.errorMessage) && AbstractC5868k.m23669a(this.data, getQrResult.data);
    }

    public final QrResultData getData() {
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

    public final void setData(QrResultData qrResultData) {
        AbstractC5868k.m23674f(qrResultData, "<set-?>");
        this.data = qrResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetQrResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
