package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.p */
/* loaded from: classes.dex */
abstract class AbstractC0315p {

    /* renamed from: a */
    private static Field f1160a;

    /* renamed from: b */
    private static boolean f1161b;

    /* renamed from: c */
    private static Class f1162c;

    /* renamed from: d */
    private static boolean f1163d;

    /* renamed from: e */
    private static Field f1164e;

    /* renamed from: f */
    private static boolean f1165f;

    /* renamed from: g */
    private static Field f1166g;

    /* renamed from: h */
    private static boolean f1167h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1206a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            m1209d(resources);
        } else if (i10 >= 23) {
            m1208c(resources);
        } else if (i10 >= 21) {
            m1207b(resources);
        }
    }

    /* renamed from: b */
    private static void m1207b(Resources resources) {
        Map map;
        if (!f1161b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1160a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f1161b = true;
        }
        Field field = f1160a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m1208c(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.AbstractC0315p.f1161b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.AbstractC0315p.f1160a = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.AbstractC0315p.f1161b = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.AbstractC0315p.f1160a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            m1210e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AbstractC0315p.m1208c(android.content.res.Resources):void");
    }

    /* renamed from: d */
    private static void m1209d(Resources resources) {
        Object obj;
        if (!f1167h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1166g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f1167h = true;
        }
        Field field = f1166g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1161b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1160a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f1161b = true;
        }
        Field field2 = f1160a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            m1210e(obj2);
        }
    }

    /* renamed from: e */
    private static void m1210e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1163d) {
            try {
                f1162c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f1163d = true;
        }
        Class cls = f1162c;
        if (cls == null) {
            return;
        }
        if (!f1165f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1164e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f1165f = true;
        }
        Field field = f1164e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
