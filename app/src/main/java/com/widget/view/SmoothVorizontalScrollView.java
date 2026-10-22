package com.widget.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.widget.C3890R;

/* loaded from: classes3.dex */
public class SmoothVorizontalScrollView extends ScrollView {
    private int mFadingEdge;

    public SmoothVorizontalScrollView(Context context) {
        super(context, null, 0);
    }

    @Override // android.widget.ScrollView
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int i13 = this.mFadingEdge;
        if (i13 <= 0) {
            i13 = getResources().getDimensionPixelSize(C3890R.dimen.fading_edge);
        }
        if (rect.top > 0) {
            scrollY += i13;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i12 -= i13;
        }
        int i14 = rect.bottom;
        if (i14 > i12 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i12;
            }
            return Math.min(i11 + 0, getChildAt(0).getBottom() - i12);
        }
        if (rect.top >= scrollY || i14 >= i12) {
            return 0;
        }
        if (rect.height() > height) {
            i10 = 0 - (i12 - rect.bottom);
        } else {
            i10 = 0 - (scrollY - rect.top);
        }
        return Math.max(i10, -getScrollY());
    }

    public void setFadingEdge(int i10) {
        this.mFadingEdge = i10;
    }

    public SmoothVorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public SmoothVorizontalScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
