package p324s3;

import p294q3.AbstractC6336c;
import p294q3.C6335b;
import p294q3.InterfaceC6338e;
import p294q3.InterfaceC6339f;
import p294q3.InterfaceC6341h;

/* renamed from: s3.r */
/* loaded from: classes.dex */
final class C6670r implements InterfaceC6339f {

    /* renamed from: a */
    private final AbstractC6667o f25581a;

    /* renamed from: b */
    private final String f25582b;

    /* renamed from: c */
    private final C6335b f25583c;

    /* renamed from: d */
    private final InterfaceC6338e f25584d;

    /* renamed from: e */
    private final InterfaceC6671s f25585e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6670r(AbstractC6667o abstractC6667o, String str, C6335b c6335b, InterfaceC6338e interfaceC6338e, InterfaceC6671s interfaceC6671s) {
        this.f25581a = abstractC6667o;
        this.f25582b = str;
        this.f25583c = c6335b;
        this.f25584d = interfaceC6338e;
        this.f25585e = interfaceC6671s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m26041d(Exception exc) {
    }

    @Override // p294q3.InterfaceC6339f
    /* renamed from: a */
    public void mo25121a(AbstractC6336c abstractC6336c) {
        mo25122b(abstractC6336c, new InterfaceC6341h() { // from class: s3.q
            @Override // p294q3.InterfaceC6341h
            /* renamed from: a */
            public final void mo18262a(Exception exc) {
                C6670r.m26041d(exc);
            }
        });
    }

    @Override // p294q3.InterfaceC6339f
    /* renamed from: b */
    public void mo25122b(AbstractC6336c abstractC6336c, InterfaceC6341h interfaceC6341h) {
        this.f25585e.mo26042a(AbstractC6666n.m26035a().mo26002e(this.f25581a).mo26000c(abstractC6336c).mo26003f(this.f25582b).mo26001d(this.f25584d).mo25999b(this.f25583c).mo25998a(), interfaceC6341h);
    }
}
