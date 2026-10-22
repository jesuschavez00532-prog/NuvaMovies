package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0761o;
import androidx.lifecycle.C0762p;
import androidx.lifecycle.C0763q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C0732r extends AbstractC0761o {

    /* renamed from: j */
    private static final C0762p.a f2963j = new a();

    /* renamed from: f */
    private final boolean f2967f;

    /* renamed from: c */
    private final HashMap f2964c = new HashMap();

    /* renamed from: d */
    private final HashMap f2965d = new HashMap();

    /* renamed from: e */
    private final HashMap f2966e = new HashMap();

    /* renamed from: g */
    private boolean f2968g = false;

    /* renamed from: h */
    private boolean f2969h = false;

    /* renamed from: i */
    private boolean f2970i = false;

    /* renamed from: androidx.fragment.app.r$a */
    /* loaded from: classes.dex */
    class a implements C0762p.a {
        a() {
        }

        @Override // androidx.lifecycle.C0762p.a
        /* renamed from: a */
        public AbstractC0761o mo3585a(Class cls) {
            return new C0732r(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0732r(boolean z10) {
        this.f2967f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C0732r m3573i(C0763q c0763q) {
        return (C0732r) new C0762p(c0763q, f2963j).m3742a(C0732r.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0761o
    /* renamed from: d */
    public void mo3574d() {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2968g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3575e(Fragment fragment) {
        if (this.f2970i) {
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2964c.containsKey(fragment.f2643f)) {
                return;
            }
            this.f2964c.put(fragment.f2643f, fragment);
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0732r.class != obj.getClass()) {
            return false;
        }
        C0732r c0732r = (C0732r) obj;
        if (this.f2964c.equals(c0732r.f2964c) && this.f2965d.equals(c0732r.f2965d) && this.f2966e.equals(c0732r.f2966e)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3576f(Fragment fragment) {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0732r c0732r = (C0732r) this.f2965d.get(fragment.f2643f);
        if (c0732r != null) {
            c0732r.mo3574d();
            this.f2965d.remove(fragment.f2643f);
        }
        C0763q c0763q = (C0763q) this.f2966e.get(fragment.f2643f);
        if (c0763q != null) {
            c0763q.m3744a();
            this.f2966e.remove(fragment.f2643f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m3577g(String str) {
        return (Fragment) this.f2964c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0732r m3578h(Fragment fragment) {
        C0732r c0732r = (C0732r) this.f2965d.get(fragment.f2643f);
        if (c0732r == null) {
            C0732r c0732r2 = new C0732r(this.f2967f);
            this.f2965d.put(fragment.f2643f, c0732r2);
            return c0732r2;
        }
        return c0732r;
    }

    public int hashCode() {
        return (((this.f2964c.hashCode() * 31) + this.f2965d.hashCode()) * 31) + this.f2966e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection m3579j() {
        return new ArrayList(this.f2964c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C0763q m3580k(Fragment fragment) {
        C0763q c0763q = (C0763q) this.f2966e.get(fragment.f2643f);
        if (c0763q == null) {
            C0763q c0763q2 = new C0763q();
            this.f2966e.put(fragment.f2643f, c0763q2);
            return c0763q2;
        }
        return c0763q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m3581l() {
        return this.f2968g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m3582m(Fragment fragment) {
        boolean z10;
        if (this.f2970i) {
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f2964c.remove(fragment.f2643f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m3583n(boolean z10) {
        this.f2970i = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m3584o(Fragment fragment) {
        if (!this.f2964c.containsKey(fragment.f2643f)) {
            return true;
        }
        if (this.f2967f) {
            return this.f2968g;
        }
        return !this.f2969h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2964c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2965d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2966e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
