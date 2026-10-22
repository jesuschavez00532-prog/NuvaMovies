package p177i9;

import ac.C0187o0;
import android.app.Dialog;
import android.content.DialogInterface;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.request.result.UserInfo;
import gd.EnumC4431a;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p148g9.InterfaceC4409e;
import p148g9.InterfaceC4410f;
import p238m9.C5619k;
import p301qb.InterfaceC6390h0;
import p430z9.AbstractActivityC7763a;

/* renamed from: i9.i */
/* loaded from: classes2.dex */
public final class C4917i implements InterfaceC4409e, InterfaceC6390h0 {

    /* renamed from: a */
    private AbstractActivityC7763a f20452a;

    /* renamed from: b */
    private InterfaceC4410f f20453b;

    /* renamed from: c */
    private final InterfaceC1312h f20454c;

    /* renamed from: d */
    private final InterfaceC1312h f20455d;

    /* renamed from: i9.i$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0187o0 invoke() {
            return new C0187o0(C4917i.this);
        }
    }

    /* renamed from: i9.i$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f20457a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5619k invoke() {
            return new C5619k();
        }
    }

    public C4917i(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4410f interfaceC4410f) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4410f, "view");
        this.f20452a = abstractActivityC7763a;
        this.f20453b = interfaceC4410f;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20454c = m5965b;
        m5965b2 = AbstractC1314j.m5965b(b.f20457a);
        this.f20455d = m5965b2;
    }

    /* renamed from: E3 */
    private final C0187o0 m20204E3() {
        return (C0187o0) this.f20454c.getValue();
    }

    /* renamed from: F3 */
    private final C5619k m20205F3() {
        return (C5619k) this.f20455d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m20206G3(C4917i c4917i, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c4917i, "this$0");
        c4917i.f20452a.finish();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = null;
        if (m6887v != null) {
            str = m6887v.getBindMobile();
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(str, "1")) {
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str2 = m6887v2.getBindMail();
            }
            if (!AbstractC5868k.m23669a(str2, "1")) {
                Dialog m3280r9 = m20205F3().m3280r9();
                boolean z10 = false;
                if (m3280r9 != null && m3280r9.isShowing()) {
                    z10 = true;
                }
                if (!z10 && !m20205F3().m3079D7()) {
                    m20205F3().m22814K9(new DialogInterface.OnDismissListener() { // from class: i9.h
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C4917i.m20206G3(C4917i.this, dialogInterface);
                        }
                    });
                    m20205F3().mo3277E9(this.f20452a.m3294d4(), "PromptBindDialog");
                    return;
                }
                return;
            }
        }
        this.f20453b.mo11928a();
        m20204E3().m680b();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20452a.m19901Q4(EnumC4431a.DESTROY);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6390h0
    /* renamed from: p3 */
    public void mo20208p3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20453b.mo11929b();
        this.f20453b.mo11926E1(str);
    }

    @Override // p301qb.InterfaceC6390h0
    /* renamed from: r2 */
    public void mo20209r2(String str) {
        AbstractC5868k.m23674f(str, "inviteCode");
        this.f20453b.mo11929b();
        this.f20453b.mo11927J0(str);
    }
}
