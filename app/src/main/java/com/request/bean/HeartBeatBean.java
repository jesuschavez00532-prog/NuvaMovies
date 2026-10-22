package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class HeartBeatBean implements Serializable {
    private String userId;
    private String userToken;

    public HeartBeatBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        this.userToken = str;
        this.userId = str2;
    }

    public static /* synthetic */ HeartBeatBean copy$default(HeartBeatBean heartBeatBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = heartBeatBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = heartBeatBean.userId;
        }
        return heartBeatBean.copy(str, str2);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final HeartBeatBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return new HeartBeatBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartBeatBean)) {
            return false;
        }
        HeartBeatBean heartBeatBean = (HeartBeatBean) obj;
        return AbstractC5868k.m23669a(this.userToken, heartBeatBean.userToken) && AbstractC5868k.m23669a(this.userId, heartBeatBean.userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (this.userToken.hashCode() * 31) + this.userId.hashCode();
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
        return "HeartBeatBean(userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
