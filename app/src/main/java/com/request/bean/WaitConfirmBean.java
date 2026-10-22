package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class WaitConfirmBean {
    private String qrtoken;

    public WaitConfirmBean(String str) {
        AbstractC5868k.m23674f(str, "qrtoken");
        this.qrtoken = str;
    }

    public static /* synthetic */ WaitConfirmBean copy$default(WaitConfirmBean waitConfirmBean, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = waitConfirmBean.qrtoken;
        }
        return waitConfirmBean.copy(str);
    }

    public final String component1() {
        return this.qrtoken;
    }

    public final WaitConfirmBean copy(String str) {
        AbstractC5868k.m23674f(str, "qrtoken");
        return new WaitConfirmBean(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WaitConfirmBean) && AbstractC5868k.m23669a(this.qrtoken, ((WaitConfirmBean) obj).qrtoken);
    }

    public final String getQrtoken() {
        return this.qrtoken;
    }

    public int hashCode() {
        return this.qrtoken.hashCode();
    }

    public final void setQrtoken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.qrtoken = str;
    }

    public String toString() {
        return "WaitConfirmBean(qrtoken=" + this.qrtoken + ')';
    }
}
