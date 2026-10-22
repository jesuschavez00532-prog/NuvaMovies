package com.request.bean;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SubTitleResult implements Serializable {
    private List<SubTitleItemData> data;
    private String errorMessage;
    private String returnCode;

    public SubTitleResult(String str, String str2, List<SubTitleItemData> list) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubTitleResult copy$default(SubTitleResult subTitleResult, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subTitleResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = subTitleResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            list = subTitleResult.data;
        }
        return subTitleResult.copy(str, str2, list);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final List<SubTitleItemData> component3() {
        return this.data;
    }

    public final SubTitleResult copy(String str, String str2, List<SubTitleItemData> list) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        return new SubTitleResult(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTitleResult)) {
            return false;
        }
        SubTitleResult subTitleResult = (SubTitleResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, subTitleResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, subTitleResult.errorMessage) && AbstractC5868k.m23669a(this.data, subTitleResult.data);
    }

    public final List<SubTitleItemData> getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = ((this.returnCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        List<SubTitleItemData> list = this.data;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setData(List<SubTitleItemData> list) {
        this.data = list;
    }

    public final void setErrorMessage(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "SubTitleResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
