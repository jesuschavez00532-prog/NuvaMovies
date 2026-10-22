package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DcsBaseRequestBean implements Serializable {
    private String data;
    private int len;

    public DcsBaseRequestBean(String str, int i10) {
        AbstractC5868k.m23674f(str, "data");
        this.data = str;
        this.len = i10;
    }

    public static /* synthetic */ DcsBaseRequestBean copy$default(DcsBaseRequestBean dcsBaseRequestBean, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dcsBaseRequestBean.data;
        }
        if ((i11 & 2) != 0) {
            i10 = dcsBaseRequestBean.len;
        }
        return dcsBaseRequestBean.copy(str, i10);
    }

    public final String component1() {
        return this.data;
    }

    public final int component2() {
        return this.len;
    }

    public final DcsBaseRequestBean copy(String str, int i10) {
        AbstractC5868k.m23674f(str, "data");
        return new DcsBaseRequestBean(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsBaseRequestBean)) {
            return false;
        }
        DcsBaseRequestBean dcsBaseRequestBean = (DcsBaseRequestBean) obj;
        return AbstractC5868k.m23669a(this.data, dcsBaseRequestBean.data) && this.len == dcsBaseRequestBean.len;
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
        return "DcsBaseRequestBean(data=" + this.data + ", len=" + this.len + ')';
    }
}
