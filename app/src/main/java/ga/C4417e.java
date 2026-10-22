package ga;

import ac.C0180m1;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import be.C1328x;
import cc.C1441a;
import cc.C1446c0;
import cc.C1466m0;
import com.request.result.LoginResult;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Method;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p012ab.C0128d;
import p104dd.AbstractC4096d;
import p135fd.C4307b;
import p301qb.InterfaceC6444z0;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p421z0.C7734h;

/* renamed from: ga.e */
/* loaded from: classes2.dex */
public final class C4417e {

    /* renamed from: a */
    public static final C4417e f19115a;

    /* renamed from: b */
    private static String f19116b;

    /* renamed from: c */
    private static final String f19117c;

    /* renamed from: d */
    private static final String f19118d;

    /* renamed from: e */
    private static final String f19119e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.e$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f19120a;

        /* renamed from: ga.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7847a implements InterfaceC6444z0 {
            C7847a() {
            }

            @Override // p301qb.InterfaceC6444z0
            /* renamed from: H4 */
            public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
                AbstractC5868k.m23674f(str, "password");
            }

            @Override // p301qb.InterfaceC6444z0
            /* renamed from: N */
            public void mo18505N(boolean z10, LoginResult loginResult) {
            }

            @Override // p301qb.InterfaceC6433v1
            /* renamed from: N3 */
            public C4307b mo523N3() {
                return null;
            }

            @Override // p301qb.InterfaceC6444z0
            /* renamed from: f0 */
            public void mo18506f0(boolean z10, String str) {
                AbstractC5868k.m23674f(str, "errCode");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(1);
            this.f19120a = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            C7734h.f28449q.m29905a().m29891h();
            if (this.f19120a) {
                C0180m1.m658j(new C0180m1(new C7847a(), null, 2, 0 == true ? 1 : 0), null, null, 3, null);
                Thread.sleep(100L);
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.e$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f19121a;

        /* renamed from: b */
        final /* synthetic */ boolean f19122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, boolean z10) {
            super(1);
            this.f19121a = context;
            this.f19122b = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            MobclickAgent.onKillProcess(this.f19121a);
            if (!TextUtils.isEmpty(C1446c0.f5559a.m6748t()) && Build.VERSION.SDK_INT < 26 && !this.f19122b) {
                Object systemService = this.f19121a.getSystemService("activity");
                AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager activityManager = (ActivityManager) systemService;
                try {
                    Method declaredMethod = activityManager.getClass().getDeclaredMethod("forceStopPackage", String.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(activityManager, str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.e$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f19123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(1);
            this.f19123a = context;
        }

        /* renamed from: a */
        public final void m18508a(Boolean bool) {
            try {
                C1441a.f5552a.m6704b();
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            } catch (Exception unused) {
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18508a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.e$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f19124a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m18509a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18509a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C4417e c4417e = new C4417e();
        f19115a = c4417e;
        f19116b = c4417e.getClass().getSimpleName();
        f19117c = "xposed";
        f19118d = "/system/lib/libxposed_art.so";
        f19119e = "/system/lib64/libxposed_art.so";
    }

    private C4417e() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m18497f(C4417e c4417e, Context context, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        c4417e.m18502e(context, str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final String m18498g(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final Boolean m18499h(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m18500i(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m18501j(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: e */
    public final void m18502e(Context context, String str, boolean z10, boolean z11) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "pkgName");
        C1466m0.f5627a.m6869h0(null);
        AbstractC7028e.m27115a("q");
        AbstractC4096d.m17151a("stop");
        C0128d.f375a.m511h();
        Observable just = Observable.just(str);
        final a aVar = new a(z11);
        Observable map = just.map(new Function() { // from class: ga.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m18498g;
                m18498g = C4417e.m18498g(InterfaceC5660l.this, obj);
                return m18498g;
            }
        });
        final b bVar = new b(context, z10);
        Observable compose = map.map(new Function() { // from class: ga.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m18499h;
                m18499h = C4417e.m18499h(InterfaceC5660l.this, obj);
                return m18499h;
            }
        }).compose(AbstractC7029f.m27121b());
        final c cVar = new c(context);
        Consumer consumer = new Consumer() { // from class: ga.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4417e.m18500i(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f19124a;
        compose.subscribe(consumer, new Consumer() { // from class: ga.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4417e.m18501j(InterfaceC5660l.this, obj);
            }
        });
    }
}
