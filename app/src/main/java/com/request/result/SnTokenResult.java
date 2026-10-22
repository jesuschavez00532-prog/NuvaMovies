package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SnTokenResult implements Serializable {
    private SnTokenData data;
    private String errorMessage;
    private String returnCode;

    public SnTokenResult(String str, String str2, SnTokenData snTokenData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(snTokenData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = snTokenData;
    }

    public static /* synthetic */ SnTokenResult copy$default(SnTokenResult snTokenResult, String str, String str2, SnTokenData snTokenData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = snTokenResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = snTokenResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            snTokenData = snTokenResult.data;
        }
        return snTokenResult.copy(str, str2, snTokenData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final SnTokenData component3() {
        return this.data;
    }

    public final SnTokenResult copy(String str, String str2, SnTokenData snTokenData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(snTokenData, "data");
        return new SnTokenResult(str, str2, snTokenData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnTokenResult)) {
            return false;
        }
        SnTokenResult snTokenResult = (SnTokenResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, snTokenResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, snTokenResult.errorMessage) && AbstractC5868k.m23669a(this.data, snTokenResult.data);
    }

    public final SnTokenData getData() {
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

    public final void setData(SnTokenData snTokenData) {
        AbstractC5868k.m23674f(snTokenData, "<set-?>");
        this.data = snTokenData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "SnTokenResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
