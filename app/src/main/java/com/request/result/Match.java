package com.request.result;

import java.io.Serializable;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p201k2.AbstractC5086c;
import p317rb.AbstractC6567a;

/* loaded from: classes.dex */
public final class Match implements Serializable {
    private String channelCode;
    private ArrayList<MatchChannel> channelInfoList;
    private String channelName;
    private String gameId;
    private String gameStatus;
    private String gameTime;
    private boolean isInFifteenMinutes;
    private boolean isInTenMinutes;
    private boolean isSubscribed;
    private String matchAlias;
    private String matchId;
    private String matchLogo;
    private String matchName;
    private String playBackType;
    private String playBackUrl;
    private String score;
    private Team team_a;
    private Team team_b;

    public Match(String str, Team team, Team team2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList<MatchChannel> arrayList) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC5868k.m23674f(team, "team_a");
        AbstractC5868k.m23674f(team2, "team_b");
        AbstractC5868k.m23674f(str2, "matchId");
        AbstractC5868k.m23674f(str3, "matchName");
        AbstractC5868k.m23674f(str4, "matchAlias");
        AbstractC5868k.m23674f(str6, "channelName");
        AbstractC5868k.m23674f(str7, "channelCode");
        AbstractC5868k.m23674f(str10, "gameTime");
        AbstractC5868k.m23674f(str11, "score");
        AbstractC5868k.m23674f(str12, "gameStatus");
        AbstractC5868k.m23674f(arrayList, "channelInfoList");
        this.gameId = str;
        this.team_a = team;
        this.team_b = team2;
        this.matchId = str2;
        this.matchName = str3;
        this.matchAlias = str4;
        this.matchLogo = str5;
        this.channelName = str6;
        this.channelCode = str7;
        this.playBackType = str8;
        this.playBackUrl = str9;
        this.gameTime = str10;
        this.score = str11;
        this.gameStatus = str12;
        this.channelInfoList = arrayList;
    }

    public final boolean calcInFifteenMinutes() {
        String m20616i = AbstractC5086c.m20616i("yyyy-MM-dd HH:mm");
        String m20620m = AbstractC5086c.m20620m("yyyy-MM-dd HH:mm", 900000L);
        if (m20616i.compareTo(this.gameTime) < 0 && m20620m.compareTo(this.gameTime) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean calcInTenMinutes() {
        String m20616i = AbstractC5086c.m20616i("yyyy-MM-dd HH:mm");
        String m20620m = AbstractC5086c.m20620m("yyyy-MM-dd HH:mm", 600000L);
        if (m20616i.compareTo(this.gameTime) < 0 && m20620m.compareTo(this.gameTime) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean calcOutFifteenMinutes() {
        String m20616i = AbstractC5086c.m20616i("yyyy-MM-dd HH:mm");
        String m20620m = AbstractC5086c.m20620m("yyyy-MM-dd HH:mm", 900000L);
        if (m20616i.compareTo(this.gameTime) < 0 && m20620m.compareTo(this.gameTime) < 0) {
            return true;
        }
        return false;
    }

    public final boolean compareToGameTime() {
        if (AbstractC5086c.m20616i("yyyy-MM-dd HH:mm").compareTo(this.gameTime) < 0) {
            return true;
        }
        return false;
    }

    public final String component1() {
        return this.gameId;
    }

    public final String component10() {
        return this.playBackType;
    }

    public final String component11() {
        return this.playBackUrl;
    }

    public final String component12() {
        return this.gameTime;
    }

    public final String component13() {
        return this.score;
    }

    public final String component14() {
        return this.gameStatus;
    }

    public final ArrayList<MatchChannel> component15() {
        return this.channelInfoList;
    }

    public final Team component2() {
        return this.team_a;
    }

    public final Team component3() {
        return this.team_b;
    }

    public final String component4() {
        return this.matchId;
    }

    public final String component5() {
        return this.matchName;
    }

    public final String component6() {
        return this.matchAlias;
    }

    public final String component7() {
        return this.matchLogo;
    }

    public final String component8() {
        return this.channelName;
    }

    public final String component9() {
        return this.channelCode;
    }

    public final Match copy(String str, Team team, Team team2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList<MatchChannel> arrayList) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC5868k.m23674f(team, "team_a");
        AbstractC5868k.m23674f(team2, "team_b");
        AbstractC5868k.m23674f(str2, "matchId");
        AbstractC5868k.m23674f(str3, "matchName");
        AbstractC5868k.m23674f(str4, "matchAlias");
        AbstractC5868k.m23674f(str6, "channelName");
        AbstractC5868k.m23674f(str7, "channelCode");
        AbstractC5868k.m23674f(str10, "gameTime");
        AbstractC5868k.m23674f(str11, "score");
        AbstractC5868k.m23674f(str12, "gameStatus");
        AbstractC5868k.m23674f(arrayList, "channelInfoList");
        return new Match(str, team, team2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        return AbstractC5868k.m23669a(this.gameId, match.gameId) && AbstractC5868k.m23669a(this.team_a, match.team_a) && AbstractC5868k.m23669a(this.team_b, match.team_b) && AbstractC5868k.m23669a(this.matchId, match.matchId) && AbstractC5868k.m23669a(this.matchName, match.matchName) && AbstractC5868k.m23669a(this.matchAlias, match.matchAlias) && AbstractC5868k.m23669a(this.matchLogo, match.matchLogo) && AbstractC5868k.m23669a(this.channelName, match.channelName) && AbstractC5868k.m23669a(this.channelCode, match.channelCode) && AbstractC5868k.m23669a(this.playBackType, match.playBackType) && AbstractC5868k.m23669a(this.playBackUrl, match.playBackUrl) && AbstractC5868k.m23669a(this.gameTime, match.gameTime) && AbstractC5868k.m23669a(this.score, match.score) && AbstractC5868k.m23669a(this.gameStatus, match.gameStatus) && AbstractC5868k.m23669a(this.channelInfoList, match.channelInfoList);
    }

    public final boolean findFirstChannel() {
        MatchChannel firstChannel = getFirstChannel();
        if (firstChannel == null || !AbstractC6567a.m25637g(firstChannel.getChannelCode()) || !AbstractC6567a.m25637g(firstChannel.getChannelName())) {
            return false;
        }
        return true;
    }

    public final boolean findTeamEvent() {
        if (!AbstractC6567a.m25638h(this.team_a.getTeamEvent()) && !AbstractC6567a.m25638h(this.team_b.getTeamEvent())) {
            return false;
        }
        return true;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final ArrayList<MatchChannel> getChannelInfoList() {
        return this.channelInfoList;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final MatchChannel getFirstChannel() {
        if (AbstractC6567a.m25635e(this.channelInfoList)) {
            return null;
        }
        return this.channelInfoList.get(0);
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameStatus() {
        return this.gameStatus;
    }

    public final String getGameTime() {
        return this.gameTime;
    }

    public final String getMatchAlias() {
        return this.matchAlias;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getMatchLogo() {
        return this.matchLogo;
    }

    public final String getMatchName() {
        return this.matchName;
    }

    public final String getPlayBackType() {
        return this.playBackType;
    }

    public final String getPlayBackUrl() {
        return this.playBackUrl;
    }

    public final String getScore() {
        return this.score;
    }

    public final Team getTeam_a() {
        return this.team_a;
    }

    public final Team getTeam_b() {
        return this.team_b;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.gameId.hashCode() * 31) + this.team_a.hashCode()) * 31) + this.team_b.hashCode()) * 31) + this.matchId.hashCode()) * 31) + this.matchName.hashCode()) * 31) + this.matchAlias.hashCode()) * 31;
        String str = this.matchLogo;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.channelName.hashCode()) * 31) + this.channelCode.hashCode()) * 31;
        String str2 = this.playBackType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.playBackUrl;
        return ((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.gameTime.hashCode()) * 31) + this.score.hashCode()) * 31) + this.gameStatus.hashCode()) * 31) + this.channelInfoList.hashCode();
    }

    public final boolean isGameEnd() {
        return AbstractC5868k.m23669a(this.gameStatus, "3");
    }

    public final boolean isGameOnGoing() {
        String m20616i = AbstractC5086c.m20616i("yyyy-MM-dd HH:mm");
        if ((AbstractC5868k.m23669a(this.gameStatus, "2") || (AbstractC5868k.m23669a(this.gameStatus, "1") && m20616i.compareTo(this.gameTime) >= 0)) && !isGameOut()) {
            return true;
        }
        return false;
    }

    public final boolean isGameOut() {
        String m20620m = AbstractC5086c.m20620m("yyyy-MM-dd HH:mm", -10800000L);
        String str = this.gameTime;
        AbstractC5868k.m23673e(m20620m, "inThreeHours");
        if (str.compareTo(m20620m) < 0) {
            return true;
        }
        return false;
    }

    public final boolean isGameReadied() {
        if (AbstractC5868k.m23669a(this.gameStatus, "1") && calcInFifteenMinutes()) {
            return true;
        }
        return false;
    }

    public final boolean isInFifteenMinutes() {
        return this.isInFifteenMinutes;
    }

    public final boolean isInTenMinutes() {
        return this.isInTenMinutes;
    }

    public final boolean isNotStarted() {
        if (AbstractC5868k.m23669a(this.gameStatus, "1") && compareToGameTime()) {
            return true;
        }
        return false;
    }

    public final boolean isStartGame() {
        if (!AbstractC5868k.m23669a(this.gameStatus, "1") && !AbstractC5868k.m23669a(this.gameStatus, "2")) {
            return false;
        }
        return true;
    }

    public final boolean isSubscribe() {
        if (AbstractC5868k.m23669a(this.gameStatus, "1") && calcOutFifteenMinutes() && findFirstChannel()) {
            return true;
        }
        return false;
    }

    public final boolean isSubscribeWithoutChannel() {
        if (AbstractC5868k.m23669a(this.gameStatus, "1") && calcOutFifteenMinutes()) {
            return true;
        }
        return false;
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setChannelInfoList(ArrayList<MatchChannel> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.channelInfoList = arrayList;
    }

    public final void setChannelName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelName = str;
    }

    public final void setGameId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameId = str;
    }

    public final void setGameStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameStatus = str;
    }

    public final void setGameTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameTime = str;
    }

    public final void setInFifteenMinutes(boolean z10) {
        this.isInFifteenMinutes = z10;
    }

    public final void setInTenMinutes(boolean z10) {
        this.isInTenMinutes = z10;
    }

    public final void setMatchAlias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchAlias = str;
    }

    public final void setMatchId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchId = str;
    }

    public final void setMatchLogo(String str) {
        this.matchLogo = str;
    }

    public final void setMatchName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchName = str;
    }

    public final void setPlayBackType(String str) {
        this.playBackType = str;
    }

    public final void setPlayBackUrl(String str) {
        this.playBackUrl = str;
    }

    public final void setScore(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.score = str;
    }

    public final void setSubscribed(boolean z10) {
        this.isSubscribed = z10;
    }

    public final void setTeam_a(Team team) {
        AbstractC5868k.m23674f(team, "<set-?>");
        this.team_a = team;
    }

    public final void setTeam_b(Team team) {
        AbstractC5868k.m23674f(team, "<set-?>");
        this.team_b = team;
    }

    public String toString() {
        return "Match(gameId=" + this.gameId + ", team_a=" + this.team_a + ", team_b=" + this.team_b + ", matchId=" + this.matchId + ", matchName=" + this.matchName + ", matchAlias=" + this.matchAlias + ", matchLogo=" + this.matchLogo + ", channelName=" + this.channelName + ", channelCode=" + this.channelCode + ", playBackType=" + this.playBackType + ", playBackUrl=" + this.playBackUrl + ", gameTime=" + this.gameTime + ", score=" + this.score + ", gameStatus=" + this.gameStatus + ", channelInfoList=" + this.channelInfoList + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Match(Team team) {
        this("", team, team, "", "", "", "", "", "", "", "", "", "", "", new ArrayList());
        AbstractC5868k.m23674f(team, "team");
    }
}
