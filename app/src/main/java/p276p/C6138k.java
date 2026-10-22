package p276p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p214l.C5311i;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* renamed from: p.k */
/* loaded from: classes.dex */
class C6138k extends C6142o {

    /* renamed from: b */
    private static final Class f24134b;

    /* renamed from: c */
    private static final Constructor f24135c;

    /* renamed from: d */
    private static final Method f24136d;

    /* renamed from: e */
    private static final Method f24137e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f24135c = constructor;
        f24134b = cls;
        f24136d = method2;
        f24137e = method;
    }

    /* renamed from: k */
    private static boolean m24470k(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f24136d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m24471l(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f24134b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f24137e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m24472m() {
        Method method = f24136d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static Object m24473n() {
        try {
            return f24135c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p276p.C6142o
    /* renamed from: b */
    public Typeface mo24468b(Context context, AbstractC5891f.b bVar, Resources resources, int i10) {
        Object m24473n = m24473n();
        if (m24473n == null) {
            return null;
        }
        for (AbstractC5891f.c cVar : bVar.m23775a()) {
            ByteBuffer m24503b = AbstractC6143p.m24503b(context, resources, cVar.m23777b());
            if (m24503b == null || !m24470k(m24473n, m24503b, cVar.m23778c(), cVar.m23780e(), cVar.m23781f())) {
                return null;
            }
        }
        return m24471l(m24473n);
    }

    @Override // p276p.C6142o
    /* renamed from: c */
    public Typeface mo24469c(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        Object m24473n = m24473n();
        if (m24473n == null) {
            return null;
        }
        C5311i c5311i = new C5311i();
        for (AbstractC7005f.b bVar : bVarArr) {
            Uri m27044d = bVar.m27044d();
            ByteBuffer byteBuffer = (ByteBuffer) c5311i.get(m27044d);
            if (byteBuffer == null) {
                byteBuffer = AbstractC6143p.m24507f(context, cancellationSignal, m27044d);
                c5311i.put(m27044d, byteBuffer);
            }
            if (byteBuffer == null || !m24470k(m24473n, byteBuffer, bVar.m27043c(), bVar.m27045e(), bVar.m27046f())) {
                return null;
            }
        }
        Typeface m24471l = m24471l(m24473n);
        if (m24471l == null) {
            return null;
        }
        return Typeface.create(m24471l, i10);
    }
}
