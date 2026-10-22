package p241n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p228m.AbstractC5563f;
import p228m.C5562e;
import p241n.C5701e;
import p241n.C5702f;

/* renamed from: n.g */
/* loaded from: classes.dex */
public class C5703g extends AbstractC5713q {

    /* renamed from: A0 */
    int f22864A0;

    /* renamed from: B0 */
    int f22865B0;

    /* renamed from: C0 */
    int f22866C0;

    /* renamed from: y0 */
    private C5712p f22884y0;

    /* renamed from: z0 */
    int f22885z0;

    /* renamed from: w0 */
    private boolean f22882w0 = false;

    /* renamed from: x0 */
    protected C5562e f22883x0 = new C5562e();

    /* renamed from: D0 */
    int f22867D0 = 0;

    /* renamed from: E0 */
    int f22868E0 = 0;

    /* renamed from: F0 */
    C5700d[] f22869F0 = new C5700d[4];

    /* renamed from: G0 */
    C5700d[] f22870G0 = new C5700d[4];

    /* renamed from: H0 */
    public List f22871H0 = new ArrayList();

    /* renamed from: I0 */
    public boolean f22872I0 = false;

    /* renamed from: J0 */
    public boolean f22873J0 = false;

    /* renamed from: K0 */
    public boolean f22874K0 = false;

    /* renamed from: L0 */
    public int f22875L0 = 0;

    /* renamed from: M0 */
    public int f22876M0 = 0;

    /* renamed from: N0 */
    private int f22877N0 = 7;

    /* renamed from: O0 */
    public boolean f22878O0 = false;

    /* renamed from: P0 */
    private boolean f22879P0 = false;

    /* renamed from: Q0 */
    private boolean f22880Q0 = false;

    /* renamed from: R0 */
    int f22881R0 = 0;

    /* renamed from: P0 */
    private void m23021P0(C5702f c5702f) {
        int i10 = this.f22867D0 + 1;
        C5700d[] c5700dArr = this.f22870G0;
        if (i10 >= c5700dArr.length) {
            this.f22870G0 = (C5700d[]) Arrays.copyOf(c5700dArr, c5700dArr.length * 2);
        }
        this.f22870G0[this.f22867D0] = new C5700d(c5702f, 0, m23031V0());
        this.f22867D0++;
    }

    /* renamed from: Q0 */
    private void m23022Q0(C5702f c5702f) {
        int i10 = this.f22868E0 + 1;
        C5700d[] c5700dArr = this.f22869F0;
        if (i10 >= c5700dArr.length) {
            this.f22869F0 = (C5700d[]) Arrays.copyOf(c5700dArr, c5700dArr.length * 2);
        }
        this.f22869F0[this.f22868E0] = new C5700d(c5702f, 1, m23031V0());
        this.f22868E0++;
    }

