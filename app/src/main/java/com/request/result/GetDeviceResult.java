package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetDeviceResult {
    private final DevicesListData data;
    private final String errorMessage;
    private final String returnCode;

    public GetDeviceResult(DevicesListData devicesListData, String str, String str2) {
        AbstractC5868k.m23674f(devicesListData, "data");
        AbstractC5868k.m23674f(str, "errorMessage");
        AbstractC5868k.m23674f(str2, "returnCode");
        this.data = devicesListData;
        this.errorMessage = str;
        this.returnCode = str2;
    }

    public static /* synthetic */ GetDeviceResult copy$default(GetDeviceResult getDeviceResult, DevicesListData devicesListData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            devicesListData = getDeviceResult.data;
        }
        if ((i10 & 2) != 0) {
            str = getDeviceResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            str2 = getDeviceResult.returnCode;
        }
        return getDeviceResult.copy(devicesListData, str, str2);
    }

    public final DevicesListData component1() {
        return this.data;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.returnCode;
    }

    public final GetDeviceResult copy(DevicesListData devicesListData, String str, String str2) {
        AbstractC5868k.m23674f(devicesListData, "data");
        AbstractC5868k.m23674f(str, "errorMessage");
        AbstractC5868k.m23674f(str2, "returnCode");
        return new GetDeviceResult(devicesListData, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDeviceResult)) {
            return false;
        }
        GetDeviceResult getDeviceResult = (GetDeviceResult) obj;
        return AbstractC5868k.m23669a(this.data, getDeviceResult.data) && AbstractC5868k.m23669a(this.errorMessage, getDeviceResult.errorMessage) && AbstractC5868k.m23669a(this.returnCode, getDeviceResult.returnCode);
    }

    public final DevicesListData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.returnCode.hashCode();
    }

    public String toString() {
        return "GetDeviceResult(data=" + this.data + ", errorMessage=" + this.errorMessage + ", returnCode=" + this.returnCode + ')';
    }
}
