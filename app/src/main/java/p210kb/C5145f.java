package p210kb;

import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* renamed from: kb.f */
/* loaded from: classes2.dex */
public final class C5145f {

    /* renamed from: a */
    public final String f21102a;

    /* renamed from: b */
    public final int f21103b;

    /* renamed from: c */
    public final int f21104c;

    /* renamed from: d */
    public final long f21105d;

    /* renamed from: e */
    public final a f21106e;

    /* renamed from: kb.f$a */
    /* loaded from: classes2.dex */
    public enum a {
        Unknown,
        DnspodFree,
        DnspodEnterprise,
        System
    }

    public C5145f(String str, int i10, int i11, long j10, a aVar) {
        this.f21102a = str;
        this.f21103b = i10;
        this.f21104c = i11 < 600 ? IjkMediaCodecInfo.RANK_LAST_CHANCE : i11;
        this.f21105d = j10;
        this.f21106e = aVar;
    }

    /* renamed from: a */
    public boolean m20807a() {
        return m20808b(System.currentTimeMillis() / 1000);
    }

    /* renamed from: b */
    public boolean m20808b(long j10) {
        if (this.f21105d + this.f21104c < j10) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5145f)) {
            return false;
        }
        C5145f c5145f = (C5145f) obj;
        if (this.f21102a.equals(c5145f.f21102a) && this.f21103b == c5145f.f21103b && this.f21104c == c5145f.f21104c && this.f21105d == c5145f.f21105d) {
            return true;
        }
        return false;
    }
}
