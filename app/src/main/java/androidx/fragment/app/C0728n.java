package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0729o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class C0728n {

    /* renamed from: a */
    private final CopyOnWriteArrayList f2886a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final AbstractC0729o f2887b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final AbstractC0729o.l f2888a;

        /* renamed from: b */
        final boolean f2889b;

        a(AbstractC0729o.l lVar, boolean z10) {
            this.f2888a = lVar;
            this.f2889b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0728n(AbstractC0729o abstractC0729o) {
        this.f2887b = abstractC0729o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3416a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3416a(fragment, bundle, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentActivityCreated(this.f2887b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3417b(Fragment fragment, boolean z10) {
        Context m3412f = this.f2887b.m3546t0().m3412f();
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3417b(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentAttached(this.f2887b, fragment, m3412f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3418c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3418c(fragment, bundle, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentCreated(this.f2887b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3419d(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3419d(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentDestroyed(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3420e(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3420e(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentDetached(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3421f(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3421f(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentPaused(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3422g(Fragment fragment, boolean z10) {
        Context m3412f = this.f2887b.m3546t0().m3412f();
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3422g(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentPreAttached(this.f2887b, fragment, m3412f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3423h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3423h(fragment, bundle, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentPreCreated(this.f2887b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m3424i(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3424i(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentResumed(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3425j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3425j(fragment, bundle, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentSaveInstanceState(this.f2887b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m3426k(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3426k(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentStarted(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m3427l(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3427l(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentStopped(this.f2887b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m3428m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3428m(fragment, view, bundle, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentViewCreated(this.f2887b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m3429n(Fragment fragment, boolean z10) {
        Fragment m3551w0 = this.f2887b.m3551w0();
        if (m3551w0 != null) {
            m3551w0.m3136X6().m3550v0().m3429n(fragment, true);
        }
        Iterator it = this.f2886a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2889b) {
                aVar.f2888a.onFragmentViewDestroyed(this.f2887b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m3430o(AbstractC0729o.l lVar, boolean z10) {
        this.f2886a.add(new a(lVar, z10));
    }

    /* renamed from: p */
    public void m3431p(AbstractC0729o.l lVar) {
        synchronized (this.f2886a) {
            int size = this.f2886a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((a) this.f2886a.get(i10)).f2888a == lVar) {
                    this.f2886a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }
}