    /* renamed from: c1 */
    private void m23023c1() {
        this.f22867D0 = 0;
        this.f22868E0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0287  */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // p241n.AbstractC5713q
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo23024K0() {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.C5703g.mo23024K0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m23025N0(C5702f c5702f, int i10) {
        if (i10 == 0) {
            m23021P0(c5702f);
        } else if (i10 == 1) {
            m23022Q0(c5702f);
        }
    }

    /* renamed from: O0 */
    public boolean m23026O0(C5562e c5562e) {
        mo22918b(c5562e);
        int size = this.f22936v0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5702f c5702f = (C5702f) this.f22936v0.get(i10);
            if (c5702f instanceof C5703g) {
                C5702f.b[] bVarArr = c5702f.f22789E;
                C5702f.b bVar = bVarArr[0];
                C5702f.b bVar2 = bVarArr[1];
                C5702f.b bVar3 = C5702f.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c5702f.m22982g0(C5702f.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c5702f.m23010u0(C5702f.b.FIXED);
                }
                c5702f.mo22918b(c5562e);
                if (bVar == bVar3) {
                    c5702f.m22982g0(bVar);
                }
                if (bVar2 == bVar3) {
                    c5702f.m23010u0(bVar2);
                }
            } else {
                AbstractC5707k.m23058c(this, c5562e, c5702f);
                c5702f.mo22918b(c5562e);
            }
        }
        if (this.f22867D0 > 0) {
            AbstractC5699c.m22921a(this, c5562e, 0);
        }
        if (this.f22868E0 > 0) {
            AbstractC5699c.m22921a(this, c5562e, 1);
        }
        return true;
    }

    @Override // p241n.AbstractC5713q, p241n.C5702f
    /* renamed from: Q */
    public void mo22966Q() {
        this.f22883x0.m22575F();
        this.f22885z0 = 0;
        this.f22865B0 = 0;
        this.f22864A0 = 0;
        this.f22866C0 = 0;
        this.f22871H0.clear();
        this.f22878O0 = false;
        super.mo22966Q();
    }

    /* renamed from: R0 */
    public void m23027R0(AbstractC5563f abstractC5563f) {
        this.f22883x0.m22592w(abstractC5563f);
    }

    /* renamed from: S0 */
    public int m23028S0() {
        return this.f22877N0;
    }

    /* renamed from: T0 */
    public boolean m23029T0() {
        return false;
    }

    /* renamed from: U0 */
    public boolean m23030U0() {
        return this.f22880Q0;
    }

    /* renamed from: V0 */
    public boolean m23031V0() {
        return this.f22882w0;
    }

    /* renamed from: W0 */
    public boolean m23032W0() {
        return this.f22879P0;
    }

    /* renamed from: X0 */
    public void m23033X0() {
        if (!m23034Y0(8)) {
            mo22920d(this.f22877N0);
        }
        m23040f1();
    }

    /* renamed from: Y0 */
    public boolean m23034Y0(int i10) {
        if ((this.f22877N0 & i10) == i10) {
            return true;
        }
        return false;
    }

    /* renamed from: Z0 */
    public void m23035Z0(int i10, int i11) {
        C5710n c5710n;
        C5710n c5710n2;
        C5702f.b bVar = this.f22789E[0];
        C5702f.b bVar2 = C5702f.b.WRAP_CONTENT;
        if (bVar != bVar2 && (c5710n2 = this.f22815c) != null) {
            c5710n2.m23075h(i10);
        }
        if (this.f22789E[1] != bVar2 && (c5710n = this.f22817d) != null) {
            c5710n.m23075h(i11);
        }
    }

    /* renamed from: a1 */
    public void m23036a1() {
        int size = this.f22936v0.size();
        mo22916S();
        for (int i10 = 0; i10 < size; i10++) {
            ((C5702f) this.f22936v0.get(i10)).mo22916S();
        }
    }

    /* renamed from: b1 */
    public void m23037b1() {
        m23036a1();
        mo22920d(this.f22877N0);
    }

    @Override // p241n.C5702f
    /* renamed from: d */
    public void mo22920d(int i10) {
        super.mo22920d(i10);
        int size = this.f22936v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C5702f) this.f22936v0.get(i11)).mo22920d(i10);
        }
    }

    /* renamed from: d1 */
    public void m23038d1(int i10) {
        this.f22877N0 = i10;
    }

    /* renamed from: e1 */
    public void m23039e1(boolean z10) {
        this.f22882w0 = z10;
    }

    /* renamed from: f1 */
    public void m23040f1() {
        C5709m m22931f = mo22983h(C5701e.d.LEFT).m22931f();
        C5709m m22931f2 = mo22983h(C5701e.d.TOP).m22931f();
        m22931f.m23068l(null, 0.0f);
        m22931f2.m23068l(null, 0.0f);
    }

    /* renamed from: g1 */
    public void m23041g1(C5562e c5562e, boolean[] zArr) {
        zArr[2] = false;
        mo22956G0(c5562e);
        int size = this.f22936v0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5702f c5702f = (C5702f) this.f22936v0.get(i10);
            c5702f.mo22956G0(c5562e);
            C5702f.b bVar = c5702f.f22789E[0];
            C5702f.b bVar2 = C5702f.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && c5702f.m22949D() < c5702f.m22953F()) {
                zArr[2] = true;
            }
            if (c5702f.f22789E[1] == bVar2 && c5702f.m23003r() < c5702f.m22951E()) {
                zArr[2] = true;
            }
        }
    }
}
