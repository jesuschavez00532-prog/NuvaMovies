package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayLiveResultData {
    private List<LiveAddress> liveAddressList;
    private String name;

    public StartPlayLiveResultData(List<LiveAddress> list, String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        this.liveAddressList = list;
        this.name = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartPlayLiveResultData copy$default(StartPlayLiveResultData startPlayLiveResultData, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = startPlayLiveResultData.liveAddressList;
        }
        if ((i10 & 2) != 0) {
            str = startPlayLiveResultData.name;
        }
        return startPlayLiveResultData.copy(list, str);
    }

    public final List<LiveAddress> component1() {
        return this.liveAddressList;
    }

    public final String component2() {
        return this.name;
    }

    public final StartPlayLiveResultData copy(List<LiveAddress> list, String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        return new StartPlayLiveResultData(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayLiveResultData)) {
            return false;
        }
        StartPlayLiveResultData startPlayLiveResultData = (StartPlayLiveResultData) obj;
        return AbstractC5868k.m23669a(this.liveAddressList, startPlayLiveResultData.liveAddressList) && AbstractC5868k.m23669a(this.name, startPlayLiveResultData.name);
    }

    public final List<LiveAddress> getLiveAddressList() {
        return this.liveAddressList;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        List<LiveAddress> list = this.liveAddressList;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.name.hashCode();
    }

    public final void setLiveAddressList(List<LiveAddress> list) {
        this.liveAddressList = list;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "StartPlayLiveResultData(liveAddressList=" + this.liveAddressList + ", name=" + this.name + ')';
    }
}
