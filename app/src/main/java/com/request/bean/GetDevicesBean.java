package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetDevicesBean implements Serializable {
    private final String token;
    private final String userId;

    public GetDevicesBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "token");
        AbstractC5868k.m23674f(str2, "userId");
        this.token = str;
        this.userId = str2;
    }

    public static /* synthetic */ GetDevicesBean copy$default(GetDevicesBean getDevicesBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getDevicesBean.token;
        }
        if ((i10 & 2) != 0) {
            str2 = getDevicesBean.userId;
        }
        return getDevicesBean.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.userId;
    }

    public final GetDevicesBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "token");
        AbstractC5868k.m23674f(str2, "userId");
        return new GetDevicesBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDevicesBean)) {
            return false;
        }
        GetDevicesBean getDevicesBean = (GetDevicesBean) obj;
        return AbstractC5868k.m23669a(this.token, getDevicesBean.token) && AbstractC5868k.m23669a(this.userId, getDevicesBean.userId);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "GetDevicesBean(token=" + this.token + ", userId=" + this.userId + ')';
    }
}
