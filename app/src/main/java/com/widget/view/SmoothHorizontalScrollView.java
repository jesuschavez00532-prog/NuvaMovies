package com.widget.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.widget.C3890R;

/* loaded from: classes3.dex */
public class SmoothHorizontalScrollView extends HorizontalScrollView {
    final String TAG;
    private int mFadingEdge;

    public SmoothHorizontalScrollView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.HorizontalScrollView
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i12 = scrollX + width;
        int i13 = this.mFadingEdge;
        if (i13 <= 0) {
            i13 = getResources().getDimensionPixelSize(C3890R.dimen.fading_edge);
        }
        if (rect.left > 0) {
            scrollX += i13;
        }
        if (rect.right < getChildAt(0).getWidth()) {
            i12 -= i13;
        }
        int i14 = rect.right;
        if (i14 > i12 && rect.left > scrollX) {
            if (rect.width() > width) {
                i11 = rect.left - scrollX;
            } else {
                i11 = rect.right - i12;
            }
            return Math.min(i11 + 0, getChildAt(0).getRight() - i12);
        }
        if (rect.left >= scrollX || i14 >= i12) {
            return 0;
        }
        if (rect.width() > width) {
            i10 = 0 - (i12 - rect.right);
        } else {
            i10 = 0 - (scrollX - rect.left);
        }
        return Math.max(i10, -getScrollX());
    }

    public void setFadingEdge(int i10) {
        this.mFadingEdge = i10;
    }

    public SmoothHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothHorizontalScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.TAG = "SmoothHorizontalScrollView";
    }
}
