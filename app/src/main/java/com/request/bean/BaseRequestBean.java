package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class BaseRequestBean implements Serializable {
    private String data;
    private Integer len;

    public BaseRequestBean(String str, Integer num) {
        this.data = str;
        this.len = num;
    }

    public static /* synthetic */ BaseRequestBean copy$default(BaseRequestBean baseRequestBean, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseRequestBean.data;
        }
        if ((i10 & 2) != 0) {
            num = baseRequestBean.len;
        }
        return baseRequestBean.copy(str, num);
    }

    public final String component1() {
        return this.data;
    }

    public final Integer component2() {
        return this.len;
    }

    public final BaseRequestBean copy(String str, Integer num) {
        return new BaseRequestBean(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRequestBean)) {
            return false;
        }
        BaseRequestBean baseRequestBean = (BaseRequestBean) obj;
        return AbstractC5868k.m23669a(this.data, baseRequestBean.data) && AbstractC5868k.m23669a(this.len, baseRequestBean.len);
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getLen() {
        return this.len;
    }

    public int hashCode() {
        String str = this.data;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.len;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setLen(Integer num) {
        this.len = num;
    }

    public String toString() {
        return "BaseRequestBean(data=" + this.data + ", len=" + this.len + ')';
    }
}
