package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FilterGenreResultData implements Serializable {
    private List<FilterInfo> audio;
    private List<FilterInfo> fixYear;
    private List<String> originalCountry;
    private List<String> tags;
    private List<String> year;

    public FilterGenreResultData(List<String> list, List<String> list2, List<String> list3, List<FilterInfo> list4, List<FilterInfo> list5) {
        AbstractC5868k.m23674f(list, "originalCountry");
        AbstractC5868k.m23674f(list2, "tags");
        AbstractC5868k.m23674f(list3, "year");
        AbstractC5868k.m23674f(list4, "audio");
        AbstractC5868k.m23674f(list5, "fixYear");
        this.originalCountry = list;
        this.tags = list2;
        this.year = list3;
        this.audio = list4;
        this.fixYear = list5;
    }

    public static /* synthetic */ FilterGenreResultData copy$default(FilterGenreResultData filterGenreResultData, List list, List list2, List list3, List list4, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = filterGenreResultData.originalCountry;
        }
        if ((i10 & 2) != 0) {
            list2 = filterGenreResultData.tags;
        }
        List list6 = list2;
        if ((i10 & 4) != 0) {
            list3 = filterGenreResultData.year;
        }
        List list7 = list3;
        if ((i10 & 8) != 0) {
            list4 = filterGenreResultData.audio;
        }
        List list8 = list4;
        if ((i10 & 16) != 0) {
            list5 = filterGenreResultData.fixYear;
        }
        return filterGenreResultData.copy(list, list6, list7, list8, list5);
    }

    public final List<String> component1() {
        return this.originalCountry;
    }

    public final List<String> component2() {
        return this.tags;
    }

    public final List<String> component3() {
        return this.year;
    }

    public final List<FilterInfo> component4() {
        return this.audio;
    }

    public final List<FilterInfo> component5() {
        return this.fixYear;
    }

    public final FilterGenreResultData copy(List<String> list, List<String> list2, List<String> list3, List<FilterInfo> list4, List<FilterInfo> list5) {
        AbstractC5868k.m23674f(list, "originalCountry");
        AbstractC5868k.m23674f(list2, "tags");
        AbstractC5868k.m23674f(list3, "year");
        AbstractC5868k.m23674f(list4, "audio");
        AbstractC5868k.m23674f(list5, "fixYear");
        return new FilterGenreResultData(list, list2, list3, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGenreResultData)) {
            return false;
        }
        FilterGenreResultData filterGenreResultData = (FilterGenreResultData) obj;
        return AbstractC5868k.m23669a(this.originalCountry, filterGenreResultData.originalCountry) && AbstractC5868k.m23669a(this.tags, filterGenreResultData.tags) && AbstractC5868k.m23669a(this.year, filterGenreResultData.year) && AbstractC5868k.m23669a(this.audio, filterGenreResultData.audio) && AbstractC5868k.m23669a(this.fixYear, filterGenreResultData.fixYear);
    }

    public final List<FilterInfo> getAudio() {
        return this.audio;
    }

    public final List<FilterInfo> getFixYear() {
        return this.fixYear;
    }

    public final List<String> getOriginalCountry() {
        return this.originalCountry;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<String> getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((this.originalCountry.hashCode() * 31) + this.tags.hashCode()) * 31) + this.year.hashCode()) * 31) + this.audio.hashCode()) * 31) + this.fixYear.hashCode();
    }

    public final void setAudio(List<FilterInfo> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.audio = list;
    }

    public final void setFixYear(List<FilterInfo> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.fixYear = list;
    }

    public final void setOriginalCountry(List<String> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.originalCountry = list;
    }

    public final void setTags(List<String> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.tags = list;
    }

    public final void setYear(List<String> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.year = list;
    }

    public String toString() {
        return "FilterGenreResultData(originalCountry=" + this.originalCountry + ", tags=" + this.tags + ", year=" + this.year + ", audio=" + this.audio + ", fixYear=" + this.fixYear + ')';
    }
}
