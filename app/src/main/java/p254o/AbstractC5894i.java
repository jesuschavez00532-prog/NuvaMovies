package p254o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p373w.AbstractC7338c;
import p373w.AbstractC7342g;

/* renamed from: o.i */
/* loaded from: classes.dex */
public abstract class AbstractC5894i {

    /* renamed from: a */
    private static final ThreadLocal f23450a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f23451b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f23452c = new Object();

    /* renamed from: o.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m23805a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o.i$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final ColorStateList f23453a;

        /* renamed from: b */
        final Configuration f23454b;

        b(ColorStateList colorStateList, Configuration configuration) {
            this.f23453a = colorStateList;
            this.f23454b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o.i$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final Resources f23455a;

        /* renamed from: b */
        final Resources.Theme f23456b;

        c(Resources resources, Resources.Theme theme) {
            this.f23455a = resources;
            this.f23456b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f23455a.equals(cVar.f23455a) && AbstractC7338c.m28317a(this.f23456b, cVar.f23456b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return AbstractC7338c.m28318b(this.f23455a, this.f23456b);
        }
    }

    /* renamed from: o.i$d */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.i$d$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f23457a;

            a(Typeface typeface) {
                this.f23457a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.mo1975e(this.f23457a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.i$d$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f23459a;

            b(int i10) {
                this.f23459a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.mo1974d(this.f23459a);
            }
        }

        /* renamed from: c */
        public static Handler m23806c(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        /* renamed from: a */
        public final void m23807a(int i10, Handler handler) {
            m23806c(handler).post(new b(i10));
        }

        /* renamed from: b */
        public final void m23808b(Typeface typeface, Handler handler) {
            m23806c(handler).post(new a(typeface));
        }

        /* renamed from: d */
        public abstract void mo1974d(int i10);

        /* renamed from: e */
        public abstract void mo1975e(Typeface typeface);
    }

    /* renamed from: o.i$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: o.i$e$a */
        /* loaded from: classes.dex */
        static class a {

            /* renamed from: a */
            private static final Object f23461a = new Object();

            /* renamed from: b */
            private static Method f23462b;

            /* renamed from: c */
            private static boolean f23463c;

            /* renamed from: a */
            static void m23810a(Resources.Theme theme) {
                synchronized (f23461a) {
                    if (!f23463c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f23462b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f23463c = true;
                    }
                    Method method = f23462b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f23462b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: o.i$e$b */
        /* loaded from: classes.dex */
        static class b {
            /* renamed from: a */
            static void m23811a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m23809a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.m23811a(theme);
            } else if (i10 >= 23) {
                a.m23810a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m23793a(c cVar, int i10, ColorStateList colorStateList) {
        synchronized (f23452c) {
            WeakHashMap weakHashMap = f23451b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i10, new b(colorStateList, cVar.f23455a.getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m23794b(c cVar, int i10) {
        b bVar;
        synchronized (f23452c) {
            SparseArray sparseArray = (SparseArray) f23451b.get(cVar);
            if (sparseArray != null && sparseArray.size() > 0 && (bVar = (b) sparseArray.get(i10)) != null) {
                if (bVar.f23454b.equals(cVar.f23455a.getConfiguration())) {
                    return bVar.f23453a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m23795c(Resources resources, int i10, Resources.Theme theme) {
        c cVar = new c(resources, theme);
        ColorStateList m23794b = m23794b(cVar, i10);
        if (m23794b != null) {
            return m23794b;
        }
        ColorStateList m23801i = m23801i(resources, i10, theme);
        if (m23801i != null) {
            m23793a(cVar, i10, m23801i);
            return m23801i;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m23805a(resources, i10, theme);
        }
        return resources.getColorStateList(i10);
    }

    /* renamed from: d */
    public static Drawable m23796d(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = resources.getDrawable(i10, theme);
            return drawable;
        }
        return resources.getDrawable(i10);
    }

    /* renamed from: e */
    public static Typeface m23797e(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m23803k(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m23798f(Context context, int i10, TypedValue typedValue, int i11, d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m23803k(context, i10, typedValue, i11, dVar, null, true, false);
    }

    /* renamed from: g */
    public static void m23799g(Context context, int i10, d dVar, Handler handler) {
        AbstractC7342g.m28327g(dVar);
        if (context.isRestricted()) {
            dVar.m23807a(-4, handler);
        } else {
            m23803k(context, i10, new TypedValue(), 0, dVar, handler, false, false);
        }
    }

    /* renamed from: h */
    private static TypedValue m23800h() {
        ThreadLocal threadLocal = f23450a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: i */
    private static ColorStateList m23801i(Resources resources, int i10, Resources.Theme theme) {
        if (m23802j(resources, i10)) {
            return null;
        }
        try {
            return AbstractC5888c.m23746a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m23802j(Resources resources, int i10) {
        TypedValue m23800h = m23800h();
        resources.getValue(i10, m23800h, true);
        int i11 = m23800h.type;
        if (i11 >= 28 && i11 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static Typeface m23803k(Context context, int i10, TypedValue typedValue, int i11, d dVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface m23804l = m23804l(context, resources, typedValue, i10, i11, dVar, handler, z10, z11);
        if (m23804l == null && dVar == null && !z11) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        return m23804l;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m23804l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p254o.AbstractC5894i.d r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.m23807a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = p276p.AbstractC6136i.m24458f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.m23808b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            o.f$a r2 = p254o.AbstractC5891f.m23768b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.m23807a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p276p.AbstractC6136i.m24455c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = p276p.AbstractC6136i.m24456d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.m23808b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.m23807a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.m23807a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p254o.AbstractC5894i.m23804l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, o.i$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
