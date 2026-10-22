package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FavIdData implements Serializable {
    private final List<FavIdDataItem> favoriteList;

    public FavIdData(List<FavIdDataItem> list) {
        this.favoriteList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavIdData copy$default(FavIdData favIdData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = favIdData.favoriteList;
        }
        return favIdData.copy(list);
    }

    public final List<FavIdDataItem> component1() {
        return this.favoriteList;
    }

    public final FavIdData copy(List<FavIdDataItem> list) {
        return new FavIdData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavIdData) && AbstractC5868k.m23669a(this.favoriteList, ((FavIdData) obj).favoriteList);
    }

    public final List<FavIdDataItem> getFavoriteList() {
        return this.favoriteList;
    }

    public int hashCode() {
        List<FavIdDataItem> list = this.favoriteList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FavIdData(favoriteList=" + this.favoriteList + ')';
    }
}
