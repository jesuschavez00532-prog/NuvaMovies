package kotlinx.coroutines.scheduling;

import ee.InterfaceC4184g;
import java.util.concurrent.RejectedExecutionException;
import ne.AbstractC5864g;
import ve.AbstractC7324v0;
import ve.RunnableC7276f0;

/* renamed from: kotlinx.coroutines.scheduling.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5291d extends AbstractC7324v0 {

    /* renamed from: c */
    private ExecutorC5288a f21547c;

    /* renamed from: d */
    private final int f21548d;

    /* renamed from: e */
    private final int f21549e;

    /* renamed from: f */
    private final long f21550f;

    /* renamed from: g */
    private final String f21551g;

    public AbstractC5291d(int i10, int i11, long j10, String str) {
        this.f21548d = i10;
        this.f21549e = i11;
        this.f21550f = j10;
        this.f21551g = str;
        this.f21547c = m21329z();
    }

    /* renamed from: z */
    private final ExecutorC5288a m21329z() {
        return new ExecutorC5288a(this.f21548d, this.f21549e, this.f21550f, this.f21551g);
    }

    /* renamed from: A */
    public final void m21330A(Runnable runnable, InterfaceC5297j interfaceC5297j, boolean z10) {
        try {
            this.f21547c.m21302f(runnable, interfaceC5297j, z10);
        } catch (RejectedExecutionException unused) {
            RunnableC7276f0.f27165h.m28285O(this.f21547c.m21301d(runnable, interfaceC5297j));
        }
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        try {
            ExecutorC5288a.m21295h(this.f21547c, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            RunnableC7276f0.f27165h.mo21239x(interfaceC4184g, runnable);
        }
    }

    public /* synthetic */ AbstractC5291d(int i10, int i11, String str, int i12, AbstractC5864g abstractC5864g) {
        this((i12 & 1) != 0 ? AbstractC5299l.f21566c : i10, (i12 & 2) != 0 ? AbstractC5299l.f21567d : i11, (i12 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public AbstractC5291d(int i10, int i11, String str) {
        this(i10, i11, AbstractC5299l.f21568e, str);
    }
}
