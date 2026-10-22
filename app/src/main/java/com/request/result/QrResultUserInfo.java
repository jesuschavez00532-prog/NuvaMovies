package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class QrResultUserInfo {
    private int availableTime;
    private String userId;
    private String userIdentity;
    private String userToken;

    public QrResultUserInfo(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "userToken");
        this.userId = str;
        this.userIdentity = str2;
        this.userToken = str3;
        this.availableTime = i10;
    }

    public static /* synthetic */ QrResultUserInfo copy$default(QrResultUserInfo qrResultUserInfo, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qrResultUserInfo.userId;
        }
        if ((i11 & 2) != 0) {
            str2 = qrResultUserInfo.userIdentity;
        }
        if ((i11 & 4) != 0) {
            str3 = qrResultUserInfo.userToken;
        }
        if ((i11 & 8) != 0) {
            i10 = qrResultUserInfo.availableTime;
        }
        return qrResultUserInfo.copy(str, str2, str3, i10);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userIdentity;
    }

    public final String component3() {
        return this.userToken;
    }

    public final int component4() {
        return this.availableTime;
    }

    public final QrResultUserInfo copy(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "userToken");
        return new QrResultUserInfo(str, str2, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrResultUserInfo)) {
            return false;
        }
        QrResultUserInfo qrResultUserInfo = (QrResultUserInfo) obj;
        return AbstractC5868k.m23669a(this.userId, qrResultUserInfo.userId) && AbstractC5868k.m23669a(this.userIdentity, qrResultUserInfo.userIdentity) && AbstractC5868k.m23669a(this.userToken, qrResultUserInfo.userToken) && this.availableTime == qrResultUserInfo.availableTime;
    }

    public final int getAvailableTime() {
        return this.availableTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserIdentity() {
        return this.userIdentity;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.userIdentity.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.availableTime;
    }

    public final void setAvailableTime(int i10) {
        this.availableTime = i10;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserIdentity(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userIdentity = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "QrResultUserInfo(userId=" + this.userId + ", userIdentity=" + this.userIdentity + ", userToken=" + this.userToken + ", availableTime=" + this.availableTime + ')';
    }
}
