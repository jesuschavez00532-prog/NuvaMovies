package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FootballMatchResult {
    private FootballMatchData data;
    private String errorMessage;
    private String returnCode;

    public FootballMatchResult(String str, String str2, FootballMatchData footballMatchData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(footballMatchData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = footballMatchData;
    }

    public static /* synthetic */ FootballMatchResult copy$default(FootballMatchResult footballMatchResult, String str, String str2, FootballMatchData footballMatchData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footballMatchResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = footballMatchResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            footballMatchData = footballMatchResult.data;
        }
        return footballMatchResult.copy(str, str2, footballMatchData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final FootballMatchData component3() {
        return this.data;
    }

    public final FootballMatchResult copy(String str, String str2, FootballMatchData footballMatchData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(footballMatchData, "data");
        return new FootballMatchResult(str, str2, footballMatchData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootballMatchResult)) {
            return false;
        }
        FootballMatchResult footballMatchResult = (FootballMatchResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, footballMatchResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, footballMatchResult.errorMessage) && AbstractC5868k.m23669a(this.data, footballMatchResult.data);
    }

    public final FootballMatchData getData() {
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

    public final void setData(FootballMatchData footballMatchData) {
        AbstractC5868k.m23674f(footballMatchData, "<set-?>");
        this.data = footballMatchData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "FootballMatchResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
