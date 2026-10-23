package p005a4;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p024b4.InterfaceC1055d;
import p036c4.InterfaceC1358b;
import p324s3.AbstractC6667o;

/* renamed from: a4.p0 */
/* loaded from: classes.dex */
public class C0048p0 {

    /* renamed from: a */
    private final Executor f167a;

    /* renamed from: b */
    private final InterfaceC1055d f168b;

    /* renamed from: c */
    private final InterfaceC0052r0 f169c;

    /* renamed from: d */
    private final InterfaceC1358b f170d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0048p0(Executor executor, InterfaceC1055d interfaceC1055d, InterfaceC0052r0 interfaceC0052r0, InterfaceC1358b interfaceC1358b) {
        this.f167a = executor;
        this.f168b = interfaceC1055d;
        this.f169c = interfaceC0052r0;
        this.f170d = interfaceC1358b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m190d() {
        Iterator it = this.f168b.mo4922k().iterator();
        while (it.hasNext()) {
            this.f169c.mo139b((AbstractC6667o) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m191e() {
        this.f170d.mo5022c(new InterfaceC1358b.a() { // from class: a4.o0
            @Override // p036c4.InterfaceC1358b.a
            public final Object execute() {
                Object m190d = null;
                m190d = C0048p0.this.m190d();
                return m190d;
            }
        });
    }

    /* renamed from: c */
    public void m192c() {
        this.f167a.execute(new Runnable() { // from class: a4.n0
            @Override // java.lang.Runnable
            public final void run() {
                C0048p0.this.m191e();
            }
        });
    }
}
