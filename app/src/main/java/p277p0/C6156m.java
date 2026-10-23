package p277p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.ImageView;
import anet.channel.strategy.dispatch.DispatchConstants;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.advertlib.bean.AdInfo;
import com.advertlib.bean.AdInfoWrapper;
import com.advertlib.bean.AdReportBean;
import com.advertlib.bean.AdReportBeanWrapper;
import com.advertlib.bean.AdReportRequest;
import com.advertlib.bean.AdvertBean;
import com.advertlib.bean.AdvertPosition;
import com.advertlib.bean.AdvertResult;
import com.advertlib.bean.ReportResult;
import com.advertlib.bean.TimeInfoBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.Dns;
import okhttp3.Interceptor;
import org.android.agoo.message.MessageService;
import p242n0.C5715b;
import p277p0.C6156m;
import p321s0.C6609d;
import p321s0.C6610e;
import p321s0.InterfaceC6606a;
import p321s0.InterfaceC6607b;
import p321s0.InterfaceC6608c;
import p321s0.InterfaceC6611f;
import p332t0.C6885c;
import p332t0.C6888f;
import p332t0.InterfaceC6883a;
import p346u0.C7010d;
import p348u2.AbstractC7030g;
import p361v0.C7193f;
import p361v0.C7194g;

/* renamed from: p0.m */
/* loaded from: classes.dex */
public final class C6156m {

    /* renamed from: c */
    private static TimeInfoBean f24182c;

    /* renamed from: d */
    private static TimeInfoBean f24183d;

    /* renamed from: f */
    private static Disposable f24185f;

    /* renamed from: o */
    private static String f24194o;

    /* renamed from: p */
    private static String f24195p;

    /* renamed from: q */
    private static Dns f24196q;

    /* renamed from: r */
    private static Interceptor f24197r;

    /* renamed from: s */
    private static HashMap f24198s;

    /* renamed from: t */
    private static HashMap f24199t;

    /* renamed from: u */
    private static f f24200u;

    /* renamed from: v */
    private static final InterfaceC1312h f24201v;

    /* renamed from: w */
    private static final InterfaceC1312h f24202w;

    /* renamed from: x */
    private static AdvertResult f24203x;

    /* renamed from: a */
    public static final C6156m f24180a = new C6156m();

    /* renamed from: b */
    private static final String f24181b = C6160q.class.getSimpleName();

    /* renamed from: e */
    private static final long f24184e = 15;

    /* renamed from: g */
    private static InterfaceC6608c f24186g = new C6609d();

    /* renamed from: h */
    private static C6610e f24187h = new C6610e();

    /* renamed from: i */
    private static final String f24188i = "ad_exist_status";

    /* renamed from: j */
    private static final String f24189j = "apk_booting";

    /* renamed from: k */
    private static final ScheduledThreadPoolExecutor f24190k = AbstractC7030g.m27130d();

    /* renamed from: l */
    private static HashMap f24191l = new HashMap();

    /* renamed from: m */
    private static final ArrayList f24192m = new ArrayList();

    /* renamed from: n */
    private static Handler f24193n = new Handler(Looper.getMainLooper());

    /* renamed from: p0.m$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f24204a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7010d invoke() {
            C6156m c6156m = C6156m.f24180a;
            return new C7010d(c6156m.m24563O(), c6156m.m24565Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6611f f24205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6611f interfaceC6611f) {
            super(1);
            this.f24205a = interfaceC6611f;
        }

        /* renamed from: a */
        public final void m24578a(List list) {
            this.f24205a.mo25825a(list);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24578a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6611f f24206a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6611f interfaceC6611f) {
            super(1);
            this.f24206a = interfaceC6611f;
        }

