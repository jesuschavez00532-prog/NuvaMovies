package org.xutils.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class AsyncDrawable extends Drawable {
    private Drawable baseDrawable;
    private final WeakReference<C6121a> imageLoaderReference;

    public AsyncDrawable(C6121a c6121a, Drawable drawable) {
        if (c6121a != null) {
            this.baseDrawable = drawable;
            while (true) {
                Drawable drawable2 = this.baseDrawable;
                if (drawable2 instanceof AsyncDrawable) {
                    this.baseDrawable = ((AsyncDrawable) drawable2).baseDrawable;
                } else {
                    this.imageLoaderReference = new WeakReference<>(c6121a);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("imageLoader may not be null");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    protected void finalize() {
        super.finalize();
        C6121a imageLoader = getImageLoader();
        if (imageLoader != null) {
            imageLoader.cancel();
        }
    }

    public Drawable getBaseDrawable() {
        return this.baseDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return 0;
        }
        return drawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return null;
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return null;
        }
        return drawable.getCurrent();
    }

    public C6121a getImageLoader() {
        return this.imageLoaderReference.get();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return -3;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null && drawable.getPadding(rect)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return null;
        }
        return drawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return null;
        }
        return drawable.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.baseDrawable;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.baseDrawable;
        if (drawable == null) {
            return null;
        }
        return drawable.mutate();
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    public void setBaseDrawable(Drawable drawable) {
        this.baseDrawable = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null && drawable.setState(iArr)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null && drawable.setVisible(z10, z11)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.baseDrawable;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        }
    }
}
