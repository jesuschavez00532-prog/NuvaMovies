package p290q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.AbstractC0431p;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.c0 */
/* loaded from: classes.dex */
public class C6297c0 extends C6293a0 {

    /* renamed from: h */
    private static Method f24641h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6297c0(Drawable drawable) {
        super(drawable);
        m25046g();
    }

    /* renamed from: g */
    private void m25046g() {
        if (f24641h == null) {
            try {
                f24641h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // p290q.C6293a0
    /* renamed from: c */
    protected boolean mo25042c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f24640f;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !AbstractC0431p.m1846a(drawable)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        Rect dirtyBounds;
        dirtyBounds = this.f24640f.getDirtyBounds();
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f24640f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f24640f;
        if (drawable != null && (method = f24641h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f24640f.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f24640f.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p290q.C6293a0, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // p290q.C6293a0, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        if (!mo25042c()) {
            this.f24640f.setTint(i10);
        } else {
            super.setTint(i10);
        }
    }

    @Override // p290q.C6293a0, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        if (!mo25042c()) {
            this.f24640f.setTintList(colorStateList);
        } else {
            super.setTintList(colorStateList);
        }
    }

    @Override // p290q.C6293a0, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        if (!mo25042c()) {
            this.f24640f.setTintMode(mode);
        } else {
            super.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6297c0(C6299d0 c6299d0, Resources resources) {
        super(c6299d0, resources);
        m25046g();
    }
}
