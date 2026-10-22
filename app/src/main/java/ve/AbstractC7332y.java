package ve;

import ee.InterfaceC4184g;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p344te.AbstractC6948h;
import p344te.AbstractC6950j;
import p344te.InterfaceC6942b;

/* renamed from: ve.y */
/* loaded from: classes3.dex */
public abstract class AbstractC7332y {

    /* renamed from: a */
    private static final List f27239a;

    static {
        InterfaceC6942b m26989c;
        List m26994h;
        m26989c = AbstractC6948h.m26989c(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        m26994h = AbstractC6950j.m26994h(m26989c);
        f27239a = m26994h;
    }

    /* renamed from: a */
    public static final void m28313a(InterfaceC4184g interfaceC4184g, Throwable th) {
        Iterator it = f27239a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(interfaceC4184g, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, AbstractC7334z.m28315b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
