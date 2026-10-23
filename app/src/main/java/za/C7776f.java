package za;

import ac.C0130a;
import ac.C0132a1;
import ac.C0152f1;
import ac.C0155g0;
import ac.C0173k2;
import ac.C0180m1;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1446c0;
import cc.C1466m0;
import cc.C1473s;
import com.module.event.LoginSuccessEvent;
import com.request.result.ActiveResult;
import com.request.result.GetSlbInfoBeanResultData;
import com.request.result.LoginResult;
import com.request.result.SnTokenResult;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p035c3.C1356k;
import p104dd.C4094b;
import p132fa.C4300d;
import p134fc.AbstractC4305b;
import p135fd.C4307b;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.C5090g;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6372b0;
import p301qb.InterfaceC6377d;
import p301qb.InterfaceC6403l1;
import p301qb.InterfaceC6423s0;
import p301qb.InterfaceC6432v0;
import p301qb.InterfaceC6433v1;
import p301qb.InterfaceC6444z0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p363v2.C7197a;
import p371vb.C7252a;
import p400xa.C7577i1;
import p400xa.C7589m1;
import p400xa.C7615w;
import p421z0.C7737k;
import ye.C7709c;

/* renamed from: za.f */
/* loaded from: classes2.dex */
public final class C7776f implements InterfaceC6372b0, InterfaceC6377d, InterfaceC6423s0, InterfaceC6433v1, InterfaceC6444z0, InterfaceC6403l1, InterfaceC6432v0 {

    /* renamed from: a */
    public static final C7776f f28648a = null;

    /* renamed from: b */
    private static final String f28649b;

    /* renamed from: c */
    private static String f28650c;

    /* renamed from: d */
    private static Context f28651d;

    /* renamed from: e */
    private static int f28652e;

    /* renamed from: f */
    private static ActiveResult f28653f;

    /* renamed from: g */
    private static LoginResult f28654g;

    /* renamed from: h */
    private static String f28655h;

    /* renamed from: i */
    private static int f28656i;

    /* renamed from: j */
    private static int f28657j;

    /* renamed from: k */
    private static String f28658k;

    /* renamed from: l */
    private static InterfaceC6432v0 f28659l;

    /* renamed from: m */
    private static boolean f28660m;

    /* renamed from: n */
    private static final InterfaceC1312h f28661n;

    /* renamed from: o */
    private static final InterfaceC1312h f28662o;

    /* renamed from: p */
    private static final InterfaceC1312h f28663p;

    /* renamed from: q */
    private static final InterfaceC1312h f28664q;

    /* renamed from: r */
    private static final InterfaceC1312h f28665r;

    /* renamed from: s */
    private static final InterfaceC1312h f28666s;

    /* renamed from: t */
    private static Handler f28667t;

    /* renamed from: u */
    private static final List f28668u;

    /* renamed from: za.f$a */
    /* loaded from: classes2.dex */
    public class a {
        /* renamed from: a */
        void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: za.f$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f28669a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(String str) {
            String str2;
            AbstractC5868k.m23674f(str, "it");
            C1473s.f5656a.m6918b(0);
            C7252a.f27087a.m28078m((String) C7577i1.f27838b.m29084c().m29074f("key_device_tag", ""));
            C7776f c7776f = C7776f.f28648a;
            c7776f.m30076J().m638k();
            C1466m0 c1466m0 = C1466m0.f5627a;
            UserInfo m6887v = c1466m0.m6887v();
            String str3 = null;
            if (m6887v != null) {
                str2 = m6887v.getHasPay();
            } else {
                str2 = null;
            }
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str3 = m6887v2.getUserIdentity();
            }
            C0173k2.m634i(c7776f.m30076J(), "merge", C4842a.f20329a.m19920a().mo19962k(), new String[]{C4300d.f18678a.m18035h()}, str2, str3, false, 32, null);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: za.f$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f28670a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m30105a(String str) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m30105a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: za.f$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f28671a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m30106a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m30106a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: za.f$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f28672a = new e();

