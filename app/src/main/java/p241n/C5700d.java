package p241n;

import java.util.ArrayList;
import p241n.C5702f;

/* renamed from: n.d */
/* loaded from: classes.dex */
public class C5700d {

    /* renamed from: a */
    protected C5702f f22739a;

    /* renamed from: b */
    protected C5702f f22740b;

    /* renamed from: c */
    protected C5702f f22741c;

    /* renamed from: d */
    protected C5702f f22742d;

    /* renamed from: e */
    protected C5702f f22743e;

    /* renamed from: f */
    protected C5702f f22744f;

    /* renamed from: g */
    protected C5702f f22745g;

    /* renamed from: h */
    protected ArrayList f22746h;

    /* renamed from: i */
    protected int f22747i;

    /* renamed from: j */
    protected int f22748j;

    /* renamed from: k */
    protected float f22749k = 0.0f;

    /* renamed from: l */
    private int f22750l;

    /* renamed from: m */
    private boolean f22751m;

    /* renamed from: n */
    protected boolean f22752n;

    /* renamed from: o */
    protected boolean f22753o;

    /* renamed from: p */
    protected boolean f22754p;

    /* renamed from: q */
    private boolean f22755q;

    public C5700d(C5702f c5702f, int i10, boolean z10) {
        this.f22739a = c5702f;
        this.f22750l = i10;
        this.f22751m = z10;
    }

    /* renamed from: b */
    private void m22923b() {
        int i10 = 0;
        int i11 = this.f22750l * 2;
        C5702f c5702f = this.f22739a;
        boolean z10 = false;
        C5702f c5702f2 = c5702f;
        boolean z11 = false;
        while (!z11) {
            this.f22747i++;
            C5702f[] c5702fArr = c5702f.f22846r0;
            int i12 = this.f22750l;
            C5702f c5702f3 = null;
            c5702fArr[i12] = null;
            c5702f.f22844q0[i12] = null;
            if (c5702f.m22947C() != 8) {
                if (this.f22740b == null) {
                    this.f22740b = c5702f;
                }
                this.f22742d = c5702f;
                C5702f.b[] bVarArr = c5702f.f22789E;
                int i13 = this.f22750l;
                if (bVarArr[i13] == C5702f.b.MATCH_CONSTRAINT && ((i10 = c5702f.f22823g[i13]) == 0 || i10 == 3 || i10 == 2)) {
                    this.f22748j++;
                    float f10 = c5702f.f22842p0[i13];
                    if (f10 > 0.0f) {
                        this.f22749k += f10;
                    }
                    if (m22924c(c5702f, i13)) {
                        if (f10 < 0.0f) {
                            this.f22752n = true;
                        } else {
                            this.f22753o = true;
                        }
                        if (this.f22746h == null) {
                            this.f22746h = new ArrayList();
                        }
                        this.f22746h.add(c5702f);
                    }
                    if (this.f22744f == null) {
                        this.f22744f = c5702f;
                    }
                    C5702f c5702f4 = this.f22745g;
                    if (c5702f4 != null) {
                        c5702f4.f22844q0[this.f22750l] = c5702f;
                    }
                    this.f22745g = c5702f;
                }
            }
            if (c5702f2 != c5702f) {
                c5702f2.f22846r0[this.f22750l] = c5702f;
            }
            C5701e c5701e = c5702f.f22787C[i11 + 1].f22759d;
            if (c5701e != null) {
                C5702f c5702f5 = c5701e.f22757b;
                C5701e c5701e2 = c5702f5.f22787C[i11].f22759d;
                if (c5701e2 != null && c5701e2.f22757b == c5702f) {
                    c5702f3 = c5702f5;
                }
            }
            if (c5702f3 == null) {
                c5702f3 = c5702f;
                z11 = true;
            }
            c5702f2 = c5702f;
            c5702f = c5702f3;
        }
        this.f22741c = c5702f;
        if (this.f22750l == 0 && this.f22751m) {
            this.f22743e = c5702f;
        } else {
            this.f22743e = this.f22739a;
        }
        if (this.f22753o && this.f22752n) {
            z10 = true;
        }
        this.f22754p = z10;
    }

    /* renamed from: c */
    private static boolean m22924c(C5702f c5702f, int i10) {
        int i11 = 0;
        if (c5702f.m22947C() != 8 && c5702f.f22789E[i10] == C5702f.b.MATCH_CONSTRAINT && ((i11 = c5702f.f22823g[i10]) == 0 || i11 == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m22925a() {
        if (!this.f22755q) {
            m22923b();
        }
        this.f22755q = true;
    }
}
