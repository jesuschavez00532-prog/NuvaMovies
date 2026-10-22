package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayBTVResultData implements Serializable {
    private List<StartPlayBTVResultLicenseList> totalPlayUrlList;

    public StartPlayBTVResultData(List<StartPlayBTVResultLicenseList> list) {
        this.totalPlayUrlList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartPlayBTVResultData copy$default(StartPlayBTVResultData startPlayBTVResultData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = startPlayBTVResultData.totalPlayUrlList;
        }
        return startPlayBTVResultData.copy(list);
    }

    public final List<StartPlayBTVResultLicenseList> component1() {
        return this.totalPlayUrlList;
    }

    public final StartPlayBTVResultData copy(List<StartPlayBTVResultLicenseList> list) {
        return new StartPlayBTVResultData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartPlayBTVResultData) && AbstractC5868k.m23669a(this.totalPlayUrlList, ((StartPlayBTVResultData) obj).totalPlayUrlList);
    }

    public final List<StartPlayBTVResultLicenseList> getTotalPlayUrlList() {
        return this.totalPlayUrlList;
    }

    public int hashCode() {
        List<StartPlayBTVResultLicenseList> list = this.totalPlayUrlList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTotalPlayUrlList(List<StartPlayBTVResultLicenseList> list) {
        this.totalPlayUrlList = list;
    }

    public String toString() {
        return "StartPlayBTVResultData(totalPlayUrlList=" + this.totalPlayUrlList + ')';
    }
}
