package com.widget.recyclerView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FastLinearLayoutManagerTV extends LinearLayoutManagerTV {
    public FastLinearLayoutManagerTV(Context context) {
        super(context);
    }

    private boolean hitBorder(int i10, int i11) {
        if (Math.abs(i11) == 1) {
            int i12 = (i10 % 1) + i11;
            if (i12 >= 0 && i12 < 1) {
                return false;
            }
            return true;
        }
        int i13 = i10 + i11;
        if (i13 >= 0 || i13 < 1) {
            return false;
        }
        return true;
    }

    protected int calcOffsetToNextView(int i10) {
        int orientation = getOrientation();
        if (orientation == 1) {
            if (i10 == 17 || i10 == 33) {
                return -1;
            }
            if (i10 == 66 || i10 == 130) {
                return 1;
            }
            return 0;
        }
        if (orientation == 0) {
            if (i10 == 17 || i10 == 33) {
                return -1;
            }
            if (i10 == 66 || i10 == 130) {
                return 1;
            }
            return 0;
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

    @Override // com.widget.recyclerView.LinearLayoutManagerTV, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (super.onFocusSearchFailed(view, i10, c0804w, c0779b0) == null) {
            return null;
        }
        return findViewByPosition(getNextViewPos(getPosition(view), i10));
    }

    public FastLinearLayoutManagerTV(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public FastLinearLayoutManagerTV(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }
}
