package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchEventTeam {
    private ArrayList<TeamEvent> teamEvent;

    public MatchEventTeam(ArrayList<TeamEvent> arrayList) {
        AbstractC5868k.m23674f(arrayList, "teamEvent");
        this.teamEvent = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchEventTeam copy$default(MatchEventTeam matchEventTeam, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = matchEventTeam.teamEvent;
        }
        return matchEventTeam.copy(arrayList);
    }

    public final ArrayList<TeamEvent> component1() {
        return this.teamEvent;
    }

    public final MatchEventTeam copy(ArrayList<TeamEvent> arrayList) {
        AbstractC5868k.m23674f(arrayList, "teamEvent");
        return new MatchEventTeam(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatchEventTeam) && AbstractC5868k.m23669a(this.teamEvent, ((MatchEventTeam) obj).teamEvent);
    }

    public final ArrayList<TeamEvent> getTeamEvent() {
        return this.teamEvent;
    }

    public int hashCode() {
        return this.teamEvent.hashCode();
    }

    public final void setTeamEvent(ArrayList<TeamEvent> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.teamEvent = arrayList;
    }

    public String toString() {
        return "MatchEventTeam(teamEvent=" + this.teamEvent + ')';
    }
}
