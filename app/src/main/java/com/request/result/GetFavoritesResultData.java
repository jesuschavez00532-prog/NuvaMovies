package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetFavoritesResultData implements Serializable {
    private List<FavoriteList> favoriteList;
    private int favoriteListTotalSize;

    public GetFavoritesResultData(List<FavoriteList> list, int i10) {
        this.favoriteList = list;
        this.favoriteListTotalSize = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetFavoritesResultData copy$default(GetFavoritesResultData getFavoritesResultData, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getFavoritesResultData.favoriteList;
        }
        if ((i11 & 2) != 0) {
            i10 = getFavoritesResultData.favoriteListTotalSize;
        }
        return getFavoritesResultData.copy(list, i10);
    }

    public final List<FavoriteList> component1() {
        return this.favoriteList;
    }

    public final int component2() {
        return this.favoriteListTotalSize;
    }

    public final GetFavoritesResultData copy(List<FavoriteList> list, int i10) {
        return new GetFavoritesResultData(list, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFavoritesResultData)) {
            return false;
        }
        GetFavoritesResultData getFavoritesResultData = (GetFavoritesResultData) obj;
        return AbstractC5868k.m23669a(this.favoriteList, getFavoritesResultData.favoriteList) && this.favoriteListTotalSize == getFavoritesResultData.favoriteListTotalSize;
    }

    public final List<FavoriteList> getFavoriteList() {
        return this.favoriteList;
    }

    public final int getFavoriteListTotalSize() {
        return this.favoriteListTotalSize;
    }

    public int hashCode() {
        List<FavoriteList> list = this.favoriteList;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.favoriteListTotalSize;
    }

    public final void setFavoriteList(List<FavoriteList> list) {
        this.favoriteList = list;
    }

    public final void setFavoriteListTotalSize(int i10) {
        this.favoriteListTotalSize = i10;
    }

    public String toString() {
        return "GetFavoritesResultData(favoriteList=" + this.favoriteList + ", favoriteListTotalSize=" + this.favoriteListTotalSize + ')';
    }
}
