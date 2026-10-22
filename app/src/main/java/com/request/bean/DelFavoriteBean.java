package com.request.bean;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DelFavoriteBean implements Serializable {
    private List<Integer> delList;
    private String userId;
    private String userToken;

    public DelFavoriteBean(List<Integer> list, String str, String str2) {
        AbstractC5868k.m23674f(list, "delList");
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        this.delList = list;
        this.userToken = str;
        this.userId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DelFavoriteBean copy$default(DelFavoriteBean delFavoriteBean, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = delFavoriteBean.delList;
        }
        if ((i10 & 2) != 0) {
            str = delFavoriteBean.userToken;
        }
        if ((i10 & 4) != 0) {
            str2 = delFavoriteBean.userId;
        }
        return delFavoriteBean.copy(list, str, str2);
    }

    public final List<Integer> component1() {
        return this.delList;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.userId;
    }

    public final DelFavoriteBean copy(List<Integer> list, String str, String str2) {
        AbstractC5868k.m23674f(list, "delList");
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return new DelFavoriteBean(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelFavoriteBean)) {
            return false;
        }
        DelFavoriteBean delFavoriteBean = (DelFavoriteBean) obj;
        return AbstractC5868k.m23669a(this.delList, delFavoriteBean.delList) && AbstractC5868k.m23669a(this.userToken, delFavoriteBean.userToken) && AbstractC5868k.m23669a(this.userId, delFavoriteBean.userId);
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
        return (((this.delList.hashCode() * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
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
        return "DelFavoriteBean(delList=" + this.delList + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
