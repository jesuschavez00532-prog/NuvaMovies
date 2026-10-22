package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FeedBackContactData {
    private String logo;
    private String name;
    private List<WorkInfoBean> workInfoList;

    public FeedBackContactData(String str, List<WorkInfoBean> list, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(list, "workInfoList");
        this.name = str;
        this.workInfoList = list;
        this.logo = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedBackContactData copy$default(FeedBackContactData feedBackContactData, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedBackContactData.name;
        }
        if ((i10 & 2) != 0) {
            list = feedBackContactData.workInfoList;
        }
        if ((i10 & 4) != 0) {
            str2 = feedBackContactData.logo;
        }
        return feedBackContactData.copy(str, list, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final List<WorkInfoBean> component2() {
        return this.workInfoList;
    }

    public final String component3() {
        return this.logo;
    }

    public final FeedBackContactData copy(String str, List<WorkInfoBean> list, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(list, "workInfoList");
        return new FeedBackContactData(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBackContactData)) {
            return false;
        }
        FeedBackContactData feedBackContactData = (FeedBackContactData) obj;
        return AbstractC5868k.m23669a(this.name, feedBackContactData.name) && AbstractC5868k.m23669a(this.workInfoList, feedBackContactData.workInfoList) && AbstractC5868k.m23669a(this.logo, feedBackContactData.logo);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final List<WorkInfoBean> getWorkInfoList() {
        return this.workInfoList;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.workInfoList.hashCode()) * 31;
        String str = this.logo;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setWorkInfoList(List<WorkInfoBean> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.workInfoList = list;
    }

    public String toString() {
        return "FeedBackContactData(name=" + this.name + ", workInfoList=" + this.workInfoList + ", logo=" + this.logo + ')';
    }
}
