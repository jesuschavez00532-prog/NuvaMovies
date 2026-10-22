package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes.dex */
public final class ExtranetIpResult implements Serializable {

    /* renamed from: ip */
    private String f12708ip;

    public ExtranetIpResult(String str) {
        AbstractC5868k.m23674f(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.f12708ip = str;
    }

    public static /* synthetic */ ExtranetIpResult copy$default(ExtranetIpResult extranetIpResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = extranetIpResult.f12708ip;
        }
        return extranetIpResult.copy(str);
    }

    public final String component1() {
        return this.f12708ip;
    }

    public final ExtranetIpResult copy(String str) {
        AbstractC5868k.m23674f(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        return new ExtranetIpResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtranetIpResult) && AbstractC5868k.m23669a(this.f12708ip, ((ExtranetIpResult) obj).f12708ip);
    }

    public final String getIp() {
        return this.f12708ip;
    }

    public int hashCode() {
        return this.f12708ip.hashCode();
    }

    public final void setIp(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12708ip = str;
    }

    public String toString() {
        return "ExtranetIpResult(ip=" + this.f12708ip + ')';
    }
}
