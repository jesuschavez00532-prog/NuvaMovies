package com.module.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.module.R$styleable;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MaxHeightLinearLayout extends AutoLinearLayout {

    /* renamed from: a */
    private int f12250a;

    /* renamed from: b */
    public Map f12251b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int i12 = this.f12250a;
        if (i12 > 0 && size > i12 && mode != 1073741824) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, mode));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12251b = new LinkedHashMap();
        this.f12250a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12041z0);
            AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr…le.MaxHeightLinearLayout)");
            int dimension = (int) obtainStyledAttributes.getDimension(R$styleable.MaxHeightLinearLayout_forceMaxHeight, -1.0f);
            this.f12250a = dimension;
            if (dimension > 0) {
                this.f12250a = AbstractC7786b.m30163g(dimension);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
