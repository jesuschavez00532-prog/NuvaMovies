package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0750d {

    /* renamed from: a */
    private final InterfaceC0837b f3502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C0832a implements SavedStateRegistry.InterfaceC0835b {

        /* renamed from: a */
        final Set f3503a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0832a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m4309d("androidx.savedstate.Restarter", this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m4305a(String str) {
            this.f3503a.add(str);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0835b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3503a));
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(InterfaceC0837b interfaceC0837b) {
        this.f3502a = interfaceC0837b;
    }

    /* renamed from: a */
    private void m4304a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC0834a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC0834a) declaredConstructor.newInstance(new Object[0])).mo3694a(this.f3502a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        if (bVar == AbstractC0749c.b.ON_CREATE) {
            interfaceC0752f.mo953f6().mo3705c(this);
            Bundle m4306a = this.f3502a.mo947B3().m4306a("androidx.savedstate.Restarter");
            if (m4306a == null) {
                return;
            }
            ArrayList<String> stringArrayList = m4306a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    m4304a(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
