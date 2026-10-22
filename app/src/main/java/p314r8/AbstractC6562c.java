package p314r8;

import androidx.fragment.app.AbstractC0729o;
import com.module.p069db.UmengPush;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p170i2.C4842a;
import p217l2.InterfaceC5342c;
import p329s8.C6719h0;
import p329s8.C6745q;
import p329s8.C6758u0;
import p329s8.C6768x1;
import p329s8.ViewOnClickListenerC6705c1;
import p329s8.ViewOnClickListenerC6708d1;
import p329s8.ViewOnClickListenerC6715g;
import p329s8.ViewOnClickListenerC6737n0;
import p329s8.ViewOnClickListenerC6738n1;
import p329s8.ViewOnClickListenerC6740o0;
import p329s8.ViewOnClickListenerC6769y;
import p340t8.C6926a;
import p430z9.C7767e;

/* renamed from: r8.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6562c {

    /* renamed from: r8.c$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC5342c {
        a() {
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: a */
        public void mo21614a(AbstractC0729o abstractC0729o, UmengPush umengPush) {
            AbstractC0729o abstractC0729o2;
            C7767e m26896c;
            C7767e m26895b;
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            C6926a c6926a = C6926a.f26260a;
            C7767e m26895b2 = c6926a.m26895b();
            if (m26895b2 != null) {
                abstractC0729o2 = m26895b2.m3119R6();
            } else {
                abstractC0729o2 = null;
            }
            if (abstractC0729o2 != null && (m26895b = c6926a.m26895b()) != null) {
                m26895b.mo3279p9();
            }
            if (c6926a.m26896c() instanceof ViewOnClickListenerC6708d1) {
                C7767e m26896c2 = c6926a.m26896c();
                boolean z10 = false;
                if (m26896c2 != null && m26896c2.m3079D7()) {
                    z10 = true;
                }
                if (z10 && (m26896c = c6926a.m26896c()) != null) {
                    m26896c.mo3279p9();
                }
            }
            ViewOnClickListenerC6708d1 viewOnClickListenerC6708d1 = new ViewOnClickListenerC6708d1();
            viewOnClickListenerC6708d1.m26289M9(umengPush);
            viewOnClickListenerC6708d1.mo3277E9(abstractC0729o, "RemoteLoginDialog");
            c6926a.m26900g(viewOnClickListenerC6708d1);
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: b */
        public void mo21615b() {
            C6926a.f26260a.m26897d().clear();
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: c */
        public void mo21616c(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5642a interfaceC5642a) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            C6745q c6745q = new C6745q();
            c6745q.m26527ja(z10);
            c6745q.m26526aa(interfaceC5642a);
            c6745q.mo3277E9(abstractC0729o, "BindPhoneDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: d */
        public void mo21617d(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            C6758u0 c6758u0 = new C6758u0();
            c6758u0.m26567X9(interfaceC5660l);
            c6758u0.m26568Y9(z10);
            c6758u0.mo3277E9(abstractC0729o, "SmsLoginDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: e */
        public void mo21618e(AbstractC0729o abstractC0729o) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            new ViewOnClickListenerC6769y().mo3277E9(abstractC0729o, "ChangeEmailDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: f */
        public void mo21619f(AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a, boolean z10) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            AbstractC5868k.m23674f(interfaceC5642a, "callback");
            ViewOnClickListenerC6715g viewOnClickListenerC6715g = new ViewOnClickListenerC6715g();
            viewOnClickListenerC6715g.m26324Y9(interfaceC5642a);
            viewOnClickListenerC6715g.m26326ea(z10);
            viewOnClickListenerC6715g.mo3277E9(abstractC0729o, "BindEmailDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: g */
        public void mo21620g(AbstractC0729o abstractC0729o) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            ViewOnClickListenerC6740o0 viewOnClickListenerC6740o0 = new ViewOnClickListenerC6740o0();
            viewOnClickListenerC6740o0.mo3277E9(abstractC0729o, "PasswordModifyDialog");
            viewOnClickListenerC6740o0.m26489O9(ViewOnClickListenerC6740o0.a.EnumC7860a.MODIFY);
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: h */
        public void mo21621h(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l) {
            AbstractC0729o abstractC0729o2;
            C7767e m26895b;
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            C6926a c6926a = C6926a.f26260a;
            C7767e m26895b2 = c6926a.m26895b();
            if (m26895b2 != null) {
                abstractC0729o2 = m26895b2.m3119R6();
            } else {
                abstractC0729o2 = null;
            }
            if (abstractC0729o2 != null && (m26895b = c6926a.m26895b()) != null) {
                m26895b.mo3279p9();
            }
            if (C4842a.f20329a.m19920a().mo19940Q()) {
                ViewOnClickListenerC6737n0 viewOnClickListenerC6737n0 = new ViewOnClickListenerC6737n0();
                viewOnClickListenerC6737n0.m26456R9(interfaceC5660l);
                viewOnClickListenerC6737n0.m26457S9(z10);
                viewOnClickListenerC6737n0.mo3277E9(abstractC0729o, "LoginDialog");
                c6926a.m26899f(viewOnClickListenerC6737n0);
            }
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: i */
        public void mo21622i(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            C6768x1 c6768x1 = new C6768x1();
            c6768x1.m26609ca(interfaceC5660l);
            c6768x1.m26610da(z10);
            c6768x1.mo3277E9(abstractC0729o, "SmsLoginDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: j */
        public void mo21623j(AbstractC0729o abstractC0729o) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            new C6719h0().mo3277E9(abstractC0729o, "ChangePhoneDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: k */
        public void mo21624k(AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            AbstractC5868k.m23674f(interfaceC5642a, "callback");
            ViewOnClickListenerC6705c1 viewOnClickListenerC6705c1 = new ViewOnClickListenerC6705c1();
            viewOnClickListenerC6705c1.m26282I9(interfaceC5642a);
            viewOnClickListenerC6705c1.m3287z9(false);
            viewOnClickListenerC6705c1.mo3277E9(abstractC0729o, "ReLoginDialog");
        }

        @Override // p217l2.InterfaceC5342c
        /* renamed from: l */
        public void mo21625l(AbstractC0729o abstractC0729o, String str, String str2, String str3, InterfaceC5642a interfaceC5642a) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            AbstractC5868k.m23674f(str, "realPhone");
            AbstractC5868k.m23674f(str2, "mNationCode");
            AbstractC5868k.m23674f(str3, "verificationCode");
            ViewOnClickListenerC6738n1 viewOnClickListenerC6738n1 = new ViewOnClickListenerC6738n1();
            viewOnClickListenerC6738n1.m26475Q9(str, str2, str3);
            viewOnClickListenerC6738n1.m26476R9(interfaceC5642a);
            viewOnClickListenerC6738n1.mo3277E9(abstractC0729o, "SetLoginPwdOnVisitorDialog");
        }
    }

    /* renamed from: a */
    public static final InterfaceC5342c m25624a() {
        return new a();
    }
}
