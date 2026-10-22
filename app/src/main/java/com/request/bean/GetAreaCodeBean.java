package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetAreaCodeBean {
    private String userId;
    private String userToken;

    public GetAreaCodeBean(String str, String str2) {
        this.userToken = str;
        this.userId = str2;
    }

    public static /* synthetic */ GetAreaCodeBean copy$default(GetAreaCodeBean getAreaCodeBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAreaCodeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getAreaCodeBean.userId;
        }
        return getAreaCodeBean.copy(str, str2);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final GetAreaCodeBean copy(String str, String str2) {
        return new GetAreaCodeBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAreaCodeBean)) {
            return false;
        }
        GetAreaCodeBean getAreaCodeBean = (GetAreaCodeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getAreaCodeBean.userToken) && AbstractC5868k.m23669a(this.userId, getAreaCodeBean.userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        String str = this.userToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public String toString() {
        return "GetAreaCodeBean(userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
