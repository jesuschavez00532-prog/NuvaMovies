package com.live.p063db;

import java.util.ArrayList;
import ne.AbstractC5868k;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "reserve_match")
/* loaded from: classes2.dex */
public final class ReserveMatch {
    private ReserveTeam homeTeam;
    private ReserveTeam visitTeam;

    @Column(autoGen = false, isId = true, name = "gid")
    private String gameId = "";

    @Column(name = "game_time")
    private String gameTime = "";

    @Column(name = "mid")
    private String matchId = "";

    @Column(name = "match_name")
    private String matchName = "";

    @Column(name = "match_alias")
    private String matchAlias = "";
    private ArrayList<ReserveChannel> channels = new ArrayList<>();

    public final ArrayList<ReserveChannel> getChannels() {
        return this.channels;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameTime() {
        return this.gameTime;
    }

    public final ReserveTeam getHomeTeam() {
        return this.homeTeam;
    }

    public final String getMatchAlias() {
        return this.matchAlias;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getMatchName() {
        return this.matchName;
    }

    public final ReserveTeam getVisitTeam() {
        return this.visitTeam;
    }

    public final void setChannels(ArrayList<ReserveChannel> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.channels = arrayList;
    }

    public final void setGameId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameId = str;
    }

    public final void setGameTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gameTime = str;
    }

    public final void setHomeTeam(ReserveTeam reserveTeam) {
        this.homeTeam = reserveTeam;
    }

    public final void setMatchAlias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchAlias = str;
    }

    public final void setMatchId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchId = str;
    }

    public final void setMatchName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchName = str;
    }

    public final void setVisitTeam(ReserveTeam reserveTeam) {
        this.visitTeam = reserveTeam;
    }

    public String toString() {
        return "ReserveMatch(gameId='" + this.gameId + "', gameTime='" + this.gameTime + "', matchId='" + this.matchId + "', matchName='" + this.matchName + "',matchAlias='" + this.matchAlias + "', homeTeam=" + this.homeTeam + ", visitTeam=" + this.visitTeam + ", channels=" + this.channels + ')';
    }
}
