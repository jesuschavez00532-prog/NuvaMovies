package com.live.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.request.result.TeamEvent;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class MatchEventBean implements Comparable<MatchEventBean> {
    private List<TeamEvent> ATeamEventList;
    private List<TeamEvent> BTeamEventList;
    private String eventTime;

    public MatchEventBean(String str) {
        AbstractC5868k.m23674f(str, "eventTime");
        this.eventTime = str;
        this.ATeamEventList = new ArrayList();
        this.BTeamEventList = new ArrayList();
    }

    public final List<TeamEvent> getATeamEventList() {
        return this.ATeamEventList;
    }

    public final List<TeamEvent> getBTeamEventList() {
        return this.BTeamEventList;
    }

    public final String getEventTime() {
        return this.eventTime;
    }

    public final void setATeamEventList(List<TeamEvent> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.ATeamEventList = list;
    }

    public final void setBTeamEventList(List<TeamEvent> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.BTeamEventList = list;
    }

    public final void setEventTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.eventTime = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(MatchEventBean matchEventBean) {
        AbstractC5868k.m23674f(matchEventBean, DispatchConstants.OTHER);
        if (Integer.parseInt(this.eventTime) > Integer.parseInt(matchEventBean.eventTime)) {
            return 1;
        }
        return Integer.parseInt(this.eventTime) < Integer.parseInt(matchEventBean.eventTime) ? -1 : 0;
    }
}
