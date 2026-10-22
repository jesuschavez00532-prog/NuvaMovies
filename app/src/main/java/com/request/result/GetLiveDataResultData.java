package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetLiveDataResultData implements Serializable {
    private String apkNumberSwitch;
    private List<Channel> channelList;
    private Integer channelListTotalSize;
    private String dataVersion;
    private String expireTimeStr;

    public GetLiveDataResultData(String str, String str2, Integer num, String str3, List<Channel> list) {
        AbstractC5868k.m23674f(str2, "expireTimeStr");
        this.dataVersion = str;
        this.expireTimeStr = str2;
        this.channelListTotalSize = num;
        this.apkNumberSwitch = str3;
        this.channelList = list;
    }

    public static /* synthetic */ GetLiveDataResultData copy$default(GetLiveDataResultData getLiveDataResultData, String str, String str2, Integer num, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getLiveDataResultData.dataVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = getLiveDataResultData.expireTimeStr;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            num = getLiveDataResultData.channelListTotalSize;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            str3 = getLiveDataResultData.apkNumberSwitch;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            list = getLiveDataResultData.channelList;
        }
        return getLiveDataResultData.copy(str, str4, num2, str5, list);
    }

    public final String component1() {
        return this.dataVersion;
    }

    public final String component2() {
        return this.expireTimeStr;
    }

    public final Integer component3() {
        return this.channelListTotalSize;
    }

    public final String component4() {
        return this.apkNumberSwitch;
    }

    public final List<Channel> component5() {
        return this.channelList;
    }

    public final GetLiveDataResultData copy(String str, String str2, Integer num, String str3, List<Channel> list) {
        AbstractC5868k.m23674f(str2, "expireTimeStr");
        return new GetLiveDataResultData(str, str2, num, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLiveDataResultData)) {
            return false;
        }
        GetLiveDataResultData getLiveDataResultData = (GetLiveDataResultData) obj;
        return AbstractC5868k.m23669a(this.dataVersion, getLiveDataResultData.dataVersion) && AbstractC5868k.m23669a(this.expireTimeStr, getLiveDataResultData.expireTimeStr) && AbstractC5868k.m23669a(this.channelListTotalSize, getLiveDataResultData.channelListTotalSize) && AbstractC5868k.m23669a(this.apkNumberSwitch, getLiveDataResultData.apkNumberSwitch) && AbstractC5868k.m23669a(this.channelList, getLiveDataResultData.channelList);
    }

    public final String getApkNumberSwitch() {
        return this.apkNumberSwitch;
    }

    public final List<Channel> getChannelList() {
        return this.channelList;
    }

    public final Integer getChannelListTotalSize() {
        return this.channelListTotalSize;
    }

    public final String getDataVersion() {
        return this.dataVersion;
    }

    public final String getExpireTimeStr() {
        return this.expireTimeStr;
    }

    public int hashCode() {
        String str = this.dataVersion;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.expireTimeStr.hashCode()) * 31;
        Integer num = this.channelListTotalSize;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.apkNumberSwitch;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Channel> list = this.channelList;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setApkNumberSwitch(String str) {
        this.apkNumberSwitch = str;
    }

    public final void setChannelList(List<Channel> list) {
        this.channelList = list;
    }

    public final void setChannelListTotalSize(Integer num) {
        this.channelListTotalSize = num;
    }

    public final void setDataVersion(String str) {
        this.dataVersion = str;
    }

    public final void setExpireTimeStr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.expireTimeStr = str;
    }

    public String toString() {
        return "GetLiveDataResultData(dataVersion=" + this.dataVersion + ", expireTimeStr=" + this.expireTimeStr + ", channelListTotalSize=" + this.channelListTotalSize + ", apkNumberSwitch=" + this.apkNumberSwitch + ", channelList=" + this.channelList + ')';
    }
}
