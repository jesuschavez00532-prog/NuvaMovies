package ve;

import kotlinx.coroutines.internal.C5262a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: ve.q0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7309q0 extends AbstractC7329x {

    /* renamed from: b */
    private long f27211b;

    /* renamed from: c */
    private boolean f27212c;

    /* renamed from: d */
    private C5262a f27213d;

    /* renamed from: A */
    private final long m28263A(boolean z10) {
        if (z10) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    /* renamed from: E */
    public static /* synthetic */ void m28264E(AbstractC7309q0 abstractC7309q0, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            abstractC7309q0.m28267D(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: B */
    public final void m28265B(AbstractC7291k0 abstractC7291k0) {
        C5262a c5262a = this.f27213d;
        if (c5262a == null) {
            c5262a = new C5262a();
            this.f27213d = c5262a;
        }
        c5262a.m21169a(abstractC7291k0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public long mo28266C() {
        C5262a c5262a = this.f27213d;
        if (c5262a == null || c5262a.m21170c()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: D */
    public final void m28267D(boolean z10) {
        this.f27211b += m28263A(z10);
        if (!z10) {
            this.f27212c = true;
        }
    }

    /* renamed from: F */
    public final boolean m28268F() {
        if (this.f27211b >= m28263A(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final boolean m28269G() {
        C5262a c5262a = this.f27213d;
        if (c5262a != null) {
            return c5262a.m21170c();
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m28270H() {
        AbstractC7291k0 abstractC7291k0;
        C5262a c5262a = this.f27213d;
        if (c5262a == null || (abstractC7291k0 = (AbstractC7291k0) c5262a.m21171d()) == null) {
            return false;
        }
        abstractC7291k0.run();
        return true;
    }

    protected abstract void shutdown();

    /* renamed from: z */
    public final void m28271z(boolean z10) {
        long m28263A = this.f27211b - m28263A(z10);
        this.f27211b = m28263A;
        if (m28263A <= 0 && this.f27212c) {
            shutdown();
        }
    }
}
