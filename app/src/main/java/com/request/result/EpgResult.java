package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class EpgResult {
    private EpgData data;
    private String errorMessage;
    private String returnCode;

    public EpgResult(String str, String str2, EpgData epgData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = epgData;
    }

    public static /* synthetic */ EpgResult copy$default(EpgResult epgResult, String str, String str2, EpgData epgData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = epgResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = epgResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            epgData = epgResult.data;
        }
        return epgResult.copy(str, str2, epgData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final EpgData component3() {
        return this.data;
    }

    public final EpgResult copy(String str, String str2, EpgData epgData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new EpgResult(str, str2, epgData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpgResult)) {
            return false;
        }
        EpgResult epgResult = (EpgResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, epgResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, epgResult.errorMessage) && AbstractC5868k.m23669a(this.data, epgResult.data);
    }

    public final EpgData getData() {
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EpgData epgData = this.data;
        return hashCode2 + (epgData != null ? epgData.hashCode() : 0);
    }

    public final void setData(EpgData epgData) {
        this.data = epgData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "EpgResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
