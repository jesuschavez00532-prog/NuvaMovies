package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LineupResult {
    private LineupData data;
    private String errorMessage;
    private String returnCode;

    public LineupResult(String str, String str2, LineupData lineupData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(lineupData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = lineupData;
    }

    public static /* synthetic */ LineupResult copy$default(LineupResult lineupResult, String str, String str2, LineupData lineupData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lineupResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = lineupResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            lineupData = lineupResult.data;
        }
        return lineupResult.copy(str, str2, lineupData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final LineupData component3() {
        return this.data;
    }

    public final LineupResult copy(String str, String str2, LineupData lineupData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(lineupData, "data");
        return new LineupResult(str, str2, lineupData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineupResult)) {
            return false;
        }
        LineupResult lineupResult = (LineupResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, lineupResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, lineupResult.errorMessage) && AbstractC5868k.m23669a(this.data, lineupResult.data);
    }

    public final LineupData getData() {
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

    public final void setData(LineupData lineupData) {
        AbstractC5868k.m23674f(lineupData, "<set-?>");
        this.data = lineupData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "LineupResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
