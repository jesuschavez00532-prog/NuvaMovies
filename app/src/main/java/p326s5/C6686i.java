package p326s5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import p188j5.AbstractC4995a;
import p234m5.C5596a;
import p290q.InterfaceC6320y;
import p311r5.C6535a;
import p326s5.C6690m;
import p326s5.C6691n;
import p326s5.C6692o;
import p373w.AbstractC7338c;

/* renamed from: s5.i */
/* loaded from: classes.dex */
public class C6686i extends Drawable implements InterfaceC6320y, InterfaceC6693p {

    /* renamed from: v */
    private static final Paint f25601v = new Paint(1);

    /* renamed from: a */
    private c f25602a;

    /* renamed from: b */
    private final C6692o.g[] f25603b;

    /* renamed from: c */
    private final C6692o.g[] f25604c;

    /* renamed from: d */
    private boolean f25605d;

    /* renamed from: e */
    private final Matrix f25606e;

    /* renamed from: f */
    private final Path f25607f;

    /* renamed from: g */
    private final Path f25608g;

    /* renamed from: h */
    private final RectF f25609h;

    /* renamed from: i */
    private final RectF f25610i;

    /* renamed from: j */
    private final Region f25611j;

    /* renamed from: k */
    private final Region f25612k;

    /* renamed from: l */
    private C6690m f25613l;

    /* renamed from: m */
    private final Paint f25614m;

    /* renamed from: n */
    private final Paint f25615n;

    /* renamed from: o */
    private final C6535a f25616o;

    /* renamed from: p */
    private final C6691n.a f25617p;

    /* renamed from: q */
    private final C6691n f25618q;

    /* renamed from: r */
    private PorterDuffColorFilter f25619r;

    /* renamed from: s */
    private PorterDuffColorFilter f25620s;

    /* renamed from: t */
    private Rect f25621t;

    /* renamed from: u */
    private final RectF f25622u;

    /* renamed from: s5.i$a */
    /* loaded from: classes.dex */
    class a implements C6691n.a {
        a() {
        }

        @Override // p326s5.C6691n.a
        /* renamed from: a */
        public void mo26114a(C6692o c6692o, Matrix matrix, int i10) {
            C6686i.this.f25604c[i10] = c6692o.m26202e(matrix);
        }

