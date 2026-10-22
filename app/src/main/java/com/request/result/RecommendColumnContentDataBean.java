package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class RecommendColumnContentDataBean {
    private List<ChildColumn> columnList;
    private String firstLevelColumnName;
    private List<PosterList> parentPosterList;
    private Integer totalSize;

    public RecommendColumnContentDataBean(List<ChildColumn> list, List<PosterList> list2, Integer num, String str) {
        this.columnList = list;
        this.parentPosterList = list2;
        this.totalSize = num;
        this.firstLevelColumnName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendColumnContentDataBean copy$default(RecommendColumnContentDataBean recommendColumnContentDataBean, List list, List list2, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = recommendColumnContentDataBean.columnList;
        }
        if ((i10 & 2) != 0) {
            list2 = recommendColumnContentDataBean.parentPosterList;
        }
        if ((i10 & 4) != 0) {
            num = recommendColumnContentDataBean.totalSize;
        }
        if ((i10 & 8) != 0) {
            str = recommendColumnContentDataBean.firstLevelColumnName;
        }
        return recommendColumnContentDataBean.copy(list, list2, num, str);
    }

    public final List<ChildColumn> component1() {
        return this.columnList;
    }

    public final List<PosterList> component2() {
        return this.parentPosterList;
    }

    public final Integer component3() {
        return this.totalSize;
    }

    public final String component4() {
        return this.firstLevelColumnName;
    }

    public final RecommendColumnContentDataBean copy(List<ChildColumn> list, List<PosterList> list2, Integer num, String str) {
        return new RecommendColumnContentDataBean(list, list2, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendColumnContentDataBean)) {
            return false;
        }
        RecommendColumnContentDataBean recommendColumnContentDataBean = (RecommendColumnContentDataBean) obj;
        return AbstractC5868k.m23669a(this.columnList, recommendColumnContentDataBean.columnList) && AbstractC5868k.m23669a(this.parentPosterList, recommendColumnContentDataBean.parentPosterList) && AbstractC5868k.m23669a(this.totalSize, recommendColumnContentDataBean.totalSize) && AbstractC5868k.m23669a(this.firstLevelColumnName, recommendColumnContentDataBean.firstLevelColumnName);
    }

    public final List<ChildColumn> getColumnList() {
        return this.columnList;
    }

    public final String getFirstLevelColumnName() {
        return this.firstLevelColumnName;
    }

    public final List<PosterList> getParentPosterList() {
        return this.parentPosterList;
    }

    public final Integer getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        List<ChildColumn> list = this.columnList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PosterList> list2 = this.parentPosterList;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.totalSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.firstLevelColumnName;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setColumnList(List<ChildColumn> list) {
        this.columnList = list;
    }

    public final void setFirstLevelColumnName(String str) {
        this.firstLevelColumnName = str;
    }

    public final void setParentPosterList(List<PosterList> list) {
        this.parentPosterList = list;
    }

    public final void setTotalSize(Integer num) {
        this.totalSize = num;
    }

    public String toString() {
        return "RecommendColumnContentDataBean(columnList=" + this.columnList + ", parentPosterList=" + this.parentPosterList + ", totalSize=" + this.totalSize + ", firstLevelColumnName=" + this.firstLevelColumnName + ')';
    }
}
