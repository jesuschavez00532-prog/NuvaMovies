package p266ob;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: ob.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5957a {
    /* renamed from: a */
    public static void m24115a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
