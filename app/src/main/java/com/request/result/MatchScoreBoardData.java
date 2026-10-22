package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchScoreBoardData {
    private ArrayList<MatchScoreGroup> groupList;
    private String matchAliasName;
    private String matchId;
    private String matchName;
    private MatchPromotion promotionList;
    private String seasonNum;
    private ArrayList<MatchScoreTeam> teamList;
    private String type;

    public MatchScoreBoardData(String str, String str2, String str3, String str4, String str5, ArrayList<MatchScoreTeam> arrayList, ArrayList<MatchScoreGroup> arrayList2, MatchPromotion matchPromotion) {
        AbstractC5868k.m23674f(str, "matchId");
        AbstractC5868k.m23674f(str3, "matchName");
        AbstractC5868k.m23674f(str4, "matchAliasName");
        AbstractC5868k.m23674f(str5, "seasonNum");
        this.matchId = str;
        this.type = str2;
        this.matchName = str3;
        this.matchAliasName = str4;
        this.seasonNum = str5;
        this.teamList = arrayList;
        this.groupList = arrayList2;
        this.promotionList = matchPromotion;
    }

    public final String component1() {
        return this.matchId;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.matchName;
    }

    public final String component4() {
        return this.matchAliasName;
    }

    public final String component5() {
        return this.seasonNum;
    }

    public final ArrayList<MatchScoreTeam> component6() {
        return this.teamList;
    }

    public final ArrayList<MatchScoreGroup> component7() {
        return this.groupList;
    }

    public final MatchPromotion component8() {
        return this.promotionList;
    }

    public final MatchScoreBoardData copy(String str, String str2, String str3, String str4, String str5, ArrayList<MatchScoreTeam> arrayList, ArrayList<MatchScoreGroup> arrayList2, MatchPromotion matchPromotion) {
        AbstractC5868k.m23674f(str, "matchId");
        AbstractC5868k.m23674f(str3, "matchName");
        AbstractC5868k.m23674f(str4, "matchAliasName");
        AbstractC5868k.m23674f(str5, "seasonNum");
        return new MatchScoreBoardData(str, str2, str3, str4, str5, arrayList, arrayList2, matchPromotion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchScoreBoardData)) {
            return false;
        }
        MatchScoreBoardData matchScoreBoardData = (MatchScoreBoardData) obj;
        return AbstractC5868k.m23669a(this.matchId, matchScoreBoardData.matchId) && AbstractC5868k.m23669a(this.type, matchScoreBoardData.type) && AbstractC5868k.m23669a(this.matchName, matchScoreBoardData.matchName) && AbstractC5868k.m23669a(this.matchAliasName, matchScoreBoardData.matchAliasName) && AbstractC5868k.m23669a(this.seasonNum, matchScoreBoardData.seasonNum) && AbstractC5868k.m23669a(this.teamList, matchScoreBoardData.teamList) && AbstractC5868k.m23669a(this.groupList, matchScoreBoardData.groupList) && AbstractC5868k.m23669a(this.promotionList, matchScoreBoardData.promotionList);
    }

    public final ArrayList<MatchScoreGroup> getGroupList() {
        return this.groupList;
    }

    public final String getMatchAliasName() {
        return this.matchAliasName;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getMatchName() {
        return this.matchName;
    }

    public final MatchPromotion getPromotionList() {
        return this.promotionList;
    }

    public final String getSeasonNum() {
        return this.seasonNum;
    }

    public final ArrayList<MatchScoreTeam> getTeamList() {
        return this.teamList;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.matchId.hashCode() * 31;
        String str = this.type;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.matchName.hashCode()) * 31) + this.matchAliasName.hashCode()) * 31) + this.seasonNum.hashCode()) * 31;
        ArrayList<MatchScoreTeam> arrayList = this.teamList;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<MatchScoreGroup> arrayList2 = this.groupList;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        MatchPromotion matchPromotion = this.promotionList;
        return hashCode4 + (matchPromotion != null ? matchPromotion.hashCode() : 0);
    }

    public final void setGroupList(ArrayList<MatchScoreGroup> arrayList) {
        this.groupList = arrayList;
    }

    public final void setMatchAliasName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchAliasName = str;
    }

    public final void setMatchId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchId = str;
    }

    public final void setMatchName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matchName = str;
    }

    public final void setPromotionList(MatchPromotion matchPromotion) {
        this.promotionList = matchPromotion;
    }

    public final void setSeasonNum(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.seasonNum = str;
    }

    public final void setTeamList(ArrayList<MatchScoreTeam> arrayList) {
        this.teamList = arrayList;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "MatchScoreBoardData(matchId=" + this.matchId + ", type=" + this.type + ", matchName=" + this.matchName + ", matchAliasName=" + this.matchAliasName + ", seasonNum=" + this.seasonNum + ", teamList=" + this.teamList + ", groupList=" + this.groupList + ", promotionList=" + this.promotionList + ')';
    }
}
