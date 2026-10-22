package com.widget.custom;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.AbsListView;

/* loaded from: classes3.dex */
public class PageScrollGridView extends MemoryGridView implements AbsListView.OnScrollListener {
    private boolean dircert;
    private boolean isScroll;
    private int itemHeight;
    private AbsListView.OnScrollListener lister;
    private int scrollDuration;

    public PageScrollGridView(Context context) {
        super(context);
        this.scrollDuration = 350;
        this.itemHeight = 0;
        this.dircert = true;
        this.isScroll = false;
        setOnScrollListener(this);
    }

    public boolean getIsScroll() {
        return this.isScroll;
    }

    protected int getScrollChildHeight() {
        if (this.itemHeight == 0) {
            this.itemHeight = getChildAt(0).getHeight() + getVerticalSpacing();
        }
        return this.itemHeight;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (Build.VERSION.SDK_INT == 19) {
            if (hasFocus() && !super.isInTouchMode()) {
                return false;
            }
            return true;
        }
        return super.isInTouchMode();
    }

    @Override // com.widget.custom.MemoryGridView, android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.isScroll) {
            return true;
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                if (getSelectedItemPosition() >= getFirstVisiblePosition() && getSelectedItemPosition() < getFirstVisiblePosition() + getNumColumns() && getFirstVisiblePosition() != 0) {
                    startScrollUp();
                    return true;
                }
                break;
            case 20:
                if (getLastVisiblePosition() != getAdapter().getCount() - 1 && getSelectedItemPosition() <= getLastVisiblePosition() && getSelectedItemPosition() >= getFirstVisiblePosition() + getNumColumns()) {
                    startScrollDown();
                    return true;
                }
                break;
            case 21:
                if (getSelectedItemPosition() % getNumColumns() == 0) {
                    return false;
                }
                break;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        AbsListView.OnScrollListener onScrollListener = this.lister;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i10, i11, i12);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 0) {
            selection();
        }
        AbsListView.OnScrollListener onScrollListener = this.lister;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i10);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    protected void selection() {
        if (this.dircert) {
            int numColumns = getNumColumns() + getSelectedItemPosition();
            if (numColumns > getAdapter().getCount() - 1) {
                numColumns = getAdapter().getCount() - 1;
            }
            if (numColumns >= 0 && getSelectedItemPosition() != numColumns) {
                setSelection(numColumns);
            }
        } else {
            int selectedItemPosition = getSelectedItemPosition() - getNumColumns();
            if (selectedItemPosition < 0) {
                selectedItemPosition = 0;
            }
            if (selectedItemPosition >= 0 && getSelectedItemPosition() != selectedItemPosition) {
                setSelection(selectedItemPosition);
            }
        }
        this.isScroll = false;
    }

    public void setIsScroll(boolean z10) {
        this.isScroll = z10;
    }

    public void setScrollDuration(int i10) {
        this.scrollDuration = i10;
    }

    public void setScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.lister = onScrollListener;
    }

    public void smooth(int i10, int i11) {
        smoothScrollBy(i10, i11);
    }

    @Override // android.widget.AbsListView
    public void smoothScrollBy(int i10, int i11) {
        super.smoothScrollBy(i10, i11);
    }

    protected void startScrollDown() {
        this.isScroll = true;
        this.dircert = true;
        smooth(getScrollChildHeight(), this.scrollDuration);
    }

    protected void startScrollUp() {
        this.isScroll = true;
        this.dircert = false;
        smooth(-getScrollChildHeight(), this.scrollDuration);
    }

    public PageScrollGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollDuration = 350;
        this.itemHeight = 0;
        this.dircert = true;
        this.isScroll = false;
        setOnScrollListener(this);
    }

    public PageScrollGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.scrollDuration = 350;
        this.itemHeight = 0;
        this.dircert = true;
        this.isScroll = false;
        setOnScrollListener(this);
    }
}
