package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.internal.AbstractC2588f;
import p326s5.AbstractC6687j;
import p326s5.C6686i;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: O */
    private static final int f9382O = R$style.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    /* renamed from: O */
    private void m10156O(Context context) {
        int i10;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C6686i c6686i = new C6686i();
        if (background != null) {
            i10 = ((ColorDrawable) background).getColor();
        } else {
            i10 = 0;
        }
        c6686i.m26096R(ColorStateList.valueOf(i10));
        c6686i.m26092J(context);
        c6686i.m26095Q(AbstractC0616q0.m2651v(this));
        AbstractC0616q0.m2642q0(this, c6686i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC6687j.m26121e(this);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        AbstractC6687j.m26120d(this, f10);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC2588f.m10655f(context, attributeSet, i10, f9382O), attributeSet, i10);
        m10156O(getContext());
    }
}
