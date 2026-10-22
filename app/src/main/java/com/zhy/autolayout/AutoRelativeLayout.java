package com.zhy.autolayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p433zd.C7785a;

/* loaded from: classes3.dex */
public class AutoRelativeLayout extends RelativeLayout {
    private final C7785a mHelper;

    public AutoRelativeLayout(Context context) {
        super(context);
        this.mHelper = new C7785a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!isInEditMode()) {
            this.mHelper.m30156a();
        }
        super.onMeasure(i10, i11);
    }

    /* renamed from: com.zhy.autolayout.AutoRelativeLayout$a */
    /* loaded from: classes3.dex */
    public static class C3912a extends RelativeLayout.LayoutParams implements C7785a.a {

        /* renamed from: a */
        private C3913a f17560a;

        public C3912a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17560a = C7785a.m30154b(context, attributeSet);
        }

        @Override // p433zd.C7785a.a
        public C3913a getAutoLayoutInfo() {
            return this.f17560a;
        }

        public C3912a(int i10, int i11) {
            super(i10, i11);
        }
    }

    public AutoRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHelper = new C7785a(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public C3912a generateLayoutParams(AttributeSet attributeSet) {
        return new C3912a(getContext(), attributeSet);
    }

    public AutoRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHelper = new C7785a(this);
    }
}
