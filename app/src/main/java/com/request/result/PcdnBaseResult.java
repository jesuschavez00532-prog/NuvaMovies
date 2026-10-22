package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PcdnBaseResult {
    private String data;
    private Integer status;

    public PcdnBaseResult(Integer num, String str) {
        this.status = num;
        this.data = str;
    }

    public static /* synthetic */ PcdnBaseResult copy$default(PcdnBaseResult pcdnBaseResult, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = pcdnBaseResult.status;
        }
        if ((i10 & 2) != 0) {
            str = pcdnBaseResult.data;
        }
        return pcdnBaseResult.copy(num, str);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.data;
    }

    public final PcdnBaseResult copy(Integer num, String str) {
        return new PcdnBaseResult(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnBaseResult)) {
            return false;
        }
        PcdnBaseResult pcdnBaseResult = (PcdnBaseResult) obj;
        return AbstractC5868k.m23669a(this.status, pcdnBaseResult.status) && AbstractC5868k.m23669a(this.data, pcdnBaseResult.data);
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.data;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public String toString() {
        return "PcdnBaseResult(status=" + this.status + ", data=" + this.data + ')';
    }
}
