package p326s5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$styleable;

/* renamed from: s5.m */
/* loaded from: classes.dex */
public class C6690m {

    /* renamed from: m */
    public static final InterfaceC6680c f25650m = new C6688k(0.5f);

    /* renamed from: a */
    AbstractC6681d f25651a;

    /* renamed from: b */
    AbstractC6681d f25652b;

    /* renamed from: c */
    AbstractC6681d f25653c;

    /* renamed from: d */
    AbstractC6681d f25654d;

    /* renamed from: e */
    InterfaceC6680c f25655e;

    /* renamed from: f */
    InterfaceC6680c f25656f;

    /* renamed from: g */
    InterfaceC6680c f25657g;

    /* renamed from: h */
    InterfaceC6680c f25658h;

    /* renamed from: i */
    C6683f f25659i;

    /* renamed from: j */
    C6683f f25660j;

    /* renamed from: k */
    C6683f f25661k;

    /* renamed from: l */
    C6683f f25662l;

    /* renamed from: s5.m$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC6680c mo26116a(InterfaceC6680c interfaceC6680c);
    }

    /* renamed from: a */
    public static b m26123a() {
        return new b();
    }

    /* renamed from: b */
    public static b m26124b(Context context, int i10, int i11) {
        return m26125c(context, i10, i11, 0);
    }

    /* renamed from: c */
    private static b m26125c(Context context, int i10, int i11, int i12) {
        return m26126d(context, i10, i11, new C6678a(i12));
    }

