package com.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/* loaded from: classes3.dex */
public class GridViewTV extends GridView {
    public GridViewTV(Context context) {
        this(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (getSelectedItemPosition() != -1) {
            if (getFirstVisiblePosition() + i11 == getSelectedItemPosition()) {
                return i10 - 1;
            }
            if (i11 == i10 - 1) {
                return getSelectedItemPosition() - getFirstVisiblePosition();
            }
        }
        return i11;
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

    public GridViewTV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}
