package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p282p5.AbstractC6215b;
import p282p5.AbstractC6216c;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* renamed from: g */
    private void m10825g(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, R$styleable.f9330e0);
        int m10828j = m10828j(getContext(), obtainStyledAttributes, R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m10828j >= 0) {
            setLineHeight(m10828j);
        }
    }

    /* renamed from: h */
    private static boolean m10826h(Context context) {
        return AbstractC6215b.m24788b(context, R$attr.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: i */
    private static int m10827i(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.f9332f0, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: j */
    private static int m10828j(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = AbstractC6216c.m24793c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    /* renamed from: k */
    private static boolean m10829k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.f9332f0, i10, i11);
        int m10828j = m10828j(context, obtainStyledAttributes, R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (m10828j != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (m10826h(context)) {
            m10825g(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        int m10827i;
        if (m10826h(context)) {
            Resources.Theme theme = context.getTheme();
            if (m10829k(context, theme, attributeSet, i10, i11) || (m10827i = m10827i(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            m10825g(theme, m10827i);
        }
    }
}
