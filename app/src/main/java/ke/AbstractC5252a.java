package ke;

import be.AbstractC1306b;
import java.io.Closeable;

/* renamed from: ke.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5252a {
    /* renamed from: a */
    public static final void m21156a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1306b.m5958a(th, th2);
            }
        }
    }
}
