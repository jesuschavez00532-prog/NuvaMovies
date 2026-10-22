package com.live.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class MatchDate {
    private String monthInfo;
    private String yearInfo;

    public MatchDate(String str, String str2) {
        AbstractC5868k.m23674f(str, "monthInfo");
        AbstractC5868k.m23674f(str2, "yearInfo");
        this.monthInfo = str;
        this.yearInfo = str2;
    }

    public final String getMonthInfo() {
        return this.monthInfo;
    }

    public final String getYearInfo() {
        return this.yearInfo;
    }

    public final void setMonthInfo(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.monthInfo = str;
    }

    public final void setYearInfo(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.yearInfo = str;
    }
}
