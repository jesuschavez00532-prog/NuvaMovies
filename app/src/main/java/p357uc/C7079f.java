package p357uc;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: uc.f */
/* loaded from: classes3.dex */
public final class C7079f {

    /* renamed from: a */
    private int f26547a;

    /* renamed from: b */
    private String f26548b;

    /* renamed from: c */
    private String f26549c;

    /* renamed from: d */
    private float f26550d;

    /* renamed from: e */
    private long f26551e;

    /* renamed from: f */
    private long f26552f;

    public C7079f(int i10, String str, String str2, float f10, long j10, long j11) {
        AbstractC5868k.m23675g(str, "codec");
        AbstractC5868k.m23675g(str2, "decoder");
        this.f26547a = i10;
        this.f26548b = str;
        this.f26549c = str2;
        this.f26550d = f10;
        this.f26551e = j10;
        this.f26552f = j11;
    }

    /* renamed from: a */
    public final String m27286a() {
        return this.f26549c;
    }

    /* renamed from: b */
    public final void m27287b(long j10) {
        this.f26552f = j10;
    }

    /* renamed from: c */
    public final void m27288c(long j10) {
        this.f26551e = j10;
    }

    /* renamed from: d */
    public final void m27289d(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26548b = str;
    }

    /* renamed from: e */
    public final void m27290e(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26549c = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7079f) {
                C7079f c7079f = (C7079f) obj;
                if ((this.f26547a == c7079f.f26547a) && AbstractC5868k.m23669a(this.f26548b, c7079f.f26548b) && AbstractC5868k.m23669a(this.f26549c, c7079f.f26549c) && Float.compare(this.f26550d, c7079f.f26550d) == 0) {
                    if (this.f26551e == c7079f.f26551e) {
                        if (this.f26552f == c7079f.f26552f) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m27291f(float f10) {
        this.f26550d = f10;
    }

    /* renamed from: g */
    public final void m27292g(int i10) {
        this.f26547a = i10;
    }

    public int hashCode() {
        int i10 = this.f26547a * 31;
        String str = this.f26548b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26549c;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f26550d)) * 31;
        long j10 = this.f26551e;
        int i11 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f26552f;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "VideoTrackInfo(id=" + this.f26547a + ", codec=" + this.f26548b + ", decoder=" + this.f26549c + ", frame_rate=" + this.f26550d + ", buffer_time=" + this.f26551e + ", buffer_length=" + this.f26552f + ")";
    }

    public /* synthetic */ C7079f(int i10, String str, String str2, float f10, long j10, long j11, int i11, AbstractC5864g abstractC5864g) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) == 0 ? str2 : "", (i11 & 8) != 0 ? 0.0f : f10, (i11 & 16) != 0 ? 0L : j10, (i11 & 32) == 0 ? j11 : 0L);
    }
}
