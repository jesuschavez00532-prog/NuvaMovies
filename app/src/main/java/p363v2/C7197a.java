package p363v2;

import android.content.Context;
import be.C1318n;
import com.dcs.bean.Business;
import com.dcs.bean.DomainInfo;
import com.dcs.bean.LogResult;
import com.dcs.bean.N1Random;
import com.dcs.bean.URLInfo;
import com.dcs.bean.V1Result;
import com.google.gson.Gson;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.Dns;
import p035c3.AbstractC1346a;
import p035c3.C1351f;
import p035c3.C1352g;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p359ue.AbstractC7167u;
import p359ue.C7155i;
import p392x2.InterfaceC7491a;

/* renamed from: v2.a */
/* loaded from: classes.dex */
public final class C7197a {

    /* renamed from: A */
    private static String f26906A;

    /* renamed from: B */
    private static String f26907B;

    /* renamed from: C */
    private static ArrayList f26908C;

    /* renamed from: D */
    private static ArrayList f26909D;

    /* renamed from: E */
    private static String f26910E;

    /* renamed from: F */
    private static InterfaceC7491a f26911F;

    /* renamed from: G */
    private static Dns f26912G;

    /* renamed from: H */
    private static String f26913H;

    /* renamed from: I */
    private static String f26914I;

    /* renamed from: J */
    private static String f26915J;

    /* renamed from: K */
    private static String f26916K;

    /* renamed from: a */
    public static final C7197a f26917a;

    /* renamed from: b */
    private static final String f26918b;

    /* renamed from: c */
    public static Context f26919c;

    /* renamed from: d */
    private static C1318n f26920d;

    /* renamed from: e */
    private static String f26921e;

    /* renamed from: f */
    private static String f26922f;

    /* renamed from: g */
    private static String f26923g;

    /* renamed from: h */
    private static String f26924h;

    /* renamed from: i */
    private static String f26925i;

    /* renamed from: j */
    private static String f26926j;

    /* renamed from: k */
    private static String f26927k;

    /* renamed from: l */
    private static String f26928l;

    /* renamed from: m */
    private static String f26929m;

    /* renamed from: n */
    private static String f26930n;

    /* renamed from: o */
    private static String f26931o;

    /* renamed from: p */
    private static String f26932p;

    /* renamed from: q */
    private static String f26933q;

    /* renamed from: r */
    private static String f26934r;

    /* renamed from: s */
    private static String f26935s;

    /* renamed from: t */
    private static String f26936t;

    /* renamed from: u */
    private static String f26937u;

    /* renamed from: v */
    private static String f26938v;

    /* renamed from: w */
    private static String f26939w;

    /* renamed from: x */
    private static String f26940x;

    /* renamed from: y */
    private static String f26941y;

    /* renamed from: z */
    private static String f26942z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f26943a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f26944a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f26945a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f26946a = new d();

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f26947a = new e();

        e() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f26948a = new f();

        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f26949a = new g();

        g() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f26950a = new h();

        h() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f26951a = new i();

        i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f26952a = new j();

        j() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$k */
    /* loaded from: classes.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f26953a = new k();

        k() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final l f26954a = new l();

        l() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final m f26955a = new m();

        m() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$n */
    /* loaded from: classes.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f26956a = new n();

        n() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$o */
    /* loaded from: classes.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final o f26957a = new o();

        o() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$p */
    /* loaded from: classes.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final p f26958a = new p();

        p() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$q */
    /* loaded from: classes.dex */
    public static final class q extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final q f26959a = new q();

        q() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$r */
    /* loaded from: classes.dex */
    public static final class r extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final r f26960a = new r();

        r() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$s */
    /* loaded from: classes.dex */
    public static final class s extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final s f26961a = new s();

        s() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$t */
    /* loaded from: classes.dex */
    public static final class t extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final t f26962a = new t();

        t() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$u */
    /* loaded from: classes.dex */
    public static final class u extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final u f26963a = new u();

        u() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.a$v */
    /* loaded from: classes.dex */
    public static final class v extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final v f26964a = new v();

