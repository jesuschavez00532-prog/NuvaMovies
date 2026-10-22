package p296q5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p290q.InterfaceC6320y;
import p326s5.C6686i;
import p326s5.C6690m;
import p326s5.InterfaceC6693p;

/* renamed from: q5.a */
/* loaded from: classes.dex */
public class C6344a extends Drawable implements InterfaceC6693p, InterfaceC6320y {

    /* renamed from: a */
    private b f24689a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6344a mutate() {
        this.f24689a = new b(this.f24689a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f24689a;
        if (bVar.f24691b) {
            bVar.f24690a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24689a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24689a.f24690a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24689a.f24690a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f24689a.f24690a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m25127b = AbstractC6345b.m25127b(iArr);
        b bVar = this.f24689a;
        if (bVar.f24691b != m25127b) {
            bVar.f24691b = m25127b;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f24689a.f24690a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24689a.f24690a.setColorFilter(colorFilter);
    }

    @Override // p326s5.InterfaceC6693p
    public void setShapeAppearanceModel(C6690m c6690m) {
        this.f24689a.f24690a.setShapeAppearanceModel(c6690m);
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        this.f24689a.f24690a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        this.f24689a.f24690a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f24689a.f24690a.setTintMode(mode);
    }

    public C6344a(C6690m c6690m) {
        this(new b(new C6686i(c6690m)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q5.a$b */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        C6686i f24690a;

        /* renamed from: b */
        boolean f24691b;

        public b(C6686i c6686i) {
            this.f24690a = c6686i;
            this.f24691b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6344a newDrawable() {
            return new C6344a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f24690a = (C6686i) bVar.f24690a.getConstantState().newDrawable();
            this.f24691b = bVar.f24691b;
        }
    }

    private C6344a(b bVar) {
        this.f24689a = bVar;
    }
}
