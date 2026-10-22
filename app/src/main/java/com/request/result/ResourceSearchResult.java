package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ResourceSearchResult {
    private List<AssetList> resourceList;
    private int totalSize;

    public ResourceSearchResult(int i10, List<AssetList> list) {
        this.totalSize = i10;
        this.resourceList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceSearchResult copy$default(ResourceSearchResult resourceSearchResult, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = resourceSearchResult.totalSize;
        }
        if ((i11 & 2) != 0) {
            list = resourceSearchResult.resourceList;
        }
        return resourceSearchResult.copy(i10, list);
    }

    public final int component1() {
        return this.totalSize;
    }

    public final List<AssetList> component2() {
        return this.resourceList;
    }

    public final ResourceSearchResult copy(int i10, List<AssetList> list) {
        return new ResourceSearchResult(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceSearchResult)) {
            return false;
        }
        ResourceSearchResult resourceSearchResult = (ResourceSearchResult) obj;
        return this.totalSize == resourceSearchResult.totalSize && AbstractC5868k.m23669a(this.resourceList, resourceSearchResult.resourceList);
    }

    public final List<AssetList> getResourceList() {
        return this.resourceList;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int i10 = this.totalSize * 31;
        List<AssetList> list = this.resourceList;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public final void setResourceList(List<AssetList> list) {
        this.resourceList = list;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public String toString() {
        return "ResourceSearchResult(totalSize=" + this.totalSize + ", resourceList=" + this.resourceList + ')';
    }
}
