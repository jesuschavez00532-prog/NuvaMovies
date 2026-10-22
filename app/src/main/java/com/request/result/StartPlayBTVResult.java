package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayBTVResult implements Serializable {
    private StartPlayBTVResultData data;
    private String errorMessage;
    private String returnCode;

    public StartPlayBTVResult(String str, String str2, StartPlayBTVResultData startPlayBTVResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = startPlayBTVResultData;
    }

    public static /* synthetic */ StartPlayBTVResult copy$default(StartPlayBTVResult startPlayBTVResult, String str, String str2, StartPlayBTVResultData startPlayBTVResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = startPlayBTVResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = startPlayBTVResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            startPlayBTVResultData = startPlayBTVResult.data;
        }
        return startPlayBTVResult.copy(str, str2, startPlayBTVResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final StartPlayBTVResultData component3() {
        return this.data;
    }

    public final StartPlayBTVResult copy(String str, String str2, StartPlayBTVResultData startPlayBTVResultData) {
        return new StartPlayBTVResult(str, str2, startPlayBTVResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayBTVResult)) {
            return false;
        }
        StartPlayBTVResult startPlayBTVResult = (StartPlayBTVResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, startPlayBTVResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, startPlayBTVResult.errorMessage) && AbstractC5868k.m23669a(this.data, startPlayBTVResult.data);
    }

    public final StartPlayBTVResultData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        String str = this.returnCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StartPlayBTVResultData startPlayBTVResultData = this.data;
        return hashCode2 + (startPlayBTVResultData != null ? startPlayBTVResultData.hashCode() : 0);
    }

    public final void setData(StartPlayBTVResultData startPlayBTVResultData) {
        this.data = startPlayBTVResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "StartPlayBTVResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
