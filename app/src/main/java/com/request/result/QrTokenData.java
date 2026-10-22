package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class QrTokenData {
    private String qrtoken;

    public QrTokenData(String str) {
        AbstractC5868k.m23674f(str, "qrtoken");
        this.qrtoken = str;
    }

    public static /* synthetic */ QrTokenData copy$default(QrTokenData qrTokenData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qrTokenData.qrtoken;
        }
        return qrTokenData.copy(str);
    }

    public final String component1() {
        return this.qrtoken;
    }

    public final QrTokenData copy(String str) {
        AbstractC5868k.m23674f(str, "qrtoken");
        return new QrTokenData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QrTokenData) && AbstractC5868k.m23669a(this.qrtoken, ((QrTokenData) obj).qrtoken);
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
        return "QrTokenData(qrtoken=" + this.qrtoken + ')';
    }
}
