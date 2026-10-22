package p260o5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0455v;
import androidx.core.widget.AbstractC0670g;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import p188j5.AbstractC4995a;

/* renamed from: o5.a */
/* loaded from: classes.dex */
public class C5916a extends C0455v {

    /* renamed from: f */
    private static final int f23538f = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: g */
    private static final int[][] f23539g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: d */
    private ColorStateList f23540d;

    /* renamed from: e */
    private boolean f23541e;

    public C5916a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23540d == null) {
            int m20373c = AbstractC4995a.m20373c(this, R$attr.colorControlActivated);
            int m20373c2 = AbstractC4995a.m20373c(this, R$attr.colorOnSurface);
            int m20373c3 = AbstractC4995a.m20373c(this, R$attr.colorSurface);
            int[][] iArr = f23539g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC4995a.m20376f(m20373c3, m20373c, 1.0f);
            iArr2[1] = AbstractC4995a.m20376f(m20373c3, m20373c2, 0.54f);
            iArr2[2] = AbstractC4995a.m20376f(m20373c3, m20373c2, 0.38f);
            iArr2[3] = AbstractC4995a.m20376f(m20373c3, m20373c2, 0.38f);
            this.f23540d = new ColorStateList(iArr, iArr2);
        }
        return this.f23540d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23541e && AbstractC0670g.m2958b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f23541e = z10;
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
    public C5916a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = p260o5.C5916a.f23538f
            android.content.Context r7 = com.google.android.material.internal.AbstractC2588f.m10655f(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R$styleable.f9326c0
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.AbstractC2588f.m10660k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R$styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f23541e = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o5.C5916a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
