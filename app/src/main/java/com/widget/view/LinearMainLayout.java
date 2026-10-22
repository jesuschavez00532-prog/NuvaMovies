package com.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhy.autolayout.AutoLinearLayout;

/* loaded from: classes3.dex */
public class LinearMainLayout extends AutoLinearLayout {
    WidgetTvViewBring mWidgetTvViewBring;

    public LinearMainLayout(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setChildrenDrawingOrderEnabled(true);
        this.mWidgetTvViewBring = new WidgetTvViewBring(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        this.mWidgetTvViewBring.bringChildToFront(this, view);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return this.mWidgetTvViewBring.getChildDrawingOrder(i10, i11);
    }

    public LinearMainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LinearMainLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
