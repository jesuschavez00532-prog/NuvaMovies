package p102db;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ne.AbstractC5868k;

/* renamed from: db.f */
/* loaded from: classes2.dex */
public final class C4035f extends Drawable {

    /* renamed from: a */
    private final Drawable f17850a;

    /* renamed from: b */
    private final Drawable f17851b;

    /* renamed from: c */
    private final Drawable f17852c;

    public C4035f(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        AbstractC5868k.m23674f(drawable, "normalDrawable");
        AbstractC5868k.m23674f(drawable2, "selectDrawable");
        AbstractC5868k.m23674f(drawable3, "focusDrawable");
        this.f17850a = drawable;
        this.f17851b = drawable2;
        this.f17852c = drawable3;
    }

    /* renamed from: a */
    public final Drawable m17027a() {
        return this.f17852c;
    }

    /* renamed from: b */
    public final Drawable m17028b() {
        return this.f17850a;
    }

    /* renamed from: c */
    public final Drawable m17029c() {
        return this.f17851b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
