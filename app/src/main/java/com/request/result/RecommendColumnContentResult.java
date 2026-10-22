package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class RecommendColumnContentResult {
    private RecommendColumnContentDataBean data;
    private String errorMessage;
    private String returnCode;

    public RecommendColumnContentResult(String str, String str2, RecommendColumnContentDataBean recommendColumnContentDataBean) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = recommendColumnContentDataBean;
    }

    public static /* synthetic */ RecommendColumnContentResult copy$default(RecommendColumnContentResult recommendColumnContentResult, String str, String str2, RecommendColumnContentDataBean recommendColumnContentDataBean, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recommendColumnContentResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = recommendColumnContentResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            recommendColumnContentDataBean = recommendColumnContentResult.data;
        }
        return recommendColumnContentResult.copy(str, str2, recommendColumnContentDataBean);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final RecommendColumnContentDataBean component3() {
        return this.data;
    }

    public final RecommendColumnContentResult copy(String str, String str2, RecommendColumnContentDataBean recommendColumnContentDataBean) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(str2, "errorMessage");
        return new RecommendColumnContentResult(str, str2, recommendColumnContentDataBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendColumnContentResult)) {
            return false;
        }
        RecommendColumnContentResult recommendColumnContentResult = (RecommendColumnContentResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, recommendColumnContentResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, recommendColumnContentResult.errorMessage) && AbstractC5868k.m23669a(this.data, recommendColumnContentResult.data);
    }

    public final RecommendColumnContentDataBean getData() {
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
        RecommendColumnContentDataBean recommendColumnContentDataBean = this.data;
        return hashCode + (recommendColumnContentDataBean == null ? 0 : recommendColumnContentDataBean.hashCode());
    }

    public final void setData(RecommendColumnContentDataBean recommendColumnContentDataBean) {
        this.data = recommendColumnContentDataBean;
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
        return "RecommendColumnContentResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
