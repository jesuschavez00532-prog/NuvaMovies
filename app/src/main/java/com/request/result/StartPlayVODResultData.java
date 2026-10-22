package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayVODResultData implements Serializable {
    private List<StartPlayVODResultDataItem> episodeList;
    private String name;
    private String seriesFlag;
    private int vodFreeCount;
    private String vodFreeFlag;

    public StartPlayVODResultData(List<StartPlayVODResultDataItem> list, int i10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "vodFreeFlag");
        AbstractC5868k.m23674f(str2, "seriesFlag");
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        this.episodeList = list;
        this.vodFreeCount = i10;
        this.vodFreeFlag = str;
        this.seriesFlag = str2;
        this.name = str3;
    }

    public static /* synthetic */ StartPlayVODResultData copy$default(StartPlayVODResultData startPlayVODResultData, List list, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = startPlayVODResultData.episodeList;
        }
        if ((i11 & 2) != 0) {
            i10 = startPlayVODResultData.vodFreeCount;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = startPlayVODResultData.vodFreeFlag;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = startPlayVODResultData.seriesFlag;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = startPlayVODResultData.name;
        }
        return startPlayVODResultData.copy(list, i12, str4, str5, str3);
    }

    public final List<StartPlayVODResultDataItem> component1() {
        return this.episodeList;
    }

    public final int component2() {
        return this.vodFreeCount;
    }

    public final String component3() {
        return this.vodFreeFlag;
    }

    public final String component4() {
        return this.seriesFlag;
    }

    public final String component5() {
        return this.name;
    }

    public final StartPlayVODResultData copy(List<StartPlayVODResultDataItem> list, int i10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "vodFreeFlag");
        AbstractC5868k.m23674f(str2, "seriesFlag");
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        return new StartPlayVODResultData(list, i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayVODResultData)) {
            return false;
        }
        StartPlayVODResultData startPlayVODResultData = (StartPlayVODResultData) obj;
        return AbstractC5868k.m23669a(this.episodeList, startPlayVODResultData.episodeList) && this.vodFreeCount == startPlayVODResultData.vodFreeCount && AbstractC5868k.m23669a(this.vodFreeFlag, startPlayVODResultData.vodFreeFlag) && AbstractC5868k.m23669a(this.seriesFlag, startPlayVODResultData.seriesFlag) && AbstractC5868k.m23669a(this.name, startPlayVODResultData.name);
    }

    public final List<StartPlayVODResultDataItem> getEpisodeList() {
        return this.episodeList;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSeriesFlag() {
        return this.seriesFlag;
    }

    public final int getVodFreeCount() {
        return this.vodFreeCount;
    }

    public final String getVodFreeFlag() {
        return this.vodFreeFlag;
    }

    public int hashCode() {
        List<StartPlayVODResultDataItem> list = this.episodeList;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + this.vodFreeCount) * 31) + this.vodFreeFlag.hashCode()) * 31) + this.seriesFlag.hashCode()) * 31) + this.name.hashCode();
    }

    public final void setEpisodeList(List<StartPlayVODResultDataItem> list) {
        this.episodeList = list;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setSeriesFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.seriesFlag = str;
    }

    public final void setVodFreeCount(int i10) {
        this.vodFreeCount = i10;
    }

    public final void setVodFreeFlag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.vodFreeFlag = str;
    }

    public String toString() {
        return "StartPlayVODResultData(episodeList=" + this.episodeList + ", vodFreeCount=" + this.vodFreeCount + ", vodFreeFlag=" + this.vodFreeFlag + ", seriesFlag=" + this.seriesFlag + ", name=" + this.name + ')';
    }
}
