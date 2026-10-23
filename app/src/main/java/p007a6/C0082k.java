package p007a6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p007a6.C0094q;
import p026b6.C1131c;
import p026b6.C1137i;
import p038c6.AbstractC1370c0;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p127f5.InterfaceC4243h;
import p128f6.C4270f;
import p157h6.C4552d;
import p157h6.InterfaceC4557i;
import p395x5.C7503f;
import p395x5.InterfaceC7498a;
import p395x5.InterfaceC7504g;
import p411y5.InterfaceC7674a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.k */
/* loaded from: classes.dex */
public class C0082k {

    /* renamed from: s */
    static final FilenameFilter f227s = new FilenameFilter() { // from class: a6.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m301K;
            m301K = C0082k.m301K(file, str);
            return m301K;
        }
    };

    /* renamed from: a */
    private final Context f228a;

    /* renamed from: b */
    private final C0098s f229b;

    /* renamed from: c */
    private final C0088n f230c;

    /* renamed from: d */
    private final C1137i f231d;

    /* renamed from: e */
    private final C0076h f232e;

    /* renamed from: f */
    private final C0104w f233f;

    /* renamed from: g */
    private final C4270f f234g;

    /* renamed from: h */
    private final C0062a f235h;

    /* renamed from: i */
    private final C1131c f236i;

    /* renamed from: j */
    private final InterfaceC7498a f237j;

    /* renamed from: k */
    private final InterfaceC7674a f238k;

    /* renamed from: l */
    private final C0091o0 f239l;

    /* renamed from: m */
    private C0094q f240m;

    /* renamed from: n */
    private InterfaceC4557i f241n = null;

    /* renamed from: o */
    final C4247j f242o = new C4247j();

    /* renamed from: p */
    final C4247j f243p = new C4247j();

    /* renamed from: q */
    final C4247j f244q = new C4247j();

    /* renamed from: r */
    final AtomicBoolean f245r = new AtomicBoolean(false);

    /* renamed from: a6.k$a */
    /* loaded from: classes.dex */
    class a implements C0094q.a {
        a() {
        }

        @Override // p007a6.C0094q.a
        /* renamed from: a */
        public void mo344a(InterfaceC4557i interfaceC4557i, Thread thread, Throwable th) {
            C0082k.this.m328H(interfaceC4557i, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.k$b */
    /* loaded from: classes.dex */
    public class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f247a;

        /* renamed from: b */
        final /* synthetic */ Throwable f248b;

        /* renamed from: c */
        final /* synthetic */ Thread f249c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC4557i f250d;

        /* renamed from: e */
        final /* synthetic */ boolean f251e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a6.k$b$a */
        /* loaded from: classes.dex */
        public class a implements InterfaceC4243h {

            /* renamed from: a */
            final /* synthetic */ Executor f253a;

            /* renamed from: b */
            final /* synthetic */ String f254b;

            a(Executor executor, String str) {
                this.f253a = executor;
                this.f254b = str;
            }

            @Override // p127f5.InterfaceC4243h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC4245i mo346a(C4552d c4552d) {
                String str = null;
                if (c4552d == null) {
                    C7503f.m28716f().m28725k("Received null app settings, cannot send reports at crash time.");
                    return AbstractC4250l.m17733e(null);
                }
                AbstractC4245i[] abstractC4245iArr = new AbstractC4245i[2];
                abstractC4245iArr[0] = C0082k.this.m303N();
                C0091o0 c0091o0 = C0082k.this.f239l;
                Executor executor = this.f253a;
                if (b.this.f251e) {
                    str = this.f254b;
                }
                abstractC4245iArr[1] = c0091o0.m433w(executor, str);
                return AbstractC4250l.m17735g(abstractC4245iArr);
            }
        }

        b(long j10, Throwable th, Thread thread, InterfaceC4557i interfaceC4557i, boolean z10) {
            this.f247a = j10;
            this.f248b = th;
            this.f249c = thread;
            this.f250d = interfaceC4557i;
            this.f251e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC4245i call() {
            long m300G = C0082k.m300G(this.f247a);
            String m297D = C0082k.this.m297D();
            if (m297D == null) {
                C7503f.m28716f().m28719d("Tried to write a fatal exception while no session was open.");
                return AbstractC4250l.m17733e(null);
            }
            C0082k.this.f230c.m384a();
            C0082k.this.f239l.m428r(this.f248b, this.f249c, m297D, m300G);
            C0082k.this.m326y(this.f247a);
            C0082k.this.m342v(this.f250d);
            C0082k.this.m325x(new C0072f(C0082k.this.f233f).toString());
            if (!C0082k.this.f229b.m444d()) {
                return AbstractC4250l.m17733e(null);
            }
            Executor m284c = C0082k.this.f232e.m284c();
            return this.f250d.mo18973a().mo17714p(m284c, new a(m284c, m297D));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.k$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC4243h {
        c() {
        }

        @Override // p127f5.InterfaceC4243h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4245i mo346a(Void r12) {
            return AbstractC4250l.m17733e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.k$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC4243h {

        /* renamed from: a */
        final /* synthetic */ AbstractC4245i f257a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a6.k$d$a */
        /* loaded from: classes.dex */
        public class a implements Callable {

            /* renamed from: a */
            final /* synthetic */ Boolean f259a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a6.k$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C7791a implements InterfaceC4243h {

                /* renamed from: a */
                final /* synthetic */ Executor f261a;

                C7791a(Executor executor) {
                    this.f261a = executor;
                }

                @Override // p127f5.InterfaceC4243h
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public AbstractC4245i mo346a(C4552d c4552d) {
                    if (c4552d != null) {
                        C0082k.this.m303N();
                        C0082k.this.f239l.m432v(this.f261a);
                        C0082k.this.f244q.m17728e(null);
                        return AbstractC4250l.m17733e(null);
                    }
                    C7503f.m28716f().m28725k("Received null app settings at app startup. Cannot send cached reports");
                    return AbstractC4250l.m17733e(null);
                }
            }

            a(Boolean bool) {
                this.f259a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC4245i call() {
                if (!this.f259a.booleanValue()) {
                    C7503f.m28716f().m28723i("Deleting cached crash reports...");
                    C0082k.m323s(C0082k.this.m331L());
                    C0082k.this.f239l.m431u();
                    C0082k.this.f244q.m17728e(null);
                    return AbstractC4250l.m17733e(null);
                }
                C7503f.m28716f().m28717b("Sending cached crash reports...");
                C0082k.this.f229b.m443c(this.f259a.booleanValue());
                Executor m284c = C0082k.this.f232e.m284c();
                return d.this.f257a.mo17714p(m284c, new C7791a(m284c));
            }
        }

        d(AbstractC4245i abstractC4245i) {
            this.f257a = abstractC4245i;
        }

        @Override // p127f5.InterfaceC4243h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4245i mo346a(Boolean bool) {
            return C0082k.this.f232e.m287i(new a(bool));
        }
    }

    /* renamed from: a6.k$e */
    /* loaded from: classes.dex */
    class e implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f263a;

        /* renamed from: b */
        final /* synthetic */ String f264b;

        e(long j10, String str) {
            this.f263a = j10;
            this.f264b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!C0082k.this.m330J()) {
                C0082k.this.f236i.m5126g(this.f263a, this.f264b);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a6.k$f */
    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f266a;

        /* renamed from: b */
        final /* synthetic */ Throwable f267b;

        /* renamed from: c */
        final /* synthetic */ Thread f268c;

        f(long j10, Throwable th, Thread thread) {
            this.f266a = j10;
            this.f267b = th;
            this.f268c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C0082k.this.m330J()) {
                long m300G = C0082k.m300G(this.f266a);
                String m297D = C0082k.this.m297D();
                if (m297D == null) {
                    C7503f.m28716f().m28725k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C0082k.this.f239l.m429s(this.f267b, this.f268c, m297D, m300G);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.k$g */
    /* loaded from: classes.dex */
    public class g implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f270a;

        g(String str) {
            this.f270a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C0082k.this.m325x(this.f270a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.k$h */
    /* loaded from: classes.dex */
    public class h implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f272a;

        h(long j10) {
            this.f272a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f272a);
            C0082k.this.f238k.mo28427a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0082k(Context context, C0076h c0076h, C0104w c0104w, C0098s c0098s, C4270f c4270f, C0088n c0088n, C0062a c0062a, C1137i c1137i, C1131c c1131c, C0091o0 c0091o0, InterfaceC7498a interfaceC7498a, InterfaceC7674a interfaceC7674a) {
        this.f228a = context;
        this.f232e = c0076h;
        this.f233f = c0104w;
        this.f229b = c0098s;
        this.f234g = c4270f;
        this.f230c = c0088n;
        this.f235h = c0062a;
        this.f231d = c1137i;
        this.f236i = c1131c;
        this.f237j = interfaceC7498a;
        this.f238k = interfaceC7674a;
        this.f239l = c0091o0;
    }

    /* renamed from: A */
    private void m295A(String str) {
        C7503f.m28716f().m28723i("Finalizing native report for session " + str);
        InterfaceC7504g mo10879a = this.f237j.mo10879a(str);
        File mo10900d = mo10879a.mo10900d();
        if (mo10900d != null && mo10900d.exists()) {
            long lastModified = mo10900d.lastModified();
            C1131c c1131c = new C1131c(this.f234g, str);
            File m17799i = this.f234g.m17799i(str);
            if (!m17799i.isDirectory()) {
                C7503f.m28716f().m28725k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            m326y(lastModified);
            List m299F = m299F(mo10879a, str, this.f234g, c1131c.m5122b());
            AbstractC0063a0.m221b(m17799i, m299F);
            C7503f.m28716f().m28717b("CrashlyticsController#finalizePreviousNativeSession");
            this.f239l.m423h(str, m299F);
            c1131c.m5121a();
            return;
        }
        C7503f.m28716f().m28725k("No minidump data found for session " + str);
    }

    /* renamed from: C */
    private static boolean m296C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public String m297D() {
        SortedSet m426n = this.f239l.m426n();
        if (!m426n.isEmpty()) {
            return (String) m426n.first();
        }
        return null;
    }

    /* renamed from: E */
    private static long m298E() {
        return m300G(System.currentTimeMillis());
    }

    /* renamed from: F */
    static List m299F(InterfaceC7504g interfaceC7504g, String str, C4270f c4270f, byte[] bArr) {
        File m17804o = c4270f.m17804o(str, "user-data");
        File m17804o2 = c4270f.m17804o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0070e("logs_file", "logs", bArr));
        arrayList.add(new C0103v("crash_meta_file", "metadata", interfaceC7504g.mo10902f()));
        arrayList.add(new C0103v("session_meta_file", C3384f.f14569aC, interfaceC7504g.mo10901e()));
        arrayList.add(new C0103v("app_meta_file", "app", interfaceC7504g.mo10897a()));
        arrayList.add(new C0103v("device_meta_file", "device", interfaceC7504g.mo10899c()));
        arrayList.add(new C0103v("os_meta_file", "os", interfaceC7504g.mo10898b()));
        arrayList.add(new C0103v("minidump_file", "minidump", interfaceC7504g.mo10900d()));
        arrayList.add(new C0103v("user_meta_file", C3309bd.f14106m, m17804o));
        arrayList.add(new C0103v("keys_file", "keys", m17804o2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static long m300G(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ boolean m301K(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: M */
    private AbstractC4245i m302M(long j10) {
        if (m296C()) {
            C7503f.m28716f().m28725k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC4250l.m17733e(null);
        }
        C7503f.m28716f().m28717b("Logging app exception event to Firebase Analytics");
        return AbstractC4250l.m17731c(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public AbstractC4245i m303N() {
        ArrayList arrayList = new ArrayList();
        for (File file : m331L()) {
            try {
                arrayList.add(m302M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C7503f.m28716f().m28725k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC4250l.m17734f(arrayList);
    }

    /* renamed from: T */
    private AbstractC4245i m304T() {
        if (this.f229b.m444d()) {
            C7503f.m28716f().m28717b("Automatic data collection is enabled. Allowing upload.");
            this.f242o.m17728e(Boolean.FALSE);
            return AbstractC4250l.m17733e(Boolean.TRUE);
        }
        C7503f.m28716f().m28717b("Automatic data collection is disabled.");
        C7503f.m28716f().m28723i("Notifying that unsent reports are available.");
        this.f242o.m17728e(Boolean.TRUE);
        AbstractC4245i mo17713o = this.f229b.m446i().mo17713o(new c());
        C7503f.m28716f().m28717b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC0101t0.m458i(mo17713o, this.f243p.m17724a());
    }

    /* renamed from: U */
    private void m305U(String str) {
        List historicalProcessExitReasons;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f228a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f239l.m430t(str, historicalProcessExitReasons, new C1131c(this.f234g, str), C1137i.m5175i(str, this.f234g, this.f232e));
                return;
            } else {
                C7503f.m28716f().m28723i("No ApplicationExitInfo available. Session: " + str);
                return;
            }
        }
        C7503f.m28716f().m28723i("ANR feature enabled, but device is API " + i10);
    }

    /* renamed from: p */
    private static AbstractC1370c0.a m320p(C0104w c0104w, C0062a c0062a) {
        return AbstractC1370c0.a.m6415b(c0104w.m475f(), c0062a.f188e, c0062a.f189f, c0104w.mo474a(), EnumC0100t.m448a(c0062a.f186c).m449b(), c0062a.f190g);
    }

    /* renamed from: q */
    private static AbstractC1370c0.b m321q() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC1370c0.b.m6422c(AbstractC0074g.m262l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC0074g.m269s(), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC0074g.m275y(), AbstractC0074g.m263m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    private static AbstractC1370c0.c m322r() {
        return AbstractC1370c0.c.m6432a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC0074g.m276z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static void m323s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private void m324w(boolean z10, InterfaceC4557i interfaceC4557i) {
        String str = null;
        ArrayList arrayList = new ArrayList(this.f239l.m426n());
        if (arrayList.size() <= z10) {
            C7503f.m28716f().m28723i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (interfaceC4557i.mo18974b().f19601b.f19609b) {
            m305U(str2);
        } else {
            C7503f.m28716f().m28723i("ANR feature disabled.");
        }
        if (this.f237j.mo10881c(str2)) {
            m295A(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            str = null;
        }
        this.f239l.m424i(m298E(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m325x(String str) {
        long m298E = m298E();
        C7503f.m28716f().m28717b("Opening a new session with ID " + str);
        this.f237j.mo10882d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C0086m.m364l()), m298E, AbstractC1370c0.m6411b(m320p(this.f233f, this.f235h), m322r(), m321q()));
        this.f236i.m5124e(str);
        this.f239l.m427o(str, m298E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m326y(long j10) {
        try {
            if (!this.f234g.m17795e(".ae" + j10).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            C7503f.m28716f().m28726l("Could not create app exception marker file.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m327B(InterfaceC4557i interfaceC4557i) {
        this.f232e.m283b();
        if (m330J()) {
            C7503f.m28716f().m28725k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C7503f.m28716f().m28723i("Finalizing previously open sessions.");
        try {
            m324w(true, interfaceC4557i);
            C7503f.m28716f().m28723i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            C7503f.m28716f().m28720e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* renamed from: H */
    void m328H(InterfaceC4557i interfaceC4557i, Thread thread, Throwable th) {
        m329I(interfaceC4557i, thread, th, false);
    }

    /* renamed from: I */
    synchronized void m329I(InterfaceC4557i interfaceC4557i, Thread thread, Throwable th, boolean z10) {
        C7503f.m28716f().m28717b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            AbstractC0101t0.m453d(this.f232e.m287i(new b(System.currentTimeMillis(), th, thread, interfaceC4557i, z10)));
        } catch (TimeoutException unused) {
            C7503f.m28716f().m28719d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            C7503f.m28716f().m28720e("Error handling uncaught exception", e10);
        }
    }

    /* renamed from: J */
    boolean m330J() {
        C0094q c0094q = this.f240m;
        if (c0094q != null && c0094q.m437a()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    List m331L() {
        return this.f234g.m17796f(f227s);
    }

    /* renamed from: O */
    void m332O(String str) {
        this.f232e.m286h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public AbstractC4245i m333P() {
        this.f243p.m17728e(Boolean.TRUE);
        return this.f244q.m17724a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m334Q(String str, String str2) {
        try {
            this.f231d.m5181l(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f228a;
            if (context != null && AbstractC0074g.m273w(context)) {
                throw e10;
            }
            C7503f.m28716f().m28719d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m335R(String str) {
        this.f231d.m5182m(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public AbstractC4245i m336S(AbstractC4245i abstractC4245i) {
        if (!this.f239l.m425l()) {
            C7503f.m28716f().m28723i("No crash reports are available to be sent.");
            this.f242o.m17728e(Boolean.FALSE);
            return AbstractC4250l.m17733e(null);
        }
        C7503f.m28716f().m28723i("Crash reports are available to be sent.");
        return m304T().mo17713o(new d(abstractC4245i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m337V(Thread thread, Throwable th) {
        this.f232e.m285g(new f(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m338W(long j10, String str) {
        this.f232e.m286h(new e(j10, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC4245i m339o() {
        if (!this.f245r.compareAndSet(false, true)) {
            C7503f.m28716f().m28725k("checkForUnsentReports should only be called once per execution.");
            return AbstractC4250l.m17733e(Boolean.FALSE);
        }
        return this.f242o.m17724a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public AbstractC4245i m340t() {
        this.f243p.m17728e(Boolean.FALSE);
        return this.f244q.m17724a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m341u() {
        if (!this.f230c.m385c()) {
            String m297D = m297D();
            if (m297D != null && this.f237j.mo10881c(m297D)) {
                return true;
            }
            return false;
        }
        C7503f.m28716f().m28723i("Found previous crash marker.");
        this.f230c.m386d();
        return true;
    }

    /* renamed from: v */
    void m342v(InterfaceC4557i interfaceC4557i) {
        m324w(false, interfaceC4557i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m343z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC4557i interfaceC4557i) {
        this.f241n = interfaceC4557i;
        m332O(str);
        C0094q c0094q = new C0094q(new a(), interfaceC4557i, uncaughtExceptionHandler, this.f237j);
        this.f240m = c0094q;
        Thread.setDefaultUncaughtExceptionHandler(c0094q);
    }
}
