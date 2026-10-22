package p030bc;

import android.content.Context;
import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1453g;
import cc.AbstractC1468n0;
import cc.C1477w;
import cc.C1479y;
import com.dcs.bean.DomainInfo;
import com.lzy.okgo.model.Progress;
import com.request.bean.ActiveBean;
import com.request.bean.AddFavoriteBean;
import com.request.bean.AddSubscribeBean;
import com.request.bean.AllowQRLoginBean;
import com.request.bean.ApkQueryCouponBean;
import com.request.bean.ApkReceiveCouponBean;
import com.request.bean.BindEmailBean;
import com.request.bean.BindEmailGiftDaysBean;
import com.request.bean.BindPhoneBean;
import com.request.bean.BlSearchByContentBean;
import com.request.bean.ChangeBindEmailBean;
import com.request.bean.ChangeBindPhoneBean;
import com.request.bean.CheckVerifiCodeBean;
import com.request.bean.ConfigBean;
import com.request.bean.DelFavoriteBean;
import com.request.bean.DelSubscribeBean;
import com.request.bean.DeleteDevicesBean;
import com.request.bean.EmailResetPwdBean;
import com.request.bean.EpgBean;
import com.request.bean.ExchangeBean;
import com.request.bean.FilterByContentBean;
import com.request.bean.FilterGenreBean;
import com.request.bean.ForceBindBean;
import com.request.bean.FreeTimeBean;
import com.request.bean.GetAreaCodeBean;
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
import com.request.bean.GetQRTokenBean;
import com.request.bean.GetQrResultBean;
import com.request.bean.GetRecommendsBean;
import com.request.bean.GetShelveBean;
import com.request.bean.GetSlbInfoBean;
import com.request.bean.GetSubscribeBean;
import com.request.bean.GetVerifiCodeBean;
import com.request.bean.HeartBeatBean;
import com.request.bean.ItemByPersonBean;
import com.request.bean.LiveSearchBean;
import com.request.bean.LoginBean;
import com.request.bean.LogoutBean;
import com.request.bean.PasswordCheckBean;
import com.request.bean.PasswordSetBean;
import com.request.bean.RestrictedStatusBean;
import com.request.bean.SearchByContentBean;
import com.request.bean.SearchByNameBean;
import com.request.bean.SearchROrPBean;
import com.request.bean.SendEmailVerifyCodeBean;
import com.request.bean.SnTokenBean;
import com.request.bean.StartPlayBTVBean;
import com.request.bean.StartPlayLiveBean;
import com.request.bean.StartPlayVODBean;
import com.request.bean.TerminalAuthBean;
import com.request.bean.UpdateDeviceTokenBean;
import com.request.bean.UpdatePwdBean;
import com.request.bean.UserFeedBackBean;
import com.request.bean.VerifyEmailCodeBean;
import com.request.converterFactory.bean.ResultException;
import com.request.result.ActiveResult;
import com.request.result.AddFavoriteResult;
import com.request.result.AddSubscribeResult;
import com.request.result.ApkQueryCouponResult;
import com.request.result.ApkReceiveCouponResult;
import com.request.result.BaseResult;
import com.request.result.BindEmailGiftDaysResult;
import com.request.result.BindPhoneResult;
import com.request.result.CheckForceBindResult;
import com.request.result.CheckVerifiCodeResult;
import com.request.result.ConfigResult;
import com.request.result.DelFavoriteResult;
import com.request.result.EpgResult;
import com.request.result.ExchangeResult;
import com.request.result.FilterByContentResult;
import com.request.result.FilterGenreResult;
import com.request.result.FootballMatchResult;
import com.request.result.FreeResult;
import com.request.result.GetAreaCodeResult;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetDeviceResult;
import com.request.result.GetEmailSuffixResult;
import com.request.result.GetExchangeOrderInfoResult;
import com.request.result.GetFavoritesResult;
import com.request.result.GetInviteCodeResult;
import com.request.result.GetItemDataResult;
import com.request.result.GetLiveDataResult;
import com.request.result.GetNextColumnResult;
import com.request.result.GetOrderInfoResult;
import com.request.result.GetPackageResult;
import com.request.result.GetQrResult;
import com.request.result.GetQrTokenResult;
import com.request.result.GetRecommendsResult;
import com.request.result.GetShelveResult;
import com.request.result.GetSlbInfoBeanResult;
import com.request.result.GetSubscribeResult;
import com.request.result.GetVerifiCodeResult;
import com.request.result.HeartBeatResult;
import com.request.result.LineupResult;
import com.request.result.LoginResult;
import com.request.result.MatchEventResult;
import com.request.result.MatchScoreBoardResult;
import com.request.result.MatchStatResult;
import com.request.result.PersonResult;
import com.request.result.PersonWorksResult;
import com.request.result.RecommendColumnContentResult;
import com.request.result.SearchByContentResult;
import com.request.result.SearchByNameResult;
import com.request.result.SearchROrPResult;
import com.request.result.ShelveMatchResult;
import com.request.result.SnTokenResult;
import com.request.result.StartPlayBTVResult;
import com.request.result.StartPlayLiveResult;
import com.request.result.StartPlayVODResult;
import com.request.result.TerminalAuthResult;
import com.request.result.UserFeedBackResult;
import com.request.result.VerifyEmailCodeResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p170i2.C4842a;
import p179ib.AbstractC4926c;
import p213kf.C5260h;
import p279p2.AbstractC6187a;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p317rb.C6569c;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p363v2.C7197a;
import p371vb.C7252a;
import p385wb.C7386a;
import p385wb.C7390e;
import p431zb.C7778a;
import p431zb.C7779b;
import retrofit2.Call;
import retrofit2.Retrofit;
import sb.InterfaceC6781b;

/* renamed from: bc.z1 */
/* loaded from: classes.dex */
public final class C1293z1 {

    /* renamed from: d */
    public static final b f4924d = new b(null);

    /* renamed from: e */
    private static String f4925e = "";

    /* renamed from: f */
    private static String f4926f = "";

    /* renamed from: g */
    private static final InterfaceC1312h f4927g;

    /* renamed from: b */
    private InterfaceC6781b f4929b;

    /* renamed from: a */
    private final String f4928a = C1293z1.class.getSimpleName();

    /* renamed from: c */
    private long f4930c = 15;

    /* renamed from: bc.z1$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f4931a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final DomainInfo invoke() {
            return C7197a.f26917a.m27845b(AbstractC4926c.m20241h().first.toString(), AbstractC4926c.m20241h().second.toString(), "key_portal");
        }
    }

    /* renamed from: bc.z1$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final DomainInfo m5887a() {
            return (DomainInfo) C1293z1.f4927g.getValue();
        }

        /* renamed from: b */
        public final String m5888b() {
            return C1293z1.f4925e;
        }

