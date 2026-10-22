package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class BaseTimeResult implements Serializable {
    private BaseTimeData data;
    private String errorMessage;
    private String returnCode;

    public BaseTimeResult(String str, String str2, BaseTimeData baseTimeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(baseTimeData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = baseTimeData;
    }

    public static /* synthetic */ BaseTimeResult copy$default(BaseTimeResult baseTimeResult, String str, String str2, BaseTimeData baseTimeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseTimeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = baseTimeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            baseTimeData = baseTimeResult.data;
        }
        return baseTimeResult.copy(str, str2, baseTimeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final BaseTimeData component3() {
        return this.data;
    }

    public final BaseTimeResult copy(String str, String str2, BaseTimeData baseTimeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(baseTimeData, "data");
        return new BaseTimeResult(str, str2, baseTimeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseTimeResult)) {
            return false;
        }
        BaseTimeResult baseTimeResult = (BaseTimeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, baseTimeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, baseTimeResult.errorMessage) && AbstractC5868k.m23669a(this.data, baseTimeResult.data);
    }

    public final BaseTimeData getData() {
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

    public final void setData(BaseTimeData baseTimeData) {
        AbstractC5868k.m23674f(baseTimeData, "<set-?>");
        this.data = baseTimeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "BaseTimeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
