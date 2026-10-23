package p203k4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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

/* renamed from: k4.z */
/* loaded from: classes.dex */
public final class FragmentC5129z extends Fragment implements InterfaceC5108e {

    /* renamed from: d */
    private static final WeakHashMap f21061d = new WeakHashMap();

    /* renamed from: a */
    private final Map f21062a = Collections.synchronizedMap(new C5303a());

    /* renamed from: b */
    private int f21063b = 0;

    /* renamed from: c */
    private Bundle f21064c;

    /* renamed from: c */
    public static FragmentC5129z m20763c(Activity activity) {
        FragmentC5129z fragmentC5129z;
        WeakHashMap weakHashMap = f21061d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC5129z = (FragmentC5129z) weakReference.get()) != null) {
            return fragmentC5129z;
        }
        try {
            FragmentC5129z fragmentC5129z2 = (FragmentC5129z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC5129z2 == null || fragmentC5129z2.isRemoving()) {
                fragmentC5129z2 = new FragmentC5129z();
                activity.getFragmentManager().beginTransaction().add(fragmentC5129z2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC5129z2));
            return fragmentC5129z2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: Z0 */
    public final void mo20747Z0(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f21062a.containsKey(str)) {
            this.f21062a.put(str, lifecycleCallback);
            if (this.f21063b > 0) {
                new HandlerC7497e(Looper.getMainLooper()).post(new RunnableC5128y(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: d3 */
    public final LifecycleCallback mo20748d3(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f21062a.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7919a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p203k4.InterfaceC5108e
    /* renamed from: j3 */
    public final Activity mo20749j3() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7921e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = null;
        super.onCreate(bundle);
        this.f21063b = 1;
        this.f21064c = bundle;
        for (Map.Entry entry : this.f21062a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7922f(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f21063b = 5;
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7923g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f21063b = 3;
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7924h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f21062a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7925i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f21063b = 2;
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7926j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f21063b = 4;
        Iterator it = this.f21062a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7927k();
        }
    }
}
