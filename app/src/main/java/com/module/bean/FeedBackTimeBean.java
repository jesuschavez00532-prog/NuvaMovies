package com.module.bean;

import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes2.dex */
public final class FeedBackTimeBean implements MultiItemEntity {
    private String time;

    public FeedBackTimeBean(String str) {
        AbstractC5868k.m23674f(str, AgooConstants.MESSAGE_TIME);
        this.time = str;
    }

    public static /* synthetic */ FeedBackTimeBean copy$default(FeedBackTimeBean feedBackTimeBean, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedBackTimeBean.time;
        }
        return feedBackTimeBean.copy(str);
    }

    public final String component1() {
        return this.time;
    }

    public final FeedBackTimeBean copy(String str) {
        AbstractC5868k.m23674f(str, AgooConstants.MESSAGE_TIME);
        return new FeedBackTimeBean(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedBackTimeBean) && AbstractC5868k.m23669a(this.time, ((FeedBackTimeBean) obj).time);
    }

    @Override // com.module.bean.MultiItemEntity
    public int getItemType() {
        return 3;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.time.hashCode();
    }

    public final void setTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.time = str;
    }

    public String toString() {
        return "FeedBackTimeBean(time=" + this.time + ')';
    }
}
