package p276p;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* renamed from: p.l */
/* loaded from: classes.dex */
public class C6139l extends C6137j {

    /* renamed from: g */
    protected final Class f24138g;

    /* renamed from: h */
    protected final Constructor f24139h;

    /* renamed from: i */
    protected final Method f24140i;

    /* renamed from: j */
    protected final Method f24141j;

    /* renamed from: k */
    protected final Method f24142k;

    /* renamed from: l */
    protected final Method f24143l;

    /* renamed from: m */
    protected final Method f24144m;

    public C6139l() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m24487y();
            constructor = m24488z(cls);
            method = m24484v(cls);
            method2 = m24485w(cls);
            method3 = m24480A(cls);
            method4 = m24483u(cls);
            method5 = mo24486x(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f24138g = cls;
        this.f24139h = constructor;
        this.f24140i = method;
        this.f24141j = method2;
        this.f24142k = method3;
        this.f24143l = method4;
        this.f24144m = method5;
    }

    /* renamed from: o */
    private Object m24474o() {
        try {
            return this.f24139h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m24475p(Object obj) {
        try {
            this.f24143l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m24476q(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f24140i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m24477r(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f24141j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m24478s(Object obj) {
        try {
            return ((Boolean) this.f24142k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m24479t() {
        if (this.f24140i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f24140i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    protected Method m24480A(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p276p.C6137j, p276p.C6142o
    /* renamed from: b */
    public Typeface mo24468b(Context context, AbstractC5891f.b bVar, Resources resources, int i10) {
        if (!m24479t()) {
            return super.mo24468b(context, bVar, resources, i10);
        }
        Object m24474o = m24474o();
        if (m24474o == null) {
            return null;
        }
        for (AbstractC5891f.c cVar : bVar.m23775a()) {
            if (!m24476q(context, m24474o, cVar.m23776a(), cVar.m23778c(), cVar.m23780e(), cVar.m23781f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m23779d()))) {
                m24475p(m24474o);
                return null;
            }
        }
        if (!m24478s(m24474o)) {
            return null;
        }
        return mo24482l(m24474o);
    }

    @Override // p276p.C6137j, p276p.C6142o
    /* renamed from: c */
    public Typeface mo24469c(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        Typeface mo24482l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m24479t()) {
            AbstractC7005f.b mo24490h = mo24490h(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo24490h.m27044d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo24490h.m27045e()).setItalic(mo24490h.m27046f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map m24509h = AbstractC6143p.m24509h(context, bVarArr, cancellationSignal);
        Object m24474o = m24474o();
        if (m24474o == null) {
            return null;
        }
        boolean z10 = false;
        for (AbstractC7005f.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) m24509h.get(bVar.m27044d());
            if (byteBuffer != null) {
                if (!m24477r(m24474o, byteBuffer, bVar.m27043c(), bVar.m27045e(), bVar.m27046f() ? 1 : 0)) {
                    m24475p(m24474o);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m24475p(m24474o);
            return null;
        }
        if (!m24478s(m24474o) || (mo24482l = mo24482l(m24474o)) == null) {
            return null;
        }
        return Typeface.create(mo24482l, i10);
    }

    @Override // p276p.C6142o
    /* renamed from: e */
    public Typeface mo24481e(Context context, Resources resources, int i10, String str, int i11) {
        if (!m24479t()) {
            return super.mo24481e(context, resources, i10, str, i11);
        }
        Object m24474o = m24474o();
        if (m24474o == null) {
            return null;
        }
        if (!m24476q(context, m24474o, str, 0, -1, -1, null)) {
            m24475p(m24474o);
            return null;
        }
        if (!m24478s(m24474o)) {
            return null;
        }
        return mo24482l(m24474o);
    }

    /* renamed from: l */
    protected Typeface mo24482l(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f24138g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f24144m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m24483u(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m24484v(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m24485w(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo24486x(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class m24487y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor m24488z(Class cls) {
        return cls.getConstructor(new Class[0]);
    }
}
