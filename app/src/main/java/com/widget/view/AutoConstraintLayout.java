package com.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.AbstractC0475c;
import com.zhy.autolayout.C3913a;
import p433zd.C7785a;

/* loaded from: classes3.dex */
public class AutoConstraintLayout extends AbstractC0475c {
    private C7785a mHelper;

    public AutoConstraintLayout(Context context) {
        super(context);
        this.mHelper = new C7785a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0475c, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!isInEditMode()) {
            this.mHelper.m30156a();
        }
        super.onMeasure(i10, i11);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends AbstractC0475c.a implements C7785a.a {
        private C3913a mAutoLayoutInfo;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mAutoLayoutInfo = C7785a.m30154b(context, attributeSet);
        }

        @Override // p433zd.C7785a.a
        public C3913a getAutoLayoutInfo() {
            return this.mAutoLayoutInfo;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public AutoConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHelper = new C7785a(this);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public AutoConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHelper = new C7785a(this);
    }
}
