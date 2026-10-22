package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC0616q0;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0721i0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0764r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public class C0736v {

    /* renamed from: a */
    private final C0728n f2989a;

    /* renamed from: b */
    private final C0737w f2990b;

    /* renamed from: c */
    private final Fragment f2991c;

    /* renamed from: d */
    private boolean f2992d = false;

    /* renamed from: e */
    private int f2993e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.v$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f2994a;

        a(View view) {
            this.f2994a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2994a.removeOnAttachStateChangeListener(this);
            AbstractC0616q0.m2630k0(this.f2994a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.v$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2996a;

        static {
            int[] iArr = new int[AbstractC0749c.c.values().length];
            f2996a = iArr;
            try {
                iArr[AbstractC0749c.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2996a[AbstractC0749c.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2996a[AbstractC0749c.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2996a[AbstractC0749c.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0736v(C0728n c0728n, C0737w c0737w, Fragment fragment) {
        this.f2989a = c0728n;
        this.f2990b = c0737w;
        this.f2991c = fragment;
    }

    /* renamed from: l */
    private boolean m3591l(View view) {
        if (view == this.f2991c.f2625H) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2991c.f2625H) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m3592q() {
        Bundle bundle = new Bundle();
        this.f2991c.m3089G8(bundle);
        this.f2989a.m3425j(this.f2991c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2991c.f2625H != null) {
            m3610t();
        }
        if (this.f2991c.f2640c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2991c.f2640c);
        }
        if (this.f2991c.f2641d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2991c.f2641d);
        }
        if (!this.f2991c.f2627J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2991c.f2627J);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3593a() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        fragment.m3181m8(fragment.f2639b);
        C0728n c0728n = this.f2989a;
        Fragment fragment2 = this.f2991c;
        c0728n.m3416a(fragment2, fragment2.f2639b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3594b() {
        int m3623j = this.f2990b.m3623j(this.f2991c);
        Fragment fragment = this.f2991c;
        fragment.f2624G.addView(fragment.f2625H, m3623j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3595c() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        Fragment fragment2 = fragment.f2646h;
        C0736v c0736v = null;
        if (fragment2 != null) {
            C0736v m3626m = this.f2990b.m3626m(fragment2.f2643f);
            if (m3626m != null) {
                Fragment fragment3 = this.f2991c;
                fragment3.f2648i = fragment3.f2646h.f2643f;
                fragment3.f2646h = null;
                c0736v = m3626m;
            } else {
                throw new IllegalStateException("Fragment " + this.f2991c + " declared target fragment " + this.f2991c.f2646h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f2648i;
            if (str != null && (c0736v = this.f2990b.m3626m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2991c + " declared target fragment " + this.f2991c.f2648i + " that does not belong to this FragmentManager!");
            }
        }
        if (c0736v != null && (AbstractC0729o.f2891P || c0736v.m3603k().f2638a < 1)) {
            c0736v.m3604m();
        }
        Fragment fragment4 = this.f2991c;
        fragment4.f2663t = fragment4.f2662s.m3546t0();
        Fragment fragment5 = this.f2991c;
        fragment5.f2665v = fragment5.f2662s.m3551w0();
        this.f2989a.m3422g(this.f2991c, false);
        this.f2991c.m3183n8();
        this.f2989a.m3417b(this.f2991c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m3596d() {
        AbstractC0721i0.e.b bVar;
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2991c;
        if (fragment2.f2662s == null) {
            return fragment2.f2638a;
        }
        int i10 = this.f2993e;
        int i11 = b.f2996a[fragment2.f2635X.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        i10 = Math.min(i10, -1);
                    } else {
                        i10 = Math.min(i10, 0);
                    }
                } else {
                    i10 = Math.min(i10, 1);
                }
            } else {
                i10 = Math.min(i10, 5);
            }
        }
        Fragment fragment3 = this.f2991c;
        if (fragment3.f2657n) {
            if (fragment3.f2658o) {
                i10 = Math.max(this.f2993e, 2);
                View view = this.f2991c.f2625H;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2993e < 4 ? Math.min(i10, fragment3.f2638a) : Math.min(i10, 1);
            }
        }
        if (!this.f2991c.f2654l) {
            i10 = Math.min(i10, 1);
        }
        if (AbstractC0729o.f2891P && (viewGroup = (fragment = this.f2991c).f2624G) != null) {
            bVar = AbstractC0721i0.m3353n(viewGroup, fragment.m3136X6()).m3363l(this);
        } else {
            bVar = null;
        }
        if (bVar == AbstractC0721i0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == AbstractC0721i0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f2991c;
            if (fragment4.f2656m) {
                if (fragment4.m3198w7()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f2991c;
        if (fragment5.f2626I && fragment5.f2638a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f2991c);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3597e() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        if (!fragment.f2634W) {
            this.f2989a.m3423h(fragment, fragment.f2639b, false);
            Fragment fragment2 = this.f2991c;
            fragment2.m3188q8(fragment2.f2639b);
            C0728n c0728n = this.f2989a;
            Fragment fragment3 = this.f2991c;
            c0728n.m3418c(fragment3, fragment3.f2639b, false);
            return;
        }
        fragment.m3116P8(fragment.f2639b);
        this.f2991c.f2638a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3598f() {
        String str;
        if (this.f2991c.f2657n) {
            return;
        }
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        LayoutInflater m3199w8 = fragment.m3199w8(fragment.f2639b);
        Fragment fragment2 = this.f2991c;
        ViewGroup viewGroup = fragment2.f2624G;
        if (viewGroup == null) {
            int i10 = fragment2.f2667x;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment2.f2662s.m3536n0().mo3209c(this.f2991c.f2667x);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f2991c;
                        if (!fragment3.f2659p) {
                            try {
                                str = fragment3.m3154d7().getResourceName(this.f2991c.f2667x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2991c.f2667x) + " (" + str + ") for fragment " + this.f2991c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2991c + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        Fragment fragment4 = this.f2991c;
        fragment4.f2624G = viewGroup;
        fragment4.mo3191s8(m3199w8, viewGroup, fragment4.f2639b);
        View view = this.f2991c.f2625H;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2991c;
            fragment5.f2625H.setTag(R$id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m3594b();
            }
            Fragment fragment6 = this.f2991c;
            if (fragment6.f2669z) {
                fragment6.f2625H.setVisibility(8);
            }
            if (AbstractC0616q0.m2599Q(this.f2991c.f2625H)) {
                AbstractC0616q0.m2630k0(this.f2991c.f2625H);
            } else {
                View view2 = this.f2991c.f2625H;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2991c.m3098J8();
            C0728n c0728n = this.f2989a;
            Fragment fragment7 = this.f2991c;
            c0728n.m3428m(fragment7, fragment7.f2625H, fragment7.f2639b, false);
            int visibility = this.f2991c.f2625H.getVisibility();
            float alpha = this.f2991c.f2625H.getAlpha();
            if (AbstractC0729o.f2891P) {
                this.f2991c.m3156d9(alpha);
                Fragment fragment8 = this.f2991c;
                if (fragment8.f2624G != null && visibility == 0) {
                    View findFocus = fragment8.f2625H.findFocus();
                    if (findFocus != null) {
                        this.f2991c.m3135W8(findFocus);
                        if (AbstractC0729o.m3432F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2991c);
                        }
                    }
                    this.f2991c.f2625H.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2991c;
                if (visibility == 0 && fragment9.f2624G != null) {
                    z10 = true;
                }
                fragment9.f2630M = z10;
            }
        }
        this.f2991c.f2638a = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3599g() {
        boolean z10;
        boolean z11;
        Fragment m3619f;
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        boolean z12 = true;
        if (fragment.f2656m && !fragment.m3198w7()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.f2990b.m3628o().m3584o(this.f2991c)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            AbstractC0726l abstractC0726l = this.f2991c.f2663t;
            if (abstractC0726l instanceof InterfaceC0764r) {
                z12 = this.f2990b.m3628o().m3581l();
            } else if (abstractC0726l.m3412f() instanceof Activity) {
                z12 = true ^ ((Activity) abstractC0726l.m3412f()).isChangingConfigurations();
            }
            if (z10 || z12) {
                this.f2990b.m3628o().m3576f(this.f2991c);
            }
            this.f2991c.m3193t8();
            this.f2989a.m3419d(this.f2991c, false);
            for (C0736v c0736v : this.f2990b.m3624k()) {
                if (c0736v != null) {
                    Fragment m3603k = c0736v.m3603k();
                    if (this.f2991c.f2643f.equals(m3603k.f2648i)) {
                        m3603k.f2646h = this.f2991c;
                        m3603k.f2648i = null;
                    }
                }
            }
            Fragment fragment2 = this.f2991c;
            String str = fragment2.f2648i;
            if (str != null) {
                fragment2.f2646h = this.f2990b.m3619f(str);
            }
            this.f2990b.m3630q(this);
            return;
        }
        String str2 = this.f2991c.f2648i;
        if (str2 != null && (m3619f = this.f2990b.m3619f(str2)) != null && m3619f.f2619B) {
            this.f2991c.f2646h = m3619f;
        }
        this.f2991c.f2638a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3600h() {
        View view;
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2991c);
        }
        Fragment fragment = this.f2991c;
        ViewGroup viewGroup = fragment.f2624G;
        if (viewGroup != null && (view = fragment.f2625H) != null) {
            viewGroup.removeView(view);
        }
        this.f2991c.m3195u8();
        this.f2989a.m3429n(this.f2991c, false);
        Fragment fragment2 = this.f2991c;
        fragment2.f2624G = null;
        fragment2.f2625H = null;
        fragment2.f2637Z = null;
        fragment2.f2645g0.mo3684i(null);
        this.f2991c.f2658o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m3601i() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2991c);
        }
        this.f2991c.m3197v8();
        boolean z10 = false;
        this.f2989a.m3420e(this.f2991c, false);
        Fragment fragment = this.f2991c;
        fragment.f2638a = -1;
        fragment.f2663t = null;
        fragment.f2665v = null;
        fragment.f2662s = null;
        if (fragment.f2656m && !fragment.m3198w7()) {
            z10 = true;
        }
        if (z10 || this.f2990b.m3628o().m3584o(this.f2991c)) {
            if (AbstractC0729o.m3432F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2991c);
            }
            this.f2991c.m3187q7();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3602j() {
        Fragment fragment = this.f2991c;
        if (fragment.f2657n && fragment.f2658o && !fragment.f2660q) {
            if (AbstractC0729o.m3432F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2991c);
            }
            Fragment fragment2 = this.f2991c;
            fragment2.mo3191s8(fragment2.m3199w8(fragment2.f2639b), null, this.f2991c.f2639b);
            View view = this.f2991c.f2625H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2991c;
                fragment3.f2625H.setTag(R$id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2991c;
                if (fragment4.f2669z) {
                    fragment4.f2625H.setVisibility(8);
                }
                this.f2991c.m3098J8();
                C0728n c0728n = this.f2989a;
                Fragment fragment5 = this.f2991c;
                c0728n.m3428m(fragment5, fragment5.f2625H, fragment5.f2639b, false);
                this.f2991c.f2638a = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m3603k() {
        return this.f2991c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m3604m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2992d) {
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m3603k());
                return;
            }
            return;
        }
        try {
            this.f2992d = true;
            while (true) {
                int m3596d = m3596d();
                Fragment fragment = this.f2991c;
                int i10 = fragment.f2638a;
                if (m3596d != i10) {
                    if (m3596d > i10) {
                        switch (i10 + 1) {
                            case 0:
                                m3595c();
                                break;
                            case 1:
                                m3597e();
                                break;
                            case 2:
                                m3602j();
                                m3598f();
                                break;
                            case 3:
                                m3593a();
                                break;
                            case 4:
                                if (fragment.f2625H != null && (viewGroup2 = fragment.f2624G) != null) {
                                    AbstractC0721i0.m3353n(viewGroup2, fragment.m3136X6()).m3356b(AbstractC0721i0.e.c.m3379b(this.f2991c.f2625H.getVisibility()), this);
                                }
                                this.f2991c.f2638a = 4;
                                break;
                            case 5:
                                m3612v();
                                break;
                            case 6:
                                fragment.f2638a = 6;
                                break;
                            case 7:
                                m3607p();
                                break;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                m3601i();
                                break;
                            case 0:
                                m3599g();
                                break;
                            case 1:
                                m3600h();
                                this.f2991c.f2638a = 1;
                                break;
                            case 2:
                                fragment.f2658o = false;
                                fragment.f2638a = 2;
                                break;
                            case 3:
                                if (AbstractC0729o.m3432F0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2991c);
                                }
                                Fragment fragment2 = this.f2991c;
                                if (fragment2.f2625H != null && fragment2.f2640c == null) {
                                    m3610t();
                                }
                                Fragment fragment3 = this.f2991c;
                                if (fragment3.f2625H != null && (viewGroup3 = fragment3.f2624G) != null) {
                                    AbstractC0721i0.m3353n(viewGroup3, fragment3.m3136X6()).m3358d(this);
                                }
                                this.f2991c.f2638a = 3;
                                break;
                            case 4:
                                m3613w();
                                break;
                            case 5:
                                fragment.f2638a = 5;
                                break;
                            case 6:
                                m3605n();
                                break;
                        }
                    }
                } else {
                    if (AbstractC0729o.f2891P && fragment.f2631N) {
                        if (fragment.f2625H != null && (viewGroup = fragment.f2624G) != null) {
                            AbstractC0721i0 m3353n = AbstractC0721i0.m3353n(viewGroup, fragment.m3136X6());
                            if (this.f2991c.f2669z) {
                                m3353n.m3357c(this);
                            } else {
                                m3353n.m3359e(this);
                            }
                        }
                        Fragment fragment4 = this.f2991c;
                        AbstractC0729o abstractC0729o = fragment4.f2662s;
                        if (abstractC0729o != null) {
                            abstractC0729o.m3475D0(fragment4);
                        }
                        Fragment fragment5 = this.f2991c;
                        fragment5.f2631N = false;
                        fragment5.mo3131V7(fragment5.f2669z);
                    }
                    return;
                }
            }
        } finally {
            this.f2992d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m3605n() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2991c);
        }
        this.f2991c.m3074B8();
        this.f2989a.m3421f(this.f2991c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m3606o(ClassLoader classLoader) {
        Bundle bundle = this.f2991c.f2639b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2991c;
        fragment.f2640c = fragment.f2639b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2991c;
        fragment2.f2641d = fragment2.f2639b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2991c;
        fragment3.f2648i = fragment3.f2639b.getString("android:target_state");
        Fragment fragment4 = this.f2991c;
        if (fragment4.f2648i != null) {
            fragment4.f2650j = fragment4.f2639b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2991c;
        Boolean bool = fragment5.f2642e;
        if (bool != null) {
            fragment5.f2627J = bool.booleanValue();
            this.f2991c.f2642e = null;
        } else {
            fragment5.f2627J = fragment5.f2639b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2991c;
        if (!fragment6.f2627J) {
            fragment6.f2626I = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m3607p() {
        String str;
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2991c);
        }
        View m3117Q6 = this.f2991c.m3117Q6();
        if (m3117Q6 != null && m3591l(m3117Q6)) {
            boolean requestFocus = m3117Q6.requestFocus();
            if (AbstractC0729o.m3432F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(m3117Q6);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f2991c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2991c.f2625H.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2991c.m3135W8(null);
        this.f2991c.m3086F8();
        this.f2989a.m3424i(this.f2991c, false);
        Fragment fragment = this.f2991c;
        fragment.f2639b = null;
        fragment.f2640c = null;
        fragment.f2641d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Fragment.C0703h m3608r() {
        Bundle m3592q;
        if (this.f2991c.f2638a <= -1 || (m3592q = m3592q()) == null) {
            return null;
        }
        return new Fragment.C0703h(m3592q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C0735u m3609s() {
        C0735u c0735u = new C0735u(this.f2991c);
        Fragment fragment = this.f2991c;
        if (fragment.f2638a > -1 && c0735u.f2988m == null) {
            Bundle m3592q = m3592q();
            c0735u.f2988m = m3592q;
            if (this.f2991c.f2648i != null) {
                if (m3592q == null) {
                    c0735u.f2988m = new Bundle();
                }
                c0735u.f2988m.putString("android:target_state", this.f2991c.f2648i);
                int i10 = this.f2991c.f2650j;
                if (i10 != 0) {
                    c0735u.f2988m.putInt("android:target_req_state", i10);
                }
            }
        } else {
            c0735u.f2988m = fragment.f2639b;
        }
        return c0735u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m3610t() {
        if (this.f2991c.f2625H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2991c.f2625H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2991c.f2640c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2991c.f2637Z.m3345e(bundle);
        if (!bundle.isEmpty()) {
            this.f2991c.f2641d = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m3611u(int i10) {
        this.f2993e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m3612v() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2991c);
        }
        this.f2991c.m3092H8();
        this.f2989a.m3426k(this.f2991c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m3613w() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2991c);
        }
        this.f2991c.m3095I8();
        this.f2989a.m3427l(this.f2991c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0736v(C0728n c0728n, C0737w c0737w, ClassLoader classLoader, AbstractC0724k abstractC0724k, C0735u c0735u) {
        this.f2989a = c0728n;
        this.f2990b = c0737w;
        Fragment mo3410a = abstractC0724k.mo3410a(classLoader, c0735u.f2976a);
        this.f2991c = mo3410a;
        Bundle bundle = c0735u.f2985j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo3410a.m3132V8(c0735u.f2985j);
        mo3410a.f2643f = c0735u.f2977b;
        mo3410a.f2657n = c0735u.f2978c;
        mo3410a.f2659p = true;
        mo3410a.f2666w = c0735u.f2979d;
        mo3410a.f2667x = c0735u.f2980e;
        mo3410a.f2668y = c0735u.f2981f;
        mo3410a.f2619B = c0735u.f2982g;
        mo3410a.f2656m = c0735u.f2983h;
        mo3410a.f2618A = c0735u.f2984i;
        mo3410a.f2669z = c0735u.f2986k;
        mo3410a.f2635X = AbstractC0749c.c.values()[c0735u.f2987l];
        Bundle bundle2 = c0735u.f2988m;
        if (bundle2 != null) {
            mo3410a.f2639b = bundle2;
        } else {
            mo3410a.f2639b = new Bundle();
        }
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo3410a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0736v(C0728n c0728n, C0737w c0737w, Fragment fragment, C0735u c0735u) {
        this.f2989a = c0728n;
        this.f2990b = c0737w;
        this.f2991c = fragment;
        fragment.f2640c = null;
        fragment.f2641d = null;
        fragment.f2661r = 0;
        fragment.f2658o = false;
        fragment.f2654l = false;
        Fragment fragment2 = fragment.f2646h;
        fragment.f2648i = fragment2 != null ? fragment2.f2643f : null;
        fragment.f2646h = null;
        Bundle bundle = c0735u.f2988m;
        if (bundle != null) {
            fragment.f2639b = bundle;
        } else {
            fragment.f2639b = new Bundle();
        }
    }
}
