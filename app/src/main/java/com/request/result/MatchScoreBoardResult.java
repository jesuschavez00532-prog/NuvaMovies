package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchScoreBoardResult {
    private MatchScoreBoardData data;
    private String errorMessage;
    private String returnCode;

    public MatchScoreBoardResult(String str, String str2, MatchScoreBoardData matchScoreBoardData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = matchScoreBoardData;
    }

    public static /* synthetic */ MatchScoreBoardResult copy$default(MatchScoreBoardResult matchScoreBoardResult, String str, String str2, MatchScoreBoardData matchScoreBoardData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchScoreBoardResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = matchScoreBoardResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            matchScoreBoardData = matchScoreBoardResult.data;
        }
        return matchScoreBoardResult.copy(str, str2, matchScoreBoardData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final MatchScoreBoardData component3() {
        return this.data;
    }

    public final MatchScoreBoardResult copy(String str, String str2, MatchScoreBoardData matchScoreBoardData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new MatchScoreBoardResult(str, str2, matchScoreBoardData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchScoreBoardResult)) {
            return false;
        }
        MatchScoreBoardResult matchScoreBoardResult = (MatchScoreBoardResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, matchScoreBoardResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, matchScoreBoardResult.errorMessage) && AbstractC5868k.m23669a(this.data, matchScoreBoardResult.data);
    }

    public final MatchScoreBoardData getData() {
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
        MatchScoreBoardData matchScoreBoardData = this.data;
        return hashCode2 + (matchScoreBoardData != null ? matchScoreBoardData.hashCode() : 0);
    }

    public final void setData(MatchScoreBoardData matchScoreBoardData) {
        this.data = matchScoreBoardData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "MatchScoreBoardResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
