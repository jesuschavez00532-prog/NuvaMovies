package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class BaseResult implements Serializable {
    private String errorMessage;
    private String returnCode;

    public BaseResult(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.returnCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ BaseResult copy$default(BaseResult baseResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = baseResult.errorMessage;
        }
        return baseResult.copy(str, str2);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final BaseResult copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        return new BaseResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResult)) {
            return false;
        }
        BaseResult baseResult = (BaseResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, baseResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, baseResult.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        return (this.returnCode.hashCode() * 31) + this.errorMessage.hashCode();
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
        return "BaseResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
