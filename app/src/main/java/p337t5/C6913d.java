package p337t5;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1790a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.lzy.okgo.cookie.SerializableCookie;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p039c7.AbstractC1396c;
import p039c7.C1395b;
import p203k4.AbstractC5127x;
import p214l.C5303a;
import p219l4.AbstractC5388m;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6199c;
import p281p4.AbstractC6207k;
import p281p4.AbstractC6208l;
import p297q6.InterfaceC6348c;
import p312r6.C6542g;
import p331t.AbstractC6882m;
import p338t6.InterfaceC6922b;
import p366v5.C7216d;
import p366v5.C7222g;
import p366v5.C7230o;
import p366v5.C7239x;
import p412y6.C7680a;

/* renamed from: t5.d */
/* loaded from: classes.dex */
public class C6913d {

    /* renamed from: k */
    private static final Object f26236k = new Object();

    /* renamed from: l */
    private static final Executor f26237l = new d();

    /* renamed from: m */
    static final Map f26238m = new C5303a();

    /* renamed from: a */
    private final Context f26239a;

    /* renamed from: b */
    private final String f26240b;

    /* renamed from: c */
    private final C6920k f26241c;

    /* renamed from: d */
    private final C7230o f26242d;

    /* renamed from: g */
    private final C7239x f26245g;

    /* renamed from: h */
    private final InterfaceC6922b f26246h;

    /* renamed from: e */
    private final AtomicBoolean f26243e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f26244f = new AtomicBoolean();

    /* renamed from: i */
    private final List f26247i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List f26248j = new CopyOnWriteArrayList();

    /* renamed from: t5.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo26848a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5.d$c */
    /* loaded from: classes.dex */
    public static class c implements ComponentCallbacks2C1790a.a {

