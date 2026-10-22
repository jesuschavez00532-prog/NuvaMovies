package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class BaseTimeData {
    private String baseTime;

    public BaseTimeData(String str) {
        AbstractC5868k.m23674f(str, "baseTime");
        this.baseTime = str;
    }

    public static /* synthetic */ BaseTimeData copy$default(BaseTimeData baseTimeData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseTimeData.baseTime;
        }
        return baseTimeData.copy(str);
    }

    public final String component1() {
        return this.baseTime;
    }

    public final BaseTimeData copy(String str) {
        AbstractC5868k.m23674f(str, "baseTime");
        return new BaseTimeData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseTimeData) && AbstractC5868k.m23669a(this.baseTime, ((BaseTimeData) obj).baseTime);
    }

    public final String getBaseTime() {
        return this.baseTime;
    }

    public int hashCode() {
        return this.baseTime.hashCode();
    }

    public final void setBaseTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.baseTime = str;
    }

    public String toString() {
        return "BaseTimeData(baseTime=" + this.baseTime + ')';
    }
}
