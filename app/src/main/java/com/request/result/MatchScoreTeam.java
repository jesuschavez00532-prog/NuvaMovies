package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchScoreTeam {
    private String concedeCount;
    private String drawCount;
    private String gameCount;
    private String goalCount;
    private String goalDifference;
    private String isLight;
    private String logo;
    private String lossCount;
    private String point;
    private String teamName;
    private String winCount;

    public MatchScoreTeam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC5868k.m23674f(str, "teamName");
        AbstractC5868k.m23674f(str2, "logo");
        AbstractC5868k.m23674f(str3, "gameCount");
        AbstractC5868k.m23674f(str4, "winCount");
        AbstractC5868k.m23674f(str5, "drawCount");
        AbstractC5868k.m23674f(str6, "lossCount");
        AbstractC5868k.m23674f(str7, "goalCount");
        AbstractC5868k.m23674f(str8, "concedeCount");
        AbstractC5868k.m23674f(str9, "goalDifference");
        AbstractC5868k.m23674f(str10, "point");
        AbstractC5868k.m23674f(str11, "isLight");
        this.teamName = str;
        this.logo = str2;
        this.gameCount = str3;
        this.winCount = str4;
        this.drawCount = str5;
        this.lossCount = str6;
        this.goalCount = str7;
        this.concedeCount = str8;
        this.goalDifference = str9;
        this.point = str10;
        this.isLight = str11;
    }

    public final String component1() {
        return this.teamName;
    }

    public final String component10() {
        return this.point;
    }

    public final String component11() {
        return this.isLight;
    }

    public final String component2() {
        return this.logo;
    }

    public final String component3() {
        return this.gameCount;
    }

    public final String component4() {
        return this.winCount;
    }

    public final String component5() {
        return this.drawCount;
    }

    public final String component6() {
        return this.lossCount;
    }

    public final String component7() {
        return this.goalCount;
    }

    public final String component8() {
        return this.concedeCount;
    }

    public final String component9() {
        return this.goalDifference;
    }

    public final MatchScoreTeam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC5868k.m23674f(str, "teamName");
        AbstractC5868k.m23674f(str2, "logo");
        AbstractC5868k.m23674f(str3, "gameCount");
        AbstractC5868k.m23674f(str4, "winCount");
        AbstractC5868k.m23674f(str5, "drawCount");
        AbstractC5868k.m23674f(str6, "lossCount");
        AbstractC5868k.m23674f(str7, "goalCount");
        AbstractC5868k.m23674f(str8, "concedeCount");
        AbstractC5868k.m23674f(str9, "goalDifference");
        AbstractC5868k.m23674f(str10, "point");
        AbstractC5868k.m23674f(str11, "isLight");
        return new MatchScoreTeam(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchScoreTeam)) {
            return false;
        }
        MatchScoreTeam matchScoreTeam = (MatchScoreTeam) obj;
        return AbstractC5868k.m23669a(this.teamName, matchScoreTeam.teamName) && AbstractC5868k.m23669a(this.logo, matchScoreTeam.logo) && AbstractC5868k.m23669a(this.gameCount, matchScoreTeam.gameCount) && AbstractC5868k.m23669a(this.winCount, matchScoreTeam.winCount) && AbstractC5868k.m23669a(this.drawCount, matchScoreTeam.drawCount) && AbstractC5868k.m23669a(this.lossCount, matchScoreTeam.lossCount) && AbstractC5868k.m23669a(this.goalCount, matchScoreTeam.goalCount) && AbstractC5868k.m23669a(this.concedeCount, matchScoreTeam.concedeCount) && AbstractC5868k.m23669a(this.goalDifference, matchScoreTeam.goalDifference) && AbstractC5868k.m23669a(this.point, matchScoreTeam.point) && AbstractC5868k.m23669a(this.isLight, matchScoreTeam.isLight);
    }

    public final String getConcedeCount() {
        return this.concedeCount;
    }

    public final String getDrawCount() {
        return this.drawCount;
    }

    public final String getGameCount() {
        return this.gameCount;
    }

    public final String getGoalCount() {
        return this.goalCount;
    }

    public final String getGoalDifference() {
        return this.goalDifference;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getLossCount() {
        return this.lossCount;
    }

    public final String getPoint() {
        return this.point;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final String getWinCount() {
        return this.winCount;
    }

    public int hashCode() {
        return (((((((((((((((((((this.teamName.hashCode() * 31) + this.logo.hashCode()) * 31) + this.gameCount.hashCode()) * 31) + this.winCount.hashCode()) * 31) + this.drawCount.hashCode()) * 31) + this.lossCount.hashCode()) * 31) + this.goalCount.hashCode()) * 31) + this.concedeCount.hashCode()) * 31) + this.goalDifference.hashCode()) * 31) + this.point.hashCode()) * 31) + this.isLight.hashCode();
    }

    public final String isLight() {
        return this.isLight;
    }

    public final void setConcedeCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.concedeCount = str;
    }

    public final void setDrawCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.drawCount = str;
    }

    public final void setGameCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameCount = str;
    }

    public final void setGoalCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.goalCount = str;
    }

    public final void setGoalDifference(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.goalDifference = str;
    }

    public final void setLight(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.isLight = str;
    }

    public final void setLogo(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.logo = str;
    }

    public final void setLossCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lossCount = str;
    }

    public final void setPoint(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.point = str;
    }

    public final void setTeamName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamName = str;
    }

    public final void setWinCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.winCount = str;
    }

    public String toString() {
        return "MatchScoreTeam(teamName=" + this.teamName + ", logo=" + this.logo + ", gameCount=" + this.gameCount + ", winCount=" + this.winCount + ", drawCount=" + this.drawCount + ", lossCount=" + this.lossCount + ", goalCount=" + this.goalCount + ", concedeCount=" + this.concedeCount + ", goalDifference=" + this.goalDifference + ", point=" + this.point + ", isLight=" + this.isLight + ')';
    }
}
