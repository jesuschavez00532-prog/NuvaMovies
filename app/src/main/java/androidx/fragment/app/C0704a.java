package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0704a extends AbstractC0738x implements AbstractC0729o.n {

    /* renamed from: t */
    final AbstractC0729o f2703t;

    /* renamed from: u */
    boolean f2704u;

    /* renamed from: v */
    int f2705v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0704a(androidx.fragment.app.AbstractC0729o r3) {
        /*
            r2 = this;
            androidx.fragment.app.k r0 = r3.m3541q0()
            androidx.fragment.app.l r1 = r3.m3546t0()
            if (r1 == 0) goto L17
            androidx.fragment.app.l r1 = r3.m3546t0()
            android.content.Context r1 = r1.m3412f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2705v = r0
            r2.f2703t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0704a.<init>(androidx.fragment.app.o):void");
    }

    /* renamed from: F */
    private static boolean m3216F(AbstractC0738x.a aVar) {
        Fragment fragment = aVar.f3020b;
        if (fragment != null && fragment.f2654l && fragment.f2625H != null && !fragment.f2618A && !fragment.f2669z && fragment.m3204y7()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m3217A(boolean z10) {
        for (int size = this.f3002c.size() - 1; size >= 0; size--) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(size);
            Fragment fragment = aVar.f3020b;
            if (fragment != null) {
                fragment.m3153c9(true);
                fragment.m3147a9(AbstractC0729o.m3451i1(this.f3007h));
                fragment.m3162f9(this.f3016q, this.f3015p);
            }
            switch (aVar.f3019a) {
                case 1:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, true);
                    this.f2703t.m3515d1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3019a);
                case 3:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3520g(fragment);
                    break;
                case 4:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3542q1(fragment);
                    break;
                case 5:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, true);
                    this.f2703t.m3473C0(fragment);
                    break;
                case 6:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3531l(fragment);
                    break;
                case 7:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, true);
                    this.f2703t.m3552x(fragment);
                    break;
                case 8:
                    this.f2703t.m3540o1(null);
                    break;
                case 9:
                    this.f2703t.m3540o1(fragment);
                    break;
                case 10:
                    this.f2703t.m3537n1(fragment, aVar.f3025g);
                    break;
            }
            if (!this.f3017r && aVar.f3019a != 3 && fragment != null && !AbstractC0729o.f2891P) {
                this.f2703t.m3493O0(fragment);
            }
        }
        if (!this.f3017r && z10 && !AbstractC0729o.f2891P) {
            AbstractC0729o abstractC0729o = this.f2703t;
            abstractC0729o.m3495P0(abstractC0729o.f2922q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public Fragment m3218B(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f3002c.size()) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(i10);
            int i11 = aVar.f3019a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                this.f3002c.add(i10, new AbstractC0738x.a(9, fragment2));
                                i10++;
                                fragment2 = aVar.f3020b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.f3020b);
                        Fragment fragment3 = aVar.f3020b;
                        if (fragment3 == fragment2) {
                            this.f3002c.add(i10, new AbstractC0738x.a(9, fragment3));
                            i10++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.f3020b;
                    int i12 = fragment4.f2667x;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.f2667x == i12) {
                            if (fragment5 == fragment4) {
                                z10 = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f3002c.add(i10, new AbstractC0738x.a(9, fragment5));
                                    i10++;
                                    fragment2 = null;
                                }
                                AbstractC0738x.a aVar2 = new AbstractC0738x.a(3, fragment5);
                                aVar2.f3021c = aVar.f3021c;
                                aVar2.f3023e = aVar.f3023e;
                                aVar2.f3022d = aVar.f3022d;
                                aVar2.f3024f = aVar.f3024f;
                                this.f3002c.add(i10, aVar2);
                                arrayList.remove(fragment5);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3002c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3019a = 1;
                        arrayList.add(fragment4);
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f3020b);
            i10++;
        }
        return fragment2;
    }

    /* renamed from: C */
    public String m3219C() {
        return this.f3010k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m3220D(int i10) {
        int i11;
        int size = this.f3002c.size();
        for (int i12 = 0; i12 < size; i12++) {
            Fragment fragment = ((AbstractC0738x.a) this.f3002c.get(i12)).f3020b;
            if (fragment != null) {
                i11 = fragment.f2667x;
            } else {
                i11 = 0;
            }
            if (i11 != 0 && i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m3221E(ArrayList arrayList, int i10, int i11) {
        int i12;
        int i13;
        if (i11 == i10) {
            return false;
        }
        int size = this.f3002c.size();
        int i14 = -1;
        for (int i15 = 0; i15 < size; i15++) {
            Fragment fragment = ((AbstractC0738x.a) this.f3002c.get(i15)).f3020b;
            if (fragment != null) {
                i12 = fragment.f2667x;
            } else {
                i12 = 0;
            }
            if (i12 != 0 && i12 != i14) {
                for (int i16 = i10; i16 < i11; i16++) {
                    C0704a c0704a = (C0704a) arrayList.get(i16);
                    int size2 = c0704a.f3002c.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        Fragment fragment2 = ((AbstractC0738x.a) c0704a.f3002c.get(i17)).f3020b;
                        if (fragment2 != null) {
                            i13 = fragment2.f2667x;
                        } else {
                            i13 = 0;
                        }
                        if (i13 == i12) {
                            return true;
                        }
                    }
                }
                i14 = i12;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m3222G() {
        for (int i10 = 0; i10 < this.f3002c.size(); i10++) {
            if (m3216F((AbstractC0738x.a) this.f3002c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public void m3223H() {
        if (this.f3018s != null) {
            for (int i10 = 0; i10 < this.f3018s.size(); i10++) {
                ((Runnable) this.f3018s.get(i10)).run();
            }
            this.f3018s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m3224I(Fragment.InterfaceC0702g interfaceC0702g) {
        for (int i10 = 0; i10 < this.f3002c.size(); i10++) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(i10);
            if (m3216F(aVar)) {
                aVar.f3020b.m3150b9(interfaceC0702g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public Fragment m3225J(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f3002c.size() - 1; size >= 0; size--) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(size);
            int i10 = aVar.f3019a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3020b;
                            break;
                        case 10:
                            aVar.f3026h = aVar.f3025g;
                            break;
                    }
                }
                arrayList.add(aVar.f3020b);
            }
            arrayList.remove(aVar.f3020b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC0729o.n
    /* renamed from: a */
    public boolean mo3226a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3008i) {
            this.f2703t.m3516e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: g */
    public int mo3227g() {
        return m3239w(false);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: h */
    public int mo3228h() {
        return m3239w(true);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: i */
    public void mo3229i() {
        m3643l();
        this.f2703t.m3512b0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: j */
    public void mo3230j() {
        m3643l();
        this.f2703t.m3512b0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: k */
    public AbstractC0738x mo3231k(Fragment fragment) {
        AbstractC0729o abstractC0729o = fragment.f2662s;
        if (abstractC0729o != null && abstractC0729o != this.f2703t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo3231k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: m */
    public void mo3232m(int i10, Fragment fragment, String str, int i11) {
        super.mo3232m(i10, fragment, str, i11);
        fragment.f2662s = this.f2703t;
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: n */
    public AbstractC0738x mo3233n(Fragment fragment) {
        AbstractC0729o abstractC0729o = fragment.f2662s;
        if (abstractC0729o != null && abstractC0729o != this.f2703t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo3233n(fragment);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: o */
    public boolean mo3234o() {
        return this.f3002c.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: p */
    public AbstractC0738x mo3235p(Fragment fragment) {
        AbstractC0729o abstractC0729o = fragment.f2662s;
        if (abstractC0729o != null && abstractC0729o != this.f2703t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo3235p(fragment);
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: s */
    public AbstractC0738x mo3236s(Fragment fragment, AbstractC0749c.c cVar) {
        if (fragment.f2662s == this.f2703t) {
            if (cVar == AbstractC0749c.c.INITIALIZED && fragment.f2638a > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            }
            if (cVar != AbstractC0749c.c.DESTROYED) {
                return super.mo3236s(fragment, cVar);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2703t);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2705v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2705v);
        }
        if (this.f3010k != null) {
            sb2.append(" ");
            sb2.append(this.f3010k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.AbstractC0738x
    /* renamed from: u */
    public AbstractC0738x mo3237u(Fragment fragment) {
        AbstractC0729o abstractC0729o = fragment.f2662s;
        if (abstractC0729o != null && abstractC0729o != this.f2703t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo3237u(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m3238v(int i10) {
        if (!this.f3008i) {
            return;
        }
        if (AbstractC0729o.m3432F0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f3002c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(i11);
            Fragment fragment = aVar.f3020b;
            if (fragment != null) {
                fragment.f2661r += i10;
                if (AbstractC0729o.m3432F0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f3020b + " to " + aVar.f3020b.f2661r);
                }
            }
        }
    }

    /* renamed from: w */
    int m3239w(boolean z10) {
        if (!this.f2704u) {
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0719h0("FragmentManager"));
                m3240x("  ", printWriter);
                printWriter.close();
            }
            this.f2704u = true;
            if (this.f3008i) {
                this.f2705v = this.f2703t.m3527j();
            } else {
                this.f2705v = -1;
            }
            this.f2703t.m3508Y(this, z10);
            return this.f2705v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: x */
    public void m3240x(String str, PrintWriter printWriter) {
        m3241y(str, printWriter, true);
    }

    /* renamed from: y */
    public void m3241y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3010k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2705v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2704u);
            if (this.f3007h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3007h));
            }
            if (this.f3003d != 0 || this.f3004e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3003d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3004e));
            }
            if (this.f3005f != 0 || this.f3006g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3005f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3006g));
            }
            if (this.f3011l != 0 || this.f3012m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3011l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3012m);
            }
            if (this.f3013n != 0 || this.f3014o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3013n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3014o);
            }
        }
        if (!this.f3002c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3002c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(i10);
                switch (aVar.f3019a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3019a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3020b);
                if (z10) {
                    if (aVar.f3021c != 0 || aVar.f3022d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3021c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3022d));
                    }
                    if (aVar.f3023e != 0 || aVar.f3024f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3023e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3024f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m3242z() {
        int size = this.f3002c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0738x.a aVar = (AbstractC0738x.a) this.f3002c.get(i10);
            Fragment fragment = aVar.f3020b;
            if (fragment != null) {
                fragment.m3153c9(false);
                fragment.m3147a9(this.f3007h);
                fragment.m3162f9(this.f3015p, this.f3016q);
            }
            switch (aVar.f3019a) {
                case 1:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, false);
                    this.f2703t.m3520g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3019a);
                case 3:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3515d1(fragment);
                    break;
                case 4:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3473C0(fragment);
                    break;
                case 5:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, false);
                    this.f2703t.m3542q1(fragment);
                    break;
                case 6:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3552x(fragment);
                    break;
                case 7:
                    fragment.m3127T8(aVar.f3021c, aVar.f3022d, aVar.f3023e, aVar.f3024f);
                    this.f2703t.m3535m1(fragment, false);
                    this.f2703t.m3531l(fragment);
                    break;
                case 8:
                    this.f2703t.m3540o1(fragment);
                    break;
                case 9:
                    this.f2703t.m3540o1(null);
                    break;
                case 10:
                    this.f2703t.m3537n1(fragment, aVar.f3026h);
                    break;
            }
            if (!this.f3017r && aVar.f3019a != 1 && fragment != null && !AbstractC0729o.f2891P) {
                this.f2703t.m3493O0(fragment);
            }
        }
        if (!this.f3017r && !AbstractC0729o.f2891P) {
            AbstractC0729o abstractC0729o = this.f2703t;
            abstractC0729o.m3495P0(abstractC0729o.f2922q, true);
        }
    }
}
