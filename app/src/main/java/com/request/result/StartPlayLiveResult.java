package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayLiveResult implements Serializable {
    private StartPlayLiveResultData data;
    private String errorMessage;
    private String returnCode;

    public StartPlayLiveResult(String str, String str2, StartPlayLiveResultData startPlayLiveResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = startPlayLiveResultData;
    }

    public static /* synthetic */ StartPlayLiveResult copy$default(StartPlayLiveResult startPlayLiveResult, String str, String str2, StartPlayLiveResultData startPlayLiveResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = startPlayLiveResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = startPlayLiveResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            startPlayLiveResultData = startPlayLiveResult.data;
        }
        return startPlayLiveResult.copy(str, str2, startPlayLiveResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final StartPlayLiveResultData component3() {
        return this.data;
    }

    public final StartPlayLiveResult copy(String str, String str2, StartPlayLiveResultData startPlayLiveResultData) {
        return new StartPlayLiveResult(str, str2, startPlayLiveResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayLiveResult)) {
            return false;
        }
        StartPlayLiveResult startPlayLiveResult = (StartPlayLiveResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, startPlayLiveResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, startPlayLiveResult.errorMessage) && AbstractC5868k.m23669a(this.data, startPlayLiveResult.data);
    }

    public final StartPlayLiveResultData getData() {
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
        StartPlayLiveResultData startPlayLiveResultData = this.data;
        return hashCode2 + (startPlayLiveResultData != null ? startPlayLiveResultData.hashCode() : 0);
    }

    public final void setData(StartPlayLiveResultData startPlayLiveResultData) {
        this.data = startPlayLiveResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "StartPlayLiveResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
