package com.module.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class FeedBackContactBean implements MultiItemEntity {
    private String contact;
    private String name;

    public FeedBackContactBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "contact");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        this.contact = str;
        this.name = str2;
    }

    public static /* synthetic */ FeedBackContactBean copy$default(FeedBackContactBean feedBackContactBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedBackContactBean.contact;
        }
        if ((i10 & 2) != 0) {
            str2 = feedBackContactBean.name;
        }
        return feedBackContactBean.copy(str, str2);
    }

    public final String component1() {
        return this.contact;
    }

    public final String component2() {
        return this.name;
    }

    public final FeedBackContactBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "contact");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        return new FeedBackContactBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBackContactBean)) {
            return false;
        }
        FeedBackContactBean feedBackContactBean = (FeedBackContactBean) obj;
        return AbstractC5868k.m23669a(this.contact, feedBackContactBean.contact) && AbstractC5868k.m23669a(this.name, feedBackContactBean.name);
    }

    public final String getContact() {
        return this.contact;
    }

    @Override // com.module.bean.MultiItemEntity
    public int getItemType() {
        return 2;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.contact.hashCode() * 31) + this.name.hashCode();
    }

    public final void setContact(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contact = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "FeedBackContactBean(contact=" + this.contact + ", name=" + this.name + ')';
    }
}
