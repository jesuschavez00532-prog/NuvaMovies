package com.widget.recyclerView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class MemoryRecyclerViewTV extends RecyclerViewTV {
    private AdapterDataObservable adapterDataObservable;
    public boolean isSelectedDefaultIndex;
    public int mDefaultIndex;
    public int mKeyDirection;
    public View mLastItemView;

    /* loaded from: classes3.dex */
    class AdapterDataObservable extends RecyclerView.AbstractC0791j {
        AdapterDataObservable() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onChanged() {
            super.onChanged();
            MemoryRecyclerViewTV.this.mLastItemView = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onItemRangeChanged(int i10, int i11) {
            super.onItemRangeChanged(i10, i11);
            MemoryRecyclerViewTV.this.mLastItemView = null;
        }
    }

    public MemoryRecyclerViewTV(Context context) {
        this(context, null);
    }

    public void clearFocusCache() {
        this.mLastItemView = null;
    }

    public boolean dispatchKeyDown(View view, int i10, KeyEvent keyEvent) {
        if (i10 == this.mKeyDirection && view.hasFocus() && !hasFocus()) {
            View view2 = this.mLastItemView;
            if (view2 != null) {
                view2.requestFocus();
                return true;
            }
            if (this.isSelectedDefaultIndex && getChildAt(this.mDefaultIndex) != null) {
                getChildAt(this.mDefaultIndex).requestFocus();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.widget.recyclerView.RecyclerViewTV, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getAdapter().unregisterAdapterDataObserver(this.adapterDataObservable);
        super.onDetachedFromWindow();
    }

    @Override // com.widget.recyclerView.RecyclerViewTV, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        this.mLastItemView = view;
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC0789h abstractC0789h) {
        super.setAdapter(abstractC0789h);
        abstractC0789h.registerAdapterDataObserver(this.adapterDataObservable);
    }

    public void setDefaultIndex(int i10) {
        this.isSelectedDefaultIndex = true;
        this.mDefaultIndex = i10;
    }

    public void setKeyDirection(int i10) {
        this.mKeyDirection = i10;
    }

    public MemoryRecyclerViewTV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public MemoryRecyclerViewTV(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mKeyDirection = 22;
        this.adapterDataObservable = new AdapterDataObservable();
    }
}
