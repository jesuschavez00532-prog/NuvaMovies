package p258o3;

import android.content.Context;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1441a;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p232m3.C5592h;
import p232m3.InterfaceC5585a;
import p280p3.C6193e;

/* renamed from: o3.e */
/* loaded from: classes.dex */
public final class C5909e {

    /* renamed from: f */
    public static final a f23504f = new a(null);

    /* renamed from: g */
    private static C5909e f23505g;

    /* renamed from: a */
    private final Context f23506a;

    /* renamed from: b */
    private final String f23507b;

    /* renamed from: c */
    private final InterfaceC1312h f23508c;

    /* renamed from: d */
    private boolean f23509d;

    /* renamed from: e */
    private boolean f23510e;

    /* renamed from: o3.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5909e m23878a(Context context) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            if (C5909e.f23505g == null) {
                synchronized (C5909e.class) {
                    if (C5909e.f23505g == null) {
                        C5909e.f23505g = new C5909e(context, null);
                    }
                    C1328x c1328x = C1328x.f4998a;
                }
            }
            C5909e c5909e = C5909e.f23505g;
            AbstractC5868k.m23671c(c5909e);
            return c5909e;
        }
    }

    /* renamed from: o3.e$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6193e invoke() {
            return new C6193e(C5909e.this.f23506a);
        }
    }

    /* renamed from: o3.e$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC5585a {
        c() {
        }

        @Override // p232m3.InterfaceC5585a
        /* renamed from: a */
        public void mo22681a() {
            try {
                C5909e.this.f23510e = false;
                C5913i.m23914d(C5909e.this.m23870j());
                C5909e c5909e = C5909e.this;
                c5909e.f23509d = c5909e.m23870j().m24730a();
                C5909e.this.m23870j().setVisibility(0);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: o3.e$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC5585a {
        d() {
        }

        @Override // p232m3.InterfaceC5585a
        /* renamed from: a */
        public void mo22681a() {
        }
    }

    public /* synthetic */ C5909e(Context context, AbstractC5864g abstractC5864g) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final C6193e m23870j() {
        return (C6193e) this.f23508c.getValue();
    }

    /* renamed from: k */
    public static final C5909e m23871k(Context context) {
        return f23504f.m23878a(context);
    }

    /* renamed from: g */
    public final void m23872g() {
        if (this.f23509d && !this.f23510e) {
            m23870j().setVisibility(8);
            this.f23510e = true;
        }
    }

    /* renamed from: h */
    public final void m23873h() {
        if (!this.f23509d) {
            return;
        }
        this.f23510e = false;
        this.f23509d = !m23870j().m24731b();
        C5913i.m23914d(m23870j());
    }

    /* renamed from: i */
    public final void m23874i() {
        if (this.f23509d && this.f23510e) {
            m23870j().setVisibility(0);
            this.f23510e = false;
        }
    }

    /* renamed from: l */
    public final void m23875l(int i10) {
        if (this.f23509d) {
            m23870j().setState(i10);
        }
    }

    /* renamed from: m */
    public final void m23876m() {
        if (this.f23509d) {
            return;
        }
        C5592h.f22623a.m22707d(C1441a.f5552a.m6707e()).m22687f(new c()).m22686e(new d()).mo22688g();
    }

    /* renamed from: n */
    public final void m23877n(long j10) {
        if (this.f23509d) {
            m23870j().m24732c(j10);
        }
    }

    private C5909e(Context context) {
        InterfaceC1312h m5965b;
        Context applicationContext = context.getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "context.applicationContext");
        this.f23506a = applicationContext;
        this.f23507b = C5909e.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new b());
        this.f23508c = m5965b;
    }
}
