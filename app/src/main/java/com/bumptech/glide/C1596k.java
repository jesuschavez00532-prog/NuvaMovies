package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p003a2.AbstractC0005a;
import p003a2.C0006b;
import p003a2.C0010f;
import p003a2.C0012h;
import p003a2.C0014j;
import p003a2.C0015k;
import p003a2.InterfaceC0008d;
import p003a2.InterfaceC0009e;
import p003a2.InterfaceC0011g;
import p003a2.InterfaceFutureC0007c;
import p022b2.AbstractC1043k;
import p022b2.InterfaceC1042j;
import p109e2.AbstractC4115e;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p216l1.AbstractC5323j;

/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public class C1596k extends AbstractC0005a {

    /* renamed from: O */
    protected static final C0012h f6343O = (C0012h) ((C0012h) ((C0012h) new C0012h().mo53g(AbstractC5323j.f21745c)).mo51e0(EnumC1591h.LOW)).mo64m0(true);

    /* renamed from: A */
    private final Context f6344A;

    /* renamed from: B */
    private final ComponentCallbacks2C1597l f6345B;

    /* renamed from: C */
    private final Class f6346C;

    /* renamed from: D */
    private final ComponentCallbacks2C1586c f6347D;

    /* renamed from: E */
    private final C1588e f6348E;

    /* renamed from: F */
    private AbstractC1617m f6349F;

    /* renamed from: G */
    private Object f6350G;

    /* renamed from: H */
    private List f6351H;

    /* renamed from: I */
    private C1596k f6352I;

    /* renamed from: J */
    private C1596k f6353J;

    /* renamed from: K */
    private Float f6354K;

    /* renamed from: L */
    private boolean f6355L = true;

    /* renamed from: M */
    private boolean f6356M;

    /* renamed from: N */
    private boolean f6357N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6358a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6359b;

        static {
            int[] iArr = new int[EnumC1591h.values().length];
            f6359b = iArr;
            try {
                iArr[EnumC1591h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6359b[EnumC1591h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6359b[EnumC1591h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6359b[EnumC1591h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f6358a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6358a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6358a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6358a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6358a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6358a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6358a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6358a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1596k(ComponentCallbacks2C1586c componentCallbacks2C1586c, ComponentCallbacks2C1597l componentCallbacks2C1597l, Class cls, Context context) {
        this.f6347D = componentCallbacks2C1586c;
        this.f6345B = componentCallbacks2C1597l;
        this.f6346C = cls;
        this.f6344A = context;
        this.f6349F = componentCallbacks2C1597l.m7385k(cls);
        this.f6348E = componentCallbacks2C1586c.m7291j();
        m7354A0(componentCallbacks2C1597l.m7383i());
        mo43a(componentCallbacks2C1597l.m7384j());
    }

    /* renamed from: A0 */
    private void m7354A0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo7371t0((InterfaceC0011g) it.next());
        }
    }

    /* renamed from: C0 */
    private InterfaceC1042j m7355C0(InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, AbstractC0005a abstractC0005a, Executor executor) {
        AbstractC4121k.m17226d(interfaceC1042j);
        if (this.f6356M) {
            InterfaceC0008d m7359v0 = m7359v0(interfaceC1042j, interfaceC0011g, abstractC0005a, executor);
            InterfaceC0008d request = interfaceC1042j.getRequest();
            if (m7359v0.mo89d(request) && !m7356F0(abstractC0005a, request)) {
                if (!((InterfaceC0008d) AbstractC4121k.m17226d(request)).isRunning()) {
                    request.mo93h();
                }
                return interfaceC1042j;
            }
            this.f6345B.m7381f(interfaceC1042j);
            interfaceC1042j.setRequest(m7359v0);
            this.f6345B.m7393s(interfaceC1042j, m7359v0);
            return interfaceC1042j;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: F0 */
    private boolean m7356F0(AbstractC0005a abstractC0005a, InterfaceC0008d interfaceC0008d) {
        if (!abstractC0005a.m32K() && interfaceC0008d.mo95j()) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    private C1596k m7357J0(Object obj) {
        if (m30I()) {
            return clone().m7357J0(obj);
        }
        this.f6350G = obj;
        this.f6356M = true;
        return (C1596k) m56i0();
    }

    /* renamed from: K0 */
    private InterfaceC0008d m7358K0(Object obj, InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, AbstractC0005a abstractC0005a, InterfaceC0009e interfaceC0009e, AbstractC1617m abstractC1617m, EnumC1591h enumC1591h, int i10, int i11, Executor executor) {
        Context context = this.f6344A;
        C1588e c1588e = this.f6348E;
        return C0014j.m128y(context, c1588e, obj, this.f6350G, this.f6346C, abstractC0005a, i10, i11, enumC1591h, interfaceC1042j, interfaceC0011g, this.f6351H, interfaceC0009e, c1588e.m7312f(), abstractC1617m.m7457b(), executor);
    }

    /* renamed from: v0 */
    private InterfaceC0008d m7359v0(InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, AbstractC0005a abstractC0005a, Executor executor) {
        return m7360w0(new Object(), interfaceC1042j, interfaceC0011g, null, this.f6349F, abstractC0005a.m22A(), abstractC0005a.m79x(), abstractC0005a.m78w(), abstractC0005a, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w0 */
    private InterfaceC0008d m7360w0(Object obj, InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, InterfaceC0009e interfaceC0009e, AbstractC1617m abstractC1617m, EnumC1591h enumC1591h, int i10, int i11, AbstractC0005a abstractC0005a, Executor executor) {
        InterfaceC0009e interfaceC0009e2;
        InterfaceC0009e interfaceC0009e3;
        if (this.f6353J != null) {
            interfaceC0009e3 = new C0006b(obj, interfaceC0009e);
            interfaceC0009e2 = interfaceC0009e3;
        } else {
            interfaceC0009e2 = null;
            interfaceC0009e3 = interfaceC0009e;
        }
        InterfaceC0008d m7361x0 = m7361x0(obj, interfaceC1042j, interfaceC0011g, interfaceC0009e3, abstractC1617m, enumC1591h, i10, i11, abstractC0005a, executor);
        if (interfaceC0009e2 == null) {
            return m7361x0;
        }
        int m79x = this.f6353J.m79x();
        int m78w = this.f6353J.m78w();
        if (AbstractC4122l.m17249v(i10, i11) && !this.f6353J.m38U()) {
            m79x = abstractC0005a.m79x();
            m78w = abstractC0005a.m78w();
        }
        C1596k c1596k = this.f6353J;
        C0006b c0006b = interfaceC0009e2;
        c0006b.m97p(m7361x0, c1596k.m7360w0(obj, interfaceC1042j, interfaceC0011g, c0006b, c1596k.f6349F, c1596k.m22A(), m79x, m78w, this.f6353J, executor));
        return c0006b;
    }

    /* renamed from: x0 */
    private InterfaceC0008d m7361x0(Object obj, InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, InterfaceC0009e interfaceC0009e, AbstractC1617m abstractC1617m, EnumC1591h enumC1591h, int i10, int i11, AbstractC0005a abstractC0005a, Executor executor) {
        AbstractC1617m abstractC1617m2;
        EnumC1591h m7362z0;
        C1596k c1596k = this.f6352I;
        if (c1596k != null) {
            if (!this.f6357N) {
                AbstractC1617m abstractC1617m3 = c1596k.f6349F;
                if (c1596k.f6355L) {
                    abstractC1617m2 = abstractC1617m;
                } else {
                    abstractC1617m2 = abstractC1617m3;
                }
                if (c1596k.m33L()) {
                    m7362z0 = this.f6352I.m22A();
                } else {
                    m7362z0 = m7362z0(enumC1591h);
                }
                EnumC1591h enumC1591h2 = m7362z0;
                int m79x = this.f6352I.m79x();
                int m78w = this.f6352I.m78w();
                if (AbstractC4122l.m17249v(i10, i11) && !this.f6352I.m38U()) {
                    m79x = abstractC0005a.m79x();
                    m78w = abstractC0005a.m78w();
                }
                C0015k c0015k = new C0015k(obj, interfaceC0009e);
                InterfaceC0008d m7358K0 = m7358K0(obj, interfaceC1042j, interfaceC0011g, abstractC0005a, c0015k, abstractC1617m, enumC1591h, i10, i11, executor);
                this.f6357N = true;
                C1596k c1596k2 = this.f6352I;
                InterfaceC0008d m7360w0 = c1596k2.m7360w0(obj, interfaceC1042j, interfaceC0011g, c0015k, abstractC1617m2, enumC1591h2, m79x, m78w, c1596k2, executor);
                this.f6357N = false;
                c0015k.m135o(m7358K0, m7360w0);
                return c0015k;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (this.f6354K != null) {
            C0015k c0015k2 = new C0015k(obj, interfaceC0009e);
            c0015k2.m135o(m7358K0(obj, interfaceC1042j, interfaceC0011g, abstractC0005a, c0015k2, abstractC1617m, enumC1591h, i10, i11, executor), m7358K0(obj, interfaceC1042j, interfaceC0011g, abstractC0005a.clone().mo62l0(this.f6354K.floatValue()), c0015k2, abstractC1617m, m7362z0(enumC1591h), i10, i11, executor));
            return c0015k2;
        }
        return m7358K0(obj, interfaceC1042j, interfaceC0011g, abstractC0005a, interfaceC0009e, abstractC1617m, enumC1591h, i10, i11, executor);
    }

    /* renamed from: z0 */
    private EnumC1591h m7362z0(EnumC1591h enumC1591h) {
        int i10 = a.f6359b[enumC1591h.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalArgumentException("unknown priority: " + m22A());
                }
                return EnumC1591h.IMMEDIATE;
            }
            return EnumC1591h.HIGH;
        }
        return EnumC1591h.NORMAL;
    }

    /* renamed from: B0 */
    public InterfaceC1042j m7363B0(InterfaceC1042j interfaceC1042j) {
        return m7364D0(interfaceC1042j, null, AbstractC4115e.m17207b());
    }

    /* renamed from: D0 */
    InterfaceC1042j m7364D0(InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, Executor executor) {
        return m7355C0(interfaceC1042j, interfaceC0011g, this, executor);
    }

    /* renamed from: E0 */
    public AbstractC1043k m7365E0(ImageView imageView) {
        AbstractC0005a abstractC0005a;
        AbstractC4122l.m17229b();
        AbstractC4121k.m17226d(imageView);
        if (!m37R() && m35P() && imageView.getScaleType() != null) {
            switch (a.f6358a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC0005a = clone().mo40W();
                    break;
                case 2:
                    abstractC0005a = clone().mo41X();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC0005a = clone().mo42Y();
                    break;
                case 6:
                    abstractC0005a = clone().mo41X();
                    break;
            }
            return (AbstractC1043k) m7355C0(this.f6348E.m7307a(imageView, this.f6346C), null, abstractC0005a, AbstractC4115e.m17207b());
        }
        abstractC0005a = this;
        return (AbstractC1043k) m7355C0(this.f6348E.m7307a(imageView, this.f6346C), null, abstractC0005a, AbstractC4115e.m17207b());
    }

    /* renamed from: G0 */
    public C1596k mo7366G0(File file) {
        return m7357J0(file);
    }

    /* renamed from: H0 */
    public C1596k mo7367H0(Object obj) {
        return m7357J0(obj);
    }

    /* renamed from: I0 */
    public C1596k mo7368I0(String str) {
        return m7357J0(str);
    }

    /* renamed from: L0 */
    public InterfaceFutureC0007c m7369L0() {
        return m7370M0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: M0 */
    public InterfaceFutureC0007c m7370M0(int i10, int i11) {
        C0010f c0010f = new C0010f(i10, i11);
        return (InterfaceFutureC0007c) m7364D0(c0010f, c0010f, AbstractC4115e.m17206a());
    }

    @Override // p003a2.AbstractC0005a
    public boolean equals(Object obj) {
        if (!(obj instanceof C1596k)) {
            return false;
        }
        C1596k c1596k = (C1596k) obj;
        if (!super.equals(c1596k) || !Objects.equals(this.f6346C, c1596k.f6346C) || !this.f6349F.equals(c1596k.f6349F) || !Objects.equals(this.f6350G, c1596k.f6350G) || !Objects.equals(this.f6351H, c1596k.f6351H) || !Objects.equals(this.f6352I, c1596k.f6352I) || !Objects.equals(this.f6353J, c1596k.f6353J) || !Objects.equals(this.f6354K, c1596k.f6354K) || this.f6355L != c1596k.f6355L || this.f6356M != c1596k.f6356M) {
            return false;
        }
        return true;
    }

    @Override // p003a2.AbstractC0005a
    public int hashCode() {
        return AbstractC4122l.m17245r(this.f6356M, AbstractC4122l.m17245r(this.f6355L, AbstractC4122l.m17244q(this.f6354K, AbstractC4122l.m17244q(this.f6353J, AbstractC4122l.m17244q(this.f6352I, AbstractC4122l.m17244q(this.f6351H, AbstractC4122l.m17244q(this.f6350G, AbstractC4122l.m17244q(this.f6349F, AbstractC4122l.m17244q(this.f6346C, super.hashCode())))))))));
    }

    /* renamed from: t0 */
    public C1596k mo7371t0(InterfaceC0011g interfaceC0011g) {
        if (m30I()) {
            return clone().mo7371t0(interfaceC0011g);
        }
        if (interfaceC0011g != null) {
            if (this.f6351H == null) {
                this.f6351H = new ArrayList();
            }
            this.f6351H.add(interfaceC0011g);
        }
        return (C1596k) m56i0();
    }

    @Override // p003a2.AbstractC0005a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C1596k mo43a(AbstractC0005a abstractC0005a) {
        AbstractC4121k.m17226d(abstractC0005a);
        return (C1596k) super.mo43a(abstractC0005a);
    }

    @Override // p003a2.AbstractC0005a
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C1596k clone() {
        C1596k c1596k = (C1596k) super.clone();
        c1596k.f6349F = c1596k.f6349F.clone();
        if (c1596k.f6351H != null) {
            c1596k.f6351H = new ArrayList(c1596k.f6351H);
        }
        C1596k c1596k2 = c1596k.f6352I;
        if (c1596k2 != null) {
            c1596k.f6352I = c1596k2.clone();
        }
        C1596k c1596k3 = c1596k.f6353J;
        if (c1596k3 != null) {
            c1596k.f6353J = c1596k3.clone();
        }
        return c1596k;
    }
}
