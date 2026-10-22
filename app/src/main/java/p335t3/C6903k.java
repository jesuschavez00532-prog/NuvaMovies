package p335t3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t3.k */
/* loaded from: classes.dex */
class C6903k implements InterfaceC6897e {

    /* renamed from: a */
    private final a f26224a;

    /* renamed from: b */
    private final C6901i f26225b;

    /* renamed from: c */
    private final Map f26226c;

    /* renamed from: t3.k$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Context f26227a;

        /* renamed from: b */
        private Map f26228b = null;

        a(Context context) {
            this.f26227a = context;
        }

        /* renamed from: a */
        private Map m26838a(Context context) {
            Bundle m26840d = m26840d(context);
            if (m26840d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m26840d.keySet()) {
                Object obj = m26840d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map m26839c() {
            if (this.f26228b == null) {
                this.f26228b = m26838a(this.f26227a);
            }
            return this.f26228b;
        }

        /* renamed from: d */
        private static Bundle m26840d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC6896d m26841b(String str) {
            String str2 = (String) m26839c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC6896d) Class.forName(str2).asSubclass(InterfaceC6896d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6903k(Context context, C6901i c6901i) {
        this(new a(context), c6901i);
    }

    @Override // p335t3.InterfaceC6897e
    /* renamed from: a */
    public synchronized InterfaceC6905m mo26827a(String str) {
        if (this.f26226c.containsKey(str)) {
            return (InterfaceC6905m) this.f26226c.get(str);
        }
        InterfaceC6896d m26841b = this.f26224a.m26841b(str);
        if (m26841b == null) {
            return null;
        }
        InterfaceC6905m create = m26841b.create(this.f26225b.m26834a(str));
        this.f26226c.put(str, create);
        return create;
    }

    C6903k(a aVar, C6901i c6901i) {
        this.f26226c = new HashMap();
        this.f26224a = aVar;
        this.f26225b = c6901i;
    }
}
