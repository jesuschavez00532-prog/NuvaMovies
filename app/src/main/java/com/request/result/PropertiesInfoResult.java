package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PropertiesInfoResult {
    private PropertiesInfoBean data;
    private String errorMessage;
    private String returnCode;

    public PropertiesInfoResult(String str, String str2, PropertiesInfoBean propertiesInfoBean) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = propertiesInfoBean;
    }

    public static /* synthetic */ PropertiesInfoResult copy$default(PropertiesInfoResult propertiesInfoResult, String str, String str2, PropertiesInfoBean propertiesInfoBean, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = propertiesInfoResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = propertiesInfoResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            propertiesInfoBean = propertiesInfoResult.data;
        }
        return propertiesInfoResult.copy(str, str2, propertiesInfoBean);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final PropertiesInfoBean component3() {
        return this.data;
    }

    public final PropertiesInfoResult copy(String str, String str2, PropertiesInfoBean propertiesInfoBean) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new PropertiesInfoResult(str, str2, propertiesInfoBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertiesInfoResult)) {
            return false;
        }
        PropertiesInfoResult propertiesInfoResult = (PropertiesInfoResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, propertiesInfoResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, propertiesInfoResult.errorMessage) && AbstractC5868k.m23669a(this.data, propertiesInfoResult.data);
    }

    public final PropertiesInfoBean getData() {
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PropertiesInfoBean propertiesInfoBean = this.data;
        return hashCode2 + (propertiesInfoBean != null ? propertiesInfoBean.hashCode() : 0);
    }

    public final void setData(PropertiesInfoBean propertiesInfoBean) {
        this.data = propertiesInfoBean;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "PropertiesInfoResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
