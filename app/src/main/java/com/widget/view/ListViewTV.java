package com.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class ListViewTV extends ListView {
    WidgetTvViewBring mWidgetTvViewBring;

    public ListViewTV(Context context) {
        this(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setChildrenDrawingOrderEnabled(true);
        this.mWidgetTvViewBring = new WidgetTvViewBring(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        this.mWidgetTvViewBring.bringChildToFront(this, view);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return this.mWidgetTvViewBring.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (hasFocus() && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public void setDefualtSelect(int i10) {
        requestFocusFromTouch();
        setSelection(i10);
    }

    public ListViewTV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}
