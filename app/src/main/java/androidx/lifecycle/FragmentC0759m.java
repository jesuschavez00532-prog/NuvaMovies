package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;

/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public class FragmentC0759m extends Fragment {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.m$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m3737a();

        void onCreate();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.m$b */
    /* loaded from: classes.dex */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0759m.m3731a(activity, AbstractC0749c.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static void m3731a(Activity activity, AbstractC0749c.b bVar) {
        if (activity instanceof InterfaceC0752f) {
            AbstractC0749c mo953f6 = ((InterfaceC0752f) activity).mo953f6();
            if (mo953f6 instanceof C0753g) {
                ((C0753g) mo953f6).m3720h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m3732b(AbstractC0749c.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3731a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m3733c(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: d */
    private void m3734d(a aVar) {
        if (aVar != null) {
            aVar.m3737a();
        }
    }

    /* renamed from: e */
    private void m3735e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    public static void m3736f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0759m(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3733c(null);
        m3732b(AbstractC0749c.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m3732b(AbstractC0749c.b.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m3732b(AbstractC0749c.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m3734d(null);
        m3732b(AbstractC0749c.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m3735e(null);
        m3732b(AbstractC0749c.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m3732b(AbstractC0749c.b.ON_STOP);
    }
}
