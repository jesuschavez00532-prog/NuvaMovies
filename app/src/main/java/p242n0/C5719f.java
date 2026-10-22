package p242n0;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public final class C5719f {

    /* renamed from: a */
    public static final C5719f f22985a = new C5719f();

    private C5719f() {
    }

    /* renamed from: a */
    public final void m23112a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }
}
