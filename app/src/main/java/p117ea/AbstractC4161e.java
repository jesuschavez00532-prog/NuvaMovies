package p117ea;

import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p400xa.C7577i1;

/* renamed from: ea.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4161e {

    /* renamed from: a */
    public static final a f18225a = new a(null);

    /* renamed from: b */
    private static final String f18226b = "child_password_new";

    /* renamed from: c */
    private static final String f18227c = "child_switch";

    /* renamed from: d */
    private static long f18228d;

    /* renamed from: e */
    private static long f18229e;

    /* renamed from: ea.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m17398a() {
            C7577i1.f27838b.m29082a().m29076h("lock_error_time", 0L);
        }

        /* renamed from: b */
        public final String m17399b() {
            return (String) C7577i1.f27838b.m29082a().m29074f(AbstractC4161e.f18226b, "");
        }

        /* renamed from: c */
        public final long m17400c() {
            return AbstractC4161e.f18228d;
        }

        /* renamed from: d */
        public final long m17401d() {
            return ((Number) C7577i1.f27838b.m29082a().m29074f("lock_error_time", 0L)).longValue();
        }

        /* renamed from: e */
        public final void m17402e(String str) {
            AbstractC5868k.m23674f(str, "password");
            C7577i1.f27838b.m29082a().m29076h(AbstractC4161e.f18226b, str);
            m17404g(System.currentTimeMillis());
        }

        /* renamed from: f */
        public final void m17403f(long j10) {
            AbstractC4161e.f18228d = j10;
        }

        /* renamed from: g */
        public final void m17404g(long j10) {
            AbstractC4161e.f18229e = j10;
        }

        /* renamed from: h */
        public final void m17405h() {
            C7577i1.f27838b.m29082a().m29076h("lock_error_time", Long.valueOf(System.currentTimeMillis()));
        }
    }
}
