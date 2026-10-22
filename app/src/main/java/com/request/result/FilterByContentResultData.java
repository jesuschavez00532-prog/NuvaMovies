package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FilterByContentResultData implements Serializable {
    private List<AssetList> assetList;
    private Integer totalSize;

    public FilterByContentResultData(List<AssetList> list, Integer num) {
        this.assetList = list;
        this.totalSize = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterByContentResultData copy$default(FilterByContentResultData filterByContentResultData, List list, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = filterByContentResultData.assetList;
        }
        if ((i10 & 2) != 0) {
            num = filterByContentResultData.totalSize;
        }
        return filterByContentResultData.copy(list, num);
    }

    public final List<AssetList> component1() {
        return this.assetList;
    }

    public final Integer component2() {
        return this.totalSize;
    }

    public final FilterByContentResultData copy(List<AssetList> list, Integer num) {
        return new FilterByContentResultData(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterByContentResultData)) {
            return false;
        }
        FilterByContentResultData filterByContentResultData = (FilterByContentResultData) obj;
        return AbstractC5868k.m23669a(this.assetList, filterByContentResultData.assetList) && AbstractC5868k.m23669a(this.totalSize, filterByContentResultData.totalSize);
    }

    public final List<AssetList> getAssetList() {
        return this.assetList;
    }

    public final Integer getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        List<AssetList> list = this.assetList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalSize;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setAssetList(List<AssetList> list) {
        this.assetList = list;
    }

    public final void setTotalSize(Integer num) {
        this.totalSize = num;
    }

    public String toString() {
        return "FilterByContentResultData(assetList=" + this.assetList + ", totalSize=" + this.totalSize + ')';
    }
}
