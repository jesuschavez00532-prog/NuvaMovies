package p407y1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y1.d */
/* loaded from: classes.dex */
public final class C7660d {

    /* renamed from: a */
    private final Context f28102a;

    public C7660d(Context context) {
        this.f28102a = context;
    }

    /* renamed from: a */
    private ApplicationInfo m29461a() {
        return this.f28102a.getPackageManager().getApplicationInfo(this.f28102a.getPackageName(), 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p407y1.InterfaceC7658b m29462c(java.lang.String r3) {
        /*
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L44
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.Object r3 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            goto L26
        L12:
            r0 = move-exception
            m29463d(r3, r0)
            goto L25
        L17:
            r0 = move-exception
            m29463d(r3, r0)
            goto L25
        L1c:
            r0 = move-exception
            m29463d(r3, r0)
            goto L25
        L21:
            r0 = move-exception
            m29463d(r3, r0)
        L25:
            r3 = 0
        L26:
            boolean r0 = r3 instanceof p407y1.InterfaceC7658b
            if (r0 == 0) goto L2d
            y1.b r3 = (p407y1.InterfaceC7658b) r3
            return r3
        L2d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L44:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p407y1.C7660d.m29462c(java.lang.String):y1.b");
    }

    /* renamed from: d */
    private static void m29463d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: b */
    public List m29464b() {
        ApplicationInfo m29461a;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            m29461a = m29461a();
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e10);
            }
        }
        if (m29461a != null && m29461a.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + m29461a.metaData);
            }
            for (String str : m29461a.metaData.keySet()) {
                if ("GlideModule".equals(m29461a.metaData.get(str))) {
                    arrayList.add(m29462c(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        return arrayList;
    }
}
