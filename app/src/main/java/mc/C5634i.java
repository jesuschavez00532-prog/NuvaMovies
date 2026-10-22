package mc;

import android.app.Application;
import android.content.Context;
import be.C1328x;
import com.therouter.inject.RouterInject;
import java.util.Arrays;
import java.util.LinkedList;
import me.InterfaceC5664p;
import nc.AbstractC5840d;
import nc.Digraph;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p000a.TheRouterServiceProvideInjecter;
import p302qc.AbstractC6455j;
import p302qc.C6448c;
import sc.C6783a;
import sc.C6784b;
import sc.C6785c;
import sc.C6786d;

/* renamed from: mc.i */
/* loaded from: classes.dex */
public final class C5634i {

    /* renamed from: b */
    private static boolean f22696b;

    /* renamed from: a */
    public static final C5634i f22695a = new C5634i();

    /* renamed from: c */
    private static final LinkedList f22697c = new LinkedList();

    /* renamed from: d */
    private static final RouterInject f22698d = new RouterInject();

    /* renamed from: e */
    private static InterfaceC5664p f22699e = a.f22701a;

    /* renamed from: f */
    private static final Digraph f22700f = new Digraph();

    /* renamed from: mc.i$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final a f22701a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final void m22858a(String str, String str2) {
            AbstractC5868k.m23674f(str, "<anonymous parameter 0>");
            AbstractC5868k.m23674f(str2, "<anonymous parameter 1>");
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m22858a((String) obj, (String) obj2);
            return C1328x.f4998a;
        }
    }

    private C5634i() {
    }

    /* renamed from: d */
    public static final C6448c m22843d(String str) {
        return new C6448c(str);
    }

    /* renamed from: e */
    public static final Object m22844e(Class cls, Object... objArr) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(objArr, "params");
        return f22698d.m13076f(cls, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: g */
    public static final InterfaceC5664p m22845g() {
        return f22699e;
    }

    /* renamed from: h */
    public static final LinkedList m22846h() {
        return f22697c;
    }

    /* renamed from: i */
    public static final RouterInject m22847i() {
        return f22698d;
    }

    /* renamed from: j */
    public static final void m22848j(Context context) {
        m22849k(context, true);
    }

    /* renamed from: k */
    public static final void m22849k(final Context context, boolean z10) {
        if (!AbstractC5635j.m22859a()) {
            AbstractC5635j.m22862d("init", "TheRouter init start!", null, 4, null);
            Digraph digraph = f22700f;
            TheRouterServiceProvideInjecter.addFlowTask(context, digraph);
            AbstractC5635j.m22862d("init", "TheRouter.init() method do @FlowTask before task", null, 4, null);
            digraph.m23613b();
            AbstractC5637l.m22872f(new Runnable() { // from class: mc.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5634i.m22850l();
                }
            });
            if (z10) {
                f22698d.m13075c(context);
            } else {
                f22698d.m13078k(context);
            }
            AbstractC6455j.m25286e();
            AbstractC5637l.m22872f(new Runnable() { // from class: mc.g
                @Override // java.lang.Runnable
                public final void run() {
                    C5634i.m22851m(context);
                }
            });
            AbstractC5635j.m22862d("init", "TheRouter init finish!", null, 4, null);
            AbstractC5635j.m22860b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m22850l() {
        AbstractC5635j.m22862d("init", "TheRouter.init() method do @FlowTask init", null, 4, null);
        f22700f.m23617g();
        AbstractC5635j.m22862d("init", "TheRouter.init() method do @FlowTask schedule", null, 4, null);
        AbstractC5840d.m23634a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m22851m(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(C5636k.f22705a);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        LinkedList linkedList = f22697c;
        linkedList.addFirst(new C6784b());
        linkedList.addFirst(new C6785c());
        linkedList.addFirst(new C6786d());
        linkedList.addFirst(new C6783a());
    }

    /* renamed from: n */
    public static final void m22852n(Object obj) {
        TheRouterServiceProvideInjecter.autowiredInject(obj);
    }

    /* renamed from: o */
    public static final boolean m22853o() {
        return f22696b;
    }

    /* renamed from: p */
    public static final void m22854p(final String str) {
        AbstractC5868k.m23674f(str, "taskName");
        Digraph digraph = f22700f;
        if (digraph.m23615e()) {
            digraph.m23616f(str).mo23630g();
        } else {
            digraph.m23612a(new Runnable() { // from class: mc.h
                @Override // java.lang.Runnable
                public final void run() {
                    C5634i.m22855q(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m22855q(String str) {
        AbstractC5868k.m23674f(str, "$taskName");
        f22700f.m23616f(str).mo23630g();
    }

    /* renamed from: r */
    public static final void m22856r(boolean z10) {
        f22696b = z10;
    }

    /* renamed from: f */
    public final Digraph m22857f() {
        return f22700f;
    }
}
