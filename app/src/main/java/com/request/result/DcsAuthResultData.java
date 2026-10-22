package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DcsAuthResultData implements Serializable {
    private String errorMessage;
    private String random;
    private String returnCode;

    public DcsAuthResultData(String str, String str2, String str3) {
        this.random = str;
        this.returnCode = str2;
        this.errorMessage = str3;
    }

    public static /* synthetic */ DcsAuthResultData copy$default(DcsAuthResultData dcsAuthResultData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dcsAuthResultData.random;
        }
        if ((i10 & 2) != 0) {
            str2 = dcsAuthResultData.returnCode;
        }
        if ((i10 & 4) != 0) {
            str3 = dcsAuthResultData.errorMessage;
        }
        return dcsAuthResultData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.random;
    }

    public final String component2() {
        return this.returnCode;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final DcsAuthResultData copy(String str, String str2, String str3) {
        return new DcsAuthResultData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsAuthResultData)) {
            return false;
        }
        DcsAuthResultData dcsAuthResultData = (DcsAuthResultData) obj;
        return AbstractC5868k.m23669a(this.random, dcsAuthResultData.random) && AbstractC5868k.m23669a(this.returnCode, dcsAuthResultData.returnCode) && AbstractC5868k.m23669a(this.errorMessage, dcsAuthResultData.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getRandom() {
        return this.random;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        String str = this.random;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.returnCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setRandom(String str) {
        this.random = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "DcsAuthResultData(random=" + this.random + ", returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
