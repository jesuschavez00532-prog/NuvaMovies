package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetItemDataResultData implements Serializable {
    private AssetData assetData;

    public GetItemDataResultData(AssetData assetData) {
        this.assetData = assetData;
    }

    public static /* synthetic */ GetItemDataResultData copy$default(GetItemDataResultData getItemDataResultData, AssetData assetData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            assetData = getItemDataResultData.assetData;
        }
        return getItemDataResultData.copy(assetData);
    }

    public final AssetData component1() {
        return this.assetData;
    }

    public final GetItemDataResultData copy(AssetData assetData) {
        return new GetItemDataResultData(assetData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetItemDataResultData) && AbstractC5868k.m23669a(this.assetData, ((GetItemDataResultData) obj).assetData);
    }

    public final AssetData getAssetData() {
        return this.assetData;
    }

    public int hashCode() {
        AssetData assetData = this.assetData;
        if (assetData == null) {
            return 0;
        }
        return assetData.hashCode();
    }

    public final void setAssetData(AssetData assetData) {
        this.assetData = assetData;
    }

    public String toString() {
        return "GetItemDataResultData(assetData=" + this.assetData + ')';
    }
}
