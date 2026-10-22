package com.request.bean;

import com.lzy.okgo.model.Progress;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class RestrictedStatusBean {
    private String status;
    private String userId;
    private String userToken;

    public RestrictedStatusBean(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, Progress.STATUS);
        this.userToken = str;
        this.userId = str2;
        this.status = str3;
    }

    public static /* synthetic */ RestrictedStatusBean copy$default(RestrictedStatusBean restrictedStatusBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = restrictedStatusBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = restrictedStatusBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = restrictedStatusBean.status;
        }
        return restrictedStatusBean.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.status;
    }

    public final RestrictedStatusBean copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, Progress.STATUS);
        return new RestrictedStatusBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictedStatusBean)) {
            return false;
        }
        RestrictedStatusBean restrictedStatusBean = (RestrictedStatusBean) obj;
        return AbstractC5868k.m23669a(this.userToken, restrictedStatusBean.userToken) && AbstractC5868k.m23669a(this.userId, restrictedStatusBean.userId) && AbstractC5868k.m23669a(this.status, restrictedStatusBean.status);
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
        return (((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
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
        return "RestrictedStatusBean(userToken=" + this.userToken + ", userId=" + this.userId + ", status=" + this.status + ')';
    }
}
