package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchByNameResultData implements Serializable {
    private List<SearchItem> searchItemList;
    private Integer totalSize;

    public SearchByNameResultData(Integer num, List<SearchItem> list) {
        this.totalSize = num;
        this.searchItemList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchByNameResultData copy$default(SearchByNameResultData searchByNameResultData, Integer num, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = searchByNameResultData.totalSize;
        }
        if ((i10 & 2) != 0) {
            list = searchByNameResultData.searchItemList;
        }
        return searchByNameResultData.copy(num, list);
    }

    public final Integer component1() {
        return this.totalSize;
    }

    public final List<SearchItem> component2() {
        return this.searchItemList;
    }

    public final SearchByNameResultData copy(Integer num, List<SearchItem> list) {
        return new SearchByNameResultData(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByNameResultData)) {
            return false;
        }
        SearchByNameResultData searchByNameResultData = (SearchByNameResultData) obj;
        return AbstractC5868k.m23669a(this.totalSize, searchByNameResultData.totalSize) && AbstractC5868k.m23669a(this.searchItemList, searchByNameResultData.searchItemList);
    }

    public final List<SearchItem> getSearchItemList() {
        return this.searchItemList;
    }

    public final Integer getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        Integer num = this.totalSize;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<SearchItem> list = this.searchItemList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setSearchItemList(List<SearchItem> list) {
        this.searchItemList = list;
    }

    public final void setTotalSize(Integer num) {
        this.totalSize = num;
    }

    public String toString() {
        return "SearchByNameResultData(totalSize=" + this.totalSize + ", searchItemList=" + this.searchItemList + ')';
    }
}