    /* renamed from: d */
    private static b m26126d(Context context, int i10, int i11, InterfaceC6680c interfaceC6680c) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.f9356r0);
        try {
            int i12 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            InterfaceC6680c m26130m = m26130m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, interfaceC6680c);
            InterfaceC6680c m26130m2 = m26130m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, m26130m);
            InterfaceC6680c m26130m3 = m26130m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, m26130m);
            InterfaceC6680c m26130m4 = m26130m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, m26130m);
            return new b().m26175x(i13, m26130m2).m26161B(i14, m26130m3).m26171t(i15, m26130m4).m26167p(i16, m26130m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, m26130m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static b m26127e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return m26128f(context, attributeSet, i10, i11, 0);
    }

    /* renamed from: f */
    public static b m26128f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return m26129g(context, attributeSet, i10, i11, new C6678a(i12));
    }

    /* renamed from: g */
    public static b m26129g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC6680c interfaceC6680c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9328d0, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m26126d(context, resourceId, resourceId2, interfaceC6680c);
    }

    /* renamed from: m */
    private static InterfaceC6680c m26130m(TypedArray typedArray, int i10, InterfaceC6680c interfaceC6680c) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return interfaceC6680c;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new C6678a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new C6688k(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC6680c;
    }

    /* renamed from: h */
    public C6683f m26131h() {
        return this.f25661k;
    }

    /* renamed from: i */
    public AbstractC6681d m26132i() {
        return this.f25654d;
    }

    /* renamed from: j */
    public InterfaceC6680c m26133j() {
        return this.f25658h;
    }

    /* renamed from: k */
    public AbstractC6681d m26134k() {
        return this.f25653c;
    }

    /* renamed from: l */
    public InterfaceC6680c m26135l() {
        return this.f25657g;
    }

    /* renamed from: n */
    public C6683f m26136n() {
        return this.f25662l;
    }

    /* renamed from: o */
    public C6683f m26137o() {
        return this.f25660j;
    }

    /* renamed from: p */
    public C6683f m26138p() {
        return this.f25659i;
    }

    /* renamed from: q */
    public AbstractC6681d m26139q() {
        return this.f25651a;
    }

    /* renamed from: r */
    public InterfaceC6680c m26140r() {
        return this.f25655e;
    }

    /* renamed from: s */
    public AbstractC6681d m26141s() {
        return this.f25652b;
    }

    /* renamed from: t */
    public InterfaceC6680c m26142t() {
        return this.f25656f;
    }

    /* renamed from: u */
    public boolean m26143u(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f25662l.getClass().equals(C6683f.class) && this.f25660j.getClass().equals(C6683f.class) && this.f25659i.getClass().equals(C6683f.class) && this.f25661k.getClass().equals(C6683f.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float mo26055a = this.f25655e.mo26055a(rectF);
        if (this.f25656f.mo26055a(rectF) == mo26055a && this.f25658h.mo26055a(rectF) == mo26055a && this.f25657g.mo26055a(rectF) == mo26055a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f25652b instanceof C6689l) && (this.f25651a instanceof C6689l) && (this.f25653c instanceof C6689l) && (this.f25654d instanceof C6689l)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public b m26144v() {
        return new b(this);
    }

    /* renamed from: w */
    public C6690m m26145w(float f10) {
        return m26144v().m26166o(f10).m26165m();
    }

    /* renamed from: x */
    public C6690m m26146x(c cVar) {
        return m26144v().m26160A(cVar.mo26116a(m26140r())).m26164E(cVar.mo26116a(m26142t())).m26170s(cVar.mo26116a(m26133j())).m26174w(cVar.mo26116a(m26135l())).m26165m();
    }

    private C6690m(b bVar) {
        this.f25651a = bVar.f25663a;
        this.f25652b = bVar.f25664b;
        this.f25653c = bVar.f25665c;
        this.f25654d = bVar.f25666d;
        this.f25655e = bVar.f25667e;
        this.f25656f = bVar.f25668f;
        this.f25657g = bVar.f25669g;
        this.f25658h = bVar.f25670h;
        this.f25659i = bVar.f25671i;
        this.f25660j = bVar.f25672j;
        this.f25661k = bVar.f25673k;
        this.f25662l = bVar.f25674l;
    }

    /* renamed from: s5.m$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private AbstractC6681d f25663a;

        /* renamed from: b */
        private AbstractC6681d f25664b;

        /* renamed from: c */
        private AbstractC6681d f25665c;

        /* renamed from: d */
        private AbstractC6681d f25666d;

        /* renamed from: e */
        private InterfaceC6680c f25667e;

        /* renamed from: f */
        private InterfaceC6680c f25668f;

        /* renamed from: g */
        private InterfaceC6680c f25669g;

        /* renamed from: h */
        private InterfaceC6680c f25670h;

        /* renamed from: i */
        private C6683f f25671i;

        /* renamed from: j */
        private C6683f f25672j;

        /* renamed from: k */
        private C6683f f25673k;

        /* renamed from: l */
        private C6683f f25674l;

        public b() {
            this.f25663a = AbstractC6687j.m26118b();
            this.f25664b = AbstractC6687j.m26118b();
            this.f25665c = AbstractC6687j.m26118b();
            this.f25666d = AbstractC6687j.m26118b();
            this.f25667e = new C6678a(0.0f);
            this.f25668f = new C6678a(0.0f);
            this.f25669g = new C6678a(0.0f);
            this.f25670h = new C6678a(0.0f);
            this.f25671i = AbstractC6687j.m26119c();
            this.f25672j = AbstractC6687j.m26119c();
            this.f25673k = AbstractC6687j.m26119c();
            this.f25674l = AbstractC6687j.m26119c();
        }

        /* renamed from: n */
        private static float m26159n(AbstractC6681d abstractC6681d) {
            if (abstractC6681d instanceof C6689l) {
                return ((C6689l) abstractC6681d).f25649a;
            }
            if (abstractC6681d instanceof C6682e) {
                return ((C6682e) abstractC6681d).f25600a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public b m26160A(InterfaceC6680c interfaceC6680c) {
            this.f25667e = interfaceC6680c;
            return this;
        }

        /* renamed from: B */
        public b m26161B(int i10, InterfaceC6680c interfaceC6680c) {
            return m26162C(AbstractC6687j.m26117a(i10)).m26164E(interfaceC6680c);
        }

        /* renamed from: C */
        public b m26162C(AbstractC6681d abstractC6681d) {
            this.f25664b = abstractC6681d;
            float m26159n = m26159n(abstractC6681d);
            if (m26159n != -1.0f) {
                m26163D(m26159n);
            }
            return this;
        }

        /* renamed from: D */
        public b m26163D(float f10) {
            this.f25668f = new C6678a(f10);
            return this;
        }

        /* renamed from: E */
        public b m26164E(InterfaceC6680c interfaceC6680c) {
            this.f25668f = interfaceC6680c;
            return this;
        }

        /* renamed from: m */
        public C6690m m26165m() {
            return new C6690m(this);
        }

        /* renamed from: o */
        public b m26166o(float f10) {
            return m26177z(f10).m26163D(f10).m26173v(f10).m26169r(f10);
        }

        /* renamed from: p */
        public b m26167p(int i10, InterfaceC6680c interfaceC6680c) {
            return m26168q(AbstractC6687j.m26117a(i10)).m26170s(interfaceC6680c);
        }

        /* renamed from: q */
        public b m26168q(AbstractC6681d abstractC6681d) {
            this.f25666d = abstractC6681d;
            float m26159n = m26159n(abstractC6681d);
            if (m26159n != -1.0f) {
                m26169r(m26159n);
            }
            return this;
        }

        /* renamed from: r */
        public b m26169r(float f10) {
            this.f25670h = new C6678a(f10);
            return this;
        }

        /* renamed from: s */
        public b m26170s(InterfaceC6680c interfaceC6680c) {
            this.f25670h = interfaceC6680c;
            return this;
        }

        /* renamed from: t */
        public b m26171t(int i10, InterfaceC6680c interfaceC6680c) {
            return m26172u(AbstractC6687j.m26117a(i10)).m26174w(interfaceC6680c);
        }

        /* renamed from: u */
        public b m26172u(AbstractC6681d abstractC6681d) {
            this.f25665c = abstractC6681d;
            float m26159n = m26159n(abstractC6681d);
            if (m26159n != -1.0f) {
                m26173v(m26159n);
            }
            return this;
        }

        /* renamed from: v */
        public b m26173v(float f10) {
            this.f25669g = new C6678a(f10);
            return this;
        }

        /* renamed from: w */
        public b m26174w(InterfaceC6680c interfaceC6680c) {
            this.f25669g = interfaceC6680c;
            return this;
        }

        /* renamed from: x */
        public b m26175x(int i10, InterfaceC6680c interfaceC6680c) {
            return m26176y(AbstractC6687j.m26117a(i10)).m26160A(interfaceC6680c);
        }

        /* renamed from: y */
        public b m26176y(AbstractC6681d abstractC6681d) {
            this.f25663a = abstractC6681d;
            float m26159n = m26159n(abstractC6681d);
            if (m26159n != -1.0f) {
                m26177z(m26159n);
            }
            return this;
        }

        /* renamed from: z */
        public b m26177z(float f10) {
            this.f25667e = new C6678a(f10);
            return this;
        }

        public b(C6690m c6690m) {
            this.f25663a = AbstractC6687j.m26118b();
            this.f25664b = AbstractC6687j.m26118b();
            this.f25665c = AbstractC6687j.m26118b();
            this.f25666d = AbstractC6687j.m26118b();
            this.f25667e = new C6678a(0.0f);
            this.f25668f = new C6678a(0.0f);
            this.f25669g = new C6678a(0.0f);
            this.f25670h = new C6678a(0.0f);
            this.f25671i = AbstractC6687j.m26119c();
            this.f25672j = AbstractC6687j.m26119c();
            this.f25673k = AbstractC6687j.m26119c();
            this.f25674l = AbstractC6687j.m26119c();
            this.f25663a = c6690m.f25651a;
            this.f25664b = c6690m.f25652b;
            this.f25665c = c6690m.f25653c;
            this.f25666d = c6690m.f25654d;
            this.f25667e = c6690m.f25655e;
            this.f25668f = c6690m.f25656f;
            this.f25669g = c6690m.f25657g;
            this.f25670h = c6690m.f25658h;
            this.f25671i = c6690m.f25659i;
            this.f25672j = c6690m.f25660j;
            this.f25673k = c6690m.f25661k;
            this.f25674l = c6690m.f25662l;
        }
    }

    public C6690m() {
        this.f25651a = AbstractC6687j.m26118b();
        this.f25652b = AbstractC6687j.m26118b();
        this.f25653c = AbstractC6687j.m26118b();
        this.f25654d = AbstractC6687j.m26118b();
        this.f25655e = new C6678a(0.0f);
        this.f25656f = new C6678a(0.0f);
        this.f25657g = new C6678a(0.0f);
        this.f25658h = new C6678a(0.0f);
        this.f25659i = AbstractC6687j.m26119c();
        this.f25660j = AbstractC6687j.m26119c();
        this.f25661k = AbstractC6687j.m26119c();
        this.f25662l = AbstractC6687j.m26119c();
    }
}
