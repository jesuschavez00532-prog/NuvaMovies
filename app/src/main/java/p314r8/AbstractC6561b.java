package p314r8;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.AbstractC0729o;
import com.module.p069db.UmengPush;
import com.taobao.accs.common.Constants;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p170i2.C4842a;
import p314r8.AbstractC6561b;
import p329s8.ViewOnClickListenerC6708d1;
import p329s8.ViewOnClickListenerC6729k1;
import p329s8.ViewOnClickListenerC6731l0;
import p329s8.ViewOnClickListenerC6732l1;
import p329s8.ViewOnClickListenerC6737n0;
import p340t8.C6926a;
import p430z9.C7767e;
import va.InterfaceC7251a;

/* renamed from: r8.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6561b {

    /* renamed from: r8.b$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC7251a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m25620e(DialogInterface dialogInterface) {
            C6926a.f26260a.m26899f(null);
        }

        @Override // va.InterfaceC7251a
        /* renamed from: a */
        public void mo25621a(AbstractC0729o abstractC0729o, UmengPush umengPush) {
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

        @Override // va.InterfaceC7251a
        /* renamed from: b */
        public void mo25622b(AbstractC0729o abstractC0729o, boolean z10, String str, InterfaceC5660l interfaceC5660l) {
            AbstractC0729o abstractC0729o2;
            Dialog m3280r9;
            C7767e m26895b;
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
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
                viewOnClickListenerC6737n0.m26458T9(str);
                viewOnClickListenerC6737n0.mo3277E9(abstractC0729o, "LoginDialog");
                c6926a.m26899f(viewOnClickListenerC6737n0);
            } else {
                ViewOnClickListenerC6731l0 viewOnClickListenerC6731l0 = new ViewOnClickListenerC6731l0();
                viewOnClickListenerC6731l0.m26419P9(interfaceC5660l);
                viewOnClickListenerC6731l0.m26420Q9(z10);
                viewOnClickListenerC6731l0.m26421R9(str);
                viewOnClickListenerC6731l0.mo3277E9(abstractC0729o, "LoginDialog");
                c6926a.m26899f(viewOnClickListenerC6731l0);
            }
            C7767e m26895b3 = c6926a.m26895b();
            if (m26895b3 != null && (m3280r9 = m26895b3.m3280r9()) != null) {
                m3280r9.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: r8.a
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AbstractC6561b.a.m25620e(dialogInterface);
                    }
                });
            }
        }

        @Override // va.InterfaceC7251a
        /* renamed from: c */
        public void mo25623c(AbstractC0729o abstractC0729o, boolean z10) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            if (C4842a.f20329a.m19920a().mo19940Q()) {
                ViewOnClickListenerC6732l1 viewOnClickListenerC6732l1 = new ViewOnClickListenerC6732l1();
                viewOnClickListenerC6732l1.m26429I9(z10);
                viewOnClickListenerC6732l1.mo3277E9(abstractC0729o, "SelectRetrieveMethodDialog");
            } else {
                ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1 = new ViewOnClickListenerC6729k1();
                viewOnClickListenerC6729k1.m26402S9(z10);
                viewOnClickListenerC6729k1.mo3277E9(abstractC0729o, "RetrievePasswordDialog");
            }
        }
    }

    /* renamed from: a */
    public static final InterfaceC7251a m25618a() {
        return new a();
    }
}
