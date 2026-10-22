package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.R$attr;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.InterfaceC0673h0;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0427o extends ImageButton implements InterfaceC0604n0, InterfaceC0673h0 {

    /* renamed from: a */
    private final C0395g f1838a;

    /* renamed from: b */
    private final C0435q f1839b;

    public C0427o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1863b();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0673h0
    public ColorStateList getSupportImageTintList() {
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            return c0435q.m1864c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0673h0
    public PorterDuff.Mode getSupportImageTintMode() {
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            return c0435q.m1865d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.f1839b.m1866e() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1863b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1863b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1839b.m1868g(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1863b();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1838a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0673h0
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1869h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0673h0
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0435q c0435q = this.f1839b;
        if (c0435q != null) {
            c0435q.m1870i(mode);
        }
    }

    public C0427o(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0395g c0395g = new C0395g(this);
        this.f1838a = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0435q c0435q = new C0435q(this);
        this.f1839b = c0435q;
        c0435q.m1867f(attributeSet, i10);
    }
}
