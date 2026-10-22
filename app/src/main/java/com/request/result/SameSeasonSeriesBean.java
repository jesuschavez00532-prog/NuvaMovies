package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SameSeasonSeriesBean {
    private final String contentId;
    private final int seasonNumber;

    public SameSeasonSeriesBean(String str, int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        this.contentId = str;
        this.seasonNumber = i10;
    }

    public static /* synthetic */ SameSeasonSeriesBean copy$default(SameSeasonSeriesBean sameSeasonSeriesBean, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sameSeasonSeriesBean.contentId;
        }
        if ((i11 & 2) != 0) {
            i10 = sameSeasonSeriesBean.seasonNumber;
        }
        return sameSeasonSeriesBean.copy(str, i10);
    }

    public final String component1() {
        return this.contentId;
    }

    public final int component2() {
        return this.seasonNumber;
    }

    public final SameSeasonSeriesBean copy(String str, int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        return new SameSeasonSeriesBean(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SameSeasonSeriesBean)) {
            return false;
        }
        SameSeasonSeriesBean sameSeasonSeriesBean = (SameSeasonSeriesBean) obj;
        return AbstractC5868k.m23669a(this.contentId, sameSeasonSeriesBean.contentId) && this.seasonNumber == sameSeasonSeriesBean.seasonNumber;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    public int hashCode() {
        return (this.contentId.hashCode() * 31) + this.seasonNumber;
    }

    public String toString() {
        return "SameSeasonSeriesBean(contentId=" + this.contentId + ", seasonNumber=" + this.seasonNumber + ')';
    }
}
