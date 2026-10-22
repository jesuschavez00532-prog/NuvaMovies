package nc;

import mc.AbstractC5635j;
import mc.C5634i;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: nc.c */
/* loaded from: classes.dex */
public final class C5839c extends AbstractC5838b {

    /* renamed from: f */
    private volatile boolean f23384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5839c(String str, String str2) {
        super(true, str, str2, null);
        AbstractC5868k.m23674f(str, "taskName");
        AbstractC5868k.m23674f(str2, "dependsOn");
    }

    /* renamed from: i */
    private final boolean m23632i() {
        while (true) {
            boolean z10 = true;
            for (String str : m23625b()) {
                if (!z10 || !C5634i.f22695a.m22857f().m23616f(str).m23628e()) {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    @Override // nc.AbstractC5838b
    /* renamed from: g */
    public void mo23630g() {
        this.f23384f = true;
        if (m23626c() != 2 && m23632i()) {
            AbstractC5635j.m22862d("FlowTask", "Virtual Flow Task " + m23627d() + " done", null, 4, null);
            m23631h(2);
            C5634i c5634i = C5634i.f22695a;
            c5634i.m22857f().m23619j();
            c5634i.m22857f().m23618i(m23627d());
        }
    }

    /* renamed from: j */
    public final void m23633j() {
        if (this.f23384f) {
            mo23630g();
        }
    }

    public /* synthetic */ C5839c(String str, String str2, int i10, AbstractC5864g abstractC5864g) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
