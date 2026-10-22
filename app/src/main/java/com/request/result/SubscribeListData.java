package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SubscribeListData {
    private int favoriteListTotalSize;
    private ArrayList<SubscribeData> subscribeList;

    public SubscribeListData(int i10, ArrayList<SubscribeData> arrayList) {
        this.favoriteListTotalSize = i10;
        this.subscribeList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscribeListData copy$default(SubscribeListData subscribeListData, int i10, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = subscribeListData.favoriteListTotalSize;
        }
        if ((i11 & 2) != 0) {
            arrayList = subscribeListData.subscribeList;
        }
        return subscribeListData.copy(i10, arrayList);
    }

    public final int component1() {
        return this.favoriteListTotalSize;
    }

    public final ArrayList<SubscribeData> component2() {
        return this.subscribeList;
    }

    public final SubscribeListData copy(int i10, ArrayList<SubscribeData> arrayList) {
        return new SubscribeListData(i10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeListData)) {
            return false;
        }
        SubscribeListData subscribeListData = (SubscribeListData) obj;
        return this.favoriteListTotalSize == subscribeListData.favoriteListTotalSize && AbstractC5868k.m23669a(this.subscribeList, subscribeListData.subscribeList);
    }

    public final int getFavoriteListTotalSize() {
        return this.favoriteListTotalSize;
    }

    public final ArrayList<SubscribeData> getSubscribeList() {
        return this.subscribeList;
    }

    public int hashCode() {
        int i10 = this.favoriteListTotalSize * 31;
        ArrayList<SubscribeData> arrayList = this.subscribeList;
        return i10 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public final void setFavoriteListTotalSize(int i10) {
        this.favoriteListTotalSize = i10;
    }

    public final void setSubscribeList(ArrayList<SubscribeData> arrayList) {
        this.subscribeList = arrayList;
    }

    public String toString() {
        return "SubscribeListData(favoriteListTotalSize=" + this.favoriteListTotalSize + ", subscribeList=" + this.subscribeList + ')';
    }
}
