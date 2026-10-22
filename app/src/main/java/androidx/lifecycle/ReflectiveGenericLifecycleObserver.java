package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.C0747a;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0750d {

    /* renamed from: a */
    private final Object f3112a;

    /* renamed from: b */
    private final C0747a.a f3113b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3112a = obj;
        this.f3113b = C0747a.f3117c.m3698c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        this.f3113b.m3701a(interfaceC0752f, bVar, this.f3112a);
    }
}
