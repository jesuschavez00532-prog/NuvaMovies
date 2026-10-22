package gb;

import ne.AbstractC5868k;

/* renamed from: gb.f */
/* loaded from: classes2.dex */
public final class C4423f {

    /* renamed from: b */
    private long f19141b;

    /* renamed from: c */
    private long f19142c;

    /* renamed from: a */
    private String f19140a = "";

    /* renamed from: d */
    private String f19143d = "";

    /* renamed from: a */
    public final String m18540a() {
        return this.f19143d;
    }

    /* renamed from: b */
    public final long m18541b() {
        return this.f19142c;
    }

    /* renamed from: c */
    public final long m18542c() {
        return this.f19141b;
    }

    /* renamed from: d */
    public final void m18543d(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f19143d = str;
    }

    /* renamed from: e */
    public final void m18544e(long j10) {
        this.f19142c = j10;
    }

    /* renamed from: f */
    public final void m18545f(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f19140a = str;
    }

    /* renamed from: g */
    public final void m18546g(long j10) {
        this.f19141b = j10;
    }

    public String toString() {
        return "SRT(node=" + this.f19140a + ", startTime=" + this.f19141b + ", endTime=" + this.f19142c + ", content='" + this.f19143d + "')";
    }
}
