package p203k4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p214l.C5303a;
import p394x4.HandlerC7497e;

/* renamed from: k4.b0 */
/* loaded from: classes.dex */
public final class C5105b0 extends Fragment implements InterfaceC5108e {

    /* renamed from: r0 */
    private static final WeakHashMap f21034r0 = new WeakHashMap();

    /* renamed from: o0 */
    private final Map f21035o0 = Collections.synchronizedMap(new C5303a());

    /* renamed from: p0 */
    private int f21036p0 = 0;

    /* renamed from: q0 */
    private Bundle f21037q0;

    /* renamed from: n9 */
    public static C5105b0 m20746n9(AbstractActivityC0712e abstractActivityC0712e) {
        C5105b0 c5105b0;
        WeakHashMap weakHashMap = f21034r0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC0712e);
        if (weakReference != null && (c5105b0 = (C5105b0) weakReference.get()) != null) {
            return c5105b0;
        }
        try {
            C5105b0 c5105b02 = (C5105b0) abstractActivityC0712e.m3294d4().m3523h0("SupportLifecycleFragmentImpl");
            if (c5105b02 == null || c5105b02.m3207z7()) {
                c5105b02 = new C5105b0();
                abstractActivityC0712e.m3294d4().m3534m().m3640d(c5105b02, "SupportLifecycleFragmentImpl").mo3228h();
            }
            weakHashMap.put(abstractActivityC0712e, new WeakReference(c5105b02));
            return c5105b02;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: G7 */
    public final void mo3088G7(int i10, int i11, Intent intent) {
        super.mo3088G7(i10, i11, intent);
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7921e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public final void mo3103L7(Bundle bundle) {
        Bundle bundle2;
        super.mo3103L7(bundle);
        this.f21036p0 = 1;
        this.f21037q0 = bundle;
        for (Map.Entry entry : this.f21035o0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7922f(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public final void mo3118Q7() {
        super.mo3118Q7();
        this.f21036p0 = 5;
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7923g();
        }
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: Z0 */
    public final void mo20747Z0(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f21035o0.containsKey(str)) {
            this.f21035o0.put(str, lifecycleCallback);
            if (this.f21036p0 > 0) {
                new HandlerC7497e(Looper.getMainLooper()).post(new RunnableC5103a0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: d3 */
    public final LifecycleCallback mo20748d3(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f21035o0.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public final void mo3164g8() {
        super.mo3164g8();
        this.f21036p0 = 3;
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7924h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h8 */
    public final void mo3167h8(Bundle bundle) {
        super.mo3167h8(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f21035o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7925i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public final void mo3170i8() {
        super.mo3170i8();
        this.f21036p0 = 2;
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7926j();
        }
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: j3 */
    public final /* synthetic */ Activity mo20749j3() {
        return m3075C6();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public final void mo3173j8() {
        super.mo3173j8();
        this.f21036p0 = 4;
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7927k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z6 */
    public final void mo3206z6(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3206z6(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f21035o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7919a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
