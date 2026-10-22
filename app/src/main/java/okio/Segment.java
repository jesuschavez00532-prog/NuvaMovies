package okio;

import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Segment {
    static final int SHARE_MINIMUM = 1024;
    static final int SIZE = 8192;
    final byte[] data;
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i10;
        Segment segment = this.prev;
        if (segment != this) {
            if (!segment.owner) {
                return;
            }
            int i11 = this.limit - this.pos;
            int i12 = 8192 - segment.limit;
            if (segment.shared) {
                i10 = 0;
            } else {
                i10 = segment.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            writeTo(segment, i11);
            pop();
            SegmentPool.recycle(this);
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final Segment pop() {
        Segment segment;
        Segment segment2 = this.next;
        if (segment2 != this) {
            segment = segment2;
        } else {
            segment = null;
        }
        Segment segment3 = this.prev;
        segment3.next = segment2;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i10) {
        Segment take;
        if (i10 > 0 && i10 <= this.limit - this.pos) {
            if (i10 >= 1024) {
                take = sharedCopy();
            } else {
                take = SegmentPool.take();
                System.arraycopy(this.data, this.pos, take.data, 0, i10);
            }
            take.limit = take.pos + i10;
            this.pos += i10;
            this.prev.push(take);
            return take;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Segment unsharedCopy() {
        return new Segment((byte[]) this.data.clone(), this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i10) {
        if (segment.owner) {
            int i11 = segment.limit;
            if (i11 + i10 > 8192) {
                if (!segment.shared) {
                    int i12 = segment.pos;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = segment.data;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        segment.limit -= segment.pos;
                        segment.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.data, this.pos, segment.data, segment.limit, i10);
            segment.limit += i10;
            this.pos += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.data = bArr;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
