package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class LineupBean {
    private String gameId;
    private String portalCode;
    private String userId;
    private String userToken;

    public LineupBean(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "gameId");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.gameId = str4;
    }

    public static /* synthetic */ LineupBean copy$default(LineupBean lineupBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lineupBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = lineupBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = lineupBean.portalCode;
        }
        if ((i10 & 8) != 0) {
            str4 = lineupBean.gameId;
        }
        return lineupBean.copy(str, str2, str3, str4);
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
        return this.gameId;
    }

    public final LineupBean copy(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "gameId");
        return new LineupBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineupBean)) {
            return false;
        }
        LineupBean lineupBean = (LineupBean) obj;
        return AbstractC5868k.m23669a(this.userToken, lineupBean.userToken) && AbstractC5868k.m23669a(this.userId, lineupBean.userId) && AbstractC5868k.m23669a(this.portalCode, lineupBean.portalCode) && AbstractC5868k.m23669a(this.gameId, lineupBean.gameId);
    }

    public final String getGameId() {
        return this.gameId;
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
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.gameId.hashCode();
    }

    public final void setGameId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameId = str;
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
        return "LineupBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", gameId=" + this.gameId + ')';
    }
}
