package p424z3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p005a4.InterfaceC0052r0;
import p024b4.InterfaceC1055d;
import p036c4.InterfaceC1358b;
import p294q3.InterfaceC6341h;
import p324s3.AbstractC6661i;
import p324s3.AbstractC6667o;
import p324s3.C6672t;
import p335t3.InterfaceC6897e;
import p335t3.InterfaceC6905m;

/* renamed from: z3.c */
/* loaded from: classes.dex */
public class C7747c implements InterfaceC7749e {

    /* renamed from: f */
    private static final Logger f28523f = Logger.getLogger(C6672t.class.getName());

    /* renamed from: a */
    private final InterfaceC0052r0 f28524a;

    /* renamed from: b */
    private final Executor f28525b;

    /* renamed from: c */
    private final InterfaceC6897e f28526c;

    /* renamed from: d */
    private final InterfaceC1055d f28527d;

    /* renamed from: e */
    private final InterfaceC1358b f28528e;

    public C7747c(Executor executor, InterfaceC6897e interfaceC6897e, InterfaceC0052r0 interfaceC0052r0, InterfaceC1055d interfaceC1055d, InterfaceC1358b interfaceC1358b) {
        this.f28525b = executor;
        this.f28526c = interfaceC6897e;
        this.f28524a = interfaceC0052r0;
        this.f28527d = interfaceC1055d;
        this.f28528e = interfaceC1358b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m29947d(AbstractC6667o abstractC6667o, AbstractC6661i abstractC6661i) {
        this.f28527d.mo4923o(abstractC6667o, abstractC6661i);
        this.f28524a.mo139b(abstractC6667o, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m29948e(final AbstractC6667o abstractC6667o, InterfaceC6341h interfaceC6341h, AbstractC6661i abstractC6661i) {
        try {
            InterfaceC6905m mo26827a = this.f28526c.mo26827a(abstractC6667o.mo26004b());
            if (mo26827a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC6667o.mo26004b());
                f28523f.warning(format);
                interfaceC6341h.mo18262a(new IllegalArgumentException(format));
            } else {
                final AbstractC6661i mo7891b = mo26827a.mo7891b(abstractC6661i);
                this.f28528e.mo5022c(new InterfaceC1358b.a() { // from class: z3.b
                    @Override // p036c4.InterfaceC1358b.a
                    public final Object execute() {
                        Object m29947d;
                        m29947d = C7747c.this.m29947d(abstractC6667o, mo7891b);
                        return m29947d;
                    }
                });
                interfaceC6341h.mo18262a(null);
            }
        } catch (Exception e10) {
            f28523f.warning("Error scheduling event " + e10.getMessage());
            interfaceC6341h.mo18262a(e10);
        }
    }

    @Override // p424z3.InterfaceC7749e
    /* renamed from: a */
    public void mo29949a(final AbstractC6667o abstractC6667o, final AbstractC6661i abstractC6661i, final InterfaceC6341h interfaceC6341h) {
        this.f28525b.execute(new Runnable() { // from class: z3.a
            @Override // java.lang.Runnable
            public final void run() {
                C7747c.this.m29948e(abstractC6667o, interfaceC6341h, abstractC6661i);
            }
        });
    }
}
