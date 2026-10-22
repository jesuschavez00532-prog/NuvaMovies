package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;
import androidx.savedstate.InterfaceC0837b;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0750d {

    /* renamed from: a */
    private boolean f3114a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C0746a implements SavedStateRegistry.InterfaceC0834a {
        C0746a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0834a
        /* renamed from: a */
        public void mo3694a(InterfaceC0837b interfaceC0837b) {
            if (interfaceC0837b instanceof InterfaceC0764r) {
                C0763q mo951b3 = ((InterfaceC0764r) interfaceC0837b).mo951b3();
                SavedStateRegistry mo947B3 = interfaceC0837b.mo947B3();
                Iterator it = mo951b3.m3746c().iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.m3690a(mo951b3.m3745b((String) it.next()), mo947B3, interfaceC0837b.mo953f6());
                }
                if (!mo951b3.m3746c().isEmpty()) {
                    mo947B3.m4310e(C0746a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m3690a(AbstractC0761o abstractC0761o, SavedStateRegistry savedStateRegistry, AbstractC0749c abstractC0749c) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0761o.m3741c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.m3693c()) {
            savedStateHandleController.m3692b(savedStateRegistry, abstractC0749c);
            m3691d(savedStateRegistry, abstractC0749c);
        }
    }

    /* renamed from: d */
    private static void m3691d(final SavedStateRegistry savedStateRegistry, final AbstractC0749c abstractC0749c) {
        AbstractC0749c.c mo3704b = abstractC0749c.mo3704b();
        if (mo3704b != AbstractC0749c.c.INITIALIZED && !mo3704b.m3709a(AbstractC0749c.c.STARTED)) {
            abstractC0749c.mo3703a(new InterfaceC0750d() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    if (bVar == AbstractC0749c.b.ON_START) {
                        AbstractC0749c.this.mo3705c(this);
                        savedStateRegistry.m4310e(C0746a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.m4310e(C0746a.class);
        }
    }

    /* renamed from: b */
    void m3692b(SavedStateRegistry savedStateRegistry, AbstractC0749c abstractC0749c) {
        if (this.f3114a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3114a = true;
        abstractC0749c.mo3703a(this);
        throw null;
    }

    /* renamed from: c */
    boolean m3693c() {
        return this.f3114a;
    }

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        if (bVar == AbstractC0749c.b.ON_DESTROY) {
            this.f3114a = false;
            interfaceC0752f.mo953f6().mo3705c(this);
        }
    }
}
