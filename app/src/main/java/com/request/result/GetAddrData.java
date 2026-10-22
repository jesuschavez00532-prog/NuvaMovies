package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAddrData implements Serializable {
    private String dcsClientUrl;
    private String dcsClientUrlAlias;
    private String errorMessage;
    private String returnCode;

    public GetAddrData(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "dcsClientUrl");
        AbstractC5868k.m23674f(str3, "returnCode");
        this.dcsClientUrl = str;
        this.dcsClientUrlAlias = str2;
        this.returnCode = str3;
        this.errorMessage = str4;
    }

    public static /* synthetic */ GetAddrData copy$default(GetAddrData getAddrData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAddrData.dcsClientUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = getAddrData.dcsClientUrlAlias;
        }
        if ((i10 & 4) != 0) {
            str3 = getAddrData.returnCode;
        }
        if ((i10 & 8) != 0) {
            str4 = getAddrData.errorMessage;
        }
        return getAddrData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.dcsClientUrl;
    }

    public final String component2() {
        return this.dcsClientUrlAlias;
    }

    public final String component3() {
        return this.returnCode;
    }

    public final String component4() {
        return this.errorMessage;
    }

    public final GetAddrData copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "dcsClientUrl");
        AbstractC5868k.m23674f(str3, "returnCode");
        return new GetAddrData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAddrData)) {
            return false;
        }
        GetAddrData getAddrData = (GetAddrData) obj;
        return AbstractC5868k.m23669a(this.dcsClientUrl, getAddrData.dcsClientUrl) && AbstractC5868k.m23669a(this.dcsClientUrlAlias, getAddrData.dcsClientUrlAlias) && AbstractC5868k.m23669a(this.returnCode, getAddrData.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getAddrData.errorMessage);
    }

    public final String getDcsClientUrl() {
        return this.dcsClientUrl;
    }

    public final String getDcsClientUrlAlias() {
        return this.dcsClientUrlAlias;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = this.dcsClientUrl.hashCode() * 31;
        String str = this.dcsClientUrlAlias;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.returnCode.hashCode()) * 31;
        String str2 = this.errorMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDcsClientUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.dcsClientUrl = str;
    }

    public final void setDcsClientUrlAlias(String str) {
        this.dcsClientUrlAlias = str;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "GetAddrData(dcsClientUrl=" + this.dcsClientUrl + ", dcsClientUrlAlias=" + this.dcsClientUrlAlias + ", returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
