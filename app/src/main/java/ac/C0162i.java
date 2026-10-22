package ac;

import com.request.result.GetAuthInfoResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6368a;
import p343tb.AbstractC6929a;

/* renamed from: ac.i */
/* loaded from: classes2.dex */
public final class C0162i extends AbstractC0166j {

    /* renamed from: b */
    private final String f465b;

    /* renamed from: ac.i$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetAuthInfoResult getAuthInfoResult) {
            AbstractC5868k.m23674f(getAuthInfoResult, "t");
            super.onNext(getAuthInfoResult);
            C0162i.this.m613b(getAuthInfoResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6368a) C0162i.this.m618a()).mo20404m0("");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162i(InterfaceC6368a interfaceC6368a) {
        super(interfaceC6368a);
        AbstractC5868k.m23674f(interfaceC6368a, "view");
        this.f465b = C0162i.class.getSimpleName();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r0.equals("aaa100048") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        ((p301qb.InterfaceC6368a) m618a()).mo20404m0(r5.getReturnCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r0.equals("aaa100028") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r0.equals("aaa100027") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        if (r0.equals("portal100043") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r0.equals("portal100042") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r0.equals("portal100041") != false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00a4. Please report as an issue. */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m613b(com.request.result.GetAuthInfoResult r5) {
        /*
            r4 = this;
            java.lang.String r0 = "t"
            ne.AbstractC5868k.m23674f(r5, r0)
            i2.a r0 = p170i2.C4842a.f20329a
            i2.b r1 = r0.m19920a()
            boolean r1 = r1.mo19973v()
            r2 = 0
            if (r1 != 0) goto L30
            com.request.result.GetAuthInfoResultData r1 = r5.getData()
            if (r1 != 0) goto L19
            goto L30
        L19:
            i2.b r0 = r0.m19920a()
            com.request.result.GetAuthInfoResultData r3 = r5.getData()
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getShowFlag()
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.String r0 = r0.m19950a(r3)
            r1.setShowFlag(r0)
        L30:
            vb.a r0 = p371vb.C7252a.f27087a
            r0.m28082q(r5)
            cc.m0 r1 = cc.C1466m0.f5627a
            com.request.result.UserInfo r1 = r1.m6887v()
            if (r1 != 0) goto L3e
            goto L4d
        L3e:
            com.request.result.GetAuthInfoResultData r3 = r5.getData()
            if (r3 == 0) goto L49
            java.lang.String r3 = r3.getHasPay()
            goto L4a
        L49:
            r3 = r2
        L4a:
            r1.setHasPay(r3)
        L4d:
            com.request.result.GetAuthInfoResultData r1 = r5.getData()
            if (r1 == 0) goto L57
            java.lang.String r2 = r1.getPayCoreAddress()
        L57:
            boolean r1 = p317rb.AbstractC6567a.m25637g(r2)
            java.lang.String r2 = ""
            if (r1 == 0) goto L6f
            com.request.result.GetAuthInfoResultData r1 = r5.getData()
            if (r1 == 0) goto L6b
            java.lang.String r1 = r1.getPayCoreAddress()
            if (r1 != 0) goto L6c
        L6b:
            r1 = r2
        L6c:
            r0.m28083r(r1)
        L6f:
            java.lang.String r0 = r5.getReturnCode()
            java.lang.String r1 = "0"
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r1)
            if (r0 != 0) goto Lf5
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            if (r0 == 0) goto L9c
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            ne.AbstractC5868k.m23671c(r0)
            java.lang.String r0 = r0.getTips()
            boolean r0 = p317rb.AbstractC6567a.m25634d(r0)
            if (r0 != 0) goto L9c
            java.lang.Object r0 = r4.m618a()
            qb.a r0 = (p301qb.InterfaceC6368a) r0
            r0.mo20403d0(r5)
            goto Lfe
        L9c:
            java.lang.String r0 = r5.getReturnCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -396103032: goto Ld5;
                case -396103031: goto Lcc;
                case -396103030: goto Lc3;
                case -338366875: goto Lba;
                case -338366874: goto Lb1;
                case -338366812: goto La8;
                default: goto La7;
            }
        La7:
            goto Leb
        La8:
            java.lang.String r1 = "aaa100048"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldd
            goto Leb
        Lb1:
            java.lang.String r1 = "aaa100028"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldd
            goto Leb
        Lba:
            java.lang.String r1 = "aaa100027"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldd
            goto Leb
        Lc3:
            java.lang.String r1 = "portal100043"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldd
            goto Leb
        Lcc:
            java.lang.String r1 = "portal100042"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldd
            goto Leb
        Ld5:
            java.lang.String r1 = "portal100041"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Leb
        Ldd:
            java.lang.Object r0 = r4.m618a()
            qb.a r0 = (p301qb.InterfaceC6368a) r0
            java.lang.String r5 = r5.getReturnCode()
            r0.mo20404m0(r5)
            goto Lfe
        Leb:
            java.lang.Object r5 = r4.m618a()
            qb.a r5 = (p301qb.InterfaceC6368a) r5
            r5.mo20404m0(r2)
            goto Lfe
        Lf5:
            java.lang.Object r0 = r4.m618a()
            qb.a r0 = (p301qb.InterfaceC6368a) r0
            r0.mo20403d0(r5)
        Lfe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0162i.m613b(com.request.result.GetAuthInfoResult):void");
    }

    /* renamed from: c */
    public final void m614c(String str) {
        AbstractC5868k.m23674f(str, "type");
        C1224f.f4816e.m5631a().m5627z(str).compose(((InterfaceC6368a) m618a()).mo523N3()).subscribe(new a());
    }
}
