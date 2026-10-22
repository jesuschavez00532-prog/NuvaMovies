package mc;

import me.InterfaceC5642a;
import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;

/* renamed from: mc.e */
/* loaded from: classes3.dex */
final class RunnableC5630e implements Runnable {

    /* renamed from: a */
    private final Runnable f22690a;

    /* renamed from: b */
    private final String f22691b;

    /* renamed from: c */
    private final InterfaceC5642a f22692c;

    public RunnableC5630e(Runnable runnable, String str, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(runnable, "r");
        AbstractC5868k.m23674f(str, AgooConstants.MESSAGE_TRACE);
        AbstractC5868k.m23674f(interfaceC5642a, "block");
        this.f22690a = runnable;
        this.f22691b = str;
        this.f22692c = interfaceC5642a;
    }

    /* renamed from: a */
    public final Runnable m22838a() {
        return this.f22690a;
    }

    /* renamed from: b */
    public final String m22839b() {
        return this.f22691b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22690a.run();
        } finally {
            this.f22692c.invoke();
        }
    }
}
