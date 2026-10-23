package p276p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p254o.AbstractC5891f;
import p345u.AbstractC7005f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p.o */
/* loaded from: classes.dex */
public class C6142o {

    /* renamed from: a */
    private ConcurrentHashMap f24145a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p.o$a */
    /* loaded from: classes.dex */
    public class a implements c {
        a() {
        }

        @Override // p276p.C6142o.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo24496a(AbstractC7005f.b bVar) {
            return bVar.m27045e();
        }

        @Override // p276p.C6142o.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo24497b(AbstractC7005f.b bVar) {
            return bVar.m27046f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p.o$b */
    /* loaded from: classes.dex */
    public class b implements c {
        b() {
        }

        @Override // p276p.C6142o.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo24496a(AbstractC5891f.c cVar) {
            return cVar.m23780e();
        }

        @Override // p276p.C6142o.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo24497b(AbstractC5891f.c cVar) {
            return cVar.m23781f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p.o$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo24496a(Object obj);

        /* renamed from: b */
        boolean mo24497b(Object obj);
    }

    /* renamed from: a */
    private void m24491a(Typeface typeface, AbstractC5891f.b bVar) {
        long m24494j = m24494j(typeface);
        if (m24494j != 0) {
            this.f24145a.put(Long.valueOf(m24494j), bVar);
        }
    }

    /* renamed from: f */
    private AbstractC5891f.c m24492f(AbstractC5891f.b bVar, int i10) {
        return (AbstractC5891f.c) m24493g(bVar.m23775a(), i10, new b());
    }

    /* renamed from: g */
    private static Object m24493g(Object[] objArr, int i10, c cVar) {
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = null;
        int i13 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(cVar.mo24496a(obj2) - i11) * 2;
            if (cVar.mo24497b(obj2) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (obj == null || i13 > i14) {
                obj = obj2;
                i13 = i14;
            }
        }
        return obj;
    }

    /* renamed from: j */
    private static long m24494j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    /* renamed from: b */
    public Typeface mo24468b(Context context, AbstractC5891f.b bVar, Resources resources, int i10) {
        AbstractC5891f.c m24492f = m24492f(bVar, i10);
        if (m24492f == null) {
            return null;
        }
        Typeface m24456d = AbstractC6136i.m24456d(context, resources, m24492f.m23777b(), m24492f.m23776a(), i10);
        m24491a(m24456d, bVar);
        return m24456d;
    }

    /* renamed from: c */
    public Typeface mo24469c(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo24490h(bVarArr, i10).m27044d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo24489d = mo24489d(context, inputStream);
            AbstractC6143p.m24502a(inputStream);
            return mo24489d;
        } catch (IOException unused2) {
            AbstractC6143p.m24502a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            AbstractC6143p.m24502a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo24489d(Context context, InputStream inputStream) {
        File m24506e = AbstractC6143p.m24506e(context);
        if (m24506e == null) {
            return null;
        }
        try {
            if (!AbstractC6143p.m24505d(m24506e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(m24506e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m24506e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo24481e(Context context, Resources resources, int i10, String str, int i11) {
        File m24506e = AbstractC6143p.m24506e(context);
        if (m24506e == null) {
            return null;
        }
        try {
            if (!AbstractC6143p.m24504c(m24506e, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(m24506e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m24506e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public AbstractC7005f.b mo24490h(AbstractC7005f.b[] bVarArr, int i10) {
        return (AbstractC7005f.b) m24493g(bVarArr, i10, new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public AbstractC5891f.b m24495i(Typeface typeface) {
        long m24494j = m24494j(typeface);
        if (m24494j == 0) {
            return null;
        }
        return (AbstractC5891f.b) this.f24145a.get(Long.valueOf(m24494j));
    }
}
