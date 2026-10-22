package p031c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.a */
/* loaded from: classes.dex */
public final class C1332a {

    /* renamed from: a */
    private final Set f5008a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f5009b;

    /* renamed from: a */
    public void m5986a(InterfaceC1333b interfaceC1333b) {
        if (this.f5009b != null) {
            interfaceC1333b.mo955a(this.f5009b);
        }
        this.f5008a.add(interfaceC1333b);
    }

    /* renamed from: b */
    public void m5987b() {
        this.f5009b = null;
    }

    /* renamed from: c */
    public void m5988c(Context context) {
        this.f5009b = context;
        Iterator it = this.f5008a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1333b) it.next()).mo955a(context);
        }
    }
}
