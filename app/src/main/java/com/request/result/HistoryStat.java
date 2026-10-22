package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class HistoryStat {
    private String gameTime;
    private String league;
    private String score;
    private String team_a_name;
    private String team_b_name;

    public HistoryStat(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "team_a_name");
        AbstractC5868k.m23674f(str2, "team_b_name");
        AbstractC5868k.m23674f(str3, "gameTime");
        AbstractC5868k.m23674f(str4, "league");
        AbstractC5868k.m23674f(str5, "score");
        this.team_a_name = str;
        this.team_b_name = str2;
        this.gameTime = str3;
        this.league = str4;
        this.score = str5;
    }

    public static /* synthetic */ HistoryStat copy$default(HistoryStat historyStat, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = historyStat.team_a_name;
        }
        if ((i10 & 2) != 0) {
            str2 = historyStat.team_b_name;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = historyStat.gameTime;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = historyStat.league;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = historyStat.score;
        }
        return historyStat.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.team_a_name;
    }

    public final String component2() {
        return this.team_b_name;
    }

    public final String component3() {
        return this.gameTime;
    }

    public final String component4() {
        return this.league;
    }

    public final String component5() {
        return this.score;
    }

    public final HistoryStat copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "team_a_name");
        AbstractC5868k.m23674f(str2, "team_b_name");
        AbstractC5868k.m23674f(str3, "gameTime");
        AbstractC5868k.m23674f(str4, "league");
        AbstractC5868k.m23674f(str5, "score");
        return new HistoryStat(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryStat)) {
            return false;
        }
        HistoryStat historyStat = (HistoryStat) obj;
        return AbstractC5868k.m23669a(this.team_a_name, historyStat.team_a_name) && AbstractC5868k.m23669a(this.team_b_name, historyStat.team_b_name) && AbstractC5868k.m23669a(this.gameTime, historyStat.gameTime) && AbstractC5868k.m23669a(this.league, historyStat.league) && AbstractC5868k.m23669a(this.score, historyStat.score);
    }

    public final String getGameTime() {
        return this.gameTime;
    }

    public final String getLeague() {
        return this.league;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getTeam_a_name() {
        return this.team_a_name;
    }

    public final String getTeam_b_name() {
        return this.team_b_name;
    }

    public int hashCode() {
        return (((((((this.team_a_name.hashCode() * 31) + this.team_b_name.hashCode()) * 31) + this.gameTime.hashCode()) * 31) + this.league.hashCode()) * 31) + this.score.hashCode();
    }

    public final void setGameTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameTime = str;
    }

    public final void setLeague(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.league = str;
    }

    public final void setScore(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.score = str;
    }

    public final void setTeam_a_name(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.team_a_name = str;
    }

    public final void setTeam_b_name(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.team_b_name = str;
    }

    public String toString() {
        return "HistoryStat(team_a_name=" + this.team_a_name + ", team_b_name=" + this.team_b_name + ", gameTime=" + this.gameTime + ", league=" + this.league + ", score=" + this.score + ')';
    }
}
