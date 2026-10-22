package p379w5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p338t6.InterfaceC6921a;
import p338t6.InterfaceC6922b;
import p351u5.InterfaceC7041a;
import p395x5.C7503f;
import p411y5.C7676c;
import p411y5.C7677d;
import p411y5.C7678e;
import p411y5.C7679f;
import p411y5.InterfaceC7674a;
import p426z5.C7757c;
import p426z5.InterfaceC7755a;
import p426z5.InterfaceC7756b;

/* renamed from: w5.d */
/* loaded from: classes.dex */
public class C7370d {

    /* renamed from: a */
    private final InterfaceC6921a f27345a;

    /* renamed from: b */
    private volatile InterfaceC7674a f27346b;

    /* renamed from: c */
    private volatile InterfaceC7756b f27347c;

    /* renamed from: d */
    private final List f27348d;

    public C7370d(InterfaceC6921a interfaceC6921a) {
        this(interfaceC6921a, new C7757c(), new C7679f());
    }

    /* renamed from: f */
    private void m28431f() {
        this.f27345a.mo26884a(new InterfaceC6921a.a() { // from class: w5.c
            @Override // p338t6.InterfaceC6921a.a
            /* renamed from: a */
            public final void mo26885a(InterfaceC6922b interfaceC6922b) {
                C7370d.this.m28434i(interfaceC6922b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m28432g(String str, Bundle bundle) {
        this.f27346b.mo28427a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m28433h(InterfaceC7755a interfaceC7755a) {
        synchronized (this) {
            if (this.f27347c instanceof C7757c) {
                this.f27348d.add(interfaceC7755a);
            }
            this.f27347c.mo28426a(interfaceC7755a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m28434i(InterfaceC6922b interfaceC6922b) {
        C7503f.m28716f().m28717b("AnalyticsConnector now available.");
        InterfaceC7041a interfaceC7041a = (InterfaceC7041a) interfaceC6922b.get();
        C7678e c7678e = new C7678e(interfaceC7041a);
        C7371e c7371e = new C7371e();
        if (m28435j(interfaceC7041a, c7371e) != null) {
            C7503f.m28716f().m28717b("Registered Firebase Analytics listener.");
            C7677d c7677d = new C7677d();
            C7676c c7676c = new C7676c(c7678e, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                Iterator it = this.f27348d.iterator();
                while (it.hasNext()) {
                    c7677d.mo28426a((InterfaceC7755a) it.next());
                }
                c7371e.m28440d(c7677d);
                c7371e.m28441e(c7676c);
                this.f27347c = c7677d;
                this.f27346b = c7676c;
            }
            return;
        }
        C7503f.m28716f().m28725k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static InterfaceC7041a.a m28435j(InterfaceC7041a interfaceC7041a, C7371e c7371e) {
        InterfaceC7041a.a mo27140a = interfaceC7041a.mo27140a("clx", c7371e);
        if (mo27140a == null) {
            C7503f.m28716f().m28717b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo27140a = interfaceC7041a.mo27140a("crash", c7371e);
            if (mo27140a != null) {
                C7503f.m28716f().m28725k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo27140a;
    }

    /* renamed from: d */
    public InterfaceC7674a m28436d() {
        return new InterfaceC7674a() { // from class: w5.b
            @Override // p411y5.InterfaceC7674a
            /* renamed from: a */
            public final void mo28427a(String str, Bundle bundle) {
                C7370d.this.m28432g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC7756b m28437e() {
        return new InterfaceC7756b() { // from class: w5.a
            @Override // p426z5.InterfaceC7756b
            /* renamed from: a */
            public final void mo28426a(InterfaceC7755a interfaceC7755a) {
                C7370d.this.m28433h(interfaceC7755a);
            }
        };
    }

    public C7370d(InterfaceC6921a interfaceC6921a, InterfaceC7756b interfaceC7756b, InterfaceC7674a interfaceC7674a) {
        this.f27345a = interfaceC6921a;
        this.f27347c = interfaceC7756b;
        this.f27348d = new ArrayList();
        this.f27346b = interfaceC7674a;
        m28431f();
    }
}
