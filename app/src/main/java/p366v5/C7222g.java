package p366v5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p338t6.InterfaceC6922b;

/* renamed from: v5.g */
/* loaded from: classes.dex */
public final class C7222g {

    /* renamed from: a */
    private final Object f27008a;

    /* renamed from: b */
    private final c f27009b;

    /* renamed from: v5.g$b */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        private final Class f27010a;

        /* renamed from: b */
        private Bundle m27955b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f27010a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f27010a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p366v5.C7222g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo27956a(Context context) {
            Bundle m27955b = m27955b(context);
            if (m27955b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m27955b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m27955b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f27010a = cls;
        }
    }

    /* renamed from: v5.g$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        List mo27956a(Object obj);
    }

    C7222g(Object obj, c cVar) {
        this.f27008a = obj;
        this.f27009b = cVar;
    }

    /* renamed from: c */
    public static C7222g m27951c(Context context, Class cls) {
        return new C7222g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static ComponentRegistrar m27952d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C7238w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new C7238w(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new C7238w(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new C7238w(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new C7238w(String.format("Could not instantiate %s", str), e13);
        }
    }

    /* renamed from: b */
    public List m27954b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f27009b.mo27956a(this.f27008a)) {
            arrayList.add(new InterfaceC6922b() { // from class: v5.f
                @Override // p338t6.InterfaceC6922b
                public final Object get() {
                    ComponentRegistrar m27952d;
                    m27952d = C7222g.m27952d(str);
                    return m27952d;
                }
            });
        }
        return arrayList;
    }
}
