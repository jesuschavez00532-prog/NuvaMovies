package com.bigbee.bean.request;

import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class PlaySourceDetail {
    private String data;
    private String event;
    private String from;

    /* renamed from: st */
    private long f6211st;

    public PlaySourceDetail(long j10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "event");
        AbstractC5868k.m23674f(str2, "data");
        this.f6211st = j10;
        this.event = str;
        this.data = str2;
        this.from = str3;
    }

    public static /* synthetic */ PlaySourceDetail copy$default(PlaySourceDetail playSourceDetail, long j10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = playSourceDetail.f6211st;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = playSourceDetail.event;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = playSourceDetail.data;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = playSourceDetail.from;
        }
        return playSourceDetail.copy(j11, str4, str5, str3);
    }

    public final long component1() {
        return this.f6211st;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.data;
    }

    public final String component4() {
        return this.from;
    }

    public final PlaySourceDetail copy(long j10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "event");
        AbstractC5868k.m23674f(str2, "data");
        return new PlaySourceDetail(j10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaySourceDetail)) {
            return false;
        }
        PlaySourceDetail playSourceDetail = (PlaySourceDetail) obj;
        return this.f6211st == playSourceDetail.f6211st && AbstractC5868k.m23669a(this.event, playSourceDetail.event) && AbstractC5868k.m23669a(this.data, playSourceDetail.data) && AbstractC5868k.m23669a(this.from, playSourceDetail.from);
    }

    public final String getData() {
        return this.data;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getFrom() {
        return this.from;
    }

    public final long getSt() {
        return this.f6211st;
    }

    public int hashCode() {
        int m25086a = ((((AbstractC6322a.m25086a(this.f6211st) * 31) + this.event.hashCode()) * 31) + this.data.hashCode()) * 31;
        String str = this.from;
        return m25086a + (str == null ? 0 : str.hashCode());
    }

    public final void setData(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.data = str;
    }

    public final void setEvent(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.event = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setSt(long j10) {
        this.f6211st = j10;
    }

    public String toString() {
        return "PlaySourceDetail(st=" + this.f6211st + ", event=" + this.event + ", data=" + this.data + ", from=" + this.from + ')';
    }
}
