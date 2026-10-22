package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.AbstractC0547a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p373w.AbstractC7342g;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public abstract class AbstractC0726l extends AbstractC0716g {

    /* renamed from: a */
    private final Activity f2878a;

    /* renamed from: b */
    private final Context f2879b;

    /* renamed from: c */
    private final Handler f2880c;

    /* renamed from: d */
    private final int f2881d;

    /* renamed from: e */
    final AbstractC0729o f2882e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0726l(AbstractActivityC0712e abstractActivityC0712e) {
        this(abstractActivityC0712e, abstractActivityC0712e, new Handler(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m3411e() {
        return this.f2878a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m3412f() {
        return this.f2879b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler m3413g() {
        return this.f2880c;
    }

    /* renamed from: h */
    public abstract void mo3300h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: i */
    public abstract Object mo3301i();

    /* renamed from: j */
    public abstract LayoutInflater mo3302j();

    /* renamed from: k */
    public void m3414k(Fragment fragment, String[] strArr, int i10) {
    }

    /* renamed from: l */
    public abstract boolean mo3303l(Fragment fragment);

    /* renamed from: m */
    public abstract boolean mo3304m(String str);

    /* renamed from: n */
    public void m3415n(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            AbstractC0547a.m2329k(this.f2879b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public abstract void mo3305o();

    AbstractC0726l(Activity activity, Context context, Handler handler, int i10) {
        this.f2882e = new C0730p();
        this.f2878a = activity;
        this.f2879b = (Context) AbstractC7342g.m28328h(context, "context == null");
        this.f2880c = (Handler) AbstractC7342g.m28328h(handler, "handler == null");
        this.f2881d = i10;
    }
}
