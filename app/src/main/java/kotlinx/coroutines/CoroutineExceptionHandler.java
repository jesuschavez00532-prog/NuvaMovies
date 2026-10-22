package kotlinx.coroutines;

import ee.InterfaceC4184g;

/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends InterfaceC4184g.b {

    /* renamed from: e0 */
    public static final C5261a f21460e0 = C5261a.f21461a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* loaded from: classes3.dex */
    public static final class C5261a implements InterfaceC4184g.c {

        /* renamed from: a */
        static final /* synthetic */ C5261a f21461a = new C5261a();

        private C5261a() {
        }
    }

    void handleException(InterfaceC4184g interfaceC4184g, Throwable th);
}
