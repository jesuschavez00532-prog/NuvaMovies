package androidx.lifecycle;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class C0762p {

    /* renamed from: a */
    private final a f3148a;

    /* renamed from: b */
    private final C0763q f3149b;

    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        AbstractC0761o mo3585a(Class cls);
    }

    public C0762p(C0763q c0763q, a aVar) {
        this.f3148a = aVar;
        this.f3149b = c0763q;
    }

    /* renamed from: a */
    public AbstractC0761o m3742a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m3743b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public AbstractC0761o m3743b(String str, Class cls) {
        AbstractC0761o m3745b = this.f3149b.m3745b(str);
        if (cls.isInstance(m3745b)) {
            return m3745b;
        }
        AbstractC0761o mo3585a = this.f3148a.mo3585a(cls);
        this.f3149b.m3747d(str, mo3585a);
        return mo3585a;
    }
}
