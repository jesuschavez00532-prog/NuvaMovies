package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchScoreGroup {
    private String groupName;
    private ArrayList<MatchScoreTeam> teamList;

    public MatchScoreGroup(String str, ArrayList<MatchScoreTeam> arrayList) {
        AbstractC5868k.m23674f(str, "groupName");
        AbstractC5868k.m23674f(arrayList, "teamList");
        this.groupName = str;
        this.teamList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchScoreGroup copy$default(MatchScoreGroup matchScoreGroup, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchScoreGroup.groupName;
        }
        if ((i10 & 2) != 0) {
            arrayList = matchScoreGroup.teamList;
        }
        return matchScoreGroup.copy(str, arrayList);
    }

    public final String component1() {
        return this.groupName;
    }

    public final ArrayList<MatchScoreTeam> component2() {
        return this.teamList;
    }

    public final MatchScoreGroup copy(String str, ArrayList<MatchScoreTeam> arrayList) {
        AbstractC5868k.m23674f(str, "groupName");
        AbstractC5868k.m23674f(arrayList, "teamList");
        return new MatchScoreGroup(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchScoreGroup)) {
            return false;
        }
        MatchScoreGroup matchScoreGroup = (MatchScoreGroup) obj;
        return AbstractC5868k.m23669a(this.groupName, matchScoreGroup.groupName) && AbstractC5868k.m23669a(this.teamList, matchScoreGroup.teamList);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final ArrayList<MatchScoreTeam> getTeamList() {
        return this.teamList;
    }

    public int hashCode() {
        return (this.groupName.hashCode() * 31) + this.teamList.hashCode();
    }

    public final void setGroupName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.groupName = str;
    }

    public final void setTeamList(ArrayList<MatchScoreTeam> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.teamList = arrayList;
    }

    public String toString() {
        return "MatchScoreGroup(groupName=" + this.groupName + ", teamList=" + this.teamList + ')';
    }
}
