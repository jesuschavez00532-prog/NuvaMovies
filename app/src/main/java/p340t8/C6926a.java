package p340t8;

import androidx.fragment.app.AbstractC0729o;
import com.lzy.okgo.cache.CacheEntity;
import com.taobao.accs.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p161ha.C4768f1;
import p161ha.C4811z0;
import p170i2.C4842a;
import p329s8.C6702b1;
import p329s8.C6714f1;
import p329s8.C6745q;
import p329s8.C6751s;
import p329s8.ViewOnClickListenerC6715g;
import p329s8.ViewOnClickListenerC6729k1;
import p329s8.ViewOnClickListenerC6732l1;
import p329s8.ViewOnClickListenerC6735m1;
import p430z9.C7767e;

/* renamed from: t8.a */
/* loaded from: classes2.dex */
public final class C6926a {

    /* renamed from: b */
    private static C7767e f26261b;

    /* renamed from: c */
    private static C7767e f26262c;

    /* renamed from: a */
    public static final C6926a f26260a = new C6926a();

    /* renamed from: d */
    private static Map f26263d = new LinkedHashMap();

    private C6926a() {
    }

    /* renamed from: a */
    public static final void m26889a() {
        f26263d.clear();
    }

    /* renamed from: h */
    public static final void m26890h(String str, long j10) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        f26263d.put(str, Long.valueOf(j10));
    }

    /* renamed from: k */
    public static /* synthetic */ void m26891k(C6926a c6926a, AbstractC0729o abstractC0729o, boolean z10, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC5642a = null;
        }
        c6926a.m26902j(abstractC0729o, z10, interfaceC5642a);
    }

    /* renamed from: m */
    public static /* synthetic */ void m26892m(C6926a c6926a, AbstractC0729o abstractC0729o, String str, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC5642a = null;
        }
        c6926a.m26903l(abstractC0729o, str, interfaceC5642a);
    }

    /* renamed from: q */
    public static /* synthetic */ void m26893q(C6926a c6926a, AbstractC0729o abstractC0729o, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        c6926a.m26906p(abstractC0729o, str);
    }

    /* renamed from: t */
    public static /* synthetic */ void m26894t(C6926a c6926a, AbstractC0729o abstractC0729o, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        c6926a.m26908s(abstractC0729o, z10);
    }

    /* renamed from: b */
    public final C7767e m26895b() {
        return f26262c;
    }

    /* renamed from: c */
    public final C7767e m26896c() {
        return f26261b;
    }

    /* renamed from: d */
    public final Map m26897d() {
        return f26263d;
    }

    /* renamed from: e */
    public final long m26898e(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        Long l10 = (Long) f26263d.get(str);
        if (l10 == null) {
            l10 = 0L;
        }
        return l10.longValue();
    }

    /* renamed from: f */
    public final void m26899f(C7767e c7767e) {
        f26262c = c7767e;
    }

    /* renamed from: g */
    public final void m26900g(C7767e c7767e) {
        f26261b = c7767e;
    }

    /* renamed from: i */
    public final void m26901i(AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a, boolean z10) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        ViewOnClickListenerC6715g viewOnClickListenerC6715g = new ViewOnClickListenerC6715g();
        viewOnClickListenerC6715g.m26324Y9(interfaceC5642a);
        viewOnClickListenerC6715g.m26326ea(z10);
        viewOnClickListenerC6715g.mo3277E9(abstractC0729o, "BindEmailDialog");
    }

    /* renamed from: j */
    public final void m26902j(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        C6745q c6745q = new C6745q();
        c6745q.m26527ja(z10);
        c6745q.m26526aa(interfaceC5642a);
        c6745q.mo3277E9(abstractC0729o, "BindPhoneDialog");
    }

    /* renamed from: l */
    public final void m26903l(AbstractC0729o abstractC0729o, String str, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, "mobile");
        C6751s c6751s = new C6751s();
        c6751s.m26540M9(str);
        c6751s.m26539L9(interfaceC5642a);
        c6751s.mo3277E9(abstractC0729o, "BindPhoneSuccessDialog");
    }

    /* renamed from: n */
    public final void m26904n(AbstractC0729o abstractC0729o, boolean z10) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        C6702b1 c6702b1 = new C6702b1();
        c6702b1.m26275W9(z10);
        c6702b1.mo3277E9(abstractC0729o, "PhoneRetrievePwdDialog");
    }

    /* renamed from: o */
    public final void m26905o(AbstractC0729o abstractC0729o) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        new C4811z0().mo3277E9(abstractC0729o, "PrivacyPolicyDialog");
    }

    /* renamed from: p */
    public final void m26906p(AbstractC0729o abstractC0729o, String str) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        C6714f1 c6714f1 = new C6714f1();
        c6714f1.m26296L9(str);
        c6714f1.mo3277E9(abstractC0729o, "ResetPasswordSuccessDialog");
    }

    /* renamed from: r */
    public final void m26907r(AbstractC0729o abstractC0729o, boolean z10) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1 = new ViewOnClickListenerC6729k1();
        viewOnClickListenerC6729k1.m26402S9(z10);
        viewOnClickListenerC6729k1.mo3277E9(abstractC0729o, "RetrievePasswordDialog");
    }

    /* renamed from: s */
    public final void m26908s(AbstractC0729o abstractC0729o, boolean z10) {
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

    /* renamed from: u */
    public final void m26909u(AbstractC0729o abstractC0729o, String str, String str2, String str3) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(str, "mobile");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        ViewOnClickListenerC6735m1 viewOnClickListenerC6735m1 = new ViewOnClickListenerC6735m1();
        viewOnClickListenerC6735m1.m26441R9(str, str2, str3);
        viewOnClickListenerC6735m1.mo3277E9(abstractC0729o, "SetLoginPwdOnRetrieveDialog");
    }

    /* renamed from: v */
    public final C4768f1 m26910v(AbstractC0729o abstractC0729o) {
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        C4768f1 c4768f1 = new C4768f1();
        c4768f1.mo3277E9(abstractC0729o, "VersionNotSupport");
        return c4768f1;
    }
}
