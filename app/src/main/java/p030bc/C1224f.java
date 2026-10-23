package p030bc;

import android.content.Context;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1468n0;
import cc.C1446c0;
import cc.C1461k;
import cc.C1466m0;
import com.lzy.okgo.model.Progress;
import com.request.bean.ActiveBean;
import com.request.bean.AddFavoriteBean;
import com.request.bean.AddSubscribeBean;
import com.request.bean.ApkQueryCouponBean;
import com.request.bean.ApkReceiveCouponBean;
import com.request.bean.BlSearchByContentBean;
import com.request.bean.ConfigBean;
import com.request.bean.DelFavoriteBean;
import com.request.bean.DelSubscribeBean;
import com.request.bean.DeleteDevicesBean;
import com.request.bean.EpgBean;
import com.request.bean.FilterByContentBean;
import com.request.bean.FilterGenreBean;
import com.request.bean.ForceBindBean;
import com.request.bean.FreeTimeBean;
import com.request.bean.GetAuthInfoBean;
import com.request.bean.GetColumnContentsBean;
import com.request.bean.GetDevicesBean;
import com.request.bean.GetExchangeOrderInfoBean;
import com.request.bean.GetFavoritesBean;
import com.request.bean.GetInviteCodeBean;
import com.request.bean.GetItemDataBean;
import com.request.bean.GetLiveDataBean;
import com.request.bean.GetNextColumnBean;
import com.request.bean.GetOrderInfoBean;
import com.request.bean.GetPackageBean;
import com.request.bean.GetPersonBean;
import com.request.bean.GetRecommendsBean;
import com.request.bean.GetSubscribeBean;
import com.request.bean.HeartBeatBean;
import com.request.bean.ItemByPersonBean;
import com.request.bean.LiveSearchBean;
import com.request.bean.LoginBean;
import com.request.bean.PasswordCheckBean;
import com.request.bean.PasswordSetBean;
import com.request.bean.RestrictedStatusBean;
import com.request.bean.SearchByContentBean;
import com.request.bean.SearchByNameBean;
import com.request.bean.SearchROrPBean;
import com.request.bean.SnTokenBean;
import com.request.bean.StartPlayBTVBean;
import com.request.bean.StartPlayLiveBean;
import com.request.bean.StartPlayVODBean;
import com.request.bean.TerminalAuthBean;
import com.request.bean.UpdateDeviceTokenBean;
import com.request.bean.UpdatePwdBean;
import com.request.bean.UserFeedBackBean;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import java.util.List;
import java.util.Locale;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p041c9.AbstractC1438g;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5093j;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import retrofit2.Call;

/* renamed from: bc.f */
/* loaded from: classes.dex */
public final class C1224f {

    /* renamed from: e */
    public static final b f4816e = new b(null);

    /* renamed from: f */
    private static final InterfaceC1312h f4817f;

    /* renamed from: a */
    private String f4818a = "";

    /* renamed from: b */
    private String f4819b = "";

    /* renamed from: c */
    private String f4820c = "";

    /* renamed from: d */
    private C1293z1 f4821d = new C1293z1();

    /* renamed from: bc.f$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f4822a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1224f invoke() {
            return new C1224f();
        }
    }

    /* renamed from: bc.f$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C1224f m5630b() {
            return (C1224f) C1224f.f4817f.getValue();
        }

        /* renamed from: a */
        public final C1224f m5631a() {
            return m5630b();
        }

