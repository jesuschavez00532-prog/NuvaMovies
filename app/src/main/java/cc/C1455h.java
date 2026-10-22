package cc;

import java.io.Closeable;
import java.io.IOException;
import ne.AbstractC5868k;

/* renamed from: cc.h */
/* loaded from: classes.dex */
public final class C1455h {

    /* renamed from: a */
    public static final C1455h f5573a = new C1455h();

    private C1455h() {
    }

    /* renamed from: a */
    public final void m6759a(Closeable... closeableArr) {
        AbstractC5868k.m23674f(closeableArr, "closeables");
        for (Closeable closeable : closeableArr) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }
}
