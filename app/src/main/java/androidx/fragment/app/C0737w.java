package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public class C0737w {

    /* renamed from: a */
    private final ArrayList f2997a = new ArrayList();

    /* renamed from: b */
    private final HashMap f2998b = new HashMap();

    /* renamed from: c */
    private C0732r f2999c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3614a(Fragment fragment) {
        if (!this.f2997a.contains(fragment)) {
            synchronized (this.f2997a) {
                this.f2997a.add(fragment);
            }
            fragment.f2654l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3615b() {
        this.f2998b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3616c(String str) {
        if (this.f2998b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3617d(int i10) {
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null) {
                c0736v.m3611u(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3618e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2998b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0736v c0736v : this.f2998b.values()) {
                printWriter.print(str);
                if (c0736v != null) {
                    Fragment m3603k = c0736v.m3603k();
                    printWriter.println(m3603k);
                    m3603k.mo3206z6(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2997a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f2997a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m3619f(String str) {
        C0736v c0736v = (C0736v) this.f2998b.get(str);
        if (c0736v != null) {
            return c0736v.m3603k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m3620g(int i10) {
        for (int size = this.f2997a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2997a.get(size);
            if (fragment != null && fragment.f2666w == i10) {
                return fragment;
            }
        }
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null) {
                Fragment m3603k = c0736v.m3603k();
                if (m3603k.f2666w == i10) {
                    return m3603k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m3621h(String str) {
        if (str != null) {
            for (int size = this.f2997a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2997a.get(size);
                if (fragment != null && str.equals(fragment.f2668y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0736v c0736v : this.f2998b.values()) {
                if (c0736v != null) {
                    Fragment m3603k = c0736v.m3603k();
                    if (str.equals(m3603k.f2668y)) {
                        return m3603k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m3622i(String str) {
        Fragment m3072B6;
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null && (m3072B6 = c0736v.m3603k().m3072B6(str)) != null) {
                return m3072B6;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m3623j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f2624G;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2997a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f2997a.get(i10);
            if (fragment2.f2624G == viewGroup && (view2 = fragment2.f2625H) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2997a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f2997a.get(indexOf);
            if (fragment3.f2624G == viewGroup && (view = fragment3.f2625H) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List m3624k() {
        ArrayList arrayList = new ArrayList();
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null) {
                arrayList.add(c0736v);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List m3625l() {
        ArrayList arrayList = new ArrayList();
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null) {
                arrayList.add(c0736v.m3603k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C0736v m3626m(String str) {
        return (C0736v) this.f2998b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List m3627n() {
        ArrayList arrayList;
        if (this.f2997a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2997a) {
            arrayList = new ArrayList(this.f2997a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C0732r m3628o() {
        return this.f2999c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m3629p(C0736v c0736v) {
        Fragment m3603k = c0736v.m3603k();
        if (m3616c(m3603k.f2643f)) {
            return;
        }
        this.f2998b.put(m3603k.f2643f, c0736v);
        if (m3603k.f2620C) {
            if (m3603k.f2619B) {
                this.f2999c.m3575e(m3603k);
            } else {
                this.f2999c.m3582m(m3603k);
            }
            m3603k.f2620C = false;
        }
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m3603k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m3630q(C0736v c0736v) {
        Fragment m3603k = c0736v.m3603k();
        if (m3603k.f2619B) {
            this.f2999c.m3582m(m3603k);
        }
        if (((C0736v) this.f2998b.put(m3603k.f2643f, null)) != null && AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m3603k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m3631r() {
        boolean z10;
        Iterator it = this.f2997a.iterator();
        while (it.hasNext()) {
            C0736v c0736v = (C0736v) this.f2998b.get(((Fragment) it.next()).f2643f);
            if (c0736v != null) {
                c0736v.m3604m();
            }
        }
        for (C0736v c0736v2 : this.f2998b.values()) {
            if (c0736v2 != null) {
                c0736v2.m3604m();
                Fragment m3603k = c0736v2.m3603k();
                if (m3603k.f2656m && !m3603k.m3198w7()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    m3630q(c0736v2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m3632s(Fragment fragment) {
        synchronized (this.f2997a) {
            this.f2997a.remove(fragment);
        }
        fragment.f2654l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m3633t() {
        this.f2998b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m3634u(List list) {
        this.f2997a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment m3619f = m3619f(str);
                if (m3619f != null) {
                    if (AbstractC0729o.m3432F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m3619f);
                    }
                    m3614a(m3619f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList m3635v() {
        ArrayList arrayList = new ArrayList(this.f2998b.size());
        for (C0736v c0736v : this.f2998b.values()) {
            if (c0736v != null) {
                Fragment m3603k = c0736v.m3603k();
                C0735u m3609s = c0736v.m3609s();
                arrayList.add(m3609s);
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m3603k + ": " + m3609s.f2988m);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList m3636w() {
        synchronized (this.f2997a) {
            if (this.f2997a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f2997a.size());
            Iterator it = this.f2997a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.f2643f);
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f2643f + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m3637x(C0732r c0732r) {
        this.f2999c = c0732r;
    }
}
