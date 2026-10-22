package p173i5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0403i;
import androidx.core.widget.AbstractC0670g;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import p188j5.AbstractC4995a;

/* renamed from: i5.a */
/* loaded from: classes.dex */
public class C4896a extends C0403i {

    /* renamed from: f */
    private static final int f20401f = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: g */
    private static final int[][] f20402g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: d */
    private ColorStateList f20403d;

    /* renamed from: e */
    private boolean f20404e;

    public C4896a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f20403d == null) {
            int[][] iArr = f20402g;
            int[] iArr2 = new int[iArr.length];
            int m20373c = AbstractC4995a.m20373c(this, R$attr.colorControlActivated);
            int m20373c2 = AbstractC4995a.m20373c(this, R$attr.colorSurface);
            int m20373c3 = AbstractC4995a.m20373c(this, R$attr.colorOnSurface);
            iArr2[0] = AbstractC4995a.m20376f(m20373c2, m20373c, 1.0f);
            iArr2[1] = AbstractC4995a.m20376f(m20373c2, m20373c3, 0.54f);
            iArr2[2] = AbstractC4995a.m20376f(m20373c2, m20373c3, 0.38f);
            iArr2[3] = AbstractC4995a.m20376f(m20373c2, m20373c3, 0.38f);
            this.f20403d = new ColorStateList(iArr, iArr2);
        }
        return this.f20403d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20404e && AbstractC0670g.m2958b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f20404e = z10;
        if (z10) {
            AbstractC0670g.m2959c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0670g.m2959c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4896a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p173i5.C4896a.f20401f
            android.content.Context r8 = com.google.android.material.internal.AbstractC2588f.m10655f(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.f9324b0
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.AbstractC2588f.m10660k(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p282p5.AbstractC6216c.m24791a(r8, r9, r10)
            androidx.core.widget.AbstractC0670g.m2959c(r7, r8)
        L28:
            int r8 = com.google.android.material.R$styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f20404e = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p173i5.C4896a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
