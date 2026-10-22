package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.R$attr;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.AbstractC0665d0;
import p106e.AbstractC4105b;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0391f extends AutoCompleteTextView implements InterfaceC0604n0 {

    /* renamed from: c */
    private static final int[] f1739c = {R.attr.popupBackground};

    /* renamed from: a */
    private final C0395g f1740a;

    /* renamed from: b */
    private final C0452u0 f1741b;

    public C0391f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.f1741b;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0423n.m1838a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0665d0.m2945p(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC4105b.m17170d(getContext(), i10));
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1740a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0452u0 c0452u0 = this.f1741b;
        if (c0452u0 != null) {
            c0452u0.m1966q(context, i10);
        }
    }

    public C0391f(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0438q2 m1874v = C0438q2.m1874v(getContext(), attributeSet, f1739c, i10, 0);
        if (m1874v.m1893s(0)) {
            setDropDownBackgroundDrawable(m1874v.m1881g(0));
        }
        m1874v.m1894w();
        C0395g c0395g = new C0395g(this);
        this.f1740a = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1741b = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
        c0452u0.m1952b();
    }
}