        /* renamed from: a */
        private static AtomicReference f26249a = new AtomicReference();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m26874c(Context context) {
            if (AbstractC6207k.m24764a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f26249a.get() == null) {
                    c cVar = new c();
                    if (AbstractC5127x.m20760a(f26249a, null, cVar)) {
                        ComponentCallbacks2C1790a.m7929c(application);
                        ComponentCallbacks2C1790a.m7928b().m7931a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1790a.a
        /* renamed from: a */
        public void mo7934a(boolean z10) {
            synchronized (C6913d.f26236k) {
                Iterator it = new ArrayList(C6913d.f26238m.values()).iterator();
                while (it.hasNext()) {
                    C6913d c6913d = (C6913d) it.next();
                    if (c6913d.f26243e.get()) {
                        c6913d.m26864x(z10);
                    }
                }
            }
        }
    }

    /* renamed from: t5.d$d */
    /* loaded from: classes.dex */
    private static class d implements Executor {

        /* renamed from: a */
        private static final Handler f26250a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f26250a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5.d$e */
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference f26251b = new AtomicReference();

        /* renamed from: a */
        private final Context f26252a;

        public e(Context context) {
            this.f26252a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m26876b(Context context) {
            if (f26251b.get() == null) {
                e eVar = new e(context);
                if (AbstractC5127x.m20760a(f26251b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m26877c() {
            this.f26252a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C6913d.f26236k) {
                Iterator it = C6913d.f26238m.values().iterator();
                while (it.hasNext()) {
                    ((C6913d) it.next()).m26857o();
                }
            }
            m26877c();
        }
    }

    protected C6913d(final Context context, String str, C6920k c6920k) {
        this.f26239a = (Context) AbstractC5391n.m21783i(context);
        this.f26240b = AbstractC5391n.m21779e(str);
        this.f26241c = (C6920k) AbstractC5391n.m21783i(c6920k);
        AbstractC1396c.m6440b("Firebase");
        AbstractC1396c.m6440b("ComponentDiscovery");
        List m27954b = C7222g.m27951c(context, ComponentDiscoveryService.class).m27954b();
        AbstractC1396c.m6439a();
        AbstractC1396c.m6440b("Runtime");
        C7230o m27978e = C7230o.m27961i(f26237l).m27977d(m27954b).m27976c(new FirebaseCommonRegistrar()).m27975b(C7216d.m27915q(context, Context.class, new Class[0])).m27975b(C7216d.m27915q(this, C6913d.class, new Class[0])).m27975b(C7216d.m27915q(c6920k, C6920k.class, new Class[0])).m27979g(new C1395b()).m27978e();
        this.f26242d = m27978e;
        AbstractC1396c.m6439a();
        this.f26245g = new C7239x(new InterfaceC6922b() { // from class: t5.b
            @Override // p338t6.InterfaceC6922b
            public final Object get() {
                C7680a m26861u;
                m26861u = C6913d.this.m26861u(context);
                return m26861u;
            }
        });
        this.f26246h = m27978e.mo27943b(C6542g.class);
        m26865g(new b() { // from class: t5.c
            @Override // p337t5.C6913d.b
            /* renamed from: a */
            public final void mo26848a(boolean z10) {
                C6913d.this.m26862v(z10);
            }
        });
        AbstractC1396c.m6439a();
    }

    /* renamed from: h */
    private void m26855h() {
        AbstractC5391n.m21787m(!this.f26244f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public static C6913d m26856k() {
        C6913d c6913d;
        synchronized (f26236k) {
            c6913d = (C6913d) f26238m.get("[DEFAULT]");
            if (c6913d == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC6208l.m24776a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c6913d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m26857o() {
        if (!AbstractC6882m.m26795a(this.f26239a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m26868l());
            e.m26876b(this.f26239a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m26868l());
        this.f26242d.m27972l(m26872t());
        ((C6542g) this.f26246h.get()).m25591n();
    }

    /* renamed from: p */
    public static C6913d m26858p(Context context) {
        synchronized (f26236k) {
            if (f26238m.containsKey("[DEFAULT]")) {
                return m26856k();
            }
            C6920k m26879a = C6920k.m26879a(context);
            if (m26879a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m26859q(context, m26879a);
        }
    }

    /* renamed from: q */
    public static C6913d m26859q(Context context, C6920k c6920k) {
        return m26860r(context, c6920k, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C6913d m26860r(Context context, C6920k c6920k, String str) {
        boolean z10;
        C6913d c6913d;
        c.m26874c(context);
        String m26863w = m26863w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f26236k) {
            Map map = f26238m;
            if (!map.containsKey(m26863w)) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC5391n.m21787m(z10, "FirebaseApp name " + m26863w + " already exists!");
            AbstractC5391n.m21784j(context, "Application context cannot be null.");
            c6913d = new C6913d(context, m26863w, c6920k);
            map.put(m26863w, c6913d);
        }
        c6913d.m26857o();
        return c6913d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C7680a m26861u(Context context) {
        return new C7680a(context, m26870n(), (InterfaceC6348c) this.f26242d.mo27905a(InterfaceC6348c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m26862v(boolean z10) {
        if (!z10) {
            ((C6542g) this.f26246h.get()).m25591n();
        }
    }

    /* renamed from: w */
    private static String m26863w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m26864x(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f26247i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo26848a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6913d)) {
            return false;
        }
        return this.f26240b.equals(((C6913d) obj).m26868l());
    }

    /* renamed from: g */
    public void m26865g(b bVar) {
        m26855h();
        if (this.f26243e.get() && ComponentCallbacks2C1790a.m7928b().m7932d()) {
            bVar.mo26848a(true);
        }
        this.f26247i.add(bVar);
    }

    public int hashCode() {
        return this.f26240b.hashCode();
    }

    /* renamed from: i */
    public Object m26866i(Class cls) {
        m26855h();
        return this.f26242d.mo27905a(cls);
    }

    /* renamed from: j */
    public Context m26867j() {
        m26855h();
        return this.f26239a;
    }

    /* renamed from: l */
    public String m26868l() {
        m26855h();
        return this.f26240b;
    }

    /* renamed from: m */
    public C6920k m26869m() {
        m26855h();
        return this.f26241c;
    }

    /* renamed from: n */
    public String m26870n() {
        return AbstractC6199c.m24746a(m26868l().getBytes(Charset.defaultCharset())) + Operator.Operation.PLUS + AbstractC6199c.m24746a(m26869m().m26881c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: s */
    public boolean m26871s() {
        m26855h();
        return ((C7680a) this.f26245g.get()).m29473b();
    }

    /* renamed from: t */
    public boolean m26872t() {
        return "[DEFAULT]".equals(m26868l());
    }

    public String toString() {
        return AbstractC5388m.m21773c(this).m21774a(SerializableCookie.NAME, this.f26240b).m21774a("options", this.f26241c).toString();
    }
}
