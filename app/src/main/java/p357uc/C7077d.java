package p357uc;

import ne.AbstractC5864g;

/* renamed from: uc.d */
/* loaded from: classes3.dex */
public final class C7077d {

    /* renamed from: a */
    private int f26540a;

    /* renamed from: b */
    private int f26541b;

    /* renamed from: c */
    private int f26542c;

    public C7077d(int i10, int i11, int i12) {
        this.f26540a = i10;
        this.f26541b = i11;
        this.f26542c = i12;
    }

    /* renamed from: a */
    public final int m27282a() {
        return this.f26541b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7077d) {
                C7077d c7077d = (C7077d) obj;
                if (this.f26540a == c7077d.f26540a) {
                    if (this.f26541b == c7077d.f26541b) {
                        if (this.f26542c == c7077d.f26542c) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f26540a * 31) + this.f26541b) * 31) + this.f26542c;
    }

    public String toString() {
        return "SelectedTracks(videoTrack=" + this.f26540a + ", audioTrack=" + this.f26541b + ", subtitleTrack=" + this.f26542c + ")";
    }

    public /* synthetic */ C7077d(int i10, int i11, int i12, int i13, AbstractC5864g abstractC5864g) {
        this((i13 & 1) != 0 ? -1 : i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? -1 : i12);
    }
}