        /* renamed from: a */
        public final void m24579a(Throwable th) {
            th.printStackTrace();
            this.f24206a.mo25825a(new ArrayList());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24579a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: p0.m$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeToken<List<AdInfo>> {
        d() {
        }
    }

    /* renamed from: p0.m$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f24207a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("picture", new C6885c());
            hashMap.put("video", new C6888f(C6156m.f24180a.m24517L()));
            return hashMap;
        }
    }

    /* renamed from: p0.m$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC6606a {
        f() {
        }

        @Override // p321s0.InterfaceC6606a
        /* renamed from: a */
        public void mo24581a(String str) {
            AbstractC5868k.m23674f(str, "mediaType");
            C6156m.f24198s.put(str, Boolean.TRUE);
            ArrayList arrayList = (ArrayList) C6156m.f24199t.remove(str);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6606a) it.next()).mo24581a(str);
                }
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ List f24208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list) {
            super(1);
            this.f24208a = list;
        }

        /* renamed from: a */
        public final void m24582a(ReportResult reportResult) {
            C6160q.f24221a.m24596d(this.f24208a);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24582a((ReportResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f24209a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m24583a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24583a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f24210a;

        /* renamed from: b */
        final /* synthetic */ boolean f24211b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC6607b f24212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, boolean z10, InterfaceC6607b interfaceC6607b) {
            super(1);
            this.f24210a = context;
            this.f24211b = z10;
            this.f24212c = interfaceC6607b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m24585e(InterfaceC6607b interfaceC6607b) {
            if (interfaceC6607b != null) {
                interfaceC6607b.mo23221b(true);
            }
        }

        /* renamed from: d */
        public final void m24586d(AdvertResult advertResult) {
            boolean z10 = false;
            C6156m.f24203x = advertResult;
            C7193f.f26903a.m27830c(this.f24210a, C6156m.f24189j, "");
            HashMap hashMap = new HashMap();
            List<AdvertPosition> ad_positions = advertResult.getAd_positions();
            if (ad_positions != null) {
                Context context = this.f24210a;
                boolean z11 = this.f24211b;
                for (AdvertPosition advertPosition : ad_positions) {
                    String ad_type = advertPosition.getAd_type();
                    boolean z12 = false;
                    if (ad_type != null && ad_type.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        List<AdInfo> ads = advertPosition.getAds();
                        if (ads != null && !ads.isEmpty()) {
                            z12 = true;
                        }
                        if (z12) {
                            String ad_type2 = advertPosition.getAd_type();
                            AbstractC5868k.m23671c(ad_type2);
                            List<AdInfo> ads2 = advertPosition.getAds();
                            AbstractC5868k.m23671c(ads2);
                            hashMap.put(ad_type2, ads2);
                            String ad_type3 = advertPosition.getAd_type();
                            if (AbstractC5868k.m23669a(C6156m.f24189j, ad_type3)) {
                                Gson gson = new Gson();
                                List<AdInfo> ads3 = advertPosition.getAds();
                                AbstractC5868k.m23671c(ads3);
                                C7193f.f26903a.m27830c(context, C6156m.f24189j, gson.toJson(ads3));
                            }
                            if (z11) {
                                C6156m c6156m = C6156m.f24180a;
                                AbstractC5868k.m23671c(ad_type3);
                                List<AdInfo> ads4 = advertPosition.getAds();
                                AbstractC5868k.m23671c(ads4);
                                c6156m.m24556y(context, ad_type3, ads4);
                            }
                        }
                    }
                }
            }
            C6156m.f24191l = hashMap;
            Handler m24566S = C6156m.f24180a.m24566S();
            final InterfaceC6607b interfaceC6607b = this.f24212c;
            m24566S.post(new Runnable() { // from class: p0.n
                @Override // java.lang.Runnable
                public final void run() {
                    C6156m.i.m24585e(InterfaceC6607b.this);
                }
            });
            if (!hashMap.isEmpty()) {
                Context context2 = this.f24210a;
                InterfaceC6607b interfaceC6607b2 = this.f24212c;
                for (Map.Entry entry : hashMap.entrySet()) {
                    for (AdInfo adInfo : (Iterable) entry.getValue()) {
                        InterfaceC6883a interfaceC6883a = (InterfaceC6883a) C6156m.f24180a.m24518R().get(adInfo.getMedia_type());
                        if (interfaceC6883a != null) {
                            interfaceC6883a.mo26797b(context2, (String) entry.getKey(), adInfo, interfaceC6607b2);
                        }
                    }
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24586d((AdvertResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f24213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context) {
            super(1);
            this.f24213a = context;
        }

        /* renamed from: a */
        public final void m24587a(AdvertResult advertResult) {
            long currentTimeMillis;
            long j10;
            C6156m c6156m = C6156m.f24180a;
            c6156m.m24564P().mo24581a("picture");
            Long timestamp = advertResult.getTimestamp();
            if (timestamp != null) {
                currentTimeMillis = timestamp.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            C6156m.f24182c = new TimeInfoBean(currentTimeMillis, SystemClock.elapsedRealtime());
            C6160q.f24221a.m24595c();
            Context applicationContext = this.f24213a.getApplicationContext();
            AbstractC5868k.m23673e(applicationContext, "context.applicationContext");
            Integer reporting_interval = advertResult.getReporting_interval();
            if (reporting_interval == null) {
                j10 = C6156m.f24184e;
            } else {
                j10 = reporting_interval.intValue();
            }
            c6156m.m24544n0(applicationContext, j10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24587a((AdvertResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$k */
    /* loaded from: classes.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6607b f24214a;

        /* renamed from: b */
        final /* synthetic */ Context f24215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC6607b interfaceC6607b, Context context) {
            super(1);
            this.f24214a = interfaceC6607b;
            this.f24215b = context;
        }

        /* renamed from: a */
        public final void m24588a(Throwable th) {
            InterfaceC6607b interfaceC6607b = this.f24214a;
            if (interfaceC6607b != null) {
                interfaceC6607b.mo23221b(false);
            }
            C6156m.f24180a.m24519X(this.f24215b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24588a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0.m$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f24216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(1);
            this.f24216a = context;
        }

        /* renamed from: a */
        public final void m24589a(Long l10) {
            C6156m.f24180a.m24519X(this.f24216a);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24589a((Long) obj);
            return C1328x.f4998a;
        }
    }

    static {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        Dns dns = Dns.SYSTEM;
        AbstractC5868k.m23673e(dns, "SYSTEM");
        f24196q = dns;
        f24198s = new HashMap();
        f24199t = new HashMap();
        f24200u = new f();
        m5965b = AbstractC1314j.m5965b(e.f24207a);
        f24201v = m5965b;
        m5965b2 = AbstractC1314j.m5965b(a.f24204a);
        f24202w = m5965b2;
    }

    private C6156m() {
    }

    /* renamed from: B */
    public static /* synthetic */ List m24510B(C6156m c6156m, Context context, String str, String str2, boolean z10, String str3, int i10, Object obj) {
        boolean z11 = false;
        if ((i10 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return c6156m.m24557A(context, str, str2, z11, str3);
    }

    /* renamed from: D */
    public static /* synthetic */ void m24511D(C6156m c6156m, Context context, String str, InterfaceC6611f interfaceC6611f, String str2, boolean z10, String str3, int i10, Object obj) {
        boolean z11 = false;
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        c6156m.m24558C(context, str, interfaceC6611f, str2, z11, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m24512E(Context context, String str, String str2, boolean z10, String str3, ObservableEmitter observableEmitter) {
        boolean z11 = false;
        File file;
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(str, "$adType");
        AbstractC5868k.m23674f(str2, "$userIdentity");
        AbstractC5868k.m23674f(str3, "$hasPay");
        AbstractC5868k.m23674f(observableEmitter, "it");
        C7194g c7194g = C7194g.f26904a;
        List m24576z = f24180a.m24576z(str);
        TimeInfoBean timeInfoBean = f24182c;
        long j10 = 0;
        if (timeInfoBean != null) {
            j10 = TimeInfoBean.getCurrTime$default(timeInfoBean, 0L, 1, null);
        }
        ArrayList m27834c = c7194g.m27834c(context, str, m24576z, str2, j10, z10, str3);
        if (m27834c != null && !m27834c.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            observableEmitter.onNext(new ArrayList());
            observableEmitter.onComplete();
            return;
        }
        int size = m27834c.size();
        ArrayList arrayList = new ArrayList();
        if (1 <= size) {
            int i10 = 1;
            while (true) {
                List<AdInfo> m25822a = InterfaceC6608c.a.m25822a(f24186g, str, m27834c, null, 4, null);
                if (m25822a != null) {
                    for (AdInfo adInfo : m25822a) {
                        InterfaceC6883a interfaceC6883a = (InterfaceC6883a) f24180a.m24518R().get(adInfo.getMedia_type());
                        if (interfaceC6883a != null) {
                            file = interfaceC6883a.mo26796a(context, str, adInfo);
                        } else {
                            file = null;
                        }
                        if (file != null) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC5868k.m23673e(absolutePath, "cacheFile.absolutePath");
                            arrayList.add(new AdInfoWrapper(adInfo, absolutePath));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        observableEmitter.onNext(arrayList);
                        observableEmitter.onComplete();
                        return;
                    }
                }
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        observableEmitter.onNext(new ArrayList());
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m24513F(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m24514G(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: I */
    public static /* synthetic */ List m24515I(C6156m c6156m, Context context, String str, String str2, String str3, boolean z10, String str4, int i10, Object obj) {
        boolean z11 = false;
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return c6156m.m24559H(context, str, str2, str3, z11, str4);
    }

    /* renamed from: K */
    public static /* synthetic */ ArrayList m24516K(C6156m c6156m, Context context, String str, String str2, String str3, boolean z10, String str4, int i10, Object obj) {
        boolean z11 = false;
        if ((i10 & 8) != 0) {
            str3 = "picture";
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return c6156m.m24560J(context, str, str2, str5, z11, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final C7010d m24517L() {
        return (C7010d) f24202w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final HashMap m24518R() {
        return (HashMap) f24201v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final void m24519X(final Context context) {
        f24190k.execute(new AbstractC7030g.f("report ad", new Runnable() { // from class: p0.k
            @Override // java.lang.Runnable
            public final void run() {
                C6156m.m24520Y(context);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m24520Y(Context context) {
        AbstractC5868k.m23674f(context, "$context");
        List<AdReportBeanWrapper> m24597f = C6160q.f24221a.m24597f(context);
        ArrayList arrayList = new ArrayList();
        if (m24597f != null && !m24597f.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AdReportBeanWrapper adReportBeanWrapper : m24597f) {
                arrayList.add(Integer.valueOf(adReportBeanWrapper.getId()));
                String str = "unknown";
                if (AbstractC5868k.m23669a(adReportBeanWrapper.getBean().getAd_id(), MessageService.MSG_DB_READY_REPORT) && adReportBeanWrapper.getBean().getGame_stay_time() > 0) {
                    AdReportBean bean = adReportBeanWrapper.getBean();
                    String str2 = f24194o;
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    bean.setSn(str2);
                    AdReportBean bean2 = adReportBeanWrapper.getBean();
                    String str3 = f24195p;
                    if (str3 != null) {
                        str = str3;
                    }
                    bean2.setUser_id(str);
                    AdReportBean bean3 = adReportBeanWrapper.getBean();
                    String packageName = context.getPackageName();
                    AbstractC5868k.m23673e(packageName, "context.packageName");
                    bean3.setApp_id(packageName);
                    arrayList2.add(adReportBeanWrapper.getBean());
                } else {
                    String str4 = adReportBeanWrapper.getBean().getAd_id() + adReportBeanWrapper.getBean().getUser_name() + adReportBeanWrapper.getBean().getAd_type();
                    AdReportBean adReportBean = (AdReportBean) linkedHashMap.get(str4);
                    if (adReportBean == null) {
                        AdReportBean bean4 = adReportBeanWrapper.getBean();
                        String str5 = f24194o;
                        if (str5 == null) {
                            str5 = "unknown";
                        }
                        bean4.setSn(str5);
                        AdReportBean bean5 = adReportBeanWrapper.getBean();
                        String str6 = f24195p;
                        if (str6 != null) {
                            str = str6;
                        }
                        bean5.setUser_id(str);
                        AdReportBean bean6 = adReportBeanWrapper.getBean();
                        String packageName2 = context.getPackageName();
                        AbstractC5868k.m23673e(packageName2, "context.packageName");
                        bean6.setApp_id(packageName2);
                        linkedHashMap.put(str4, adReportBeanWrapper.getBean());
                        arrayList2.add(adReportBeanWrapper.getBean());
                    } else {
                        adReportBean.setDisplay_times(adReportBean.getDisplay_times() + adReportBeanWrapper.getBean().getDisplay_times());
                        adReportBean.setClick_times(adReportBean.getClick_times() + adReportBeanWrapper.getBean().getClick_times());
                        if (adReportBeanWrapper.getBean().getLast_update_timestamp() > adReportBean.getLast_update_timestamp()) {
                            adReportBean.setLast_update_timestamp(adReportBeanWrapper.getBean().getLast_update_timestamp());
                        }
                    }
                }
            }
            Observable subscribeOn = f24180a.m24517L().m27065k(new AdReportRequest(arrayList2)).subscribeOn(Schedulers.m20294io());
            final g gVar = new g(arrayList);
            Consumer consumer = new Consumer() { // from class: p0.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6156m.m24521Z(InterfaceC5660l.this, obj);
                }
            };
            final h hVar = h.f24209a;
            subscribeOn.subscribe(consumer, new Consumer() { // from class: p0.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6156m.m24523a0(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m24521Z(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m24523a0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m24526c0(C6156m c6156m, Context context, String str, String str2, InterfaceC6607b interfaceC6607b, String str3, boolean z10, int i10, Object obj) {
        boolean z11 = false;
        if ((i10 & 16) != 0) {
            str3 = "1.0";
        }
        String str4 = str3;
        if ((i10 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        c6156m.m24571b0(context, str, str2, interfaceC6607b, str4, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m24528d0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m24530e0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m24532f0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m24538k0(C6156m c6156m, Context context, ImageView imageView, String str, AdInfo adInfo, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10, int i11, Object obj) {
        Integer num3;
        InterfaceC5660l interfaceC5660l2;
        Integer num4;
        boolean z11 = false;
        int i12 = 0;
        if ((i11 & 16) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 32) != 0) {
            interfaceC5660l2 = null;
        } else {
            interfaceC5660l2 = interfaceC5660l;
        }
        if ((i11 & 64) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 256) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        c6156m.m24575j0(context, imageView, str, adInfo, num3, interfaceC5660l2, num4, z11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m24540l0(final Context context, String str, final AdInfo adInfo, final ImageView imageView, final Integer num, final InterfaceC5660l interfaceC5660l, final Integer num2, final boolean z10, final int i10) {
        File file;
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(str, "$adType");
        AbstractC5868k.m23674f(imageView, "$iv");
        InterfaceC6883a interfaceC6883a = (InterfaceC6883a) f24180a.m24518R().get("picture");
        if (interfaceC6883a != null) {
            file = interfaceC6883a.mo26796a(context, str, adInfo);
        } else {
            file = null;
        }
        final File file2 = file;
        f24193n.post(new Runnable() { // from class: p0.d
            @Override // java.lang.Runnable
            public final void run() {
                C6156m.m24542m0(context, imageView, adInfo, file2, num, interfaceC5660l, num2, z10, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m24542m0(Context context, ImageView imageView, AdInfo adInfo, File file, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10) {
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(imageView, "$iv");
        C5715b c5715b = C5715b.f22948a;
        String url = adInfo.getUrl();
        if (url == null) {
            url = "";
        }
        c5715b.m23102h(context, imageView, url, file, num, interfaceC5660l, num2, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m24544n0(Context context, long j10) {
        boolean z10 = false;
        Disposable disposable;
        Disposable disposable2 = f24185f;
        if (disposable2 != null) {
            z10 = disposable2.isDisposed();
        } else {
            z10 = true;
        }
        if (!z10 && (disposable = f24185f) != null) {
            disposable.dispose();
        }
        Observable<Long> interval = Observable.interval(0L, j10, TimeUnit.MINUTES);
        final l lVar = new l(context);
        f24185f = interval.subscribe(new Consumer() { // from class: p0.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24546o0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m24546o0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m24556y(Context context, String str, List list) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (sharedPreferences.getAll().isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Map<String, ?> all = sharedPreferences.getAll();
        AbstractC5868k.m23673e(all, "sp.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC5868k.m23669a(entry.getKey(), ((AdInfo) it.next()).getAd_id())) {
                        break;
                    }
                } else {
                    edit.remove(entry.getKey());
                    break;
                }
            }
        }
        edit.apply();
    }

    /* renamed from: A */
    public final List m24557A(Context context, String str, String str2, boolean z10, String str3) {
        long j10;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "hasPay");
        if (str == null) {
            return null;
        }
        C7194g c7194g = C7194g.f26904a;
        List list = (List) f24191l.get(str);
        TimeInfoBean timeInfoBean = f24182c;
        if (timeInfoBean != null) {
            j10 = TimeInfoBean.getCurrTime$default(timeInfoBean, 0L, 1, null);
        } else {
            j10 = 0;
        }
        return c7194g.m27834c(context, str, list, str2, j10, z10, str3);
    }

    /* renamed from: C */
    public final void m24558C(final Context context, final String str, InterfaceC6611f interfaceC6611f, final String str2, final boolean z10, final String str3) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(interfaceC6611f, "callback");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "hasPay");
        Observable observeOn = Observable.create(new ObservableOnSubscribe() { // from class: p0.h
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6156m.m24512E(context, str, str2, z10, str3, observableEmitter);
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b(interfaceC6611f);
        Consumer consumer = new Consumer() { // from class: p0.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24513F(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c(interfaceC6611f);
        observeOn.subscribe(consumer, new Consumer() { // from class: p0.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24514G(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: H */
    public final List m24559H(Context context, String str, String str2, String str3, boolean z10, String str4) {
        boolean z11 = false;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(str2, "mediaType");
        AbstractC5868k.m23674f(str3, "userIdentity");
        AbstractC5868k.m23674f(str4, "hasPay");
        List list = (List) f24191l.get(str);
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        C6610e c6610e = f24187h;
        TimeInfoBean timeInfoBean = f24182c;
        long j10 = 0;
        if (timeInfoBean != null) {
            j10 = TimeInfoBean.getCurrTime$default(timeInfoBean, 0L, 1, null);
        }
        return c6610e.m25823a(context, str, list, str2, str3, j10, z10, str4);
    }

    /* renamed from: J */
    public final ArrayList m24560J(Context context, String str, String str2, String str3, boolean z10, String str4) {
        boolean z11 = false;
        ArrayList arrayList;
        long j10;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "mediaType");
        AbstractC5868k.m23674f(str4, "hasPay");
        List<AdInfo> list = (List) f24191l.get(str);
        int i10 = 1;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AdInfo adInfo : list) {
            if (AbstractC5868k.m23669a(adInfo.getMedia_type(), str3)) {
                C7194g c7194g = C7194g.f26904a;
                TimeInfoBean timeInfoBean = f24182c;
                if (timeInfoBean != null) {
                    j10 = TimeInfoBean.getCurrTime$default(timeInfoBean, 0L, i10, null);
                } else {
                    j10 = 0;
                }
                arrayList = arrayList2;
                AdInfo m27832a = c7194g.m27832a(context, str, adInfo, str2, j10, z10, str4);
                if (m27832a != null) {
                    arrayList.add(m27832a);
                }
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
            i10 = 1;
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() <= 0) {
            return null;
        }
        return arrayList3;
    }

    /* renamed from: M */
    public final AdInfo m24561M(String str, String str2) {
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(str2, "mediaType");
        List list = (List) f24191l.get(str);
        if (list != null && !list.isEmpty()) {
            return f24186g.mo25820b(str, list, str2);
        }
        return null;
    }

    /* renamed from: N */
    public final List m24562N(Context context, String str) {
        boolean z10 = false;
        List list;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C7193f c7193f = C7193f.f26903a;
        String str2 = f24189j;
        String str3 = (String) c7193f.m27828a(context, str2, "");
        if (str3.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (list = (List) new Gson().fromJson(str3, new d().getType())) == null || list.isEmpty()) {
            return null;
        }
        return f24186g.mo25819a(str2, list, str);
    }

    /* renamed from: O */
    public final Dns m24563O() {
        return f24196q;
    }

    /* renamed from: P */
    public final InterfaceC6606a m24564P() {
        return f24200u;
    }

    /* renamed from: Q */
    public final Interceptor m24565Q() {
        return f24197r;
    }

    /* renamed from: S */
    public final Handler m24566S() {
        return f24193n;
    }

    /* renamed from: T */
    public final ScheduledThreadPoolExecutor m24567T() {
        return f24190k;
    }

    /* renamed from: U */
    public final TimeInfoBean m24568U() {
        TimeInfoBean timeInfoBean = f24182c;
        if (timeInfoBean != null) {
            return timeInfoBean;
        }
        return f24183d;
    }

    /* renamed from: V */
    public final void m24569V(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        f24187h.m25824b(adInfo);
    }

    /* renamed from: W */
    public final void m24570W(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        f24186g.mo25821c(adInfo);
    }

    /* renamed from: b0 */
    public final void m24571b0(Context context, String str, String str2, InterfaceC6607b interfaceC6607b, String str3, boolean z10) {
        String str4 = null;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str3, "ad_version");
        String str5 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str5, "RELEASE");
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        String language = Locale.getDefault().getLanguage();
        AbstractC5868k.m23673e(language, "getDefault().language");
        String packageName = context.getPackageName();
        AbstractC5868k.m23673e(packageName, "context.packageName");
        AdvertBean advertBean = new AdvertBean(DispatchConstants.ANDROID, str5, str3, str4, language, "jpg/png/bmp", "mp4/rmvb/flv", packageName, String.valueOf(C7194g.f26904a.m27833b(context)));
        f24194o = str;
        f24195p = str2;
        Observable subscribeOn = m24517L().m27064g(advertBean).subscribeOn(Schedulers.m20294io());
        final i iVar = new i(context, z10, interfaceC6607b);
        Observable observeOn = subscribeOn.doOnNext(new Consumer() { // from class: p0.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24528d0(InterfaceC5660l.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final j jVar = new j(context);
        Consumer consumer = new Consumer() { // from class: p0.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24530e0(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = new k(interfaceC6607b, context);
        observeOn.subscribe(consumer, new Consumer() { // from class: p0.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6156m.m24532f0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: g0 */
    public final void m24572g0(Context context, String str, String str2) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "ad_type");
        AbstractC5868k.m23674f(str2, "ad_id");
        C7193f c7193f = C7193f.f26903a;
        TimeInfoBean timeInfoBean = f24182c;
        long j10 = 0;
        if (timeInfoBean != null) {
            j10 = TimeInfoBean.getCurrTime$default(timeInfoBean, 0L, 1, null);
        }
        c7193f.m27831d(context, str, str2, Long.valueOf(j10));
    }

    /* renamed from: h0 */
    public final void m24573h0(Dns dns) {
        AbstractC5868k.m23674f(dns, "<set-?>");
        f24196q = dns;
    }

    /* renamed from: i0 */
    public final void m24574i0(Interceptor interceptor) {
        f24197r = interceptor;
    }

    /* renamed from: j0 */
    public final void m24575j0(final Context context, final ImageView imageView, final String str, final AdInfo adInfo, final Integer num, final InterfaceC5660l interfaceC5660l, final Integer num2, final boolean z10, final int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "iv");
        AbstractC5868k.m23674f(str, "adType");
        if (adInfo != null && !C5715b.f22948a.m23098a(context)) {
            AbstractC7030g.m27129c("showAdGetCache", new Runnable() { // from class: p0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6156m.m24540l0(context, str, adInfo, imageView, num, interfaceC5660l, num2, z10, i10);
                }
            }, false);
        }
    }

    /* renamed from: z */
    public final List m24576z(String str) {
        if (str == null) {
            return null;
        }
        return (List) f24191l.get(str);
    }
}
