package p326s5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p311r5.C6535a;

/* renamed from: s5.o */
/* loaded from: classes.dex */
public class C6692o {

    /* renamed from: a */
    public float f25687a;

    /* renamed from: b */
    public float f25688b;

    /* renamed from: c */
    public float f25689c;

    /* renamed from: d */
    public float f25690d;

    /* renamed from: e */
    public float f25691e;

    /* renamed from: f */
    public float f25692f;

    /* renamed from: g */
    private final List f25693g = new ArrayList();

    /* renamed from: h */
    private final List f25694h = new ArrayList();

    /* renamed from: s5.o$a */
    /* loaded from: classes.dex */
    class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f25695b;

        /* renamed from: c */
        final /* synthetic */ Matrix f25696c;

        a(List list, Matrix matrix) {
            this.f25695b = list;
            this.f25696c = matrix;
        }

        @Override // p326s5.C6692o.g
        /* renamed from: a */
        public void mo26210a(Matrix matrix, C6535a c6535a, int i10, Canvas canvas) throws java.io.IOException {
            Iterator it = this.f25695b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo26210a(this.f25696c, c6535a, i10, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.o$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f25698b;

        public b(d dVar) {
            this.f25698b = dVar;
        }

        @Override // p326s5.C6692o.g
        /* renamed from: a */
        public void mo26210a(Matrix matrix, C6535a c6535a, int i10, Canvas canvas) throws java.io.IOException {
            c6535a.m25572a(canvas, matrix, new RectF(this.f25698b.m26221k(), this.f25698b.m26225o(), this.f25698b.m26222l(), this.f25698b.m26220j()), i10, this.f25698b.m26223m(), this.f25698b.m26224n());
        }
    }

    /* renamed from: s5.o$c */
    /* loaded from: classes.dex */
    static class c extends g {

        /* renamed from: b */
        private final e f25699b;

        /* renamed from: c */
        private final float f25700c;

        /* renamed from: d */
        private final float f25701d;

        public c(e eVar, float f10, float f11) {
            this.f25699b = eVar;
            this.f25700c = f10;
            this.f25701d = f11;
        }

        @Override // p326s5.C6692o.g
        /* renamed from: a */
        public void mo26210a(Matrix matrix, C6535a c6535a, int i10, Canvas canvas) throws java.io.IOException {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f25699b.f25710c - this.f25701d, this.f25699b.f25709b - this.f25700c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f25700c, this.f25701d);
            matrix2.preRotate(m26211c());
            c6535a.m25573b(canvas, matrix2, rectF, i10);
        }

        /* renamed from: c */
        float m26211c() {
            return (float) Math.toDegrees(Math.atan((this.f25699b.f25710c - this.f25701d) / (this.f25699b.f25709b - this.f25700c)));
        }
    }

    /* renamed from: s5.o$d */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h */
        private static final RectF f25702h = new RectF();

        /* renamed from: b */
        public float f25703b;

        /* renamed from: c */
        public float f25704c;

        /* renamed from: d */
        public float f25705d;

        /* renamed from: e */
        public float f25706e;

        /* renamed from: f */
        public float f25707f;

        /* renamed from: g */
        public float f25708g;

