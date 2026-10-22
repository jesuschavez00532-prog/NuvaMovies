package p400xa;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.entity.EventType;
import be.C1328x;
import com.google.gson.Gson;
import com.module.R$string;
import com.request.result.ConfigData;
import com.request.result.ConfigInfoBean;
import com.request.result.ConfigResult;
import com.request.result.EmailSuffixData;
import com.request.result.GetEmailSuffixResult;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p170i2.C4842a;
import p287pb.AbstractApplicationC6253c;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p359ue.AbstractC7167u;

/* renamed from: xa.w */
/* loaded from: classes2.dex */
public final class C7615w {

    /* renamed from: a */
    public static final C7615w f27995a;

    /* renamed from: b */
    private static final String f27996b;

    /* renamed from: c */
    private static String f27997c;

    /* renamed from: d */
    private static String f27998d;

    /* renamed from: e */
    private static String f27999e;

    /* renamed from: f */
    private static String f28000f;

    /* renamed from: g */
    private static ConfigInfoBean f28001g;

    /* renamed from: h */
    private static Disposable f28002h;

    /* renamed from: i */
    private static int f28003i;

    /* renamed from: j */
    private static int f28004j;

    /* renamed from: k */
    private static int f28005k;

    /* renamed from: l */
    private static volatile long f28006l;

    /* renamed from: m */
    private static boolean f28007m;

    /* renamed from: n */
    private static int f28008n;

    /* renamed from: o */
    private static boolean f28009o;

    /* renamed from: p */
    private static String f28010p;

    /* renamed from: q */
    private static String f28011q;

    /* renamed from: r */
    private static String f28012r;

    /* renamed from: s */
    private static String f28013s;

    /* renamed from: t */
    private static String f28014t;

    /* renamed from: u */
    private static String f28015u;

