package p021b1;

import com.lzy.okgo.model.Progress;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p033c1.InterfaceRunnableC1340d;
import p348u2.AbstractC7030g;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C1032a {

    /* renamed from: b */
    public static final a f4269b = new a(null);

    /* renamed from: c */
    private static C1032a f4270c;

    /* renamed from: a */
    private final ScheduledThreadPoolExecutor f4271a = AbstractC7030g.m27130d();

    /* renamed from: b1.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C1032a m4835b() {
            if (C1032a.f4270c == null) {
                C1032a.f4270c = new C1032a();
            }
            return C1032a.f4270c;
        }

        /* renamed from: a */
        public final C1032a m4836a() {
            C1032a m4835b = m4835b();
            AbstractC5868k.m23671c(m4835b);
            return m4835b;
        }
    }

    /* renamed from: c */
    public final void m4834c(InterfaceRunnableC1340d interfaceRunnableC1340d) {
        AbstractC5868k.m23674f(interfaceRunnableC1340d, Progress.REQUEST);
        this.f4271a.execute(new AbstractC7030g.f("Big Bee Net", (Runnable) interfaceRunnableC1340d, false));
    }
}
