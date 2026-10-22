package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetQrResultBean {
    private String qrtoken;
    private String type;

    public GetQrResultBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "qrtoken");
        this.type = str;
        this.qrtoken = str2;
    }

    public static /* synthetic */ GetQrResultBean copy$default(GetQrResultBean getQrResultBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getQrResultBean.type;
        }
        if ((i10 & 2) != 0) {
            str2 = getQrResultBean.qrtoken;
        }
        return getQrResultBean.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.qrtoken;
    }

    public final GetQrResultBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "qrtoken");
        return new GetQrResultBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetQrResultBean)) {
            return false;
        }
        GetQrResultBean getQrResultBean = (GetQrResultBean) obj;
        return AbstractC5868k.m23669a(this.type, getQrResultBean.type) && AbstractC5868k.m23669a(this.qrtoken, getQrResultBean.qrtoken);
    }

    public final String getQrtoken() {
        return this.qrtoken;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.qrtoken.hashCode();
    }

    public final void setQrtoken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.qrtoken = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        return "GetQrResultBean(type=" + this.type + ", qrtoken=" + this.qrtoken + ')';
    }
}
