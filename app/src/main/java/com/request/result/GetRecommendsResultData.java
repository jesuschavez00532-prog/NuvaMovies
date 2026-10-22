package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetRecommendsResultData implements Serializable {
    private List<RecommendList> recommendList;

    public GetRecommendsResultData(List<RecommendList> list) {
        this.recommendList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRecommendsResultData copy$default(GetRecommendsResultData getRecommendsResultData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getRecommendsResultData.recommendList;
        }
        return getRecommendsResultData.copy(list);
    }

    public final List<RecommendList> component1() {
        return this.recommendList;
    }

    public final GetRecommendsResultData copy(List<RecommendList> list) {
        return new GetRecommendsResultData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRecommendsResultData) && AbstractC5868k.m23669a(this.recommendList, ((GetRecommendsResultData) obj).recommendList);
    }

    public final List<RecommendList> getRecommendList() {
        return this.recommendList;
    }

    public int hashCode() {
        List<RecommendList> list = this.recommendList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setRecommendList(List<RecommendList> list) {
        this.recommendList = list;
    }

    public String toString() {
        return "GetRecommendsResultData(recommendList=" + this.recommendList + ')';
    }
}
