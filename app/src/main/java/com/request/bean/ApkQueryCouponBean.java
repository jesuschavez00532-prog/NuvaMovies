package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ApkQueryCouponBean {
    private String activityFlag;
    private String status;
    private String userId;
    private String userToken;

    public ApkQueryCouponBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        this.userId = str;
        this.userToken = str2;
        this.status = str3;
        this.activityFlag = str4;
    }

    public static /* synthetic */ ApkQueryCouponBean copy$default(ApkQueryCouponBean apkQueryCouponBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apkQueryCouponBean.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = apkQueryCouponBean.userToken;
        }
        if ((i10 & 4) != 0) {
            str3 = apkQueryCouponBean.status;
        }
        if ((i10 & 8) != 0) {
            str4 = apkQueryCouponBean.activityFlag;
        }
        return apkQueryCouponBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.activityFlag;
    }

    public final ApkQueryCouponBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return new ApkQueryCouponBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApkQueryCouponBean)) {
            return false;
        }
        ApkQueryCouponBean apkQueryCouponBean = (ApkQueryCouponBean) obj;
        return AbstractC5868k.m23669a(this.userId, apkQueryCouponBean.userId) && AbstractC5868k.m23669a(this.userToken, apkQueryCouponBean.userToken) && AbstractC5868k.m23669a(this.status, apkQueryCouponBean.status) && AbstractC5868k.m23669a(this.activityFlag, apkQueryCouponBean.activityFlag);
    }

    public final String getActivityFlag() {
        return this.activityFlag;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int hashCode = ((this.userId.hashCode() * 31) + this.userToken.hashCode()) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityFlag;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setActivityFlag(String str) {
        this.activityFlag = str;
    }

    public final void setStatus(String str) {
        this.status = str;
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
        return "ApkQueryCouponBean(userId=" + this.userId + ", userToken=" + this.userToken + ", status=" + this.status + ", activityFlag=" + this.activityFlag + ')';
    }
}
