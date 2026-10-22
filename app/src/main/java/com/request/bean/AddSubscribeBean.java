package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AddSubscribeBean {
    private String contentId;
    private String type;
    private String userId;
    private String userToken;

    public AddSubscribeBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "contentId");
        this.userToken = str;
        this.userId = str2;
        this.type = str3;
        this.contentId = str4;
    }

    public static /* synthetic */ AddSubscribeBean copy$default(AddSubscribeBean addSubscribeBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addSubscribeBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = addSubscribeBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = addSubscribeBean.type;
        }
        if ((i10 & 8) != 0) {
            str4 = addSubscribeBean.contentId;
        }
        return addSubscribeBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.contentId;
    }

    public final AddSubscribeBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "contentId");
        return new AddSubscribeBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddSubscribeBean)) {
            return false;
        }
        AddSubscribeBean addSubscribeBean = (AddSubscribeBean) obj;
        return AbstractC5868k.m23669a(this.userToken, addSubscribeBean.userToken) && AbstractC5868k.m23669a(this.userId, addSubscribeBean.userId) && AbstractC5868k.m23669a(this.type, addSubscribeBean.type) && AbstractC5868k.m23669a(this.contentId, addSubscribeBean.contentId);
    }

    public final String getContentId() {
        return this.contentId;
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
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.contentId.hashCode();
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
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
        return "AddSubscribeBean(userToken=" + this.userToken + ", userId=" + this.userId + ", type=" + this.type + ", contentId=" + this.contentId + ')';
    }
}
