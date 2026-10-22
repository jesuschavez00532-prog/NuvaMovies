package p241n;

import java.util.ArrayList;
import p228m.C5560c;
import p228m.C5562e;
import p241n.C5701e;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C5702f {

    /* renamed from: u0 */
    public static float f22784u0 = 0.5f;

    /* renamed from: B */
    C5701e f22786B;

    /* renamed from: C */
    protected C5701e[] f22787C;

    /* renamed from: D */
    protected ArrayList f22788D;

    /* renamed from: E */
    protected b[] f22789E;

    /* renamed from: F */
    C5702f f22790F;

    /* renamed from: G */
    int f22791G;

    /* renamed from: H */
    int f22792H;

    /* renamed from: I */
    protected float f22793I;

    /* renamed from: J */
    protected int f22794J;

    /* renamed from: K */
    protected int f22795K;

    /* renamed from: L */
    protected int f22796L;

    /* renamed from: M */
    int f22797M;

    /* renamed from: N */
    int f22798N;

    /* renamed from: O */
    private int f22799O;

    /* renamed from: P */
    private int f22800P;

    /* renamed from: Q */
    private int f22801Q;

    /* renamed from: R */
    private int f22802R;

    /* renamed from: S */
    protected int f22803S;

    /* renamed from: T */
    protected int f22804T;

    /* renamed from: U */
    int f22805U;

    /* renamed from: V */
    protected int f22806V;

    /* renamed from: W */
    protected int f22807W;

    /* renamed from: X */
    private int f22808X;

    /* renamed from: Y */
    private int f22809Y;

    /* renamed from: Z */
    float f22810Z;

    /* renamed from: a0 */
    float f22812a0;

    /* renamed from: b0 */
    private Object f22814b0;

    /* renamed from: c */
    C5710n f22815c;

    /* renamed from: c0 */
    private int f22816c0;

    /* renamed from: d */
    C5710n f22817d;

    /* renamed from: d0 */
    private int f22818d0;

    /* renamed from: e0 */
    private String f22820e0;

    /* renamed from: f0 */
    private String f22822f0;

    /* renamed from: g0 */
    boolean f22824g0;

    /* renamed from: h0 */
    boolean f22826h0;

    /* renamed from: i0 */
    boolean f22828i0;

    /* renamed from: j0 */
    boolean f22830j0;

    /* renamed from: k0 */
    boolean f22832k0;

    /* renamed from: l0 */
    int f22834l0;

    /* renamed from: m0 */
    int f22836m0;

    /* renamed from: n */
    boolean f22837n;

    /* renamed from: n0 */
    boolean f22838n0;

    /* renamed from: o */
    boolean f22839o;

    /* renamed from: o0 */
    boolean f22840o0;

    /* renamed from: p0 */
    float[] f22842p0;

    /* renamed from: q0 */
    protected C5702f[] f22844q0;

    /* renamed from: r0 */
    protected C5702f[] f22846r0;

    /* renamed from: s0 */
    C5702f f22848s0;

    /* renamed from: t0 */
    C5702f f22850t0;

    /* renamed from: a */
    public int f22811a = -1;

    /* renamed from: b */
    public int f22813b = -1;

    /* renamed from: e */
    int f22819e = 0;

    /* renamed from: f */
    int f22821f = 0;

    /* renamed from: g */
    int[] f22823g = new int[2];

    /* renamed from: h */
    int f22825h = 0;

    /* renamed from: i */
    int f22827i = 0;

    /* renamed from: j */
    float f22829j = 1.0f;

    /* renamed from: k */
    int f22831k = 0;

    /* renamed from: l */
    int f22833l = 0;

    /* renamed from: m */
    float f22835m = 1.0f;

    /* renamed from: p */
    int f22841p = -1;

    /* renamed from: q */
    float f22843q = 1.0f;

    /* renamed from: r */
    C5704h f22845r = null;

    /* renamed from: s */
    private int[] f22847s = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: t */
    private float f22849t = 0.0f;

    /* renamed from: u */
    C5701e f22851u = new C5701e(this, C5701e.d.LEFT);

    /* renamed from: v */
    C5701e f22852v = new C5701e(this, C5701e.d.TOP);

    /* renamed from: w */
    C5701e f22853w = new C5701e(this, C5701e.d.RIGHT);

    /* renamed from: x */
    C5701e f22854x = new C5701e(this, C5701e.d.BOTTOM);

    /* renamed from: y */
    C5701e f22855y = new C5701e(this, C5701e.d.BASELINE);

    /* renamed from: z */
    C5701e f22856z = new C5701e(this, C5701e.d.CENTER_X);

    /* renamed from: A */
    C5701e f22785A = new C5701e(this, C5701e.d.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22857a;

        /* renamed from: b */
        static final /* synthetic */ int[] f22858b;

        static {
            int[] iArr = new int[b.values().length];
            f22858b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22858b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22858b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22858b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C5701e.d.values().length];
            f22857a = iArr2;
            try {
                iArr2[C5701e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22857a[C5701e.d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22857a[C5701e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22857a[C5701e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22857a[C5701e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22857a[C5701e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22857a[C5701e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22857a[C5701e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22857a[C5701e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: n.f$b */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C5702f() {
        C5701e c5701e = new C5701e(this, C5701e.d.CENTER);
        this.f22786B = c5701e;
        this.f22787C = new C5701e[]{this.f22851u, this.f22853w, this.f22852v, this.f22854x, this.f22855y, c5701e};
        this.f22788D = new ArrayList();
        b bVar = b.FIXED;
        this.f22789E = new b[]{bVar, bVar};
        this.f22790F = null;
        this.f22791G = 0;
        this.f22792H = 0;
        this.f22793I = 0.0f;
        this.f22794J = -1;
        this.f22795K = 0;
        this.f22796L = 0;
        this.f22797M = 0;
        this.f22798N = 0;
        this.f22799O = 0;
        this.f22800P = 0;
        this.f22801Q = 0;
        this.f22802R = 0;
        this.f22803S = 0;
        this.f22804T = 0;
        this.f22805U = 0;
        float f10 = f22784u0;
        this.f22810Z = f10;
        this.f22812a0 = f10;
        this.f22816c0 = 0;
        this.f22818d0 = 0;
        this.f22820e0 = null;
        this.f22822f0 = null;
        this.f22828i0 = false;
        this.f22830j0 = false;
        this.f22832k0 = false;
        this.f22834l0 = 0;
        this.f22836m0 = 0;
        this.f22842p0 = new float[]{-1.0f, -1.0f};
        this.f22844q0 = new C5702f[]{null, null};
        this.f22846r0 = new C5702f[]{null, null};
        this.f22848s0 = null;
        this.f22850t0 = null;
        m22941a();
    }

    /* renamed from: K */
    private boolean m22940K(int i10) {
        C5701e c5701e;
        C5701e c5701e2;
        int i11 = i10 * 2;
        C5701e[] c5701eArr = this.f22787C;
        C5701e c5701e3 = c5701eArr[i11];
        C5701e c5701e4 = c5701e3.f22759d;
        if (c5701e4 != null && c5701e4.f22759d != c5701e3 && (c5701e2 = (c5701e = c5701eArr[i11 + 1]).f22759d) != null && c5701e2.f22759d == c5701e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m22941a() {
        this.f22788D.add(this.f22851u);
        this.f22788D.add(this.f22852v);
        this.f22788D.add(this.f22853w);
        this.f22788D.add(this.f22854x);
        this.f22788D.add(this.f22856z);
        this.f22788D.add(this.f22785A);
        this.f22788D.add(this.f22786B);
        this.f22788D.add(this.f22855y);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m22942e(p228m.C5562e r26, boolean r27, p228m.C5566i r28, p228m.C5566i r29, p241n.C5702f.b r30, boolean r31, p241n.C5701e r32, p241n.C5701e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.C5702f.m22942e(m.e, boolean, m.i, m.i, n.f$b, boolean, n.e, n.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public int m22943A() {
        return this.f22796L + this.f22804T;
    }

    /* renamed from: A0 */
    public void m22944A0(int i10) {
        this.f22809Y = i10;
    }

    /* renamed from: B */
    public b m22945B() {
        return this.f22789E[1];
    }

    /* renamed from: B0 */
    public void m22946B0(int i10) {
        this.f22808X = i10;
    }

    /* renamed from: C */
    public int m22947C() {
        return this.f22818d0;
    }

    /* renamed from: C0 */
    public void m22948C0(int i10) {
        this.f22795K = i10;
    }

    /* renamed from: D */
    public int m22949D() {
        if (this.f22818d0 == 8) {
            return 0;
        }
        return this.f22791G;
    }

    /* renamed from: D0 */
    public void m22950D0(int i10) {
        this.f22796L = i10;
    }

    /* renamed from: E */
    public int m22951E() {
        return this.f22809Y;
    }

    /* renamed from: E0 */
    public void m22952E0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f22841p == -1) {
            if (z12 && !z13) {
                this.f22841p = 0;
            } else if (!z12 && z13) {
                this.f22841p = 1;
                if (this.f22794J == -1) {
                    this.f22843q = 1.0f / this.f22843q;
                }
            }
        }
        if (this.f22841p == 0 && (!this.f22852v.m22936k() || !this.f22854x.m22936k())) {
            this.f22841p = 1;
        } else if (this.f22841p == 1 && (!this.f22851u.m22936k() || !this.f22853w.m22936k())) {
            this.f22841p = 0;
        }
        if (this.f22841p == -1 && (!this.f22852v.m22936k() || !this.f22854x.m22936k() || !this.f22851u.m22936k() || !this.f22853w.m22936k())) {
            if (this.f22852v.m22936k() && this.f22854x.m22936k()) {
                this.f22841p = 0;
            } else if (this.f22851u.m22936k() && this.f22853w.m22936k()) {
                this.f22843q = 1.0f / this.f22843q;
                this.f22841p = 1;
            }
        }
        if (this.f22841p == -1) {
            if (z10 && !z11) {
                this.f22841p = 0;
            } else if (!z10 && z11) {
                this.f22843q = 1.0f / this.f22843q;
                this.f22841p = 1;
            }
        }
        if (this.f22841p == -1) {
            int i10 = this.f22825h;
            if (i10 > 0 && this.f22831k == 0) {
                this.f22841p = 0;
            } else if (i10 == 0 && this.f22831k > 0) {
                this.f22843q = 1.0f / this.f22843q;
                this.f22841p = 1;
            }
        }
        if (this.f22841p == -1 && z10 && z11) {
            this.f22843q = 1.0f / this.f22843q;
            this.f22841p = 1;
        }
    }

    /* renamed from: F */
    public int m22953F() {
        return this.f22808X;
    }

    /* renamed from: F0 */
    public void mo22954F0() {
        int i10 = this.f22795K;
        int i11 = this.f22796L;
        int i12 = this.f22791G + i10;
        int i13 = this.f22792H + i11;
        this.f22799O = i10;
        this.f22800P = i11;
        this.f22801Q = i12 - i10;
        this.f22802R = i13 - i11;
    }

    /* renamed from: G */
    public int m22955G() {
        return this.f22795K;
    }

    /* renamed from: G0 */
    public void mo22956G0(C5562e c5562e) {
        int m22594z = c5562e.m22594z(this.f22851u);
        int m22594z2 = c5562e.m22594z(this.f22852v);
        int m22594z3 = c5562e.m22594z(this.f22853w);
        int m22594z4 = c5562e.m22594z(this.f22854x);
        int i10 = m22594z4 - m22594z2;
        if (m22594z3 - m22594z < 0 || i10 < 0 || m22594z == Integer.MIN_VALUE || m22594z == Integer.MAX_VALUE || m22594z2 == Integer.MIN_VALUE || m22594z2 == Integer.MAX_VALUE || m22594z3 == Integer.MIN_VALUE || m22594z3 == Integer.MAX_VALUE || m22594z4 == Integer.MIN_VALUE || m22594z4 == Integer.MAX_VALUE) {
            m22594z = 0;
            m22594z4 = 0;
            m22594z2 = 0;
            m22594z3 = 0;
        }
        m22974a0(m22594z, m22594z2, m22594z3, m22594z4);
    }

    /* renamed from: H */
    public int m22957H() {
        return this.f22796L;
    }

    /* renamed from: H0 */
    public void m22958H0() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f22787C[i10].m22931f().m23073q();
        }
    }

    /* renamed from: I */
    public boolean m22959I() {
        if (this.f22805U > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public void m22960J(C5701e.d dVar, C5702f c5702f, C5701e.d dVar2, int i10, int i11) {
        mo22983h(dVar).m22926a(c5702f.mo22983h(dVar2), i10, i11, C5701e.c.STRONG, 0, true);
    }

    /* renamed from: L */
    public boolean m22961L() {
        if (this.f22851u.m22931f().f22925b == 1 && this.f22853w.m22931f().f22925b == 1 && this.f22852v.m22931f().f22925b == 1 && this.f22854x.m22931f().f22925b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public boolean m22962M() {
        C5701e c5701e = this.f22851u;
        C5701e c5701e2 = c5701e.f22759d;
        if (c5701e2 == null || c5701e2.f22759d != c5701e) {
            C5701e c5701e3 = this.f22853w;
            C5701e c5701e4 = c5701e3.f22759d;
            if (c5701e4 != null && c5701e4.f22759d == c5701e3) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public boolean m22963N() {
        C5701e c5701e = this.f22852v;
        C5701e c5701e2 = c5701e.f22759d;
        if (c5701e2 == null || c5701e2.f22759d != c5701e) {
            C5701e c5701e3 = this.f22854x;
            C5701e c5701e4 = c5701e3.f22759d;
            if (c5701e4 != null && c5701e4.f22759d == c5701e3) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public boolean m22964O() {
        if (this.f22821f == 0 && this.f22793I == 0.0f && this.f22831k == 0 && this.f22833l == 0 && this.f22789E[1] == b.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public boolean m22965P() {
        if (this.f22819e != 0 || this.f22793I != 0.0f || this.f22825h != 0 || this.f22827i != 0 || this.f22789E[0] != b.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void mo22966Q() {
        this.f22851u.m22938m();
        this.f22852v.m22938m();
        this.f22853w.m22938m();
        this.f22854x.m22938m();
        this.f22855y.m22938m();
        this.f22856z.m22938m();
        this.f22785A.m22938m();
        this.f22786B.m22938m();
        this.f22790F = null;
        this.f22849t = 0.0f;
        this.f22791G = 0;
        this.f22792H = 0;
        this.f22793I = 0.0f;
        this.f22794J = -1;
        this.f22795K = 0;
        this.f22796L = 0;
        this.f22799O = 0;
        this.f22800P = 0;
        this.f22801Q = 0;
        this.f22802R = 0;
        this.f22803S = 0;
        this.f22804T = 0;
        this.f22805U = 0;
        this.f22806V = 0;
        this.f22807W = 0;
        this.f22808X = 0;
        this.f22809Y = 0;
        float f10 = f22784u0;
        this.f22810Z = f10;
        this.f22812a0 = f10;
        b[] bVarArr = this.f22789E;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f22814b0 = null;
        this.f22816c0 = 0;
        this.f22818d0 = 0;
        this.f22822f0 = null;
        this.f22824g0 = false;
        this.f22826h0 = false;
        this.f22834l0 = 0;
        this.f22836m0 = 0;
        this.f22838n0 = false;
        this.f22840o0 = false;
        float[] fArr = this.f22842p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f22811a = -1;
        this.f22813b = -1;
        int[] iArr = this.f22847s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f22819e = 0;
        this.f22821f = 0;
        this.f22829j = 1.0f;
        this.f22835m = 1.0f;
        this.f22827i = Integer.MAX_VALUE;
        this.f22833l = Integer.MAX_VALUE;
        this.f22825h = 0;
        this.f22831k = 0;
        this.f22841p = -1;
        this.f22843q = 1.0f;
        C5710n c5710n = this.f22815c;
        if (c5710n != null) {
            c5710n.mo23061e();
        }
        C5710n c5710n2 = this.f22817d;
        if (c5710n2 != null) {
            c5710n2.mo23061e();
        }
        this.f22845r = null;
        this.f22828i0 = false;
        this.f22830j0 = false;
        this.f22832k0 = false;
    }

    /* renamed from: R */
    public void m22967R() {
        C5702f m23009u = m23009u();
        if (m23009u != null && (m23009u instanceof C5703g) && ((C5703g) m23009u()).m23029T0()) {
            return;
        }
        int size = this.f22788D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C5701e) this.f22788D.get(i10)).m22938m();
        }
    }

    /* renamed from: S */
    public void mo22916S() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f22787C[i10].m22931f().mo23061e();
        }
    }

    /* renamed from: T */
    public void mo22968T(C5560c c5560c) {
        this.f22851u.m22939n(c5560c);
        this.f22852v.m22939n(c5560c);
        this.f22853w.m22939n(c5560c);
        this.f22854x.m22939n(c5560c);
        this.f22855y.m22939n(c5560c);
        this.f22786B.m22939n(c5560c);
        this.f22856z.m22939n(c5560c);
        this.f22785A.m22939n(c5560c);
    }

    /* renamed from: U */
    public void mo22917U() {
    }

    /* renamed from: V */
    public void m22969V(int i10) {
        this.f22805U = i10;
    }

    /* renamed from: W */
    public void m22970W(Object obj) {
        this.f22814b0 = obj;
    }

    /* renamed from: X */
    public void m22971X(String str) {
        this.f22820e0 = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:31:0x0088). Please report as a decompilation issue!!! */
    /* renamed from: Y */
    public void m22972Y(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                }
                i12 = i11;
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i11, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i12 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = 0.0f;
            } else {
                String substring4 = str.substring(i11);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = 0.0f;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.f22793I = f10;
                this.f22794J = i12;
                return;
            }
            return;
        }
        this.f22793I = 0.0f;
    }

    /* renamed from: Z */
    public void m22973Z(int i10, int i11, int i12) {
        if (i12 == 0) {
            m22980f0(i10, i11);
        } else if (i12 == 1) {
            m23008t0(i10, i11);
        }
        this.f22830j0 = true;
    }

    /* renamed from: a0 */
    public void m22974a0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f22795K = i10;
        this.f22796L = i11;
        if (this.f22818d0 == 8) {
            this.f22791G = 0;
            this.f22792H = 0;
            return;
        }
        b[] bVarArr = this.f22789E;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f22791G)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f22792H)) {
            i17 = i14;
        }
        this.f22791G = i16;
        this.f22792H = i17;
        int i18 = this.f22807W;
        if (i17 < i18) {
            this.f22792H = i18;
        }
        int i19 = this.f22806V;
        if (i16 < i19) {
            this.f22791G = i19;
        }
        this.f22830j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo22918b(p228m.C5562e r42) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.C5702f.mo22918b(m.e):void");
    }

    /* renamed from: b0 */
    public void m22975b0(int i10) {
        this.f22792H = i10;
        int i11 = this.f22807W;
        if (i10 < i11) {
            this.f22792H = i11;
        }
    }

    /* renamed from: c */
    public boolean mo22919c() {
        if (this.f22818d0 != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public void m22976c0(boolean z10) {
        this.f22839o = z10;
    }

    /* renamed from: d */
    public void mo22920d(int i10) {
        AbstractC5707k.m23056a(i10, this);
    }

    /* renamed from: d0 */
    public void m22977d0(float f10) {
        this.f22810Z = f10;
    }

    /* renamed from: e0 */
    public void m22978e0(int i10) {
        this.f22834l0 = i10;
    }

    /* renamed from: f */
    public void m22979f(C5702f c5702f, float f10, int i10) {
        C5701e.d dVar = C5701e.d.CENTER;
        m22960J(dVar, c5702f, dVar, i10, 0);
        this.f22849t = f10;
    }

    /* renamed from: f0 */
    public void m22980f0(int i10, int i11) {
        this.f22795K = i10;
        int i12 = i11 - i10;
        this.f22791G = i12;
        int i13 = this.f22806V;
        if (i12 < i13) {
            this.f22791G = i13;
        }
    }

    /* renamed from: g */
    public void m22981g(C5562e c5562e) {
        c5562e.m22589r(this.f22851u);
        c5562e.m22589r(this.f22852v);
        c5562e.m22589r(this.f22853w);
        c5562e.m22589r(this.f22854x);
        if (this.f22805U > 0) {
            c5562e.m22589r(this.f22855y);
        }
    }

    /* renamed from: g0 */
    public void m22982g0(b bVar) {
        this.f22789E[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            m23018y0(this.f22808X);
        }
    }

    /* renamed from: h */
    public C5701e mo22983h(C5701e.d dVar) {
        switch (a.f22857a[dVar.ordinal()]) {
            case 1:
                return this.f22851u;
            case 2:
                return this.f22852v;
            case 3:
                return this.f22853w;
            case 4:
                return this.f22854x;
            case 5:
                return this.f22855y;
            case 6:
                return this.f22786B;
            case 7:
                return this.f22856z;
            case 8:
                return this.f22785A;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    /* renamed from: h0 */
    public void m22984h0(int i10, int i11, int i12, float f10) {
        this.f22819e = i10;
        this.f22825h = i11;
        this.f22827i = i12;
        this.f22829j = f10;
        if (f10 < 1.0f && i10 == 0) {
            this.f22819e = 2;
        }
    }

    /* renamed from: i */
    public ArrayList mo22985i() {
        return this.f22788D;
    }

    /* renamed from: i0 */
    public void m22986i0(float f10) {
        this.f22842p0[0] = f10;
    }

    /* renamed from: j */
    public int m22987j() {
        return this.f22805U;
    }

    /* renamed from: j0 */
    public void m22988j0(int i10) {
        this.f22847s[1] = i10;
    }

    /* renamed from: k */
    public float m22989k(int i10) {
        if (i10 == 0) {
            return this.f22810Z;
        }
        if (i10 == 1) {
            return this.f22812a0;
        }
        return -1.0f;
    }

    /* renamed from: k0 */
    public void m22990k0(int i10) {
        this.f22847s[0] = i10;
    }

    /* renamed from: l */
    public int m22991l() {
        return m22957H() + this.f22792H;
    }

    /* renamed from: l0 */
    public void m22992l0(int i10) {
        if (i10 < 0) {
            this.f22807W = 0;
        } else {
            this.f22807W = i10;
        }
    }

    /* renamed from: m */
    public Object m22993m() {
        return this.f22814b0;
    }

    /* renamed from: m0 */
    public void m22994m0(int i10) {
        if (i10 < 0) {
            this.f22806V = 0;
        } else {
            this.f22806V = i10;
        }
    }

    /* renamed from: n */
    public String m22995n() {
        return this.f22820e0;
    }

    /* renamed from: n0 */
    public void mo22996n0(int i10, int i11) {
        this.f22803S = i10;
        this.f22804T = i11;
    }

    /* renamed from: o */
    public b m22997o(int i10) {
        if (i10 == 0) {
            return m23005s();
        }
        if (i10 == 1) {
            return m22945B();
        }
        return null;
    }

    /* renamed from: o0 */
    public void m22998o0(int i10, int i11) {
        this.f22795K = i10;
        this.f22796L = i11;
    }

    /* renamed from: p */
    public int m22999p() {
        return this.f22799O + this.f22803S;
    }

    /* renamed from: p0 */
    public void m23000p0(C5702f c5702f) {
        this.f22790F = c5702f;
    }

    /* renamed from: q */
    public int m23001q() {
        return this.f22800P + this.f22804T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m23002q0(int i10, int i11) {
        if (i11 == 0) {
            this.f22797M = i10;
        } else if (i11 == 1) {
            this.f22798N = i10;
        }
    }

    /* renamed from: r */
    public int m23003r() {
        if (this.f22818d0 == 8) {
            return 0;
        }
        return this.f22792H;
    }

    /* renamed from: r0 */
    public void m23004r0(float f10) {
        this.f22812a0 = f10;
    }

    /* renamed from: s */
    public b m23005s() {
        return this.f22789E[0];
    }

    /* renamed from: s0 */
    public void m23006s0(int i10) {
        this.f22836m0 = i10;
    }

    /* renamed from: t */
    public int m23007t(int i10) {
        if (i10 == 0) {
            return m22949D();
        }
        if (i10 == 1) {
            return m23003r();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void m23008t0(int i10, int i11) {
        this.f22796L = i10;
        int i12 = i11 - i10;
        this.f22792H = i12;
        int i13 = this.f22807W;
        if (i12 < i13) {
            this.f22792H = i13;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f22822f0 == null) {
            str = "";
        } else {
            str = "type: " + this.f22822f0 + " ";
        }
        sb2.append(str);
        if (this.f22820e0 != null) {
            str2 = "id: " + this.f22820e0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f22795K);
        sb2.append(", ");
        sb2.append(this.f22796L);
        sb2.append(") - (");
        sb2.append(this.f22791G);
        sb2.append(" x ");
        sb2.append(this.f22792H);
        sb2.append(") wrap: (");
        sb2.append(this.f22808X);
        sb2.append(" x ");
        sb2.append(this.f22809Y);
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public C5702f m23009u() {
        return this.f22790F;
    }

    /* renamed from: u0 */
    public void m23010u0(b bVar) {
        this.f22789E[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            m22975b0(this.f22809Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m23011v(int i10) {
        if (i10 == 0) {
            return this.f22797M;
        }
        if (i10 == 1) {
            return this.f22798N;
        }
        return 0;
    }

    /* renamed from: v0 */
    public void m23012v0(int i10, int i11, int i12, float f10) {
        this.f22821f = i10;
        this.f22831k = i11;
        this.f22833l = i12;
        this.f22835m = f10;
        if (f10 < 1.0f && i10 == 0) {
            this.f22821f = 2;
        }
    }

    /* renamed from: w */
    public C5710n m23013w() {
        if (this.f22817d == null) {
            this.f22817d = new C5710n();
        }
        return this.f22817d;
    }

    /* renamed from: w0 */
    public void m23014w0(float f10) {
        this.f22842p0[1] = f10;
    }

    /* renamed from: x */
    public C5710n m23015x() {
        if (this.f22815c == null) {
            this.f22815c = new C5710n();
        }
        return this.f22815c;
    }

    /* renamed from: x0 */
    public void m23016x0(int i10) {
        this.f22818d0 = i10;
    }

    /* renamed from: y */
    public int m23017y() {
        return m22955G() + this.f22791G;
    }

    /* renamed from: y0 */
    public void m23018y0(int i10) {
        this.f22791G = i10;
        int i11 = this.f22806V;
        if (i10 < i11) {
            this.f22791G = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public int m23019z() {
        return this.f22795K + this.f22803S;
    }

    /* renamed from: z0 */
    public void m23020z0(boolean z10) {
        this.f22837n = z10;
    }
}
