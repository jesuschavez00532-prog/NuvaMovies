package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DelFavoriteResult implements Serializable {
    private String data;
    private String errorMessage;
    private String returnCode;

    public DelFavoriteResult(String str, String str2, String str3) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = str3;
    }

    public static /* synthetic */ DelFavoriteResult copy$default(DelFavoriteResult delFavoriteResult, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = delFavoriteResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = delFavoriteResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            str3 = delFavoriteResult.data;
        }
        return delFavoriteResult.copy(str, str2, str3);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.data;
    }

    public final DelFavoriteResult copy(String str, String str2, String str3) {
        return new DelFavoriteResult(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelFavoriteResult)) {
            return false;
        }
        DelFavoriteResult delFavoriteResult = (DelFavoriteResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, delFavoriteResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, delFavoriteResult.errorMessage) && AbstractC5868k.m23669a(this.data, delFavoriteResult.data);
    }

    public final String getData() {
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
        String str3 = this.data;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "DelFavoriteResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
