package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAreaCodeResult {
    private AreaCodeData data;
    private String errorMessage;
    private String returnCode;

    public GetAreaCodeResult(String str, String str2, AreaCodeData areaCodeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(areaCodeData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = areaCodeData;
    }

    public static /* synthetic */ GetAreaCodeResult copy$default(GetAreaCodeResult getAreaCodeResult, String str, String str2, AreaCodeData areaCodeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAreaCodeResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getAreaCodeResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            areaCodeData = getAreaCodeResult.data;
        }
        return getAreaCodeResult.copy(str, str2, areaCodeData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final AreaCodeData component3() {
        return this.data;
    }

    public final GetAreaCodeResult copy(String str, String str2, AreaCodeData areaCodeData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(areaCodeData, "data");
        return new GetAreaCodeResult(str, str2, areaCodeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAreaCodeResult)) {
            return false;
        }
        GetAreaCodeResult getAreaCodeResult = (GetAreaCodeResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getAreaCodeResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getAreaCodeResult.errorMessage) && AbstractC5868k.m23669a(this.data, getAreaCodeResult.data);
    }

    public final AreaCodeData getData() {
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

    public final void setData(AreaCodeData areaCodeData) {
        AbstractC5868k.m23674f(areaCodeData, "<set-?>");
        this.data = areaCodeData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetAreaCodeResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