        e() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0130a invoke() {
            return new C0130a(C7776f.f28648a, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: za.f$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f28673a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0155g0 invoke() {
            return new C0155g0(C7776f.f28648a);
        }
    }

    /* renamed from: za.f$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final g f28674a = new g();

        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0132a1 invoke() {
            return new C0132a1(C7776f.f28648a);
        }
    }

    /* renamed from: za.f$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final h f28675a = new h();

        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0152f1 invoke() {
            return new C0152f1(C7776f.f28648a);
        }
    }

    /* renamed from: za.f$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final i f28676a = new i();

        i() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(C7776f.f28648a, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: za.f$j */
    /* loaded from: classes2.dex */
    static final class j extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final j f28677a = new j();

        j() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0173k2 invoke() {
            return new C0173k2(C7776f.f28648a);
        }
    }

    static {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        InterfaceC1312h m5965b6;
        C7776f c7776f = new C7776f();
        f28648a = c7776f;
        f28649b = c7776f.getClass().getSimpleName();
        f28650c = "";
        f28651d = AbstractApplicationC6253c.f24484b.m24887a();
        f28658k = "";
        m5965b = AbstractC1314j.m5965b(f.f28673a);
        f28661n = m5965b;
        m5965b2 = AbstractC1314j.m5965b(e.f28672a);
        f28662o = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(j.f28677a);
        f28663p = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(i.f28676a);
        f28664q = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(g.f28674a);
        f28665r = m5965b5;
        m5965b6 = AbstractC1314j.m5965b(h.f28675a);
        f28666s = m5965b6;
        f28667t = new Handler(Looper.getMainLooper());
        f28668u = new ArrayList();
    }

    private C7776f() {
    }

    /* renamed from: B */
    private final C0155g0 m30072B() {
        return (C0155g0) f28661n.getValue();
    }

    /* renamed from: F */
    private final C0132a1 m30073F() {
        return (C0132a1) f28665r.getValue();
    }

    /* renamed from: G */
    private final C0152f1 m30074G() {
        return (C0152f1) f28666s.getValue();
    }

