package p287pb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import cc.AbstractC1468n0;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.message.PushAgent;
import com.umeng.umcrash.UMCrash;
import com.umeng.umcrash.custommapping.UAPMCustomMapping;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p170i2.C4842a;
import p179ib.AbstractC4929f;
import p179ib.EnumC4924a;
import p201k2.AbstractC5085b;
import p201k2.C5090g;
import p348u2.AbstractC7030g;

/* renamed from: pb.c */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC6253c extends Application implements AbstractC4929f.d {

    /* renamed from: b */
    public static final a f24484b = new a(null);

    /* renamed from: c */
    public static Context f24485c;

    /* renamed from: a */
    private final String f24486a = getClass().getSimpleName();

    /* renamed from: pb.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final Context m24887a() {
            Context context = AbstractApplicationC6253c.f24485c;
            if (context != null) {
                return context;
            }
            AbstractC5868k.m23686r(C3384f.f14563X);
            return null;
        }

        /* renamed from: b */
        public final void m24888b(Context context) {
            AbstractC5868k.m23674f(context, "<set-?>");
            AbstractApplicationC6253c.f24485c = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m24882m(AbstractApplicationC6253c abstractApplicationC6253c) {
        AbstractC5868k.m23674f(abstractApplicationC6253c, "this$0");
        abstractApplicationC6253c.mo11355l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m24883n(AbstractApplicationC6253c abstractApplicationC6253c) {
        AbstractC5868k.m23674f(abstractApplicationC6253c, "this$0");
        abstractApplicationC6253c.mo11356q();
    }

    /* renamed from: o */
    private final void m24884o() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(UMCrash.KEY_ENABLE_CRASH_JAVA, true);
        bundle.putBoolean(UMCrash.KEY_ENABLE_CRASH_NATIVE, true);
        bundle.putBoolean(UMCrash.KEY_ENABLE_ANR, true);
        if (Build.VERSION.SDK_INT == 19) {
            bundle.putBoolean(UMCrash.KEY_ENABLE_PA, false);
        } else {
            bundle.putBoolean(UMCrash.KEY_ENABLE_PA, true);
        }
        bundle.putBoolean(UMCrash.KEY_ENABLE_LAUNCH, false);
        bundle.putBoolean(UMCrash.KEY_ENABLE_MEM, false);
        bundle.putBoolean(UMCrash.KEY_ENABLE_NET, false);
        UMCrash.initConfig(bundle);
        AbstractC4929f.m20256f(this, C4842a.f20329a.m19920a().mo19966o(), "Umeng");
    }

    @Override // p179ib.AbstractC4929f.d
    /* renamed from: a */
    public void mo20260a(PushAgent pushAgent, String str, String str2) {
        AbstractC5868k.m23674f(pushAgent, "pushAgent");
        AbstractC5868k.m23674f(str, C3325bt.f14190aH);
        AbstractC5868k.m23674f(str2, UAPMCustomMapping.STRING_PARAM_1);
    }

    @Override // p179ib.AbstractC4929f.d
    /* renamed from: d */
    public void mo20261d(PushAgent pushAgent, String str) {
        AbstractC5868k.m23674f(pushAgent, "pushAgent");
        AbstractC5868k.m23674f(str, "token");
    }

    /* renamed from: i */
    public abstract String mo24885i();

    /* renamed from: j */
    public abstract String mo11353j();

    /* renamed from: k */
    public abstract void mo11354k();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo11355l() {
        AbstractC4929f.m20253c(C4842a.f20329a.m19920a().mo19966o(), "default", EnumC4924a.DEVICE_TYPE_BOX, mo24885i(), this, mo11353j());
        AbstractC4929f.m20257g(false);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m24884o();
        if (!AbstractC5085b.m20605o(this)) {
            AbstractC7030g.m27129c("Sub App Init Um", new Runnable() { // from class: pb.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractApplicationC6253c.m24882m(AbstractApplicationC6253c.this);
                }
            }, false);
            return;
        }
        a aVar = f24484b;
        Context applicationContext = getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "applicationContext");
        aVar.m24888b(applicationContext);
        mo11354k();
        if (C4842a.f20329a.m19920a().mo19965n() != 1) {
            C5090g.f20948a.m20652s();
        }
        mo24886p();
        AbstractC7030g.m27129c("App Init", new Runnable() { // from class: pb.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractApplicationC6253c.m24883n(AbstractApplicationC6253c.this);
            }
        }, false);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo24886p() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void mo11356q() {
        AbstractC1468n0.m6898f();
        mo11355l();
    }
}
