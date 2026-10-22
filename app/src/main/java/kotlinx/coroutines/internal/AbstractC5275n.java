package kotlinx.coroutines.internal;

import be.C1308d;
import java.util.List;
import ve.AbstractC7292k1;

/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes3.dex */
public abstract class AbstractC5275n {

    /* renamed from: a */
    private static final boolean f21498a = false;

    /* renamed from: a */
    private static final C5276o m21231a(Throwable th, String str) {
        if (f21498a) {
            return new C5276o(th, str);
        }
        if (th != null) {
            throw th;
        }
        m21233c();
        throw new C1308d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C5276o m21232b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m21231a(th, str);
    }

    /* renamed from: c */
    public static final Void m21233c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: d */
    public static final AbstractC7292k1 m21234d(MainDispatcherFactory mainDispatcherFactory, List list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m21231a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
