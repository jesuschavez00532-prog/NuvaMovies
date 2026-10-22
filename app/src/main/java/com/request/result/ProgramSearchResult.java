package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ProgramSearchResult {
    private List<AssetList> programList;
    private int totalSize;

    public ProgramSearchResult(int i10, List<AssetList> list) {
        this.totalSize = i10;
        this.programList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgramSearchResult copy$default(ProgramSearchResult programSearchResult, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = programSearchResult.totalSize;
        }
        if ((i11 & 2) != 0) {
            list = programSearchResult.programList;
        }
        return programSearchResult.copy(i10, list);
    }

    public final int component1() {
        return this.totalSize;
    }

    public final List<AssetList> component2() {
        return this.programList;
    }

    public final ProgramSearchResult copy(int i10, List<AssetList> list) {
        return new ProgramSearchResult(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramSearchResult)) {
            return false;
        }
        ProgramSearchResult programSearchResult = (ProgramSearchResult) obj;
        return this.totalSize == programSearchResult.totalSize && AbstractC5868k.m23669a(this.programList, programSearchResult.programList);
    }

    public final List<AssetList> getProgramList() {
        return this.programList;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int i10 = this.totalSize * 31;
        List<AssetList> list = this.programList;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public final void setProgramList(List<AssetList> list) {
        this.programList = list;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public String toString() {
        return "ProgramSearchResult(totalSize=" + this.totalSize + ", programList=" + this.programList + ')';
    }
}
