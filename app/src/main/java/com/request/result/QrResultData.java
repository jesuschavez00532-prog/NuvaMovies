package com.request.result;

import com.lzy.okgo.model.Progress;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class QrResultData {
    private String status;
    private QrResultUserInfo userInfo;

    public QrResultData(String str, QrResultUserInfo qrResultUserInfo) {
        AbstractC5868k.m23674f(str, Progress.STATUS);
        this.status = str;
        this.userInfo = qrResultUserInfo;
    }

    public static /* synthetic */ QrResultData copy$default(QrResultData qrResultData, String str, QrResultUserInfo qrResultUserInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qrResultData.status;
        }
        if ((i10 & 2) != 0) {
            qrResultUserInfo = qrResultData.userInfo;
        }
        return qrResultData.copy(str, qrResultUserInfo);
    }

    public final String component1() {
        return this.status;
    }

    public final QrResultUserInfo component2() {
        return this.userInfo;
    }

    public final QrResultData copy(String str, QrResultUserInfo qrResultUserInfo) {
        AbstractC5868k.m23674f(str, Progress.STATUS);
        return new QrResultData(str, qrResultUserInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrResultData)) {
            return false;
        }
        QrResultData qrResultData = (QrResultData) obj;
        return AbstractC5868k.m23669a(this.status, qrResultData.status) && AbstractC5868k.m23669a(this.userInfo, qrResultData.userInfo);
    }

    public final String getStatus() {
        return this.status;
    }

    public final QrResultUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        QrResultUserInfo qrResultUserInfo = this.userInfo;
        return hashCode + (qrResultUserInfo == null ? 0 : qrResultUserInfo.hashCode());
    }

    public final void setStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.status = str;
    }

    public final void setUserInfo(QrResultUserInfo qrResultUserInfo) {
        this.userInfo = qrResultUserInfo;
    }

    public String toString() {
        return "QrResultData(status=" + this.status + ", userInfo=" + this.userInfo + ')';
    }
}
