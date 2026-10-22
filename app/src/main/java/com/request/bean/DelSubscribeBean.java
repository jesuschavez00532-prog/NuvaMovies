package com.request.bean;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DelSubscribeBean {
    private List<Integer> delList;
    private String userId;
    private String userToken;

    public DelSubscribeBean(String str, String str2, List<Integer> list) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(list, "delList");
        this.userToken = str;
        this.userId = str2;
        this.delList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DelSubscribeBean copy$default(DelSubscribeBean delSubscribeBean, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = delSubscribeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = delSubscribeBean.userId;
        }
        if ((i10 & 4) != 0) {
            list = delSubscribeBean.delList;
        }
        return delSubscribeBean.copy(str, str2, list);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final List<Integer> component3() {
        return this.delList;
    }

    public final DelSubscribeBean copy(String str, String str2, List<Integer> list) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(list, "delList");
        return new DelSubscribeBean(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelSubscribeBean)) {
            return false;
        }
        DelSubscribeBean delSubscribeBean = (DelSubscribeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, delSubscribeBean.userToken) && AbstractC5868k.m23669a(this.userId, delSubscribeBean.userId) && AbstractC5868k.m23669a(this.delList, delSubscribeBean.delList);
    }

    public final List<Integer> getDelList() {
        return this.delList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.delList.hashCode();
    }

    public final void setDelList(List<Integer> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.delList = list;
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
        return "DelSubscribeBean(userToken=" + this.userToken + ", userId=" + this.userId + ", delList=" + this.delList + ')';
    }
}
