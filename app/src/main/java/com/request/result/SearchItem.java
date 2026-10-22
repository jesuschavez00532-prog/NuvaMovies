package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchItem implements Serializable {
    private List<AssetList> itemList;
    private String programType;

    public SearchItem(String str, List<AssetList> list) {
        this.programType = str;
        this.itemList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchItem copy$default(SearchItem searchItem, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchItem.programType;
        }
        if ((i10 & 2) != 0) {
            list = searchItem.itemList;
        }
        return searchItem.copy(str, list);
    }

    public final String component1() {
        return this.programType;
    }

    public final List<AssetList> component2() {
        return this.itemList;
    }

    public final SearchItem copy(String str, List<AssetList> list) {
        return new SearchItem(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) obj;
        return AbstractC5868k.m23669a(this.programType, searchItem.programType) && AbstractC5868k.m23669a(this.itemList, searchItem.itemList);
    }

    public final List<AssetList> getItemList() {
        return this.itemList;
    }

    public final String getProgramType() {
        return this.programType;
    }

    public int hashCode() {
        String str = this.programType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AssetList> list = this.itemList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setItemList(List<AssetList> list) {
        this.itemList = list;
    }

    public final void setProgramType(String str) {
        this.programType = str;
    }

    public String toString() {
        return "SearchItem(programType=" + this.programType + ", itemList=" + this.itemList + ')';
    }
}
