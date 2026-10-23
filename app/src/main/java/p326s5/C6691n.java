package p326s5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: s5.n */
/* loaded from: classes.dex */
public class C6691n {

    /* renamed from: a */
    private final C6692o[] f25675a = new C6692o[4];

    /* renamed from: b */
    private final Matrix[] f25676b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f25677c = new Matrix[4];

    /* renamed from: d */
    private final PointF f25678d = new PointF();

    /* renamed from: e */
    private final C6692o f25679e = new C6692o();

    /* renamed from: f */
    private final float[] f25680f = new float[2];

    /* renamed from: g */
    private final float[] f25681g = new float[2];

    /* renamed from: s5.n$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo26114a(C6692o c6692o, Matrix matrix, int i10);

        /* renamed from: b */
        void mo26115b(C6692o c6692o, Matrix matrix, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final C6690m f25682a;

        /* renamed from: b */
        public final Path f25683b;

        /* renamed from: c */
        public final RectF f25684c;

        /* renamed from: d */
        public final a f25685d;

        /* renamed from: e */
        public final float f25686e;

        b(C6690m c6690m, float f10, RectF rectF, a aVar, Path path) {
            this.f25685d = aVar;
            this.f25682a = c6690m;
            this.f25686e = f10;
            this.f25684c = rectF;
            this.f25683b = path;
        }
    }

    public C6691n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f25675a[i10] = new C6692o();
            this.f25676b[i10] = new Matrix();
            this.f25677c[i10] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m26178a(int i10) {
        return (i10 + 1) * 90;
    }

    /* renamed from: b */
    private void m26179b(b bVar, int i10) {
        this.f25680f[0] = this.f25675a[i10].m26205j();
        this.f25680f[1] = this.f25675a[i10].m26206k();
        this.f25676b[i10].mapPoints(this.f25680f);
        if (i10 == 0) {
            Path path = bVar.f25683b;
            float[] fArr = this.f25680f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f25683b;
            float[] fArr2 = this.f25680f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f25675a[i10].m26201d(this.f25676b[i10], bVar.f25683b);
        a aVar = bVar.f25685d;
        if (aVar != null) {
            aVar.mo26115b(this.f25675a[i10], this.f25676b[i10], i10);
        }
    }

    /* renamed from: c */
    private void m26180c(b bVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f25680f[0] = this.f25675a[i10].m26203h();
        this.f25680f[1] = this.f25675a[i10].m26204i();
        this.f25676b[i10].mapPoints(this.f25680f);
        this.f25681g[0] = this.f25675a[i11].m26205j();
        this.f25681g[1] = this.f25675a[i11].m26206k();
        this.f25676b[i11].mapPoints(this.f25681g);
        float f10 = this.f25680f[0];
        float[] fArr = this.f25681g;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r0[1] - fArr[1])) - 0.001f, 0.0f);
        float m26184i = m26184i(bVar.f25684c, i10);
        this.f25679e.m26208m(0.0f, 0.0f);
        m26185j(i10, bVar.f25682a).m26058a(max, m26184i, bVar.f25686e, this.f25679e);
        this.f25679e.m26201d(this.f25677c[i10], bVar.f25683b);
        a aVar = bVar.f25685d;
        if (aVar != null) {
            aVar.mo26114a(this.f25679e, this.f25677c[i10], i10);
        }
    }

    /* renamed from: f */
    private void m26181f(int i10, RectF rectF, PointF pointF) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: g */
    private InterfaceC6680c m26182g(int i10, C6690m c6690m) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return c6690m.m26142t();
                }
                return c6690m.m26140r();
            }
            return c6690m.m26133j();
        }
        return c6690m.m26135l();
    }

    /* renamed from: h */
    private AbstractC6681d m26183h(int i10, C6690m c6690m) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return c6690m.m26141s();
                }
                return c6690m.m26139q();
            }
            return c6690m.m26132i();
        }
        return c6690m.m26134k();
    }

    /* renamed from: i */
    private float m26184i(RectF rectF, int i10) {
        float[] fArr = this.f25680f;
        C6692o c6692o = this.f25675a[i10];
        fArr[0] = c6692o.f25689c;
        fArr[1] = c6692o.f25690d;
        this.f25676b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f25680f[1]);
        }
        return Math.abs(rectF.centerX() - this.f25680f[0]);
    }

    /* renamed from: j */
    private C6683f m26185j(int i10, C6690m c6690m) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return c6690m.m26137o();
                }
                return c6690m.m26138p();
            }
            return c6690m.m26136n();
        }
        return c6690m.m26131h();
    }

    /* renamed from: k */
    private void m26186k(b bVar, int i10) {
        m26183h(i10, bVar.f25682a).m26057b(this.f25675a[i10], 90.0f, bVar.f25686e, bVar.f25684c, m26182g(i10, bVar.f25682a));
        float m26178a = m26178a(i10);
        this.f25676b[i10].reset();
        m26181f(i10, bVar.f25684c, this.f25678d);
        Matrix matrix = this.f25676b[i10];
        PointF pointF = this.f25678d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f25676b[i10].preRotate(m26178a);
    }

    /* renamed from: l */
    private void m26187l(int i10) throws java.io.IOException {
        this.f25680f[0] = this.f25675a[i10].m26203h();
        this.f25680f[1] = this.f25675a[i10].m26204i();
        this.f25676b[i10].mapPoints(this.f25680f);
        float m26178a = m26178a(i10);
        this.f25677c[i10].reset();
        Matrix matrix = this.f25677c[i10];
        float[] fArr = this.f25680f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f25677c[i10].preRotate(m26178a);
    }

    /* renamed from: d */
    public void m26188d(C6690m c6690m, float f10, RectF rectF, Path path) throws java.io.IOException {
        m26189e(c6690m, f10, rectF, null, path);
    }

    /* renamed from: e */
    public void m26189e(C6690m c6690m, float f10, RectF rectF, a aVar, Path path) throws java.io.IOException {
        path.rewind();
        b bVar = new b(c6690m, f10, rectF, aVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m26186k(bVar, i10);
            m26187l(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            m26179b(bVar, i11);
            m26180c(bVar, i11);
        }
        path.close();
    }
}
