package p257o2;

import android.app.Application;
import android.util.Log;
import com.umeng.umcrash.UMCrashCallback;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import p279p2.AbstractC6188b;
import p293q2.C6333d;
import p308r2.AbstractC6511a;
import p334t2.AbstractC6891a;

/* renamed from: o2.b */
/* loaded from: classes.dex */
public abstract class AbstractC5904b {
    /* renamed from: b */
    public static void m23852b(Application application) {
        AbstractC6511a.m25469a();
        new C6333d().m25113f(application);
        RxJavaPlugins.setErrorHandler(new Consumer() { // from class: o2.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Log.e("SysOptimizer", "find rxjava uncatch exception, please fix it!!!", (Throwable) obj);
            }
        });
    }

    /* renamed from: c */
    public static void m23853c(UMCrashCallback uMCrashCallback) {
        AbstractC6891a.m26815a(uMCrashCallback);
    }

    /* renamed from: e */
    public static void m23855e(Application application) {
        AbstractC6188b.m24712a(application);
    }
}
