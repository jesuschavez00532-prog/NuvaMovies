package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.core.widget.AbstractC0683r;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
class C0447t extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1921b;

    /* renamed from: a */
    private boolean f1922a;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1921b = z10;
    }

    public C0447t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m1936a(context, attributeSet, i10, i11);
    }

    /* renamed from: a */
    private void m1936a(Context context, AttributeSet attributeSet, int i10, int i11) {
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, R$styleable.f891F, i10, i11);
        int i12 = R$styleable.PopupWindow_overlapAnchor;
        if (m1874v.m1893s(i12)) {
            m1937b(m1874v.m1875a(i12, false));
        }
        setBackgroundDrawable(m1874v.m1881g(R$styleable.PopupWindow_android_popupBackground));
        m1874v.m1894w();
    }

    /* renamed from: b */
    private void m1937b(boolean z10) {
        if (f1921b) {
            this.f1922a = z10;
        } else {
            AbstractC0683r.m2979a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1921b && this.f1922a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1921b && this.f1922a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1921b && this.f1922a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
