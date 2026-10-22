package com.module.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SeriesSeasonBean {
    private String name;
    private String season;

    public SeriesSeasonBean(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "season");
        this.name = str;
        this.season = str2;
    }

    public static /* synthetic */ SeriesSeasonBean copy$default(SeriesSeasonBean seriesSeasonBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = seriesSeasonBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = seriesSeasonBean.season;
        }
        return seriesSeasonBean.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.season;
    }

    public final SeriesSeasonBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "season");
        return new SeriesSeasonBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSeasonBean)) {
            return false;
        }
        SeriesSeasonBean seriesSeasonBean = (SeriesSeasonBean) obj;
        return AbstractC5868k.m23669a(this.name, seriesSeasonBean.name) && AbstractC5868k.m23669a(this.season, seriesSeasonBean.season);
    }

    public final String getName() {
        return this.name;
    }

    public final String getSeason() {
        return this.season;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.season.hashCode();
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setSeason(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.season = str;
    }

    public String toString() {
        return "SeriesSeasonBean(name=" + this.name + ", season=" + this.season + ')';
    }
}