        v() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(URLInfo uRLInfo) {
            AbstractC5868k.m23674f(uRLInfo, "urlInfo");
            return uRLInfo.getUrl();
        }
    }

    static {
        C7197a c7197a = new C7197a();
        f26917a = c7197a;
        f26918b = c7197a.getClass().getSimpleName();
        f26920d = new C1318n("", "");
        f26921e = "";
        f26922f = "";
        f26923g = "";
        f26924h = "";
        f26925i = "";
        f26926j = "";
        f26927k = "";
        f26928l = "";
        f26929m = "";
        f26930n = "";
        f26931o = "";
        f26932p = "";
        f26933q = "";
        f26934r = "";
        f26935s = "";
        f26936t = "";
        f26937u = "";
        f26938v = "";
        f26939w = "";
        f26940x = "";
        f26941y = "";
        f26942z = "";
        f26906A = "";
        f26907B = "";
        f26908C = new ArrayList();
        f26909D = new ArrayList();
        f26910E = "";
        f26915J = "";
        f26916K = "";
    }

    private C7197a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* renamed from: p */
    private final String m27838p(String str, boolean z10) {
        switch (str.hashCode()) {
            case -1645935972:
                if (str.equals("key_short")) {
                    if (z10) {
                        return "log_15";
                    }
                    return "log_16";
                }
                return "";
            case -815137072:
                if (str.equals("key_ads")) {
                    if (z10) {
                        return "log_5";
                    }
                    return "log_6";
                }
                return "";
            case -815134220:
                if (str.equals("key_dcs")) {
                    if (z10) {
                        return "log_1";
                    }
                    return "log_2";
                }
                return "";
            case -815132868:
                if (str.equals("key_epg")) {
                    if (z10) {
                        return "log_7";
                    }
                    return "log_8";
                }
                return "";
            case -815118829:
                if (str.equals("key_tdc")) {
                    if (z10) {
                        return "log_11";
                    }
                    return "log_12";
                }
                return "";
            case 379051192:
                if (str.equals("key_notice")) {
                    if (z10) {
                        return "log_9";
                    }
                    return "log_10";
                }
                return "";
            case 436260428:
                if (str.equals("key_portal")) {
                    if (z10) {
                        return "log_3";
                    }
                    return "log_4";
                }
                return "";
            case 579894953:
                if (str.equals("key_update")) {
                    if (z10) {
                        return "log_13";
                    }
                    return "log_14";
                }
                return "";
            default:
                return "";
        }
    }

    /* renamed from: q */
    private final ArrayList m27839q(String str, boolean z10) {
        boolean z11 = false;
        List m27748R;
        String m6122a = C1352g.f5080a.m6122a(m27838p(str, z10));
        ArrayList arrayList = new ArrayList();
        if (m6122a.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m27748R = AbstractC7167u.m27748R(m6122a, new String[]{"|"}, false, 0, 6, null);
            arrayList.addAll(m27748R);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* renamed from: r */
    private final List m27840r(String str, boolean z10) {
        List m6985d;
        List m27748R;
        List m27748R2;
        List m27748R3;
        List m27748R4;
        List m27748R5;
        List m27748R6;
        List m27748R7;
        List m27748R8;
        List m27748R9;
        List m27748R10;
        List m27748R11;
        List m27748R12;
        List m27748R13;
        List m27748R14;
        List m27748R15;
        List m27748R16;
        switch (str.hashCode()) {
            case -1645935972:
                if (str.equals("key_short")) {
                    if (z10) {
                        m27748R2 = AbstractC7167u.m27748R(f26932p, new String[]{"|"}, false, 0, 6, null);
                        return m27748R2;
                    }
                    m27748R = AbstractC7167u.m27748R(f26906A, new String[]{"|"}, false, 0, 6, null);
                    return m27748R;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case -815137072:
                if (str.equals("key_ads")) {
                    if (z10) {
                        m27748R4 = AbstractC7167u.m27748R(f26923g, new String[]{"|"}, false, 0, 6, null);
                        return m27748R4;
                    }
                    m27748R3 = AbstractC7167u.m27748R(f26934r, new String[]{"|"}, false, 0, 6, null);
                    return m27748R3;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case -815134220:
                if (str.equals("key_dcs")) {
                    if (z10) {
                        m27748R6 = AbstractC7167u.m27748R(f26921e, new String[]{"|"}, false, 0, 6, null);
                        return m27748R6;
                    }
                    m27748R5 = AbstractC7167u.m27748R(f26922f, new String[]{"|"}, false, 0, 6, null);
                    return m27748R5;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case -815132868:
                if (str.equals("key_epg")) {
                    if (z10) {
                        m27748R8 = AbstractC7167u.m27748R(f26924h, new String[]{"|"}, false, 0, 6, null);
                        return m27748R8;
                    }
                    m27748R7 = AbstractC7167u.m27748R(f26935s, new String[]{"|"}, false, 0, 6, null);
                    return m27748R7;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case -815118829:
                if (str.equals("key_tdc")) {
                    if (z10) {
                        m27748R10 = AbstractC7167u.m27748R(f26926j, new String[]{"|"}, false, 0, 6, null);
                        return m27748R10;
                    }
                    m27748R9 = AbstractC7167u.m27748R(f26937u, new String[]{"|"}, false, 0, 6, null);
                    return m27748R9;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case 379051192:
                if (str.equals("key_notice")) {
                    if (z10) {
                        m27748R12 = AbstractC7167u.m27748R(f26925i, new String[]{"|"}, false, 0, 6, null);
                        return m27748R12;
                    }
                    m27748R11 = AbstractC7167u.m27748R(f26936t, new String[]{"|"}, false, 0, 6, null);
                    return m27748R11;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case 436260428:
                if (str.equals("key_portal")) {
                    if (z10) {
                        m27748R14 = AbstractC7167u.m27748R(f26928l, new String[]{"|"}, false, 0, 6, null);
                        return m27748R14;
                    }
                    m27748R13 = AbstractC7167u.m27748R(f26939w, new String[]{"|"}, false, 0, 6, null);
                    return m27748R13;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            case 579894953:
                if (str.equals("key_update")) {
                    if (z10) {
                        m27748R16 = AbstractC7167u.m27748R(f26927k, new String[]{"|"}, false, 0, 6, null);
                        return m27748R16;
                    }
                    m27748R15 = AbstractC7167u.m27748R(f26938v, new String[]{"|"}, false, 0, 6, null);
                    return m27748R15;
                }
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            default:
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
        }
    }

    /* renamed from: A */
    public final void m27841A(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f26916K = str;
    }

    /* renamed from: B */
    public final void m27842B(String str) {
        boolean z10 = false;
        N1Random n1Random;
        AbstractC5868k.m23674f(str, "result");
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (n1Random = (N1Random) new Gson().fromJson(str, N1Random.class)) != null) {
            f26914I = n1Random.getRandom();
        }
    }

    /* renamed from: C */
    public final void m27843C(String str) {
        f26913H = str;
    }

    /* renamed from: a */
    public final Context m27844a() {
        Context context = f26919c;
        if (context != null) {
            return context;
        }
        AbstractC5868k.m23686r("applicationContext");
        return null;
    }

    /* renamed from: b */
    public final DomainInfo m27845b(String str, String str2, String str3) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        AbstractC5868k.m23674f(str, "internalDomainMain");
        AbstractC5868k.m23674f(str2, "internalDomainSpare");
        AbstractC5868k.m23674f(str3, "domainKey");
        boolean z16 = true;
        List<String> m27840r = m27840r(str3, true);
        boolean z17 = false;
        List<String> m27840r2 = m27840r(str3, false);
        ArrayList m27839q = m27839q(str3, true);
        ArrayList m27839q2 = m27839q(str3, false);
        String str4 = "";
        String str5 = str4;
        for (String str6 : m27840r) {
            if (!m27839q.contains(str6)) {
                if (str4.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    str4 = str6;
                } else {
                    if (str5.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        str5 = str6;
                    }
                }
            }
        }
        if (str4.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (str5.length() != 0) {
                z16 = false;
            }
            if (z16) {
                str5 = str4;
            }
            return new DomainInfo(str4, str5, 2);
        }
        for (String str7 : m27840r2) {
            if (!m27839q2.contains(str7)) {
                if (str4.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    str4 = str7;
                } else {
                    if (str5.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        str5 = str7;
                    }
                }
            }
        }
        if (str4.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (str5.length() == 0) {
                z17 = true;
            }
            if (z17) {
                str5 = str4;
            }
            return new DomainInfo(str4, str5, 1);
        }
        String m27838p = m27838p(str3, true);
        String m27838p2 = m27838p(str3, false);
        C1352g c1352g = C1352g.f5080a;
        c1352g.m6123b(m27838p, "");
        c1352g.m6123b(m27838p2, "");
        return new DomainInfo(str, str2, 0);
    }

    /* renamed from: c */
    public final DomainInfo m27846c() {
        List m27748R;
        List<String> m27748R2;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        m27748R = AbstractC7167u.m27748R(f26921e, new String[]{"|"}, false, 0, 6, null);
        m27748R2 = AbstractC7167u.m27748R(f26922f, new String[]{"|"}, false, 0, 6, null);
        Iterator it = m27748R.iterator();
        String str = "";
        String str2 = str;
        while (true) {
            z10 = true;
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (!f26908C.contains(str3)) {
                if (str.length() == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    str = str3;
                } else {
                    if (str2.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        str2 = str3;
                    }
                }
            }
        }
        if (str.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (str2.length() != 0) {
                z10 = false;
            }
            if (z10) {
                str2 = str;
            }
            return new DomainInfo(str, str2, 2);
        }
        for (String str4 : m27748R2) {
            if (!f26909D.contains(str4)) {
                if (str.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    str = str4;
                } else {
                    if (str2.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        str2 = str4;
                    }
                }
            }
        }
        if (str.length() > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            if (str2.length() == 0) {
                z11 = true;
            }
            if (z11) {
                str2 = str;
            }
            return new DomainInfo(str, str2, 1);
        }
        C1352g c1352g = C1352g.f5080a;
        c1352g.m6123b("log_1", "");
        c1352g.m6123b("log_2", "");
        return new DomainInfo((String) f26920d.m5969c(), (String) f26920d.m5970d(), 0);
    }

    /* renamed from: d */
    public final String m27847d() {
        return f26916K;
    }

    /* renamed from: e */
    public final Context m27848e() {
        if (f26919c != null) {
            return m27844a();
        }
        return null;
    }

    /* renamed from: f */
    public final String m27849f() {
        return f26910E;
    }

    /* renamed from: g */
    public final InterfaceC7491a m27850g() {
        return f26911F;
    }

    /* renamed from: h */
    public final Dns m27851h() {
        return f26912G;
    }

    /* renamed from: i */
    public final String m27852i() {
        return f26915J;
    }

    /* renamed from: j */
    public final String m27853j() {
        return f26914I;
    }

    /* renamed from: k */
    public final String m27854k(String str) {
        String str2 = null;
        String str3 = null;
        boolean z10 = false;
        List<String> m27748R;
        boolean z11 = false;
        AbstractC5868k.m23674f(str, "domainKey");
        int hashCode = str.hashCode();
        if (hashCode != -1075513399) {
            if (hashCode != -154822152) {
                if (hashCode == 436290349 && str.equals("key_poster")) {
                    str2 = f26930n + '|' + f26941y;
                    str3 = str2;
                }
                str3 = "";
            } else {
                if (str.equals("key_subtitle")) {
                    str2 = f26931o + '|' + f26942z;
                    str3 = str2;
                }
                str3 = "";
            }
        } else {
            if (str.equals("key_appdownload")) {
                str2 = f26933q + '|' + f26907B;
                str3 = str2;
            }
            str3 = "";
        }
        if (str3.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m27748R = AbstractC7167u.m27748R(str3, new String[]{"|"}, false, 0, 6, null);
            for (String str4 : m27748R) {
                if (str4.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return str4;
                }
            }
        }
        return "";
    }

    /* renamed from: l */
    public final String m27855l() {
        return f26913H;
    }

    /* renamed from: m */
    public final boolean m27856m() {
        boolean z10 = false;
        boolean z11 = false;
        if (f26928l.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (f26939w.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void m27857n(Context context, C1318n c1318n, InterfaceC7491a interfaceC7491a, Dns dns) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c1318n, "dcsInternalDomain");
        Context applicationContext = context.getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "context.applicationContext");
        m27866z(applicationContext);
        f26920d = c1318n;
        f26911F = interfaceC7491a;
        f26912G = dns;
        m27859s();
    }

    /* renamed from: o */
    public final void m27858o(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Context applicationContext = context.getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "context.applicationContext");
        m27866z(applicationContext);
    }

    /* renamed from: s */
    public final void m27859s() {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        List m27748R;
        List m27748R2;
        f26910E = "";
        C1352g c1352g = C1352g.f5080a;
        String m6122a = c1352g.m6122a("log");
        boolean z13 = true;
        if (m6122a.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f26910E = C1351f.f5079a.m6121a(m6122a);
            LogResult logResult = (LogResult) new Gson().fromJson(m6122a, LogResult.class);
            if (logResult != null) {
                m27864x(logResult);
            }
        }
        f26915J = "";
        String m6122a2 = c1352g.m6122a("n1_log");
        if (m6122a2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f26915J = C1351f.f5079a.m6121a(m6122a2);
            m27842B(m6122a2);
        }
        String m6122a3 = c1352g.m6122a("log_1");
        String m6122a4 = c1352g.m6122a("log_2");
        if (m6122a3.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            f26908C.clear();
            ArrayList arrayList = f26908C;
            m27748R2 = AbstractC7167u.m27748R(m6122a3, new String[]{"|"}, false, 0, 6, null);
            arrayList.addAll(m27748R2);
        }
        if (m6122a4.length() <= 0) {
            z13 = false;
        }
        if (z13) {
            f26909D.clear();
            ArrayList arrayList2 = f26909D;
            m27748R = AbstractC7167u.m27748R(m6122a4, new String[]{"|"}, false, 0, 6, null);
            arrayList2.addAll(m27748R);
        }
    }

    /* renamed from: t */
    public final void m27860t(DomainInfo domainInfo, String str) {
        String m7011w = null;
        String m7011w2 = null;
        AbstractC5868k.m23674f(domainInfo, "domainInfo");
        AbstractC5868k.m23674f(str, "domainKey");
        String m27838p = m27838p(str, true);
        String m27838p2 = m27838p(str, false);
        int domainType = domainInfo.getDomainType();
        if (domainType != 1) {
            if (domainType == 2) {
                ArrayList m27839q = m27839q(str, true);
                m27839q.add(domainInfo.getFirst());
                m27839q.add(domainInfo.getSecond());
                if (m27839q.size() < 10) {
                    m7011w2 = AbstractC1508t.m7011w(m27839q, "|", null, null, 0, null, null, 62, null);
                    C1352g.f5080a.m6124c(m27838p, m7011w2);
                    return;
                } else {
                    C1352g.f5080a.m6123b(m27838p, "");
                    return;
                }
            }
            return;
        }
        ArrayList m27839q2 = m27839q(str, false);
        m27839q2.add(domainInfo.getFirst());
        m27839q2.add(domainInfo.getSecond());
        if (m27839q2.size() < 10) {
            m7011w = AbstractC1508t.m7011w(m27839q2, "|", null, null, 0, null, null, 62, null);
            C1352g.f5080a.m6124c(m27838p2, m7011w);
        } else {
            C1352g.f5080a.m6123b(m27838p2, "");
        }
    }

    /* renamed from: u */
    public final void m27861u(V1Result v1Result) {
        boolean z10 = false;
        AbstractC5868k.m23674f(v1Result, "v1Result");
        String log = v1Result.getLog();
        if (log != null && log.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        C1352g.f5080a.m6123b("n1_log", v1Result.getLog());
        m27865y(v1Result.getLog());
    }

    /* renamed from: v */
    public final void m27862v(String str, String str2, int i10) {
        String m7011w = null;
        String m7011w2 = null;
        AbstractC5868k.m23674f(str, "mainUrl");
        AbstractC5868k.m23674f(str2, "spareUrl");
        if (i10 != 1) {
            if (i10 == 2) {
                f26908C.add(str);
                f26908C.add(str2);
                if (f26908C.size() < 30) {
                    m7011w2 = AbstractC1508t.m7011w(f26908C, "|", null, null, 0, null, null, 62, null);
                    C1352g.f5080a.m6124c("log_1", m7011w2);
                    return;
                } else {
                    C1352g.f5080a.m6123b("log_1", "");
                    return;
                }
            }
            return;
        }
        f26909D.add(str);
        f26909D.add(str2);
        if (f26909D.size() < 30) {
            m7011w = AbstractC1508t.m7011w(f26909D, "|", null, null, 0, null, null, 62, null);
            C1352g.f5080a.m6124c("log_2", m7011w);
        } else {
            C1352g.f5080a.m6123b("log_2", "");
        }
    }

    /* renamed from: w */
    public final void m27863w(V1Result v1Result) {
        boolean z10 = false;
        LogResult logResult;
        AbstractC5868k.m23674f(v1Result, "v1Result");
        String log = v1Result.getLog();
        boolean z11 = false;
        if (log != null && log.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        C1352g.f5080a.m6123b("log", v1Result.getLog());
        String m6112a = AbstractC1346a.m6112a(v1Result.getLog());
        AbstractC5868k.m23673e(m6112a, "domain");
        if (m6112a.length() > 0) {
            z11 = true;
        }
        if (z11 && (logResult = (LogResult) new Gson().fromJson(m6112a, LogResult.class)) != null) {
            m27864x(logResult);
        }
    }

    /* renamed from: x */
    public final void m27864x(LogResult logResult) {
        boolean z10 = false;
        Object obj = null;
        boolean z11 = false;
        CharSequence m27758b0;
        CharSequence m27758b02;
        CharSequence m27758b03;
        CharSequence m27758b04;
        CharSequence m27758b05;
        CharSequence m27758b06;
        CharSequence m27758b07;
        CharSequence m27758b08;
        CharSequence m27758b09;
        CharSequence m27758b010;
        CharSequence m27758b011;
        String str = null;
        Object obj2 = null;
        String m7011w = null;
        String m7011w2 = null;
        String m7011w3 = null;
        String m7011w4 = null;
        String m7011w5 = null;
        String m7011w6 = null;
        String m7011w7 = null;
        String m7011w8 = null;
        String m7011w9 = null;
        String m7011w10 = null;
        String m7011w11 = null;
        CharSequence m27758b012;
        CharSequence m27758b013;
        CharSequence m27758b014;
        CharSequence m27758b015;
        CharSequence m27758b016;
        CharSequence m27758b017;
        CharSequence m27758b018;
        CharSequence m27758b019;
        CharSequence m27758b020;
        CharSequence m27758b021;
        CharSequence m27758b022;
        String m7011w12 = null;
        String m7011w13 = null;
        String m7011w14 = null;
        String m7011w15 = null;
        String m7011w16 = null;
        String m7011w17 = null;
        String m7011w18 = null;
        String m7011w19 = null;
        String m7011w20 = null;
        String m7011w21 = null;
        String m7011w22 = null;
        AbstractC5868k.m23674f(logResult, "logResult");
        ArrayList<Business> group = logResult.getGroup();
        if (group != null && !group.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str2 = "app-download";
        if (z10) {
            obj = "subtitle";
        } else {
            ArrayList<Business> group2 = logResult.getGroup();
            AbstractC5868k.m23671c(group2);
            Iterator it = group2.iterator();
            while (it.hasNext()) {
                Business business = (Business) it.next();
                Iterator it2 = it;
                String business_entry = business.getBusiness_entry();
                switch (business_entry.hashCode()) {
                    case -2060497896:
                        if (!business_entry.equals("subtitle")) {
                            break;
                        } else {
                            m7011w12 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, k.f26953a, 30, null);
                            f26931o = m7011w12;
                            break;
                        }
                    case -1281194706:
                        if (!business_entry.equals("check-update")) {
                            break;
                        } else {
                            m7011w13 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, g.f26949a, 30, null);
                            f26927k = m7011w13;
                            break;
                        }
                    case -1039690024:
                        if (!business_entry.equals("notice")) {
                            break;
                        } else {
                            m7011w14 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, e.f26947a, 30, null);
                            f26925i = m7011w14;
                            break;
                        }
                    case -982480788:
                        if (!business_entry.equals("portal")) {
                            break;
                        } else {
                            m7011w15 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, h.f26950a, 30, null);
                            f26928l = m7011w15;
                            break;
                        }
                    case -982450867:
                        if (!business_entry.equals("poster")) {
                            break;
                        } else {
                            m7011w16 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, j.f26952a, 30, null);
                            f26930n = m7011w16;
                            break;
                        }
                    case 96432:
                        if (!business_entry.equals("ads")) {
                            break;
                        } else {
                            m7011w17 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, c.f26945a, 30, null);
                            f26923g = m7011w17;
                            break;
                        }
                    case 99284:
                        if (!business_entry.equals("dcs")) {
                            break;
                        } else {
                            m7011w18 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, i.f26951a, 30, null);
                            f26929m = m7011w18;
                            break;
                        }
                    case 100636:
                        if (!business_entry.equals("epg")) {
                            break;
                        } else {
                            m7011w19 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, d.f26946a, 30, null);
                            f26924h = m7011w19;
                            break;
                        }
                    case 114675:
                        if (!business_entry.equals("tdc")) {
                            break;
                        } else {
                            m7011w20 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, f.f26948a, 30, null);
                            f26926j = m7011w20;
                            break;
                        }
                    case 109413500:
                        if (!business_entry.equals("short")) {
                            break;
                        } else {
                            m7011w21 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, a.f26943a, 30, null);
                            f26932p = m7011w21;
                            break;
                        }
                    case 1403102900:
                        if (!business_entry.equals("app-download")) {
                            break;
                        } else {
                            m7011w22 = AbstractC1508t.m7011w(business.getDetails(), "|", null, null, 0, null, b.f26944a, 30, null);
                            f26933q = m7011w22;
                            break;
                        }
                }
                it = it2;
            }
            obj = "subtitle";
            m27758b012 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26923g, ""));
            f26923g = m27758b012.toString();
            m27758b013 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26924h, ""));
            f26924h = m27758b013.toString();
            m27758b014 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26925i, ""));
            f26925i = m27758b014.toString();
            m27758b015 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26926j, ""));
            f26926j = m27758b015.toString();
            m27758b016 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26927k, ""));
            f26927k = m27758b016.toString();
            m27758b017 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26928l, ""));
            f26928l = m27758b017.toString();
            m27758b018 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26929m, ""));
            f26929m = m27758b018.toString();
            m27758b019 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26930n, ""));
            f26930n = m27758b019.toString();
            m27758b020 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26931o, ""));
            f26931o = m27758b020.toString();
            m27758b021 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26932p, ""));
            f26932p = m27758b021.toString();
            m27758b022 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26933q, ""));
            f26933q = m27758b022.toString();
            String str3 = f26929m + "|" + f26928l + "|" + f26923g + "|" + f26924h + "|" + f26925i + "|";
            AbstractC5868k.m23673e(str3, "stringBuilder.toString()");
            f26921e = str3;
        }
        ArrayList<Business> global = logResult.getGlobal();
        if (global != null && !global.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            ArrayList<Business> global2 = logResult.getGlobal();
            AbstractC5868k.m23671c(global2);
            Iterator it3 = global2.iterator();
            while (it3.hasNext()) {
                Business business2 = (Business) it3.next();
                Iterator it4 = it3;
                String business_entry2 = business2.getBusiness_entry();
                switch (business_entry2.hashCode()) {
                    case -2060497896:
                        str = str2;
                        obj2 = obj;
                        if (!business_entry2.equals(obj2)) {
                            break;
                        } else {
                            m7011w = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, v.f26964a, 30, null);
                            f26942z = m7011w;
                            continue;
                        }
                    case -1281194706:
                        if (business_entry2.equals("check-update")) {
                            m7011w2 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, r.f26960a, 30, null);
                            f26938v = m7011w2;
                            break;
                        }
                        break;
                    case -1039690024:
                        if (business_entry2.equals("notice")) {
                            m7011w3 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, p.f26958a, 30, null);
                            f26936t = m7011w3;
                            break;
                        }
                        break;
                    case -982480788:
                        if (business_entry2.equals("portal")) {
                            m7011w4 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, s.f26961a, 30, null);
                            f26939w = m7011w4;
                            break;
                        }
                        break;
                    case -982450867:
                        if (business_entry2.equals("poster")) {
                            m7011w5 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, u.f26963a, 30, null);
                            f26941y = m7011w5;
                            break;
                        }
                        break;
                    case 96432:
                        if (business_entry2.equals("ads")) {
                            m7011w6 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, n.f26956a, 30, null);
                            f26934r = m7011w6;
                            break;
                        }
                        break;
                    case 99284:
                        if (business_entry2.equals("dcs")) {
                            m7011w7 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, t.f26962a, 30, null);
                            f26940x = m7011w7;
                            break;
                        }
                        break;
                    case 100636:
                        if (business_entry2.equals("epg")) {
                            m7011w8 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, o.f26957a, 30, null);
                            f26935s = m7011w8;
                            break;
                        }
                        break;
                    case 114675:
                        if (business_entry2.equals("tdc")) {
                            m7011w9 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, q.f26959a, 30, null);
                            f26937u = m7011w9;
                            break;
                        }
                        break;
                    case 109413500:
                        if (business_entry2.equals("short")) {
                            m7011w10 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, l.f26954a, 30, null);
                            f26906A = m7011w10;
                            break;
                        }
                        break;
                    case 1403102900:
                        if (business_entry2.equals(str2)) {
                            m7011w11 = AbstractC1508t.m7011w(business2.getDetails(), "|", null, null, 0, null, m.f26955a, 30, null);
                            f26907B = m7011w11;
                            break;
                        }
                        break;
                }
                str = str2;
                obj2 = obj;
                it3 = it4;
                obj = obj2;
                str2 = str;
            }
            m27758b0 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26934r, ""));
            f26934r = m27758b0.toString();
            m27758b02 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26935s, ""));
            f26935s = m27758b02.toString();
            m27758b03 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26936t, ""));
            f26936t = m27758b03.toString();
            m27758b04 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26937u, ""));
            f26937u = m27758b04.toString();
            m27758b05 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26938v, ""));
            f26938v = m27758b05.toString();
            m27758b06 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26939w, ""));
            f26939w = m27758b06.toString();
            m27758b07 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26940x, ""));
            f26940x = m27758b07.toString();
            m27758b08 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26941y, ""));
            f26941y = m27758b08.toString();
            m27758b09 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26942z, ""));
            f26942z = m27758b09.toString();
            m27758b010 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26906A, ""));
            f26906A = m27758b010.toString();
            m27758b011 = AbstractC7167u.m27758b0(new C7155i("https?://").m27679c(f26907B, ""));
            f26907B = m27758b011.toString();
            String str4 = f26940x + "|" + f26939w + "|" + f26934r + "|" + f26935s + "|" + f26936t + "|";
            AbstractC5868k.m23673e(str4, "stringBuilder.toString()");
            f26922f = str4;
        }
    }

    /* renamed from: y */
    public final void m27865y(String str) {
        boolean z10 = false;
        N1Random n1Random;
        AbstractC5868k.m23674f(str, "result");
        String m6112a = AbstractC1346a.m6112a(str);
        AbstractC5868k.m23673e(m6112a, "domain");
        if (m6112a.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (n1Random = (N1Random) new Gson().fromJson(m6112a, N1Random.class)) != null) {
            f26914I = n1Random.getRandom();
        }
    }

    /* renamed from: z */
    public final void m27866z(Context context) {
        AbstractC5868k.m23674f(context, "<set-?>");
        f26919c = context;
    }
}
