package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0284b {

    /* renamed from: a */
    private boolean f854a;

    /* renamed from: b */
    private CopyOnWriteArrayList f855b = new CopyOnWriteArrayList();

    public AbstractC0284b(boolean z10) {
        this.f854a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m960a(InterfaceC0283a interfaceC0283a) {
        this.f855b.add(interfaceC0283a);
    }

    /* renamed from: b */
    public abstract void mo961b();

    /* renamed from: c */
    public final boolean m962c() {
        return this.f854a;
    }

    /* renamed from: d */
    public final void m963d() {
        Iterator it = this.f855b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0283a) it.next()).cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m964e(InterfaceC0283a interfaceC0283a) {
        this.f855b.remove(interfaceC0283a);
    }

    /* renamed from: f */
    public final void m965f(boolean z10) {
        this.f854a = z10;
    }
}
