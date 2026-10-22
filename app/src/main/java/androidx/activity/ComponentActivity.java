package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.activity.result.AbstractC0289d;
import androidx.activity.result.C0291f;
import androidx.activity.result.InterfaceC0290e;
import androidx.core.app.AbstractActivityC0511i;
import androidx.core.app.AbstractC0498c;
import androidx.core.app.AbstractC0501d;
import androidx.core.content.AbstractC0547a;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.AbstractC0765s;
import androidx.lifecycle.AbstractC0766t;
import androidx.lifecycle.C0753g;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.FragmentC0759m;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import androidx.lifecycle.InterfaceC0764r;
import androidx.savedstate.AbstractC0838c;
import androidx.savedstate.C0836a;
import androidx.savedstate.InterfaceC0837b;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p031c.C1332a;
import p031c.InterfaceC1333b;
import p090d.AbstractC3914a;
import p139g0.AbstractC4331b;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends AbstractActivityC0511i implements InterfaceC0764r, InterfaceC0837b, InterfaceC0285c, InterfaceC0290e {

    /* renamed from: f */
    private C0763q f816f;

    /* renamed from: h */
    private int f818h;

    /* renamed from: c */
    final C1332a f813c = new C1332a();

    /* renamed from: d */
    private final C0753g f814d = new C0753g(this);

    /* renamed from: e */
    final C0836a f815e = C0836a.m4311a(this);

    /* renamed from: g */
    private final OnBackPressedDispatcher f817g = new OnBackPressedDispatcher(new RunnableC0277a());

    /* renamed from: i */
    private final AtomicInteger f819i = new AtomicInteger();

    /* renamed from: j */
    private final AbstractC0289d f820j = new C0278b();

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    class RunnableC0277a implements Runnable {
        RunnableC0277a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e10;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    class C0278b extends AbstractC0289d {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f826a;

            /* renamed from: b */
            final /* synthetic */ AbstractC3914a.a f827b;

            a(int i10, AbstractC3914a.a aVar) {
                this.f826a = i10;
                this.f827b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0278b.this.m980c(this.f826a, this.f827b.m16746a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f829a;

            /* renamed from: b */
            final /* synthetic */ IntentSender.SendIntentException f830b;

            b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f829a = i10;
                this.f830b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0278b.this.m979b(this.f829a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f830b));
            }
        }

        C0278b() {
        }

        @Override // androidx.activity.result.AbstractC0289d
        /* renamed from: f */
        public void mo954f(int i10, AbstractC3914a abstractC3914a, Object obj, AbstractC0501d abstractC0501d) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC3914a.a mo16745b = abstractC3914a.mo16745b(componentActivity, obj);
            if (mo16745b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, mo16745b));
                return;
            }
            Intent mo3562a = abstractC3914a.mo3562a(componentActivity, obj);
            if (mo3562a.getExtras() != null && mo3562a.getExtras().getClassLoader() == null) {
                mo3562a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo3562a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = mo3562a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo3562a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo3562a.getAction())) {
                String[] stringArrayExtra = mo3562a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC0498c.m2183n(componentActivity, stringArrayExtra, i10);
                return;
            }
            if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo3562a.getAction())) {
                C0291f c0291f = (C0291f) mo3562a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    AbstractC0498c.m2186q(componentActivity, c0291f.m988e(), i10, c0291f.m985a(), c0291f.m986b(), c0291f.m987d(), 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new b(i10, e10));
                    return;
                }
            }
            AbstractC0498c.m2185p(componentActivity, mo3562a, i10, bundle);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    class C0279c implements SavedStateRegistry.InterfaceC0835b {
        C0279c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0835b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.f820j.m982h(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    class C0280d implements InterfaceC1333b {
        C0280d() {
        }

        @Override // p031c.InterfaceC1333b
        /* renamed from: a */
        public void mo955a(Context context) {
            Bundle m4306a = ComponentActivity.this.mo947B3().m4306a("android:support:activity-result");
            if (m4306a != null) {
                ComponentActivity.this.f820j.m981g(m4306a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public static final class C0281e {

        /* renamed from: a */
        Object f834a;

        /* renamed from: b */
        C0763q f835b;

        C0281e() {
        }
    }

    public ComponentActivity() {
        if (mo953f6() != null) {
            int i10 = Build.VERSION.SDK_INT;
            mo953f6().mo3703a(new InterfaceC0750d() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    View view;
                    if (bVar == AbstractC0749c.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            mo953f6().mo3703a(new InterfaceC0750d() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    if (bVar == AbstractC0749c.b.ON_DESTROY) {
                        ComponentActivity.this.f813c.m5987b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo951b3().m3744a();
                        }
                    }
                }
            });
            mo953f6().mo3703a(new InterfaceC0750d() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    ComponentActivity.this.m950W3();
                    ComponentActivity.this.mo953f6().mo3705c(this);
                }
            });
            if (i10 <= 23) {
                mo953f6().mo3703a(new ImmLeaksCleaner(this));
            }
            mo947B3().m4309d("android:support:activity-result", new C0279c());
            m949T3(new C0280d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: Y3 */
    private void m945Y3() {
        AbstractC0765s.m3748a(getWindow().getDecorView(), this);
        AbstractC0766t.m3749a(getWindow().getDecorView(), this);
        AbstractC0838c.m4315a(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.InterfaceC0285c
    /* renamed from: B0 */
    public final OnBackPressedDispatcher mo946B0() {
        return this.f817g;
    }

    @Override // androidx.savedstate.InterfaceC0837b
    /* renamed from: B3 */
    public final SavedStateRegistry mo947B3() {
        return this.f815e.m4312b();
    }

    @Override // androidx.activity.result.InterfaceC0290e
    /* renamed from: J1 */
    public final AbstractC0289d mo948J1() {
        return this.f820j;
    }

    /* renamed from: T3 */
    public final void m949T3(InterfaceC1333b interfaceC1333b) {
        this.f813c.m5986a(interfaceC1333b);
    }

    /* renamed from: W3 */
    void m950W3() {
        if (this.f816f == null) {
            C0281e c0281e = (C0281e) getLastNonConfigurationInstance();
            if (c0281e != null) {
                this.f816f = c0281e.f835b;
            }
            if (this.f816f == null) {
                this.f816f = new C0763q();
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0764r
    /* renamed from: b3 */
    public C0763q mo951b3() {
        if (getApplication() != null) {
            m950W3();
            return this.f816f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: b4 */
    public Object m952b4() {
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0752f
    /* renamed from: f6 */
    public AbstractC0749c mo953f6() {
        return this.f814d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f820j.m979b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f817g.m959c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f815e.m4313c(bundle);
        this.f813c.m5988c(this);
        super.onCreate(bundle);
        FragmentC0759m.m3736f(this);
        int i10 = this.f818h;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f820j.m979b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0281e c0281e;
        Object m952b4 = m952b4();
        C0763q c0763q = this.f816f;
        if (c0763q == null && (c0281e = (C0281e) getLastNonConfigurationInstance()) != null) {
            c0763q = c0281e.f835b;
        }
        if (c0763q == null && m952b4 == null) {
            return null;
        }
        C0281e c0281e2 = new C0281e();
        c0281e2.f834a = m952b4;
        c0281e2.f835b = c0763q;
        return c0281e2;
    }

    @Override // androidx.core.app.AbstractActivityC0511i, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0749c mo953f6 = mo953f6();
        if (mo953f6 instanceof C0753g) {
            ((C0753g) mo953f6).m3722o(AbstractC0749c.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f815e.m4314d(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC4331b.m18146d()) {
                AbstractC4331b.m18143a("reportFullyDrawn() for " + getComponentName());
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && AbstractC0547a.m2319a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            AbstractC4331b.m18144b();
        }
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i10);

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m945Y3();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
