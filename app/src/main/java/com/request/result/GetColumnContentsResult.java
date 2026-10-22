package com.request.result;

import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetColumnContentsResult implements Serializable {
    private GetColumnContentsResultData data;
    private String errorMessage;
    private String returnCode;
    private String totalSize;

    public GetColumnContentsResult(String str, String str2, String str3, GetColumnContentsResultData getColumnContentsResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        AbstractC5868k.m23674f(str3, Progress.TOTAL_SIZE);
        this.returnCode = str;
        this.errorMessage = str2;
        this.totalSize = str3;
        this.data = getColumnContentsResultData;
    }

    public static /* synthetic */ GetColumnContentsResult copy$default(GetColumnContentsResult getColumnContentsResult, String str, String str2, String str3, GetColumnContentsResultData getColumnContentsResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getColumnContentsResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getColumnContentsResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            str3 = getColumnContentsResult.totalSize;
        }
        if ((i10 & 8) != 0) {
            getColumnContentsResultData = getColumnContentsResult.data;
        }
        return getColumnContentsResult.copy(str, str2, str3, getColumnContentsResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.totalSize;
    }

    public final GetColumnContentsResultData component4() {
        return this.data;
    }

    public final GetColumnContentsResult copy(String str, String str2, String str3, GetColumnContentsResultData getColumnContentsResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        AbstractC5868k.m23674f(str3, Progress.TOTAL_SIZE);
        return new GetColumnContentsResult(str, str2, str3, getColumnContentsResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetColumnContentsResult)) {
            return false;
        }
        GetColumnContentsResult getColumnContentsResult = (GetColumnContentsResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, getColumnContentsResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, getColumnContentsResult.errorMessage) && AbstractC5868k.m23669a(this.totalSize, getColumnContentsResult.totalSize) && AbstractC5868k.m23669a(this.data, getColumnContentsResult.data);
    }

    public final GetColumnContentsResultData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public final String getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int hashCode = ((((this.returnCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.totalSize.hashCode()) * 31;
        GetColumnContentsResultData getColumnContentsResultData = this.data;
        return hashCode + (getColumnContentsResultData == null ? 0 : getColumnContentsResultData.hashCode());
    }

    public final void setData(GetColumnContentsResultData getColumnContentsResultData) {
        this.data = getColumnContentsResultData;
    }

    public final void setErrorMessage(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public final void setTotalSize(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.totalSize = str;
    }

    public String toString() {
        return "GetColumnContentsResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", totalSize=" + this.totalSize + ", data=" + this.data + ')';
    }
}
