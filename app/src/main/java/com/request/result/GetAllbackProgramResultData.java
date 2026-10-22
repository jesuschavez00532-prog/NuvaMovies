package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetAllbackProgramResultData implements Serializable {
    private List<Channel> channelList;
    private Integer totalSize;

    public GetAllbackProgramResultData(Integer num, List<Channel> list) {
        this.totalSize = num;
        this.channelList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllbackProgramResultData copy$default(GetAllbackProgramResultData getAllbackProgramResultData, Integer num, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = getAllbackProgramResultData.totalSize;
        }
        if ((i10 & 2) != 0) {
            list = getAllbackProgramResultData.channelList;
        }
        return getAllbackProgramResultData.copy(num, list);
    }

    public final Integer component1() {
        return this.totalSize;
    }

    public final List<Channel> component2() {
        return this.channelList;
    }

    public final GetAllbackProgramResultData copy(Integer num, List<Channel> list) {
        return new GetAllbackProgramResultData(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllbackProgramResultData)) {
            return false;
        }
        GetAllbackProgramResultData getAllbackProgramResultData = (GetAllbackProgramResultData) obj;
        return AbstractC5868k.m23669a(this.totalSize, getAllbackProgramResultData.totalSize) && AbstractC5868k.m23669a(this.channelList, getAllbackProgramResultData.channelList);
    }

    public final List<Channel> getChannelList() {
        return this.channelList;
    }

    public final Integer getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        Integer num = this.totalSize;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Channel> list = this.channelList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setChannelList(List<Channel> list) {
        this.channelList = list;
    }

    public final void setTotalSize(Integer num) {
        this.totalSize = num;
    }

    public String toString() {
        return "GetAllbackProgramResultData(totalSize=" + this.totalSize + ", channelList=" + this.channelList + ')';
    }
}