        /* renamed from: c */
        public final boolean m5632c() {
            if (AbstractC6567a.m25637g(m5630b().m5566O()) && AbstractC6567a.m25637g(m5630b().m5567P()) && AbstractC6567a.m25637g(m5630b().m5565N())) {
                return true;
            }
            return false;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f4822a);
        f4817f = m5965b;
    }

    /* renamed from: A */
    public final Observable m5548A(Integer num, String str, int i10, Integer num2, Integer num3, String str2, String str3) {
        AbstractC5868k.m23674f(str3, "schedulerType");
        return this.f4821d.m5877t1(new GetColumnContentsBean(m5567P(), m5566O(), m5565N(), num, str, i10, num2, num3, str2), str3);
    }

    /* renamed from: A0 */
    public final Observable m5549A0(String str, String str2) {
        AbstractC5868k.m23674f(str, "password");
        AbstractC5868k.m23674f(str2, "newPwd");
        return this.f4821d.m5865k3(new UpdatePwdBean(m5567P(), m5566O(), str, str2));
    }

    /* renamed from: B */
    public final Observable m5550B() {
        return this.f4821d.m5879v1(new ConfigBean("ApkConfig", C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a())));
    }

    /* renamed from: B0 */
    public final Observable m5551B0(String str) {
        AbstractC5868k.m23674f(str, Progress.STATUS);
        return this.f4821d.m5868m3(new RestrictedStatusBean(m5567P(), m5566O(), str));
    }

    /* renamed from: C */
    public final Observable m5552C(String str) {
        AbstractC5868k.m23674f(str, "temToken");
        return this.f4821d.m5881x1(new GetDevicesBean(str, C1461k.f5605a.m6807g()));
    }

    /* renamed from: C0 */
    public final Observable m5553C0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userSug");
        AbstractC5868k.m23674f(str3, "email");
        AbstractC5868k.m23674f(str4, "mobile");
        AbstractC5868k.m23674f(str5, "appVersion");
        AbstractC5868k.m23674f(str6, "pkg");
        AbstractC5868k.m23674f(str7, "userName");
        AbstractC5868k.m23674f(str8, "sysVersion");
        AbstractC5868k.m23674f(str9, "programName");
        AbstractC5868k.m23674f(str10, "customer");
        return this.f4821d.m5872o3(new UserFeedBackBean(str, str2, str3, str4, str5, str6, "tv", str7, str8, str9, "", str10, m5566O()));
    }

    /* renamed from: D */
    public final Observable m5554D() {
        return this.f4821d.m5884z1();
    }

    /* renamed from: D0 */
    public final Observable m5555D0(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "verifyCode");
        return this.f4821d.m5874q3(str2, str, str3, m5567P(), m5566O());
    }

    /* renamed from: E */
    public final Observable m5556E() {
        return this.f4821d.m5811C1(new GetExchangeOrderInfoBean(m5566O(), m5567P()));
    }

    /* renamed from: F */
    public final Observable m5557F(String str, boolean z10) {
        String str2 = null;
        AbstractC5868k.m23674f(str, "queryType");
        C1293z1 c1293z1 = this.f4821d;
        String m5567P = m5567P();
        String m5566O = m5566O();
        if (z10) {
            str2 = "1";
        } else {
            str2 = MessageService.MSG_DB_READY_REPORT;
        }
        return c1293z1.m5814E1(new GetFavoritesBean(m5567P, m5566O, str, str2));
    }

    /* renamed from: G */
    public final Observable m5558G(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, Progress.DATE);
        String mo19960i = C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a());
        C1293z1 c1293z1 = this.f4821d;
        String language = Locale.getDefault().getLanguage();
        AbstractC5868k.m23673e(language, "getDefault().language");
        return c1293z1.m5816G1(mo19960i, str, str2, str3, language);
    }

    /* renamed from: H */
    public final Observable m5559H() {
        return this.f4821d.m5819H1(new FreeTimeBean(m5567P(), m5566O(), m5565N()));
    }

    /* renamed from: I */
    public final Observable m5560I() {
        return this.f4821d.m5822J1(new GetInviteCodeBean(m5566O(), m5567P()));
    }

    /* renamed from: J */
    public final Observable m5561J(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "puId");
        AbstractC5868k.m23674f(str2, "type");
        String m5565N = m5565N();
        String m5567P = m5567P();
        String m5566O = m5566O();
        String m20676h = AbstractC5093j.m20676h(AbstractApplicationC6253c.f24484b.m24887a());
        AbstractC5868k.m23673e(m20676h, "getMacAddr(BaseApp.context)");
        return this.f4821d.m5825L1(new ItemByPersonBean(m5565N, m5567P, m5566O, str, str2, m20676h, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* renamed from: K */
    public final Observable m5562K(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "type");
        C1293z1 c1293z1 = this.f4821d;
        String m5567P = m5567P();
        String m5566O = m5566O();
        String m5565N = m5565N();
        String str4 = AbstractC5091h.m20658a().f20976a;
        String m20676h = AbstractC5093j.m20676h(AbstractApplicationC6253c.f24484b.m24887a());
        AbstractC5868k.m23673e(m20676h, "getMacAddr(BaseApp.context)");
        return c1293z1.m5828N1(new GetItemDataBean(m5567P, m5566O, m5565N, str, str2, str3, str4, m20676h));
    }

    /* renamed from: L */
    public final Observable m5563L(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        return this.f4821d.m5831P1(str);
    }

    /* renamed from: M */
    public final Observable m5564M(int i10, String str, String str2) {
        AbstractC5868k.m23674f(str, "dataVersion");
        AbstractC5868k.m23674f(str2, "expireTimeStr");
        return this.f4821d.m5832Q1(new GetLiveDataBean(m5567P(), m5566O(), m5565N(), i10, str, 3000, 1, str2));
    }

    /* renamed from: N */
    public final String m5565N() {
        return C1466m0.f5627a.m6874k();
    }

    /* renamed from: O */
    public final String m5566O() {
        return C1466m0.f5627a.m6878m();
    }

    /* renamed from: P */
    public final String m5567P() {
        return C1466m0.f5627a.m6879n();
    }

    /* renamed from: Q */
    public final Observable m5568Q(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        return this.f4821d.m5835S1(str);
    }

    /* renamed from: R */
    public final Observable m5569R(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "matchName");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        return this.f4821d.m5838T1(str, str2, str3);
    }

    /* renamed from: S */
    public final Observable m5570S(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        return this.f4821d.m5839U1(str, str2, str3);
    }

    /* renamed from: T */
    public final Observable m5571T(int i10, Integer num, String str, String str2) {
        AbstractC5868k.m23674f(str, "columnCode");
        AbstractC5868k.m23674f(str2, "version");
        return this.f4821d.m5842V1(new GetNextColumnBean(m5566O(), m5567P(), m5565N(), i10, num, str, str2));
    }

    /* renamed from: U */
    public final Observable m5572U() {
        return this.f4821d.m5843W1(new GetOrderInfoBean(m5567P(), m5566O()));
    }

    /* renamed from: V */
    public final Observable m5573V(String str, String str2) {
        AbstractC5868k.m23674f(str, "packageType");
        AbstractC5868k.m23674f(str2, "appVersion");
        return this.f4821d.m5846Y1(new GetPackageBean(m5567P(), m5566O(), str, str2));
    }

    /* renamed from: W */
    public final Observable m5574W(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "imdb");
        AbstractC5868k.m23674f(str3, "type");
        String m5567P = m5567P();
        String m5566O = m5566O();
        String m20676h = AbstractC5093j.m20676h(AbstractApplicationC6253c.f24484b.m24887a());
        AbstractC5868k.m23673e(m20676h, "getMacAddr(BaseApp.context)");
        return this.f4821d.m5849a2(new GetPersonBean(m5567P, m5566O, str, str2, str3, m20676h));
    }

    /* renamed from: X */
    public final Observable m5575X(String str, int i10) {
        AbstractC5868k.m23674f(str, "channelCode");
        return this.f4821d.m5808A1(new EpgBean(m5565N(), str, i10, "2", m5567P(), m5566O()));
    }

    /* renamed from: Y */
    public final Observable m5576Y(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "qrToken");
        return this.f4821d.m5852c2(str, str2);
    }

    /* renamed from: Z */
    public final Observable m5577Z(String str) {
        AbstractC5868k.m23674f(str, "type");
        return this.f4821d.m5855e2(str, m5567P(), m5566O());
    }

    /* renamed from: a0 */
    public final Observable m5578a0(Integer num, String str, int i10, Integer num2, Integer num3, String str2) {
        return this.f4821d.m5860g2(m5567P(), m5566O(), m5565N(), num, str, i10, num2, num3, str2);
    }

    /* renamed from: b */
    public final Observable m5579b(String str, String str2, String str3, int i10, String str4) {
        boolean z10 = false;
        String str5 = null;
        AbstractC5868k.m23674f(str4, "schedulerType");
        C1466m0 c1466m0 = C1466m0.f5627a;
        String m6884s = c1466m0.m6884s();
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        String m20676h = AbstractC5093j.m20676h(aVar.m24887a());
        String str6 = (String) c1466m0.m6872j("KEY_APP_CHANNEL", "");
        if (str6.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String m6698b = AbstractC1438g.m6698b(aVar.m24887a());
            if (m6698b == null) {
                m6698b = "default";
            }
            c1466m0.m6843P("KEY_APP_CHANNEL", m6698b);
            str5 = m6698b;
        } else {
            str5 = str6;
        }
        String m6881p = c1466m0.m6881p();
        String m6886u = c1466m0.m6886u();
        AbstractC5868k.m23673e(m20676h, "macAddr");
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        return this.f4821d.m5880w0(new ActiveBean(m6884s, str, str2, str3, m20676h, m6896d, i10, str5, m6881p, m6886u), str4);
    }

    /* renamed from: b0 */
    public final Observable m5580b0(String[] strArr, String str) {
        AbstractC5868k.m23674f(strArr, "recommendCodeArr");
        AbstractC5868k.m23674f(str, "schedulerType");
        return this.f4821d.m5862i2(new GetRecommendsBean(m5567P(), m5566O(), m5565N(), strArr), str);
    }

    /* renamed from: c */
    public final Observable m5581c(String str, List list, boolean z10) {
        String str2 = null;
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(list, "contentId");
        C1293z1 c1293z1 = this.f4821d;
        String m5567P = m5567P();
        String m5566O = m5566O();
        if (z10) {
            str2 = "1";
        } else {
            str2 = MessageService.MSG_DB_READY_REPORT;
        }
        return c1293z1.m5883z0(new AddFavoriteBean(str, list, m5567P, m5566O, str2));
    }

    /* renamed from: c0 */
    public final Observable m5582c0(int i10, String str, int i11, int i12, Integer num, int i13) {
        AbstractC5868k.m23674f(str, "columnType");
        return this.f4821d.m5866l2(m5567P(), m5566O(), m5565N(), i10, str, i11, i12, num, i13);
    }

    /* renamed from: d */
    public final Observable m5583d(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "contentId");
        return this.f4821d.m5809B0(new AddSubscribeBean(m5567P(), m5566O(), str, str2));
    }

    /* renamed from: d0 */
    public final Observable m5584d0() {
        return this.f4821d.m5869n2(C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a()));
    }

    /* renamed from: e */
    public final Observable m5585e(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "isAllow");
        AbstractC5868k.m23674f(str3, "qrToken");
        return this.f4821d.m5812D0(str, m5567P(), m5566O(), str3, str2);
    }

    /* renamed from: e0 */
    public final Observable m5586e0(String str, String str2, String[] strArr, String str3, String str4) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "identity");
        return C1293z1.m5776p2(this.f4821d, m5567P(), m5566O(), m5565N(), str3, str4, str, AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a()) + "", str2, strArr, null, 512, null);
    }

    /* renamed from: f */
    public final Observable m5587f(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return this.f4821d.m5815F0(new ApkQueryCouponBean(str, str2, str3, str4));
    }

    /* renamed from: f0 */
    public final Observable m5588f0(String str, String str2, String[] strArr, String str3, String str4) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        AbstractC5868k.m23674f(str3, "hasPay");
        AbstractC5868k.m23674f(str4, "identity");
        return C1293z1.m5788s2(this.f4821d, m5567P(), m5566O(), m5565N(), str3, str4, str, AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a()) + "", str2, strArr, null, 512, null);
    }

    /* renamed from: g */
    public final Observable m5589g(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return this.f4821d.m5818H0(new ApkReceiveCouponBean(str, str2));
    }

    /* renamed from: g0 */
    public final Observable m5590g0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C1293z1 c1293z1 = this.f4821d;
        C1446c0 c1446c0 = C1446c0.f5559a;
        return c1293z1.m5878u2(new SnTokenBean(c1446c0.m6741j(context), c1446c0.m6752y(context), c1446c0.m6745p(), c1446c0.m6751w(), c1446c0.m6743l(), c1446c0.m6749u(context), c1446c0.m6750v(context), c1446c0.m6746q(), c1446c0.m6742k(), null, null, null, null, null, null, null, null, null, null, null, 1048064, null));
    }

    /* renamed from: h */
    public final Observable m5591h(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "pwd");
        return this.f4821d.m5821J0(m5567P(), m5566O(), str3, str, str2);
    }

    /* renamed from: h0 */
    public final Observable m5592h0(String str) {
        return this.f4821d.m5882x2(new GetSubscribeBean(m5567P(), m5566O(), str));
    }

    /* renamed from: i */
    public final Observable m5593i() {
        return this.f4821d.m5824L0(m5567P(), m5566O());
    }

    /* renamed from: i0 */
    public final Observable m5594i0(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        return this.f4821d.m5885z2(str, str2, str3, m5567P(), m5566O());
    }

    /* renamed from: j */
    public final Observable m5595j(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        return this.f4821d.m5827N0(str, str2, str3, str4, m5566O(), m5567P());
    }

    /* renamed from: j0 */
    public final Observable m5596j0() {
        return this.f4821d.m5810B2(new HeartBeatBean(m5567P(), m5566O()));
    }

    /* renamed from: k */
    public final Observable m5597k(String str, String str2, String str3, int i10, int i11, String str4) {
        AbstractC5868k.m23674f(str2, "value");
        AbstractC5868k.m23674f(str3, "type");
        return this.f4821d.m5830P0(new SearchByNameBean(m5567P(), m5566O(), m5565N(), str, str2, str3, Integer.valueOf(i10), Integer.valueOf(i11), str4));
    }

    /* renamed from: k0 */
    public final Observable m5598k0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10 = false;
        String str9 = null;
        LoginBean loginBean;
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "userName");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str8, "schedulerType");
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        String m20676h = AbstractC5093j.m20676h(aVar.m24887a());
        C1466m0 c1466m0 = C1466m0.f5627a;
        String m6881p = c1466m0.m6881p();
        String m6886u = c1466m0.m6886u();
        String str10 = (String) c1466m0.m6872j("KEY_APP_CHANNEL", "");
        if (str10.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String m6698b = AbstractC1438g.m6698b(aVar.m24887a());
            if (m6698b == null) {
                m6698b = "default";
            }
            c1466m0.m6843P("KEY_APP_CHANNEL", m6698b);
            str9 = m6698b;
        } else {
            str9 = str10;
        }
        if (AbstractC5868k.m23669a(str4, MessageService.MSG_DB_READY_REPORT)) {
            AbstractC5868k.m23673e(m20676h, "macAddr");
            loginBean = new LoginBean(str, str2, str3, str4, m20676h, str5, str6, str7, m6881p, m6886u, m5567P(), str9);
        } else {
            AbstractC5868k.m23673e(m20676h, "macAddr");
            loginBean = new LoginBean(str, str2, str3, str4, m20676h, str5, str6, str7, m6881p, m6886u, null, str9);
        }
        return this.f4821d.m5813D2(loginBean, str8);
    }

    /* renamed from: l */
    public final Observable m5599l(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "verifyCode");
        return this.f4821d.m5834R0(str, str2, str3, m5567P(), m5566O());
    }

    /* renamed from: l0 */
    public final Observable m5600l0(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return this.f4821d.m5817G2(str, str2);
    }

    /* renamed from: m */
    public final Observable m5601m(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "loginType");
        return this.f4821d.m5837T0(str, str2, str3, m5567P(), m5566O(), str4);
    }

    /* renamed from: m0 */
    public final Observable m5602m0(String str) {
        AbstractC5868k.m23674f(str, "pwd");
        return this.f4821d.m5820I2(new PasswordCheckBean(m5567P(), m5566O(), str));
    }

    /* renamed from: n */
    public final Observable m5603n() {
        return this.f4821d.m5841V0(new ForceBindBean(m5566O(), m5567P()));
    }

    /* renamed from: n0 */
    public final Observable m5604n0(String str, String str2, int i10, int i11, int i12) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "contentId");
        return this.f4821d.m5823K2(new SearchByContentBean(m5567P(), m5566O(), m5565N(), str, str2, i10, i11, i12));
    }

    /* renamed from: o */
    public final Observable m5605o(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "type");
        return this.f4821d.m5845X0(str, str2, str3, str4, m5566O(), m5567P(), str5);
    }

    /* renamed from: o0 */
    public final Observable m5606o0(String str, String str2) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "rows");
        return this.f4821d.m5826M2(new BlSearchByContentBean(m5567P(), m5566O(), m5565N(), str, str2));
    }

    /* renamed from: p */
    public final Observable m5607p(List list) {
        AbstractC5868k.m23674f(list, "ids");
        return this.f4821d.m5848Z0(new DelFavoriteBean(list, m5567P(), m5566O()));
    }

    /* renamed from: p0 */
    public final Observable m5608p0(int i10, String str, String str2, int i11, int i12, String str3) {
        AbstractC5868k.m23674f(str, "value");
        AbstractC5868k.m23674f(str2, "type");
        return this.f4821d.m5829O2(new SearchByNameBean(m5567P(), m5566O(), m5565N(), String.valueOf(i10), str, str2, Integer.valueOf(i11), Integer.valueOf(i12), str3));
    }

    /* renamed from: q */
    public final Observable m5609q(List list) {
        AbstractC5868k.m23674f(list, "ids");
        return this.f4821d.m5851b1(new DelSubscribeBean(m5567P(), m5566O(), list));
    }

    /* renamed from: q0 */
    public final Observable m5610q0(String str, int i10) {
        AbstractC5868k.m23674f(str, "value");
        return this.f4821d.m5833Q2(new LiveSearchBean(m5567P(), m5566O(), m5565N(), str, 20, i10));
    }

    /* renamed from: r */
    public final Observable m5611r(List list, String str) {
        AbstractC5868k.m23674f(list, "deleteList");
        AbstractC5868k.m23674f(str, "temToken");
        return this.f4821d.m5854d1(new DeleteDevicesBean(list, str, C1461k.f5605a.m6807g()));
    }

    /* renamed from: r0 */
    public final Observable m5612r0(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "value");
        return this.f4821d.m5836S2(new SearchROrPBean(m5567P(), m5566O(), m5565N(), str, str2, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* renamed from: s */
    public final Call m5613s(String str, String str2, String str3, int i10, String str4) {
        AbstractC5868k.m23674f(str, "protocol");
        AbstractC5868k.m23674f(str2, "epgIp");
        AbstractC5868k.m23674f(str3, "timeZone");
        AbstractC5868k.m23674f(str4, "epgFileMd5");
        return this.f4821d.m5857f1(str, str2, str3, i10, str4);
    }

    /* renamed from: s0 */
    public final Observable m5614s0(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        return this.f4821d.m5840U2(str, str2, m5567P(), m5566O());
    }

    /* renamed from: t */
    public final Observable m5615t(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "password");
        AbstractC5868k.m23674f(str3, "verifyCode");
        return this.f4821d.m5859g1(str, str2, str3, m5567P(), m5566O());
    }

    /* renamed from: t0 */
    public final Observable m5616t0(String str) {
        AbstractC5868k.m23674f(str, "password");
        return this.f4821d.m5844W2(new PasswordSetBean(m5567P(), m5566O(), str));
    }

    /* renamed from: u */
    public final Observable m5617u(String str) {
        AbstractC5868k.m23674f(str, "exchangeCode");
        return this.f4821d.m5861i1(m5567P(), m5566O(), str, m5565N());
    }

    /* renamed from: u0 */
    public final Observable m5618u0(String str, int i10, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "channelCode");
        AbstractC5868k.m23674f(str3, "contentId");
        return this.f4821d.m5847Y2(new StartPlayBTVBean(m5567P(), m5566O(), m5565N(), str, i10, str2, str3));
    }

    /* renamed from: v */
    public final Observable m5619v(String str, String str2, String str3, String str4, int i10, int i11, int i12) {
        return this.f4821d.m5864k1(new FilterByContentBean(m5567P(), m5566O(), m5565N(), str, str2, str3, str4, Integer.valueOf(i10), AbstractC5091h.m20658a().f20976a, i11, i12));
    }

    /* renamed from: v0 */
    public final Observable m5620v0(String str, Integer num, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "channelCode");
        return this.f4821d.m5850a3(new StartPlayLiveBean(m5567P(), m5566O(), m5565N(), str, num, str2));
    }

    /* renamed from: w */
    public final Observable m5621w() {
        return this.f4821d.m5867m1(new FilterGenreBean(m5567P(), m5566O(), m5565N(), AbstractC5091h.m20658a().f20976a));
    }

    /* renamed from: w0 */
    public final Observable m5622w0(int i10, String str, String str2, String str3, int i11, String str4, int[] iArr) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str3, "type");
        return this.f4821d.m5853c3(new StartPlayVODBean(m5567P(), m5566O(), m5565N(), Integer.valueOf(i10), str, str2, str3, i11, str4, iArr));
    }

    /* renamed from: x */
    public final Observable m5623x(String str, String str2, int i10) {
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, "gameId");
        return this.f4821d.m5870o1(C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a()), str, str2, i10);
    }

    /* renamed from: x0 */
    public final Call m5624x0(int i10, String str, String str2, String str3, int i11, String str4, int[] iArr) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str3, "type");
        return this.f4821d.m5856e3(new StartPlayVODBean(m5567P(), m5566O(), m5565N(), Integer.valueOf(i10), str, str2, str3, i11, str4, iArr));
    }

    /* renamed from: y */
    public final Observable m5625y() {
        return this.f4821d.m5873p1(m5567P(), m5566O());
    }

    /* renamed from: y0 */
    public final Observable m5626y0(String str, String str2, int i10, String str3) {
        AbstractC5868k.m23674f(str, "authVersion");
        AbstractC5868k.m23674f(str2, "authCode");
        AbstractC5868k.m23674f(str3, "schedulerType");
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        return this.f4821d.m5858f3(new TerminalAuthBean(str, str2, m6896d, i10), str3);
    }

    /* renamed from: z */
    public final Observable m5627z(String str) {
        AbstractC5868k.m23674f(str, "type");
        String m5567P = m5567P();
        String m5566O = m5566O();
        String m5565N = m5565N();
        String language = Locale.getDefault().getLanguage();
        AbstractC5868k.m23673e(language, "getDefault().language");
        return this.f4821d.m5875r1(new GetAuthInfoBean(m5567P, m5566O, str, m5565N, language));
    }

    /* renamed from: z0 */
    public final Observable m5628z0() {
        return this.f4821d.m5863i3(new UpdateDeviceTokenBean(null, m5566O(), m5567P(), null, null, null, 57, null));
    }
}
