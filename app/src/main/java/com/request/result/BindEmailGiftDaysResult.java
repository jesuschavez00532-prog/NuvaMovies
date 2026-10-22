package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class BindEmailGiftDaysResult {
    private GiftDaysData data;
    private String errorMessage;
    private String returnCode;

    public BindEmailGiftDaysResult(String str, String str2, GiftDaysData giftDaysData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(giftDaysData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = giftDaysData;
    }

    public static /* synthetic */ BindEmailGiftDaysResult copy$default(BindEmailGiftDaysResult bindEmailGiftDaysResult, String str, String str2, GiftDaysData giftDaysData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bindEmailGiftDaysResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = bindEmailGiftDaysResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            giftDaysData = bindEmailGiftDaysResult.data;
        }
        return bindEmailGiftDaysResult.copy(str, str2, giftDaysData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final GiftDaysData component3() {
        return this.data;
    }

    public final BindEmailGiftDaysResult copy(String str, String str2, GiftDaysData giftDaysData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(giftDaysData, "data");
        return new BindEmailGiftDaysResult(str, str2, giftDaysData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindEmailGiftDaysResult)) {
            return false;
        }
        BindEmailGiftDaysResult bindEmailGiftDaysResult = (BindEmailGiftDaysResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, bindEmailGiftDaysResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, bindEmailGiftDaysResult.errorMessage) && AbstractC5868k.m23669a(this.data, bindEmailGiftDaysResult.data);
    }

    public final GiftDaysData getData() {
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

    public final void setData(GiftDaysData giftDaysData) {
        AbstractC5868k.m23674f(giftDaysData, "<set-?>");
        this.data = giftDaysData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "BindEmailGiftDaysResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
