package p324s3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p005a4.C0040l0;
import p005a4.C0048p0;
import p095d4.InterfaceC3935a;
import p294q3.C6335b;
import p294q3.InterfaceC6340g;
import p294q3.InterfaceC6341h;
import p424z3.InterfaceC7749e;

/* renamed from: s3.t */
/* loaded from: classes.dex */
public class C6672t implements InterfaceC6671s {

    /* renamed from: e */
    private static volatile AbstractC6673u f25586e;

    /* renamed from: a */
    private final InterfaceC3935a f25587a;

    /* renamed from: b */
    private final InterfaceC3935a f25588b;

    /* renamed from: c */
    private final InterfaceC7749e f25589c;

    /* renamed from: d */
    private final C0040l0 f25590d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6672t(InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, InterfaceC7749e interfaceC7749e, C0040l0 c0040l0, C0048p0 c0048p0) {
        this.f25587a = interfaceC3935a;
        this.f25588b = interfaceC3935a2;
        this.f25589c = interfaceC7749e;
        this.f25590d = c0040l0;
        c0048p0.m192c();
    }

    /* renamed from: b */
    private AbstractC6661i m26043b(AbstractC6666n abstractC6666n) {
        return AbstractC6661i.m26020a().mo25990i(this.f25587a.mo16762a()).mo25992k(this.f25588b.mo16762a()).mo25991j(abstractC6666n.mo25997g()).mo25989h(new C6660h(abstractC6666n.mo25993b(), abstractC6666n.m26036d())).mo25988g(abstractC6666n.mo25994c().mo25114a()).mo25985d();
    }

    /* renamed from: c */
    public static C6672t m26044c() {
        AbstractC6673u abstractC6673u = f25586e;
        if (abstractC6673u != null) {
            return abstractC6673u.mo26014b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set m26045d(InterfaceC6658f interfaceC6658f) {
        if (interfaceC6658f instanceof InterfaceC6659g) {
            return Collections.unmodifiableSet(((InterfaceC6659g) interfaceC6658f).mo7873a());
        }
        return Collections.singleton(C6335b.m25117b("proto"));
    }

    /* renamed from: f */
    public static void m26046f(Context context) {
        if (f25586e == null) {
            synchronized (C6672t.class) {
                if (f25586e == null) {
                    f25586e = C6657e.m26011c().mo26016b(context).mo26015a();
                }
            }
        }
    }

    @Override // p324s3.InterfaceC6671s
    /* renamed from: a */
    public void mo26042a(AbstractC6666n abstractC6666n, InterfaceC6341h interfaceC6341h) {
        this.f25589c.mo29949a(abstractC6666n.mo25996f().m26039f(abstractC6666n.mo25994c().mo25116c()), m26043b(abstractC6666n), interfaceC6341h);
    }

    /* renamed from: e */
    public C0040l0 m26047e() {
        return this.f25590d;
    }

    /* renamed from: g */
    public InterfaceC6340g m26048g(InterfaceC6658f interfaceC6658f) {
        return new C6668p(m26045d(interfaceC6658f), AbstractC6667o.m26037a().mo26008b(interfaceC6658f.getName()).mo26009c(interfaceC6658f.getExtras()).mo26007a(), this);
    }
}
