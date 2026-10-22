package ve;

import be.AbstractC1306b;
import ee.InterfaceC4184g;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: ve.z */
/* loaded from: classes3.dex */
public abstract class AbstractC7334z {
    /* renamed from: a */
    public static final void m28314a(InterfaceC4184g interfaceC4184g, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC4184g.get(CoroutineExceptionHandler.f21460e0);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(interfaceC4184g, th);
            } else {
                AbstractC7332y.m28313a(interfaceC4184g, th);
            }
        } catch (Throwable th2) {
            AbstractC7332y.m28313a(interfaceC4184g, m28315b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m28315b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1306b.m5958a(runtimeException, th);
        return runtimeException;
    }
}