    /* renamed from: xa.w$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f28016a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5660l f28017b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC5660l f28018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3) {
            super(1);
            this.f28016a = interfaceC5660l;
            this.f28017b = interfaceC5660l2;
            this.f28018c = interfaceC5660l3;
        }

        /* renamed from: a */
        public final void m29320a(ConfigResult configResult) {
            String str;
            ConfigData data = configResult.getData();
            if (data != null) {
                str = data.getConfig();
            } else {
                str = null;
            }
            if (str == null) {
                Log.d(C7615w.f27996b, " .doOnNext {：" + configResult);
                C7615w.m29280M(C7615w.f27995a, C7615w.f28001g, this.f28016a, this.f28017b, this.f28018c, false, 16, null);
                return;
            }
            C7581k c7581k = C7581k.f27855a;
            ConfigData data2 = configResult.getData();
            AbstractC5868k.m23671c(data2);
            String config = data2.getConfig();
            AbstractC5868k.m23671c(config);
            c7581k.m29098g("Properties", config);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29320a((ConfigResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.w$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f28019a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5660l f28020b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC5660l f28021c;

        /* renamed from: d */
        final /* synthetic */ C7615w f28022d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3, C7615w c7615w) {
            super(1);
            this.f28019a = interfaceC5660l;
            this.f28020b = interfaceC5660l2;
            this.f28021c = interfaceC5660l3;
            this.f28022d = c7615w;
        }

        /* renamed from: a */
        public final void m29321a(ConfigResult configResult) {
            String str;
            boolean z10;
            Log.d(C7615w.f27996b, " .subscribe({:" + configResult);
            Gson m27114a = AbstractC7027d.m27114a();
            ConfigInfoBean configInfoBean = null;
            String str2 = null;
            configInfoBean = null;
            if (configResult.getData() != null) {
                ConfigData data = configResult.getData();
                if (data != null) {
                    str = data.getConfig();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    ConfigData data2 = configResult.getData();
                    if (data2 != null) {
                        str2 = data2.getConfig();
                    }
                    configInfoBean = (ConfigInfoBean) m27114a.fromJson(str2, ConfigInfoBean.class);
                }
            }
            C7615w.m29280M(C7615w.f27995a, configInfoBean, this.f28019a, this.f28020b, this.f28021c, false, 16, null);
            synchronized (this.f28022d) {
                C7615w.f28008n = 1;
                C1328x c1328x = C1328x.f4998a;
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29321a((ConfigResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.w$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ InterfaceC5660l f28024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5660l interfaceC5660l) {
            super(1);
            this.f28024b = interfaceC5660l;
        }

        /* renamed from: a */
        public final void m29322a(Throwable th) {
            th.printStackTrace();
            synchronized (C7615w.this) {
                C7615w.f28008n = 2;
                C1328x c1328x = C1328x.f4998a;
            }
            C7615w.f28003i++;
            String string = AbstractApplicationC6253c.f24484b.m24887a().getString(R$string.setting_about_email);
            AbstractC5868k.m23673e(string, "BaseApp.context.getStrin…ring.setting_about_email)");
            InterfaceC5660l interfaceC5660l = this.f28024b;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(string);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29322a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.w$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f28025a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m29323a(GetEmailSuffixResult getEmailSuffixResult) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29323a((GetEmailSuffixResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.w$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f28026a = new e();

        e() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final List mo542f(GetEmailSuffixResult getEmailSuffixResult) {
            String str;
            List m27748R;
            AbstractC5868k.m23674f(getEmailSuffixResult, "it");
            EmailSuffixData data = getEmailSuffixResult.getData();
            if (data != null) {
                str = data.getEmailSuffixStr();
            } else {
                str = null;
            }
            if (str != null) {
                m27748R = AbstractC7167u.m27748R(str, new String[]{","}, false, 0, 6, null);
                return m27748R;
            }
            return null;
        }
    }

    /* renamed from: xa.w$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f28027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5660l interfaceC5660l) {
            super(1);
            this.f28027a = interfaceC5660l;
        }

        /* renamed from: a */
        public final void m29325a(List list) {
            InterfaceC5660l interfaceC5660l = this.f28027a;
            if (interfaceC5660l != null) {
                AbstractC5868k.m23672d(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                interfaceC5660l.mo542f((ArrayList) list);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29325a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.w$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f28028a = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m29326a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29326a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C7615w c7615w = new C7615w();
        f27995a = c7615w;
        String simpleName = c7615w.getClass().getSimpleName();
        AbstractC5868k.m23673e(simpleName, "javaClass.simpleName");
        f27996b = simpleName;
        f28004j = 3;
        f28005k = 5;
        f28006l = 512000L;
        f28008n = 2;
    }

    private C7615w() {
    }

    /* renamed from: A */
    private final void m29274A(InterfaceC5660l interfaceC5660l) {
        Observable m5554D = C1224f.f4816e.m5631a().m5554D();
        final d dVar = d.f28025a;
        Observable doOnNext = m5554D.doOnNext(new Consumer() { // from class: xa.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29275B(InterfaceC5660l.this, obj);
            }
        });
        final e eVar = e.f28026a;
        Observable compose = doOnNext.map(new Function() { // from class: xa.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m29276C;
                m29276C = C7615w.m29276C(InterfaceC5660l.this, obj);
                return m29276C;
            }
        }).compose(AbstractC7029f.m27121b());
        final f fVar = new f(interfaceC5660l);
        Consumer consumer = new Consumer() { // from class: xa.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29277D(InterfaceC5660l.this, obj);
            }
        };
        final g gVar = g.f28028a;
        compose.subscribe(consumer, new Consumer() { // from class: xa.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29278E(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: B */
    public static final void m29275B(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: C */
    public static final List m29276C(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: D */
    public static final void m29277D(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: E */
    public static final void m29278E(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: L */
    private final void m29279L(ConfigInfoBean configInfoBean, InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String downloadSpeed;
        String downloadNumber;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16 = null;
        if (configInfoBean != null) {
            str = configInfoBean.getOfficialWebsiteLink();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && !z10) {
            if (configInfoBean != null) {
                str15 = configInfoBean.getOfficialWebsiteLink();
            } else {
                str15 = null;
            }
            f27999e = str15;
            if (interfaceC5660l2 != null) {
                AbstractC5868k.m23671c(str15);
                interfaceC5660l2.mo542f(str15);
            }
        }
        if (configInfoBean != null) {
            str2 = configInfoBean.getUpdateDownloadUrl();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && !z10) {
            if (configInfoBean != null) {
                str14 = configInfoBean.getUpdateDownloadUrl();
            } else {
                str14 = null;
            }
            f28000f = str14;
            if (interfaceC5660l3 != null) {
                AbstractC5868k.m23671c(str14);
                interfaceC5660l3.mo542f(str14);
            }
        }
        if (configInfoBean != null) {
            str3 = configInfoBean.getCustomerEmail();
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (z10) {
                if (configInfoBean != null) {
                    str13 = configInfoBean.getCustomerEmail();
                } else {
                    str13 = null;
                }
                f27998d = str13;
                if (interfaceC5660l != null) {
                    AbstractC5868k.m23671c(str13);
                    interfaceC5660l.mo542f(str13);
                }
            } else {
                if (configInfoBean != null) {
                    str12 = configInfoBean.getCustomerEmail();
                } else {
                    str12 = null;
                }
                f27997c = str12;
                if (interfaceC5660l != null) {
                    AbstractC5868k.m23671c(str12);
                    interfaceC5660l.mo542f(str12);
                }
            }
        } else {
            String string = AbstractApplicationC6253c.f24484b.m24887a().getString(R$string.setting_about_email);
            AbstractC5868k.m23673e(string, "BaseApp.context.getStrin…ring.setting_about_email)");
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(string);
            }
        }
        if (configInfoBean != null && (downloadNumber = configInfoBean.getDownloadNumber()) != null && TextUtils.isDigitsOnly(downloadNumber)) {
            f28005k = Integer.parseInt(downloadNumber);
        }
        if (configInfoBean != null && (downloadSpeed = configInfoBean.getDownloadSpeed()) != null && TextUtils.isDigitsOnly(downloadSpeed)) {
            f28007m = true;
            f28006l = Long.parseLong(downloadSpeed) * EventType.AUTH_FAIL;
        }
        if (configInfoBean != null) {
            str4 = configInfoBean.getDownloadSpeed();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            f28007m = false;
        }
        if (configInfoBean != null) {
            str5 = configInfoBean.getUpdateDownloadUrl();
        } else {
            str5 = null;
        }
        f28000f = str5;
        if (configInfoBean != null) {
            str6 = configInfoBean.getOfficialWebsiteLink();
        } else {
            str6 = null;
        }
        f27999e = str6;
        if (!z10) {
            f28009o = true;
        }
        if (configInfoBean != null) {
            str7 = configInfoBean.getWhatsAppA();
        } else {
            str7 = null;
        }
        f28010p = str7;
        if (configInfoBean != null) {
            str8 = configInfoBean.getWhatsAppB();
        } else {
            str8 = null;
        }
        f28011q = str8;
        if (configInfoBean != null) {
            str9 = configInfoBean.getWhatsApp1();
        } else {
            str9 = null;
        }
        f28012r = str9;
        if (configInfoBean != null) {
            str10 = configInfoBean.getDownloadTVUrl();
        } else {
            str10 = null;
        }
        f28013s = str10;
        if (configInfoBean != null) {
            str11 = configInfoBean.getDownloadApkUrl();
        } else {
            str11 = null;
        }
        f28014t = str11;
        if (configInfoBean != null) {
            str16 = configInfoBean.getTVtutorialUrl();
        }
        f28015u = str16;
    }

    /* renamed from: M */
    static /* synthetic */ void m29280M(C7615w c7615w, ConfigInfoBean configInfoBean, InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3, boolean z10, int i10, Object obj) {
        InterfaceC5660l interfaceC5660l4;
        InterfaceC5660l interfaceC5660l5;
        boolean z11;
        if ((i10 & 4) != 0) {
            interfaceC5660l4 = null;
        } else {
            interfaceC5660l4 = interfaceC5660l2;
        }
        if ((i10 & 8) != 0) {
            interfaceC5660l5 = null;
        } else {
            interfaceC5660l5 = interfaceC5660l3;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        c7615w.m29279L(configInfoBean, interfaceC5660l, interfaceC5660l4, interfaceC5660l5, z11);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m29281Q(C7615w c7615w, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c7615w.m29310P(z10);
    }

    /* renamed from: R */
    public static final void m29282R(boolean z10) {
        String m29097f = C7581k.f27855a.m29097f("Properties");
        if (!TextUtils.isEmpty(m29097f)) {
            ConfigInfoBean configInfoBean = (ConfigInfoBean) AbstractC7027d.m27114a().fromJson(m29097f, ConfigInfoBean.class);
            f28001g = configInfoBean;
            f27995a.m29279L(configInfoBean, null, null, null, !z10);
        }
    }

    /* renamed from: n */
    private final void m29296n(InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3) {
        Disposable disposable;
        Disposable disposable2 = f28002h;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = f28002h) != null) {
            disposable.dispose();
        }
        Observable m5550B = C1224f.f4816e.m5631a().m5550B();
        final a aVar = new a(interfaceC5660l, interfaceC5660l2, interfaceC5660l3);
        Observable compose = m5550B.doOnNext(new Consumer() { // from class: xa.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29298p(InterfaceC5660l.this, obj);
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b(interfaceC5660l, interfaceC5660l2, interfaceC5660l3, this);
        Consumer consumer = new Consumer() { // from class: xa.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29299q(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c(interfaceC5660l);
        f28002h = compose.subscribe(consumer, new Consumer() { // from class: xa.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7615w.m29300r(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: o */
    static /* synthetic */ void m29297o(C7615w c7615w, InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5660l = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC5660l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC5660l3 = null;
        }
        c7615w.m29296n(interfaceC5660l, interfaceC5660l2, interfaceC5660l3);
    }

    /* renamed from: p */
    public static final void m29298p(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: q */
    public static final void m29299q(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: r */
    public static final void m29300r(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: w */
    public static /* synthetic */ void m29301w(C7615w c7615w, InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5660l = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC5660l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC5660l3 = null;
        }
        c7615w.m29316v(interfaceC5660l, interfaceC5660l2, interfaceC5660l3);
    }

    /* renamed from: F */
    public final String m29302F() {
        if (TextUtils.isEmpty(f27997c)) {
            if (!TextUtils.isEmpty(f27998d)) {
                String str = f27998d;
                AbstractC5868k.m23671c(str);
                return str;
            }
            String string = AbstractApplicationC6253c.f24484b.m24887a().getString(R$string.setting_about_email);
            AbstractC5868k.m23673e(string, "BaseApp.context.getStrin…ring.setting_about_email)");
            return string;
        }
        String str2 = f27997c;
        AbstractC5868k.m23671c(str2);
        return str2;
    }

    /* renamed from: G */
    public final String m29303G() {
        if (!C4842a.f20329a.m19920a().m19924A()) {
            return "";
        }
        return m29302F();
    }

    /* renamed from: H */
    public final String m29304H() {
        return f28015u;
    }

    /* renamed from: I */
    public final String m29305I() {
        return f28012r;
    }

    /* renamed from: J */
    public final String m29306J() {
        return f28010p;
    }

    /* renamed from: K */
    public final String m29307K() {
        return f28011q;
    }

    /* renamed from: N */
    public final boolean m29308N() {
        return f28009o;
    }

    /* renamed from: O */
    public final boolean m29309O() {
        return f28007m;
    }

    /* renamed from: P */
    public final void m29310P(final boolean z10) {
        AbstractC7030g.m27129c("loadCacheConfigInfo", new Runnable() { // from class: xa.v
            @Override // java.lang.Runnable
            public final void run() {
                C7615w.m29282R(z10);
            }
        }, false);
    }

    /* renamed from: S */
    public final void m29311S(Context context, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        try {
            m29274A(interfaceC5660l);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: T */
    public final void m29312T(boolean z10) {
        f28009o = z10;
    }

    /* renamed from: s */
    public final String m29313s() {
        return f28014t;
    }

    /* renamed from: t */
    public final String m29314t() {
        return f28013s;
    }

    /* renamed from: u */
    public final String m29315u() {
        return f27997c;
    }

    /* renamed from: v */
    public final void m29316v(InterfaceC5660l interfaceC5660l, InterfaceC5660l interfaceC5660l2, InterfaceC5660l interfaceC5660l3) {
        if (interfaceC5660l2 != null) {
            if (TextUtils.isEmpty(f27999e)) {
                m29297o(this, interfaceC5660l, interfaceC5660l2, null, 4, null);
                return;
            } else {
                String str = f27999e;
                AbstractC5868k.m23671c(str);
                interfaceC5660l2.mo542f(str);
            }
        }
        if (interfaceC5660l3 != null) {
            if (TextUtils.isEmpty(f28000f)) {
                m29296n(interfaceC5660l, null, interfaceC5660l3);
                return;
            } else {
                String str2 = f28000f;
                AbstractC5868k.m23671c(str2);
                interfaceC5660l3.mo542f(str2);
            }
        }
        if (!TextUtils.isEmpty(f27997c)) {
            if (interfaceC5660l != null) {
                String str3 = f27997c;
                AbstractC5868k.m23671c(str3);
                interfaceC5660l.mo542f(str3);
                return;
            }
            return;
        }
        if (f28003i >= f28004j) {
            String m29302F = m29302F();
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(m29302F);
                return;
            }
            return;
        }
        synchronized (this) {
            if (f28008n != 2) {
                String m29302F2 = f27995a.m29302F();
                if (interfaceC5660l != null) {
                    interfaceC5660l.mo542f(m29302F2);
                }
            } else {
                f28008n = 3;
                C1328x c1328x = C1328x.f4998a;
                m29297o(this, interfaceC5660l, null, null, 6, null);
            }
        }
    }

    /* renamed from: x */
    public final String m29317x(String str) {
        int m27734D;
        AbstractC5868k.m23674f(str, "email");
        m27734D = AbstractC7167u.m27734D(str, '@', 0, false, 6, null);
        if (m27734D != -1) {
            String substring = str.substring(m27734D);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return null;
    }

    /* renamed from: y */
    public final long m29318y() {
        return f28006l;
    }

    /* renamed from: z */
    public final String m29319z() {
        return f27999e;
    }
}
