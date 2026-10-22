package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ExchangeResult implements Serializable {
    private ExchangeResultData data;
    private String errorMessage;
    private String returnCode;

    public ExchangeResult(String str, String str2, ExchangeResultData exchangeResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = exchangeResultData;
    }

    public static /* synthetic */ ExchangeResult copy$default(ExchangeResult exchangeResult, String str, String str2, ExchangeResultData exchangeResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exchangeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = exchangeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            exchangeResultData = exchangeResult.data;
        }
        return exchangeResult.copy(str, str2, exchangeResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final ExchangeResultData component3() {
        return this.data;
    }

    public final ExchangeResult copy(String str, String str2, ExchangeResultData exchangeResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        return new ExchangeResult(str, str2, exchangeResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeResult)) {
            return false;
        }
        ExchangeResult exchangeResult = (ExchangeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, exchangeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, exchangeResult.errorMessage) && AbstractC5868k.m23669a(this.data, exchangeResult.data);
    }

    public final ExchangeResultData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = ((this.returnCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        ExchangeResultData exchangeResultData = this.data;
        return hashCode + (exchangeResultData == null ? 0 : exchangeResultData.hashCode());
    }

    public final void setData(ExchangeResultData exchangeResultData) {
        this.data = exchangeResultData;
    }

    public final void setErrorMessage(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "ExchangeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
