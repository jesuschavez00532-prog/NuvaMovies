package p267oc;

import be.C1328x;
import java.util.WeakHashMap;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p288pc.C6258e;

/* renamed from: oc.c */
/* loaded from: classes.dex */
public abstract class AbstractC5963c {

    /* renamed from: a */
    private static long f23668a = 0;

    /* renamed from: b */
    private static int f23669b = 30;

    /* renamed from: c */
    private static final C6258e f23670c;

    /* renamed from: d */
    private static final WeakHashMap f23671d;

    /* renamed from: oc.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5665q {

        /* renamed from: a */
        public static final a f23672a = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final void m24122a(String str, InterfaceC5962b interfaceC5962b, InterfaceC5962b interfaceC5962b2) {
            AbstractC5963c.f23671d.put(str, interfaceC5962b);
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m24122a((String) obj, (InterfaceC5962b) obj2, (InterfaceC5962b) obj3);
            return C1328x.f4998a;
        }
    }

    static {
        C6258e c6258e = new C6258e(f23669b);
        c6258e.m24894a(a.f23672a);
        f23670c = c6258e;
        f23671d = new WeakHashMap();
    }

    /* renamed from: b */
    public static final synchronized InterfaceC5962b m24121b(InterfaceC5962b interfaceC5962b) {
        InterfaceC5962b interfaceC5962b2;
        synchronized (AbstractC5963c.class) {
            AbstractC5868k.m23674f(interfaceC5962b, "event");
            C6258e c6258e = f23670c;
            long j10 = f23668a;
            f23668a = 1 + j10;
            interfaceC5962b2 = (InterfaceC5962b) c6258e.put(String.valueOf(j10), interfaceC5962b);
        }
        return interfaceC5962b2;
    }
}
