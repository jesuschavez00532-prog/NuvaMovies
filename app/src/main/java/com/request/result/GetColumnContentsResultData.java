package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetColumnContentsResultData implements Serializable {
    private List<ChildColumn> childColumnList;

    public GetColumnContentsResultData(List<ChildColumn> list) {
        this.childColumnList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetColumnContentsResultData copy$default(GetColumnContentsResultData getColumnContentsResultData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getColumnContentsResultData.childColumnList;
        }
        return getColumnContentsResultData.copy(list);
    }

    public final List<ChildColumn> component1() {
        return this.childColumnList;
    }

    public final GetColumnContentsResultData copy(List<ChildColumn> list) {
        return new GetColumnContentsResultData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetColumnContentsResultData) && AbstractC5868k.m23669a(this.childColumnList, ((GetColumnContentsResultData) obj).childColumnList);
    }

    public final List<ChildColumn> getChildColumnList() {
        return this.childColumnList;
    }

    public int hashCode() {
        List<ChildColumn> list = this.childColumnList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setChildColumnList(List<ChildColumn> list) {
        this.childColumnList = list;
    }

    public String toString() {
        return "GetColumnContentsResultData(childColumnList=" + this.childColumnList + ')';
    }
}
