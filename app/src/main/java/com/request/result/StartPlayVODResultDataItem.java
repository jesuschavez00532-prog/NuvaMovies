package com.request.result;

import com.request.bean.SubTitleItemData;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayVODResultDataItem {
    private int episodeNumber;
    private String programContentId;
    private List<SubTitleItemData> subtitleList;
    private List<TotalMovieListItem> totalMovieList;

    public StartPlayVODResultDataItem(int i10, String str, List<TotalMovieListItem> list, List<SubTitleItemData> list2) {
        AbstractC5868k.m23674f(str, "programContentId");
        this.episodeNumber = i10;
        this.programContentId = str;
        this.totalMovieList = list;
        this.subtitleList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartPlayVODResultDataItem copy$default(StartPlayVODResultDataItem startPlayVODResultDataItem, int i10, String str, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = startPlayVODResultDataItem.episodeNumber;
        }
        if ((i11 & 2) != 0) {
            str = startPlayVODResultDataItem.programContentId;
        }
        if ((i11 & 4) != 0) {
            list = startPlayVODResultDataItem.totalMovieList;
        }
        if ((i11 & 8) != 0) {
            list2 = startPlayVODResultDataItem.subtitleList;
        }
        return startPlayVODResultDataItem.copy(i10, str, list, list2);
    }

    public final int component1() {
        return this.episodeNumber;
    }

    public final String component2() {
        return this.programContentId;
    }

    public final List<TotalMovieListItem> component3() {
        return this.totalMovieList;
    }

    public final List<SubTitleItemData> component4() {
        return this.subtitleList;
    }

    public final StartPlayVODResultDataItem copy(int i10, String str, List<TotalMovieListItem> list, List<SubTitleItemData> list2) {
        AbstractC5868k.m23674f(str, "programContentId");
        return new StartPlayVODResultDataItem(i10, str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayVODResultDataItem)) {
            return false;
        }
        StartPlayVODResultDataItem startPlayVODResultDataItem = (StartPlayVODResultDataItem) obj;
        return this.episodeNumber == startPlayVODResultDataItem.episodeNumber && AbstractC5868k.m23669a(this.programContentId, startPlayVODResultDataItem.programContentId) && AbstractC5868k.m23669a(this.totalMovieList, startPlayVODResultDataItem.totalMovieList) && AbstractC5868k.m23669a(this.subtitleList, startPlayVODResultDataItem.subtitleList);
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getProgramContentId() {
        return this.programContentId;
    }

    public final List<SubTitleItemData> getSubtitleList() {
        return this.subtitleList;
    }

    public final List<TotalMovieListItem> getTotalMovieList() {
        return this.totalMovieList;
    }

    public int hashCode() {
        int hashCode = ((this.episodeNumber * 31) + this.programContentId.hashCode()) * 31;
        List<TotalMovieListItem> list = this.totalMovieList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SubTitleItemData> list2 = this.subtitleList;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setEpisodeNumber(int i10) {
        this.episodeNumber = i10;
    }

    public final void setProgramContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.programContentId = str;
    }

    public final void setSubtitleList(List<SubTitleItemData> list) {
        this.subtitleList = list;
    }

    public final void setTotalMovieList(List<TotalMovieListItem> list) {
        this.totalMovieList = list;
    }

    public String toString() {
        return "StartPlayVODResultDataItem(episodeNumber=" + this.episodeNumber + ", programContentId=" + this.programContentId + ", totalMovieList=" + this.totalMovieList + ", subtitleList=" + this.subtitleList + ')';
    }
}
