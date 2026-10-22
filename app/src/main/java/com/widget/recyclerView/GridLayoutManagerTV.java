package com.widget.recyclerView;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C0821h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class GridLayoutManagerTV extends GridLayoutManager {

    /* loaded from: classes3.dex */
    class GridLinearSmoothScroller extends C0821h {
        public GridLinearSmoothScroller(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0821h
        public int calculateTimeForScrolling(int i10) {
            return 50;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        public PointF computeScrollVectorForPosition(int i10) {
            return GridLayoutManagerTV.this.computeVectorForPosition(i10);
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

    public GridLayoutManagerTV(Context context, int i10) {
        super(context, i10);
    }

    private void selectViewByPosition(final int i10) {
        Observable.timer(200L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.widget.recyclerView.GridLayoutManagerTV.1
            @Override // io.reactivex.functions.Consumer
            public void accept(Long l10) {
                View findViewByPosition = GridLayoutManagerTV.this.findViewByPosition(i10);
                if (findViewByPosition != null) {
                    findViewByPosition.requestFocus();
                }
            }
        }, new Consumer<Throwable>() { // from class: com.widget.recyclerView.GridLayoutManagerTV.2
            @Override // io.reactivex.functions.Consumer
            public void accept(Throwable th) {
                th.printStackTrace();
            }
        });
    }

    public PointF computeVectorForPosition(int i10) {
        return super.computeScrollVectorForPosition(i10);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        super.onFocusSearchFailed(view, i10, c0804w, c0779b0);
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void scrollToPosition(int i10) {
        super.scrollToPosition(i10);
        selectViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        GridLinearSmoothScroller gridLinearSmoothScroller = new GridLinearSmoothScroller(recyclerView.getContext());
        gridLinearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(gridLinearSmoothScroller);
    }

    public GridLayoutManagerTV(Context context, int i10, int i11, boolean z10) {
        super(context, i10, i11, z10);
    }

    public GridLayoutManagerTV(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
