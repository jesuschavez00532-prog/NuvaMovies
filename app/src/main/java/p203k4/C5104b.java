package p203k4;

import p187j4.C4987a;
import p219l4.AbstractC5388m;

/* renamed from: k4.b */
/* loaded from: classes.dex */
public final class C5104b {

    /* renamed from: a */
    private final int f21030a;

    /* renamed from: b */
    private final C4987a f21031b;

    /* renamed from: c */
    private final C4987a.d f21032c;

    /* renamed from: d */
    private final String f21033d;

    private C5104b(C4987a c4987a, C4987a.d dVar, String str) {
        this.f21031b = c4987a;
        this.f21032c = dVar;
        this.f21033d = str;
        this.f21030a = AbstractC5388m.m21772b(c4987a, dVar, str);
    }

    /* renamed from: a */
    public static C5104b m20742a(C4987a c4987a, C4987a.d dVar, String str) {
        return new C5104b(c4987a, dVar, str);
    }

    /* renamed from: b */
    public final String m20743b() {
        return this.f21031b.m20346b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5104b)) {
            return false;
        }
        C5104b c5104b = (C5104b) obj;
        if (!AbstractC5388m.m21771a(this.f21031b, c5104b.f21031b) || !AbstractC5388m.m21771a(this.f21032c, c5104b.f21032c) || !AbstractC5388m.m21771a(this.f21033d, c5104b.f21033d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21030a;
    }
}
