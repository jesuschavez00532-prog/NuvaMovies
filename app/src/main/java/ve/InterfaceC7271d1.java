package ve;

import ee.InterfaceC4184g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import me.InterfaceC5660l;
import me.InterfaceC5664p;

/* renamed from: ve.d1 */
/* loaded from: classes3.dex */
public class InterfaceC7271d1 extends InterfaceC4184g.b {

    /* renamed from: f0 */
    public static final b f27161f0 = b.f27162a;

    /* renamed from: ve.d1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m28118a(InterfaceC7271d1 interfaceC7271d1, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC7271d1.mo28117t(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static Object m28119b(InterfaceC7271d1 interfaceC7271d1, Object obj, InterfaceC5664p interfaceC5664p) {
            return InterfaceC4184g.b.a.m17495a(interfaceC7271d1, obj, interfaceC5664p);
        }

        /* renamed from: c */
        public static InterfaceC4184g.b m28120c(InterfaceC7271d1 interfaceC7271d1, InterfaceC4184g.c cVar) {
            return InterfaceC4184g.b.a.m17496b(interfaceC7271d1, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC7300n0 m28121d(InterfaceC7271d1 interfaceC7271d1, boolean z10, boolean z11, InterfaceC5660l interfaceC5660l, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return interfaceC7271d1.mo28116r(z10, z11, interfaceC5660l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static InterfaceC4184g m28122e(InterfaceC7271d1 interfaceC7271d1, InterfaceC4184g.c cVar) {
            return InterfaceC4184g.b.a.m17497c(interfaceC7271d1, cVar);
        }

        /* renamed from: f */
        public static InterfaceC4184g m28123f(InterfaceC7271d1 interfaceC7271d1, InterfaceC4184g interfaceC4184g) {
            return InterfaceC4184g.b.a.m17498d(interfaceC7271d1, interfaceC4184g);
        }
    }

    /* renamed from: ve.d1$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC4184g.c {

        /* renamed from: a */
        static final /* synthetic */ b f27162a = new b();

        static {
            CoroutineExceptionHandler.C5261a c5261a = CoroutineExceptionHandler.f21460e0;
        }

        private b() {
        }
    }

    /* renamed from: a */
    boolean mo28096a();

    /* renamed from: f */
    InterfaceC7296m mo28114f(InterfaceC7302o interfaceC7302o);

    /* renamed from: h */
    CancellationException mo28115h();

    /* renamed from: r */
    InterfaceC7300n0 mo28116r(boolean z10, boolean z11, InterfaceC5660l interfaceC5660l);

    boolean start();

    /* renamed from: t */
    void mo28117t(CancellationException cancellationException);
}
