package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LineupTeam {
    private LineupPlayer goalkeeper;
    private ArrayList<ArrayList<LineupPlayer>> playerList;
    private String squad;
    private int teamId;

    public LineupTeam(int i10, String str, LineupPlayer lineupPlayer, ArrayList<ArrayList<LineupPlayer>> arrayList) {
        AbstractC5868k.m23674f(str, "squad");
        AbstractC5868k.m23674f(lineupPlayer, "goalkeeper");
        AbstractC5868k.m23674f(arrayList, "playerList");
        this.teamId = i10;
        this.squad = str;
        this.goalkeeper = lineupPlayer;
        this.playerList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineupTeam copy$default(LineupTeam lineupTeam, int i10, String str, LineupPlayer lineupPlayer, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = lineupTeam.teamId;
        }
        if ((i11 & 2) != 0) {
            str = lineupTeam.squad;
        }
        if ((i11 & 4) != 0) {
            lineupPlayer = lineupTeam.goalkeeper;
        }
        if ((i11 & 8) != 0) {
            arrayList = lineupTeam.playerList;
        }
        return lineupTeam.copy(i10, str, lineupPlayer, arrayList);
    }

    public final int component1() {
        return this.teamId;
    }

    public final String component2() {
        return this.squad;
    }

    public final LineupPlayer component3() {
        return this.goalkeeper;
    }

    public final ArrayList<ArrayList<LineupPlayer>> component4() {
        return this.playerList;
    }

    public final LineupTeam copy(int i10, String str, LineupPlayer lineupPlayer, ArrayList<ArrayList<LineupPlayer>> arrayList) {
        AbstractC5868k.m23674f(str, "squad");
        AbstractC5868k.m23674f(lineupPlayer, "goalkeeper");
        AbstractC5868k.m23674f(arrayList, "playerList");
        return new LineupTeam(i10, str, lineupPlayer, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineupTeam)) {
            return false;
        }
        LineupTeam lineupTeam = (LineupTeam) obj;
        return this.teamId == lineupTeam.teamId && AbstractC5868k.m23669a(this.squad, lineupTeam.squad) && AbstractC5868k.m23669a(this.goalkeeper, lineupTeam.goalkeeper) && AbstractC5868k.m23669a(this.playerList, lineupTeam.playerList);
    }

    public final LineupPlayer getGoalkeeper() {
        return this.goalkeeper;
    }

    public final ArrayList<ArrayList<LineupPlayer>> getPlayerList() {
        return this.playerList;
    }

    public final String getSquad() {
        return this.squad;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        return (((((this.teamId * 31) + this.squad.hashCode()) * 31) + this.goalkeeper.hashCode()) * 31) + this.playerList.hashCode();
    }

    public final void setGoalkeeper(LineupPlayer lineupPlayer) {
        AbstractC5868k.m23674f(lineupPlayer, "<set-?>");
        this.goalkeeper = lineupPlayer;
    }

    public final void setPlayerList(ArrayList<ArrayList<LineupPlayer>> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.playerList = arrayList;
    }

    public final void setSquad(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.squad = str;
    }

    public final void setTeamId(int i10) {
        this.teamId = i10;
    }

    public String toString() {
        return "LineupTeam(teamId=" + this.teamId + ", squad=" + this.squad + ", goalkeeper=" + this.goalkeeper + ", playerList=" + this.playerList + ')';
    }
}
