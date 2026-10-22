package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayVODResult implements Serializable {
    private StartPlayVODResultData data;
    private String errorMessage;
    private String returnCode;

    public StartPlayVODResult(String str, String str2, StartPlayVODResultData startPlayVODResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(startPlayVODResultData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = startPlayVODResultData;
    }

    public static /* synthetic */ StartPlayVODResult copy$default(StartPlayVODResult startPlayVODResult, String str, String str2, StartPlayVODResultData startPlayVODResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = startPlayVODResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = startPlayVODResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            startPlayVODResultData = startPlayVODResult.data;
        }
        return startPlayVODResult.copy(str, str2, startPlayVODResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final StartPlayVODResultData component3() {
        return this.data;
    }

    public final StartPlayVODResult copy(String str, String str2, StartPlayVODResultData startPlayVODResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(startPlayVODResultData, "data");
        return new StartPlayVODResult(str, str2, startPlayVODResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayVODResult)) {
            return false;
        }
        StartPlayVODResult startPlayVODResult = (StartPlayVODResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, startPlayVODResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, startPlayVODResult.errorMessage) && AbstractC5868k.m23669a(this.data, startPlayVODResult.data);
    }

    public final StartPlayVODResultData getData() {
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

    public final void setData(StartPlayVODResultData startPlayVODResultData) {
        AbstractC5868k.m23674f(startPlayVODResultData, "<set-?>");
        this.data = startPlayVODResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "StartPlayVODResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
