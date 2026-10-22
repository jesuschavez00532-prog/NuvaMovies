package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AddSubscribeResult {
    private AddSubscribeData data;
    private String errorMessage;
    private String returnCode;

    public AddSubscribeResult(String str, String str2, AddSubscribeData addSubscribeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = addSubscribeData;
    }

    public static /* synthetic */ AddSubscribeResult copy$default(AddSubscribeResult addSubscribeResult, String str, String str2, AddSubscribeData addSubscribeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addSubscribeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = addSubscribeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            addSubscribeData = addSubscribeResult.data;
        }
        return addSubscribeResult.copy(str, str2, addSubscribeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final AddSubscribeData component3() {
        return this.data;
    }

    public final AddSubscribeResult copy(String str, String str2, AddSubscribeData addSubscribeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new AddSubscribeResult(str, str2, addSubscribeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddSubscribeResult)) {
            return false;
        }
        AddSubscribeResult addSubscribeResult = (AddSubscribeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, addSubscribeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, addSubscribeResult.errorMessage) && AbstractC5868k.m23669a(this.data, addSubscribeResult.data);
    }

    public final AddSubscribeData getData() {
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
        AddSubscribeData addSubscribeData = this.data;
        return hashCode2 + (addSubscribeData != null ? addSubscribeData.hashCode() : 0);
    }

    public final void setData(AddSubscribeData addSubscribeData) {
        this.data = addSubscribeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "AddSubscribeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
