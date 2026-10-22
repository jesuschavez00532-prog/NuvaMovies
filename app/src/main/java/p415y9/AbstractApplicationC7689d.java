package p415y9;

import ad.C0232d;
import android.content.Context;
import bd.C1304k;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import com.module.event.LoginSuccessEvent;
import com.module.event.MsgUnReadSizeUpdateEvent;
import com.module.event.RemoteLoginEvent;
import com.module.p069db.UmengPush;
import com.module.p069db.UmengPushDao;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3384f;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.entity.UMessage;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.xutils.C6127x;
import p042cb.ThreadFactoryC1440a;
import p104dd.AbstractC4096d;
import p170i2.C4842a;
import p179ib.AbstractC4928e;
import p179ib.AbstractC4929f;
import p201k2.AbstractC5086c;
import p277p0.C6160q;
import p287pb.AbstractApplicationC6253c;
import p337t5.C6913d;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7030g;
import p363v2.C7197a;
import p383w9.C7383a;
import p400xa.C7587m;
import p415y9.AbstractApplicationC7689d;
import p417yb.C7697b;
import p418yc.C7705h;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: y9.d */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC7689d extends AbstractApplicationC6253c implements C0232d.a {

    /* renamed from: e */
    public static Context f28136e;

    /* renamed from: d */
    public static final a f28135d = new a(null);

    /* renamed from: f */
    private static String f28137f = "";

    /* renamed from: g */
    private static String f28138g = "";

    /* renamed from: y9.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final Context m29494a() {
            Context context = AbstractApplicationC7689d.f28136e;
            if (context != null) {
                return context;
            }
            AbstractC5868k.m23686r(C3384f.f14563X);
            return null;
        }

        /* renamed from: b */
        public final String m29495b() {
            return AbstractApplicationC7689d.f28137f;
        }

        /* renamed from: c */
        public final void m29496c(Context context) {
            AbstractC5868k.m23674f(context, "<set-?>");
            AbstractApplicationC7689d.f28136e = context;
        }
    }

    /* renamed from: y9.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4928e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m29498f(UmengPush umengPush) {
            UmengPushDao umengPushDao = new UmengPushDao();
            AbstractC5868k.m23673e(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
            umengPushDao.addMessage(umengPush);
        }

        @Override // p179ib.AbstractC4928e
        /* renamed from: d */
        public void mo20250d(Context context, UMessage uMessage) {
            super.mo20250d(context, uMessage);
            try {
                Gson m27114a = AbstractC7027d.m27114a();
                AbstractC5868k.m23671c(uMessage);
                final UmengPush umengPush = (UmengPush) m27114a.fromJson(uMessage.custom, UmengPush.class);
                umengPush.setMsgId(uMessage.msg_id);
                umengPush.setTicker(uMessage.ticker);
                umengPush.setTitle(uMessage.title);
                umengPush.setText(uMessage.text);
                umengPush.setMessageTime(AbstractC5086c.m20616i("yyyy-MM-dd HH:mm"));
                umengPush.setStatus(UmengPush.UN_READ);
                if (AbstractC5868k.m23669a(UmengPush.TYPE_LOGIN, umengPush.getMessageType())) {
                    C7709c m29787d = C7709c.m29787d();
                    AbstractC5868k.m23673e(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
                    m29787d.m29802p(new RemoteLoginEvent(umengPush));
                } else {
                    AbstractC7030g.m27129c("add push msg", new Runnable() { // from class: y9.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractApplicationC7689d.b.m29498f(UmengPush.this);
                        }
                    }, false);
                    C7709c.m29787d().m29801m(new MsgUnReadSizeUpdateEvent());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: y9.d$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f28140a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Scheduler mo542f(Callable callable) {
            AbstractC5868k.m23674f(callable, "it");
            return Schedulers.from(new ThreadPoolExecutor(16, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1440a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m29483A(AbstractApplicationC7689d abstractApplicationC7689d, boolean z10, String str) {
        AbstractC5868k.m23674f(abstractApplicationC7689d, "this$0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final Scheduler m29484B(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Scheduler) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: w */
    private final void m29489w() {
        C7697b.f28151f.m29576b(this);
    }

    /* renamed from: x */
    private final void m29490x() {
        C6127x.Ext.init(this);
        C6127x.Ext.setDebug(false);
    }

    /* renamed from: y */
    private final void m29491y() {
        C7383a.f27389a.m28495a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m29492z(AbstractApplicationC7689d abstractApplicationC7689d, boolean z10, String str) {
        AbstractC5868k.m23674f(abstractApplicationC7689d, "this$0");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        AbstractC5868k.m23674f(context, "base");
        super.attachBaseContext(context);
        C5634i.m22856r(false);
        C7383a.f27389a.m28497d("appLauncher");
    }

    @Override // ad.C0232d.a
    /* renamed from: b */
    public boolean mo823b() {
        return true;
    }

    @Override // ad.C0232d.a
    /* renamed from: c */
    public int mo824c() {
        return 2;
    }

    @Override // p179ib.AbstractC4929f.d
    /* renamed from: e */
    public void mo20262e(PushAgent pushAgent) {
        AbstractC5868k.m23674f(pushAgent, "pushAgent");
        pushAgent.setNotificationOnForeground(false);
        AbstractC4929f.m20258h(new b());
    }

    @Override // ad.C0232d.a
    /* renamed from: f */
    public int mo825f() {
        return 1;
    }

    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: i */
    public String mo24885i() {
        return C4842a.f20329a.m19920a().mo19961j();
    }

    @Override // p287pb.AbstractApplicationC6253c, android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // p287pb.AbstractApplicationC6253c, android.app.Application
    public void onTerminate() {
        super.onTerminate();
        if (C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        AbstractC4096d.m17151a("stop");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: p */
    public void mo24886p() {
        super.mo24886p();
        m29491y();
        a aVar = f28135d;
        aVar.m29496c(this);
        m29490x();
        m29489w();
        C7705h m29771a = C7705h.f28256m.m29771a();
        String absolutePath = getDir("luna", 0).getAbsolutePath();
        AbstractC5868k.m23673e(absolutePath, "this.getDir(\"luna\", Cont…ODE_PRIVATE).absolutePath");
        C1304k c1304k = C1304k.f4966a;
        m29771a.m29762r(absolutePath, c1304k.m5923f(), c1304k.m5924g());
        C0232d.f631a.m821c(this);
        final c cVar = c.f28140a;
        RxJavaPlugins.setInitIoSchedulerHandler(new Function() { // from class: y9.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Scheduler m29484B;
                m29484B = AbstractApplicationC7689d.m29484B(InterfaceC5660l.this, obj);
                return m29484B;
            }
        });
        C7197a.f26917a.m27858o(this);
        C7587m.m29116a().m29117b(aVar.m29494a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: q */
    public void mo11356q() {
        C6913d.m26858p(this);
        C6160q.f24221a.m24598g(this);
        if (!C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29803r(this);
        }
        super.mo11356q();
        AbstractC4096d.m17151a("start");
    }

    @InterfaceC7719m
    public final void registPushTagAndAlias(LoginSuccessEvent loginSuccessEvent) {
        AbstractC5868k.m23674f(loginSuccessEvent, "event");
        MobclickAgent.onProfileSignIn(loginSuccessEvent.getUserId());
        FirebaseCrashlytics.getInstance().setUserId(loginSuccessEvent.getUserId());
        PushAgent.getInstance(this).setAlias(loginSuccessEvent.getUserId(), "userId", new UPushAliasCallback() { // from class: y9.a
            @Override // com.umeng.message.api.UPushAliasCallback
            public final void onMessage(boolean z10, String str) {
                AbstractApplicationC7689d.m29492z(AbstractApplicationC7689d.this, z10, str);
            }
        });
        PushAgent.getInstance(this).setAlias(loginSuccessEvent.getUserSn(), "sn", new UPushAliasCallback() { // from class: y9.b
            @Override // com.umeng.message.api.UPushAliasCallback
            public final void onMessage(boolean z10, String str) {
                AbstractApplicationC7689d.m29483A(AbstractApplicationC7689d.this, z10, str);
            }
        });
    }

    /* renamed from: v */
    public final void m29493v(String str, String str2) {
        AbstractC5868k.m23674f(str, "flavor");
        AbstractC5868k.m23674f(str2, "patchVersion");
        f28137f = str;
        f28138g = str2;
    }
}
