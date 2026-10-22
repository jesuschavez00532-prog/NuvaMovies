package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214l.C5303a;
import p254o.AbstractC5894i;
import p254o.AbstractC5896k;
import p254o.C5889d;
import p276p.AbstractC6135h;
import p290q.AbstractC6306k;

/* renamed from: androidx.vectordrawable.graphics.drawable.n */
/* loaded from: classes.dex */
public class C0852n extends AbstractC0851m {

    /* renamed from: k */
    static final PorterDuff.Mode f3567k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private h f3568b;

    /* renamed from: c */
    private PorterDuffColorFilter f3569c;

    /* renamed from: d */
    private ColorFilter f3570d;

    /* renamed from: e */
    private boolean f3571e;

    /* renamed from: f */
    private boolean f3572f;

    /* renamed from: g */
    private Drawable.ConstantState f3573g;

    /* renamed from: h */
    private final float[] f3574h;

    /* renamed from: i */
    private final Matrix f3575i;

    /* renamed from: j */
    private final Rect f3576j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        /* renamed from: f */
        private void m4363f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3603b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3602a = AbstractC6135h.m24441d(string2);
            }
            this.f3604c = AbstractC5896k.m23819g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0852n.f
        /* renamed from: c */
        public boolean mo4364c() {
            return true;
        }

        /* renamed from: e */
        public void m4365e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!AbstractC5896k.m23822j(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3540d);
            m4363f(m23823k, xmlPullParser);
            m23823k.recycle();
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        /* renamed from: a */
        public boolean mo4369a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo4370b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f3623a;

        /* renamed from: b */
        g f3624b;

        /* renamed from: c */
        ColorStateList f3625c;

        /* renamed from: d */
        PorterDuff.Mode f3626d;

        /* renamed from: e */
        boolean f3627e;

        /* renamed from: f */
        Bitmap f3628f;

        /* renamed from: g */
        ColorStateList f3629g;

        /* renamed from: h */
        PorterDuff.Mode f3630h;

        /* renamed from: i */
        int f3631i;

        /* renamed from: j */
        boolean f3632j;

        /* renamed from: k */
        boolean f3633k;

        /* renamed from: l */
        Paint f3634l;

        public h(h hVar) {
            this.f3625c = null;
            this.f3626d = C0852n.f3567k;
            if (hVar != null) {
                this.f3623a = hVar.f3623a;
                g gVar = new g(hVar.f3624b);
                this.f3624b = gVar;
                if (hVar.f3624b.f3611e != null) {
                    gVar.f3611e = new Paint(hVar.f3624b.f3611e);
                }
                if (hVar.f3624b.f3610d != null) {
                    this.f3624b.f3610d = new Paint(hVar.f3624b.f3610d);
                }
                this.f3625c = hVar.f3625c;
                this.f3626d = hVar.f3626d;
                this.f3627e = hVar.f3627e;
            }
        }

        /* renamed from: a */
        public boolean m4383a(int i10, int i11) {
            if (i10 == this.f3628f.getWidth() && i11 == this.f3628f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m4384b() {
            if (!this.f3633k && this.f3629g == this.f3625c && this.f3630h == this.f3626d && this.f3632j == this.f3627e && this.f3631i == this.f3624b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m4385c(int i10, int i11) {
            if (this.f3628f == null || !m4383a(i10, i11)) {
                this.f3628f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f3633k = true;
            }
        }

        /* renamed from: d */
        public void m4386d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3628f, (Rect) null, rect, m4387e(colorFilter));
        }

        /* renamed from: e */
        public Paint m4387e(ColorFilter colorFilter) {
            if (!m4388f() && colorFilter == null) {
                return null;
            }
            if (this.f3634l == null) {
                Paint paint = new Paint();
                this.f3634l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3634l.setAlpha(this.f3624b.getRootAlpha());
            this.f3634l.setColorFilter(colorFilter);
            return this.f3634l;
        }

        /* renamed from: f */
        public boolean m4388f() {
            if (this.f3624b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean m4389g() {
            return this.f3624b.m4381f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3623a;
        }

        /* renamed from: h */
        public boolean m4390h(int[] iArr) {
            boolean m4382g = this.f3624b.m4382g(iArr);
            this.f3633k |= m4382g;
            return m4382g;
        }

        /* renamed from: i */
        public void m4391i() {
            this.f3629g = this.f3625c;
            this.f3630h = this.f3626d;
            this.f3631i = this.f3624b.getRootAlpha();
            this.f3632j = this.f3627e;
            this.f3633k = false;
        }

        /* renamed from: j */
        public void m4392j(int i10, int i11) {
            this.f3628f.eraseColor(0);
            this.f3624b.m4380b(new Canvas(this.f3628f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0852n(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0852n(this);
        }

        public h() {
            this.f3625c = null;
            this.f3626d = C0852n.f3567k;
            this.f3624b = new g();
        }
    }

    C0852n() {
        this.f3572f = true;
        this.f3574h = new float[9];
        this.f3575i = new Matrix();
        this.f3576j = new Rect();
        this.f3568b = new h();
    }

    /* renamed from: a */
    static int m4353a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    /* renamed from: b */
    public static C0852n m4354b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0852n c0852n = new C0852n();
            c0852n.f3566a = AbstractC5894i.m23796d(resources, i10, theme);
            c0852n.f3573g = new i(c0852n.f3566a.getConstantState());
            return c0852n;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m4355c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    /* renamed from: c */
    public static C0852n m4355c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0852n c0852n = new C0852n();
        c0852n.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0852n;
    }

    /* renamed from: e */
    private void m4356e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f3568b;
        g gVar = hVar.f3624b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f3614h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m4371g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3590b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f3622p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f3623a = cVar.f3605d | hVar.f3623a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m4365e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3590b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f3622p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f3623a = bVar.f3605d | hVar.f3623a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m4374c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3590b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f3622p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f3623a = dVar2.f3599k | hVar.f3623a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z10) {
        } else {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m4357f() {
        if (isAutoMirrored() && AbstractC6306k.m25060f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m4358g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: i */
    private void m4359i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f3568b;
        g gVar = hVar.f3624b;
        hVar.f3626d = m4358g(AbstractC5896k.m23819g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m23815c = AbstractC5896k.m23815c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m23815c != null) {
            hVar.f3625c = m23815c;
        }
        hVar.f3627e = AbstractC5896k.m23813a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3627e);
        gVar.f3617k = AbstractC5896k.m23818f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3617k);
        float m23818f = AbstractC5896k.m23818f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3618l);
        gVar.f3618l = m23818f;
        if (gVar.f3617k > 0.0f) {
            if (m23818f > 0.0f) {
                gVar.f3615i = typedArray.getDimension(3, gVar.f3615i);
                float dimension = typedArray.getDimension(2, gVar.f3616j);
                gVar.f3616j = dimension;
                if (gVar.f3615i > 0.0f) {
                    if (dimension > 0.0f) {
                        gVar.setAlpha(AbstractC5896k.m23818f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            gVar.f3620n = string;
                            gVar.f3622p.put(string, gVar);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25056b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m4360d(String str) {
        return this.f3568b.f3624b.f3622p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3576j);
        if (this.f3576j.width() > 0 && this.f3576j.height() > 0) {
            ColorFilter colorFilter = this.f3570d;
            if (colorFilter == null) {
                colorFilter = this.f3569c;
            }
            canvas.getMatrix(this.f3575i);
            this.f3575i.getValues(this.f3574h);
            float abs = Math.abs(this.f3574h[0]);
            float abs2 = Math.abs(this.f3574h[4]);
            float abs3 = Math.abs(this.f3574h[1]);
            float abs4 = Math.abs(this.f3574h[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.f3576j.width() * abs));
            int min2 = Math.min(2048, (int) (this.f3576j.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3576j;
                canvas.translate(rect.left, rect.top);
                if (m4357f()) {
                    canvas.translate(this.f3576j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3576j.offsetTo(0, 0);
                this.f3568b.m4385c(min, min2);
                if (!this.f3572f) {
                    this.f3568b.m4392j(min, min2);
                } else if (!this.f3568b.m4384b()) {
                    this.f3568b.m4392j(min, min2);
                    this.f3568b.m4391i();
                }
                this.f3568b.m4386d(canvas, colorFilter, this.f3576j);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25058d(drawable);
        }
        return this.f3568b.f3624b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f3568b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25059e(drawable);
        }
        return this.f3570d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3566a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3566a.getConstantState());
        }
        this.f3568b.f3623a = getChangingConfigurations();
        return this.f3568b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f3568b.f3624b.f3616j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f3568b.f3624b.f3615i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m4361h(boolean z10) {
        this.f3572f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25062h(drawable);
        }
        return this.f3568b.f3627e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((hVar = this.f3568b) == null || (!hVar.m4389g() && ((colorStateList = this.f3568b.f3625c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    PorterDuffColorFilter m4362j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3571e && super.mutate() == this) {
            this.f3568b = new h(this.f3568b);
            this.f3571e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f3568b;
        ColorStateList colorStateList = hVar.f3625c;
        if (colorStateList != null && (mode = hVar.f3626d) != null) {
            this.f3569c = m4362j(this.f3569c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        if (hVar.m4389g() && hVar.m4390h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f3568b.f3624b.getRootAlpha() != i10) {
            this.f3568b.f3624b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25064j(drawable, z10);
        } else {
            this.f3568b.f3627e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25068n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25069o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3568b;
        if (hVar.f3625c != colorStateList) {
            hVar.f3625c = colorStateList;
            this.f3569c = m4362j(this.f3569c, colorStateList, hVar.f3626d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25070p(drawable, mode);
            return;
        }
        h hVar = this.f3568b;
        if (hVar.f3626d != mode) {
            hVar.f3626d = mode;
            this.f3569c = m4362j(this.f3569c, hVar.f3625c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$i */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3635a;

        public i(Drawable.ConstantState constantState) {
            this.f3635a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            boolean canApplyTheme;
            canApplyTheme = this.f3635a.canApplyTheme();
            return canApplyTheme;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3635a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0852n c0852n = new C0852n();
            c0852n.f3566a = AbstractC0853o.m4393a(this.f3635a.newDrawable());
            return c0852n;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0852n c0852n = new C0852n();
            c0852n.f3566a = AbstractC0853o.m4393a(this.f3635a.newDrawable(resources));
            return c0852n;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable newDrawable;
            C0852n c0852n = new C0852n();
            newDrawable = this.f3635a.newDrawable(resources, theme);
            c0852n.f3566a = AbstractC0853o.m4393a(newDrawable);
            return c0852n;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3570d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$f */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected AbstractC6135h.b[] f3602a;

        /* renamed from: b */
        String f3603b;

        /* renamed from: c */
        int f3604c;

        /* renamed from: d */
        int f3605d;

        public f() {
            super();
            this.f3602a = null;
            this.f3604c = 0;
        }

        /* renamed from: c */
        public boolean mo4364c() {
            return false;
        }

        /* renamed from: d */
        public void m4375d(Path path) {
            path.reset();
            AbstractC6135h.b[] bVarArr = this.f3602a;
            if (bVarArr != null) {
                AbstractC6135h.b.m24451e(bVarArr, path);
            }
        }

        public AbstractC6135h.b[] getPathData() {
            return this.f3602a;
        }

        public String getPathName() {
            return this.f3603b;
        }

        public void setPathData(AbstractC6135h.b[] bVarArr) {
            if (!AbstractC6135h.m24439b(this.f3602a, bVarArr)) {
                this.f3602a = AbstractC6135h.m24443f(bVarArr);
            } else {
                AbstractC6135h.m24447j(this.f3602a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f3602a = null;
            this.f3604c = 0;
            this.f3603b = fVar.f3603b;
            this.f3605d = fVar.f3605d;
            this.f3602a = AbstractC6135h.m24443f(fVar.f3602a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25061g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3568b;
        hVar.f3624b = new g();
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3537a);
        m4359i(m23823k, xmlPullParser, theme);
        m23823k.recycle();
        hVar.f3623a = getChangingConfigurations();
        hVar.f3633k = true;
        m4356e(resources, xmlPullParser, attributeSet, theme);
        this.f3569c = m4362j(this.f3569c, hVar.f3625c, hVar.f3626d);
    }

    C0852n(h hVar) {
        this.f3572f = true;
        this.f3574h = new float[9];
        this.f3575i = new Matrix();
        this.f3576j = new Rect();
        this.f3568b = hVar;
        this.f3569c = m4362j(this.f3569c, hVar.f3625c, hVar.f3626d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private int[] f3577e;

        /* renamed from: f */
        C5889d f3578f;

        /* renamed from: g */
        float f3579g;

        /* renamed from: h */
        C5889d f3580h;

        /* renamed from: i */
        float f3581i;

        /* renamed from: j */
        float f3582j;

        /* renamed from: k */
        float f3583k;

        /* renamed from: l */
        float f3584l;

        /* renamed from: m */
        float f3585m;

        /* renamed from: n */
        Paint.Cap f3586n;

        /* renamed from: o */
        Paint.Join f3587o;

        /* renamed from: p */
        float f3588p;

        c() {
            this.f3579g = 0.0f;
            this.f3581i = 1.0f;
            this.f3582j = 1.0f;
            this.f3583k = 0.0f;
            this.f3584l = 1.0f;
            this.f3585m = 0.0f;
            this.f3586n = Paint.Cap.BUTT;
            this.f3587o = Paint.Join.MITER;
            this.f3588p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m4366e(int i10, Paint.Cap cap) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m4367f(int i10, Paint.Join join) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m4368h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3577e = null;
            if (!AbstractC5896k.m23822j(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3603b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f3602a = AbstractC6135h.m24441d(string2);
            }
            this.f3580h = AbstractC5896k.m23817e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f3582j = AbstractC5896k.m23818f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3582j);
            this.f3586n = m4366e(AbstractC5896k.m23819g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3586n);
            this.f3587o = m4367f(AbstractC5896k.m23819g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3587o);
            this.f3588p = AbstractC5896k.m23818f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3588p);
            this.f3578f = AbstractC5896k.m23817e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f3581i = AbstractC5896k.m23818f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3581i);
            this.f3579g = AbstractC5896k.m23818f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3579g);
            this.f3584l = AbstractC5896k.m23818f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3584l);
            this.f3585m = AbstractC5896k.m23818f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3585m);
            this.f3583k = AbstractC5896k.m23818f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3583k);
            this.f3604c = AbstractC5896k.m23819g(typedArray, xmlPullParser, "fillType", 13, this.f3604c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0852n.e
        /* renamed from: a */
        public boolean mo4369a() {
            if (!this.f3580h.m23762i() && !this.f3578f.m23762i()) {
                return false;
            }
            return true;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0852n.e
        /* renamed from: b */
        public boolean mo4370b(int[] iArr) {
            return this.f3578f.m23763j(iArr) | this.f3580h.m23763j(iArr);
        }

        /* renamed from: g */
        public void m4371g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3539c);
            m4368h(m23823k, xmlPullParser, theme);
            m23823k.recycle();
        }

        float getFillAlpha() {
            return this.f3582j;
        }

        int getFillColor() {
            return this.f3580h.m23759e();
        }

        float getStrokeAlpha() {
            return this.f3581i;
        }

        int getStrokeColor() {
            return this.f3578f.m23759e();
        }

        float getStrokeWidth() {
            return this.f3579g;
        }

        float getTrimPathEnd() {
            return this.f3584l;
        }

        float getTrimPathOffset() {
            return this.f3585m;
        }

        float getTrimPathStart() {
            return this.f3583k;
        }

        void setFillAlpha(float f10) {
            this.f3582j = f10;
        }

        void setFillColor(int i10) {
            this.f3580h.m23764k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f3581i = f10;
        }

        void setStrokeColor(int i10) {
            this.f3578f.m23764k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f3579g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f3584l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f3585m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f3583k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f3579g = 0.0f;
            this.f3581i = 1.0f;
            this.f3582j = 1.0f;
            this.f3583k = 0.0f;
            this.f3584l = 1.0f;
            this.f3585m = 0.0f;
            this.f3586n = Paint.Cap.BUTT;
            this.f3587o = Paint.Join.MITER;
            this.f3588p = 4.0f;
            this.f3577e = cVar.f3577e;
            this.f3578f = cVar.f3578f;
            this.f3579g = cVar.f3579g;
            this.f3581i = cVar.f3581i;
            this.f3580h = cVar.f3580h;
            this.f3604c = cVar.f3604c;
            this.f3582j = cVar.f3582j;
            this.f3583k = cVar.f3583k;
            this.f3584l = cVar.f3584l;
            this.f3585m = cVar.f3585m;
            this.f3586n = cVar.f3586n;
            this.f3587o = cVar.f3587o;
            this.f3588p = cVar.f3588p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q */
        private static final Matrix f3606q = new Matrix();

        /* renamed from: a */
        private final Path f3607a;

        /* renamed from: b */
        private final Path f3608b;

        /* renamed from: c */
        private final Matrix f3609c;

        /* renamed from: d */
        Paint f3610d;

        /* renamed from: e */
        Paint f3611e;

        /* renamed from: f */
        private PathMeasure f3612f;

        /* renamed from: g */
        private int f3613g;

        /* renamed from: h */
        final d f3614h;

        /* renamed from: i */
        float f3615i;

        /* renamed from: j */
        float f3616j;

        /* renamed from: k */
        float f3617k;

        /* renamed from: l */
        float f3618l;

        /* renamed from: m */
        int f3619m;

        /* renamed from: n */
        String f3620n;

        /* renamed from: o */
        Boolean f3621o;

        /* renamed from: p */
        final C5303a f3622p;

        public g() {
            this.f3609c = new Matrix();
            this.f3615i = 0.0f;
            this.f3616j = 0.0f;
            this.f3617k = 0.0f;
            this.f3618l = 0.0f;
            this.f3619m = 255;
            this.f3620n = null;
            this.f3621o = null;
            this.f3622p = new C5303a();
            this.f3614h = new d();
            this.f3607a = new Path();
            this.f3608b = new Path();
        }

        /* renamed from: a */
        private static float m4376a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* renamed from: c */
        private void m4377c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f3589a.set(matrix);
            dVar.f3589a.preConcat(dVar.f3598j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f3590b.size(); i12++) {
                e eVar = (e) dVar.f3590b.get(i12);
                if (eVar instanceof d) {
                    m4377c((d) eVar, dVar.f3589a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    m4378d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m4378d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f10 = i10 / this.f3617k;
            float f11 = i11 / this.f3618l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f3589a;
            this.f3609c.set(matrix);
            this.f3609c.postScale(f10, f11);
            float m4379e = m4379e(matrix);
            if (m4379e == 0.0f) {
                return;
            }
            fVar.m4375d(this.f3607a);
            Path path = this.f3607a;
            this.f3608b.reset();
            if (fVar.mo4364c()) {
                Path path2 = this.f3608b;
                if (fVar.f3604c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f3608b.addPath(path, this.f3609c);
                canvas.clipPath(this.f3608b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f3583k;
            if (f12 != 0.0f || cVar.f3584l != 1.0f) {
                float f13 = cVar.f3585m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f3584l + f13) % 1.0f;
                if (this.f3612f == null) {
                    this.f3612f = new PathMeasure();
                }
                this.f3612f.setPath(this.f3607a, false);
                float length = this.f3612f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f3612f.getSegment(f16, length, path, true);
                    this.f3612f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f3612f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3608b.addPath(path, this.f3609c);
            if (cVar.f3580h.m23765l()) {
                C5889d c5889d = cVar.f3580h;
                if (this.f3611e == null) {
                    Paint paint = new Paint(1);
                    this.f3611e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3611e;
                if (c5889d.m23761h()) {
                    Shader m23760f = c5889d.m23760f();
                    m23760f.setLocalMatrix(this.f3609c);
                    paint2.setShader(m23760f);
                    paint2.setAlpha(Math.round(cVar.f3582j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0852n.m4353a(c5889d.m23759e(), cVar.f3582j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f3608b;
                if (cVar.f3604c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f3608b, paint2);
            }
            if (cVar.f3578f.m23765l()) {
                C5889d c5889d2 = cVar.f3578f;
                if (this.f3610d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3610d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3610d;
                Paint.Join join = cVar.f3587o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f3586n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f3588p);
                if (c5889d2.m23761h()) {
                    Shader m23760f2 = c5889d2.m23760f();
                    m23760f2.setLocalMatrix(this.f3609c);
                    paint4.setShader(m23760f2);
                    paint4.setAlpha(Math.round(cVar.f3581i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0852n.m4353a(c5889d2.m23759e(), cVar.f3581i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3579g * min * m4379e);
                canvas.drawPath(this.f3608b, paint4);
            }
        }

        /* renamed from: e */
        private float m4379e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m4376a = m4376a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(m4376a) / max;
        }

        /* renamed from: b */
        public void m4380b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            m4377c(this.f3614h, f3606q, canvas, i10, i11, colorFilter);
        }

        /* renamed from: f */
        public boolean m4381f() {
            if (this.f3621o == null) {
                this.f3621o = Boolean.valueOf(this.f3614h.mo4369a());
            }
            return this.f3621o.booleanValue();
        }

        /* renamed from: g */
        public boolean m4382g(int[] iArr) {
            return this.f3614h.mo4370b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3619m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f3619m = i10;
        }

        public g(g gVar) {
            this.f3609c = new Matrix();
            this.f3615i = 0.0f;
            this.f3616j = 0.0f;
            this.f3617k = 0.0f;
            this.f3618l = 0.0f;
            this.f3619m = 255;
            this.f3620n = null;
            this.f3621o = null;
            C5303a c5303a = new C5303a();
            this.f3622p = c5303a;
            this.f3614h = new d(gVar.f3614h, c5303a);
            this.f3607a = new Path(gVar.f3607a);
            this.f3608b = new Path(gVar.f3608b);
            this.f3615i = gVar.f3615i;
            this.f3616j = gVar.f3616j;
            this.f3617k = gVar.f3617k;
            this.f3618l = gVar.f3618l;
            this.f3613g = gVar.f3613g;
            this.f3619m = gVar.f3619m;
            this.f3620n = gVar.f3620n;
            String str = gVar.f3620n;
            if (str != null) {
                c5303a.put(str, this);
            }
            this.f3621o = gVar.f3621o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.n$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f3589a;

        /* renamed from: b */
        final ArrayList f3590b;

        /* renamed from: c */
        float f3591c;

        /* renamed from: d */
        private float f3592d;

        /* renamed from: e */
        private float f3593e;

        /* renamed from: f */
        private float f3594f;

        /* renamed from: g */
        private float f3595g;

        /* renamed from: h */
        private float f3596h;

        /* renamed from: i */
        private float f3597i;

        /* renamed from: j */
        final Matrix f3598j;

        /* renamed from: k */
        int f3599k;

        /* renamed from: l */
        private int[] f3600l;

        /* renamed from: m */
        private String f3601m;

        public d(d dVar, C5303a c5303a) {
            super();
            f bVar;
            this.f3589a = new Matrix();
            this.f3590b = new ArrayList();
            this.f3591c = 0.0f;
            this.f3592d = 0.0f;
            this.f3593e = 0.0f;
            this.f3594f = 1.0f;
            this.f3595g = 1.0f;
            this.f3596h = 0.0f;
            this.f3597i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3598j = matrix;
            this.f3601m = null;
            this.f3591c = dVar.f3591c;
            this.f3592d = dVar.f3592d;
            this.f3593e = dVar.f3593e;
            this.f3594f = dVar.f3594f;
            this.f3595g = dVar.f3595g;
            this.f3596h = dVar.f3596h;
            this.f3597i = dVar.f3597i;
            this.f3600l = dVar.f3600l;
            String str = dVar.f3601m;
            this.f3601m = str;
            this.f3599k = dVar.f3599k;
            if (str != null) {
                c5303a.put(str, this);
            }
            matrix.set(dVar.f3598j);
            ArrayList arrayList = dVar.f3590b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f3590b.add(new d((d) obj, c5303a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else if (obj instanceof b) {
                        bVar = new b((b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3590b.add(bVar);
                    Object obj2 = bVar.f3603b;
                    if (obj2 != null) {
                        c5303a.put(obj2, bVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m4372d() {
            this.f3598j.reset();
            this.f3598j.postTranslate(-this.f3592d, -this.f3593e);
            this.f3598j.postScale(this.f3594f, this.f3595g);
            this.f3598j.postRotate(this.f3591c, 0.0f, 0.0f);
            this.f3598j.postTranslate(this.f3596h + this.f3592d, this.f3597i + this.f3593e);
        }

        /* renamed from: e */
        private void m4373e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3600l = null;
            this.f3591c = AbstractC5896k.m23818f(typedArray, xmlPullParser, "rotation", 5, this.f3591c);
            this.f3592d = typedArray.getFloat(1, this.f3592d);
            this.f3593e = typedArray.getFloat(2, this.f3593e);
            this.f3594f = AbstractC5896k.m23818f(typedArray, xmlPullParser, "scaleX", 3, this.f3594f);
            this.f3595g = AbstractC5896k.m23818f(typedArray, xmlPullParser, "scaleY", 4, this.f3595g);
            this.f3596h = AbstractC5896k.m23818f(typedArray, xmlPullParser, "translateX", 6, this.f3596h);
            this.f3597i = AbstractC5896k.m23818f(typedArray, xmlPullParser, "translateY", 7, this.f3597i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3601m = string;
            }
            m4372d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0852n.e
        /* renamed from: a */
        public boolean mo4369a() {
            for (int i10 = 0; i10 < this.f3590b.size(); i10++) {
                if (((e) this.f3590b.get(i10)).mo4369a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0852n.e
        /* renamed from: b */
        public boolean mo4370b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f3590b.size(); i10++) {
                z10 |= ((e) this.f3590b.get(i10)).mo4370b(iArr);
            }
            return z10;
        }

        /* renamed from: c */
        public void m4374c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3538b);
            m4373e(m23823k, xmlPullParser);
            m23823k.recycle();
        }

        public String getGroupName() {
            return this.f3601m;
        }

        public Matrix getLocalMatrix() {
            return this.f3598j;
        }

        public float getPivotX() {
            return this.f3592d;
        }

        public float getPivotY() {
            return this.f3593e;
        }

        public float getRotation() {
            return this.f3591c;
        }

        public float getScaleX() {
            return this.f3594f;
        }

        public float getScaleY() {
            return this.f3595g;
        }

        public float getTranslateX() {
            return this.f3596h;
        }

        public float getTranslateY() {
            return this.f3597i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3592d) {
                this.f3592d = f10;
                m4372d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3593e) {
                this.f3593e = f10;
                m4372d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3591c) {
                this.f3591c = f10;
                m4372d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3594f) {
                this.f3594f = f10;
                m4372d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3595g) {
                this.f3595g = f10;
                m4372d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3596h) {
                this.f3596h = f10;
                m4372d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f3597i) {
                this.f3597i = f10;
                m4372d();
            }
        }

        public d() {
            super();
            this.f3589a = new Matrix();
            this.f3590b = new ArrayList();
            this.f3591c = 0.0f;
            this.f3592d = 0.0f;
            this.f3593e = 0.0f;
            this.f3594f = 1.0f;
            this.f3595g = 1.0f;
            this.f3596h = 0.0f;
            this.f3597i = 0.0f;
            this.f3598j = new Matrix();
            this.f3601m = null;
        }
    }
}
