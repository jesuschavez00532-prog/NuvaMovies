package p303qd;

import ac.C0185n2;
import ac.C0193p2;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import com.request.result.StartPlayVODResult;
import com.request.result.StartPlayVODResultData;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p268od.InterfaceC5971g;
import p301qb.InterfaceC6412o1;
import p301qb.InterfaceC6436w1;
import p430z9.AbstractC7765c;

/* renamed from: qd.e0 */
/* loaded from: classes3.dex */
public final class C6465e0 implements InterfaceC1439a, InterfaceC6412o1, InterfaceC6436w1 {

    /* renamed from: a */
    private AbstractC7765c f24841a;

    /* renamed from: b */
    private InterfaceC5971g f24842b;

    /* renamed from: c */
    private final String f24843c;

    /* renamed from: d */
    private C0185n2 f24844d;

    /* renamed from: e */
    private final InterfaceC1312h f24845e;

    /* renamed from: qd.e0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0193p2 invoke() {
            return new C0193p2(C6465e0.this);
        }
    }

    public C6465e0(AbstractC7765c abstractC7765c, InterfaceC5971g interfaceC5971g) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC5971g, "view");
        this.f24841a = abstractC7765c;
        this.f24842b = interfaceC5971g;
        this.f24843c = C6465e0.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24845e = m5965b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24841a.m19902N3();
    }

    @Override // p301qb.InterfaceC6412o1
    /* renamed from: V */
    public void mo20720V(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24842b.mo24154V(str, i10);
    }

    /* renamed from: Y0 */
    public void m25295Y0(int i10, String str, String str2, String str3, int i11, String str4, int[] iArr) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str3, "type");
        this.f24842b.mo24155W3();
        C0185n2 c0185n2 = new C0185n2(this);
        this.f24844d = c0185n2;
        c0185n2.m678b(i10, str, str2, str3, i11, str4, iArr);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6412o1
    /* renamed from: z4 */
    public void mo20728z4(StartPlayVODResult startPlayVODResult, int i10) {
        AbstractC5868k.m23674f(startPlayVODResult, "result");
        StartPlayVODResultData data = startPlayVODResult.getData();
        if (data != null) {
            this.f24842b.mo24156Y1(data, i10);
        }
    }
}
