package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAllbackProgramResult {
    private GetAllbackProgramResultData data;
    private String errorMessage;
    private String returnCode;

    public GetAllbackProgramResult(String str, String str2, GetAllbackProgramResultData getAllbackProgramResultData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = getAllbackProgramResultData;
    }

    public static /* synthetic */ GetAllbackProgramResult copy$default(GetAllbackProgramResult getAllbackProgramResult, String str, String str2, GetAllbackProgramResultData getAllbackProgramResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAllbackProgramResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getAllbackProgramResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            getAllbackProgramResultData = getAllbackProgramResult.data;
        }
        return getAllbackProgramResult.copy(str, str2, getAllbackProgramResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GetAllbackProgramResultData component3() {
        return this.data;
    }

    public final GetAllbackProgramResult copy(String str, String str2, GetAllbackProgramResultData getAllbackProgramResultData) {
        return new GetAllbackProgramResult(str, str2, getAllbackProgramResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllbackProgramResult)) {
            return false;
        }
        GetAllbackProgramResult getAllbackProgramResult = (GetAllbackProgramResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getAllbackProgramResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getAllbackProgramResult.errorMessage) && AbstractC5868k.m23669a(this.data, getAllbackProgramResult.data);
    }

    public final GetAllbackProgramResultData getData() {
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
        GetAllbackProgramResultData getAllbackProgramResultData = this.data;
        return hashCode2 + (getAllbackProgramResultData != null ? getAllbackProgramResultData.hashCode() : 0);
    }

    public final void setData(GetAllbackProgramResultData getAllbackProgramResultData) {
        this.data = getAllbackProgramResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "GetAllbackProgramResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
