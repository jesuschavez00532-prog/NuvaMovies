package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.AbstractC0547a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.c1 */
/* loaded from: classes.dex */
public final class C0500c1 implements Iterable {

    /* renamed from: a */
    private final ArrayList f2191a = new ArrayList();

    /* renamed from: b */
    private final Context f2192b;

    /* renamed from: androidx.core.app.c1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: Q1 */
        Intent mo1060Q1();
    }

    private C0500c1(Context context) {
        this.f2192b = context;
    }

    /* renamed from: j */
    public static C0500c1 m2189j(Context context) {
        return new C0500c1(context);
    }

    /* renamed from: c */
    public C0500c1 m2190c(Intent intent) {
        this.f2191a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public C0500c1 m2191g(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).mo1060Q1();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = AbstractC0513j.m2218a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f2192b.getPackageManager());
            }
            m2192i(component);
            m2190c(intent);
        }
        return this;
    }

    /* renamed from: i */
    public C0500c1 m2192i(ComponentName componentName) {
        int size = this.f2191a.size();
        try {
            Intent m2219b = AbstractC0513j.m2219b(this.f2192b, componentName);
            while (m2219b != null) {
                this.f2191a.add(size, m2219b);
                m2219b = AbstractC0513j.m2219b(this.f2192b, m2219b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f2191a.iterator();
    }

    /* renamed from: k */
    public void m2193k() {
        m2194n(null);
    }

    /* renamed from: n */
    public void m2194n(Bundle bundle) {
        if (!this.f2191a.isEmpty()) {
            ArrayList arrayList = this.f2191a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!AbstractC0547a.m2328j(this.f2192b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2192b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
