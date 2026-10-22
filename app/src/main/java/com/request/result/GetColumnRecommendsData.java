package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetColumnRecommendsData implements Serializable {
    private List<AssetList> assetList;
    private List<Channel> channelList;

    public GetColumnRecommendsData(List<Channel> list, List<AssetList> list2) {
        AbstractC5868k.m23674f(list, "channelList");
        AbstractC5868k.m23674f(list2, "assetList");
        this.channelList = list;
        this.assetList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetColumnRecommendsData copy$default(GetColumnRecommendsData getColumnRecommendsData, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getColumnRecommendsData.channelList;
        }
        if ((i10 & 2) != 0) {
            list2 = getColumnRecommendsData.assetList;
        }
        return getColumnRecommendsData.copy(list, list2);
    }

    public final List<Channel> component1() {
        return this.channelList;
    }

    public final List<AssetList> component2() {
        return this.assetList;
    }

    public final GetColumnRecommendsData copy(List<Channel> list, List<AssetList> list2) {
        AbstractC5868k.m23674f(list, "channelList");
        AbstractC5868k.m23674f(list2, "assetList");
        return new GetColumnRecommendsData(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetColumnRecommendsData)) {
            return false;
        }
        GetColumnRecommendsData getColumnRecommendsData = (GetColumnRecommendsData) obj;
        return AbstractC5868k.m23669a(this.channelList, getColumnRecommendsData.channelList) && AbstractC5868k.m23669a(this.assetList, getColumnRecommendsData.assetList);
    }

    public final List<AssetList> getAssetList() {
        return this.assetList;
    }

    public final List<Channel> getChannelList() {
        return this.channelList;
    }

    public int hashCode() {
        return (this.channelList.hashCode() * 31) + this.assetList.hashCode();
    }

    public final void setAssetList(List<AssetList> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.assetList = list;
    }

    public final void setChannelList(List<Channel> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.channelList = list;
    }

    public String toString() {
        return "GetColumnRecommendsData(channelList=" + this.channelList + ", assetList=" + this.assetList + ')';
    }
}
