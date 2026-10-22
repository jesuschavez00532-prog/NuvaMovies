package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetShelveData implements Serializable {
    private List<AssetList> assetList;
    private int assetListTotalSize;
    private List<Channel> channelList;
    private int channelListTotalSize;
    private int favoriteId;
    private int freshTime;
    private String hasFavorite;
    private SlbInfo slbInfo;
    private String version;

    public GetShelveData(String str, int i10, int i11, List<Channel> list, List<AssetList> list2, String str2, int i12, int i13, SlbInfo slbInfo) {
        this.version = str;
        this.channelListTotalSize = i10;
        this.assetListTotalSize = i11;
        this.channelList = list;
        this.assetList = list2;
        this.hasFavorite = str2;
        this.favoriteId = i12;
        this.freshTime = i13;
        this.slbInfo = slbInfo;
    }

    public final String component1() {
        return this.version;
    }

    public final int component2() {
        return this.channelListTotalSize;
    }

    public final int component3() {
        return this.assetListTotalSize;
    }

    public final List<Channel> component4() {
        return this.channelList;
    }

    public final List<AssetList> component5() {
        return this.assetList;
    }

    public final String component6() {
        return this.hasFavorite;
    }

    public final int component7() {
        return this.favoriteId;
    }

    public final int component8() {
        return this.freshTime;
    }

    public final SlbInfo component9() {
        return this.slbInfo;
    }

    public final GetShelveData copy(String str, int i10, int i11, List<Channel> list, List<AssetList> list2, String str2, int i12, int i13, SlbInfo slbInfo) {
        return new GetShelveData(str, i10, i11, list, list2, str2, i12, i13, slbInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetShelveData)) {
            return false;
        }
        GetShelveData getShelveData = (GetShelveData) obj;
        return AbstractC5868k.m23669a(this.version, getShelveData.version) && this.channelListTotalSize == getShelveData.channelListTotalSize && this.assetListTotalSize == getShelveData.assetListTotalSize && AbstractC5868k.m23669a(this.channelList, getShelveData.channelList) && AbstractC5868k.m23669a(this.assetList, getShelveData.assetList) && AbstractC5868k.m23669a(this.hasFavorite, getShelveData.hasFavorite) && this.favoriteId == getShelveData.favoriteId && this.freshTime == getShelveData.freshTime && AbstractC5868k.m23669a(this.slbInfo, getShelveData.slbInfo);
    }

    public final List<AssetList> getAssetList() {
        return this.assetList;
    }

    public final int getAssetListTotalSize() {
        return this.assetListTotalSize;
    }

    public final List<Channel> getChannelList() {
        return this.channelList;
    }

    public final int getChannelListTotalSize() {
        return this.channelListTotalSize;
    }

    public final int getFavoriteId() {
        return this.favoriteId;
    }

    public final int getFreshTime() {
        return this.freshTime;
    }

    public final String getHasFavorite() {
        return this.hasFavorite;
    }

    public final SlbInfo getSlbInfo() {
        return this.slbInfo;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.channelListTotalSize) * 31) + this.assetListTotalSize) * 31;
        List<Channel> list = this.channelList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AssetList> list2 = this.assetList;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.hasFavorite;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.favoriteId) * 31) + this.freshTime) * 31;
        SlbInfo slbInfo = this.slbInfo;
        return hashCode4 + (slbInfo != null ? slbInfo.hashCode() : 0);
    }

    public final void setAssetList(List<AssetList> list) {
        this.assetList = list;
    }

    public final void setAssetListTotalSize(int i10) {
        this.assetListTotalSize = i10;
    }

    public final void setChannelList(List<Channel> list) {
        this.channelList = list;
    }

    public final void setChannelListTotalSize(int i10) {
        this.channelListTotalSize = i10;
    }

    public final void setFavoriteId(int i10) {
        this.favoriteId = i10;
    }

    public final void setFreshTime(int i10) {
        this.freshTime = i10;
    }

    public final void setHasFavorite(String str) {
        this.hasFavorite = str;
    }

    public final void setSlbInfo(SlbInfo slbInfo) {
        this.slbInfo = slbInfo;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "GetShelveData(version=" + this.version + ", channelListTotalSize=" + this.channelListTotalSize + ", assetListTotalSize=" + this.assetListTotalSize + ", channelList=" + this.channelList + ", assetList=" + this.assetList + ", hasFavorite=" + this.hasFavorite + ", favoriteId=" + this.favoriteId + ", freshTime=" + this.freshTime + ", slbInfo=" + this.slbInfo + ')';
    }
}
