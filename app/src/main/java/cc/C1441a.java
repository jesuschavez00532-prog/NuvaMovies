package cc;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;

/* renamed from: cc.a */
/* loaded from: classes.dex */
public final class C1441a {

    /* renamed from: a */
    public static final C1441a f5552a = new C1441a();

    /* renamed from: b */
    private static List f5553b = new ArrayList();

    private C1441a() {
    }

    /* renamed from: a */
    public final void m6703a(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
        f5553b.add(activity);
    }

    /* renamed from: b */
    public final void m6704b() {
        for (Activity activity : f5553b) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: c */
    public final List m6705c() {
        return f5553b;
    }

    /* renamed from: d */
    public final Activity m6706d(Class cls) {
        AbstractC5868k.m23674f(cls, "targetClass");
        List list = f5553b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Activity activity = (Activity) next;
            if (activity.isFinishing() || activity.isDestroyed()) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Activity activity2 = (Activity) arrayList.get(f5553b.size() - 1);
        if (!AbstractC5868k.m23669a(activity2.getClass(), cls)) {
            return activity2;
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        return (Activity) arrayList.get(f5553b.size() - 2);
    }

    /* renamed from: e */
    public final Activity m6707e() {
        return (Activity) f5553b.get(r0.size() - 1);
    }

    /* renamed from: f */
    public final void m6708f(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
        f5553b.remove(activity);
    }
}
