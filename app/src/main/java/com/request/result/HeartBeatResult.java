package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class HeartBeatResult implements Serializable {
    private HearBeatResultData data;
    private String errorMessage;
    private String returnCode;

    public HeartBeatResult(String str, String str2, HearBeatResultData hearBeatResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = hearBeatResultData;
    }

    public static /* synthetic */ HeartBeatResult copy$default(HeartBeatResult heartBeatResult, String str, String str2, HearBeatResultData hearBeatResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = heartBeatResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = heartBeatResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            hearBeatResultData = heartBeatResult.data;
        }
        return heartBeatResult.copy(str, str2, hearBeatResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final HearBeatResultData component3() {
        return this.data;
    }

    public final HeartBeatResult copy(String str, String str2, HearBeatResultData hearBeatResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        return new HeartBeatResult(str, str2, hearBeatResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, heartBeatResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, heartBeatResult.errorMessage) && AbstractC5868k.m23669a(this.data, heartBeatResult.data);
    }

    public final HearBeatResultData getData() {
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
        HearBeatResultData hearBeatResultData = this.data;
        return hashCode + (hearBeatResultData == null ? 0 : hearBeatResultData.hashCode());
    }

    public final void setData(HearBeatResultData hearBeatResultData) {
        this.data = hearBeatResultData;
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
        return "HeartBeatResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
