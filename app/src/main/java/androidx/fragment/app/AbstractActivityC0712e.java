package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0285c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0289d;
import androidx.activity.result.InterfaceC0290e;
import androidx.core.app.AbstractC0498c;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.C0753g;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.InterfaceC0764r;
import androidx.loader.app.AbstractC0767a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p031c.InterfaceC1333b;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0712e extends ComponentActivity implements AbstractC0498c.c, AbstractC0498c.d {

    /* renamed from: p */
    public static final /* synthetic */ int f2782p = 0;

    /* renamed from: m */
    boolean f2785m;

    /* renamed from: n */
    boolean f2786n;

    /* renamed from: k */
    final C0722j f2783k = C0722j.m3382b(new c());

    /* renamed from: l */
    final C0753g f2784l = new C0753g(this);

    /* renamed from: o */
    boolean f2787o = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.InterfaceC0835b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0835b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            AbstractActivityC0712e.this.m3295g4();
            AbstractActivityC0712e.this.f2784l.m3720h(AbstractC0749c.b.ON_STOP);
            Parcelable m3405x = AbstractActivityC0712e.this.f2783k.m3405x();
            if (m3405x != null) {
                bundle.putParcelable("android:support:fragments", m3405x);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC1333b {
        b() {
        }

        @Override // p031c.InterfaceC1333b
        /* renamed from: a */
        public void mo955a(Context context) {
            AbstractActivityC0712e.this.f2783k.m3383a(null);
            Bundle m4306a = AbstractActivityC0712e.this.mo947B3().m4306a("android:support:fragments");
            if (m4306a != null) {
                AbstractActivityC0712e.this.f2783k.m3404w(m4306a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0726l implements InterfaceC0764r, InterfaceC0285c, InterfaceC0290e, InterfaceC0733s {
        public c() {
            super(AbstractActivityC0712e.this);
        }

        @Override // androidx.activity.InterfaceC0285c
        /* renamed from: B0 */
        public OnBackPressedDispatcher mo946B0() {
            return AbstractActivityC0712e.this.mo946B0();
        }

        @Override // androidx.activity.result.InterfaceC0290e
        /* renamed from: J1 */
        public AbstractC0289d mo948J1() {
            return AbstractActivityC0712e.this.mo948J1();
        }

        @Override // androidx.fragment.app.InterfaceC0733s
        /* renamed from: a */
        public void mo3299a(AbstractC0729o abstractC0729o, Fragment fragment) {
            AbstractActivityC0712e.this.m3296k4(fragment);
        }

        @Override // androidx.lifecycle.InterfaceC0764r
        /* renamed from: b3 */
        public C0763q mo951b3() {
            return AbstractActivityC0712e.this.mo951b3();
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: c */
        public View mo3209c(int i10) {
            return AbstractActivityC0712e.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: d */
        public boolean mo3210d() {
            Window window = AbstractActivityC0712e.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.InterfaceC0752f
        /* renamed from: f6 */
        public AbstractC0749c mo953f6() {
            return AbstractActivityC0712e.this.f2784l;
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: h */
        public void mo3300h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC0712e.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: j */
        public LayoutInflater mo3302j() {
            return AbstractActivityC0712e.this.getLayoutInflater().cloneInContext(AbstractActivityC0712e.this);
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: l */
        public boolean mo3303l(Fragment fragment) {
            return !AbstractActivityC0712e.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: m */
        public boolean mo3304m(String str) {
            return AbstractC0498c.m2184o(AbstractActivityC0712e.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: o */
        public void mo3305o() {
            AbstractActivityC0712e.this.mo1063s4();
        }

        @Override // androidx.fragment.app.AbstractC0726l
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC0712e mo3301i() {
            return AbstractActivityC0712e.this;
        }
    }

    public AbstractActivityC0712e() {
        m3291e4();
    }

    /* renamed from: e4 */
    private void m3291e4() {
        mo947B3().m4309d("android:support:fragments", new a());
        m949T3(new b());
    }

    /* renamed from: h4 */
    private static boolean m3292h4(AbstractC0729o abstractC0729o, AbstractC0749c.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : abstractC0729o.m3544s0()) {
            if (fragment != null) {
                if (fragment.m3122S6() != null) {
                    z10 |= m3292h4(fragment.m3093I6(), cVar);
                }
                C0717g0 c0717g0 = fragment.f2637Z;
                if (c0717g0 != null && c0717g0.mo953f6().mo3704b().m3709a(AbstractC0749c.c.STARTED)) {
                    fragment.f2637Z.m3346f(cVar);
                    z10 = true;
                }
                if (fragment.f2636Y.mo3704b().m3709a(AbstractC0749c.c.STARTED)) {
                    fragment.f2636Y.m3722o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: c4 */
    final View m3293c4(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2783k.m3403v(view, str, context, attributeSet);
    }

    /* renamed from: d4 */
    public AbstractC0729o m3294d4() {
        return this.f2783k.m3401t();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2785m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2786n);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2787o);
        if (getApplication() != null) {
            AbstractC0767a.m3750b(this).mo3751a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2783k.m3401t().m3506W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.core.app.AbstractC0498c.d
    /* renamed from: e0 */
    public final void mo2187e0(int i10) {
    }

    /* renamed from: g4 */
    void m3295g4() {
        do {
        } while (m3292h4(m3294d4(), AbstractC0749c.c.CREATED));
    }

    /* renamed from: k4 */
    public void m3296k4(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f2783k.m3402u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2783k.m3402u();
        super.onConfigurationChanged(configuration);
        this.f2783k.m3385d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2784l.m3720h(AbstractC0749c.b.ON_CREATE);
        this.f2783k.m3387f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            return super.onCreatePanelMenu(i10, menu) | this.f2783k.m3388g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m3293c4 = m3293c4(view, str, context, attributeSet);
        return m3293c4 == null ? super.onCreateView(view, str, context, attributeSet) : m3293c4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2783k.m3389h();
        this.f2784l.m3720h(AbstractC0749c.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2783k.m3390i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.f2783k.m3386e(menuItem);
        }
        return this.f2783k.m3392k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.f2783k.m3391j(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.f2783k.m3402u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f2783k.m3393l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2786n = false;
        this.f2783k.m3394m();
        this.f2784l.m3720h(AbstractC0749c.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.f2783k.m3395n(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m3298r4();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return m3297q4(view, menu) | this.f2783k.m3396o(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f2783k.m3402u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.f2783k.m3402u();
        super.onResume();
        this.f2786n = true;
        this.f2783k.m3400s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.f2783k.m3402u();
        super.onStart();
        this.f2787o = false;
        if (!this.f2785m) {
            this.f2785m = true;
            this.f2783k.m3384c();
        }
        this.f2783k.m3400s();
        this.f2784l.m3720h(AbstractC0749c.b.ON_START);
        this.f2783k.m3398q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2783k.m3402u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2787o = true;
        m3295g4();
        this.f2783k.m3399r();
        this.f2784l.m3720h(AbstractC0749c.b.ON_STOP);
    }

    /* renamed from: q4 */
    protected boolean m3297q4(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: r4 */
    protected void m3298r4() {
        this.f2784l.m3720h(AbstractC0749c.b.ON_RESUME);
        this.f2783k.m3397p();
    }

    /* renamed from: s4 */
    public abstract void mo1063s4();

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m3293c4 = m3293c4(null, str, context, attributeSet);
        return m3293c4 == null ? super.onCreateView(str, context, attributeSet) : m3293c4;
    }
}