        @Override // p326s5.C6691n.a
        /* renamed from: b */
        public void mo26115b(C6692o c6692o, Matrix matrix, int i10) {
            C6686i.this.f25603b[i10] = c6692o.m26202e(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.i$b */
    /* loaded from: classes.dex */
    public class b implements C6690m.c {

        /* renamed from: a */
        final /* synthetic */ float f25624a;

        b(float f10) {
            this.f25624a = f10;
        }

        @Override // p326s5.C6690m.c
        /* renamed from: a */
        public InterfaceC6680c mo26116a(InterfaceC6680c interfaceC6680c) {
            if (!(interfaceC6680c instanceof C6688k)) {
                return new C6679b(this.f25624a, interfaceC6680c);
            }
            return interfaceC6680c;
        }
    }

    /* synthetic */ C6686i(c cVar, a aVar) {
        this(cVar);
    }

    /* renamed from: B */
    private float m26061B() {
        if (m26064I()) {
            return this.f25615n.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: G */
    private boolean m26062G() {
        c cVar = this.f25602a;
        int i10 = cVar.f25642q;
        if (i10 != 1 && cVar.f25643r > 0 && (i10 == 2 || m26068P())) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private boolean m26063H() {
        Paint.Style style = this.f25602a.f25647v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private boolean m26064I() {
        Paint.Style style = this.f25602a.f25647v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f25615n.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private void m26065K() {
        super.invalidateSelf();
    }

    /* renamed from: N */
    private static int m26066N(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    /* renamed from: O */
    private void m26067O(Canvas canvas) {
        int m26112y = m26112y();
        int m26113z = m26113z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i10 = this.f25602a.f25643r;
            clipBounds.inset(-i10, -i10);
            clipBounds.offset(m26112y, m26113z);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(m26112y, m26113z);
    }

    /* renamed from: P */
    private boolean m26068P() {
        boolean isConvex;
        if (Build.VERSION.SDK_INT >= 21) {
            if (!m26094M()) {
                isConvex = this.f25607f.isConvex();
                if (!isConvex) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private boolean m26069Z(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f25602a.f25629d != null && color2 != (colorForState2 = this.f25602a.f25629d.getColorForState(iArr, (color2 = this.f25614m.getColor())))) {
            this.f25614m.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25602a.f25630e != null && color != (colorForState = this.f25602a.f25630e.getColorForState(iArr, (color = this.f25615n.getColor())))) {
            this.f25615n.setColor(colorForState);
            return true;
        }
        return z10;
    }

    /* renamed from: a0 */
    private boolean m26070a0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f25619r;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f25620s;
        c cVar = this.f25602a;
        this.f25619r = m26079j(cVar.f25632g, cVar.f25633h, this.f25614m, true);
        c cVar2 = this.f25602a;
        this.f25620s = m26079j(cVar2.f25631f, cVar2.f25633h, this.f25615n, false);
        c cVar3 = this.f25602a;
        if (cVar3.f25646u) {
            this.f25616o.m25575d(cVar3.f25632g.getColorForState(getState(), 0));
        }
        if (!AbstractC7338c.m28317a(porterDuffColorFilter, this.f25619r) || !AbstractC7338c.m28317a(porterDuffColorFilter2, this.f25620s)) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private void m26072b0() {
        float m26091F = m26091F();
        this.f25602a.f25643r = (int) Math.ceil(0.75f * m26091F);
        this.f25602a.f25644s = (int) Math.ceil(m26091F * 0.25f);
        m26070a0();
        m26065K();
    }

    /* renamed from: e */
    private PorterDuffColorFilter m26075e(Paint paint, boolean z10) {
        int color;
        int m26080k;
        if (z10 && (m26080k = m26080k((color = paint.getColor()))) != color) {
            return new PorterDuffColorFilter(m26080k, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: f */
    private void m26076f(RectF rectF, Path path) {
        m26104g(rectF, path);
        if (this.f25602a.f25635j != 1.0f) {
            this.f25606e.reset();
            Matrix matrix = this.f25606e;
            float f10 = this.f25602a.f25635j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f25606e);
        }
        path.computeBounds(this.f25622u, true);
    }

    /* renamed from: h */
    private void m26077h() {
        C6690m m26146x = m26087A().m26146x(new b(-m26061B()));
        this.f25613l = m26146x;
        this.f25618q.m26188d(m26146x, this.f25602a.f25636k, m26086u(), this.f25608g);
    }

    /* renamed from: i */
    private PorterDuffColorFilter m26078i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = m26080k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m26079j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return m26078i(colorStateList, mode, z10);
        }
        return m26075e(paint, z10);
    }

    /* renamed from: k */
    private int m26080k(int i10) {
        float m26091F = m26091F() + m26111x();
        C5596a c5596a = this.f25602a.f25627b;
        if (c5596a != null) {
            return c5596a.m22757c(i10, m26091F);
        }
        return i10;
    }

    /* renamed from: l */
    public static C6686i m26081l(Context context, float f10) {
        int m20372b = AbstractC4995a.m20372b(context, R$attr.colorSurface, C6686i.class.getSimpleName());
        C6686i c6686i = new C6686i();
        c6686i.m26092J(context);
        c6686i.m26096R(ColorStateList.valueOf(m20372b));
        c6686i.m26095Q(f10);
        return c6686i;
    }

    /* renamed from: m */
    private void m26082m(Canvas canvas) {
        if (this.f25602a.f25644s != 0) {
            canvas.drawPath(this.f25607f, this.f25616o.m25574c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f25603b[i10].m26237b(this.f25616o, this.f25602a.f25643r, canvas);
            this.f25604c[i10].m26237b(this.f25616o, this.f25602a.f25643r, canvas);
        }
        int m26112y = m26112y();
        int m26113z = m26113z();
        canvas.translate(-m26112y, -m26113z);
        canvas.drawPath(this.f25607f, f25601v);
        canvas.translate(m26112y, m26113z);
    }

    /* renamed from: n */
    private void m26083n(Canvas canvas) {
        m26084p(canvas, this.f25614m, this.f25607f, this.f25602a.f25626a, m26108t());
    }

    /* renamed from: p */
    private void m26084p(Canvas canvas, Paint paint, Path path, C6690m c6690m, RectF rectF) {
        if (c6690m.m26143u(rectF)) {
            float mo26055a = c6690m.m26142t().mo26055a(rectF);
            canvas.drawRoundRect(rectF, mo26055a, mo26055a, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: q */
    private void m26085q(Canvas canvas) {
        m26084p(canvas, this.f25615n, this.f25608g, this.f25613l, m26086u());
    }

    /* renamed from: u */
    private RectF m26086u() {
        RectF m26108t = m26108t();
        float m26061B = m26061B();
        this.f25610i.set(m26108t.left + m26061B, m26108t.top + m26061B, m26108t.right - m26061B, m26108t.bottom - m26061B);
        return this.f25610i;
    }

    /* renamed from: A */
    public C6690m m26087A() {
        return this.f25602a.f25626a;
    }

    /* renamed from: C */
    public float m26088C() {
        return this.f25602a.f25626a.m26140r().mo26055a(m26108t());
    }

    /* renamed from: D */
    public float m26089D() {
        return this.f25602a.f25626a.m26142t().mo26055a(m26108t());
    }

    /* renamed from: E */
    public float m26090E() {
        return this.f25602a.f25641p;
    }

    /* renamed from: F */
    public float m26091F() {
        return m26109v() + m26090E();
    }

    /* renamed from: J */
    public void m26092J(Context context) {
        this.f25602a.f25627b = new C5596a(context);
        m26072b0();
    }

    /* renamed from: L */
    public boolean m26093L() {
        C5596a c5596a = this.f25602a.f25627b;
        if (c5596a != null && c5596a.m22758d()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public boolean m26094M() {
        return this.f25602a.f25626a.m26143u(m26108t());
    }

    /* renamed from: Q */
    public void m26095Q(float f10) {
        c cVar = this.f25602a;
        if (cVar.f25640o != f10) {
            cVar.f25640o = f10;
            m26072b0();
        }
    }

    /* renamed from: R */
    public void m26096R(ColorStateList colorStateList) {
        c cVar = this.f25602a;
        if (cVar.f25629d != colorStateList) {
            cVar.f25629d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: S */
    public void m26097S(float f10) {
        c cVar = this.f25602a;
        if (cVar.f25636k != f10) {
            cVar.f25636k = f10;
            this.f25605d = true;
            invalidateSelf();
        }
    }

    /* renamed from: T */
    public void m26098T(int i10, int i11, int i12, int i13) {
        c cVar = this.f25602a;
        if (cVar.f25634i == null) {
            cVar.f25634i = new Rect();
        }
        this.f25602a.f25634i.set(i10, i11, i12, i13);
        this.f25621t = this.f25602a.f25634i;
        invalidateSelf();
    }

    /* renamed from: U */
    public void m26099U(float f10) {
        c cVar = this.f25602a;
        if (cVar.f25639n != f10) {
            cVar.f25639n = f10;
            m26072b0();
        }
    }

    /* renamed from: V */
    public void m26100V(float f10, int i10) {
        m26103Y(f10);
        m26102X(ColorStateList.valueOf(i10));
    }

    /* renamed from: W */
    public void m26101W(float f10, ColorStateList colorStateList) {
        m26103Y(f10);
        m26102X(colorStateList);
    }

    /* renamed from: X */
    public void m26102X(ColorStateList colorStateList) {
        c cVar = this.f25602a;
        if (cVar.f25630e != colorStateList) {
            cVar.f25630e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m26103Y(float f10) {
        this.f25602a.f25637l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f25614m.setColorFilter(this.f25619r);
        int alpha = this.f25614m.getAlpha();
        this.f25614m.setAlpha(m26066N(alpha, this.f25602a.f25638m));
        this.f25615n.setColorFilter(this.f25620s);
        this.f25615n.setStrokeWidth(this.f25602a.f25637l);
        int alpha2 = this.f25615n.getAlpha();
        this.f25615n.setAlpha(m26066N(alpha2, this.f25602a.f25638m));
        if (this.f25605d) {
            m26077h();
            m26076f(m26108t(), this.f25607f);
            this.f25605d = false;
        }
        if (m26062G()) {
            canvas.save();
            m26067O(canvas);
            int width = (int) (this.f25622u.width() - getBounds().width());
            int height = (int) (this.f25622u.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f25622u.width()) + (this.f25602a.f25643r * 2) + width, ((int) this.f25622u.height()) + (this.f25602a.f25643r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f25602a.f25643r) - width;
            float f11 = (getBounds().top - this.f25602a.f25643r) - height;
            canvas2.translate(-f10, -f11);
            m26082m(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (m26063H()) {
            m26083n(canvas);
        }
        if (m26064I()) {
            m26085q(canvas);
        }
        this.f25614m.setAlpha(alpha);
        this.f25615n.setAlpha(alpha2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m26104g(RectF rectF, Path path) {
        C6691n c6691n = this.f25618q;
        c cVar = this.f25602a;
        c6691n.m26189e(cVar.f25626a, cVar.f25636k, rectF, this.f25617p, path);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f25602a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        boolean isConvex;
        if (this.f25602a.f25642q == 2) {
            return;
        }
        if (m26094M()) {
            outline.setRoundRect(getBounds(), m26088C());
            return;
        }
        m26076f(m26108t(), this.f25607f);
        isConvex = this.f25607f.isConvex();
        if (isConvex) {
            outline.setConvexPath(this.f25607f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f25621t;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f25611j.set(getBounds());
        m26076f(m26108t(), this.f25607f);
        this.f25612k.setPath(this.f25607f, this.f25611j);
        this.f25611j.op(this.f25612k, Region.Op.DIFFERENCE);
        return this.f25611j;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f25605d = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f25602a.f25632g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f25602a.f25631f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f25602a.f25630e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f25602a.f25629d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f25602a = new c(this.f25602a);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m26105o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m26084p(canvas, paint, path, this.f25602a.f25626a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f25605d = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C2587e.b
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean m26069Z = m26069Z(iArr);
        boolean m26070a0 = m26070a0();
        if (!m26069Z && !m26070a0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* renamed from: r */
    public float m26106r() {
        return this.f25602a.f25626a.m26133j().mo26055a(m26108t());
    }

    /* renamed from: s */
    public float m26107s() {
        return this.f25602a.f25626a.m26135l().mo26055a(m26108t());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f25602a;
        if (cVar.f25638m != i10) {
            cVar.f25638m = i10;
            m26065K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25602a.f25628c = colorFilter;
        m26065K();
    }

    @Override // p326s5.InterfaceC6693p
    public void setShapeAppearanceModel(C6690m c6690m) {
        this.f25602a.f25626a = c6690m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        this.f25602a.f25632g = colorStateList;
        m26070a0();
        m26065K();
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f25602a;
        if (cVar.f25633h != mode) {
            cVar.f25633h = mode;
            m26070a0();
            m26065K();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public RectF m26108t() {
        Rect bounds = getBounds();
        this.f25609h.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.f25609h;
    }

    /* renamed from: v */
    public float m26109v() {
        return this.f25602a.f25640o;
    }

    /* renamed from: w */
    public ColorStateList m26110w() {
        return this.f25602a.f25629d;
    }

    /* renamed from: x */
    public float m26111x() {
        return this.f25602a.f25639n;
    }

    /* renamed from: y */
    public int m26112y() {
        double d10 = this.f25602a.f25644s;
        double sin = Math.sin(Math.toRadians(r0.f25645t));
        Double.isNaN(d10);
        return (int) (d10 * sin);
    }

    /* renamed from: z */
    public int m26113z() {
        double d10 = this.f25602a.f25644s;
        double cos = Math.cos(Math.toRadians(r0.f25645t));
        Double.isNaN(d10);
        return (int) (d10 * cos);
    }

    public C6686i() {
        this(new C6690m());
    }

    public C6686i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C6690m.m26127e(context, attributeSet, i10, i11).m26165m());
    }

    public C6686i(C6690m c6690m) {
        this(new c(c6690m, null));
    }

    private C6686i(c cVar) {
        this.f25603b = new C6692o.g[4];
        this.f25604c = new C6692o.g[4];
        this.f25606e = new Matrix();
        this.f25607f = new Path();
        this.f25608g = new Path();
        this.f25609h = new RectF();
        this.f25610i = new RectF();
        this.f25611j = new Region();
        this.f25612k = new Region();
        Paint paint = new Paint(1);
        this.f25614m = paint;
        Paint paint2 = new Paint(1);
        this.f25615n = paint2;
        this.f25616o = new C6535a();
        this.f25618q = new C6691n();
        this.f25622u = new RectF();
        this.f25602a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f25601v;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m26070a0();
        m26069Z(getState());
        this.f25617p = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s5.i$c */
    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public C6690m f25626a;

        /* renamed from: b */
        public C5596a f25627b;

        /* renamed from: c */
        public ColorFilter f25628c;

        /* renamed from: d */
        public ColorStateList f25629d;

        /* renamed from: e */
        public ColorStateList f25630e;

        /* renamed from: f */
        public ColorStateList f25631f;

        /* renamed from: g */
        public ColorStateList f25632g;

        /* renamed from: h */
        public PorterDuff.Mode f25633h;

        /* renamed from: i */
        public Rect f25634i;

        /* renamed from: j */
        public float f25635j;

        /* renamed from: k */
        public float f25636k;

        /* renamed from: l */
        public float f25637l;

        /* renamed from: m */
        public int f25638m;

        /* renamed from: n */
        public float f25639n;

        /* renamed from: o */
        public float f25640o;

        /* renamed from: p */
        public float f25641p;

        /* renamed from: q */
        public int f25642q;

        /* renamed from: r */
        public int f25643r;

        /* renamed from: s */
        public int f25644s;

        /* renamed from: t */
        public int f25645t;

        /* renamed from: u */
        public boolean f25646u;

        /* renamed from: v */
        public Paint.Style f25647v;

        public c(C6690m c6690m, C5596a c5596a) {
            this.f25629d = null;
            this.f25630e = null;
            this.f25631f = null;
            this.f25632g = null;
            this.f25633h = PorterDuff.Mode.SRC_IN;
            this.f25634i = null;
            this.f25635j = 1.0f;
            this.f25636k = 1.0f;
            this.f25638m = 255;
            this.f25639n = 0.0f;
            this.f25640o = 0.0f;
            this.f25641p = 0.0f;
            this.f25642q = 0;
            this.f25643r = 0;
            this.f25644s = 0;
            this.f25645t = 0;
            this.f25646u = false;
            this.f25647v = Paint.Style.FILL_AND_STROKE;
            this.f25626a = c6690m;
            this.f25627b = c5596a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C6686i c6686i = new C6686i(this, null);
            c6686i.f25605d = true;
            return c6686i;
        }

        public c(c cVar) {
            this.f25629d = null;
            this.f25630e = null;
            this.f25631f = null;
            this.f25632g = null;
            this.f25633h = PorterDuff.Mode.SRC_IN;
            this.f25634i = null;
            this.f25635j = 1.0f;
            this.f25636k = 1.0f;
            this.f25638m = 255;
            this.f25639n = 0.0f;
            this.f25640o = 0.0f;
            this.f25641p = 0.0f;
            this.f25642q = 0;
            this.f25643r = 0;
            this.f25644s = 0;
            this.f25645t = 0;
            this.f25646u = false;
            this.f25647v = Paint.Style.FILL_AND_STROKE;
            this.f25626a = cVar.f25626a;
            this.f25627b = cVar.f25627b;
            this.f25637l = cVar.f25637l;
            this.f25628c = cVar.f25628c;
            this.f25629d = cVar.f25629d;
            this.f25630e = cVar.f25630e;
            this.f25633h = cVar.f25633h;
            this.f25632g = cVar.f25632g;
            this.f25638m = cVar.f25638m;
            this.f25635j = cVar.f25635j;
            this.f25644s = cVar.f25644s;
            this.f25642q = cVar.f25642q;
            this.f25646u = cVar.f25646u;
            this.f25636k = cVar.f25636k;
            this.f25639n = cVar.f25639n;
            this.f25640o = cVar.f25640o;
            this.f25641p = cVar.f25641p;
            this.f25643r = cVar.f25643r;
            this.f25645t = cVar.f25645t;
            this.f25631f = cVar.f25631f;
            this.f25647v = cVar.f25647v;
            if (cVar.f25634i != null) {
                this.f25634i = new Rect(cVar.f25634i);
            }
        }
    }
}
