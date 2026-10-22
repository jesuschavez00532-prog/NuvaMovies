package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p007a6.AbstractC0074g;
import p007a6.AbstractC0102u;
import p007a6.C0062a;
import p007a6.C0086m;
import p007a6.C0098s;
import p007a6.C0104w;
import p113e6.C4137b;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;
import p128f6.C4270f;
import p157h6.C4554f;
import p337t5.C6913d;
import p338t6.InterfaceC6921a;
import p352u6.InterfaceC7048d;
import p379w5.AbstractC7373g;
import p379w5.C7370d;
import p395x5.C7501d;
import p395x5.C7502e;
import p395x5.C7503f;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a */
    final C0086m f10016a;

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$a */
    /* loaded from: classes.dex */
    class C2620a implements InterfaceC4229a {
        C2620a() {
        }

        @Override // p127f5.InterfaceC4229a
        /* renamed from: a */
        public Object mo289a(AbstractC4245i abstractC4245i) {
            if (!abstractC4245i.mo17712n()) {
                C7503f.m28716f().m28720e("Error fetching settings.", abstractC4245i.mo17707i());
                return null;
            }
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$b */
    /* loaded from: classes.dex */
    class CallableC2621b implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f10017a;

        /* renamed from: b */
        final /* synthetic */ C0086m f10018b;

        /* renamed from: c */
        final /* synthetic */ C4554f f10019c;

        CallableC2621b(boolean z10, C0086m c0086m, C4554f c4554f) {
            this.f10017a = z10;
            this.f10018b = c0086m;
            this.f10019c = c4554f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (this.f10017a) {
                this.f10018b.m370j(this.f10019c);
                return null;
            }
            return null;
        }
    }

    private FirebaseCrashlytics(C0086m c0086m) {
        this.f10016a = c0086m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FirebaseCrashlytics m10853a(C6913d c6913d, InterfaceC7048d interfaceC7048d, InterfaceC6921a interfaceC6921a, InterfaceC6921a interfaceC6921a2) {
        Context m26867j = c6913d.m26867j();
        String packageName = m26867j.getPackageName();
        C7503f.m28716f().m28721g("Initializing Firebase Crashlytics " + C0086m.m364l() + " for " + packageName);
        C4270f c4270f = new C4270f(m26867j);
        C0098s c0098s = new C0098s(c6913d);
        C0104w c0104w = new C0104w(m26867j, packageName, interfaceC7048d, c0098s);
        C7501d c7501d = new C7501d(interfaceC6921a);
        C7370d c7370d = new C7370d(interfaceC6921a2);
        C0086m c0086m = new C0086m(c6913d, c0104w, c7501d, c0098s, c7370d.m28437e(), c7370d.m28436d(), c4270f, AbstractC0102u.m463c("Crashlytics Exception Handler"));
        String m26881c = c6913d.m26869m().m26881c();
        String m264n = AbstractC0074g.m264n(m26867j);
        C7503f.m28716f().m28717b("Mapping file ID is: " + m264n);
        try {
            C0062a m219a = C0062a.m219a(m26867j, c0104w, m26881c, m264n, new C7502e(m26867j));
            C7503f.m28716f().m28723i("Installer package name is: " + m219a.f186c);
            ExecutorService m463c = AbstractC0102u.m463c("com.google.firebase.crashlytics.startup");
            C4554f m18968l = C4554f.m18968l(m26867j, m26881c, c0104w, new C4137b(), m219a.f188e, m219a.f189f, c4270f, c0098s);
            m18968l.m18977p(m463c).mo17705g(m463c, new C2620a());
            AbstractC4250l.m17731c(m463c, new CallableC2621b(c0086m.m375r(m219a, m18968l), c0086m, m18968l));
            return new FirebaseCrashlytics(c0086m);
        } catch (PackageManager.NameNotFoundException e10) {
            C7503f.m28716f().m28720e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) C6913d.m26856k().m26866i(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public AbstractC4245i checkForUnsentReports() {
        return this.f10016a.m366e();
    }

    public void deleteUnsentReports() {
        this.f10016a.m367f();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f10016a.m368g();
    }

    public void log(String str) {
        this.f10016a.m371n(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            C7503f.m28716f().m28725k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f10016a.m372o(th);
        }
    }

    public void sendUnsentReports() {
        this.f10016a.m376s();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f10016a.m377t(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.f10016a.m378u(str, Boolean.toString(z10));
    }

    public void setCustomKeys(AbstractC7373g abstractC7373g) {
        throw null;
    }

    public void setUserId(String str) {
        this.f10016a.m379v(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f10016a.m377t(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f10016a.m378u(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f10) {
        this.f10016a.m378u(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.f10016a.m378u(str, Integer.toString(i10));
    }

    public void setCustomKey(String str, long j10) {
        this.f10016a.m378u(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.f10016a.m378u(str, str2);
    }
}
