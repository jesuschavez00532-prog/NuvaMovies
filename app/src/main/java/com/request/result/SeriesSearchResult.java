package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SeriesSearchResult {
    private List<AssetList> seriesList;
    private int totalSize;

    public SeriesSearchResult(int i10, List<AssetList> list) {
        this.totalSize = i10;
        this.seriesList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeriesSearchResult copy$default(SeriesSearchResult seriesSearchResult, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = seriesSearchResult.totalSize;
        }
        if ((i11 & 2) != 0) {
            list = seriesSearchResult.seriesList;
        }
        return seriesSearchResult.copy(i10, list);
    }

    public final int component1() {
        return this.totalSize;
    }

    public final List<AssetList> component2() {
        return this.seriesList;
    }

    public final SeriesSearchResult copy(int i10, List<AssetList> list) {
        return new SeriesSearchResult(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSearchResult)) {
            return false;
        }
        SeriesSearchResult seriesSearchResult = (SeriesSearchResult) obj;
        return this.totalSize == seriesSearchResult.totalSize && AbstractC5868k.m23669a(this.seriesList, seriesSearchResult.seriesList);
    }

    public final List<AssetList> getSeriesList() {
        return this.seriesList;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int i10 = this.totalSize * 31;
        List<AssetList> list = this.seriesList;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public final void setSeriesList(List<AssetList> list) {
        this.seriesList = list;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public String toString() {
        return "SeriesSearchResult(totalSize=" + this.totalSize + ", seriesList=" + this.seriesList + ')';
    }
}
