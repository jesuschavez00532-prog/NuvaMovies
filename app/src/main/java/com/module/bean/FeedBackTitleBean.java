package com.module.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import com.request.result.FeedBackContactData;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class FeedBackTitleBean implements MultiItemEntity {
    private String logo;
    private String name;

    public FeedBackTitleBean(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        this.name = str;
        this.logo = str2;
    }

    public static /* synthetic */ FeedBackTitleBean copy$default(FeedBackTitleBean feedBackTitleBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedBackTitleBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = feedBackTitleBean.logo;
        }
        return feedBackTitleBean.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.logo;
    }

    public final FeedBackTitleBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        return new FeedBackTitleBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBackTitleBean)) {
            return false;
        }
        FeedBackTitleBean feedBackTitleBean = (FeedBackTitleBean) obj;
        return AbstractC5868k.m23669a(this.name, feedBackTitleBean.name) && AbstractC5868k.m23669a(this.logo, feedBackTitleBean.logo);
    }

    @Override // com.module.bean.MultiItemEntity
    public int getItemType() {
        return 1;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
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

    public String toString() {
        return "FeedBackTitleBean(name=" + this.name + ", logo=" + this.logo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedBackTitleBean(FeedBackContactData feedBackContactData) {
        this(feedBackContactData.getName(), feedBackContactData.getLogo());
        AbstractC5868k.m23674f(feedBackContactData, "data");
    }
}
