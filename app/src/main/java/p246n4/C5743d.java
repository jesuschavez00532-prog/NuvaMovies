package p246n4;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1792c;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p187j4.AbstractC4990d;
import p187j4.C4987a;
import p203k4.InterfaceC5112i;
import p219l4.C5402r;
import p219l4.C5408u;
import p219l4.InterfaceC5406t;
import p365v4.AbstractC7205d;

/* renamed from: n4.d */
/* loaded from: classes.dex */
public final class C5743d extends AbstractC4990d implements InterfaceC5406t {

    /* renamed from: k */
    private static final C4987a.g f23049k;

    /* renamed from: l */
    private static final C4987a.a f23050l;

    /* renamed from: m */
    private static final C4987a f23051m;

    /* renamed from: n */
    public static final /* synthetic */ int f23052n = 0;

    static {
        C4987a.g gVar = new C4987a.g();
        f23049k = gVar;
        C5742c c5742c = new C5742c();
        f23050l = c5742c;
        f23051m = new C4987a("ClientTelemetry.API", c5742c, gVar);
    }

    public C5743d(Context context, C5408u c5408u) {
        super(context, f23051m, c5408u, AbstractC4990d.a.f20738c);
    }

    @Override // p219l4.InterfaceC5406t
    /* renamed from: a */
    public final AbstractC4245i mo21810a(final C5402r c5402r) {
        AbstractC1792c.a m7967a = AbstractC1792c.m7967a();
        m7967a.m7976d(AbstractC7205d.f26973a);
        m7967a.m7975c(false);
        m7967a.m7974b(new InterfaceC5112i() { // from class: n4.b
            @Override // p203k4.InterfaceC5112i
            public final void accept(Object obj, Object obj2) {
                C5402r c5402r2 = C5402r.this;
                int i10 = C5743d.f23052n;
                ((C5740a) ((C5744e) obj).m21663C()).m23160O(c5402r2);
                ((C4247j) obj2).m17726c(null);
            }
        });
        return m20364c(m7967a.m7973a());
    }
}
