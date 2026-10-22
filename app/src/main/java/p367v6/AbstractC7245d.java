package p367v6;

import p367v6.C7242a;
import p367v6.C7244c;

/* renamed from: v6.d */
/* loaded from: classes.dex */
public abstract class AbstractC7245d {

    /* renamed from: a */
    public static AbstractC7245d f27074a = m28041a().mo28020a();

    /* renamed from: v6.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC7245d mo28020a();

        /* renamed from: b */
        public abstract a mo28021b(String str);

        /* renamed from: c */
        public abstract a mo28022c(long j10);

        /* renamed from: d */
        public abstract a mo28023d(String str);

        /* renamed from: e */
        public abstract a mo28024e(String str);

        /* renamed from: f */
        public abstract a mo28025f(String str);

        /* renamed from: g */
        public abstract a mo28026g(C7244c.a aVar);

        /* renamed from: h */
        public abstract a mo28027h(long j10);
    }

    /* renamed from: a */
    public static a m28041a() {
        return new C7242a.b().mo28027h(0L).mo28026g(C7244c.a.ATTEMPT_MIGRATION).mo28022c(0L);
    }

    /* renamed from: b */
    public abstract String mo28012b();

    /* renamed from: c */
    public abstract long mo28013c();

    /* renamed from: d */
    public abstract String mo28014d();

    /* renamed from: e */
    public abstract String mo28015e();

    /* renamed from: f */
    public abstract String mo28016f();

    /* renamed from: g */
    public abstract C7244c.a mo28017g();

    /* renamed from: h */
    public abstract long mo28018h();

    /* renamed from: i */
    public boolean m28042i() {
        if (mo28017g() == C7244c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m28043j() {
        if (mo28017g() != C7244c.a.NOT_GENERATED && mo28017g() != C7244c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m28044k() {
        if (mo28017g() == C7244c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m28045l() {
        if (mo28017g() == C7244c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m28046m() {
        if (mo28017g() == C7244c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract a mo28019n();

    /* renamed from: o */
    public AbstractC7245d m28047o(String str, long j10, long j11) {
        return mo28019n().mo28021b(str).mo28022c(j10).mo28027h(j11).mo28020a();
    }

    /* renamed from: p */
    public AbstractC7245d m28048p() {
        return mo28019n().mo28021b(null).mo28020a();
    }

    /* renamed from: q */
    public AbstractC7245d m28049q(String str) {
        return mo28019n().mo28024e(str).mo28026g(C7244c.a.REGISTER_ERROR).mo28020a();
    }

    /* renamed from: r */
    public AbstractC7245d m28050r() {
        return mo28019n().mo28026g(C7244c.a.NOT_GENERATED).mo28020a();
    }

    /* renamed from: s */
    public AbstractC7245d m28051s(String str, String str2, long j10, String str3, long j11) {
        return mo28019n().mo28023d(str).mo28026g(C7244c.a.REGISTERED).mo28021b(str3).mo28025f(str2).mo28022c(j11).mo28027h(j10).mo28020a();
    }

    /* renamed from: t */
    public AbstractC7245d m28052t(String str) {
        return mo28019n().mo28023d(str).mo28026g(C7244c.a.UNREGISTERED).mo28020a();
    }
}
