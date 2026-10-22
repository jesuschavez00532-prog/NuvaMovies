package p289pd;

import ac.C0159h0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p135fd.C4307b;
import p170i2.C4842a;
import p193ja.C5044a;
import p253nd.InterfaceC5851k;
import p253nd.InterfaceC5852l;
import p301qb.InterfaceC6375c0;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.q */
/* loaded from: classes3.dex */
public final class C6279q implements InterfaceC5851k, InterfaceC6375c0 {

    /* renamed from: a */
    private AbstractActivityC7763a f24564a;

    /* renamed from: b */
    private InterfaceC5852l f24565b;

    /* renamed from: c */
    private final InterfaceC1312h f24566c;

    /* renamed from: d */
    private final InterfaceC1312h f24567d;

    /* renamed from: pd.q$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0159h0 invoke() {
            return new C0159h0(C6279q.this, null, 2, null);
        }
    }

    /* renamed from: pd.q$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f24569a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (C4842a.f20329a.m19920a().m19932I()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
    }

    public C6279q(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5852l interfaceC5852l) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5852l, "view");
        this.f24564a = abstractActivityC7763a;
        this.f24565b = interfaceC5852l;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24566c = m5965b;
        m5965b2 = AbstractC1314j.m5965b(b.f24569a);
        this.f24567d = m5965b2;
    }

    /* renamed from: E3 */
    private final String m24970E3() {
        return (String) this.f24567d.getValue();
    }

    /* renamed from: Y0 */
    private final C0159h0 m24971Y0() {
        return (C0159h0) this.f24566c.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        ChildColumn childColumn;
        Object m20485a = C5044a.f20862a.m20485a("Special_root");
        if (m20485a instanceof ChildColumn) {
            childColumn = (ChildColumn) m20485a;
        } else {
            childColumn = null;
        }
        if (childColumn != null) {
            this.f24565b.mo16340a();
            m24971Y0().m607b(Integer.valueOf(childColumn.getId()), "1", 1, 1000, null, 0, m24970E3());
        }
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: L2 */
    public void mo23209L2(GetColumnContentsResult getColumnContentsResult, int i10) {
        int i11;
        List<ChildColumn> childColumnList;
        AbstractC5868k.m23674f(getColumnContentsResult, "result");
        this.f24565b.mo16341b();
        GetColumnContentsResultData data = getColumnContentsResult.getData();
        if (data != null && (childColumnList = data.getChildColumnList()) != null) {
            i11 = childColumnList.size();
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            InterfaceC5852l interfaceC5852l = this.f24565b;
            GetColumnContentsResultData data2 = getColumnContentsResult.getData();
            AbstractC5868k.m23671c(data2);
            interfaceC5852l.mo16344o3(data2);
            return;
        }
        this.f24565b.mo16342f2();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24564a.m19900N3();
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: S5 */
    public void mo23211S5(String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24565b.mo16341b();
        this.f24565b.mo16342f2();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
