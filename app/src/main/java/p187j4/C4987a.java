package p187j4;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import p172i4.C4858d;
import p187j4.AbstractC4991e;
import p203k4.InterfaceC5106c;
import p203k4.InterfaceC5111h;
import p219l4.AbstractC5358c;
import p219l4.AbstractC5391n;
import p219l4.C5361d;
import p219l4.InterfaceC5376i;

/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C4987a {

    /* renamed from: a */
    private final a f20724a;

    /* renamed from: b */
    private final g f20725b;

    /* renamed from: c */
    private final String f20726c;

    /* renamed from: j4.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends e {
        /* renamed from: a */
        public f mo6138a(Context context, Looper looper, C5361d c5361d, Object obj, AbstractC4991e.a aVar, AbstractC4991e.b bVar) {
            return mo20347b(context, looper, c5361d, obj, aVar, bVar);
        }

        /* renamed from: b */
        public f mo20347b(Context context, Looper looper, C5361d c5361d, Object obj, InterfaceC5106c interfaceC5106c, InterfaceC5111h interfaceC5111h) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: j4.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: j4.a$c */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* renamed from: j4.a$d */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* renamed from: j4.a$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: j4.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        /* renamed from: a */
        Set mo20348a();

        /* renamed from: b */
        void m20349b(String str);

        /* renamed from: c */
        boolean m20350c();

        /* renamed from: d */
        String m20351d();

        /* renamed from: e */
        void m20352e(InterfaceC5376i interfaceC5376i, Set set);

        /* renamed from: f */
        void m20353f();

        /* renamed from: g */
        void m20354g(AbstractC5358c.c cVar);

        /* renamed from: h */
        boolean m20355h();

        /* renamed from: i */
        int m20356i();

        boolean isConnected();

        /* renamed from: j */
        C4858d[] m20357j();

        /* renamed from: k */
        String m20358k();

        /* renamed from: l */
        boolean mo16774l();

        /* renamed from: o */
        void m20359o(AbstractC5358c.e eVar);
    }

    /* renamed from: j4.a$g */
    /* loaded from: classes.dex */
    public static final class g extends c {
    }

    public C4987a(String str, a aVar, g gVar) {
        AbstractC5391n.m21784j(aVar, "Cannot construct an Api with a null ClientBuilder");
        AbstractC5391n.m21784j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f20726c = str;
        this.f20724a = aVar;
        this.f20725b = gVar;
    }

    /* renamed from: a */
    public final a m20345a() {
        return this.f20724a;
    }

    /* renamed from: b */
    public final String m20346b() {
        return this.f20726c;
    }
}
