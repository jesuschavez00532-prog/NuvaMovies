package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class MatchScoreBoardBean {
    private String match;
    private String portalCode;
    private String teamAName;
    private String teamBName;
    private String userId;
    private String userToken;

    public MatchScoreBoardBean(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, "teamAName");
        AbstractC5868k.m23674f(str6, "teamBName");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.match = str4;
        this.teamAName = str5;
        this.teamBName = str6;
    }

    public static /* synthetic */ MatchScoreBoardBean copy$default(MatchScoreBoardBean matchScoreBoardBean, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchScoreBoardBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = matchScoreBoardBean.userId;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = matchScoreBoardBean.portalCode;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = matchScoreBoardBean.match;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = matchScoreBoardBean.teamAName;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = matchScoreBoardBean.teamBName;
        }
        return matchScoreBoardBean.copy(str, str7, str8, str9, str10, str6);
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
        return this.teamAName;
    }

    public final String component6() {
        return this.teamBName;
    }

    public final MatchScoreBoardBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "match");
        AbstractC5868k.m23674f(str5, "teamAName");
        AbstractC5868k.m23674f(str6, "teamBName");
        return new MatchScoreBoardBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchScoreBoardBean)) {
            return false;
        }
        MatchScoreBoardBean matchScoreBoardBean = (MatchScoreBoardBean) obj;
        return AbstractC5868k.m23669a(this.userToken, matchScoreBoardBean.userToken) && AbstractC5868k.m23669a(this.userId, matchScoreBoardBean.userId) && AbstractC5868k.m23669a(this.portalCode, matchScoreBoardBean.portalCode) && AbstractC5868k.m23669a(this.match, matchScoreBoardBean.match) && AbstractC5868k.m23669a(this.teamAName, matchScoreBoardBean.teamAName) && AbstractC5868k.m23669a(this.teamBName, matchScoreBoardBean.teamBName);
    }

    public final String getMatch() {
        return this.match;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getTeamAName() {
        return this.teamAName;
    }

    public final String getTeamBName() {
        return this.teamBName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.match.hashCode()) * 31) + this.teamAName.hashCode()) * 31) + this.teamBName.hashCode();
    }

    public final void setMatch(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.match = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setTeamAName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamAName = str;
    }

    public final void setTeamBName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamBName = str;
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
        return "MatchScoreBoardBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", match=" + this.match + ", teamAName=" + this.teamAName + ", teamBName=" + this.teamBName + ')';
    }
}
