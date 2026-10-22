package p116e9;

import com.module.bean.Album;
import com.module.bean.Link;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: e9.a */
/* loaded from: classes2.dex */
public final class C4156a {

    /* renamed from: a */
    private final Album f18212a;

    /* renamed from: b */
    private Link f18213b;

    public C4156a(Album album, Link link) {
        AbstractC5868k.m23674f(album, "album");
        this.f18212a = album;
        this.f18213b = link;
    }

    /* renamed from: a */
    public final Album m17368a() {
        return this.f18212a;
    }

    /* renamed from: b */
    public final Link m17369b() {
        return this.f18213b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4156a)) {
            return false;
        }
        C4156a c4156a = (C4156a) obj;
        return AbstractC5868k.m23669a(this.f18212a, c4156a.f18212a) && AbstractC5868k.m23669a(this.f18213b, c4156a.f18213b);
    }

    public int hashCode() {
        int hashCode = this.f18212a.hashCode() * 31;
        Link link = this.f18213b;
        return hashCode + (link == null ? 0 : link.hashCode());
    }

    public String toString() {
        return "HistoryWrapperBean(album=" + this.f18212a + ", link=" + this.f18213b + ")";
    }

    public /* synthetic */ C4156a(Album album, Link link, int i10, AbstractC5864g abstractC5864g) {
        this(album, (i10 & 2) != 0 ? null : link);
    }
}
