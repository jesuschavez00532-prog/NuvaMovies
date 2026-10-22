package com.widget.recyclerView;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC0616q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class RecyclerViewTV extends RecyclerView {
    private Runnable delayRunnable;
    private boolean isInterceptLeftEvent;
    public RecyclerView.AbstractC0797p layoutManager;
    private View mCurrentFocusView;
    private int mCurrentKeyDirect;
    private Handler mHandler;
    private int mLoadMoreItemOffset;
    private OnLoadMoreListener mOnLoadMoreListener;
    private OnScroll mOnScroll;
    private boolean mSelectedItemCentered;
    private int mSelectedItemOffsetEnd;
    private int mSelectedItemOffsetStart;
    private int offset;
    private int scrollDistance;
    private long scrollY;

    /* loaded from: classes3.dex */
    public interface OnLoadMoreListener {
        void onLoadMore();
    }

    /* loaded from: classes3.dex */
    public static abstract class OnScroll {
        public abstract void onIdle();

        public abstract void onSetting();
    }

    public RecyclerViewTV(Context context) {
        this(context, null);
    }

    static /* synthetic */ long access$314(RecyclerViewTV recyclerViewTV, long j10) {
        long j11 = recyclerViewTV.scrollY + j10;
        recyclerViewTV.scrollY = j11;
        return j11;
    }

    private boolean cannotScrollForwardOrBackward(int i10) {
        return false;
    }

    private int getFreeHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getFreeWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void init(Context context) {
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        setChildrenDrawingOrderEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
        setClickable(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
        setItemAnimator(null);
        addOnScrollListener(new RecyclerView.AbstractC0802u() { // from class: com.widget.recyclerView.RecyclerViewTV.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (i10 != 0) {
                    if (i10 == 2 && RecyclerViewTV.this.mOnScroll != null) {
                        RecyclerViewTV.this.mOnScroll.onSetting();
                        return;
                    }
                    return;
                }
                if (RecyclerViewTV.this.mOnScroll != null) {
                    RecyclerViewTV.this.mOnScroll.onIdle();
                }
                if (RecyclerViewTV.this.mOnLoadMoreListener != null && RecyclerViewTV.this.getLastVisiblePosition() >= RecyclerViewTV.this.getAdapter().getItemCount() - RecyclerViewTV.this.mLoadMoreItemOffset) {
                    RecyclerViewTV.this.mOnLoadMoreListener.onLoadMore();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                RecyclerViewTV.access$314(RecyclerViewTV.this, i11);
            }
        });
    }

    private boolean isHorizontalLayoutManger() {
        RecyclerView.AbstractC0797p abstractC0797p = this.layoutManager;
        if (abstractC0797p instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) abstractC0797p).getOrientation() == 0) {
                return true;
            }
            return false;
        }
        if ((abstractC0797p instanceof GridLayoutManager) && ((GridLayoutManager) abstractC0797p).getOrientation() == 0) {
            return true;
        }
        return false;
    }

    private boolean isVertical() {
        RecyclerView.AbstractC0797p abstractC0797p = this.layoutManager;
        if (abstractC0797p instanceof LinearLayoutManager) {
            if (1 != ((LinearLayoutManager) abstractC0797p).getOrientation()) {
                return false;
            }
            return true;
        }
        if (!(abstractC0797p instanceof GridLayoutManager) || 1 != ((GridLayoutManager) abstractC0797p).getOrientation()) {
            return false;
        }
        return true;
    }

    public boolean cannotScrollBackward(int i10) {
        if (getFirstVisiblePosition() == 0 && i10 <= 0) {
            return true;
        }
        return false;
    }

    public boolean cannotScrollForward(int i10) {
        if (getFirstVisiblePosition() + getLayoutManager().getChildCount() == getLayoutManager().getItemCount() && i10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        int i11;
        View findNextFocus;
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22 || keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20) {
            View focusedChild = getFocusedChild();
            this.mCurrentFocusView = focusedChild;
            if (focusedChild == null) {
                return dispatchKeyEvent;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                i11 = childAt.getHeight();
                i10 = childAt.getWidth();
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (keyEvent.getAction() == 1) {
                return false;
            }
            if (isHorizontalLayoutManger()) {
                if (keyEvent.getKeyCode() == 22) {
                    View findNextFocus2 = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 66);
                    if (findNextFocus2 != null) {
                        findNextFocus2.requestFocus();
                        return true;
                    }
                    if (canScrollHorizontally(1)) {
                        smoothScrollBy(i10, 0);
                        this.mCurrentKeyDirect = 66;
                        this.mHandler.removeCallbacks(this.delayRunnable);
                        this.mHandler.postDelayed(this.delayRunnable, 100L);
                        return true;
                    }
                } else if (keyEvent.getKeyCode() == 21) {
                    View findNextFocus3 = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 17);
                    if (findNextFocus3 != null) {
                        findNextFocus3.requestFocus();
                        return true;
                    }
                    if (canScrollHorizontally(-1)) {
                        smoothScrollBy(-i10, 0);
                        this.mCurrentKeyDirect = 17;
                        this.mHandler.removeCallbacks(this.delayRunnable);
                        this.mHandler.postDelayed(this.delayRunnable, 100L);
                        return true;
                    }
                }
            } else if (keyEvent.getKeyCode() == 20) {
                View findNextFocus4 = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 130);
                if (findNextFocus4 != null) {
                    findNextFocus4.requestFocus();
                    return true;
                }
                if (canScrollVertically(1)) {
                    smoothScrollBy(0, i11);
                    this.mCurrentKeyDirect = 130;
                    this.mHandler.removeCallbacks(this.delayRunnable);
                    this.mHandler.postDelayed(this.delayRunnable, 100L);
                    return true;
                }
            } else if (keyEvent.getKeyCode() == 19) {
                View findNextFocus5 = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 33);
                if (findNextFocus5 != null) {
                    findNextFocus5.requestFocus();
                    return true;
                }
                if (canScrollVertically(-1)) {
                    smoothScrollBy(0, -i11);
                    this.mCurrentKeyDirect = 33;
                    this.mHandler.removeCallbacks(this.delayRunnable);
                    this.mHandler.postDelayed(this.delayRunnable, 100L);
                    return true;
                }
            } else if (this.isInterceptLeftEvent && keyEvent.getKeyCode() == 21) {
                View findNextFocus6 = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 17);
                if (findNextFocus6 != null) {
                    findNextFocus6.requestFocus();
                    return true;
                }
            } else if (keyEvent.getKeyCode() == 22 && (findNextFocus = FocusFinder.getInstance().findNextFocus(this, this.mCurrentFocusView, 66)) != null && getChildLayoutPosition(this.mCurrentFocusView) >= getChildLayoutPosition(findNextFocus)) {
                View view = this.mCurrentFocusView;
                view.setNextFocusRightId(view.getId());
                return false;
            }
        }
        return dispatchKeyEvent;
    }

    public int findFirstVisibleItemPosition() {
        RecyclerView.AbstractC0797p abstractC0797p = this.layoutManager;
        if (abstractC0797p instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC0797p).findFirstVisibleItemPosition();
        }
        if (abstractC0797p instanceof GridLayoutManager) {
            return ((GridLayoutManager) abstractC0797p).findFirstVisibleItemPosition();
        }
        return -1;
    }

    public int findLastVisibleItemPosition() {
        RecyclerView.AbstractC0797p abstractC0797p = this.layoutManager;
        if (abstractC0797p instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC0797p).findLastVisibleItemPosition();
        }
        if (abstractC0797p instanceof GridLayoutManager) {
            return ((GridLayoutManager) abstractC0797p).findLastVisibleItemPosition();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public int getBaseline() {
        return super.getBaseline();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int childAdapterPosition = getChildAdapterPosition(getFocusedChild());
        if (childAdapterPosition < 0) {
            return i11;
        }
        int i12 = i10 - 1;
        if (i11 == i12) {
            if (childAdapterPosition <= i11) {
                return childAdapterPosition;
            }
            return i11;
        }
        if (i11 == childAdapterPosition) {
            return i12;
        }
        return i11;
    }

    public int getFirstVisiblePosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getChildLayoutPosition(getChildAt(0));
    }

    public int getLastVisiblePosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getChildLayoutPosition(getChildAt(childCount - 1));
    }

    public int getSelectedItemOffsetEnd() {
        return this.mSelectedItemOffsetEnd;
    }

    public int getSelectedItemOffsetStart() {
        return this.mSelectedItemOffsetStart;
    }

    public int getSelectedItemScrollOffset() {
        return this.offset;
    }

    public long getTotalScrollY() {
        return this.scrollY;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return super.hasFocus();
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

    public boolean isScrolling() {
        if (getScrollState() == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        super.onChildAttachedToWindow(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mHandler.removeCallbacks(this.delayRunnable);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        super.onScrollStateChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        int freeHeight;
        int height;
        if (view != null && this.mSelectedItemCentered) {
            if (!isVertical()) {
                freeHeight = getFreeWidth();
                height = view.getWidth();
            } else {
                freeHeight = getFreeHeight();
                height = view.getHeight();
            }
            int i10 = freeHeight - height;
            this.mSelectedItemOffsetStart = i10;
            int i11 = i10 / 2;
            this.mSelectedItemOffsetStart = i11;
            this.mSelectedItemOffsetEnd = i11;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        int i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = view.getLeft() + rect.left;
        int top = view.getTop() + rect.top;
        int width2 = rect.width() + left;
        int height2 = rect.height() + top;
        int i11 = left - paddingLeft;
        int min = Math.min(0, i11 - this.mSelectedItemOffsetStart);
        int i12 = top - paddingTop;
        int min2 = Math.min(0, i12 - this.mSelectedItemOffsetStart);
        int i13 = width2 - width;
        int max = Math.max(0, this.mSelectedItemOffsetEnd + i13);
        int max2 = Math.max(0, (height2 - height) + this.mSelectedItemOffsetEnd);
        boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean canScrollVertically = getLayoutManager().canScrollVertically();
        if (canScrollHorizontally) {
            if (AbstractC0616q0.m2579B(this) == 1) {
                if (max == 0) {
                    max = Math.max(min, i13);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i11, max);
                }
                max = min;
            }
        } else {
            max = 0;
        }
        if (canScrollVertically) {
            if (min2 == 0) {
                min2 = Math.min(i12, max2);
            }
        } else {
            min2 = 0;
        }
        if (isVertical()) {
            i10 = min2;
        } else {
            i10 = max;
        }
        this.offset = i10;
        if (max == 0 && min2 == 0) {
            return false;
        }
        if (z10) {
            scrollBy(max, min2);
        } else {
            smoothScrollBy(max, min2);
        }
        return true;
    }

    public void setInterceptLeftEvent(boolean z10) {
        this.isInterceptLeftEvent = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC0797p abstractC0797p) {
        super.setLayoutManager(abstractC0797p);
        this.layoutManager = abstractC0797p;
    }

    public void setLoadMoreItemOffset(int i10) {
        this.mLoadMoreItemOffset = i10;
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.mOnLoadMoreListener = onLoadMoreListener;
    }

    public void setOnScrollChangeListener(OnScroll onScroll) {
        this.mOnScroll = onScroll;
    }

    public void setRedrawItem() {
        setHasFixedSize(false);
    }

    public void setScrollDistance(int i10) {
        this.scrollDistance = i10;
    }

    public void setSelectedItemAtCentered(boolean z10) {
        this.mSelectedItemCentered = z10;
    }

    public void setSelectedItemOffset(int i10, int i11) {
        setSelectedItemAtCentered(false);
        this.mSelectedItemOffsetStart = i10;
        this.mSelectedItemOffsetEnd = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i10, int i11) {
        if (this.scrollDistance == 0) {
            super.smoothScrollBy(i10, i11);
        } else if (i11 < 0) {
            super.smoothScrollBy(i10, i11);
        } else if (!isScrolling()) {
            super.smoothScrollBy(i10, this.scrollDistance);
        }
    }

    public RecyclerViewTV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RecyclerViewTV(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mSelectedItemCentered = false;
        this.offset = -1;
        this.mLoadMoreItemOffset = 1;
        this.mHandler = new Handler();
        this.delayRunnable = new Runnable() { // from class: com.widget.recyclerView.RecyclerViewTV.2
            @Override // java.lang.Runnable
            public void run() {
                FocusFinder focusFinder = FocusFinder.getInstance();
                RecyclerViewTV recyclerViewTV = RecyclerViewTV.this;
                View findNextFocus = focusFinder.findNextFocus(recyclerViewTV, recyclerViewTV.mCurrentFocusView, RecyclerViewTV.this.mCurrentKeyDirect);
                if (findNextFocus != null) {
                    findNextFocus.requestFocus();
                }
            }
        };
        init(context);
    }
}
