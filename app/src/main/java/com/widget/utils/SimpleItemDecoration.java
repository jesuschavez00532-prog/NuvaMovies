package com.widget.utils;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class SimpleItemDecoration extends RecyclerView.AbstractC0796o {
    private boolean isEndSpace;
    private boolean isHorizontal;
    private int space;

    public SimpleItemDecoration(int i10, boolean z10, boolean z11) {
        this.space = i10;
        this.isHorizontal = z10;
        this.isEndSpace = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
    public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
        int i11;
        AbstractC5868k.m23674f(rect, "outRect");
        AbstractC5868k.m23674f(recyclerView, "parent");
        if (!this.isEndSpace) {
            RecyclerView.AbstractC0789h adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i11 = adapter.getItemCount();
            } else {
                i11 = 0;
            }
            if (i10 == i11 - 1) {
                return;
            }
        }
        if (this.isHorizontal) {
            rect.right = this.space;
        } else {
            rect.bottom = this.space;
        }
    }

    public /* synthetic */ SimpleItemDecoration(int i10, boolean z10, boolean z11, int i11, AbstractC5864g abstractC5864g) {
        this(i10, z10, (i11 & 4) != 0 ? true : z11);
    }
}
