package p388we;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import be.AbstractC1319o;
import be.AbstractC1320p;

/* renamed from: we.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7442c {

    /* renamed from: a */
    public static final AbstractC7441b f27485a;

    static {
        Object m5971a = null;
        Object obj = null;
        try {
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            m5971a = AbstractC1319o.m5971a(new C7440a(m28549a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
            m5971a = AbstractC1319o.m5971a(AbstractC1320p.m5975a(th));
        }
        if (!AbstractC1319o.m5973c(m5971a)) {
            obj = m5971a;
        }
        f27485a = (AbstractC7441b) obj;
    }

    /* renamed from: a */
    public static final Handler m28549a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                if (invoke != null) {
                    return (Handler) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
