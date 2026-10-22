package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ApkReceiveCouponBean {
    private String userId;
    private String userToken;

    public ApkReceiveCouponBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        this.userId = str;
        this.userToken = str2;
    }

    public static /* synthetic */ ApkReceiveCouponBean copy$default(ApkReceiveCouponBean apkReceiveCouponBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apkReceiveCouponBean.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = apkReceiveCouponBean.userToken;
        }
        return apkReceiveCouponBean.copy(str, str2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userToken;
    }

    public final ApkReceiveCouponBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return new ApkReceiveCouponBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApkReceiveCouponBean)) {
            return false;
        }
        ApkReceiveCouponBean apkReceiveCouponBean = (ApkReceiveCouponBean) obj;
        return AbstractC5868k.m23669a(this.userId, apkReceiveCouponBean.userId) && AbstractC5868k.m23669a(this.userToken, apkReceiveCouponBean.userToken);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.userToken.hashCode();
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "ApkReceiveCouponBean(userId=" + this.userId + ", userToken=" + this.userToken + ')';
    }
}
