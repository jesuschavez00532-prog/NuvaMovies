package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetQrTokenResult {
    private QrTokenData data;
    private String errorMessage;
    private String returnCode;

    public GetQrTokenResult(String str, String str2, QrTokenData qrTokenData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(qrTokenData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = qrTokenData;
    }

    public static /* synthetic */ GetQrTokenResult copy$default(GetQrTokenResult getQrTokenResult, String str, String str2, QrTokenData qrTokenData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getQrTokenResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getQrTokenResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            qrTokenData = getQrTokenResult.data;
        }
        return getQrTokenResult.copy(str, str2, qrTokenData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final QrTokenData component3() {
        return this.data;
    }

    public final GetQrTokenResult copy(String str, String str2, QrTokenData qrTokenData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(qrTokenData, "data");
        return new GetQrTokenResult(str, str2, qrTokenData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetQrTokenResult)) {
            return false;
        }
        GetQrTokenResult getQrTokenResult = (GetQrTokenResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getQrTokenResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getQrTokenResult.errorMessage) && AbstractC5868k.m23669a(this.data, getQrTokenResult.data);
    }

    public final QrTokenData getData() {
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

    public final void setData(QrTokenData qrTokenData) {
        AbstractC5868k.m23674f(qrTokenData, "<set-?>");
        this.data = qrTokenData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetQrTokenResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
