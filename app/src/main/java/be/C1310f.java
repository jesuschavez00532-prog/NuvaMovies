package be;

import anet.channel.strategy.dispatch.DispatchConstants;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import re.C6575c;

/* renamed from: be.f */
/* loaded from: classes3.dex */
public final class C1310f implements Comparable {

    /* renamed from: e */
    public static final a f4973e = new a(null);

    /* renamed from: f */
    public static final C1310f f4974f = C1311g.m5961a();

    /* renamed from: a */
    private final int f4975a;

    /* renamed from: b */
    private final int f4976b;

    /* renamed from: c */
    private final int f4977c;

    /* renamed from: d */
    private final int f4978d;

    /* renamed from: be.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public C1310f(int i10, int i11, int i12) {
        this.f4975a = i10;
        this.f4976b = i11;
        this.f4977c = i12;
        this.f4978d = m5959b(i10, i11, i12);
    }

    /* renamed from: b */
    private final int m5959b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new C6575c(0, 255).m25662n(i10) && new C6575c(0, 255).m25662n(i11) && new C6575c(0, 255).m25662n(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1310f c1310f) {
        AbstractC5868k.m23674f(c1310f, DispatchConstants.OTHER);
        return this.f4978d - c1310f.f4978d;
    }

    public boolean equals(Object obj) {
        C1310f c1310f;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1310f) {
            c1310f = (C1310f) obj;
        } else {
            c1310f = null;
        }
        if (c1310f != null && this.f4978d == c1310f.f4978d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4978d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4975a);
        sb2.append('.');
        sb2.append(this.f4976b);
        sb2.append('.');
        sb2.append(this.f4977c);
        return sb2.toString();
    }
}
