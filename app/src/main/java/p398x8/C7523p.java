package p398x8;

import ac.C0130a;
import ac.C0147e0;
import ac.C0151f0;
import ac.C0159h0;
import ac.C0162i;
import ac.C0173k2;
import ac.C0174l;
import ac.C0175l0;
import ac.C0180m1;
import ac.C0222x1;
import ac.C0225y1;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import cc.C1447d;
import cc.C1461k;
import cc.C1466m0;
import cc.C1473s;
import cc.C1474t;
import cc.C1477w;
import com.advertlib.bean.AdInfo;
import com.main.R$string;
import com.mobile.bean.UpdateBean;
import com.module.event.ChangeUserAccountSuccessEvent;
import com.module.event.ClosePersonalEvent;
import com.module.event.FreeColumnGetDataEvent;
import com.module.event.LoginSuccessEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.LogoutEvent;
import com.module.event.MsgUnReadSizeUpdateEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.event.RequestLiveColumnSuccessEvent;
import com.module.event.ShowErrorMsgEvent;
import com.module.event.UpdateLiveNoticeEvent;
import com.module.p069db.UmengPush;
import com.module.p069db.UmengPushDao;
import com.request.result.ActiveData;
import com.request.result.ActiveResult;
import com.request.result.ApkQueryCouponResult;
import com.request.result.ApkReceiveCouponResult;
import com.request.result.AvailableCouponCodeList;
import com.request.result.BaseResult;
import com.request.result.ChildColumn;
import com.request.result.CouponCodeList;
import com.request.result.ForceBindData;
import com.request.result.FreeDataBean;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import com.request.result.GetDeviceResult;
import com.request.result.GetSlbInfoBeanResultData;
import com.request.result.GiftDaysData;
import com.request.result.LoginResult;
import com.request.result.LoginResultData;
import com.request.result.QueryCouponData;
import com.request.result.UserInfo;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.analytics.pro.C3384f;
import gd.EnumC4431a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5878u;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p040c8.C1407f;
import p040c8.C1428w;
import p131f9.C4296a;
import p132fa.C4297a;
import p132fa.C4300d;
import p135fd.C4307b;
import p170i2.C4842a;
import p179ib.AbstractC4929f;
import p185j2.C4982a;
import p193ja.C5044a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5086c;
import p201k2.AbstractC5094k;
import p201k2.C5090g;
import p242n0.C5714a;
import p258o3.C5912h;
import p277p0.C6156m;
import p286p9.C6242a;
import p287pb.AbstractApplicationC6253c;
import p300q9.C6355c;
import p301qb.InterfaceC6368a;
import p301qb.InterfaceC6369a0;
import p301qb.InterfaceC6371b;
import p301qb.InterfaceC6374c;
import p301qb.InterfaceC6375c0;
import p301qb.InterfaceC6377d;
import p301qb.InterfaceC6381e0;
import p301qb.InterfaceC6395j;
import p301qb.InterfaceC6423s0;
import p301qb.InterfaceC6432v0;
import p301qb.InterfaceC6443z;
import p301qb.InterfaceC6444z0;
import p315r9.InterfaceC6563a;
import p317rb.AbstractC6567a;
import p330s9.DialogC6773a;
import p330s9.DialogC6774b;
import p340t8.C6926a;
import p341t9.AbstractC6927a;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p355u9.AbstractC7063c;
import p359ue.AbstractC7166t;
import p369v8.InterfaceC7249a;
import p371vb.C7252a;
import p398x8.C7523p;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7577i1;
import p400xa.C7584l;
import p400xa.C7586l1;
import p400xa.C7589m1;
import p400xa.C7592n1;
import p400xa.C7609t0;
import p400xa.C7610t1;
import p400xa.C7615w;
import p400xa.RunnableC7583k1;
import p415y9.AbstractApplicationC7689d;
import p421z0.C7734h;
import p430z9.AbstractActivityC7763a;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import ye.C7709c;
import ye.InterfaceC7719m;
import za.C7776f;
import za.C7777g;

/* renamed from: x8.p */
/* loaded from: classes.dex */
public final class C7523p implements InterfaceC1439a, InterfaceC6377d, InterfaceC6375c0, InterfaceC6368a, InterfaceC6395j, InterfaceC6423s0, InterfaceC6369a0, InterfaceC6443z, InterfaceC6444z0, InterfaceC6381e0, InterfaceC6371b, InterfaceC6374c {

    /* renamed from: a */
    private AbstractActivityC7763a f27612a;

    /* renamed from: b */
    private InterfaceC7249a f27613b;

    /* renamed from: c */
    private final String f27614c;

    /* renamed from: d */
    private C0130a f27615d;

    /* renamed from: e */
    private final InterfaceC1312h f27616e;

    /* renamed from: f */
    private final InterfaceC1312h f27617f;

    /* renamed from: g */
    private final InterfaceC1312h f27618g;

    /* renamed from: h */
    private final InterfaceC1312h f27619h;

    /* renamed from: i */
    private final InterfaceC1312h f27620i;

    /* renamed from: j */
    private final InterfaceC1312h f27621j;

    /* renamed from: k */
    private Map f27622k;

    /* renamed from: l */
    private boolean f27623l;

    /* renamed from: m */
    private C0222x1 f27624m;

    /* renamed from: n */
    private C0162i f27625n;

    /* renamed from: o */
    private C0174l f27626o;

    /* renamed from: p */
    private C0159h0 f27627p;

    /* renamed from: q */
    private Dialog f27628q;

    /* renamed from: r */
    private RunnableC7583k1 f27629r;

    /* renamed from: s */
    private final InterfaceC1312h f27630s;

    /* renamed from: t */
    private final InterfaceC1312h f27631t;

    /* renamed from: u */
    private int f27632u;

    /* renamed from: v */
    private boolean f27633v;

    /* renamed from: w */
    private int f27634w;

    /* renamed from: x */
    private List f27635x;

    /* renamed from: x8.p$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Integer num) {
            AbstractC5868k.m23674f(num, "it");
            boolean z10 = false;
            if (num.intValue() == Settings.Global.getInt(C7523p.this.m28799Y4().getContentResolver(), "always_finish_activities", 0)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: x8.p$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Boolean bool) {
            String m6870i = null;
            AbstractC5868k.m23674f(bool, "isAlwaysFinish");
            if (bool.booleanValue()) {
                C1466m0 c1466m0 = C1466m0.f5627a;
                if (AbstractC6567a.m25637g(c1466m0.m6878m())) {
                    m6870i = c1466m0.m6878m();
                } else {
                    m6870i = c1466m0.m6870i();
                }
                String valueOf = String.valueOf(AbstractC5085b.m20602l(C7523p.this.m28799Y4()));
                C7589m1 c7589m1 = C7589m1.f27886a;
                String str = Build.MODEL;
                AbstractC5868k.m23673e(str, "MODEL");
                String str2 = Build.VERSION.RELEASE;
                AbstractC5868k.m23673e(str2, "RELEASE");
                c7589m1.m29133b(m6870i, valueOf, str, str2, "EVENT_NOT_KEEP_ACTIVITIES");
            }
            return bool;
        }
    }

    /* renamed from: x8.p$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m28818a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                C7523p.this.m28800Z5().mo11834R1();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28818a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: x8.p$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f27639a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m28819a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28819a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: x8.p$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC6563a {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m28821e(UmengPush umengPush) {
            AbstractC5868k.m23674f(umengPush, "$message");
            new UmengPushDao().addOrUpdateUpgradeMessage(umengPush);
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: b */
        public void mo19703b() {
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo19702a(UpdateBean updateBean) {
            C7523p.this.m28780p6(updateBean);
            if (updateBean != null) {
                final UmengPush umengPush = new UmengPush();
                umengPush.setMsgId(updateBean.versionName);
                umengPush.setTicker(C7523p.this.m28799Y4().getString(R$string.push_update_title));
                umengPush.setTitle(updateBean.versionName);
                umengPush.setText(AbstractC7555b0.m28951e(updateBean.note));
                umengPush.setMessageType(UmengPush.TYPE_UPGRADE);
                umengPush.setMessageTime(AbstractC5086c.m20616i("yyyy-MM-dd HH:mm"));
                umengPush.setStatus(UmengPush.UN_READ);
                AbstractC7030g.m27129c("update msg", new Runnable() { // from class: x8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7523p.e.m28821e(UmengPush.this);
                    }
                }, false);
                C7709c.m29787d().m29801m(new MsgUnReadSizeUpdateEvent());
            }
        }