    /* renamed from: H */
    private final C0180m1 m30075H() {
        return (C0180m1) f28664q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final C0173k2 m30076J() {
        return (C0173k2) f28663p.getValue();
    }

    /* renamed from: K */
    private final void m30077K() {
        Observable just = Observable.just("key_device_tag");
        final b bVar = b.f28669a;
        Observable compose = just.map(new Function() { // from class: za.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m30078M;
                m30078M = C7776f.m30078M(InterfaceC5660l.this, obj);
                return m30078M;
            }
        }).compose(AbstractC7029f.m27121b());
        final c cVar = c.f28670a;
        Consumer consumer = new Consumer() { // from class: za.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7776f.m30079P(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f28671a;
        compose.subscribe(consumer, new Consumer() { // from class: za.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7776f.m30080Q(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final String m30078M(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m30079P(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m30080Q(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: X */
    private final void m30081X(final boolean z10, final ActiveResult activeResult, final LoginResult loginResult, final String str) {
        int i10 = 0;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        f28652e = i10;
        f28667t.post(new Runnable() { // from class: za.a
            @Override // java.lang.Runnable
            public final void run() {
                C7776f.m30083Z(z10, activeResult, loginResult, str);
            }
        });
    }

    /* renamed from: Y */
    static /* synthetic */ void m30082Y(C7776f c7776f, boolean z10, ActiveResult activeResult, LoginResult loginResult, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activeResult = null;
        }
        if ((i10 & 4) != 0) {
            loginResult = null;
        }
        if ((i10 & 8) != 0) {
            str = "";
        }
        c7776f.m30081X(z10, activeResult, loginResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m30083Z(boolean z10, ActiveResult activeResult, LoginResult loginResult, String str) {
        AbstractC5868k.m23674f(str, "$accountType");
        int size = f28668u.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((a) f28668u.get(i10)).mo11443a(z10, f28650c, activeResult, loginResult, f28658k, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        f28668u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m30084b0(String str) {
        AbstractC5868k.m23674f(str, "$errCode");
        InterfaceC6432v0 interfaceC6432v0 = f28659l;
        if (interfaceC6432v0 != null) {
            interfaceC6432v0.mo11978c(str);
        }
    }

    /* renamed from: c0 */
    private final void m30085c0() {
        C5096m c5096m = C5096m.f20979a;
        if (c5096m.m20692c()) {
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (!TextUtils.isEmpty(c1466m0.m6885t())) {
                String m6888w = c1466m0.m6888w();
                String m6889x = c1466m0.m6889x();
                String m6890y = c1466m0.m6890y();
                String m6864f = c1466m0.m6864f();
                C7589m1.f27886a.m29130M(c1466m0.m6885t());
                if (AbstractC6567a.m25637g(m6888w) && (AbstractC6567a.m25637g(m6889x) || AbstractC6567a.m25637g(m6890y))) {
                    m30097U(c1466m0.m6860d(), m6888w, m6889x, m6864f, m6890y);
                    return;
                }
                C4842a c4842a = C4842a.f20329a;
                if (c4842a.m19920a().mo19975x()) {
                    C5090g c5090g = C5090g.f20948a;
                    m6888w = c5090g.m20653t(c5090g.m20641f());
                    m6889x = c5090g.m20653t(c5090g.m20645j());
                    m6890y = c5090g.m20653t(c5090g.m20651p());
                    m6864f = c5090g.m20653t(c5090g.m20643h());
                }
                String str = m6888w;
                String str2 = m6889x;
                String str3 = m6864f;
                String str4 = m6890y;
                if (AbstractC6567a.m25637g(str) && (AbstractC6567a.m25637g(str2) || AbstractC6567a.m25637g(str4))) {
                    String m6860d = c1466m0.m6860d();
                    if (c4842a.m19920a().mo19975x()) {
                        C5090g c5090g2 = C5090g.f20948a;
                        m6860d = c5090g2.m20653t(c5090g2.m20642g());
                    }
                    m30097U(m6860d, str, str2, str3, str4);
                    return;
                }
                m30101o();
                return;
            }
            m30095S();
            return;
        }
        String m20690a = c5096m.m20690a();
        C7589m1.f27886a.m29130M(m20690a);
        C4842a c4842a2 = C4842a.f20329a;
        if (c4842a2.m19920a().m19935L(m20690a)) {
            C1466m0 c1466m02 = C1466m0.f5627a;
            String m6888w2 = c1466m02.m6888w();
            String m6889x2 = c1466m02.m6889x();
            String m6890y2 = c1466m02.m6890y();
            String m6864f2 = c1466m02.m6864f();
            if (AbstractC6567a.m25637g(m6888w2) && (AbstractC6567a.m25637g(m6889x2) || AbstractC6567a.m25637g(m6890y2))) {
                m30097U(c1466m02.m6860d(), m6888w2, m6889x2, m6864f2, m6890y2);
                return;
            }
            if (c4842a2.m19920a().mo19975x()) {
                C5090g c5090g3 = C5090g.f20948a;
                m6888w2 = c5090g3.m20653t(c5090g3.m20641f());
                m6889x2 = c5090g3.m20653t(c5090g3.m20645j());
                m6890y2 = c5090g3.m20653t(c5090g3.m20651p());
                m6864f2 = c5090g3.m20653t(c5090g3.m20643h());
            }
            String str5 = m6888w2;
            String str6 = m6889x2;
            String str7 = m6864f2;
            String str8 = m6890y2;
            if (AbstractC6567a.m25637g(str5) && (AbstractC6567a.m25637g(str6) || AbstractC6567a.m25637g(str8))) {
                String m6860d2 = c1466m02.m6860d();
                if (c4842a2.m19920a().mo19975x()) {
                    C5090g c5090g4 = C5090g.f20948a;
                    m6860d2 = c5090g4.m20653t(c5090g4.m20642g());
                }
                m30097U(m6860d2, str5, str6, str7, str8);
                return;
            }
            m30101o();
            return;
        }
        f28650c = "EA16";
        f28658k = "apk";
        m30082Y(this, false, null, null, null, 14, null);
    }

    /* renamed from: t */
    private final void m30092t() {
        int i10 = 0;
        C7577i1.f fVar = C7577i1.f27838b;
        C7577i1 m29084c = fVar.m29084c();
        C4300d c4300d = C4300d.f18678a;
        int intValue = ((Number) m29084c.m29074f(c4300d.m18065w(), -1)).intValue();
        if (intValue == Integer.MAX_VALUE) {
            i10 = 0;
        } else {
            i10 = intValue + 1;
        }
        fVar.m29084c().m29076h(c4300d.m18065w(), Integer.valueOf(i10));
    }

    /* renamed from: x */
    private final int m30093x() {
        return ((Number) C7577i1.f27838b.m29084c().m29074f(C4300d.f18678a.m18065w(), -1)).intValue();
    }

    /* renamed from: z */
    private final C0130a m30094z() {
        return (C0130a) f28662o.getValue();
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "accountType");
        f28654g = loginResult;
        f28655h = str;
        m30081X(true, null, loginResult, str);
    }

    @Override // p301qb.InterfaceC6377d
    /* renamed from: M5 */
    public void mo25202M5(ActiveResult activeResult) {
        AbstractC5868k.m23674f(activeResult, "it");
        f28657j = 1;
        f28658k = "";
        f28653f = activeResult;
        m30077K();
        m30096T();
        m30082Y(this, true, activeResult, null, null, 12, null);
        C7709c m29787d = C7709c.m29787d();
        C1466m0 c1466m0 = C1466m0.f5627a;
        m29787d.m29801m(new LoginSuccessEvent(c1466m0.m6878m(), c1466m0.m6885t()));
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        if (C4842a.f20329a.m19920a().mo19975x()) {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20641f(), "");
            c5090g.m20656x(c5090g.m20645j(), "");
            c5090g.m20656x(c5090g.m20651p(), "");
            c5090g.m20656x(c5090g.m20642g(), "");
            c5090g.m20656x(c5090g.m20643h(), "");
        }
        f28657j = 1;
        f28658k = "";
        f28654g = loginResult;
        m30077K();
        m30096T();
        m30082Y(this, true, null, loginResult, null, 8, null);
        C7709c m29787d = C7709c.m29787d();
        C1466m0 c1466m0 = C1466m0.f5627a;
        m29787d.m29801m(new LoginSuccessEvent(c1466m0.m6878m(), c1466m0.m6885t()));
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return null;
    }

    @Override // p301qb.InterfaceC6403l1
    /* renamed from: Q5 */
    public void mo25218Q5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        f28657j = 2;
        f28658k = "/snToken";
        f28650c = str;
        m30082Y(this, false, null, null, null, 14, null);
    }

    /* renamed from: S */
    public final void m30095S() {
        m30073F().m527b(f28651d);
    }

    /* renamed from: T */
    public final void m30096T() {
        C0152f1.m579f(m30074G(), false, 1, null);
    }

    @Override // p301qb.InterfaceC6423s0
    /* renamed from: T0 */
    public void mo25226T0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    /* renamed from: U */
    public final void m30097U(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "username");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "areaCode");
        AbstractC5868k.m23674f(str5, "verificationToken");
        m30075H().m664g(str, str2, str3, "1", str4, "", str5);
    }

    @Override // p301qb.InterfaceC6377d
    /* renamed from: W4 */
    public void mo25203W4(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        f28657j = 2;
        f28658k = "/active";
        f28653f = null;
        f28650c = str;
        m30082Y(this, false, null, null, null, 14, null);
    }

    @Override // p301qb.InterfaceC6423s0
    /* renamed from: Y2 */
    public void mo25227Y2(GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        AbstractC5868k.m23674f(getSlbInfoBeanResultData, "data");
        C7777g c7777g = C7777g.f28678a;
        c7777g.m30114b(f28651d, getSlbInfoBeanResultData.getPlay_params());
        c7777g.m30113a(getSlbInfoBeanResultData);
    }

    @Override // p301qb.InterfaceC6403l1
    /* renamed from: Z3 */
    public void mo25219Z3(SnTokenResult snTokenResult) {
        AbstractC5868k.m23674f(snTokenResult, "t");
        C7589m1.f27886a.m29130M(C1466m0.f5627a.m6885t());
        m30101o();
    }

    @Override // p301qb.InterfaceC6432v0
    /* renamed from: c */
    public void mo11978c(final String str) {
        AbstractC5868k.m23674f(str, "errCode");
        f28667t.post(new Runnable() { // from class: za.e
            @Override // java.lang.Runnable
            public final void run() {
                C7776f.m30084b0(str);
            }
        });
    }

    /* renamed from: e0 */
    public final void m30098e0(a aVar) {
        if (aVar == null) {
            return;
        }
        f28668u.remove(aVar);
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        f28657j = 2;
        f28658k = "/login";
        f28654g = null;
        f28650c = str;
        m30082Y(this, false, null, null, null, 14, null);
    }

    @Override // p301qb.InterfaceC6372b0
    /* renamed from: g1 */
    public void mo25200g1() {
        f28656i = 1;
        if (Build.MODEL.equals("UniTV U20") && C4842a.f20329a.m19920a().m19947X()) {
            C1466m0 c1466m0 = C1466m0.f5627a;
            C5090g c5090g = C5090g.f20948a;
            c1466m0.m6855a0(c5090g.m20655w("metadata"));
            c1466m0.m6867g0(c5090g.m20655w("signdata"));
        }
        if (f28660m) {
            f28660m = false;
            m30085c0();
        }
    }

    /* renamed from: j0 */
    public final void m30099j0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        f28650c = "";
        f28652e = 0;
        Context applicationContext = context.getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "context.applicationContext");
        f28651d = applicationContext;
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6869h0(null);
        if (Build.VERSION.SDK_INT >= 29) {
            C1446c0.f5559a.m6747s();
        }
        AbstractC4305b.m18078c(AbstractC5085b.m20597g(context));
        m30092t();
        m30103u(context);
        C4094b.f17998a.m17146i(context);
        C7737k.f28482a.m29917d(c1466m0.m6870i(), c1466m0.m6885t());
        C7615w.m29281Q(C7615w.f27995a, false, 1, null);
        AbstractC5085b.m20591a();
    }

