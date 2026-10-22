package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AddHistoryResult implements Serializable {
    private String errorMessage;
    private String returnCode;

    public AddHistoryResult(String str, String str2) {
        this.returnCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ AddHistoryResult copy$default(AddHistoryResult addHistoryResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addHistoryResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = addHistoryResult.errorMessage;
        }
        return addHistoryResult.copy(str, str2);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final AddHistoryResult copy(String str, String str2) {
        return new AddHistoryResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddHistoryResult)) {
            return false;
        }
        AddHistoryResult addHistoryResult = (AddHistoryResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, addHistoryResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, addHistoryResult.errorMessage);
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
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "AddHistoryResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