        /* renamed from: c */
        public final String m5889c() {
            return C1293z1.f4926f;
        }
    }

    /* renamed from: bc.z1$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f4932a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5890a(Throwable th) {
            if (!(th instanceof ResultException)) {
                C7197a.f26917a.m27860t(C1293z1.f4924d.m5887a(), "key_portal");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5890a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bc.z1$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f4933a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5891a(Throwable th) {
            if (!(th instanceof ResultException)) {
                C7197a.f26917a.m27860t(C1293z1.f4924d.m5887a(), "key_portal");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5891a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bc.z1$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f4934a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m5892a(Throwable th) {
            if (!(th instanceof ResultException)) {
                C7197a.f26917a.m27860t(C1293z1.f4924d.m5887a(), "key_portal");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5892a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bc.z1$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f4935a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m5893a(Throwable th) {
            if (!(th instanceof ResultException)) {
                C7197a.f26917a.m27860t(C1293z1.f4924d.m5887a(), "key_portal");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5893a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f4931a);
        f4927g = m5965b;
    }

    public C1293z1() {
        String second;
        String first;
        b bVar = f4924d;
        DomainInfo m5887a = bVar.m5887a();
        String str = "";
        f4925e = (m5887a == null || (first = m5887a.getFirst()) == null) ? "" : first;
        DomainInfo m5887a2 = bVar.m5887a();
        if (m5887a2 != null && (second = m5887a2.getSecond()) != null) {
            str = second;
        }
        f4926f = str;
        Object m25767b = m5760k2().m25767b(InterfaceC6781b.class);
        AbstractC5868k.m23673e(m25767b, "getRetrofit().create(PortalApi::class.java)");
        this.f4929b = (InterfaceC6781b) m25767b;
    }

    /* renamed from: A0 */
    public static final Observable m5661A0(C1293z1 c1293z1, AddFavoriteBean addFavoriteBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(addFavoriteBean, "it");
        String json = AbstractC7027d.m27114a().toJson(addFavoriteBean);
        return c1293z1.f4929b.m26693J0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends AddFavoriteResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26693J0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: A2 */
    public static final Observable m5662A2(C1293z1 c1293z1, GetVerifiCodeBean getVerifiCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getVerifiCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getVerifiCodeBean);
        return c1293z1.f4929b.m26709W(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetVerifiCodeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26709W(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: B1 */
    public static final Observable m5664B1(C1293z1 c1293z1, EpgBean epgBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(epgBean, "it");
        String json = AbstractC7027d.m27114a().toJson(epgBean);
        return c1293z1.f4929b.m26695K0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends EpgResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26695K0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: C0 */
    public static final Observable m5666C0(C1293z1 c1293z1, AddSubscribeBean addSubscribeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(addSubscribeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(addSubscribeBean);
        return c1293z1.f4929b.m26689H0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends AddSubscribeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26689H0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: C2 */
    public static final Observable m5667C2(C1293z1 c1293z1, HeartBeatBean heartBeatBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(heartBeatBean, "it");
        String json = AbstractC7027d.m27114a().toJson(heartBeatBean);
        return c1293z1.f4929b.m26738m0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends HeartBeatResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26738m0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: D1 */
    public static final Observable m5669D1(C1293z1 c1293z1, GetExchangeOrderInfoBean getExchangeOrderInfoBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getExchangeOrderInfoBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getExchangeOrderInfoBean);
        return c1293z1.f4929b.m26713a(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetExchangeOrderInfoResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26713a(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: E0 */
    public static final Observable m5671E0(C1293z1 c1293z1, AllowQRLoginBean allowQRLoginBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(allowQRLoginBean, "it");
        String json = AbstractC7027d.m27114a().toJson(allowQRLoginBean);
        return c1293z1.f4929b.m26747r(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26747r(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: E2 */
    public static final Observable m5672E2(C1293z1 c1293z1, LoginBean loginBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(loginBean, "it");
        String json = AbstractC7027d.m27114a().toJson(loginBean);
        Observable<LoginResult> onErrorResumeNext = c1293z1.f4929b.m26691I0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends LoginResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26691I0(HttpConstant.HTTPS, f4926f, json)));
        final e eVar = e.f4934a;
        return onErrorResumeNext.doOnError(new Consumer() { // from class: bc.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1293z1.m5675F2(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: F1 */
    public static final Observable m5674F1(C1293z1 c1293z1, GetFavoritesBean getFavoritesBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getFavoritesBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getFavoritesBean);
        return c1293z1.f4929b.m26758w0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetFavoritesResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26758w0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: F2 */
    public static final void m5675F2(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: G0 */
    public static final Observable m5677G0(C1293z1 c1293z1, ApkQueryCouponBean apkQueryCouponBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(apkQueryCouponBean, "it");
        String json = AbstractC7027d.m27114a().toJson(apkQueryCouponBean);
        return c1293z1.f4929b.m26719d(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ApkQueryCouponResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26719d(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: H2 */
    public static final Observable m5679H2(C1293z1 c1293z1, LogoutBean logoutBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(logoutBean, "it");
        String json = AbstractC7027d.m27114a().toJson(logoutBean);
        return c1293z1.f4929b.m26723f(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends LoginResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26723f(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: I0 */
    public static final Observable m5681I0(C1293z1 c1293z1, ApkReceiveCouponBean apkReceiveCouponBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(apkReceiveCouponBean, "it");
        String json = AbstractC7027d.m27114a().toJson(apkReceiveCouponBean);
        return c1293z1.f4929b.m26702P(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ApkReceiveCouponResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26702P(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: I1 */
    public static final Observable m5682I1(C1293z1 c1293z1, FreeTimeBean freeTimeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(freeTimeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(freeTimeBean);
        return c1293z1.f4929b.m26694K(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends FreeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26694K(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: J2 */
    public static final Observable m5684J2(C1293z1 c1293z1, PasswordCheckBean passwordCheckBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(passwordCheckBean, "it");
        String json = AbstractC7027d.m27114a().toJson(passwordCheckBean);
        return c1293z1.f4929b.m26759x(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26759x(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: K0 */
    public static final Observable m5686K0(C1293z1 c1293z1, BindEmailBean bindEmailBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(bindEmailBean, "it");
        String json = AbstractC7027d.m27114a().toJson(bindEmailBean);
        return c1293z1.f4929b.m26715b(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26715b(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: K1 */
    public static final Observable m5687K1(C1293z1 c1293z1, GetInviteCodeBean getInviteCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getInviteCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getInviteCodeBean);
        return c1293z1.f4929b.m26760x0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetInviteCodeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26760x0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: L2 */
    public static final Observable m5689L2(C1293z1 c1293z1, SearchByContentBean searchByContentBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(searchByContentBean, "it");
        String json = AbstractC7027d.m27114a().toJson(searchByContentBean);
        return c1293z1.f4929b.m26731j(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SearchByContentResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26731j(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: M0 */
    public static final Observable m5691M0(C1293z1 c1293z1, BindEmailGiftDaysBean bindEmailGiftDaysBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(bindEmailGiftDaysBean, "it");
        String json = AbstractC7027d.m27114a().toJson(bindEmailGiftDaysBean);
        return c1293z1.f4929b.m26716b0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BindEmailGiftDaysResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26716b0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: M1 */
    public static final Observable m5692M1(C1293z1 c1293z1, ItemByPersonBean itemByPersonBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(itemByPersonBean, "it");
        String json = AbstractC7027d.m27114a().toJson(itemByPersonBean);
        return c1293z1.f4929b.m26722e0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends PersonWorksResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26722e0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: N2 */
    public static final Observable m5694N2(C1293z1 c1293z1, BlSearchByContentBean blSearchByContentBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(blSearchByContentBean, "it");
        String json = AbstractC7027d.m27114a().toJson(blSearchByContentBean);
        return c1293z1.f4929b.m26762y0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SearchByContentResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26762y0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: O0 */
    public static final Observable m5696O0(C1293z1 c1293z1, BindPhoneBean bindPhoneBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(bindPhoneBean, "it");
        String json = AbstractC7027d.m27114a().toJson(bindPhoneBean);
        return c1293z1.f4929b.m26761y(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BindPhoneResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26761y(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: O1 */
    public static final Observable m5697O1(C1293z1 c1293z1, GetItemDataBean getItemDataBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getItemDataBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getItemDataBean);
        return c1293z1.f4929b.m26737m(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetItemDataResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26737m(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: P2 */
    public static final Observable m5699P2(C1293z1 c1293z1, SearchByNameBean searchByNameBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(searchByNameBean, "it");
        String json = AbstractC7027d.m27114a().toJson(searchByNameBean);
        return c1293z1.f4929b.m26756v0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SearchByNameResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26756v0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: Q0 */
    public static final Observable m5701Q0(C1293z1 c1293z1, SearchByNameBean searchByNameBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(searchByNameBean, "it");
        String json = AbstractC7027d.m27114a().toJson(searchByNameBean);
        return c1293z1.f4929b.m26718c0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SearchByNameResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26718c0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: R1 */
    public static final Observable m5703R1(C1293z1 c1293z1, GetLiveDataBean getLiveDataBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getLiveDataBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getLiveDataBean);
        return c1293z1.f4929b.m26676B(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetLiveDataResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26676B(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: R2 */
    public static final Observable m5704R2(C1293z1 c1293z1, LiveSearchBean liveSearchBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(liveSearchBean, "it");
        String json = AbstractC7027d.m27114a().toJson(liveSearchBean);
        return c1293z1.f4929b.m26744p0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetLiveDataResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26744p0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: S0 */
    public static final Observable m5706S0(C1293z1 c1293z1, ChangeBindEmailBean changeBindEmailBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(changeBindEmailBean, "it");
        String json = AbstractC7027d.m27114a().toJson(changeBindEmailBean);
        return c1293z1.f4929b.m26677B0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26677B0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: T2 */
    public static final Observable m5708T2(C1293z1 c1293z1, SearchROrPBean searchROrPBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(searchROrPBean, "it");
        String json = AbstractC7027d.m27114a().toJson(searchROrPBean);
        return c1293z1.f4929b.m26740n0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SearchROrPResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26740n0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: U0 */
    public static final Observable m5710U0(C1293z1 c1293z1, ChangeBindPhoneBean changeBindPhoneBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(changeBindPhoneBean, "it");
        String json = AbstractC7027d.m27114a().toJson(changeBindPhoneBean);
        return c1293z1.f4929b.m26739n(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26739n(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: V2 */
    public static final Observable m5712V2(C1293z1 c1293z1, SendEmailVerifyCodeBean sendEmailVerifyCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(sendEmailVerifyCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(sendEmailVerifyCodeBean);
        return c1293z1.f4929b.m26736l0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26736l0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: W0 */
    public static final Observable m5714W0(C1293z1 c1293z1, ForceBindBean forceBindBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(forceBindBean, "it");
        String json = AbstractC7027d.m27114a().toJson(forceBindBean);
        return c1293z1.f4929b.m26734k0(HttpConstant.HTTP, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends CheckForceBindResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26734k0(HttpConstant.HTTP, f4926f, json)));
    }

    /* renamed from: X1 */
    public static final Observable m5716X1(C1293z1 c1293z1, GetOrderInfoBean getOrderInfoBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getOrderInfoBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getOrderInfoBean);
        return c1293z1.f4929b.m26684F(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetOrderInfoResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26684F(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: X2 */
    public static final Observable m5717X2(C1293z1 c1293z1, PasswordSetBean passwordSetBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(passwordSetBean, "it");
        String json = AbstractC7027d.m27114a().toJson(passwordSetBean);
        return c1293z1.f4929b.m26683E0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26683E0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: Y0 */
    public static final Observable m5719Y0(C1293z1 c1293z1, CheckVerifiCodeBean checkVerifiCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(checkVerifiCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(checkVerifiCodeBean);
        return c1293z1.f4929b.m26714a0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends CheckVerifiCodeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26714a0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: Z1 */
    public static final Observable m5721Z1(C1293z1 c1293z1, GetPackageBean getPackageBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getPackageBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getPackageBean);
        return c1293z1.f4929b.m26727h(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetPackageResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26727h(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: Z2 */
    public static final Observable m5722Z2(C1293z1 c1293z1, StartPlayBTVBean startPlayBTVBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(startPlayBTVBean, "it");
        String json = AbstractC7027d.m27114a().toJson(startPlayBTVBean);
        return c1293z1.f4929b.m26699M0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends StartPlayBTVResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26699M0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: a1 */
    public static final Observable m5725a1(C1293z1 c1293z1, DelFavoriteBean delFavoriteBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(delFavoriteBean, "it");
        String json = AbstractC7027d.m27114a().toJson(delFavoriteBean);
        return c1293z1.f4929b.m26754u0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends DelFavoriteResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26754u0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: b2 */
    public static final Observable m5728b2(C1293z1 c1293z1, GetPersonBean getPersonBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getPersonBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getPersonBean);
        return c1293z1.f4929b.m26725g(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends PersonResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26725g(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: b3 */
    public static final Observable m5729b3(C1293z1 c1293z1, StartPlayLiveBean startPlayLiveBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(startPlayLiveBean, "it");
        String json = AbstractC7027d.m27114a().toJson(startPlayLiveBean);
        return c1293z1.f4929b.m26681D0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends StartPlayLiveResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26681D0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: c1 */
    public static final Observable m5732c1(C1293z1 c1293z1, DelSubscribeBean delSubscribeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(delSubscribeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(delSubscribeBean);
        return c1293z1.f4929b.m26729i(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26729i(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: d2 */
    public static final Observable m5735d2(C1293z1 c1293z1, GetQrResultBean getQrResultBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getQrResultBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getQrResultBean);
        return c1293z1.f4929b.m26751t(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetQrResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26751t(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: d3 */
    public static final Observable m5736d3(C1293z1 c1293z1, StartPlayVODBean startPlayVODBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(startPlayVODBean, "it");
        String json = AbstractC7027d.m27114a().toJson(startPlayVODBean);
        return c1293z1.f4929b.m26705S(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends StartPlayVODResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26705S(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: e1 */
    public static final Observable m5739e1(C1293z1 c1293z1, DeleteDevicesBean deleteDevicesBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(deleteDevicesBean, "it");
        String json = AbstractC7027d.m27114a().toJson(deleteDevicesBean);
        return c1293z1.f4929b.m26717c(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26717c(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: f2 */
    public static final Observable m5742f2(C1293z1 c1293z1, GetQRTokenBean getQRTokenBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getQRTokenBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getQRTokenBean);
        return c1293z1.f4929b.m26728h0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetQrTokenResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26728h0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: g3 */
    public static final Observable m5745g3(C1293z1 c1293z1, TerminalAuthBean terminalAuthBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(terminalAuthBean, "it");
        String json = AbstractC7027d.m27114a().toJson(terminalAuthBean);
        Observable<TerminalAuthResult> onErrorResumeNext = c1293z1.f4929b.m26726g0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends TerminalAuthResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26726g0(HttpConstant.HTTPS, f4926f, json)));
        final f fVar = f.f4935a;
        return onErrorResumeNext.doOnError(new Consumer() { // from class: bc.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1293z1.m5750h3(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: h1 */
    public static final Observable m5748h1(C1293z1 c1293z1, EmailResetPwdBean emailResetPwdBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(emailResetPwdBean, "it");
        String json = AbstractC7027d.m27114a().toJson(emailResetPwdBean);
        return c1293z1.f4929b.m26746q0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26746q0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: h2 */
    public static final Observable m5749h2(C1293z1 c1293z1, GetColumnContentsBean getColumnContentsBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getColumnContentsBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getColumnContentsBean);
        return c1293z1.f4929b.m26685F0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends RecommendColumnContentResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26685F0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: h3 */
    public static final void m5750h3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: j1 */
    public static final Observable m5755j1(C1293z1 c1293z1, ExchangeBean exchangeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(exchangeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(exchangeBean);
        return c1293z1.f4929b.m26704R(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ExchangeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26704R(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: j2 */
    public static final Observable m5756j2(C1293z1 c1293z1, GetRecommendsBean getRecommendsBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getRecommendsBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getRecommendsBean);
        return c1293z1.f4929b.m26692J(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetRecommendsResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26692J(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: j3 */
    public static final Observable m5757j3(C1293z1 c1293z1, UpdateDeviceTokenBean updateDeviceTokenBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(updateDeviceTokenBean, "it");
        String json = AbstractC7027d.m27114a().toJson(updateDeviceTokenBean);
        return c1293z1.f4929b.m26686G(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26686G(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: k2 */
    private final Retrofit m5760k2() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = this.f4930c;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectionPool = builder.connectTimeout(j10, timeUnit).readTimeout(this.f4930c, timeUnit).writeTimeout(this.f4930c, timeUnit).connectionPool(AbstractC6187a.m24711a());
        AbstractC5868k.m23673e(connectionPool, "Builder()\n              …izer.getConnectionPool())");
        OkHttpClient.Builder dns = AbstractC6567a.m25633c(connectionPool, 2).addInterceptor(new C7778a()).addInterceptor(new C7779b()).dns(new C1477w("portal"));
        X509TrustManager m6758a = AbstractC1453g.m6758a();
        if (m6758a != null) {
            dns.sslSocketFactory(new C1479y(m6758a), m6758a);
        }
        OkHttpClient build = dns.build();
        AbstractC5868k.m23673e(build, "builder.build()");
        Retrofit m25779e = new Retrofit.Builder().m25777c("http://www.baidu.com").m25781g(build).m25775a(C5260h.m21165d()).m25776b(C7386a.m28498f(true, new C7390e())).m25779e();
        AbstractC5868k.m23673e(m25779e, "Builder()\n              …\n                .build()");
        return m25779e;
    }

    /* renamed from: l1 */
    public static final Observable m5763l1(C1293z1 c1293z1, FilterByContentBean filterByContentBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(filterByContentBean, "it");
        String json = AbstractC7027d.m27114a().toJson(filterByContentBean);
        return c1293z1.f4929b.m26735l(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends FilterByContentResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26735l(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: l3 */
    public static final Observable m5764l3(C1293z1 c1293z1, UpdatePwdBean updatePwdBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(updatePwdBean, "it");
        String json = AbstractC7027d.m27114a().toJson(updatePwdBean);
        return c1293z1.f4929b.m26707U(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26707U(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: m2 */
    public static final Observable m5767m2(C1293z1 c1293z1, GetShelveBean getShelveBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getShelveBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getShelveBean);
        return c1293z1.f4929b.m26755v(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetShelveResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26755v(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: n1 */
    public static final Observable m5770n1(C1293z1 c1293z1, FilterGenreBean filterGenreBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(filterGenreBean, "it");
        String json = AbstractC7027d.m27114a().toJson(filterGenreBean);
        return c1293z1.f4929b.m26680D(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends FilterGenreResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26680D(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: n3 */
    public static final Observable m5771n3(C1293z1 c1293z1, RestrictedStatusBean restrictedStatusBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(restrictedStatusBean, "it");
        String json = AbstractC7027d.m27114a().toJson(restrictedStatusBean);
        return c1293z1.f4929b.m26724f0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends BaseResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26724f0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: p2 */
    public static /* synthetic */ Observable m5776p2(C1293z1 c1293z1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, String str9, int i10, Object obj) {
        String str10;
        if ((i10 & 512) != 0) {
            str10 = "";
        } else {
            str10 = str9;
        }
        return c1293z1.m5871o2(str, str2, str3, str4, str5, str6, str7, str8, strArr, str10);
    }

    /* renamed from: p3 */
    public static final Observable m5777p3(C1293z1 c1293z1, UserFeedBackBean userFeedBackBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(userFeedBackBean, "it");
        String json = AbstractC7027d.m27114a().toJson(userFeedBackBean);
        return c1293z1.f4929b.m26742o0(HttpConstant.HTTP, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends UserFeedBackResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26742o0(HttpConstant.HTTP, f4926f, json)));
    }

    /* renamed from: q1 */
    public static final Observable m5780q1(C1293z1 c1293z1, GetAreaCodeBean getAreaCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getAreaCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getAreaCodeBean);
        return c1293z1.f4929b.m26678C(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetAreaCodeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26678C(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: q2 */
    public static final Observable m5781q2(C1293z1 c1293z1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, Context context) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(str, "$userToken");
        AbstractC5868k.m23674f(str2, "$userId");
        AbstractC5868k.m23674f(str3, "$hasPay");
        AbstractC5868k.m23674f(str4, "$identity");
        AbstractC5868k.m23674f(str5, "$portalCode");
        AbstractC5868k.m23674f(str6, "$type");
        AbstractC5868k.m23674f(str7, "$appVer");
        AbstractC5868k.m23674f(str8, "$lang");
        AbstractC5868k.m23674f(strArr, "$liveCodeList");
        AbstractC5868k.m23674f(context, "it");
        boolean m19941R = C4842a.f20329a.m19920a().m19941R();
        AbstractC5868k.m23673e(new JSONObject().put("deviceTag", C7252a.f27087a.m28068c()).toString(), "JSONObject().put(\"device…ant.deviceTag).toString()");
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        String json = AbstractC7027d.m27114a().toJson(new GetSlbInfoBean(str, str2, str3, str4, str5, str6, str7, str8, 1, strArr, "", m6896d, String.valueOf(m19941R ? 1 : 0)));
        return c1293z1.f4929b.m26710X(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetSlbInfoBeanResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26710X(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: r3 */
    public static final Observable m5784r3(C1293z1 c1293z1, VerifyEmailCodeBean verifyEmailCodeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(verifyEmailCodeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(verifyEmailCodeBean);
        return c1293z1.f4929b.m26748r0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends VerifyEmailCodeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26748r0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: s1 */
    public static final Observable m5787s1(C1293z1 c1293z1, GetAuthInfoBean getAuthInfoBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getAuthInfoBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getAuthInfoBean);
        return c1293z1.f4929b.m26720d0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetAuthInfoResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26720d0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: s2 */
    public static /* synthetic */ Observable m5788s2(C1293z1 c1293z1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, String str9, int i10, Object obj) {
        String str10;
        if ((i10 & 512) != 0) {
            str10 = "";
        } else {
            str10 = str9;
        }
        return c1293z1.m5876r2(str, str2, str3, str4, str5, str6, str7, str8, strArr, str10);
    }

    /* renamed from: t2 */
    public static final Observable m5791t2(C1293z1 c1293z1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, Context context) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(str, "$userToken");
        AbstractC5868k.m23674f(str2, "$userId");
        AbstractC5868k.m23674f(str3, "$hasPay");
        AbstractC5868k.m23674f(str4, "$identity");
        AbstractC5868k.m23674f(str5, "$portalCode");
        AbstractC5868k.m23674f(str6, "$type");
        AbstractC5868k.m23674f(str7, "$appVer");
        AbstractC5868k.m23674f(str8, "$lang");
        AbstractC5868k.m23674f(strArr, "$liveCodeList");
        AbstractC5868k.m23674f(context, "it");
        boolean m19941R = C4842a.f20329a.m19920a().m19941R();
        AbstractC5868k.m23673e(new JSONObject().put("deviceTag", C7252a.f27087a.m28068c()).toString(), "JSONObject().put(\"device…ant.deviceTag).toString()");
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        String json = AbstractC7027d.m27114a().toJson(new GetSlbInfoBean(str, str2, str3, str4, str5, str6, str7, str8, 1, strArr, "", m6896d, String.valueOf(m19941R ? 1 : 0)));
        return c1293z1.f4929b.m26741o(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetSlbInfoBeanResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26741o(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: u1 */
    public static final Observable m5794u1(C1293z1 c1293z1, GetColumnContentsBean getColumnContentsBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getColumnContentsBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getColumnContentsBean);
        return c1293z1.f4929b.m26763z(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetColumnContentsResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26763z(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: v2 */
    public static final Observable m5797v2(C1293z1 c1293z1, SnTokenBean snTokenBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(snTokenBean, "it");
        String json = AbstractC7027d.m27114a().toJson(snTokenBean);
        Observable<SnTokenResult> onErrorResumeNext = c1293z1.f4929b.m26712Z(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SnTokenResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26712Z(HttpConstant.HTTPS, f4926f, json)));
        final d dVar = d.f4933a;
        return onErrorResumeNext.doOnError(new Consumer() { // from class: bc.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1293z1.m5800w2(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: w1 */
    public static final Observable m5799w1(C1293z1 c1293z1, ConfigBean configBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(configBean, "it");
        String json = AbstractC7027d.m27114a().toJson(configBean);
        return c1293z1.f4929b.m26697L0(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ConfigResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26697L0(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: w2 */
    public static final void m5800w2(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: x0 */
    public static final Observable m5802x0(C1293z1 c1293z1, ActiveBean activeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(activeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(activeBean);
        Observable<ActiveResult> onErrorResumeNext = c1293z1.f4929b.m26700N(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ActiveResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26700N(HttpConstant.HTTPS, f4926f, json)));
        final c cVar = c.f4932a;
        return onErrorResumeNext.doOnError(new Consumer() { // from class: bc.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1293z1.m5804y0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: y0 */
    public static final void m5804y0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: y1 */
    public static final Observable m5805y1(C1293z1 c1293z1, GetDevicesBean getDevicesBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getDevicesBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getDevicesBean);
        return c1293z1.f4929b.m26753u(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetDeviceResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26753u(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: y2 */
    public static final Observable m5806y2(C1293z1 c1293z1, GetSubscribeBean getSubscribeBean) {
        AbstractC5868k.m23674f(c1293z1, "this$0");
        AbstractC5868k.m23674f(getSubscribeBean, "it");
        String json = AbstractC7027d.m27114a().toJson(getSubscribeBean);
        return c1293z1.f4929b.m26690I(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetSubscribeResult>>) C6569c.f25182a.m25643b(c1293z1.f4929b.m26690I(HttpConstant.HTTPS, f4926f, json)));
    }

    /* renamed from: A1 */
    public final Observable m5808A1(EpgBean epgBean) {
        AbstractC5868k.m23674f(epgBean, "bean");
        return C1207a2.f4775a.m5508c(epgBean, new Function() { // from class: bc.g1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5664B1;
                m5664B1 = C1293z1.m5664B1(C1293z1.this, (EpgBean) obj);
                return m5664B1;
            }
        });
    }

    /* renamed from: B0 */
    public final Observable m5809B0(AddSubscribeBean addSubscribeBean) {
        AbstractC5868k.m23674f(addSubscribeBean, "bean");
        return C1207a2.f4775a.m5508c(addSubscribeBean, new Function() { // from class: bc.u0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5666C0;
                m5666C0 = C1293z1.m5666C0(C1293z1.this, (AddSubscribeBean) obj);
                return m5666C0;
            }
        });
    }

    /* renamed from: B2 */
    public final Observable m5810B2(HeartBeatBean heartBeatBean) {
        AbstractC5868k.m23674f(heartBeatBean, "bean");
        return C1207a2.f4775a.m5508c(heartBeatBean, new Function() { // from class: bc.p0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5667C2;
                m5667C2 = C1293z1.m5667C2(C1293z1.this, (HeartBeatBean) obj);
                return m5667C2;
            }
        });
    }

    /* renamed from: C1 */
    public final Observable m5811C1(GetExchangeOrderInfoBean getExchangeOrderInfoBean) {
        AbstractC5868k.m23674f(getExchangeOrderInfoBean, "bean");
        return C1207a2.f4775a.m5508c(getExchangeOrderInfoBean, new Function() { // from class: bc.i0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5669D1;
                m5669D1 = C1293z1.m5669D1(C1293z1.this, (GetExchangeOrderInfoBean) obj);
                return m5669D1;
            }
        });
    }

    /* renamed from: D0 */
    public final Observable m5812D0(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "qrtoken");
        AbstractC5868k.m23674f(str5, "isAllow");
        return C1207a2.f4775a.m5508c(new AllowQRLoginBean(str, str2, str3, str4, str5), new Function() { // from class: bc.p1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5671E0;
                m5671E0 = C1293z1.m5671E0(C1293z1.this, (AllowQRLoginBean) obj);
                return m5671E0;
            }
        });
    }

    /* renamed from: D2 */
    public final Observable m5813D2(LoginBean loginBean, String str) {
        AbstractC5868k.m23674f(loginBean, "bean");
        AbstractC5868k.m23674f(str, "schedulerType");
        return C1207a2.f4775a.m5507b(loginBean, new Function() { // from class: bc.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5672E2;
                m5672E2 = C1293z1.m5672E2(C1293z1.this, (LoginBean) obj);
                return m5672E2;
            }
        }, str);
    }

    /* renamed from: E1 */
    public final Observable m5814E1(GetFavoritesBean getFavoritesBean) {
        AbstractC5868k.m23674f(getFavoritesBean, "bean");
        return C1207a2.f4775a.m5508c(getFavoritesBean, new Function() { // from class: bc.l
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5674F1;
                m5674F1 = C1293z1.m5674F1(C1293z1.this, (GetFavoritesBean) obj);
                return m5674F1;
            }
        });
    }

    /* renamed from: F0 */
    public final Observable m5815F0(ApkQueryCouponBean apkQueryCouponBean) {
        AbstractC5868k.m23674f(apkQueryCouponBean, "bean");
        return C1207a2.f4775a.m5508c(apkQueryCouponBean, new Function() { // from class: bc.c1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5677G0;
                m5677G0 = C1293z1.m5677G0(C1293z1.this, (ApkQueryCouponBean) obj);
                return m5677G0;
            }
        });
    }

    /* renamed from: G1 */
    public final Observable m5816G1(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "appId");
        AbstractC5868k.m23674f(str2, "match");
        AbstractC5868k.m23674f(str3, Progress.DATE);
        AbstractC5868k.m23674f(str5, "appLanguage");
        Observable<R> compose = this.f4929b.m26708V(HttpConstant.HTTP, f4925e, str, str2, str3, str4, str5).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends FootballMatchResult>>) C6569c.f25182a.m25643b(this.f4929b.m26708V(HttpConstant.HTTP, f4926f, str, str2, str3, str4, str5))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getFootballMa…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: G2 */
    public final Observable m5817G2(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        return C1207a2.f4775a.m5506a(new LogoutBean(str, str2), new Function() { // from class: bc.d1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5679H2;
                m5679H2 = C1293z1.m5679H2(C1293z1.this, (LogoutBean) obj);
                return m5679H2;
            }
        });
    }

    /* renamed from: H0 */
    public final Observable m5818H0(ApkReceiveCouponBean apkReceiveCouponBean) {
        AbstractC5868k.m23674f(apkReceiveCouponBean, "bean");
        return C1207a2.f4775a.m5508c(apkReceiveCouponBean, new Function() { // from class: bc.t1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5681I0;
                m5681I0 = C1293z1.m5681I0(C1293z1.this, (ApkReceiveCouponBean) obj);
                return m5681I0;
            }
        });
    }

    /* renamed from: H1 */
    public final Observable m5819H1(FreeTimeBean freeTimeBean) {
        AbstractC5868k.m23674f(freeTimeBean, "bean");
        return C1207a2.f4775a.m5508c(freeTimeBean, new Function() { // from class: bc.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5682I1;
                m5682I1 = C1293z1.m5682I1(C1293z1.this, (FreeTimeBean) obj);
                return m5682I1;
            }
        });
    }

    /* renamed from: I2 */
    public final Observable m5820I2(PasswordCheckBean passwordCheckBean) {
        AbstractC5868k.m23674f(passwordCheckBean, "bean");
        return C1207a2.f4775a.m5508c(passwordCheckBean, new Function() { // from class: bc.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5684J2;
                m5684J2 = C1293z1.m5684J2(C1293z1.this, (PasswordCheckBean) obj);
                return m5684J2;
            }
        });
    }

    /* renamed from: J0 */
    public final Observable m5821J0(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "pwd");
        AbstractC5868k.m23674f(str4, "email");
        AbstractC5868k.m23674f(str5, "type");
        return C1207a2.f4775a.m5508c(new BindEmailBean(str4, str5, str3, str, str2), new Function() { // from class: bc.a0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5686K0;
                m5686K0 = C1293z1.m5686K0(C1293z1.this, (BindEmailBean) obj);
                return m5686K0;
            }
        });
    }

    /* renamed from: J1 */
    public final Observable m5822J1(GetInviteCodeBean getInviteCodeBean) {
        AbstractC5868k.m23674f(getInviteCodeBean, "bean");
        return C1207a2.f4775a.m5508c(getInviteCodeBean, new Function() { // from class: bc.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5687K1;
                m5687K1 = C1293z1.m5687K1(C1293z1.this, (GetInviteCodeBean) obj);
                return m5687K1;
            }
        });
    }

    /* renamed from: K2 */
    public final Observable m5823K2(SearchByContentBean searchByContentBean) {
        AbstractC5868k.m23674f(searchByContentBean, "bean");
        return C1207a2.f4775a.m5508c(searchByContentBean, new Function() { // from class: bc.s0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5689L2;
                m5689L2 = C1293z1.m5689L2(C1293z1.this, (SearchByContentBean) obj);
                return m5689L2;
            }
        });
    }

    /* renamed from: L0 */
    public final Observable m5824L0(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return C1207a2.f4775a.m5508c(new BindEmailGiftDaysBean(str, str2), new Function() { // from class: bc.b0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5691M0;
                m5691M0 = C1293z1.m5691M0(C1293z1.this, (BindEmailGiftDaysBean) obj);
                return m5691M0;
            }
        });
    }

    /* renamed from: L1 */
    public final Observable m5825L1(ItemByPersonBean itemByPersonBean) {
        AbstractC5868k.m23674f(itemByPersonBean, "bean");
        return C1207a2.f4775a.m5508c(itemByPersonBean, new Function() { // from class: bc.l1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5692M1;
                m5692M1 = C1293z1.m5692M1(C1293z1.this, (ItemByPersonBean) obj);
                return m5692M1;
            }
        });
    }

    /* renamed from: M2 */
    public final Observable m5826M2(BlSearchByContentBean blSearchByContentBean) {
        AbstractC5868k.m23674f(blSearchByContentBean, "bean");
        return C1207a2.f4775a.m5508c(blSearchByContentBean, new Function() { // from class: bc.b1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5694N2;
                m5694N2 = C1293z1.m5694N2(C1293z1.this, (BlSearchByContentBean) obj);
                return m5694N2;
            }
        });
    }

    /* renamed from: N0 */
    public final Observable m5827N0(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "userToken");
        return C1207a2.f4775a.m5508c(new BindPhoneBean(str, str2, str3, str4, str5, str6), new Function() { // from class: bc.e1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5696O0;
                m5696O0 = C1293z1.m5696O0(C1293z1.this, (BindPhoneBean) obj);
                return m5696O0;
            }
        });
    }

    /* renamed from: N1 */
    public final Observable m5828N1(GetItemDataBean getItemDataBean) {
        AbstractC5868k.m23674f(getItemDataBean, "bean");
        return C1207a2.f4775a.m5506a(getItemDataBean, new Function() { // from class: bc.k1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5697O1;
                m5697O1 = C1293z1.m5697O1(C1293z1.this, (GetItemDataBean) obj);
                return m5697O1;
            }
        });
    }

    /* renamed from: O2 */
    public final Observable m5829O2(SearchByNameBean searchByNameBean) {
        AbstractC5868k.m23674f(searchByNameBean, "bean");
        return C1207a2.f4775a.m5508c(searchByNameBean, new Function() { // from class: bc.n0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5699P2;
                m5699P2 = C1293z1.m5699P2(C1293z1.this, (SearchByNameBean) obj);
                return m5699P2;
            }
        });
    }

    /* renamed from: P0 */
    public final Observable m5830P0(SearchByNameBean searchByNameBean) {
        AbstractC5868k.m23674f(searchByNameBean, "bean");
        return C1207a2.f4775a.m5508c(searchByNameBean, new Function() { // from class: bc.d0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5701Q0;
                m5701Q0 = C1293z1.m5701Q0(C1293z1.this, (SearchByNameBean) obj);
                return m5701Q0;
            }
        });
    }

    /* renamed from: P1 */
    public final Observable m5831P1(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        Observable<R> compose = this.f4929b.m26674A(HttpConstant.HTTP, f4925e, str).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends LineupResult>>) C6569c.f25182a.m25643b(this.f4929b.m26674A(HttpConstant.HTTP, f4926f, str))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getLineup(IHt…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: Q1 */
    public final Observable m5832Q1(GetLiveDataBean getLiveDataBean) {
        AbstractC5868k.m23674f(getLiveDataBean, "bean");
        return C1207a2.f4775a.m5506a(getLiveDataBean, new Function() { // from class: bc.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5703R1;
                m5703R1 = C1293z1.m5703R1(C1293z1.this, (GetLiveDataBean) obj);
                return m5703R1;
            }
        });
    }

    /* renamed from: Q2 */
    public final Observable m5833Q2(LiveSearchBean liveSearchBean) {
        AbstractC5868k.m23674f(liveSearchBean, "bean");
        return C1207a2.f4775a.m5508c(liveSearchBean, new Function() { // from class: bc.w1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5704R2;
                m5704R2 = C1293z1.m5704R2(C1293z1.this, (LiveSearchBean) obj);
                return m5704R2;
            }
        });
    }

    /* renamed from: R0 */
    public final Observable m5834R0(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return C1207a2.f4775a.m5508c(new ChangeBindEmailBean(str, str2, str3, str4, str5), new Function() { // from class: bc.j0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5706S0;
                m5706S0 = C1293z1.m5706S0(C1293z1.this, (ChangeBindEmailBean) obj);
                return m5706S0;
            }
        });
    }

    /* renamed from: S1 */
    public final Observable m5835S1(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        Observable<R> compose = this.f4929b.m26703Q(HttpConstant.HTTP, f4925e, str).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends MatchEventResult>>) C6569c.f25182a.m25643b(this.f4929b.m26703Q(HttpConstant.HTTP, f4926f, str))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getMatchEvent…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: S2 */
    public final Observable m5836S2(SearchROrPBean searchROrPBean) {
        AbstractC5868k.m23674f(searchROrPBean, "bean");
        return C1207a2.f4775a.m5508c(searchROrPBean, new Function() { // from class: bc.q1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5708T2;
                m5708T2 = C1293z1.m5708T2(C1293z1.this, (SearchROrPBean) obj);
                return m5708T2;
            }
        });
    }

    /* renamed from: T0 */
    public final Observable m5837T0(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        AbstractC5868k.m23674f(str6, "loginType");
        return C1207a2.f4775a.m5508c(new ChangeBindPhoneBean(str, str2, str3, str4, str5, str6), new Function() { // from class: bc.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5710U0;
                m5710U0 = C1293z1.m5710U0(C1293z1.this, (ChangeBindPhoneBean) obj);
                return m5710U0;
            }
        });
    }

    /* renamed from: T1 */
    public final Observable m5838T1(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        Observable<R> compose = this.f4929b.m26701O(HttpConstant.HTTP, f4925e, str, str2, str3).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends MatchScoreBoardResult>>) C6569c.f25182a.m25643b(this.f4929b.m26701O(HttpConstant.HTTP, f4926f, str, str2, str3))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getMatchScore…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: U1 */
    public final Observable m5839U1(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        Observable<R> compose = this.f4929b.m26745q(HttpConstant.HTTP, f4925e, str, str2, str3).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends MatchStatResult>>) C6569c.f25182a.m25643b(this.f4929b.m26745q(HttpConstant.HTTP, f4926f, str, str2, str3))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getMatchStati…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: U2 */
    public final Observable m5840U2(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "userToken");
        AbstractC5868k.m23674f(str4, "userId");
        return C1207a2.f4775a.m5508c(new SendEmailVerifyCodeBean(str, str2, str3, str4), new Function() { // from class: bc.i
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5712V2;
                m5712V2 = C1293z1.m5712V2(C1293z1.this, (SendEmailVerifyCodeBean) obj);
                return m5712V2;
            }
        });
    }

    /* renamed from: V0 */
    public final Observable m5841V0(ForceBindBean forceBindBean) {
        AbstractC5868k.m23674f(forceBindBean, "forceBindBean");
        return C1207a2.f4775a.m5508c(forceBindBean, new Function() { // from class: bc.r1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5714W0;
                m5714W0 = C1293z1.m5714W0(C1293z1.this, (ForceBindBean) obj);
                return m5714W0;
            }
        });
    }

    /* renamed from: V1 */
    public final Observable m5842V1(GetNextColumnBean getNextColumnBean) {
        AbstractC5868k.m23674f(getNextColumnBean, "bean");
        String json = AbstractC7027d.m27114a().toJson(getNextColumnBean);
        Observable<GetNextColumnResult> onErrorResumeNext = this.f4929b.m26682E(HttpConstant.HTTPS, f4925e, json).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetNextColumnResult>>) C6569c.f25182a.m25643b(this.f4929b.m26682E(HttpConstant.HTTPS, f4926f, json)));
        AbstractC5868k.m23673e(onErrorResumeNext, "mPortalApi.getNextColumn…S, PORTAL_SECOND, json)))");
        return onErrorResumeNext;
    }

    /* renamed from: W1 */
    public final Observable m5843W1(GetOrderInfoBean getOrderInfoBean) {
        AbstractC5868k.m23674f(getOrderInfoBean, "bean");
        return C1207a2.f4775a.m5508c(getOrderInfoBean, new Function() { // from class: bc.o0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5716X1;
                m5716X1 = C1293z1.m5716X1(C1293z1.this, (GetOrderInfoBean) obj);
                return m5716X1;
            }
        });
    }

    /* renamed from: W2 */
    public final Observable m5844W2(PasswordSetBean passwordSetBean) {
        AbstractC5868k.m23674f(passwordSetBean, "bean");
        return C1207a2.f4775a.m5508c(passwordSetBean, new Function() { // from class: bc.g0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5717X2;
                m5717X2 = C1293z1.m5717X2(C1293z1.this, (PasswordSetBean) obj);
                return m5717X2;
            }
        });
    }

    /* renamed from: X0 */
    public final Observable m5845X0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "type");
        return C1207a2.f4775a.m5508c(new CheckVerifiCodeBean(str, str2, str3, str4, str5, str6, str7), new Function() { // from class: bc.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5719Y0;
                m5719Y0 = C1293z1.m5719Y0(C1293z1.this, (CheckVerifiCodeBean) obj);
                return m5719Y0;
            }
        });
    }

    /* renamed from: Y1 */
    public final Observable m5846Y1(GetPackageBean getPackageBean) {
        AbstractC5868k.m23674f(getPackageBean, "bean");
        return C1207a2.f4775a.m5508c(getPackageBean, new Function() { // from class: bc.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5721Z1;
                m5721Z1 = C1293z1.m5721Z1(C1293z1.this, (GetPackageBean) obj);
                return m5721Z1;
            }
        });
    }

    /* renamed from: Y2 */
    public final Observable m5847Y2(StartPlayBTVBean startPlayBTVBean) {
        AbstractC5868k.m23674f(startPlayBTVBean, "bean");
        return C1207a2.f4775a.m5508c(startPlayBTVBean, new Function() { // from class: bc.x1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5722Z2;
                m5722Z2 = C1293z1.m5722Z2(C1293z1.this, (StartPlayBTVBean) obj);
                return m5722Z2;
            }
        });
    }

    /* renamed from: Z0 */
    public final Observable m5848Z0(DelFavoriteBean delFavoriteBean) {
        AbstractC5868k.m23674f(delFavoriteBean, "bean");
        return C1207a2.f4775a.m5508c(delFavoriteBean, new Function() { // from class: bc.y1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5725a1;
                m5725a1 = C1293z1.m5725a1(C1293z1.this, (DelFavoriteBean) obj);
                return m5725a1;
            }
        });
    }

    /* renamed from: a2 */
    public final Observable m5849a2(GetPersonBean getPersonBean) {
        AbstractC5868k.m23674f(getPersonBean, "bean");
        return C1207a2.f4775a.m5508c(getPersonBean, new Function() { // from class: bc.h1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5728b2;
                m5728b2 = C1293z1.m5728b2(C1293z1.this, (GetPersonBean) obj);
                return m5728b2;
            }
        });
    }

    /* renamed from: a3 */
    public final Observable m5850a3(StartPlayLiveBean startPlayLiveBean) {
        AbstractC5868k.m23674f(startPlayLiveBean, "bean");
        return C1207a2.f4775a.m5508c(startPlayLiveBean, new Function() { // from class: bc.l0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5729b3;
                m5729b3 = C1293z1.m5729b3(C1293z1.this, (StartPlayLiveBean) obj);
                return m5729b3;
            }
        });
    }

    /* renamed from: b1 */
    public final Observable m5851b1(DelSubscribeBean delSubscribeBean) {
        AbstractC5868k.m23674f(delSubscribeBean, "bean");
        return C1207a2.f4775a.m5508c(delSubscribeBean, new Function() { // from class: bc.a1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5732c1;
                m5732c1 = C1293z1.m5732c1(C1293z1.this, (DelSubscribeBean) obj);
                return m5732c1;
            }
        });
    }

    /* renamed from: c2 */
    public final Observable m5852c2(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "qrtoken");
        return C1207a2.f4775a.m5508c(new GetQrResultBean(str, str2), new Function() { // from class: bc.n1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5735d2;
                m5735d2 = C1293z1.m5735d2(C1293z1.this, (GetQrResultBean) obj);
                return m5735d2;
            }
        });
    }

    /* renamed from: c3 */
    public final Observable m5853c3(StartPlayVODBean startPlayVODBean) {
        AbstractC5868k.m23674f(startPlayVODBean, "bean");
        return C1207a2.f4775a.m5508c(startPlayVODBean, new Function() { // from class: bc.u1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5736d3;
                m5736d3 = C1293z1.m5736d3(C1293z1.this, (StartPlayVODBean) obj);
                return m5736d3;
            }
        });
    }

    /* renamed from: d1 */
    public final Observable m5854d1(DeleteDevicesBean deleteDevicesBean) {
        AbstractC5868k.m23674f(deleteDevicesBean, "bean");
        return C1207a2.f4775a.m5508c(deleteDevicesBean, new Function() { // from class: bc.z0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5739e1;
                m5739e1 = C1293z1.m5739e1(C1293z1.this, (DeleteDevicesBean) obj);
                return m5739e1;
            }
        });
    }

    /* renamed from: e2 */
    public final Observable m5855e2(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "userId");
        return C1207a2.f4775a.m5508c(new GetQRTokenBean(str, str2, str3), new Function() { // from class: bc.c0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5742f2;
                m5742f2 = C1293z1.m5742f2(C1293z1.this, (GetQRTokenBean) obj);
                return m5742f2;
            }
        });
    }

    /* renamed from: e3 */
    public final Call m5856e3(StartPlayVODBean startPlayVODBean) {
        AbstractC5868k.m23674f(startPlayVODBean, "bean");
        Call<StartPlayVODResult> m26688H = this.f4929b.m26688H(HttpConstant.HTTPS, f4925e, AbstractC7027d.m27114a().toJson(startPlayVODBean));
        AbstractC5868k.m23673e(m26688H, "mPortalApi.synchStartPla…HTTPS, PORTAL_MAIN, json)");
        return m26688H;
    }

    /* renamed from: f1 */
    public final Call m5857f1(String str, String str2, String str3, int i10, String str4) {
        AbstractC5868k.m23674f(str, "protocol");
        AbstractC5868k.m23674f(str2, "epgIp");
        AbstractC5868k.m23674f(str3, "timeZone");
        AbstractC5868k.m23674f(str4, "epgFileMd5");
        Call<ResponseBody> m26743p = this.f4929b.m26743p(str, str2, str3, i10, str4);
        AbstractC5868k.m23673e(m26743p, "mPortalApi.downloadEpgIn…ne, liveType, epgFileMd5)");
        return m26743p;
    }

    /* renamed from: f3 */
    public final Observable m5858f3(TerminalAuthBean terminalAuthBean, String str) {
        AbstractC5868k.m23674f(terminalAuthBean, "bean");
        AbstractC5868k.m23674f(str, "schedulerType");
        return C1207a2.f4775a.m5507b(terminalAuthBean, new Function() { // from class: bc.y0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5745g3;
                m5745g3 = C1293z1.m5745g3(C1293z1.this, (TerminalAuthBean) obj);
                return m5745g3;
            }
        }, str);
    }

    /* renamed from: g1 */
    public final Observable m5859g1(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "password");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return C1207a2.f4775a.m5508c(new EmailResetPwdBean("3", str, str2, str3, str4, str5), new Function() { // from class: bc.e0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5748h1;
                m5748h1 = C1293z1.m5748h1(C1293z1.this, (EmailResetPwdBean) obj);
                return m5748h1;
            }
        });
    }

    /* renamed from: g2 */
    public final Observable m5860g2(String str, String str2, String str3, Integer num, String str4, int i10, Integer num2, Integer num3, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        return C1207a2.f4775a.m5508c(new GetColumnContentsBean(str, str2, str3, num, str4, i10, num2, num3, str5), new Function() { // from class: bc.j1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5749h2;
                m5749h2 = C1293z1.m5749h2(C1293z1.this, (GetColumnContentsBean) obj);
                return m5749h2;
            }
        });
    }

    /* renamed from: i1 */
    public final Observable m5861i1(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "exchangeCode");
        AbstractC5868k.m23674f(str4, "portalCode");
        return C1207a2.f4775a.m5508c(new ExchangeBean(str, str2, str3, str4), new Function() { // from class: bc.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5755j1;
                m5755j1 = C1293z1.m5755j1(C1293z1.this, (ExchangeBean) obj);
                return m5755j1;
            }
        });
    }

    /* renamed from: i2 */
    public final Observable m5862i2(GetRecommendsBean getRecommendsBean, String str) {
        AbstractC5868k.m23674f(getRecommendsBean, "bean");
        AbstractC5868k.m23674f(str, "schedulerType");
        return C1207a2.f4775a.m5507b(getRecommendsBean, new Function() { // from class: bc.s1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5756j2;
                m5756j2 = C1293z1.m5756j2(C1293z1.this, (GetRecommendsBean) obj);
                return m5756j2;
            }
        }, str);
    }

    /* renamed from: i3 */
    public final Observable m5863i3(UpdateDeviceTokenBean updateDeviceTokenBean) {
        AbstractC5868k.m23674f(updateDeviceTokenBean, "bean");
        return C1207a2.f4775a.m5508c(updateDeviceTokenBean, new Function() { // from class: bc.p
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5757j3;
                m5757j3 = C1293z1.m5757j3(C1293z1.this, (UpdateDeviceTokenBean) obj);
                return m5757j3;
            }
        });
    }

    /* renamed from: k1 */
    public final Observable m5864k1(FilterByContentBean filterByContentBean) {
        AbstractC5868k.m23674f(filterByContentBean, "bean");
        return C1207a2.f4775a.m5508c(filterByContentBean, new Function() { // from class: bc.y
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5763l1;
                m5763l1 = C1293z1.m5763l1(C1293z1.this, (FilterByContentBean) obj);
                return m5763l1;
            }
        });
    }

    /* renamed from: k3 */
    public final Observable m5865k3(UpdatePwdBean updatePwdBean) {
        AbstractC5868k.m23674f(updatePwdBean, "bean");
        return C1207a2.f4775a.m5508c(updatePwdBean, new Function() { // from class: bc.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5764l3;
                m5764l3 = C1293z1.m5764l3(C1293z1.this, (UpdatePwdBean) obj);
                return m5764l3;
            }
        });
    }

    /* renamed from: l2 */
    public final Observable m5866l2(String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, int i13) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "columnType");
        return C1207a2.f4775a.m5508c(new GetShelveBean(str, str2, str3, i10, str4, i11, i12, num, Integer.valueOf(i13)), new Function() { // from class: bc.x
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5767m2;
                m5767m2 = C1293z1.m5767m2(C1293z1.this, (GetShelveBean) obj);
                return m5767m2;
            }
        });
    }

    /* renamed from: m1 */
    public final Observable m5867m1(FilterGenreBean filterGenreBean) {
        AbstractC5868k.m23674f(filterGenreBean, "bean");
        return C1207a2.f4775a.m5508c(filterGenreBean, new Function() { // from class: bc.x0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5770n1;
                m5770n1 = C1293z1.m5770n1(C1293z1.this, (FilterGenreBean) obj);
                return m5770n1;
            }
        });
    }

    /* renamed from: m3 */
    public final Observable m5868m3(RestrictedStatusBean restrictedStatusBean) {
        AbstractC5868k.m23674f(restrictedStatusBean, "bean");
        return C1207a2.f4775a.m5508c(restrictedStatusBean, new Function() { // from class: bc.r
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5771n3;
                m5771n3 = C1293z1.m5771n3(C1293z1.this, (RestrictedStatusBean) obj);
                return m5771n3;
            }
        });
    }

    /* renamed from: n2 */
    public final Observable m5869n2(String str) {
        AbstractC5868k.m23674f(str, "appId");
        Observable<R> compose = this.f4929b.m26698M(HttpConstant.HTTP, f4925e, str).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends ShelveMatchResult>>) C6569c.f25182a.m25643b(this.f4929b.m26698M(HttpConstant.HTTP, f4926f, str))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getShelveMatc…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: o1 */
    public final Observable m5870o1(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "appId");
        AbstractC5868k.m23674f(str2, "match");
        AbstractC5868k.m23674f(str3, "gameId");
        Observable<R> compose = this.f4929b.m26679C0(HttpConstant.HTTP, f4925e, str, str2, str3, i10).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends FootballMatchResult>>) C6569c.f25182a.m25643b(this.f4929b.m26679C0(HttpConstant.HTTP, f4926f, str, str2, str3, i10))).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "mPortalApi.getAllMatch(I…chedulerHelper.io2main())");
        return compose;
    }

    /* renamed from: o2 */
    public final Observable m5871o2(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String[] strArr, String str9) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "hasPay");
        AbstractC5868k.m23674f(str5, "identity");
        AbstractC5868k.m23674f(str6, "type");
        AbstractC5868k.m23674f(str7, "appVer");
        AbstractC5868k.m23674f(str8, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        return C1207a2.f4775a.m5508c(AbstractApplicationC6253c.f24484b.m24887a(), new Function() { // from class: bc.f1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5781q2;
                m5781q2 = C1293z1.m5781q2(C1293z1.this, str, str2, str4, str5, str3, str6, str7, str8, strArr, (Context) obj);
                return m5781q2;
            }
        });
    }

    /* renamed from: o3 */
    public final Observable m5872o3(UserFeedBackBean userFeedBackBean) {
        AbstractC5868k.m23674f(userFeedBackBean, "userFeedBackBean");
        return C1207a2.f4775a.m5508c(userFeedBackBean, new Function() { // from class: bc.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5777p3;
                m5777p3 = C1293z1.m5777p3(C1293z1.this, (UserFeedBackBean) obj);
                return m5777p3;
            }
        });
    }

    /* renamed from: p1 */
    public final Observable m5873p1(String str, String str2) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        return C1207a2.f4775a.m5508c(new GetAreaCodeBean(str, str2), new Function() { // from class: bc.q
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5780q1;
                m5780q1 = C1293z1.m5780q1(C1293z1.this, (GetAreaCodeBean) obj);
                return m5780q1;
            }
        });
    }

    /* renamed from: q3 */
    public final Observable m5874q3(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return C1207a2.f4775a.m5508c(new VerifyEmailCodeBean(str, str2, str3, str4, str5), new Function() { // from class: bc.n
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5784r3;
                m5784r3 = C1293z1.m5784r3(C1293z1.this, (VerifyEmailCodeBean) obj);
                return m5784r3;
            }
        });
    }

    /* renamed from: r1 */
    public final Observable m5875r1(GetAuthInfoBean getAuthInfoBean) {
        AbstractC5868k.m23674f(getAuthInfoBean, "bean");
        return C1207a2.f4775a.m5508c(getAuthInfoBean, new Function() { // from class: bc.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5787s1;
                m5787s1 = C1293z1.m5787s1(C1293z1.this, (GetAuthInfoBean) obj);
                return m5787s1;
            }
        });
    }

    /* renamed from: r2 */
    public final Observable m5876r2(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String[] strArr, String str9) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "hasPay");
        AbstractC5868k.m23674f(str5, "identity");
        AbstractC5868k.m23674f(str6, "type");
        AbstractC5868k.m23674f(str7, "appVer");
        AbstractC5868k.m23674f(str8, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        return C1207a2.f4775a.m5508c(AbstractApplicationC6253c.f24484b.m24887a(), new Function() { // from class: bc.m1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5791t2;
                m5791t2 = C1293z1.m5791t2(C1293z1.this, str, str2, str4, str5, str3, str6, str7, str8, strArr, (Context) obj);
                return m5791t2;
            }
        });
    }

    /* renamed from: t1 */
    public final Observable m5877t1(GetColumnContentsBean getColumnContentsBean, String str) {
        AbstractC5868k.m23674f(getColumnContentsBean, "bean");
        AbstractC5868k.m23674f(str, "schedulerType");
        return C1207a2.f4775a.m5507b(getColumnContentsBean, new Function() { // from class: bc.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5794u1;
                m5794u1 = C1293z1.m5794u1(C1293z1.this, (GetColumnContentsBean) obj);
                return m5794u1;
            }
        }, str);
    }

    /* renamed from: u2 */
    public final Observable m5878u2(SnTokenBean snTokenBean) {
        AbstractC5868k.m23674f(snTokenBean, "bean");
        return C1207a2.f4775a.m5506a(snTokenBean, new Function() { // from class: bc.o1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5797v2;
                m5797v2 = C1293z1.m5797v2(C1293z1.this, (SnTokenBean) obj);
                return m5797v2;
            }
        });
    }

    /* renamed from: v1 */
    public final Observable m5879v1(ConfigBean configBean) {
        AbstractC5868k.m23674f(configBean, "configBean");
        return C1207a2.f4775a.m5508c(configBean, new Function() { // from class: bc.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5799w1;
                m5799w1 = C1293z1.m5799w1(C1293z1.this, (ConfigBean) obj);
                return m5799w1;
            }
        });
    }

    /* renamed from: w0 */
    public final Observable m5880w0(ActiveBean activeBean, String str) {
        AbstractC5868k.m23674f(activeBean, "bean");
        AbstractC5868k.m23674f(str, "schedulerType");
        return C1207a2.f4775a.m5507b(activeBean, new Function() { // from class: bc.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5802x0;
                m5802x0 = C1293z1.m5802x0(C1293z1.this, (ActiveBean) obj);
                return m5802x0;
            }
        }, str);
    }

    /* renamed from: x1 */
    public final Observable m5881x1(GetDevicesBean getDevicesBean) {
        AbstractC5868k.m23674f(getDevicesBean, "bean");
        return C1207a2.f4775a.m5508c(getDevicesBean, new Function() { // from class: bc.q0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5805y1;
                m5805y1 = C1293z1.m5805y1(C1293z1.this, (GetDevicesBean) obj);
                return m5805y1;
            }
        });
    }

    /* renamed from: x2 */
    public final Observable m5882x2(GetSubscribeBean getSubscribeBean) {
        AbstractC5868k.m23674f(getSubscribeBean, "bean");
        return C1207a2.f4775a.m5508c(getSubscribeBean, new Function() { // from class: bc.r0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5806y2;
                m5806y2 = C1293z1.m5806y2(C1293z1.this, (GetSubscribeBean) obj);
                return m5806y2;
            }
        });
    }

    /* renamed from: z0 */
    public final Observable m5883z0(AddFavoriteBean addFavoriteBean) {
        AbstractC5868k.m23674f(addFavoriteBean, "bean");
        return C1207a2.f4775a.m5508c(addFavoriteBean, new Function() { // from class: bc.u
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5661A0;
                m5661A0 = C1293z1.m5661A0(C1293z1.this, (AddFavoriteBean) obj);
                return m5661A0;
            }
        });
    }

    /* renamed from: z1 */
    public final Observable m5884z1() {
        Observable<GetEmailSuffixResult> onErrorResumeNext = this.f4929b.m26675A0(HttpConstant.HTTPS, f4925e, "").onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends GetEmailSuffixResult>>) C6569c.f25182a.m25643b(this.f4929b.m26675A0(HttpConstant.HTTPS, f4926f, "")));
        AbstractC5868k.m23673e(onErrorResumeNext, "mPortalApi.getEmailSuffi…TPS, PORTAL_SECOND, \"\")))");
        return onErrorResumeNext;
    }

    /* renamed from: z2 */
    public final Observable m5885z2(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return C1207a2.f4775a.m5508c(new GetVerifiCodeBean(str, str2, str3, str4, str5), new Function() { // from class: bc.i1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5662A2;
                m5662A2 = C1293z1.m5662A2(C1293z1.this, (GetVerifiCodeBean) obj);
                return m5662A2;
            }
        });
    }
}
