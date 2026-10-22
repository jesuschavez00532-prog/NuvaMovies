package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0284b;
import androidx.activity.InterfaceC0285c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0288c;
import androidx.activity.result.AbstractC0289d;
import androidx.activity.result.C0286a;
import androidx.activity.result.C0291f;
import androidx.activity.result.InterfaceC0287b;
import androidx.activity.result.InterfaceC0290e;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0714f;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.AbstractC0739y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.InterfaceC0752f;
import androidx.lifecycle.InterfaceC0764r;
import com.umeng.analytics.pro.C3395q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p090d.AbstractC3914a;
import p090d.C3915b;
import p090d.C3916c;
import p214l.C5304b;
import p331t.C6871b;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public abstract class AbstractC0729o {

    /* renamed from: O */
    private static boolean f2890O = false;

    /* renamed from: P */
    static boolean f2891P = true;

    /* renamed from: A */
    private AbstractC0288c f2892A;

    /* renamed from: B */
    private AbstractC0288c f2893B;

    /* renamed from: D */
    private boolean f2895D;

    /* renamed from: E */
    private boolean f2896E;

    /* renamed from: F */
    private boolean f2897F;

    /* renamed from: G */
    private boolean f2898G;

    /* renamed from: H */
    private boolean f2899H;

    /* renamed from: I */
    private ArrayList f2900I;

    /* renamed from: J */
    private ArrayList f2901J;

    /* renamed from: K */
    private ArrayList f2902K;

    /* renamed from: L */
    private ArrayList f2903L;

    /* renamed from: M */
    private C0732r f2904M;

    /* renamed from: b */
    private boolean f2907b;

    /* renamed from: d */
    ArrayList f2909d;

    /* renamed from: e */
    private ArrayList f2910e;

    /* renamed from: g */
    private OnBackPressedDispatcher f2912g;

    /* renamed from: l */
    private ArrayList f2917l;

    /* renamed from: r */
    private AbstractC0726l f2923r;

    /* renamed from: s */
    private AbstractC0716g f2924s;

    /* renamed from: t */
    private Fragment f2925t;

    /* renamed from: u */
    Fragment f2926u;

    /* renamed from: z */
    private AbstractC0288c f2931z;

    /* renamed from: a */
    private final ArrayList f2906a = new ArrayList();

    /* renamed from: c */
    private final C0737w f2908c = new C0737w();

    /* renamed from: f */
    private final LayoutInflaterFactory2C0727m f2911f = new LayoutInflaterFactory2C0727m(this);

    /* renamed from: h */
    private final AbstractC0284b f2913h = new c(false);

    /* renamed from: i */
    private final AtomicInteger f2914i = new AtomicInteger();

    /* renamed from: j */
    private final Map f2915j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map f2916k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map f2918m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final AbstractC0739y.g f2919n = new d();

    /* renamed from: o */
    private final C0728n f2920o = new C0728n(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList f2921p = new CopyOnWriteArrayList();

    /* renamed from: q */
    int f2922q = -1;

    /* renamed from: v */
    private AbstractC0724k f2927v = null;

    /* renamed from: w */
    private AbstractC0724k f2928w = new e();

    /* renamed from: x */
    private InterfaceC0723j0 f2929x = null;

    /* renamed from: y */
    private InterfaceC0723j0 f2930y = new f();

    /* renamed from: C */
    ArrayDeque f2894C = new ArrayDeque();

    /* renamed from: N */
    private Runnable f2905N = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0287b {
        a() {
        }

        @Override // androidx.activity.result.InterfaceC0287b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo971a(C0286a c0286a) {
            m mVar = (m) AbstractC0729o.this.f2894C.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVar.f2946a;
            int i10 = mVar.f2947b;
            Fragment m3622i = AbstractC0729o.this.f2908c.m3622i(str);
            if (m3622i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m3622i.mo3088G7(i10, c0286a.m968b(), c0286a.m967a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0287b {
        b() {
        }

        @Override // androidx.activity.result.InterfaceC0287b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo971a(Map map) {
            int i10;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            m mVar = (m) AbstractC0729o.this.f2894C.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = mVar.f2946a;
            int i12 = mVar.f2947b;
            Fragment m3622i = AbstractC0729o.this.f2908c.m3622i(str);
            if (m3622i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m3622i.mo3161f8(i12, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0284b {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.AbstractC0284b
        /* renamed from: b */
        public void mo961b() {
            AbstractC0729o.this.m3471B0();
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    /* loaded from: classes.dex */
    class d implements AbstractC0739y.g {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC0739y.g
        /* renamed from: a */
        public void mo3559a(Fragment fragment, C6871b c6871b) {
            if (!c6871b.m26780b()) {
                AbstractC0729o.this.m3514c1(fragment, c6871b);
            }
        }

        @Override // androidx.fragment.app.AbstractC0739y.g
        /* renamed from: b */
        public void mo3560b(Fragment fragment, C6871b c6871b) {
            AbstractC0729o.this.m3517f(fragment, c6871b);
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0724k {
        e() {
        }

        @Override // androidx.fragment.app.AbstractC0724k
        /* renamed from: a */
        public Fragment mo3410a(ClassLoader classLoader, String str) {
            return AbstractC0729o.this.m3546t0().m3340b(AbstractC0729o.this.m3546t0().m3412f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.o$f */
    /* loaded from: classes.dex */
    class f implements InterfaceC0723j0 {
        f() {
        }

        @Override // androidx.fragment.app.InterfaceC0723j0
        /* renamed from: a */
        public AbstractC0721i0 mo3406a(ViewGroup viewGroup) {
            return new C0708c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.o$g */
    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0729o.this.m3510a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2939a;

        /* renamed from: b */
        final /* synthetic */ View f2940b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2941c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2939a = viewGroup;
            this.f2940b = view;
            this.f2941c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2939a.endViewTransition(this.f2940b);
            animator.removeListener(this);
            Fragment fragment = this.f2941c;
            View view = fragment.f2625H;
            if (view != null && fragment.f2669z) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$i */
    /* loaded from: classes.dex */
    public class i implements InterfaceC0733s {

        /* renamed from: a */
        final /* synthetic */ Fragment f2943a;

        i(Fragment fragment) {
            this.f2943a = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0733s
        /* renamed from: a */
        public void mo3299a(AbstractC0729o abstractC0729o, Fragment fragment) {
            this.f2943a.m3097J7(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$j */
    /* loaded from: classes.dex */
    public class j implements InterfaceC0287b {
        j() {
        }

        @Override // androidx.activity.result.InterfaceC0287b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo971a(C0286a c0286a) {
            m mVar = (m) AbstractC0729o.this.f2894C.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVar.f2946a;
            int i10 = mVar.f2947b;
            Fragment m3622i = AbstractC0729o.this.f2908c.m3622i(str);
            if (m3622i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m3622i.mo3088G7(i10, c0286a.m968b(), c0286a.m967a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$k */
    /* loaded from: classes.dex */
    public static class k extends AbstractC3914a {
        k() {
        }

        @Override // p090d.AbstractC3914a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo3562a(Context context, C0291f c0291f) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m985a = c0291f.m985a();
            if (m985a != null && (bundleExtra = m985a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m985a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m985a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c0291f = new C0291f.b(c0291f.m988e()).m992b(null).m993c(c0291f.m987d(), c0291f.m986b()).m991a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0291f);
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p090d.AbstractC3914a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0286a mo3563c(int i10, Intent intent) {
            return new C0286a(i10, intent);
        }
    }

    /* renamed from: androidx.fragment.app.o$l */
    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public void onFragmentActivityCreated(AbstractC0729o abstractC0729o, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(AbstractC0729o abstractC0729o, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(AbstractC0729o abstractC0729o, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentDetached(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentPaused(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentPreAttached(AbstractC0729o abstractC0729o, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(AbstractC0729o abstractC0729o, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(AbstractC0729o abstractC0729o, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentStopped(AbstractC0729o abstractC0729o, Fragment fragment) {
        }

        public void onFragmentViewCreated(AbstractC0729o abstractC0729o, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(AbstractC0729o abstractC0729o, Fragment fragment) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$n */
    /* loaded from: classes.dex */
    public interface n {
        /* renamed from: a */
        boolean mo3226a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: androidx.fragment.app.o$o */
    /* loaded from: classes.dex */
    private class o implements n {

        /* renamed from: a */
        final String f2948a;

        /* renamed from: b */
        final int f2949b;

        /* renamed from: c */
        final int f2950c;

        o(String str, int i10, int i11) {
            this.f2948a = str;
            this.f2949b = i10;
            this.f2950c = i11;
        }

        @Override // androidx.fragment.app.AbstractC0729o.n
        /* renamed from: a */
        public boolean mo3226a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = AbstractC0729o.this.f2926u;
            if (fragment != null && this.f2949b < 0 && this.f2948a == null && fragment.m3093I6().m3507W0()) {
                return false;
            }
            return AbstractC0729o.this.m3509Y0(arrayList, arrayList2, this.f2948a, this.f2949b, this.f2950c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$p */
    /* loaded from: classes.dex */
    public static class p implements Fragment.InterfaceC0702g {

        /* renamed from: a */
        final boolean f2952a;

        /* renamed from: b */
        final C0704a f2953b;

        /* renamed from: c */
        private int f2954c;

        p(C0704a c0704a, boolean z10) {
            this.f2952a = z10;
            this.f2953b = c0704a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0702g
        /* renamed from: a */
        public void mo3211a() {
            this.f2954c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0702g
        /* renamed from: b */
        public void mo3212b() {
            int i10 = this.f2954c - 1;
            this.f2954c = i10;
            if (i10 != 0) {
                return;
            }
            this.f2953b.f2703t.m3533l1();
        }

        /* renamed from: c */
        void m3568c() {
            C0704a c0704a = this.f2953b;
            c0704a.f2703t.m3545t(c0704a, this.f2952a, false, false);
        }

        /* renamed from: d */
        void m3569d() {
            boolean z10;
            if (this.f2954c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (Fragment fragment : this.f2953b.f2703t.m3544s0()) {
                fragment.m3150b9(null);
                if (z10 && fragment.m3204y7()) {
                    fragment.m3177k9();
                }
            }
            C0704a c0704a = this.f2953b;
            c0704a.f2703t.m3545t(c0704a, this.f2952a, !z10, true);
        }

        /* renamed from: e */
        public boolean m3570e() {
            if (this.f2954c == 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public static boolean m3432F0(int i10) {
        if (!f2890O && !Log.isLoggable("FragmentManager", i10)) {
            return false;
        }
        return true;
    }

    /* renamed from: G0 */
    private boolean m3433G0(Fragment fragment) {
        if ((fragment.f2621D && fragment.f2622E) || fragment.f2664u.m3538o()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m3434L(Fragment fragment) {
        if (fragment != null && fragment.equals(m3518f0(fragment.f2643f))) {
            fragment.m3083E8();
        }
    }

    /* renamed from: N0 */
    private void m3435N0(C5304b c5304b) {
        int size = c5304b.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = (Fragment) c5304b.m21367p(i10);
            if (!fragment.f2654l) {
                View m3113O8 = fragment.m3113O8();
                fragment.f2632O = m3113O8.getAlpha();
                m3113O8.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: S */
    private void m3436S(int i10) {
        try {
            this.f2907b = true;
            this.f2908c.m3617d(i10);
            m3495P0(i10, false);
            if (f2891P) {
                Iterator it = m3460r().iterator();
                while (it.hasNext()) {
                    ((AbstractC0721i0) it.next()).m3361j();
                }
            }
            this.f2907b = false;
            m3510a0(true);
        } catch (Throwable th) {
            this.f2907b = false;
            throw th;
        }
    }

    /* renamed from: V */
    private void m3437V() {
        if (this.f2899H) {
            this.f2899H = false;
            m3461r1();
        }
    }

    /* renamed from: X */
    private void m3438X() {
        if (f2891P) {
            Iterator it = m3460r().iterator();
            while (it.hasNext()) {
                ((AbstractC0721i0) it.next()).m3361j();
            }
        } else if (!this.f2918m.isEmpty()) {
            for (Fragment fragment : this.f2918m.keySet()) {
                m3455n(fragment);
                m3497Q0(fragment);
            }
        }
    }

    /* renamed from: X0 */
    private boolean m3439X0(String str, int i10, int i11) {
        m3510a0(false);
        m3440Z(true);
        Fragment fragment = this.f2926u;
        if (fragment != null && i10 < 0 && str == null && fragment.m3093I6().m3507W0()) {
            return true;
        }
        boolean m3509Y0 = m3509Y0(this.f2900I, this.f2901J, str, i10, i11);
        if (m3509Y0) {
            this.f2907b = true;
            try {
                m3449e1(this.f2900I, this.f2901J);
            } finally {
                m3459q();
            }
        }
        m3465u1();
        m3437V();
        this.f2908c.m3615b();
        return m3509Y0;
    }

    /* renamed from: Z */
    private void m3440Z(boolean z10) {
        if (!this.f2907b) {
            if (this.f2923r == null) {
                if (this.f2898G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f2923r.m3413g().getLooper()) {
                if (!z10) {
                    m3456p();
                }
                if (this.f2900I == null) {
                    this.f2900I = new ArrayList();
                    this.f2901J = new ArrayList();
                }
                this.f2907b = true;
                try {
                    m3448e0(null, null);
                    return;
                } finally {
                    this.f2907b = false;
                }
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: Z0 */
    private int m3441Z0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11, C5304b c5304b) {
        boolean z10;
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            C0704a c0704a = (C0704a) arrayList.get(i13);
            boolean booleanValue = ((Boolean) arrayList2.get(i13)).booleanValue();
            if (c0704a.m3222G() && !c0704a.m3221E(arrayList, i13 + 1, i11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f2903L == null) {
                    this.f2903L = new ArrayList();
                }
                p pVar = new p(c0704a, booleanValue);
                this.f2903L.add(pVar);
                c0704a.m3224I(pVar);
                if (booleanValue) {
                    c0704a.m3242z();
                } else {
                    c0704a.m3217A(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, c0704a);
                }
                m3446d(c5304b);
            }
        }
        return i12;
    }

    /* renamed from: c0 */
    private static void m3445c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C0704a c0704a = (C0704a) arrayList.get(i10);
            boolean z10 = true;
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c0704a.m3238v(-1);
                if (i10 != i11 - 1) {
                    z10 = false;
                }
                c0704a.m3217A(z10);
            } else {
                c0704a.m3238v(1);
                c0704a.m3242z();
            }
            i10++;
        }
    }

    /* renamed from: d */
    private void m3446d(C5304b c5304b) {
        int i10 = this.f2922q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment.f2638a < min) {
                m3499R0(fragment, min);
                if (fragment.f2625H != null && !fragment.f2669z && fragment.f2630M) {
                    c5304b.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3447d0(java.util.ArrayList r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0729o.m3447d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: e0 */
    private void m3448e0(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.f2903L;
        if (arrayList3 == null) {
            size = 0;
        } else {
            size = arrayList3.size();
        }
        int i10 = 0;
        while (i10 < size) {
            p pVar = (p) this.f2903L.get(i10);
            if (arrayList != null && !pVar.f2952a && (indexOf2 = arrayList.indexOf(pVar.f2953b)) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                this.f2903L.remove(i10);
                i10--;
                size--;
                pVar.m3568c();
            } else if (pVar.m3570e() || (arrayList != null && pVar.f2953b.m3221E(arrayList, 0, arrayList.size()))) {
                this.f2903L.remove(i10);
                i10--;
                size--;
                if (arrayList != null && !pVar.f2952a && (indexOf = arrayList.indexOf(pVar.f2953b)) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    pVar.m3568c();
                } else {
                    pVar.m3569d();
                }
            }
            i10++;
        }
    }

    /* renamed from: e1 */
    private void m3449e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            m3448e0(arrayList, arrayList2);
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!((C0704a) arrayList.get(i10)).f3017r) {
                    if (i11 != i10) {
                        m3447d0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C0704a) arrayList.get(i11)).f3017r) {
                            i11++;
                        }
                    }
                    m3447d0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                m3447d0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: g1 */
    private void m3450g1() {
        ArrayList arrayList = this.f2917l;
        if (arrayList != null && arrayList.size() > 0) {
            AbstractC0272b.m941a(this.f2917l.get(0));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public static int m3451i1(int i10) {
        if (i10 == 4097) {
            return C3395q.a.f14875s;
        }
        if (i10 == 4099) {
            return C3395q.a.f14859c;
        }
        if (i10 != 8194) {
            return 0;
        }
        return C3395q.a.f14857a;
    }

    /* renamed from: j0 */
    private void m3452j0() {
        if (f2891P) {
            Iterator it = m3460r().iterator();
            while (it.hasNext()) {
                ((AbstractC0721i0) it.next()).m3362k();
            }
        } else if (this.f2903L != null) {
            while (!this.f2903L.isEmpty()) {
                ((p) this.f2903L.remove(0)).m3569d();
            }
        }
    }

    /* renamed from: k0 */
    private boolean m3453k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2906a) {
            if (this.f2906a.isEmpty()) {
                return false;
            }
            int size = this.f2906a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= ((n) this.f2906a.get(i10)).mo3226a(arrayList, arrayList2);
            }
            this.f2906a.clear();
            this.f2923r.m3413g().removeCallbacks(this.f2905N);
            return z10;
        }
    }

    /* renamed from: m0 */
    private C0732r m3454m0(Fragment fragment) {
        return this.f2904M.m3578h(fragment);
    }

    /* renamed from: n */
    private void m3455n(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f2918m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C6871b) it.next()).m26779a();
            }
            hashSet.clear();
            m3466w(fragment);
            this.f2918m.remove(fragment);
        }
    }

    /* renamed from: p */
    private void m3456p() {
        if (!m3487K0()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: p0 */
    private ViewGroup m3457p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2624G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2667x > 0 && this.f2924s.mo3210d()) {
            View mo3209c = this.f2924s.mo3209c(fragment.f2667x);
            if (mo3209c instanceof ViewGroup) {
                return (ViewGroup) mo3209c;
            }
        }
        return null;
    }

    /* renamed from: p1 */
    private void m3458p1(Fragment fragment) {
        ViewGroup m3457p0 = m3457p0(fragment);
        if (m3457p0 != null && fragment.m3099K6() + fragment.m3108N6() + fragment.m3142Z6() + fragment.m3145a7() > 0) {
            int i10 = R$id.visible_removing_fragment_view_tag;
            if (m3457p0.getTag(i10) == null) {
                m3457p0.setTag(i10, fragment);
            }
            ((Fragment) m3457p0.getTag(i10)).m3153c9(fragment.m3139Y6());
        }
    }

    /* renamed from: q */
    private void m3459q() {
        this.f2907b = false;
        this.f2901J.clear();
        this.f2900I.clear();
    }

    /* renamed from: r */
    private Set m3460r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2908c.m3624k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0736v) it.next()).m3603k().f2624G;
            if (viewGroup != null) {
                hashSet.add(AbstractC0721i0.m3354o(viewGroup, m3555y0()));
            }
        }
        return hashSet;
    }

    /* renamed from: r1 */
    private void m3461r1() {
        Iterator it = this.f2908c.m3624k().iterator();
        while (it.hasNext()) {
            m3504U0((C0736v) it.next());
        }
    }

    /* renamed from: s */
    private Set m3462s(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C0704a) arrayList.get(i10)).f3002c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((AbstractC0738x.a) it.next()).f3020b;
                if (fragment != null && (viewGroup = fragment.f2624G) != null) {
                    hashSet.add(AbstractC0721i0.m3353n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: s1 */
    private void m3463s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0719h0("FragmentManager"));
        AbstractC0726l abstractC0726l = this.f2923r;
        if (abstractC0726l != null) {
            try {
                abstractC0726l.mo3300h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            m3506W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    /* renamed from: u */
    private void m3464u(Fragment fragment) {
        int i10;
        Animator animator;
        if (fragment.f2625H != null) {
            AbstractC0714f.d m3327c = AbstractC0714f.m3327c(this.f2923r.m3412f(), fragment, !fragment.f2669z, fragment.m3139Y6());
            if (m3327c != null && (animator = m3327c.f2819b) != null) {
                animator.setTarget(fragment.f2625H);
                if (fragment.f2669z) {
                    if (fragment.m3196v7()) {
                        fragment.m3138X8(false);
                    } else {
                        ViewGroup viewGroup = fragment.f2624G;
                        View view = fragment.f2625H;
                        viewGroup.startViewTransition(view);
                        m3327c.f2819b.addListener(new h(viewGroup, view, fragment));
                    }
                } else {
                    fragment.f2625H.setVisibility(0);
                }
                m3327c.f2819b.start();
            } else {
                if (m3327c != null) {
                    fragment.f2625H.startAnimation(m3327c.f2818a);
                    m3327c.f2818a.start();
                }
                if (fragment.f2669z && !fragment.m3196v7()) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                fragment.f2625H.setVisibility(i10);
                if (fragment.m3196v7()) {
                    fragment.m3138X8(false);
                }
            }
        }
        m3475D0(fragment);
        fragment.f2631N = false;
        fragment.mo3131V7(fragment.f2669z);
    }

    /* renamed from: u1 */
    private void m3465u1() {
        synchronized (this.f2906a) {
            boolean z10 = true;
            if (!this.f2906a.isEmpty()) {
                this.f2913h.m965f(true);
                return;
            }
            AbstractC0284b abstractC0284b = this.f2913h;
            if (m3532l0() <= 0 || !m3483I0(this.f2925t)) {
                z10 = false;
            }
            abstractC0284b.m965f(z10);
        }
    }

    /* renamed from: w */
    private void m3466w(Fragment fragment) {
        fragment.m3195u8();
        this.f2920o.m3429n(fragment, false);
        fragment.f2624G = null;
        fragment.f2625H = null;
        fragment.f2637Z = null;
        fragment.f2645g0.mo3684i(null);
        fragment.f2658o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public static Fragment m3467z0(View view) {
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m3468A(Configuration configuration) {
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3185o8(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public C0763q m3469A0(Fragment fragment) {
        return this.f2904M.m3580k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m3470B(MenuItem menuItem) {
        if (this.f2922q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null && fragment.m3186p8(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B0 */
    void m3471B0() {
        m3510a0(true);
        if (this.f2913h.m962c()) {
            m3507W0();
        } else {
            this.f2912g.m959c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m3472C() {
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        m3436S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void m3473C0(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2669z) {
            fragment.f2669z = true;
            fragment.f2631N = true ^ fragment.f2631N;
            m3458p1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m3474D(Menu menu, MenuInflater menuInflater) {
        if (this.f2922q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null && m3481H0(fragment) && fragment.m3189r8(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f2910e != null) {
            for (int i10 = 0; i10 < this.f2910e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f2910e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m3120R7();
                }
            }
        }
        this.f2910e = arrayList;
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void m3475D0(Fragment fragment) {
        if (fragment.f2654l && m3433G0(fragment)) {
            this.f2895D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m3476E() {
        this.f2898G = true;
        m3510a0(true);
        m3438X();
        m3436S(-1);
        this.f2923r = null;
        this.f2924s = null;
        this.f2925t = null;
        if (this.f2912g != null) {
            this.f2913h.m963d();
            this.f2912g = null;
        }
        AbstractC0288c abstractC0288c = this.f2931z;
        if (abstractC0288c != null) {
            abstractC0288c.mo974c();
            this.f2892A.mo974c();
            this.f2893B.mo974c();
        }
    }

    /* renamed from: E0 */
    public boolean m3477E0() {
        return this.f2898G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m3478F() {
        m3436S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m3479G() {
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3202x8();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m3480H(boolean z10) {
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3205y8(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean m3481H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.m3201x7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m3482I(Fragment fragment) {
        Iterator it = this.f2921p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0733s) it.next()).mo3299a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean m3483I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC0729o abstractC0729o = fragment.f2662s;
        if (fragment.equals(abstractC0729o.m3553x0()) && m3483I0(abstractC0729o.f2925t)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m3484J(MenuItem menuItem) {
        if (this.f2922q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null && fragment.m3208z8(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean m3485J0(int i10) {
        if (this.f2922q >= i10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m3486K(Menu menu) {
        if (this.f2922q < 1) {
            return;
        }
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3071A8(menu);
            }
        }
    }

    /* renamed from: K0 */
    public boolean m3487K0() {
        if (!this.f2896E && !this.f2897F) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void m3488L0(Fragment fragment, String[] strArr, int i10) {
        if (this.f2893B != null) {
            this.f2894C.addLast(new m(fragment.f2643f, i10));
            this.f2893B.m972a(strArr);
            return;
        }
        this.f2923r.m3414k(fragment, strArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m3489M() {
        m3436S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void m3490M0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f2931z != null) {
            this.f2894C.addLast(new m(fragment.f2643f, i10));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f2931z.m972a(intent);
            return;
        }
        this.f2923r.m3415n(fragment, intent, i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m3491N(boolean z10) {
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3077C8(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m3492O(Menu menu) {
        boolean z10 = false;
        if (this.f2922q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null && m3481H0(fragment) && fragment.m3080D8(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m3493O0(Fragment fragment) {
        if (!this.f2908c.m3616c(fragment.f2643f)) {
            if (m3432F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2922q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m3497Q0(fragment);
        View view = fragment.f2625H;
        if (view != null && fragment.f2630M && fragment.f2624G != null) {
            float f10 = fragment.f2632O;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.f2632O = 0.0f;
            fragment.f2630M = false;
            AbstractC0714f.d m3327c = AbstractC0714f.m3327c(this.f2923r.m3412f(), fragment, true, fragment.m3139Y6());
            if (m3327c != null) {
                Animation animation = m3327c.f2818a;
                if (animation != null) {
                    fragment.f2625H.startAnimation(animation);
                } else {
                    m3327c.f2819b.setTarget(fragment.f2625H);
                    m3327c.f2819b.start();
                }
            }
        }
        if (fragment.f2631N) {
            m3464u(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m3494P() {
        m3465u1();
        m3434L(this.f2926u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m3495P0(int i10, boolean z10) {
        boolean z11;
        AbstractC0726l abstractC0726l;
        if (this.f2923r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.f2922q) {
            return;
        }
        this.f2922q = i10;
        if (f2891P) {
            this.f2908c.m3631r();
        } else {
            Iterator it = this.f2908c.m3627n().iterator();
            while (it.hasNext()) {
                m3493O0((Fragment) it.next());
            }
            for (C0736v c0736v : this.f2908c.m3624k()) {
                Fragment m3603k = c0736v.m3603k();
                if (!m3603k.f2630M) {
                    m3493O0(m3603k);
                }
                if (m3603k.f2656m && !m3603k.m3198w7()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f2908c.m3630q(c0736v);
                }
            }
        }
        m3461r1();
        if (this.f2895D && (abstractC0726l = this.f2923r) != null && this.f2922q == 7) {
            abstractC0726l.mo3305o();
            this.f2895D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m3496Q() {
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        m3436S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void m3497Q0(Fragment fragment) {
        m3499R0(fragment, this.f2922q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m3498R() {
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        m3436S(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3499R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0729o.m3499R0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m3500S0() {
        if (this.f2923r == null) {
            return;
        }
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        for (Fragment fragment : this.f2908c.m3627n()) {
            if (fragment != null) {
                fragment.m3082E7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m3501T() {
        this.f2897F = true;
        this.f2904M.m3583n(true);
        m3436S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m3502T0(C0720i c0720i) {
        View view;
        for (C0736v c0736v : this.f2908c.m3624k()) {
            Fragment m3603k = c0736v.m3603k();
            if (m3603k.f2667x == c0720i.getId() && (view = m3603k.f2625H) != null && view.getParent() == null) {
                m3603k.f2624G = c0720i;
                c0736v.m3594b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m3503U() {
        m3436S(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m3504U0(C0736v c0736v) {
        Fragment m3603k = c0736v.m3603k();
        if (m3603k.f2626I) {
            if (this.f2907b) {
                this.f2899H = true;
                return;
            }
            m3603k.f2626I = false;
            if (f2891P) {
                c0736v.m3604m();
            } else {
                m3497Q0(m3603k);
            }
        }
    }

    /* renamed from: V0 */
    public void m3505V0(int i10, int i11) {
        if (i10 >= 0) {
            m3508Y(new o(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: W */
    public void m3506W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2908c.m3618e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f2910e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f2910e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f2909d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C0704a c0704a = (C0704a) this.f2909d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0704a.toString());
                c0704a.m3240x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2914i.get());
        synchronized (this.f2906a) {
            int size3 = this.f2906a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    n nVar = (n) this.f2906a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(nVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2923r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2924s);
        if (this.f2925t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2925t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2922q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2896E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2897F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2898G);
        if (this.f2895D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2895D);
        }
    }

    /* renamed from: W0 */
    public boolean m3507W0() {
        return m3439X0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m3508Y(n nVar, boolean z10) {
        if (!z10) {
            if (this.f2923r == null) {
                if (this.f2898G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m3456p();
        }
        synchronized (this.f2906a) {
            if (this.f2923r == null) {
                if (z10) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2906a.add(nVar);
                m3533l1();
            }
        }
    }

    /* renamed from: Y0 */
    boolean m3509Y0(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList arrayList3 = this.f2909d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2909d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str == null && i10 < 0) {
                i12 = -1;
            } else {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0704a c0704a = (C0704a) this.f2909d.get(size2);
                    if ((str != null && str.equals(c0704a.m3219C())) || (i10 >= 0 && i10 == c0704a.f2705v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0704a c0704a2 = (C0704a) this.f2909d.get(size2);
                        if (str == null || !str.equals(c0704a2.m3219C())) {
                            if (i10 < 0 || i10 != c0704a2.f2705v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            }
            if (i12 == this.f2909d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2909d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2909d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean m3510a0(boolean z10) {
        m3440Z(z10);
        boolean z11 = false;
        while (m3453k0(this.f2900I, this.f2901J)) {
            z11 = true;
            this.f2907b = true;
            try {
                m3449e1(this.f2900I, this.f2901J);
            } finally {
                m3459q();
            }
        }
        m3465u1();
        m3437V();
        this.f2908c.m3615b();
        return z11;
    }

    /* renamed from: a1 */
    public void m3511a1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f2662s != this) {
            m3463s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f2643f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m3512b0(n nVar, boolean z10) {
        if (z10 && (this.f2923r == null || this.f2898G)) {
            return;
        }
        m3440Z(z10);
        if (nVar.mo3226a(this.f2900I, this.f2901J)) {
            this.f2907b = true;
            try {
                m3449e1(this.f2900I, this.f2901J);
            } finally {
                m3459q();
            }
        }
        m3465u1();
        m3437V();
        this.f2908c.m3615b();
    }

    /* renamed from: b1 */
    public void m3513b1(l lVar, boolean z10) {
        this.f2920o.m3430o(lVar, z10);
    }

    /* renamed from: c1 */
    void m3514c1(Fragment fragment, C6871b c6871b) {
        HashSet hashSet = (HashSet) this.f2918m.get(fragment);
        if (hashSet != null && hashSet.remove(c6871b) && hashSet.isEmpty()) {
            this.f2918m.remove(fragment);
            if (fragment.f2638a < 5) {
                m3466w(fragment);
                m3497Q0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void m3515d1(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2661r);
        }
        boolean z10 = !fragment.m3198w7();
        if (!fragment.f2618A || z10) {
            this.f2908c.m3632s(fragment);
            if (m3433G0(fragment)) {
                this.f2895D = true;
            }
            fragment.f2656m = true;
            m3458p1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3516e(C0704a c0704a) {
        if (this.f2909d == null) {
            this.f2909d = new ArrayList();
        }
        this.f2909d.add(c0704a);
    }

    /* renamed from: f */
    void m3517f(Fragment fragment, C6871b c6871b) {
        if (this.f2918m.get(fragment) == null) {
            this.f2918m.put(fragment, new HashSet());
        }
        ((HashSet) this.f2918m.get(fragment)).add(c6871b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Fragment m3518f0(String str) {
        return this.f2908c.m3619f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void m3519f1(Fragment fragment) {
        this.f2904M.m3582m(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0736v m3520g(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0736v m3549v = m3549v(fragment);
        fragment.f2662s = this;
        this.f2908c.m3629p(m3549v);
        if (!fragment.f2618A) {
            this.f2908c.m3614a(fragment);
            fragment.f2656m = false;
            if (fragment.f2625H == null) {
                fragment.f2631N = false;
            }
            if (m3433G0(fragment)) {
                this.f2895D = true;
            }
        }
        return m3549v;
    }

    /* renamed from: g0 */
    public Fragment m3521g0(int i10) {
        return this.f2908c.m3620g(i10);
    }

    /* renamed from: h */
    public void m3522h(InterfaceC0733s interfaceC0733s) {
        this.f2921p.add(interfaceC0733s);
    }

    /* renamed from: h0 */
    public Fragment m3523h0(String str) {
        return this.f2908c.m3621h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void m3524h1(Parcelable parcelable) {
        C0736v c0736v;
        if (parcelable == null) {
            return;
        }
        C0731q c0731q = (C0731q) parcelable;
        if (c0731q.f2955a == null) {
            return;
        }
        this.f2908c.m3633t();
        Iterator it = c0731q.f2955a.iterator();
        while (it.hasNext()) {
            C0735u c0735u = (C0735u) it.next();
            if (c0735u != null) {
                Fragment m3577g = this.f2904M.m3577g(c0735u.f2977b);
                if (m3577g != null) {
                    if (m3432F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m3577g);
                    }
                    c0736v = new C0736v(this.f2920o, this.f2908c, m3577g, c0735u);
                } else {
                    c0736v = new C0736v(this.f2920o, this.f2908c, this.f2923r.m3412f().getClassLoader(), m3541q0(), c0735u);
                }
                Fragment m3603k = c0736v.m3603k();
                m3603k.f2662s = this;
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m3603k.f2643f + "): " + m3603k);
                }
                c0736v.m3606o(this.f2923r.m3412f().getClassLoader());
                this.f2908c.m3629p(c0736v);
                c0736v.m3611u(this.f2922q);
            }
        }
        for (Fragment fragment : this.f2904M.m3579j()) {
            if (!this.f2908c.m3616c(fragment.f2643f)) {
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c0731q.f2955a);
                }
                this.f2904M.m3582m(fragment);
                fragment.f2662s = this;
                C0736v c0736v2 = new C0736v(this.f2920o, this.f2908c, fragment);
                c0736v2.m3611u(1);
                c0736v2.m3604m();
                fragment.f2656m = true;
                c0736v2.m3604m();
            }
        }
        this.f2908c.m3634u(c0731q.f2956b);
        if (c0731q.f2957c != null) {
            this.f2909d = new ArrayList(c0731q.f2957c.length);
            int i10 = 0;
            while (true) {
                C0706b[] c0706bArr = c0731q.f2957c;
                if (i10 >= c0706bArr.length) {
                    break;
                }
                C0704a m3244a = c0706bArr[i10].m3244a(this);
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + m3244a.f2705v + "): " + m3244a);
                    PrintWriter printWriter = new PrintWriter(new C0719h0("FragmentManager"));
                    m3244a.m3241y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2909d.add(m3244a);
                i10++;
            }
        } else {
            this.f2909d = null;
        }
        this.f2914i.set(c0731q.f2958d);
        String str = c0731q.f2959e;
        if (str != null) {
            Fragment m3518f0 = m3518f0(str);
            this.f2926u = m3518f0;
            m3434L(m3518f0);
        }
        ArrayList arrayList = c0731q.f2960f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = (Bundle) c0731q.f2961g.get(i11);
                bundle.setClassLoader(this.f2923r.m3412f().getClassLoader());
                this.f2915j.put(arrayList.get(i11), bundle);
            }
        }
        this.f2894C = new ArrayDeque(c0731q.f2962h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m3525i(Fragment fragment) {
        this.f2904M.m3575e(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Fragment m3526i0(String str) {
        return this.f2908c.m3622i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m3527j() {
        return this.f2914i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public Parcelable m3528j1() {
        int size;
        m3452j0();
        m3438X();
        m3510a0(true);
        this.f2896E = true;
        this.f2904M.m3583n(true);
        ArrayList m3635v = this.f2908c.m3635v();
        C0706b[] c0706bArr = null;
        if (m3635v.isEmpty()) {
            if (m3432F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList m3636w = this.f2908c.m3636w();
        ArrayList arrayList = this.f2909d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0706bArr = new C0706b[size];
            for (int i10 = 0; i10 < size; i10++) {
                c0706bArr[i10] = new C0706b((C0704a) this.f2909d.get(i10));
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2909d.get(i10));
                }
            }
        }
        C0731q c0731q = new C0731q();
        c0731q.f2955a = m3635v;
        c0731q.f2956b = m3636w;
        c0731q.f2957c = c0706bArr;
        c0731q.f2958d = this.f2914i.get();
        Fragment fragment = this.f2926u;
        if (fragment != null) {
            c0731q.f2959e = fragment.f2643f;
        }
        c0731q.f2960f.addAll(this.f2915j.keySet());
        c0731q.f2961g.addAll(this.f2915j.values());
        c0731q.f2962h = new ArrayList(this.f2894C);
        return c0731q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public void m3529k(AbstractC0726l abstractC0726l, AbstractC0716g abstractC0716g, Fragment fragment) {
        String str;
        if (this.f2923r == null) {
            this.f2923r = abstractC0726l;
            this.f2924s = abstractC0716g;
            this.f2925t = fragment;
            if (fragment != null) {
                m3522h(new i(fragment));
            } else if (abstractC0726l instanceof InterfaceC0733s) {
                m3522h((InterfaceC0733s) abstractC0726l);
            }
            if (this.f2925t != null) {
                m3465u1();
            }
            if (abstractC0726l instanceof InterfaceC0285c) {
                InterfaceC0285c interfaceC0285c = (InterfaceC0285c) abstractC0726l;
                OnBackPressedDispatcher mo946B0 = interfaceC0285c.mo946B0();
                this.f2912g = mo946B0;
                InterfaceC0752f interfaceC0752f = interfaceC0285c;
                if (fragment != null) {
                    interfaceC0752f = fragment;
                }
                mo946B0.m957a(interfaceC0752f, this.f2913h);
            }
            if (fragment != null) {
                this.f2904M = fragment.f2662s.m3454m0(fragment);
            } else if (abstractC0726l instanceof InterfaceC0764r) {
                this.f2904M = C0732r.m3573i(((InterfaceC0764r) abstractC0726l).mo951b3());
            } else {
                this.f2904M = new C0732r(false);
            }
            this.f2904M.m3583n(m3487K0());
            this.f2908c.m3637x(this.f2904M);
            Object obj = this.f2923r;
            if (obj instanceof InterfaceC0290e) {
                AbstractC0289d mo948J1 = ((InterfaceC0290e) obj).mo948J1();
                if (fragment != null) {
                    str = fragment.f2643f + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f2931z = mo948J1.m983i(str2 + "StartActivityForResult", new C3916c(), new j());
                this.f2892A = mo948J1.m983i(str2 + "StartIntentSenderForResult", new k(), new a());
                this.f2893B = mo948J1.m983i(str2 + "RequestPermissions", new C3915b(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: k1 */
    public Fragment.C0703h m3530k1(Fragment fragment) {
        C0736v m3626m = this.f2908c.m3626m(fragment.f2643f);
        if (m3626m == null || !m3626m.m3603k().equals(fragment)) {
            m3463s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m3626m.m3608r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m3531l(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2618A) {
            fragment.f2618A = false;
            if (!fragment.f2654l) {
                this.f2908c.m3614a(fragment);
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3433G0(fragment)) {
                    this.f2895D = true;
                }
            }
        }
    }

    /* renamed from: l0 */
    public int m3532l0() {
        ArrayList arrayList = this.f2909d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: l1 */
    void m3533l1() {
        boolean z10;
        synchronized (this.f2906a) {
            ArrayList arrayList = this.f2903L;
            boolean z11 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f2906a.size() == 1) {
                z11 = true;
            }
            if (z10 || z11) {
                this.f2923r.m3413g().removeCallbacks(this.f2905N);
                this.f2923r.m3413g().post(this.f2905N);
                m3465u1();
            }
        }
    }

    /* renamed from: m */
    public AbstractC0738x m3534m() {
        return new C0704a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m3535m1(Fragment fragment, boolean z10) {
        ViewGroup m3457p0 = m3457p0(fragment);
        if (m3457p0 != null && (m3457p0 instanceof C0720i)) {
            ((C0720i) m3457p0).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public AbstractC0716g m3536n0() {
        return this.f2924s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m3537n1(Fragment fragment, AbstractC0749c.c cVar) {
        if (fragment.equals(m3518f0(fragment.f2643f)) && (fragment.f2663t == null || fragment.f2662s == this)) {
            fragment.f2635X = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    boolean m3538o() {
        boolean z10 = false;
        for (Fragment fragment : this.f2908c.m3625l()) {
            if (fragment != null) {
                z10 = m3433G0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public Fragment m3539o0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m3518f0 = m3518f0(string);
        if (m3518f0 == null) {
            m3463s1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m3518f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m3540o1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m3518f0(fragment.f2643f)) || (fragment.f2663t != null && fragment.f2662s != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f2926u;
        this.f2926u = fragment;
        m3434L(fragment2);
        m3434L(this.f2926u);
    }

    /* renamed from: q0 */
    public AbstractC0724k m3541q0() {
        AbstractC0724k abstractC0724k = this.f2927v;
        if (abstractC0724k != null) {
            return abstractC0724k;
        }
        Fragment fragment = this.f2925t;
        if (fragment != null) {
            return fragment.f2662s.m3541q0();
        }
        return this.f2928w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m3542q1(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2669z) {
            fragment.f2669z = false;
            fragment.f2631N = !fragment.f2631N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C0737w m3543r0() {
        return this.f2908c;
    }

    /* renamed from: s0 */
    public List m3544s0() {
        return this.f2908c.m3627n();
    }

    /* renamed from: t */
    void m3545t(C0704a c0704a, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            c0704a.m3217A(z12);
        } else {
            c0704a.m3242z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0704a);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2922q >= 1) {
            AbstractC0739y.m3648B(this.f2923r.m3412f(), this.f2924s, arrayList, arrayList2, 0, 1, true, this.f2919n);
        }
        if (z12) {
            m3495P0(this.f2922q, true);
        }
        for (Fragment fragment : this.f2908c.m3625l()) {
            if (fragment != null && fragment.f2625H != null && fragment.f2630M && c0704a.m3220D(fragment.f2667x)) {
                float f10 = fragment.f2632O;
                if (f10 > 0.0f) {
                    fragment.f2625H.setAlpha(f10);
                }
                if (z12) {
                    fragment.f2632O = 0.0f;
                } else {
                    fragment.f2632O = -1.0f;
                    fragment.f2630M = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public AbstractC0726l m3546t0() {
        return this.f2923r;
    }

    /* renamed from: t1 */
    public void m3547t1(l lVar) {
        this.f2920o.m3431p(lVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2925t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2925t)));
            sb2.append("}");
        } else {
            AbstractC0726l abstractC0726l = this.f2923r;
            if (abstractC0726l != null) {
                sb2.append(abstractC0726l.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2923r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public LayoutInflater.Factory2 m3548u0() {
        return this.f2911f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C0736v m3549v(Fragment fragment) {
        C0736v m3626m = this.f2908c.m3626m(fragment.f2643f);
        if (m3626m != null) {
            return m3626m;
        }
        C0736v c0736v = new C0736v(this.f2920o, this.f2908c, fragment);
        c0736v.m3606o(this.f2923r.m3412f().getClassLoader());
        c0736v.m3611u(this.f2922q);
        return c0736v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C0728n m3550v0() {
        return this.f2920o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public Fragment m3551w0() {
        return this.f2925t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m3552x(Fragment fragment) {
        if (m3432F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2618A) {
            fragment.f2618A = true;
            if (fragment.f2654l) {
                if (m3432F0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f2908c.m3632s(fragment);
                if (m3433G0(fragment)) {
                    this.f2895D = true;
                }
                m3458p1(fragment);
            }
        }
    }

    /* renamed from: x0 */
    public Fragment m3553x0() {
        return this.f2926u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m3554y() {
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        m3436S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public InterfaceC0723j0 m3555y0() {
        InterfaceC0723j0 interfaceC0723j0 = this.f2929x;
        if (interfaceC0723j0 != null) {
            return interfaceC0723j0;
        }
        Fragment fragment = this.f2925t;
        if (fragment != null) {
            return fragment.f2662s.m3555y0();
        }
        return this.f2930y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m3556z() {
        this.f2896E = false;
        this.f2897F = false;
        this.f2904M.m3583n(false);
        m3436S(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$m */
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a */
        String f2946a;

        /* renamed from: b */
        int f2947b;

        /* renamed from: androidx.fragment.app.o$m$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f2946a = str;
            this.f2947b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2946a);
            parcel.writeInt(this.f2947b);
        }

        m(Parcel parcel) {
            this.f2946a = parcel.readString();
            this.f2947b = parcel.readInt();
        }
    }
}
