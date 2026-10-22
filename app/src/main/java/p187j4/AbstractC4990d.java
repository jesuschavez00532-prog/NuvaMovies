package p187j4;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1792c;
import com.google.android.gms.common.api.internal.C1791b;
import com.google.android.gms.common.api.internal.C1795f;
import com.google.android.gms.common.api.internal.C1801l;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p187j4.C4987a;
import p203k4.AbstractServiceConnectionC5110g;
import p203k4.BinderC5125v;
import p203k4.C5102a;
import p203k4.C5104b;
import p203k4.C5117n;
import p203k4.InterfaceC5113j;
import p219l4.AbstractC5358c;
import p219l4.AbstractC5391n;
import p219l4.C5361d;
import p281p4.AbstractC6207k;

/* renamed from: j4.d */
/* loaded from: classes.dex */
public abstract class AbstractC4990d {

    /* renamed from: a */
    private final Context f20728a;

    /* renamed from: b */
    private final String f20729b;

    /* renamed from: c */
    private final C4987a f20730c;

    /* renamed from: d */
    private final C4987a.d f20731d;

    /* renamed from: e */
    private final C5104b f20732e;

    /* renamed from: f */
    private final Looper f20733f;

    /* renamed from: g */
    private final int f20734g;

    /* renamed from: h */
    private final AbstractC4991e f20735h;

    /* renamed from: i */
    private final InterfaceC5113j f20736i;

    /* renamed from: j */
    protected final C1791b f20737j;

    /* renamed from: j4.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f20738c = new C7850a().m20370a();

        /* renamed from: a */
        public final InterfaceC5113j f20739a;

        /* renamed from: b */
        public final Looper f20740b;

        /* renamed from: j4.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C7850a {

            /* renamed from: a */
            private InterfaceC5113j f20741a;

            /* renamed from: b */
            private Looper f20742b;

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public a m20370a() {
                if (this.f20741a == null) {
                    this.f20741a = new C5102a();
                }
                if (this.f20742b == null) {
                    this.f20742b = Looper.getMainLooper();
                }
                return new a(this.f20741a, this.f20742b);
            }
        }

        private a(InterfaceC5113j interfaceC5113j, Account account, Looper looper) {
            this.f20739a = interfaceC5113j;
            this.f20740b = looper;
        }
    }

    private AbstractC4990d(Context context, Activity activity, C4987a c4987a, C4987a.d dVar, a aVar) {
        AbstractC5391n.m21784j(context, "Null context is not permitted.");
        AbstractC5391n.m21784j(c4987a, "Api must not be null.");
        AbstractC5391n.m21784j(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f20728a = context.getApplicationContext();
        String str = null;
        if (AbstractC6207k.m24774k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f20729b = str;
        this.f20730c = c4987a;
        this.f20731d = dVar;
        this.f20733f = aVar.f20740b;
        C5104b m20742a = C5104b.m20742a(c4987a, dVar, str);
        this.f20732e = m20742a;
        this.f20735h = new C5117n(this);
        C1791b m7953x = C1791b.m7953x(this.f20728a);
        this.f20737j = m7953x;
        this.f20734g = m7953x.m7965m();
        this.f20736i = aVar.f20739a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C1795f.m7983u(activity, m7953x, m20742a);
        }
        m7953x.m7960b(this);
    }

    /* renamed from: i */
    private final AbstractC4245i m20362i(int i10, AbstractC1792c abstractC1792c) {
        C4247j c4247j = new C4247j();
        this.f20737j.m7956D(this, i10, abstractC1792c, c4247j, this.f20736i);
        return c4247j.m17724a();
    }

    /* renamed from: b */
    protected C5361d.a m20363b() {
        C5361d.a aVar = new C5361d.a();
        aVar.m21711d(null);
        aVar.m21710c(Collections.emptySet());
        aVar.m21712e(this.f20728a.getClass().getName());
        aVar.m21709b(this.f20728a.getPackageName());
        return aVar;
    }

    /* renamed from: c */
    public AbstractC4245i m20364c(AbstractC1792c abstractC1792c) {
        return m20362i(2, abstractC1792c);
    }

    /* renamed from: d */
    public final C5104b m20365d() {
        return this.f20732e;
    }

    /* renamed from: e */
    protected String m20366e() {
        return this.f20729b;
    }

    /* renamed from: f */
    public final int m20367f() {
        return this.f20734g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final C4987a.f m20368g(Looper looper, C1801l c1801l) {
        C4987a.f mo6138a = ((C4987a.a) AbstractC5391n.m21783i(this.f20730c.m20345a())).mo6138a(this.f20728a, looper, m20363b().m21708a(), this.f20731d, c1801l, c1801l);
        String m20366e = m20366e();
        if (m20366e != null && (mo6138a instanceof AbstractC5358c)) {
            ((AbstractC5358c) mo6138a).m21673O(m20366e);
        }
        if (m20366e != null && (mo6138a instanceof AbstractServiceConnectionC5110g)) {
            throw null;
        }
        return mo6138a;
    }

    /* renamed from: h */
    public final BinderC5125v m20369h(Context context, Handler handler) {
        return new BinderC5125v(context, handler, m20363b().m21708a());
    }

    public AbstractC4990d(Context context, C4987a c4987a, C4987a.d dVar, a aVar) {
        this(context, null, c4987a, dVar, aVar);
    }
}
