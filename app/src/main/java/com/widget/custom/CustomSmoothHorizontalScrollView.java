package com.widget.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import com.widget.C3890R;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class CustomSmoothHorizontalScrollView extends HorizontalScrollView {
    private final String TAG;
    private Field mLastScrollField;
    private int mScrollDuration;
    private int scrollDistance;
    private FixedSpeedOverScroller scroller;

    public CustomSmoothHorizontalScrollView(Context context) {
        this(context, null, 0);
    }

    private void initLastScrollField() {
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mLastScroll");
            this.mLastScrollField = declaredField;
            declaredField.setAccessible(true);
            this.mLastScrollField.set(this, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void initScroller(Context context, int i10) {
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            FixedSpeedOverScroller fixedSpeedOverScroller = new FixedSpeedOverScroller(context);
            this.scroller = fixedSpeedOverScroller;
            declaredField.set(this, fixedSpeedOverScroller);
            this.scroller.setScrollDuration(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.widget.HorizontalScrollView
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i10;
        int i11;
        int i12 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i13 = scrollX + width;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C3890R.dimen.fading_edge);
        if (rect.left > 0) {
            scrollX += dimensionPixelSize;
        }
        if (rect.right < getChildAt(0).getWidth()) {
            i13 -= dimensionPixelSize;
        }
        int i14 = rect.right;
        if (i14 > i13 && rect.left > scrollX) {
            if (rect.width() > width) {
                i11 = rect.left - scrollX;
            } else {
                i11 = rect.right - i13;
            }
            i12 = Math.min(i11 + 0, getChildAt(0).getRight() - i13);
        } else if (rect.left < scrollX && i14 < i13) {
            if (rect.width() > width) {
                i10 = 0 - (i13 - rect.right);
            } else {
                i10 = 0 - (scrollX - rect.left);
            }
            i12 = Math.max(i10, -getScrollX());
        }
        this.scrollDistance = i12;
        return i12;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Field field = this.mLastScrollField;
        if (field != null) {
            try {
                field.set(this, 0);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public int getScrollDistance() {
        return this.scrollDistance;
    }

    public int getScrollDuration() {
        return this.mScrollDuration;
    }

    public boolean isSmoothScrollX() {
        if (this.scrollDistance != 0) {
            return true;
        }
        return false;
    }

    public void setScrollDuration(int i10) {
        this.mScrollDuration = i10;
        this.scroller.setScrollDuration(i10);
    }

    public CustomSmoothHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomSmoothHorizontalScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.TAG = "SmoothHorizontalScrollView";
        this.mScrollDuration = 400;
        setSmoothScrollingEnabled(true);
        setSoundEffectsEnabled(true);
        initScroller(context, this.mScrollDuration);
        initLastScrollField();
    }
}
