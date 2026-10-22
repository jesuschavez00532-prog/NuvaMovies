package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class TeamStat {
    private String cornerKicks;
    private String fouls;
    private String offsides;
    private String possession;
    private String redCards;
    private String saveS;
    private String shotCount;
    private String targetCount;
    private String yellowCards;

    public TeamStat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str, "fouls");
        AbstractC5868k.m23674f(str2, "yellowCards");
        AbstractC5868k.m23674f(str3, "redCards");
        AbstractC5868k.m23674f(str4, "offsides");
        AbstractC5868k.m23674f(str5, "cornerKicks");
        AbstractC5868k.m23674f(str6, "saveS");
        AbstractC5868k.m23674f(str7, "possession");
        AbstractC5868k.m23674f(str8, "shotCount");
        AbstractC5868k.m23674f(str9, "targetCount");
        this.fouls = str;
        this.yellowCards = str2;
        this.redCards = str3;
        this.offsides = str4;
        this.cornerKicks = str5;
        this.saveS = str6;
        this.possession = str7;
        this.shotCount = str8;
        this.targetCount = str9;
    }

    public final String component1() {
        return this.fouls;
    }

    public final String component2() {
        return this.yellowCards;
    }

    public final String component3() {
        return this.redCards;
    }

    public final String component4() {
        return this.offsides;
    }

    public final String component5() {
        return this.cornerKicks;
    }

    public final String component6() {
        return this.saveS;
    }

    public final String component7() {
        return this.possession;
    }

    public final String component8() {
        return this.shotCount;
    }

    public final String component9() {
        return this.targetCount;
    }

    public final TeamStat copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str, "fouls");
        AbstractC5868k.m23674f(str2, "yellowCards");
        AbstractC5868k.m23674f(str3, "redCards");
        AbstractC5868k.m23674f(str4, "offsides");
        AbstractC5868k.m23674f(str5, "cornerKicks");
        AbstractC5868k.m23674f(str6, "saveS");
        AbstractC5868k.m23674f(str7, "possession");
        AbstractC5868k.m23674f(str8, "shotCount");
        AbstractC5868k.m23674f(str9, "targetCount");
        return new TeamStat(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamStat)) {
            return false;
        }
        TeamStat teamStat = (TeamStat) obj;
        return AbstractC5868k.m23669a(this.fouls, teamStat.fouls) && AbstractC5868k.m23669a(this.yellowCards, teamStat.yellowCards) && AbstractC5868k.m23669a(this.redCards, teamStat.redCards) && AbstractC5868k.m23669a(this.offsides, teamStat.offsides) && AbstractC5868k.m23669a(this.cornerKicks, teamStat.cornerKicks) && AbstractC5868k.m23669a(this.saveS, teamStat.saveS) && AbstractC5868k.m23669a(this.possession, teamStat.possession) && AbstractC5868k.m23669a(this.shotCount, teamStat.shotCount) && AbstractC5868k.m23669a(this.targetCount, teamStat.targetCount);
    }

    public final String getCornerKicks() {
        return this.cornerKicks;
    }

    public final String getFouls() {
        return this.fouls;
    }

    public final String getOffsides() {
        return this.offsides;
    }

    public final String getPossession() {
        return this.possession;
    }

    public final String getRedCards() {
        return this.redCards;
    }

    public final String getSaveS() {
        return this.saveS;
    }

    public final String getShotCount() {
        return this.shotCount;
    }

    public final String getTargetCount() {
        return this.targetCount;
    }

    public final String getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        return (((((((((((((((this.fouls.hashCode() * 31) + this.yellowCards.hashCode()) * 31) + this.redCards.hashCode()) * 31) + this.offsides.hashCode()) * 31) + this.cornerKicks.hashCode()) * 31) + this.saveS.hashCode()) * 31) + this.possession.hashCode()) * 31) + this.shotCount.hashCode()) * 31) + this.targetCount.hashCode();
    }

    public final void setCornerKicks(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.cornerKicks = str;
    }

    public final void setFouls(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.fouls = str;
    }

    public final void setOffsides(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.offsides = str;
    }

    public final void setPossession(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.possession = str;
    }

    public final void setRedCards(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.redCards = str;
    }

    public final void setSaveS(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.saveS = str;
    }

    public final void setShotCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.shotCount = str;
    }

    public final void setTargetCount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.targetCount = str;
    }

    public final void setYellowCards(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.yellowCards = str;
    }

    public String toString() {
        return "TeamStat(fouls=" + this.fouls + ", yellowCards=" + this.yellowCards + ", redCards=" + this.redCards + ", offsides=" + this.offsides + ", cornerKicks=" + this.cornerKicks + ", saveS=" + this.saveS + ", possession=" + this.possession + ", shotCount=" + this.shotCount + ", targetCount=" + this.targetCount + ')';
    }
}
