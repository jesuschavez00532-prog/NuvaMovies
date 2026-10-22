package p276p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.raizlabs.android.dbflow.sql.language.Operator;
import p214l.C5309g;
import p254o.AbstractC5891f;
import p254o.AbstractC5894i;
import p345u.AbstractC7005f;

/* renamed from: p.i */
/* loaded from: classes.dex */
public abstract class AbstractC6136i {

    /* renamed from: a */
    private static final C6142o f24126a;

    /* renamed from: b */
    private static final C5309g f24127b;

    /* renamed from: p.i$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7005f.c {

        /* renamed from: a */
        private AbstractC5894i.d f24128a;

        public a(AbstractC5894i.d dVar) {
            this.f24128a = dVar;
        }

        @Override // p345u.AbstractC7005f.c
        /* renamed from: a */
        public void mo24461a(int i10) {
            AbstractC5894i.d dVar = this.f24128a;
            if (dVar != null) {
                dVar.mo1974d(i10);
            }
        }

        @Override // p345u.AbstractC7005f.c
        /* renamed from: b */
        public void mo24462b(Typeface typeface) {
            AbstractC5894i.d dVar = this.f24128a;
            if (dVar != null) {
                dVar.mo1975e(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f24126a = new C6141n();
        } else if (i10 >= 28) {
            f24126a = new C6140m();
        } else if (i10 >= 26) {
            f24126a = new C6139l();
        } else if (i10 >= 24 && C6138k.m24472m()) {
            f24126a = new C6138k();
        } else if (i10 >= 21) {
            f24126a = new C6137j();
        } else {
            f24126a = new C6142o();
        }
        f24127b = new C5309g(16);
    }

    /* renamed from: a */
    public static Typeface m24453a(Context context, Typeface typeface, int i10) {
        Typeface m24459g;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21 && (m24459g = m24459g(context, typeface, i10)) != null) {
                return m24459g;
            }
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m24454b(Context context, CancellationSignal cancellationSignal, AbstractC7005f.b[] bVarArr, int i10) {
        return f24126a.mo24469c(context, cancellationSignal, bVarArr, i10);
    }

    /* renamed from: c */
    public static Typeface m24455c(Context context, AbstractC5891f.a aVar, Resources resources, int i10, int i11, AbstractC5894i.d dVar, Handler handler, boolean z10) {
        Typeface mo24468b;
        boolean z11;
        int i12;
        if (aVar instanceof AbstractC5891f.d) {
            AbstractC5891f.d dVar2 = (AbstractC5891f.d) aVar;
            Typeface m24460h = m24460h(dVar2.m23784c());
            if (m24460h != null) {
                if (dVar != null) {
                    dVar.m23808b(m24460h, handler);
                }
                return m24460h;
            }
            if (!z10 ? dVar == null : dVar2.m23782a() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                i12 = dVar2.m23785d();
            } else {
                i12 = -1;
            }
            mo24468b = AbstractC7005f.m27037a(context, dVar2.m23783b(), i11, z11, i12, AbstractC5894i.d.m23806c(handler), new a(dVar));
        } else {
            mo24468b = f24126a.mo24468b(context, (AbstractC5891f.b) aVar, resources, i11);
            if (dVar != null) {
                if (mo24468b != null) {
                    dVar.m23808b(mo24468b, handler);
                } else {
                    dVar.m23807a(-3, handler);
                }
            }
        }
        if (mo24468b != null) {
            f24127b.m21409f(m24457e(resources, i10, i11), mo24468b);
        }
        return mo24468b;
    }

    /* renamed from: d */
    public static Typeface m24456d(Context context, Resources resources, int i10, String str, int i11) {
        Typeface mo24481e = f24126a.mo24481e(context, resources, i10, str, i11);
        if (mo24481e != null) {
            f24127b.m21409f(m24457e(resources, i10, i11), mo24481e);
        }
        return mo24481e;
    }

    /* renamed from: e */
    private static String m24457e(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + Operator.Operation.MINUS + i10 + Operator.Operation.MINUS + i11;
    }

    /* renamed from: f */
    public static Typeface m24458f(Resources resources, int i10, int i11) {
        return (Typeface) f24127b.m21407d(m24457e(resources, i10, i11));
    }

    /* renamed from: g */
    private static Typeface m24459g(Context context, Typeface typeface, int i10) {
        C6142o c6142o = f24126a;
        AbstractC5891f.b m24495i = c6142o.m24495i(typeface);
        if (m24495i == null) {
            return null;
        }
        return c6142o.mo24468b(context, m24495i, context.getResources(), i10);
    }

    /* renamed from: h */
    private static Typeface m24460h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
