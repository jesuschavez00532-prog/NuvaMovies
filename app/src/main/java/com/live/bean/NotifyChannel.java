package com.live.bean;

import com.request.result.Channel;
import java.util.ArrayList;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes2.dex */
public final class NotifyChannel {
    private final ArrayList<Channel> channels;
    private final int playIndex;

    public NotifyChannel(int i10, ArrayList<Channel> arrayList) {
        AbstractC5868k.m23674f(arrayList, IjkMediaMeta.IJKM_KEY_CHANNELS);
        this.playIndex = i10;
        this.channels = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyChannel copy$default(NotifyChannel notifyChannel, int i10, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = notifyChannel.playIndex;
        }
        if ((i11 & 2) != 0) {
            arrayList = notifyChannel.channels;
        }
        return notifyChannel.copy(i10, arrayList);
    }

    public final int component1() {
        return this.playIndex;
    }

    public final ArrayList<Channel> component2() {
        return this.channels;
    }

    public final NotifyChannel copy(int i10, ArrayList<Channel> arrayList) {
        AbstractC5868k.m23674f(arrayList, IjkMediaMeta.IJKM_KEY_CHANNELS);
        return new NotifyChannel(i10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyChannel)) {
            return false;
        }
        NotifyChannel notifyChannel = (NotifyChannel) obj;
        return this.playIndex == notifyChannel.playIndex && AbstractC5868k.m23669a(this.channels, notifyChannel.channels);
    }

    public final ArrayList<Channel> getChannels() {
        return this.channels;
    }

    public final int getPlayIndex() {
        return this.playIndex;
    }

    public int hashCode() {
        return (this.playIndex * 31) + this.channels.hashCode();
    }

    public String toString() {
        return "NotifyChannel(playIndex=" + this.playIndex + ", channels=" + this.channels + ')';
    }
}
