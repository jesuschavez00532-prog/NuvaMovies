package nc;

import java.util.HashSet;
import java.util.List;
import ne.AbstractC5868k;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;

/* renamed from: nc.b */
/* loaded from: classes.dex */
public abstract class AbstractC5838b {

    /* renamed from: a */
    private final boolean f23379a;

    /* renamed from: b */
    private final String f23380b;

    /* renamed from: c */
    private final Runnable f23381c;

    /* renamed from: d */
    private volatile int f23382d;

    /* renamed from: e */
    private final HashSet f23383e;

    public AbstractC5838b(boolean z10, String str, String str2, Runnable runnable) {
        List<String> m27748R;
        boolean m27725l;
        CharSequence m27758b0;
        AbstractC5868k.m23674f(str, "taskName");
        AbstractC5868k.m23674f(str2, "dependsOn");
        this.f23379a = z10;
        this.f23380b = str;
        this.f23381c = runnable;
        this.f23383e = new HashSet();
        m27748R = AbstractC7167u.m27748R(str2, new String[]{","}, false, 0, 6, null);
        for (String str3 : m27748R) {
            m27725l = AbstractC7166t.m27725l(str3);
            if (!m27725l) {
                HashSet hashSet = this.f23383e;
                m27758b0 = AbstractC7167u.m27758b0(str3);
                hashSet.add(m27758b0.toString());
            }
        }
        if (!this.f23383e.contains(this.f23380b)) {
            if (this.f23383e.isEmpty() && !AbstractC5868k.m23669a(this.f23380b, "TheRouter_Initialization") && !AbstractC5868k.m23669a(this.f23380b, "TheRouter_Before_Initialization")) {
                this.f23383e.add("TheRouter_Initialization");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("TheRouter::Task::The task cannot depend on himself : " + this.f23380b);
    }

    /* renamed from: a */
    public final boolean m23624a() {
        return this.f23379a;
    }

    /* renamed from: b */
    public final HashSet m23625b() {
        return this.f23383e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int m23626c() {
        return this.f23382d;
    }

    /* renamed from: d */
    public final String m23627d() {
        return this.f23380b;
    }

    /* renamed from: e */
    public final boolean m23628e() {
        if (this.f23382d == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m23629f() {
        if (this.f23382d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public abstract void mo23630g();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m23631h(int i10) {
        this.f23382d = i10;
    }
}
