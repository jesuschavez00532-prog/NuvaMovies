package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ApkPushHoleResult implements Serializable {
    private String errorMessage;
    private Integer returnCode;

    public ApkPushHoleResult(Integer num, String str) {
        this.returnCode = num;
        this.errorMessage = str;
    }

    public static /* synthetic */ ApkPushHoleResult copy$default(ApkPushHoleResult apkPushHoleResult, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = apkPushHoleResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str = apkPushHoleResult.errorMessage;
        }
        return apkPushHoleResult.copy(num, str);
    }

    public final Integer component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final ApkPushHoleResult copy(Integer num, String str) {
        return new ApkPushHoleResult(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApkPushHoleResult)) {
            return false;
        }
        ApkPushHoleResult apkPushHoleResult = (ApkPushHoleResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, apkPushHoleResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, apkPushHoleResult.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Integer getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        Integer num = this.returnCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(Integer num) {
        this.returnCode = num;
    }

    public String toString() {
        return "ApkPushHoleResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
