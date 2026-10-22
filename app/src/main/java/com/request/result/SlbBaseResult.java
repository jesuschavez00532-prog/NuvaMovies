package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SlbBaseResult implements Serializable {
    private String data;
    private int len;

    public SlbBaseResult(String str, int i10) {
        AbstractC5868k.m23674f(str, "data");
        this.data = str;
        this.len = i10;
    }

    public static /* synthetic */ SlbBaseResult copy$default(SlbBaseResult slbBaseResult, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = slbBaseResult.data;
        }
        if ((i11 & 2) != 0) {
            i10 = slbBaseResult.len;
        }
        return slbBaseResult.copy(str, i10);
    }

    public final String component1() {
        return this.data;
    }

    public final int component2() {
        return this.len;
    }

    public final SlbBaseResult copy(String str, int i10) {
        AbstractC5868k.m23674f(str, "data");
        return new SlbBaseResult(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlbBaseResult)) {
            return false;
        }
        SlbBaseResult slbBaseResult = (SlbBaseResult) obj;
        return AbstractC5868k.m23669a(this.data, slbBaseResult.data) && this.len == slbBaseResult.len;
    }

    public final String getData() {
        return this.data;
    }

    public final int getLen() {
        return this.len;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.len;
    }

    public final void setData(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.data = str;
    }

    public final void setLen(int i10) {
        this.len = i10;
    }

    public String toString() {
        return "SlbBaseResult(data=" + this.data + ", len=" + this.len + ')';
    }
}
