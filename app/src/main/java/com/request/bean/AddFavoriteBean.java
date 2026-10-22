package com.request.bean;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AddFavoriteBean implements Serializable {
    private String blFlag;
    private List<String> contentIdList;
    private String type;
    private String userId;
    private String userToken;

    public AddFavoriteBean(String str, List<String> list, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(list, "contentIdList");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "blFlag");
        this.type = str;
        this.contentIdList = list;
        this.userToken = str2;
        this.userId = str3;
        this.blFlag = str4;
    }

    public static /* synthetic */ AddFavoriteBean copy$default(AddFavoriteBean addFavoriteBean, String str, List list, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addFavoriteBean.type;
        }
        if ((i10 & 2) != 0) {
            list = addFavoriteBean.contentIdList;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            str2 = addFavoriteBean.userToken;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = addFavoriteBean.userId;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = addFavoriteBean.blFlag;
        }
        return addFavoriteBean.copy(str, list2, str5, str6, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final List<String> component2() {
        return this.contentIdList;
    }

    public final String component3() {
        return this.userToken;
    }

    public final String component4() {
        return this.userId;
    }

    public final String component5() {
        return this.blFlag;
    }

    public final AddFavoriteBean copy(String str, List<String> list, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(list, "contentIdList");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "blFlag");
        return new AddFavoriteBean(str, list, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoriteBean)) {
            return false;
        }
        AddFavoriteBean addFavoriteBean = (AddFavoriteBean) obj;
        return AbstractC5868k.m23669a(this.type, addFavoriteBean.type) && AbstractC5868k.m23669a(this.contentIdList, addFavoriteBean.contentIdList) && AbstractC5868k.m23669a(this.userToken, addFavoriteBean.userToken) && AbstractC5868k.m23669a(this.userId, addFavoriteBean.userId) && AbstractC5868k.m23669a(this.blFlag, addFavoriteBean.blFlag);
    }

    public final String getBlFlag() {
        return this.blFlag;
    }

    public final List<String> getContentIdList() {
        return this.contentIdList;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.contentIdList.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.blFlag.hashCode();
    }

    public final void setBlFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.blFlag = str;
    }

    public final void setContentIdList(List<String> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.contentIdList = list;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
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
        return "AddFavoriteBean(type=" + this.type + ", contentIdList=" + this.contentIdList + ", userToken=" + this.userToken + ", userId=" + this.userId + ", blFlag=" + this.blFlag + ')';
    }
}
