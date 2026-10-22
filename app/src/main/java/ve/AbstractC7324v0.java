package ve;

import ee.AbstractC4179b;
import ee.InterfaceC4184g;
import java.io.Closeable;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5869l;

/* renamed from: ve.v0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7324v0 extends AbstractC7329x implements Closeable {

    /* renamed from: b */
    public static final a f27231b = new a(null);

    /* renamed from: ve.v0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4179b {

        /* renamed from: ve.v0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C7864a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final C7864a f27232a = new C7864a();

            C7864a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC7324v0 mo542f(InterfaceC4184g.b bVar) {
                if (!(bVar instanceof AbstractC7324v0)) {
                    bVar = null;
                }
                return (AbstractC7324v0) bVar;
            }
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        private a() {
            super(AbstractC7329x.f27236a, C7864a.f27232a);
        }
    }
}
