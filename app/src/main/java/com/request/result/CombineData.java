package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import java.util.List;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class CombineData {
    private long endMoment;
    private String name;
    private long offset;
    private int seq;
    private List<Snapshot> snapshots;
    private long startMoment;

    public CombineData(int i10, String str, long j10, List<Snapshot> list) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        this.seq = i10;
        this.name = str;
        this.offset = j10;
        this.snapshots = list;
    }

    public static /* synthetic */ CombineData copy$default(CombineData combineData, int i10, String str, long j10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = combineData.seq;
        }
        if ((i11 & 2) != 0) {
            str = combineData.name;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j10 = combineData.offset;
        }
        long j11 = j10;
        if ((i11 & 8) != 0) {
            list = combineData.snapshots;
        }
        return combineData.copy(i10, str2, j11, list);
    }

    public final int component1() {
        return this.seq;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.offset;
    }

    public final List<Snapshot> component4() {
        return this.snapshots;
    }

    public final CombineData copy(int i10, String str, long j10, List<Snapshot> list) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        return new CombineData(i10, str, j10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombineData)) {
            return false;
        }
        CombineData combineData = (CombineData) obj;
        return this.seq == combineData.seq && AbstractC5868k.m23669a(this.name, combineData.name) && this.offset == combineData.offset && AbstractC5868k.m23669a(this.snapshots, combineData.snapshots);
    }

    public final long getEndMoment() {
        return this.endMoment;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    public final long getStartMoment() {
        return this.startMoment;
    }

    public int hashCode() {
        int hashCode = ((((this.seq * 31) + this.name.hashCode()) * 31) + AbstractC6322a.m25086a(this.offset)) * 31;
        List<Snapshot> list = this.snapshots;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setEndMoment(long j10) {
        this.endMoment = j10;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setOffset(long j10) {
        this.offset = j10;
    }

    public final void setSeq(int i10) {
        this.seq = i10;
    }

    public final void setSnapshots(List<Snapshot> list) {
        this.snapshots = list;
    }

    public final void setStartMoment(long j10) {
        this.startMoment = j10;
    }

    public String toString() {
        return "CombineData(seq=" + this.seq + ", name=" + this.name + ", offset=" + this.offset + ", snapshots=" + this.snapshots + ')';
    }
}