        public d(float f10, float f11, float f12, float f13) {
            m26227q(f10);
            m26231u(f11);
            m26228r(f12);
            m26226p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m26220j() {
            return this.f25706e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m26221k() {
            return this.f25703b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m26222l() {
            return this.f25705d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m26223m() {
            return this.f25707f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m26224n() {
            return this.f25708g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m26225o() {
            return this.f25704c;
        }

        /* renamed from: p */
        private void m26226p(float f10) {
            this.f25706e = f10;
        }

        /* renamed from: q */
        private void m26227q(float f10) {
            this.f25703b = f10;
        }

        /* renamed from: r */
        private void m26228r(float f10) {
            this.f25705d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m26229s(float f10) {
            this.f25707f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m26230t(float f10) {
            this.f25708g = f10;
        }

        /* renamed from: u */
        private void m26231u(float f10) {
            this.f25704c = f10;
        }

        @Override // p326s5.C6692o.f
        /* renamed from: a */
        public void mo26232a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25711a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f25702h;
            rectF.set(m26221k(), m26225o(), m26222l(), m26220j());
            path.arcTo(rectF, m26223m(), m26224n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: s5.o$e */
    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f25709b;

        /* renamed from: c */
        private float f25710c;

        @Override // p326s5.C6692o.f
        /* renamed from: a */
        public void mo26232a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25711a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f25709b, this.f25710c);
            path.transform(matrix);
        }
    }

    /* renamed from: s5.o$f */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f25711a = new Matrix();

        /* renamed from: a */
        public abstract void mo26232a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.o$g */
    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f25712a = new Matrix();

        g() {
        }

        /* renamed from: a */
        public abstract void mo26210a(Matrix matrix, C6535a c6535a, int i10, Canvas canvas) throws java.io.IOException;

        /* renamed from: b */
        public final void m26237b(C6535a c6535a, int i10, Canvas canvas) throws java.io.IOException {
            mo26210a(f25712a, c6535a, i10, canvas);
        }
    }

    public C6692o() {
        m26208m(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m26190b(float f10) {
        if (m26192f() == f10) {
            return;
        }
        float m26192f = ((f10 - m26192f()) + 360.0f) % 360.0f;
        if (m26192f > 180.0f) {
            return;
        }
        d dVar = new d(m26203h(), m26204i(), m26203h(), m26204i());
        dVar.m26229s(m26192f());
        dVar.m26230t(m26192f);
        this.f25694h.add(new b(dVar));
        m26194o(f10);
    }

    /* renamed from: c */
    private void m26191c(g gVar, float f10, float f11) {
        m26190b(f10);
        this.f25694h.add(gVar);
        m26194o(f11);
    }

    /* renamed from: f */
    private float m26192f() {
        return this.f25691e;
    }

    /* renamed from: g */
    private float m26193g() {
        return this.f25692f;
    }

    /* renamed from: o */
    private void m26194o(float f10) {
        this.f25691e = f10;
    }

    /* renamed from: p */
    private void m26195p(float f10) {
        this.f25692f = f10;
    }

    /* renamed from: q */
    private void m26196q(float f10) {
        this.f25689c = f10;
    }

    /* renamed from: r */
    private void m26197r(float f10) {
        this.f25690d = f10;
    }

    /* renamed from: s */
    private void m26198s(float f10) {
        this.f25687a = f10;
    }

    /* renamed from: t */
    private void m26199t(float f10) {
        this.f25688b = f10;
    }

    /* renamed from: a */
    public void m26200a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10 = false;
        float f16 = 0.0f;
        d dVar = new d(f10, f11, f12, f13);
        dVar.m26229s(f14);
        dVar.m26230t(f15);
        this.f25693g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        m26191c(bVar, f14, f16);
        double d10 = f17;
        m26196q(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        m26197r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    /* renamed from: d */
    public void m26201d(Matrix matrix, Path path) {
        int size = this.f25693g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f25693g.get(i10)).mo26232a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public g m26202e(Matrix matrix) {
        m26190b(m26193g());
        return new a(new ArrayList(this.f25694h), matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m26203h() {
        return this.f25689c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m26204i() {
        return this.f25690d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m26205j() {
        return this.f25687a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m26206k() {
        return this.f25688b;
    }

    /* renamed from: l */
    public void m26207l(float f10, float f11) {
        e eVar = new e();
        eVar.f25709b = f10;
        eVar.f25710c = f11;
        this.f25693g.add(eVar);
        c cVar = new c(eVar, m26203h(), m26204i());
        m26191c(cVar, cVar.m26211c() + 270.0f, cVar.m26211c() + 270.0f);
        m26196q(f10);
        m26197r(f11);
    }

    /* renamed from: m */
    public void m26208m(float f10, float f11) {
        m26209n(f10, f11, 270.0f, 0.0f);
    }

    /* renamed from: n */
    public void m26209n(float f10, float f11, float f12, float f13) {
        m26198s(f10);
        m26199t(f11);
        m26196q(f10);
        m26197r(f11);
        m26194o(f12);
        m26195p((f12 + f13) % 360.0f);
        this.f25693g.clear();
        this.f25694h.clear();
    }
}
