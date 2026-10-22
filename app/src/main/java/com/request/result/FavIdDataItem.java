package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FavIdDataItem {
    private String contentId;
    private int favoriteId;

    public FavIdDataItem(String str, int i10) {
        this.contentId = str;
        this.favoriteId = i10;
    }

    public static /* synthetic */ FavIdDataItem copy$default(FavIdDataItem favIdDataItem, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favIdDataItem.contentId;
        }
        if ((i11 & 2) != 0) {
            i10 = favIdDataItem.favoriteId;
        }
        return favIdDataItem.copy(str, i10);
    }

    public final String component1() {
        return this.contentId;
    }

    public final int component2() {
        return this.favoriteId;
    }

    public final FavIdDataItem copy(String str, int i10) {
        return new FavIdDataItem(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavIdDataItem)) {
            return false;
        }
        FavIdDataItem favIdDataItem = (FavIdDataItem) obj;
        return AbstractC5868k.m23669a(this.contentId, favIdDataItem.contentId) && this.favoriteId == favIdDataItem.favoriteId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int getFavoriteId() {
        return this.favoriteId;
    }

    public int hashCode() {
        String str = this.contentId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.favoriteId;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setFavoriteId(int i10) {
        this.favoriteId = i10;
    }

    public String toString() {
        return "FavIdDataItem(contentId=" + this.contentId + ", favoriteId=" + this.favoriteId + ')';
    }
}