    @Override // p301qb.InterfaceC6372b0
    /* renamed from: j2 */
    public void mo25201j2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "uri");
        f28656i = 2;
        f28658k = str2;
        f28650c = str;
        if (f28657j == 2) {
            m30082Y(this, false, null, null, null, 14, null);
        }
    }

    /* renamed from: k0 */
    public final void m30100k0(InterfaceC6432v0 interfaceC6432v0) {
        AbstractC5868k.m23674f(interfaceC6432v0, "heartBeatFailListener");
        f28659l = interfaceC6432v0;
    }

    /* renamed from: o */
    public final void m30101o() {
        m30094z().m520f(m30093x());
    }

    /* renamed from: r */
    public final void m30102r(a aVar) {
        if (aVar == null) {
            return;
        }
        List list = f28668u;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
        if (C1466m0.f5627a.m6887v() != null) {
            ActiveResult activeResult = f28653f;
            LoginResult loginResult = f28654g;
            String str = f28655h;
            if (str == null) {
                str = "";
            }
            m30081X(true, activeResult, loginResult, str);
            return;
        }
        if (f28652e == 2) {
            m30082Y(this, false, null, null, null, 14, null);
        }
    }

    /* renamed from: u */
    public final void m30103u(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (C1356k.f5086a.m6133f(context)) {
            if (!C7197a.f26917a.m27856m()) {
                f28657j = 2;
                f28650c = "EA9";
                f28656i = 0;
                f28660m = true;
                m30072B().m596c(m30093x());
                return;
            }
            f28657j = 0;
            f28656i = 0;
            f28660m = false;
            m30072B().m596c(m30093x());
            if (Build.MODEL.equals("UniTV U20") && C4842a.f20329a.m19920a().m19947X()) {
                C1466m0 c1466m0 = C1466m0.f5627a;
                C5090g c5090g = C5090g.f20948a;
                c1466m0.m6855a0(c5090g.m20655w("metadata"));
                c1466m0.m6867g0(c5090g.m20655w("signdata"));
            }
            m30085c0();
            return;
        }
        f28650c = "EE1";
        f28658k = "apk";
        m30082Y(this, false, null, null, null, 14, null);
    }
}
