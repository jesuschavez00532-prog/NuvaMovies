package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LineupData {
    private LineupTeam team_a;
    private LineupTeam team_b;

    public LineupData(LineupTeam lineupTeam, LineupTeam lineupTeam2) {
        this.team_a = lineupTeam;
        this.team_b = lineupTeam2;
    }

    public static /* synthetic */ LineupData copy$default(LineupData lineupData, LineupTeam lineupTeam, LineupTeam lineupTeam2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lineupTeam = lineupData.team_a;
        }
        if ((i10 & 2) != 0) {
            lineupTeam2 = lineupData.team_b;
        }
        return lineupData.copy(lineupTeam, lineupTeam2);
    }

    public final LineupTeam component1() {
        return this.team_a;
    }

    public final LineupTeam component2() {
        return this.team_b;
    }

    public final LineupData copy(LineupTeam lineupTeam, LineupTeam lineupTeam2) {
        return new LineupData(lineupTeam, lineupTeam2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineupData)) {
            return false;
        }
        LineupData lineupData = (LineupData) obj;
        return AbstractC5868k.m23669a(this.team_a, lineupData.team_a) && AbstractC5868k.m23669a(this.team_b, lineupData.team_b);
    }

    public final LineupTeam getTeam_a() {
        return this.team_a;
    }

    public final LineupTeam getTeam_b() {
        return this.team_b;
    }

    public int hashCode() {
        LineupTeam lineupTeam = this.team_a;
        int hashCode = (lineupTeam == null ? 0 : lineupTeam.hashCode()) * 31;
        LineupTeam lineupTeam2 = this.team_b;
        return hashCode + (lineupTeam2 != null ? lineupTeam2.hashCode() : 0);
    }

    public final void setTeam_a(LineupTeam lineupTeam) {
        this.team_a = lineupTeam;
    }

    public final void setTeam_b(LineupTeam lineupTeam) {
        this.team_b = lineupTeam;
    }

    public String toString() {
        return "LineupData(team_a=" + this.team_a + ", team_b=" + this.team_b + ')';
    }
}
