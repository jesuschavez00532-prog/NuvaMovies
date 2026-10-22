package com.request.bean;

import com.lzy.okgo.model.Progress;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class FootballMatchBean {
    private String date;
    private String gameId;
    private String match;
    private String portalCode;
    private String userId;
    private String userToken;

    public FootballMatchBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, Progress.DATE);
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.match = str4;
        this.date = str5;
        this.gameId = str6;
    }

    public static /* synthetic */ FootballMatchBean copy$default(FootballMatchBean footballMatchBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footballMatchBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = footballMatchBean.userId;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = footballMatchBean.portalCode;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = footballMatchBean.match;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = footballMatchBean.date;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = footballMatchBean.gameId;
        }
        return footballMatchBean.copy(str, str7, str8, str9, str10, str6);
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
        return this.date;
    }

    public final String component6() {
        return this.gameId;
    }

    public final FootballMatchBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, Progress.DATE);
        return new FootballMatchBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootballMatchBean)) {
            return false;
        }
        FootballMatchBean footballMatchBean = (FootballMatchBean) obj;
        return AbstractC5868k.m23669a(this.userToken, footballMatchBean.userToken) && AbstractC5868k.m23669a(this.userId, footballMatchBean.userId) && AbstractC5868k.m23669a(this.portalCode, footballMatchBean.portalCode) && AbstractC5868k.m23669a(this.match, footballMatchBean.match) && AbstractC5868k.m23669a(this.date, footballMatchBean.date) && AbstractC5868k.m23669a(this.gameId, footballMatchBean.gameId);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getMatch() {
        return this.match;
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
        int hashCode = ((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.match.hashCode()) * 31) + this.date.hashCode()) * 31;
        String str = this.gameId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setDate(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.date = str;
    }

    public final void setGameId(String str) {
        this.gameId = str;
    }

    public final void setMatch(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.match = str;
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
        return "FootballMatchBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", match=" + this.match + ", date=" + this.date + ", gameId=" + this.gameId + ')';
    }

    public /* synthetic */ FootballMatchBean(String str, String str2, String str3, String str4, String str5, String str6, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? null : str6);
    }
}
