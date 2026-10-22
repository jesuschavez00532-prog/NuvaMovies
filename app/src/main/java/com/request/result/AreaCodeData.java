package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AreaCodeData {
    private String areaCode;

    public AreaCodeData(String str) {
        AbstractC5868k.m23674f(str, "areaCode");
        this.areaCode = str;
    }

    public static /* synthetic */ AreaCodeData copy$default(AreaCodeData areaCodeData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = areaCodeData.areaCode;
        }
        return areaCodeData.copy(str);
    }

    public final String component1() {
        return this.areaCode;
    }

    public final AreaCodeData copy(String str) {
        AbstractC5868k.m23674f(str, "areaCode");
        return new AreaCodeData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AreaCodeData) && AbstractC5868k.m23669a(this.areaCode, ((AreaCodeData) obj).areaCode);
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public int hashCode() {
        return this.areaCode.hashCode();
    }

    public final void setAreaCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.areaCode = str;
    }

    public String toString() {
        return "AreaCodeData(areaCode=" + this.areaCode + ')';
    }
}
