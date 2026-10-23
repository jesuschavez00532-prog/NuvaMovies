package p290q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.a0 */
/* loaded from: classes.dex */
public class C6293a0 extends Drawable implements Drawable.Callback, InterfaceC6321z, InterfaceC6320y {

    /* renamed from: g */
    static final PorterDuff.Mode f24634g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    private int f24635a;

    /* renamed from: b */
    private PorterDuff.Mode f24636b;

    /* renamed from: c */
    private boolean f24637c;

    /* renamed from: d */
    C6299d0 f24638d;

    /* renamed from: e */
    private boolean f24639e;

    /* renamed from: f */
    Drawable f24640f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6293a0(C6299d0 c6299d0, Resources resources) {
        this.f24638d = c6299d0;
        m25038e(resources);
    }

    /* renamed from: d */
    private C6299d0 m25037d() {
        return new C6299d0(this.f24638d);
    }

    /* renamed from: e */
    private void m25038e(Resources resources) {
        Drawable.ConstantState constantState;
        C6299d0 c6299d0 = this.f24638d;
        if (c6299d0 != null && (constantState = c6299d0.f24643b) != null) {
            mo25040a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m25039f(int[] iArr) {
        if (!mo25042c()) {
            return false;
        }
        C6299d0 c6299d0 = this.f24638d;
        ColorStateList colorStateList = c6299d0.f24644c;
        PorterDuff.Mode mode = c6299d0.f24645d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f24637c || colorForState != this.f24635a || mode != this.f24636b) {
                setColorFilter(colorForState, mode);
                this.f24635a = colorForState;
                this.f24636b = mode;
                this.f24637c = true;
                return true;
            }
        } else {
            this.f24637c = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // p290q.InterfaceC6321z
    /* renamed from: a */
    public final void mo25040a(Drawable drawable) {
        Drawable drawable2 = this.f24640f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f24640f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C6299d0 c6299d0 = this.f24638d;
            if (c6299d0 != null) {
                c6299d0.f24643b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p290q.InterfaceC6321z
    /* renamed from: b */
    public final Drawable mo25041b() {
        return this.f24640f;
    }

    /* renamed from: c */
    protected boolean mo25042c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f24640f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i10 = 0;
        int changingConfigurations = super.getChangingConfigurations();
        C6299d0 c6299d0 = this.f24638d;
        if (c6299d0 != null) {
            i10 = c6299d0.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return changingConfigurations | i10 | this.f24640f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C6299d0 c6299d0 = this.f24638d;
        if (c6299d0 != null && c6299d0.m25048a()) {
            this.f24638d.f24642a = getChangingConfigurations();
            return this.f24638d;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f24640f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24640f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24640f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return AbstractC6306k.m25060f(this.f24640f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f24640f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f24640f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24640f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f24640f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f24640f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f24640f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC6306k.m25062h(this.f24640f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        C6299d0 c6299d0;
        if (mo25042c() && (c6299d0 = this.f24638d) != null) {
            colorStateList = c6299d0.f24644c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f24640f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f24640f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f24639e && super.mutate() == this) {
            this.f24638d = m25037d();
            Drawable drawable = this.f24640f;
            if (drawable != null) {
                drawable.mutate();
            }
            C6299d0 c6299d0 = this.f24638d;
            if (c6299d0 != null) {
                Drawable drawable2 = this.f24640f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c6299d0.f24643b = constantState;
            }
            this.f24639e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24640f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return AbstractC6306k.m25067m(this.f24640f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f24640f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f24640f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        AbstractC6306k.m25064j(this.f24640f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f24640f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24640f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f24640f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f24640f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f24640f.setState(iArr);
        if (!m25039f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        this.f24638d.f24644c = colorStateList;
        m25039f(getState());
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f24638d.f24645d = mode;
        m25039f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f24640f.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6293a0(Drawable drawable) {
        this.f24638d = m25037d();
        mo25040a(drawable);
    }
}
