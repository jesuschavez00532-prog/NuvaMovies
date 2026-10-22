package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchByContentResultData implements Serializable {
    private List<AssetList> assetList;

    public SearchByContentResultData(List<AssetList> list) {
        this.assetList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchByContentResultData copy$default(SearchByContentResultData searchByContentResultData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = searchByContentResultData.assetList;
        }
        return searchByContentResultData.copy(list);
    }

    public final List<AssetList> component1() {
        return this.assetList;
    }

    public final SearchByContentResultData copy(List<AssetList> list) {
        return new SearchByContentResultData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchByContentResultData) && AbstractC5868k.m23669a(this.assetList, ((SearchByContentResultData) obj).assetList);
    }

    public final List<AssetList> getAssetList() {
        return this.assetList;
    }

    public int hashCode() {
        List<AssetList> list = this.assetList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setAssetList(List<AssetList> list) {
        this.assetList = list;
    }

    public String toString() {
        return "SearchByContentResultData(assetList=" + this.assetList + ')';
    }
}
