package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AllMatchBean {
    private String gameId;
    private String match;
    private int pageSize;
    private String portalCode;
    private String userId;
    private String userToken;

    public AllMatchBean(String str, String str2, String str3, String str4, String str5, int i10) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, "gameId");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.match = str4;
        this.gameId = str5;
        this.pageSize = i10;
    }

    public static /* synthetic */ AllMatchBean copy$default(AllMatchBean allMatchBean, String str, String str2, String str3, String str4, String str5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = allMatchBean.userToken;
        }
        if ((i11 & 2) != 0) {
            str2 = allMatchBean.userId;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = allMatchBean.portalCode;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = allMatchBean.match;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = allMatchBean.gameId;
        }
        String str9 = str5;
        if ((i11 & 32) != 0) {
            i10 = allMatchBean.pageSize;
        }
        return allMatchBean.copy(str, str6, str7, str8, str9, i10);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.portalCode;
    }

    public final String component4() {
        return this.match;
    }

    public final String component5() {
        return this.gameId;
    }

    public final int component6() {
        return this.pageSize;
    }

    public final AllMatchBean copy(String str, String str2, String str3, String str4, String str5, int i10) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, "gameId");
        return new AllMatchBean(str, str2, str3, str4, str5, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllMatchBean)) {
            return false;
        }
        AllMatchBean allMatchBean = (AllMatchBean) obj;
        return AbstractC5868k.m23669a(this.userToken, allMatchBean.userToken) && AbstractC5868k.m23669a(this.userId, allMatchBean.userId) && AbstractC5868k.m23669a(this.portalCode, allMatchBean.portalCode) && AbstractC5868k.m23669a(this.match, allMatchBean.match) && AbstractC5868k.m23669a(this.gameId, allMatchBean.gameId) && this.pageSize == allMatchBean.pageSize;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getMatch() {
        return this.match;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.match.hashCode()) * 31) + this.gameId.hashCode()) * 31) + this.pageSize;
    }

    public final void setGameId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameId = str;
    }

    public final void setMatch(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.match = str;
    }

    public final void setPageSize(int i10) {
        this.pageSize = i10;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
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
        return "AllMatchBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", match=" + this.match + ", gameId=" + this.gameId + ", pageSize=" + this.pageSize + ')';
    }
}
