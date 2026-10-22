package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import androidx.savedstate.Recreator;
import java.util.Map;
import p182j.C4966b;

/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f3505b;

    /* renamed from: c */
    private boolean f3506c;

    /* renamed from: d */
    private Recreator.C0832a f3507d;

    /* renamed from: a */
    private C4966b f3504a = new C4966b();

    /* renamed from: e */
    boolean f3508e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0834a {
        /* renamed from: a */
        void mo3694a(InterfaceC0837b interfaceC0837b);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0835b {
        Bundle saveState();
    }

    /* renamed from: a */
    public Bundle m4306a(String str) {
        if (this.f3506c) {
            Bundle bundle = this.f3505b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f3505b.remove(str);
            if (this.f3505b.isEmpty()) {
                this.f3505b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4307b(AbstractC0749c abstractC0749c, Bundle bundle) {
        if (!this.f3506c) {
            if (bundle != null) {
                this.f3505b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            abstractC0749c.mo3703a(new InterfaceC0750d() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.InterfaceC0750d
                public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
                    if (bVar == AbstractC0749c.b.ON_START) {
                        SavedStateRegistry.this.f3508e = true;
                    } else if (bVar == AbstractC0749c.b.ON_STOP) {
                        SavedStateRegistry.this.f3508e = false;
                    }
                }
            });
            this.f3506c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4308c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3505b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4966b.d m20300i = this.f3504a.m20300i();
        while (m20300i.hasNext()) {
            Map.Entry entry = (Map.Entry) m20300i.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0835b) entry.getValue()).saveState());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m4309d(String str, InterfaceC0835b interfaceC0835b) {
        if (((InterfaceC0835b) this.f3504a.mo20296n(str, interfaceC0835b)) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m4310e(Class cls) {
        if (this.f3508e) {
            if (this.f3507d == null) {
                this.f3507d = new Recreator.C0832a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f3507d.m4305a(cls.getName());
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
