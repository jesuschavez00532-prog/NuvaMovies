package com.live.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.request.result.Channel;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SearchBean implements Comparable<SearchBean> {
    private Channel channel;

    /* renamed from: i */
    private int f10818i;
    private int pos;

    public SearchBean(int i10, Channel channel, int i11) {
        AbstractC5868k.m23674f(channel, "channel");
        this.f10818i = i10;
        this.channel = channel;
        this.pos = i11;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final int getI() {
        return this.f10818i;
    }

    public final int getPos() {
        return this.pos;
    }

    public final void setChannel(Channel channel) {
        AbstractC5868k.m23674f(channel, "<set-?>");
        this.channel = channel;
    }

    public final void setI(int i10) {
        this.f10818i = i10;
    }

    public final void setPos(int i10) {
        this.pos = i10;
    }

    public String toString() {
        return "SearchBean(i=" + this.f10818i + ", channel=" + this.channel + ", pos=" + this.pos + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchBean searchBean) {
        AbstractC5868k.m23674f(searchBean, DispatchConstants.OTHER);
        return this.f10818i - searchBean.f10818i;
    }
}
