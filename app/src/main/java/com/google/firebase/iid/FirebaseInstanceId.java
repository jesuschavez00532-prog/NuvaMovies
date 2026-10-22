package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.C2649s;
import com.google.firebase.iid.C2651u;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.message.api.UPushThirdTokenCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;
import p127f5.InterfaceC4235d;
import p127f5.InterfaceC4239f;
import p127f5.InterfaceC4243h;
import p219l4.AbstractC5391n;
import p295q4.ThreadFactoryC6342a;
import p327s6.InterfaceC6694a;
import p337t5.C6913d;
import p338t6.InterfaceC6922b;
import p352u6.InterfaceC7048d;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j */
    private static C2651u f10074j;

    /* renamed from: l */
    static ScheduledExecutorService f10076l;

    /* renamed from: a */
    final Executor f10077a;

    /* renamed from: b */
    private final C6913d f10078b;

    /* renamed from: c */
    private final C2644n f10079c;

    /* renamed from: d */
    private final C2641k f10080d;

    /* renamed from: e */
    private final C2649s f10081e;

    /* renamed from: f */
    private final InterfaceC7048d f10082f;

    /* renamed from: g */
    private boolean f10083g;

    /* renamed from: h */
    private final List f10084h;

    /* renamed from: i */
    private static final long f10073i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k */
    private static final Pattern f10075k = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(C6913d c6913d, C2644n c2644n, Executor executor, Executor executor2, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this.f10083g = false;
        this.f10084h = new ArrayList();
        if (C2644n.m10961c(c6913d) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f10074j == null) {
                    f10074j = new C2651u(c6913d.m26867j());
                }
            }
            this.f10078b = c6913d;
            this.f10079c = c2644n;
            this.f10080d = new C2641k(c6913d, c2644n, interfaceC6922b, interfaceC6922b2, interfaceC7048d);
            this.f10077a = executor2;
            this.f10081e = new C2649s(executor);
            this.f10082f = interfaceC7048d;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: A */
    private static String m10909A(String str) {
        if (!str.isEmpty() && !str.equalsIgnoreCase(UPushThirdTokenCallback.TYPE_FCM) && !str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM)) {
            return str;
        }
        return Operator.Operation.MULTIPLY;
    }

    /* renamed from: b */
    private Object m10910b(AbstractC4245i abstractC4245i) {
        try {
            return AbstractC4250l.m17730b(abstractC4245i, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m10921B();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e10);
        }
    }

    /* renamed from: c */
    private static Object m10911c(AbstractC4245i abstractC4245i) {
        AbstractC5391n.m21784j(abstractC4245i, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC4245i.mo17701c(ExecutorC2634d.f10091a, new InterfaceC4235d(countDownLatch) { // from class: com.google.firebase.iid.e

            /* renamed from: a */
            private final CountDownLatch f10092a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10092a = countDownLatch;
            }

            @Override // p127f5.InterfaceC4235d
            /* renamed from: a */
            public void mo488a(AbstractC4245i abstractC4245i2) {
                this.f10092a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return m10915l(abstractC4245i);
    }

    /* renamed from: e */
    private static void m10912e(C6913d c6913d) {
        AbstractC5391n.m21780f(c6913d.m26869m().m26883e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        AbstractC5391n.m21780f(c6913d.m26869m().m26881c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        AbstractC5391n.m21780f(c6913d.m26869m().m26880b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        AbstractC5391n.m21776b(m10919u(c6913d.m26869m().m26881c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5391n.m21776b(m10918t(c6913d.m26869m().m26880b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C6913d c6913d) {
        m10912e(c6913d);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) c6913d.m26866i(FirebaseInstanceId.class);
        AbstractC5391n.m21784j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: i */
    public static FirebaseInstanceId m10913i() {
        return getInstance(C6913d.m26856k());
    }

    /* renamed from: k */
    private AbstractC4245i m10914k(final String str, String str2) {
        final String m10909A = m10909A(str2);
        return AbstractC4250l.m17733e(null).mo17706h(this.f10077a, new InterfaceC4229a(this, str, m10909A) { // from class: com.google.firebase.iid.c

            /* renamed from: a */
            private final FirebaseInstanceId f10088a;

            /* renamed from: b */
            private final String f10089b;

            /* renamed from: c */
            private final String f10090c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10088a = this;
                this.f10089b = str;
                this.f10090c = m10909A;
            }

            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public Object mo289a(AbstractC4245i abstractC4245i) {
                return this.f10088a.m10940z(this.f10089b, this.f10090c, abstractC4245i);
            }
        });
    }

    /* renamed from: l */
    private static Object m10915l(AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            return abstractC4245i.mo17708j();
        }
        if (!abstractC4245i.mo17710l()) {
            if (abstractC4245i.mo17711m()) {
                throw new IllegalStateException(abstractC4245i.mo17707i());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: m */
    private String m10916m() {
        if ("[DEFAULT]".equals(this.f10078b.m26868l())) {
            return "";
        }
        return this.f10078b.m26870n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m10917r() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    static boolean m10918t(String str) {
        return f10075k.matcher(str).matches();
    }

    /* renamed from: u */
    static boolean m10919u(String str) {
        return str.contains(":");
    }

    /* renamed from: B */
    synchronized void m10921B() {
        f10074j.m10979d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public synchronized void m10922C(boolean z10) {
        this.f10083g = z10;
    }

    /* renamed from: D */
    synchronized void m10923D() {
        if (!this.f10083g) {
            m10924E(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized void m10924E(long j10) {
        m10928f(new RunnableC2652v(this, Math.min(Math.max(30L, j10 + j10), f10073i)), j10);
        this.f10083g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m10925F(C2651u.a aVar) {
        if (aVar != null && !aVar.m10987c(this.f10079c.m10964a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10926a(InterfaceC6694a.a aVar) {
        this.f10084h.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m10927d() {
        return m10933o(C2644n.m10961c(this.f10078b), Operator.Operation.MULTIPLY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m10928f(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f10076l == null) {
                f10076l = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6342a("FirebaseInstanceId"));
            }
            f10076l.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C6913d m10929g() {
        return this.f10078b;
    }

    /* renamed from: h */
    String m10930h() {
        try {
            f10074j.m10983i(this.f10078b.m26870n());
            return (String) m10911c(this.f10082f.mo11028a());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: j */
    public AbstractC4245i m10931j() {
        m10912e(this.f10078b);
        return m10914k(C2644n.m10961c(this.f10078b), Operator.Operation.MULTIPLY);
    }

    /* renamed from: n */
    public String m10932n() {
        m10912e(this.f10078b);
        C2651u.a m10934p = m10934p();
        if (m10925F(m10934p)) {
            m10923D();
        }
        return C2651u.a.m10985b(m10934p);
    }

    /* renamed from: o */
    public String m10933o(String str, String str2) {
        m10912e(this.f10078b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC2642l) m10910b(m10914k(str, str2))).mo10960b();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C2651u.a m10934p() {
        return m10935q(C2644n.m10961c(this.f10078b), Operator.Operation.MULTIPLY);
    }

    /* renamed from: q */
    C2651u.a m10935q(String str, String str2) {
        return f10074j.m10980f(m10916m(), str, str2);
    }

    /* renamed from: s */
    public boolean m10936s() {
        return this.f10079c.m10968g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ AbstractC4245i m10937w(String str, String str2, String str3, String str4) {
        f10074j.m10982h(m10916m(), str, str2, str4, this.f10079c.m10964a());
        return AbstractC4250l.m17733e(new C2643m(str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void m10938x(C2651u.a aVar, InterfaceC2642l interfaceC2642l) {
        String mo10960b = interfaceC2642l.mo10960b();
        if (aVar == null || !mo10960b.equals(aVar.f10133a)) {
            Iterator it = this.f10084h.iterator();
            while (it.hasNext()) {
                ((InterfaceC6694a.a) it.next()).mo11308a(mo10960b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ AbstractC4245i m10939y(final String str, final String str2, final String str3, final C2651u.a aVar) {
        return this.f10080d.m10957d(str, str2, str3).mo17714p(this.f10077a, new InterfaceC4243h(this, str2, str3, str) { // from class: com.google.firebase.iid.g

            /* renamed from: a */
            private final FirebaseInstanceId f10098a;

            /* renamed from: b */
            private final String f10099b;

            /* renamed from: c */
            private final String f10100c;

            /* renamed from: d */
            private final String f10101d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10098a = this;
                this.f10099b = str2;
                this.f10100c = str3;
                this.f10101d = str;
            }

            @Override // p127f5.InterfaceC4243h
            /* renamed from: a */
            public AbstractC4245i mo346a(Object obj) {
                return this.f10098a.m10937w(this.f10099b, this.f10100c, this.f10101d, (String) obj);
            }
        }).mo17703e(ExecutorC2638h.f10102a, new InterfaceC4239f(this, aVar) { // from class: com.google.firebase.iid.i

            /* renamed from: a */
            private final FirebaseInstanceId f10103a;

            /* renamed from: b */
            private final C2651u.a f10104b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10103a = this;
                this.f10104b = aVar;
            }

            @Override // p127f5.InterfaceC4239f
            public void onSuccess(Object obj) {
                this.f10103a.m10938x(this.f10104b, (InterfaceC2642l) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ AbstractC4245i m10940z(final String str, final String str2, AbstractC4245i abstractC4245i) {
        final String m10930h = m10930h();
        final C2651u.a m10935q = m10935q(str, str2);
        if (!m10925F(m10935q)) {
            return AbstractC4250l.m17733e(new C2643m(m10930h, m10935q.f10133a));
        }
        return this.f10081e.m10969a(str, str2, new C2649s.a(this, m10930h, str, str2, m10935q) { // from class: com.google.firebase.iid.f

            /* renamed from: a */
            private final FirebaseInstanceId f10093a;

            /* renamed from: b */
            private final String f10094b;

            /* renamed from: c */
            private final String f10095c;

            /* renamed from: d */
            private final String f10096d;

            /* renamed from: e */
            private final C2651u.a f10097e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10093a = this;
                this.f10094b = m10930h;
                this.f10095c = str;
                this.f10096d = str2;
                this.f10097e = m10935q;
            }

            @Override // com.google.firebase.iid.C2649s.a
            public AbstractC4245i start() {
                return this.f10093a.m10939y(this.f10094b, this.f10095c, this.f10096d, this.f10097e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstanceId(C6913d c6913d, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this(c6913d, new C2644n(c6913d.m26867j()), AbstractC2632b.m10949b(), AbstractC2632b.m10949b(), interfaceC6922b, interfaceC6922b2, interfaceC7048d);
    }
}
