package com.widget.recyclerView;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C0821h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class LinearLayoutManagerTV extends LinearLayoutManager {

    /* loaded from: classes3.dex */
    class TvLinearSmoothScroller extends C0821h {
        public TvLinearSmoothScroller(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        public PointF computeScrollVectorForPosition(int i10) {
            return LinearLayoutManagerTV.this.computeVectorForPosition(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0821h, androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        public void onStop() {
            super.onStop();
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition != null) {
                findViewByPosition.requestFocus();
            }
        }
    }

    public LinearLayoutManagerTV(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public PointF computeVectorForPosition(int i10) {
        return super.computeScrollVectorForPosition(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        super.onFocusSearchFailed(view, i10, c0804w, c0779b0);
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void scrollToPosition(int i10) {
        super.scrollToPosition(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        TvLinearSmoothScroller tvLinearSmoothScroller = new TvLinearSmoothScroller(recyclerView.getContext());
        tvLinearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(tvLinearSmoothScroller);
    }

    public LinearLayoutManagerTV(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public LinearLayoutManagerTV(Context context) {
        super(context);
    }
}
