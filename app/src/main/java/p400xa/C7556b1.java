package p400xa;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p161ha.C4759c1;
import p161ha.C4796s;
import p161ha.ViewOnClickListenerC4753a1;
import p161ha.ViewOnClickListenerC4757c;
import p161ha.ViewOnClickListenerC4775i;
import p161ha.ViewOnClickListenerC4782l;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4809y0;
import p161ha.ViewOnKeyListenerC4797s0;
import p430z9.C7767e;

/* renamed from: xa.b1 */
/* loaded from: classes2.dex */
public final class C7556b1 {

    /* renamed from: a */
    public static final C7556b1 f27754a = new C7556b1();

    /* renamed from: b */
    private static ViewOnClickListenerC4753a1 f27755b;

    /* renamed from: c */
    private static C4759c1 f27756c;

    private C7556b1() {
    }

    /* renamed from: e */
    public static /* synthetic */ ViewOnClickListenerC4775i m28961e(C7556b1 c7556b1, AbstractC0729o abstractC0729o, String str, String str2, String str3, boolean z10, ViewOnClickListenerC4775i.a aVar, boolean z11, String str4, boolean z12, int i10, Object obj) {
        boolean z13;
        String str5;
        boolean z14;
        if ((i10 & 64) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i10 & 128) != 0) {
            str5 = "";
        } else {
            str5 = str4;
        }
        if ((i10 & 256) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        return c7556b1.m28966d(abstractC0729o, str, str2, str3, z10, aVar, z13, str5, z14);
    }

    /* renamed from: j */
    public static /* synthetic */ ViewOnClickListenerC4799t0 m28962j(C7556b1 c7556b1, AbstractC0729o abstractC0729o, String str, String str2, String str3, boolean z10, ViewOnClickListenerC4799t0.a aVar, boolean z11, String str4, boolean z12, int i10, Object obj) {
        boolean z13;
        String str5;
        boolean z14;
        if ((i10 & 64) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i10 & 128) != 0) {
            str5 = "";
        } else {
            str5 = str4;
        }
        if ((i10 & 256) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        return c7556b1.m28970i(abstractC0729o, str, str2, str3, z10, aVar, z13, str5, z14);
    }

    /* renamed from: a */
    public final void m28963a(AbstractC0729o abstractC0729o, String str) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, Progress.TAG);
        Fragment m3523h0 = abstractC0729o.m3523h0(str);
        if (m3523h0 instanceof C7767e) {
            ((C7767e) m3523h0).mo3279p9();
        }
    }

    /* renamed from: b */
    public final boolean m28964b() {
        ViewOnClickListenerC4753a1 viewOnClickListenerC4753a1 = f27755b;
        if (viewOnClickListenerC4753a1 == null || !viewOnClickListenerC4753a1.m3079D7()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m28965c(AbstractC0729o abstractC0729o, ViewOnClickListenerC4757c.a aVar) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(aVar, "callback");
        ViewOnClickListenerC4757c viewOnClickListenerC4757c = new ViewOnClickListenerC4757c();
        viewOnClickListenerC4757c.m19655I9(aVar);
        viewOnClickListenerC4757c.mo3277E9(abstractC0729o, "BlackListDialog");
    }

    /* renamed from: d */
    public final ViewOnClickListenerC4775i m28966d(AbstractC0729o abstractC0729o, String str, String str2, String str3, boolean z10, ViewOnClickListenerC4775i.a aVar, boolean z11, String str4, boolean z12) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(str2, "firstStr");
        AbstractC5868k.m23674f(str3, "secondStr");
        AbstractC5868k.m23674f(aVar, "callback");
        AbstractC5868k.m23674f(str4, "titleStr");
        ViewOnClickListenerC4775i viewOnClickListenerC4775i = new ViewOnClickListenerC4775i();
        viewOnClickListenerC4775i.m19764K9(str, str2, str3, str4);
        viewOnClickListenerC4775i.m19762I9(z10);
        viewOnClickListenerC4775i.m19763J9(aVar);
        viewOnClickListenerC4775i.m19765L9(z11);
        if (z12) {
            viewOnClickListenerC4775i.mo3277E9(abstractC0729o, "CommonTipDialog");
        }
        return viewOnClickListenerC4775i;
    }

    /* renamed from: f */
    public final void m28967f(AbstractC0729o abstractC0729o, int i10, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(interfaceC5660l, "callBack");
        ViewOnClickListenerC4782l viewOnClickListenerC4782l = new ViewOnClickListenerC4782l();
        Bundle bundle = new Bundle();
        bundle.putInt("extra_play_time", i10);
        viewOnClickListenerC4782l.m3132V8(bundle);
        viewOnClickListenerC4782l.m19785N9(interfaceC5660l);
        viewOnClickListenerC4782l.mo3277E9(abstractC0729o, "ContinuePlayDialog");
    }

    /* renamed from: g */
    public final void m28968g(AbstractC0729o abstractC0729o, boolean z10, boolean z11, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        C4796s c4796s = new C4796s(z10, z11);
        c4796s.m19812N9(interfaceC5642a);
        c4796s.mo3277E9(abstractC0729o, "CrStatusChangedTipsDialog");
    }

    /* renamed from: h */
    public final void m28969h(AbstractC0729o abstractC0729o, Context context) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        new ViewOnKeyListenerC4797s0(context).mo3277E9(abstractC0729o, "ModifyParentControlPwdDialog");
    }

    /* renamed from: i */
    public final ViewOnClickListenerC4799t0 m28970i(AbstractC0729o abstractC0729o, String str, String str2, String str3, boolean z10, ViewOnClickListenerC4799t0.a aVar, boolean z11, String str4, boolean z12) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(str2, "firstStr");
        AbstractC5868k.m23674f(str3, "secondStr");
        AbstractC5868k.m23674f(aVar, "callback");
        AbstractC5868k.m23674f(str4, "titleStr");
        ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0 = new ViewOnClickListenerC4799t0();
        viewOnClickListenerC4799t0.m19831K9(str, str2, str3, str4);
        viewOnClickListenerC4799t0.m19829I9(z10);
        viewOnClickListenerC4799t0.m19830J9(aVar);
        viewOnClickListenerC4799t0.m19832L9(z11);
        if (z12) {
            viewOnClickListenerC4799t0.mo3277E9(abstractC0729o, "NewCommonTipDialog");
        }
        return viewOnClickListenerC4799t0;
    }

    /* renamed from: k */
    public final void m28971k(AbstractC0729o abstractC0729o) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        new ViewOnClickListenerC4809y0().mo3277E9(abstractC0729o, "NotSupportDialog");
    }

    /* renamed from: l */
    public final void m28972l(AbstractC0729o abstractC0729o) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        if (f27756c == null) {
            C4759c1 c4759c1 = new C4759c1();
            f27756c = c4759c1;
            c4759c1.mo3277E9(abstractC0729o, "UserTokenInvalidDialog");
        }
    }
}
