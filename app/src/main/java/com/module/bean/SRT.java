package com.module.bean;

import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes2.dex */
public final class SRT {
    private String content;
    private long endTime;
    private String node;
    private long startTime;

    public SRT() {
        this(null, 0L, 0L, null, 15, null);
    }

    public static /* synthetic */ SRT copy$default(SRT srt, String str, long j10, long j11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = srt.node;
        }
        if ((i10 & 2) != 0) {
            j10 = srt.startTime;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = srt.endTime;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            str2 = srt.content;
        }
        return srt.copy(str, j12, j13, str2);
    }

    public final String component1() {
        return this.node;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final String component4() {
        return this.content;
    }

    public final SRT copy(String str, long j10, long j11, String str2) {
        AbstractC5868k.m23674f(str, "node");
        AbstractC5868k.m23674f(str2, "content");
        return new SRT(str, j10, j11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRT)) {
            return false;
        }
        SRT srt = (SRT) obj;
        return AbstractC5868k.m23669a(this.node, srt.node) && this.startTime == srt.startTime && this.endTime == srt.endTime && AbstractC5868k.m23669a(this.content, srt.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getNode() {
        return this.node;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((this.node.hashCode() * 31) + AbstractC6322a.m25086a(this.startTime)) * 31) + AbstractC6322a.m25086a(this.endTime)) * 31) + this.content.hashCode();
    }

    public final void setContent(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.content = str;
    }

    public final void setEndTime(long j10) {
        this.endTime = j10;
    }

    public final void setNode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.node = str;
    }

    public final void setStartTime(long j10) {
        this.startTime = j10;
    }

    public String toString() {
        return "SRT(node=" + this.node + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", content=" + this.content + ')';
    }

    public SRT(String str, long j10, long j11, String str2) {
        AbstractC5868k.m23674f(str, "node");
        AbstractC5868k.m23674f(str2, "content");
        this.node = str;
        this.startTime = j10;
        this.endTime = j11;
        this.content = str2;
    }

    public /* synthetic */ SRT(String str, long j10, long j11, String str2, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) == 0 ? j11 : 0L, (i10 & 8) != 0 ? "" : str2);
    }
}
