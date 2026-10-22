package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0497b1;
import androidx.core.view.AbstractC0627t;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.AbstractC0765s;
import androidx.lifecycle.AbstractC0766t;
import androidx.lifecycle.C0753g;
import androidx.lifecycle.C0756j;
import androidx.lifecycle.C0762p;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import androidx.lifecycle.InterfaceC0764r;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC0767a;
import androidx.savedstate.AbstractC0838c;
import androidx.savedstate.C0836a;
import androidx.savedstate.InterfaceC0837b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0752f, InterfaceC0764r, InterfaceC0837b {

    /* renamed from: m0 */
    static final Object f2616m0 = new Object();

    /* renamed from: n0 */
    public static final /* synthetic */ int f2617n0 = 0;

    /* renamed from: A */
    boolean f2618A;

    /* renamed from: B */
    boolean f2619B;

    /* renamed from: C */
    boolean f2620C;

    /* renamed from: D */
    boolean f2621D;

    /* renamed from: F */
    private boolean f2623F;

    /* renamed from: G */
    ViewGroup f2624G;

    /* renamed from: H */
    View f2625H;

    /* renamed from: I */
    boolean f2626I;

    /* renamed from: K */
    C0700e f2628K;

    /* renamed from: M */
    boolean f2630M;

    /* renamed from: N */
    boolean f2631N;

    /* renamed from: O */
    float f2632O;

    /* renamed from: V */
    LayoutInflater f2633V;

    /* renamed from: W */
    boolean f2634W;

    /* renamed from: Y */
    C0753g f2636Y;

    /* renamed from: Z */
    C0717g0 f2637Z;

    /* renamed from: b */
    Bundle f2639b;

    /* renamed from: c */
    SparseArray f2640c;

    /* renamed from: d */
    Bundle f2641d;

    /* renamed from: e */
    Boolean f2642e;

    /* renamed from: g */
    Bundle f2644g;

    /* renamed from: h */
    Fragment f2646h;

    /* renamed from: h0 */
    C0762p.a f2647h0;

    /* renamed from: i0 */
    C0836a f2649i0;

    /* renamed from: j */
    int f2650j;

    /* renamed from: j0 */
    private int f2651j0;

    /* renamed from: l */
    boolean f2654l;

    /* renamed from: m */
    boolean f2656m;

    /* renamed from: n */
    boolean f2657n;

    /* renamed from: o */
    boolean f2658o;

    /* renamed from: p */
    boolean f2659p;

    /* renamed from: q */
    boolean f2660q;

    /* renamed from: r */
    int f2661r;

    /* renamed from: s */
    AbstractC0729o f2662s;

    /* renamed from: t */
    AbstractC0726l f2663t;

    /* renamed from: v */
    Fragment f2665v;

    /* renamed from: w */
    int f2666w;

    /* renamed from: x */
    int f2667x;

    /* renamed from: y */
    String f2668y;

    /* renamed from: z */
    boolean f2669z;

    /* renamed from: a */
    int f2638a = -1;

    /* renamed from: f */
    String f2643f = UUID.randomUUID().toString();

    /* renamed from: i */
    String f2648i = null;

    /* renamed from: k */
    private Boolean f2652k = null;

    /* renamed from: u */
    AbstractC0729o f2664u = new C0730p();

    /* renamed from: E */
    boolean f2622E = true;

    /* renamed from: J */
    boolean f2627J = true;

    /* renamed from: L */
    Runnable f2629L = new RunnableC0696a();

    /* renamed from: X */
    AbstractC0749c.c f2635X = AbstractC0749c.c.RESUMED;

    /* renamed from: g0 */
    C0756j f2645g0 = new C0756j();

    /* renamed from: k0 */
    private final AtomicInteger f2653k0 = new AtomicInteger();

    /* renamed from: l0 */
    private final ArrayList f2655l0 = new ArrayList();

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    class RunnableC0696a implements Runnable {
        RunnableC0696a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m3177k9();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC0697b implements Runnable {
        RunnableC0697b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m3200x6(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class RunnableC0698c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0721i0 f2673a;

        RunnableC0698c(AbstractC0721i0 abstractC0721i0) {
            this.f2673a = abstractC0721i0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2673a.m3360g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class C0699d extends AbstractC0716g {
        C0699d() {
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: c */
        public View mo3209c(int i10) {
            View view = Fragment.this.f2625H;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: d */
        public boolean mo3210d() {
            if (Fragment.this.f2625H != null) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public static class C0700e {

        /* renamed from: a */
        View f2676a;

        /* renamed from: b */
        Animator f2677b;

        /* renamed from: c */
        boolean f2678c;

        /* renamed from: d */
        int f2679d;

        /* renamed from: e */
        int f2680e;

        /* renamed from: f */
        int f2681f;

        /* renamed from: g */
        int f2682g;

        /* renamed from: h */
        int f2683h;

        /* renamed from: i */
        ArrayList f2684i;

        /* renamed from: j */
        ArrayList f2685j;

        /* renamed from: k */
        Object f2686k = null;

        /* renamed from: l */
        Object f2687l;

        /* renamed from: m */
        Object f2688m;

        /* renamed from: n */
        Object f2689n;

        /* renamed from: o */
        Object f2690o;

        /* renamed from: p */
        Object f2691p;

        /* renamed from: q */
        Boolean f2692q;

        /* renamed from: r */
        Boolean f2693r;

        /* renamed from: s */
        float f2694s;

        /* renamed from: t */
        View f2695t;

        /* renamed from: u */
        boolean f2696u;

        /* renamed from: v */
        InterfaceC0702g f2697v;

        /* renamed from: w */
        boolean f2698w;

        C0700e() {
            Object obj = Fragment.f2616m0;
            this.f2687l = obj;
            this.f2688m = null;
            this.f2689n = obj;
            this.f2690o = null;
            this.f2691p = obj;
            this.f2694s = 1.0f;
            this.f2695t = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public static class C0701f extends RuntimeException {
        public C0701f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0702g {
        /* renamed from: a */
        void mo3211a();

        /* renamed from: b */
        void mo3212b();
    }

    public Fragment() {
        m3068p7();
    }

    /* renamed from: A6 */
    private C0700e m3065A6() {
        if (this.f2628K == null) {
            this.f2628K = new C0700e();
        }
        return this.f2628K;
    }

    /* renamed from: Q8 */
    private void m3066Q8() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f2625H != null) {
            m3121R8(this.f2639b);
        }
        this.f2639b = null;
    }

    /* renamed from: U6 */
    private int m3067U6() {
        AbstractC0749c.c cVar = this.f2635X;
        if (cVar != AbstractC0749c.c.INITIALIZED && this.f2665v != null) {
            return Math.min(cVar.ordinal(), this.f2665v.m3067U6());
        }
        return cVar.ordinal();
    }

    /* renamed from: p7 */
    private void m3068p7() {
        this.f2636Y = new C0753g(this);
        this.f2649i0 = C0836a.m4311a(this);
        this.f2647h0 = null;
    }

    /* renamed from: r7 */
    public static Fragment m3069r7(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) AbstractC0724k.m3409d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m3132V8(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e10) {
            throw new C0701f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new C0701f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0701f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0701f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A7 */
    public final boolean m3070A7() {
        Fragment m3133W6 = m3133W6();
        if (m3133W6 != null && (m3133W6.m3207z7() || m3133W6.m3070A7())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A8 */
    public void m3071A8(Menu menu) {
        if (!this.f2669z) {
            if (this.f2621D && this.f2622E) {
                m3146a8(menu);
            }
            this.f2664u.m3486K(menu);
        }
    }

    @Override // androidx.savedstate.InterfaceC0837b
    /* renamed from: B3 */
    public final SavedStateRegistry mo947B3() {
        return this.f2649i0.m4312b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B6 */
    public Fragment m3072B6(String str) {
        if (str.equals(this.f2643f)) {
            return this;
        }
        return this.f2664u.m3526i0(str);
    }

    /* renamed from: B7 */
    public final boolean m3073B7() {
        if (this.f2638a >= 7) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B8 */
    public void m3074B8() {
        this.f2664u.m3489M();
        if (this.f2625H != null) {
            this.f2637Z.m3341a(AbstractC0749c.b.ON_PAUSE);
        }
        this.f2636Y.m3720h(AbstractC0749c.b.ON_PAUSE);
        this.f2638a = 6;
        this.f2623F = false;
        mo3149b8();
        if (this.f2623F) {
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: C6 */
    public final AbstractActivityC0712e m3075C6() {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l == null) {
            return null;
        }
        return (AbstractActivityC0712e) abstractC0726l.m3411e();
    }

    /* renamed from: C7 */
    public final boolean m3076C7() {
        AbstractC0729o abstractC0729o = this.f2662s;
        if (abstractC0729o == null) {
            return false;
        }
        return abstractC0729o.m3487K0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C8 */
    public void m3077C8(boolean z10) {
        m3152c8(z10);
        this.f2664u.m3491N(z10);
    }

    /* renamed from: D6 */
    public boolean m3078D6() {
        Boolean bool;
        C0700e c0700e = this.f2628K;
        if (c0700e != null && (bool = c0700e.f2693r) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: D7 */
    public final boolean m3079D7() {
        View view;
        if (m3190s7() && !m3194u7() && (view = this.f2625H) != null && view.getWindowToken() != null && this.f2625H.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D8 */
    public boolean m3080D8(Menu menu) {
        boolean z10 = false;
        if (this.f2669z) {
            return false;
        }
        if (this.f2621D && this.f2622E) {
            m3155d8(menu);
            z10 = true;
        }
        return z10 | this.f2664u.m3492O(menu);
    }

    /* renamed from: E6 */
    public boolean m3081E6() {
        Boolean bool;
        C0700e c0700e = this.f2628K;
        if (c0700e != null && (bool = c0700e.f2692q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E7 */
    public void m3082E7() {
        this.f2664u.m3500S0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E8 */
    public void m3083E8() {
        boolean m3483I0 = this.f2662s.m3483I0(this);
        Boolean bool = this.f2652k;
        if (bool == null || bool.booleanValue() != m3483I0) {
            this.f2652k = Boolean.valueOf(m3483I0);
            m3158e8(m3483I0);
            this.f2664u.m3494P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F6 */
    public View m3084F6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2676a;
    }

    /* renamed from: F7 */
    public void mo3085F7(Bundle bundle) {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F8 */
    public void m3086F8() {
        this.f2664u.m3500S0();
        this.f2664u.m3510a0(true);
        this.f2638a = 7;
        this.f2623F = false;
        mo3164g8();
        if (this.f2623F) {
            C0753g c0753g = this.f2636Y;
            AbstractC0749c.b bVar = AbstractC0749c.b.ON_RESUME;
            c0753g.m3720h(bVar);
            if (this.f2625H != null) {
                this.f2637Z.m3341a(bVar);
            }
            this.f2664u.m3496Q();
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G6 */
    public Animator m3087G6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2677b;
    }

    /* renamed from: G7 */
    public void mo3088G7(int i10, int i11, Intent intent) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G8 */
    public void m3089G8(Bundle bundle) {
        mo3167h8(bundle);
        this.f2649i0.m4314d(bundle);
        Parcelable m3528j1 = this.f2664u.m3528j1();
        if (m3528j1 != null) {
            bundle.putParcelable("android:support:fragments", m3528j1);
        }
    }

    /* renamed from: H6 */
    public final Bundle m3090H6() {
        return this.f2644g;
    }

    /* renamed from: H7 */
    public void mo3091H7(Activity activity) {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H8 */
    public void m3092H8() {
        this.f2664u.m3500S0();
        this.f2664u.m3510a0(true);
        this.f2638a = 5;
        this.f2623F = false;
        mo3170i8();
        if (this.f2623F) {
            C0753g c0753g = this.f2636Y;
            AbstractC0749c.b bVar = AbstractC0749c.b.ON_START;
            c0753g.m3720h(bVar);
            if (this.f2625H != null) {
                this.f2637Z.m3341a(bVar);
            }
            this.f2664u.m3498R();
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: I6 */
    public final AbstractC0729o m3093I6() {
        if (this.f2663t != null) {
            return this.f2664u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: I7 */
    public void mo3094I7(Context context) {
        Activity m3411e;
        this.f2623F = true;
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l == null) {
            m3411e = null;
        } else {
            m3411e = abstractC0726l.m3411e();
        }
        if (m3411e != null) {
            this.f2623F = false;
            mo3091H7(m3411e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I8 */
    public void m3095I8() {
        this.f2664u.m3501T();
        if (this.f2625H != null) {
            this.f2637Z.m3341a(AbstractC0749c.b.ON_STOP);
        }
        this.f2636Y.m3720h(AbstractC0749c.b.ON_STOP);
        this.f2638a = 4;
        this.f2623F = false;
        mo3173j8();
        if (this.f2623F) {
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: J6 */
    public Context m3096J6() {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l == null) {
            return null;
        }
        return abstractC0726l.m3412f();
    }

    /* renamed from: J7 */
    public void m3097J7(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J8 */
    public void m3098J8() {
        mo3176k8(this.f2625H, this.f2639b);
        this.f2664u.m3503U();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K6 */
    public int m3099K6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 0;
        }
        return c0700e.f2679d;
    }

    /* renamed from: K7 */
    public boolean m3100K7(MenuItem menuItem) {
        return false;
    }

    /* renamed from: K8 */
    public final void m3101K8(String[] strArr, int i10) {
        if (this.f2663t != null) {
            m3136X6().m3488L0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: L6 */
    public Object m3102L6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2686k;
    }

    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        this.f2623F = true;
        m3116P8(bundle);
        if (!this.f2664u.m3485J0(1)) {
            this.f2664u.m3472C();
        }
    }

    /* renamed from: L8 */
    public final AbstractActivityC0712e m3104L8() {
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            return m3075C6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M6 */
    public AbstractC0497b1 m3105M6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        c0700e.getClass();
        return null;
    }

    /* renamed from: M7 */
    public Animation m3106M7(int i10, boolean z10, int i11) {
        return null;
    }

    /* renamed from: M8 */
    public final Context m3107M8() {
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            return m3096J6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N6 */
    public int m3108N6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 0;
        }
        return c0700e.f2680e;
    }

    /* renamed from: N7 */
    public Animator m3109N7(int i10, boolean z10, int i11) {
        return null;
    }

    /* renamed from: N8 */
    public final AbstractC0729o m3110N8() {
        return m3136X6();
    }

    /* renamed from: O6 */
    public Object m3111O6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2688m;
    }

    /* renamed from: O7 */
    public void m3112O7(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: O8 */
    public final View m3113O8() {
        View m3182n7 = m3182n7();
        if (m3182n7 != null) {
            return m3182n7;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P6 */
    public AbstractC0497b1 m3114P6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        c0700e.getClass();
        return null;
    }

    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2651j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P8 */
    public void m3116P8(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2664u.m3524h1(parcelable);
            this.f2664u.m3472C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q6 */
    public View m3117Q6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2695t;
    }

    /* renamed from: Q7 */
    public void mo3118Q7() {
        this.f2623F = true;
    }

    /* renamed from: R6 */
    public final AbstractC0729o m3119R6() {
        return this.f2662s;
    }

    /* renamed from: R7 */
    public void m3120R7() {
    }

    /* renamed from: R8 */
    final void m3121R8(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2640c;
        if (sparseArray != null) {
            this.f2625H.restoreHierarchyState(sparseArray);
            this.f2640c = null;
        }
        if (this.f2625H != null) {
            this.f2637Z.m3344d(this.f2641d);
            this.f2641d = null;
        }
        this.f2623F = false;
        mo3179l8(bundle);
        if (this.f2623F) {
            if (this.f2625H != null) {
                this.f2637Z.m3341a(AbstractC0749c.b.ON_CREATE);
            }
        } else {
            throw new C0725k0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: S6 */
    public final Object m3122S6() {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l == null) {
            return null;
        }
        return abstractC0726l.mo3301i();
    }

    /* renamed from: S7 */
    public void mo3123S7() {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S8 */
    public void m3124S8(View view) {
        m3065A6().f2676a = view;
    }

    /* renamed from: T6 */
    public LayoutInflater m3125T6(Bundle bundle) {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l != null) {
            LayoutInflater mo3302j = abstractC0726l.mo3302j();
            AbstractC0627t.m2813b(mo3302j, this.f2664u.m3548u0());
            return mo3302j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: T7 */
    public void mo3126T7() {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T8 */
    public void m3127T8(int i10, int i11, int i12, int i13) {
        if (this.f2628K == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m3065A6().f2679d = i10;
        m3065A6().f2680e = i11;
        m3065A6().f2681f = i12;
        m3065A6().f2682g = i13;
    }

    /* renamed from: U7 */
    public LayoutInflater mo3128U7(Bundle bundle) {
        return m3125T6(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U8 */
    public void m3129U8(Animator animator) {
        m3065A6().f2677b = animator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V6 */
    public int m3130V6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 0;
        }
        return c0700e.f2683h;
    }

    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
    }

    /* renamed from: V8 */
    public void m3132V8(Bundle bundle) {
        if (this.f2662s != null && m3076C7()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2644g = bundle;
    }

    /* renamed from: W6 */
    public final Fragment m3133W6() {
        return this.f2665v;
    }

    /* renamed from: W7 */
    public void m3134W7(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W8 */
    public void m3135W8(View view) {
        m3065A6().f2695t = view;
    }

    /* renamed from: X6 */
    public final AbstractC0729o m3136X6() {
        AbstractC0729o abstractC0729o = this.f2662s;
        if (abstractC0729o != null) {
            return abstractC0729o;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: X7 */
    public void m3137X7(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity m3411e;
        this.f2623F = true;
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l == null) {
            m3411e = null;
        } else {
            m3411e = abstractC0726l.m3411e();
        }
        if (m3411e != null) {
            this.f2623F = false;
            m3134W7(m3411e, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X8 */
    public void m3138X8(boolean z10) {
        m3065A6().f2698w = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y6 */
    public boolean m3139Y6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return false;
        }
        return c0700e.f2678c;
    }

    /* renamed from: Y7 */
    public void m3140Y7(boolean z10) {
    }

    /* renamed from: Y8 */
    public void m3141Y8(C0703h c0703h) {
        Bundle bundle;
        if (this.f2662s == null) {
            if (c0703h == null || (bundle = c0703h.f2699a) == null) {
                bundle = null;
            }
            this.f2639b = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z6 */
    public int m3142Z6() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 0;
        }
        return c0700e.f2681f;
    }

    /* renamed from: Z7 */
    public boolean m3143Z7(MenuItem menuItem) {
        return false;
    }

    /* renamed from: Z8 */
    public void m3144Z8(boolean z10) {
        if (this.f2622E != z10) {
            this.f2622E = z10;
            if (this.f2621D && m3190s7() && !m3194u7()) {
                this.f2663t.mo3305o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a7 */
    public int m3145a7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 0;
        }
        return c0700e.f2682g;
    }

    /* renamed from: a8 */
    public void m3146a8(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a9 */
    public void m3147a9(int i10) {
        if (this.f2628K == null && i10 == 0) {
            return;
        }
        m3065A6();
        this.f2628K.f2683h = i10;
    }

    @Override // androidx.lifecycle.InterfaceC0764r
    /* renamed from: b3 */
    public C0763q mo951b3() {
        if (this.f2662s != null) {
            if (m3067U6() != AbstractC0749c.c.INITIALIZED.ordinal()) {
                return this.f2662s.m3469A0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b7 */
    public float m3148b7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return 1.0f;
        }
        return c0700e.f2694s;
    }

    /* renamed from: b8 */
    public void mo3149b8() {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b9 */
    public void m3150b9(InterfaceC0702g interfaceC0702g) {
        m3065A6();
        C0700e c0700e = this.f2628K;
        InterfaceC0702g interfaceC0702g2 = c0700e.f2697v;
        if (interfaceC0702g == interfaceC0702g2) {
            return;
        }
        if (interfaceC0702g != null && interfaceC0702g2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0700e.f2696u) {
            c0700e.f2697v = interfaceC0702g;
        }
        if (interfaceC0702g != null) {
            interfaceC0702g.mo3211a();
        }
    }

    /* renamed from: c7 */
    public Object m3151c7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        Object obj = c0700e.f2689n;
        if (obj == f2616m0) {
            return m3111O6();
        }
        return obj;
    }

    /* renamed from: c8 */
    public void m3152c8(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c9 */
    public void m3153c9(boolean z10) {
        if (this.f2628K == null) {
            return;
        }
        m3065A6().f2678c = z10;
    }

    /* renamed from: d7 */
    public final Resources m3154d7() {
        return m3107M8().getResources();
    }

    /* renamed from: d8 */
    public void m3155d8(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d9 */
    public void m3156d9(float f10) {
        m3065A6().f2694s = f10;
    }

    /* renamed from: e7 */
    public Object m3157e7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        Object obj = c0700e.f2687l;
        if (obj == f2616m0) {
            return m3102L6();
        }
        return obj;
    }

    /* renamed from: e8 */
    public void m3158e8(boolean z10) {
    }

    /* renamed from: e9 */
    public void m3159e9(boolean z10) {
        this.f2619B = z10;
        AbstractC0729o abstractC0729o = this.f2662s;
        if (abstractC0729o != null) {
            if (z10) {
                abstractC0729o.m3525i(this);
                return;
            } else {
                abstractC0729o.m3519f1(this);
                return;
            }
        }
        this.f2620C = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.InterfaceC0752f
    /* renamed from: f6 */
    public AbstractC0749c mo953f6() {
        return this.f2636Y;
    }

    /* renamed from: f7 */
    public Object m3160f7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        return c0700e.f2690o;
    }

    /* renamed from: f8 */
    public void mo3161f8(int i10, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f9 */
    public void m3162f9(ArrayList arrayList, ArrayList arrayList2) {
        m3065A6();
        C0700e c0700e = this.f2628K;
        c0700e.f2684i = arrayList;
        c0700e.f2685j = arrayList2;
    }

    /* renamed from: g7 */
    public Object m3163g7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return null;
        }
        Object obj = c0700e.f2691p;
        if (obj == f2616m0) {
            return m3160f7();
        }
        return obj;
    }

    /* renamed from: g8 */
    public void mo3164g8() {
        this.f2623F = true;
    }

    /* renamed from: g9 */
    public void mo3165g9(boolean z10) {
        boolean z11;
        if (!this.f2627J && z10 && this.f2638a < 5 && this.f2662s != null && m3190s7() && this.f2634W) {
            AbstractC0729o abstractC0729o = this.f2662s;
            abstractC0729o.m3504U0(abstractC0729o.m3549v(this));
        }
        this.f2627J = z10;
        if (this.f2638a < 5 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f2626I = z11;
        if (this.f2639b != null) {
            this.f2642e = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h7 */
    public ArrayList m3166h7() {
        ArrayList arrayList;
        C0700e c0700e = this.f2628K;
        if (c0700e != null && (arrayList = c0700e.f2684i) != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: h8 */
    public void mo3167h8(Bundle bundle) {
    }

    /* renamed from: h9 */
    public boolean m3168h9(String str) {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l != null) {
            return abstractC0726l.mo3304m(str);
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i7 */
    public ArrayList m3169i7() {
        ArrayList arrayList;
        C0700e c0700e = this.f2628K;
        if (c0700e != null && (arrayList = c0700e.f2685j) != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: i8 */
    public void mo3170i8() {
        this.f2623F = true;
    }

    /* renamed from: i9 */
    public void m3171i9(Intent intent, Bundle bundle) {
        AbstractC0726l abstractC0726l = this.f2663t;
        if (abstractC0726l != null) {
            abstractC0726l.m3415n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: j7 */
    public final String m3172j7(int i10) {
        return m3154d7().getString(i10);
    }

    /* renamed from: j8 */
    public void mo3173j8() {
        this.f2623F = true;
    }

    /* renamed from: j9 */
    public void m3174j9(Intent intent, int i10, Bundle bundle) {
        if (this.f2663t != null) {
            m3136X6().m3490M0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: k7 */
    public final String m3175k7(int i10, Object... objArr) {
        return m3154d7().getString(i10, objArr);
    }

    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
    }

    /* renamed from: k9 */
    public void m3177k9() {
        if (this.f2628K != null && m3065A6().f2696u) {
            if (this.f2663t == null) {
                m3065A6().f2696u = false;
            } else if (Looper.myLooper() != this.f2663t.m3413g().getLooper()) {
                this.f2663t.m3413g().postAtFrontOfQueue(new RunnableC0697b());
            } else {
                m3200x6(true);
            }
        }
    }

    /* renamed from: l7 */
    public final Fragment m3178l7() {
        String str;
        Fragment fragment = this.f2646h;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0729o abstractC0729o = this.f2662s;
        if (abstractC0729o != null && (str = this.f2648i) != null) {
            return abstractC0729o.m3518f0(str);
        }
        return null;
    }

    /* renamed from: l8 */
    public void mo3179l8(Bundle bundle) {
        this.f2623F = true;
    }

    /* renamed from: m7 */
    public boolean m3180m7() {
        return this.f2627J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m8 */
    public void m3181m8(Bundle bundle) {
        this.f2664u.m3500S0();
        this.f2638a = 3;
        this.f2623F = false;
        mo3085F7(bundle);
        if (this.f2623F) {
            m3066Q8();
            this.f2664u.m3554y();
        } else {
            throw new C0725k0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* renamed from: n7 */
    public View m3182n7() {
        return this.f2625H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n8 */
    public void m3183n8() {
        Iterator it = this.f2655l0.iterator();
        if (!it.hasNext()) {
            this.f2655l0.clear();
            this.f2664u.m3529k(this.f2663t, mo3203y6(), this);
            this.f2638a = 0;
            this.f2623F = false;
            mo3094I7(this.f2663t.m3412f());
            if (this.f2623F) {
                this.f2662s.m3482I(this);
                this.f2664u.m3556z();
                return;
            } else {
                throw new C0725k0("Fragment " + this + " did not call through to super.onAttach()");
            }
        }
        AbstractC0272b.m941a(it.next());
        throw null;
    }

    /* renamed from: o7 */
    public LiveData m3184o7() {
        return this.f2645g0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o8 */
    public void m3185o8(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2664u.m3468A(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2623F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m3104L8().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f2623F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p8 */
    public boolean m3186p8(MenuItem menuItem) {
        if (!this.f2669z) {
            if (m3100K7(menuItem)) {
                return true;
            }
            return this.f2664u.m3470B(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q7 */
    public void m3187q7() {
        m3068p7();
        this.f2643f = UUID.randomUUID().toString();
        this.f2654l = false;
        this.f2656m = false;
        this.f2657n = false;
        this.f2658o = false;
        this.f2659p = false;
        this.f2661r = 0;
        this.f2662s = null;
        this.f2664u = new C0730p();
        this.f2663t = null;
        this.f2666w = 0;
        this.f2667x = 0;
        this.f2668y = null;
        this.f2669z = false;
        this.f2618A = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q8 */
    public void m3188q8(Bundle bundle) {
        this.f2664u.m3500S0();
        this.f2638a = 1;
        this.f2623F = false;
        this.f2636Y.mo3703a(new InterfaceC0750d() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.InterfaceC0750d
            public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                View view;
                if (bVar == AbstractC0749c.b.ON_STOP && (view = Fragment.this.f2625H) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.f2649i0.m4313c(bundle);
        mo3103L7(bundle);
        this.f2634W = true;
        if (this.f2623F) {
            this.f2636Y.m3720h(AbstractC0749c.b.ON_CREATE);
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r8 */
    public boolean m3189r8(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f2669z) {
            return false;
        }
        if (this.f2621D && this.f2622E) {
            m3112O7(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.f2664u.m3474D(menu, menuInflater);
    }

    /* renamed from: s7 */
    public final boolean m3190s7() {
        if (this.f2663t != null && this.f2654l) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8 */
    public void mo3191s8(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2664u.m3500S0();
        this.f2660q = true;
        this.f2637Z = new C0717g0(this, mo951b3());
        View mo3115P7 = mo3115P7(layoutInflater, viewGroup, bundle);
        this.f2625H = mo3115P7;
        if (mo3115P7 != null) {
            this.f2637Z.m3342b();
            AbstractC0765s.m3748a(this.f2625H, this.f2637Z);
            AbstractC0766t.m3749a(this.f2625H, this.f2637Z);
            AbstractC0838c.m4315a(this.f2625H, this.f2637Z);
            this.f2645g0.mo3684i(this.f2637Z);
            return;
        }
        if (!this.f2637Z.m3343c()) {
            this.f2637Z = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void startActivityForResult(Intent intent, int i10) {
        m3174j9(intent, i10, null);
    }

    /* renamed from: t7 */
    public final boolean m3192t7() {
        return this.f2618A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t8 */
    public void m3193t8() {
        this.f2664u.m3476E();
        this.f2636Y.m3720h(AbstractC0749c.b.ON_DESTROY);
        this.f2638a = 0;
        this.f2623F = false;
        this.f2634W = false;
        mo3118Q7();
        if (this.f2623F) {
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2643f);
        if (this.f2666w != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2666w));
        }
        if (this.f2668y != null) {
            sb2.append(" tag=");
            sb2.append(this.f2668y);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u7 */
    public final boolean m3194u7() {
        return this.f2669z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u8 */
    public void m3195u8() {
        this.f2664u.m3478F();
        if (this.f2625H != null && this.f2637Z.mo953f6().mo3704b().m3709a(AbstractC0749c.c.CREATED)) {
            this.f2637Z.m3341a(AbstractC0749c.b.ON_DESTROY);
        }
        this.f2638a = 1;
        this.f2623F = false;
        mo3123S7();
        if (this.f2623F) {
            AbstractC0767a.m3750b(this).mo3752c();
            this.f2660q = false;
        } else {
            throw new C0725k0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7 */
    public boolean m3196v7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return false;
        }
        return c0700e.f2698w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v8 */
    public void m3197v8() {
        this.f2638a = -1;
        this.f2623F = false;
        mo3126T7();
        this.f2633V = null;
        if (this.f2623F) {
            if (!this.f2664u.m3477E0()) {
                this.f2664u.m3476E();
                this.f2664u = new C0730p();
                return;
            }
            return;
        }
        throw new C0725k0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w7 */
    public final boolean m3198w7() {
        if (this.f2661r > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w8 */
    public LayoutInflater m3199w8(Bundle bundle) {
        LayoutInflater mo3128U7 = mo3128U7(bundle);
        this.f2633V = mo3128U7;
        return mo3128U7;
    }

    /* renamed from: x6 */
    void m3200x6(boolean z10) {
        ViewGroup viewGroup;
        AbstractC0729o abstractC0729o;
        C0700e c0700e = this.f2628K;
        InterfaceC0702g interfaceC0702g = null;
        if (c0700e != null) {
            c0700e.f2696u = false;
            InterfaceC0702g interfaceC0702g2 = c0700e.f2697v;
            c0700e.f2697v = null;
            interfaceC0702g = interfaceC0702g2;
        }
        if (interfaceC0702g != null) {
            interfaceC0702g.mo3212b();
            return;
        }
        if (AbstractC0729o.f2891P && this.f2625H != null && (viewGroup = this.f2624G) != null && (abstractC0729o = this.f2662s) != null) {
            AbstractC0721i0 m3353n = AbstractC0721i0.m3353n(viewGroup, abstractC0729o);
            m3353n.m3365p();
            if (z10) {
                this.f2663t.m3413g().post(new RunnableC0698c(m3353n));
            } else {
                m3353n.m3360g();
            }
        }
    }

    /* renamed from: x7 */
    public final boolean m3201x7() {
        AbstractC0729o abstractC0729o;
        if (this.f2622E && ((abstractC0729o = this.f2662s) == null || abstractC0729o.m3481H0(this.f2665v))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x8 */
    public void m3202x8() {
        onLowMemory();
        this.f2664u.m3479G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y6 */
    public AbstractC0716g mo3203y6() {
        return new C0699d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y7 */
    public boolean m3204y7() {
        C0700e c0700e = this.f2628K;
        if (c0700e == null) {
            return false;
        }
        return c0700e.f2696u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y8 */
    public void m3205y8(boolean z10) {
        m3140Y7(z10);
        this.f2664u.m3480H(z10);
    }

    /* renamed from: z6 */
    public void mo3206z6(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2666w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2667x));
        printWriter.print(" mTag=");
        printWriter.println(this.f2668y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2638a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2643f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2661r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2654l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2656m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2657n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2658o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2669z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2618A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2622E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2621D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2619B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2627J);
        if (this.f2662s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2662s);
        }
        if (this.f2663t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2663t);
        }
        if (this.f2665v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2665v);
        }
        if (this.f2644g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2644g);
        }
        if (this.f2639b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2639b);
        }
        if (this.f2640c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2640c);
        }
        if (this.f2641d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2641d);
        }
        Fragment m3178l7 = m3178l7();
        if (m3178l7 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m3178l7);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2650j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m3139Y6());
        if (m3099K6() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m3099K6());
        }
        if (m3108N6() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m3108N6());
        }
        if (m3142Z6() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m3142Z6());
        }
        if (m3145a7() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m3145a7());
        }
        if (this.f2624G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2624G);
        }
        if (this.f2625H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2625H);
        }
        if (m3084F6() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m3084F6());
        }
        if (m3096J6() != null) {
            AbstractC0767a.m3750b(this).mo3751a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2664u + ":");
        this.f2664u.m3506W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: z7 */
    public final boolean m3207z7() {
        return this.f2656m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z8 */
    public boolean m3208z8(MenuItem menuItem) {
        if (!this.f2669z) {
            if (this.f2621D && this.f2622E && m3143Z7(menuItem)) {
                return true;
            }
            return this.f2664u.m3484J(menuItem);
        }
        return false;
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public static class C0703h implements Parcelable {
        public static final Parcelable.Creator<C0703h> CREATOR = new a();

        /* renamed from: a */
        final Bundle f2699a;

        /* renamed from: androidx.fragment.app.Fragment$h$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0703h createFromParcel(Parcel parcel) {
                return new C0703h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0703h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0703h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0703h[] newArray(int i10) {
                return new C0703h[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0703h(Bundle bundle) {
            this.f2699a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f2699a);
        }

        C0703h(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2699a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }
}
