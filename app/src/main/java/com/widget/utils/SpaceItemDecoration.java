package com.widget.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class SpaceItemDecoration extends RecyclerView.AbstractC0796o {
    private final int rightSpace;
    private final int sizeLen;
    private final int topSpace;

    public SpaceItemDecoration(int i10, int i11, int i12) {
        this.topSpace = i10;
        this.rightSpace = i11;
        this.sizeLen = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0) {
        AbstractC5868k.m23674f(rect, "outRect");
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(recyclerView, "parent");
        AbstractC5868k.m23674f(c0779b0, "state");
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (-1 == childLayoutPosition) {
            return;
        }
        int i10 = childLayoutPosition + 1;
        int i11 = this.sizeLen;
        if (i10 > i11) {
            rect.top = this.topSpace;
        }
        if (i10 % i11 != 0) {
            rect.right = this.rightSpace;
        }
    }
}
