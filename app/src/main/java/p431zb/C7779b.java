package p431zb;

import android.os.Build;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1468n0;
import cc.C1446c0;
import cc.C1466m0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;

/* renamed from: zb.b */
/* loaded from: classes2.dex */
public final class C7779b extends AbstractC7780c {

    /* renamed from: b */
    private final InterfaceC1312h f28685b;

    /* renamed from: c */
    private final InterfaceC1312h f28686c;

    /* renamed from: d */
    private final InterfaceC1312h f28687d;

    /* renamed from: e */
    private final InterfaceC1312h f28688e;

    /* renamed from: f */
    private final InterfaceC1312h f28689f;

    /* renamed from: g */
    private final InterfaceC1312h f28690g;

    /* renamed from: h */
    private final InterfaceC1312h f28691h;

    /* renamed from: i */
    private final InterfaceC1312h f28692i;

    /* renamed from: j */
    private final InterfaceC1312h f28693j;

    /* renamed from: k */
    private final InterfaceC1312h f28694k;

    /* renamed from: l */
    private final InterfaceC1312h f28695l;

    /* renamed from: zb.b$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f28696a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a()));
        }
    }

    /* renamed from: zb.b$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f28697a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a());
        }
    }

    /* renamed from: zb.b$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f28698a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            boolean z10 = false;
            String language = Locale.getDefault().getLanguage();
            if (language != null && language.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!(true ^ z10)) {
                language = null;
            }
            if (language == null) {
                return C4842a.f20329a.m19920a().mo19962k();
            }
            return language;
        }
    }

    /* renamed from: zb.b$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f28699a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AbstractC1468n0.m6897e();
        }
    }

    /* renamed from: zb.b$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f28700a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.CPU_ABI;
        }
    }

    /* renamed from: zb.b$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f28701a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.HARDWARE;
        }
    }

    /* renamed from: zb.b$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final g f28702a = new g();

        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.MODEL;
        }
    }

    /* renamed from: zb.b$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final h f28703a = new h();

        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.PRODUCT;
        }
    }

    /* renamed from: zb.b$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final i f28704a = new i();

        i() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AbstractC1468n0.m6896d();
        }
    }

    /* renamed from: zb.b$j */
    /* loaded from: classes2.dex */
    static final class j extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final j f28705a = new j();

        j() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    /* renamed from: zb.b$k */
    /* loaded from: classes2.dex */
    static final class k extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final k f28706a = new k();

        k() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AbstractC5085b.m20601k();
        }
    }

    public C7779b() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        InterfaceC1312h m5965b6;
        InterfaceC1312h m5965b7;
        InterfaceC1312h m5965b8;
        InterfaceC1312h m5965b9;
        InterfaceC1312h m5965b10;
        InterfaceC1312h m5965b11;
        m5965b = AbstractC1314j.m5965b(c.f28698a);
        this.f28685b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(a.f28696a);
        this.f28686c = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(k.f28706a);
        this.f28687d = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(b.f28697a);
        this.f28688e = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(f.f28701a);
        this.f28689f = m5965b5;
        m5965b6 = AbstractC1314j.m5965b(g.f28702a);
        this.f28690g = m5965b6;
        m5965b7 = AbstractC1314j.m5965b(h.f28703a);
        this.f28691h = m5965b7;
        m5965b8 = AbstractC1314j.m5965b(e.f28700a);
        this.f28692i = m5965b8;
        m5965b9 = AbstractC1314j.m5965b(d.f28699a);
        this.f28693j = m5965b9;
        m5965b10 = AbstractC1314j.m5965b(i.f28704a);
        this.f28694k = m5965b10;
        m5965b11 = AbstractC1314j.m5965b(j.f28705a);
        this.f28695l = m5965b11;
    }

    /* renamed from: d */
    private final String m30117d() {
        return (String) this.f28686c.getValue();
    }

    /* renamed from: e */
    private final String m30118e() {
        return (String) this.f28688e.getValue();
    }

    /* renamed from: f */
    private final String m30119f() {
        return (String) this.f28685b.getValue();
    }

    /* renamed from: g */
    private final String m30120g() {
        return (String) this.f28693j.getValue();
    }

    /* renamed from: h */
    private final String m30121h() {
        return (String) this.f28692i.getValue();
    }

    /* renamed from: i */
    private final String m30122i() {
        return (String) this.f28689f.getValue();
    }

    /* renamed from: j */
    private final String m30123j() {
        if (C5096m.f20979a.m20692c()) {
            return "2";
        }
        return "1";
    }

    /* renamed from: k */
    private final String m30124k() {
        return (String) this.f28690g.getValue();
    }

    /* renamed from: l */
    private final String m30125l() {
        return (String) this.f28691h.getValue();
    }

    /* renamed from: m */
    private final String m30126m() {
        return (String) this.f28694k.getValue();
    }

    /* renamed from: n */
    private final int m30127n() {
        return ((Number) this.f28695l.getValue()).intValue();
    }

    /* renamed from: o */
    private final String m30128o() {
        return (String) this.f28687d.getValue();
    }

    @Override // p431zb.AbstractC7780c
    /* renamed from: a */
    public Iterable mo30129a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("loginType", m30123j());
        jsonObject.addProperty("appLanguage", m30119f());
        jsonObject.addProperty("apkVersion", m30117d());
        jsonObject.addProperty("sysVersion", m30128o());
        jsonObject.addProperty("appId", m30118e());
        jsonObject.addProperty("hardwareInfo", m30122i());
        jsonObject.addProperty(Constants.KEY_MODEL, m30124k());
        jsonObject.addProperty("product", m30125l());
        jsonObject.addProperty(C3325bt.f14281w, m30121h());
        jsonObject.addProperty("B29", m30120g());
        jsonObject.addProperty("reserve1", m30126m());
        jsonObject.addProperty("portalCode", C1466m0.f5627a.m6874k());
        jsonObject.addProperty("deviceToken", AbstractC5085b.m20594d());
        C1446c0 c1446c0 = C1446c0.f5559a;
        jsonObject.addProperty("sn", c1446c0.m6748t());
        jsonObject.addProperty("drmId", c1446c0.m6744m());
        jsonObject.addProperty("sdkVer", Integer.valueOf(m30127n()));
        Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
        AbstractC5868k.m23673e(entrySet, "newParams.entrySet()");
        return entrySet;
    }

    @Override // p431zb.AbstractC7780c
    /* renamed from: c */
    public boolean mo30130c() {
        return true;
    }
}
