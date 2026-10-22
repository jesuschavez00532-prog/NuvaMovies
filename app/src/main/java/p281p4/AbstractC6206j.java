package p281p4;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: p4.j */
/* loaded from: classes.dex */
public abstract class AbstractC6206j {
    /* renamed from: a */
    public static void m24763a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
