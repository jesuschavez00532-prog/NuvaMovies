package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1930g1;
import com.google.android.gms.internal.measurement.C2080q1;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import com.google.android.gms.internal.measurement.InterfaceC2035n1;
import com.google.android.gms.internal.measurement.InterfaceC2065p1;
import com.umeng.analytics.pro.C3329bx;
import java.util.Map;
import p025b5.AbstractC1126x;
import p025b5.InterfaceC1123u;
import p214l.C5303a;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;
import p325s4.InterfaceC6675a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1930g1 {

    /* renamed from: a */
    C2415q4 f8325a = null;

    /* renamed from: b */
    private final Map f8326b = new C5303a();

    /* renamed from: M */
    private final void m9416M(InterfaceC1990k1 interfaceC1990k1, String str) {
        m9417d();
        this.f8325a.m10031N().m9922J(interfaceC1990k1, str);
    }

    /* renamed from: d */
    private final void m9417d() {
        if (this.f8325a != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void beginAdUnitExposure(String str, long j10) {
        m9417d();
        this.f8325a.m10050y().m9425l(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m9417d();
        this.f8325a.m10026I().m9996o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void clearMeasurementEnabled(long j10) {
        m9417d();
        this.f8325a.m10026I().m9978I(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void endAdUnitExposure(String str, long j10) {
        m9417d();
        this.f8325a.m10050y().m9426m(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void generateEventId(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        long m9948r0 = this.f8325a.m10031N().m9948r0();
        m9417d();
        this.f8325a.m10031N().m9921I(interfaceC1990k1, m9948r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getAppInstanceId(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        this.f8325a.mo9575a().m9897z(new RunnableC2373m6(this, interfaceC1990k1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getCachedAppInstanceId(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        m9416M(interfaceC1990k1, this.f8325a.m10026I().m9989V());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getConditionalUserProperties(String str, String str2, InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        this.f8325a.mo9575a().m9897z(new RunnableC2409p9(this, interfaceC1990k1, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getCurrentScreenClass(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        m9416M(interfaceC1990k1, this.f8325a.m10026I().m9990W());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getCurrentScreenName(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        m9416M(interfaceC1990k1, this.f8325a.m10026I().m9991X());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getGmpAppId(InterfaceC1990k1 interfaceC1990k1) {
        String str;
        m9417d();
        C2406p6 m10026I = this.f8325a.m10026I();
        if (m10026I.f8714a.m10032O() != null) {
            str = m10026I.f8714a.m10032O();
        } else {
            try {
                str = AbstractC1126x.m5105b(m10026I.f8714a.mo9584f(), "google_app_id", m10026I.f8714a.m10035R());
            } catch (IllegalStateException e10) {
                m10026I.f8714a.mo9577b().m9800r().m9700b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        m9416M(interfaceC1990k1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getMaxUserProperties(String str, InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        this.f8325a.m10026I().m9984Q(str);
        m9417d();
        this.f8325a.m10031N().m9920H(interfaceC1990k1, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getTestFlag(InterfaceC1990k1 interfaceC1990k1, int i10) {
        m9417d();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        this.f8325a.m10031N().m9916D(interfaceC1990k1, this.f8325a.m10026I().m9985R().booleanValue());
                        return;
                    }
                    this.f8325a.m10031N().m9920H(interfaceC1990k1, this.f8325a.m10026I().m9987T().intValue());
                    return;
                }
                C2398o9 m10031N = this.f8325a.m10031N();
                double doubleValue = this.f8325a.m10026I().m9986S().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    interfaceC1990k1.mo8200b(bundle);
                    return;
                } catch (RemoteException e10) {
                    m10031N.f8714a.mo9577b().m9805w().m9700b("Error returning double value to wrapper", e10);
                    return;
                }
            }
            this.f8325a.m10031N().m9921I(interfaceC1990k1, this.f8325a.m10026I().m9988U().longValue());
            return;
        }
        this.f8325a.m10031N().m9922J(interfaceC1990k1, this.f8325a.m10026I().m9992Y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        this.f8325a.mo9575a().m9897z(new RunnableC2331i8(this, interfaceC1990k1, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void initForTests(Map map) {
        m9417d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void initialize(InterfaceC6675a interfaceC6675a, C2080q1 c2080q1, long j10) {
        C2415q4 c2415q4 = this.f8325a;
        if (c2415q4 == null) {
            this.f8325a = C2415q4.m10013H((Context) AbstractC5391n.m21783i((Context) BinderC6676b.m26054d(interfaceC6675a)), c2080q1, Long.valueOf(j10));
        } else {
            c2415q4.mo9577b().m9805w().m9699a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void isDataCollectionEnabled(InterfaceC1990k1 interfaceC1990k1) {
        m9417d();
        this.f8325a.mo9575a().m9897z(new RunnableC2420q9(this, interfaceC1990k1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        m9417d();
        this.f8325a.m10026I().m10000s(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1990k1 interfaceC1990k1, long j10) {
        Bundle bundle2;
        m9417d();
        AbstractC5391n.m21779e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f8325a.mo9575a().m9897z(new RunnableC2330i7(this, interfaceC1990k1, new C2465v(str2, new C2443t(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void logHealthData(int i10, String str, InterfaceC6675a interfaceC6675a, InterfaceC6675a interfaceC6675a2, InterfaceC6675a interfaceC6675a3) {
        Object m26054d;
        Object m26054d2;
        m9417d();
        Object obj = null;
        if (interfaceC6675a == null) {
            m26054d = null;
        } else {
            m26054d = BinderC6676b.m26054d(interfaceC6675a);
        }
        if (interfaceC6675a2 == null) {
            m26054d2 = null;
        } else {
            m26054d2 = BinderC6676b.m26054d(interfaceC6675a2);
        }
        if (interfaceC6675a3 != null) {
            obj = BinderC6676b.m26054d(interfaceC6675a3);
        }
        this.f8325a.mo9577b().m9798F(i10, true, false, str, m26054d, m26054d2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityCreated(InterfaceC6675a interfaceC6675a, Bundle bundle, long j10) {
        m9417d();
        C2395o6 c2395o6 = this.f8325a.m10026I().f8926c;
        if (c2395o6 != null) {
            this.f8325a.m10026I().m9997p();
            c2395o6.onActivityCreated((Activity) BinderC6676b.m26054d(interfaceC6675a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityDestroyed(InterfaceC6675a interfaceC6675a, long j10) {
        m9417d();
        C2395o6 c2395o6 = this.f8325a.m10026I().f8926c;
        if (c2395o6 != null) {
            this.f8325a.m10026I().m9997p();
            c2395o6.onActivityDestroyed((Activity) BinderC6676b.m26054d(interfaceC6675a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityPaused(InterfaceC6675a interfaceC6675a, long j10) {
        m9417d();
        C2395o6 c2395o6 = this.f8325a.m10026I().f8926c;
        if (c2395o6 != null) {
            this.f8325a.m10026I().m9997p();
            c2395o6.onActivityPaused((Activity) BinderC6676b.m26054d(interfaceC6675a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityResumed(InterfaceC6675a interfaceC6675a, long j10) {
        m9417d();
        C2395o6 c2395o6 = this.f8325a.m10026I().f8926c;
        if (c2395o6 != null) {
            this.f8325a.m10026I().m9997p();
            c2395o6.onActivityResumed((Activity) BinderC6676b.m26054d(interfaceC6675a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivitySaveInstanceState(InterfaceC6675a interfaceC6675a, InterfaceC1990k1 interfaceC1990k1, long j10) {
        m9417d();
        C2395o6 c2395o6 = this.f8325a.m10026I().f8926c;
        Bundle bundle = new Bundle();
        if (c2395o6 != null) {
            this.f8325a.m10026I().m9997p();
            c2395o6.onActivitySaveInstanceState((Activity) BinderC6676b.m26054d(interfaceC6675a), bundle);
        }
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8325a.mo9577b().m9805w().m9700b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityStarted(InterfaceC6675a interfaceC6675a, long j10) {
        m9417d();
        if (this.f8325a.m10026I().f8926c != null) {
            this.f8325a.m10026I().m9997p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void onActivityStopped(InterfaceC6675a interfaceC6675a, long j10) {
        m9417d();
        if (this.f8325a.m10026I().f8926c != null) {
            this.f8325a.m10026I().m9997p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void performAction(Bundle bundle, InterfaceC1990k1 interfaceC1990k1, long j10) {
        m9417d();
        interfaceC1990k1.mo8200b(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void registerOnMeasurementEventListener(InterfaceC2035n1 interfaceC2035n1) {
        InterfaceC1123u interfaceC1123u;
        m9417d();
        synchronized (this.f8326b) {
            interfaceC1123u = (InterfaceC1123u) this.f8326b.get(Integer.valueOf(interfaceC2035n1.mo8611g()));
            if (interfaceC1123u == null) {
                interfaceC1123u = new C2442s9(this, interfaceC2035n1);
                this.f8326b.put(Integer.valueOf(interfaceC2035n1.mo8611g()), interfaceC1123u);
            }
        }
        this.f8325a.m10026I().m10005x(interfaceC1123u);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void resetAnalyticsData(long j10) {
        m9417d();
        this.f8325a.m10026I().m10006y(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        m9417d();
        if (bundle == null) {
            this.f8325a.mo9577b().m9800r().m9699a("Conditional user property must not be null");
        } else {
            this.f8325a.m10026I().m9974E(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setConsent(final Bundle bundle, final long j10) {
        m9417d();
        final C2406p6 m10026I = this.f8325a.m10026I();
        m10026I.f8714a.mo9575a().m9891A(new Runnable() { // from class: com.google.android.gms.measurement.internal.p5
            @Override // java.lang.Runnable
            public final void run() {
                C2406p6 c2406p6 = C2406p6.this;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(c2406p6.f8714a.m10020B().m9529t())) {
                    c2406p6.m9975F(bundle2, 0, j11);
                } else {
                    c2406p6.f8714a.mo9577b().m9806x().m9699a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setConsentThirdParty(Bundle bundle, long j10) {
        m9417d();
        this.f8325a.m10026I().m9975F(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setCurrentScreen(InterfaceC6675a interfaceC6675a, String str, String str2, long j10) {
        m9417d();
        this.f8325a.m10028K().m9470D((Activity) BinderC6676b.m26054d(interfaceC6675a), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setDataCollectionEnabled(boolean z10) {
        m9417d();
        C2406p6 m10026I = this.f8325a.m10026I();
        m10026I.m10105i();
        m10026I.f8714a.mo9575a().m9897z(new RunnableC2362l6(m10026I, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        m9417d();
        final C2406p6 m10026I = this.f8325a.m10026I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        m10026I.f8714a.mo9575a().m9897z(new Runnable() { // from class: com.google.android.gms.measurement.internal.q5
            @Override // java.lang.Runnable
            public final void run() {
                C2406p6.this.m9998q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setEventInterceptor(InterfaceC2035n1 interfaceC2035n1) {
        m9417d();
        C2431r9 c2431r9 = new C2431r9(this, interfaceC2035n1);
        if (this.f8325a.mo9575a().m9892C()) {
            this.f8325a.m10026I().m9977H(c2431r9);
        } else {
            this.f8325a.mo9575a().m9897z(new RunnableC2321h9(this, c2431r9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setInstanceIdProvider(InterfaceC2065p1 interfaceC2065p1) {
        m9417d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setMeasurementEnabled(boolean z10, long j10) {
        m9417d();
        this.f8325a.m10026I().m9978I(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setMinimumSessionDuration(long j10) {
        m9417d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setSessionTimeoutDuration(long j10) {
        m9417d();
        C2406p6 m10026I = this.f8325a.m10026I();
        m10026I.f8714a.mo9575a().m9897z(new RunnableC2460u5(m10026I, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setUserId(final String str, long j10) {
        m9417d();
        final C2406p6 m10026I = this.f8325a.m10026I();
        if (str != null && TextUtils.isEmpty(str)) {
            m10026I.f8714a.mo9577b().m9805w().m9699a("User ID must be non-empty or null");
        } else {
            m10026I.f8714a.mo9575a().m9897z(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
                @Override // java.lang.Runnable
                public final void run() {
                    C2406p6 c2406p6 = C2406p6.this;
                    if (c2406p6.f8714a.m10020B().m9532w(str)) {
                        c2406p6.f8714a.m10020B().m9531v();
                    }
                }
            });
            m10026I.m9981L(null, C3329bx.f14344d, str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void setUserProperty(String str, String str2, InterfaceC6675a interfaceC6675a, boolean z10, long j10) {
        m9417d();
        this.f8325a.m10026I().m9981L(str, str2, BinderC6676b.m26054d(interfaceC6675a), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public void unregisterOnMeasurementEventListener(InterfaceC2035n1 interfaceC2035n1) {
        InterfaceC1123u interfaceC1123u;
        m9417d();
        synchronized (this.f8326b) {
            interfaceC1123u = (InterfaceC1123u) this.f8326b.remove(Integer.valueOf(interfaceC2035n1.mo8611g()));
        }
        if (interfaceC1123u == null) {
            interfaceC1123u = new C2442s9(this, interfaceC2035n1);
        }
        this.f8325a.m10026I().m9983N(interfaceC1123u);
    }
}
