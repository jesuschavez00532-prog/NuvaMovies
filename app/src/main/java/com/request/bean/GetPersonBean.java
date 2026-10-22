package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetPersonBean {
    private String contentId;
    private String imdb;
    private String macAddr;
    private String type;
    private String userId;
    private String userToken;

    public GetPersonBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "contentId");
        AbstractC5868k.m23674f(str4, "imdb");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "macAddr");
        this.userToken = str;
        this.userId = str2;
        this.contentId = str3;
        this.imdb = str4;
        this.type = str5;
        this.macAddr = str6;
    }

    public static /* synthetic */ GetPersonBean copy$default(GetPersonBean getPersonBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getPersonBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getPersonBean.userId;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = getPersonBean.contentId;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = getPersonBean.imdb;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = getPersonBean.type;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = getPersonBean.macAddr;
        }
        return getPersonBean.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.contentId;
    }

    public final String component4() {
        return this.imdb;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.macAddr;
    }

    public final GetPersonBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "contentId");
        AbstractC5868k.m23674f(str4, "imdb");
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "macAddr");
        return new GetPersonBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPersonBean)) {
            return false;
        }
        GetPersonBean getPersonBean = (GetPersonBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getPersonBean.userToken) && AbstractC5868k.m23669a(this.userId, getPersonBean.userId) && AbstractC5868k.m23669a(this.contentId, getPersonBean.contentId) && AbstractC5868k.m23669a(this.imdb, getPersonBean.imdb) && AbstractC5868k.m23669a(this.type, getPersonBean.type) && AbstractC5868k.m23669a(this.macAddr, getPersonBean.macAddr);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getImdb() {
        return this.imdb;
    }

    public final String getMacAddr() {
        return this.macAddr;
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
        return (((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.imdb.hashCode()) * 31) + this.type.hashCode()) * 31) + this.macAddr.hashCode();
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setImdb(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.imdb = str;
    }

    public final void setMacAddr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.macAddr = str;
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
        return "GetPersonBean(userToken=" + this.userToken + ", userId=" + this.userId + ", contentId=" + this.contentId + ", imdb=" + this.imdb + ", type=" + this.type + ", macAddr=" + this.macAddr + ')';
    }
}
