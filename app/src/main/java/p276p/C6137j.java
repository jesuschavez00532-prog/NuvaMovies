package p276p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* renamed from: p.j */
/* loaded from: classes.dex */
class C6137j extends C6142o {

    /* renamed from: b */
    private static Class f24129b;

    /* renamed from: c */
    private static Constructor f24130c;

    /* renamed from: d */
    private static Method f24131d;

    /* renamed from: e */
    private static Method f24132e;

    /* renamed from: f */
    private static boolean f24133f;

    /* renamed from: k */
    private static boolean m24463k(Object obj, String str, int i10, boolean z10) {
        m24466n();
        try {
            return ((Boolean) f24131d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: l */
    private static Typeface m24464l(Object obj) {
        m24466n();
        try {
            Object newInstance = Array.newInstance((Class<?>) f24129b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f24132e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: m */
    private File m24465m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m24466n() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f24133f) {
            return;
        }
        f24133f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f24130c = constructor;
        f24129b = cls;
        f24131d = method2;
        f24132e = method;
    }

    /* renamed from: o */
    private static Object m24467o() {
        m24466n();
        try {
            return f24130c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p276p.C6142o
    /* renamed from: b */
    public Typeface mo24468b(Context context, AbstractC5891f.b bVar, Resources resources, int i10) {
        Object m24467o = m24467o();
        for (AbstractC5891f.c cVar : bVar.m23775a()) {
            File m24506e = AbstractC6143p.m24506e(context);
            if (m24506e == null) {
                return null;
            }
            try {
                if (!AbstractC6143p.m24504c(m24506e, resources, cVar.m23777b())) {
                    return null;
                }
                if (!m24463k(m24467o, m24506e.getPath(), cVar.m23780e(), cVar.m23781f())) {
                    return null;
                }
                m24506e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m24506e.delete();
            }
        }
        return m24464l(m24467o);
    }

    @Override // p276p.C6142o
    /* renamed from: c */
    public Typeface mo24469c(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m24465m = m24465m(openFileDescriptor);
                if (m24465m != null && m24465m.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m24465m);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface mo24489d = super.mo24489d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo24489d;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
