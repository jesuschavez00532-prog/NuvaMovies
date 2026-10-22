package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;

/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C0836a {

    /* renamed from: a */
    private final InterfaceC0837b f3510a;

    /* renamed from: b */
    private final SavedStateRegistry f3511b = new SavedStateRegistry();

    private C0836a(InterfaceC0837b interfaceC0837b) {
        this.f3510a = interfaceC0837b;
    }

    /* renamed from: a */
    public static C0836a m4311a(InterfaceC0837b interfaceC0837b) {
        return new C0836a(interfaceC0837b);
    }

    /* renamed from: b */
    public SavedStateRegistry m4312b() {
        return this.f3511b;
    }

    /* renamed from: c */
    public void m4313c(Bundle bundle) {
        AbstractC0749c mo953f6 = this.f3510a.mo953f6();
        if (mo953f6.mo3704b() == AbstractC0749c.c.INITIALIZED) {
            mo953f6.mo3703a(new Recreator(this.f3510a));
            this.f3511b.m4307b(mo953f6, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void m4314d(Bundle bundle) {
        this.f3511b.m4308c(bundle);
    }
}
