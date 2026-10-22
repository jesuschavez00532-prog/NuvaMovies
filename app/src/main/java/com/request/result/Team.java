package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class Team implements Serializable {
    private String teamAlias;
    private List<TeamEvent> teamEvent;
    private String teamId;
    private String teamLogo;
    private String teamName;

    public Team(String str, String str2, String str3, String str4, List<TeamEvent> list) {
        AbstractC5868k.m23674f(str, "teamId");
        AbstractC5868k.m23674f(str2, "teamName");
        AbstractC5868k.m23674f(str3, "teamAlias");
        this.teamId = str;
        this.teamName = str2;
        this.teamAlias = str3;
        this.teamLogo = str4;
        this.teamEvent = list;
    }

    public static /* synthetic */ Team copy$default(Team team, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = team.teamId;
        }
        if ((i10 & 2) != 0) {
            str2 = team.teamName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = team.teamAlias;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = team.teamLogo;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            list = team.teamEvent;
        }
        return team.copy(str, str5, str6, str7, list);
    }

    public final String component1() {
        return this.teamId;
    }

    public final String component2() {
        return this.teamName;
    }

    public final String component3() {
        return this.teamAlias;
    }

    public final String component4() {
        return this.teamLogo;
    }

    public final List<TeamEvent> component5() {
        return this.teamEvent;
    }

    public final Team copy(String str, String str2, String str3, String str4, List<TeamEvent> list) {
        AbstractC5868k.m23674f(str, "teamId");
        AbstractC5868k.m23674f(str2, "teamName");
        AbstractC5868k.m23674f(str3, "teamAlias");
        return new Team(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return AbstractC5868k.m23669a(this.teamId, team.teamId) && AbstractC5868k.m23669a(this.teamName, team.teamName) && AbstractC5868k.m23669a(this.teamAlias, team.teamAlias) && AbstractC5868k.m23669a(this.teamLogo, team.teamLogo) && AbstractC5868k.m23669a(this.teamEvent, team.teamEvent);
    }

    public final String getTeamAlias() {
        return this.teamAlias;
    }

    public final List<TeamEvent> getTeamEvent() {
        return this.teamEvent;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamLogo() {
        return this.teamLogo;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public int hashCode() {
        int hashCode = ((((this.teamId.hashCode() * 31) + this.teamName.hashCode()) * 31) + this.teamAlias.hashCode()) * 31;
        String str = this.teamLogo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TeamEvent> list = this.teamEvent;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setTeamAlias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamAlias = str;
    }

    public final void setTeamEvent(List<TeamEvent> list) {
        this.teamEvent = list;
    }

    public final void setTeamId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamId = str;
    }

    public final void setTeamLogo(String str) {
        this.teamLogo = str;
    }

    public final void setTeamName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamName = str;
    }

    public String toString() {
        return "Team(teamId=" + this.teamId + ", teamName=" + this.teamName + ", teamAlias=" + this.teamAlias + ", teamLogo=" + this.teamLogo + ", teamEvent=" + this.teamEvent + ')';
    }
}
