package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class RecommendList implements Serializable {
    private int changeSeconds;
    private List<ContentList> contentList;
    private String recommendCode;
    private String scheduleName;

    public RecommendList(String str, String str2, int i10, List<ContentList> list) {
        this.recommendCode = str;
        this.scheduleName = str2;
        this.changeSeconds = i10;
        this.contentList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendList copy$default(RecommendList recommendList, String str, String str2, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendList.recommendCode;
        }
        if ((i11 & 2) != 0) {
            str2 = recommendList.scheduleName;
        }
        if ((i11 & 4) != 0) {
            i10 = recommendList.changeSeconds;
        }
        if ((i11 & 8) != 0) {
            list = recommendList.contentList;
        }
        return recommendList.copy(str, str2, i10, list);
    }

    public final String component1() {
        return this.recommendCode;
    }

    public final String component2() {
        return this.scheduleName;
    }

    public final int component3() {
        return this.changeSeconds;
    }

    public final List<ContentList> component4() {
        return this.contentList;
    }

    public final RecommendList copy(String str, String str2, int i10, List<ContentList> list) {
        return new RecommendList(str, str2, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendList)) {
            return false;
        }
        RecommendList recommendList = (RecommendList) obj;
        return AbstractC5868k.m23669a(this.recommendCode, recommendList.recommendCode) && AbstractC5868k.m23669a(this.scheduleName, recommendList.scheduleName) && this.changeSeconds == recommendList.changeSeconds && AbstractC5868k.m23669a(this.contentList, recommendList.contentList);
    }

    public final int getChangeSeconds() {
        return this.changeSeconds;
    }

    public final List<ContentList> getContentList() {
        return this.contentList;
    }

    public final String getRecommendCode() {
        return this.recommendCode;
    }

    public final String getScheduleName() {
        return this.scheduleName;
    }

    public int hashCode() {
        String str = this.recommendCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scheduleName;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.changeSeconds) * 31;
        List<ContentList> list = this.contentList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setChangeSeconds(int i10) {
        this.changeSeconds = i10;
    }

    public final void setContentList(List<ContentList> list) {
        this.contentList = list;
    }

    public final void setRecommendCode(String str) {
        this.recommendCode = str;
    }

    public final void setScheduleName(String str) {
        this.scheduleName = str;
    }

    public String toString() {
        return "RecommendList(recommendCode=" + this.recommendCode + ", scheduleName=" + this.scheduleName + ", changeSeconds=" + this.changeSeconds + ", contentList=" + this.contentList + ')';
    }
}
