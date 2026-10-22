package com.request.result;

import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class Snapshot {
    private long moment;
    private int seq;

    public Snapshot(int i10, long j10) {
        this.seq = i10;
        this.moment = j10;
    }

    public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = snapshot.seq;
        }
        if ((i11 & 2) != 0) {
            j10 = snapshot.moment;
        }
        return snapshot.copy(i10, j10);
    }

    public final int component1() {
        return this.seq;
    }

    public final long component2() {
        return this.moment;
    }

    public final Snapshot copy(int i10, long j10) {
        return new Snapshot(i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        Snapshot snapshot = (Snapshot) obj;
        return this.seq == snapshot.seq && this.moment == snapshot.moment;
    }

    public final long getMoment() {
        return this.moment;
    }

    public final int getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return (this.seq * 31) + AbstractC6322a.m25086a(this.moment);
    }

    public final void setMoment(long j10) {
        this.moment = j10;
    }

    public final void setSeq(int i10) {
        this.seq = i10;
    }

    public String toString() {
        return "Snapshot(seq=" + this.seq + ", moment=" + this.moment + ')';
    }
}
