package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class UnBindEmailResult {
    private UnBindEmailData data;
    private String errorMessage;
    private String returnCode;

    public UnBindEmailResult(String str, String str2, UnBindEmailData unBindEmailData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = unBindEmailData;
    }

    public static /* synthetic */ UnBindEmailResult copy$default(UnBindEmailResult unBindEmailResult, String str, String str2, UnBindEmailData unBindEmailData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unBindEmailResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = unBindEmailResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            unBindEmailData = unBindEmailResult.data;
        }
        return unBindEmailResult.copy(str, str2, unBindEmailData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final UnBindEmailData component3() {
        return this.data;
    }

    public final UnBindEmailResult copy(String str, String str2, UnBindEmailData unBindEmailData) {
        return new UnBindEmailResult(str, str2, unBindEmailData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnBindEmailResult)) {
            return false;
        }
        UnBindEmailResult unBindEmailResult = (UnBindEmailResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, unBindEmailResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, unBindEmailResult.errorMessage) && AbstractC5868k.m23669a(this.data, unBindEmailResult.data);
    }

    public final UnBindEmailData getData() {
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
        UnBindEmailData unBindEmailData = this.data;
        return hashCode2 + (unBindEmailData != null ? unBindEmailData.hashCode() : 0);
    }

    public final void setData(UnBindEmailData unBindEmailData) {
        this.data = unBindEmailData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "UnBindEmailResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
