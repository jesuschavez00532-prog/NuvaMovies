package com.module.event;

import com.request.result.Channel;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class LockChannelEvent {
    private Channel channel;

    public LockChannelEvent(Channel channel) {
        AbstractC5868k.m23674f(channel, "channel");
        this.channel = channel;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final void setChannel(Channel channel) {
        AbstractC5868k.m23674f(channel, "<set-?>");
        this.channel = channel;
    }
}
