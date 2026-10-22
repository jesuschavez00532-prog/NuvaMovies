package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ActiveResult implements Serializable {
    private ActiveData data;
    private String errorMessage;
    private String returnCode;

    public ActiveResult(String str, String str2, ActiveData activeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(activeData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = activeData;
    }

    public static /* synthetic */ ActiveResult copy$default(ActiveResult activeResult, String str, String str2, ActiveData activeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = activeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            activeData = activeResult.data;
        }
        return activeResult.copy(str, str2, activeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final ActiveData component3() {
        return this.data;
    }

    public final ActiveResult copy(String str, String str2, ActiveData activeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(activeData, "data");
        return new ActiveResult(str, str2, activeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveResult)) {
            return false;
        }
        ActiveResult activeResult = (ActiveResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, activeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, activeResult.errorMessage) && AbstractC5868k.m23669a(this.data, activeResult.data);
    }

    public final ActiveData getData() {
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

    public final void setData(ActiveData activeData) {
        AbstractC5868k.m23674f(activeData, "<set-?>");
        this.data = activeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "ActiveResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
