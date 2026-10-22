package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DcsBaseResult implements Serializable {
    private String data;
    private Integer len;
    private String timestamp;

    public DcsBaseResult(Integer num, String str, String str2) {
        this.len = num;
        this.data = str;
        this.timestamp = str2;
    }

    public static /* synthetic */ DcsBaseResult copy$default(DcsBaseResult dcsBaseResult, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = dcsBaseResult.len;
        }
        if ((i10 & 2) != 0) {
            str = dcsBaseResult.data;
        }
        if ((i10 & 4) != 0) {
            str2 = dcsBaseResult.timestamp;
        }
        return dcsBaseResult.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.len;
    }

    public final String component2() {
        return this.data;
    }

    public final String component3() {
        return this.timestamp;
    }

    public final DcsBaseResult copy(Integer num, String str, String str2) {
        return new DcsBaseResult(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsBaseResult)) {
            return false;
        }
        DcsBaseResult dcsBaseResult = (DcsBaseResult) obj;
        return AbstractC5868k.m23669a(this.len, dcsBaseResult.len) && AbstractC5868k.m23669a(this.data, dcsBaseResult.data) && AbstractC5868k.m23669a(this.timestamp, dcsBaseResult.timestamp);
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getLen() {
        return this.len;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Integer num = this.len;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.data;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timestamp;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setLen(Integer num) {
        this.len = num;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        return "DcsBaseResult(len=" + this.len + ", data=" + this.data + ", timestamp=" + this.timestamp + ')';
    }
}
