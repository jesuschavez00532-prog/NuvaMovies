package com.widget.recyclerView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FastGridLayoutManagerTV extends GridLayoutManagerTV {
    public FastGridLayoutManagerTV(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private boolean hitBorder(int i10, int i11) {
        int spanCount = getSpanCount();
        if (Math.abs(i11) == 1) {
            int i12 = (i10 % spanCount) + i11;
            if (i12 >= 0 && i12 < spanCount) {
                return false;
            }
            return true;
        }
        int i13 = i10 + i11;
        if (i13 >= 0 || i13 < spanCount) {
            return false;
        }
        return true;
    }

    protected int calcOffsetToNextView(int i10) {
        int spanCount = getSpanCount();
        int orientation = getOrientation();
        if (orientation == 1) {
            if (i10 == 17) {
                return -1;
            }
            if (i10 != 33) {
                if (i10 == 66) {
                    return 1;
                }
                if (i10 == 130) {
                    return spanCount;
                }
                return 0;
            }
            return -spanCount;
        }
        if (orientation == 0) {
            if (i10 != 17) {
                if (i10 == 33) {
                    return -1;
                }
                if (i10 != 66) {
                    if (i10 == 130) {
                        return 1;
                    }
                    return 0;
                }
                return spanCount;
            }
            return -spanCount;
        }
        return 0;
    }

    protected int getNextViewPos(int i10, int i11) {
        int calcOffsetToNextView = calcOffsetToNextView(i11);
        if (hitBorder(i10, calcOffsetToNextView)) {
            return i10;
        }
        return i10 + calcOffsetToNextView;
    }

    @Override // com.widget.recyclerView.GridLayoutManagerTV, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (super.onFocusSearchFailed(view, i10, c0804w, c0779b0) == null) {
            return null;
        }
        return findViewByPosition(getNextViewPos(getPosition(view), i10));
    }

    public FastGridLayoutManagerTV(Context context, int i10) {
        super(context, i10);
    }

    public FastGridLayoutManagerTV(Context context, int i10, int i11, boolean z10) {
        super(context, i10, i11, z10);
    }
}
