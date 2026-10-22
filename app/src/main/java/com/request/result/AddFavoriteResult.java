package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AddFavoriteResult implements Serializable {
    private FavIdData data;
    private String errorMessage;
    private String returnCode;

    public AddFavoriteResult(String str, String str2, FavIdData favIdData) {
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = favIdData;
    }

    public static /* synthetic */ AddFavoriteResult copy$default(AddFavoriteResult addFavoriteResult, String str, String str2, FavIdData favIdData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addFavoriteResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = addFavoriteResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            favIdData = addFavoriteResult.data;
        }
        return addFavoriteResult.copy(str, str2, favIdData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final FavIdData component3() {
        return this.data;
    }

    public final AddFavoriteResult copy(String str, String str2, FavIdData favIdData) {
        return new AddFavoriteResult(str, str2, favIdData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoriteResult)) {
            return false;
        }
        AddFavoriteResult addFavoriteResult = (AddFavoriteResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, addFavoriteResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, addFavoriteResult.errorMessage) && AbstractC5868k.m23669a(this.data, addFavoriteResult.data);
    }

    public final FavIdData getData() {
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
        FavIdData favIdData = this.data;
        return hashCode2 + (favIdData != null ? favIdData.hashCode() : 0);
    }

    public final void setData(FavIdData favIdData) {
        this.data = favIdData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        this.returnCode = str;
    }

    public String toString() {
        return "AddFavoriteResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
