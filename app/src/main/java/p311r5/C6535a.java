package p311r5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p276p.AbstractC6128a;

/* renamed from: r5.a */
/* loaded from: classes.dex */
public class C6535a {

    /* renamed from: h */
    private static final int[] f25145h = new int[3];

    /* renamed from: i */
    private static final float[] f25146i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    private static final int[] f25147j = new int[4];

    /* renamed from: k */
    private static final float[] f25148k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f25149a;

    /* renamed from: b */
    private final Paint f25150b;

    /* renamed from: c */
    private final Paint f25151c;

    /* renamed from: d */
    private int f25152d;

    /* renamed from: e */
    private int f25153e;

    /* renamed from: f */
    private int f25154f;

    /* renamed from: g */
    private final Path f25155g;

    public C6535a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m25572a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = false;
        if (f11 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = this.f25155g;
        if (z10) {
            int[] iArr = f25147j;
            iArr[0] = 0;
            iArr[1] = this.f25154f;
            iArr[2] = this.f25153e;
            iArr[3] = this.f25152d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f25147j;
            iArr2[0] = 0;
            iArr2[1] = this.f25152d;
            iArr2[2] = this.f25153e;
            iArr2[3] = this.f25154f;
        }
        float width = 1.0f - (i10 / (rectF.width() / 2.0f));
        float[] fArr = f25148k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f25150b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f25147j, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f25150b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m25573b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f25145h;
        iArr[0] = this.f25154f;
        iArr[1] = this.f25153e;
        iArr[2] = this.f25152d;
        Paint paint = this.f25151c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f25146i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f25151c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m25574c() {
        return this.f25149a;
    }

    /* renamed from: d */
    public void m25575d(int i10) {
        this.f25152d = AbstractC6128a.m24427f(i10, 68);
        this.f25153e = AbstractC6128a.m24427f(i10, 20);
        this.f25154f = AbstractC6128a.m24427f(i10, 0);
    }

    public C6535a(int i10) {
        this.f25155g = new Path();
        m25575d(i10);
        Paint paint = new Paint(4);
        this.f25150b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f25149a = paint2;
        paint2.setColor(this.f25152d);
        this.f25151c = new Paint(paint);
    }
}
