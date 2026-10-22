package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SlbDesResult implements Serializable {
    private String data;
    private int len;

    public SlbDesResult(String str, int i10) {
        this.data = str;
        this.len = i10;
    }

    public static /* synthetic */ SlbDesResult copy$default(SlbDesResult slbDesResult, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = slbDesResult.data;
        }
        if ((i11 & 2) != 0) {
            i10 = slbDesResult.len;
        }
        return slbDesResult.copy(str, i10);
    }

    public final String component1() {
        return this.data;
    }

    public final int component2() {
        return this.len;
    }

    public final SlbDesResult copy(String str, int i10) {
        return new SlbDesResult(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlbDesResult)) {
            return false;
        }
        SlbDesResult slbDesResult = (SlbDesResult) obj;
        return AbstractC5868k.m23669a(this.data, slbDesResult.data) && this.len == slbDesResult.len;
    }

    public final String getData() {
        return this.data;
    }

    public final int getLen() {
        return this.len;
    }

    public int hashCode() {
        String str = this.data;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.len;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setLen(int i10) {
        this.len = i10;
    }

    public String toString() {
        return "SlbDesResult(data=" + this.data + ", len=" + this.len + ')';
    }
}