        @Override // p315r9.InterfaceC6563a
        public void onError(Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8.p$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f27642b;

        /* renamed from: c */
        final /* synthetic */ int f27643c;

        /* renamed from: d */
        final /* synthetic */ Integer f27644d;

        /* renamed from: e */
        final /* synthetic */ String f27645e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C5878u c5878u, int i10, Integer num, String str) {
            super(1);
            this.f27642b = c5878u;
            this.f27643c = i10;
            this.f27644d = num;
            this.f27645e = str;
        }

        /* renamed from: a */
        public final void m28823a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                C7523p c7523p = C7523p.this;
                Object obj = this.f27642b.f23412a;
                AbstractC5868k.m23671c(obj);
                c7523p.mo23209L2((GetColumnContentsResult) obj, this.f27643c);
                return;
            }
            C7523p c7523p2 = C7523p.this;
            c7523p2.f27627p = new C0159h0(c7523p2, "ioSchedulers");
            C0159h0 c0159h0 = C7523p.this.f27627p;
            if (c0159h0 == null) {
                AbstractC5868k.m23686r("mGetColumnContentsModel");
                c0159h0 = null;
            }
            c0159h0.m607b(this.f27644d, this.f27645e, 1, 1000, null, this.f27643c, C7523p.this.m28737D5());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28823a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8.p$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f27646a = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m28824a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28824a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8.p$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(String str) {
            String str2 = null;
            AbstractC5868k.m23674f(str, "it");
            C1473s.f5656a.m6918b(0);
            C7252a.f27087a.m28078m((String) C7577i1.f27838b.m29084c().m29074f("key_device_tag", ""));
            C7523p.this.m28746K5().m638k();
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
            C0173k2.m634i(C7523p.this.m28746K5(), "merge", C4842a.f20329a.m19920a().mo19962k(), new String[]{C4300d.f18678a.m18035h()}, str2, str3, false, 32, null);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8.p$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f27648a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m28826a(String str) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28826a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8.p$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f27649a = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m28827a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28827a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: x8.p$k */
    /* loaded from: classes2.dex */
    static final class k extends AbstractC5869l implements InterfaceC5642a {
        k() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0147e0 invoke() {
            return new C0147e0(C7523p.this);
        }
    }

    /* renamed from: x8.p$l */
    /* loaded from: classes2.dex */
    static final class l extends AbstractC5869l implements InterfaceC5642a {
        l() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0151f0 invoke() {
            return new C0151f0(C7523p.this);
        }
    }

    /* renamed from: x8.p$m */
    /* loaded from: classes2.dex */
    static final class m extends AbstractC5869l implements InterfaceC5642a {
        m() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0175l0 invoke() {
            return new C0175l0(C7523p.this);
        }
    }

    /* renamed from: x8.p$n */
    /* loaded from: classes2.dex */
    static final class n extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final n f27653a = new n();

        n() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (C4842a.f20329a.m19920a().m19932I()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
    }

    /* renamed from: x8.p$o */
    /* loaded from: classes2.dex */
    static final class o extends AbstractC5869l implements InterfaceC5642a {
        o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(C7523p.this, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: x8.p$p */
    /* loaded from: classes2.dex */
    static final class p extends AbstractC5869l implements InterfaceC5642a {
        p() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0225y1 invoke() {
            return new C0225y1(C7523p.this);
        }
    }

    /* renamed from: x8.p$q */
    /* loaded from: classes2.dex */
    static final class q extends AbstractC5869l implements InterfaceC5642a {
        q() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0173k2 invoke() {
            return new C0173k2(C7523p.this);
        }
    }

    /* renamed from: x8.p$r */
    /* loaded from: classes2.dex */
    static final class r extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final r f27657a = new r();

        r() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4296a invoke() {
            return new C4296a();
        }
    }

    /* renamed from: x8.p$s */
    /* loaded from: classes2.dex */
    public static final class s implements C7776f.a {
        s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m28837c(C7523p c7523p) {
            AbstractC5868k.m23674f(c7523p, "this$0");
            c7523p.m28808m2();
            c7523p.m28813t5();
            AbstractC4929f.m20255e(c7523p.m28799Y4());
        }

        @Override // za.C7776f.a
        /* renamed from: a */
        public void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3) {
            boolean z11 = false;
            String str4 = null;
            LoginResultData data;
            LoginResultData data2;
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
            AbstractC5868k.m23674f(str2, "uri");
            AbstractC5868k.m23674f(str3, "accountType");
            AbstractActivityC7763a m28799Y4 = C7523p.this.m28799Y4();
            if (m28799Y4 != null && m28799Y4.isFinishing()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
            if (z10) {
                if (C7523p.this.m28800Z5().mo11830G3() == 1) {
                    String str5 = null;
                    if (loginResult != null && (data2 = loginResult.getData()) != null) {
                        str4 = data2.getPwdTip();
                    } else {
                        str4 = null;
                    }
                    if (AbstractC5868k.m23669a(str4, "yes")) {
                        if (loginResult != null && (data = loginResult.getData()) != null) {
                            str5 = data.getHasPwd();
                        }
                        if (AbstractC5868k.m23669a(str5, "1")) {
                            C7523p.this.m28800Z5().mo11841e();
                        }
                    }
                    if (activeResult != null) {
                        C7523p.this.m28765b5(activeResult);
                        if (C4842a.f20329a.m19920a().mo19936M()) {
                            C7523p.this.m28745K4(activeResult.getData());
                        }
                    } else if (loginResult != null) {
                        C7523p.this.m28769e5(loginResult);
                    } else {
                        C7523p.this.m28808m2();
                    }
                    C7523p.this.m28813t5();
                    return;
                }
                final C7523p c7523p = C7523p.this;
                AbstractC7030g.m27129c("onHomeAppStart", new Runnable() { // from class: x8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7523p.s.m28837c(C7523p.this);
                    }
                }, false);
                return;
            }
            if (AbstractC6567a.m25637g(str)) {
                C1474t.f5658a.m6919a(str);
                C7709c.m29787d().m29801m(new ShowErrorMsgEvent(str, str2));
            }
        }
    }

    /* renamed from: x8.p$t */
    /* loaded from: classes2.dex */
    public static final class t implements InterfaceC6432v0 {
        t() {
        }

        @Override // p301qb.InterfaceC6432v0
        /* renamed from: c */
        public void mo11978c(String str) {
            AbstractC5868k.m23674f(str, "errCode");
            C7523p.this.m28800Z5().mo11829B(str);
        }
    }

    /* renamed from: x8.p$u */
    /* loaded from: classes2.dex */
    public static final class u extends AbstractC6929a {
        u() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
        }
    }

    public C7523p(AbstractActivityC7763a abstractActivityC7763a, InterfaceC7249a interfaceC7249a) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        InterfaceC1312h m5965b6;
        InterfaceC1312h m5965b7;
        InterfaceC1312h m5965b8;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC7249a, "view");
        this.f27612a = abstractActivityC7763a;
        this.f27613b = interfaceC7249a;
        this.f27614c = C7523p.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new q());
        this.f27616e = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new l());
        this.f27617f = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new k());
        this.f27618g = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new o());
        this.f27619h = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(new m());
        this.f27620i = m5965b5;
        m5965b6 = AbstractC1314j.m5965b(new p());
        this.f27621j = m5965b6;
        this.f27622k = new LinkedHashMap();
        m5965b7 = AbstractC1314j.m5965b(n.f27653a);
        this.f27630s = m5965b7;
        m5965b8 = AbstractC1314j.m5965b(r.f27657a);
        this.f27631t = m5965b8;
        this.f27632u = -1;
    }

    /* renamed from: A5 */
    private final C0151f0 m28733A5() {
        return (C0151f0) this.f27617f.getValue();
    }

    /* renamed from: B5 */
    private final C0175l0 m28734B5() {
        return (C0175l0) this.f27620i.getValue();
    }

    /* renamed from: C4 */
    static /* synthetic */ void m28735C4(C7523p c7523p, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        c7523p.m28791x4(i10, z10);
    }

    /* renamed from: D4 */
    private final void m28736D4(boolean z10, int i10) {
        if (z10) {
            this.f27613b.mo11844k3();
        }
        int i11 = this.f27632u;
        if (i11 == -1) {
            if (z10) {
                this.f27613b.mo11848o0();
                return;
            } else {
                this.f27613b.mo11853y2(i10);
                return;
            }
        }
        if (i11 == 0) {
            this.f27633v = true;
            this.f27634w = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D5 */
    public final String m28737D5() {
        return (String) this.f27630s.getValue();
    }

    /* renamed from: F5 */
    private final C0180m1 m28740F5() {
        return (C0180m1) this.f27619h.getValue();
    }

    /* renamed from: H5 */
    private final C0225y1 m28742H5() {
        return (C0225y1) this.f27621j.getValue();
    }

    /* renamed from: I4 */
    static /* synthetic */ void m28743I4(C7523p c7523p, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        c7523p.m28736D4(z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K4 */
    public final void m28745K4(ActiveData activeData) {
        long j10;
        if (!AbstractC5868k.m23669a(activeData.getBindMail(), MessageService.MSG_DB_READY_REPORT)) {
            return;
        }
        C7577i1.f fVar = C7577i1.f27838b;
        if (((Boolean) fVar.m29084c().m29074f("force_bind_not_email", Boolean.FALSE)).booleanValue()) {
            return;
        }
        String nowTime = activeData.getNowTime();
        if (nowTime != null) {
            j10 = m28753P5(nowTime);
        } else {
            j10 = 0;
        }
        C7252a c7252a = C7252a.f27087a;
        c7252a.m28079n(String.valueOf(j10));
        if (AbstractC5868k.m23669a((String) fVar.m29084c().m29074f("first_active_time", MessageService.MSG_DB_READY_REPORT), MessageService.MSG_DB_READY_REPORT)) {
            fVar.m29084c().m29076h("first_active_time", c7252a.m28069d());
        }
        int intValue = ((Number) fVar.m29084c().m29074f("force_bind_days", 0)).intValue();
        if (intValue > 0) {
            m28791x4(intValue, true);
        } else {
            m28793z5().m561b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K5 */
    public final C0173k2 m28746K5() {
        return (C0173k2) this.f27616e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public static final Boolean m28747N4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public static final Boolean m28749O4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: O5 */
    private final C4296a m28750O5() {
        return (C4296a) this.f27631t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public static final void m28752P4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: P5 */
    private final long m28753P5(String str) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        if (parse != null) {
            return parse.getTime();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final void m28755Q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5 */
    public static final void m28757U5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W5 */
    public static final void m28759W5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: X2 */
    private final void m28760X2() {
        GetAuthInfoResultData getAuthInfoResultData;
        long j10;
        String str = null;
        this.f27624m = new C0222x1(this);
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str2 = c1466m0.m6878m() + "isHasCouponQualification";
        String str3 = c1466m0.m6878m() + "couponQualificationTime";
        String str4 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        long parseLong = Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str3, MessageService.MSG_DB_READY_REPORT));
        long parseLong2 = Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str4, MessageService.MSG_DB_READY_REPORT));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        AbstractC5868k.m23671c(getAuthInfoResultData);
        Date parse = simpleDateFormat.parse(getAuthInfoResultData.getNowTime());
        if (parse != null) {
            j10 = parse.getTime();
        } else {
            j10 = 0;
        }
        if (j10 - parseLong < parseLong2) {
            c1466m0.m6850W(((Boolean) c4982a.m20333a(aVar.m29494a(), str2, Boolean.FALSE)).booleanValue());
            str = null;
        } else {
            str = "1";
        }
        C0222x1 c0222x1 = this.f27624m;
        if (c0222x1 == null) {
            AbstractC5868k.m23686r("mQueryCouponModel");
            c0222x1 = null;
        }
        c0222x1.m780c(c1466m0.m6878m(), c1466m0.m6879n(), null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y5 */
    public static final String m28763Y5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5 */
    public final void m28765b5(ActiveResult activeResult) {
        String str = "";
        GetAuthInfoResult getAuthInfoResult = new GetAuthInfoResult("", "", new GetAuthInfoResultData(activeResult.getData().getAuthInfoList(), activeResult.getData().getBindMail(), activeResult.getData().getBindMobile(), activeResult.getData().getHasPay(), activeResult.getData().getRestrictedStatus(), activeResult.getData().getChildLockPwd(), activeResult.getData().getHasPwd(), activeResult.getData().getNowTime(), activeResult.getData().getTips(), activeResult.getData().getType(), activeResult.getData().getRemainingDays(), activeResult.getData().getQrcodeMessage(), activeResult.getData().getQrcodeDisplay(), activeResult.getData().getPayCoreAddress(), activeResult.getData().getUserType(), activeResult.getData().getUserIdentity(), activeResult.getData().getGetFreeAuthFlag(), activeResult.getData().getGetFreeAuthDays(), activeResult.getData().getHasFreeAuth(), activeResult.getData().getShowFlag(), activeResult.getData().getShowType(), activeResult.getData().getRenewFlag(), activeResult.getData().getPlaylistUrl(), activeResult.getData().getAreaFlag(), activeResult.getData().getChargeFlag()));
        C7252a c7252a = C7252a.f27087a;
        c7252a.m28082q(getAuthInfoResult);
        if (AbstractC6567a.m25637g(activeResult.getData().getPayCoreAddress())) {
            String payCoreAddress = activeResult.getData().getPayCoreAddress();
            if (payCoreAddress != null) {
                str = payCoreAddress;
            }
            c7252a.m28083r(str);
        }
        mo20403d0(getAuthInfoResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public final void m28769e5(LoginResult loginResult) {
        String str = "";
        GetAuthInfoResult getAuthInfoResult = new GetAuthInfoResult("", "", new GetAuthInfoResultData(loginResult.getData().getAuthInfoList(), loginResult.getData().getBindMail(), loginResult.getData().getBindMobile(), loginResult.getData().getHasPay(), loginResult.getData().getRestrictedStatus(), loginResult.getData().getChildLockPwd(), loginResult.getData().getHasPwd(), loginResult.getData().getNowTime(), loginResult.getData().getTips(), loginResult.getData().getType(), loginResult.getData().getRemainingDays(), loginResult.getData().getQrcodeMessage(), loginResult.getData().getQrcodeDisplay(), loginResult.getData().getPayCoreAddress(), loginResult.getData().getUserType(), loginResult.getData().getUserIdentity(), loginResult.getData().getGetFreeAuthFlag(), loginResult.getData().getGetFreeAuthDays(), loginResult.getData().getHasFreeAuth(), loginResult.getData().getShowFlag(), loginResult.getData().getShowType(), loginResult.getData().getRenewFlag(), loginResult.getData().getPlaylistUrl(), loginResult.getData().getAreaFlag(), loginResult.getData().getChargeFlag()));
        C7252a c7252a = C7252a.f27087a;
        c7252a.m28082q(getAuthInfoResult);
        if (AbstractC6567a.m25637g(loginResult.getData().getPayCoreAddress())) {
            String payCoreAddress = loginResult.getData().getPayCoreAddress();
            if (payCoreAddress != null) {
                str = payCoreAddress;
            }
            c7252a.m28083r(str);
        }
        mo20403d0(getAuthInfoResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h6 */
    public static final void m28772h6(C7523p c7523p, ActiveResult activeResult) {
        AbstractC5868k.m23674f(c7523p, "this$0");
        AbstractC5868k.m23674f(activeResult, "$it");
        c7523p.m28765b5(activeResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* renamed from: i5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28773i5(ne.C5878u r17, int r18, p398x8.C7523p r19, ne.C5878u r20, io.reactivex.ObservableEmitter r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p398x8.C7523p.m28773i5(ne.u, int, x8.p, ne.u, io.reactivex.ObservableEmitter):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6 */
    public static final void m28774i6(C7523p c7523p, LoginSuccessRequestDataEvent loginSuccessRequestDataEvent) {
        AbstractC5868k.m23674f(c7523p, "this$0");
        AbstractC5868k.m23674f(loginSuccessRequestDataEvent, "$event");
        LoginResult loginResult = loginSuccessRequestDataEvent.getLoginResult();
        AbstractC5868k.m23671c(loginResult);
        c7523p.m28769e5(loginResult);
    }

    /* renamed from: j6 */
    private final void m28775j6() {
        if (!C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29803r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public static final void m28777k5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: k6 */
    private final void m28778k6() {
        RunnableC7583k1 runnableC7583k1 = new RunnableC7583k1();
        this.f27629r = runnableC7583k1;
        runnableC7583k1.m29099a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public static final void m28779o5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6 */
    public final void m28780p6(UpdateBean updateBean) {
        int i10 = 0;
        String m6870i = null;
        if (updateBean == null) {
            return;
        }
        if (updateBean.forceUpdate == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f27632u = i10;
        C6355c c6355c = new C6355c();
        C4842a c4842a = C4842a.f20329a;
        if (AbstractC6567a.m25634d(c4842a.m19920a().mo19957f())) {
            c6355c.m25151m("");
        } else {
            String defaultDownloadUrl = updateBean.getDefaultDownloadUrl();
            if (AbstractC6567a.m25634d(defaultDownloadUrl)) {
                defaultDownloadUrl = c4842a.m19920a().mo19957f();
            }
            c6355c.m25151m(defaultDownloadUrl);
        }
        c6355c.m25153o(C7615w.f27995a.m29302F());
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        Context m29494a = aVar.m29494a();
        AbstractC5868k.m23671c(m29494a);
        c6355c.m25149k(m29494a.getString(com.module.R$string.version_format, AbstractC5085b.m20603m(aVar.m29494a())));
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC6567a.m25637g(c1466m0.m6878m())) {
            m6870i = c1466m0.m6878m();
        } else {
            m6870i = c1466m0.m6870i();
        }
        c6355c.m25157s(m6870i);
        c6355c.m25154p(updateBean.md5);
        c6355c.m25156r(updateBean.url + AbstractC7598p1.m29239c());
        c6355c.m25155q(updateBean.spareUrl + AbstractC7598p1.m29239c());
        c6355c.m25152n(AbstractC7063c.m27217d(this.f27612a, aVar.m29495b()));
        if (updateBean.forceUpdate == 1) {
            c6355c.m25150l(true);
            DialogC6773a dialogC6773a = new DialogC6773a(this.f27612a, updateBean, c6355c);
            dialogC6773a.m26651e(new DialogC6773a.a() { // from class: x8.e
                @Override // p330s9.DialogC6773a.a
                /* renamed from: a */
                public final void mo26652a() {
                    C7523p.m28782q6(C7523p.this);
                }
            });
            this.f27628q = dialogC6773a;
        } else {
            c6355c.m25150l(false);
            DialogC6774b dialogC6774b = new DialogC6774b(this.f27612a, updateBean, c6355c);
            this.f27628q = dialogC6774b;
            AbstractC5868k.m23671c(dialogC6774b);
            dialogC6774b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: x8.f
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7523p.m28784r6(C7523p.this, dialogInterface);
                }
            });
        }
        Dialog dialog = this.f27628q;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public static final void m28782q6(C7523p c7523p) {
        AbstractC5868k.m23674f(c7523p, "this$0");
        c7523p.f27613b.mo11827A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m28784r6(C7523p c7523p, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c7523p, "this$0");
        if (c7523p.f27633v) {
            c7523p.f27633v = false;
            int i10 = c7523p.f27634w;
            if (i10 > 0) {
                c7523p.f27613b.mo11853y2(i10);
            } else {
                c7523p.f27613b.mo11848o0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s6 */
    public static final void m28786s6(C7523p c7523p) {
        String m27728o = null;
        AbstractC5868k.m23674f(c7523p, "this$0");
        c7523p.m28778k6();
        c7523p.m28775j6();
        c7523p.m28797S4();
        C4842a c4842a = C4842a.f20329a;
        if (c4842a.m19920a().m19945V()) {
            C7610t1 c7610t1 = C7610t1.f27984a;
            Application application = c7523p.f27612a.getApplication();
            AbstractC5868k.m23673e(application, "activity.application");
            c7610t1.m29269h(application);
        }
        AbstractC7598p1.m29237a();
        if (c4842a.m19920a().m19953b0()) {
            C5912h.f23531a.m23909a(c7523p.f27612a);
        }
        String m20595e = AbstractC5085b.m20595e();
        AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
        m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String lowerCase = m27728o.toLowerCase(locale);
        AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        String path = aVar.m29494a().getDatabasePath("user_vod.db").getPath();
        String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
        String path2 = aVar.m29494a().getDatabasePath("user_vod.db-shm").getPath();
        String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
        String path3 = aVar.m29494a().getDatabasePath("user_vod.db-wal").getPath();
        if (c4842a.m19920a().m19976y()) {
            c7523p.m28750O5().m17972c(path, str);
            if (new File(path2).exists()) {
                c7523p.m28750O5().m17972c(path2, str2);
            }
            if (new File(path3).exists()) {
                c7523p.m28750O5().m17972c(path3, str3);
            }
        }
        if (c4842a.m19920a().mo19975x() && new File(str).exists() && !new File(path).exists()) {
            c7523p.m28750O5().m17972c(str, path);
            c7523p.m28750O5().m17973d(str);
            if (new File(str2).exists()) {
                c7523p.m28750O5().m17972c(str2, path2);
                c7523p.m28750O5().m17973d(str2);
            }
            if (new File(str3).exists()) {
                c7523p.m28750O5().m17972c(str3, path3);
                c7523p.m28750O5().m17973d(str3);
            }
        }
        C7776f c7776f = C7776f.f28648a;
        c7776f.m30102r(new s());
        c7776f.m30100k0(new t());
    }

    /* renamed from: t6 */
    private final void m28787t6() {
        RunnableC7583k1 runnableC7583k1 = this.f27629r;
        if (runnableC7583k1 != null) {
            if (runnableC7583k1 != null) {
                runnableC7583k1.m29100b();
            }
            this.f27629r = null;
        }
    }

    /* renamed from: w5 */
    private final int m28790w5() {
        return ((Number) C7577i1.f27838b.m29084c().m29074f(C4300d.f18678a.m18065w(), -1)).intValue();
    }

    /* renamed from: x4 */
    private final void m28791x4(int i10, boolean z10) {
        C7577i1.f fVar = C7577i1.f27838b;
        long days = i10 - TimeUnit.MILLISECONDS.toDays(Math.abs(new Date(AbstractC6567a.m25640j(C7252a.f27087a.m28069d())).getTime() - new Date(AbstractC6567a.m25640j((String) fVar.m29084c().m29074f("first_active_time", MessageService.MSG_DB_READY_REPORT))).getTime()));
        if (days > 0) {
            m28736D4(false, (int) days);
            if (!z10) {
                fVar.m29084c().m29076h("force_bind_days", Integer.valueOf(i10));
                return;
            }
            return;
        }
        m28743I4(this, true, 0, 2, null);
    }

    /* renamed from: x6 */
    private final void m28792x6() {
        boolean z10 = false;
        String m20594d = AbstractC5085b.m20594d();
        AbstractC5868k.m23673e(m20594d, "getDeviceToken()");
        if (m20594d.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        C1224f.f4816e.m5631a().m5628z0().subscribe(new u());
    }

    /* renamed from: z5 */
    private final C0147e0 m28793z5() {
        return (C0147e0) this.f27618g.getValue();
    }

    @Override // p301qb.InterfaceC6443z
    /* renamed from: A4 */
    public void mo25228A4(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        AbstractC7030g.m27129c("home launch", new Runnable() { // from class: x8.i
            @Override // java.lang.Runnable
            public final void run() {
                C7523p.m28786s6(C7523p.this);
            }
        }, false);
    }

    @Override // p301qb.InterfaceC6395j
    /* renamed from: C2 */
    public void mo25210C2(GiftDaysData giftDaysData) {
        AbstractC5868k.m23674f(giftDaysData, "giftDaysData");
    }

    @Override // p301qb.InterfaceC6369a0
    /* renamed from: G4 */
    public void mo19878G4(FreeDataBean freeDataBean) {
        Integer authDays;
        if (freeDataBean != null && (authDays = freeDataBean.getAuthDays()) != null && authDays.intValue() > 0) {
            InterfaceC7249a interfaceC7249a = this.f27613b;
            Integer authDays2 = freeDataBean.getAuthDays();
            AbstractC5868k.m23671c(authDays2);
            interfaceC7249a.mo11856z2(authDays2.intValue());
        }
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "accountType");
        this.f27613b.mo11841e();
    }

    /* renamed from: I0 */
    public void m28794I0() {
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (!AbstractC5094k.m20685b(aVar.m29494a())) {
            C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(com.module.R$string.error_code_net_type) + "1" + aVar.m29494a().getString(com.module.R$string.cdn_ee1), 0, 0, 12, null);
            return;
        }
        m28734B5().m644b(C1461k.f5605a.m6806f(), true);
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: J5 */
    public void mo20389J5(ApkQueryCouponResult apkQueryCouponResult) {
        GetAuthInfoResultData getAuthInfoResultData;
        Long l10;
        List<CouponCodeList> list;
        String str = null;
        boolean z10 = false;
        List<AvailableCouponCodeList> list2;
        List<AvailableCouponCodeList> receiveCouponCodeList;
        List<CouponCodeList> list3;
        long j10;
        AbstractC5868k.m23674f(apkQueryCouponResult, "apkQueryCouponResult");
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str2 = c1466m0.m6878m() + "isHasCouponQualification";
        String str3 = c1466m0.m6878m() + "couponQualificationTime";
        String str4 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        AbstractC5868k.m23671c(getAuthInfoResultData);
        Date parse = simpleDateFormat.parse(getAuthInfoResultData.getNowTime());
        if (parse != null) {
            l10 = Long.valueOf(parse.getTime());
        } else {
            l10 = null;
        }
        C4297a c4297a = C4297a.f18620a;
        QueryCouponData data = apkQueryCouponResult.getData();
        AbstractC5868k.m23671c(data);
        c4297a.m17987d(data.getCouponCodeList());
        QueryCouponData data2 = apkQueryCouponResult.getData();
        if (data2 != null) {
            list = data2.getCouponCodeList();
        } else {
            list = null;
        }
        if (AbstractC6567a.m25638h(list)) {
            InterfaceC7249a interfaceC7249a = this.f27613b;
            QueryCouponData data3 = apkQueryCouponResult.getData();
            if (data3 != null) {
                list3 = data3.getCouponCodeList();
            } else {
                list3 = null;
            }
            interfaceC7249a.mo11840d2(list3);
            QueryCouponData data4 = apkQueryCouponResult.getData();
            AbstractC5868k.m23671c(data4);
            List<CouponCodeList> couponCodeList = data4.getCouponCodeList();
            AbstractC5868k.m23671c(couponCodeList);
            if (l10 != null) {
                j10 = l10.longValue() / 1000;
            } else {
                j10 = 0;
            }
            m28815w6(couponCodeList, j10, AbstractApplicationC7689d.f28135d.m29494a());
        }
        QueryCouponData data5 = apkQueryCouponResult.getData();
        if (data5 != null) {
            str = data5.getReceiveFlag();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            QueryCouponData data6 = apkQueryCouponResult.getData();
            if (data6 != null) {
                list2 = data6.getReceiveCouponCodeList();
            } else {
                list2 = null;
            }
            if (AbstractC6567a.m25638h(list2)) {
                this.f27635x = new ArrayList();
                QueryCouponData data7 = apkQueryCouponResult.getData();
                if (data7 != null && (receiveCouponCodeList = data7.getReceiveCouponCodeList()) != null) {
                    for (AvailableCouponCodeList availableCouponCodeList : receiveCouponCodeList) {
                        List list4 = this.f27635x;
                        if (list4 != null) {
                            list4.add(availableCouponCodeList.getCouponCode());
                        }
                    }
                }
            }
            QueryCouponData data8 = apkQueryCouponResult.getData();
            AbstractC5868k.m23671c(data8);
            boolean m23669a = AbstractC5868k.m23669a(data8.getReceiveFlag(), "1");
            C1466m0.f5627a.m6850W(m23669a);
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            c4982a.m20335c(aVar.m29494a(), str2, Boolean.valueOf(m23669a));
            c4982a.m20335c(aVar.m29494a(), str3, String.valueOf(l10));
            Context m29494a = aVar.m29494a();
            AbstractC5868k.m23671c(apkQueryCouponResult.getData());
            c4982a.m20335c(m29494a, str4, String.valueOf(r12.getDataCacheTime() * 60 * 1000));
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
        this.f27613b.mo11831O0();
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: L2 */
    public void mo23209L2(GetColumnContentsResult getColumnContentsResult, int i10) {
        List<ChildColumn> childColumnList;
        boolean m23669a;
        boolean m23669a2;
        boolean m23669a3;
        boolean m23669a4;
        boolean m23669a5;
        List<ChildColumn> childColumnList2;
        AbstractC5868k.m23674f(getColumnContentsResult, "result");
        if (i10 != 10001) {
            if (i10 != 10002) {
                if (i10 == 10006) {
                    C5044a.f20862a.m20489e(C4300d.f18678a.m18029e(), getColumnContentsResult.getData());
                    C7709c.m29787d().m29801m(new FreeColumnGetDataEvent());
                    return;
                }
                return;
            }
            GetColumnContentsResultData data = getColumnContentsResult.getData();
            if (data != null && (childColumnList2 = data.getChildColumnList()) != null) {
                int size = childColumnList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (AbstractC5868k.m23669a(childColumnList2.get(i11).getFree(), "1")) {
                        C1407f c1407f = C1407f.f5458a;
                        c1407f.m6497V(childColumnList2.get(i11).getId());
                        c1407f.m6496U(childColumnList2.get(i11));
                        c1407f.m6498W(i11);
                    }
                    if (AbstractC5868k.m23669a(childColumnList2.get(i11).getRestricted(), "1")) {
                        C1407f c1407f2 = C1407f.f5458a;
                        c1407f2.m6491P(childColumnList2.get(i11));
                        c1407f2.m6492Q(i11);
                    }
                    if (AbstractC5868k.m23669a(childColumnList2.get(i11).isAv1(), "1")) {
                        C1407f c1407f3 = C1407f.f5458a;
                        c1407f3.m6494S(childColumnList2.get(i11));
                        c1407f3.m6495T(i11);
                    }
                }
            }
            AbstractC7028e.m27117c("l");
            C5044a.f20862a.m20489e(C4300d.f18678a.m18035h(), getColumnContentsResult.getData());
            C7709c.m29787d().m29802p(new RequestLiveColumnSuccessEvent());
            return;
        }
        GetColumnContentsResultData data2 = getColumnContentsResult.getData();
        if (data2 != null && (childColumnList = data2.getChildColumnList()) != null) {
            for (ChildColumn childColumn : childColumnList) {
                String code = childColumn.getCode();
                C4300d c4300d = C4300d.f18678a;
                if (AbstractC5868k.m23669a(code, c4300d.m18035h())) {
                    m28805g5(Integer.valueOf(childColumn.getId()), MessageService.MSG_DB_READY_REPORT, 10002);
                    C7584l.f27868a.m29109g(childColumn);
                } else {
                    boolean z10 = true;
                    if (AbstractC5868k.m23669a(code, c4300d.m18027d())) {
                        m23669a = true;
                    } else {
                        m23669a = AbstractC5868k.m23669a(code, c4300d.m18025c());
                    }
                    if (m23669a) {
                        m23669a2 = true;
                    } else {
                        m23669a2 = AbstractC5868k.m23669a(code, c4300d.m18045m());
                    }
                    if (m23669a2) {
                        m23669a3 = true;
                    } else {
                        m23669a3 = AbstractC5868k.m23669a(code, c4300d.m18033g());
                    }
                    if (m23669a3) {
                        m23669a4 = true;
                    } else {
                        m23669a4 = AbstractC5868k.m23669a(code, c4300d.m18039j());
                    }
                    if (m23669a4) {
                        m23669a5 = true;
                    } else {
                        m23669a5 = AbstractC5868k.m23669a(code, c4300d.m18041k());
                    }
                    if (!m23669a5) {
                        z10 = AbstractC5868k.m23669a(code, c4300d.m18023b());
                    }
                    if (z10) {
                        C5044a.f20862a.m20489e(childColumn.getCode(), childColumn);
                        C7584l.f27868a.m29109g(childColumn);
                    } else if (AbstractC5868k.m23669a(code, c4300d.m18043l())) {
                        C5044a.f20862a.m20489e("Special_root", childColumn);
                    } else if (AbstractC5868k.m23669a(code, c4300d.m18031f())) {
                        C5044a.f20862a.m20489e(c4300d.m18031f(), childColumn);
                    } else if (AbstractC5868k.m23669a(code, c4300d.m18029e())) {
                        m28805g5(Integer.valueOf(childColumn.getId()), MessageService.MSG_DB_READY_REPORT, IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO);
                        C7584l.f27868a.m29109g(childColumn);
                    } else if (AbstractC5868k.m23669a(code, c4300d.m18037i())) {
                        C7584l.f27868a.m29109g(childColumn);
                    }
                }
            }
        }
        C5044a.f20862a.m20488d();
        C7584l.f27868a.m29108f();
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: M0 */
    public void mo20431M0(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "userid");
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6861d0(c1466m0.m6883r() + 1);
        if (AbstractC5868k.m23669a(str, "aaa7000")) {
            InterfaceC7249a.a.m28062a(this.f27613b, "noQualification", null, 2, null);
        } else {
            InterfaceC7249a.a.m28062a(this.f27613b, "failed", null, 2, null);
        }
        this.f27622k.put(str2, Boolean.FALSE);
    }

    @Override // p301qb.InterfaceC6443z
    /* renamed from: M3 */
    public void mo25229M3(ForceBindData forceBindData) {
        AbstractC5868k.m23674f(forceBindData, "t");
        if (!AbstractC5868k.m23669a("email", forceBindData.getBindMethod())) {
            C7577i1.f27838b.m29084c().m29076h("force_bind_not_email", Boolean.TRUE);
            return;
        }
        if (forceBindData.getFreeBindTime() != null) {
            Integer freeBindTime = forceBindData.getFreeBindTime();
            AbstractC5868k.m23671c(freeBindTime);
            if (freeBindTime.intValue() > 0) {
                Integer freeBindTime2 = forceBindData.getFreeBindTime();
                AbstractC5868k.m23671c(freeBindTime2);
                m28735C4(this, freeBindTime2.intValue(), false, 2, null);
                return;
            }
        }
        m28743I4(this, true, 0, 2, null);
    }

    /* renamed from: M4 */
    public void m28795M4() {
        Observable just = Observable.just(1);
        final a aVar = new a();
        Observable map = just.map(new Function() { // from class: x8.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m28747N4;
                m28747N4 = C7523p.m28747N4(InterfaceC5660l.this, obj);
                return m28747N4;
            }
        });
        final b bVar = new b();
        Observable compose = map.map(new Function() { // from class: x8.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m28749O4;
                m28749O4 = C7523p.m28749O4(InterfaceC5660l.this, obj);
                return m28749O4;
            }
        }).compose(AbstractC7029f.m27121b());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: x8.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28752P4(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f27639a;
        compose.subscribe(consumer, new Consumer() { // from class: x8.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28755Q4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6377d
    /* renamed from: M5 */
    public void mo25202M5(final ActiveResult activeResult) {
        AbstractC5868k.m23674f(activeResult, "it");
        m28801b6();
        this.f27612a.runOnUiThread(new Runnable() { // from class: x8.m
            @Override // java.lang.Runnable
            public final void run() {
                C7523p.m28772h6(C7523p.this, activeResult);
            }
        });
        m28796R5();
        C7609t0.f27981a.m29259h(AbstractApplicationC7689d.f28135d.m29494a());
        m28805g5(null, null, 10001);
        m28813t5();
        C1428w.f5539a.m6675h();
        C7709c m29787d = C7709c.m29787d();
        C1466m0 c1466m0 = C1466m0.f5627a;
        m29787d.m29801m(new LoginSuccessEvent(c1466m0.m6878m(), c1466m0.m6885t()));
        C7709c.m29787d().m29801m(new ChangeUserAccountSuccessEvent());
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(false, false, null, 6, null));
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f27612a.m19901Q4(EnumC4431a.DESTROY);
    }

    /* renamed from: R5 */
    public void m28796R5() {
        Observable just = Observable.just("key_device_tag");
        final h hVar = new h();
        Observable compose = just.map(new Function() { // from class: x8.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m28763Y5 = null;
                m28763Y5 = C7523p.m28763Y5(InterfaceC5660l.this, obj);
                return m28763Y5;
            }
        }).compose(AbstractC7029f.m27121b());
        final i iVar = i.f27648a;
        Consumer consumer = new Consumer() { // from class: x8.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28757U5(InterfaceC5660l.this, obj);
            }
        };
        final j jVar = j.f27649a;
        compose.subscribe(consumer, new Consumer() { // from class: x8.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28759W5(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: S4 */
    public void m28797S4() {
        AbstractC6927a.m26917g(new C7592n1());
        C6242a c6242a = new C6242a(this.f27612a, new C1477w(".update"), new C1447d(".update"));
        C1466m0 c1466m0 = C1466m0.f5627a;
        c6242a.m24862f(c1466m0.m6885t(), c1466m0.m6870i(), new e());
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: S5 */
    public void mo23211S5(String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // p301qb.InterfaceC6423s0
    /* renamed from: T0 */
    public void mo25226T0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: T4 */
    public void mo23554T4(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f27613b.mo11851v(z10);
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: U2 */
    public void mo20392U2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        C4297a.f18620a.m17987d(null);
        if (str2 != null) {
            C1466m0.f5627a.m6850W(false);
        }
    }

    @Override // p301qb.InterfaceC6377d
    /* renamed from: W4 */
    public void mo25203W4(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), C5090g.f20948a.m20647l(), "");
        C1474t.f5658a.m6919a(str);
        C7709c.m29787d().m29801m(new ShowErrorMsgEvent(str, null, 2, null));
        C7709c.m29787d().m29801m(new ClosePersonalEvent());
    }

    @Override // p301qb.InterfaceC6369a0
    /* renamed from: X1 */
    public void mo19881X1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    /* renamed from: X4 */
    public void m28798X4() {
        Dialog dialog = this.f27628q;
        boolean z10 = false;
        if (dialog != null && dialog.isShowing()) {
            z10 = true;
        }
        if (z10) {
            Dialog dialog2 = this.f27628q;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f27628q = null;
        }
    }

    @Override // p301qb.InterfaceC6423s0
    /* renamed from: Y2 */
    public void mo25227Y2(GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        AbstractC5868k.m23674f(getSlbInfoBeanResultData, "data");
        C7777g c7777g = C7777g.f28678a;
        c7777g.m30114b(AbstractApplicationC6253c.f24484b.m24887a(), getSlbInfoBeanResultData.getPlay_params());
        c7777g.m30113a(getSlbInfoBeanResultData);
    }

    /* renamed from: Y4 */
    public final AbstractActivityC7763a m28799Y4() {
        return this.f27612a;
    }

    /* renamed from: Z5 */
    public final InterfaceC7249a m28800Z5() {
        return this.f27613b;
    }

    /* renamed from: b6 */
    public void m28801b6() {
        C7776f.f28648a.m30096T();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // p301qb.InterfaceC6368a
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo20403d0(com.request.result.GetAuthInfoResult r5) {
        /*
            r4 = this;
            java.lang.String r0 = "result"
            ne.AbstractC5868k.m23674f(r5, r0)
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getHasPay()
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L2d
            cc.m0 r0 = cc.C1466m0.f5627a
            com.request.result.UserInfo r0 = r0.m6887v()
            if (r0 != 0) goto L1d
            goto L3b
        L1d:
            com.request.result.GetAuthInfoResultData r2 = r5.getData()
            if (r2 == 0) goto L28
            java.lang.String r2 = r2.getHasPay()
            goto L29
        L28:
            r2 = r1
        L29:
            r0.setHasPay(r2)
            goto L3b
        L2d:
            cc.m0 r0 = cc.C1466m0.f5627a
            com.request.result.UserInfo r0 = r0.m6887v()
            if (r0 != 0) goto L36
            goto L3b
        L36:
            java.lang.String r2 = "0"
            r0.setHasPay(r2)
        L3b:
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getUserIdentity()
            goto L47
        L46:
            r0 = r1
        L47:
            boolean r0 = p317rb.AbstractC6567a.m25637g(r0)
            if (r0 == 0) goto L86
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.getUserIdentity()
            goto L59
        L58:
            r0 = r1
        L59:
            cc.m0 r2 = cc.C1466m0.f5627a
            com.request.result.UserInfo r3 = r2.m6887v()
            if (r3 == 0) goto L66
            java.lang.String r3 = r3.getUserIdentity()
            goto L67
        L66:
            r3 = r1
        L67:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r3)
            if (r0 != 0) goto L86
            com.request.result.UserInfo r0 = r2.m6887v()
            if (r0 != 0) goto L74
            goto L84
        L74:
            com.request.result.GetAuthInfoResultData r2 = r5.getData()
            if (r2 == 0) goto L7e
            java.lang.String r1 = r2.getUserIdentity()
        L7e:
            ne.AbstractC5868k.m23671c(r1)
            r0.setUserIdentity(r1)
        L84:
            r0 = 1
            goto L87
        L86:
            r0 = 0
        L87:
            v8.a r1 = r4.f27613b
            r1.mo11839d0(r5)
            cc.m0 r1 = cc.C1466m0.f5627a
            com.request.result.GetAuthInfoResultData r5 = r5.getData()
            if (r5 == 0) goto L9a
            java.lang.String r5 = r5.getAreaFlag()
            if (r5 != 0) goto L9c
        L9a:
            java.lang.String r5 = ""
        L9c:
            r1.m6846S(r5)
            r4.m28803e6()
            boolean r5 = r1.m6838K()
            if (r5 == 0) goto Lab
            r4.m28760X2()
        Lab:
            ye.c r5 = ye.C7709c.m29787d()
            com.module.event.RefreshUerInfoDisplayEvent r1 = new com.module.event.RefreshUerInfoDisplayEvent
            r1.<init>(r0)
            r5.m29801m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p398x8.C7523p.mo20403d0(com.request.result.GetAuthInfoResult):void");
    }

    /* renamed from: d6 */
    public final boolean m28802d6() {
        return this.f27623l;
    }

    /* renamed from: e6 */
    public void m28803e6() {
        String m6866g = C1466m0.f5627a.m6866g();
        if (C4842a.f20329a.m19920a().m19933J()) {
            this.f27613b.mo11854z(m6866g);
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        C1474t.f5658a.m6919a(str);
        C7709c.m29787d().m29801m(new ShowErrorMsgEvent(str, ""));
    }

    /* renamed from: f6 */
    public void m28804f6() {
        String str = null;
        String str2 = null;
        String hasPay = null;
        C6156m c6156m = C6156m.f24180a;
        AbstractActivityC7763a abstractActivityC7763a = this.f27612a;
        String m23090c = C5714a.f22937a.m23090c();
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v == null || (str = m6887v.getUserIdentity()) == null) {
            str = "1";
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 == null || (hasPay = m6887v2.getHasPay()) == null) {
            str2 = "";
        } else {
            str2 = hasPay;
        }
        ArrayList m24516K = C6156m.m24516K(c6156m, abstractActivityC7763a, m23090c, str, null, false, str2, 24, null);
        String str3 = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
        if (AbstractC6567a.m25638h(m24516K)) {
            if (AbstractC5868k.m23669a(str3, "2")) {
                AbstractC5868k.m23671c(m24516K);
                Iterator it = m24516K.iterator();
                while (it.hasNext()) {
                    AdInfo adInfo = (AdInfo) it.next();
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        InterfaceC7249a interfaceC7249a = this.f27613b;
                        AbstractC5868k.m23673e(adInfo, "adInfo");
                        interfaceC7249a.mo11837W1(adInfo);
                        return;
                    }
                }
                return;
            }
            if (AbstractC5868k.m23669a(str3, MessageService.MSG_DB_READY_REPORT)) {
                AbstractC5868k.m23671c(m24516K);
                Iterator it2 = m24516K.iterator();
                while (it2.hasNext()) {
                    AdInfo adInfo2 = (AdInfo) it2.next();
                    if (AbstractC5868k.m23669a("yes", adInfo2.is_dealer()) || AbstractC5868k.m23669a("default", adInfo2.is_dealer())) {
                        InterfaceC7249a interfaceC7249a2 = this.f27613b;
                        AbstractC5868k.m23673e(adInfo2, "adInfo");
                        interfaceC7249a2.mo11837W1(adInfo2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        m28806g6(str3);
    }

    /* renamed from: g5 */
    public void m28805g5(Integer num, String str, final int i10) {
        final C5878u c5878u = new C5878u();
        final C5878u c5878u2 = new C5878u();
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: x8.j
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7523p.m28773i5(C5878u.this, i10, this, c5878u2, observableEmitter);
            }
        }).compose(AbstractC7029f.m27126g());
        final f fVar = new f(c5878u2, i10, num, str);
        Consumer consumer = new Consumer() { // from class: x8.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28777k5(InterfaceC5660l.this, obj);
            }
        };
        final g gVar = g.f27646a;
        compose.subscribe(consumer, new Consumer() { // from class: x8.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7523p.m28779o5(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: g6 */
    public void m28806g6(String str) {
        String str2 = null;
        String str3 = null;
        AbstractC5868k.m23674f(str, "renewFlag");
        C6156m c6156m = C6156m.f24180a;
        AbstractActivityC7763a abstractActivityC7763a = this.f27612a;
        String m23088a = C5714a.f22937a.m23088a();
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v == null || (str2 = m6887v.getUserIdentity()) == null) {
            str2 = "1";
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 == null || (str3 = m6887v2.getHasPay()) == null) {
            str3 = "";
        }
        ArrayList m24516K = C6156m.m24516K(c6156m, abstractActivityC7763a, m23088a, str2, null, false, str3, 24, null);
        if (AbstractC6567a.m25638h(m24516K)) {
            if (AbstractC5868k.m23669a(str, "2")) {
                AbstractC5868k.m23671c(m24516K);
                Iterator it = m24516K.iterator();
                while (it.hasNext()) {
                    AdInfo adInfo = (AdInfo) it.next();
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        InterfaceC7249a interfaceC7249a = this.f27613b;
                        AbstractC5868k.m23673e(adInfo, "adInfo");
                        interfaceC7249a.mo11843f3(adInfo);
                        return;
                    }
                }
                return;
            }
            if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
                AbstractC5868k.m23671c(m24516K);
                Iterator it2 = m24516K.iterator();
                while (it2.hasNext()) {
                    AdInfo adInfo2 = (AdInfo) it2.next();
                    if (AbstractC5868k.m23669a("yes", adInfo2.is_dealer()) || AbstractC5868k.m23669a("default", adInfo2.is_dealer())) {
                        InterfaceC7249a interfaceC7249a2 = this.f27613b;
                        AbstractC5868k.m23673e(adInfo2, "adInfo");
                        interfaceC7249a2.mo11843f3(adInfo2);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: l6 */
    public final void m28807l6(boolean z10) {
        this.f27623l = z10;
    }

    @InterfaceC7719m
    public final void logoutMessage(LogoutEvent logoutEvent) {
        AbstractC5868k.m23674f(logoutEvent, "event");
        m28814w4();
    }

    @Override // p301qb.InterfaceC6368a
    /* renamed from: m0 */
    public void mo20404m0(String str) {
        m28803e6();
        if (!TextUtils.isEmpty(str)) {
            this.f27613b.mo11846m0(str);
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
    }

    /* renamed from: m2 */
    public void m28808m2() {
        C0162i c0162i = new C0162i(this);
        this.f27625n = c0162i;
        c0162i.m614c("1");
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: m4 */
    public void mo20433m4(String str) {
        AbstractC5868k.m23674f(str, "userid");
        this.f27622k.put(str, Boolean.TRUE);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        m28787t6();
        if (C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        C7610t1 c7610t1 = C7610t1.f27984a;
        Application application = this.f27612a.getApplication();
        AbstractC5868k.m23673e(application, "activity.application");
        c7610t1.m29271j(application);
        if (C4842a.f20329a.m19920a().m19953b0()) {
            C5912h.f23531a.m23910b(this.f27612a);
        }
    }

    @Override // p301qb.InterfaceC6395j
    /* renamed from: q1 */
    public void mo25211q1(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
    }

    /* renamed from: r5 */
    public void m28809r5() {
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (!AbstractC5094k.m20685b(aVar.m29494a())) {
            C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(com.module.R$string.error_code_net_type) + "1" + aVar.m29494a().getString(com.module.R$string.cdn_ee1), 0, 0, 12, null);
            return;
        }
        C0175l0.m643c(m28734B5(), C1461k.f5605a.m6806f(), false, 2, null);
    }

    @InterfaceC7719m
    public final void refreshUserInfoMessage(final LoginSuccessRequestDataEvent loginSuccessRequestDataEvent) {
        AbstractC5868k.m23674f(loginSuccessRequestDataEvent, "event");
        m28796R5();
        if (!loginSuccessRequestDataEvent.isSwitchAccount()) {
            C7609t0.f27981a.m29259h(AbstractApplicationC7689d.f28135d.m29494a());
            m28805g5(null, null, 10001);
        } else {
            C7709c.m29787d().m29801m(new ChangeUserAccountSuccessEvent());
            C7734h.m29873F(C7734h.f28449q.m29905a(), C1466m0.f5627a.m6888w(), null, 2, null);
            C1428w.f5539a.m6675h();
        }
        C6926a.m26889a();
        m28801b6();
        if (!loginSuccessRequestDataEvent.getGetAuthInfoFromCache()) {
            m28808m2();
        } else if (loginSuccessRequestDataEvent.getLoginResult() != null) {
            this.f27612a.runOnUiThread(new Runnable() { // from class: x8.n
                @Override // java.lang.Runnable
                public final void run() {
                    C7523p.m28774i6(C7523p.this, loginSuccessRequestDataEvent);
                }
            });
        }
        m28813t5();
        C7709c m29787d = C7709c.m29787d();
        C1466m0 c1466m0 = C1466m0.f5627a;
        m29787d.m29801m(new LoginSuccessEvent(c1466m0.m6878m(), c1466m0.m6885t()));
    }

    /* renamed from: s1 */
    public void m28810s1() {
        Map map = this.f27622k;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(map.get(c1466m0.m6878m()), Boolean.TRUE)) {
            return;
        }
        m28742H5().m788b(c1466m0.m6878m(), c1466m0.m6879n());
    }

    /* renamed from: s5 */
    public void m28811s5() {
        m28733A5().m574b();
    }

    /* renamed from: t */
    public void m28812t() {
        C1461k c1461k = C1461k.f5605a;
        String m6802b = c1461k.m6802b();
        String m6808h = c1461k.m6808h();
        String m6805e = c1461k.m6805e();
        String m6803c = c1461k.m6803c();
        String m6810j = c1461k.m6810j();
        if (AbstractC6567a.m25637g(m6802b) && AbstractC6567a.m25637g(m6808h) && (AbstractC6567a.m25637g(m6805e) || AbstractC6567a.m25637g(m6810j))) {
            m28740F5().m664g(m6802b, m6808h, m6805e, "1", m6803c, "", m6810j);
        } else {
            this.f27613b.mo11833R();
        }
    }

    /* renamed from: t5 */
    public void m28813t5() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6837J() && c1466m0.m6828A()) {
            C0174l c0174l = new C0174l(this);
            this.f27626o = c0174l;
            c0174l.m641b();
        }
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: u6 */
    public void mo23556u6(GetDeviceResult getDeviceResult, String str, boolean z10) {
        AbstractC5868k.m23674f(getDeviceResult, "bean");
        AbstractC5868k.m23674f(str, "tempToken");
        this.f27613b.mo11845l(getDeviceResult.getData().getDeviceList(), str, z10);
    }

    @InterfaceC7719m
    public final void updateNoticeService(LoginSuccessEvent loginSuccessEvent) {
        AbstractC5868k.m23674f(loginSuccessEvent, "event");
        this.f27613b.mo11852y0();
        C7709c.m29787d().m29801m(new UpdateLiveNoticeEvent());
        m28792x6();
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: w3 */
    public void mo20434w3(ApkReceiveCouponResult apkReceiveCouponResult, String str) {
        AbstractC5868k.m23674f(apkReceiveCouponResult, "t");
        AbstractC5868k.m23674f(str, "userid");
        this.f27613b.mo11855z0(AbstractC3215b.JSON_SUCCESS, this.f27635x);
        this.f27622k.put(str, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w4 */
    public void m28814w4() {
        C0130a c0130a = new C0130a(this, null, 2, 0 == true ? 1 : 0);
        this.f27615d = c0130a;
        c0130a.m520f(m28790w5());
    }

    /* renamed from: w6 */
    public final void m28815w6(List list, long j10, Context context) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        AbstractC5868k.m23674f(list, "list");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        String m20614g = AbstractC5086c.m20614g("yyyy-MM-dd");
        Iterator it = list.iterator();
        String str = "";
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            CouponCodeList couponCodeList = (CouponCodeList) it.next();
            if (AbstractC5868k.m23669a(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
                if (couponCodeList.getInvalidTime().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    long m20619l = AbstractC5086c.m20619l(couponCodeList.getInvalidTime(), "yyyy-MM-dd HH:mm:ss") / 1000;
                    String substring = couponCodeList.getInvalidTime().substring(0, 11);
                    AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (str.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 || substring.compareTo(str) <= 0) {
                        long j11 = m20619l - j10;
                        if (j11 > 0 && j11 < 259200) {
                            if (str.length() == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13 || str.compareTo(substring) > 0) {
                                str = substring;
                            }
                            if (AbstractC5868k.m23669a(str, m20614g)) {
                                break;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if (str.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            C4982a c4982a = C4982a.f20721a;
            C1466m0 c1466m0 = C1466m0.f5627a;
            String str2 = (String) c4982a.m20333a(context, c1466m0.m6878m() + "coupon_date_key", "");
            if (!AbstractC5868k.m23669a(str2, str) && str2.compareTo(str) < 0) {
                c4982a.m20335c(context, c1466m0.m6878m() + "coupon_date_key", str);
            }
        }
    }
}
