package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchEventData {
    private MatchEventTeam team_a;
    private MatchEventTeam team_b;

    public MatchEventData(MatchEventTeam matchEventTeam, MatchEventTeam matchEventTeam2) {
        AbstractC5868k.m23674f(matchEventTeam, "team_a");
        AbstractC5868k.m23674f(matchEventTeam2, "team_b");
        this.team_a = matchEventTeam;
        this.team_b = matchEventTeam2;
    }

    public static /* synthetic */ MatchEventData copy$default(MatchEventData matchEventData, MatchEventTeam matchEventTeam, MatchEventTeam matchEventTeam2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matchEventTeam = matchEventData.team_a;
        }
        if ((i10 & 2) != 0) {
            matchEventTeam2 = matchEventData.team_b;
        }
        return matchEventData.copy(matchEventTeam, matchEventTeam2);
    }

    public final MatchEventTeam component1() {
        return this.team_a;
    }

    public final MatchEventTeam component2() {
        return this.team_b;
    }

    public final MatchEventData copy(MatchEventTeam matchEventTeam, MatchEventTeam matchEventTeam2) {
        AbstractC5868k.m23674f(matchEventTeam, "team_a");
        AbstractC5868k.m23674f(matchEventTeam2, "team_b");
        return new MatchEventData(matchEventTeam, matchEventTeam2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchEventData)) {
            return false;
        }
        MatchEventData matchEventData = (MatchEventData) obj;
        return AbstractC5868k.m23669a(this.team_a, matchEventData.team_a) && AbstractC5868k.m23669a(this.team_b, matchEventData.team_b);
    }

    public final MatchEventTeam getTeam_a() {
        return this.team_a;
    }

    public final MatchEventTeam getTeam_b() {
        return this.team_b;
    }

    public int hashCode() {
        return (this.team_a.hashCode() * 31) + this.team_b.hashCode();
    }

    public final void setTeam_a(MatchEventTeam matchEventTeam) {
        AbstractC5868k.m23674f(matchEventTeam, "<set-?>");
        this.team_a = matchEventTeam;
    }

    public final void setTeam_b(MatchEventTeam matchEventTeam) {
        AbstractC5868k.m23674f(matchEventTeam, "<set-?>");
        this.team_b = matchEventTeam;
    }

    public String toString() {
        return "MatchEventData(team_a=" + this.team_a + ", team_b=" + this.team_b + ')';
    }
}
