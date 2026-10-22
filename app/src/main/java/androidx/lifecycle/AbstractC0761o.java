package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public abstract class AbstractC0761o {

    /* renamed from: a */
    private final Map f3146a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3147b = false;

    /* renamed from: b */
    private static void m3739b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3740a() {
        this.f3147b = true;
        Map map = this.f3146a;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f3146a.values().iterator();
                while (it.hasNext()) {
                    m3739b(it.next());
                }
            }
        }
        mo3574d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Object m3741c(String str) {
        Object obj;
        Map map = this.f3146a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3146a.get(str);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3574d() {
    }
}
